/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
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
	 * Init the isTagged
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initIsTagged(ReferencesTableSettings settings);

	/**
	 * Update the isTagged
	 * @param newValue the isTagged to update
	 * 
	 */
	public void updateIsTagged();

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
	 * Init the subGoals
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSubGoals(ReferencesTableSettings settings);

	/**
	 * Update the subGoals
	 * @param newValue the subGoals to update
	 * 
	 */
	public void updateSubGoals();

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
	 * Init the strategies
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initStrategies(ReferencesTableSettings settings);

	/**
	 * Update the strategies
	 * @param newValue the strategies to update
	 * 
	 */
	public void updateStrategies();

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
	 * Init the goalContexts
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initGoalContexts(ReferencesTableSettings settings);

	/**
	 * Update the goalContexts
	 * @param newValue the goalContexts to update
	 * 
	 */
	public void updateGoalContexts();

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
	 * Init the assumptions
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAssumptions(ReferencesTableSettings settings);

	/**
	 * Update the assumptions
	 * @param newValue the assumptions to update
	 * 
	 */
	public void updateAssumptions();

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
	 * Init the goalSolutions
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initGoalSolutions(ReferencesTableSettings settings);

	/**
	 * Update the goalSolutions
	 * @param newValue the goalSolutions to update
	 * 
	 */
	public void updateGoalSolutions();

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
