/**
 * 
 */
package net.certware.argument.cae.navigator.filters;


import net.certware.core.ICertWareConstants;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * Common navigator viewer filter contribution.
 * @author mrb
 * @since 1.0
 */
public class NavigatorFilter extends ViewerFilter implements ICertWareConstants {

	/**
	 * Filters based on matching file name extension.
	 * @param viewer viewer to filter
	 * @param parentElement unused
	 * @param element element to filter, expecting an IFile
	 * @return false if file name extension matches, true otherwise 
	 */
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {

		if ( element instanceof IFile ) {
			IFile file = (IFile)element;
			if ( ICertWareConstants.CAE_EXTENSION.equals(file.getFileExtension())) {
				return false;
			}
		}

		return true;
	}

}
