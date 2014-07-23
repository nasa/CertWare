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
public class StateAnalysisModelingAssistantProviderOfSystemEditPart extends
		stateAnalysis.diagram.providers.StateAnalysisModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Subsystem_2001);
		return types;
	}

}
