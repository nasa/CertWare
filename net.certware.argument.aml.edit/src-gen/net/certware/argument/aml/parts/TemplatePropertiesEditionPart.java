
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
public interface TemplatePropertiesEditionPart {

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
	 * @return the question to add
	 * 
	 */
	public List getQuestionToAdd();

	/**
	 * @return the question to remove
	 * 
	 */
	public List getQuestionToRemove();

	/**
	 * @return the question to move
	 * 
	 */
	public List getQuestionToMove();

	/**
	 * @return the question to edit
	 * 
	 */
	public Map getQuestionToEdit();

	/**
	 * @return the current question table
	 * 
	 */
	public List getQuestionTable();

	/**
	 * Init the question
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initQuestion(EObject current, EReference containingFeature, EReference feature);

	/**
	 * Update the question
	 * @param newValue the question to update
	 * 
	 */
	public void updateQuestion(EObject newValue);

	/**
	 * Adds the given filter to the question edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToQuestion(ViewerFilter filter);

	/**
	 * Adds the given filter to the question edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToQuestion(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the question table
	 * 
	 */
	public boolean isContainedInQuestionTable(EObject element);


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
