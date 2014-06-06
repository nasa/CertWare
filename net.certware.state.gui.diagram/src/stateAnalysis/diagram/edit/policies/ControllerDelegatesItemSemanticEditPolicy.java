/*
 * 
 */
package stateAnalysis.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ControllerDelegatesItemSemanticEditPolicy
		extends
		stateAnalysis.diagram.edit.policies.StateAnalysisBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ControllerDelegatesItemSemanticEditPolicy() {
		super(
				stateAnalysis.diagram.providers.StateAnalysisElementTypes.ControllerDelegates_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
