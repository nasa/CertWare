/*
 * 
 */
package stateAnalysis.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StateVariableStateVariableStateUpdatesCompartment2ItemSemanticEditPolicy
		extends
		stateAnalysis.diagram.edit.policies.StateAnalysisBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateVariableStateVariableStateUpdatesCompartment2ItemSemanticEditPolicy() {
		super(
				stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateUpdate_3010 == req
				.getElementType()) {
			return getGEFWrapper(new stateAnalysis.diagram.edit.commands.StateUpdateCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
