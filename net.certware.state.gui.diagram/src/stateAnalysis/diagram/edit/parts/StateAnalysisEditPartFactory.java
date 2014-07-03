/*
 * 
 */
package stateAnalysis.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class StateAnalysisEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getVisualID(view)) {

			case stateAnalysis.diagram.edit.parts.SystemEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.SystemEditPart(view);

			case stateAnalysis.diagram.edit.parts.SubsystemEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.SubsystemEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.SubsystemNameEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.SubsystemNameEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DeploymentSetEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DeploymentSetEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DeploymentSetNameEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DeploymentSetNameEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DeploymentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DeploymentNameEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DeploymentNameEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateVariableEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateVariableEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateVariableNameEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateVariableNameEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateVariable2EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateVariable2EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateVariableName2EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateVariableName2EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateConstraintEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateConstraintEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateConstraintNameEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateConstraintNameEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateConstraint2EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateConstraint2EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateConstraintName2EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateConstraintName2EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateUpdateEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateUpdateEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateUpdateNameEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateUpdateNameEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.ControllerEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.ControllerNameEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.ControllerNameEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateConstraint3EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateConstraint3EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateConstraintName3EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateConstraintName3EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.HardwareCommandEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.HardwareCommandEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.HardwareCommandNameEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.HardwareCommandNameEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.EstimatorEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.EstimatorEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.EstimatorNameEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.EstimatorNameEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateConstraint4EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateConstraint4EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateConstraintName4EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateConstraintName4EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateUpdate2EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateUpdate2EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateUpdateName2EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateUpdateName2EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.HardwareMeasurementEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.HardwareMeasurementEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.HardwareMeasurementNameEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.HardwareMeasurementNameEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.HardwareAdapterEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.HardwareAdapterEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.HardwareAdapterNameEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.HardwareAdapterNameEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.HardwareCommand2EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.HardwareCommand2EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.HardwareCommandName2EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.HardwareCommandName2EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.HardwareMeasurement2EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.HardwareMeasurement2EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.HardwareMeasurementName2EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.HardwareMeasurementName2EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DeviceEditPart(view);

			case stateAnalysis.diagram.edit.parts.DeviceNameEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DeviceNameEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DeviceCommandEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DeviceCommandEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DeviceCommandNameEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DeviceCommandNameEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DeviceMeasurementEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DeviceMeasurementEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DeviceMeasurementNameEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DeviceMeasurementNameEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DataCollectionEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DataCollectionEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DataCollectionNameEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DataCollectionNameEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.QosPolicyEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.QosPolicyEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.QosPolicyNameEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.QosPolicyNameEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DataProductEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DataProductEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DataProductNameEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DataProductNameEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.SubsystemSubsystemDeploymentSetsCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.SubsystemSubsystemDeploymentSetsCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DeploymentSetDeploymentSetDeploymentsCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DeploymentSetDeploymentSetDeploymentsCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DeploymentDeploymentComponentsCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DeploymentDeploymentComponentsCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DeploymentDeploymentCatalogsCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DeploymentDeploymentCatalogsCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartment2EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartment2EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartment2EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartment2EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartment2EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartment2EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartment2EditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartment2EditPart(
						view);

			case stateAnalysis.diagram.edit.parts.ControllerControllerStateConstraintCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.ControllerControllerStateConstraintCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.ControllerControllerHardwareCommandCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.ControllerControllerHardwareCommandCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.EstimatorEstimatorStateConstraintsCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.EstimatorEstimatorStateConstraintsCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.EstimatorEstimatorStateUpdatesCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.EstimatorEstimatorStateUpdatesCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.EstimatorEstimatorHardwareMeasurementCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.EstimatorEstimatorHardwareMeasurementCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareCommandsCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareCommandsCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareMeasurementsCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareMeasurementsCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterDevicesCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterDevicesCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DeviceDeviceDeviceCommandsCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DeviceDeviceDeviceCommandsCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DeviceDeviceDeviceMeasurementsCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DeviceDeviceDeviceMeasurementsCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DataCollectionDataCollectionPoliciesCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DataCollectionDataCollectionPoliciesCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.DataCollectionDataCollectionProductsCompartmentEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.DataCollectionDataCollectionProductsCompartmentEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.ControllerDelegatesEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.ControllerDelegatesEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.ControllerDelegatesExternalLabelEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.ControllerDelegatesExternalLabelEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.EstimatorDistilledMeasurementsEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.EstimatorDistilledMeasurementsEditPart(
						view);

			case stateAnalysis.diagram.edit.parts.EstimatorDistilledMeasurementsExternalLabelEditPart.VISUAL_ID:
				return new stateAnalysis.diagram.edit.parts.EstimatorDistilledMeasurementsExternalLabelEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
