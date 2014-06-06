/*
 * 
 */
package stateAnalysis.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DeploymentSetDeploymentSetDeploymentsCompartmentItemSemanticEditPolicy
		extends
		stateAnalysis.diagram.edit.policies.StateAnalysisBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DeploymentSetDeploymentSetDeploymentsCompartmentItemSemanticEditPolicy() {
		super(
				stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeploymentSet_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (stateAnalysis.diagram.providers.StateAnalysisElementTypes.Deployment_3002 == req
				.getElementType()) {
			return getGEFWrapper(new stateAnalysis.diagram.edit.commands.DeploymentCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
