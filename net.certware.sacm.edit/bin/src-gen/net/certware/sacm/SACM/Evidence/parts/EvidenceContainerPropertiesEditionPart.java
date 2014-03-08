// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author Kestrel Technology LLC
 * 
 */
public interface EvidenceContainerPropertiesEditionPart {

	/**
	 * @return the id
	 * 
	 */
	public String getId();

	/**
	 * Defines a new id
	 * @param newValue the new id to set
	 * 
	 */
	public void setId(String newValue);


	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);




	/**
	 * Init the evaluation
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initEvaluation(ReferencesTableSettings settings);

	/**
	 * Update the evaluation
	 * @param newValue the evaluation to update
	 * 
	 */
	public void updateEvaluation();

	/**
	 * Adds the given filter to the evaluation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEvaluation(ViewerFilter filter);

	/**
	 * Adds the given filter to the evaluation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEvaluation(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the evaluation table
	 * 
	 */
	public boolean isContainedInEvaluationTable(EObject element);




	/**
	 * Init the item
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initItem(ReferencesTableSettings settings);

	/**
	 * Update the item
	 * @param newValue the item to update
	 * 
	 */
	public void updateItem();

	/**
	 * Adds the given filter to the item edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToItem(ViewerFilter filter);

	/**
	 * Adds the given filter to the item edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToItem(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the item table
	 * 
	 */
	public boolean isContainedInItemTable(EObject element);


	/**
	 * @return the gid
	 * 
	 */
	public String getGid();

	/**
	 * Defines a new gid
	 * @param newValue the new gid to set
	 * 
	 */
	public void setGid(String newValue);




	/**
	 * Init the property
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initProperty(ReferencesTableSettings settings);

	/**
	 * Update the property
	 * @param newValue the property to update
	 * 
	 */
	public void updateProperty();

	/**
	 * Adds the given filter to the property edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProperty(ViewerFilter filter);

	/**
	 * Adds the given filter to the property edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProperty(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the property table
	 * 
	 */
	public boolean isContainedInPropertyTable(EObject element);


	/**
	 * @return the version
	 * 
	 */
	public String getVersion();

	/**
	 * Defines a new version
	 * @param newValue the new version to set
	 * 
	 */
	public void setVersion(String newValue);




	/**
	 * Init the element
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initElement(ReferencesTableSettings settings);

	/**
	 * Update the element
	 * @param newValue the element to update
	 * 
	 */
	public void updateElement();

	/**
	 * Adds the given filter to the element edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToElement(ViewerFilter filter);

	/**
	 * Adds the given filter to the element edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToElement(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the element table
	 * 
	 */
	public boolean isContainedInElementTable(EObject element);





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
