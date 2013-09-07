/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage
 * @generated
 */
public interface EvidenceFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvidenceFactory eINSTANCE = net.certware.sacm.SACM.Evidence.impl.EvidenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Consistency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consistency</em>'.
	 * @generated
	 */
	Consistency createConsistency();

	/**
	 * Returns a new object of class '<em>Completeness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Completeness</em>'.
	 * @generated
	 */
	Completeness createCompleteness();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Confidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Confidence</em>'.
	 * @generated
	 */
	Confidence createConfidence();

	/**
	 * Returns a new object of class '<em>Approved By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Approved By</em>'.
	 * @generated
	 */
	ApprovedBy createApprovedBy();

	/**
	 * Returns a new object of class '<em>Created By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Created By</em>'.
	 * @generated
	 */
	CreatedBy createCreatedBy();

	/**
	 * Returns a new object of class '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool</em>'.
	 * @generated
	 */
	Tool createTool();

	/**
	 * Returns a new object of class '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method</em>'.
	 * @generated
	 */
	Method createMethod();

	/**
	 * Returns a new object of class '<em>Is Based On</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Based On</em>'.
	 * @generated
	 */
	IsBasedOn createIsBasedOn();

	/**
	 * Returns a new object of class '<em>Is A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is A</em>'.
	 * @generated
	 */
	IsA createIsA();

	/**
	 * Returns a new object of class '<em>Is Characterized By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Characterized By</em>'.
	 * @generated
	 */
	IsCharacterizedBy createIsCharacterizedBy();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization</em>'.
	 * @generated
	 */
	Organization createOrganization();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	EvidenceContainer createEvidenceContainer();

	/**
	 * Returns a new object of class '<em>End Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Time</em>'.
	 * @generated
	 */
	EndTime createEndTime();

	/**
	 * Returns a new object of class '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion</em>'.
	 * @generated
	 */
	Assertion createAssertion();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	Object createObject();

	/**
	 * Returns a new object of class '<em>Composite Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Object</em>'.
	 * @generated
	 */
	CompositeObject createCompositeObject();

	/**
	 * Returns a new object of class '<em>Role Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Binding</em>'.
	 * @generated
	 */
	RoleBinding createRoleBinding();

	/**
	 * Returns a new object of class '<em>Start Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Time</em>'.
	 * @generated
	 */
	StartTime createStartTime();

	/**
	 * Returns a new object of class '<em>Relevance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relevance</em>'.
	 * @generated
	 */
	Relevance createRelevance();

	/**
	 * Returns a new object of class '<em>Significance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Significance</em>'.
	 * @generated
	 */
	Significance createSignificance();

	/**
	 * Returns a new object of class '<em>Accuracy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accuracy</em>'.
	 * @generated
	 */
	Accuracy createAccuracy();

	/**
	 * Returns a new object of class '<em>Has Role In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Role In</em>'.
	 * @generated
	 */
	HasRoleIn createHasRoleIn();

	/**
	 * Returns a new object of class '<em>Is Scoped By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Scoped By</em>'.
	 * @generated
	 */
	IsScopedBy createIsScopedBy();

	/**
	 * Returns a new object of class '<em>At Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>At Time</em>'.
	 * @generated
	 */
	AtTime createAtTime();

	/**
	 * Returns a new object of class '<em>Originality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Originality</em>'.
	 * @generated
	 */
	Originality createOriginality();

	/**
	 * Returns a new object of class '<em>Reporting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reporting</em>'.
	 * @generated
	 */
	Reporting createReporting();

	/**
	 * Returns a new object of class '<em>Reliability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reliability</em>'.
	 * @generated
	 */
	Reliability createReliability();

	/**
	 * Returns a new object of class '<em>Supports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supports</em>'.
	 * @generated
	 */
	Supports createSupports();

	/**
	 * Returns a new object of class '<em>Is Generated At</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Generated At</em>'.
	 * @generated
	 */
	IsGeneratedAt createIsGeneratedAt();

	/**
	 * Returns a new object of class '<em>Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Support</em>'.
	 * @generated
	 */
	Support createSupport();

	/**
	 * Returns a new object of class '<em>Conflicts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conflicts</em>'.
	 * @generated
	 */
	Conflicts createConflicts();

	/**
	 * Returns a new object of class '<em>Refutes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refutes</em>'.
	 * @generated
	 */
	Refutes createRefutes();

	/**
	 * Returns a new object of class '<em>Negates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negates</em>'.
	 * @generated
	 */
	Negates createNegates();

	/**
	 * Returns a new object of class '<em>Unknown Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Object</em>'.
	 * @generated
	 */
	UnknownObject createUnknownObject();

	/**
	 * Returns a new object of class '<em>Resolves</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolves</em>'.
	 * @generated
	 */
	Resolves createResolves();

	/**
	 * Returns a new object of class '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request</em>'.
	 * @generated
	 */
	EvidenceRequest createEvidenceRequest();

	/**
	 * Returns a new object of class '<em>Project Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Objective</em>'.
	 * @generated
	 */
	ProjectObjective createProjectObjective();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Depends On</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Depends On</em>'.
	 * @generated
	 */
	DependsOn createDependsOn();

	/**
	 * Returns a new object of class '<em>Satisfies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satisfies</em>'.
	 * @generated
	 */
	Satisfies createSatisfies();

	/**
	 * Returns a new object of class '<em>Referenced Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referenced Claim</em>'.
	 * @generated
	 */
	ReferencedClaim createReferencedClaim();

	/**
	 * Returns a new object of class '<em>Weakens</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weakens</em>'.
	 * @generated
	 */
	Weakens createWeakens();

	/**
	 * Returns a new object of class '<em>Amplifies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Amplifies</em>'.
	 * @generated
	 */
	Amplifies createAmplifies();

	/**
	 * Returns a new object of class '<em>Challenges</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Challenges</em>'.
	 * @generated
	 */
	Challenges createChallenges();

	/**
	 * Returns a new object of class '<em>Strength</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strength</em>'.
	 * @generated
	 */
	Strength createStrength();

	/**
	 * Returns a new object of class '<em>Is Acquired At</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Acquired At</em>'.
	 * @generated
	 */
	IsAcquiredAt createIsAcquiredAt();

	/**
	 * Returns a new object of class '<em>Is Transferred To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Transferred To</em>'.
	 * @generated
	 */
	IsTransferredTo createIsTransferredTo();

	/**
	 * Returns a new object of class '<em>Owned By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Owned By</em>'.
	 * @generated
	 */
	OwnedBy createOwnedBy();

	/**
	 * Returns a new object of class '<em>Is Part Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Part Of</em>'.
	 * @generated
	 */
	IsPartOf createIsPartOf();

	/**
	 * Returns a new object of class '<em>Is Revoked At</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Revoked At</em>'.
	 * @generated
	 */
	IsRevokedAt createIsRevokedAt();

	/**
	 * Returns a new object of class '<em>Provides Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provides Context</em>'.
	 * @generated
	 */
	ProvidesContext createProvidesContext();

	/**
	 * Returns a new object of class '<em>Means That</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Means That</em>'.
	 * @generated
	 */
	MeansThat createMeansThat();

	/**
	 * Returns a new object of class '<em>Care Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Of</em>'.
	 * @generated
	 */
	CareOf createCareOf();

	/**
	 * Returns a new object of class '<em>At Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>At Location</em>'.
	 * @generated
	 */
	AtLocation createAtLocation();

	/**
	 * Returns a new object of class '<em>Is Created At</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Created At</em>'.
	 * @generated
	 */
	IsCreatedAt createIsCreatedAt();

	/**
	 * Returns a new object of class '<em>Requires Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requires Container</em>'.
	 * @generated
	 */
	RequiresContainer createRequiresContainer();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Has Electronic Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Electronic Source</em>'.
	 * @generated
	 */
	HasElectronicSource createHasElectronicSource();

	/**
	 * Returns a new object of class '<em>Is Expressed In Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Expressed In Language</em>'.
	 * @generated
	 */
	IsExpressedInLanguage createIsExpressedInLanguage();

	/**
	 * Returns a new object of class '<em>Using Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Using Process</em>'.
	 * @generated
	 */
	UsingProcess createUsingProcess();

	/**
	 * Returns a new object of class '<em>Has Security Classification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Security Classification</em>'.
	 * @generated
	 */
	HasSecurityClassification createHasSecurityClassification();

	/**
	 * Returns a new object of class '<em>Is Releaseable To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Releaseable To</em>'.
	 * @generated
	 */
	IsReleaseableTo createIsReleaseableTo();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	EvidenceGroup createEvidenceGroup();

	/**
	 * Returns a new object of class '<em>Has Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Version</em>'.
	 * @generated
	 */
	HasVersion createHasVersion();

	/**
	 * Returns a new object of class '<em>Has Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Media</em>'.
	 * @generated
	 */
	HasMedia createHasMedia();

	/**
	 * Returns a new object of class '<em>Exhibit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exhibit</em>'.
	 * @generated
	 */
	Exhibit createExhibit();

	/**
	 * Returns a new object of class '<em>Extended Evidence Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Evidence Attribute</em>'.
	 * @generated
	 */
	ExtendedEvidenceAttribute createExtendedEvidenceAttribute();

	/**
	 * Returns a new object of class '<em>Extended Document Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Document Property</em>'.
	 * @generated
	 */
	ExtendedDocumentProperty createExtendedDocumentProperty();

	/**
	 * Returns a new object of class '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record</em>'.
	 * @generated
	 */
	Record createRecord();

	/**
	 * Returns a new object of class '<em>Objectified Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objectified Assertion</em>'.
	 * @generated
	 */
	ObjectifiedAssertion createObjectifiedAssertion();

	/**
	 * Returns a new object of class '<em>Is Modified By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Modified By</em>'.
	 * @generated
	 */
	IsModifiedBy createIsModifiedBy();

	/**
	 * Returns a new object of class '<em>Performed By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performed By</em>'.
	 * @generated
	 */
	PerformedBy createPerformedBy();

	/**
	 * Returns a new object of class '<em>Container Consistency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Consistency</em>'.
	 * @generated
	 */
	ContainerConsistency createContainerConsistency();

	/**
	 * Returns a new object of class '<em>Container Completeness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Completeness</em>'.
	 * @generated
	 */
	ContainerCompleteness createContainerCompleteness();

	/**
	 * Returns a new object of class '<em>Complies To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complies To</em>'.
	 * @generated
	 */
	CompliesTo createCompliesTo();

	/**
	 * Returns a new object of class '<em>Extended Project Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Project Property</em>'.
	 * @generated
	 */
	ExtendedProjectProperty createExtendedProjectProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EvidencePackage getEvidencePackage();

} //EvidenceFactory
