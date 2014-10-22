package imt.simhya.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import imt.simhya.language.markovPopulationModels.FloatExpression;
import imt.simhya.language.markovPopulationModels.IntExpression;
import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.MultiplicationDivision;
import imt.simhya.language.markovPopulationModels.Reference;
import imt.simhya.language.markovPopulationModels.SummationSubtraction;
import imt.simhya.language.markovPopulationModels.action;
import imt.simhya.language.markovPopulationModels.action_cond;
import imt.simhya.language.markovPopulationModels.agent;
import imt.simhya.language.markovPopulationModels.anystate;
import imt.simhya.language.markovPopulationModels.gl_tran;
import imt.simhya.language.markovPopulationModels.init;
import imt.simhya.language.markovPopulationModels.label;
import imt.simhya.language.markovPopulationModels.loc_tran;
import imt.simhya.language.markovPopulationModels.main;
import imt.simhya.language.markovPopulationModels.population;
import imt.simhya.language.markovPopulationModels.state;
import imt.simhya.language.markovPopulationModels.stateInit;
import imt.simhya.language.markovPopulationModels.state_cond;
import imt.simhya.language.markovPopulationModels.state_ref;
import imt.simhya.language.services.MarkovPopulationModelsGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MarkovPopulationModelsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MarkovPopulationModelsGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MarkovPopulationModelsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MarkovPopulationModelsPackage.FLOAT_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_BaseExpression(context, (FloatExpression) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.INT_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_BaseExpression(context, (IntExpression) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.MULTIPLICATION_DIVISION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_MultiplicationDivision(context, (MultiplicationDivision) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.REFERENCE:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_BaseExpression(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.SUMMATION_SUBTRACTION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationDivisionRule() ||
				   context == grammarAccess.getMultiplicationDivisionAccess().getMultiplicationDivisionLeftAction_1_0() ||
				   context == grammarAccess.getSummationSubtractionRule() ||
				   context == grammarAccess.getSummationSubtractionAccess().getSummationSubtractionLeftAction_1_0()) {
					sequence_SummationSubtraction(context, (SummationSubtraction) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.ACTION:
				if(context == grammarAccess.getActionRule()) {
					sequence_action(context, (action) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.ACTION_COND:
				if(context == grammarAccess.getAction_condRule()) {
					sequence_action_cond(context, (action_cond) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.AGENT:
				if(context == grammarAccess.getAgentRule()) {
					sequence_agent(context, (agent) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.ANYSTATE:
				if(context == grammarAccess.getAction_condRule() ||
				   context == grammarAccess.getState_condRule()) {
					sequence_action_cond_state_cond(context, (anystate) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.GL_TRAN:
				if(context == grammarAccess.getGl_tranRule()) {
					sequence_gl_tran(context, (gl_tran) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.INIT:
				if(context == grammarAccess.getInitRule()) {
					sequence_init(context, (init) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.LABEL:
				if(context == grammarAccess.getLabelRule()) {
					sequence_label(context, (label) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.LOC_TRAN:
				if(context == grammarAccess.getLoc_tranRule()) {
					sequence_loc_tran(context, (loc_tran) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.MAIN:
				if(context == grammarAccess.getMainRule()) {
					sequence_main(context, (main) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.POPULATION:
				if(context == grammarAccess.getPopulationRule()) {
					sequence_population(context, (population) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_state(context, (state) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.STATE_INIT:
				if(context == grammarAccess.getStateInitRule()) {
					sequence_stateInit(context, (stateInit) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.STATE_COND:
				if(context == grammarAccess.getState_condRule()) {
					sequence_state_cond(context, (state_cond) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.STATE_REF:
				if(context == grammarAccess.getState_refRule()) {
					sequence_state_ref(context, (state_ref) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     {FloatExpression}
	 */
	protected void sequence_BaseExpression(EObject context, FloatExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {IntExpression}
	 */
	protected void sequence_BaseExpression(EObject context, IntExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     stateRef=state_ref
	 */
	protected void sequence_BaseExpression(EObject context, Reference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MarkovPopulationModelsPackage.Literals.REFERENCE__STATE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkovPopulationModelsPackage.Literals.REFERENCE__STATE_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBaseExpressionAccess().getStateRefState_refParserRuleCall_2_1_0(), semanticObject.getStateRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicationDivision_MultiplicationDivision_1_0 (op='*' | op='/') right=MultiplicationDivision)
	 */
	protected void sequence_MultiplicationDivision(EObject context, MultiplicationDivision semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SummationSubtraction_SummationSubtraction_1_0 (op='+' | op='-') right=SummationSubtraction)
	 */
	protected void sequence_SummationSubtraction(EObject context, SummationSubtraction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (actRef=[label|ID] stateRef=[state|ID] localRate=Expression)
	 */
	protected void sequence_action(EObject context, action semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MarkovPopulationModelsPackage.Literals.ACTION__ACT_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkovPopulationModelsPackage.Literals.ACTION__ACT_REF));
			if(transientValues.isValueTransient(semanticObject, MarkovPopulationModelsPackage.Literals.ACTION__STATE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkovPopulationModelsPackage.Literals.ACTION__STATE_REF));
			if(transientValues.isValueTransient(semanticObject, MarkovPopulationModelsPackage.Literals.ACTION__LOCAL_RATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkovPopulationModelsPackage.Literals.ACTION__LOCAL_RATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionAccess().getActRefLabelIDTerminalRuleCall_0_0_1(), semanticObject.getActRef());
		feeder.accept(grammarAccess.getActionAccess().getStateRefStateIDTerminalRuleCall_2_0_1(), semanticObject.getStateRef());
		feeder.accept(grammarAccess.getActionAccess().getLocalRateExpressionParserRuleCall_4_0(), semanticObject.getLocalRate());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     actionRef=[label|ID]
	 */
	protected void sequence_action_cond(EObject context, action_cond semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MarkovPopulationModelsPackage.Literals.ACTION_COND__ACTION_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkovPopulationModelsPackage.Literals.ACTION_COND__ACTION_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAction_condAccess().getActionRefLabelIDTerminalRuleCall_1_0_1(), semanticObject.getActionRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {anystate}
	 */
	protected void sequence_action_cond_state_cond(EObject context, anystate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID act+=label+ s+=state+)
	 */
	protected void sequence_agent(EObject context, agent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID lTran+=loc_tran lTran+=loc_tran* rate=Expression)
	 */
	protected void sequence_gl_tran(EObject context, gl_tran semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (agentRef=[agent|ID] states+=stateInit states+=stateInit*)
	 */
	protected void sequence_init(EObject context, init semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_label(EObject context, label semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MarkovPopulationModelsPackage.Literals.LABEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkovPopulationModelsPackage.Literals.LABEL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (stateRef=[state|ID] | stateRef=[state|ID] | (sCond=state_cond aCond=action_cond))
	 */
	protected void sequence_loc_tran(EObject context, loc_tran semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (populationDef=population agentDef=agent)
	 */
	protected void sequence_main(EObject context, main semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID agents+=init agents+=init* tran+=gl_tran+)
	 */
	protected void sequence_population(EObject context, population semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stateRef=state_ref card=Expression)
	 */
	protected void sequence_stateInit(EObject context, stateInit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MarkovPopulationModelsPackage.Literals.STATE_INIT__STATE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkovPopulationModelsPackage.Literals.STATE_INIT__STATE_REF));
			if(transientValues.isValueTransient(semanticObject, MarkovPopulationModelsPackage.Literals.STATE_INIT__CARD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkovPopulationModelsPackage.Literals.STATE_INIT__CARD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStateInitAccess().getStateRefState_refParserRuleCall_0_0(), semanticObject.getStateRef());
		feeder.accept(grammarAccess.getStateInitAccess().getCardExpressionParserRuleCall_2_0(), semanticObject.getCard());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     stateRef=state_ref
	 */
	protected void sequence_state_cond(EObject context, state_cond semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MarkovPopulationModelsPackage.Literals.STATE_COND__STATE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkovPopulationModelsPackage.Literals.STATE_COND__STATE_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getState_condAccess().getStateRefState_refParserRuleCall_1_0(), semanticObject.getStateRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     stateRef=[state|ID]
	 */
	protected void sequence_state_ref(EObject context, state_ref semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MarkovPopulationModelsPackage.Literals.STATE_REF__STATE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkovPopulationModelsPackage.Literals.STATE_REF__STATE_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getState_refAccess().getStateRefStateIDTerminalRuleCall_0_1(), semanticObject.getStateRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID spontaneousAct+=action+)
	 */
	protected void sequence_state(EObject context, state semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
