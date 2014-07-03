/*
 * 
 */
package stateAnalysis.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class StateAnalysisModelingAssistantProviderOfControllerEditPart extends
		stateAnalysis.diagram.providers.StateAnalysisModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3013);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareCommand_3014);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((stateAnalysis.diagram.edit.parts.ControllerEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			stateAnalysis.diagram.edit.parts.ControllerEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.ControllerDelegates_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(stateAnalysis.diagram.edit.parts.ControllerEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			stateAnalysis.diagram.edit.parts.ControllerEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof stateAnalysis.diagram.edit.parts.ControllerEditPart) {
			types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.ControllerDelegates_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(stateAnalysis.diagram.edit.parts.ControllerEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			stateAnalysis.diagram.edit.parts.ControllerEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == stateAnalysis.diagram.providers.StateAnalysisElementTypes.ControllerDelegates_4001) {
			types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Controller_3028);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((stateAnalysis.diagram.edit.parts.ControllerEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			stateAnalysis.diagram.edit.parts.ControllerEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.ControllerDelegates_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(stateAnalysis.diagram.edit.parts.ControllerEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			stateAnalysis.diagram.edit.parts.ControllerEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == stateAnalysis.diagram.providers.StateAnalysisElementTypes.ControllerDelegates_4001) {
			types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Controller_3028);
		}
		return types;
	}

}
