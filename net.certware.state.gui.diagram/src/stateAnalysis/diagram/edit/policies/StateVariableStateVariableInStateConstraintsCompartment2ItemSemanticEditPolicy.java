/*
 * 
 */
package stateAnalysis.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class StateVariableStateVariableInStateConstraintsCompartment2ItemSemanticEditPolicy
		extends
		stateAnalysis.diagram.edit.policies.StateAnalysisBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateVariableStateVariableInStateConstraintsCompartment2ItemSemanticEditPolicy() {
		super(
				stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3008 == req
				.getElementType()) {
			return getGEFWrapper(new stateAnalysis.diagram.edit.commands.StateConstraintCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
