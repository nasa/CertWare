
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
public interface AggregationRulePropertiesEditionPart {

	/**
	 * @return the parameter to add
	 * 
	 */
	public List getParameterToAdd();

	/**
	 * @return the parameter to remove
	 * 
	 */
	public List getParameterToRemove();

	/**
	 * @return the parameter to move
	 * 
	 */
	public List getParameterToMove();

	/**
	 * @return the parameter to edit
	 * 
	 */
	public Map getParameterToEdit();

	/**
	 * @return the current parameter table
	 * 
	 */
	public List getParameterTable();

	/**
	 * Init the parameter
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initParameter(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the parameter
	 * @param newValue the parameter to update
	 * 
	 */
	public void updateParameter(EObject newValue);

	/**
	 * Adds the given filter to the parameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParameter(ViewerFilter filter);

	/**
	 * Adds the given filter to the parameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParameter(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the parameter table
	 * 
	 */
	public boolean isContainedInParameterTable(EObject element);





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
