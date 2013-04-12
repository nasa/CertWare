/**
 * Generated with Acceleo
 */
package net.certware.argument.arm.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface ArgumentPropertiesEditionPart {

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
	 * Init the containsArgumentElement
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContainsArgumentElement(ReferencesTableSettings settings);

	/**
	 * Update the containsArgumentElement
	 * @param newValue the containsArgumentElement to update
	 * 
	 */
	public void updateContainsArgumentElement();

	/**
	 * Adds the given filter to the containsArgumentElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainsArgumentElement(ViewerFilter filter);

	/**
	 * Adds the given filter to the containsArgumentElement edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainsArgumentElement(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the containsArgumentElement table
	 * 
	 */
	public boolean isContainedInContainsArgumentElementTable(EObject element);




	/**
	 * Init the containsArgumentLink
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContainsArgumentLink(ReferencesTableSettings settings);

	/**
	 * Update the containsArgumentLink
	 * @param newValue the containsArgumentLink to update
	 * 
	 */
	public void updateContainsArgumentLink();

	/**
	 * Adds the given filter to the containsArgumentLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainsArgumentLink(ViewerFilter filter);

	/**
	 * Adds the given filter to the containsArgumentLink edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainsArgumentLink(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the containsArgumentLink table
	 * 
	 */
	public boolean isContainedInContainsArgumentLinkTable(EObject element);




	/**
	 * Init the containsArgument
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContainsArgument(ReferencesTableSettings settings);

	/**
	 * Update the containsArgument
	 * @param newValue the containsArgument to update
	 * 
	 */
	public void updateContainsArgument();

	/**
	 * Adds the given filter to the containsArgument edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainsArgument(ViewerFilter filter);

	/**
	 * Adds the given filter to the containsArgument edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainsArgument(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the containsArgument table
	 * 
	 */
	public boolean isContainedInContainsArgumentTable(EObject element);





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
