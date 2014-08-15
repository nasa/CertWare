package net.certware.hazard.stpa.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.certware.hazard.stpa.services.HazardAnalysisGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHazardAnalysisParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Accident'", "'{'", "'}'", "'Incident'", "'Severity'", "'Priority'", "'Hazard'", "'Risk'", "'Likelihood'", "'Exposure'", "'Constraint'", "'Requirement'", "'Allocation'", "'Analysis'", "'Rationale'", "'Scenario'", "';'", "'Control'", "'Note'"
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
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalHazardAnalysisParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHazardAnalysisParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHazardAnalysisParser.tokenNames; }
    public String getGrammarFileName() { return "../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g"; }



     	private HazardAnalysisGrammarAccess grammarAccess;
     	
        public InternalHazardAnalysisParser(TokenStream input, HazardAnalysisGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected HazardAnalysisGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_accidents_0_0= ruleAccident ) )* ( (lv_indicents_1_0= ruleIncident ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_accidents_0_0 = null;

        EObject lv_indicents_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:79:28: ( ( ( (lv_accidents_0_0= ruleAccident ) )* ( (lv_indicents_1_0= ruleIncident ) )* ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:80:1: ( ( (lv_accidents_0_0= ruleAccident ) )* ( (lv_indicents_1_0= ruleIncident ) )* )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:80:1: ( ( (lv_accidents_0_0= ruleAccident ) )* ( (lv_indicents_1_0= ruleIncident ) )* )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:80:2: ( (lv_accidents_0_0= ruleAccident ) )* ( (lv_indicents_1_0= ruleIncident ) )*
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:80:2: ( (lv_accidents_0_0= ruleAccident ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:81:1: (lv_accidents_0_0= ruleAccident )
            	    {
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:81:1: (lv_accidents_0_0= ruleAccident )
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:82:3: lv_accidents_0_0= ruleAccident
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getAccidentsAccidentParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAccident_in_ruleModel131);
            	    lv_accidents_0_0=ruleAccident();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"accidents",
            	            		lv_accidents_0_0, 
            	            		"Accident");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:98:3: ( (lv_indicents_1_0= ruleIncident ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:99:1: (lv_indicents_1_0= ruleIncident )
            	    {
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:99:1: (lv_indicents_1_0= ruleIncident )
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:100:3: lv_indicents_1_0= ruleIncident
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getIndicentsIncidentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIncident_in_ruleModel153);
            	    lv_indicents_1_0=ruleIncident();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"indicents",
            	            		lv_indicents_1_0, 
            	            		"Incident");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAccident"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:124:1: entryRuleAccident returns [EObject current=null] : iv_ruleAccident= ruleAccident EOF ;
    public final EObject entryRuleAccident() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccident = null;


        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:125:2: (iv_ruleAccident= ruleAccident EOF )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:126:2: iv_ruleAccident= ruleAccident EOF
            {
             newCompositeNode(grammarAccess.getAccidentRule()); 
            pushFollow(FOLLOW_ruleAccident_in_entryRuleAccident190);
            iv_ruleAccident=ruleAccident();

            state._fsp--;

             current =iv_ruleAccident; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccident200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccident"


    // $ANTLR start "ruleAccident"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:133:1: ruleAccident returns [EObject current=null] : (otherlv_0= 'Accident' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ranking_3_0= ruleRanking ) ) ( (lv_hazards_4_0= ruleHazard ) )+ ( (lv_notes_5_0= ruleNote ) )* otherlv_6= '}' ) ;
    public final EObject ruleAccident() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_desc_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_ranking_3_0 = null;

        EObject lv_hazards_4_0 = null;

        EObject lv_notes_5_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:136:28: ( (otherlv_0= 'Accident' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ranking_3_0= ruleRanking ) ) ( (lv_hazards_4_0= ruleHazard ) )+ ( (lv_notes_5_0= ruleNote ) )* otherlv_6= '}' ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:137:1: (otherlv_0= 'Accident' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ranking_3_0= ruleRanking ) ) ( (lv_hazards_4_0= ruleHazard ) )+ ( (lv_notes_5_0= ruleNote ) )* otherlv_6= '}' )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:137:1: (otherlv_0= 'Accident' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ranking_3_0= ruleRanking ) ) ( (lv_hazards_4_0= ruleHazard ) )+ ( (lv_notes_5_0= ruleNote ) )* otherlv_6= '}' )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:137:3: otherlv_0= 'Accident' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ranking_3_0= ruleRanking ) ) ( (lv_hazards_4_0= ruleHazard ) )+ ( (lv_notes_5_0= ruleNote ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAccident237); 

                	newLeafNode(otherlv_0, grammarAccess.getAccidentAccess().getAccidentKeyword_0());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:141:1: ( (lv_desc_1_0= RULE_STRING ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:142:1: (lv_desc_1_0= RULE_STRING )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:142:1: (lv_desc_1_0= RULE_STRING )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:143:3: lv_desc_1_0= RULE_STRING
            {
            lv_desc_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAccident254); 

            			newLeafNode(lv_desc_1_0, grammarAccess.getAccidentAccess().getDescSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAccidentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"desc",
                    		lv_desc_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAccident271); 

                	newLeafNode(otherlv_2, grammarAccess.getAccidentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:163:1: ( (lv_ranking_3_0= ruleRanking ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:164:1: (lv_ranking_3_0= ruleRanking )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:164:1: (lv_ranking_3_0= ruleRanking )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:165:3: lv_ranking_3_0= ruleRanking
            {
             
            	        newCompositeNode(grammarAccess.getAccidentAccess().getRankingRankingParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRanking_in_ruleAccident292);
            lv_ranking_3_0=ruleRanking();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAccidentRule());
            	        }
                   		set(
                   			current, 
                   			"ranking",
                    		lv_ranking_3_0, 
                    		"Ranking");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:181:2: ( (lv_hazards_4_0= ruleHazard ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:182:1: (lv_hazards_4_0= ruleHazard )
            	    {
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:182:1: (lv_hazards_4_0= ruleHazard )
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:183:3: lv_hazards_4_0= ruleHazard
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAccidentAccess().getHazardsHazardParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHazard_in_ruleAccident313);
            	    lv_hazards_4_0=ruleHazard();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAccidentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"hazards",
            	            		lv_hazards_4_0, 
            	            		"Hazard");
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

            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:199:3: ( (lv_notes_5_0= ruleNote ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==29) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:200:1: (lv_notes_5_0= ruleNote )
            	    {
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:200:1: (lv_notes_5_0= ruleNote )
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:201:3: lv_notes_5_0= ruleNote
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAccidentAccess().getNotesNoteParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNote_in_ruleAccident335);
            	    lv_notes_5_0=ruleNote();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAccidentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"notes",
            	            		lv_notes_5_0, 
            	            		"Note");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleAccident348); 

                	newLeafNode(otherlv_6, grammarAccess.getAccidentAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleAccident"


    // $ANTLR start "entryRuleIncident"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:229:1: entryRuleIncident returns [EObject current=null] : iv_ruleIncident= ruleIncident EOF ;
    public final EObject entryRuleIncident() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncident = null;


        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:230:2: (iv_ruleIncident= ruleIncident EOF )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:231:2: iv_ruleIncident= ruleIncident EOF
            {
             newCompositeNode(grammarAccess.getIncidentRule()); 
            pushFollow(FOLLOW_ruleIncident_in_entryRuleIncident384);
            iv_ruleIncident=ruleIncident();

            state._fsp--;

             current =iv_ruleIncident; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncident394); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIncident"


    // $ANTLR start "ruleIncident"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:238:1: ruleIncident returns [EObject current=null] : (otherlv_0= 'Incident' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ranking_3_0= ruleRanking ) ) ( (lv_hazards_4_0= ruleHazard ) )+ ( (lv_notes_5_0= ruleNote ) )* otherlv_6= '}' ) ;
    public final EObject ruleIncident() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_desc_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_ranking_3_0 = null;

        EObject lv_hazards_4_0 = null;

        EObject lv_notes_5_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:241:28: ( (otherlv_0= 'Incident' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ranking_3_0= ruleRanking ) ) ( (lv_hazards_4_0= ruleHazard ) )+ ( (lv_notes_5_0= ruleNote ) )* otherlv_6= '}' ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:242:1: (otherlv_0= 'Incident' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ranking_3_0= ruleRanking ) ) ( (lv_hazards_4_0= ruleHazard ) )+ ( (lv_notes_5_0= ruleNote ) )* otherlv_6= '}' )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:242:1: (otherlv_0= 'Incident' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ranking_3_0= ruleRanking ) ) ( (lv_hazards_4_0= ruleHazard ) )+ ( (lv_notes_5_0= ruleNote ) )* otherlv_6= '}' )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:242:3: otherlv_0= 'Incident' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_ranking_3_0= ruleRanking ) ) ( (lv_hazards_4_0= ruleHazard ) )+ ( (lv_notes_5_0= ruleNote ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleIncident431); 

                	newLeafNode(otherlv_0, grammarAccess.getIncidentAccess().getIncidentKeyword_0());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:246:1: ( (lv_desc_1_0= RULE_STRING ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:247:1: (lv_desc_1_0= RULE_STRING )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:247:1: (lv_desc_1_0= RULE_STRING )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:248:3: lv_desc_1_0= RULE_STRING
            {
            lv_desc_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIncident448); 

            			newLeafNode(lv_desc_1_0, grammarAccess.getIncidentAccess().getDescSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIncidentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"desc",
                    		lv_desc_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleIncident465); 

                	newLeafNode(otherlv_2, grammarAccess.getIncidentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:268:1: ( (lv_ranking_3_0= ruleRanking ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:269:1: (lv_ranking_3_0= ruleRanking )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:269:1: (lv_ranking_3_0= ruleRanking )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:270:3: lv_ranking_3_0= ruleRanking
            {
             
            	        newCompositeNode(grammarAccess.getIncidentAccess().getRankingRankingParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRanking_in_ruleIncident486);
            lv_ranking_3_0=ruleRanking();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIncidentRule());
            	        }
                   		set(
                   			current, 
                   			"ranking",
                    		lv_ranking_3_0, 
                    		"Ranking");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:286:2: ( (lv_hazards_4_0= ruleHazard ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:287:1: (lv_hazards_4_0= ruleHazard )
            	    {
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:287:1: (lv_hazards_4_0= ruleHazard )
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:288:3: lv_hazards_4_0= ruleHazard
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIncidentAccess().getHazardsHazardParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHazard_in_ruleIncident507);
            	    lv_hazards_4_0=ruleHazard();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIncidentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"hazards",
            	            		lv_hazards_4_0, 
            	            		"Hazard");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:304:3: ( (lv_notes_5_0= ruleNote ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:305:1: (lv_notes_5_0= ruleNote )
            	    {
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:305:1: (lv_notes_5_0= ruleNote )
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:306:3: lv_notes_5_0= ruleNote
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIncidentAccess().getNotesNoteParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNote_in_ruleIncident529);
            	    lv_notes_5_0=ruleNote();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIncidentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"notes",
            	            		lv_notes_5_0, 
            	            		"Note");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleIncident542); 

                	newLeafNode(otherlv_6, grammarAccess.getIncidentAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleIncident"


    // $ANTLR start "entryRuleRanking"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:334:1: entryRuleRanking returns [String current=null] : iv_ruleRanking= ruleRanking EOF ;
    public final String entryRuleRanking() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRanking = null;


        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:335:2: (iv_ruleRanking= ruleRanking EOF )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:336:2: iv_ruleRanking= ruleRanking EOF
            {
             newCompositeNode(grammarAccess.getRankingRule()); 
            pushFollow(FOLLOW_ruleRanking_in_entryRuleRanking579);
            iv_ruleRanking=ruleRanking();

            state._fsp--;

             current =iv_ruleRanking.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRanking590); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRanking"


    // $ANTLR start "ruleRanking"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:343:1: ruleRanking returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'Severity' this_ID_1= RULE_ID ) | (kw= 'Priority' this_ID_3= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleRanking() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:346:28: ( ( (kw= 'Severity' this_ID_1= RULE_ID ) | (kw= 'Priority' this_ID_3= RULE_ID ) ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:347:1: ( (kw= 'Severity' this_ID_1= RULE_ID ) | (kw= 'Priority' this_ID_3= RULE_ID ) )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:347:1: ( (kw= 'Severity' this_ID_1= RULE_ID ) | (kw= 'Priority' this_ID_3= RULE_ID ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:347:2: (kw= 'Severity' this_ID_1= RULE_ID )
                    {
                    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:347:2: (kw= 'Severity' this_ID_1= RULE_ID )
                    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:348:2: kw= 'Severity' this_ID_1= RULE_ID
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleRanking629); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRankingAccess().getSeverityKeyword_0_0()); 
                        
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRanking644); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getRankingAccess().getIDTerminalRuleCall_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:361:6: (kw= 'Priority' this_ID_3= RULE_ID )
                    {
                    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:361:6: (kw= 'Priority' this_ID_3= RULE_ID )
                    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:362:2: kw= 'Priority' this_ID_3= RULE_ID
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleRanking670); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRankingAccess().getPriorityKeyword_1_0()); 
                        
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRanking685); 

                    		current.merge(this_ID_3);
                        
                     
                        newLeafNode(this_ID_3, grammarAccess.getRankingAccess().getIDTerminalRuleCall_1_1()); 
                        

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
    // $ANTLR end "ruleRanking"


    // $ANTLR start "entryRuleHazard"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:382:1: entryRuleHazard returns [EObject current=null] : iv_ruleHazard= ruleHazard EOF ;
    public final EObject entryRuleHazard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHazard = null;


        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:383:2: (iv_ruleHazard= ruleHazard EOF )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:384:2: iv_ruleHazard= ruleHazard EOF
            {
             newCompositeNode(grammarAccess.getHazardRule()); 
            pushFollow(FOLLOW_ruleHazard_in_entryRuleHazard731);
            iv_ruleHazard=ruleHazard();

            state._fsp--;

             current =iv_ruleHazard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHazard741); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHazard"


    // $ANTLR start "ruleHazard"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:391:1: ruleHazard returns [EObject current=null] : (otherlv_0= 'Hazard' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_level_3_0= ruleHazardLevel ) ) ( (lv_risk_4_0= ruleRiskLevel ) ) ( (lv_constraints_5_0= ruleConstraint ) )+ otherlv_6= '}' ) ;
    public final EObject ruleHazard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_desc_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_level_3_0 = null;

        EObject lv_risk_4_0 = null;

        EObject lv_constraints_5_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:394:28: ( (otherlv_0= 'Hazard' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_level_3_0= ruleHazardLevel ) ) ( (lv_risk_4_0= ruleRiskLevel ) ) ( (lv_constraints_5_0= ruleConstraint ) )+ otherlv_6= '}' ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:395:1: (otherlv_0= 'Hazard' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_level_3_0= ruleHazardLevel ) ) ( (lv_risk_4_0= ruleRiskLevel ) ) ( (lv_constraints_5_0= ruleConstraint ) )+ otherlv_6= '}' )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:395:1: (otherlv_0= 'Hazard' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_level_3_0= ruleHazardLevel ) ) ( (lv_risk_4_0= ruleRiskLevel ) ) ( (lv_constraints_5_0= ruleConstraint ) )+ otherlv_6= '}' )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:395:3: otherlv_0= 'Hazard' ( (lv_desc_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_level_3_0= ruleHazardLevel ) ) ( (lv_risk_4_0= ruleRiskLevel ) ) ( (lv_constraints_5_0= ruleConstraint ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleHazard778); 

                	newLeafNode(otherlv_0, grammarAccess.getHazardAccess().getHazardKeyword_0());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:399:1: ( (lv_desc_1_0= RULE_STRING ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:400:1: (lv_desc_1_0= RULE_STRING )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:400:1: (lv_desc_1_0= RULE_STRING )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:401:3: lv_desc_1_0= RULE_STRING
            {
            lv_desc_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHazard795); 

            			newLeafNode(lv_desc_1_0, grammarAccess.getHazardAccess().getDescSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHazardRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"desc",
                    		lv_desc_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleHazard812); 

                	newLeafNode(otherlv_2, grammarAccess.getHazardAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:421:1: ( (lv_level_3_0= ruleHazardLevel ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:422:1: (lv_level_3_0= ruleHazardLevel )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:422:1: (lv_level_3_0= ruleHazardLevel )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:423:3: lv_level_3_0= ruleHazardLevel
            {
             
            	        newCompositeNode(grammarAccess.getHazardAccess().getLevelHazardLevelParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleHazardLevel_in_ruleHazard833);
            lv_level_3_0=ruleHazardLevel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHazardRule());
            	        }
                   		set(
                   			current, 
                   			"level",
                    		lv_level_3_0, 
                    		"HazardLevel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:439:2: ( (lv_risk_4_0= ruleRiskLevel ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:440:1: (lv_risk_4_0= ruleRiskLevel )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:440:1: (lv_risk_4_0= ruleRiskLevel )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:441:3: lv_risk_4_0= ruleRiskLevel
            {
             
            	        newCompositeNode(grammarAccess.getHazardAccess().getRiskRiskLevelParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleRiskLevel_in_ruleHazard854);
            lv_risk_4_0=ruleRiskLevel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHazardRule());
            	        }
                   		set(
                   			current, 
                   			"risk",
                    		lv_risk_4_0, 
                    		"RiskLevel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:457:2: ( (lv_constraints_5_0= ruleConstraint ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:458:1: (lv_constraints_5_0= ruleConstraint )
            	    {
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:458:1: (lv_constraints_5_0= ruleConstraint )
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:459:3: lv_constraints_5_0= ruleConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHazardAccess().getConstraintsConstraintParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraint_in_ruleHazard875);
            	    lv_constraints_5_0=ruleConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHazardRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraints",
            	            		lv_constraints_5_0, 
            	            		"Constraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleHazard888); 

                	newLeafNode(otherlv_6, grammarAccess.getHazardAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleHazard"


    // $ANTLR start "entryRuleRiskLevel"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:487:1: entryRuleRiskLevel returns [EObject current=null] : iv_ruleRiskLevel= ruleRiskLevel EOF ;
    public final EObject entryRuleRiskLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRiskLevel = null;


        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:488:2: (iv_ruleRiskLevel= ruleRiskLevel EOF )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:489:2: iv_ruleRiskLevel= ruleRiskLevel EOF
            {
             newCompositeNode(grammarAccess.getRiskLevelRule()); 
            pushFollow(FOLLOW_ruleRiskLevel_in_entryRuleRiskLevel924);
            iv_ruleRiskLevel=ruleRiskLevel();

            state._fsp--;

             current =iv_ruleRiskLevel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRiskLevel934); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRiskLevel"


    // $ANTLR start "ruleRiskLevel"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:496:1: ruleRiskLevel returns [EObject current=null] : (otherlv_0= 'Risk' otherlv_1= '{' ( (lv_exposure_2_0= ruleHazardExposure ) ) ( (lv_likelihood_3_0= ruleHazardAccidentLikelihood ) ) otherlv_4= '}' ) ;
    public final EObject ruleRiskLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_exposure_2_0 = null;

        EObject lv_likelihood_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:499:28: ( (otherlv_0= 'Risk' otherlv_1= '{' ( (lv_exposure_2_0= ruleHazardExposure ) ) ( (lv_likelihood_3_0= ruleHazardAccidentLikelihood ) ) otherlv_4= '}' ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:500:1: (otherlv_0= 'Risk' otherlv_1= '{' ( (lv_exposure_2_0= ruleHazardExposure ) ) ( (lv_likelihood_3_0= ruleHazardAccidentLikelihood ) ) otherlv_4= '}' )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:500:1: (otherlv_0= 'Risk' otherlv_1= '{' ( (lv_exposure_2_0= ruleHazardExposure ) ) ( (lv_likelihood_3_0= ruleHazardAccidentLikelihood ) ) otherlv_4= '}' )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:500:3: otherlv_0= 'Risk' otherlv_1= '{' ( (lv_exposure_2_0= ruleHazardExposure ) ) ( (lv_likelihood_3_0= ruleHazardAccidentLikelihood ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleRiskLevel971); 

                	newLeafNode(otherlv_0, grammarAccess.getRiskLevelAccess().getRiskKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleRiskLevel983); 

                	newLeafNode(otherlv_1, grammarAccess.getRiskLevelAccess().getLeftCurlyBracketKeyword_1());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:508:1: ( (lv_exposure_2_0= ruleHazardExposure ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:509:1: (lv_exposure_2_0= ruleHazardExposure )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:509:1: (lv_exposure_2_0= ruleHazardExposure )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:510:3: lv_exposure_2_0= ruleHazardExposure
            {
             
            	        newCompositeNode(grammarAccess.getRiskLevelAccess().getExposureHazardExposureParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleHazardExposure_in_ruleRiskLevel1004);
            lv_exposure_2_0=ruleHazardExposure();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRiskLevelRule());
            	        }
                   		set(
                   			current, 
                   			"exposure",
                    		lv_exposure_2_0, 
                    		"HazardExposure");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:526:2: ( (lv_likelihood_3_0= ruleHazardAccidentLikelihood ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:527:1: (lv_likelihood_3_0= ruleHazardAccidentLikelihood )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:527:1: (lv_likelihood_3_0= ruleHazardAccidentLikelihood )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:528:3: lv_likelihood_3_0= ruleHazardAccidentLikelihood
            {
             
            	        newCompositeNode(grammarAccess.getRiskLevelAccess().getLikelihoodHazardAccidentLikelihoodParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleHazardAccidentLikelihood_in_ruleRiskLevel1025);
            lv_likelihood_3_0=ruleHazardAccidentLikelihood();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRiskLevelRule());
            	        }
                   		set(
                   			current, 
                   			"likelihood",
                    		lv_likelihood_3_0, 
                    		"HazardAccidentLikelihood");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleRiskLevel1037); 

                	newLeafNode(otherlv_4, grammarAccess.getRiskLevelAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleRiskLevel"


    // $ANTLR start "entryRuleHazardLevel"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:556:1: entryRuleHazardLevel returns [EObject current=null] : iv_ruleHazardLevel= ruleHazardLevel EOF ;
    public final EObject entryRuleHazardLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHazardLevel = null;


        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:557:2: (iv_ruleHazardLevel= ruleHazardLevel EOF )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:558:2: iv_ruleHazardLevel= ruleHazardLevel EOF
            {
             newCompositeNode(grammarAccess.getHazardLevelRule()); 
            pushFollow(FOLLOW_ruleHazardLevel_in_entryRuleHazardLevel1073);
            iv_ruleHazardLevel=ruleHazardLevel();

            state._fsp--;

             current =iv_ruleHazardLevel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHazardLevel1083); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHazardLevel"


    // $ANTLR start "ruleHazardLevel"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:565:1: ruleHazardLevel returns [EObject current=null] : (otherlv_0= 'Severity' ( (lv_severity_1_0= ruleHazardSeverity ) ) otherlv_2= 'Likelihood' ( (lv_likelihood_3_0= ruleHazardLikelihood ) ) ) ;
    public final EObject ruleHazardLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_severity_1_0 = null;

        EObject lv_likelihood_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:568:28: ( (otherlv_0= 'Severity' ( (lv_severity_1_0= ruleHazardSeverity ) ) otherlv_2= 'Likelihood' ( (lv_likelihood_3_0= ruleHazardLikelihood ) ) ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:569:1: (otherlv_0= 'Severity' ( (lv_severity_1_0= ruleHazardSeverity ) ) otherlv_2= 'Likelihood' ( (lv_likelihood_3_0= ruleHazardLikelihood ) ) )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:569:1: (otherlv_0= 'Severity' ( (lv_severity_1_0= ruleHazardSeverity ) ) otherlv_2= 'Likelihood' ( (lv_likelihood_3_0= ruleHazardLikelihood ) ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:569:3: otherlv_0= 'Severity' ( (lv_severity_1_0= ruleHazardSeverity ) ) otherlv_2= 'Likelihood' ( (lv_likelihood_3_0= ruleHazardLikelihood ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleHazardLevel1120); 

                	newLeafNode(otherlv_0, grammarAccess.getHazardLevelAccess().getSeverityKeyword_0());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:573:1: ( (lv_severity_1_0= ruleHazardSeverity ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:574:1: (lv_severity_1_0= ruleHazardSeverity )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:574:1: (lv_severity_1_0= ruleHazardSeverity )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:575:3: lv_severity_1_0= ruleHazardSeverity
            {
             
            	        newCompositeNode(grammarAccess.getHazardLevelAccess().getSeverityHazardSeverityParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleHazardSeverity_in_ruleHazardLevel1141);
            lv_severity_1_0=ruleHazardSeverity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHazardLevelRule());
            	        }
                   		set(
                   			current, 
                   			"severity",
                    		lv_severity_1_0, 
                    		"HazardSeverity");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleHazardLevel1153); 

                	newLeafNode(otherlv_2, grammarAccess.getHazardLevelAccess().getLikelihoodKeyword_2());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:595:1: ( (lv_likelihood_3_0= ruleHazardLikelihood ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:596:1: (lv_likelihood_3_0= ruleHazardLikelihood )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:596:1: (lv_likelihood_3_0= ruleHazardLikelihood )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:597:3: lv_likelihood_3_0= ruleHazardLikelihood
            {
             
            	        newCompositeNode(grammarAccess.getHazardLevelAccess().getLikelihoodHazardLikelihoodParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleHazardLikelihood_in_ruleHazardLevel1174);
            lv_likelihood_3_0=ruleHazardLikelihood();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHazardLevelRule());
            	        }
                   		set(
                   			current, 
                   			"likelihood",
                    		lv_likelihood_3_0, 
                    		"HazardLikelihood");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleHazardLevel"


    // $ANTLR start "entryRuleHazardExposure"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:621:1: entryRuleHazardExposure returns [EObject current=null] : iv_ruleHazardExposure= ruleHazardExposure EOF ;
    public final EObject entryRuleHazardExposure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHazardExposure = null;


        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:622:2: (iv_ruleHazardExposure= ruleHazardExposure EOF )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:623:2: iv_ruleHazardExposure= ruleHazardExposure EOF
            {
             newCompositeNode(grammarAccess.getHazardExposureRule()); 
            pushFollow(FOLLOW_ruleHazardExposure_in_entryRuleHazardExposure1210);
            iv_ruleHazardExposure=ruleHazardExposure();

            state._fsp--;

             current =iv_ruleHazardExposure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHazardExposure1220); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHazardExposure"


    // $ANTLR start "ruleHazardExposure"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:630:1: ruleHazardExposure returns [EObject current=null] : (otherlv_0= 'Exposure' ( (lv_exposure_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleHazardExposure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_exposure_1_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:633:28: ( (otherlv_0= 'Exposure' ( (lv_exposure_1_0= RULE_STRING ) ) ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:634:1: (otherlv_0= 'Exposure' ( (lv_exposure_1_0= RULE_STRING ) ) )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:634:1: (otherlv_0= 'Exposure' ( (lv_exposure_1_0= RULE_STRING ) ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:634:3: otherlv_0= 'Exposure' ( (lv_exposure_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleHazardExposure1257); 

                	newLeafNode(otherlv_0, grammarAccess.getHazardExposureAccess().getExposureKeyword_0());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:638:1: ( (lv_exposure_1_0= RULE_STRING ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:639:1: (lv_exposure_1_0= RULE_STRING )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:639:1: (lv_exposure_1_0= RULE_STRING )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:640:3: lv_exposure_1_0= RULE_STRING
            {
            lv_exposure_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHazardExposure1274); 

            			newLeafNode(lv_exposure_1_0, grammarAccess.getHazardExposureAccess().getExposureSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHazardExposureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"exposure",
                    		lv_exposure_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleHazardExposure"


    // $ANTLR start "entryRuleHazardAccidentLikelihood"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:664:1: entryRuleHazardAccidentLikelihood returns [EObject current=null] : iv_ruleHazardAccidentLikelihood= ruleHazardAccidentLikelihood EOF ;
    public final EObject entryRuleHazardAccidentLikelihood() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHazardAccidentLikelihood = null;


        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:665:2: (iv_ruleHazardAccidentLikelihood= ruleHazardAccidentLikelihood EOF )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:666:2: iv_ruleHazardAccidentLikelihood= ruleHazardAccidentLikelihood EOF
            {
             newCompositeNode(grammarAccess.getHazardAccidentLikelihoodRule()); 
            pushFollow(FOLLOW_ruleHazardAccidentLikelihood_in_entryRuleHazardAccidentLikelihood1315);
            iv_ruleHazardAccidentLikelihood=ruleHazardAccidentLikelihood();

            state._fsp--;

             current =iv_ruleHazardAccidentLikelihood; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHazardAccidentLikelihood1325); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHazardAccidentLikelihood"


    // $ANTLR start "ruleHazardAccidentLikelihood"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:673:1: ruleHazardAccidentLikelihood returns [EObject current=null] : (otherlv_0= 'Likelihood' ( (lv_likelihood_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleHazardAccidentLikelihood() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_likelihood_1_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:676:28: ( (otherlv_0= 'Likelihood' ( (lv_likelihood_1_0= RULE_STRING ) ) ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:677:1: (otherlv_0= 'Likelihood' ( (lv_likelihood_1_0= RULE_STRING ) ) )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:677:1: (otherlv_0= 'Likelihood' ( (lv_likelihood_1_0= RULE_STRING ) ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:677:3: otherlv_0= 'Likelihood' ( (lv_likelihood_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleHazardAccidentLikelihood1362); 

                	newLeafNode(otherlv_0, grammarAccess.getHazardAccidentLikelihoodAccess().getLikelihoodKeyword_0());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:681:1: ( (lv_likelihood_1_0= RULE_STRING ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:682:1: (lv_likelihood_1_0= RULE_STRING )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:682:1: (lv_likelihood_1_0= RULE_STRING )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:683:3: lv_likelihood_1_0= RULE_STRING
            {
            lv_likelihood_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHazardAccidentLikelihood1379); 

            			newLeafNode(lv_likelihood_1_0, grammarAccess.getHazardAccidentLikelihoodAccess().getLikelihoodSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHazardAccidentLikelihoodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"likelihood",
                    		lv_likelihood_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleHazardAccidentLikelihood"


    // $ANTLR start "entryRuleHazardSeverity"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:707:1: entryRuleHazardSeverity returns [EObject current=null] : iv_ruleHazardSeverity= ruleHazardSeverity EOF ;
    public final EObject entryRuleHazardSeverity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHazardSeverity = null;


        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:708:2: (iv_ruleHazardSeverity= ruleHazardSeverity EOF )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:709:2: iv_ruleHazardSeverity= ruleHazardSeverity EOF
            {
             newCompositeNode(grammarAccess.getHazardSeverityRule()); 
            pushFollow(FOLLOW_ruleHazardSeverity_in_entryRuleHazardSeverity1420);
            iv_ruleHazardSeverity=ruleHazardSeverity();

            state._fsp--;

             current =iv_ruleHazardSeverity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHazardSeverity1430); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHazardSeverity"


    // $ANTLR start "ruleHazardSeverity"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:716:1: ruleHazardSeverity returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleHazardSeverity() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:719:28: ( ( (lv_value_0_0= RULE_ID ) ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:720:1: ( (lv_value_0_0= RULE_ID ) )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:720:1: ( (lv_value_0_0= RULE_ID ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:721:1: (lv_value_0_0= RULE_ID )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:721:1: (lv_value_0_0= RULE_ID )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:722:3: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHazardSeverity1471); 

            			newLeafNode(lv_value_0_0, grammarAccess.getHazardSeverityAccess().getValueIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHazardSeverityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleHazardSeverity"


    // $ANTLR start "entryRuleHazardLikelihood"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:746:1: entryRuleHazardLikelihood returns [EObject current=null] : iv_ruleHazardLikelihood= ruleHazardLikelihood EOF ;
    public final EObject entryRuleHazardLikelihood() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHazardLikelihood = null;


        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:747:2: (iv_ruleHazardLikelihood= ruleHazardLikelihood EOF )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:748:2: iv_ruleHazardLikelihood= ruleHazardLikelihood EOF
            {
             newCompositeNode(grammarAccess.getHazardLikelihoodRule()); 
            pushFollow(FOLLOW_ruleHazardLikelihood_in_entryRuleHazardLikelihood1511);
            iv_ruleHazardLikelihood=ruleHazardLikelihood();

            state._fsp--;

             current =iv_ruleHazardLikelihood; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHazardLikelihood1521); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHazardLikelihood"


    // $ANTLR start "ruleHazardLikelihood"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:755:1: ruleHazardLikelihood returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleHazardLikelihood() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:758:28: ( ( (lv_value_0_0= RULE_ID ) ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:759:1: ( (lv_value_0_0= RULE_ID ) )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:759:1: ( (lv_value_0_0= RULE_ID ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:760:1: (lv_value_0_0= RULE_ID )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:760:1: (lv_value_0_0= RULE_ID )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:761:3: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHazardLikelihood1562); 

            			newLeafNode(lv_value_0_0, grammarAccess.getHazardLikelihoodAccess().getValueIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHazardLikelihoodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleHazardLikelihood"


    // $ANTLR start "entryRuleConstraint"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:785:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:786:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:787:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint1602);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint1612); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:794:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'Constraint' ( (lv_constraint_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_requirements_3_0= ruleRequirement ) )* ( (lv_scenarios_4_0= ruleScenario ) )* ( (lv_controls_5_0= ruleControl ) )* ( (lv_notes_6_0= ruleNote ) )* otherlv_7= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_constraint_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_requirements_3_0 = null;

        EObject lv_scenarios_4_0 = null;

        EObject lv_controls_5_0 = null;

        EObject lv_notes_6_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:797:28: ( (otherlv_0= 'Constraint' ( (lv_constraint_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_requirements_3_0= ruleRequirement ) )* ( (lv_scenarios_4_0= ruleScenario ) )* ( (lv_controls_5_0= ruleControl ) )* ( (lv_notes_6_0= ruleNote ) )* otherlv_7= '}' ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:798:1: (otherlv_0= 'Constraint' ( (lv_constraint_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_requirements_3_0= ruleRequirement ) )* ( (lv_scenarios_4_0= ruleScenario ) )* ( (lv_controls_5_0= ruleControl ) )* ( (lv_notes_6_0= ruleNote ) )* otherlv_7= '}' )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:798:1: (otherlv_0= 'Constraint' ( (lv_constraint_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_requirements_3_0= ruleRequirement ) )* ( (lv_scenarios_4_0= ruleScenario ) )* ( (lv_controls_5_0= ruleControl ) )* ( (lv_notes_6_0= ruleNote ) )* otherlv_7= '}' )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:798:3: otherlv_0= 'Constraint' ( (lv_constraint_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_requirements_3_0= ruleRequirement ) )* ( (lv_scenarios_4_0= ruleScenario ) )* ( (lv_controls_5_0= ruleControl ) )* ( (lv_notes_6_0= ruleNote ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleConstraint1649); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:802:1: ( (lv_constraint_1_0= RULE_STRING ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:803:1: (lv_constraint_1_0= RULE_STRING )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:803:1: (lv_constraint_1_0= RULE_STRING )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:804:3: lv_constraint_1_0= RULE_STRING
            {
            lv_constraint_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint1666); 

            			newLeafNode(lv_constraint_1_0, grammarAccess.getConstraintAccess().getConstraintSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"constraint",
                    		lv_constraint_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConstraint1683); 

                	newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:824:1: ( (lv_requirements_3_0= ruleRequirement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:825:1: (lv_requirements_3_0= ruleRequirement )
            	    {
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:825:1: (lv_requirements_3_0= ruleRequirement )
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:826:3: lv_requirements_3_0= ruleRequirement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstraintAccess().getRequirementsRequirementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequirement_in_ruleConstraint1704);
            	    lv_requirements_3_0=ruleRequirement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"requirements",
            	            		lv_requirements_3_0, 
            	            		"Requirement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:842:3: ( (lv_scenarios_4_0= ruleScenario ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:843:1: (lv_scenarios_4_0= ruleScenario )
            	    {
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:843:1: (lv_scenarios_4_0= ruleScenario )
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:844:3: lv_scenarios_4_0= ruleScenario
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstraintAccess().getScenariosScenarioParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScenario_in_ruleConstraint1726);
            	    lv_scenarios_4_0=ruleScenario();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"scenarios",
            	            		lv_scenarios_4_0, 
            	            		"Scenario");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:860:3: ( (lv_controls_5_0= ruleControl ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:861:1: (lv_controls_5_0= ruleControl )
            	    {
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:861:1: (lv_controls_5_0= ruleControl )
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:862:3: lv_controls_5_0= ruleControl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstraintAccess().getControlsControlParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleControl_in_ruleConstraint1748);
            	    lv_controls_5_0=ruleControl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"controls",
            	            		lv_controls_5_0, 
            	            		"Control");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:878:3: ( (lv_notes_6_0= ruleNote ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:879:1: (lv_notes_6_0= ruleNote )
            	    {
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:879:1: (lv_notes_6_0= ruleNote )
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:880:3: lv_notes_6_0= ruleNote
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstraintAccess().getNotesNoteParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNote_in_ruleConstraint1770);
            	    lv_notes_6_0=ruleNote();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"notes",
            	            		lv_notes_6_0, 
            	            		"Note");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleConstraint1783); 

                	newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleRequirement"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:908:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:909:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:910:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement1819);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement1829); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:917:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'Requirement' ( (lv_requirement_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_designs_3_0= ruleDesign ) )* ( (lv_notes_4_0= ruleNote ) )* otherlv_5= '}' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_requirement_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_designs_3_0 = null;

        EObject lv_notes_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:920:28: ( (otherlv_0= 'Requirement' ( (lv_requirement_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_designs_3_0= ruleDesign ) )* ( (lv_notes_4_0= ruleNote ) )* otherlv_5= '}' ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:921:1: (otherlv_0= 'Requirement' ( (lv_requirement_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_designs_3_0= ruleDesign ) )* ( (lv_notes_4_0= ruleNote ) )* otherlv_5= '}' )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:921:1: (otherlv_0= 'Requirement' ( (lv_requirement_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_designs_3_0= ruleDesign ) )* ( (lv_notes_4_0= ruleNote ) )* otherlv_5= '}' )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:921:3: otherlv_0= 'Requirement' ( (lv_requirement_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_designs_3_0= ruleDesign ) )* ( (lv_notes_4_0= ruleNote ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleRequirement1866); 

                	newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:925:1: ( (lv_requirement_1_0= RULE_STRING ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:926:1: (lv_requirement_1_0= RULE_STRING )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:926:1: (lv_requirement_1_0= RULE_STRING )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:927:3: lv_requirement_1_0= RULE_STRING
            {
            lv_requirement_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRequirement1883); 

            			newLeafNode(lv_requirement_1_0, grammarAccess.getRequirementAccess().getRequirementSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequirementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"requirement",
                    		lv_requirement_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRequirement1900); 

                	newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:947:1: ( (lv_designs_3_0= ruleDesign ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:948:1: (lv_designs_3_0= ruleDesign )
            	    {
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:948:1: (lv_designs_3_0= ruleDesign )
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:949:3: lv_designs_3_0= ruleDesign
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDesignsDesignParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDesign_in_ruleRequirement1921);
            	    lv_designs_3_0=ruleDesign();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"designs",
            	            		lv_designs_3_0, 
            	            		"Design");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:965:3: ( (lv_notes_4_0= ruleNote ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:966:1: (lv_notes_4_0= ruleNote )
            	    {
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:966:1: (lv_notes_4_0= ruleNote )
            	    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:967:3: lv_notes_4_0= ruleNote
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getNotesNoteParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNote_in_ruleRequirement1943);
            	    lv_notes_4_0=ruleNote();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"notes",
            	            		lv_notes_4_0, 
            	            		"Note");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleRequirement1956); 

                	newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleDesign"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:995:1: entryRuleDesign returns [EObject current=null] : iv_ruleDesign= ruleDesign EOF ;
    public final EObject entryRuleDesign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesign = null;


        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:996:2: (iv_ruleDesign= ruleDesign EOF )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:997:2: iv_ruleDesign= ruleDesign EOF
            {
             newCompositeNode(grammarAccess.getDesignRule()); 
            pushFollow(FOLLOW_ruleDesign_in_entryRuleDesign1992);
            iv_ruleDesign=ruleDesign();

            state._fsp--;

             current =iv_ruleDesign; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDesign2002); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDesign"


    // $ANTLR start "ruleDesign"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1004:1: ruleDesign returns [EObject current=null] : (otherlv_0= 'Allocation' ( (lv_allocation_1_0= RULE_STRING ) ) (otherlv_2= 'Analysis' ( (lv_analysis_3_0= RULE_STRING ) ) )? (otherlv_4= 'Rationale' ( (lv_rationale_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleDesign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_allocation_1_0=null;
        Token otherlv_2=null;
        Token lv_analysis_3_0=null;
        Token otherlv_4=null;
        Token lv_rationale_5_0=null;

         enterRule(); 
            
        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1007:28: ( (otherlv_0= 'Allocation' ( (lv_allocation_1_0= RULE_STRING ) ) (otherlv_2= 'Analysis' ( (lv_analysis_3_0= RULE_STRING ) ) )? (otherlv_4= 'Rationale' ( (lv_rationale_5_0= RULE_STRING ) ) )? ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1008:1: (otherlv_0= 'Allocation' ( (lv_allocation_1_0= RULE_STRING ) ) (otherlv_2= 'Analysis' ( (lv_analysis_3_0= RULE_STRING ) ) )? (otherlv_4= 'Rationale' ( (lv_rationale_5_0= RULE_STRING ) ) )? )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1008:1: (otherlv_0= 'Allocation' ( (lv_allocation_1_0= RULE_STRING ) ) (otherlv_2= 'Analysis' ( (lv_analysis_3_0= RULE_STRING ) ) )? (otherlv_4= 'Rationale' ( (lv_rationale_5_0= RULE_STRING ) ) )? )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1008:3: otherlv_0= 'Allocation' ( (lv_allocation_1_0= RULE_STRING ) ) (otherlv_2= 'Analysis' ( (lv_analysis_3_0= RULE_STRING ) ) )? (otherlv_4= 'Rationale' ( (lv_rationale_5_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleDesign2039); 

                	newLeafNode(otherlv_0, grammarAccess.getDesignAccess().getAllocationKeyword_0());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1012:1: ( (lv_allocation_1_0= RULE_STRING ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1013:1: (lv_allocation_1_0= RULE_STRING )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1013:1: (lv_allocation_1_0= RULE_STRING )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1014:3: lv_allocation_1_0= RULE_STRING
            {
            lv_allocation_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDesign2056); 

            			newLeafNode(lv_allocation_1_0, grammarAccess.getDesignAccess().getAllocationSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDesignRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"allocation",
                    		lv_allocation_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1030:2: (otherlv_2= 'Analysis' ( (lv_analysis_3_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1030:4: otherlv_2= 'Analysis' ( (lv_analysis_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleDesign2074); 

                        	newLeafNode(otherlv_2, grammarAccess.getDesignAccess().getAnalysisKeyword_2_0());
                        
                    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1034:1: ( (lv_analysis_3_0= RULE_STRING ) )
                    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1035:1: (lv_analysis_3_0= RULE_STRING )
                    {
                    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1035:1: (lv_analysis_3_0= RULE_STRING )
                    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1036:3: lv_analysis_3_0= RULE_STRING
                    {
                    lv_analysis_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDesign2091); 

                    			newLeafNode(lv_analysis_3_0, grammarAccess.getDesignAccess().getAnalysisSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDesignRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"analysis",
                            		lv_analysis_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1052:4: (otherlv_4= 'Rationale' ( (lv_rationale_5_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1052:6: otherlv_4= 'Rationale' ( (lv_rationale_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleDesign2111); 

                        	newLeafNode(otherlv_4, grammarAccess.getDesignAccess().getRationaleKeyword_3_0());
                        
                    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1056:1: ( (lv_rationale_5_0= RULE_STRING ) )
                    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1057:1: (lv_rationale_5_0= RULE_STRING )
                    {
                    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1057:1: (lv_rationale_5_0= RULE_STRING )
                    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1058:3: lv_rationale_5_0= RULE_STRING
                    {
                    lv_rationale_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDesign2128); 

                    			newLeafNode(lv_rationale_5_0, grammarAccess.getDesignAccess().getRationaleSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDesignRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rationale",
                            		lv_rationale_5_0, 
                            		"STRING");
                    	    

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
    // $ANTLR end "ruleDesign"


    // $ANTLR start "entryRuleScenario"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1082:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1083:2: (iv_ruleScenario= ruleScenario EOF )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1084:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario2171);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario2181); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1091:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'Scenario' ( (lv_scenario_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_scenario_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1094:28: ( (otherlv_0= 'Scenario' ( (lv_scenario_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1095:1: (otherlv_0= 'Scenario' ( (lv_scenario_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1095:1: (otherlv_0= 'Scenario' ( (lv_scenario_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1095:3: otherlv_0= 'Scenario' ( (lv_scenario_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleScenario2218); 

                	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1099:1: ( (lv_scenario_1_0= RULE_STRING ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1100:1: (lv_scenario_1_0= RULE_STRING )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1100:1: (lv_scenario_1_0= RULE_STRING )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1101:3: lv_scenario_1_0= RULE_STRING
            {
            lv_scenario_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScenario2235); 

            			newLeafNode(lv_scenario_1_0, grammarAccess.getScenarioAccess().getScenarioSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScenarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"scenario",
                    		lv_scenario_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleScenario2252); 

                	newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleControl"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1129:1: entryRuleControl returns [EObject current=null] : iv_ruleControl= ruleControl EOF ;
    public final EObject entryRuleControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControl = null;


        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1130:2: (iv_ruleControl= ruleControl EOF )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1131:2: iv_ruleControl= ruleControl EOF
            {
             newCompositeNode(grammarAccess.getControlRule()); 
            pushFollow(FOLLOW_ruleControl_in_entryRuleControl2288);
            iv_ruleControl=ruleControl();

            state._fsp--;

             current =iv_ruleControl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleControl2298); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleControl"


    // $ANTLR start "ruleControl"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1138:1: ruleControl returns [EObject current=null] : (otherlv_0= 'Control' ( (lv_control_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleControl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_control_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1141:28: ( (otherlv_0= 'Control' ( (lv_control_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1142:1: (otherlv_0= 'Control' ( (lv_control_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1142:1: (otherlv_0= 'Control' ( (lv_control_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1142:3: otherlv_0= 'Control' ( (lv_control_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleControl2335); 

                	newLeafNode(otherlv_0, grammarAccess.getControlAccess().getControlKeyword_0());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1146:1: ( (lv_control_1_0= RULE_STRING ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1147:1: (lv_control_1_0= RULE_STRING )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1147:1: (lv_control_1_0= RULE_STRING )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1148:3: lv_control_1_0= RULE_STRING
            {
            lv_control_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleControl2352); 

            			newLeafNode(lv_control_1_0, grammarAccess.getControlAccess().getControlSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getControlRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"control",
                    		lv_control_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleControl2369); 

                	newLeafNode(otherlv_2, grammarAccess.getControlAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleControl"


    // $ANTLR start "entryRuleNote"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1176:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1177:2: (iv_ruleNote= ruleNote EOF )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1178:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote2405);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote2415); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1185:1: ruleNote returns [EObject current=null] : (otherlv_0= 'Note' ( (lv_note_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_note_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1188:28: ( (otherlv_0= 'Note' ( (lv_note_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1189:1: (otherlv_0= 'Note' ( (lv_note_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1189:1: (otherlv_0= 'Note' ( (lv_note_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1189:3: otherlv_0= 'Note' ( (lv_note_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleNote2452); 

                	newLeafNode(otherlv_0, grammarAccess.getNoteAccess().getNoteKeyword_0());
                
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1193:1: ( (lv_note_1_0= RULE_STRING ) )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1194:1: (lv_note_1_0= RULE_STRING )
            {
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1194:1: (lv_note_1_0= RULE_STRING )
            // ../net.certware.hazard.stpa/src-gen/net/certware/hazard/stpa/parser/antlr/internal/InternalHazardAnalysis.g:1195:3: lv_note_1_0= RULE_STRING
            {
            lv_note_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNote2469); 

            			newLeafNode(lv_note_1_0, grammarAccess.getNoteAccess().getNoteSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNoteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"note",
                    		lv_note_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleNote2486); 

                	newLeafNode(otherlv_2, grammarAccess.getNoteAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleNote"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccident_in_ruleModel131 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleIncident_in_ruleModel153 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleAccident_in_entryRuleAccident190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccident200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAccident237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAccident254 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAccident271 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleRanking_in_ruleAccident292 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleHazard_in_ruleAccident313 = new BitSet(new long[]{0x0000000020022000L});
    public static final BitSet FOLLOW_ruleNote_in_ruleAccident335 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_13_in_ruleAccident348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncident_in_entryRuleIncident384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncident394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleIncident431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIncident448 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleIncident465 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleRanking_in_ruleIncident486 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleHazard_in_ruleIncident507 = new BitSet(new long[]{0x0000000020022000L});
    public static final BitSet FOLLOW_ruleNote_in_ruleIncident529 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_13_in_ruleIncident542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRanking_in_entryRuleRanking579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRanking590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleRanking629 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRanking644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRanking670 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRanking685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHazard_in_entryRuleHazard731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHazard741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleHazard778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHazard795 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleHazard812 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleHazardLevel_in_ruleHazard833 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleRiskLevel_in_ruleHazard854 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleHazard875 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_13_in_ruleHazard888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRiskLevel_in_entryRuleRiskLevel924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRiskLevel934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleRiskLevel971 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRiskLevel983 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleHazardExposure_in_ruleRiskLevel1004 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleHazardAccidentLikelihood_in_ruleRiskLevel1025 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRiskLevel1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHazardLevel_in_entryRuleHazardLevel1073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHazardLevel1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleHazardLevel1120 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHazardSeverity_in_ruleHazardLevel1141 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleHazardLevel1153 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHazardLikelihood_in_ruleHazardLevel1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHazardExposure_in_entryRuleHazardExposure1210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHazardExposure1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleHazardExposure1257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHazardExposure1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHazardAccidentLikelihood_in_entryRuleHazardAccidentLikelihood1315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHazardAccidentLikelihood1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleHazardAccidentLikelihood1362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHazardAccidentLikelihood1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHazardSeverity_in_entryRuleHazardSeverity1420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHazardSeverity1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHazardSeverity1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHazardLikelihood_in_entryRuleHazardLikelihood1511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHazardLikelihood1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHazardLikelihood1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleConstraint1649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint1666 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConstraint1683 = new BitSet(new long[]{0x0000000034402000L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleConstraint1704 = new BitSet(new long[]{0x0000000034402000L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleConstraint1726 = new BitSet(new long[]{0x0000000034002000L});
    public static final BitSet FOLLOW_ruleControl_in_ruleConstraint1748 = new BitSet(new long[]{0x0000000030002000L});
    public static final BitSet FOLLOW_ruleNote_in_ruleConstraint1770 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_13_in_ruleConstraint1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement1819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRequirement1866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRequirement1883 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRequirement1900 = new BitSet(new long[]{0x0000000020802000L});
    public static final BitSet FOLLOW_ruleDesign_in_ruleRequirement1921 = new BitSet(new long[]{0x0000000020802000L});
    public static final BitSet FOLLOW_ruleNote_in_ruleRequirement1943 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_13_in_ruleRequirement1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesign_in_entryRuleDesign1992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDesign2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDesign2039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDesign2056 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24_in_ruleDesign2074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDesign2091 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleDesign2111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDesign2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario2171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleScenario2218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScenario2235 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleScenario2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleControl_in_entryRuleControl2288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleControl2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleControl2335 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleControl2352 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleControl2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote2405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleNote2452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNote2469 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleNote2486 = new BitSet(new long[]{0x0000000000000002L});

}