/*
 * 
 */
package stateAnalysis.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class StateAnalysisVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "net.certware.state.gui.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (stateAnalysis.diagram.edit.parts.SystemEditPart.MODEL_ID
					.equals(view.getType())) {
				return stateAnalysis.diagram.edit.parts.SystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (stateAnalysis.StateAnalysisPackage.eINSTANCE.getSystem()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((stateAnalysis.System) domainElement)) {
			return stateAnalysis.diagram.edit.parts.SystemEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
				.getModelID(containerView);
		if (!stateAnalysis.diagram.edit.parts.SystemEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"stateAnalysis".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (stateAnalysis.diagram.edit.parts.SystemEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = stateAnalysis.diagram.edit.parts.SystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case stateAnalysis.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE.getSubsystem()
					.isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.SubsystemEditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.SubsystemSubsystemDeploymentSetsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE.getDeploymentSet()
					.isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.DeploymentSetEditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DeploymentSetDeploymentSetDeploymentsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE.getDeployment()
					.isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.DeploymentEditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DeploymentDeploymentComponentsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE.getStateVariable()
					.isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.StateVariableEditPart.VISUAL_ID;
			}
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE.getController()
					.isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.ControllerEditPart.VISUAL_ID;
			}
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE.getEstimator()
					.isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.EstimatorEditPart.VISUAL_ID;
			}
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getHardwareAdapter().isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.HardwareAdapterEditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DeploymentDeploymentCatalogsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getDataCollection().isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.DataCollectionEditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getStateConstraint().isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.StateConstraintEditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getStateConstraint().isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.StateConstraint2EditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE.getStateUpdate()
					.isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.StateUpdateEditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE.getStateVariable()
					.isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.StateVariable2EditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartment2EditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getStateConstraint().isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.StateConstraintEditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartment2EditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getStateConstraint().isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.StateConstraint2EditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartment2EditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE.getStateUpdate()
					.isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.StateUpdateEditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartment2EditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE.getStateVariable()
					.isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.StateVariable2EditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.ControllerControllerStateConstraintCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getStateConstraint().isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.StateConstraint3EditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.ControllerControllerHardwareCommandCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getHardwareCommand().isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.HardwareCommandEditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.EstimatorEstimatorStateConstraintsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getStateConstraint().isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.StateConstraint4EditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.EstimatorEstimatorStateUpdatesCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE.getStateUpdate()
					.isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.StateUpdate2EditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.EstimatorEstimatorHardwareMeasurementCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getHardwareMeasurement().isSuperTypeOf(
							domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.HardwareMeasurementEditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareCommandsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getHardwareCommand().isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.HardwareCommand2EditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareMeasurementsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getHardwareMeasurement().isSuperTypeOf(
							domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.HardwareMeasurement2EditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterDevicesCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE.getDevice()
					.isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.DeviceEditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DeviceDeviceDeviceCommandsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE.getDeviceCommand()
					.isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.DeviceCommandEditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DeviceDeviceDeviceMeasurementsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getDeviceMeasurement().isSuperTypeOf(
							domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.DeviceMeasurementEditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DataCollectionDataCollectionPoliciesCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE.getQosPolicy()
					.isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.QosPolicyEditPart.VISUAL_ID;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DataCollectionDataCollectionProductsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.StateAnalysisPackage.eINSTANCE.getDataProduct()
					.isSuperTypeOf(domainElement.eClass())) {
				return stateAnalysis.diagram.edit.parts.DataProductEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
				.getModelID(containerView);
		if (!stateAnalysis.diagram.edit.parts.SystemEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"stateAnalysis".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (stateAnalysis.diagram.edit.parts.SystemEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = stateAnalysis.diagram.edit.parts.SystemEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case stateAnalysis.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.SubsystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.SubsystemEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.SubsystemNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.SubsystemSubsystemDeploymentSetsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DeploymentSetEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.DeploymentSetNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.DeploymentSetDeploymentSetDeploymentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.DeploymentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.DeploymentDeploymentComponentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.DeploymentDeploymentCatalogsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariableEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariable2EditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateVariableName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateConstraintEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateConstraintNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateConstraint2EditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateConstraintName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateUpdateEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateUpdateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.ControllerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.ControllerControllerStateConstraintCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.ControllerControllerHardwareCommandCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateConstraint3EditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateConstraintName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.HardwareCommandEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.HardwareCommandNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.EstimatorEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.EstimatorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.EstimatorEstimatorStateConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.EstimatorEstimatorStateUpdatesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.EstimatorEstimatorHardwareMeasurementCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateConstraint4EditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateConstraintName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateUpdate2EditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateUpdateName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.HardwareMeasurementEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.HardwareMeasurementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.HardwareAdapterEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.HardwareAdapterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareCommandsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareMeasurementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterDevicesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.HardwareCommand2EditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.HardwareCommandName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.HardwareMeasurement2EditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.HardwareMeasurementName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.DeviceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.DeviceDeviceDeviceCommandsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.DeviceDeviceDeviceMeasurementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DeviceCommandEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.DeviceCommandNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DeviceMeasurementEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.DeviceMeasurementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DataCollectionEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.DataCollectionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.DataCollectionDataCollectionPoliciesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.DataCollectionDataCollectionProductsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.QosPolicyEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.QosPolicyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DataProductEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.DataProductNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.SubsystemSubsystemDeploymentSetsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.DeploymentSetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DeploymentSetDeploymentSetDeploymentsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.DeploymentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DeploymentDeploymentComponentsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.ControllerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.EstimatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (stateAnalysis.diagram.edit.parts.HardwareAdapterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DeploymentDeploymentCatalogsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.DataCollectionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateConstraint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateUpdateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartment2EditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartment2EditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateConstraint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartment2EditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateUpdateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartment2EditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateVariable2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.ControllerControllerStateConstraintCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateConstraint3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.ControllerControllerHardwareCommandCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.HardwareCommandEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.EstimatorEstimatorStateConstraintsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateConstraint4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.EstimatorEstimatorStateUpdatesCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.StateUpdate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.EstimatorEstimatorHardwareMeasurementCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.HardwareMeasurementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareCommandsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.HardwareCommand2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareMeasurementsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.HardwareMeasurement2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterDevicesCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.DeviceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DeviceDeviceDeviceCommandsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.DeviceCommandEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DeviceDeviceDeviceMeasurementsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.DeviceMeasurementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DataCollectionDataCollectionPoliciesCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.QosPolicyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.DataCollectionDataCollectionProductsCompartmentEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.DataProductEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.ControllerDelegatesEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.ControllerDelegatesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case stateAnalysis.diagram.edit.parts.EstimatorDistilledMeasurementsEditPart.VISUAL_ID:
			if (stateAnalysis.diagram.edit.parts.EstimatorDistilledMeasurementsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(stateAnalysis.System element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case stateAnalysis.diagram.edit.parts.SubsystemSubsystemDeploymentSetsCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.DeploymentSetDeploymentSetDeploymentsCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.DeploymentDeploymentComponentsCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.DeploymentDeploymentCatalogsCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartment2EditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartment2EditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartment2EditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartment2EditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.ControllerControllerStateConstraintCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.ControllerControllerHardwareCommandCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.EstimatorEstimatorStateConstraintsCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.EstimatorEstimatorStateUpdatesCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.EstimatorEstimatorHardwareMeasurementCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareCommandsCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareMeasurementsCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterDevicesCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.DeviceDeviceDeviceCommandsCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.DeviceDeviceDeviceMeasurementsCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.DataCollectionDataCollectionPoliciesCompartmentEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.DataCollectionDataCollectionProductsCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case stateAnalysis.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return false;
		case stateAnalysis.diagram.edit.parts.QosPolicyEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.DataProductEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.StateConstraintEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.StateConstraint2EditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.StateUpdateEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.StateConstraint3EditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.HardwareCommandEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.StateConstraint4EditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.StateUpdate2EditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.HardwareMeasurementEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.HardwareCommand2EditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.HardwareMeasurement2EditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.DeviceCommandEditPart.VISUAL_ID:
		case stateAnalysis.diagram.edit.parts.DeviceMeasurementEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
