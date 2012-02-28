/**
 * Generated with Acceleo
 */
package net.certware.argument.eur.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
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
	 * Init the target
	 * @param settings settings for the target ReferencesTable 
	 */
	public void initTarget(ReferencesTableSettings settings);

	/**
	 * Update the target
	 * @param newValue the target to update
	 * 
	 */
	public void updateTarget();

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
	 * Init the source
	 * @param settings settings for the source ReferencesTable 
	 */
	public void initSource(ReferencesTableSettings settings);

	/**
	 * Update the source
	 * @param newValue the source to update
	 * 
	 */
	public void updateSource();

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
	 * Init the context
	 * @param settings settings for the context ReferencesTable 
	 */
	public void initContext(ReferencesTableSettings settings);

	/**
	 * Update the context
	 * @param newValue the context to update
	 * 
	 */
	public void updateContext();

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
	 * @return the evidence
	 * 
	 */
	public EObject getEvidence();

	/**
	 * Init the evidence
	 * @param settings the combo setting
	 */
	public void initEvidence(EObjectFlatComboSettings settings);

	/**
	 * Defines a new evidence
	 * @param newValue the new evidence to set
	 * 
	 */
	public void setEvidence(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setEvidenceButtonMode(ButtonsModeEnum newValue);

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
	 * Init the criteria
	 * @param settings settings for the criteria ReferencesTable 
	 */
	public void initCriteria(ReferencesTableSettings settings);

	/**
	 * Update the criteria
	 * @param newValue the criteria to update
	 * 
	 */
	public void updateCriteria();

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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
