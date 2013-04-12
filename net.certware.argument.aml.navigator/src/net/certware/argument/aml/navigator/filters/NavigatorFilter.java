/**
 * AML metamodel copyright © 2000-2005 SRI International.
 * Implementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   
 */
package net.certware.argument.aml.navigator.filters;


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
	
	 * @param viewer Viewer
	 * @param parentElement Object
	 * @param element Object
	 * @return false if file name extension matches, true otherwise */
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		
	    if ( element instanceof IFile ) {
	        IFile file = (IFile)element;
	        if ( ICertWareConstants.AML_EXTENSION.equals(file.getFileExtension())) {
	          return false;
	        }
	      }
	      
	      return true;
	}

}
