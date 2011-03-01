
package net.certware.argument.aml.parts;

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
public interface MemoPropertiesEditionPart {

	/**
	 * @return the creator to add
	 * 
	 */
	public List getCreatorToAdd();

	/**
	 * @return the creator to remove
	 * 
	 */
	public List getCreatorToRemove();

	/**
	 * @return the creator to move
	 * 
	 */
	public List getCreatorToMove();

	/**
	 * @return the creator to edit
	 * 
	 */
	public Map getCreatorToEdit();

	/**
	 * @return the current creator table
	 * 
	 */
	public List getCreatorTable();

	/**
	 * Init the creator
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initCreator(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the creator
	 * @param newValue the creator to update
	 * 
	 */
	public void updateCreator(EObject newValue);

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
	 * @return the reader to add
	 * 
	 */
	public List getReaderToAdd();

	/**
	 * @return the reader to remove
	 * 
	 */
	public List getReaderToRemove();

	/**
	 * @return the reader to move
	 * 
	 */
	public List getReaderToMove();

	/**
	 * @return the reader to edit
	 * 
	 */
	public Map getReaderToEdit();

	/**
	 * @return the current reader table
	 * 
	 */
	public List getReaderTable();

	/**
	 * Init the reader
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initReader(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the reader
	 * @param newValue the reader to update
	 * 
	 */
	public void updateReader(EObject newValue);

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
