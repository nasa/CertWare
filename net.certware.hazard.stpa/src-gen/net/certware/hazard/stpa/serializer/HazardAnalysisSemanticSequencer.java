package net.certware.hazard.stpa.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.certware.hazard.stpa.hazardAnalysis.Accident;
import net.certware.hazard.stpa.hazardAnalysis.Constraint;
import net.certware.hazard.stpa.hazardAnalysis.Control;
import net.certware.hazard.stpa.hazardAnalysis.Design;
import net.certware.hazard.stpa.hazardAnalysis.Hazard;
import net.certware.hazard.stpa.hazardAnalysis.HazardAccidentLikelihood;
import net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage;
import net.certware.hazard.stpa.hazardAnalysis.HazardExposure;
import net.certware.hazard.stpa.hazardAnalysis.HazardLevel;
import net.certware.hazard.stpa.hazardAnalysis.HazardLikelihood;
import net.certware.hazard.stpa.hazardAnalysis.HazardSeverity;
import net.certware.hazard.stpa.hazardAnalysis.Incident;
import net.certware.hazard.stpa.hazardAnalysis.Model;
import net.certware.hazard.stpa.hazardAnalysis.Note;
import net.certware.hazard.stpa.hazardAnalysis.Requirement;
import net.certware.hazard.stpa.hazardAnalysis.RiskLevel;
import net.certware.hazard.stpa.hazardAnalysis.Scenario;
import net.certware.hazard.stpa.services.HazardAnalysisGrammarAccess;
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
public class HazardAnalysisSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private HazardAnalysisGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == HazardAnalysisPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case HazardAnalysisPackage.ACCIDENT:
				if(context == grammarAccess.getAccidentRule()) {
					sequence_Accident(context, (Accident) semanticObject); 
					return; 
				}
				else break;
			case HazardAnalysisPackage.CONSTRAINT:
				if(context == grammarAccess.getConstraintRule()) {
					sequence_Constraint(context, (Constraint) semanticObject); 
					return; 
				}
				else break;
			case HazardAnalysisPackage.CONTROL:
				if(context == grammarAccess.getControlRule()) {
					sequence_Control(context, (Control) semanticObject); 
					return; 
				}
				else break;
			case HazardAnalysisPackage.DESIGN:
				if(context == grammarAccess.getDesignRule()) {
					sequence_Design(context, (Design) semanticObject); 
					return; 
				}
				else break;
			case HazardAnalysisPackage.HAZARD:
				if(context == grammarAccess.getHazardRule()) {
					sequence_Hazard(context, (Hazard) semanticObject); 
					return; 
				}
				else break;
			case HazardAnalysisPackage.HAZARD_ACCIDENT_LIKELIHOOD:
				if(context == grammarAccess.getHazardAccidentLikelihoodRule()) {
					sequence_HazardAccidentLikelihood(context, (HazardAccidentLikelihood) semanticObject); 
					return; 
				}
				else break;
			case HazardAnalysisPackage.HAZARD_EXPOSURE:
				if(context == grammarAccess.getHazardExposureRule()) {
					sequence_HazardExposure(context, (HazardExposure) semanticObject); 
					return; 
				}
				else break;
			case HazardAnalysisPackage.HAZARD_LEVEL:
				if(context == grammarAccess.getHazardLevelRule()) {
					sequence_HazardLevel(context, (HazardLevel) semanticObject); 
					return; 
				}
				else break;
			case HazardAnalysisPackage.HAZARD_LIKELIHOOD:
				if(context == grammarAccess.getHazardLikelihoodRule()) {
					sequence_HazardLikelihood(context, (HazardLikelihood) semanticObject); 
					return; 
				}
				else break;
			case HazardAnalysisPackage.HAZARD_SEVERITY:
				if(context == grammarAccess.getHazardSeverityRule()) {
					sequence_HazardSeverity(context, (HazardSeverity) semanticObject); 
					return; 
				}
				else break;
			case HazardAnalysisPackage.INCIDENT:
				if(context == grammarAccess.getIncidentRule()) {
					sequence_Incident(context, (Incident) semanticObject); 
					return; 
				}
				else break;
			case HazardAnalysisPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case HazardAnalysisPackage.NOTE:
				if(context == grammarAccess.getNoteRule()) {
					sequence_Note(context, (Note) semanticObject); 
					return; 
				}
				else break;
			case HazardAnalysisPackage.REQUIREMENT:
				if(context == grammarAccess.getRequirementRule()) {
					sequence_Requirement(context, (Requirement) semanticObject); 
					return; 
				}
				else break;
			case HazardAnalysisPackage.RISK_LEVEL:
				if(context == grammarAccess.getRiskLevelRule()) {
					sequence_RiskLevel(context, (RiskLevel) semanticObject); 
					return; 
				}
				else break;
			case HazardAnalysisPackage.SCENARIO:
				if(context == grammarAccess.getScenarioRule()) {
					sequence_Scenario(context, (Scenario) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (desc=STRING ranking=Ranking hazards+=Hazard+ notes+=Note*)
	 */
	protected void sequence_Accident(EObject context, Accident semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constraint=STRING requirements+=Requirement* scenarios+=Scenario* controls+=Control* notes+=Note*)
	 */
	protected void sequence_Constraint(EObject context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     control=STRING
	 */
	protected void sequence_Control(EObject context, Control semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HazardAnalysisPackage.Literals.CONTROL__CONTROL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HazardAnalysisPackage.Literals.CONTROL__CONTROL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getControlAccess().getControlSTRINGTerminalRuleCall_1_0(), semanticObject.getControl());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (allocation=STRING analysis=STRING? rationale=STRING?)
	 */
	protected void sequence_Design(EObject context, Design semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     likelihood=STRING
	 */
	protected void sequence_HazardAccidentLikelihood(EObject context, HazardAccidentLikelihood semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HazardAnalysisPackage.Literals.HAZARD_ACCIDENT_LIKELIHOOD__LIKELIHOOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HazardAnalysisPackage.Literals.HAZARD_ACCIDENT_LIKELIHOOD__LIKELIHOOD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHazardAccidentLikelihoodAccess().getLikelihoodSTRINGTerminalRuleCall_1_0(), semanticObject.getLikelihood());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     exposure=STRING
	 */
	protected void sequence_HazardExposure(EObject context, HazardExposure semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HazardAnalysisPackage.Literals.HAZARD_EXPOSURE__EXPOSURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HazardAnalysisPackage.Literals.HAZARD_EXPOSURE__EXPOSURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHazardExposureAccess().getExposureSTRINGTerminalRuleCall_1_0(), semanticObject.getExposure());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (severity=HazardSeverity likelihood=HazardLikelihood)
	 */
	protected void sequence_HazardLevel(EObject context, HazardLevel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HazardAnalysisPackage.Literals.HAZARD_LEVEL__SEVERITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HazardAnalysisPackage.Literals.HAZARD_LEVEL__SEVERITY));
			if(transientValues.isValueTransient(semanticObject, HazardAnalysisPackage.Literals.HAZARD_LEVEL__LIKELIHOOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HazardAnalysisPackage.Literals.HAZARD_LEVEL__LIKELIHOOD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHazardLevelAccess().getSeverityHazardSeverityParserRuleCall_1_0(), semanticObject.getSeverity());
		feeder.accept(grammarAccess.getHazardLevelAccess().getLikelihoodHazardLikelihoodParserRuleCall_3_0(), semanticObject.getLikelihood());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_HazardLikelihood(EObject context, HazardLikelihood semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HazardAnalysisPackage.Literals.HAZARD_LIKELIHOOD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HazardAnalysisPackage.Literals.HAZARD_LIKELIHOOD__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHazardLikelihoodAccess().getValueIDTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_HazardSeverity(EObject context, HazardSeverity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HazardAnalysisPackage.Literals.HAZARD_SEVERITY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HazardAnalysisPackage.Literals.HAZARD_SEVERITY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHazardSeverityAccess().getValueIDTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (desc=STRING level=HazardLevel risk=RiskLevel constraints+=Constraint+)
	 */
	protected void sequence_Hazard(EObject context, Hazard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (desc=STRING ranking=Ranking hazards+=Hazard+ notes+=Note*)
	 */
	protected void sequence_Incident(EObject context, Incident semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (accidents+=Accident* indicents+=Incident*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     note=STRING
	 */
	protected void sequence_Note(EObject context, Note semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HazardAnalysisPackage.Literals.NOTE__NOTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HazardAnalysisPackage.Literals.NOTE__NOTE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNoteAccess().getNoteSTRINGTerminalRuleCall_1_0(), semanticObject.getNote());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (requirement=STRING designs+=Design* notes+=Note*)
	 */
	protected void sequence_Requirement(EObject context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exposure=HazardExposure likelihood=HazardAccidentLikelihood)
	 */
	protected void sequence_RiskLevel(EObject context, RiskLevel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HazardAnalysisPackage.Literals.RISK_LEVEL__EXPOSURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HazardAnalysisPackage.Literals.RISK_LEVEL__EXPOSURE));
			if(transientValues.isValueTransient(semanticObject, HazardAnalysisPackage.Literals.RISK_LEVEL__LIKELIHOOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HazardAnalysisPackage.Literals.RISK_LEVEL__LIKELIHOOD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRiskLevelAccess().getExposureHazardExposureParserRuleCall_2_0(), semanticObject.getExposure());
		feeder.accept(grammarAccess.getRiskLevelAccess().getLikelihoodHazardAccidentLikelihoodParserRuleCall_3_0(), semanticObject.getLikelihood());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     scenario=STRING
	 */
	protected void sequence_Scenario(EObject context, Scenario semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HazardAnalysisPackage.Literals.SCENARIO__SCENARIO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HazardAnalysisPackage.Literals.SCENARIO__SCENARIO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScenarioAccess().getScenarioSTRINGTerminalRuleCall_1_0(), semanticObject.getScenario());
		feeder.finish();
	}
}
