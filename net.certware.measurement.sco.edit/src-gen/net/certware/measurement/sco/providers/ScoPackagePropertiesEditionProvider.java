/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.providers;

import org.eclipse.emf.eef.runtime.impl.providers.ComposedPropertiesEditionProvider;

/**
 * @author mrb
 * 
 */
public class ScoPackagePropertiesEditionProvider extends ComposedPropertiesEditionProvider {

	/**
	 * Default Constructor
	 * 
	 */
	public ScoPackagePropertiesEditionProvider() {
		super();
		append(createTotalChangeOrdersPropertiesEditionProvider());
		append(createCriticalDefectChangeOrdersPropertiesEditionProvider());
		append(createNormalDefectChangeOrdersPropertiesEditionProvider());
		append(createImprovementChangeOrdersPropertiesEditionProvider());
		append(createNewFeatureChangeOrdersPropertiesEditionProvider());
		append(createArtifactIdentifierPropertiesEditionProvider());
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * TotalChangeOrders instances.
	 * 
	 */
	protected TotalChangeOrdersPropertiesEditionProvider totalChangeOrdersPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a TotalChangeOrders
	 * 
	 */
	public TotalChangeOrdersPropertiesEditionProvider createTotalChangeOrdersPropertiesEditionProvider() {
		if (totalChangeOrdersPropertiesEditionProvider == null)
			totalChangeOrdersPropertiesEditionProvider = new TotalChangeOrdersPropertiesEditionProvider();
		return totalChangeOrdersPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * CriticalDefectChangeOrders instances.
	 * 
	 */
	protected CriticalDefectChangeOrdersPropertiesEditionProvider criticalDefectChangeOrdersPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a CriticalDefectChangeOrders
	 * 
	 */
	public CriticalDefectChangeOrdersPropertiesEditionProvider createCriticalDefectChangeOrdersPropertiesEditionProvider() {
		if (criticalDefectChangeOrdersPropertiesEditionProvider == null)
			criticalDefectChangeOrdersPropertiesEditionProvider = new CriticalDefectChangeOrdersPropertiesEditionProvider();
		return criticalDefectChangeOrdersPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * NormalDefectChangeOrders instances.
	 * 
	 */
	protected NormalDefectChangeOrdersPropertiesEditionProvider normalDefectChangeOrdersPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a NormalDefectChangeOrders
	 * 
	 */
	public NormalDefectChangeOrdersPropertiesEditionProvider createNormalDefectChangeOrdersPropertiesEditionProvider() {
		if (normalDefectChangeOrdersPropertiesEditionProvider == null)
			normalDefectChangeOrdersPropertiesEditionProvider = new NormalDefectChangeOrdersPropertiesEditionProvider();
		return normalDefectChangeOrdersPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * ImprovementChangeOrders instances.
	 * 
	 */
	protected ImprovementChangeOrdersPropertiesEditionProvider improvementChangeOrdersPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a ImprovementChangeOrders
	 * 
	 */
	public ImprovementChangeOrdersPropertiesEditionProvider createImprovementChangeOrdersPropertiesEditionProvider() {
		if (improvementChangeOrdersPropertiesEditionProvider == null)
			improvementChangeOrdersPropertiesEditionProvider = new ImprovementChangeOrdersPropertiesEditionProvider();
		return improvementChangeOrdersPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * NewFeatureChangeOrders instances.
	 * 
	 */
	protected NewFeatureChangeOrdersPropertiesEditionProvider newFeatureChangeOrdersPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a NewFeatureChangeOrders
	 * 
	 */
	public NewFeatureChangeOrdersPropertiesEditionProvider createNewFeatureChangeOrdersPropertiesEditionProvider() {
		if (newFeatureChangeOrdersPropertiesEditionProvider == null)
			newFeatureChangeOrdersPropertiesEditionProvider = new NewFeatureChangeOrdersPropertiesEditionProvider();
		return newFeatureChangeOrdersPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * ArtifactIdentifier instances.
	 * 
	 */
	protected ArtifactIdentifierPropertiesEditionProvider artifactIdentifierPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a ArtifactIdentifier
	 * 
	 */
	public ArtifactIdentifierPropertiesEditionProvider createArtifactIdentifierPropertiesEditionProvider() {
		if (artifactIdentifierPropertiesEditionProvider == null)
			artifactIdentifierPropertiesEditionProvider = new ArtifactIdentifierPropertiesEditionProvider();
		return artifactIdentifierPropertiesEditionProvider;
	}

}
