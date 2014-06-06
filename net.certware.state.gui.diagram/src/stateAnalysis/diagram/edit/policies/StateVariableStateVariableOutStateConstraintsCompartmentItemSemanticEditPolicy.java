/*
 * 
 */
package stateAnalysis.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StateVariableStateVariableOutStateConstraintsCompartmentItemSemanticEditPolicy
		extends
		stateAnalysis.diagram.edit.policies.StateAnalysisBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateVariableStateVariableOutStateConstraintsCompartmentItemSemanticEditPolicy() {
		super(
				stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3009 == req
				.getElementType()) {
			return getGEFWrapper(new stateAnalysis.diagram.edit.commands.StateConstraint2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
