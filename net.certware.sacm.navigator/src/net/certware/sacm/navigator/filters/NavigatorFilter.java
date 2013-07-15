/**
 * 
 */
package net.certware.sacm.navigator.filters;


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
	 * @return false if file name extension matches, true otherwise
	 */
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		
	    if ( element instanceof IFile ) {
	        IFile file = (IFile)element;
	        if ( ICertWareConstants.SACM_EXTENSION.equals(file.getFileExtension())) {
	          return false;
	        }
	      }
	      
	      return true;
	}

}
