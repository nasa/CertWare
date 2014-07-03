/*
 * 
 */
package stateAnalysis.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class StateAnalysisParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser subsystemName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getSubsystemName_5001Parser() {
		if (subsystemName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getSubsystem_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Subsystem: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Subsystem: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Subsystem: {0}"); //$NON-NLS-1$
			subsystemName_5001Parser = parser;
		}
		return subsystemName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser deploymentSetName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getDeploymentSetName_5002Parser() {
		if (deploymentSetName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getDeploymentSet_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Deployment Set: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Deployment Set: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Deployment Set: {0}"); //$NON-NLS-1$
			deploymentSetName_5002Parser = parser;
		}
		return deploymentSetName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser deploymentName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getDeploymentName_5003Parser() {
		if (deploymentName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getDeployment_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Deployment: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Deployment: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Deployment: {0}"); //$NON-NLS-1$
			deploymentName_5003Parser = parser;
		}
		return deploymentName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser stateVariableName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getStateVariableName_5028Parser() {
		if (stateVariableName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getComponent_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("SV: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("SV: {0}"); //$NON-NLS-1$
			parser.setEditPattern("SV: {0}"); //$NON-NLS-1$
			stateVariableName_5028Parser = parser;
		}
		return stateVariableName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser stateConstraintName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getStateConstraintName_5008Parser() {
		if (stateConstraintName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getStateConstraint_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("State Constraint: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("State Constraint: {0}"); //$NON-NLS-1$
			parser.setEditPattern("State Constraint: {0}"); //$NON-NLS-1$
			stateConstraintName_5008Parser = parser;
		}
		return stateConstraintName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser stateConstraintName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getStateConstraintName_5009Parser() {
		if (stateConstraintName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getStateConstraint_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("State Constraint: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("State Constraint: {0}"); //$NON-NLS-1$
			parser.setEditPattern("State Constraint: {0}"); //$NON-NLS-1$
			stateConstraintName_5009Parser = parser;
		}
		return stateConstraintName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser stateUpdateName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getStateUpdateName_5010Parser() {
		if (stateUpdateName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getStateUpdate_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("State Update: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("State Update: {0}"); //$NON-NLS-1$
			parser.setEditPattern("State Update: {0}"); //$NON-NLS-1$
			stateUpdateName_5010Parser = parser;
		}
		return stateUpdateName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser controllerName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getControllerName_5029Parser() {
		if (controllerName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getComponent_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Controller: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Controller: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Controller: {0}"); //$NON-NLS-1$
			controllerName_5029Parser = parser;
		}
		return controllerName_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser stateVariableName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getStateVariableName_5011Parser() {
		if (stateVariableName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getComponent_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("SV: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("SV: {0}"); //$NON-NLS-1$
			parser.setEditPattern("SV: {0}"); //$NON-NLS-1$
			stateVariableName_5011Parser = parser;
		}
		return stateVariableName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser stateConstraintName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getStateConstraintName_5013Parser() {
		if (stateConstraintName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getStateConstraint_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("State Constraint: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("State Constraint: {0}"); //$NON-NLS-1$
			parser.setEditPattern("State Constraint: {0}"); //$NON-NLS-1$
			stateConstraintName_5013Parser = parser;
		}
		return stateConstraintName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser hardwareCommandName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getHardwareCommandName_5014Parser() {
		if (hardwareCommandName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getHardwareCommand_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Command: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Command: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Command: {0}"); //$NON-NLS-1$
			hardwareCommandName_5014Parser = parser;
		}
		return hardwareCommandName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser estimatorName_5030Parser;

	/**
	 * @generated
	 */
	private IParser getEstimatorName_5030Parser() {
		if (estimatorName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getComponent_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Estimator: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Estimator: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Estimator: {0}"); //$NON-NLS-1$
			estimatorName_5030Parser = parser;
		}
		return estimatorName_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser stateConstraintName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getStateConstraintName_5016Parser() {
		if (stateConstraintName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getStateConstraint_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("State Constraint: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("State Constraint: {0}"); //$NON-NLS-1$
			parser.setEditPattern("State Constraint: {0}"); //$NON-NLS-1$
			stateConstraintName_5016Parser = parser;
		}
		return stateConstraintName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser stateUpdateName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getStateUpdateName_5017Parser() {
		if (stateUpdateName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getStateUpdate_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("State Update: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("State Update: {0}"); //$NON-NLS-1$
			parser.setEditPattern("State Update: {0}"); //$NON-NLS-1$
			stateUpdateName_5017Parser = parser;
		}
		return stateUpdateName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser hardwareMeasurementName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getHardwareMeasurementName_5018Parser() {
		if (hardwareMeasurementName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getHardwareMeasurement_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Measurement: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Measurement: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Measurement: {0}"); //$NON-NLS-1$
			hardwareMeasurementName_5018Parser = parser;
		}
		return hardwareMeasurementName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser hardwareAdapterName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getHardwareAdapterName_5031Parser() {
		if (hardwareAdapterName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getComponent_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Hardware Adapter: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Hardware Adapter: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Hardware Adapter: {0}"); //$NON-NLS-1$
			hardwareAdapterName_5031Parser = parser;
		}
		return hardwareAdapterName_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser hardwareCommandName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getHardwareCommandName_5020Parser() {
		if (hardwareCommandName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getHardwareCommand_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Command: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Command: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Command: {0}"); //$NON-NLS-1$
			hardwareCommandName_5020Parser = parser;
		}
		return hardwareCommandName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser hardwareMeasurementName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getHardwareMeasurementName_5021Parser() {
		if (hardwareMeasurementName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getHardwareMeasurement_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Measurement: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Measurement: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Measurement: {0}"); //$NON-NLS-1$
			hardwareMeasurementName_5021Parser = parser;
		}
		return hardwareMeasurementName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser deviceName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceName_5027Parser() {
		if (deviceName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getDevice_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Device: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Device: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Device: {0}"); //$NON-NLS-1$
			deviceName_5027Parser = parser;
		}
		return deviceName_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser deviceCommandName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceCommandName_5025Parser() {
		if (deviceCommandName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getDeviceCommand_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Device Command: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Device Command: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Device Command: {0}"); //$NON-NLS-1$
			deviceCommandName_5025Parser = parser;
		}
		return deviceCommandName_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser deviceMeasurementName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceMeasurementName_5026Parser() {
		if (deviceMeasurementName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getDeviceMeasurement_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Device Measurement: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Device Measurement: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Device Measurement: {0}"); //$NON-NLS-1$
			deviceMeasurementName_5026Parser = parser;
		}
		return deviceMeasurementName_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataCollectionName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getDataCollectionName_5007Parser() {
		if (dataCollectionName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getDataCollection_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Data Collection: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Data Collection: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Data Collection: {0}"); //$NON-NLS-1$
			dataCollectionName_5007Parser = parser;
		}
		return dataCollectionName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser qosPolicyName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getQosPolicyName_5005Parser() {
		if (qosPolicyName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getQosPolicy_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("QoS Policy: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("QoS Policy: {0}"); //$NON-NLS-1$
			parser.setEditPattern("QoS Policy: {0}"); //$NON-NLS-1$
			qosPolicyName_5005Parser = parser;
		}
		return qosPolicyName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataProductName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getDataProductName_5006Parser() {
		if (dataProductName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getDataProduct_Name() };
			stateAnalysis.diagram.parsers.MessageFormatParser parser = new stateAnalysis.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("Product: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Product: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Product: {0}"); //$NON-NLS-1$
			dataProductName_5006Parser = parser;
		}
		return dataProductName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case stateAnalysis.diagram.edit.parts.SubsystemNameEditPart.VISUAL_ID:
			return getSubsystemName_5001Parser();
		case stateAnalysis.diagram.edit.parts.DeploymentSetNameEditPart.VISUAL_ID:
			return getDeploymentSetName_5002Parser();
		case stateAnalysis.diagram.edit.parts.DeploymentNameEditPart.VISUAL_ID:
			return getDeploymentName_5003Parser();
		case stateAnalysis.diagram.edit.parts.StateVariableNameEditPart.VISUAL_ID:
			return getStateVariableName_5028Parser();
		case stateAnalysis.diagram.edit.parts.StateVariableName2EditPart.VISUAL_ID:
			return getStateVariableName_5011Parser();
		case stateAnalysis.diagram.edit.parts.StateConstraintNameEditPart.VISUAL_ID:
			return getStateConstraintName_5008Parser();
		case stateAnalysis.diagram.edit.parts.StateConstraintName2EditPart.VISUAL_ID:
			return getStateConstraintName_5009Parser();
		case stateAnalysis.diagram.edit.parts.StateUpdateNameEditPart.VISUAL_ID:
			return getStateUpdateName_5010Parser();
		case stateAnalysis.diagram.edit.parts.ControllerNameEditPart.VISUAL_ID:
			return getControllerName_5029Parser();
		case stateAnalysis.diagram.edit.parts.StateConstraintName3EditPart.VISUAL_ID:
			return getStateConstraintName_5013Parser();
		case stateAnalysis.diagram.edit.parts.HardwareCommandNameEditPart.VISUAL_ID:
			return getHardwareCommandName_5014Parser();
		case stateAnalysis.diagram.edit.parts.EstimatorNameEditPart.VISUAL_ID:
			return getEstimatorName_5030Parser();
		case stateAnalysis.diagram.edit.parts.StateConstraintName4EditPart.VISUAL_ID:
			return getStateConstraintName_5016Parser();
		case stateAnalysis.diagram.edit.parts.StateUpdateName2EditPart.VISUAL_ID:
			return getStateUpdateName_5017Parser();
		case stateAnalysis.diagram.edit.parts.HardwareMeasurementNameEditPart.VISUAL_ID:
			return getHardwareMeasurementName_5018Parser();
		case stateAnalysis.diagram.edit.parts.HardwareAdapterNameEditPart.VISUAL_ID:
			return getHardwareAdapterName_5031Parser();
		case stateAnalysis.diagram.edit.parts.HardwareCommandName2EditPart.VISUAL_ID:
			return getHardwareCommandName_5020Parser();
		case stateAnalysis.diagram.edit.parts.HardwareMeasurementName2EditPart.VISUAL_ID:
			return getHardwareMeasurementName_5021Parser();
		case stateAnalysis.diagram.edit.parts.DeviceNameEditPart.VISUAL_ID:
			return getDeviceName_5027Parser();
		case stateAnalysis.diagram.edit.parts.DeviceCommandNameEditPart.VISUAL_ID:
			return getDeviceCommandName_5025Parser();
		case stateAnalysis.diagram.edit.parts.DeviceMeasurementNameEditPart.VISUAL_ID:
			return getDeviceMeasurementName_5026Parser();
		case stateAnalysis.diagram.edit.parts.DataCollectionNameEditPart.VISUAL_ID:
			return getDataCollectionName_5007Parser();
		case stateAnalysis.diagram.edit.parts.QosPolicyNameEditPart.VISUAL_ID:
			return getQosPolicyName_5005Parser();
		case stateAnalysis.diagram.edit.parts.DataProductNameEditPart.VISUAL_ID:
			return getDataProductName_5006Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (stateAnalysis.diagram.providers.StateAnalysisElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
