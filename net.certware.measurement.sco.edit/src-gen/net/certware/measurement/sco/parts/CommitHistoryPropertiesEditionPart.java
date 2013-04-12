/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface CommitHistoryPropertiesEditionPart {



	/**
	 * Init the commitRecord
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initCommitRecord(ReferencesTableSettings settings);

	/**
	 * Update the commitRecord
	 * @param newValue the commitRecord to update
	 * 
	 */
	public void updateCommitRecord();

	/**
	 * Adds the given filter to the commitRecord edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCommitRecord(ViewerFilter filter);

	/**
	 * Adds the given filter to the commitRecord edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCommitRecord(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the commitRecord table
	 * 
	 */
	public boolean isContainedInCommitRecordTable(EObject element);





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
