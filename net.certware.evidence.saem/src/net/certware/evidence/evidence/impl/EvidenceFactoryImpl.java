/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.evidence.evidence.impl;

import net.certware.evidence.evidence.Accuracy;
import net.certware.evidence.evidence.AccuracyLevel;
import net.certware.evidence.evidence.Activity;
import net.certware.evidence.evidence.Amplifies;
import net.certware.evidence.evidence.ApprovedBy;
import net.certware.evidence.evidence.Assertion;
import net.certware.evidence.evidence.AtLocation;
import net.certware.evidence.evidence.AtTime;
import net.certware.evidence.evidence.CareOf;
import net.certware.evidence.evidence.Challenges;
import net.certware.evidence.evidence.Completeness;
import net.certware.evidence.evidence.CompletenessLevel;
import net.certware.evidence.evidence.CompositeSubject;
import net.certware.evidence.evidence.Confidence;
import net.certware.evidence.evidence.ConfidenceLevel;
import net.certware.evidence.evidence.Conflicts;
import net.certware.evidence.evidence.Consistency;
import net.certware.evidence.evidence.ConsistencyLevel;
import net.certware.evidence.evidence.CreatedBy;
import net.certware.evidence.evidence.DependsOn;
import net.certware.evidence.evidence.Description;
import net.certware.evidence.evidence.Document;
import net.certware.evidence.evidence.DomainClaim;
import net.certware.evidence.evidence.EndTime;
import net.certware.evidence.evidence.EvaluationAttribute;
import net.certware.evidence.evidence.EvidenceFactory;
import net.certware.evidence.evidence.EvidenceGroup;
import net.certware.evidence.evidence.EvidencePackage;
import net.certware.evidence.evidence.EvidenceRequest;
import net.certware.evidence.evidence.Exhibit;
import net.certware.evidence.evidence.HasElectronicSource;
import net.certware.evidence.evidence.HasMedia;
import net.certware.evidence.evidence.HasRoleIn;
import net.certware.evidence.evidence.HasSecurityClassification;
import net.certware.evidence.evidence.HasVersion;
import net.certware.evidence.evidence.IsA;
import net.certware.evidence.evidence.IsAcquiredAt;
import net.certware.evidence.evidence.IsAssociatedWith;
import net.certware.evidence.evidence.IsBasedOn;
import net.certware.evidence.evidence.IsCharacterizedBy;
import net.certware.evidence.evidence.IsCreatedAt;
import net.certware.evidence.evidence.IsExpressedInLanguage;
import net.certware.evidence.evidence.IsGeneratedAt;
import net.certware.evidence.evidence.IsPartOf;
import net.certware.evidence.evidence.IsReleaseableTo;
import net.certware.evidence.evidence.IsRevokedAt;
import net.certware.evidence.evidence.IsScopedBy;
import net.certware.evidence.evidence.IsTransferredTo;
import net.certware.evidence.evidence.Level;
import net.certware.evidence.evidence.MeansThat;
import net.certware.evidence.evidence.Method;
import net.certware.evidence.evidence.Negates;
import net.certware.evidence.evidence.Organization;
import net.certware.evidence.evidence.Originality;
import net.certware.evidence.evidence.OriginalityLevel;
import net.certware.evidence.evidence.OwnedBy;
import net.certware.evidence.evidence.Person;
import net.certware.evidence.evidence.ProjectObjective;
import net.certware.evidence.evidence.ProvidesContext;
import net.certware.evidence.evidence.Rationale;
import net.certware.evidence.evidence.Refutes;
import net.certware.evidence.evidence.Relevance;
import net.certware.evidence.evidence.Reliability;
import net.certware.evidence.evidence.ReliabilityLevel;
import net.certware.evidence.evidence.Reporting;
import net.certware.evidence.evidence.ReportingLevel;
import net.certware.evidence.evidence.RequiresMethod;
import net.certware.evidence.evidence.RequiresPackage;
import net.certware.evidence.evidence.RequiresTool;
import net.certware.evidence.evidence.Resolves;
import net.certware.evidence.evidence.RoleBinding;
import net.certware.evidence.evidence.Satisfies;
import net.certware.evidence.evidence.Service;
import net.certware.evidence.evidence.Significance;
import net.certware.evidence.evidence.StandardOfProof;
import net.certware.evidence.evidence.StartTime;
import net.certware.evidence.evidence.Strength;
import net.certware.evidence.evidence.Supercedes;
import net.certware.evidence.evidence.Support;
import net.certware.evidence.evidence.SupportLevel;
import net.certware.evidence.evidence.Supports;
import net.certware.evidence.evidence.Tool;
import net.certware.evidence.evidence.UnknownSubject;
import net.certware.evidence.evidence.UsingProcess;
import net.certware.evidence.evidence.Weakens;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvidenceFactoryImpl extends EFactoryImpl implements EvidenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvidenceFactory init() {
		try {
			EvidenceFactory theEvidenceFactory = (EvidenceFactory)EPackage.Registry.INSTANCE.getEFactory("http:///evidence.ecore"); //$NON-NLS-1$ 
			if (theEvidenceFactory != null) {
				return theEvidenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EvidenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EvidencePackage.CONSISTENCY: return createConsistency();
			case EvidencePackage.COMPLETENESS: return createCompleteness();
			case EvidencePackage.DOCUMENT: return createDocument();
			case EvidencePackage.CONFIDENCE: return createConfidence();
			case EvidencePackage.APPROVED_BY: return createApprovedBy();
			case EvidencePackage.DESCRIPTION: return createDescription();
			case EvidencePackage.CREATED_BY: return createCreatedBy();
			case EvidencePackage.TOOL: return createTool();
			case EvidencePackage.METHOD: return createMethod();
			case EvidencePackage.REQUIRES_TOOL: return createRequiresTool();
			case EvidencePackage.IS_BASED_ON: return createIsBasedOn();
			case EvidencePackage.IS_A: return createIsA();
			case EvidencePackage.IS_CHARACTERIZED_BY: return createIsCharacterizedBy();
			case EvidencePackage.PERSON: return createPerson();
			case EvidencePackage.ORGANIZATION: return createOrganization();
			case EvidencePackage.PACKAGE: return createPackage();
			case EvidencePackage.END_TIME: return createEndTime();
			case EvidencePackage.ASSERTION: return createAssertion();
			case EvidencePackage.OBJECT: return createObject();
			case EvidencePackage.COMPOSITE_SUBJECT: return createCompositeSubject();
			case EvidencePackage.ROLE_BINDING: return createRoleBinding();
			case EvidencePackage.START_TIME: return createStartTime();
			case EvidencePackage.RELEVANCE: return createRelevance();
			case EvidencePackage.SIGNIFICANCE: return createSignificance();
			case EvidencePackage.ACCURACY: return createAccuracy();
			case EvidencePackage.HAS_ROLE_IN: return createHasRoleIn();
			case EvidencePackage.IS_SCOPED_BY: return createIsScopedBy();
			case EvidencePackage.AT_TIME: return createAtTime();
			case EvidencePackage.ORIGINALITY: return createOriginality();
			case EvidencePackage.REPORTING: return createReporting();
			case EvidencePackage.RELIABILITY: return createReliability();
			case EvidencePackage.SUPPORTS: return createSupports();
			case EvidencePackage.IS_GENERATED_AT: return createIsGeneratedAt();
			case EvidencePackage.SUPPORT: return createSupport();
			case EvidencePackage.CONFLICTS: return createConflicts();
			case EvidencePackage.RATIONALE: return createRationale();
			case EvidencePackage.REFUTES: return createRefutes();
			case EvidencePackage.NEGATES: return createNegates();
			case EvidencePackage.UNKNOWN_SUBJECT: return createUnknownSubject();
			case EvidencePackage.RESOLVES: return createResolves();
			case EvidencePackage.EVIDENCE_REQUEST: return createEvidenceRequest();
			case EvidencePackage.PROJECT_OBJECTIVE: return createProjectObjective();
			case EvidencePackage.ACTIVITY: return createActivity();
			case EvidencePackage.DEPENDS_ON: return createDependsOn();
			case EvidencePackage.IS_ASSOCIATED_WITH: return createIsAssociatedWith();
			case EvidencePackage.REQUIRES_METHOD: return createRequiresMethod();
			case EvidencePackage.SATISFIES: return createSatisfies();
			case EvidencePackage.DOMAIN_CLAIM: return createDomainClaim();
			case EvidencePackage.WEAKENS: return createWeakens();
			case EvidencePackage.AMPLIFIES: return createAmplifies();
			case EvidencePackage.CHALLENGES: return createChallenges();
			case EvidencePackage.STRENGTH: return createStrength();
			case EvidencePackage.IS_ACQUIRED_AT: return createIsAcquiredAt();
			case EvidencePackage.IS_TRANSFERRED_TO: return createIsTransferredTo();
			case EvidencePackage.OWNED_BY: return createOwnedBy();
			case EvidencePackage.IS_PART_OF: return createIsPartOf();
			case EvidencePackage.IS_REVOKED_AT: return createIsRevokedAt();
			case EvidencePackage.PROVIDES_CONTEXT: return createProvidesContext();
			case EvidencePackage.MEANS_THAT: return createMeansThat();
			case EvidencePackage.CARE_OF: return createCareOf();
			case EvidencePackage.AT_LOCATION: return createAtLocation();
			case EvidencePackage.IS_CREATED_AT: return createIsCreatedAt();
			case EvidencePackage.REQUIRES_PACKAGE: return createRequiresPackage();
			case EvidencePackage.SERVICE: return createService();
			case EvidencePackage.HAS_ELECTRONIC_SOURCE: return createHasElectronicSource();
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE: return createIsExpressedInLanguage();
			case EvidencePackage.USING_PROCESS: return createUsingProcess();
			case EvidencePackage.HAS_SECURITY_CLASSIFICATION: return createHasSecurityClassification();
			case EvidencePackage.IS_RELEASEABLE_TO: return createIsReleaseableTo();
			case EvidencePackage.EVIDENCE_GROUP: return createEvidenceGroup();
			case EvidencePackage.HAS_VERSION: return createHasVersion();
			case EvidencePackage.EVALUATION_ATTRIBUTE: return createEvaluationAttribute();
			case EvidencePackage.SUPERCEDES: return createSupercedes();
			case EvidencePackage.HAS_MEDIA: return createHasMedia();
			case EvidencePackage.EXHIBIT: return createExhibit();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EvidencePackage.CONSISTENCY_LEVEL:
				return createConsistencyLevelFromString(eDataType, initialValue);
			case EvidencePackage.LEVEL:
				return createLevelFromString(eDataType, initialValue);
			case EvidencePackage.ORIGINALITY_LEVEL:
				return createOriginalityLevelFromString(eDataType, initialValue);
			case EvidencePackage.REPORTING_LEVEL:
				return createReportingLevelFromString(eDataType, initialValue);
			case EvidencePackage.STANDARD_OF_PROOF:
				return createStandardOfProofFromString(eDataType, initialValue);
			case EvidencePackage.SUPPORT_LEVEL:
				return createSupportLevelFromString(eDataType, initialValue);
			case EvidencePackage.COMPLETENESS_LEVEL:
				return createCompletenessLevelFromString(eDataType, initialValue);
			case EvidencePackage.RELIABILITY_LEVEL:
				return createReliabilityLevelFromString(eDataType, initialValue);
			case EvidencePackage.ACCURACY_LEVEL:
				return createAccuracyLevelFromString(eDataType, initialValue);
			case EvidencePackage.CONFIDENCE_LEVEL:
				return createConfidenceLevelFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EvidencePackage.CONSISTENCY_LEVEL:
				return convertConsistencyLevelToString(eDataType, instanceValue);
			case EvidencePackage.LEVEL:
				return convertLevelToString(eDataType, instanceValue);
			case EvidencePackage.ORIGINALITY_LEVEL:
				return convertOriginalityLevelToString(eDataType, instanceValue);
			case EvidencePackage.REPORTING_LEVEL:
				return convertReportingLevelToString(eDataType, instanceValue);
			case EvidencePackage.STANDARD_OF_PROOF:
				return convertStandardOfProofToString(eDataType, instanceValue);
			case EvidencePackage.SUPPORT_LEVEL:
				return convertSupportLevelToString(eDataType, instanceValue);
			case EvidencePackage.COMPLETENESS_LEVEL:
				return convertCompletenessLevelToString(eDataType, instanceValue);
			case EvidencePackage.RELIABILITY_LEVEL:
				return convertReliabilityLevelToString(eDataType, instanceValue);
			case EvidencePackage.ACCURACY_LEVEL:
				return convertAccuracyLevelToString(eDataType, instanceValue);
			case EvidencePackage.CONFIDENCE_LEVEL:
				return convertConfidenceLevelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consistency createConsistency() {
		ConsistencyImpl consistency = new ConsistencyImpl();
		return consistency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Completeness createCompleteness() {
		CompletenessImpl completeness = new CompletenessImpl();
		return completeness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confidence createConfidence() {
		ConfidenceImpl confidence = new ConfidenceImpl();
		return confidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovedBy createApprovedBy() {
		ApprovedByImpl approvedBy = new ApprovedByImpl();
		return approvedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreatedBy createCreatedBy() {
		CreatedByImpl createdBy = new CreatedByImpl();
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiresTool createRequiresTool() {
		RequiresToolImpl requiresTool = new RequiresToolImpl();
		return requiresTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsBasedOn createIsBasedOn() {
		IsBasedOnImpl isBasedOn = new IsBasedOnImpl();
		return isBasedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsA createIsA() {
		IsAImpl isA = new IsAImpl();
		return isA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsCharacterizedBy createIsCharacterizedBy() {
		IsCharacterizedByImpl isCharacterizedBy = new IsCharacterizedByImpl();
		return isCharacterizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.certware.evidence.evidence.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndTime createEndTime() {
		EndTimeImpl endTime = new EndTimeImpl();
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assertion createAssertion() {
		AssertionImpl assertion = new AssertionImpl();
		return assertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.certware.evidence.evidence.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSubject createCompositeSubject() {
		CompositeSubjectImpl compositeSubject = new CompositeSubjectImpl();
		return compositeSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleBinding createRoleBinding() {
		RoleBindingImpl roleBinding = new RoleBindingImpl();
		return roleBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartTime createStartTime() {
		StartTimeImpl startTime = new StartTimeImpl();
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relevance createRelevance() {
		RelevanceImpl relevance = new RelevanceImpl();
		return relevance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Significance createSignificance() {
		SignificanceImpl significance = new SignificanceImpl();
		return significance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accuracy createAccuracy() {
		AccuracyImpl accuracy = new AccuracyImpl();
		return accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasRoleIn createHasRoleIn() {
		HasRoleInImpl hasRoleIn = new HasRoleInImpl();
		return hasRoleIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsScopedBy createIsScopedBy() {
		IsScopedByImpl isScopedBy = new IsScopedByImpl();
		return isScopedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtTime createAtTime() {
		AtTimeImpl atTime = new AtTimeImpl();
		return atTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Originality createOriginality() {
		OriginalityImpl originality = new OriginalityImpl();
		return originality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reporting createReporting() {
		ReportingImpl reporting = new ReportingImpl();
		return reporting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reliability createReliability() {
		ReliabilityImpl reliability = new ReliabilityImpl();
		return reliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supports createSupports() {
		SupportsImpl supports = new SupportsImpl();
		return supports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsGeneratedAt createIsGeneratedAt() {
		IsGeneratedAtImpl isGeneratedAt = new IsGeneratedAtImpl();
		return isGeneratedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Support createSupport() {
		SupportImpl support = new SupportImpl();
		return support;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conflicts createConflicts() {
		ConflictsImpl conflicts = new ConflictsImpl();
		return conflicts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rationale createRationale() {
		RationaleImpl rationale = new RationaleImpl();
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refutes createRefutes() {
		RefutesImpl refutes = new RefutesImpl();
		return refutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negates createNegates() {
		NegatesImpl negates = new NegatesImpl();
		return negates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownSubject createUnknownSubject() {
		UnknownSubjectImpl unknownSubject = new UnknownSubjectImpl();
		return unknownSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resolves createResolves() {
		ResolvesImpl resolves = new ResolvesImpl();
		return resolves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceRequest createEvidenceRequest() {
		EvidenceRequestImpl evidenceRequest = new EvidenceRequestImpl();
		return evidenceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectObjective createProjectObjective() {
		ProjectObjectiveImpl projectObjective = new ProjectObjectiveImpl();
		return projectObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependsOn createDependsOn() {
		DependsOnImpl dependsOn = new DependsOnImpl();
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsAssociatedWith createIsAssociatedWith() {
		IsAssociatedWithImpl isAssociatedWith = new IsAssociatedWithImpl();
		return isAssociatedWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiresMethod createRequiresMethod() {
		RequiresMethodImpl requiresMethod = new RequiresMethodImpl();
		return requiresMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Satisfies createSatisfies() {
		SatisfiesImpl satisfies = new SatisfiesImpl();
		return satisfies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainClaim createDomainClaim() {
		DomainClaimImpl domainClaim = new DomainClaimImpl();
		return domainClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weakens createWeakens() {
		WeakensImpl weakens = new WeakensImpl();
		return weakens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Amplifies createAmplifies() {
		AmplifiesImpl amplifies = new AmplifiesImpl();
		return amplifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Challenges createChallenges() {
		ChallengesImpl challenges = new ChallengesImpl();
		return challenges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strength createStrength() {
		StrengthImpl strength = new StrengthImpl();
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsAcquiredAt createIsAcquiredAt() {
		IsAcquiredAtImpl isAcquiredAt = new IsAcquiredAtImpl();
		return isAcquiredAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsTransferredTo createIsTransferredTo() {
		IsTransferredToImpl isTransferredTo = new IsTransferredToImpl();
		return isTransferredTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnedBy createOwnedBy() {
		OwnedByImpl ownedBy = new OwnedByImpl();
		return ownedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsPartOf createIsPartOf() {
		IsPartOfImpl isPartOf = new IsPartOfImpl();
		return isPartOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsRevokedAt createIsRevokedAt() {
		IsRevokedAtImpl isRevokedAt = new IsRevokedAtImpl();
		return isRevokedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidesContext createProvidesContext() {
		ProvidesContextImpl providesContext = new ProvidesContextImpl();
		return providesContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeansThat createMeansThat() {
		MeansThatImpl meansThat = new MeansThatImpl();
		return meansThat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareOf createCareOf() {
		CareOfImpl careOf = new CareOfImpl();
		return careOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtLocation createAtLocation() {
		AtLocationImpl atLocation = new AtLocationImpl();
		return atLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsCreatedAt createIsCreatedAt() {
		IsCreatedAtImpl isCreatedAt = new IsCreatedAtImpl();
		return isCreatedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiresPackage createRequiresPackage() {
		RequiresPackageImpl requiresPackage = new RequiresPackageImpl();
		return requiresPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasElectronicSource createHasElectronicSource() {
		HasElectronicSourceImpl hasElectronicSource = new HasElectronicSourceImpl();
		return hasElectronicSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsExpressedInLanguage createIsExpressedInLanguage() {
		IsExpressedInLanguageImpl isExpressedInLanguage = new IsExpressedInLanguageImpl();
		return isExpressedInLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsingProcess createUsingProcess() {
		UsingProcessImpl usingProcess = new UsingProcessImpl();
		return usingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasSecurityClassification createHasSecurityClassification() {
		HasSecurityClassificationImpl hasSecurityClassification = new HasSecurityClassificationImpl();
		return hasSecurityClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsReleaseableTo createIsReleaseableTo() {
		IsReleaseableToImpl isReleaseableTo = new IsReleaseableToImpl();
		return isReleaseableTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceGroup createEvidenceGroup() {
		EvidenceGroupImpl evidenceGroup = new EvidenceGroupImpl();
		return evidenceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasVersion createHasVersion() {
		HasVersionImpl hasVersion = new HasVersionImpl();
		return hasVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationAttribute createEvaluationAttribute() {
		EvaluationAttributeImpl evaluationAttribute = new EvaluationAttributeImpl();
		return evaluationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supercedes createSupercedes() {
		SupercedesImpl supercedes = new SupercedesImpl();
		return supercedes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasMedia createHasMedia() {
		HasMediaImpl hasMedia = new HasMediaImpl();
		return hasMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exhibit createExhibit() {
		ExhibitImpl exhibit = new ExhibitImpl();
		return exhibit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsistencyLevel createConsistencyLevelFromString(EDataType eDataType, String initialValue) {
		ConsistencyLevel result = ConsistencyLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsistencyLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevelFromString(EDataType eDataType, String initialValue) {
		Level result = Level.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginalityLevel createOriginalityLevelFromString(EDataType eDataType, String initialValue) {
		OriginalityLevel result = OriginalityLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOriginalityLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingLevel createReportingLevelFromString(EDataType eDataType, String initialValue) {
		ReportingLevel result = ReportingLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReportingLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardOfProof createStandardOfProofFromString(EDataType eDataType, String initialValue) {
		StandardOfProof result = StandardOfProof.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStandardOfProofToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportLevel createSupportLevelFromString(EDataType eDataType, String initialValue) {
		SupportLevel result = SupportLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupportLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletenessLevel createCompletenessLevelFromString(EDataType eDataType, String initialValue) {
		CompletenessLevel result = CompletenessLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompletenessLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityLevel createReliabilityLevelFromString(EDataType eDataType, String initialValue) {
		ReliabilityLevel result = ReliabilityLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReliabilityLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccuracyLevel createAccuracyLevelFromString(EDataType eDataType, String initialValue) {
		AccuracyLevel result = AccuracyLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccuracyLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfidenceLevel createConfidenceLevelFromString(EDataType eDataType, String initialValue) {
		ConfidenceLevel result = ConfidenceLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfidenceLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidencePackage getEvidencePackage() {
		return (EvidencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EvidencePackage getPackage() {
		return EvidencePackage.eINSTANCE;
	}

} //EvidenceFactoryImpl
