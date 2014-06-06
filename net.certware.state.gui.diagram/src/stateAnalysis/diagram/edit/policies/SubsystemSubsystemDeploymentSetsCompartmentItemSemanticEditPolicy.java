/*
 * 
 */
package stateAnalysis.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class SubsystemSubsystemDeploymentSetsCompartmentItemSemanticEditPolicy
		extends
		stateAnalysis.diagram.edit.policies.StateAnalysisBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SubsystemSubsystemDeploymentSetsCompartmentItemSemanticEditPolicy() {
		super(
				stateAnalysis.diagram.providers.StateAnalysisElementTypes.Subsystem_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeploymentSet_3001 == req
				.getElementType()) {
			return getGEFWrapper(new stateAnalysis.diagram.edit.commands.DeploymentSetCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
