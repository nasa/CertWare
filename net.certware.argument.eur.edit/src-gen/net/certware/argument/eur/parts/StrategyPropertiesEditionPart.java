
package net.certware.argument.eur.parts;

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
public interface StrategyPropertiesEditionPart {

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
	 * @return the argument to add
	 * 
	 */
	public List getArgumentToAdd();

	/**
	 * @return the argument to remove
	 * 
	 */
	public List getArgumentToRemove();

	/**
	 * @return the argument to move
	 * 
	 */
	public List getArgumentToMove();

	/**
	 * @return the argument to edit
	 * 
	 */
	public Map getArgumentToEdit();

	/**
	 * @return the current argument table
	 * 
	 */
	public List getArgumentTable();

	/**
	 * Init the argument
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initArgument(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the argument
	 * @param newValue the argument to update
	 * 
	 */
	public void updateArgument(EObject newValue);

	/**
	 * Adds the given filter to the argument edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToArgument(ViewerFilter filter);

	/**
	 * Adds the given filter to the argument edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToArgument(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the argument table
	 * 
	 */
	public boolean isContainedInArgumentTable(EObject element);


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
	 * @return the solution to add
	 * 
	 */
	public List getSolutionToAdd();

	/**
	 * @return the solution to remove
	 * 
	 */
	public List getSolutionToRemove();

	/**
	 * @return the current solution table
	 * 
	 */
	public List getSolutionTable();

	/**
	 * Init the solution
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSolution(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the solution
	 * @param newValue the solution to update
	 * 
	 */
	public void updateSolution(EObject newValue);

	/**
	 * Adds the given filter to the solution edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSolution(ViewerFilter filter);

	/**
	 * Adds the given filter to the solution edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSolution(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the solution table
	 * 
	 */
	public boolean isContainedInSolutionTable(EObject element);


	/**
	 * @return the criteria to add
	 * 
	 */
	public List getCriteriaToAdd();

	/**
	 * @return the criteria to remove
	 * 
	 */
	public List getCriteriaToRemove();

	/**
	 * @return the current criteria table
	 * 
	 */
	public List getCriteriaTable();

	/**
	 * Init the criteria
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initCriteria(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the criteria
	 * @param newValue the criteria to update
	 * 
	 */
	public void updateCriteria(EObject newValue);

	/**
	 * Adds the given filter to the criteria edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCriteria(ViewerFilter filter);

	/**
	 * Adds the given filter to the criteria edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCriteria(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the criteria table
	 * 
	 */
	public boolean isContainedInCriteriaTable(EObject element);


	/**
	 * @return the assumption to add
	 * 
	 */
	public List getAssumptionToAdd();

	/**
	 * @return the assumption to remove
	 * 
	 */
	public List getAssumptionToRemove();

	/**
	 * @return the current assumption table
	 * 
	 */
	public List getAssumptionTable();

	/**
	 * Init the assumption
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAssumption(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the assumption
	 * @param newValue the assumption to update
	 * 
	 */
	public void updateAssumption(EObject newValue);

	/**
	 * Adds the given filter to the assumption edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAssumption(ViewerFilter filter);

	/**
	 * Adds the given filter to the assumption edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAssumption(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the assumption table
	 * 
	 */
	public boolean isContainedInAssumptionTable(EObject element);





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
