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
public interface ArgumentDiagramPropertiesEditionPart {

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
	 * @return the contexts to add
	 * 
	 */
	public List getContextsToAdd();

	/**
	 * @return the contexts to remove
	 * 
	 */
	public List getContextsToRemove();

	/**
	 * @return the contexts to move
	 * 
	 */
	public List getContextsToMove();

	/**
	 * @return the contexts to edit
	 * 
	 */
	public Map getContextsToEdit();

	/**
	 * @return the current contexts table
	 * 
	 */
	public List getContextsTable();

	/**
	 * Init the contexts
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContexts(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the contexts
	 * @param newValue the contexts to update
	 * 
	 */
	public void updateContexts(EObject newValue);

	/**
	 * Adds the given filter to the contexts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContexts(ViewerFilter filter);

	/**
	 * Adds the given filter to the contexts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContexts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the contexts table
	 * 
	 */
	public boolean isContainedInContextsTable(EObject element);


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
	 * @return the solutions to add
	 * 
	 */
	public List getSolutionsToAdd();

	/**
	 * @return the solutions to remove
	 * 
	 */
	public List getSolutionsToRemove();

	/**
	 * @return the solutions to move
	 * 
	 */
	public List getSolutionsToMove();

	/**
	 * @return the solutions to edit
	 * 
	 */
	public Map getSolutionsToEdit();

	/**
	 * @return the current solutions table
	 * 
	 */
	public List getSolutionsTable();

	/**
	 * Init the solutions
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSolutions(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the solutions
	 * @param newValue the solutions to update
	 * 
	 */
	public void updateSolutions(EObject newValue);

	/**
	 * Adds the given filter to the solutions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSolutions(ViewerFilter filter);

	/**
	 * Adds the given filter to the solutions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSolutions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the solutions table
	 * 
	 */
	public boolean isContainedInSolutionsTable(EObject element);


	/**
	 * @return the evidence to add
	 * 
	 */
	public List getEvidenceToAdd();

	/**
	 * @return the evidence to remove
	 * 
	 */
	public List getEvidenceToRemove();

	/**
	 * @return the evidence to move
	 * 
	 */
	public List getEvidenceToMove();

	/**
	 * @return the evidence to edit
	 * 
	 */
	public Map getEvidenceToEdit();

	/**
	 * @return the current evidence table
	 * 
	 */
	public List getEvidenceTable();

	/**
	 * Init the evidence
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initEvidence(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the evidence
	 * @param newValue the evidence to update
	 * 
	 */
	public void updateEvidence(EObject newValue);

	/**
	 * Adds the given filter to the evidence edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEvidence(ViewerFilter filter);

	/**
	 * Adds the given filter to the evidence edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEvidence(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the evidence table
	 * 
	 */
	public boolean isContainedInEvidenceTable(EObject element);


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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
