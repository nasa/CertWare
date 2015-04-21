package net.certware.argument.gsz.diagram.navigator;

import net.certware.argument.gsz.diagram.part.GszVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class GszNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4013;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof GszNavigatorItem) {
			GszNavigatorItem item = (GszNavigatorItem) element;
			return GszVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
