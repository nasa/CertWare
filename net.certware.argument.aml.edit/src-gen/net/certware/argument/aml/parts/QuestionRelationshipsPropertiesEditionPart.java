
package net.certware.argument.aml.parts;

// Start of user code for imports
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * @author mrb
 * 
 */
public interface QuestionRelationshipsPropertiesEditionPart {

	/**
	 * @return the dependent to add
	 * 
	 */
	public List getDependentToAdd();

	/**
	 * @return the dependent to remove
	 * 
	 */
	public List getDependentToRemove();

	/**
	 * @return the dependent to move
	 * 
	 */
	public List getDependentToMove();

	/**
	 * @return the dependent to edit
	 * 
	 */
	public Map getDependentToEdit();

	/**
	 * @return the current dependent table
	 * 
	 */
	public List getDependentTable();

	/**
	 * Init the dependent
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initDependent(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the dependent
	 * @param newValue the dependent to update
	 * 
	 */
	public void updateDependent(EObject newValue);

	/**
	 * Adds the given filter to the dependent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDependent(ViewerFilter filter);

	/**
	 * Adds the given filter to the dependent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDependent(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the dependent table
	 * 
	 */
	public boolean isContainedInDependentTable(EObject element);





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
