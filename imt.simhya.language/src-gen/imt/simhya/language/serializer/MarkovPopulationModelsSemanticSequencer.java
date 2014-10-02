package imt.simhya.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.action;
import imt.simhya.language.markovPopulationModels.agent;
import imt.simhya.language.markovPopulationModels.label;
import imt.simhya.language.markovPopulationModels.state;
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
			case MarkovPopulationModelsPackage.ACTION:
				if(context == grammarAccess.getActionRule()) {
					sequence_action(context, (action) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.AGENT:
				if(context == grammarAccess.getAgentRule()) {
					sequence_agent(context, (agent) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.LABEL:
				if(context == grammarAccess.getLabelRule()) {
					sequence_label(context, (label) semanticObject); 
					return; 
				}
				else break;
			case MarkovPopulationModelsPackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_state(context, (state) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (actRef=[label|ID] stateRef=[state|ID] localRate=FLOAT)
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
		feeder.accept(grammarAccess.getActionAccess().getLocalRateFLOATTerminalRuleCall_4_0(), semanticObject.getLocalRate());
		feeder.finish();
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
	 *     (name=ID spontaneous_act+=action+)
	 */
	protected void sequence_state(EObject context, state semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
