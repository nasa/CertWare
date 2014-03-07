// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author Kestrel Technology LLC
 * 
 */
public interface RoleBindingPropertiesEditionPart {

	/**
	 * @return the role
	 * 
	 */
	public String getRole();

	/**
	 * Defines a new role
	 * @param newValue the new role to set
	 * 
	 */
	public void setRole(String newValue);


	/**
	 * @return the subject
	 * 
	 */
	public EObject getSubject();

	/**
	 * Init the subject
	 * @param settings the combo setting
	 */
	public void initSubject(EObjectFlatComboSettings settings);

	/**
	 * Defines a new subject
	 * @param newValue the new subject to set
	 * 
	 */
	public void setSubject(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSubjectButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the subject edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSubject(ViewerFilter filter);

	/**
	 * Adds the given filter to the subject edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSubject(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
