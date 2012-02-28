/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface DiscoveryMethodPropertiesEditionPart {

	/**
	 * @return the url
	 * 
	 */
	public String getUrl();

	/**
	 * Defines a new url
	 * @param newValue the new url to set
	 * 
	 */
	public void setUrl(String newValue);




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
	 * @return the autoTrigger
	 * 
	 */
	public String getAutoTrigger();

	/**
	 * Defines a new autoTrigger
	 * @param newValue the new autoTrigger to set
	 * 
	 */
	public void setAutoTrigger(String newValue);


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
	 * @return the importType
	 * 
	 */
	public String getImportType();

	/**
	 * Defines a new importType
	 * @param newValue the new importType to set
	 * 
	 */
	public void setImportType(String newValue);


	/**
	 * @return the label
	 * 
	 */
	public String getLabel();

	/**
	 * Defines a new label
	 * @param newValue the new label to set
	 * 
	 */
	public void setLabel(String newValue);


	/**
	 * @return the type
	 * 
	 */
	public Enumerator getType();

	/**
	 * Init the type
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initType(EEnum eenum, Enumerator current);

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * 
	 */
	public void setType(Enumerator newValue);





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
