/*
 * 
 */
package stateAnalysis.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class EstimatorEstimatorHardwareMeasurementCompartmentItemSemanticEditPolicy
		extends
		stateAnalysis.diagram.edit.policies.StateAnalysisBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EstimatorEstimatorHardwareMeasurementCompartmentItemSemanticEditPolicy() {
		super(
				stateAnalysis.diagram.providers.StateAnalysisElementTypes.Estimator_3029);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareMeasurement_3018 == req
				.getElementType()) {
			return getGEFWrapper(new stateAnalysis.diagram.edit.commands.HardwareMeasurementCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
