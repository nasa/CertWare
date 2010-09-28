/**
 * Generated with Acceleo
 */
package net.certware.argument.cae.parts;

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
public interface EvidencePropertiesEditionPart {

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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
