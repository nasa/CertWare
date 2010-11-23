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
	 * @return the goals to add
	 * 
	 */
	public List getGoalsToAdd();

	/**
	 * @return the goals to remove
	 * 
	 */
	public List getGoalsToRemove();

	/**
	 * @return the goals to move
	 * 
	 */
	public List getGoalsToMove();

	/**
	 * @return the goals to edit
	 * 
	 */
	public Map getGoalsToEdit();

	/**
	 * @return the current goals table
	 * 
	 */
	public List getGoalsTable();

	/**
	 * Init the goals
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initGoals(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the goals
	 * @param newValue the goals to update
	 * 
	 */
	public void updateGoals(EObject newValue);

	/**
	 * Adds the given filter to the goals edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGoals(ViewerFilter filter);

	/**
	 * Adds the given filter to the goals edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGoals(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the goals table
	 * 
	 */
	public boolean isContainedInGoalsTable(EObject element);


	/**
	 * @return the justifications to add
	 * 
	 */
	public List getJustificationsToAdd();

	/**
	 * @return the justifications to remove
	 * 
	 */
	public List getJustificationsToRemove();

	/**
	 * @return the justifications to move
	 * 
	 */
	public List getJustificationsToMove();

	/**
	 * @return the justifications to edit
	 * 
	 */
	public Map getJustificationsToEdit();

	/**
	 * @return the current justifications table
	 * 
	 */
	public List getJustificationsTable();

	/**
	 * Init the justifications
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initJustifications(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the justifications
	 * @param newValue the justifications to update
	 * 
	 */
	public void updateJustifications(EObject newValue);

	/**
	 * Adds the given filter to the justifications edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToJustifications(ViewerFilter filter);

	/**
	 * Adds the given filter to the justifications edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToJustifications(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the justifications table
	 * 
	 */
	public boolean isContainedInJustificationsTable(EObject element);


	/**
	 * @return the strategyContexts to add
	 * 
	 */
	public List getStrategyContextsToAdd();

	/**
	 * @return the strategyContexts to remove
	 * 
	 */
	public List getStrategyContextsToRemove();

	/**
	 * @return the strategyContexts to move
	 * 
	 */
	public List getStrategyContextsToMove();

	/**
	 * @return the strategyContexts to edit
	 * 
	 */
	public Map getStrategyContextsToEdit();

	/**
	 * @return the current strategyContexts table
	 * 
	 */
	public List getStrategyContextsTable();

	/**
	 * Init the strategyContexts
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initStrategyContexts(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the strategyContexts
	 * @param newValue the strategyContexts to update
	 * 
	 */
	public void updateStrategyContexts(EObject newValue);

	/**
	 * Adds the given filter to the strategyContexts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToStrategyContexts(ViewerFilter filter);

	/**
	 * Adds the given filter to the strategyContexts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToStrategyContexts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the strategyContexts table
	 * 
	 */
	public boolean isContainedInStrategyContextsTable(EObject element);


	/**
	 * @return the strategySolutions to add
	 * 
	 */
	public List getStrategySolutionsToAdd();

	/**
	 * @return the strategySolutions to remove
	 * 
	 */
	public List getStrategySolutionsToRemove();

	/**
	 * @return the strategySolutions to move
	 * 
	 */
	public List getStrategySolutionsToMove();

	/**
	 * @return the strategySolutions to edit
	 * 
	 */
	public Map getStrategySolutionsToEdit();

	/**
	 * @return the current strategySolutions table
	 * 
	 */
	public List getStrategySolutionsTable();

	/**
	 * Init the strategySolutions
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initStrategySolutions(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the strategySolutions
	 * @param newValue the strategySolutions to update
	 * 
	 */
	public void updateStrategySolutions(EObject newValue);

	/**
	 * Adds the given filter to the strategySolutions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToStrategySolutions(ViewerFilter filter);

	/**
	 * Adds the given filter to the strategySolutions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToStrategySolutions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the strategySolutions table
	 * 
	 */
	public boolean isContainedInStrategySolutionsTable(EObject element);





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
