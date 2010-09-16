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
	 * @return the strategy to add
	 * 
	 */
	public List getStrategyToAdd();

	/**
	 * @return the strategy to remove
	 * 
	 */
	public List getStrategyToRemove();

	/**
	 * @return the strategy to move
	 * 
	 */
	public List getStrategyToMove();

	/**
	 * @return the strategy to edit
	 * 
	 */
	public Map getStrategyToEdit();

	/**
	 * @return the current strategy table
	 * 
	 */
	public List getStrategyTable();

	/**
	 * Init the strategy
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initStrategy(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the strategy
	 * @param newValue the strategy to update
	 * 
	 */
	public void updateStrategy(EObject newValue);

	/**
	 * Adds the given filter to the strategy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToStrategy(ViewerFilter filter);

	/**
	 * Adds the given filter to the strategy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToStrategy(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the strategy table
	 * 
	 */
	public boolean isContainedInStrategyTable(EObject element);


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
	 * @return the assumption to move
	 * 
	 */
	public List getAssumptionToMove();

	/**
	 * @return the assumption to edit
	 * 
	 */
	public Map getAssumptionToEdit();

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
	 * @return the subgoal to add
	 * 
	 */
	public List getSubgoalToAdd();

	/**
	 * @return the subgoal to remove
	 * 
	 */
	public List getSubgoalToRemove();

	/**
	 * @return the subgoal to move
	 * 
	 */
	public List getSubgoalToMove();

	/**
	 * @return the subgoal to edit
	 * 
	 */
	public Map getSubgoalToEdit();

	/**
	 * @return the current subgoal table
	 * 
	 */
	public List getSubgoalTable();

	/**
	 * Init the subgoal
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSubgoal(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the subgoal
	 * @param newValue the subgoal to update
	 * 
	 */
	public void updateSubgoal(EObject newValue);

	/**
	 * Adds the given filter to the subgoal edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSubgoal(ViewerFilter filter);

	/**
	 * Adds the given filter to the subgoal edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSubgoal(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the subgoal table
	 * 
	 */
	public boolean isContainedInSubgoalTable(EObject element);





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
