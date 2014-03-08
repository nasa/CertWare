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
public interface IsModifiedByPropertiesEditionPart {

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
	 * Init the timing
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTiming(ReferencesTableSettings settings);

	/**
	 * Update the timing
	 * @param newValue the timing to update
	 * 
	 */
	public void updateTiming();

	/**
	 * Adds the given filter to the timing edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTiming(ViewerFilter filter);

	/**
	 * Adds the given filter to the timing edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTiming(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the timing table
	 * 
	 */
	public boolean isContainedInTimingTable(EObject element);




	/**
	 * Init the custody
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initCustody(ReferencesTableSettings settings);

	/**
	 * Update the custody
	 * @param newValue the custody to update
	 * 
	 */
	public void updateCustody();

	/**
	 * Adds the given filter to the custody edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCustody(ViewerFilter filter);

	/**
	 * Adds the given filter to the custody edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCustody(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the custody table
	 * 
	 */
	public boolean isContainedInCustodyTable(EObject element);




	/**
	 * Init the provenance
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initProvenance(ReferencesTableSettings settings);

	/**
	 * Update the provenance
	 * @param newValue the provenance to update
	 * 
	 */
	public void updateProvenance();

	/**
	 * Adds the given filter to the provenance edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProvenance(ViewerFilter filter);

	/**
	 * Adds the given filter to the provenance edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProvenance(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the provenance table
	 * 
	 */
	public boolean isContainedInProvenanceTable(EObject element);




	/**
	 * Init the event
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initEvent(ReferencesTableSettings settings);

	/**
	 * Update the event
	 * @param newValue the event to update
	 * 
	 */
	public void updateEvent();

	/**
	 * Adds the given filter to the event edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEvent(ViewerFilter filter);

	/**
	 * Adds the given filter to the event edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEvent(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the event table
	 * 
	 */
	public boolean isContainedInEventTable(EObject element);





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
