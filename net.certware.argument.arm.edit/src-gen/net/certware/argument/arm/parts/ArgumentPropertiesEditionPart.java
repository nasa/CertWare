/*
 * Copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */
package net.certware.argument.arm.parts;

// Start of user code for imports
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * @author
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
	 * @return the containsArgumentElement to add
	 * 
	 */
	public List getContainsArgumentElementToAdd();

	/**
	 * @return the containsArgumentElement to remove
	 * 
	 */
	public List getContainsArgumentElementToRemove();

	/**
	 * @return the containsArgumentElement to move
	 * 
	 */
	public List getContainsArgumentElementToMove();

	/**
	 * @return the containsArgumentElement to edit
	 * 
	 */
	public Map getContainsArgumentElementToEdit();

	/**
	 * @return the current containsArgumentElement table
	 * 
	 */
	public List getContainsArgumentElementTable();

	/**
	 * Init the containsArgumentElement
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContainsArgumentElement(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the containsArgumentElement
	 * @param newValue the containsArgumentElement to update
	 * 
	 */
	public void updateContainsArgumentElement(EObject newValue);

	/**
	 * Adds the given filter to the containsArgumentElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainsArgumentElement(ViewerFilter filter);

	/**
	 * Adds the given filter to the containsArgumentElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainsArgumentElement(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the containsArgumentElement table
	 * 
	 */
	public boolean isContainedInContainsArgumentElementTable(EObject element);


	/**
	 * @return the containsArgumentLink to add
	 * 
	 */
	public List getContainsArgumentLinkToAdd();

	/**
	 * @return the containsArgumentLink to remove
	 * 
	 */
	public List getContainsArgumentLinkToRemove();

	/**
	 * @return the containsArgumentLink to move
	 * 
	 */
	public List getContainsArgumentLinkToMove();

	/**
	 * @return the containsArgumentLink to edit
	 * 
	 */
	public Map getContainsArgumentLinkToEdit();

	/**
	 * @return the current containsArgumentLink table
	 * 
	 */
	public List getContainsArgumentLinkTable();

	/**
	 * Init the containsArgumentLink
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContainsArgumentLink(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the containsArgumentLink
	 * @param newValue the containsArgumentLink to update
	 * 
	 */
	public void updateContainsArgumentLink(EObject newValue);

	/**
	 * Adds the given filter to the containsArgumentLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainsArgumentLink(ViewerFilter filter);

	/**
	 * Adds the given filter to the containsArgumentLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainsArgumentLink(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the containsArgumentLink table
	 * 
	 */
	public boolean isContainedInContainsArgumentLinkTable(EObject element);


	/**
	 * @return the containsArgument to add
	 * 
	 */
	public List getContainsArgumentToAdd();

	/**
	 * @return the containsArgument to remove
	 * 
	 */
	public List getContainsArgumentToRemove();

	/**
	 * @return the containsArgument to move
	 * 
	 */
	public List getContainsArgumentToMove();

	/**
	 * @return the containsArgument to edit
	 * 
	 */
	public Map getContainsArgumentToEdit();

	/**
	 * @return the current containsArgument table
	 * 
	 */
	public List getContainsArgumentTable();

	/**
	 * Init the containsArgument
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContainsArgument(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the containsArgument
	 * @param newValue the containsArgument to update
	 * 
	 */
	public void updateContainsArgument(EObject newValue);

	/**
	 * Adds the given filter to the containsArgument edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainsArgument(ViewerFilter filter);

	/**
	 * Adds the given filter to the containsArgument edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainsArgument(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the containsArgument table
	 * 
	 */
	public boolean isContainedInContainsArgumentTable(EObject element);





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
