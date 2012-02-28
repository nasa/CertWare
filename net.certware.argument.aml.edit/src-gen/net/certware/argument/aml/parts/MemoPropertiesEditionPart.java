/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface MemoPropertiesEditionPart {



	/**
	 * Init the creator
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initCreator(ReferencesTableSettings settings);

	/**
	 * Update the creator
	 * @param newValue the creator to update
	 * 
	 */
	public void updateCreator();

	/**
	 * Adds the given filter to the creator edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCreator(ViewerFilter filter);

	/**
	 * Adds the given filter to the creator edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCreator(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the creator table
	 * 
	 */
	public boolean isContainedInCreatorTable(EObject element);




	/**
	 * Init the reader
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initReader(ReferencesTableSettings settings);

	/**
	 * Update the reader
	 * @param newValue the reader to update
	 * 
	 */
	public void updateReader();

	/**
	 * Adds the given filter to the reader edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReader(ViewerFilter filter);

	/**
	 * Adds the given filter to the reader edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReader(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the reader table
	 * 
	 */
	public boolean isContainedInReaderTable(EObject element);


	/**
	 * @return the subject
	 * 
	 */
	public String getSubject();

	/**
	 * Defines a new subject
	 * @param newValue the new subject to set
	 * 
	 */
	public void setSubject(String newValue);


	/**
	 * @return the body
	 * 
	 */
	public String getBody();

	/**
	 * Defines a new body
	 * @param newValue the new body to set
	 * 
	 */
	public void setBody(String newValue);


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
	 * @return the type
	 * 
	 */
	public String getType();

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * 
	 */
	public void setType(String newValue);





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
