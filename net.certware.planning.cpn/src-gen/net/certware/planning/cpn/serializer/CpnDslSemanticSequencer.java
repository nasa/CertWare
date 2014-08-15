package net.certware.planning.cpn.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.certware.planning.cpn.cpnDsl.Allocation;
import net.certware.planning.cpn.cpnDsl.ArgumentModels;
import net.certware.planning.cpn.cpnDsl.CpnDslPackage;
import net.certware.planning.cpn.cpnDsl.Plan;
import net.certware.planning.cpn.cpnDsl.Plans;
import net.certware.planning.cpn.services.CpnDslGrammarAccess;
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
public class CpnDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CpnDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CpnDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CpnDslPackage.ALLOCATION:
				if(context == grammarAccess.getAllocationRule()) {
					sequence_Allocation(context, (Allocation) semanticObject); 
					return; 
				}
				else break;
			case CpnDslPackage.ARGUMENT_MODELS:
				if(context == grammarAccess.getArgumentModelsRule()) {
					sequence_ArgumentModels(context, (ArgumentModels) semanticObject); 
					return; 
				}
				else break;
			case CpnDslPackage.PLAN:
				if(context == grammarAccess.getPlanRule()) {
					sequence_Plan(context, (Plan) semanticObject); 
					return; 
				}
				else break;
			case CpnDslPackage.PLANS:
				if(context == grammarAccess.getPlansRule()) {
					sequence_Plans(context, (Plans) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (cost=INT? duration=INT? team=STRING? facility=STRING?)
	 */
	protected void sequence_Allocation(EObject context, Allocation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_ArgumentModels(EObject context, ArgumentModels semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CpnDslPackage.Literals.ARGUMENT_MODELS__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CpnDslPackage.Literals.ARGUMENT_MODELS__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArgumentModelsAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=STRING element=[ModelElement|ID] estimated=Allocation? actual=Allocation?)
	 */
	protected void sequence_Plan(EObject context, Plan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (argumentmodels+=ArgumentModels* plans+=Plan*)
	 */
	protected void sequence_Plans(EObject context, Plans semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
