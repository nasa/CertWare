/*
 * 
 */
package stateAnalysis.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class StateAnalysisNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7031;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7030;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem) {
			stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem item = (stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
