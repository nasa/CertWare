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
public interface SolutionPropertiesEditionPart {

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
	 * @return the target to add
	 * 
	 */
	public List getTargetToAdd();

	/**
	 * @return the target to remove
	 * 
	 */
	public List getTargetToRemove();

	/**
	 * @return the current target table
	 * 
	 */
	public List getTargetTable();

	/**
	 * Init the target
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTarget(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the target
	 * @param newValue the target to update
	 * 
	 */
	public void updateTarget(EObject newValue);

	/**
	 * Adds the given filter to the target edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter);

	/**
	 * Adds the given filter to the target edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the target table
	 * 
	 */
	public boolean isContainedInTargetTable(EObject element);


	/**
	 * @return the source to add
	 * 
	 */
	public List getSourceToAdd();

	/**
	 * @return the source to remove
	 * 
	 */
	public List getSourceToRemove();

	/**
	 * @return the current source table
	 * 
	 */
	public List getSourceTable();

	/**
	 * Init the source
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSource(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the source
	 * @param newValue the source to update
	 * 
	 */
	public void updateSource(EObject newValue);

	/**
	 * Adds the given filter to the source edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSource(ViewerFilter filter);

	/**
	 * Adds the given filter to the source edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSource(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the source table
	 * 
	 */
	public boolean isContainedInSourceTable(EObject element);


	/**
	 * @return the solutionEvidence to add
	 * 
	 */
	public List getSolutionEvidenceToAdd();

	/**
	 * @return the solutionEvidence to remove
	 * 
	 */
	public List getSolutionEvidenceToRemove();

	/**
	 * @return the solutionEvidence to move
	 * 
	 */
	public List getSolutionEvidenceToMove();

	/**
	 * @return the solutionEvidence to edit
	 * 
	 */
	public Map getSolutionEvidenceToEdit();

	/**
	 * @return the current solutionEvidence table
	 * 
	 */
	public List getSolutionEvidenceTable();

	/**
	 * Init the solutionEvidence
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSolutionEvidence(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the solutionEvidence
	 * @param newValue the solutionEvidence to update
	 * 
	 */
	public void updateSolutionEvidence(EObject newValue);

	/**
	 * Adds the given filter to the solutionEvidence edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSolutionEvidence(ViewerFilter filter);

	/**
	 * Adds the given filter to the solutionEvidence edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSolutionEvidence(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the solutionEvidence table
	 * 
	 */
	public boolean isContainedInSolutionEvidenceTable(EObject element);


	/**
	 * @return the solutionContexts to add
	 * 
	 */
	public List getSolutionContextsToAdd();

	/**
	 * @return the solutionContexts to remove
	 * 
	 */
	public List getSolutionContextsToRemove();

	/**
	 * @return the solutionContexts to move
	 * 
	 */
	public List getSolutionContextsToMove();

	/**
	 * @return the solutionContexts to edit
	 * 
	 */
	public Map getSolutionContextsToEdit();

	/**
	 * @return the current solutionContexts table
	 * 
	 */
	public List getSolutionContextsTable();

	/**
	 * Init the solutionContexts
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSolutionContexts(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the solutionContexts
	 * @param newValue the solutionContexts to update
	 * 
	 */
	public void updateSolutionContexts(EObject newValue);

	/**
	 * Adds the given filter to the solutionContexts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSolutionContexts(ViewerFilter filter);

	/**
	 * Adds the given filter to the solutionContexts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSolutionContexts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the solutionContexts table
	 * 
	 */
	public boolean isContainedInSolutionContextsTable(EObject element);





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
