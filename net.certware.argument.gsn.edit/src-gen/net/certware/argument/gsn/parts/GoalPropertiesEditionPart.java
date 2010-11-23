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
public interface GoalPropertiesEditionPart {

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
	 * @return the assumed
	 * 
	 */
	public Boolean getAssumed();

	/**
	 * Defines a new assumed
	 * @param newValue the new assumed to set
	 * 
	 */
	public void setAssumed(Boolean newValue);


	/**
	 * @return the toBeSupported
	 * 
	 */
	public Boolean getToBeSupported();

	/**
	 * Defines a new toBeSupported
	 * @param newValue the new toBeSupported to set
	 * 
	 */
	public void setToBeSupported(Boolean newValue);


	/**
	 * @return the subGoals to add
	 * 
	 */
	public List getSubGoalsToAdd();

	/**
	 * @return the subGoals to remove
	 * 
	 */
	public List getSubGoalsToRemove();

	/**
	 * @return the subGoals to move
	 * 
	 */
	public List getSubGoalsToMove();

	/**
	 * @return the subGoals to edit
	 * 
	 */
	public Map getSubGoalsToEdit();

	/**
	 * @return the current subGoals table
	 * 
	 */
	public List getSubGoalsTable();

	/**
	 * Init the subGoals
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSubGoals(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the subGoals
	 * @param newValue the subGoals to update
	 * 
	 */
	public void updateSubGoals(EObject newValue);

	/**
	 * Adds the given filter to the subGoals edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSubGoals(ViewerFilter filter);

	/**
	 * Adds the given filter to the subGoals edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSubGoals(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the subGoals table
	 * 
	 */
	public boolean isContainedInSubGoalsTable(EObject element);


	/**
	 * @return the strategies to add
	 * 
	 */
	public List getStrategiesToAdd();

	/**
	 * @return the strategies to remove
	 * 
	 */
	public List getStrategiesToRemove();

	/**
	 * @return the strategies to move
	 * 
	 */
	public List getStrategiesToMove();

	/**
	 * @return the strategies to edit
	 * 
	 */
	public Map getStrategiesToEdit();

	/**
	 * @return the current strategies table
	 * 
	 */
	public List getStrategiesTable();

	/**
	 * Init the strategies
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initStrategies(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the strategies
	 * @param newValue the strategies to update
	 * 
	 */
	public void updateStrategies(EObject newValue);

	/**
	 * Adds the given filter to the strategies edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToStrategies(ViewerFilter filter);

	/**
	 * Adds the given filter to the strategies edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToStrategies(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the strategies table
	 * 
	 */
	public boolean isContainedInStrategiesTable(EObject element);


	/**
	 * @return the goalContexts to add
	 * 
	 */
	public List getGoalContextsToAdd();

	/**
	 * @return the goalContexts to remove
	 * 
	 */
	public List getGoalContextsToRemove();

	/**
	 * @return the goalContexts to move
	 * 
	 */
	public List getGoalContextsToMove();

	/**
	 * @return the goalContexts to edit
	 * 
	 */
	public Map getGoalContextsToEdit();

	/**
	 * @return the current goalContexts table
	 * 
	 */
	public List getGoalContextsTable();

	/**
	 * Init the goalContexts
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initGoalContexts(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the goalContexts
	 * @param newValue the goalContexts to update
	 * 
	 */
	public void updateGoalContexts(EObject newValue);

	/**
	 * Adds the given filter to the goalContexts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGoalContexts(ViewerFilter filter);

	/**
	 * Adds the given filter to the goalContexts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGoalContexts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the goalContexts table
	 * 
	 */
	public boolean isContainedInGoalContextsTable(EObject element);


	/**
	 * @return the assumptions to add
	 * 
	 */
	public List getAssumptionsToAdd();

	/**
	 * @return the assumptions to remove
	 * 
	 */
	public List getAssumptionsToRemove();

	/**
	 * @return the assumptions to move
	 * 
	 */
	public List getAssumptionsToMove();

	/**
	 * @return the assumptions to edit
	 * 
	 */
	public Map getAssumptionsToEdit();

	/**
	 * @return the current assumptions table
	 * 
	 */
	public List getAssumptionsTable();

	/**
	 * Init the assumptions
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAssumptions(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the assumptions
	 * @param newValue the assumptions to update
	 * 
	 */
	public void updateAssumptions(EObject newValue);

	/**
	 * Adds the given filter to the assumptions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAssumptions(ViewerFilter filter);

	/**
	 * Adds the given filter to the assumptions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAssumptions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the assumptions table
	 * 
	 */
	public boolean isContainedInAssumptionsTable(EObject element);


	/**
	 * @return the goalSolutions to add
	 * 
	 */
	public List getGoalSolutionsToAdd();

	/**
	 * @return the goalSolutions to remove
	 * 
	 */
	public List getGoalSolutionsToRemove();

	/**
	 * @return the goalSolutions to move
	 * 
	 */
	public List getGoalSolutionsToMove();

	/**
	 * @return the goalSolutions to edit
	 * 
	 */
	public Map getGoalSolutionsToEdit();

	/**
	 * @return the current goalSolutions table
	 * 
	 */
	public List getGoalSolutionsTable();

	/**
	 * Init the goalSolutions
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initGoalSolutions(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the goalSolutions
	 * @param newValue the goalSolutions to update
	 * 
	 */
	public void updateGoalSolutions(EObject newValue);

	/**
	 * Adds the given filter to the goalSolutions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGoalSolutions(ViewerFilter filter);

	/**
	 * Adds the given filter to the goalSolutions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGoalSolutions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the goalSolutions table
	 * 
	 */
	public boolean isContainedInGoalSolutionsTable(EObject element);





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
