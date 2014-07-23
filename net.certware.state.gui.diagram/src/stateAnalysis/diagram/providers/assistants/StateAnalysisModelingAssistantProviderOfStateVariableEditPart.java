/*
 * 
 */
package stateAnalysis.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class StateAnalysisModelingAssistantProviderOfStateVariableEditPart
		extends
		stateAnalysis.diagram.providers.StateAnalysisModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3008);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3009);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateUpdate_3010);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3011);
		return types;
	}

}
