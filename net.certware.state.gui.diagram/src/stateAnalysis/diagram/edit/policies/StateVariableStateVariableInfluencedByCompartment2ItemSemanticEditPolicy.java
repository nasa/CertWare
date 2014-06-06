/*
 * 
 */
package stateAnalysis.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StateVariableStateVariableInfluencedByCompartment2ItemSemanticEditPolicy
		extends
		stateAnalysis.diagram.edit.policies.StateAnalysisBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateVariableStateVariableInfluencedByCompartment2ItemSemanticEditPolicy() {
		super(
				stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3011 == req
				.getElementType()) {
			return getGEFWrapper(new stateAnalysis.diagram.edit.commands.StateVariable2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
