/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.parts;

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
	 * @return the goal to add
	 * 
	 */
	public List getGoalToAdd();

	/**
	 * @return the goal to remove
	 * 
	 */
	public List getGoalToRemove();

	/**
	 * @return the goal to move
	 * 
	 */
	public List getGoalToMove();

	/**
	 * @return the goal to edit
	 * 
	 */
	public Map getGoalToEdit();

	/**
	 * @return the current goal table
	 * 
	 */
	public List getGoalTable();

	/**
	 * Init the goal
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initGoal(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the goal
	 * @param newValue the goal to update
	 * 
	 */
	public void updateGoal(EObject newValue);

	/**
	 * Adds the given filter to the goal edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGoal(ViewerFilter filter);

	/**
	 * Adds the given filter to the goal edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGoal(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the goal table
	 * 
	 */
	public boolean isContainedInGoalTable(EObject element);


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
	 * @return the solution to move
	 * 
	 */
	public List getSolutionToMove();

	/**
	 * @return the solution to edit
	 * 
	 */
	public Map getSolutionToEdit();

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
	 * @return the context to add
	 * 
	 */
	public List getContextToAdd();

	/**
	 * @return the context to remove
	 * 
	 */
	public List getContextToRemove();

	/**
	 * @return the context to move
	 * 
	 */
	public List getContextToMove();

	/**
	 * @return the context to edit
	 * 
	 */
	public Map getContextToEdit();

	/**
	 * @return the current context table
	 * 
	 */
	public List getContextTable();

	/**
	 * Init the context
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContext(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the context
	 * @param newValue the context to update
	 * 
	 */
	public void updateContext(EObject newValue);

	/**
	 * Adds the given filter to the context edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContext(ViewerFilter filter);

	/**
	 * Adds the given filter to the context edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContext(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the context table
	 * 
	 */
	public boolean isContainedInContextTable(EObject element);





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
