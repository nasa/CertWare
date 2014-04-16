package net.certware.state.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.certware.state.services.StateAnalysisGrammarAccess;
import net.certware.state.stateAnalysis.Component;
import net.certware.state.stateAnalysis.Controller;
import net.certware.state.stateAnalysis.Deployment;
import net.certware.state.stateAnalysis.DeploymentSet;
import net.certware.state.stateAnalysis.Device;
import net.certware.state.stateAnalysis.DeviceCommand;
import net.certware.state.stateAnalysis.DeviceMeasurement;
import net.certware.state.stateAnalysis.Estimator;
import net.certware.state.stateAnalysis.HardwareAdapter;
import net.certware.state.stateAnalysis.HardwareCommand;
import net.certware.state.stateAnalysis.HardwareMeasurement;
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
	 *     (name=ID sv=StateVariable controller+=Controller+ estimator+=Estimator+)
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID stateConstraint+=StateConstraint hardwareCommand+=HardwareCommand+)
	 */
	protected void sequence_Controller(EObject context, Controller semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID deployments+=Deployment*)
	 */
	protected void sequence_DeploymentSet(EObject context, DeploymentSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID components+=Component*)
	 */
	protected void sequence_Deployment(EObject context, Deployment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID adapter=[HardwareAdapter|ID] device=Device)
	 */
	protected void sequence_DeviceCommand(EObject context, DeviceCommand semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DEVICE_COMMAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DEVICE_COMMAND__NAME));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DEVICE_COMMAND__ADAPTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DEVICE_COMMAND__ADAPTER));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DEVICE_COMMAND__DEVICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DEVICE_COMMAND__DEVICE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeviceCommandAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDeviceCommandAccess().getAdapterHardwareAdapterIDTerminalRuleCall_1_0_1(), semanticObject.getAdapter());
		feeder.accept(grammarAccess.getDeviceCommandAccess().getDeviceDeviceParserRuleCall_2_0(), semanticObject.getDevice());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID adapter=[HardwareAdapter|ID] device=Device)
	 */
	protected void sequence_DeviceMeasurement(EObject context, DeviceMeasurement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DEVICE_MEASUREMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DEVICE_MEASUREMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DEVICE_MEASUREMENT__ADAPTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DEVICE_MEASUREMENT__ADAPTER));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DEVICE_MEASUREMENT__DEVICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DEVICE_MEASUREMENT__DEVICE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeviceMeasurementAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDeviceMeasurementAccess().getAdapterHardwareAdapterIDTerminalRuleCall_1_0_1(), semanticObject.getAdapter());
		feeder.accept(grammarAccess.getDeviceMeasurementAccess().getDeviceDeviceParserRuleCall_2_0(), semanticObject.getDevice());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING)
	 */
	protected void sequence_Device(EObject context, Device semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DEVICE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DEVICE__NAME));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.DEVICE__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.DEVICE__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDeviceAccess().getDescriptionSTRINGTerminalRuleCall_1_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID hardwareMeasurement+=HardwareMeasurement+)
	 */
	protected void sequence_Estimator(EObject context, Estimator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         hardwareCommands+=[HardwareCommand|ID]* 
	 *         hardwareMeasurements+=[HardwareMeasurement|ID]* 
	 *         deviceCommands+=[DeviceCommand|ID]* 
	 *         deviceMeasurements+=[DeviceMeasurement|ID]*
	 *     )
	 */
	protected void sequence_HardwareAdapter(EObject context, HardwareAdapter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID controller=[Controller|ID] adapter=[HardwareAdapter|ID])
	 */
	protected void sequence_HardwareCommand(EObject context, HardwareCommand semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.HARDWARE_COMMAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.HARDWARE_COMMAND__NAME));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.HARDWARE_COMMAND__CONTROLLER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.HARDWARE_COMMAND__CONTROLLER));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.HARDWARE_COMMAND__ADAPTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.HARDWARE_COMMAND__ADAPTER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHardwareCommandAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getHardwareCommandAccess().getControllerControllerIDTerminalRuleCall_1_0_1(), semanticObject.getController());
		feeder.accept(grammarAccess.getHardwareCommandAccess().getAdapterHardwareAdapterIDTerminalRuleCall_2_0_1(), semanticObject.getAdapter());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID adapter=[HardwareAdapter|ID] estimator=[Estimator|ID])
	 */
	protected void sequence_HardwareMeasurement(EObject context, HardwareMeasurement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.HARDWARE_MEASUREMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.HARDWARE_MEASUREMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.HARDWARE_MEASUREMENT__ADAPTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.HARDWARE_MEASUREMENT__ADAPTER));
			if(transientValues.isValueTransient(semanticObject, StateAnalysisPackage.Literals.HARDWARE_MEASUREMENT__ESTIMATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateAnalysisPackage.Literals.HARDWARE_MEASUREMENT__ESTIMATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHardwareMeasurementAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getHardwareMeasurementAccess().getAdapterHardwareAdapterIDTerminalRuleCall_1_0_1(), semanticObject.getAdapter());
		feeder.accept(grammarAccess.getHardwareMeasurementAccess().getEstimatorEstimatorIDTerminalRuleCall_2_0_1(), semanticObject.getEstimator());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID controllers+=[Controller|ID]* estimators+=[Estimator|ID]*)
	 */
	protected void sequence_StateConstraint(EObject context, StateConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID controllers+=[Controller|ID]* estimators+=[Estimator|ID]*)
	 */
	protected void sequence_StateUpdate(EObject context, StateUpdate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID stateConstraints+=[StateConstraint|ID]* stateUpdates+=[StateUpdate|ID]*)
	 */
	protected void sequence_StateVariable(EObject context, StateVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID deploymentSets+=DeploymentSet*)
	 */
	protected void sequence_Subsystem(EObject context, Subsystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     subsystems+=Subsystem*
	 */
	protected void sequence_System(EObject context, net.certware.state.stateAnalysis.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
