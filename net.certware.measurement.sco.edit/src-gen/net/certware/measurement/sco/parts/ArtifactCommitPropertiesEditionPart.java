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
public interface ArtifactCommitPropertiesEditionPart {



	/**
	 * Init the artifactIdentifiers
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initArtifactIdentifiers(ReferencesTableSettings settings);

	/**
	 * Update the artifactIdentifiers
	 * @param newValue the artifactIdentifiers to update
	 * 
	 */
	public void updateArtifactIdentifiers();

	/**
	 * Adds the given filter to the artifactIdentifiers edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToArtifactIdentifiers(ViewerFilter filter);

	/**
	 * Adds the given filter to the artifactIdentifiers edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToArtifactIdentifiers(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the artifactIdentifiers table
	 * 
	 */
	public boolean isContainedInArtifactIdentifiersTable(EObject element);


	/**
	 * @return the commitIdentifier
	 * 
	 */
	public String getCommitIdentifier();

	/**
	 * Defines a new commitIdentifier
	 * @param newValue the new commitIdentifier to set
	 * 
	 */
	public void setCommitIdentifier(String newValue);


	/**
	 * @return the usageTime
	 * 
	 */
	public String getUsageTime();

	/**
	 * Defines a new usageTime
	 * @param newValue the new usageTime to set
	 * 
	 */
	public void setUsageTime(String newValue);





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
