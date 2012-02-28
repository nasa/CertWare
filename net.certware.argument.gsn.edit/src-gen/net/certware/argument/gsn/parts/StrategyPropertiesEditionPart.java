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
	 * Init the goals
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initGoals(ReferencesTableSettings settings);

	/**
	 * Update the goals
	 * @param newValue the goals to update
	 * 
	 */
	public void updateGoals();

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
	 * Init the justifications
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initJustifications(ReferencesTableSettings settings);

	/**
	 * Update the justifications
	 * @param newValue the justifications to update
	 * 
	 */
	public void updateJustifications();

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
	 * Init the strategyContexts
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initStrategyContexts(ReferencesTableSettings settings);

	/**
	 * Update the strategyContexts
	 * @param newValue the strategyContexts to update
	 * 
	 */
	public void updateStrategyContexts();

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
	 * Init the strategySolutions
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initStrategySolutions(ReferencesTableSettings settings);

	/**
	 * Update the strategySolutions
	 * @param newValue the strategySolutions to update
	 * 
	 */
	public void updateStrategySolutions();

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
