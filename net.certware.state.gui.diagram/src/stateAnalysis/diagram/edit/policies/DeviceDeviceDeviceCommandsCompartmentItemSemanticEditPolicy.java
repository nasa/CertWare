/*
 * 
 */
package stateAnalysis.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DeviceDeviceDeviceCommandsCompartmentItemSemanticEditPolicy
		extends
		stateAnalysis.diagram.edit.policies.StateAnalysisBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DeviceDeviceDeviceCommandsCompartmentItemSemanticEditPolicy() {
		super(
				stateAnalysis.diagram.providers.StateAnalysisElementTypes.Device_3024);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeviceCommand_3025 == req
				.getElementType()) {
			return getGEFWrapper(new stateAnalysis.diagram.edit.commands.DeviceCommandCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
