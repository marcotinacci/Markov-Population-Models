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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'const integer'", "'='", "'const real'", "'agent'", "'{'", "'actions'", "'}'", "'state'", "'-->'", "':'", "'population'", "'init'", "'||'", "','", "'transition'", "'&'", "'=>'", "'new'", "'kill'", "'any'", "'or'"
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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:76:1: rulemain returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_constDef_1_0= ruleconstant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_populationDef_2_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_3_0= ruleagent ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject rulemain() throws RecognitionException {
        EObject current = null;

        EObject lv_constDef_1_0 = null;

        EObject lv_populationDef_2_0 = null;

        EObject lv_agentDef_3_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:79:28: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_constDef_1_0= ruleconstant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_populationDef_2_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_3_0= ruleagent ) ) ) ) ) )+ {...}?) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:80:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_constDef_1_0= ruleconstant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_populationDef_2_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_3_0= ruleagent ) ) ) ) ) )+ {...}?) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:80:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_constDef_1_0= ruleconstant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_populationDef_2_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_3_0= ruleagent ) ) ) ) ) )+ {...}?) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:82:1: ( ( ( ({...}? => ( ({...}? => ( (lv_constDef_1_0= ruleconstant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_populationDef_2_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_3_0= ruleagent ) ) ) ) ) )+ {...}?) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:82:1: ( ( ( ({...}? => ( ({...}? => ( (lv_constDef_1_0= ruleconstant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_populationDef_2_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_3_0= ruleagent ) ) ) ) ) )+ {...}?) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:83:2: ( ( ({...}? => ( ({...}? => ( (lv_constDef_1_0= ruleconstant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_populationDef_2_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_3_0= ruleagent ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMainAccess().getUnorderedGroup());
            	
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:86:2: ( ( ({...}? => ( ({...}? => ( (lv_constDef_1_0= ruleconstant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_populationDef_2_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_3_0= ruleagent ) ) ) ) ) )+ {...}?)
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:87:3: ( ({...}? => ( ({...}? => ( (lv_constDef_1_0= ruleconstant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_populationDef_2_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_3_0= ruleagent ) ) ) ) ) )+ {...}?
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:87:3: ( ({...}? => ( ({...}? => ( (lv_constDef_1_0= ruleconstant ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_populationDef_2_0= rulepopulation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_agentDef_3_0= ruleagent ) ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==14) && getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup(), 1) ) {
                    alt2=2;
                }
                else if ( LA2_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup(), 2) ) {
                    alt2=3;
                }


                switch (alt2) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:89:4: ({...}? => ( ({...}? => ( (lv_constDef_1_0= ruleconstant ) ) )+ ) )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:89:4: ({...}? => ( ({...}? => ( (lv_constDef_1_0= ruleconstant ) ) )+ ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:90:5: {...}? => ( ({...}? => ( (lv_constDef_1_0= ruleconstant ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "rulemain", "getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:90:99: ( ({...}? => ( (lv_constDef_1_0= ruleconstant ) ) )+ )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:91:6: ({...}? => ( (lv_constDef_1_0= ruleconstant ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMainAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:94:6: ({...}? => ( (lv_constDef_1_0= ruleconstant ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==12) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }
            	        else if ( (LA1_0==14) ) {
            	            int LA1_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:94:7: {...}? => ( (lv_constDef_1_0= ruleconstant ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulemain", "true");
            	    	    }
            	    	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:94:16: ( (lv_constDef_1_0= ruleconstant ) )
            	    	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:95:1: (lv_constDef_1_0= ruleconstant )
            	    	    {
            	    	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:95:1: (lv_constDef_1_0= ruleconstant )
            	    	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:96:3: lv_constDef_1_0= ruleconstant
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getMainAccess().getConstDefConstantParserRuleCall_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleconstant_in_rulemain175);
            	    	    lv_constDef_1_0=ruleconstant();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getMainRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"constDef",
            	    	            		lv_constDef_1_0, 
            	    	            		"constant");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMainAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:119:4: ({...}? => ( ({...}? => ( (lv_populationDef_2_0= rulepopulation ) ) ) ) )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:119:4: ({...}? => ( ({...}? => ( (lv_populationDef_2_0= rulepopulation ) ) ) ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:120:5: {...}? => ( ({...}? => ( (lv_populationDef_2_0= rulepopulation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "rulemain", "getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:120:99: ( ({...}? => ( (lv_populationDef_2_0= rulepopulation ) ) ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:121:6: ({...}? => ( (lv_populationDef_2_0= rulepopulation ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMainAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:124:6: ({...}? => ( (lv_populationDef_2_0= rulepopulation ) ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:124:7: {...}? => ( (lv_populationDef_2_0= rulepopulation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulemain", "true");
            	    }
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:124:16: ( (lv_populationDef_2_0= rulepopulation ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:125:1: (lv_populationDef_2_0= rulepopulation )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:125:1: (lv_populationDef_2_0= rulepopulation )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:126:3: lv_populationDef_2_0= rulepopulation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMainAccess().getPopulationDefPopulationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulepopulation_in_rulemain251);
            	    lv_populationDef_2_0=rulepopulation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMainRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"populationDef",
            	            		lv_populationDef_2_0, 
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
            	case 3 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:149:4: ({...}? => ( ({...}? => ( (lv_agentDef_3_0= ruleagent ) ) ) ) )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:149:4: ({...}? => ( ({...}? => ( (lv_agentDef_3_0= ruleagent ) ) ) ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:150:5: {...}? => ( ({...}? => ( (lv_agentDef_3_0= ruleagent ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "rulemain", "getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:150:99: ( ({...}? => ( (lv_agentDef_3_0= ruleagent ) ) ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:151:6: ({...}? => ( (lv_agentDef_3_0= ruleagent ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMainAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:154:6: ({...}? => ( (lv_agentDef_3_0= ruleagent ) ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:154:7: {...}? => ( (lv_agentDef_3_0= ruleagent ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulemain", "true");
            	    }
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:154:16: ( (lv_agentDef_3_0= ruleagent ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:155:1: (lv_agentDef_3_0= ruleagent )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:155:1: (lv_agentDef_3_0= ruleagent )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:156:3: lv_agentDef_3_0= ruleagent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMainAccess().getAgentDefAgentParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleagent_in_rulemain326);
            	    lv_agentDef_3_0=ruleagent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMainRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"agentDef",
            	            		lv_agentDef_3_0, 
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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


    // $ANTLR start "entryRuleconstant"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:195:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:196:2: (iv_ruleconstant= ruleconstant EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:197:2: iv_ruleconstant= ruleconstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleconstant_in_entryRuleconstant407);
            iv_ruleconstant=ruleconstant();

            state._fsp--;

             current =iv_ruleconstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant417); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:204:1: ruleconstant returns [EObject current=null] : ( (otherlv_0= 'const integer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_constINT_3_0= RULE_INT ) ) ) | (otherlv_4= 'const real' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_constFLOAT_7_0= RULE_FLOAT ) ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_constINT_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_constFLOAT_7_0=null;

         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:207:28: ( ( (otherlv_0= 'const integer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_constINT_3_0= RULE_INT ) ) ) | (otherlv_4= 'const real' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_constFLOAT_7_0= RULE_FLOAT ) ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:208:1: ( (otherlv_0= 'const integer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_constINT_3_0= RULE_INT ) ) ) | (otherlv_4= 'const real' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_constFLOAT_7_0= RULE_FLOAT ) ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:208:1: ( (otherlv_0= 'const integer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_constINT_3_0= RULE_INT ) ) ) | (otherlv_4= 'const real' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_constFLOAT_7_0= RULE_FLOAT ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:208:2: (otherlv_0= 'const integer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_constINT_3_0= RULE_INT ) ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:208:2: (otherlv_0= 'const integer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_constINT_3_0= RULE_INT ) ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:208:4: otherlv_0= 'const integer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_constINT_3_0= RULE_INT ) )
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleconstant455); 

                        	newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstIntegerKeyword_0_0());
                        
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:212:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:213:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:213:1: (lv_name_1_0= RULE_ID )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:214:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleconstant472); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleconstant489); 

                        	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getEqualsSignKeyword_0_2());
                        
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:234:1: ( (lv_constINT_3_0= RULE_INT ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:235:1: (lv_constINT_3_0= RULE_INT )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:235:1: (lv_constINT_3_0= RULE_INT )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:236:3: lv_constINT_3_0= RULE_INT
                    {
                    lv_constINT_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleconstant506); 

                    			newLeafNode(lv_constINT_3_0, grammarAccess.getConstantAccess().getConstINTINTTerminalRuleCall_0_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"constINT",
                            		lv_constINT_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:253:6: (otherlv_4= 'const real' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_constFLOAT_7_0= RULE_FLOAT ) ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:253:6: (otherlv_4= 'const real' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_constFLOAT_7_0= RULE_FLOAT ) ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:253:8: otherlv_4= 'const real' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_constFLOAT_7_0= RULE_FLOAT ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleconstant531); 

                        	newLeafNode(otherlv_4, grammarAccess.getConstantAccess().getConstRealKeyword_1_0());
                        
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:257:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:258:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:258:1: (lv_name_5_0= RULE_ID )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:259:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleconstant548); 

                    			newLeafNode(lv_name_5_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_5_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleconstant565); 

                        	newLeafNode(otherlv_6, grammarAccess.getConstantAccess().getEqualsSignKeyword_1_2());
                        
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:279:1: ( (lv_constFLOAT_7_0= RULE_FLOAT ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:280:1: (lv_constFLOAT_7_0= RULE_FLOAT )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:280:1: (lv_constFLOAT_7_0= RULE_FLOAT )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:281:3: lv_constFLOAT_7_0= RULE_FLOAT
                    {
                    lv_constFLOAT_7_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleconstant582); 

                    			newLeafNode(lv_constFLOAT_7_0, grammarAccess.getConstantAccess().getConstFLOATFLOATTerminalRuleCall_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"constFLOAT",
                            		lv_constFLOAT_7_0, 
                            		"FLOAT");
                    	    

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
    // $ANTLR end "ruleconstant"


    // $ANTLR start "entryRuleagent"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:305:1: entryRuleagent returns [EObject current=null] : iv_ruleagent= ruleagent EOF ;
    public final EObject entryRuleagent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleagent = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:306:2: (iv_ruleagent= ruleagent EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:307:2: iv_ruleagent= ruleagent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_ruleagent_in_entryRuleagent624);
            iv_ruleagent=ruleagent();

            state._fsp--;

             current =iv_ruleagent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleagent634); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:314:1: ruleagent returns [EObject current=null] : (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}' ) ;
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
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:317:28: ( (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}' ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:318:1: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}' )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:318:1: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}' )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:318:3: otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'actions' ( (lv_act_4_0= rulelabel ) )+ ( (lv_s_5_0= rulestate ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleagent671); 

                	newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:322:1: ( (lv_name_1_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:323:1: (lv_name_1_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:323:1: (lv_name_1_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:324:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleagent688); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleagent705); 

                	newLeafNode(otherlv_2, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleagent717); 

                	newLeafNode(otherlv_3, grammarAccess.getAgentAccess().getActionsKeyword_3());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:348:1: ( (lv_act_4_0= rulelabel ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:349:1: (lv_act_4_0= rulelabel )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:349:1: (lv_act_4_0= rulelabel )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:350:3: lv_act_4_0= rulelabel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAgentAccess().getActLabelParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulelabel_in_ruleagent738);
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:366:3: ( (lv_s_5_0= rulestate ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:367:1: (lv_s_5_0= rulestate )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:367:1: (lv_s_5_0= rulestate )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:368:3: lv_s_5_0= rulestate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAgentAccess().getSStateParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulestate_in_ruleagent760);
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleagent773); 

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:396:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:397:2: (iv_rulelabel= rulelabel EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:398:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel809);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel819); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:405:1: rulelabel returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:408:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:409:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:409:1: ( (lv_name_0_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:410:1: (lv_name_0_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:410:1: (lv_name_0_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:411:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulelabel860); 

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:435:1: entryRulestate returns [EObject current=null] : iv_rulestate= rulestate EOF ;
    public final EObject entryRulestate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestate = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:436:2: (iv_rulestate= rulestate EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:437:2: iv_rulestate= rulestate EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_rulestate_in_entryRulestate900);
            iv_rulestate=rulestate();

            state._fsp--;

             current =iv_rulestate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestate910); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:444:1: rulestate returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneousAct_3_0= ruleaction ) )+ otherlv_4= '}' ) ;
    public final EObject rulestate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_spontaneousAct_3_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:447:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneousAct_3_0= ruleaction ) )+ otherlv_4= '}' ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:448:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneousAct_3_0= ruleaction ) )+ otherlv_4= '}' )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:448:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneousAct_3_0= ruleaction ) )+ otherlv_4= '}' )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:448:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_spontaneousAct_3_0= ruleaction ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulestate947); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:452:1: ( (lv_name_1_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:453:1: (lv_name_1_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:453:1: (lv_name_1_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:454:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulestate964); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_rulestate981); 

                	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:474:1: ( (lv_spontaneousAct_3_0= ruleaction ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:475:1: (lv_spontaneousAct_3_0= ruleaction )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:475:1: (lv_spontaneousAct_3_0= ruleaction )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:476:3: lv_spontaneousAct_3_0= ruleaction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getSpontaneousActActionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleaction_in_rulestate1002);
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulestate1015); 

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:504:1: entryRuleaction returns [EObject current=null] : iv_ruleaction= ruleaction EOF ;
    public final EObject entryRuleaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaction = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:505:2: (iv_ruleaction= ruleaction EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:506:2: iv_ruleaction= ruleaction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleaction_in_entryRuleaction1051);
            iv_ruleaction=ruleaction();

            state._fsp--;

             current =iv_ruleaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleaction1061); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:513:1: ruleaction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= rulelocal_rate ) ) ) ;
    public final EObject ruleaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_localRate_4_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:516:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= rulelocal_rate ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:517:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= rulelocal_rate ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:517:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= rulelocal_rate ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:517:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '-->' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_localRate_4_0= rulelocal_rate ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:517:2: ( (otherlv_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:518:1: (otherlv_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:518:1: (otherlv_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:519:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleaction1106); 

            		newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActRefLabelCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleaction1118); 

                	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:534:1: ( (otherlv_2= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:535:1: (otherlv_2= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:535:1: (otherlv_2= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:536:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getActionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleaction1138); 

            		newLeafNode(otherlv_2, grammarAccess.getActionAccess().getStateRefStateCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleaction1150); 

                	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getColonKeyword_3());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:551:1: ( (lv_localRate_4_0= rulelocal_rate ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:552:1: (lv_localRate_4_0= rulelocal_rate )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:552:1: (lv_localRate_4_0= rulelocal_rate )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:553:3: lv_localRate_4_0= rulelocal_rate
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getLocalRateLocal_rateParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulelocal_rate_in_ruleaction1171);
            lv_localRate_4_0=rulelocal_rate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"localRate",
                    		lv_localRate_4_0, 
                    		"local_rate");
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


    // $ANTLR start "entryRulelocal_rate"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:577:1: entryRulelocal_rate returns [EObject current=null] : iv_rulelocal_rate= rulelocal_rate EOF ;
    public final EObject entryRulelocal_rate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelocal_rate = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:578:2: (iv_rulelocal_rate= rulelocal_rate EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:579:2: iv_rulelocal_rate= rulelocal_rate EOF
            {
             newCompositeNode(grammarAccess.getLocal_rateRule()); 
            pushFollow(FOLLOW_rulelocal_rate_in_entryRulelocal_rate1207);
            iv_rulelocal_rate=rulelocal_rate();

            state._fsp--;

             current =iv_rulelocal_rate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelocal_rate1217); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelocal_rate"


    // $ANTLR start "rulelocal_rate"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:586:1: rulelocal_rate returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_localRate_1_0= RULE_FLOAT ) ) ) ;
    public final EObject rulelocal_rate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_localRate_1_0=null;

         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:589:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_localRate_1_0= RULE_FLOAT ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:590:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_localRate_1_0= RULE_FLOAT ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:590:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_localRate_1_0= RULE_FLOAT ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_FLOAT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:590:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:590:2: ( (otherlv_0= RULE_ID ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:591:1: (otherlv_0= RULE_ID )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:591:1: (otherlv_0= RULE_ID )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:592:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLocal_rateRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulelocal_rate1262); 

                    		newLeafNode(otherlv_0, grammarAccess.getLocal_rateAccess().getConstRefConstantCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:604:6: ( (lv_localRate_1_0= RULE_FLOAT ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:604:6: ( (lv_localRate_1_0= RULE_FLOAT ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:605:1: (lv_localRate_1_0= RULE_FLOAT )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:605:1: (lv_localRate_1_0= RULE_FLOAT )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:606:3: lv_localRate_1_0= RULE_FLOAT
                    {
                    lv_localRate_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rulelocal_rate1285); 

                    			newLeafNode(lv_localRate_1_0, grammarAccess.getLocal_rateAccess().getLocalRateFLOATTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLocal_rateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"localRate",
                            		lv_localRate_1_0, 
                            		"FLOAT");
                    	    

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
    // $ANTLR end "rulelocal_rate"


    // $ANTLR start "entryRulepopulation"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:630:1: entryRulepopulation returns [EObject current=null] : iv_rulepopulation= rulepopulation EOF ;
    public final EObject entryRulepopulation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepopulation = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:631:2: (iv_rulepopulation= rulepopulation EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:632:2: iv_rulepopulation= rulepopulation EOF
            {
             newCompositeNode(grammarAccess.getPopulationRule()); 
            pushFollow(FOLLOW_rulepopulation_in_entryRulepopulation1326);
            iv_rulepopulation=rulepopulation();

            state._fsp--;

             current =iv_rulepopulation; 
            match(input,EOF,FOLLOW_EOF_in_entryRulepopulation1336); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:639:1: rulepopulation returns [EObject current=null] : (otherlv_0= 'population' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'init' ( (lv_agents_4_0= ruleinit ) ) (otherlv_5= '||' ( (lv_agents_6_0= ruleinit ) ) )* ( (lv_tran_7_0= rulegl_tran ) )+ otherlv_8= '}' ) ;
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
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:642:28: ( (otherlv_0= 'population' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'init' ( (lv_agents_4_0= ruleinit ) ) (otherlv_5= '||' ( (lv_agents_6_0= ruleinit ) ) )* ( (lv_tran_7_0= rulegl_tran ) )+ otherlv_8= '}' ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:643:1: (otherlv_0= 'population' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'init' ( (lv_agents_4_0= ruleinit ) ) (otherlv_5= '||' ( (lv_agents_6_0= ruleinit ) ) )* ( (lv_tran_7_0= rulegl_tran ) )+ otherlv_8= '}' )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:643:1: (otherlv_0= 'population' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'init' ( (lv_agents_4_0= ruleinit ) ) (otherlv_5= '||' ( (lv_agents_6_0= ruleinit ) ) )* ( (lv_tran_7_0= rulegl_tran ) )+ otherlv_8= '}' )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:643:3: otherlv_0= 'population' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'init' ( (lv_agents_4_0= ruleinit ) ) (otherlv_5= '||' ( (lv_agents_6_0= ruleinit ) ) )* ( (lv_tran_7_0= rulegl_tran ) )+ otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_rulepopulation1373); 

                	newLeafNode(otherlv_0, grammarAccess.getPopulationAccess().getPopulationKeyword_0());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:647:1: ( (lv_name_1_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:648:1: (lv_name_1_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:648:1: (lv_name_1_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:649:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepopulation1390); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_rulepopulation1407); 

                	newLeafNode(otherlv_2, grammarAccess.getPopulationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,23,FOLLOW_23_in_rulepopulation1419); 

                	newLeafNode(otherlv_3, grammarAccess.getPopulationAccess().getInitKeyword_3());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:673:1: ( (lv_agents_4_0= ruleinit ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:674:1: (lv_agents_4_0= ruleinit )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:674:1: (lv_agents_4_0= ruleinit )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:675:3: lv_agents_4_0= ruleinit
            {
             
            	        newCompositeNode(grammarAccess.getPopulationAccess().getAgentsInitParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleinit_in_rulepopulation1440);
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

            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:691:2: (otherlv_5= '||' ( (lv_agents_6_0= ruleinit ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:691:4: otherlv_5= '||' ( (lv_agents_6_0= ruleinit ) )
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_rulepopulation1453); 

            	        	newLeafNode(otherlv_5, grammarAccess.getPopulationAccess().getVerticalLineVerticalLineKeyword_5_0());
            	        
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:695:1: ( (lv_agents_6_0= ruleinit ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:696:1: (lv_agents_6_0= ruleinit )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:696:1: (lv_agents_6_0= ruleinit )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:697:3: lv_agents_6_0= ruleinit
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPopulationAccess().getAgentsInitParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleinit_in_rulepopulation1474);
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
            	    break loop8;
                }
            } while (true);

            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:713:4: ( (lv_tran_7_0= rulegl_tran ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:714:1: (lv_tran_7_0= rulegl_tran )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:714:1: (lv_tran_7_0= rulegl_tran )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:715:3: lv_tran_7_0= rulegl_tran
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPopulationAccess().getTranGl_tranParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulegl_tran_in_rulepopulation1497);
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_rulepopulation1510); 

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:743:1: entryRuleinit returns [EObject current=null] : iv_ruleinit= ruleinit EOF ;
    public final EObject entryRuleinit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinit = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:744:2: (iv_ruleinit= ruleinit EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:745:2: iv_ruleinit= ruleinit EOF
            {
             newCompositeNode(grammarAccess.getInitRule()); 
            pushFollow(FOLLOW_ruleinit_in_entryRuleinit1546);
            iv_ruleinit=ruleinit();

            state._fsp--;

             current =iv_ruleinit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinit1556); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:752:1: ruleinit returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_states_2_0= rulestateInit ) ) (otherlv_3= ',' ( (lv_states_4_0= rulestateInit ) ) )* otherlv_5= '}' ) ;
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
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:755:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_states_2_0= rulestateInit ) ) (otherlv_3= ',' ( (lv_states_4_0= rulestateInit ) ) )* otherlv_5= '}' ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:756:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_states_2_0= rulestateInit ) ) (otherlv_3= ',' ( (lv_states_4_0= rulestateInit ) ) )* otherlv_5= '}' )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:756:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_states_2_0= rulestateInit ) ) (otherlv_3= ',' ( (lv_states_4_0= rulestateInit ) ) )* otherlv_5= '}' )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:756:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_states_2_0= rulestateInit ) ) (otherlv_3= ',' ( (lv_states_4_0= rulestateInit ) ) )* otherlv_5= '}'
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:756:2: ( (otherlv_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:757:1: (otherlv_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:757:1: (otherlv_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:758:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInitRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleinit1601); 

            		newLeafNode(otherlv_0, grammarAccess.getInitAccess().getAgentRefAgentCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleinit1613); 

                	newLeafNode(otherlv_1, grammarAccess.getInitAccess().getLeftCurlyBracketKeyword_1());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:773:1: ( (lv_states_2_0= rulestateInit ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:774:1: (lv_states_2_0= rulestateInit )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:774:1: (lv_states_2_0= rulestateInit )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:775:3: lv_states_2_0= rulestateInit
            {
             
            	        newCompositeNode(grammarAccess.getInitAccess().getStatesStateInitParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulestateInit_in_ruleinit1634);
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

            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:791:2: (otherlv_3= ',' ( (lv_states_4_0= rulestateInit ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:791:4: otherlv_3= ',' ( (lv_states_4_0= rulestateInit ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleinit1647); 

            	        	newLeafNode(otherlv_3, grammarAccess.getInitAccess().getCommaKeyword_3_0());
            	        
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:795:1: ( (lv_states_4_0= rulestateInit ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:796:1: (lv_states_4_0= rulestateInit )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:796:1: (lv_states_4_0= rulestateInit )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:797:3: lv_states_4_0= rulestateInit
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInitAccess().getStatesStateInitParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulestateInit_in_ruleinit1668);
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
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleinit1682); 

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:825:1: entryRulestateInit returns [EObject current=null] : iv_rulestateInit= rulestateInit EOF ;
    public final EObject entryRulestateInit() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestateInit = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:826:2: (iv_rulestateInit= rulestateInit EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:827:2: iv_rulestateInit= rulestateInit EOF
            {
             newCompositeNode(grammarAccess.getStateInitRule()); 
            pushFollow(FOLLOW_rulestateInit_in_entryRulestateInit1718);
            iv_rulestateInit=rulestateInit();

            state._fsp--;

             current =iv_rulestateInit; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestateInit1728); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:834:1: rulestateInit returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_card_2_0= RULE_INT ) ) ) ;
    public final EObject rulestateInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_card_2_0=null;

         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:837:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_card_2_0= RULE_INT ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:838:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_card_2_0= RULE_INT ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:838:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_card_2_0= RULE_INT ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:838:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_card_2_0= RULE_INT ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:838:2: ( (otherlv_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:839:1: (otherlv_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:839:1: (otherlv_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:840:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStateInitRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulestateInit1773); 

            		newLeafNode(otherlv_0, grammarAccess.getStateInitAccess().getStateRefStateCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_rulestateInit1785); 

                	newLeafNode(otherlv_1, grammarAccess.getStateInitAccess().getEqualsSignKeyword_1());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:855:1: ( (lv_card_2_0= RULE_INT ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:856:1: (lv_card_2_0= RULE_INT )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:856:1: (lv_card_2_0= RULE_INT )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:857:3: lv_card_2_0= RULE_INT
            {
            lv_card_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulestateInit1802); 

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:881:1: entryRulegl_tran returns [EObject current=null] : iv_rulegl_tran= rulegl_tran EOF ;
    public final EObject entryRulegl_tran() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegl_tran = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:882:2: (iv_rulegl_tran= rulegl_tran EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:883:2: iv_rulegl_tran= rulegl_tran EOF
            {
             newCompositeNode(grammarAccess.getGl_tranRule()); 
            pushFollow(FOLLOW_rulegl_tran_in_entryRulegl_tran1843);
            iv_rulegl_tran=rulegl_tran();

            state._fsp--;

             current =iv_rulegl_tran; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegl_tran1853); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:890:1: rulegl_tran returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lTran_3_0= ruleloc_tran ) ) (otherlv_4= '&' ( (lv_lTran_5_0= ruleloc_tran ) ) )* otherlv_6= '=>' ( (lv_rate_7_0= ruleexpr ) ) otherlv_8= '}' ) ;
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
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:893:28: ( (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lTran_3_0= ruleloc_tran ) ) (otherlv_4= '&' ( (lv_lTran_5_0= ruleloc_tran ) ) )* otherlv_6= '=>' ( (lv_rate_7_0= ruleexpr ) ) otherlv_8= '}' ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:894:1: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lTran_3_0= ruleloc_tran ) ) (otherlv_4= '&' ( (lv_lTran_5_0= ruleloc_tran ) ) )* otherlv_6= '=>' ( (lv_rate_7_0= ruleexpr ) ) otherlv_8= '}' )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:894:1: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lTran_3_0= ruleloc_tran ) ) (otherlv_4= '&' ( (lv_lTran_5_0= ruleloc_tran ) ) )* otherlv_6= '=>' ( (lv_rate_7_0= ruleexpr ) ) otherlv_8= '}' )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:894:3: otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_lTran_3_0= ruleloc_tran ) ) (otherlv_4= '&' ( (lv_lTran_5_0= ruleloc_tran ) ) )* otherlv_6= '=>' ( (lv_rate_7_0= ruleexpr ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_rulegl_tran1890); 

                	newLeafNode(otherlv_0, grammarAccess.getGl_tranAccess().getTransitionKeyword_0());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:898:1: ( (lv_name_1_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:899:1: (lv_name_1_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:899:1: (lv_name_1_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:900:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulegl_tran1907); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_rulegl_tran1924); 

                	newLeafNode(otherlv_2, grammarAccess.getGl_tranAccess().getLeftCurlyBracketKeyword_2());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:920:1: ( (lv_lTran_3_0= ruleloc_tran ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:921:1: (lv_lTran_3_0= ruleloc_tran )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:921:1: (lv_lTran_3_0= ruleloc_tran )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:922:3: lv_lTran_3_0= ruleloc_tran
            {
             
            	        newCompositeNode(grammarAccess.getGl_tranAccess().getLTranLoc_tranParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleloc_tran_in_rulegl_tran1945);
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

            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:938:2: (otherlv_4= '&' ( (lv_lTran_5_0= ruleloc_tran ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:938:4: otherlv_4= '&' ( (lv_lTran_5_0= ruleloc_tran ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_27_in_rulegl_tran1958); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGl_tranAccess().getAmpersandKeyword_4_0());
            	        
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:942:1: ( (lv_lTran_5_0= ruleloc_tran ) )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:943:1: (lv_lTran_5_0= ruleloc_tran )
            	    {
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:943:1: (lv_lTran_5_0= ruleloc_tran )
            	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:944:3: lv_lTran_5_0= ruleloc_tran
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGl_tranAccess().getLTranLoc_tranParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleloc_tran_in_rulegl_tran1979);
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
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_rulegl_tran1993); 

                	newLeafNode(otherlv_6, grammarAccess.getGl_tranAccess().getEqualsSignGreaterThanSignKeyword_5());
                
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:964:1: ( (lv_rate_7_0= ruleexpr ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:965:1: (lv_rate_7_0= ruleexpr )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:965:1: (lv_rate_7_0= ruleexpr )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:966:3: lv_rate_7_0= ruleexpr
            {
             
            	        newCompositeNode(grammarAccess.getGl_tranAccess().getRateExprParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleexpr_in_rulegl_tran2014);
            lv_rate_7_0=ruleexpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGl_tranRule());
            	        }
                   		set(
                   			current, 
                   			"rate",
                    		lv_rate_7_0, 
                    		"expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_rulegl_tran2026); 

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:994:1: entryRuleloc_tran returns [EObject current=null] : iv_ruleloc_tran= ruleloc_tran EOF ;
    public final EObject entryRuleloc_tran() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleloc_tran = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:995:2: (iv_ruleloc_tran= ruleloc_tran EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:996:2: iv_ruleloc_tran= ruleloc_tran EOF
            {
             newCompositeNode(grammarAccess.getLoc_tranRule()); 
            pushFollow(FOLLOW_ruleloc_tran_in_entryRuleloc_tran2062);
            iv_ruleloc_tran=ruleloc_tran();

            state._fsp--;

             current =iv_ruleloc_tran; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleloc_tran2072); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1003:1: ruleloc_tran returns [EObject current=null] : ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_sCond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_aCond_6_0= ruleaction_cond ) ) ) ) ;
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
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1006:28: ( ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_sCond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_aCond_6_0= ruleaction_cond ) ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1007:1: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_sCond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_aCond_6_0= ruleaction_cond ) ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1007:1: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_sCond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_aCond_6_0= ruleaction_cond ) ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case RULE_ID:
            case 31:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1007:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1007:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1007:4: otherlv_0= 'new' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleloc_tran2110); 

                        	newLeafNode(otherlv_0, grammarAccess.getLoc_tranAccess().getNewKeyword_0_0());
                        
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1011:1: ( (otherlv_1= RULE_ID ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1012:1: (otherlv_1= RULE_ID )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1012:1: (otherlv_1= RULE_ID )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1013:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLoc_tranRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleloc_tran2130); 

                    		newLeafNode(otherlv_1, grammarAccess.getLoc_tranAccess().getStateRefStateCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1025:6: (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1025:6: (otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1025:8: otherlv_2= 'kill' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleloc_tran2150); 

                        	newLeafNode(otherlv_2, grammarAccess.getLoc_tranAccess().getKillKeyword_1_0());
                        
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1029:1: ( (otherlv_3= RULE_ID ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1030:1: (otherlv_3= RULE_ID )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1030:1: (otherlv_3= RULE_ID )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1031:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLoc_tranRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleloc_tran2170); 

                    		newLeafNode(otherlv_3, grammarAccess.getLoc_tranAccess().getStateRefStateCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1043:6: ( ( (lv_sCond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_aCond_6_0= ruleaction_cond ) ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1043:6: ( ( (lv_sCond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_aCond_6_0= ruleaction_cond ) ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1043:7: ( (lv_sCond_4_0= rulestate_cond ) ) otherlv_5= ':' ( (lv_aCond_6_0= ruleaction_cond ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1043:7: ( (lv_sCond_4_0= rulestate_cond ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1044:1: (lv_sCond_4_0= rulestate_cond )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1044:1: (lv_sCond_4_0= rulestate_cond )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1045:3: lv_sCond_4_0= rulestate_cond
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoc_tranAccess().getSCondState_condParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulestate_cond_in_ruleloc_tran2199);
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

                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleloc_tran2211); 

                        	newLeafNode(otherlv_5, grammarAccess.getLoc_tranAccess().getColonKeyword_2_1());
                        
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1065:1: ( (lv_aCond_6_0= ruleaction_cond ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1066:1: (lv_aCond_6_0= ruleaction_cond )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1066:1: (lv_aCond_6_0= ruleaction_cond )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1067:3: lv_aCond_6_0= ruleaction_cond
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoc_tranAccess().getACondAction_condParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleaction_cond_in_ruleloc_tran2232);
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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1091:1: entryRulestate_cond returns [EObject current=null] : iv_rulestate_cond= rulestate_cond EOF ;
    public final EObject entryRulestate_cond() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestate_cond = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1092:2: (iv_rulestate_cond= rulestate_cond EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1093:2: iv_rulestate_cond= rulestate_cond EOF
            {
             newCompositeNode(grammarAccess.getState_condRule()); 
            pushFollow(FOLLOW_rulestate_cond_in_entryRulestate_cond2269);
            iv_rulestate_cond=rulestate_cond();

            state._fsp--;

             current =iv_rulestate_cond; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestate_cond2279); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1100:1: rulestate_cond returns [EObject current=null] : ( ( () otherlv_1= 'any' ) | ( ( (lv_stateRef_2_0= rulestate_ref ) ) (otherlv_3= 'or' ( (lv_stateRef_4_0= rulestate_ref ) ) )* ) ) ;
    public final EObject rulestate_cond() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_stateRef_2_0 = null;

        EObject lv_stateRef_4_0 = null;


         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1103:28: ( ( ( () otherlv_1= 'any' ) | ( ( (lv_stateRef_2_0= rulestate_ref ) ) (otherlv_3= 'or' ( (lv_stateRef_4_0= rulestate_ref ) ) )* ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1104:1: ( ( () otherlv_1= 'any' ) | ( ( (lv_stateRef_2_0= rulestate_ref ) ) (otherlv_3= 'or' ( (lv_stateRef_4_0= rulestate_ref ) ) )* ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1104:1: ( ( () otherlv_1= 'any' ) | ( ( (lv_stateRef_2_0= rulestate_ref ) ) (otherlv_3= 'or' ( (lv_stateRef_4_0= rulestate_ref ) ) )* ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1104:2: ( () otherlv_1= 'any' )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1104:2: ( () otherlv_1= 'any' )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1104:3: () otherlv_1= 'any'
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1104:3: ()
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1105:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getState_condAccess().getAnystateAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_rulestate_cond2326); 

                        	newLeafNode(otherlv_1, grammarAccess.getState_condAccess().getAnyKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1115:6: ( ( (lv_stateRef_2_0= rulestate_ref ) ) (otherlv_3= 'or' ( (lv_stateRef_4_0= rulestate_ref ) ) )* )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1115:6: ( ( (lv_stateRef_2_0= rulestate_ref ) ) (otherlv_3= 'or' ( (lv_stateRef_4_0= rulestate_ref ) ) )* )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1115:7: ( (lv_stateRef_2_0= rulestate_ref ) ) (otherlv_3= 'or' ( (lv_stateRef_4_0= rulestate_ref ) ) )*
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1115:7: ( (lv_stateRef_2_0= rulestate_ref ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1116:1: (lv_stateRef_2_0= rulestate_ref )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1116:1: (lv_stateRef_2_0= rulestate_ref )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1117:3: lv_stateRef_2_0= rulestate_ref
                    {
                     
                    	        newCompositeNode(grammarAccess.getState_condAccess().getStateRefState_refParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulestate_ref_in_rulestate_cond2355);
                    lv_stateRef_2_0=rulestate_ref();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getState_condRule());
                    	        }
                           		add(
                           			current, 
                           			"stateRef",
                            		lv_stateRef_2_0, 
                            		"state_ref");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1133:2: (otherlv_3= 'or' ( (lv_stateRef_4_0= rulestate_ref ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==32) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1133:4: otherlv_3= 'or' ( (lv_stateRef_4_0= rulestate_ref ) )
                    	    {
                    	    otherlv_3=(Token)match(input,32,FOLLOW_32_in_rulestate_cond2368); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getState_condAccess().getOrKeyword_1_1_0());
                    	        
                    	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1137:1: ( (lv_stateRef_4_0= rulestate_ref ) )
                    	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1138:1: (lv_stateRef_4_0= rulestate_ref )
                    	    {
                    	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1138:1: (lv_stateRef_4_0= rulestate_ref )
                    	    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1139:3: lv_stateRef_4_0= rulestate_ref
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getState_condAccess().getStateRefState_refParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulestate_ref_in_rulestate_cond2389);
                    	    lv_stateRef_4_0=rulestate_ref();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getState_condRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"stateRef",
                    	            		lv_stateRef_4_0, 
                    	            		"state_ref");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1163:1: entryRulestate_ref returns [EObject current=null] : iv_rulestate_ref= rulestate_ref EOF ;
    public final EObject entryRulestate_ref() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestate_ref = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1164:2: (iv_rulestate_ref= rulestate_ref EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1165:2: iv_rulestate_ref= rulestate_ref EOF
            {
             newCompositeNode(grammarAccess.getState_refRule()); 
            pushFollow(FOLLOW_rulestate_ref_in_entryRulestate_ref2428);
            iv_rulestate_ref=rulestate_ref();

            state._fsp--;

             current =iv_rulestate_ref; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestate_ref2438); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1172:1: rulestate_ref returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulestate_ref() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1175:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1176:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1176:1: ( (otherlv_0= RULE_ID ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1177:1: (otherlv_0= RULE_ID )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1177:1: (otherlv_0= RULE_ID )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1178:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getState_refRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulestate_ref2482); 

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1197:1: entryRuleaction_cond returns [EObject current=null] : iv_ruleaction_cond= ruleaction_cond EOF ;
    public final EObject entryRuleaction_cond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaction_cond = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1198:2: (iv_ruleaction_cond= ruleaction_cond EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1199:2: iv_ruleaction_cond= ruleaction_cond EOF
            {
             newCompositeNode(grammarAccess.getAction_condRule()); 
            pushFollow(FOLLOW_ruleaction_cond_in_entryRuleaction_cond2517);
            iv_ruleaction_cond=ruleaction_cond();

            state._fsp--;

             current =iv_ruleaction_cond; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleaction_cond2527); 

            }

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
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1206:1: ruleaction_cond returns [EObject current=null] : ( ( () otherlv_1= 'any' ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleaction_cond() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1209:28: ( ( ( () otherlv_1= 'any' ) | ( (otherlv_2= RULE_ID ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1210:1: ( ( () otherlv_1= 'any' ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1210:1: ( ( () otherlv_1= 'any' ) | ( (otherlv_2= RULE_ID ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1210:2: ( () otherlv_1= 'any' )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1210:2: ( () otherlv_1= 'any' )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1210:3: () otherlv_1= 'any'
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1210:3: ()
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1211:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAction_condAccess().getAnystateAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleaction_cond2574); 

                        	newLeafNode(otherlv_1, grammarAccess.getAction_condAccess().getAnyKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1221:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1221:6: ( (otherlv_2= RULE_ID ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1222:1: (otherlv_2= RULE_ID )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1222:1: (otherlv_2= RULE_ID )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1223:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAction_condRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleaction_cond2601); 

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


    // $ANTLR start "entryRuleexpr"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1242:1: entryRuleexpr returns [EObject current=null] : iv_ruleexpr= ruleexpr EOF ;
    public final EObject entryRuleexpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpr = null;


        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1243:2: (iv_ruleexpr= ruleexpr EOF )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1244:2: iv_ruleexpr= ruleexpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleexpr_in_entryRuleexpr2637);
            iv_ruleexpr=ruleexpr();

            state._fsp--;

             current =iv_ruleexpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpr2647); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpr"


    // $ANTLR start "ruleexpr"
    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1251:1: ruleexpr returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_constFLOAT_1_0= RULE_FLOAT ) ) | ( (lv_constINT_2_0= RULE_INT ) ) ) ;
    public final EObject ruleexpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_constFLOAT_1_0=null;
        Token lv_constINT_2_0=null;

         enterRule(); 
            
        try {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1254:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_constFLOAT_1_0= RULE_FLOAT ) ) | ( (lv_constINT_2_0= RULE_INT ) ) ) )
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1255:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_constFLOAT_1_0= RULE_FLOAT ) ) | ( (lv_constINT_2_0= RULE_INT ) ) )
            {
            // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1255:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_constFLOAT_1_0= RULE_FLOAT ) ) | ( (lv_constINT_2_0= RULE_INT ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt16=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt16=2;
                }
                break;
            case RULE_INT:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1255:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1255:2: ( (otherlv_0= RULE_ID ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1256:1: (otherlv_0= RULE_ID )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1256:1: (otherlv_0= RULE_ID )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1257:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getExprRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleexpr2692); 

                    		newLeafNode(otherlv_0, grammarAccess.getExprAccess().getConstRefConstantCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1269:6: ( (lv_constFLOAT_1_0= RULE_FLOAT ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1269:6: ( (lv_constFLOAT_1_0= RULE_FLOAT ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1270:1: (lv_constFLOAT_1_0= RULE_FLOAT )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1270:1: (lv_constFLOAT_1_0= RULE_FLOAT )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1271:3: lv_constFLOAT_1_0= RULE_FLOAT
                    {
                    lv_constFLOAT_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleexpr2715); 

                    			newLeafNode(lv_constFLOAT_1_0, grammarAccess.getExprAccess().getConstFLOATFLOATTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExprRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"constFLOAT",
                            		lv_constFLOAT_1_0, 
                            		"FLOAT");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1288:6: ( (lv_constINT_2_0= RULE_INT ) )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1288:6: ( (lv_constINT_2_0= RULE_INT ) )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1289:1: (lv_constINT_2_0= RULE_INT )
                    {
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1289:1: (lv_constINT_2_0= RULE_INT )
                    // ../imt.simhya.language/src-gen/imt/simhya/language/parser/antlr/internal/InternalMarkovPopulationModels.g:1290:3: lv_constINT_2_0= RULE_INT
                    {
                    lv_constINT_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleexpr2743); 

                    			newLeafNode(lv_constINT_2_0, grammarAccess.getExprAccess().getConstINTINTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExprRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"constINT",
                            		lv_constINT_2_0, 
                            		"INT");
                    	    

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
    // $ANTLR end "ruleexpr"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulemain_in_entryRulemain75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemain85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulemain175 = new BitSet(new long[]{0x000000000040D002L});
    public static final BitSet FOLLOW_rulepopulation_in_rulemain251 = new BitSet(new long[]{0x000000000040D002L});
    public static final BitSet FOLLOW_ruleagent_in_rulemain326 = new BitSet(new long[]{0x000000000040D002L});
    public static final BitSet FOLLOW_ruleconstant_in_entryRuleconstant407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleconstant455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleconstant472 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleconstant489 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleconstant506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleconstant531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleconstant548 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleconstant565 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleconstant582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleagent_in_entryRuleagent624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleagent634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleagent671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleagent688 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleagent705 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleagent717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulelabel_in_ruleagent738 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rulestate_in_ruleagent760 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleagent773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulelabel860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestate_in_entryRulestate900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestate910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulestate947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulestate964 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulestate981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleaction_in_rulestate1002 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_rulestate1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaction_in_entryRuleaction1051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaction1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleaction1106 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleaction1118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleaction1138 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleaction1150 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rulelocal_rate_in_ruleaction1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelocal_rate_in_entryRulelocal_rate1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelocal_rate1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulelocal_rate1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rulelocal_rate1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepopulation_in_entryRulepopulation1326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepopulation1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulepopulation1373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepopulation1390 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulepopulation1407 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulepopulation1419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleinit_in_rulepopulation1440 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_24_in_rulepopulation1453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleinit_in_rulepopulation1474 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_rulegl_tran_in_rulepopulation1497 = new BitSet(new long[]{0x0000000005040000L});
    public static final BitSet FOLLOW_18_in_rulepopulation1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinit_in_entryRuleinit1546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinit1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleinit1601 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleinit1613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulestateInit_in_ruleinit1634 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_25_in_ruleinit1647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulestateInit_in_ruleinit1668 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_18_in_ruleinit1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestateInit_in_entryRulestateInit1718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestateInit1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulestateInit1773 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulestateInit1785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulestateInit1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegl_tran_in_entryRulegl_tran1843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegl_tran1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulegl_tran1890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulegl_tran1907 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulegl_tran1924 = new BitSet(new long[]{0x00000000E0000010L});
    public static final BitSet FOLLOW_ruleloc_tran_in_rulegl_tran1945 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_rulegl_tran1958 = new BitSet(new long[]{0x00000000E0000010L});
    public static final BitSet FOLLOW_ruleloc_tran_in_rulegl_tran1979 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_28_in_rulegl_tran1993 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleexpr_in_rulegl_tran2014 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulegl_tran2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleloc_tran_in_entryRuleloc_tran2062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleloc_tran2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleloc_tran2110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleloc_tran2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleloc_tran2150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleloc_tran2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestate_cond_in_ruleloc_tran2199 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleloc_tran2211 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_ruleaction_cond_in_ruleloc_tran2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestate_cond_in_entryRulestate_cond2269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestate_cond2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulestate_cond2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestate_ref_in_rulestate_cond2355 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_rulestate_cond2368 = new BitSet(new long[]{0x00000000E0000010L});
    public static final BitSet FOLLOW_rulestate_ref_in_rulestate_cond2389 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rulestate_ref_in_entryRulestate_ref2428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestate_ref2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulestate_ref2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaction_cond_in_entryRuleaction_cond2517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaction_cond2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleaction_cond2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleaction_cond2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_entryRuleexpr2637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpr2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleexpr2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleexpr2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleexpr2743 = new BitSet(new long[]{0x0000000000000002L});

}
