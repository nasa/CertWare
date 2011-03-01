
package net.certware.argument.aml.parts;

// Start of user code for imports
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * @author mrb
 * 
 */
public interface DocumentRootPropertiesEditionPart {

	/**
	 * @return the mixed
	 * 
	 */
	public EList getMixed();

	/**
	 * Defines a new mixed
	 * @param newValue the new mixed to set
	 * 
	 */
	public void setMixed(EList newValue);

	/**
	 * Add a value to the mixed multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToMixed(org.eclipse.emf.ecore.util.FeatureMap.Entry newValue);

	/**
	 * Remove a value to the mixed multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToMixed(org.eclipse.emf.ecore.util.FeatureMap.Entry newValue);


	/**
	 * @return the xMLNSPrefixMap to add
	 * 
	 */
	public List getXMLNSPrefixMapToAdd();

	/**
	 * @return the xMLNSPrefixMap to remove
	 * 
	 */
	public List getXMLNSPrefixMapToRemove();

	/**
	 * @return the xMLNSPrefixMap to move
	 * 
	 */
	public List getXMLNSPrefixMapToMove();

	/**
	 * @return the xMLNSPrefixMap to edit
	 * 
	 */
	public Map getXMLNSPrefixMapToEdit();

	/**
	 * @return the current xMLNSPrefixMap table
	 * 
	 */
	public List getXMLNSPrefixMapTable();

	/**
	 * Init the xMLNSPrefixMap
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initXMLNSPrefixMap(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the xMLNSPrefixMap
	 * @param newValue the xMLNSPrefixMap to update
	 * 
	 */
	public void updateXMLNSPrefixMap(EObject newValue);

	/**
	 * Adds the given filter to the xMLNSPrefixMap edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToXMLNSPrefixMap(ViewerFilter filter);

	/**
	 * Adds the given filter to the xMLNSPrefixMap edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToXMLNSPrefixMap(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the xMLNSPrefixMap table
	 * 
	 */
	public boolean isContainedInXMLNSPrefixMapTable(EObject element);


	/**
	 * @return the xSISchemaLocation to add
	 * 
	 */
	public List getXSISchemaLocationToAdd();

	/**
	 * @return the xSISchemaLocation to remove
	 * 
	 */
	public List getXSISchemaLocationToRemove();

	/**
	 * @return the xSISchemaLocation to move
	 * 
	 */
	public List getXSISchemaLocationToMove();

	/**
	 * @return the xSISchemaLocation to edit
	 * 
	 */
	public Map getXSISchemaLocationToEdit();

	/**
	 * @return the current xSISchemaLocation table
	 * 
	 */
	public List getXSISchemaLocationTable();

	/**
	 * Init the xSISchemaLocation
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initXSISchemaLocation(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the xSISchemaLocation
	 * @param newValue the xSISchemaLocation to update
	 * 
	 */
	public void updateXSISchemaLocation(EObject newValue);

	/**
	 * Adds the given filter to the xSISchemaLocation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToXSISchemaLocation(ViewerFilter filter);

	/**
	 * Adds the given filter to the xSISchemaLocation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToXSISchemaLocation(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the xSISchemaLocation table
	 * 
	 */
	public boolean isContainedInXSISchemaLocationTable(EObject element);


	/**
	 * @return the description1
	 * 
	 */
	public String getDescription1();

	/**
	 * Defines a new description1
	 * @param newValue the new description1 to set
	 * 
	 */
	public void setDescription1(String newValue);


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
	 * @return the idRef
	 * 
	 */
	public String getIdRef();

	/**
	 * Defines a new idRef
	 * @param newValue the new idRef to set
	 * 
	 */
	public void setIdRef(String newValue);


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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
