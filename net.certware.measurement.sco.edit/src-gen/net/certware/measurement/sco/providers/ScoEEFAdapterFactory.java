/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.providers;

import net.certware.measurement.sco.util.ScoAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class ScoEEFAdapterFactory extends ScoAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see net.certware.measurement.sco.util.ScoAdapterFactory#createTotalChangeOrdersAdapter()
	 * 
	 */
	public Adapter createTotalChangeOrdersAdapter() {
		return new TotalChangeOrdersPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.measurement.sco.util.ScoAdapterFactory#createCriticalDefectChangeOrdersAdapter()
	 * 
	 */
	public Adapter createCriticalDefectChangeOrdersAdapter() {
		return new CriticalDefectChangeOrdersPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.measurement.sco.util.ScoAdapterFactory#createNormalDefectChangeOrdersAdapter()
	 * 
	 */
	public Adapter createNormalDefectChangeOrdersAdapter() {
		return new NormalDefectChangeOrdersPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.measurement.sco.util.ScoAdapterFactory#createImprovementChangeOrdersAdapter()
	 * 
	 */
	public Adapter createImprovementChangeOrdersAdapter() {
		return new ImprovementChangeOrdersPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.measurement.sco.util.ScoAdapterFactory#createNewFeatureChangeOrdersAdapter()
	 * 
	 */
	public Adapter createNewFeatureChangeOrdersAdapter() {
		return new NewFeatureChangeOrdersPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.measurement.sco.util.ScoAdapterFactory#createArtifactIdentifierAdapter()
	 * 
	 */
	public Adapter createArtifactIdentifierAdapter() {
		return new ArtifactIdentifierPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.measurement.sco.util.ScoAdapterFactory#createArtifactCommitAdapter()
	 * 
	 */
	public Adapter createArtifactCommitAdapter() {
		return new ArtifactCommitPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.measurement.sco.util.ScoAdapterFactory#createCommitHistoryAdapter()
	 * 
	 */
	public Adapter createCommitHistoryAdapter() {
		return new CommitHistoryPropertiesEditionProvider();
	}

}
