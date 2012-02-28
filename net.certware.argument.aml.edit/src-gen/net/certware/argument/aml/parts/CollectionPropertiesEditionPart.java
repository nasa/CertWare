/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;
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
public interface CollectionPropertiesEditionPart {



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
	 * @return the group
	 * 
	 */
	public EList getGroup();

	/**
	 * Defines a new group
	 * @param newValue the new group to set
	 * 
	 */
	public void setGroup(EList newValue);

	/**
	 * Add a value to the group multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToGroup(Object newValue);

	/**
	 * Remove a value to the group multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToGroup(Object newValue);


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
	 * @return the label1
	 * 
	 */
	public String getLabel1();

	/**
	 * Defines a new label1
	 * @param newValue the new label1 to set
	 * 
	 */
	public void setLabel1(String newValue);


	/**
	 * @return the objectType
	 * 
	 */
	public Enumerator getObjectType();

	/**
	 * Init the objectType
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initObjectType(EEnum eenum, Enumerator current);

	/**
	 * Defines a new objectType
	 * @param newValue the new objectType to set
	 * 
	 */
	public void setObjectType(Enumerator newValue);





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
