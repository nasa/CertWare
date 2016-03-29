package net.certware.intent.state.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.certware.intent.state.services.StateSpecificationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateSpecificationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'specification'", "'['", "'devices'", "']'", "'-'", "'.'", "'supervisory'", "'operating'", "'other'", "'component'", "'modes'", "'states'", "'inputs'", "'outputs'", "'inferred'", "';'", "'state'", "'{'", "'}'", "'initial'", "'mode'", "'device'", "'input'", "'value'", "'source'", "'output'", "'target'", "'units'", "'T'", "'F'", "'?'", "'table'", "'...'", "'type'", "'range'", "'value-list'", "'rate'", "'initiation-delay'", "'completion-deadline'", "'completion-exception'", "'variables'", "'relationship'", "'min-response-time'", "'max-response-time'", "'feedback-exception'", "'reversed-by'", "'references'", "'comments'", "'contents'", "'triggering'", "'value-exception'", "'granularity'", "'arrival-rate-avg'", "'arrival-rate-minimum'", "'arrival-rate-maximum'", "'obsolescence'", "'appears-in'", "'description'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=6;
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
    public static final int T__48=48;
    public static final int T__49=49;
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


        public InternalStateSpecificationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateSpecificationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateSpecificationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateSpecification.g"; }



     	private StateSpecificationGrammarAccess grammarAccess;
     	
        public InternalStateSpecificationParser(TokenStream input, StateSpecificationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Specification";	
       	}
       	
       	@Override
       	protected StateSpecificationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSpecification"
    // InternalStateSpecification.g:67:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalStateSpecification.g:68:2: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalStateSpecification.g:69:2: iv_ruleSpecification= ruleSpecification EOF
            {
             newCompositeNode(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;

             current =iv_ruleSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalStateSpecification.g:76:1: ruleSpecification returns [EObject current=null] : (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' otherlv_3= 'devices' ( (lv_devices_4_0= ruleDevice ) )* otherlv_5= ']' )? ( (lv_components_6_0= ruleComponent ) )+ ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_devices_4_0 = null;

        EObject lv_components_6_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:79:28: ( (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' otherlv_3= 'devices' ( (lv_devices_4_0= ruleDevice ) )* otherlv_5= ']' )? ( (lv_components_6_0= ruleComponent ) )+ ) )
            // InternalStateSpecification.g:80:1: (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' otherlv_3= 'devices' ( (lv_devices_4_0= ruleDevice ) )* otherlv_5= ']' )? ( (lv_components_6_0= ruleComponent ) )+ )
            {
            // InternalStateSpecification.g:80:1: (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' otherlv_3= 'devices' ( (lv_devices_4_0= ruleDevice ) )* otherlv_5= ']' )? ( (lv_components_6_0= ruleComponent ) )+ )
            // InternalStateSpecification.g:80:3: otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' otherlv_3= 'devices' ( (lv_devices_4_0= ruleDevice ) )* otherlv_5= ']' )? ( (lv_components_6_0= ruleComponent ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getSpecificationAccess().getSpecificationKeyword_0());
                
            // InternalStateSpecification.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateSpecification.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateSpecification.g:85:1: (lv_name_1_0= RULE_ID )
            // InternalStateSpecification.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpecificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateSpecification.g:102:2: (otherlv_2= '[' otherlv_3= 'devices' ( (lv_devices_4_0= ruleDevice ) )* otherlv_5= ']' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalStateSpecification.g:102:4: otherlv_2= '[' otherlv_3= 'devices' ( (lv_devices_4_0= ruleDevice ) )* otherlv_5= ']'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                        	newLeafNode(otherlv_2, grammarAccess.getSpecificationAccess().getLeftSquareBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                        	newLeafNode(otherlv_3, grammarAccess.getSpecificationAccess().getDevicesKeyword_2_1());
                        
                    // InternalStateSpecification.g:110:1: ( (lv_devices_4_0= ruleDevice ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==32) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalStateSpecification.g:111:1: (lv_devices_4_0= ruleDevice )
                    	    {
                    	    // InternalStateSpecification.g:111:1: (lv_devices_4_0= ruleDevice )
                    	    // InternalStateSpecification.g:112:3: lv_devices_4_0= ruleDevice
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSpecificationAccess().getDevicesDeviceParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_6);
                    	    lv_devices_4_0=ruleDevice();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"devices",
                    	            		lv_devices_4_0, 
                    	            		"net.certware.intent.state.StateSpecification.Device");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,14,FOLLOW_4); 

                        	newLeafNode(otherlv_5, grammarAccess.getSpecificationAccess().getRightSquareBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // InternalStateSpecification.g:132:3: ( (lv_components_6_0= ruleComponent ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStateSpecification.g:133:1: (lv_components_6_0= ruleComponent )
            	    {
            	    // InternalStateSpecification.g:133:1: (lv_components_6_0= ruleComponent )
            	    // InternalStateSpecification.g:134:3: lv_components_6_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSpecificationAccess().getComponentsComponentParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_7);
            	    lv_components_6_0=ruleComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_6_0, 
            	            		"net.certware.intent.state.StateSpecification.Component");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleBigDecimalType"
    // InternalStateSpecification.g:158:1: entryRuleBigDecimalType returns [String current=null] : iv_ruleBigDecimalType= ruleBigDecimalType EOF ;
    public final String entryRuleBigDecimalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBigDecimalType = null;


        try {
            // InternalStateSpecification.g:159:2: (iv_ruleBigDecimalType= ruleBigDecimalType EOF )
            // InternalStateSpecification.g:160:2: iv_ruleBigDecimalType= ruleBigDecimalType EOF
            {
             newCompositeNode(grammarAccess.getBigDecimalTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBigDecimalType=ruleBigDecimalType();

            state._fsp--;

             current =iv_ruleBigDecimalType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBigDecimalType"


    // $ANTLR start "ruleBigDecimalType"
    // InternalStateSpecification.g:167:1: ruleBigDecimalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleBigDecimalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // InternalStateSpecification.g:170:28: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalStateSpecification.g:171:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalStateSpecification.g:171:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalStateSpecification.g:171:2: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalStateSpecification.g:171:2: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalStateSpecification.g:172:2: kw= '-'
                    {
                    kw=(Token)match(input,15,FOLLOW_8); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBigDecimalTypeAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_9); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getBigDecimalTypeAccess().getINTTerminalRuleCall_1()); 
                
            // InternalStateSpecification.g:184:1: (kw= '.' this_INT_3= RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStateSpecification.g:185:2: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,16,FOLLOW_8); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBigDecimalTypeAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    		current.merge(this_INT_3);
                        
                     
                        newLeafNode(this_INT_3, grammarAccess.getBigDecimalTypeAccess().getINTTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBigDecimalType"


    // $ANTLR start "entryRuleModeElementType"
    // InternalStateSpecification.g:205:1: entryRuleModeElementType returns [EObject current=null] : iv_ruleModeElementType= ruleModeElementType EOF ;
    public final EObject entryRuleModeElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModeElementType = null;


        try {
            // InternalStateSpecification.g:206:2: (iv_ruleModeElementType= ruleModeElementType EOF )
            // InternalStateSpecification.g:207:2: iv_ruleModeElementType= ruleModeElementType EOF
            {
             newCompositeNode(grammarAccess.getModeElementTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModeElementType=ruleModeElementType();

            state._fsp--;

             current =iv_ruleModeElementType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModeElementType"


    // $ANTLR start "ruleModeElementType"
    // InternalStateSpecification.g:214:1: ruleModeElementType returns [EObject current=null] : ( ( (lv_elementType_0_1= 'supervisory' | lv_elementType_0_2= 'operating' | lv_elementType_0_3= 'other' ) ) ) ;
    public final EObject ruleModeElementType() throws RecognitionException {
        EObject current = null;

        Token lv_elementType_0_1=null;
        Token lv_elementType_0_2=null;
        Token lv_elementType_0_3=null;

         enterRule(); 
            
        try {
            // InternalStateSpecification.g:217:28: ( ( ( (lv_elementType_0_1= 'supervisory' | lv_elementType_0_2= 'operating' | lv_elementType_0_3= 'other' ) ) ) )
            // InternalStateSpecification.g:218:1: ( ( (lv_elementType_0_1= 'supervisory' | lv_elementType_0_2= 'operating' | lv_elementType_0_3= 'other' ) ) )
            {
            // InternalStateSpecification.g:218:1: ( ( (lv_elementType_0_1= 'supervisory' | lv_elementType_0_2= 'operating' | lv_elementType_0_3= 'other' ) ) )
            // InternalStateSpecification.g:219:1: ( (lv_elementType_0_1= 'supervisory' | lv_elementType_0_2= 'operating' | lv_elementType_0_3= 'other' ) )
            {
            // InternalStateSpecification.g:219:1: ( (lv_elementType_0_1= 'supervisory' | lv_elementType_0_2= 'operating' | lv_elementType_0_3= 'other' ) )
            // InternalStateSpecification.g:220:1: (lv_elementType_0_1= 'supervisory' | lv_elementType_0_2= 'operating' | lv_elementType_0_3= 'other' )
            {
            // InternalStateSpecification.g:220:1: (lv_elementType_0_1= 'supervisory' | lv_elementType_0_2= 'operating' | lv_elementType_0_3= 'other' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalStateSpecification.g:221:3: lv_elementType_0_1= 'supervisory'
                    {
                    lv_elementType_0_1=(Token)match(input,17,FOLLOW_2); 

                            newLeafNode(lv_elementType_0_1, grammarAccess.getModeElementTypeAccess().getElementTypeSupervisoryKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModeElementTypeRule());
                    	        }
                           		setWithLastConsumed(current, "elementType", lv_elementType_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalStateSpecification.g:233:8: lv_elementType_0_2= 'operating'
                    {
                    lv_elementType_0_2=(Token)match(input,18,FOLLOW_2); 

                            newLeafNode(lv_elementType_0_2, grammarAccess.getModeElementTypeAccess().getElementTypeOperatingKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModeElementTypeRule());
                    	        }
                           		setWithLastConsumed(current, "elementType", lv_elementType_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalStateSpecification.g:245:8: lv_elementType_0_3= 'other'
                    {
                    lv_elementType_0_3=(Token)match(input,19,FOLLOW_2); 

                            newLeafNode(lv_elementType_0_3, grammarAccess.getModeElementTypeAccess().getElementTypeOtherKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModeElementTypeRule());
                    	        }
                           		setWithLastConsumed(current, "elementType", lv_elementType_0_3, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModeElementType"


    // $ANTLR start "entryRuleComponent"
    // InternalStateSpecification.g:268:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalStateSpecification.g:269:2: (iv_ruleComponent= ruleComponent EOF )
            // InternalStateSpecification.g:270:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalStateSpecification.g:277:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'modes' ( (lv_modes_3_0= ruleModeElement ) )* )? (otherlv_4= 'states' ( (lv_states_5_0= ruleStateElement ) )* )? (otherlv_6= 'inputs' ( (lv_inputs_7_0= ruleComponentInput ) )* )? (otherlv_8= 'outputs' ( (lv_outputs_9_0= ruleComponentOutput ) )* )? ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_modes_3_0 = null;

        EObject lv_states_5_0 = null;

        EObject lv_inputs_7_0 = null;

        EObject lv_outputs_9_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:280:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'modes' ( (lv_modes_3_0= ruleModeElement ) )* )? (otherlv_4= 'states' ( (lv_states_5_0= ruleStateElement ) )* )? (otherlv_6= 'inputs' ( (lv_inputs_7_0= ruleComponentInput ) )* )? (otherlv_8= 'outputs' ( (lv_outputs_9_0= ruleComponentOutput ) )* )? ) )
            // InternalStateSpecification.g:281:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'modes' ( (lv_modes_3_0= ruleModeElement ) )* )? (otherlv_4= 'states' ( (lv_states_5_0= ruleStateElement ) )* )? (otherlv_6= 'inputs' ( (lv_inputs_7_0= ruleComponentInput ) )* )? (otherlv_8= 'outputs' ( (lv_outputs_9_0= ruleComponentOutput ) )* )? )
            {
            // InternalStateSpecification.g:281:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'modes' ( (lv_modes_3_0= ruleModeElement ) )* )? (otherlv_4= 'states' ( (lv_states_5_0= ruleStateElement ) )* )? (otherlv_6= 'inputs' ( (lv_inputs_7_0= ruleComponentInput ) )* )? (otherlv_8= 'outputs' ( (lv_outputs_9_0= ruleComponentOutput ) )* )? )
            // InternalStateSpecification.g:281:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'modes' ( (lv_modes_3_0= ruleModeElement ) )* )? (otherlv_4= 'states' ( (lv_states_5_0= ruleStateElement ) )* )? (otherlv_6= 'inputs' ( (lv_inputs_7_0= ruleComponentInput ) )* )? (otherlv_8= 'outputs' ( (lv_outputs_9_0= ruleComponentOutput ) )* )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // InternalStateSpecification.g:285:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateSpecification.g:286:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateSpecification.g:286:1: (lv_name_1_0= RULE_ID )
            // InternalStateSpecification.g:287:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateSpecification.g:303:2: (otherlv_2= 'modes' ( (lv_modes_3_0= ruleModeElement ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStateSpecification.g:303:4: otherlv_2= 'modes' ( (lv_modes_3_0= ruleModeElement ) )*
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_11); 

                        	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getModesKeyword_2_0());
                        
                    // InternalStateSpecification.g:307:1: ( (lv_modes_3_0= ruleModeElement ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=17 && LA7_0<=19)||LA7_0==25) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalStateSpecification.g:308:1: (lv_modes_3_0= ruleModeElement )
                    	    {
                    	    // InternalStateSpecification.g:308:1: (lv_modes_3_0= ruleModeElement )
                    	    // InternalStateSpecification.g:309:3: lv_modes_3_0= ruleModeElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getModesModeElementParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_11);
                    	    lv_modes_3_0=ruleModeElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"modes",
                    	            		lv_modes_3_0, 
                    	            		"net.certware.intent.state.StateSpecification.ModeElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalStateSpecification.g:325:5: (otherlv_4= 'states' ( (lv_states_5_0= ruleStateElement ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalStateSpecification.g:325:7: otherlv_4= 'states' ( (lv_states_5_0= ruleStateElement ) )*
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_12); 

                        	newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getStatesKeyword_3_0());
                        
                    // InternalStateSpecification.g:329:1: ( (lv_states_5_0= ruleStateElement ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==25||LA9_0==27) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalStateSpecification.g:330:1: (lv_states_5_0= ruleStateElement )
                    	    {
                    	    // InternalStateSpecification.g:330:1: (lv_states_5_0= ruleStateElement )
                    	    // InternalStateSpecification.g:331:3: lv_states_5_0= ruleStateElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getStatesStateElementParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_12);
                    	    lv_states_5_0=ruleStateElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"states",
                    	            		lv_states_5_0, 
                    	            		"net.certware.intent.state.StateSpecification.StateElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalStateSpecification.g:347:5: (otherlv_6= 'inputs' ( (lv_inputs_7_0= ruleComponentInput ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalStateSpecification.g:347:7: otherlv_6= 'inputs' ( (lv_inputs_7_0= ruleComponentInput ) )*
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_13); 

                        	newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getInputsKeyword_4_0());
                        
                    // InternalStateSpecification.g:351:1: ( (lv_inputs_7_0= ruleComponentInput ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==33) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalStateSpecification.g:352:1: (lv_inputs_7_0= ruleComponentInput )
                    	    {
                    	    // InternalStateSpecification.g:352:1: (lv_inputs_7_0= ruleComponentInput )
                    	    // InternalStateSpecification.g:353:3: lv_inputs_7_0= ruleComponentInput
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getInputsComponentInputParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_13);
                    	    lv_inputs_7_0=ruleComponentInput();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"inputs",
                    	            		lv_inputs_7_0, 
                    	            		"net.certware.intent.state.StateSpecification.ComponentInput");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalStateSpecification.g:369:5: (otherlv_8= 'outputs' ( (lv_outputs_9_0= ruleComponentOutput ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalStateSpecification.g:369:7: otherlv_8= 'outputs' ( (lv_outputs_9_0= ruleComponentOutput ) )*
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_14); 

                        	newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getOutputsKeyword_5_0());
                        
                    // InternalStateSpecification.g:373:1: ( (lv_outputs_9_0= ruleComponentOutput ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==36) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalStateSpecification.g:374:1: (lv_outputs_9_0= ruleComponentOutput )
                    	    {
                    	    // InternalStateSpecification.g:374:1: (lv_outputs_9_0= ruleComponentOutput )
                    	    // InternalStateSpecification.g:375:3: lv_outputs_9_0= ruleComponentOutput
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getOutputsComponentOutputParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_14);
                    	    lv_outputs_9_0=ruleComponentOutput();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"outputs",
                    	            		lv_outputs_9_0, 
                    	            		"net.certware.intent.state.StateSpecification.ComponentOutput");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleModeElement"
    // InternalStateSpecification.g:399:1: entryRuleModeElement returns [EObject current=null] : iv_ruleModeElement= ruleModeElement EOF ;
    public final EObject entryRuleModeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModeElement = null;


        try {
            // InternalStateSpecification.g:400:2: (iv_ruleModeElement= ruleModeElement EOF )
            // InternalStateSpecification.g:401:2: iv_ruleModeElement= ruleModeElement EOF
            {
             newCompositeNode(grammarAccess.getModeElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModeElement=ruleModeElement();

            state._fsp--;

             current =iv_ruleModeElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModeElement"


    // $ANTLR start "ruleModeElement"
    // InternalStateSpecification.g:408:1: ruleModeElement returns [EObject current=null] : ( ( (lv_inferred_0_0= 'inferred' ) )? ( (lv_type_1_0= ruleModeElementType ) ) ( (lv_modes_2_0= ruleModeVariable ) )+ otherlv_3= ';' ) ;
    public final EObject ruleModeElement() throws RecognitionException {
        EObject current = null;

        Token lv_inferred_0_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        EObject lv_modes_2_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:411:28: ( ( ( (lv_inferred_0_0= 'inferred' ) )? ( (lv_type_1_0= ruleModeElementType ) ) ( (lv_modes_2_0= ruleModeVariable ) )+ otherlv_3= ';' ) )
            // InternalStateSpecification.g:412:1: ( ( (lv_inferred_0_0= 'inferred' ) )? ( (lv_type_1_0= ruleModeElementType ) ) ( (lv_modes_2_0= ruleModeVariable ) )+ otherlv_3= ';' )
            {
            // InternalStateSpecification.g:412:1: ( ( (lv_inferred_0_0= 'inferred' ) )? ( (lv_type_1_0= ruleModeElementType ) ) ( (lv_modes_2_0= ruleModeVariable ) )+ otherlv_3= ';' )
            // InternalStateSpecification.g:412:2: ( (lv_inferred_0_0= 'inferred' ) )? ( (lv_type_1_0= ruleModeElementType ) ) ( (lv_modes_2_0= ruleModeVariable ) )+ otherlv_3= ';'
            {
            // InternalStateSpecification.g:412:2: ( (lv_inferred_0_0= 'inferred' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalStateSpecification.g:413:1: (lv_inferred_0_0= 'inferred' )
                    {
                    // InternalStateSpecification.g:413:1: (lv_inferred_0_0= 'inferred' )
                    // InternalStateSpecification.g:414:3: lv_inferred_0_0= 'inferred'
                    {
                    lv_inferred_0_0=(Token)match(input,25,FOLLOW_15); 

                            newLeafNode(lv_inferred_0_0, grammarAccess.getModeElementAccess().getInferredInferredKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModeElementRule());
                    	        }
                           		setWithLastConsumed(current, "inferred", true, "inferred");
                    	    

                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:427:3: ( (lv_type_1_0= ruleModeElementType ) )
            // InternalStateSpecification.g:428:1: (lv_type_1_0= ruleModeElementType )
            {
            // InternalStateSpecification.g:428:1: (lv_type_1_0= ruleModeElementType )
            // InternalStateSpecification.g:429:3: lv_type_1_0= ruleModeElementType
            {
             
            	        newCompositeNode(grammarAccess.getModeElementAccess().getTypeModeElementTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_type_1_0=ruleModeElementType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModeElementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"net.certware.intent.state.StateSpecification.ModeElementType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalStateSpecification.g:445:2: ( (lv_modes_2_0= ruleModeVariable ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalStateSpecification.g:446:1: (lv_modes_2_0= ruleModeVariable )
            	    {
            	    // InternalStateSpecification.g:446:1: (lv_modes_2_0= ruleModeVariable )
            	    // InternalStateSpecification.g:447:3: lv_modes_2_0= ruleModeVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModeElementAccess().getModesModeVariableParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_17);
            	    lv_modes_2_0=ruleModeVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModeElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modes",
            	            		lv_modes_2_0, 
            	            		"net.certware.intent.state.StateSpecification.ModeVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getModeElementAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModeElement"


    // $ANTLR start "entryRuleStateElement"
    // InternalStateSpecification.g:475:1: entryRuleStateElement returns [EObject current=null] : iv_ruleStateElement= ruleStateElement EOF ;
    public final EObject entryRuleStateElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateElement = null;


        try {
            // InternalStateSpecification.g:476:2: (iv_ruleStateElement= ruleStateElement EOF )
            // InternalStateSpecification.g:477:2: iv_ruleStateElement= ruleStateElement EOF
            {
             newCompositeNode(grammarAccess.getStateElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateElement=ruleStateElement();

            state._fsp--;

             current =iv_ruleStateElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateElement"


    // $ANTLR start "ruleStateElement"
    // InternalStateSpecification.g:484:1: ruleStateElement returns [EObject current=null] : ( ( (lv_inferred_0_0= 'inferred' ) )? ( (lv_states_1_0= ruleStateVariable ) )+ otherlv_2= ';' ) ;
    public final EObject ruleStateElement() throws RecognitionException {
        EObject current = null;

        Token lv_inferred_0_0=null;
        Token otherlv_2=null;
        EObject lv_states_1_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:487:28: ( ( ( (lv_inferred_0_0= 'inferred' ) )? ( (lv_states_1_0= ruleStateVariable ) )+ otherlv_2= ';' ) )
            // InternalStateSpecification.g:488:1: ( ( (lv_inferred_0_0= 'inferred' ) )? ( (lv_states_1_0= ruleStateVariable ) )+ otherlv_2= ';' )
            {
            // InternalStateSpecification.g:488:1: ( ( (lv_inferred_0_0= 'inferred' ) )? ( (lv_states_1_0= ruleStateVariable ) )+ otherlv_2= ';' )
            // InternalStateSpecification.g:488:2: ( (lv_inferred_0_0= 'inferred' ) )? ( (lv_states_1_0= ruleStateVariable ) )+ otherlv_2= ';'
            {
            // InternalStateSpecification.g:488:2: ( (lv_inferred_0_0= 'inferred' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalStateSpecification.g:489:1: (lv_inferred_0_0= 'inferred' )
                    {
                    // InternalStateSpecification.g:489:1: (lv_inferred_0_0= 'inferred' )
                    // InternalStateSpecification.g:490:3: lv_inferred_0_0= 'inferred'
                    {
                    lv_inferred_0_0=(Token)match(input,25,FOLLOW_18); 

                            newLeafNode(lv_inferred_0_0, grammarAccess.getStateElementAccess().getInferredInferredKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateElementRule());
                    	        }
                           		setWithLastConsumed(current, "inferred", true, "inferred");
                    	    

                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:503:3: ( (lv_states_1_0= ruleStateVariable ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalStateSpecification.g:504:1: (lv_states_1_0= ruleStateVariable )
            	    {
            	    // InternalStateSpecification.g:504:1: (lv_states_1_0= ruleStateVariable )
            	    // InternalStateSpecification.g:505:3: lv_states_1_0= ruleStateVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateElementAccess().getStatesStateVariableParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_19);
            	    lv_states_1_0=ruleStateVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_1_0, 
            	            		"net.certware.intent.state.StateSpecification.StateVariable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_2=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getStateElementAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateElement"


    // $ANTLR start "entryRuleStateVariable"
    // InternalStateSpecification.g:533:1: entryRuleStateVariable returns [EObject current=null] : iv_ruleStateVariable= ruleStateVariable EOF ;
    public final EObject entryRuleStateVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateVariable = null;


        try {
            // InternalStateSpecification.g:534:2: (iv_ruleStateVariable= ruleStateVariable EOF )
            // InternalStateSpecification.g:535:2: iv_ruleStateVariable= ruleStateVariable EOF
            {
             newCompositeNode(grammarAccess.getStateVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateVariable=ruleStateVariable();

            state._fsp--;

             current =iv_ruleStateVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateVariable"


    // $ANTLR start "ruleStateVariable"
    // InternalStateSpecification.g:542:1: ruleStateVariable returns [EObject current=null] : (otherlv_0= 'state' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) )+ otherlv_4= '}' ) ;
    public final EObject ruleStateVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_desc_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_state_3_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:545:28: ( (otherlv_0= 'state' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) )+ otherlv_4= '}' ) )
            // InternalStateSpecification.g:546:1: (otherlv_0= 'state' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) )+ otherlv_4= '}' )
            {
            // InternalStateSpecification.g:546:1: (otherlv_0= 'state' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) )+ otherlv_4= '}' )
            // InternalStateSpecification.g:546:3: otherlv_0= 'state' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_20); 

                	newLeafNode(otherlv_0, grammarAccess.getStateVariableAccess().getStateKeyword_0());
                
            // InternalStateSpecification.g:550:1: ( (lv_desc_1_0= RULE_STRING ) )
            // InternalStateSpecification.g:551:1: (lv_desc_1_0= RULE_STRING )
            {
            // InternalStateSpecification.g:551:1: (lv_desc_1_0= RULE_STRING )
            // InternalStateSpecification.g:552:3: lv_desc_1_0= RULE_STRING
            {
            lv_desc_1_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            			newLeafNode(lv_desc_1_0, grammarAccess.getStateVariableAccess().getDescSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"desc",
                    		lv_desc_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_22); 

                	newLeafNode(otherlv_2, grammarAccess.getStateVariableAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalStateSpecification.g:572:1: ( (lv_state_3_0= ruleState ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING||LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalStateSpecification.g:573:1: (lv_state_3_0= ruleState )
            	    {
            	    // InternalStateSpecification.g:573:1: (lv_state_3_0= ruleState )
            	    // InternalStateSpecification.g:574:3: lv_state_3_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateVariableAccess().getStateStateParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_23);
            	    lv_state_3_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateVariableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"state",
            	            		lv_state_3_0, 
            	            		"net.certware.intent.state.StateSpecification.State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getStateVariableAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateVariable"


    // $ANTLR start "entryRuleState"
    // InternalStateSpecification.g:602:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateSpecification.g:603:2: (iv_ruleState= ruleState EOF )
            // InternalStateSpecification.g:604:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateSpecification.g:611:1: ruleState returns [EObject current=null] : ( ( (lv_initial_0_0= 'initial' ) )? ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalStateSpecification.g:614:28: ( ( ( (lv_initial_0_0= 'initial' ) )? ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalStateSpecification.g:615:1: ( ( (lv_initial_0_0= 'initial' ) )? ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalStateSpecification.g:615:1: ( ( (lv_initial_0_0= 'initial' ) )? ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalStateSpecification.g:615:2: ( (lv_initial_0_0= 'initial' ) )? ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalStateSpecification.g:615:2: ( (lv_initial_0_0= 'initial' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalStateSpecification.g:616:1: (lv_initial_0_0= 'initial' )
                    {
                    // InternalStateSpecification.g:616:1: (lv_initial_0_0= 'initial' )
                    // InternalStateSpecification.g:617:3: lv_initial_0_0= 'initial'
                    {
                    lv_initial_0_0=(Token)match(input,30,FOLLOW_20); 

                            newLeafNode(lv_initial_0_0, grammarAccess.getStateAccess().getInitialInitialKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                           		setWithLastConsumed(current, "initial", true, "initial");
                    	    

                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:630:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalStateSpecification.g:631:1: (lv_value_1_0= RULE_STRING )
            {
            // InternalStateSpecification.g:631:1: (lv_value_1_0= RULE_STRING )
            // InternalStateSpecification.g:632:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_value_1_0, grammarAccess.getStateAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleModeVariable"
    // InternalStateSpecification.g:656:1: entryRuleModeVariable returns [EObject current=null] : iv_ruleModeVariable= ruleModeVariable EOF ;
    public final EObject entryRuleModeVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModeVariable = null;


        try {
            // InternalStateSpecification.g:657:2: (iv_ruleModeVariable= ruleModeVariable EOF )
            // InternalStateSpecification.g:658:2: iv_ruleModeVariable= ruleModeVariable EOF
            {
             newCompositeNode(grammarAccess.getModeVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModeVariable=ruleModeVariable();

            state._fsp--;

             current =iv_ruleModeVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModeVariable"


    // $ANTLR start "ruleModeVariable"
    // InternalStateSpecification.g:665:1: ruleModeVariable returns [EObject current=null] : (otherlv_0= 'mode' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_modes_3_0= ruleMode ) )+ otherlv_4= '}' ) ;
    public final EObject ruleModeVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_desc_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_modes_3_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:668:28: ( (otherlv_0= 'mode' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_modes_3_0= ruleMode ) )+ otherlv_4= '}' ) )
            // InternalStateSpecification.g:669:1: (otherlv_0= 'mode' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_modes_3_0= ruleMode ) )+ otherlv_4= '}' )
            {
            // InternalStateSpecification.g:669:1: (otherlv_0= 'mode' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_modes_3_0= ruleMode ) )+ otherlv_4= '}' )
            // InternalStateSpecification.g:669:3: otherlv_0= 'mode' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_modes_3_0= ruleMode ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_20); 

                	newLeafNode(otherlv_0, grammarAccess.getModeVariableAccess().getModeKeyword_0());
                
            // InternalStateSpecification.g:673:1: ( (lv_desc_1_0= RULE_STRING ) )
            // InternalStateSpecification.g:674:1: (lv_desc_1_0= RULE_STRING )
            {
            // InternalStateSpecification.g:674:1: (lv_desc_1_0= RULE_STRING )
            // InternalStateSpecification.g:675:3: lv_desc_1_0= RULE_STRING
            {
            lv_desc_1_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            			newLeafNode(lv_desc_1_0, grammarAccess.getModeVariableAccess().getDescSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModeVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"desc",
                    		lv_desc_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_22); 

                	newLeafNode(otherlv_2, grammarAccess.getModeVariableAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalStateSpecification.g:695:1: ( (lv_modes_3_0= ruleMode ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING||LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalStateSpecification.g:696:1: (lv_modes_3_0= ruleMode )
            	    {
            	    // InternalStateSpecification.g:696:1: (lv_modes_3_0= ruleMode )
            	    // InternalStateSpecification.g:697:3: lv_modes_3_0= ruleMode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModeVariableAccess().getModesModeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_23);
            	    lv_modes_3_0=ruleMode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModeVariableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modes",
            	            		lv_modes_3_0, 
            	            		"net.certware.intent.state.StateSpecification.Mode");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getModeVariableAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModeVariable"


    // $ANTLR start "entryRuleMode"
    // InternalStateSpecification.g:725:1: entryRuleMode returns [EObject current=null] : iv_ruleMode= ruleMode EOF ;
    public final EObject entryRuleMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMode = null;


        try {
            // InternalStateSpecification.g:726:2: (iv_ruleMode= ruleMode EOF )
            // InternalStateSpecification.g:727:2: iv_ruleMode= ruleMode EOF
            {
             newCompositeNode(grammarAccess.getModeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMode=ruleMode();

            state._fsp--;

             current =iv_ruleMode; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMode"


    // $ANTLR start "ruleMode"
    // InternalStateSpecification.g:734:1: ruleMode returns [EObject current=null] : ( ( (lv_initial_0_0= 'initial' ) )? ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMode() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalStateSpecification.g:737:28: ( ( ( (lv_initial_0_0= 'initial' ) )? ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalStateSpecification.g:738:1: ( ( (lv_initial_0_0= 'initial' ) )? ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalStateSpecification.g:738:1: ( ( (lv_initial_0_0= 'initial' ) )? ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalStateSpecification.g:738:2: ( (lv_initial_0_0= 'initial' ) )? ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalStateSpecification.g:738:2: ( (lv_initial_0_0= 'initial' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalStateSpecification.g:739:1: (lv_initial_0_0= 'initial' )
                    {
                    // InternalStateSpecification.g:739:1: (lv_initial_0_0= 'initial' )
                    // InternalStateSpecification.g:740:3: lv_initial_0_0= 'initial'
                    {
                    lv_initial_0_0=(Token)match(input,30,FOLLOW_20); 

                            newLeafNode(lv_initial_0_0, grammarAccess.getModeAccess().getInitialInitialKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModeRule());
                    	        }
                           		setWithLastConsumed(current, "initial", true, "initial");
                    	    

                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:753:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalStateSpecification.g:754:1: (lv_value_1_0= RULE_STRING )
            {
            // InternalStateSpecification.g:754:1: (lv_value_1_0= RULE_STRING )
            // InternalStateSpecification.g:755:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_value_1_0, grammarAccess.getModeAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMode"


    // $ANTLR start "entryRuleDevice"
    // InternalStateSpecification.g:779:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalStateSpecification.g:780:2: (iv_ruleDevice= ruleDevice EOF )
            // InternalStateSpecification.g:781:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalStateSpecification.g:788:1: ruleDevice returns [EObject current=null] : (otherlv_0= 'device' ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= 'inputs' ( (lv_inputs_4_0= ruleDeviceInput ) )* )? (otherlv_5= 'outputs' ( (lv_outputs_6_0= ruleDeviceOutput ) )* )? ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_desc_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_inputs_4_0 = null;

        EObject lv_outputs_6_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:791:28: ( (otherlv_0= 'device' ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= 'inputs' ( (lv_inputs_4_0= ruleDeviceInput ) )* )? (otherlv_5= 'outputs' ( (lv_outputs_6_0= ruleDeviceOutput ) )* )? ) )
            // InternalStateSpecification.g:792:1: (otherlv_0= 'device' ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= 'inputs' ( (lv_inputs_4_0= ruleDeviceInput ) )* )? (otherlv_5= 'outputs' ( (lv_outputs_6_0= ruleDeviceOutput ) )* )? )
            {
            // InternalStateSpecification.g:792:1: (otherlv_0= 'device' ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= 'inputs' ( (lv_inputs_4_0= ruleDeviceInput ) )* )? (otherlv_5= 'outputs' ( (lv_outputs_6_0= ruleDeviceOutput ) )* )? )
            // InternalStateSpecification.g:792:3: otherlv_0= 'device' ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) ) (otherlv_3= 'inputs' ( (lv_inputs_4_0= ruleDeviceInput ) )* )? (otherlv_5= 'outputs' ( (lv_outputs_6_0= ruleDeviceOutput ) )* )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDeviceKeyword_0());
                
            // InternalStateSpecification.g:796:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateSpecification.g:797:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateSpecification.g:797:1: (lv_name_1_0= RULE_ID )
            // InternalStateSpecification.g:798:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateSpecification.g:814:2: ( (lv_desc_2_0= RULE_STRING ) )
            // InternalStateSpecification.g:815:1: (lv_desc_2_0= RULE_STRING )
            {
            // InternalStateSpecification.g:815:1: (lv_desc_2_0= RULE_STRING )
            // InternalStateSpecification.g:816:3: lv_desc_2_0= RULE_STRING
            {
            lv_desc_2_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            			newLeafNode(lv_desc_2_0, grammarAccess.getDeviceAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"desc",
                    		lv_desc_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalStateSpecification.g:832:2: (otherlv_3= 'inputs' ( (lv_inputs_4_0= ruleDeviceInput ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalStateSpecification.g:832:4: otherlv_3= 'inputs' ( (lv_inputs_4_0= ruleDeviceInput ) )*
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_13); 

                        	newLeafNode(otherlv_3, grammarAccess.getDeviceAccess().getInputsKeyword_3_0());
                        
                    // InternalStateSpecification.g:836:1: ( (lv_inputs_4_0= ruleDeviceInput ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==33) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalStateSpecification.g:837:1: (lv_inputs_4_0= ruleDeviceInput )
                    	    {
                    	    // InternalStateSpecification.g:837:1: (lv_inputs_4_0= ruleDeviceInput )
                    	    // InternalStateSpecification.g:838:3: lv_inputs_4_0= ruleDeviceInput
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDeviceAccess().getInputsDeviceInputParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_13);
                    	    lv_inputs_4_0=ruleDeviceInput();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDeviceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"inputs",
                    	            		lv_inputs_4_0, 
                    	            		"net.certware.intent.state.StateSpecification.DeviceInput");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalStateSpecification.g:854:5: (otherlv_5= 'outputs' ( (lv_outputs_6_0= ruleDeviceOutput ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalStateSpecification.g:854:7: otherlv_5= 'outputs' ( (lv_outputs_6_0= ruleDeviceOutput ) )*
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_14); 

                        	newLeafNode(otherlv_5, grammarAccess.getDeviceAccess().getOutputsKeyword_4_0());
                        
                    // InternalStateSpecification.g:858:1: ( (lv_outputs_6_0= ruleDeviceOutput ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==36) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalStateSpecification.g:859:1: (lv_outputs_6_0= ruleDeviceOutput )
                    	    {
                    	    // InternalStateSpecification.g:859:1: (lv_outputs_6_0= ruleDeviceOutput )
                    	    // InternalStateSpecification.g:860:3: lv_outputs_6_0= ruleDeviceOutput
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDeviceAccess().getOutputsDeviceOutputParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_14);
                    	    lv_outputs_6_0=ruleDeviceOutput();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDeviceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"outputs",
                    	            		lv_outputs_6_0, 
                    	            		"net.certware.intent.state.StateSpecification.DeviceOutput");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleDeviceInput"
    // InternalStateSpecification.g:884:1: entryRuleDeviceInput returns [EObject current=null] : iv_ruleDeviceInput= ruleDeviceInput EOF ;
    public final EObject entryRuleDeviceInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceInput = null;


        try {
            // InternalStateSpecification.g:885:2: (iv_ruleDeviceInput= ruleDeviceInput EOF )
            // InternalStateSpecification.g:886:2: iv_ruleDeviceInput= ruleDeviceInput EOF
            {
             newCompositeNode(grammarAccess.getDeviceInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceInput=ruleDeviceInput();

            state._fsp--;

             current =iv_ruleDeviceInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeviceInput"


    // $ANTLR start "ruleDeviceInput"
    // InternalStateSpecification.g:893:1: ruleDeviceInput returns [EObject current=null] : (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleInput ) ) )? otherlv_4= 'source' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleDeviceInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_io_3_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:896:28: ( (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleInput ) ) )? otherlv_4= 'source' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalStateSpecification.g:897:1: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleInput ) ) )? otherlv_4= 'source' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalStateSpecification.g:897:1: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleInput ) ) )? otherlv_4= 'source' ( (otherlv_5= RULE_ID ) ) )
            // InternalStateSpecification.g:897:3: otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleInput ) ) )? otherlv_4= 'source' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getDeviceInputAccess().getInputKeyword_0());
                
            // InternalStateSpecification.g:901:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateSpecification.g:902:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateSpecification.g:902:1: (lv_name_1_0= RULE_ID )
            // InternalStateSpecification.g:903:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDeviceInputAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceInputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateSpecification.g:919:2: (otherlv_2= 'value' ( (lv_io_3_0= ruleInput ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalStateSpecification.g:919:4: otherlv_2= 'value' ( (lv_io_3_0= ruleInput ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_26); 

                        	newLeafNode(otherlv_2, grammarAccess.getDeviceInputAccess().getValueKeyword_2_0());
                        
                    // InternalStateSpecification.g:923:1: ( (lv_io_3_0= ruleInput ) )
                    // InternalStateSpecification.g:924:1: (lv_io_3_0= ruleInput )
                    {
                    // InternalStateSpecification.g:924:1: (lv_io_3_0= ruleInput )
                    // InternalStateSpecification.g:925:3: lv_io_3_0= ruleInput
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeviceInputAccess().getIoInputParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_27);
                    lv_io_3_0=ruleInput();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeviceInputRule());
                    	        }
                           		set(
                           			current, 
                           			"io",
                            		lv_io_3_0, 
                            		"net.certware.intent.state.StateSpecification.Input");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getDeviceInputAccess().getSourceKeyword_3());
                
            // InternalStateSpecification.g:945:1: ( (otherlv_5= RULE_ID ) )
            // InternalStateSpecification.g:946:1: (otherlv_5= RULE_ID )
            {
            // InternalStateSpecification.g:946:1: (otherlv_5= RULE_ID )
            // InternalStateSpecification.g:947:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceInputRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_5, grammarAccess.getDeviceInputAccess().getSourceComponentCrossReference_4_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceInput"


    // $ANTLR start "entryRuleDeviceOutput"
    // InternalStateSpecification.g:966:1: entryRuleDeviceOutput returns [EObject current=null] : iv_ruleDeviceOutput= ruleDeviceOutput EOF ;
    public final EObject entryRuleDeviceOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceOutput = null;


        try {
            // InternalStateSpecification.g:967:2: (iv_ruleDeviceOutput= ruleDeviceOutput EOF )
            // InternalStateSpecification.g:968:2: iv_ruleDeviceOutput= ruleDeviceOutput EOF
            {
             newCompositeNode(grammarAccess.getDeviceOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceOutput=ruleDeviceOutput();

            state._fsp--;

             current =iv_ruleDeviceOutput; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeviceOutput"


    // $ANTLR start "ruleDeviceOutput"
    // InternalStateSpecification.g:975:1: ruleDeviceOutput returns [EObject current=null] : (otherlv_0= 'output' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleOutput ) ) )? otherlv_4= 'target' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleDeviceOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_io_3_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:978:28: ( (otherlv_0= 'output' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleOutput ) ) )? otherlv_4= 'target' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalStateSpecification.g:979:1: (otherlv_0= 'output' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleOutput ) ) )? otherlv_4= 'target' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalStateSpecification.g:979:1: (otherlv_0= 'output' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleOutput ) ) )? otherlv_4= 'target' ( (otherlv_5= RULE_ID ) ) )
            // InternalStateSpecification.g:979:3: otherlv_0= 'output' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleOutput ) ) )? otherlv_4= 'target' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getDeviceOutputAccess().getOutputKeyword_0());
                
            // InternalStateSpecification.g:983:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateSpecification.g:984:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateSpecification.g:984:1: (lv_name_1_0= RULE_ID )
            // InternalStateSpecification.g:985:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDeviceOutputAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceOutputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateSpecification.g:1001:2: (otherlv_2= 'value' ( (lv_io_3_0= ruleOutput ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalStateSpecification.g:1001:4: otherlv_2= 'value' ( (lv_io_3_0= ruleOutput ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_29); 

                        	newLeafNode(otherlv_2, grammarAccess.getDeviceOutputAccess().getValueKeyword_2_0());
                        
                    // InternalStateSpecification.g:1005:1: ( (lv_io_3_0= ruleOutput ) )
                    // InternalStateSpecification.g:1006:1: (lv_io_3_0= ruleOutput )
                    {
                    // InternalStateSpecification.g:1006:1: (lv_io_3_0= ruleOutput )
                    // InternalStateSpecification.g:1007:3: lv_io_3_0= ruleOutput
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeviceOutputAccess().getIoOutputParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_30);
                    lv_io_3_0=ruleOutput();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeviceOutputRule());
                    	        }
                           		set(
                           			current, 
                           			"io",
                            		lv_io_3_0, 
                            		"net.certware.intent.state.StateSpecification.Output");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getDeviceOutputAccess().getTargetKeyword_3());
                
            // InternalStateSpecification.g:1027:1: ( (otherlv_5= RULE_ID ) )
            // InternalStateSpecification.g:1028:1: (otherlv_5= RULE_ID )
            {
            // InternalStateSpecification.g:1028:1: (otherlv_5= RULE_ID )
            // InternalStateSpecification.g:1029:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeviceOutputRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_5, grammarAccess.getDeviceOutputAccess().getTargetComponentCrossReference_4_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceOutput"


    // $ANTLR start "entryRuleComponentInput"
    // InternalStateSpecification.g:1048:1: entryRuleComponentInput returns [EObject current=null] : iv_ruleComponentInput= ruleComponentInput EOF ;
    public final EObject entryRuleComponentInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInput = null;


        try {
            // InternalStateSpecification.g:1049:2: (iv_ruleComponentInput= ruleComponentInput EOF )
            // InternalStateSpecification.g:1050:2: iv_ruleComponentInput= ruleComponentInput EOF
            {
             newCompositeNode(grammarAccess.getComponentInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentInput=ruleComponentInput();

            state._fsp--;

             current =iv_ruleComponentInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentInput"


    // $ANTLR start "ruleComponentInput"
    // InternalStateSpecification.g:1057:1: ruleComponentInput returns [EObject current=null] : (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleInput ) ) )? otherlv_4= 'source' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleComponentInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_io_3_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:1060:28: ( (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleInput ) ) )? otherlv_4= 'source' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalStateSpecification.g:1061:1: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleInput ) ) )? otherlv_4= 'source' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalStateSpecification.g:1061:1: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleInput ) ) )? otherlv_4= 'source' ( (otherlv_5= RULE_ID ) ) )
            // InternalStateSpecification.g:1061:3: otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleInput ) ) )? otherlv_4= 'source' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentInputAccess().getInputKeyword_0());
                
            // InternalStateSpecification.g:1065:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateSpecification.g:1066:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateSpecification.g:1066:1: (lv_name_1_0= RULE_ID )
            // InternalStateSpecification.g:1067:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComponentInputAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentInputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateSpecification.g:1083:2: (otherlv_2= 'value' ( (lv_io_3_0= ruleInput ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalStateSpecification.g:1083:4: otherlv_2= 'value' ( (lv_io_3_0= ruleInput ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_26); 

                        	newLeafNode(otherlv_2, grammarAccess.getComponentInputAccess().getValueKeyword_2_0());
                        
                    // InternalStateSpecification.g:1087:1: ( (lv_io_3_0= ruleInput ) )
                    // InternalStateSpecification.g:1088:1: (lv_io_3_0= ruleInput )
                    {
                    // InternalStateSpecification.g:1088:1: (lv_io_3_0= ruleInput )
                    // InternalStateSpecification.g:1089:3: lv_io_3_0= ruleInput
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentInputAccess().getIoInputParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_27);
                    lv_io_3_0=ruleInput();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentInputRule());
                    	        }
                           		set(
                           			current, 
                           			"io",
                            		lv_io_3_0, 
                            		"net.certware.intent.state.StateSpecification.Input");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getComponentInputAccess().getSourceKeyword_3());
                
            // InternalStateSpecification.g:1109:1: ( (otherlv_5= RULE_ID ) )
            // InternalStateSpecification.g:1110:1: (otherlv_5= RULE_ID )
            {
            // InternalStateSpecification.g:1110:1: (otherlv_5= RULE_ID )
            // InternalStateSpecification.g:1111:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentInputRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_5, grammarAccess.getComponentInputAccess().getSourceDeviceCrossReference_4_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentInput"


    // $ANTLR start "entryRuleComponentOutput"
    // InternalStateSpecification.g:1130:1: entryRuleComponentOutput returns [EObject current=null] : iv_ruleComponentOutput= ruleComponentOutput EOF ;
    public final EObject entryRuleComponentOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentOutput = null;


        try {
            // InternalStateSpecification.g:1131:2: (iv_ruleComponentOutput= ruleComponentOutput EOF )
            // InternalStateSpecification.g:1132:2: iv_ruleComponentOutput= ruleComponentOutput EOF
            {
             newCompositeNode(grammarAccess.getComponentOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentOutput=ruleComponentOutput();

            state._fsp--;

             current =iv_ruleComponentOutput; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentOutput"


    // $ANTLR start "ruleComponentOutput"
    // InternalStateSpecification.g:1139:1: ruleComponentOutput returns [EObject current=null] : (otherlv_0= 'output' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleOutput ) ) )? otherlv_4= 'target' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleComponentOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_io_3_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:1142:28: ( (otherlv_0= 'output' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleOutput ) ) )? otherlv_4= 'target' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalStateSpecification.g:1143:1: (otherlv_0= 'output' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleOutput ) ) )? otherlv_4= 'target' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalStateSpecification.g:1143:1: (otherlv_0= 'output' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleOutput ) ) )? otherlv_4= 'target' ( (otherlv_5= RULE_ID ) ) )
            // InternalStateSpecification.g:1143:3: otherlv_0= 'output' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'value' ( (lv_io_3_0= ruleOutput ) ) )? otherlv_4= 'target' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentOutputAccess().getOutputKeyword_0());
                
            // InternalStateSpecification.g:1147:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateSpecification.g:1148:1: (lv_name_1_0= RULE_ID )
            {
            // InternalStateSpecification.g:1148:1: (lv_name_1_0= RULE_ID )
            // InternalStateSpecification.g:1149:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComponentOutputAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentOutputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalStateSpecification.g:1165:2: (otherlv_2= 'value' ( (lv_io_3_0= ruleOutput ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalStateSpecification.g:1165:4: otherlv_2= 'value' ( (lv_io_3_0= ruleOutput ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_29); 

                        	newLeafNode(otherlv_2, grammarAccess.getComponentOutputAccess().getValueKeyword_2_0());
                        
                    // InternalStateSpecification.g:1169:1: ( (lv_io_3_0= ruleOutput ) )
                    // InternalStateSpecification.g:1170:1: (lv_io_3_0= ruleOutput )
                    {
                    // InternalStateSpecification.g:1170:1: (lv_io_3_0= ruleOutput )
                    // InternalStateSpecification.g:1171:3: lv_io_3_0= ruleOutput
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentOutputAccess().getIoOutputParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_30);
                    lv_io_3_0=ruleOutput();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentOutputRule());
                    	        }
                           		set(
                           			current, 
                           			"io",
                            		lv_io_3_0, 
                            		"net.certware.intent.state.StateSpecification.Output");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getComponentOutputAccess().getTargetKeyword_3());
                
            // InternalStateSpecification.g:1191:1: ( (otherlv_5= RULE_ID ) )
            // InternalStateSpecification.g:1192:1: (otherlv_5= RULE_ID )
            {
            // InternalStateSpecification.g:1192:1: (otherlv_5= RULE_ID )
            // InternalStateSpecification.g:1193:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentOutputRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_5, grammarAccess.getComponentOutputAccess().getTargetDeviceCrossReference_4_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentOutput"


    // $ANTLR start "entryRuleBigUnitValue"
    // InternalStateSpecification.g:1212:1: entryRuleBigUnitValue returns [EObject current=null] : iv_ruleBigUnitValue= ruleBigUnitValue EOF ;
    public final EObject entryRuleBigUnitValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigUnitValue = null;


        try {
            // InternalStateSpecification.g:1213:2: (iv_ruleBigUnitValue= ruleBigUnitValue EOF )
            // InternalStateSpecification.g:1214:2: iv_ruleBigUnitValue= ruleBigUnitValue EOF
            {
             newCompositeNode(grammarAccess.getBigUnitValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBigUnitValue=ruleBigUnitValue();

            state._fsp--;

             current =iv_ruleBigUnitValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBigUnitValue"


    // $ANTLR start "ruleBigUnitValue"
    // InternalStateSpecification.g:1221:1: ruleBigUnitValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleBigDecimalType ) ) otherlv_1= 'units' ( (lv_units_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleBigUnitValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_units_2_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:1224:28: ( ( ( (lv_value_0_0= ruleBigDecimalType ) ) otherlv_1= 'units' ( (lv_units_2_0= RULE_STRING ) ) ) )
            // InternalStateSpecification.g:1225:1: ( ( (lv_value_0_0= ruleBigDecimalType ) ) otherlv_1= 'units' ( (lv_units_2_0= RULE_STRING ) ) )
            {
            // InternalStateSpecification.g:1225:1: ( ( (lv_value_0_0= ruleBigDecimalType ) ) otherlv_1= 'units' ( (lv_units_2_0= RULE_STRING ) ) )
            // InternalStateSpecification.g:1225:2: ( (lv_value_0_0= ruleBigDecimalType ) ) otherlv_1= 'units' ( (lv_units_2_0= RULE_STRING ) )
            {
            // InternalStateSpecification.g:1225:2: ( (lv_value_0_0= ruleBigDecimalType ) )
            // InternalStateSpecification.g:1226:1: (lv_value_0_0= ruleBigDecimalType )
            {
            // InternalStateSpecification.g:1226:1: (lv_value_0_0= ruleBigDecimalType )
            // InternalStateSpecification.g:1227:3: lv_value_0_0= ruleBigDecimalType
            {
             
            	        newCompositeNode(grammarAccess.getBigUnitValueAccess().getValueBigDecimalTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_31);
            lv_value_0_0=ruleBigDecimalType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBigUnitValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"net.certware.intent.state.StateSpecification.BigDecimalType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_20); 

                	newLeafNode(otherlv_1, grammarAccess.getBigUnitValueAccess().getUnitsKeyword_1());
                
            // InternalStateSpecification.g:1247:1: ( (lv_units_2_0= RULE_STRING ) )
            // InternalStateSpecification.g:1248:1: (lv_units_2_0= RULE_STRING )
            {
            // InternalStateSpecification.g:1248:1: (lv_units_2_0= RULE_STRING )
            // InternalStateSpecification.g:1249:3: lv_units_2_0= RULE_STRING
            {
            lv_units_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_units_2_0, grammarAccess.getBigUnitValueAccess().getUnitsSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBigUnitValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"units",
                    		lv_units_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBigUnitValue"


    // $ANTLR start "entryRuleStateValue"
    // InternalStateSpecification.g:1273:1: entryRuleStateValue returns [EObject current=null] : iv_ruleStateValue= ruleStateValue EOF ;
    public final EObject entryRuleStateValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateValue = null;


        try {
            // InternalStateSpecification.g:1274:2: (iv_ruleStateValue= ruleStateValue EOF )
            // InternalStateSpecification.g:1275:2: iv_ruleStateValue= ruleStateValue EOF
            {
             newCompositeNode(grammarAccess.getStateValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateValue=ruleStateValue();

            state._fsp--;

             current =iv_ruleStateValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateValue"


    // $ANTLR start "ruleStateValue"
    // InternalStateSpecification.g:1282:1: ruleStateValue returns [EObject current=null] : ( ( (lv_value_0_1= 'T' | lv_value_0_2= 'F' | lv_value_0_3= '.' | lv_value_0_4= '?' ) ) ) ;
    public final EObject ruleStateValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;

         enterRule(); 
            
        try {
            // InternalStateSpecification.g:1285:28: ( ( ( (lv_value_0_1= 'T' | lv_value_0_2= 'F' | lv_value_0_3= '.' | lv_value_0_4= '?' ) ) ) )
            // InternalStateSpecification.g:1286:1: ( ( (lv_value_0_1= 'T' | lv_value_0_2= 'F' | lv_value_0_3= '.' | lv_value_0_4= '?' ) ) )
            {
            // InternalStateSpecification.g:1286:1: ( ( (lv_value_0_1= 'T' | lv_value_0_2= 'F' | lv_value_0_3= '.' | lv_value_0_4= '?' ) ) )
            // InternalStateSpecification.g:1287:1: ( (lv_value_0_1= 'T' | lv_value_0_2= 'F' | lv_value_0_3= '.' | lv_value_0_4= '?' ) )
            {
            // InternalStateSpecification.g:1287:1: ( (lv_value_0_1= 'T' | lv_value_0_2= 'F' | lv_value_0_3= '.' | lv_value_0_4= '?' ) )
            // InternalStateSpecification.g:1288:1: (lv_value_0_1= 'T' | lv_value_0_2= 'F' | lv_value_0_3= '.' | lv_value_0_4= '?' )
            {
            // InternalStateSpecification.g:1288:1: (lv_value_0_1= 'T' | lv_value_0_2= 'F' | lv_value_0_3= '.' | lv_value_0_4= '?' )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt31=1;
                }
                break;
            case 40:
                {
                alt31=2;
                }
                break;
            case 16:
                {
                alt31=3;
                }
                break;
            case 41:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalStateSpecification.g:1289:3: lv_value_0_1= 'T'
                    {
                    lv_value_0_1=(Token)match(input,39,FOLLOW_2); 

                            newLeafNode(lv_value_0_1, grammarAccess.getStateValueAccess().getValueTKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateValueRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalStateSpecification.g:1301:8: lv_value_0_2= 'F'
                    {
                    lv_value_0_2=(Token)match(input,40,FOLLOW_2); 

                            newLeafNode(lv_value_0_2, grammarAccess.getStateValueAccess().getValueFKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateValueRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalStateSpecification.g:1313:8: lv_value_0_3= '.'
                    {
                    lv_value_0_3=(Token)match(input,16,FOLLOW_2); 

                            newLeafNode(lv_value_0_3, grammarAccess.getStateValueAccess().getValueFullStopKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateValueRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // InternalStateSpecification.g:1325:8: lv_value_0_4= '?'
                    {
                    lv_value_0_4=(Token)match(input,41,FOLLOW_2); 

                            newLeafNode(lv_value_0_4, grammarAccess.getStateValueAccess().getValueQuestionMarkKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateValueRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_4, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateValue"


    // $ANTLR start "entryRuleStateList"
    // InternalStateSpecification.g:1348:1: entryRuleStateList returns [EObject current=null] : iv_ruleStateList= ruleStateList EOF ;
    public final EObject entryRuleStateList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateList = null;


        try {
            // InternalStateSpecification.g:1349:2: (iv_ruleStateList= ruleStateList EOF )
            // InternalStateSpecification.g:1350:2: iv_ruleStateList= ruleStateList EOF
            {
             newCompositeNode(grammarAccess.getStateListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateList=ruleStateList();

            state._fsp--;

             current =iv_ruleStateList; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateList"


    // $ANTLR start "ruleStateList"
    // InternalStateSpecification.g:1357:1: ruleStateList returns [EObject current=null] : (otherlv_0= '[' ( (lv_stateList_1_0= ruleStateValue ) )+ otherlv_2= ']' ) ;
    public final EObject ruleStateList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_stateList_1_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:1360:28: ( (otherlv_0= '[' ( (lv_stateList_1_0= ruleStateValue ) )+ otherlv_2= ']' ) )
            // InternalStateSpecification.g:1361:1: (otherlv_0= '[' ( (lv_stateList_1_0= ruleStateValue ) )+ otherlv_2= ']' )
            {
            // InternalStateSpecification.g:1361:1: (otherlv_0= '[' ( (lv_stateList_1_0= ruleStateValue ) )+ otherlv_2= ']' )
            // InternalStateSpecification.g:1361:3: otherlv_0= '[' ( (lv_stateList_1_0= ruleStateValue ) )+ otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_32); 

                	newLeafNode(otherlv_0, grammarAccess.getStateListAccess().getLeftSquareBracketKeyword_0());
                
            // InternalStateSpecification.g:1365:1: ( (lv_stateList_1_0= ruleStateValue ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==16||(LA32_0>=39 && LA32_0<=41)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalStateSpecification.g:1366:1: (lv_stateList_1_0= ruleStateValue )
            	    {
            	    // InternalStateSpecification.g:1366:1: (lv_stateList_1_0= ruleStateValue )
            	    // InternalStateSpecification.g:1367:3: lv_stateList_1_0= ruleStateValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateListAccess().getStateListStateValueParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_33);
            	    lv_stateList_1_0=ruleStateValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stateList",
            	            		lv_stateList_1_0, 
            	            		"net.certware.intent.state.StateSpecification.StateValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getStateListAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateList"


    // $ANTLR start "entryRuleTrigger"
    // InternalStateSpecification.g:1395:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalStateSpecification.g:1396:2: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalStateSpecification.g:1397:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalStateSpecification.g:1404:1: ruleTrigger returns [EObject current=null] : ( (otherlv_0= 'mode' ( (otherlv_1= RULE_ID ) ) ( (lv_list_2_0= ruleStateList ) ) ) | (otherlv_3= 'state' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= ruleStateList ) ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_list_2_0 = null;

        EObject lv_list_6_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:1407:28: ( ( (otherlv_0= 'mode' ( (otherlv_1= RULE_ID ) ) ( (lv_list_2_0= ruleStateList ) ) ) | (otherlv_3= 'state' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= ruleStateList ) ) ) ) )
            // InternalStateSpecification.g:1408:1: ( (otherlv_0= 'mode' ( (otherlv_1= RULE_ID ) ) ( (lv_list_2_0= ruleStateList ) ) ) | (otherlv_3= 'state' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= ruleStateList ) ) ) )
            {
            // InternalStateSpecification.g:1408:1: ( (otherlv_0= 'mode' ( (otherlv_1= RULE_ID ) ) ( (lv_list_2_0= ruleStateList ) ) ) | (otherlv_3= 'state' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= ruleStateList ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            else if ( (LA33_0==27) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalStateSpecification.g:1408:2: (otherlv_0= 'mode' ( (otherlv_1= RULE_ID ) ) ( (lv_list_2_0= ruleStateList ) ) )
                    {
                    // InternalStateSpecification.g:1408:2: (otherlv_0= 'mode' ( (otherlv_1= RULE_ID ) ) ( (lv_list_2_0= ruleStateList ) ) )
                    // InternalStateSpecification.g:1408:4: otherlv_0= 'mode' ( (otherlv_1= RULE_ID ) ) ( (lv_list_2_0= ruleStateList ) )
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_3); 

                        	newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getModeKeyword_0_0());
                        
                    // InternalStateSpecification.g:1412:1: ( (otherlv_1= RULE_ID ) )
                    // InternalStateSpecification.g:1413:1: (otherlv_1= RULE_ID )
                    {
                    // InternalStateSpecification.g:1413:1: (otherlv_1= RULE_ID )
                    // InternalStateSpecification.g:1414:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTriggerRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_34); 

                    		newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getModeModeCrossReference_0_1_0()); 
                    	

                    }


                    }

                    // InternalStateSpecification.g:1425:2: ( (lv_list_2_0= ruleStateList ) )
                    // InternalStateSpecification.g:1426:1: (lv_list_2_0= ruleStateList )
                    {
                    // InternalStateSpecification.g:1426:1: (lv_list_2_0= ruleStateList )
                    // InternalStateSpecification.g:1427:3: lv_list_2_0= ruleStateList
                    {
                     
                    	        newCompositeNode(grammarAccess.getTriggerAccess().getListStateListParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_list_2_0=ruleStateList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTriggerRule());
                    	        }
                           		set(
                           			current, 
                           			"list",
                            		lv_list_2_0, 
                            		"net.certware.intent.state.StateSpecification.StateList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStateSpecification.g:1444:6: (otherlv_3= 'state' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= ruleStateList ) ) )
                    {
                    // InternalStateSpecification.g:1444:6: (otherlv_3= 'state' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= ruleStateList ) ) )
                    // InternalStateSpecification.g:1444:8: otherlv_3= 'state' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= ruleStateList ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_3); 

                        	newLeafNode(otherlv_3, grammarAccess.getTriggerAccess().getStateKeyword_1_0());
                        
                    // InternalStateSpecification.g:1448:1: ( (otherlv_4= RULE_ID ) )
                    // InternalStateSpecification.g:1449:1: (otherlv_4= RULE_ID )
                    {
                    // InternalStateSpecification.g:1449:1: (otherlv_4= RULE_ID )
                    // InternalStateSpecification.g:1450:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTriggerRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_3); 

                    		newLeafNode(otherlv_4, grammarAccess.getTriggerAccess().getVariableStateVariableCrossReference_1_1_0()); 
                    	

                    }


                    }

                    // InternalStateSpecification.g:1461:2: ( (otherlv_5= RULE_ID ) )
                    // InternalStateSpecification.g:1462:1: (otherlv_5= RULE_ID )
                    {
                    // InternalStateSpecification.g:1462:1: (otherlv_5= RULE_ID )
                    // InternalStateSpecification.g:1463:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTriggerRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_34); 

                    		newLeafNode(otherlv_5, grammarAccess.getTriggerAccess().getValueStateCrossReference_1_2_0()); 
                    	

                    }


                    }

                    // InternalStateSpecification.g:1474:2: ( (lv_list_6_0= ruleStateList ) )
                    // InternalStateSpecification.g:1475:1: (lv_list_6_0= ruleStateList )
                    {
                    // InternalStateSpecification.g:1475:1: (lv_list_6_0= ruleStateList )
                    // InternalStateSpecification.g:1476:3: lv_list_6_0= ruleStateList
                    {
                     
                    	        newCompositeNode(grammarAccess.getTriggerAccess().getListStateListParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_list_6_0=ruleStateList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTriggerRule());
                    	        }
                           		set(
                           			current, 
                           			"list",
                            		lv_list_6_0, 
                            		"net.certware.intent.state.StateSpecification.StateList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleTriggerTable"
    // InternalStateSpecification.g:1500:1: entryRuleTriggerTable returns [EObject current=null] : iv_ruleTriggerTable= ruleTriggerTable EOF ;
    public final EObject entryRuleTriggerTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerTable = null;


        try {
            // InternalStateSpecification.g:1501:2: (iv_ruleTriggerTable= ruleTriggerTable EOF )
            // InternalStateSpecification.g:1502:2: iv_ruleTriggerTable= ruleTriggerTable EOF
            {
             newCompositeNode(grammarAccess.getTriggerTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriggerTable=ruleTriggerTable();

            state._fsp--;

             current =iv_ruleTriggerTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriggerTable"


    // $ANTLR start "ruleTriggerTable"
    // InternalStateSpecification.g:1509:1: ruleTriggerTable returns [EObject current=null] : ( () otherlv_1= 'table' ( (lv_rows_2_0= ruleTrigger ) )* ) ;
    public final EObject ruleTriggerTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_rows_2_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:1512:28: ( ( () otherlv_1= 'table' ( (lv_rows_2_0= ruleTrigger ) )* ) )
            // InternalStateSpecification.g:1513:1: ( () otherlv_1= 'table' ( (lv_rows_2_0= ruleTrigger ) )* )
            {
            // InternalStateSpecification.g:1513:1: ( () otherlv_1= 'table' ( (lv_rows_2_0= ruleTrigger ) )* )
            // InternalStateSpecification.g:1513:2: () otherlv_1= 'table' ( (lv_rows_2_0= ruleTrigger ) )*
            {
            // InternalStateSpecification.g:1513:2: ()
            // InternalStateSpecification.g:1514:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTriggerTableAccess().getTriggerTableAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FOLLOW_35); 

                	newLeafNode(otherlv_1, grammarAccess.getTriggerTableAccess().getTableKeyword_1());
                
            // InternalStateSpecification.g:1523:1: ( (lv_rows_2_0= ruleTrigger ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==27||LA34_0==31) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalStateSpecification.g:1524:1: (lv_rows_2_0= ruleTrigger )
            	    {
            	    // InternalStateSpecification.g:1524:1: (lv_rows_2_0= ruleTrigger )
            	    // InternalStateSpecification.g:1525:3: lv_rows_2_0= ruleTrigger
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTriggerTableAccess().getRowsTriggerParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_35);
            	    lv_rows_2_0=ruleTrigger();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTriggerTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rows",
            	            		lv_rows_2_0, 
            	            		"net.certware.intent.state.StateSpecification.Trigger");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriggerTable"


    // $ANTLR start "entryRuleValueRange"
    // InternalStateSpecification.g:1549:1: entryRuleValueRange returns [EObject current=null] : iv_ruleValueRange= ruleValueRange EOF ;
    public final EObject entryRuleValueRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueRange = null;


        try {
            // InternalStateSpecification.g:1550:2: (iv_ruleValueRange= ruleValueRange EOF )
            // InternalStateSpecification.g:1551:2: iv_ruleValueRange= ruleValueRange EOF
            {
             newCompositeNode(grammarAccess.getValueRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueRange=ruleValueRange();

            state._fsp--;

             current =iv_ruleValueRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueRange"


    // $ANTLR start "ruleValueRange"
    // InternalStateSpecification.g:1558:1: ruleValueRange returns [EObject current=null] : (otherlv_0= '{' ( (lv_lower_1_0= ruleBigDecimalType ) ) otherlv_2= '...' ( (lv_upper_3_0= ruleBigDecimalType ) ) otherlv_4= '}' otherlv_5= 'type' ( (lv_rangeType_6_0= RULE_STRING ) ) otherlv_7= 'units' ( (lv_rangeUnits_8_0= RULE_STRING ) ) ) ;
    public final EObject ruleValueRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_rangeType_6_0=null;
        Token otherlv_7=null;
        Token lv_rangeUnits_8_0=null;
        AntlrDatatypeRuleToken lv_lower_1_0 = null;

        AntlrDatatypeRuleToken lv_upper_3_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:1561:28: ( (otherlv_0= '{' ( (lv_lower_1_0= ruleBigDecimalType ) ) otherlv_2= '...' ( (lv_upper_3_0= ruleBigDecimalType ) ) otherlv_4= '}' otherlv_5= 'type' ( (lv_rangeType_6_0= RULE_STRING ) ) otherlv_7= 'units' ( (lv_rangeUnits_8_0= RULE_STRING ) ) ) )
            // InternalStateSpecification.g:1562:1: (otherlv_0= '{' ( (lv_lower_1_0= ruleBigDecimalType ) ) otherlv_2= '...' ( (lv_upper_3_0= ruleBigDecimalType ) ) otherlv_4= '}' otherlv_5= 'type' ( (lv_rangeType_6_0= RULE_STRING ) ) otherlv_7= 'units' ( (lv_rangeUnits_8_0= RULE_STRING ) ) )
            {
            // InternalStateSpecification.g:1562:1: (otherlv_0= '{' ( (lv_lower_1_0= ruleBigDecimalType ) ) otherlv_2= '...' ( (lv_upper_3_0= ruleBigDecimalType ) ) otherlv_4= '}' otherlv_5= 'type' ( (lv_rangeType_6_0= RULE_STRING ) ) otherlv_7= 'units' ( (lv_rangeUnits_8_0= RULE_STRING ) ) )
            // InternalStateSpecification.g:1562:3: otherlv_0= '{' ( (lv_lower_1_0= ruleBigDecimalType ) ) otherlv_2= '...' ( (lv_upper_3_0= ruleBigDecimalType ) ) otherlv_4= '}' otherlv_5= 'type' ( (lv_rangeType_6_0= RULE_STRING ) ) otherlv_7= 'units' ( (lv_rangeUnits_8_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_36); 

                	newLeafNode(otherlv_0, grammarAccess.getValueRangeAccess().getLeftCurlyBracketKeyword_0());
                
            // InternalStateSpecification.g:1566:1: ( (lv_lower_1_0= ruleBigDecimalType ) )
            // InternalStateSpecification.g:1567:1: (lv_lower_1_0= ruleBigDecimalType )
            {
            // InternalStateSpecification.g:1567:1: (lv_lower_1_0= ruleBigDecimalType )
            // InternalStateSpecification.g:1568:3: lv_lower_1_0= ruleBigDecimalType
            {
             
            	        newCompositeNode(grammarAccess.getValueRangeAccess().getLowerBigDecimalTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_37);
            lv_lower_1_0=ruleBigDecimalType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValueRangeRule());
            	        }
                   		set(
                   			current, 
                   			"lower",
                    		lv_lower_1_0, 
                    		"net.certware.intent.state.StateSpecification.BigDecimalType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_36); 

                	newLeafNode(otherlv_2, grammarAccess.getValueRangeAccess().getFullStopFullStopFullStopKeyword_2());
                
            // InternalStateSpecification.g:1588:1: ( (lv_upper_3_0= ruleBigDecimalType ) )
            // InternalStateSpecification.g:1589:1: (lv_upper_3_0= ruleBigDecimalType )
            {
            // InternalStateSpecification.g:1589:1: (lv_upper_3_0= ruleBigDecimalType )
            // InternalStateSpecification.g:1590:3: lv_upper_3_0= ruleBigDecimalType
            {
             
            	        newCompositeNode(grammarAccess.getValueRangeAccess().getUpperBigDecimalTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_38);
            lv_upper_3_0=ruleBigDecimalType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValueRangeRule());
            	        }
                   		set(
                   			current, 
                   			"upper",
                    		lv_upper_3_0, 
                    		"net.certware.intent.state.StateSpecification.BigDecimalType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_39); 

                	newLeafNode(otherlv_4, grammarAccess.getValueRangeAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,44,FOLLOW_20); 

                	newLeafNode(otherlv_5, grammarAccess.getValueRangeAccess().getTypeKeyword_5());
                
            // InternalStateSpecification.g:1614:1: ( (lv_rangeType_6_0= RULE_STRING ) )
            // InternalStateSpecification.g:1615:1: (lv_rangeType_6_0= RULE_STRING )
            {
            // InternalStateSpecification.g:1615:1: (lv_rangeType_6_0= RULE_STRING )
            // InternalStateSpecification.g:1616:3: lv_rangeType_6_0= RULE_STRING
            {
            lv_rangeType_6_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            			newLeafNode(lv_rangeType_6_0, grammarAccess.getValueRangeAccess().getRangeTypeSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValueRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"rangeType",
                    		lv_rangeType_6_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_20); 

                	newLeafNode(otherlv_7, grammarAccess.getValueRangeAccess().getUnitsKeyword_7());
                
            // InternalStateSpecification.g:1636:1: ( (lv_rangeUnits_8_0= RULE_STRING ) )
            // InternalStateSpecification.g:1637:1: (lv_rangeUnits_8_0= RULE_STRING )
            {
            // InternalStateSpecification.g:1637:1: (lv_rangeUnits_8_0= RULE_STRING )
            // InternalStateSpecification.g:1638:3: lv_rangeUnits_8_0= RULE_STRING
            {
            lv_rangeUnits_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_rangeUnits_8_0, grammarAccess.getValueRangeAccess().getRangeUnitsSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValueRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"rangeUnits",
                    		lv_rangeUnits_8_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueRange"


    // $ANTLR start "entryRuleValueList"
    // InternalStateSpecification.g:1662:1: entryRuleValueList returns [EObject current=null] : iv_ruleValueList= ruleValueList EOF ;
    public final EObject entryRuleValueList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueList = null;


        try {
            // InternalStateSpecification.g:1663:2: (iv_ruleValueList= ruleValueList EOF )
            // InternalStateSpecification.g:1664:2: iv_ruleValueList= ruleValueList EOF
            {
             newCompositeNode(grammarAccess.getValueListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueList=ruleValueList();

            state._fsp--;

             current =iv_ruleValueList; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueList"


    // $ANTLR start "ruleValueList"
    // InternalStateSpecification.g:1671:1: ruleValueList returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= RULE_STRING ) )+ otherlv_2= '}' ) ;
    public final EObject ruleValueList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalStateSpecification.g:1674:28: ( (otherlv_0= '{' ( (lv_values_1_0= RULE_STRING ) )+ otherlv_2= '}' ) )
            // InternalStateSpecification.g:1675:1: (otherlv_0= '{' ( (lv_values_1_0= RULE_STRING ) )+ otherlv_2= '}' )
            {
            // InternalStateSpecification.g:1675:1: (otherlv_0= '{' ( (lv_values_1_0= RULE_STRING ) )+ otherlv_2= '}' )
            // InternalStateSpecification.g:1675:3: otherlv_0= '{' ( (lv_values_1_0= RULE_STRING ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); 

                	newLeafNode(otherlv_0, grammarAccess.getValueListAccess().getLeftCurlyBracketKeyword_0());
                
            // InternalStateSpecification.g:1679:1: ( (lv_values_1_0= RULE_STRING ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_STRING) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalStateSpecification.g:1680:1: (lv_values_1_0= RULE_STRING )
            	    {
            	    // InternalStateSpecification.g:1680:1: (lv_values_1_0= RULE_STRING )
            	    // InternalStateSpecification.g:1681:3: lv_values_1_0= RULE_STRING
            	    {
            	    lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            	    			newLeafNode(lv_values_1_0, grammarAccess.getValueListAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getValueListRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"values",
            	            		lv_values_1_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getValueListAccess().getRightCurlyBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueList"


    // $ANTLR start "entryRuleOutput"
    // InternalStateSpecification.g:1709:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalStateSpecification.g:1710:2: (iv_ruleOutput= ruleOutput EOF )
            // InternalStateSpecification.g:1711:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalStateSpecification.g:1718:1: ruleOutput returns [EObject current=null] : ( () (otherlv_1= 'range' ( (lv_range_2_0= ruleValueRange ) ) )? (otherlv_3= 'value-list' ( (lv_valueList_4_0= ruleValueList ) ) )? (otherlv_5= 'rate' ( (lv_rate_6_0= ruleBigUnitValue ) ) )? (otherlv_7= 'initiation-delay' ( (lv_delay_8_0= ruleBigUnitValue ) ) )? (otherlv_9= 'completion-deadline' ( (lv_deadline_10_0= ruleBigUnitValue ) ) )? (otherlv_11= 'completion-exception' ( (lv_completionHandling_12_0= RULE_STRING ) ) )? (otherlv_13= 'variables' ( (lv_variables_14_0= RULE_STRING ) ) )? (otherlv_15= 'relationship' ( (lv_relationship_16_0= RULE_STRING ) ) )? (otherlv_17= 'min-response-time' ( (lv_minResponse_18_0= ruleBigUnitValue ) ) )? (otherlv_19= 'max-response-time' ( (lv_maxResponse_20_0= ruleBigUnitValue ) ) )? (otherlv_21= 'feedback-exception' ( (lv_feebackHandling_22_0= RULE_STRING ) ) )? (otherlv_23= 'reversed-by' ( (lv_reversed_24_0= RULE_STRING ) ) )? (otherlv_25= 'references' ( (lv_references_26_0= RULE_STRING ) ) )? (otherlv_27= 'comments' ( (lv_comments_28_0= RULE_STRING ) ) )? (otherlv_29= 'contents' ( (lv_contents_30_0= RULE_STRING ) ) )? (otherlv_31= 'triggering' ( (lv_table_32_0= ruleTriggerTable ) ) )? ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_completionHandling_12_0=null;
        Token otherlv_13=null;
        Token lv_variables_14_0=null;
        Token otherlv_15=null;
        Token lv_relationship_16_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token lv_feebackHandling_22_0=null;
        Token otherlv_23=null;
        Token lv_reversed_24_0=null;
        Token otherlv_25=null;
        Token lv_references_26_0=null;
        Token otherlv_27=null;
        Token lv_comments_28_0=null;
        Token otherlv_29=null;
        Token lv_contents_30_0=null;
        Token otherlv_31=null;
        EObject lv_range_2_0 = null;

        EObject lv_valueList_4_0 = null;

        EObject lv_rate_6_0 = null;

        EObject lv_delay_8_0 = null;

        EObject lv_deadline_10_0 = null;

        EObject lv_minResponse_18_0 = null;

        EObject lv_maxResponse_20_0 = null;

        EObject lv_table_32_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:1721:28: ( ( () (otherlv_1= 'range' ( (lv_range_2_0= ruleValueRange ) ) )? (otherlv_3= 'value-list' ( (lv_valueList_4_0= ruleValueList ) ) )? (otherlv_5= 'rate' ( (lv_rate_6_0= ruleBigUnitValue ) ) )? (otherlv_7= 'initiation-delay' ( (lv_delay_8_0= ruleBigUnitValue ) ) )? (otherlv_9= 'completion-deadline' ( (lv_deadline_10_0= ruleBigUnitValue ) ) )? (otherlv_11= 'completion-exception' ( (lv_completionHandling_12_0= RULE_STRING ) ) )? (otherlv_13= 'variables' ( (lv_variables_14_0= RULE_STRING ) ) )? (otherlv_15= 'relationship' ( (lv_relationship_16_0= RULE_STRING ) ) )? (otherlv_17= 'min-response-time' ( (lv_minResponse_18_0= ruleBigUnitValue ) ) )? (otherlv_19= 'max-response-time' ( (lv_maxResponse_20_0= ruleBigUnitValue ) ) )? (otherlv_21= 'feedback-exception' ( (lv_feebackHandling_22_0= RULE_STRING ) ) )? (otherlv_23= 'reversed-by' ( (lv_reversed_24_0= RULE_STRING ) ) )? (otherlv_25= 'references' ( (lv_references_26_0= RULE_STRING ) ) )? (otherlv_27= 'comments' ( (lv_comments_28_0= RULE_STRING ) ) )? (otherlv_29= 'contents' ( (lv_contents_30_0= RULE_STRING ) ) )? (otherlv_31= 'triggering' ( (lv_table_32_0= ruleTriggerTable ) ) )? ) )
            // InternalStateSpecification.g:1722:1: ( () (otherlv_1= 'range' ( (lv_range_2_0= ruleValueRange ) ) )? (otherlv_3= 'value-list' ( (lv_valueList_4_0= ruleValueList ) ) )? (otherlv_5= 'rate' ( (lv_rate_6_0= ruleBigUnitValue ) ) )? (otherlv_7= 'initiation-delay' ( (lv_delay_8_0= ruleBigUnitValue ) ) )? (otherlv_9= 'completion-deadline' ( (lv_deadline_10_0= ruleBigUnitValue ) ) )? (otherlv_11= 'completion-exception' ( (lv_completionHandling_12_0= RULE_STRING ) ) )? (otherlv_13= 'variables' ( (lv_variables_14_0= RULE_STRING ) ) )? (otherlv_15= 'relationship' ( (lv_relationship_16_0= RULE_STRING ) ) )? (otherlv_17= 'min-response-time' ( (lv_minResponse_18_0= ruleBigUnitValue ) ) )? (otherlv_19= 'max-response-time' ( (lv_maxResponse_20_0= ruleBigUnitValue ) ) )? (otherlv_21= 'feedback-exception' ( (lv_feebackHandling_22_0= RULE_STRING ) ) )? (otherlv_23= 'reversed-by' ( (lv_reversed_24_0= RULE_STRING ) ) )? (otherlv_25= 'references' ( (lv_references_26_0= RULE_STRING ) ) )? (otherlv_27= 'comments' ( (lv_comments_28_0= RULE_STRING ) ) )? (otherlv_29= 'contents' ( (lv_contents_30_0= RULE_STRING ) ) )? (otherlv_31= 'triggering' ( (lv_table_32_0= ruleTriggerTable ) ) )? )
            {
            // InternalStateSpecification.g:1722:1: ( () (otherlv_1= 'range' ( (lv_range_2_0= ruleValueRange ) ) )? (otherlv_3= 'value-list' ( (lv_valueList_4_0= ruleValueList ) ) )? (otherlv_5= 'rate' ( (lv_rate_6_0= ruleBigUnitValue ) ) )? (otherlv_7= 'initiation-delay' ( (lv_delay_8_0= ruleBigUnitValue ) ) )? (otherlv_9= 'completion-deadline' ( (lv_deadline_10_0= ruleBigUnitValue ) ) )? (otherlv_11= 'completion-exception' ( (lv_completionHandling_12_0= RULE_STRING ) ) )? (otherlv_13= 'variables' ( (lv_variables_14_0= RULE_STRING ) ) )? (otherlv_15= 'relationship' ( (lv_relationship_16_0= RULE_STRING ) ) )? (otherlv_17= 'min-response-time' ( (lv_minResponse_18_0= ruleBigUnitValue ) ) )? (otherlv_19= 'max-response-time' ( (lv_maxResponse_20_0= ruleBigUnitValue ) ) )? (otherlv_21= 'feedback-exception' ( (lv_feebackHandling_22_0= RULE_STRING ) ) )? (otherlv_23= 'reversed-by' ( (lv_reversed_24_0= RULE_STRING ) ) )? (otherlv_25= 'references' ( (lv_references_26_0= RULE_STRING ) ) )? (otherlv_27= 'comments' ( (lv_comments_28_0= RULE_STRING ) ) )? (otherlv_29= 'contents' ( (lv_contents_30_0= RULE_STRING ) ) )? (otherlv_31= 'triggering' ( (lv_table_32_0= ruleTriggerTable ) ) )? )
            // InternalStateSpecification.g:1722:2: () (otherlv_1= 'range' ( (lv_range_2_0= ruleValueRange ) ) )? (otherlv_3= 'value-list' ( (lv_valueList_4_0= ruleValueList ) ) )? (otherlv_5= 'rate' ( (lv_rate_6_0= ruleBigUnitValue ) ) )? (otherlv_7= 'initiation-delay' ( (lv_delay_8_0= ruleBigUnitValue ) ) )? (otherlv_9= 'completion-deadline' ( (lv_deadline_10_0= ruleBigUnitValue ) ) )? (otherlv_11= 'completion-exception' ( (lv_completionHandling_12_0= RULE_STRING ) ) )? (otherlv_13= 'variables' ( (lv_variables_14_0= RULE_STRING ) ) )? (otherlv_15= 'relationship' ( (lv_relationship_16_0= RULE_STRING ) ) )? (otherlv_17= 'min-response-time' ( (lv_minResponse_18_0= ruleBigUnitValue ) ) )? (otherlv_19= 'max-response-time' ( (lv_maxResponse_20_0= ruleBigUnitValue ) ) )? (otherlv_21= 'feedback-exception' ( (lv_feebackHandling_22_0= RULE_STRING ) ) )? (otherlv_23= 'reversed-by' ( (lv_reversed_24_0= RULE_STRING ) ) )? (otherlv_25= 'references' ( (lv_references_26_0= RULE_STRING ) ) )? (otherlv_27= 'comments' ( (lv_comments_28_0= RULE_STRING ) ) )? (otherlv_29= 'contents' ( (lv_contents_30_0= RULE_STRING ) ) )? (otherlv_31= 'triggering' ( (lv_table_32_0= ruleTriggerTable ) ) )?
            {
            // InternalStateSpecification.g:1722:2: ()
            // InternalStateSpecification.g:1723:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOutputAccess().getOutputAction_0(),
                        current);
                

            }

            // InternalStateSpecification.g:1728:2: (otherlv_1= 'range' ( (lv_range_2_0= ruleValueRange ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==45) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalStateSpecification.g:1728:4: otherlv_1= 'range' ( (lv_range_2_0= ruleValueRange ) )
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_21); 

                        	newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getRangeKeyword_1_0());
                        
                    // InternalStateSpecification.g:1732:1: ( (lv_range_2_0= ruleValueRange ) )
                    // InternalStateSpecification.g:1733:1: (lv_range_2_0= ruleValueRange )
                    {
                    // InternalStateSpecification.g:1733:1: (lv_range_2_0= ruleValueRange )
                    // InternalStateSpecification.g:1734:3: lv_range_2_0= ruleValueRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getOutputAccess().getRangeValueRangeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_41);
                    lv_range_2_0=ruleValueRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOutputRule());
                    	        }
                           		set(
                           			current, 
                           			"range",
                            		lv_range_2_0, 
                            		"net.certware.intent.state.StateSpecification.ValueRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:1750:4: (otherlv_3= 'value-list' ( (lv_valueList_4_0= ruleValueList ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalStateSpecification.g:1750:6: otherlv_3= 'value-list' ( (lv_valueList_4_0= ruleValueList ) )
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_21); 

                        	newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getValueListKeyword_2_0());
                        
                    // InternalStateSpecification.g:1754:1: ( (lv_valueList_4_0= ruleValueList ) )
                    // InternalStateSpecification.g:1755:1: (lv_valueList_4_0= ruleValueList )
                    {
                    // InternalStateSpecification.g:1755:1: (lv_valueList_4_0= ruleValueList )
                    // InternalStateSpecification.g:1756:3: lv_valueList_4_0= ruleValueList
                    {
                     
                    	        newCompositeNode(grammarAccess.getOutputAccess().getValueListValueListParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_42);
                    lv_valueList_4_0=ruleValueList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOutputRule());
                    	        }
                           		set(
                           			current, 
                           			"valueList",
                            		lv_valueList_4_0, 
                            		"net.certware.intent.state.StateSpecification.ValueList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:1772:4: (otherlv_5= 'rate' ( (lv_rate_6_0= ruleBigUnitValue ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalStateSpecification.g:1772:6: otherlv_5= 'rate' ( (lv_rate_6_0= ruleBigUnitValue ) )
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_36); 

                        	newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getRateKeyword_3_0());
                        
                    // InternalStateSpecification.g:1776:1: ( (lv_rate_6_0= ruleBigUnitValue ) )
                    // InternalStateSpecification.g:1777:1: (lv_rate_6_0= ruleBigUnitValue )
                    {
                    // InternalStateSpecification.g:1777:1: (lv_rate_6_0= ruleBigUnitValue )
                    // InternalStateSpecification.g:1778:3: lv_rate_6_0= ruleBigUnitValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getOutputAccess().getRateBigUnitValueParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_43);
                    lv_rate_6_0=ruleBigUnitValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOutputRule());
                    	        }
                           		set(
                           			current, 
                           			"rate",
                            		lv_rate_6_0, 
                            		"net.certware.intent.state.StateSpecification.BigUnitValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:1794:4: (otherlv_7= 'initiation-delay' ( (lv_delay_8_0= ruleBigUnitValue ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalStateSpecification.g:1794:6: otherlv_7= 'initiation-delay' ( (lv_delay_8_0= ruleBigUnitValue ) )
                    {
                    otherlv_7=(Token)match(input,48,FOLLOW_36); 

                        	newLeafNode(otherlv_7, grammarAccess.getOutputAccess().getInitiationDelayKeyword_4_0());
                        
                    // InternalStateSpecification.g:1798:1: ( (lv_delay_8_0= ruleBigUnitValue ) )
                    // InternalStateSpecification.g:1799:1: (lv_delay_8_0= ruleBigUnitValue )
                    {
                    // InternalStateSpecification.g:1799:1: (lv_delay_8_0= ruleBigUnitValue )
                    // InternalStateSpecification.g:1800:3: lv_delay_8_0= ruleBigUnitValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getOutputAccess().getDelayBigUnitValueParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_44);
                    lv_delay_8_0=ruleBigUnitValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOutputRule());
                    	        }
                           		set(
                           			current, 
                           			"delay",
                            		lv_delay_8_0, 
                            		"net.certware.intent.state.StateSpecification.BigUnitValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:1816:4: (otherlv_9= 'completion-deadline' ( (lv_deadline_10_0= ruleBigUnitValue ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalStateSpecification.g:1816:6: otherlv_9= 'completion-deadline' ( (lv_deadline_10_0= ruleBigUnitValue ) )
                    {
                    otherlv_9=(Token)match(input,49,FOLLOW_36); 

                        	newLeafNode(otherlv_9, grammarAccess.getOutputAccess().getCompletionDeadlineKeyword_5_0());
                        
                    // InternalStateSpecification.g:1820:1: ( (lv_deadline_10_0= ruleBigUnitValue ) )
                    // InternalStateSpecification.g:1821:1: (lv_deadline_10_0= ruleBigUnitValue )
                    {
                    // InternalStateSpecification.g:1821:1: (lv_deadline_10_0= ruleBigUnitValue )
                    // InternalStateSpecification.g:1822:3: lv_deadline_10_0= ruleBigUnitValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getOutputAccess().getDeadlineBigUnitValueParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_45);
                    lv_deadline_10_0=ruleBigUnitValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOutputRule());
                    	        }
                           		set(
                           			current, 
                           			"deadline",
                            		lv_deadline_10_0, 
                            		"net.certware.intent.state.StateSpecification.BigUnitValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:1838:4: (otherlv_11= 'completion-exception' ( (lv_completionHandling_12_0= RULE_STRING ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalStateSpecification.g:1838:6: otherlv_11= 'completion-exception' ( (lv_completionHandling_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,50,FOLLOW_20); 

                        	newLeafNode(otherlv_11, grammarAccess.getOutputAccess().getCompletionExceptionKeyword_6_0());
                        
                    // InternalStateSpecification.g:1842:1: ( (lv_completionHandling_12_0= RULE_STRING ) )
                    // InternalStateSpecification.g:1843:1: (lv_completionHandling_12_0= RULE_STRING )
                    {
                    // InternalStateSpecification.g:1843:1: (lv_completionHandling_12_0= RULE_STRING )
                    // InternalStateSpecification.g:1844:3: lv_completionHandling_12_0= RULE_STRING
                    {
                    lv_completionHandling_12_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

                    			newLeafNode(lv_completionHandling_12_0, grammarAccess.getOutputAccess().getCompletionHandlingSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"completionHandling",
                            		lv_completionHandling_12_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:1860:4: (otherlv_13= 'variables' ( (lv_variables_14_0= RULE_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==51) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalStateSpecification.g:1860:6: otherlv_13= 'variables' ( (lv_variables_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,51,FOLLOW_20); 

                        	newLeafNode(otherlv_13, grammarAccess.getOutputAccess().getVariablesKeyword_7_0());
                        
                    // InternalStateSpecification.g:1864:1: ( (lv_variables_14_0= RULE_STRING ) )
                    // InternalStateSpecification.g:1865:1: (lv_variables_14_0= RULE_STRING )
                    {
                    // InternalStateSpecification.g:1865:1: (lv_variables_14_0= RULE_STRING )
                    // InternalStateSpecification.g:1866:3: lv_variables_14_0= RULE_STRING
                    {
                    lv_variables_14_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

                    			newLeafNode(lv_variables_14_0, grammarAccess.getOutputAccess().getVariablesSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"variables",
                            		lv_variables_14_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:1882:4: (otherlv_15= 'relationship' ( (lv_relationship_16_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==52) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalStateSpecification.g:1882:6: otherlv_15= 'relationship' ( (lv_relationship_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,52,FOLLOW_20); 

                        	newLeafNode(otherlv_15, grammarAccess.getOutputAccess().getRelationshipKeyword_8_0());
                        
                    // InternalStateSpecification.g:1886:1: ( (lv_relationship_16_0= RULE_STRING ) )
                    // InternalStateSpecification.g:1887:1: (lv_relationship_16_0= RULE_STRING )
                    {
                    // InternalStateSpecification.g:1887:1: (lv_relationship_16_0= RULE_STRING )
                    // InternalStateSpecification.g:1888:3: lv_relationship_16_0= RULE_STRING
                    {
                    lv_relationship_16_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

                    			newLeafNode(lv_relationship_16_0, grammarAccess.getOutputAccess().getRelationshipSTRINGTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"relationship",
                            		lv_relationship_16_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:1904:4: (otherlv_17= 'min-response-time' ( (lv_minResponse_18_0= ruleBigUnitValue ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalStateSpecification.g:1904:6: otherlv_17= 'min-response-time' ( (lv_minResponse_18_0= ruleBigUnitValue ) )
                    {
                    otherlv_17=(Token)match(input,53,FOLLOW_36); 

                        	newLeafNode(otherlv_17, grammarAccess.getOutputAccess().getMinResponseTimeKeyword_9_0());
                        
                    // InternalStateSpecification.g:1908:1: ( (lv_minResponse_18_0= ruleBigUnitValue ) )
                    // InternalStateSpecification.g:1909:1: (lv_minResponse_18_0= ruleBigUnitValue )
                    {
                    // InternalStateSpecification.g:1909:1: (lv_minResponse_18_0= ruleBigUnitValue )
                    // InternalStateSpecification.g:1910:3: lv_minResponse_18_0= ruleBigUnitValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getOutputAccess().getMinResponseBigUnitValueParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_49);
                    lv_minResponse_18_0=ruleBigUnitValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOutputRule());
                    	        }
                           		set(
                           			current, 
                           			"minResponse",
                            		lv_minResponse_18_0, 
                            		"net.certware.intent.state.StateSpecification.BigUnitValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:1926:4: (otherlv_19= 'max-response-time' ( (lv_maxResponse_20_0= ruleBigUnitValue ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==54) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalStateSpecification.g:1926:6: otherlv_19= 'max-response-time' ( (lv_maxResponse_20_0= ruleBigUnitValue ) )
                    {
                    otherlv_19=(Token)match(input,54,FOLLOW_36); 

                        	newLeafNode(otherlv_19, grammarAccess.getOutputAccess().getMaxResponseTimeKeyword_10_0());
                        
                    // InternalStateSpecification.g:1930:1: ( (lv_maxResponse_20_0= ruleBigUnitValue ) )
                    // InternalStateSpecification.g:1931:1: (lv_maxResponse_20_0= ruleBigUnitValue )
                    {
                    // InternalStateSpecification.g:1931:1: (lv_maxResponse_20_0= ruleBigUnitValue )
                    // InternalStateSpecification.g:1932:3: lv_maxResponse_20_0= ruleBigUnitValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getOutputAccess().getMaxResponseBigUnitValueParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FOLLOW_50);
                    lv_maxResponse_20_0=ruleBigUnitValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOutputRule());
                    	        }
                           		set(
                           			current, 
                           			"maxResponse",
                            		lv_maxResponse_20_0, 
                            		"net.certware.intent.state.StateSpecification.BigUnitValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:1948:4: (otherlv_21= 'feedback-exception' ( (lv_feebackHandling_22_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==55) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalStateSpecification.g:1948:6: otherlv_21= 'feedback-exception' ( (lv_feebackHandling_22_0= RULE_STRING ) )
                    {
                    otherlv_21=(Token)match(input,55,FOLLOW_20); 

                        	newLeafNode(otherlv_21, grammarAccess.getOutputAccess().getFeedbackExceptionKeyword_11_0());
                        
                    // InternalStateSpecification.g:1952:1: ( (lv_feebackHandling_22_0= RULE_STRING ) )
                    // InternalStateSpecification.g:1953:1: (lv_feebackHandling_22_0= RULE_STRING )
                    {
                    // InternalStateSpecification.g:1953:1: (lv_feebackHandling_22_0= RULE_STRING )
                    // InternalStateSpecification.g:1954:3: lv_feebackHandling_22_0= RULE_STRING
                    {
                    lv_feebackHandling_22_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

                    			newLeafNode(lv_feebackHandling_22_0, grammarAccess.getOutputAccess().getFeebackHandlingSTRINGTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"feebackHandling",
                            		lv_feebackHandling_22_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:1970:4: (otherlv_23= 'reversed-by' ( (lv_reversed_24_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==56) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalStateSpecification.g:1970:6: otherlv_23= 'reversed-by' ( (lv_reversed_24_0= RULE_STRING ) )
                    {
                    otherlv_23=(Token)match(input,56,FOLLOW_20); 

                        	newLeafNode(otherlv_23, grammarAccess.getOutputAccess().getReversedByKeyword_12_0());
                        
                    // InternalStateSpecification.g:1974:1: ( (lv_reversed_24_0= RULE_STRING ) )
                    // InternalStateSpecification.g:1975:1: (lv_reversed_24_0= RULE_STRING )
                    {
                    // InternalStateSpecification.g:1975:1: (lv_reversed_24_0= RULE_STRING )
                    // InternalStateSpecification.g:1976:3: lv_reversed_24_0= RULE_STRING
                    {
                    lv_reversed_24_0=(Token)match(input,RULE_STRING,FOLLOW_52); 

                    			newLeafNode(lv_reversed_24_0, grammarAccess.getOutputAccess().getReversedSTRINGTerminalRuleCall_12_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"reversed",
                            		lv_reversed_24_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:1992:4: (otherlv_25= 'references' ( (lv_references_26_0= RULE_STRING ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==57) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalStateSpecification.g:1992:6: otherlv_25= 'references' ( (lv_references_26_0= RULE_STRING ) )
                    {
                    otherlv_25=(Token)match(input,57,FOLLOW_20); 

                        	newLeafNode(otherlv_25, grammarAccess.getOutputAccess().getReferencesKeyword_13_0());
                        
                    // InternalStateSpecification.g:1996:1: ( (lv_references_26_0= RULE_STRING ) )
                    // InternalStateSpecification.g:1997:1: (lv_references_26_0= RULE_STRING )
                    {
                    // InternalStateSpecification.g:1997:1: (lv_references_26_0= RULE_STRING )
                    // InternalStateSpecification.g:1998:3: lv_references_26_0= RULE_STRING
                    {
                    lv_references_26_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

                    			newLeafNode(lv_references_26_0, grammarAccess.getOutputAccess().getReferencesSTRINGTerminalRuleCall_13_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"references",
                            		lv_references_26_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:2014:4: (otherlv_27= 'comments' ( (lv_comments_28_0= RULE_STRING ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==58) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalStateSpecification.g:2014:6: otherlv_27= 'comments' ( (lv_comments_28_0= RULE_STRING ) )
                    {
                    otherlv_27=(Token)match(input,58,FOLLOW_20); 

                        	newLeafNode(otherlv_27, grammarAccess.getOutputAccess().getCommentsKeyword_14_0());
                        
                    // InternalStateSpecification.g:2018:1: ( (lv_comments_28_0= RULE_STRING ) )
                    // InternalStateSpecification.g:2019:1: (lv_comments_28_0= RULE_STRING )
                    {
                    // InternalStateSpecification.g:2019:1: (lv_comments_28_0= RULE_STRING )
                    // InternalStateSpecification.g:2020:3: lv_comments_28_0= RULE_STRING
                    {
                    lv_comments_28_0=(Token)match(input,RULE_STRING,FOLLOW_54); 

                    			newLeafNode(lv_comments_28_0, grammarAccess.getOutputAccess().getCommentsSTRINGTerminalRuleCall_14_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comments",
                            		lv_comments_28_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:2036:4: (otherlv_29= 'contents' ( (lv_contents_30_0= RULE_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==59) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalStateSpecification.g:2036:6: otherlv_29= 'contents' ( (lv_contents_30_0= RULE_STRING ) )
                    {
                    otherlv_29=(Token)match(input,59,FOLLOW_20); 

                        	newLeafNode(otherlv_29, grammarAccess.getOutputAccess().getContentsKeyword_15_0());
                        
                    // InternalStateSpecification.g:2040:1: ( (lv_contents_30_0= RULE_STRING ) )
                    // InternalStateSpecification.g:2041:1: (lv_contents_30_0= RULE_STRING )
                    {
                    // InternalStateSpecification.g:2041:1: (lv_contents_30_0= RULE_STRING )
                    // InternalStateSpecification.g:2042:3: lv_contents_30_0= RULE_STRING
                    {
                    lv_contents_30_0=(Token)match(input,RULE_STRING,FOLLOW_55); 

                    			newLeafNode(lv_contents_30_0, grammarAccess.getOutputAccess().getContentsSTRINGTerminalRuleCall_15_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"contents",
                            		lv_contents_30_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:2058:4: (otherlv_31= 'triggering' ( (lv_table_32_0= ruleTriggerTable ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==60) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalStateSpecification.g:2058:6: otherlv_31= 'triggering' ( (lv_table_32_0= ruleTriggerTable ) )
                    {
                    otherlv_31=(Token)match(input,60,FOLLOW_56); 

                        	newLeafNode(otherlv_31, grammarAccess.getOutputAccess().getTriggeringKeyword_16_0());
                        
                    // InternalStateSpecification.g:2062:1: ( (lv_table_32_0= ruleTriggerTable ) )
                    // InternalStateSpecification.g:2063:1: (lv_table_32_0= ruleTriggerTable )
                    {
                    // InternalStateSpecification.g:2063:1: (lv_table_32_0= ruleTriggerTable )
                    // InternalStateSpecification.g:2064:3: lv_table_32_0= ruleTriggerTable
                    {
                     
                    	        newCompositeNode(grammarAccess.getOutputAccess().getTableTriggerTableParserRuleCall_16_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_table_32_0=ruleTriggerTable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOutputRule());
                    	        }
                           		set(
                           			current, 
                           			"table",
                            		lv_table_32_0, 
                            		"net.certware.intent.state.StateSpecification.TriggerTable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleInput"
    // InternalStateSpecification.g:2088:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalStateSpecification.g:2089:2: (iv_ruleInput= ruleInput EOF )
            // InternalStateSpecification.g:2090:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalStateSpecification.g:2097:1: ruleInput returns [EObject current=null] : ( () (otherlv_1= 'range' ( (lv_range_2_0= ruleValueRange ) ) )? (otherlv_3= 'value-list' ( (lv_valueList_4_0= ruleValueList ) ) )? (otherlv_5= 'value-exception' ( (lv_valueHandling_6_0= RULE_STRING ) ) )? (otherlv_7= 'granularity' ( (lv_granularity_8_0= ruleBigUnitValue ) ) )? (otherlv_9= 'arrival-rate-avg' ( (lv_arrivalRateAvg_10_0= ruleBigUnitValue ) ) )? (otherlv_11= 'arrival-rate-minimum' ( (lv_arrivalRateMinimum_12_0= ruleBigUnitValue ) ) )? (otherlv_13= 'arrival-rate-maximum' ( (lv_arrivalRateMaximum_14_0= ruleBigUnitValue ) ) )? (otherlv_15= 'obsolescence' ( (lv_obsolescence_16_0= ruleBigUnitValue ) ) )? (otherlv_17= 'references' ( (lv_references_18_0= RULE_STRING ) ) )? (otherlv_19= 'appears-in' ( (lv_appearsIn_20_0= RULE_STRING ) ) )? (otherlv_21= 'description' ( (lv_description_22_0= RULE_STRING ) ) )? (otherlv_23= 'comments' ( (lv_comments_24_0= RULE_STRING ) ) )? (otherlv_25= 'triggering' ( (lv_structure_26_0= ruleTriggerTable ) ) )? ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_valueHandling_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_references_18_0=null;
        Token otherlv_19=null;
        Token lv_appearsIn_20_0=null;
        Token otherlv_21=null;
        Token lv_description_22_0=null;
        Token otherlv_23=null;
        Token lv_comments_24_0=null;
        Token otherlv_25=null;
        EObject lv_range_2_0 = null;

        EObject lv_valueList_4_0 = null;

        EObject lv_granularity_8_0 = null;

        EObject lv_arrivalRateAvg_10_0 = null;

        EObject lv_arrivalRateMinimum_12_0 = null;

        EObject lv_arrivalRateMaximum_14_0 = null;

        EObject lv_obsolescence_16_0 = null;

        EObject lv_structure_26_0 = null;


         enterRule(); 
            
        try {
            // InternalStateSpecification.g:2100:28: ( ( () (otherlv_1= 'range' ( (lv_range_2_0= ruleValueRange ) ) )? (otherlv_3= 'value-list' ( (lv_valueList_4_0= ruleValueList ) ) )? (otherlv_5= 'value-exception' ( (lv_valueHandling_6_0= RULE_STRING ) ) )? (otherlv_7= 'granularity' ( (lv_granularity_8_0= ruleBigUnitValue ) ) )? (otherlv_9= 'arrival-rate-avg' ( (lv_arrivalRateAvg_10_0= ruleBigUnitValue ) ) )? (otherlv_11= 'arrival-rate-minimum' ( (lv_arrivalRateMinimum_12_0= ruleBigUnitValue ) ) )? (otherlv_13= 'arrival-rate-maximum' ( (lv_arrivalRateMaximum_14_0= ruleBigUnitValue ) ) )? (otherlv_15= 'obsolescence' ( (lv_obsolescence_16_0= ruleBigUnitValue ) ) )? (otherlv_17= 'references' ( (lv_references_18_0= RULE_STRING ) ) )? (otherlv_19= 'appears-in' ( (lv_appearsIn_20_0= RULE_STRING ) ) )? (otherlv_21= 'description' ( (lv_description_22_0= RULE_STRING ) ) )? (otherlv_23= 'comments' ( (lv_comments_24_0= RULE_STRING ) ) )? (otherlv_25= 'triggering' ( (lv_structure_26_0= ruleTriggerTable ) ) )? ) )
            // InternalStateSpecification.g:2101:1: ( () (otherlv_1= 'range' ( (lv_range_2_0= ruleValueRange ) ) )? (otherlv_3= 'value-list' ( (lv_valueList_4_0= ruleValueList ) ) )? (otherlv_5= 'value-exception' ( (lv_valueHandling_6_0= RULE_STRING ) ) )? (otherlv_7= 'granularity' ( (lv_granularity_8_0= ruleBigUnitValue ) ) )? (otherlv_9= 'arrival-rate-avg' ( (lv_arrivalRateAvg_10_0= ruleBigUnitValue ) ) )? (otherlv_11= 'arrival-rate-minimum' ( (lv_arrivalRateMinimum_12_0= ruleBigUnitValue ) ) )? (otherlv_13= 'arrival-rate-maximum' ( (lv_arrivalRateMaximum_14_0= ruleBigUnitValue ) ) )? (otherlv_15= 'obsolescence' ( (lv_obsolescence_16_0= ruleBigUnitValue ) ) )? (otherlv_17= 'references' ( (lv_references_18_0= RULE_STRING ) ) )? (otherlv_19= 'appears-in' ( (lv_appearsIn_20_0= RULE_STRING ) ) )? (otherlv_21= 'description' ( (lv_description_22_0= RULE_STRING ) ) )? (otherlv_23= 'comments' ( (lv_comments_24_0= RULE_STRING ) ) )? (otherlv_25= 'triggering' ( (lv_structure_26_0= ruleTriggerTable ) ) )? )
            {
            // InternalStateSpecification.g:2101:1: ( () (otherlv_1= 'range' ( (lv_range_2_0= ruleValueRange ) ) )? (otherlv_3= 'value-list' ( (lv_valueList_4_0= ruleValueList ) ) )? (otherlv_5= 'value-exception' ( (lv_valueHandling_6_0= RULE_STRING ) ) )? (otherlv_7= 'granularity' ( (lv_granularity_8_0= ruleBigUnitValue ) ) )? (otherlv_9= 'arrival-rate-avg' ( (lv_arrivalRateAvg_10_0= ruleBigUnitValue ) ) )? (otherlv_11= 'arrival-rate-minimum' ( (lv_arrivalRateMinimum_12_0= ruleBigUnitValue ) ) )? (otherlv_13= 'arrival-rate-maximum' ( (lv_arrivalRateMaximum_14_0= ruleBigUnitValue ) ) )? (otherlv_15= 'obsolescence' ( (lv_obsolescence_16_0= ruleBigUnitValue ) ) )? (otherlv_17= 'references' ( (lv_references_18_0= RULE_STRING ) ) )? (otherlv_19= 'appears-in' ( (lv_appearsIn_20_0= RULE_STRING ) ) )? (otherlv_21= 'description' ( (lv_description_22_0= RULE_STRING ) ) )? (otherlv_23= 'comments' ( (lv_comments_24_0= RULE_STRING ) ) )? (otherlv_25= 'triggering' ( (lv_structure_26_0= ruleTriggerTable ) ) )? )
            // InternalStateSpecification.g:2101:2: () (otherlv_1= 'range' ( (lv_range_2_0= ruleValueRange ) ) )? (otherlv_3= 'value-list' ( (lv_valueList_4_0= ruleValueList ) ) )? (otherlv_5= 'value-exception' ( (lv_valueHandling_6_0= RULE_STRING ) ) )? (otherlv_7= 'granularity' ( (lv_granularity_8_0= ruleBigUnitValue ) ) )? (otherlv_9= 'arrival-rate-avg' ( (lv_arrivalRateAvg_10_0= ruleBigUnitValue ) ) )? (otherlv_11= 'arrival-rate-minimum' ( (lv_arrivalRateMinimum_12_0= ruleBigUnitValue ) ) )? (otherlv_13= 'arrival-rate-maximum' ( (lv_arrivalRateMaximum_14_0= ruleBigUnitValue ) ) )? (otherlv_15= 'obsolescence' ( (lv_obsolescence_16_0= ruleBigUnitValue ) ) )? (otherlv_17= 'references' ( (lv_references_18_0= RULE_STRING ) ) )? (otherlv_19= 'appears-in' ( (lv_appearsIn_20_0= RULE_STRING ) ) )? (otherlv_21= 'description' ( (lv_description_22_0= RULE_STRING ) ) )? (otherlv_23= 'comments' ( (lv_comments_24_0= RULE_STRING ) ) )? (otherlv_25= 'triggering' ( (lv_structure_26_0= ruleTriggerTable ) ) )?
            {
            // InternalStateSpecification.g:2101:2: ()
            // InternalStateSpecification.g:2102:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputAccess().getInputAction_0(),
                        current);
                

            }

            // InternalStateSpecification.g:2107:2: (otherlv_1= 'range' ( (lv_range_2_0= ruleValueRange ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==45) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalStateSpecification.g:2107:4: otherlv_1= 'range' ( (lv_range_2_0= ruleValueRange ) )
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_21); 

                        	newLeafNode(otherlv_1, grammarAccess.getInputAccess().getRangeKeyword_1_0());
                        
                    // InternalStateSpecification.g:2111:1: ( (lv_range_2_0= ruleValueRange ) )
                    // InternalStateSpecification.g:2112:1: (lv_range_2_0= ruleValueRange )
                    {
                    // InternalStateSpecification.g:2112:1: (lv_range_2_0= ruleValueRange )
                    // InternalStateSpecification.g:2113:3: lv_range_2_0= ruleValueRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputAccess().getRangeValueRangeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_57);
                    lv_range_2_0=ruleValueRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRule());
                    	        }
                           		set(
                           			current, 
                           			"range",
                            		lv_range_2_0, 
                            		"net.certware.intent.state.StateSpecification.ValueRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:2129:4: (otherlv_3= 'value-list' ( (lv_valueList_4_0= ruleValueList ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==46) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalStateSpecification.g:2129:6: otherlv_3= 'value-list' ( (lv_valueList_4_0= ruleValueList ) )
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_21); 

                        	newLeafNode(otherlv_3, grammarAccess.getInputAccess().getValueListKeyword_2_0());
                        
                    // InternalStateSpecification.g:2133:1: ( (lv_valueList_4_0= ruleValueList ) )
                    // InternalStateSpecification.g:2134:1: (lv_valueList_4_0= ruleValueList )
                    {
                    // InternalStateSpecification.g:2134:1: (lv_valueList_4_0= ruleValueList )
                    // InternalStateSpecification.g:2135:3: lv_valueList_4_0= ruleValueList
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputAccess().getValueListValueListParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_58);
                    lv_valueList_4_0=ruleValueList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRule());
                    	        }
                           		set(
                           			current, 
                           			"valueList",
                            		lv_valueList_4_0, 
                            		"net.certware.intent.state.StateSpecification.ValueList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:2151:4: (otherlv_5= 'value-exception' ( (lv_valueHandling_6_0= RULE_STRING ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==61) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalStateSpecification.g:2151:6: otherlv_5= 'value-exception' ( (lv_valueHandling_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,61,FOLLOW_20); 

                        	newLeafNode(otherlv_5, grammarAccess.getInputAccess().getValueExceptionKeyword_3_0());
                        
                    // InternalStateSpecification.g:2155:1: ( (lv_valueHandling_6_0= RULE_STRING ) )
                    // InternalStateSpecification.g:2156:1: (lv_valueHandling_6_0= RULE_STRING )
                    {
                    // InternalStateSpecification.g:2156:1: (lv_valueHandling_6_0= RULE_STRING )
                    // InternalStateSpecification.g:2157:3: lv_valueHandling_6_0= RULE_STRING
                    {
                    lv_valueHandling_6_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

                    			newLeafNode(lv_valueHandling_6_0, grammarAccess.getInputAccess().getValueHandlingSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valueHandling",
                            		lv_valueHandling_6_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:2173:4: (otherlv_7= 'granularity' ( (lv_granularity_8_0= ruleBigUnitValue ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==62) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalStateSpecification.g:2173:6: otherlv_7= 'granularity' ( (lv_granularity_8_0= ruleBigUnitValue ) )
                    {
                    otherlv_7=(Token)match(input,62,FOLLOW_36); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputAccess().getGranularityKeyword_4_0());
                        
                    // InternalStateSpecification.g:2177:1: ( (lv_granularity_8_0= ruleBigUnitValue ) )
                    // InternalStateSpecification.g:2178:1: (lv_granularity_8_0= ruleBigUnitValue )
                    {
                    // InternalStateSpecification.g:2178:1: (lv_granularity_8_0= ruleBigUnitValue )
                    // InternalStateSpecification.g:2179:3: lv_granularity_8_0= ruleBigUnitValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputAccess().getGranularityBigUnitValueParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_60);
                    lv_granularity_8_0=ruleBigUnitValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRule());
                    	        }
                           		set(
                           			current, 
                           			"granularity",
                            		lv_granularity_8_0, 
                            		"net.certware.intent.state.StateSpecification.BigUnitValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:2195:4: (otherlv_9= 'arrival-rate-avg' ( (lv_arrivalRateAvg_10_0= ruleBigUnitValue ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==63) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalStateSpecification.g:2195:6: otherlv_9= 'arrival-rate-avg' ( (lv_arrivalRateAvg_10_0= ruleBigUnitValue ) )
                    {
                    otherlv_9=(Token)match(input,63,FOLLOW_36); 

                        	newLeafNode(otherlv_9, grammarAccess.getInputAccess().getArrivalRateAvgKeyword_5_0());
                        
                    // InternalStateSpecification.g:2199:1: ( (lv_arrivalRateAvg_10_0= ruleBigUnitValue ) )
                    // InternalStateSpecification.g:2200:1: (lv_arrivalRateAvg_10_0= ruleBigUnitValue )
                    {
                    // InternalStateSpecification.g:2200:1: (lv_arrivalRateAvg_10_0= ruleBigUnitValue )
                    // InternalStateSpecification.g:2201:3: lv_arrivalRateAvg_10_0= ruleBigUnitValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputAccess().getArrivalRateAvgBigUnitValueParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_61);
                    lv_arrivalRateAvg_10_0=ruleBigUnitValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRule());
                    	        }
                           		set(
                           			current, 
                           			"arrivalRateAvg",
                            		lv_arrivalRateAvg_10_0, 
                            		"net.certware.intent.state.StateSpecification.BigUnitValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:2217:4: (otherlv_11= 'arrival-rate-minimum' ( (lv_arrivalRateMinimum_12_0= ruleBigUnitValue ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==64) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalStateSpecification.g:2217:6: otherlv_11= 'arrival-rate-minimum' ( (lv_arrivalRateMinimum_12_0= ruleBigUnitValue ) )
                    {
                    otherlv_11=(Token)match(input,64,FOLLOW_36); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputAccess().getArrivalRateMinimumKeyword_6_0());
                        
                    // InternalStateSpecification.g:2221:1: ( (lv_arrivalRateMinimum_12_0= ruleBigUnitValue ) )
                    // InternalStateSpecification.g:2222:1: (lv_arrivalRateMinimum_12_0= ruleBigUnitValue )
                    {
                    // InternalStateSpecification.g:2222:1: (lv_arrivalRateMinimum_12_0= ruleBigUnitValue )
                    // InternalStateSpecification.g:2223:3: lv_arrivalRateMinimum_12_0= ruleBigUnitValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputAccess().getArrivalRateMinimumBigUnitValueParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_62);
                    lv_arrivalRateMinimum_12_0=ruleBigUnitValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRule());
                    	        }
                           		set(
                           			current, 
                           			"arrivalRateMinimum",
                            		lv_arrivalRateMinimum_12_0, 
                            		"net.certware.intent.state.StateSpecification.BigUnitValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:2239:4: (otherlv_13= 'arrival-rate-maximum' ( (lv_arrivalRateMaximum_14_0= ruleBigUnitValue ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==65) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalStateSpecification.g:2239:6: otherlv_13= 'arrival-rate-maximum' ( (lv_arrivalRateMaximum_14_0= ruleBigUnitValue ) )
                    {
                    otherlv_13=(Token)match(input,65,FOLLOW_36); 

                        	newLeafNode(otherlv_13, grammarAccess.getInputAccess().getArrivalRateMaximumKeyword_7_0());
                        
                    // InternalStateSpecification.g:2243:1: ( (lv_arrivalRateMaximum_14_0= ruleBigUnitValue ) )
                    // InternalStateSpecification.g:2244:1: (lv_arrivalRateMaximum_14_0= ruleBigUnitValue )
                    {
                    // InternalStateSpecification.g:2244:1: (lv_arrivalRateMaximum_14_0= ruleBigUnitValue )
                    // InternalStateSpecification.g:2245:3: lv_arrivalRateMaximum_14_0= ruleBigUnitValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputAccess().getArrivalRateMaximumBigUnitValueParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_63);
                    lv_arrivalRateMaximum_14_0=ruleBigUnitValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRule());
                    	        }
                           		set(
                           			current, 
                           			"arrivalRateMaximum",
                            		lv_arrivalRateMaximum_14_0, 
                            		"net.certware.intent.state.StateSpecification.BigUnitValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:2261:4: (otherlv_15= 'obsolescence' ( (lv_obsolescence_16_0= ruleBigUnitValue ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==66) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalStateSpecification.g:2261:6: otherlv_15= 'obsolescence' ( (lv_obsolescence_16_0= ruleBigUnitValue ) )
                    {
                    otherlv_15=(Token)match(input,66,FOLLOW_36); 

                        	newLeafNode(otherlv_15, grammarAccess.getInputAccess().getObsolescenceKeyword_8_0());
                        
                    // InternalStateSpecification.g:2265:1: ( (lv_obsolescence_16_0= ruleBigUnitValue ) )
                    // InternalStateSpecification.g:2266:1: (lv_obsolescence_16_0= ruleBigUnitValue )
                    {
                    // InternalStateSpecification.g:2266:1: (lv_obsolescence_16_0= ruleBigUnitValue )
                    // InternalStateSpecification.g:2267:3: lv_obsolescence_16_0= ruleBigUnitValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputAccess().getObsolescenceBigUnitValueParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_64);
                    lv_obsolescence_16_0=ruleBigUnitValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRule());
                    	        }
                           		set(
                           			current, 
                           			"obsolescence",
                            		lv_obsolescence_16_0, 
                            		"net.certware.intent.state.StateSpecification.BigUnitValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:2283:4: (otherlv_17= 'references' ( (lv_references_18_0= RULE_STRING ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==57) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalStateSpecification.g:2283:6: otherlv_17= 'references' ( (lv_references_18_0= RULE_STRING ) )
                    {
                    otherlv_17=(Token)match(input,57,FOLLOW_20); 

                        	newLeafNode(otherlv_17, grammarAccess.getInputAccess().getReferencesKeyword_9_0());
                        
                    // InternalStateSpecification.g:2287:1: ( (lv_references_18_0= RULE_STRING ) )
                    // InternalStateSpecification.g:2288:1: (lv_references_18_0= RULE_STRING )
                    {
                    // InternalStateSpecification.g:2288:1: (lv_references_18_0= RULE_STRING )
                    // InternalStateSpecification.g:2289:3: lv_references_18_0= RULE_STRING
                    {
                    lv_references_18_0=(Token)match(input,RULE_STRING,FOLLOW_65); 

                    			newLeafNode(lv_references_18_0, grammarAccess.getInputAccess().getReferencesSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"references",
                            		lv_references_18_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:2305:4: (otherlv_19= 'appears-in' ( (lv_appearsIn_20_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==67) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalStateSpecification.g:2305:6: otherlv_19= 'appears-in' ( (lv_appearsIn_20_0= RULE_STRING ) )
                    {
                    otherlv_19=(Token)match(input,67,FOLLOW_20); 

                        	newLeafNode(otherlv_19, grammarAccess.getInputAccess().getAppearsInKeyword_10_0());
                        
                    // InternalStateSpecification.g:2309:1: ( (lv_appearsIn_20_0= RULE_STRING ) )
                    // InternalStateSpecification.g:2310:1: (lv_appearsIn_20_0= RULE_STRING )
                    {
                    // InternalStateSpecification.g:2310:1: (lv_appearsIn_20_0= RULE_STRING )
                    // InternalStateSpecification.g:2311:3: lv_appearsIn_20_0= RULE_STRING
                    {
                    lv_appearsIn_20_0=(Token)match(input,RULE_STRING,FOLLOW_66); 

                    			newLeafNode(lv_appearsIn_20_0, grammarAccess.getInputAccess().getAppearsInSTRINGTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"appearsIn",
                            		lv_appearsIn_20_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:2327:4: (otherlv_21= 'description' ( (lv_description_22_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==68) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalStateSpecification.g:2327:6: otherlv_21= 'description' ( (lv_description_22_0= RULE_STRING ) )
                    {
                    otherlv_21=(Token)match(input,68,FOLLOW_20); 

                        	newLeafNode(otherlv_21, grammarAccess.getInputAccess().getDescriptionKeyword_11_0());
                        
                    // InternalStateSpecification.g:2331:1: ( (lv_description_22_0= RULE_STRING ) )
                    // InternalStateSpecification.g:2332:1: (lv_description_22_0= RULE_STRING )
                    {
                    // InternalStateSpecification.g:2332:1: (lv_description_22_0= RULE_STRING )
                    // InternalStateSpecification.g:2333:3: lv_description_22_0= RULE_STRING
                    {
                    lv_description_22_0=(Token)match(input,RULE_STRING,FOLLOW_67); 

                    			newLeafNode(lv_description_22_0, grammarAccess.getInputAccess().getDescriptionSTRINGTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_22_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:2349:4: (otherlv_23= 'comments' ( (lv_comments_24_0= RULE_STRING ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==58) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalStateSpecification.g:2349:6: otherlv_23= 'comments' ( (lv_comments_24_0= RULE_STRING ) )
                    {
                    otherlv_23=(Token)match(input,58,FOLLOW_20); 

                        	newLeafNode(otherlv_23, grammarAccess.getInputAccess().getCommentsKeyword_12_0());
                        
                    // InternalStateSpecification.g:2353:1: ( (lv_comments_24_0= RULE_STRING ) )
                    // InternalStateSpecification.g:2354:1: (lv_comments_24_0= RULE_STRING )
                    {
                    // InternalStateSpecification.g:2354:1: (lv_comments_24_0= RULE_STRING )
                    // InternalStateSpecification.g:2355:3: lv_comments_24_0= RULE_STRING
                    {
                    lv_comments_24_0=(Token)match(input,RULE_STRING,FOLLOW_55); 

                    			newLeafNode(lv_comments_24_0, grammarAccess.getInputAccess().getCommentsSTRINGTerminalRuleCall_12_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comments",
                            		lv_comments_24_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalStateSpecification.g:2371:4: (otherlv_25= 'triggering' ( (lv_structure_26_0= ruleTriggerTable ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==60) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalStateSpecification.g:2371:6: otherlv_25= 'triggering' ( (lv_structure_26_0= ruleTriggerTable ) )
                    {
                    otherlv_25=(Token)match(input,60,FOLLOW_56); 

                        	newLeafNode(otherlv_25, grammarAccess.getInputAccess().getTriggeringKeyword_13_0());
                        
                    // InternalStateSpecification.g:2375:1: ( (lv_structure_26_0= ruleTriggerTable ) )
                    // InternalStateSpecification.g:2376:1: (lv_structure_26_0= ruleTriggerTable )
                    {
                    // InternalStateSpecification.g:2376:1: (lv_structure_26_0= ruleTriggerTable )
                    // InternalStateSpecification.g:2377:3: lv_structure_26_0= ruleTriggerTable
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputAccess().getStructureTriggerTableParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_structure_26_0=ruleTriggerTable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRule());
                    	        }
                           		set(
                           			current, 
                           			"structure",
                            		lv_structure_26_0, 
                            		"net.certware.intent.state.StateSpecification.TriggerTable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000101002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003CE0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000B800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000201000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000020E0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000060000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xF600600800000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1FFFE02000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000038000010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000038000014000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000088000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1FFFC00000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1FFF800000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1FFF000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1FFE000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1FFC000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1FF8000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1FF0000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1FE0000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x1FC0000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x1F80000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1F00000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1E00000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1C00000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0xF600400000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0xF600000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0xD600000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x9600000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1600000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x1600000000000002L,0x000000000000001EL});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x1600000000000002L,0x000000000000001CL});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x1600000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x1400000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x1400000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x1400000000000002L});

}