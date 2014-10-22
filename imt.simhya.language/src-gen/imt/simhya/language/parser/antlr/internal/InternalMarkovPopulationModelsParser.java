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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'population'", "'{'", "'init'", "'||'", "'}'", "','", "'='", "'transition'", "'&'", "'=>'", "'new'", "'kill'", "':'", "'any'", "'agent'", "'actions'", "'state'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'-->'"
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
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:369:1: rulestateInit returns [EObject current=null] : ( ( (lv_stateRef_0_0= rulestate_ref ) ) otherlv_1= '=' ( (lv_card_2_0= ruleExpression ) ) ) ;
    public final EObject rulestateInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_stateRef_0_0 = null;

        EObject lv_card_2_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:372:28: ( ( ( (lv_stateRef_0_0= rulestate_ref ) ) otherlv_1= '=' ( (lv_card_2_0= ruleExpression ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:373:1: ( ( (lv_stateRef_0_0= rulestate_ref ) ) otherlv_1= '=' ( (lv_card_2_0= ruleExpression ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:373:1: ( ( (lv_stateRef_0_0= rulestate_ref ) ) otherlv_1= '=' ( (lv_card_2_0= ruleExpression ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:373:2: ( (lv_stateRef_0_0= rulestate_ref ) ) otherlv_1= '=' ( (lv_card_2_0= ruleExpression ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:373:2: ( (lv_stateRef_0_0= rulestate_ref ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:374:1: (lv_stateRef_0_0= rulestate_ref )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:374:1: (lv_stateRef_0_0= rulestate_ref )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:375:3: lv_stateRef_0_0= rulestate_ref
            {
             
            	        newCompositeNode(grammarAccess.getStateInitAccess().getStateRefState_refParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulestate_ref_in_rulestateInit779);
            lv_stateRef_0_0=rulestate_ref();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateInitRule());
            	        }
                   		set(
                   			current, 
                   			"stateRef",
                    		lv_stateRef_0_0, 
                    		"state_ref");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulestateInit791); 

                	newLeafNode(otherlv_1, grammarAccess.getStateInitAccess().getEqualsSignKeyword_1());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:395:1: ( (lv_card_2_0= ruleExpression ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:396:1: (lv_card_2_0= ruleExpression )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:396:1: (lv_card_2_0= ruleExpression )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:397:3: lv_card_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getStateInitAccess().getCardExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_rulestateInit812);
            lv_card_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateInitRule());
            	        }
                   		set(
                   			current, 
                   			"card",
                    		lv_card_2_0, 
                    		"Expression");
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
    // $ANTLR end "rulestateInit"


    // $ANTLR start "entryRulegl_tran"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:421:1: entryRulegl_tran returns [EObject current=null] : iv_rulegl_tran= rulegl_tran EOF ;
    public final EObject entryRulegl_tran() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegl_tran = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:422:2: (iv_rulegl_tran= rulegl_tran EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:423:2: iv_rulegl_tran= rulegl_tran EOF
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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:430:1: rulegl_tran returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lTran_3_0= ruleloc_tran ) ) (otherlv_4= '&' ( (lv_lTran_5_0= ruleloc_tran ) ) )* otherlv_6= '=>' ( (lv_rate_7_0= ruleExpression ) ) otherlv_8= '}' ) ;
    public final EObject rulegl_tran() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_lTran_3_0 = null;

        EObject lv_lTran_5_0 = null;

        EObject lv_rate_7_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:433:28: ( (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lTran_3_0= ruleloc_tran ) ) (otherlv_4= '&' ( (lv_lTran_5_0= ruleloc_tran ) ) )* otherlv_6= '=>' ( (lv_rate_7_0= ruleExpression ) ) otherlv_8= '}' ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:434:1: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lTran_3_0= ruleloc_tran ) ) (otherlv_4= '&' ( (lv_lTran_5_0= ruleloc_tran ) ) )* otherlv_6= '=>' ( (lv_rate_7_0= ruleExpression ) ) otherlv_8= '}' )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:434:1: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lTran_3_0= ruleloc_tran ) ) (otherlv_4= '&' ( (lv_lTran_5_0= ruleloc_tran ) ) )* otherlv_6= '=>' ( (lv_rate_7_0= ruleExpression ) ) otherlv_8= '}' )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:434:3: otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lTran_3_0= ruleloc_tran ) ) (otherlv_4= '&' ( (lv_lTran_5_0= ruleloc_tran ) ) )* otherlv_6= '=>' ( (lv_rate_7_0= ruleExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulegl_tran895); 

                	newLeafNode(otherlv_0, grammarAccess.getGl_tranAccess().getTransitionKeyword_0());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:438:1: ( (lv_name_1_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:439:1: (lv_name_1_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:439:1: (lv_name_1_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:440:3: lv_name_1_0= RULE_ID
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
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:460:1: ( (lv_lTran_3_0= ruleloc_tran ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:461:1: (lv_lTran_3_0= ruleloc_tran )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:461:1: (lv_lTran_3_0= ruleloc_tran )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:462:3: lv_lTran_3_0= ruleloc_tran
            {
             
            	        newCompositeNode(grammarAccess.getGl_tranAccess().getLTranLoc_tranParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleloc_tran_in_rulegl_tran950);
            lv_lTran_3_0=ruleloc_tran();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGl_tranRule());
            	        }
                   		add(
                   			current, 
                   			"lTran",
                    		lv_lTran_3_0, 
                    		"loc_tran");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:478:2: (otherlv_4= '&' ( (lv_lTran_5_0= ruleloc_tran ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:478:4: otherlv_4= '&' ( (lv_lTran_5_0= ruleloc_tran ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_rulegl_tran963); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGl_tranAccess().getAmpersandKeyword_4_0());
            	        
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:482:1: ( (lv_lTran_5_0= ruleloc_tran ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:483:1: (lv_lTran_5_0= ruleloc_tran )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:483:1: (lv_lTran_5_0= ruleloc_tran )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:484:3: lv_lTran_5_0= ruleloc_tran
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGl_tranAccess().getLTranLoc_tranParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleloc_tran_in_rulegl_tran984);
            	    lv_lTran_5_0=ruleloc_tran();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGl_tranRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"lTran",
            	            		lv_lTran_5_0, 
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
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:504:1: ( (lv_rate_7_0= ruleExpression ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:505:1: (lv_rate_7_0= ruleExpression )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:505:1: (lv_rate_7_0= ruleExpression )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:506:3: lv_rate_7_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getGl_tranAccess().getRateExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_rulegl_tran1019);
            lv_rate_7_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGl_tranRule());
            	        }
                   		set(
                   			current, 
                   			"rate",
                    		lv_rate_7_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_rulegl_tran1031); 

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:534:1: entryRuleloc_tran returns [EObject current=null] : iv_ruleloc_tran= ruleloc_tran EOF ;
    public final EObject entryRuleloc_tran() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleloc_tran = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:535:2: (iv_ruleloc_tran= ruleloc_tran EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:536:2: iv_ruleloc_tran= ruleloc_tran EOF
            {
             newCompositeNode(grammarAccess.getLoc_tranRule()); 
            pushFollow(FOLLOW_ruleloc_tran_in_entryRuleloc_tran1067);
            iv_ruleloc_tran=ruleloc_tran();

            state._fsp--;

             current =iv_ruleloc_tran; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleloc_tran1077); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:543:1: ruleloc_tran returns [EObject current=null] : ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_sCond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_aCond_6_0= ruleaction_cond ) ) ) ) ;
    public final EObject ruleloc_tran() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_sCond_4_0 = null;

        EObject lv_aCond_6_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:546:28: ( ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_sCond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_aCond_6_0= ruleaction_cond ) ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:547:1: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_sCond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_aCond_6_0= ruleaction_cond ) ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:547:1: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_sCond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_aCond_6_0= ruleaction_cond ) ) ) )
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
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:547:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:547:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:547:4: otherlv_0= 'new' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleloc_tran1115); 

                        	newLeafNode(otherlv_0, grammarAccess.getLoc_tranAccess().getNewKeyword_0_0());
                        
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:551:1: ( (otherlv_1= RULE_ID ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:552:1: (otherlv_1= RULE_ID )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:552:1: (otherlv_1= RULE_ID )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:553:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLoc_tranRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleloc_tran1135); 

                    		newLeafNode(otherlv_1, grammarAccess.getLoc_tranAccess().getStateRefStateCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:565:6: (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:565:6: (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:565:8: otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleloc_tran1155); 

                        	newLeafNode(otherlv_2, grammarAccess.getLoc_tranAccess().getKillKeyword_1_0());
                        
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:569:1: ( (otherlv_3= RULE_ID ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:570:1: (otherlv_3= RULE_ID )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:570:1: (otherlv_3= RULE_ID )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:571:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLoc_tranRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleloc_tran1175); 

                    		newLeafNode(otherlv_3, grammarAccess.getLoc_tranAccess().getStateRefStateCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:583:6: ( ( (lv_sCond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_aCond_6_0= ruleaction_cond ) ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:583:6: ( ( (lv_sCond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_aCond_6_0= ruleaction_cond ) ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:583:7: ( (lv_sCond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_aCond_6_0= ruleaction_cond ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:583:7: ( (lv_sCond_4_0= rulestate_cond ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:584:1: (lv_sCond_4_0= rulestate_cond )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:584:1: (lv_sCond_4_0= rulestate_cond )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:585:3: lv_sCond_4_0= rulestate_cond
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoc_tranAccess().getSCondState_condParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulestate_cond_in_ruleloc_tran1204);
                    lv_sCond_4_0=rulestate_cond();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoc_tranRule());
                    	        }
                           		set(
                           			current, 
                           			"sCond",
                            		lv_sCond_4_0, 
                            		"state_cond");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleloc_tran1216); 

                        	newLeafNode(otherlv_5, grammarAccess.getLoc_tranAccess().getColonKeyword_2_1());
                        
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:605:1: ( (lv_aCond_6_0= ruleaction_cond ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:606:1: (lv_aCond_6_0= ruleaction_cond )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:606:1: (lv_aCond_6_0= ruleaction_cond )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:607:3: lv_aCond_6_0= ruleaction_cond
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoc_tranAccess().getACondAction_condParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleaction_cond_in_ruleloc_tran1237);
                    lv_aCond_6_0=ruleaction_cond();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoc_tranRule());
                    	        }
                           		set(
                           			current, 
                           			"aCond",
                            		lv_aCond_6_0, 
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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:631:1: entryRulestate_cond returns [EObject current=null] : iv_rulestate_cond= rulestate_cond EOF ;
    public final EObject entryRulestate_cond() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestate_cond = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:632:2: (iv_rulestate_cond= rulestate_cond EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:633:2: iv_rulestate_cond= rulestate_cond EOF
            {
             newCompositeNode(grammarAccess.getState_condRule()); 
            pushFollow(FOLLOW_rulestate_cond_in_entryRulestate_cond1274);
            iv_rulestate_cond=rulestate_cond();

            state._fsp--;

             current =iv_rulestate_cond; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestate_cond1284); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:640:1: rulestate_cond returns [EObject current=null] : ( ( () otherlv_1= 'any' ) | ( (lv_stateRef_2_0= rulestate_ref ) ) ) ;
    public final EObject rulestate_cond() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_stateRef_2_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:643:28: ( ( ( () otherlv_1= 'any' ) | ( (lv_stateRef_2_0= rulestate_ref ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:644:1: ( ( () otherlv_1= 'any' ) | ( (lv_stateRef_2_0= rulestate_ref ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:644:1: ( ( () otherlv_1= 'any' ) | ( (lv_stateRef_2_0= rulestate_ref ) ) )
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
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:644:2: ( () otherlv_1= 'any' )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:644:2: ( () otherlv_1= 'any' )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:644:3: () otherlv_1= 'any'
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:644:3: ()
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:645:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getState_condAccess().getAnystateAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_rulestate_cond1331); 

                        	newLeafNode(otherlv_1, grammarAccess.getState_condAccess().getAnyKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:655:6: ( (lv_stateRef_2_0= rulestate_ref ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:655:6: ( (lv_stateRef_2_0= rulestate_ref ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:656:1: (lv_stateRef_2_0= rulestate_ref )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:656:1: (lv_stateRef_2_0= rulestate_ref )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:657:3: lv_stateRef_2_0= rulestate_ref
                    {
                     
                    	        newCompositeNode(grammarAccess.getState_condAccess().getStateRefState_refParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulestate_ref_in_rulestate_cond1359);
                    lv_stateRef_2_0=rulestate_ref();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getState_condRule());
                    	        }
                           		set(
                           			current, 
                           			"stateRef",
                            		lv_stateRef_2_0, 
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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:681:1: entryRulestate_ref returns [EObject current=null] : iv_rulestate_ref= rulestate_ref EOF ;
    public final EObject entryRulestate_ref() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestate_ref = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:682:2: (iv_rulestate_ref= rulestate_ref EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:683:2: iv_rulestate_ref= rulestate_ref EOF
            {
             newCompositeNode(grammarAccess.getState_refRule()); 
            pushFollow(FOLLOW_rulestate_ref_in_entryRulestate_ref1395);
            iv_rulestate_ref=rulestate_ref();

            state._fsp--;

             current =iv_rulestate_ref; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestate_ref1405); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:690:1: rulestate_ref returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulestate_ref() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:693:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:694:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:694:1: ( (otherlv_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:695:1: (otherlv_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:695:1: (otherlv_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:696:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getState_refRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulestate_ref1449); 

            		newLeafNode(otherlv_0, grammarAccess.getState_refAccess().getStateRefStateCrossReference_0()); 
            	

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
            pushFollow(FOLLOW_ruleaction_cond_in_entryRuleaction_cond1484);
            iv_ruleaction_cond=ruleaction_cond();

            state._fsp--;

             current =iv_ruleaction_cond; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleaction_cond1494); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:724:1: ruleaction_cond returns [EObject current=null] : ( ( () otherlv_1= 'any' ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleaction_cond() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:727:28: ( ( ( () otherlv_1= 'any' ) | ( (otherlv_2= RULE_ID ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:728:1: ( ( () otherlv_1= 'any' ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:728:1: ( ( () otherlv_1= 'any' ) | ( (otherlv_2= RULE_ID ) ) )
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

                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleaction_cond1541); 

                        	newLeafNode(otherlv_1, grammarAccess.getAction_condAccess().getAnyKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:739:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:739:6: ( (otherlv_2= RULE_ID ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:740:1: (otherlv_2= RULE_ID )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:740:1: (otherlv_2= RULE_ID )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:741:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAction_condRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleaction_cond1568); 

                    		newLeafNode(otherlv_2, grammarAccess.getAction_condAccess().getActionRefLabelCrossReference_1_0()); 
                    	

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:760:1: entryRuleagent returns [EObject current=null] : iv_ruleagent= ruleagent EOF ;
    public final EObject entryRuleagent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleagent = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:761:2: (iv_ruleagent= ruleagent EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:762:2: iv_ruleagent= ruleagent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_ruleagent_in_entryRuleagent1604);
            iv_ruleagent=ruleagent();

            state._fsp--;

             current =iv_ruleagent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleagent1614); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:769:1: ruleagent returns [EObject current=null] : (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}' ) ;
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
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:772:28: ( (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}' ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:773:1: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}' )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:773:1: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}' )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:773:3: otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleagent1651); 

                	newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:777:1: ( (lv_name_1_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:778:1: (lv_name_1_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:778:1: (lv_name_1_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:779:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleagent1668); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleagent1685); 

                	newLeafNode(otherlv_2, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleagent1697); 

                	newLeafNode(otherlv_3, grammarAccess.getAgentAccess().getActionsKeyword_3());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:803:1: ( (lv_act_4_0= rulelabel ) )+
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
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:804:1: (lv_act_4_0= rulelabel )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:804:1: (lv_act_4_0= rulelabel )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:805:3: lv_act_4_0= rulelabel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAgentAccess().getActLabelParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulelabel_in_ruleagent1718);
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

            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:821:3: ( (lv_s_5_0= rulestate ) )+
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
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:822:1: (lv_s_5_0= rulestate )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:822:1: (lv_s_5_0= rulestate )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:823:3: lv_s_5_0= rulestate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAgentAccess().getSStateParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulestate_in_ruleagent1740);
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

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleagent1753); 

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:851:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:852:2: (iv_rulelabel= rulelabel EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:853:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel1789);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel1799); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:860:1: rulelabel returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:863:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:864:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:864:1: ( (lv_name_0_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:865:1: (lv_name_0_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:865:1: (lv_name_0_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:866:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulelabel1840); 

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:890:1: entryRulestate returns [EObject current=null] : iv_rulestate= rulestate EOF ;
    public final EObject entryRulestate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestate = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:891:2: (iv_rulestate= rulestate EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:892:2: iv_rulestate= rulestate EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_rulestate_in_entryRulestate1880);
            iv_rulestate=rulestate();

            state._fsp--;

             current =iv_rulestate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestate1890); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:899:1: rulestate returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneousAct_3_0= ruleaction ) )+ otherlv_4= '}' ) ;
    public final EObject rulestate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_spontaneousAct_3_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:902:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneousAct_3_0= ruleaction ) )+ otherlv_4= '}' ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:903:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneousAct_3_0= ruleaction ) )+ otherlv_4= '}' )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:903:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneousAct_3_0= ruleaction ) )+ otherlv_4= '}' )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:903:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneousAct_3_0= ruleaction ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_rulestate1927); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:907:1: ( (lv_name_1_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:908:1: (lv_name_1_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:908:1: (lv_name_1_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:909:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulestate1944); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulestate1961); 

                	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:929:1: ( (lv_spontaneousAct_3_0= ruleaction ) )+
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
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:930:1: (lv_spontaneousAct_3_0= ruleaction )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:930:1: (lv_spontaneousAct_3_0= ruleaction )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:931:3: lv_spontaneousAct_3_0= ruleaction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getSpontaneousActActionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleaction_in_rulestate1982);
            	    lv_spontaneousAct_3_0=ruleaction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"spontaneousAct",
            	            		lv_spontaneousAct_3_0, 
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

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulestate1995); 

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


    // $ANTLR start "entryRuleExpression"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:959:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:960:2: (iv_ruleExpression= ruleExpression EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:961:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2031);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2041); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:968:1: ruleExpression returns [EObject current=null] : this_SummationSubtraction_0= ruleSummationSubtraction ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SummationSubtraction_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:971:28: (this_SummationSubtraction_0= ruleSummationSubtraction )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:973:5: this_SummationSubtraction_0= ruleSummationSubtraction
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getSummationSubtractionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleSummationSubtraction_in_ruleExpression2087);
            this_SummationSubtraction_0=ruleSummationSubtraction();

            state._fsp--;

             
                    current = this_SummationSubtraction_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSummationSubtraction"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:989:1: entryRuleSummationSubtraction returns [EObject current=null] : iv_ruleSummationSubtraction= ruleSummationSubtraction EOF ;
    public final EObject entryRuleSummationSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSummationSubtraction = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:990:2: (iv_ruleSummationSubtraction= ruleSummationSubtraction EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:991:2: iv_ruleSummationSubtraction= ruleSummationSubtraction EOF
            {
             newCompositeNode(grammarAccess.getSummationSubtractionRule()); 
            pushFollow(FOLLOW_ruleSummationSubtraction_in_entryRuleSummationSubtraction2121);
            iv_ruleSummationSubtraction=ruleSummationSubtraction();

            state._fsp--;

             current =iv_ruleSummationSubtraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummationSubtraction2131); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSummationSubtraction"


    // $ANTLR start "ruleSummationSubtraction"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:998:1: ruleSummationSubtraction returns [EObject current=null] : (this_MultiplicationDivision_0= ruleMultiplicationDivision ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSummationSubtraction ) ) )? ) ;
    public final EObject ruleSummationSubtraction() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultiplicationDivision_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1001:28: ( (this_MultiplicationDivision_0= ruleMultiplicationDivision ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSummationSubtraction ) ) )? ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1002:1: (this_MultiplicationDivision_0= ruleMultiplicationDivision ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSummationSubtraction ) ) )? )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1002:1: (this_MultiplicationDivision_0= ruleMultiplicationDivision ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSummationSubtraction ) ) )? )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1003:5: this_MultiplicationDivision_0= ruleMultiplicationDivision ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSummationSubtraction ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getSummationSubtractionAccess().getMultiplicationDivisionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplicationDivision_in_ruleSummationSubtraction2178);
            this_MultiplicationDivision_0=ruleMultiplicationDivision();

            state._fsp--;

             
                    current = this_MultiplicationDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1011:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSummationSubtraction ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=29 && LA13_0<=30)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1011:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleSummationSubtraction ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1011:2: ()
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1012:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0(),
                                current);
                        

                    }

                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1017:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1018:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1018:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1019:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1019:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==29) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==30) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1020:3: lv_op_2_1= '+'
                            {
                            lv_op_2_1=(Token)match(input,29,FOLLOW_29_in_ruleSummationSubtraction2207); 

                                    newLeafNode(lv_op_2_1, grammarAccess.getSummationSubtractionAccess().getOpPlusSignKeyword_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSummationSubtractionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1032:8: lv_op_2_2= '-'
                            {
                            lv_op_2_2=(Token)match(input,30,FOLLOW_30_in_ruleSummationSubtraction2236); 

                                    newLeafNode(lv_op_2_2, grammarAccess.getSummationSubtractionAccess().getOpHyphenMinusKeyword_1_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSummationSubtractionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1047:2: ( (lv_right_3_0= ruleSummationSubtraction ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1048:1: (lv_right_3_0= ruleSummationSubtraction )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1048:1: (lv_right_3_0= ruleSummationSubtraction )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1049:3: lv_right_3_0= ruleSummationSubtraction
                    {
                     
                    	        newCompositeNode(grammarAccess.getSummationSubtractionAccess().getRightSummationSubtractionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSummationSubtraction_in_ruleSummationSubtraction2273);
                    lv_right_3_0=ruleSummationSubtraction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSummationSubtractionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"SummationSubtraction");
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
    // $ANTLR end "ruleSummationSubtraction"


    // $ANTLR start "entryRuleMultiplicationDivision"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1073:1: entryRuleMultiplicationDivision returns [EObject current=null] : iv_ruleMultiplicationDivision= ruleMultiplicationDivision EOF ;
    public final EObject entryRuleMultiplicationDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationDivision = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1074:2: (iv_ruleMultiplicationDivision= ruleMultiplicationDivision EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1075:2: iv_ruleMultiplicationDivision= ruleMultiplicationDivision EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationDivisionRule()); 
            pushFollow(FOLLOW_ruleMultiplicationDivision_in_entryRuleMultiplicationDivision2311);
            iv_ruleMultiplicationDivision=ruleMultiplicationDivision();

            state._fsp--;

             current =iv_ruleMultiplicationDivision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationDivision2321); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicationDivision"


    // $ANTLR start "ruleMultiplicationDivision"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1082:1: ruleMultiplicationDivision returns [EObject current=null] : (this_BaseExpression_0= ruleBaseExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )? ) ;
    public final EObject ruleMultiplicationDivision() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_BaseExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1085:28: ( (this_BaseExpression_0= ruleBaseExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )? ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1086:1: (this_BaseExpression_0= ruleBaseExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )? )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1086:1: (this_BaseExpression_0= ruleBaseExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )? )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1087:5: this_BaseExpression_0= ruleBaseExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationDivisionAccess().getBaseExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBaseExpression_in_ruleMultiplicationDivision2368);
            this_BaseExpression_0=ruleBaseExpression();

            state._fsp--;

             
                    current = this_BaseExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1095:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=31 && LA15_0<=32)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1095:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleMultiplicationDivision ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1095:2: ()
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1096:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0(),
                                current);
                        

                    }

                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1101:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1102:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1102:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1103:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1103:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==31) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==32) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1104:3: lv_op_2_1= '*'
                            {
                            lv_op_2_1=(Token)match(input,31,FOLLOW_31_in_ruleMultiplicationDivision2397); 

                                    newLeafNode(lv_op_2_1, grammarAccess.getMultiplicationDivisionAccess().getOpAsteriskKeyword_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMultiplicationDivisionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1116:8: lv_op_2_2= '/'
                            {
                            lv_op_2_2=(Token)match(input,32,FOLLOW_32_in_ruleMultiplicationDivision2426); 

                                    newLeafNode(lv_op_2_2, grammarAccess.getMultiplicationDivisionAccess().getOpSolidusKeyword_1_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMultiplicationDivisionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1131:2: ( (lv_right_3_0= ruleMultiplicationDivision ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1132:1: (lv_right_3_0= ruleMultiplicationDivision )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1132:1: (lv_right_3_0= ruleMultiplicationDivision )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1133:3: lv_right_3_0= ruleMultiplicationDivision
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultiplicationDivisionAccess().getRightMultiplicationDivisionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultiplicationDivision_in_ruleMultiplicationDivision2463);
                    lv_right_3_0=ruleMultiplicationDivision();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultiplicationDivisionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"MultiplicationDivision");
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
    // $ANTLR end "ruleMultiplicationDivision"


    // $ANTLR start "entryRuleBaseExpression"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1157:1: entryRuleBaseExpression returns [EObject current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final EObject entryRuleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpression = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1158:2: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1159:2: iv_ruleBaseExpression= ruleBaseExpression EOF
            {
             newCompositeNode(grammarAccess.getBaseExpressionRule()); 
            pushFollow(FOLLOW_ruleBaseExpression_in_entryRuleBaseExpression2501);
            iv_ruleBaseExpression=ruleBaseExpression();

            state._fsp--;

             current =iv_ruleBaseExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseExpression2511); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseExpression"


    // $ANTLR start "ruleBaseExpression"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1166:1: ruleBaseExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_stateRef_5_0= rulestate_ref ) ) ) | (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) ) ;
    public final EObject ruleBaseExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_stateRef_5_0 = null;

        EObject this_Expression_7 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1169:28: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_stateRef_5_0= rulestate_ref ) ) ) | (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1170:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_stateRef_5_0= rulestate_ref ) ) ) | (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1170:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_stateRef_5_0= rulestate_ref ) ) ) | (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt16=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt16=2;
                }
                break;
            case RULE_ID:
                {
                alt16=3;
                }
                break;
            case 33:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1170:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1170:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1170:3: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1170:3: ()
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1171:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBaseExpressionAccess().getIntExpressionAction_0_0(),
                                current);
                        

                    }

                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1176:2: ( (lv_value_1_0= RULE_INT ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1177:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1177:1: (lv_value_1_0= RULE_INT )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1178:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBaseExpression2563); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getBaseExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBaseExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1195:6: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1195:6: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1195:7: () ( (lv_value_3_0= RULE_FLOAT ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1195:7: ()
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1196:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBaseExpressionAccess().getFloatExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1201:2: ( (lv_value_3_0= RULE_FLOAT ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1202:1: (lv_value_3_0= RULE_FLOAT )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1202:1: (lv_value_3_0= RULE_FLOAT )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1203:3: lv_value_3_0= RULE_FLOAT
                    {
                    lv_value_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleBaseExpression2602); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getBaseExpressionAccess().getValueFLOATTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBaseExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"FLOAT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1220:6: ( () ( (lv_stateRef_5_0= rulestate_ref ) ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1220:6: ( () ( (lv_stateRef_5_0= rulestate_ref ) ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1220:7: () ( (lv_stateRef_5_0= rulestate_ref ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1220:7: ()
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1221:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBaseExpressionAccess().getReferenceAction_2_0(),
                                current);
                        

                    }

                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1226:2: ( (lv_stateRef_5_0= rulestate_ref ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1227:1: (lv_stateRef_5_0= rulestate_ref )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1227:1: (lv_stateRef_5_0= rulestate_ref )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1228:3: lv_stateRef_5_0= rulestate_ref
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseExpressionAccess().getStateRefState_refParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulestate_ref_in_ruleBaseExpression2645);
                    lv_stateRef_5_0=rulestate_ref();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBaseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"stateRef",
                            		lv_stateRef_5_0, 
                            		"state_ref");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1245:6: (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1245:6: (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1245:8: otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleBaseExpression2665); 

                        	newLeafNode(otherlv_6, grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getBaseExpressionAccess().getExpressionParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleBaseExpression2687);
                    this_Expression_7=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_7; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleBaseExpression2698); 

                        	newLeafNode(otherlv_8, grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_3_2());
                        

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
    // $ANTLR end "ruleBaseExpression"


    // $ANTLR start "entryRuleaction"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1270:1: entryRuleaction returns [EObject current=null] : iv_ruleaction= ruleaction EOF ;
    public final EObject entryRuleaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaction = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1271:2: (iv_ruleaction= ruleaction EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1272:2: iv_ruleaction= ruleaction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleaction_in_entryRuleaction2735);
            iv_ruleaction=ruleaction();

            state._fsp--;

             current =iv_ruleaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleaction2745); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1279:1: ruleaction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= ruleExpression ) ) ) ;
    public final EObject ruleaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_localRate_4_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1282:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= ruleExpression ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1283:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= ruleExpression ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1283:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= ruleExpression ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1283:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= ruleExpression ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1283:2: ( (otherlv_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1284:1: (otherlv_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1284:1: (otherlv_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1285:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleaction2790); 

            		newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActRefLabelCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleaction2802); 

                	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1300:1: ( (otherlv_2= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1301:1: (otherlv_2= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1301:1: (otherlv_2= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1302:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleaction2822); 

            		newLeafNode(otherlv_2, grammarAccess.getActionAccess().getStateRefStateCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleaction2834); 

                	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getColonKeyword_3());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1317:1: ( (lv_localRate_4_0= ruleExpression ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1318:1: (lv_localRate_4_0= ruleExpression )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1318:1: (lv_localRate_4_0= ruleExpression )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1319:3: lv_localRate_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getLocalRateExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleaction2855);
            lv_localRate_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"localRate",
                    		lv_localRate_4_0, 
                    		"Expression");
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
    public static final BitSet FOLLOW_rulestate_ref_in_rulestateInit779 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulestateInit791 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_ruleExpression_in_rulestateInit812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegl_tran_in_entryRulegl_tran848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegl_tran858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulegl_tran895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulegl_tran912 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulegl_tran929 = new BitSet(new long[]{0x0000000002C00010L});
    public static final BitSet FOLLOW_ruleloc_tran_in_rulegl_tran950 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_rulegl_tran963 = new BitSet(new long[]{0x0000000002C00010L});
    public static final BitSet FOLLOW_ruleloc_tran_in_rulegl_tran984 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_rulegl_tran998 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_ruleExpression_in_rulegl_tran1019 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulegl_tran1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleloc_tran_in_entryRuleloc_tran1067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleloc_tran1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleloc_tran1115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleloc_tran1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleloc_tran1155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleloc_tran1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestate_cond_in_ruleloc_tran1204 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleloc_tran1216 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_ruleaction_cond_in_ruleloc_tran1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestate_cond_in_entryRulestate_cond1274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestate_cond1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulestate_cond1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestate_ref_in_rulestate_cond1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestate_ref_in_entryRulestate_ref1395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestate_ref1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulestate_ref1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaction_cond_in_entryRuleaction_cond1484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaction_cond1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleaction_cond1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleaction_cond1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleagent_in_entryRuleagent1604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleagent1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleagent1651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleagent1668 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleagent1685 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleagent1697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulelabel_in_ruleagent1718 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rulestate_in_ruleagent1740 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16_in_ruleagent1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel1789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulelabel1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestate_in_entryRulestate1880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestate1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulestate1927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulestate1944 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulestate1961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleaction_in_rulestate1982 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_rulestate1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummationSubtraction_in_ruleExpression2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummationSubtraction_in_entryRuleSummationSubtraction2121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummationSubtraction2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationDivision_in_ruleSummationSubtraction2178 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_29_in_ruleSummationSubtraction2207 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_30_in_ruleSummationSubtraction2236 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_ruleSummationSubtraction_in_ruleSummationSubtraction2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationDivision_in_entryRuleMultiplicationDivision2311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationDivision2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseExpression_in_ruleMultiplicationDivision2368 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_31_in_ruleMultiplicationDivision2397 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_32_in_ruleMultiplicationDivision2426 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_ruleMultiplicationDivision_in_ruleMultiplicationDivision2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseExpression_in_entryRuleBaseExpression2501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseExpression2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBaseExpression2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleBaseExpression2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestate_ref_in_ruleBaseExpression2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBaseExpression2665 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBaseExpression2687 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleBaseExpression2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaction_in_entryRuleaction2735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaction2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleaction2790 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleaction2802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleaction2822 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleaction2834 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleaction2855 = new BitSet(new long[]{0x0000000000000002L});

}
