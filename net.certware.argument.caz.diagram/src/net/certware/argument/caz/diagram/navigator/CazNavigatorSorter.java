package net.certware.argument.caz.diagram.navigator;

import net.certware.argument.caz.diagram.part.CazVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class CazNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4012;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof CazNavigatorItem) {
			CazNavigatorItem item = (CazNavigatorItem) element;
			return CazVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
