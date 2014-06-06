package net.certware.state.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.certware.state.services.StateAnalysisGrammarAccess;
import net.certware.state.stateAnalysis.Component;
import net.certware.state.stateAnalysis.Controller;
import net.certware.state.stateAnalysis.DataCollection;
import net.certware.state.stateAnalysis.DataProduct;
import net.certware.state.stateAnalysis.Deployment;
import net.certware.state.stateAnalysis.DeploymentSet;
import net.certware.state.stateAnalysis.Device;
import net.certware.state.stateAnalysis.DeviceCommand;
import net.certware.state.stateAnalysis.DeviceMeasurement;
import net.certware.state.stateAnalysis.Estimator;
import net.certware.state.stateAnalysis.HardwareAdapter;
import net.certware.state.stateAnalysis.HardwareCommand;
import net.certware.state.stateAnalysis.HardwareMeasurement;
import net.certware.state.stateAnalysis.QosPolicy;
import net.certware.state.stateAnalysis.StateAnalysisPackage;
import net.certware.state.stateAnalysis.StateConstraint;
import net.certware.state.stateAnalysis.StateUpdate;
import net.certware.state.stateAnalysis.StateVariable;
import net.certware.state.stateAnalysis.Subsystem;
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
public class StateAnalysisSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StateAnalysisGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == StateAnalysisPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StateAnalysisPackage.COMPONENT:
				if(context == grammarAccess.getComponentRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.CONTROLLER:
				if(context == grammarAccess.getControllerRule()) {
					sequence_Controller(context, (Controller) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.DATA_COLLECTION:
				if(context == grammarAccess.getDataCollectionRule()) {
					sequence_DataCollection(context, (DataCollection) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.DATA_PRODUCT:
				if(context == grammarAccess.getDataProductRule()) {
					sequence_DataProduct(context, (DataProduct) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.DEPLOYMENT:
				if(context == grammarAccess.getDeploymentRule()) {
					sequence_Deployment(context, (Deployment) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.DEPLOYMENT_SET:
				if(context == grammarAccess.getDeploymentSetRule()) {
					sequence_DeploymentSet(context, (DeploymentSet) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.DEVICE:
				if(context == grammarAccess.getDeviceRule()) {
					sequence_Device(context, (Device) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.DEVICE_COMMAND:
				if(context == grammarAccess.getDeviceCommandRule()) {
					sequence_DeviceCommand(context, (DeviceCommand) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.DEVICE_MEASUREMENT:
				if(context == grammarAccess.getDeviceMeasurementRule()) {
					sequence_DeviceMeasurement(context, (DeviceMeasurement) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.ESTIMATOR:
				if(context == grammarAccess.getEstimatorRule()) {
					sequence_Estimator(context, (Estimator) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.HARDWARE_ADAPTER:
				if(context == grammarAccess.getHardwareAdapterRule()) {
					sequence_HardwareAdapter(context, (HardwareAdapter) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.HARDWARE_COMMAND:
				if(context == grammarAccess.getHardwareCommandRule()) {
					sequence_HardwareCommand(context, (HardwareCommand) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.HARDWARE_MEASUREMENT:
				if(context == grammarAccess.getHardwareMeasurementRule()) {
					sequence_HardwareMeasurement(context, (HardwareMeasurement) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.QOS_POLICY:
				if(context == grammarAccess.getQosPolicyRule()) {
					sequence_QosPolicy(context, (QosPolicy) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.STATE_CONSTRAINT:
				if(context == grammarAccess.getStateConstraintRule()) {
					sequence_StateConstraint(context, (StateConstraint) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.STATE_UPDATE:
				if(context == grammarAccess.getStateUpdateRule()) {
					sequence_StateUpdate(context, (StateUpdate) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.STATE_VARIABLE:
				if(context == grammarAccess.getStateVariableRule()) {
					sequence_StateVariable(context, (StateVariable) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.SUBSYSTEM:
				if(context == grammarAccess.getSubsystemRule()) {
					sequence_Subsystem(context, (Subsystem) semanticObject); 
					return; 
				}
				else break;
			case StateAnalysisPackage.SYSTEM:
				if(context == grammarAccess.getSystemRule()) {
					sequence_System(context, (net.certware.state.stateAnalysis.System) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         stateVariables+=StateVariable+ 
	 *         controllers+=Controller+ 
	 *         estimators+=Estimator+ 
	 *         adapters+=HardwareAdapter+
	 *     )
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING delegates+=[Controller|ID]* stateConstraint+=StateConstraint+ hardwareCommand+=HardwareCommand+)
	 */
	protected void sequence_Controller(EObject context, Controller semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING policies+=QosPolicy* products+=DataProduct*)
	 */
	protected void sequence_DataCollection(EObject context, DataCollection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING content=STRING)
	 */
	protected void sequence_DataProduct(EObject context, DataProduct semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DATA_PRODUCT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DATA_PRODUCT__NAME));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DATA_PRODUCT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DATA_PRODUCT__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DATA_PRODUCT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DATA_PRODUCT__CONTENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataProductAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDataProductAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getDataProductAccess().getContentSTRINGTerminalRuleCall_4_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING deployments+=Deployment*)
	 */
	protected void sequence_DeploymentSet(EObject context, DeploymentSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING components+=Component* catalogs+=DataCollection*)
	 */
	protected void sequence_Deployment(EObject context, Deployment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING)
	 */
	protected void sequence_DeviceCommand(EObject context, DeviceCommand semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DEVICE_COMMAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DEVICE_COMMAND__NAME));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DEVICE_COMMAND__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DEVICE_COMMAND__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeviceCommandAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDeviceCommandAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=ID)
	 */
	protected void sequence_DeviceMeasurement(EObject context, DeviceMeasurement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DEVICE_MEASUREMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DEVICE_MEASUREMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DEVICE_MEASUREMENT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DEVICE_MEASUREMENT__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeviceMeasurementAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDeviceMeasurementAccess().getDescriptionIDTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING deviceCommands+=DeviceCommand* deviceMeasurements+=DeviceMeasurement*)
	 */
	protected void sequence_Device(EObject context, Device semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         distilledMeasurements+=[Estimator|ID]* 
	 *         stateConstraints+=StateConstraint* 
	 *         stateUpdates+=StateUpdate+ 
	 *         hardwareMeasurement+=HardwareMeasurement+
	 *     )
	 */
	protected void sequence_Estimator(EObject context, Estimator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=ID 
	 *         hardwareCommands+=HardwareCommand* 
	 *         hardwareMeasurements+=HardwareMeasurement* 
	 *         deviceCommands+=DeviceCommand* 
	 *         deviceMeasurements+=DeviceMeasurement*
	 *     )
	 */
	protected void sequence_HardwareAdapter(EObject context, HardwareAdapter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING)
	 */
	protected void sequence_HardwareCommand(EObject context, HardwareCommand semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.HARDWARE_COMMAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.HARDWARE_COMMAND__NAME));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.HARDWARE_COMMAND__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.HARDWARE_COMMAND__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHardwareCommandAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getHardwareCommandAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING)
	 */
	protected void sequence_HardwareMeasurement(EObject context, HardwareMeasurement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.HARDWARE_MEASUREMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.HARDWARE_MEASUREMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.HARDWARE_MEASUREMENT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.HARDWARE_MEASUREMENT__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHardwareMeasurementAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getHardwareMeasurementAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING policy=STRING)
	 */
	protected void sequence_QosPolicy(EObject context, QosPolicy semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.QOS_POLICY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.QOS_POLICY__NAME));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.QOS_POLICY__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.QOS_POLICY__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.QOS_POLICY__POLICY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.QOS_POLICY__POLICY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQosPolicyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getQosPolicyAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getQosPolicyAccess().getPolicySTRINGTerminalRuleCall_4_0(), semanticObject.getPolicy());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING)
	 */
	protected void sequence_StateConstraint(EObject context, StateConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.STATE_CONSTRAINT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.STATE_CONSTRAINT__NAME));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.STATE_CONSTRAINT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.STATE_CONSTRAINT__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStateConstraintAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStateConstraintAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING)
	 */
	protected void sequence_StateUpdate(EObject context, StateUpdate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.STATE_UPDATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.STATE_UPDATE__NAME));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.STATE_UPDATE__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.STATE_UPDATE__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStateUpdateAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStateUpdateAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         representationType=StateRepresentationType 
	 *         inStateConstraints+=StateConstraint* 
	 *         outStateConstraints+=StateConstraint* 
	 *         stateUpdates+=StateUpdate* 
	 *         influencedBy+=StateVariable*
	 *     )
	 */
	protected void sequence_StateVariable(EObject context, StateVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING deploymentSets+=DeploymentSet*)
	 */
	protected void sequence_Subsystem(EObject context, Subsystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING subsystems+=Subsystem*)
	 */
	protected void sequence_System(EObject context, net.certware.state.stateAnalysis.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
