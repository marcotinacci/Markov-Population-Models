package imt.simhya.language.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import imt.simhya.language.services.MarkovPopulationModelsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMarkovPopulationModelsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'agent'", "'{'", "'actions'", "'}'", "'state'", "'-->'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_FLOAT=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators


        public InternalMarkovPopulationModelsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMarkovPopulationModelsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMarkovPopulationModelsParser.tokenNames; }
    public String getGrammarFileName() { return "../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g"; }



     	private MarkovPopulationModelsGrammarAccess grammarAccess;
     	
        public InternalMarkovPopulationModelsParser(TokenStream input, MarkovPopulationModelsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "agent";	
       	}
       	
       	@Override
       	protected MarkovPopulationModelsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleagent"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:67:1: entryRuleagent returns [EObject current=null] : iv_ruleagent= ruleagent EOF ;
    public final EObject entryRuleagent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleagent = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:68:2: (iv_ruleagent= ruleagent EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:69:2: iv_ruleagent= ruleagent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_ruleagent_in_entryRuleagent75);
            iv_ruleagent=ruleagent();

            state._fsp--;

             current =iv_ruleagent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleagent85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleagent"


    // $ANTLR start "ruleagent"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:76:1: ruleagent returns [EObject current=null] : (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}' ) ;
    public final EObject ruleagent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_act_4_0 = null;

        EObject lv_s_5_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:79:28: ( (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}' ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:80:1: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}' )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:80:1: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}' )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:80:3: otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleagent122); 

                	newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:85:1: (lv_name_1_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleagent139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAgentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleagent156); 

                	newLeafNode(otherlv_2, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleagent168); 

                	newLeafNode(otherlv_3, grammarAccess.getAgentAccess().getActionsKeyword_3());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:110:1: ( (lv_act_4_0= rulelabel ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:111:1: (lv_act_4_0= rulelabel )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:111:1: (lv_act_4_0= rulelabel )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:112:3: lv_act_4_0= rulelabel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAgentAccess().getActLabelParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulelabel_in_ruleagent189);
            	    lv_act_4_0=rulelabel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAgentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"act",
            	            		lv_act_4_0, 
            	            		"label");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:128:3: ( (lv_s_5_0= rulestate ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:129:1: (lv_s_5_0= rulestate )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:129:1: (lv_s_5_0= rulestate )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:130:3: lv_s_5_0= rulestate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAgentAccess().getSStateParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulestate_in_ruleagent211);
            	    lv_s_5_0=rulestate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAgentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"s",
            	            		lv_s_5_0, 
            	            		"state");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleagent224); 

                	newLeafNode(otherlv_6, grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleagent"


    // $ANTLR start "entryRulelabel"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:158:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:159:2: (iv_rulelabel= rulelabel EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:160:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel260);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel270); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelabel"


    // $ANTLR start "rulelabel"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:167:1: rulelabel returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:170:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:171:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:171:1: ( (lv_name_0_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:172:1: (lv_name_0_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:172:1: (lv_name_0_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:173:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulelabel311); 

            			newLeafNode(lv_name_0_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
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
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRulestate"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:197:1: entryRulestate returns [EObject current=null] : iv_rulestate= rulestate EOF ;
    public final EObject entryRulestate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestate = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:198:2: (iv_rulestate= rulestate EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:199:2: iv_rulestate= rulestate EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_rulestate_in_entryRulestate351);
            iv_rulestate=rulestate();

            state._fsp--;

             current =iv_rulestate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestate361); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestate"


    // $ANTLR start "rulestate"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:206:1: rulestate returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneous_act_3_0= ruleaction ) )+ otherlv_4= '}' ) ;
    public final EObject rulestate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_spontaneous_act_3_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:209:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneous_act_3_0= ruleaction ) )+ otherlv_4= '}' ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:210:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneous_act_3_0= ruleaction ) )+ otherlv_4= '}' )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:210:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneous_act_3_0= ruleaction ) )+ otherlv_4= '}' )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:210:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneous_act_3_0= ruleaction ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulestate398); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:214:1: ( (lv_name_1_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:215:1: (lv_name_1_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:215:1: (lv_name_1_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:216:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulestate415); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulestate432); 

                	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:236:1: ( (lv_spontaneous_act_3_0= ruleaction ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:237:1: (lv_spontaneous_act_3_0= ruleaction )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:237:1: (lv_spontaneous_act_3_0= ruleaction )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:238:3: lv_spontaneous_act_3_0= ruleaction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getSpontaneous_actActionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleaction_in_rulestate453);
            	    lv_spontaneous_act_3_0=ruleaction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"spontaneous_act",
            	            		lv_spontaneous_act_3_0, 
            	            		"action");
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_rulestate466); 

                	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "rulestate"


    // $ANTLR start "entryRuleaction"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:266:1: entryRuleaction returns [EObject current=null] : iv_ruleaction= ruleaction EOF ;
    public final EObject entryRuleaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaction = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:267:2: (iv_ruleaction= ruleaction EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:268:2: iv_ruleaction= ruleaction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleaction_in_entryRuleaction502);
            iv_ruleaction=ruleaction();

            state._fsp--;

             current =iv_ruleaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleaction512); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleaction"


    // $ANTLR start "ruleaction"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:275:1: ruleaction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_localRate_4_0=null;

         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:278:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= RULE_FLOAT ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:279:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= RULE_FLOAT ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:279:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= RULE_FLOAT ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:279:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= RULE_FLOAT ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:279:2: ( (otherlv_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:280:1: (otherlv_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:280:1: (otherlv_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:281:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleaction557); 

            		newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActRefLabelCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleaction569); 

                	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:296:1: ( (otherlv_2= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:297:1: (otherlv_2= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:297:1: (otherlv_2= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:298:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleaction589); 

            		newLeafNode(otherlv_2, grammarAccess.getActionAccess().getStateRefStateCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleaction601); 

                	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getColonKeyword_3());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:313:1: ( (lv_localRate_4_0= RULE_FLOAT ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:314:1: (lv_localRate_4_0= RULE_FLOAT )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:314:1: (lv_localRate_4_0= RULE_FLOAT )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:315:3: lv_localRate_4_0= RULE_FLOAT
            {
            lv_localRate_4_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleaction618); 

            			newLeafNode(lv_localRate_4_0, grammarAccess.getActionAccess().getLocalRateFLOATTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"localRate",
                    		lv_localRate_4_0, 
                    		"FLOAT");
            	    

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
    // $ANTLR end "ruleaction"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleagent_in_entryRuleagent75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleagent85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleagent122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleagent139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleagent156 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleagent168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulelabel_in_ruleagent189 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rulestate_in_ruleagent211 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleagent224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulelabel311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestate_in_entryRulestate351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestate361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulestate398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulestate415 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulestate432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleaction_in_rulestate453 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_rulestate466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaction_in_entryRuleaction502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaction512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleaction557 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleaction569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleaction589 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleaction601 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleaction618 = new BitSet(new long[]{0x0000000000000002L});

}