/*
 * 
 */
package stateAnalysis.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DeploymentDeploymentComponentsCompartmentItemSemanticEditPolicy
		extends
		stateAnalysis.diagram.edit.policies.StateAnalysisBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DeploymentDeploymentComponentsCompartmentItemSemanticEditPolicy() {
		super(
				stateAnalysis.diagram.providers.StateAnalysisElementTypes.Deployment_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3027 == req
				.getElementType()) {
			return getGEFWrapper(new stateAnalysis.diagram.edit.commands.StateVariableCreateCommand(
					req));
		}
		if (stateAnalysis.diagram.providers.StateAnalysisElementTypes.Controller_3028 == req
				.getElementType()) {
			return getGEFWrapper(new stateAnalysis.diagram.edit.commands.ControllerCreateCommand(
					req));
		}
		if (stateAnalysis.diagram.providers.StateAnalysisElementTypes.Estimator_3029 == req
				.getElementType()) {
			return getGEFWrapper(new stateAnalysis.diagram.edit.commands.EstimatorCreateCommand(
					req));
		}
		if (stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareAdapter_3030 == req
				.getElementType()) {
			return getGEFWrapper(new stateAnalysis.diagram.edit.commands.HardwareAdapterCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
