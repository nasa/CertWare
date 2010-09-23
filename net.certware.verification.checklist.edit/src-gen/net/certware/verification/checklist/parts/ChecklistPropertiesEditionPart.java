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
public interface ChecklistPropertiesEditionPart {

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
	 * @return the categories to add
	 * 
	 */
	public List getCategoriesToAdd();

	/**
	 * @return the categories to remove
	 * 
	 */
	public List getCategoriesToRemove();

	/**
	 * @return the categories to move
	 * 
	 */
	public List getCategoriesToMove();

	/**
	 * @return the categories to edit
	 * 
	 */
	public Map getCategoriesToEdit();

	/**
	 * @return the current categories table
	 * 
	 */
	public List getCategoriesTable();

	/**
	 * Init the categories
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initCategories(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the categories
	 * @param newValue the categories to update
	 * 
	 */
	public void updateCategories(EObject newValue);

	/**
	 * Adds the given filter to the categories edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCategories(ViewerFilter filter);

	/**
	 * Adds the given filter to the categories edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCategories(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the categories table
	 * 
	 */
	public boolean isContainedInCategoriesTable(EObject element);


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
