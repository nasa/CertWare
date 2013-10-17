/**
 * Generated with Acceleo
 */
package net.certware.sacm.SACM.Argumentation.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface CitationElementPropertiesEditionPart {



	/**
	 * Init the taggedValue
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTaggedValue(ReferencesTableSettings settings);

	/**
	 * Update the taggedValue
	 * @param newValue the taggedValue to update
	 * 
	 */
	public void updateTaggedValue();

	/**
	 * Adds the given filter to the taggedValue edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTaggedValue(ViewerFilter filter);

	/**
	 * Adds the given filter to the taggedValue edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTaggedValue(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the taggedValue table
	 * 
	 */
	public boolean isContainedInTaggedValueTable(EObject element);




	/**
	 * Init the annotation
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAnnotation(ReferencesTableSettings settings);

	/**
	 * Update the annotation
	 * @param newValue the annotation to update
	 * 
	 */
	public void updateAnnotation();

	/**
	 * Adds the given filter to the annotation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAnnotation(ViewerFilter filter);

	/**
	 * Adds the given filter to the annotation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAnnotation(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the annotation table
	 * 
	 */
	public boolean isContainedInAnnotationTable(EObject element);


	/**
	 * @return the id
	 * 
	 */
	public String getId();

	/**
	 * Defines a new id
	 * @param newValue the new id to set
	 * 
	 */
	public void setId(String newValue);


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
	 * Init the argumentElementReference
	 * @param settings settings for the argumentElementReference ReferencesTable 
	 */
	public void initArgumentElementReference(ReferencesTableSettings settings);

	/**
	 * Update the argumentElementReference
	 * @param newValue the argumentElementReference to update
	 * 
	 */
	public void updateArgumentElementReference();

	/**
	 * Adds the given filter to the argumentElementReference edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToArgumentElementReference(ViewerFilter filter);

	/**
	 * Adds the given filter to the argumentElementReference edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToArgumentElementReference(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the argumentElementReference table
	 * 
	 */
	public boolean isContainedInArgumentElementReferenceTable(EObject element);




	/**
	 * Init the argumentationReference
	 * @param settings settings for the argumentationReference ReferencesTable 
	 */
	public void initArgumentationReference(ReferencesTableSettings settings);

	/**
	 * Update the argumentationReference
	 * @param newValue the argumentationReference to update
	 * 
	 */
	public void updateArgumentationReference();

	/**
	 * Adds the given filter to the argumentationReference edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToArgumentationReference(ViewerFilter filter);

	/**
	 * Adds the given filter to the argumentationReference edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToArgumentationReference(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the argumentationReference table
	 * 
	 */
	public boolean isContainedInArgumentationReferenceTable(EObject element);





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
