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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'population'", "'{'", "'init'", "'||'", "'}'", "','", "'='", "'transition'", "'&'", "'=>'", "'new'", "'kill'", "':'", "'any'", "'agent'", "'actions'", "'state'", "'-->'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_FLOAT=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

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
        	return "main";	
       	}
       	
       	@Override
       	protected MarkovPopulationModelsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulemain"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:67:1: entryRulemain returns [EObject current=null] : iv_rulemain= rulemain EOF ;
    public final EObject entryRulemain() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemain = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:68:2: (iv_rulemain= rulemain EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:69:2: iv_rulemain= rulemain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_rulemain_in_entryRulemain75);
            iv_rulemain=rulemain();

            state._fsp--;

             current =iv_rulemain; 
            match(input,EOF,FOLLOW_EOF_in_entryRulemain85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemain"


    // $ANTLR start "rulemain"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:76:1: rulemain returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_populationDef_1_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_2_0= ruleagent ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject rulemain() throws RecognitionException {
        EObject current = null;

        EObject lv_populationDef_1_0 = null;

        EObject lv_agentDef_2_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:79:28: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_populationDef_1_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_2_0= ruleagent ) ) ) ) ) )+ {...}?) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:80:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_populationDef_1_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_2_0= ruleagent ) ) ) ) ) )+ {...}?) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:80:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_populationDef_1_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_2_0= ruleagent ) ) ) ) ) )+ {...}?) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:82:1: ( ( ( ({...}? => ( ({...}? => ( (lv_populationDef_1_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_2_0= ruleagent ) ) ) ) ) )+ {...}?) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:82:1: ( ( ( ({...}? => ( ({...}? => ( (lv_populationDef_1_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_2_0= ruleagent ) ) ) ) ) )+ {...}?) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:83:2: ( ( ({...}? => ( ({...}? => ( (lv_populationDef_1_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_2_0= ruleagent ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMainAccess().getUnorderedGroup());
            	
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:86:2: ( ( ({...}? => ( ({...}? => ( (lv_populationDef_1_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_2_0= ruleagent ) ) ) ) ) )+ {...}?)
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:87:3: ( ({...}? => ( ({...}? => ( (lv_populationDef_1_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_2_0= ruleagent ) ) ) ) ) )+ {...}?
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:87:3: ( ({...}? => ( ({...}? => ( (lv_populationDef_1_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_2_0= ruleagent ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( LA1_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup(), 1) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:89:4: ({...}? => ( ({...}? => ( (lv_populationDef_1_0= rulepopulation ) ) ) ) )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:89:4: ({...}? => ( ({...}? => ( (lv_populationDef_1_0= rulepopulation ) ) ) ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:90:5: {...}? => ( ({...}? => ( (lv_populationDef_1_0= rulepopulation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "rulemain", "getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:90:99: ( ({...}? => ( (lv_populationDef_1_0= rulepopulation ) ) ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:91:6: ({...}? => ( (lv_populationDef_1_0= rulepopulation ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMainAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:94:6: ({...}? => ( (lv_populationDef_1_0= rulepopulation ) ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:94:7: {...}? => ( (lv_populationDef_1_0= rulepopulation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulemain", "true");
            	    }
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:94:16: ( (lv_populationDef_1_0= rulepopulation ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:95:1: (lv_populationDef_1_0= rulepopulation )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:95:1: (lv_populationDef_1_0= rulepopulation )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:96:3: lv_populationDef_1_0= rulepopulation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMainAccess().getPopulationDefPopulationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulepopulation_in_rulemain175);
            	    lv_populationDef_1_0=rulepopulation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMainRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"populationDef",
            	            		lv_populationDef_1_0, 
            	            		"population");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMainAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:119:4: ({...}? => ( ({...}? => ( (lv_agentDef_2_0= ruleagent ) ) ) ) )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:119:4: ({...}? => ( ({...}? => ( (lv_agentDef_2_0= ruleagent ) ) ) ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:120:5: {...}? => ( ({...}? => ( (lv_agentDef_2_0= ruleagent ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "rulemain", "getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:120:99: ( ({...}? => ( (lv_agentDef_2_0= ruleagent ) ) ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:121:6: ({...}? => ( (lv_agentDef_2_0= ruleagent ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMainAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:124:6: ({...}? => ( (lv_agentDef_2_0= ruleagent ) ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:124:7: {...}? => ( (lv_agentDef_2_0= ruleagent ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulemain", "true");
            	    }
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:124:16: ( (lv_agentDef_2_0= ruleagent ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:125:1: (lv_agentDef_2_0= ruleagent )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:125:1: (lv_agentDef_2_0= ruleagent )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:126:3: lv_agentDef_2_0= ruleagent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMainAccess().getAgentDefAgentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleagent_in_rulemain250);
            	    lv_agentDef_2_0=ruleagent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMainRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"agentDef",
            	            		lv_agentDef_2_0, 
            	            		"agent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMainAccess().getUnorderedGroup());
            	    	 				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMainAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rulemain", "getUnorderedGroupHelper().canLeave(grammarAccess.getMainAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMainAccess().getUnorderedGroup());
            	

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
    // $ANTLR end "rulemain"


    // $ANTLR start "entryRulepopulation"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:165:1: entryRulepopulation returns [EObject current=null] : iv_rulepopulation= rulepopulation EOF ;
    public final EObject entryRulepopulation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepopulation = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:166:2: (iv_rulepopulation= rulepopulation EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:167:2: iv_rulepopulation= rulepopulation EOF
            {
             newCompositeNode(grammarAccess.getPopulationRule()); 
            pushFollow(FOLLOW_rulepopulation_in_entryRulepopulation331);
            iv_rulepopulation=rulepopulation();

            state._fsp--;

             current =iv_rulepopulation; 
            match(input,EOF,FOLLOW_EOF_in_entryRulepopulation341); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepopulation"


    // $ANTLR start "rulepopulation"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:174:1: rulepopulation returns [EObject current=null] : (otherlv_0= 'population' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'init' ( (lv_agents_4_0= ruleinit ) ) (otherlv_5= '||' ( (lv_agents_6_0= ruleinit ) ) )* ( (lv_tran_7_0= rulegl_tran ) )+ otherlv_8= '}' ) ;
    public final EObject rulepopulation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_agents_4_0 = null;

        EObject lv_agents_6_0 = null;

        EObject lv_tran_7_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:177:28: ( (otherlv_0= 'population' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'init' ( (lv_agents_4_0= ruleinit ) ) (otherlv_5= '||' ( (lv_agents_6_0= ruleinit ) ) )* ( (lv_tran_7_0= rulegl_tran ) )+ otherlv_8= '}' ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:178:1: (otherlv_0= 'population' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'init' ( (lv_agents_4_0= ruleinit ) ) (otherlv_5= '||' ( (lv_agents_6_0= ruleinit ) ) )* ( (lv_tran_7_0= rulegl_tran ) )+ otherlv_8= '}' )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:178:1: (otherlv_0= 'population' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'init' ( (lv_agents_4_0= ruleinit ) ) (otherlv_5= '||' ( (lv_agents_6_0= ruleinit ) ) )* ( (lv_tran_7_0= rulegl_tran ) )+ otherlv_8= '}' )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:178:3: otherlv_0= 'population' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'init' ( (lv_agents_4_0= ruleinit ) ) (otherlv_5= '||' ( (lv_agents_6_0= ruleinit ) ) )* ( (lv_tran_7_0= rulegl_tran ) )+ otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulepopulation378); 

                	newLeafNode(otherlv_0, grammarAccess.getPopulationAccess().getPopulationKeyword_0());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:182:1: ( (lv_name_1_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:183:1: (lv_name_1_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:183:1: (lv_name_1_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:184:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepopulation395); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPopulationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPopulationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulepopulation412); 

                	newLeafNode(otherlv_2, grammarAccess.getPopulationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_rulepopulation424); 

                	newLeafNode(otherlv_3, grammarAccess.getPopulationAccess().getInitKeyword_3());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:208:1: ( (lv_agents_4_0= ruleinit ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:209:1: (lv_agents_4_0= ruleinit )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:209:1: (lv_agents_4_0= ruleinit )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:210:3: lv_agents_4_0= ruleinit
            {
             
            	        newCompositeNode(grammarAccess.getPopulationAccess().getAgentsInitParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleinit_in_rulepopulation445);
            lv_agents_4_0=ruleinit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPopulationRule());
            	        }
                   		add(
                   			current, 
                   			"agents",
                    		lv_agents_4_0, 
                    		"init");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:226:2: (otherlv_5= '||' ( (lv_agents_6_0= ruleinit ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:226:4: otherlv_5= '||' ( (lv_agents_6_0= ruleinit ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_rulepopulation458); 

            	        	newLeafNode(otherlv_5, grammarAccess.getPopulationAccess().getVerticalLineVerticalLineKeyword_5_0());
            	        
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:230:1: ( (lv_agents_6_0= ruleinit ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:231:1: (lv_agents_6_0= ruleinit )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:231:1: (lv_agents_6_0= ruleinit )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:232:3: lv_agents_6_0= ruleinit
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPopulationAccess().getAgentsInitParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleinit_in_rulepopulation479);
            	    lv_agents_6_0=ruleinit();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPopulationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"agents",
            	            		lv_agents_6_0, 
            	            		"init");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:248:4: ( (lv_tran_7_0= rulegl_tran ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:249:1: (lv_tran_7_0= rulegl_tran )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:249:1: (lv_tran_7_0= rulegl_tran )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:250:3: lv_tran_7_0= rulegl_tran
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPopulationAccess().getTranGl_tranParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulegl_tran_in_rulepopulation502);
            	    lv_tran_7_0=rulegl_tran();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPopulationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tran",
            	            		lv_tran_7_0, 
            	            		"gl_tran");
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

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_rulepopulation515); 

                	newLeafNode(otherlv_8, grammarAccess.getPopulationAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "rulepopulation"


    // $ANTLR start "entryRuleinit"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:278:1: entryRuleinit returns [EObject current=null] : iv_ruleinit= ruleinit EOF ;
    public final EObject entryRuleinit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinit = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:279:2: (iv_ruleinit= ruleinit EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:280:2: iv_ruleinit= ruleinit EOF
            {
             newCompositeNode(grammarAccess.getInitRule()); 
            pushFollow(FOLLOW_ruleinit_in_entryRuleinit551);
            iv_ruleinit=ruleinit();

            state._fsp--;

             current =iv_ruleinit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinit561); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinit"


    // $ANTLR start "ruleinit"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:287:1: ruleinit returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_states_2_0= rulestateInit ) ) (otherlv_3= ',' ( (lv_states_4_0= rulestateInit ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleinit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_states_2_0 = null;

        EObject lv_states_4_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:290:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_states_2_0= rulestateInit ) ) (otherlv_3= ',' ( (lv_states_4_0= rulestateInit ) ) )* otherlv_5= '}' ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:291:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_states_2_0= rulestateInit ) ) (otherlv_3= ',' ( (lv_states_4_0= rulestateInit ) ) )* otherlv_5= '}' )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:291:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_states_2_0= rulestateInit ) ) (otherlv_3= ',' ( (lv_states_4_0= rulestateInit ) ) )* otherlv_5= '}' )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:291:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_states_2_0= rulestateInit ) ) (otherlv_3= ',' ( (lv_states_4_0= rulestateInit ) ) )* otherlv_5= '}'
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:291:2: ( (otherlv_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:292:1: (otherlv_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:292:1: (otherlv_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:293:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInitRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleinit606); 

            		newLeafNode(otherlv_0, grammarAccess.getInitAccess().getAgentRefAgentCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleinit618); 

                	newLeafNode(otherlv_1, grammarAccess.getInitAccess().getLeftCurlyBracketKeyword_1());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:308:1: ( (lv_states_2_0= rulestateInit ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:309:1: (lv_states_2_0= rulestateInit )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:309:1: (lv_states_2_0= rulestateInit )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:310:3: lv_states_2_0= rulestateInit
            {
             
            	        newCompositeNode(grammarAccess.getInitAccess().getStatesStateInitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulestateInit_in_ruleinit639);
            lv_states_2_0=rulestateInit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInitRule());
            	        }
                   		add(
                   			current, 
                   			"states",
                    		lv_states_2_0, 
                    		"stateInit");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:326:2: (otherlv_3= ',' ( (lv_states_4_0= rulestateInit ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:326:4: otherlv_3= ',' ( (lv_states_4_0= rulestateInit ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleinit652); 

            	        	newLeafNode(otherlv_3, grammarAccess.getInitAccess().getCommaKeyword_3_0());
            	        
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:330:1: ( (lv_states_4_0= rulestateInit ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:331:1: (lv_states_4_0= rulestateInit )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:331:1: (lv_states_4_0= rulestateInit )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:332:3: lv_states_4_0= rulestateInit
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInitAccess().getStatesStateInitParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulestateInit_in_ruleinit673);
            	    lv_states_4_0=rulestateInit();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInitRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_4_0, 
            	            		"stateInit");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleinit687); 

                	newLeafNode(otherlv_5, grammarAccess.getInitAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleinit"


    // $ANTLR start "entryRulestateInit"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:360:1: entryRulestateInit returns [EObject current=null] : iv_rulestateInit= rulestateInit EOF ;
    public final EObject entryRulestateInit() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestateInit = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:361:2: (iv_rulestateInit= rulestateInit EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:362:2: iv_rulestateInit= rulestateInit EOF
            {
             newCompositeNode(grammarAccess.getStateInitRule()); 
            pushFollow(FOLLOW_rulestateInit_in_entryRulestateInit723);
            iv_rulestateInit=rulestateInit();

            state._fsp--;

             current =iv_rulestateInit; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestateInit733); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestateInit"


    // $ANTLR start "rulestateInit"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:369:1: rulestateInit returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_card_2_0= RULE_INT ) ) ) ;
    public final EObject rulestateInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_card_2_0=null;

         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:372:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_card_2_0= RULE_INT ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:373:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_card_2_0= RULE_INT ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:373:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_card_2_0= RULE_INT ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:373:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_card_2_0= RULE_INT ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:373:2: ( (otherlv_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:374:1: (otherlv_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:374:1: (otherlv_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:375:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStateInitRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulestateInit778); 

            		newLeafNode(otherlv_0, grammarAccess.getStateInitAccess().getStateRefStateCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulestateInit790); 

                	newLeafNode(otherlv_1, grammarAccess.getStateInitAccess().getEqualsSignKeyword_1());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:390:1: ( (lv_card_2_0= RULE_INT ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:391:1: (lv_card_2_0= RULE_INT )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:391:1: (lv_card_2_0= RULE_INT )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:392:3: lv_card_2_0= RULE_INT
            {
            lv_card_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulestateInit807); 

            			newLeafNode(lv_card_2_0, grammarAccess.getStateInitAccess().getCardINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateInitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"card",
                    		lv_card_2_0, 
                    		"INT");
            	    

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
    // $ANTLR end "rulestateInit"


    // $ANTLR start "entryRulegl_tran"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:416:1: entryRulegl_tran returns [EObject current=null] : iv_rulegl_tran= rulegl_tran EOF ;
    public final EObject entryRulegl_tran() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegl_tran = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:417:2: (iv_rulegl_tran= rulegl_tran EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:418:2: iv_rulegl_tran= rulegl_tran EOF
            {
             newCompositeNode(grammarAccess.getGl_tranRule()); 
            pushFollow(FOLLOW_rulegl_tran_in_entryRulegl_tran848);
            iv_rulegl_tran=rulegl_tran();

            state._fsp--;

             current =iv_rulegl_tran; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegl_tran858); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegl_tran"


    // $ANTLR start "rulegl_tran"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:425:1: rulegl_tran returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_l_tran_3_0= ruleloc_tran ) ) (otherlv_4= '&' ( (lv_l_tran_5_0= ruleloc_tran ) ) )* otherlv_6= '=>' ( (lv_rate_7_0= RULE_FLOAT ) ) otherlv_8= '}' ) ;
    public final EObject rulegl_tran() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_rate_7_0=null;
        Token otherlv_8=null;
        EObject lv_l_tran_3_0 = null;

        EObject lv_l_tran_5_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:428:28: ( (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_l_tran_3_0= ruleloc_tran ) ) (otherlv_4= '&' ( (lv_l_tran_5_0= ruleloc_tran ) ) )* otherlv_6= '=>' ( (lv_rate_7_0= RULE_FLOAT ) ) otherlv_8= '}' ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:429:1: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_l_tran_3_0= ruleloc_tran ) ) (otherlv_4= '&' ( (lv_l_tran_5_0= ruleloc_tran ) ) )* otherlv_6= '=>' ( (lv_rate_7_0= RULE_FLOAT ) ) otherlv_8= '}' )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:429:1: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_l_tran_3_0= ruleloc_tran ) ) (otherlv_4= '&' ( (lv_l_tran_5_0= ruleloc_tran ) ) )* otherlv_6= '=>' ( (lv_rate_7_0= RULE_FLOAT ) ) otherlv_8= '}' )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:429:3: otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_l_tran_3_0= ruleloc_tran ) ) (otherlv_4= '&' ( (lv_l_tran_5_0= ruleloc_tran ) ) )* otherlv_6= '=>' ( (lv_rate_7_0= RULE_FLOAT ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulegl_tran895); 

                	newLeafNode(otherlv_0, grammarAccess.getGl_tranAccess().getTransitionKeyword_0());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:433:1: ( (lv_name_1_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:434:1: (lv_name_1_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:434:1: (lv_name_1_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:435:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulegl_tran912); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGl_tranAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGl_tranRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulegl_tran929); 

                	newLeafNode(otherlv_2, grammarAccess.getGl_tranAccess().getLeftCurlyBracketKeyword_2());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:455:1: ( (lv_l_tran_3_0= ruleloc_tran ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:456:1: (lv_l_tran_3_0= ruleloc_tran )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:456:1: (lv_l_tran_3_0= ruleloc_tran )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:457:3: lv_l_tran_3_0= ruleloc_tran
            {
             
            	        newCompositeNode(grammarAccess.getGl_tranAccess().getL_tranLoc_tranParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleloc_tran_in_rulegl_tran950);
            lv_l_tran_3_0=ruleloc_tran();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGl_tranRule());
            	        }
                   		add(
                   			current, 
                   			"l_tran",
                    		lv_l_tran_3_0, 
                    		"loc_tran");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:473:2: (otherlv_4= '&' ( (lv_l_tran_5_0= ruleloc_tran ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:473:4: otherlv_4= '&' ( (lv_l_tran_5_0= ruleloc_tran ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_rulegl_tran963); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGl_tranAccess().getAmpersandKeyword_4_0());
            	        
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:477:1: ( (lv_l_tran_5_0= ruleloc_tran ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:478:1: (lv_l_tran_5_0= ruleloc_tran )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:478:1: (lv_l_tran_5_0= ruleloc_tran )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:479:3: lv_l_tran_5_0= ruleloc_tran
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGl_tranAccess().getL_tranLoc_tranParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleloc_tran_in_rulegl_tran984);
            	    lv_l_tran_5_0=ruleloc_tran();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGl_tranRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"l_tran",
            	            		lv_l_tran_5_0, 
            	            		"loc_tran");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_rulegl_tran998); 

                	newLeafNode(otherlv_6, grammarAccess.getGl_tranAccess().getEqualsSignGreaterThanSignKeyword_5());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:499:1: ( (lv_rate_7_0= RULE_FLOAT ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:500:1: (lv_rate_7_0= RULE_FLOAT )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:500:1: (lv_rate_7_0= RULE_FLOAT )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:501:3: lv_rate_7_0= RULE_FLOAT
            {
            lv_rate_7_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rulegl_tran1015); 

            			newLeafNode(lv_rate_7_0, grammarAccess.getGl_tranAccess().getRateFLOATTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGl_tranRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"rate",
                    		lv_rate_7_0, 
                    		"FLOAT");
            	    

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_rulegl_tran1032); 

                	newLeafNode(otherlv_8, grammarAccess.getGl_tranAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "rulegl_tran"


    // $ANTLR start "entryRuleloc_tran"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:529:1: entryRuleloc_tran returns [EObject current=null] : iv_ruleloc_tran= ruleloc_tran EOF ;
    public final EObject entryRuleloc_tran() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleloc_tran = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:530:2: (iv_ruleloc_tran= ruleloc_tran EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:531:2: iv_ruleloc_tran= ruleloc_tran EOF
            {
             newCompositeNode(grammarAccess.getLoc_tranRule()); 
            pushFollow(FOLLOW_ruleloc_tran_in_entryRuleloc_tran1068);
            iv_ruleloc_tran=ruleloc_tran();

            state._fsp--;

             current =iv_ruleloc_tran; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleloc_tran1078); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleloc_tran"


    // $ANTLR start "ruleloc_tran"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:538:1: ruleloc_tran returns [EObject current=null] : ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_s_cond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_a_cond_6_0= ruleaction_cond ) ) ) ) ;
    public final EObject ruleloc_tran() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_s_cond_4_0 = null;

        EObject lv_a_cond_6_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:541:28: ( ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_s_cond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_a_cond_6_0= ruleaction_cond ) ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:542:1: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_s_cond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_a_cond_6_0= ruleaction_cond ) ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:542:1: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_s_cond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_a_cond_6_0= ruleaction_cond ) ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
            case 25:
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
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:542:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:542:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:542:4: otherlv_0= 'new' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleloc_tran1116); 

                        	newLeafNode(otherlv_0, grammarAccess.getLoc_tranAccess().getNewKeyword_0_0());
                        
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:546:1: ( (otherlv_1= RULE_ID ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:547:1: (otherlv_1= RULE_ID )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:547:1: (otherlv_1= RULE_ID )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:548:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLoc_tranRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleloc_tran1136); 

                    		newLeafNode(otherlv_1, grammarAccess.getLoc_tranAccess().getStateRefStateCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:560:6: (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:560:6: (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:560:8: otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleloc_tran1156); 

                        	newLeafNode(otherlv_2, grammarAccess.getLoc_tranAccess().getKillKeyword_1_0());
                        
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:564:1: ( (otherlv_3= RULE_ID ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:565:1: (otherlv_3= RULE_ID )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:565:1: (otherlv_3= RULE_ID )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:566:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLoc_tranRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleloc_tran1176); 

                    		newLeafNode(otherlv_3, grammarAccess.getLoc_tranAccess().getStateRefStateCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:578:6: ( ( (lv_s_cond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_a_cond_6_0= ruleaction_cond ) ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:578:6: ( ( (lv_s_cond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_a_cond_6_0= ruleaction_cond ) ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:578:7: ( (lv_s_cond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_a_cond_6_0= ruleaction_cond ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:578:7: ( (lv_s_cond_4_0= rulestate_cond ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:579:1: (lv_s_cond_4_0= rulestate_cond )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:579:1: (lv_s_cond_4_0= rulestate_cond )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:580:3: lv_s_cond_4_0= rulestate_cond
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoc_tranAccess().getS_condState_condParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulestate_cond_in_ruleloc_tran1205);
                    lv_s_cond_4_0=rulestate_cond();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoc_tranRule());
                    	        }
                           		set(
                           			current, 
                           			"s_cond",
                            		lv_s_cond_4_0, 
                            		"state_cond");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleloc_tran1217); 

                        	newLeafNode(otherlv_5, grammarAccess.getLoc_tranAccess().getColonKeyword_2_1());
                        
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:600:1: ( (lv_a_cond_6_0= ruleaction_cond ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:601:1: (lv_a_cond_6_0= ruleaction_cond )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:601:1: (lv_a_cond_6_0= ruleaction_cond )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:602:3: lv_a_cond_6_0= ruleaction_cond
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoc_tranAccess().getA_condAction_condParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleaction_cond_in_ruleloc_tran1238);
                    lv_a_cond_6_0=ruleaction_cond();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoc_tranRule());
                    	        }
                           		set(
                           			current, 
                           			"a_cond",
                            		lv_a_cond_6_0, 
                            		"action_cond");
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
    // $ANTLR end "ruleloc_tran"


    // $ANTLR start "entryRulestate_cond"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:626:1: entryRulestate_cond returns [EObject current=null] : iv_rulestate_cond= rulestate_cond EOF ;
    public final EObject entryRulestate_cond() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestate_cond = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:627:2: (iv_rulestate_cond= rulestate_cond EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:628:2: iv_rulestate_cond= rulestate_cond EOF
            {
             newCompositeNode(grammarAccess.getState_condRule()); 
            pushFollow(FOLLOW_rulestate_cond_in_entryRulestate_cond1275);
            iv_rulestate_cond=rulestate_cond();

            state._fsp--;

             current =iv_rulestate_cond; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestate_cond1285); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestate_cond"


    // $ANTLR start "rulestate_cond"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:635:1: rulestate_cond returns [EObject current=null] : ( ( () otherlv_1= 'any' ) | ( (lv_s_ref_2_0= rulestate_ref ) ) ) ;
    public final EObject rulestate_cond() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_s_ref_2_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:638:28: ( ( ( () otherlv_1= 'any' ) | ( (lv_s_ref_2_0= rulestate_ref ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:639:1: ( ( () otherlv_1= 'any' ) | ( (lv_s_ref_2_0= rulestate_ref ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:639:1: ( ( () otherlv_1= 'any' ) | ( (lv_s_ref_2_0= rulestate_ref ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:639:2: ( () otherlv_1= 'any' )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:639:2: ( () otherlv_1= 'any' )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:639:3: () otherlv_1= 'any'
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:639:3: ()
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:640:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getState_condAccess().getAnystateAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_rulestate_cond1332); 

                        	newLeafNode(otherlv_1, grammarAccess.getState_condAccess().getAnyKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:650:6: ( (lv_s_ref_2_0= rulestate_ref ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:650:6: ( (lv_s_ref_2_0= rulestate_ref ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:651:1: (lv_s_ref_2_0= rulestate_ref )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:651:1: (lv_s_ref_2_0= rulestate_ref )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:652:3: lv_s_ref_2_0= rulestate_ref
                    {
                     
                    	        newCompositeNode(grammarAccess.getState_condAccess().getS_refState_refParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulestate_ref_in_rulestate_cond1360);
                    lv_s_ref_2_0=rulestate_ref();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getState_condRule());
                    	        }
                           		set(
                           			current, 
                           			"s_ref",
                            		lv_s_ref_2_0, 
                            		"state_ref");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "rulestate_cond"


    // $ANTLR start "entryRulestate_ref"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:676:1: entryRulestate_ref returns [EObject current=null] : iv_rulestate_ref= rulestate_ref EOF ;
    public final EObject entryRulestate_ref() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestate_ref = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:677:2: (iv_rulestate_ref= rulestate_ref EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:678:2: iv_rulestate_ref= rulestate_ref EOF
            {
             newCompositeNode(grammarAccess.getState_refRule()); 
            pushFollow(FOLLOW_rulestate_ref_in_entryRulestate_ref1396);
            iv_rulestate_ref=rulestate_ref();

            state._fsp--;

             current =iv_rulestate_ref; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestate_ref1406); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestate_ref"


    // $ANTLR start "rulestate_ref"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:685:1: rulestate_ref returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulestate_ref() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:688:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:689:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:689:1: ( (lv_name_0_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:690:1: (lv_name_0_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:690:1: (lv_name_0_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:691:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulestate_ref1447); 

            			newLeafNode(lv_name_0_0, grammarAccess.getState_refAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getState_refRule());
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
    // $ANTLR end "rulestate_ref"


    // $ANTLR start "entryRuleaction_cond"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:715:1: entryRuleaction_cond returns [EObject current=null] : iv_ruleaction_cond= ruleaction_cond EOF ;
    public final EObject entryRuleaction_cond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaction_cond = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:716:2: (iv_ruleaction_cond= ruleaction_cond EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:717:2: iv_ruleaction_cond= ruleaction_cond EOF
            {
             newCompositeNode(grammarAccess.getAction_condRule()); 
            pushFollow(FOLLOW_ruleaction_cond_in_entryRuleaction_cond1487);
            iv_ruleaction_cond=ruleaction_cond();

            state._fsp--;

             current =iv_ruleaction_cond; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleaction_cond1497); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleaction_cond"


    // $ANTLR start "ruleaction_cond"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:724:1: ruleaction_cond returns [EObject current=null] : ( ( () otherlv_1= 'any' ) | ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleaction_cond() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:727:28: ( ( ( () otherlv_1= 'any' ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:728:1: ( ( () otherlv_1= 'any' ) | ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:728:1: ( ( () otherlv_1= 'any' ) | ( (lv_name_2_0= RULE_ID ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:728:2: ( () otherlv_1= 'any' )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:728:2: ( () otherlv_1= 'any' )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:728:3: () otherlv_1= 'any'
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:728:3: ()
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:729:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAction_condAccess().getAnystateAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleaction_cond1544); 

                        	newLeafNode(otherlv_1, grammarAccess.getAction_condAccess().getAnyKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:739:6: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:739:6: ( (lv_name_2_0= RULE_ID ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:740:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:740:1: (lv_name_2_0= RULE_ID )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:741:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleaction_cond1568); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getAction_condAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAction_condRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

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
    // $ANTLR end "ruleaction_cond"


    // $ANTLR start "entryRuleagent"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:765:1: entryRuleagent returns [EObject current=null] : iv_ruleagent= ruleagent EOF ;
    public final EObject entryRuleagent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleagent = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:766:2: (iv_ruleagent= ruleagent EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:767:2: iv_ruleagent= ruleagent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_ruleagent_in_entryRuleagent1609);
            iv_ruleagent=ruleagent();

            state._fsp--;

             current =iv_ruleagent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleagent1619); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:774:1: ruleagent returns [EObject current=null] : (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}' ) ;
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
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:777:28: ( (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}' ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:778:1: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}' )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:778:1: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}' )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:778:3: otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleagent1656); 

                	newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:782:1: ( (lv_name_1_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:783:1: (lv_name_1_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:783:1: (lv_name_1_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:784:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleagent1673); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleagent1690); 

                	newLeafNode(otherlv_2, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleagent1702); 

                	newLeafNode(otherlv_3, grammarAccess.getAgentAccess().getActionsKeyword_3());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:808:1: ( (lv_act_4_0= rulelabel ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:809:1: (lv_act_4_0= rulelabel )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:809:1: (lv_act_4_0= rulelabel )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:810:3: lv_act_4_0= rulelabel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAgentAccess().getActLabelParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulelabel_in_ruleagent1723);
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:826:3: ( (lv_s_5_0= rulestate ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:827:1: (lv_s_5_0= rulestate )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:827:1: (lv_s_5_0= rulestate )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:828:3: lv_s_5_0= rulestate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAgentAccess().getSStateParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulestate_in_ruleagent1745);
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleagent1758); 

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:856:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:857:2: (iv_rulelabel= rulelabel EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:858:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel1794);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel1804); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:865:1: rulelabel returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:868:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:869:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:869:1: ( (lv_name_0_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:870:1: (lv_name_0_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:870:1: (lv_name_0_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:871:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulelabel1845); 

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:895:1: entryRulestate returns [EObject current=null] : iv_rulestate= rulestate EOF ;
    public final EObject entryRulestate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestate = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:896:2: (iv_rulestate= rulestate EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:897:2: iv_rulestate= rulestate EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_rulestate_in_entryRulestate1885);
            iv_rulestate=rulestate();

            state._fsp--;

             current =iv_rulestate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestate1895); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:904:1: rulestate returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneous_act_3_0= ruleaction ) )+ otherlv_4= '}' ) ;
    public final EObject rulestate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_spontaneous_act_3_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:907:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneous_act_3_0= ruleaction ) )+ otherlv_4= '}' ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:908:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneous_act_3_0= ruleaction ) )+ otherlv_4= '}' )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:908:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneous_act_3_0= ruleaction ) )+ otherlv_4= '}' )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:908:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneous_act_3_0= ruleaction ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_rulestate1932); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:912:1: ( (lv_name_1_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:913:1: (lv_name_1_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:913:1: (lv_name_1_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:914:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulestate1949); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulestate1966); 

                	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:934:1: ( (lv_spontaneous_act_3_0= ruleaction ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:935:1: (lv_spontaneous_act_3_0= ruleaction )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:935:1: (lv_spontaneous_act_3_0= ruleaction )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:936:3: lv_spontaneous_act_3_0= ruleaction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getSpontaneous_actActionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleaction_in_rulestate1987);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulestate2000); 

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:964:1: entryRuleaction returns [EObject current=null] : iv_ruleaction= ruleaction EOF ;
    public final EObject entryRuleaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaction = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:965:2: (iv_ruleaction= ruleaction EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:966:2: iv_ruleaction= ruleaction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleaction_in_entryRuleaction2036);
            iv_ruleaction=ruleaction();

            state._fsp--;

             current =iv_ruleaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleaction2046); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:973:1: ruleaction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_localRate_4_0=null;

         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:976:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= RULE_FLOAT ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:977:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= RULE_FLOAT ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:977:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= RULE_FLOAT ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:977:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= RULE_FLOAT ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:977:2: ( (otherlv_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:978:1: (otherlv_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:978:1: (otherlv_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:979:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleaction2091); 

            		newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActRefLabelCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleaction2103); 

                	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:994:1: ( (otherlv_2= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:995:1: (otherlv_2= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:995:1: (otherlv_2= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:996:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleaction2123); 

            		newLeafNode(otherlv_2, grammarAccess.getActionAccess().getStateRefStateCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleaction2135); 

                	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getColonKeyword_3());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1011:1: ( (lv_localRate_4_0= RULE_FLOAT ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1012:1: (lv_localRate_4_0= RULE_FLOAT )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1012:1: (lv_localRate_4_0= RULE_FLOAT )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1013:3: lv_localRate_4_0= RULE_FLOAT
            {
            lv_localRate_4_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleaction2152); 

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


 

    public static final BitSet FOLLOW_rulemain_in_entryRulemain75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemain85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepopulation_in_rulemain175 = new BitSet(new long[]{0x0000000004001002L});
    public static final BitSet FOLLOW_ruleagent_in_rulemain250 = new BitSet(new long[]{0x0000000004001002L});
    public static final BitSet FOLLOW_rulepopulation_in_entryRulepopulation331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepopulation341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulepopulation378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepopulation395 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulepopulation412 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulepopulation424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleinit_in_rulepopulation445 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_rulepopulation458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleinit_in_rulepopulation479 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_rulegl_tran_in_rulepopulation502 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_16_in_rulepopulation515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinit_in_entryRuleinit551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinit561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleinit606 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleinit618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulestateInit_in_ruleinit639 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleinit652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulestateInit_in_ruleinit673 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleinit687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestateInit_in_entryRulestateInit723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestateInit733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulestateInit778 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestateInit790 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulestateInit807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegl_tran_in_entryRulegl_tran848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegl_tran858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulegl_tran895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulegl_tran912 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulegl_tran929 = new BitSet(new long[]{0x0000000002C00010L});
    public static final BitSet FOLLOW_ruleloc_tran_in_rulegl_tran950 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_rulegl_tran963 = new BitSet(new long[]{0x0000000002C00010L});
    public static final BitSet FOLLOW_ruleloc_tran_in_rulegl_tran984 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_rulegl_tran998 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rulegl_tran1015 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulegl_tran1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleloc_tran_in_entryRuleloc_tran1068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleloc_tran1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleloc_tran1116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleloc_tran1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleloc_tran1156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleloc_tran1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestate_cond_in_ruleloc_tran1205 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleloc_tran1217 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_ruleaction_cond_in_ruleloc_tran1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestate_cond_in_entryRulestate_cond1275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestate_cond1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulestate_cond1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestate_ref_in_rulestate_cond1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestate_ref_in_entryRulestate_ref1396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestate_ref1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulestate_ref1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaction_cond_in_entryRuleaction_cond1487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaction_cond1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleaction_cond1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleaction_cond1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleagent_in_entryRuleagent1609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleagent1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleagent1656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleagent1673 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleagent1690 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleagent1702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulelabel_in_ruleagent1723 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rulestate_in_ruleagent1745 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16_in_ruleagent1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel1794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulelabel1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestate_in_entryRulestate1885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestate1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulestate1932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulestate1949 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulestate1966 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleaction_in_rulestate1987 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_rulestate2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaction_in_entryRuleaction2036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaction2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleaction2091 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleaction2103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleaction2123 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleaction2135 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleaction2152 = new BitSet(new long[]{0x0000000000000002L});

}
