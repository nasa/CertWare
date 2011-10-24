/*
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 */
package net.certware.argument.cae.parts;

// Start of user code for imports
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface ArgumentPropertiesEditionPart {

	/**
	 * @return the identifier
	 * 
	 */
	public String getIdentifier();

	/**
	 * Defines a new identifier
	 * @param newValue the new identifier to set
	 * 
	 */
	public void setIdentifier(String newValue);


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
	 * @return the isTagged to add
	 * 
	 */
	public List getIsTaggedToAdd();

	/**
	 * @return the isTagged to remove
	 * 
	 */
	public List getIsTaggedToRemove();

	/**
	 * @return the isTagged to move
	 * 
	 */
	public List getIsTaggedToMove();

	/**
	 * @return the isTagged to edit
	 * 
	 */
	public Map getIsTaggedToEdit();

	/**
	 * @return the current isTagged table
	 * 
	 */
	public List getIsTaggedTable();

	/**
	 * Init the isTagged
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initIsTagged(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the isTagged
	 * @param newValue the isTagged to update
	 * 
	 */
	public void updateIsTagged(EObject newValue);

	/**
	 * Adds the given filter to the isTagged edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter);

	/**
	 * Adds the given filter to the isTagged edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the isTagged table
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element);


	/**
	 * @return the justification to add
	 * 
	 */
	public List getJustificationToAdd();

	/**
	 * @return the justification to remove
	 * 
	 */
	public List getJustificationToRemove();

	/**
	 * @return the justification to move
	 * 
	 */
	public List getJustificationToMove();

	/**
	 * @return the justification to edit
	 * 
	 */
	public Map getJustificationToEdit();

	/**
	 * @return the current justification table
	 * 
	 */
	public List getJustificationTable();

	/**
	 * Init the justification
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initJustification(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the justification
	 * @param newValue the justification to update
	 * 
	 */
	public void updateJustification(EObject newValue);

	/**
	 * Adds the given filter to the justification edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToJustification(ViewerFilter filter);

	/**
	 * Adds the given filter to the justification edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToJustification(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the justification table
	 * 
	 */
	public boolean isContainedInJustificationTable(EObject element);


	/**
	 * @return the evidence to add
	 * 
	 */
	public List getEvidenceToAdd();

	/**
	 * @return the evidence to remove
	 * 
	 */
	public List getEvidenceToRemove();

	/**
	 * @return the evidence to move
	 * 
	 */
	public List getEvidenceToMove();

	/**
	 * @return the evidence to edit
	 * 
	 */
	public Map getEvidenceToEdit();

	/**
	 * @return the current evidence table
	 * 
	 */
	public List getEvidenceTable();

	/**
	 * Init the evidence
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initEvidence(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the evidence
	 * @param newValue the evidence to update
	 * 
	 */
	public void updateEvidence(EObject newValue);

	/**
	 * Adds the given filter to the evidence edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEvidence(ViewerFilter filter);

	/**
	 * Adds the given filter to the evidence edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEvidence(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the evidence table
	 * 
	 */
	public boolean isContainedInEvidenceTable(EObject element);


	/**
	 * @return the claims to add
	 * 
	 */
	public List getClaimsToAdd();

	/**
	 * @return the claims to remove
	 * 
	 */
	public List getClaimsToRemove();

	/**
	 * @return the claims to move
	 * 
	 */
	public List getClaimsToMove();

	/**
	 * @return the claims to edit
	 * 
	 */
	public Map getClaimsToEdit();

	/**
	 * @return the current claims table
	 * 
	 */
	public List getClaimsTable();

	/**
	 * Init the claims
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initClaims(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the claims
	 * @param newValue the claims to update
	 * 
	 */
	public void updateClaims(EObject newValue);

	/**
	 * Adds the given filter to the claims edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToClaims(ViewerFilter filter);

	/**
	 * Adds the given filter to the claims edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToClaims(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the claims table
	 * 
	 */
	public boolean isContainedInClaimsTable(EObject element);





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
