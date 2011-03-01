
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
public interface ArgumentPropertiesEditionPart {

	/**
	 * @return the annotation to add
	 * 
	 */
	public List getAnnotationToAdd();

	/**
	 * @return the annotation to remove
	 * 
	 */
	public List getAnnotationToRemove();

	/**
	 * @return the annotation to move
	 * 
	 */
	public List getAnnotationToMove();

	/**
	 * @return the annotation to edit
	 * 
	 */
	public Map getAnnotationToEdit();

	/**
	 * @return the current annotation table
	 * 
	 */
	public List getAnnotationTable();

	/**
	 * Init the annotation
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAnnotation(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the annotation
	 * @param newValue the annotation to update
	 * 
	 */
	public void updateAnnotation(EObject newValue);

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
	 * @return the answer to add
	 * 
	 */
	public List getAnswerToAdd();

	/**
	 * @return the answer to remove
	 * 
	 */
	public List getAnswerToRemove();

	/**
	 * @return the answer to move
	 * 
	 */
	public List getAnswerToMove();

	/**
	 * @return the answer to edit
	 * 
	 */
	public Map getAnswerToEdit();

	/**
	 * @return the current answer table
	 * 
	 */
	public List getAnswerTable();

	/**
	 * Init the answer
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAnswer(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the answer
	 * @param newValue the answer to update
	 * 
	 */
	public void updateAnswer(EObject newValue);

	/**
	 * Adds the given filter to the answer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAnswer(ViewerFilter filter);

	/**
	 * Adds the given filter to the answer edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAnswer(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the answer table
	 * 
	 */
	public boolean isContainedInAnswerTable(EObject element);


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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
