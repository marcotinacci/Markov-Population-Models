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
    	return "agent";	
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

RULE_FLOAT : ('-'? RULE_INT* ('.' RULE_INT+)?|'-'? RULE_INT+ '.'|'-'? RULE_INT+ ('.' RULE_INT*)? ('e'|'E') ('-'|'+')? RULE_INT+);

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

