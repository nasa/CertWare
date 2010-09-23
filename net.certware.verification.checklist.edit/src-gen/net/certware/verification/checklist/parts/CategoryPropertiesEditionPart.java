/**
 * Generated with Acceleo
 */
package net.certware.verification.checklist.parts;

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
public interface CategoryPropertiesEditionPart {

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
	 * @return the items to add
	 * 
	 */
	public List getItemsToAdd();

	/**
	 * @return the items to remove
	 * 
	 */
	public List getItemsToRemove();

	/**
	 * @return the items to move
	 * 
	 */
	public List getItemsToMove();

	/**
	 * @return the items to edit
	 * 
	 */
	public Map getItemsToEdit();

	/**
	 * @return the current items table
	 * 
	 */
	public List getItemsTable();

	/**
	 * Init the items
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initItems(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the items
	 * @param newValue the items to update
	 * 
	 */
	public void updateItems(EObject newValue);

	/**
	 * Adds the given filter to the items edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToItems(ViewerFilter filter);

	/**
	 * Adds the given filter to the items edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToItems(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the items table
	 * 
	 */
	public boolean isContainedInItemsTable(EObject element);


	/**
	 * @return the comment
	 * 
	 */
	public String getComment();

	/**
	 * Defines a new comment
	 * @param newValue the new comment to set
	 * 
	 */
	public void setComment(String newValue);





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
