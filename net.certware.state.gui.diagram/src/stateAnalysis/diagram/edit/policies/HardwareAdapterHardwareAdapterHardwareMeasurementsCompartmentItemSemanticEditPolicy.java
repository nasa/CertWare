/*
 * 
 */
package stateAnalysis.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class HardwareAdapterHardwareAdapterHardwareMeasurementsCompartmentItemSemanticEditPolicy
		extends
		stateAnalysis.diagram.edit.policies.StateAnalysisBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HardwareAdapterHardwareAdapterHardwareMeasurementsCompartmentItemSemanticEditPolicy() {
		super(
				stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareAdapter_3030);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareMeasurement_3021 == req
				.getElementType()) {
			return getGEFWrapper(new stateAnalysis.diagram.edit.commands.HardwareMeasurement2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
