// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.providers;

import net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * @author Kestrel Technology LLC
 * 
 */
public class EvidenceEEFAdapterFactory extends EvidenceAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createConsistencyAdapter()
	 * 
	 */
	public Adapter createConsistencyAdapter() {
		return new ConsistencyPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createCompletenessAdapter()
	 * 
	 */
	public Adapter createCompletenessAdapter() {
		return new CompletenessPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createExhibitAdapter()
	 * 
	 */
	public Adapter createExhibitAdapter() {
		return new ExhibitPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createDocumentAdapter()
	 * 
	 */
	public Adapter createDocumentAdapter() {
		return new DocumentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createConfidenceAdapter()
	 * 
	 */
	public Adapter createConfidenceAdapter() {
		return new ConfidencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createApprovedByAdapter()
	 * 
	 */
	public Adapter createApprovedByAdapter() {
		return new ApprovedByPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createCreatedByAdapter()
	 * 
	 */
	public Adapter createCreatedByAdapter() {
		return new CreatedByPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createToolAdapter()
	 * 
	 */
	public Adapter createToolAdapter() {
		return new ToolPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createMethodAdapter()
	 * 
	 */
	public Adapter createMethodAdapter() {
		return new MethodPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createIsBasedOnAdapter()
	 * 
	 */
	public Adapter createIsBasedOnAdapter() {
		return new IsBasedOnPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createIsAAdapter()
	 * 
	 */
	public Adapter createIsAAdapter() {
		return new IsAPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createIsCharacterizedByAdapter()
	 * 
	 */
	public Adapter createIsCharacterizedByAdapter() {
		return new IsCharacterizedByPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createPersonAdapter()
	 * 
	 */
	public Adapter createPersonAdapter() {
		return new PersonPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createOrganizationAdapter()
	 * 
	 */
	public Adapter createOrganizationAdapter() {
		return new OrganizationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createEvidenceContainerAdapter()
	 * 
	 */
	public Adapter createEvidenceContainerAdapter() {
		return new EvidenceContainerPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createEndTimeAdapter()
	 * 
	 */
	public Adapter createEndTimeAdapter() {
		return new EndTimePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createAssertionAdapter()
	 * 
	 */
	public Adapter createAssertionAdapter() {
		return new AssertionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createObjectAdapter()
	 * 
	 */
	public Adapter createObjectAdapter() {
		return new ObjectPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createCompositeObjectAdapter()
	 * 
	 */
	public Adapter createCompositeObjectAdapter() {
		return new CompositeObjectPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createRoleBindingAdapter()
	 * 
	 */
	public Adapter createRoleBindingAdapter() {
		return new RoleBindingPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createStartTimeAdapter()
	 * 
	 */
	public Adapter createStartTimeAdapter() {
		return new StartTimePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createRelevanceAdapter()
	 * 
	 */
	public Adapter createRelevanceAdapter() {
		return new RelevancePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createSignificanceAdapter()
	 * 
	 */
	public Adapter createSignificanceAdapter() {
		return new SignificancePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createAccuracyAdapter()
	 * 
	 */
	public Adapter createAccuracyAdapter() {
		return new AccuracyPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createHasRoleInAdapter()
	 * 
	 */
	public Adapter createHasRoleInAdapter() {
		return new HasRoleInPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createIsScopedByAdapter()
	 * 
	 */
	public Adapter createIsScopedByAdapter() {
		return new IsScopedByPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createAtTimeAdapter()
	 * 
	 */
	public Adapter createAtTimeAdapter() {
		return new AtTimePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createOriginalityAdapter()
	 * 
	 */
	public Adapter createOriginalityAdapter() {
		return new OriginalityPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createReportingAdapter()
	 * 
	 */
	public Adapter createReportingAdapter() {
		return new ReportingPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createReliabilityAdapter()
	 * 
	 */
	public Adapter createReliabilityAdapter() {
		return new ReliabilityPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createSupportsAdapter()
	 * 
	 */
	public Adapter createSupportsAdapter() {
		return new SupportsPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createIsGeneratedAtAdapter()
	 * 
	 */
	public Adapter createIsGeneratedAtAdapter() {
		return new IsGeneratedAtPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createSupportAdapter()
	 * 
	 */
	public Adapter createSupportAdapter() {
		return new SupportPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createConflictsAdapter()
	 * 
	 */
	public Adapter createConflictsAdapter() {
		return new ConflictsPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createRefutesAdapter()
	 * 
	 */
	public Adapter createRefutesAdapter() {
		return new RefutesPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createNegatesAdapter()
	 * 
	 */
	public Adapter createNegatesAdapter() {
		return new NegatesPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createUnknownObjectAdapter()
	 * 
	 */
	public Adapter createUnknownObjectAdapter() {
		return new UnknownObjectPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createResolvesAdapter()
	 * 
	 */
	public Adapter createResolvesAdapter() {
		return new ResolvesPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createEvidenceRequestAdapter()
	 * 
	 */
	public Adapter createEvidenceRequestAdapter() {
		return new EvidenceRequestPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createProjectObjectiveAdapter()
	 * 
	 */
	public Adapter createProjectObjectiveAdapter() {
		return new ProjectObjectivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createActivityAdapter()
	 * 
	 */
	public Adapter createActivityAdapter() {
		return new ActivityPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createDependsOnAdapter()
	 * 
	 */
	public Adapter createDependsOnAdapter() {
		return new DependsOnPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createSatisfiesAdapter()
	 * 
	 */
	public Adapter createSatisfiesAdapter() {
		return new SatisfiesPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createReferencedClaimAdapter()
	 * 
	 */
	public Adapter createReferencedClaimAdapter() {
		return new ReferencedClaimPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createWeakensAdapter()
	 * 
	 */
	public Adapter createWeakensAdapter() {
		return new WeakensPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createAmplifiesAdapter()
	 * 
	 */
	public Adapter createAmplifiesAdapter() {
		return new AmplifiesPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createChallengesAdapter()
	 * 
	 */
	public Adapter createChallengesAdapter() {
		return new ChallengesPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createStrengthAdapter()
	 * 
	 */
	public Adapter createStrengthAdapter() {
		return new StrengthPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createIsAcquiredAtAdapter()
	 * 
	 */
	public Adapter createIsAcquiredAtAdapter() {
		return new IsAcquiredAtPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createIsTransferredToAdapter()
	 * 
	 */
	public Adapter createIsTransferredToAdapter() {
		return new IsTransferredToPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createOwnedByAdapter()
	 * 
	 */
	public Adapter createOwnedByAdapter() {
		return new OwnedByPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createIsPartOfAdapter()
	 * 
	 */
	public Adapter createIsPartOfAdapter() {
		return new IsPartOfPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createIsRevokedAtAdapter()
	 * 
	 */
	public Adapter createIsRevokedAtAdapter() {
		return new IsRevokedAtPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createProvidesContextAdapter()
	 * 
	 */
	public Adapter createProvidesContextAdapter() {
		return new ProvidesContextPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createMeansThatAdapter()
	 * 
	 */
	public Adapter createMeansThatAdapter() {
		return new MeansThatPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createCareOfAdapter()
	 * 
	 */
	public Adapter createCareOfAdapter() {
		return new CareOfPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createAtLocationAdapter()
	 * 
	 */
	public Adapter createAtLocationAdapter() {
		return new AtLocationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createIsCreatedAtAdapter()
	 * 
	 */
	public Adapter createIsCreatedAtAdapter() {
		return new IsCreatedAtPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createRequiresContainerAdapter()
	 * 
	 */
	public Adapter createRequiresContainerAdapter() {
		return new RequiresContainerPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createServiceAdapter()
	 * 
	 */
	public Adapter createServiceAdapter() {
		return new ServicePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createHasElectronicSourceAdapter()
	 * 
	 */
	public Adapter createHasElectronicSourceAdapter() {
		return new HasElectronicSourcePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createIsExpressedInLanguageAdapter()
	 * 
	 */
	public Adapter createIsExpressedInLanguageAdapter() {
		return new IsExpressedInLanguagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createUsingProcessAdapter()
	 * 
	 */
	public Adapter createUsingProcessAdapter() {
		return new UsingProcessPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createHasSecurityClassificationAdapter()
	 * 
	 */
	public Adapter createHasSecurityClassificationAdapter() {
		return new HasSecurityClassificationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createIsReleaseableToAdapter()
	 * 
	 */
	public Adapter createIsReleaseableToAdapter() {
		return new IsReleaseableToPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createEvidenceGroupAdapter()
	 * 
	 */
	public Adapter createEvidenceGroupAdapter() {
		return new EvidenceGroupPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createHasVersionAdapter()
	 * 
	 */
	public Adapter createHasVersionAdapter() {
		return new HasVersionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createHasMediaAdapter()
	 * 
	 */
	public Adapter createHasMediaAdapter() {
		return new HasMediaPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createExtendedEvidenceAttributeAdapter()
	 * 
	 */
	public Adapter createExtendedEvidenceAttributeAdapter() {
		return new ExtendedEvidenceAttributePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createExtendedDocumentPropertyAdapter()
	 * 
	 */
	public Adapter createExtendedDocumentPropertyAdapter() {
		return new ExtendedDocumentPropertyPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createRecordAdapter()
	 * 
	 */
	public Adapter createRecordAdapter() {
		return new RecordPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createObjectifiedAssertionAdapter()
	 * 
	 */
	public Adapter createObjectifiedAssertionAdapter() {
		return new ObjectifiedAssertionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createIsModifiedByAdapter()
	 * 
	 */
	public Adapter createIsModifiedByAdapter() {
		return new IsModifiedByPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createPerformedByAdapter()
	 * 
	 */
	public Adapter createPerformedByAdapter() {
		return new PerformedByPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createContainerConsistencyAdapter()
	 * 
	 */
	public Adapter createContainerConsistencyAdapter() {
		return new ContainerConsistencyPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createContainerCompletenessAdapter()
	 * 
	 */
	public Adapter createContainerCompletenessAdapter() {
		return new ContainerCompletenessPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createCompliesToAdapter()
	 * 
	 */
	public Adapter createCompliesToAdapter() {
		return new CompliesToPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Evidence.util.EvidenceAdapterFactory#createExtendedProjectPropertyAdapter()
	 * 
	 */
	public Adapter createExtendedProjectPropertyAdapter() {
		return new ExtendedProjectPropertyPropertiesEditionProvider();
	}

}
