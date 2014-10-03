/*
* generated by Xtext
*/
grammar InternalMarkovPopulationModels;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package imt.simhya.language.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRulemain
entryRulemain returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMainRule()); }
	 iv_rulemain=rulemain 
	 { $current=$iv_rulemain.current; } 
	 EOF 
;

// Rule main
rulemain returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMainAccess().getUnorderedGroup());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMainAccess().getUnorderedGroup(), 0);
	 				}
					({true}?=>(
(
		{ 
	        newCompositeNode(grammarAccess.getMainAccess().getPopulationDefPopulationParserRuleCall_0_0()); 
	    }
		lv_populationDef_1_0=rulepopulation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMainRule());
	        }
       		set(
       			$current, 
       			"populationDef",
        		lv_populationDef_1_0, 
        		"population");
	        afterParserOrEnumRuleCall();
	    }

)
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMainAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMainAccess().getUnorderedGroup(), 1);
	 				}
					({true}?=>(
(
		{ 
	        newCompositeNode(grammarAccess.getMainAccess().getAgentDefAgentParserRuleCall_1_0()); 
	    }
		lv_agentDef_2_0=ruleagent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMainRule());
	        }
       		set(
       			$current, 
       			"agentDef",
        		lv_agentDef_2_0, 
        		"agent");
	        afterParserOrEnumRuleCall();
	    }

)
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMainAccess().getUnorderedGroup());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMainAccess().getUnorderedGroup())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMainAccess().getUnorderedGroup());
	}

)
;





// Entry rule entryRulepopulation
entryRulepopulation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPopulationRule()); }
	 iv_rulepopulation=rulepopulation 
	 { $current=$iv_rulepopulation.current; } 
	 EOF 
;

// Rule population
rulepopulation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='population' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPopulationAccess().getPopulationKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getPopulationAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPopulationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPopulationAccess().getLeftCurlyBracketKeyword_2());
    }
	otherlv_3='init' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPopulationAccess().getInitKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPopulationAccess().getAgentsInitParserRuleCall_4_0()); 
	    }
		lv_agents_4_0=ruleinit		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPopulationRule());
	        }
       		add(
       			$current, 
       			"agents",
        		lv_agents_4_0, 
        		"init");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5='||' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getPopulationAccess().getVerticalLineVerticalLineKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPopulationAccess().getAgentsInitParserRuleCall_5_1_0()); 
	    }
		lv_agents_6_0=ruleinit		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPopulationRule());
	        }
       		add(
       			$current, 
       			"agents",
        		lv_agents_6_0, 
        		"init");
	        afterParserOrEnumRuleCall();
	    }

)
))*(
(
		{ 
	        newCompositeNode(grammarAccess.getPopulationAccess().getTranGl_tranParserRuleCall_6_0()); 
	    }
		lv_tran_7_0=rulegl_tran		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPopulationRule());
	        }
       		add(
       			$current, 
       			"tran",
        		lv_tran_7_0, 
        		"gl_tran");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getPopulationAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleinit
entryRuleinit returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInitRule()); }
	 iv_ruleinit=ruleinit 
	 { $current=$iv_ruleinit.current; } 
	 EOF 
;

// Rule init
ruleinit returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getInitRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getInitAccess().getAgentRefAgentCrossReference_0_0()); 
	}

)
)	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getInitAccess().getLeftCurlyBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getInitAccess().getStatesStateInitParserRuleCall_2_0()); 
	    }
		lv_states_2_0=rulestateInit		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInitRule());
	        }
       		add(
       			$current, 
       			"states",
        		lv_states_2_0, 
        		"stateInit");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getInitAccess().getCommaKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getInitAccess().getStatesStateInitParserRuleCall_3_1_0()); 
	    }
		lv_states_4_0=rulestateInit		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInitRule());
	        }
       		add(
       			$current, 
       			"states",
        		lv_states_4_0, 
        		"stateInit");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getInitAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRulestateInit
entryRulestateInit returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStateInitRule()); }
	 iv_rulestateInit=rulestateInit 
	 { $current=$iv_rulestateInit.current; } 
	 EOF 
;

// Rule stateInit
rulestateInit returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getStateInitRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getStateInitAccess().getStateRefStateCrossReference_0_0()); 
	}

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getStateInitAccess().getEqualsSignKeyword_1());
    }
(
(
		lv_card_2_0=RULE_INT
		{
			newLeafNode(lv_card_2_0, grammarAccess.getStateInitAccess().getCardINTTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStateInitRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"card",
        		lv_card_2_0, 
        		"INT");
	    }

)
))
;





// Entry rule entryRulegl_tran
entryRulegl_tran returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGl_tranRule()); }
	 iv_rulegl_tran=rulegl_tran 
	 { $current=$iv_rulegl_tran.current; } 
	 EOF 
;

// Rule gl_tran
rulegl_tran returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='transition' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getGl_tranAccess().getTransitionKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getGl_tranAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGl_tranRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getGl_tranAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGl_tranAccess().getL_tranLoc_tranParserRuleCall_3_0()); 
	    }
		lv_l_tran_3_0=ruleloc_tran		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGl_tranRule());
	        }
       		add(
       			$current, 
       			"l_tran",
        		lv_l_tran_3_0, 
        		"loc_tran");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4='&' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getGl_tranAccess().getAmpersandKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGl_tranAccess().getL_tranLoc_tranParserRuleCall_4_1_0()); 
	    }
		lv_l_tran_5_0=ruleloc_tran		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGl_tranRule());
	        }
       		add(
       			$current, 
       			"l_tran",
        		lv_l_tran_5_0, 
        		"loc_tran");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6='=>' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getGl_tranAccess().getEqualsSignGreaterThanSignKeyword_5());
    }
(
(
		lv_rate_7_0=RULE_FLOAT
		{
			newLeafNode(lv_rate_7_0, grammarAccess.getGl_tranAccess().getRateFLOATTerminalRuleCall_6_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGl_tranRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"rate",
        		lv_rate_7_0, 
        		"FLOAT");
	    }

)
)	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getGl_tranAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleloc_tran
entryRuleloc_tran returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLoc_tranRule()); }
	 iv_ruleloc_tran=ruleloc_tran 
	 { $current=$iv_ruleloc_tran.current; } 
	 EOF 
;

// Rule loc_tran
ruleloc_tran returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='new' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getLoc_tranAccess().getNewKeyword_0_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLoc_tranRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getLoc_tranAccess().getStateRefStateCrossReference_0_1_0()); 
	}

)
))
    |(	otherlv_2='kill' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getLoc_tranAccess().getKillKeyword_1_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLoc_tranRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getLoc_tranAccess().getStateRefStateCrossReference_1_1_0()); 
	}

)
))
    |((
(
		{ 
	        newCompositeNode(grammarAccess.getLoc_tranAccess().getS_condState_condParserRuleCall_2_0_0()); 
	    }
		lv_s_cond_4_0=rulestate_cond		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLoc_tranRule());
	        }
       		set(
       			$current, 
       			"s_cond",
        		lv_s_cond_4_0, 
        		"state_cond");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=':' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getLoc_tranAccess().getColonKeyword_2_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLoc_tranAccess().getA_condAction_condParserRuleCall_2_2_0()); 
	    }
		lv_a_cond_6_0=ruleaction_cond		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLoc_tranRule());
	        }
       		set(
       			$current, 
       			"a_cond",
        		lv_a_cond_6_0, 
        		"action_cond");
	        afterParserOrEnumRuleCall();
	    }

)
)))
;





// Entry rule entryRulestate_cond
entryRulestate_cond returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getState_condRule()); }
	 iv_rulestate_cond=rulestate_cond 
	 { $current=$iv_rulestate_cond.current; } 
	 EOF 
;

// Rule state_cond
rulestate_cond returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getState_condAccess().getAnystateAction_0_0(),
            $current);
    }
)	otherlv_1='any' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getState_condAccess().getAnyKeyword_0_1());
    }
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getState_condAccess().getS_refState_refParserRuleCall_1_0()); 
	    }
		lv_s_ref_2_0=rulestate_ref		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getState_condRule());
	        }
       		set(
       			$current, 
       			"s_ref",
        		lv_s_ref_2_0, 
        		"state_ref");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRulestate_ref
entryRulestate_ref returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getState_refRule()); }
	 iv_rulestate_ref=rulestate_ref 
	 { $current=$iv_rulestate_ref.current; } 
	 EOF 
;

// Rule state_ref
rulestate_ref returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getState_refAccess().getNameIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getState_refRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)
;





// Entry rule entryRuleaction_cond
entryRuleaction_cond returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAction_condRule()); }
	 iv_ruleaction_cond=ruleaction_cond 
	 { $current=$iv_ruleaction_cond.current; } 
	 EOF 
;

// Rule action_cond
ruleaction_cond returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAction_condAccess().getAnystateAction_0_0(),
            $current);
    }
)	otherlv_1='any' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAction_condAccess().getAnyKeyword_0_1());
    }
)
    |(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getAction_condAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAction_condRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleagent
entryRuleagent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAgentRule()); }
	 iv_ruleagent=ruleagent 
	 { $current=$iv_ruleagent.current; } 
	 EOF 
;

// Rule agent
ruleagent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='agent' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAgentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2());
    }
	otherlv_3='actions' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAgentAccess().getActionsKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAgentAccess().getActLabelParserRuleCall_4_0()); 
	    }
		lv_act_4_0=rulelabel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAgentRule());
	        }
       		add(
       			$current, 
       			"act",
        		lv_act_4_0, 
        		"label");
	        afterParserOrEnumRuleCall();
	    }

)
)+(
(
		{ 
	        newCompositeNode(grammarAccess.getAgentAccess().getSStateParserRuleCall_5_0()); 
	    }
		lv_s_5_0=rulestate		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAgentRule());
	        }
       		add(
       			$current, 
       			"s",
        		lv_s_5_0, 
        		"state");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRulelabel
entryRulelabel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLabelRule()); }
	 iv_rulelabel=rulelabel 
	 { $current=$iv_rulelabel.current; } 
	 EOF 
;

// Rule label
rulelabel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLabelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)
;





// Entry rule entryRulestate
entryRulestate returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	 iv_rulestate=rulestate 
	 { $current=$iv_rulestate.current; } 
	 EOF 
;

// Rule state
rulestate returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='state' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStateRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateAccess().getSpontaneous_actActionParserRuleCall_3_0()); 
	    }
		lv_spontaneous_act_3_0=ruleaction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateRule());
	        }
       		add(
       			$current, 
       			"spontaneous_act",
        		lv_spontaneous_act_3_0, 
        		"action");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleaction
entryRuleaction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	 iv_ruleaction=ruleaction 
	 { $current=$iv_ruleaction.current; } 
	 EOF 
;

// Rule action
ruleaction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getActionRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActRefLabelCrossReference_0_0()); 
	}

)
)	otherlv_1='-->' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getActionRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getActionAccess().getStateRefStateCrossReference_2_0()); 
	}

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getColonKeyword_3());
    }
(
(
		lv_localRate_4_0=RULE_FLOAT
		{
			newLeafNode(lv_localRate_4_0, grammarAccess.getActionAccess().getLocalRateFLOATTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"localRate",
        		lv_localRate_4_0, 
        		"FLOAT");
	    }

)
))
;





RULE_INT : ('0'..'9')+;

RULE_FLOAT : '-'? RULE_INT '.' RULE_INT;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


