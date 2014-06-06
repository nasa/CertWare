/*
 * 
 */
package stateAnalysis.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DataCollectionDataCollectionProductsCompartmentItemSemanticEditPolicy
		extends
		stateAnalysis.diagram.edit.policies.StateAnalysisBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DataCollectionDataCollectionProductsCompartmentItemSemanticEditPolicy() {
		super(
				stateAnalysis.diagram.providers.StateAnalysisElementTypes.DataCollection_3004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (stateAnalysis.diagram.providers.StateAnalysisElementTypes.DataProduct_3006 == req
				.getElementType()) {
			return getGEFWrapper(new stateAnalysis.diagram.edit.commands.DataProductCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
