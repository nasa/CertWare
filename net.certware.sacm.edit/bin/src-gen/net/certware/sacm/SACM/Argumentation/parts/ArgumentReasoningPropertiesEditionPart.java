// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Argumentation.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author Kestrel Technology LLC
 * 
 */
public interface ArgumentReasoningPropertiesEditionPart {

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
	 * @return the description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * 
	 */
	public void setDescription(String newValue);


	/**
	 * @return the content
	 * 
	 */
	public String getContent();

	/**
	 * Defines a new content
	 * @param newValue the new content to set
	 * 
	 */
	public void setContent(String newValue);




	/**
	 * Init the structure
	 * @param settings settings for the structure ReferencesTable 
	 */
	public void initStructure(ReferencesTableSettings settings);

	/**
	 * Update the structure
	 * @param newValue the structure to update
	 * 
	 */
	public void updateStructure();

	/**
	 * Adds the given filter to the structure edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToStructure(ViewerFilter filter);

	/**
	 * Adds the given filter to the structure edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToStructure(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the structure table
	 * 
	 */
	public boolean isContainedInStructureTable(EObject element);




	/**
	 * Init the describedInference
	 * @param settings settings for the describedInference ReferencesTable 
	 */
	public void initDescribedInference(ReferencesTableSettings settings);

	/**
	 * Update the describedInference
	 * @param newValue the describedInference to update
	 * 
	 */
	public void updateDescribedInference();

	/**
	 * Adds the given filter to the describedInference edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDescribedInference(ViewerFilter filter);

	/**
	 * Adds the given filter to the describedInference edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDescribedInference(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the describedInference table
	 * 
	 */
	public boolean isContainedInDescribedInferenceTable(EObject element);




	/**
	 * Init the describedChallenge
	 * @param settings settings for the describedChallenge ReferencesTable 
	 */
	public void initDescribedChallenge(ReferencesTableSettings settings);

	/**
	 * Update the describedChallenge
	 * @param newValue the describedChallenge to update
	 * 
	 */
	public void updateDescribedChallenge();

	/**
	 * Adds the given filter to the describedChallenge edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDescribedChallenge(ViewerFilter filter);

	/**
	 * Adds the given filter to the describedChallenge edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDescribedChallenge(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the describedChallenge table
	 * 
	 */
	public boolean isContainedInDescribedChallengeTable(EObject element);





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
