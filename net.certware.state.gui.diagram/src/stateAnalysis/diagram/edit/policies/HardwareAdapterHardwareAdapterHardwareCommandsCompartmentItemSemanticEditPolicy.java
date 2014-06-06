/*
 * 
 */
package stateAnalysis.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class HardwareAdapterHardwareAdapterHardwareCommandsCompartmentItemSemanticEditPolicy
		extends
		stateAnalysis.diagram.edit.policies.StateAnalysisBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HardwareAdapterHardwareAdapterHardwareCommandsCompartmentItemSemanticEditPolicy() {
		super(
				stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareAdapter_3019);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareCommand_3020 == req
				.getElementType()) {
			return getGEFWrapper(new stateAnalysis.diagram.edit.commands.HardwareCommand2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
