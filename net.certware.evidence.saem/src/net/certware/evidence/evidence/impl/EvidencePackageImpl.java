/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence.impl;

import net.certware.evidence.evidence.Accuracy;
import net.certware.evidence.evidence.AccuracyLevel;
import net.certware.evidence.evidence.Activity;
import net.certware.evidence.evidence.ActivityProperty;
import net.certware.evidence.evidence.AdministrativeElement;
import net.certware.evidence.evidence.AdministrativeProperty;
import net.certware.evidence.evidence.Amplifies;
import net.certware.evidence.evidence.ApprovedBy;
import net.certware.evidence.evidence.Assertion;
import net.certware.evidence.evidence.AtLocation;
import net.certware.evidence.evidence.AtTime;
import net.certware.evidence.evidence.CareOf;
import net.certware.evidence.evidence.Challenges;
import net.certware.evidence.evidence.CollectionMethod;
import net.certware.evidence.evidence.Completeness;
import net.certware.evidence.evidence.CompletenessLevel;
import net.certware.evidence.evidence.CompositeSubject;
import net.certware.evidence.evidence.Confidence;
import net.certware.evidence.evidence.ConfidenceLevel;
import net.certware.evidence.evidence.Conflicts;
import net.certware.evidence.evidence.Consistency;
import net.certware.evidence.evidence.ConsistencyLevel;
import net.certware.evidence.evidence.Contributes;
import net.certware.evidence.evidence.CreatedBy;
import net.certware.evidence.evidence.CustodyProperty;
import net.certware.evidence.evidence.DependsOn;
import net.certware.evidence.evidence.Description;
import net.certware.evidence.evidence.Document;
import net.certware.evidence.evidence.DocumentAttribute;
import net.certware.evidence.evidence.DocumentProperty;
import net.certware.evidence.evidence.DomainAssertion;
import net.certware.evidence.evidence.DomainClaim;
import net.certware.evidence.evidence.DomainObject;
import net.certware.evidence.evidence.EffectiveTime;
import net.certware.evidence.evidence.Element;
import net.certware.evidence.evidence.EndTime;
import net.certware.evidence.evidence.EvaluationAttribute;
import net.certware.evidence.evidence.EvidenceAttribute;
import net.certware.evidence.evidence.EvidenceElement;
import net.certware.evidence.evidence.EvidenceEvaluation;
import net.certware.evidence.evidence.EvidenceEvent;
import net.certware.evidence.evidence.EvidenceFactory;
import net.certware.evidence.evidence.EvidenceGroup;
import net.certware.evidence.evidence.EvidenceInterpretation;
import net.certware.evidence.evidence.EvidenceItem;
import net.certware.evidence.evidence.EvidenceObservation;
import net.certware.evidence.evidence.EvidencePackage;
import net.certware.evidence.evidence.EvidenceProperty;
import net.certware.evidence.evidence.EvidenceRelation;
import net.certware.evidence.evidence.EvidenceRequest;
import net.certware.evidence.evidence.EvidenceResolution;
import net.certware.evidence.evidence.Exhibit;
import net.certware.evidence.evidence.ExhibitProperty;
import net.certware.evidence.evidence.FormalObject;
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
import net.certware.evidence.evidence.Meaning;
import net.certware.evidence.evidence.MeansThat;
import net.certware.evidence.evidence.Method;
import net.certware.evidence.evidence.Negates;
import net.certware.evidence.evidence.Organization;
import net.certware.evidence.evidence.Originality;
import net.certware.evidence.evidence.OriginalityLevel;
import net.certware.evidence.evidence.Originator;
import net.certware.evidence.evidence.OwnedBy;
import net.certware.evidence.evidence.Person;
import net.certware.evidence.evidence.ProjectObjective;
import net.certware.evidence.evidence.Provenance;
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
import net.certware.evidence.evidence.TimingProperty;
import net.certware.evidence.evidence.Tool;
import net.certware.evidence.evidence.UnknownSubject;
import net.certware.evidence.evidence.UsingProcess;
import net.certware.evidence.evidence.Weakens;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvidencePackageImpl extends EPackageImpl implements EvidencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consistencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completenessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass approvedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createdByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiresToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isBasedOnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isCharacterizedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeSubjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relevanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass significanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accuracyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasRoleInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isScopedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectiveTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass originalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reliabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isGeneratedAtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conflictsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rationaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refutesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownSubjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceEvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolvesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass originatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependsOnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isAssociatedWithEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiresMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satisfiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administrativeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainClaimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceResolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weakensEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amplifiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass challengesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isAcquiredAtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isTransferredToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provenanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isPartOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isRevokedAtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providesContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meansThatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass careOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custodyPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isCreatedAtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiresPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidencePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administrativePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasElectronicSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isExpressedInLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usingProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasSecurityClassificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isReleaseableToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supercedesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasMediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exhibitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meaningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exhibitPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceInterpretationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consistencyLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum originalityLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reportingLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum standardOfProofEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supportLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum completenessLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reliabilityLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accuracyLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum confidenceLevelEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.certware.evidence.evidence.EvidencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EvidencePackageImpl() {
		super(eNS_URI, EvidenceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EvidencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EvidencePackage init() {
		if (isInited) return (EvidencePackage)EPackage.Registry.INSTANCE.getEPackage(EvidencePackage.eNS_URI);

		// Obtain or create and register package
		EvidencePackageImpl theEvidencePackage = (EvidencePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EvidencePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EvidencePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEvidencePackage.createPackageContents();

		// Initialize created meta-data
		theEvidencePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEvidencePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EvidencePackage.eNS_URI, theEvidencePackage);
		return theEvidencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidenceAttribute() {
		return evidenceAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsistency() {
		return consistencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsistency_Value() {
		return (EAttribute)consistencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompleteness() {
		return completenessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompleteness_Status() {
		return (EAttribute)completenessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Title() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Property() {
		return (EReference)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Attribute() {
		return (EReference)documentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfidence() {
		return confidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfidence_Value() {
		return (EAttribute)confidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApprovedBy() {
		return approvedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApprovedBy_Supervisor() {
		return (EReference)approvedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_Text() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreatedBy() {
		return createdByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreatedBy_Source() {
		return (EReference)createdByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTool() {
		return toolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Version() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Tool() {
		return (EReference)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiresTool() {
		return requiresToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiresTool_Tool() {
		return (EReference)requiresToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidenceItem() {
		return evidenceItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceItem_Event() {
		return (EReference)evidenceItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsBasedOn() {
		return isBasedOnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsBasedOn_Source() {
		return (EReference)isBasedOnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainAssertion() {
		return domainAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainAssertion_Stmt() {
		return (EAttribute)domainAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsA() {
		return isAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsA_Definition() {
		return (EReference)isAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsCharacterizedBy() {
		return isCharacterizedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsCharacterizedBy_Property() {
		return (EReference)isCharacterizedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Affiliation() {
		return (EReference)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_Address() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Affiliation() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Consistency() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Version() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Criteria() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Completeness() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Method() {
		return (EReference)packageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Originator() {
		return (EReference)packageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Request() {
		return (EReference)packageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Objective() {
		return (EReference)packageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Activity() {
		return (EReference)packageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Item() {
		return (EReference)packageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_RequiresPackage() {
		return (EReference)packageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Evaluation() {
		return (EReference)packageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndTime() {
		return endTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndTime_Datetime() {
		return (EAttribute)endTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertion() {
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertion_Url() {
		return (EAttribute)assertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertion_Facttype() {
		return (EAttribute)assertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertion_Role() {
		return (EReference)assertionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalObject() {
		return formalObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormalObject_Concept() {
		return (EAttribute)formalObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormalObject_Url() {
		return (EAttribute)formalObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeSubject() {
		return compositeSubjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeSubject_Element() {
		return (EReference)compositeSubjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleBinding() {
		return roleBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleBinding_Role() {
		return (EAttribute)roleBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleBinding_Subject() {
		return (EReference)roleBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartTime() {
		return startTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartTime_Datetime() {
		return (EAttribute)startTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelevance() {
		return relevanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelevance_Value() {
		return (EAttribute)relevanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignificance() {
		return significanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignificance_Value() {
		return (EAttribute)significanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccuracy() {
		return accuracyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccuracy_Value() {
		return (EAttribute)accuracyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasRoleIn() {
		return hasRoleInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasRoleIn_Role() {
		return (EAttribute)hasRoleInEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasRoleIn_Organization() {
		return (EReference)hasRoleInEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsScopedBy() {
		return isScopedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsScopedBy_Scope() {
		return (EReference)isScopedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffectiveTime() {
		return effectiveTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtTime() {
		return atTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtTime_DateTtime() {
		return (EAttribute)atTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOriginality() {
		return originalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOriginality_Value() {
		return (EAttribute)originalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReporting() {
		return reportingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReporting_Value() {
		return (EAttribute)reportingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReliability() {
		return reliabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReliability_Value() {
		return (EAttribute)reliabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupports() {
		return supportsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsGeneratedAt() {
		return isGeneratedAtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionMethod() {
		return collectionMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidenceRelation() {
		return evidenceRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceRelation_Item() {
		return (EReference)evidenceRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceRelation_Assertion() {
		return (EReference)evidenceRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupport() {
		return supportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupport_Value() {
		return (EAttribute)supportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConflicts() {
		return conflictsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflicts_Assertion1() {
		return (EReference)conflictsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflicts_Assertion2() {
		return (EReference)conflictsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRationale() {
		return rationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationale_Text() {
		return (EAttribute)rationaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefutes() {
		return refutesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefutes_Element() {
		return (EReference)refutesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegates() {
		return negatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegates_Element() {
		return (EReference)negatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnknownSubject() {
		return unknownSubjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidenceEvaluation() {
		return evidenceEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceEvaluation_Attribute() {
		return (EReference)evidenceEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolves() {
		return resolvesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolves_Element() {
		return (EReference)resolvesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOriginator() {
		return originatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidenceRequest() {
		return evidenceRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceRequest_Item() {
		return (EReference)evidenceRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceRequest_Provenance() {
		return (EReference)evidenceRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectObjective() {
		return projectObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectObjective_Text() {
		return (EAttribute)projectObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Property() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Timing() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Provenance() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependsOn() {
		return dependsOnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependsOn_Activity() {
		return (EReference)dependsOnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsAssociatedWith() {
		return isAssociatedWithEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsAssociatedWith_Request() {
		return (EReference)isAssociatedWithEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiresMethod() {
		return requiresMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiresMethod_Method() {
		return (EReference)requiresMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatisfies() {
		return satisfiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSatisfies_Objective() {
		return (EReference)satisfiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdministrativeElement() {
		return administrativeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeElement_Id() {
		return (EAttribute)administrativeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeElement_Name() {
		return (EAttribute)administrativeElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdministrativeElement_Description() {
		return (EReference)administrativeElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainClaim() {
		return domainClaimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidenceObservation() {
		return evidenceObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidenceResolution() {
		return evidenceResolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceResolution_Rationale() {
		return (EReference)evidenceResolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceResolution_Context() {
		return (EReference)evidenceResolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeakens() {
		return weakensEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmplifies() {
		return amplifiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContributes() {
		return contributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContributes_Relation1() {
		return (EReference)contributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContributes_Relation2() {
		return (EReference)contributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChallenges() {
		return challengesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrength() {
		return strengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrength_Value() {
		return (EAttribute)strengthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsAcquiredAt() {
		return isAcquiredAtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsTransferredTo() {
		return isTransferredToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentAttribute() {
		return documentAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidenceEvent() {
		return evidenceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceEvent_Custody() {
		return (EReference)evidenceEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwnedBy() {
		return ownedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwnedBy_Owner() {
		return (EReference)ownedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvenance() {
		return provenanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingProperty() {
		return timingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsPartOf() {
		return isPartOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsPartOf_Whole() {
		return (EReference)isPartOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsRevokedAt() {
		return isRevokedAtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidesContext() {
		return providesContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidesContext_Element() {
		return (EReference)providesContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidesContext_Context() {
		return (EReference)providesContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainObject() {
		return domainObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainObject_Name() {
		return (EAttribute)domainObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeansThat() {
		return meansThatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeansThat_Meaning() {
		return (EReference)meansThatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidenceElement() {
		return evidenceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvidenceElement_Id() {
		return (EAttribute)evidenceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceElement_Description() {
		return (EReference)evidenceElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceElement_Provenance() {
		return (EReference)evidenceElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceElement_Timing() {
		return (EReference)evidenceElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCareOf() {
		return careOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCareOf_Curator() {
		return (EReference)careOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustodyProperty() {
		return custodyPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtLocation() {
		return atLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtLocation_Location() {
		return (EReference)atLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsCreatedAt() {
		return isCreatedAtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiresPackage() {
		return requiresPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiresPackage_Package() {
		return (EReference)requiresPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityProperty() {
		return activityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidenceProperty() {
		return evidencePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdministrativeProperty() {
		return administrativePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Tool() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentProperty() {
		return documentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasElectronicSource() {
		return hasElectronicSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasElectronicSource_Source() {
		return (EAttribute)hasElectronicSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasElectronicSource_Format() {
		return (EAttribute)hasElectronicSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasElectronicSource_FileSize() {
		return (EAttribute)hasElectronicSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsExpressedInLanguage() {
		return isExpressedInLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIsExpressedInLanguage_Language() {
		return (EAttribute)isExpressedInLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIsExpressedInLanguage_IsPrimary() {
		return (EAttribute)isExpressedInLanguageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsingProcess() {
		return usingProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsingProcess_Method() {
		return (EReference)usingProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasSecurityClassification() {
		return hasSecurityClassificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasSecurityClassification_SecurityClassification() {
		return (EAttribute)hasSecurityClassificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsReleaseableTo() {
		return isReleaseableToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIsReleaseableTo_Releasability() {
		return (EAttribute)isReleaseableToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidenceGroup() {
		return evidenceGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvidenceGroup_Name() {
		return (EAttribute)evidenceGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceGroup_Element() {
		return (EReference)evidenceGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasVersion() {
		return hasVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasVersion_Version() {
		return (EAttribute)hasVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationAttribute() {
		return evaluationAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationAttribute_Provenance() {
		return (EReference)evaluationAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationAttribute_Timing() {
		return (EReference)evaluationAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupercedes() {
		return supercedesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupercedes_NewAttribute() {
		return (EReference)supercedesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupercedes_OldAttribute() {
		return (EReference)supercedesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasMedia() {
		return hasMediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasMedia_Media() {
		return (EAttribute)hasMediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExhibit() {
		return exhibitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExhibit_Name() {
		return (EAttribute)exhibitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExhibit_Url() {
		return (EAttribute)exhibitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExhibit_ExhibitProperty() {
		return (EReference)exhibitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeaning() {
		return meaningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExhibitProperty() {
		return exhibitPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidenceInterpretation() {
		return evidenceInterpretationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceInterpretation_Element() {
		return (EReference)evidenceInterpretationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConsistencyLevel() {
		return consistencyLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLevel() {
		return levelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOriginalityLevel() {
		return originalityLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReportingLevel() {
		return reportingLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStandardOfProof() {
		return standardOfProofEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupportLevel() {
		return supportLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompletenessLevel() {
		return completenessLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReliabilityLevel() {
		return reliabilityLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccuracyLevel() {
		return accuracyLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConfidenceLevel() {
		return confidenceLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceFactory getEvidenceFactory() {
		return (EvidenceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		evidenceAttributeEClass = createEClass(EVIDENCE_ATTRIBUTE);

		consistencyEClass = createEClass(CONSISTENCY);
		createEAttribute(consistencyEClass, CONSISTENCY__VALUE);

		completenessEClass = createEClass(COMPLETENESS);
		createEAttribute(completenessEClass, COMPLETENESS__STATUS);

		elementEClass = createEClass(ELEMENT);

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__TITLE);
		createEReference(documentEClass, DOCUMENT__PROPERTY);
		createEReference(documentEClass, DOCUMENT__ATTRIBUTE);

		confidenceEClass = createEClass(CONFIDENCE);
		createEAttribute(confidenceEClass, CONFIDENCE__VALUE);

		approvedByEClass = createEClass(APPROVED_BY);
		createEReference(approvedByEClass, APPROVED_BY__SUPERVISOR);

		descriptionEClass = createEClass(DESCRIPTION);
		createEAttribute(descriptionEClass, DESCRIPTION__TEXT);

		createdByEClass = createEClass(CREATED_BY);
		createEReference(createdByEClass, CREATED_BY__SOURCE);

		toolEClass = createEClass(TOOL);
		createEAttribute(toolEClass, TOOL__VERSION);

		methodEClass = createEClass(METHOD);
		createEReference(methodEClass, METHOD__TOOL);

		requiresToolEClass = createEClass(REQUIRES_TOOL);
		createEReference(requiresToolEClass, REQUIRES_TOOL__TOOL);

		evidenceItemEClass = createEClass(EVIDENCE_ITEM);
		createEReference(evidenceItemEClass, EVIDENCE_ITEM__EVENT);

		isBasedOnEClass = createEClass(IS_BASED_ON);
		createEReference(isBasedOnEClass, IS_BASED_ON__SOURCE);

		domainAssertionEClass = createEClass(DOMAIN_ASSERTION);
		createEAttribute(domainAssertionEClass, DOMAIN_ASSERTION__STMT);

		isAEClass = createEClass(IS_A);
		createEReference(isAEClass, IS_A__DEFINITION);

		isCharacterizedByEClass = createEClass(IS_CHARACTERIZED_BY);
		createEReference(isCharacterizedByEClass, IS_CHARACTERIZED_BY__PROPERTY);

		personEClass = createEClass(PERSON);
		createEReference(personEClass, PERSON__AFFILIATION);

		organizationEClass = createEClass(ORGANIZATION);
		createEAttribute(organizationEClass, ORGANIZATION__ADDRESS);
		createEReference(organizationEClass, ORGANIZATION__AFFILIATION);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__CONSISTENCY);
		createEAttribute(packageEClass, PACKAGE__VERSION);
		createEAttribute(packageEClass, PACKAGE__CRITERIA);
		createEAttribute(packageEClass, PACKAGE__COMPLETENESS);
		createEReference(packageEClass, PACKAGE__METHOD);
		createEReference(packageEClass, PACKAGE__ORIGINATOR);
		createEReference(packageEClass, PACKAGE__REQUEST);
		createEReference(packageEClass, PACKAGE__OBJECTIVE);
		createEReference(packageEClass, PACKAGE__ACTIVITY);
		createEReference(packageEClass, PACKAGE__ITEM);
		createEReference(packageEClass, PACKAGE__REQUIRES_PACKAGE);
		createEReference(packageEClass, PACKAGE__EVALUATION);

		endTimeEClass = createEClass(END_TIME);
		createEAttribute(endTimeEClass, END_TIME__DATETIME);

		assertionEClass = createEClass(ASSERTION);
		createEAttribute(assertionEClass, ASSERTION__URL);
		createEAttribute(assertionEClass, ASSERTION__FACTTYPE);
		createEReference(assertionEClass, ASSERTION__ROLE);

		formalObjectEClass = createEClass(FORMAL_OBJECT);
		createEAttribute(formalObjectEClass, FORMAL_OBJECT__CONCEPT);
		createEAttribute(formalObjectEClass, FORMAL_OBJECT__URL);

		objectEClass = createEClass(OBJECT);

		compositeSubjectEClass = createEClass(COMPOSITE_SUBJECT);
		createEReference(compositeSubjectEClass, COMPOSITE_SUBJECT__ELEMENT);

		roleBindingEClass = createEClass(ROLE_BINDING);
		createEAttribute(roleBindingEClass, ROLE_BINDING__ROLE);
		createEReference(roleBindingEClass, ROLE_BINDING__SUBJECT);

		startTimeEClass = createEClass(START_TIME);
		createEAttribute(startTimeEClass, START_TIME__DATETIME);

		relevanceEClass = createEClass(RELEVANCE);
		createEAttribute(relevanceEClass, RELEVANCE__VALUE);

		significanceEClass = createEClass(SIGNIFICANCE);
		createEAttribute(significanceEClass, SIGNIFICANCE__VALUE);

		accuracyEClass = createEClass(ACCURACY);
		createEAttribute(accuracyEClass, ACCURACY__VALUE);

		hasRoleInEClass = createEClass(HAS_ROLE_IN);
		createEAttribute(hasRoleInEClass, HAS_ROLE_IN__ROLE);
		createEReference(hasRoleInEClass, HAS_ROLE_IN__ORGANIZATION);

		isScopedByEClass = createEClass(IS_SCOPED_BY);
		createEReference(isScopedByEClass, IS_SCOPED_BY__SCOPE);

		effectiveTimeEClass = createEClass(EFFECTIVE_TIME);

		atTimeEClass = createEClass(AT_TIME);
		createEAttribute(atTimeEClass, AT_TIME__DATE_TTIME);

		originalityEClass = createEClass(ORIGINALITY);
		createEAttribute(originalityEClass, ORIGINALITY__VALUE);

		reportingEClass = createEClass(REPORTING);
		createEAttribute(reportingEClass, REPORTING__VALUE);

		reliabilityEClass = createEClass(RELIABILITY);
		createEAttribute(reliabilityEClass, RELIABILITY__VALUE);

		supportsEClass = createEClass(SUPPORTS);

		isGeneratedAtEClass = createEClass(IS_GENERATED_AT);

		collectionMethodEClass = createEClass(COLLECTION_METHOD);

		evidenceRelationEClass = createEClass(EVIDENCE_RELATION);
		createEReference(evidenceRelationEClass, EVIDENCE_RELATION__ITEM);
		createEReference(evidenceRelationEClass, EVIDENCE_RELATION__ASSERTION);

		supportEClass = createEClass(SUPPORT);
		createEAttribute(supportEClass, SUPPORT__VALUE);

		conflictsEClass = createEClass(CONFLICTS);
		createEReference(conflictsEClass, CONFLICTS__ASSERTION1);
		createEReference(conflictsEClass, CONFLICTS__ASSERTION2);

		rationaleEClass = createEClass(RATIONALE);
		createEAttribute(rationaleEClass, RATIONALE__TEXT);

		refutesEClass = createEClass(REFUTES);
		createEReference(refutesEClass, REFUTES__ELEMENT);

		negatesEClass = createEClass(NEGATES);
		createEReference(negatesEClass, NEGATES__ELEMENT);

		unknownSubjectEClass = createEClass(UNKNOWN_SUBJECT);

		evidenceEvaluationEClass = createEClass(EVIDENCE_EVALUATION);
		createEReference(evidenceEvaluationEClass, EVIDENCE_EVALUATION__ATTRIBUTE);

		resolvesEClass = createEClass(RESOLVES);
		createEReference(resolvesEClass, RESOLVES__ELEMENT);

		originatorEClass = createEClass(ORIGINATOR);

		evidenceRequestEClass = createEClass(EVIDENCE_REQUEST);
		createEReference(evidenceRequestEClass, EVIDENCE_REQUEST__ITEM);
		createEReference(evidenceRequestEClass, EVIDENCE_REQUEST__PROVENANCE);

		projectObjectiveEClass = createEClass(PROJECT_OBJECTIVE);
		createEAttribute(projectObjectiveEClass, PROJECT_OBJECTIVE__TEXT);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__PROPERTY);
		createEReference(activityEClass, ACTIVITY__TIMING);
		createEReference(activityEClass, ACTIVITY__PROVENANCE);

		dependsOnEClass = createEClass(DEPENDS_ON);
		createEReference(dependsOnEClass, DEPENDS_ON__ACTIVITY);

		isAssociatedWithEClass = createEClass(IS_ASSOCIATED_WITH);
		createEReference(isAssociatedWithEClass, IS_ASSOCIATED_WITH__REQUEST);

		requiresMethodEClass = createEClass(REQUIRES_METHOD);
		createEReference(requiresMethodEClass, REQUIRES_METHOD__METHOD);

		satisfiesEClass = createEClass(SATISFIES);
		createEReference(satisfiesEClass, SATISFIES__OBJECTIVE);

		administrativeElementEClass = createEClass(ADMINISTRATIVE_ELEMENT);
		createEAttribute(administrativeElementEClass, ADMINISTRATIVE_ELEMENT__ID);
		createEAttribute(administrativeElementEClass, ADMINISTRATIVE_ELEMENT__NAME);
		createEReference(administrativeElementEClass, ADMINISTRATIVE_ELEMENT__DESCRIPTION);

		domainClaimEClass = createEClass(DOMAIN_CLAIM);

		evidenceObservationEClass = createEClass(EVIDENCE_OBSERVATION);

		evidenceResolutionEClass = createEClass(EVIDENCE_RESOLUTION);
		createEReference(evidenceResolutionEClass, EVIDENCE_RESOLUTION__RATIONALE);
		createEReference(evidenceResolutionEClass, EVIDENCE_RESOLUTION__CONTEXT);

		weakensEClass = createEClass(WEAKENS);

		amplifiesEClass = createEClass(AMPLIFIES);

		contributesEClass = createEClass(CONTRIBUTES);
		createEReference(contributesEClass, CONTRIBUTES__RELATION1);
		createEReference(contributesEClass, CONTRIBUTES__RELATION2);

		challengesEClass = createEClass(CHALLENGES);

		strengthEClass = createEClass(STRENGTH);
		createEAttribute(strengthEClass, STRENGTH__VALUE);

		isAcquiredAtEClass = createEClass(IS_ACQUIRED_AT);

		isTransferredToEClass = createEClass(IS_TRANSFERRED_TO);

		documentAttributeEClass = createEClass(DOCUMENT_ATTRIBUTE);

		evidenceEventEClass = createEClass(EVIDENCE_EVENT);
		createEReference(evidenceEventEClass, EVIDENCE_EVENT__CUSTODY);

		ownedByEClass = createEClass(OWNED_BY);
		createEReference(ownedByEClass, OWNED_BY__OWNER);

		provenanceEClass = createEClass(PROVENANCE);

		timingPropertyEClass = createEClass(TIMING_PROPERTY);

		isPartOfEClass = createEClass(IS_PART_OF);
		createEReference(isPartOfEClass, IS_PART_OF__WHOLE);

		isRevokedAtEClass = createEClass(IS_REVOKED_AT);

		providesContextEClass = createEClass(PROVIDES_CONTEXT);
		createEReference(providesContextEClass, PROVIDES_CONTEXT__ELEMENT);
		createEReference(providesContextEClass, PROVIDES_CONTEXT__CONTEXT);

		domainObjectEClass = createEClass(DOMAIN_OBJECT);
		createEAttribute(domainObjectEClass, DOMAIN_OBJECT__NAME);

		meansThatEClass = createEClass(MEANS_THAT);
		createEReference(meansThatEClass, MEANS_THAT__MEANING);

		evidenceElementEClass = createEClass(EVIDENCE_ELEMENT);
		createEAttribute(evidenceElementEClass, EVIDENCE_ELEMENT__ID);
		createEReference(evidenceElementEClass, EVIDENCE_ELEMENT__DESCRIPTION);
		createEReference(evidenceElementEClass, EVIDENCE_ELEMENT__PROVENANCE);
		createEReference(evidenceElementEClass, EVIDENCE_ELEMENT__TIMING);

		careOfEClass = createEClass(CARE_OF);
		createEReference(careOfEClass, CARE_OF__CURATOR);

		custodyPropertyEClass = createEClass(CUSTODY_PROPERTY);

		atLocationEClass = createEClass(AT_LOCATION);
		createEReference(atLocationEClass, AT_LOCATION__LOCATION);

		isCreatedAtEClass = createEClass(IS_CREATED_AT);

		requiresPackageEClass = createEClass(REQUIRES_PACKAGE);
		createEReference(requiresPackageEClass, REQUIRES_PACKAGE__PACKAGE);

		activityPropertyEClass = createEClass(ACTIVITY_PROPERTY);

		evidencePropertyEClass = createEClass(EVIDENCE_PROPERTY);

		administrativePropertyEClass = createEClass(ADMINISTRATIVE_PROPERTY);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__TOOL);

		documentPropertyEClass = createEClass(DOCUMENT_PROPERTY);

		hasElectronicSourceEClass = createEClass(HAS_ELECTRONIC_SOURCE);
		createEAttribute(hasElectronicSourceEClass, HAS_ELECTRONIC_SOURCE__SOURCE);
		createEAttribute(hasElectronicSourceEClass, HAS_ELECTRONIC_SOURCE__FORMAT);
		createEAttribute(hasElectronicSourceEClass, HAS_ELECTRONIC_SOURCE__FILE_SIZE);

		isExpressedInLanguageEClass = createEClass(IS_EXPRESSED_IN_LANGUAGE);
		createEAttribute(isExpressedInLanguageEClass, IS_EXPRESSED_IN_LANGUAGE__LANGUAGE);
		createEAttribute(isExpressedInLanguageEClass, IS_EXPRESSED_IN_LANGUAGE__IS_PRIMARY);

		usingProcessEClass = createEClass(USING_PROCESS);
		createEReference(usingProcessEClass, USING_PROCESS__METHOD);

		hasSecurityClassificationEClass = createEClass(HAS_SECURITY_CLASSIFICATION);
		createEAttribute(hasSecurityClassificationEClass, HAS_SECURITY_CLASSIFICATION__SECURITY_CLASSIFICATION);

		isReleaseableToEClass = createEClass(IS_RELEASEABLE_TO);
		createEAttribute(isReleaseableToEClass, IS_RELEASEABLE_TO__RELEASABILITY);

		evidenceGroupEClass = createEClass(EVIDENCE_GROUP);
		createEAttribute(evidenceGroupEClass, EVIDENCE_GROUP__NAME);
		createEReference(evidenceGroupEClass, EVIDENCE_GROUP__ELEMENT);

		hasVersionEClass = createEClass(HAS_VERSION);
		createEAttribute(hasVersionEClass, HAS_VERSION__VERSION);

		evaluationAttributeEClass = createEClass(EVALUATION_ATTRIBUTE);
		createEReference(evaluationAttributeEClass, EVALUATION_ATTRIBUTE__PROVENANCE);
		createEReference(evaluationAttributeEClass, EVALUATION_ATTRIBUTE__TIMING);

		supercedesEClass = createEClass(SUPERCEDES);
		createEReference(supercedesEClass, SUPERCEDES__NEW_ATTRIBUTE);
		createEReference(supercedesEClass, SUPERCEDES__OLD_ATTRIBUTE);

		hasMediaEClass = createEClass(HAS_MEDIA);
		createEAttribute(hasMediaEClass, HAS_MEDIA__MEDIA);

		exhibitEClass = createEClass(EXHIBIT);
		createEAttribute(exhibitEClass, EXHIBIT__NAME);
		createEAttribute(exhibitEClass, EXHIBIT__URL);
		createEReference(exhibitEClass, EXHIBIT__EXHIBIT_PROPERTY);

		meaningEClass = createEClass(MEANING);

		exhibitPropertyEClass = createEClass(EXHIBIT_PROPERTY);

		evidenceInterpretationEClass = createEClass(EVIDENCE_INTERPRETATION);
		createEReference(evidenceInterpretationEClass, EVIDENCE_INTERPRETATION__ELEMENT);

		// Create enums
		consistencyLevelEEnum = createEEnum(CONSISTENCY_LEVEL);
		levelEEnum = createEEnum(LEVEL);
		originalityLevelEEnum = createEEnum(ORIGINALITY_LEVEL);
		reportingLevelEEnum = createEEnum(REPORTING_LEVEL);
		standardOfProofEEnum = createEEnum(STANDARD_OF_PROOF);
		supportLevelEEnum = createEEnum(SUPPORT_LEVEL);
		completenessLevelEEnum = createEEnum(COMPLETENESS_LEVEL);
		reliabilityLevelEEnum = createEEnum(RELIABILITY_LEVEL);
		accuracyLevelEEnum = createEEnum(ACCURACY_LEVEL);
		confidenceLevelEEnum = createEEnum(CONFIDENCE_LEVEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		evidenceAttributeEClass.getESuperTypes().add(this.getEvaluationAttribute());
		consistencyEClass.getESuperTypes().add(this.getDocumentAttribute());
		completenessEClass.getESuperTypes().add(this.getDocumentAttribute());
		documentEClass.getESuperTypes().add(this.getExhibit());
		confidenceEClass.getESuperTypes().add(this.getEvidenceAttribute());
		approvedByEClass.getESuperTypes().add(this.getProvenance());
		descriptionEClass.getESuperTypes().add(this.getElement());
		createdByEClass.getESuperTypes().add(this.getProvenance());
		toolEClass.getESuperTypes().add(this.getCollectionMethod());
		methodEClass.getESuperTypes().add(this.getCollectionMethod());
		requiresToolEClass.getESuperTypes().add(this.getEvidenceProperty());
		evidenceItemEClass.getESuperTypes().add(this.getEvidenceElement());
		isBasedOnEClass.getESuperTypes().add(this.getDocumentProperty());
		domainAssertionEClass.getESuperTypes().add(this.getMeaning());
		domainAssertionEClass.getESuperTypes().add(this.getElement());
		isAEClass.getESuperTypes().add(this.getEvidenceInterpretation());
		isCharacterizedByEClass.getESuperTypes().add(this.getEvidenceInterpretation());
		personEClass.getESuperTypes().add(this.getOriginator());
		organizationEClass.getESuperTypes().add(this.getOriginator());
		packageEClass.getESuperTypes().add(this.getAdministrativeElement());
		endTimeEClass.getESuperTypes().add(this.getEffectiveTime());
		assertionEClass.getESuperTypes().add(this.getDomainAssertion());
		formalObjectEClass.getESuperTypes().add(this.getDomainObject());
		objectEClass.getESuperTypes().add(this.getFormalObject());
		compositeSubjectEClass.getESuperTypes().add(this.getDomainObject());
		roleBindingEClass.getESuperTypes().add(this.getElement());
		startTimeEClass.getESuperTypes().add(this.getEffectiveTime());
		relevanceEClass.getESuperTypes().add(this.getEvidenceAttribute());
		significanceEClass.getESuperTypes().add(this.getEvidenceAttribute());
		accuracyEClass.getESuperTypes().add(this.getEvidenceAttribute());
		hasRoleInEClass.getESuperTypes().add(this.getEvidenceProperty());
		isScopedByEClass.getESuperTypes().add(this.getEvidenceInterpretation());
		effectiveTimeEClass.getESuperTypes().add(this.getTimingProperty());
		atTimeEClass.getESuperTypes().add(this.getTimingProperty());
		originalityEClass.getESuperTypes().add(this.getDocumentAttribute());
		reportingEClass.getESuperTypes().add(this.getEvidenceAttribute());
		reliabilityEClass.getESuperTypes().add(this.getDocumentAttribute());
		supportsEClass.getESuperTypes().add(this.getEvidenceRelation());
		isGeneratedAtEClass.getESuperTypes().add(this.getEvidenceEvent());
		collectionMethodEClass.getESuperTypes().add(this.getObject());
		evidenceRelationEClass.getESuperTypes().add(this.getEvidenceEvaluation());
		supportEClass.getESuperTypes().add(this.getEvidenceAttribute());
		conflictsEClass.getESuperTypes().add(this.getEvidenceObservation());
		rationaleEClass.getESuperTypes().add(this.getElement());
		refutesEClass.getESuperTypes().add(this.getEvidenceResolution());
		negatesEClass.getESuperTypes().add(this.getEvidenceResolution());
		unknownSubjectEClass.getESuperTypes().add(this.getFormalObject());
		evidenceEvaluationEClass.getESuperTypes().add(this.getEvidenceElement());
		resolvesEClass.getESuperTypes().add(this.getEvidenceResolution());
		originatorEClass.getESuperTypes().add(this.getObject());
		evidenceRequestEClass.getESuperTypes().add(this.getAdministrativeElement());
		projectObjectiveEClass.getESuperTypes().add(this.getAdministrativeElement());
		activityEClass.getESuperTypes().add(this.getAdministrativeElement());
		dependsOnEClass.getESuperTypes().add(this.getActivityProperty());
		isAssociatedWithEClass.getESuperTypes().add(this.getActivityProperty());
		requiresMethodEClass.getESuperTypes().add(this.getActivityProperty());
		satisfiesEClass.getESuperTypes().add(this.getActivityProperty());
		administrativeElementEClass.getESuperTypes().add(this.getElement());
		domainClaimEClass.getESuperTypes().add(this.getDomainAssertion());
		evidenceObservationEClass.getESuperTypes().add(this.getEvidenceEvaluation());
		evidenceResolutionEClass.getESuperTypes().add(this.getEvidenceEvaluation());
		weakensEClass.getESuperTypes().add(this.getContributes());
		amplifiesEClass.getESuperTypes().add(this.getContributes());
		contributesEClass.getESuperTypes().add(this.getEvidenceObservation());
		challengesEClass.getESuperTypes().add(this.getEvidenceRelation());
		strengthEClass.getESuperTypes().add(this.getEvidenceAttribute());
		isAcquiredAtEClass.getESuperTypes().add(this.getEvidenceEvent());
		isTransferredToEClass.getESuperTypes().add(this.getEvidenceEvent());
		documentAttributeEClass.getESuperTypes().add(this.getEvaluationAttribute());
		evidenceEventEClass.getESuperTypes().add(this.getEvidenceElement());
		ownedByEClass.getESuperTypes().add(this.getProvenance());
		provenanceEClass.getESuperTypes().add(this.getEvidenceProperty());
		timingPropertyEClass.getESuperTypes().add(this.getEvidenceProperty());
		isPartOfEClass.getESuperTypes().add(this.getExhibitProperty());
		isRevokedAtEClass.getESuperTypes().add(this.getEvidenceEvent());
		providesContextEClass.getESuperTypes().add(this.getEvidenceEvaluation());
		domainObjectEClass.getESuperTypes().add(this.getMeaning());
		meansThatEClass.getESuperTypes().add(this.getEvidenceInterpretation());
		evidenceElementEClass.getESuperTypes().add(this.getElement());
		careOfEClass.getESuperTypes().add(this.getCustodyProperty());
		custodyPropertyEClass.getESuperTypes().add(this.getEvidenceProperty());
		atLocationEClass.getESuperTypes().add(this.getCustodyProperty());
		isCreatedAtEClass.getESuperTypes().add(this.getEvidenceEvent());
		requiresPackageEClass.getESuperTypes().add(this.getAdministrativeProperty());
		activityPropertyEClass.getESuperTypes().add(this.getAdministrativeProperty());
		evidencePropertyEClass.getESuperTypes().add(this.getElement());
		administrativePropertyEClass.getESuperTypes().add(this.getElement());
		serviceEClass.getESuperTypes().add(this.getCollectionMethod());
		documentPropertyEClass.getESuperTypes().add(this.getEvidenceProperty());
		hasElectronicSourceEClass.getESuperTypes().add(this.getExhibitProperty());
		isExpressedInLanguageEClass.getESuperTypes().add(this.getDocumentProperty());
		usingProcessEClass.getESuperTypes().add(this.getCustodyProperty());
		hasSecurityClassificationEClass.getESuperTypes().add(this.getDocumentProperty());
		isReleaseableToEClass.getESuperTypes().add(this.getDocumentProperty());
		evidenceGroupEClass.getESuperTypes().add(this.getEvidenceItem());
		hasVersionEClass.getESuperTypes().add(this.getDocumentProperty());
		evaluationAttributeEClass.getESuperTypes().add(this.getElement());
		supercedesEClass.getESuperTypes().add(this.getEvidenceEvaluation());
		hasMediaEClass.getESuperTypes().add(this.getExhibitProperty());
		exhibitEClass.getESuperTypes().add(this.getEvidenceItem());
		meaningEClass.getESuperTypes().add(this.getEvidenceItem());
		exhibitPropertyEClass.getESuperTypes().add(this.getEvidenceProperty());
		evidenceInterpretationEClass.getESuperTypes().add(this.getEvidenceEvaluation());

		// Initialize classes and features; add operations and parameters
		initEClass(evidenceAttributeEClass, EvidenceAttribute.class, "EvidenceAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(consistencyEClass, Consistency.class, "Consistency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getConsistency_Value(), this.getConsistencyLevel(), "value", null, 0, 1, Consistency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(completenessEClass, Completeness.class, "Completeness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCompleteness_Status(), this.getCompletenessLevel(), "status", null, 0, 1, Completeness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDocument_Title(), ecorePackage.getEString(), "title", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDocument_Property(), this.getDocumentProperty(), null, "property", null, 0, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDocument_Attribute(), this.getDocumentAttribute(), null, "attribute", null, 0, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(confidenceEClass, Confidence.class, "Confidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getConfidence_Value(), this.getConfidenceLevel(), "value", null, 0, 1, Confidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(approvedByEClass, ApprovedBy.class, "ApprovedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getApprovedBy_Supervisor(), this.getOriginator(), null, "supervisor", null, 1, 1, ApprovedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDescription_Text(), ecorePackage.getEString(), "text", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(createdByEClass, CreatedBy.class, "CreatedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCreatedBy_Source(), this.getOriginator(), null, "source", null, 1, 1, CreatedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(toolEClass, Tool.class, "Tool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTool_Version(), ecorePackage.getEString(), "version", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMethod_Tool(), this.getRequiresTool(), null, "tool", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(requiresToolEClass, RequiresTool.class, "RequiresTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRequiresTool_Tool(), this.getTool(), null, "tool", null, 1, 1, RequiresTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(evidenceItemEClass, EvidenceItem.class, "EvidenceItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEvidenceItem_Event(), this.getEvidenceEvent(), null, "event", null, 0, -1, EvidenceItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(isBasedOnEClass, IsBasedOn.class, "IsBasedOn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIsBasedOn_Source(), this.getEvidenceItem(), null, "source", null, 1, 1, IsBasedOn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(domainAssertionEClass, DomainAssertion.class, "DomainAssertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDomainAssertion_Stmt(), ecorePackage.getEString(), "stmt", null, 0, 1, DomainAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(isAEClass, IsA.class, "IsA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIsA_Definition(), this.getObject(), null, "definition", null, 1, 1, IsA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(isCharacterizedByEClass, IsCharacterizedBy.class, "IsCharacterizedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIsCharacterizedBy_Property(), this.getDomainAssertion(), null, "property", null, 1, 1, IsCharacterizedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPerson_Affiliation(), this.getHasRoleIn(), null, "affiliation", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOrganization_Address(), ecorePackage.getEString(), "address", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOrganization_Affiliation(), this.getHasRoleIn(), null, "affiliation", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(packageEClass, net.certware.evidence.evidence.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPackage_Consistency(), this.getConsistencyLevel(), "consistency", null, 0, 1, net.certware.evidence.evidence.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPackage_Version(), ecorePackage.getEString(), "version", null, 0, 1, net.certware.evidence.evidence.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPackage_Criteria(), this.getStandardOfProof(), "criteria", null, 0, 1, net.certware.evidence.evidence.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getPackage_Completeness(), this.getCompletenessLevel(), "completeness", null, 0, 1, net.certware.evidence.evidence.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_Method(), this.getCollectionMethod(), null, "method", null, 0, -1, net.certware.evidence.evidence.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_Originator(), this.getOriginator(), null, "originator", null, 0, -1, net.certware.evidence.evidence.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_Request(), this.getEvidenceRequest(), null, "request", null, 0, -1, net.certware.evidence.evidence.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_Objective(), this.getProjectObjective(), null, "objective", null, 0, -1, net.certware.evidence.evidence.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_Activity(), this.getActivity(), null, "activity", null, 0, -1, net.certware.evidence.evidence.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_Item(), this.getEvidenceItem(), null, "item", null, 0, -1, net.certware.evidence.evidence.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_RequiresPackage(), this.getRequiresPackage(), null, "RequiresPackage", null, 0, -1, net.certware.evidence.evidence.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPackage_Evaluation(), this.getEvidenceEvaluation(), null, "evaluation", null, 0, -1, net.certware.evidence.evidence.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(endTimeEClass, EndTime.class, "EndTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEndTime_Datetime(), ecorePackage.getEDate(), "datetime", null, 0, 1, EndTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(assertionEClass, Assertion.class, "Assertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAssertion_Url(), ecorePackage.getEString(), "url", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getAssertion_Facttype(), ecorePackage.getEString(), "facttype", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAssertion_Role(), this.getRoleBinding(), null, "role", null, 0, -1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(formalObjectEClass, FormalObject.class, "FormalObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFormalObject_Concept(), ecorePackage.getEString(), "concept", null, 0, 1, FormalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFormalObject_Url(), ecorePackage.getEString(), "url", null, 0, 1, FormalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(objectEClass, net.certware.evidence.evidence.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(compositeSubjectEClass, CompositeSubject.class, "CompositeSubject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCompositeSubject_Element(), this.getDomainObject(), null, "element", null, 0, -1, CompositeSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(roleBindingEClass, RoleBinding.class, "RoleBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRoleBinding_Role(), ecorePackage.getEString(), "role", null, 0, 1, RoleBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRoleBinding_Subject(), this.getDomainObject(), null, "subject", null, 0, 1, RoleBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(startTimeEClass, StartTime.class, "StartTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStartTime_Datetime(), ecorePackage.getEDate(), "datetime", null, 0, 1, StartTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(relevanceEClass, Relevance.class, "Relevance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRelevance_Value(), this.getLevel(), "value", null, 0, 1, Relevance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(significanceEClass, Significance.class, "Significance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSignificance_Value(), this.getLevel(), "Value", null, 0, 1, Significance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(accuracyEClass, Accuracy.class, "Accuracy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAccuracy_Value(), this.getAccuracyLevel(), "value", null, 0, 1, Accuracy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(hasRoleInEClass, HasRoleIn.class, "HasRoleIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getHasRoleIn_Role(), ecorePackage.getEString(), "role", null, 0, 1, HasRoleIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getHasRoleIn_Organization(), this.getOrganization(), null, "organization", null, 1, 1, HasRoleIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(isScopedByEClass, IsScopedBy.class, "IsScopedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIsScopedBy_Scope(), this.getObject(), null, "scope", null, 1, 1, IsScopedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(effectiveTimeEClass, EffectiveTime.class, "EffectiveTime", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(atTimeEClass, AtTime.class, "AtTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAtTime_DateTtime(), ecorePackage.getEDate(), "dateTtime", null, 0, 1, AtTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(originalityEClass, Originality.class, "Originality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOriginality_Value(), this.getOriginalityLevel(), "value", null, 0, 1, Originality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(reportingEClass, Reporting.class, "Reporting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getReporting_Value(), this.getReportingLevel(), "value", null, 0, 1, Reporting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(reliabilityEClass, Reliability.class, "Reliability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getReliability_Value(), this.getReliabilityLevel(), "value", null, 0, 1, Reliability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(supportsEClass, Supports.class, "Supports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(isGeneratedAtEClass, IsGeneratedAt.class, "IsGeneratedAt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(collectionMethodEClass, CollectionMethod.class, "CollectionMethod", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(evidenceRelationEClass, EvidenceRelation.class, "EvidenceRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEvidenceRelation_Item(), this.getEvidenceItem(), null, "item", null, 1, 1, EvidenceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvidenceRelation_Assertion(), this.getDomainAssertion(), null, "assertion", null, 1, 1, EvidenceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(supportEClass, Support.class, "Support", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSupport_Value(), this.getSupportLevel(), "value", null, 0, 1, Support.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(conflictsEClass, Conflicts.class, "Conflicts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConflicts_Assertion1(), this.getDomainAssertion(), null, "assertion1", null, 1, 1, Conflicts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConflicts_Assertion2(), this.getDomainAssertion(), null, "assertion2", null, 1, 1, Conflicts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(rationaleEClass, Rationale.class, "Rationale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRationale_Text(), ecorePackage.getEString(), "text", null, 0, 1, Rationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(refutesEClass, Refutes.class, "Refutes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRefutes_Element(), this.getDomainAssertion(), null, "element", null, 1, 1, Refutes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(negatesEClass, Negates.class, "Negates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNegates_Element(), this.getEvidenceRelation(), null, "element", null, 1, 1, Negates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(unknownSubjectEClass, UnknownSubject.class, "UnknownSubject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(evidenceEvaluationEClass, EvidenceEvaluation.class, "EvidenceEvaluation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEvidenceEvaluation_Attribute(), this.getEvidenceAttribute(), null, "attribute", null, 0, -1, EvidenceEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(resolvesEClass, Resolves.class, "Resolves", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getResolves_Element(), this.getEvidenceObservation(), null, "element", null, 1, 1, Resolves.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(originatorEClass, Originator.class, "Originator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(evidenceRequestEClass, EvidenceRequest.class, "EvidenceRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEvidenceRequest_Item(), this.getEvidenceItem(), null, "item", null, 0, -1, EvidenceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvidenceRequest_Provenance(), this.getProvenance(), null, "provenance", null, 0, -1, EvidenceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(projectObjectiveEClass, ProjectObjective.class, "ProjectObjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getProjectObjective_Text(), ecorePackage.getEString(), "text", null, 0, 1, ProjectObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getActivity_Property(), this.getActivityProperty(), null, "property", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivity_Timing(), this.getTimingProperty(), null, "timing", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getActivity_Provenance(), this.getProvenance(), null, "provenance", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(dependsOnEClass, DependsOn.class, "DependsOn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDependsOn_Activity(), this.getActivity(), null, "activity", null, 1, 1, DependsOn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(isAssociatedWithEClass, IsAssociatedWith.class, "IsAssociatedWith", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIsAssociatedWith_Request(), this.getEvidenceRequest(), null, "request", null, 1, 1, IsAssociatedWith.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(requiresMethodEClass, RequiresMethod.class, "RequiresMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRequiresMethod_Method(), this.getCollectionMethod(), null, "method", null, 1, 1, RequiresMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(satisfiesEClass, Satisfies.class, "Satisfies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSatisfies_Objective(), this.getProjectObjective(), null, "objective", null, 1, 1, Satisfies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(administrativeElementEClass, AdministrativeElement.class, "AdministrativeElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAdministrativeElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, AdministrativeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getAdministrativeElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, AdministrativeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAdministrativeElement_Description(), this.getDescription(), null, "description", null, 0, -1, AdministrativeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(domainClaimEClass, DomainClaim.class, "DomainClaim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(evidenceObservationEClass, EvidenceObservation.class, "EvidenceObservation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(evidenceResolutionEClass, EvidenceResolution.class, "EvidenceResolution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEvidenceResolution_Rationale(), this.getRationale(), null, "rationale", null, 1, 1, EvidenceResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvidenceResolution_Context(), this.getEvidenceGroup(), null, "context", null, 1, 1, EvidenceResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(weakensEClass, Weakens.class, "Weakens", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(amplifiesEClass, Amplifies.class, "Amplifies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(contributesEClass, Contributes.class, "Contributes", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getContributes_Relation1(), this.getEvidenceRelation(), null, "relation1", null, 1, 1, Contributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getContributes_Relation2(), this.getEvidenceRelation(), null, "relation2", null, 1, 1, Contributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(challengesEClass, Challenges.class, "Challenges", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(strengthEClass, Strength.class, "Strength", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStrength_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, Strength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(isAcquiredAtEClass, IsAcquiredAt.class, "IsAcquiredAt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(isTransferredToEClass, IsTransferredTo.class, "IsTransferredTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(documentAttributeEClass, DocumentAttribute.class, "DocumentAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(evidenceEventEClass, EvidenceEvent.class, "EvidenceEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEvidenceEvent_Custody(), this.getCustodyProperty(), null, "custody", null, 0, -1, EvidenceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(ownedByEClass, OwnedBy.class, "OwnedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOwnedBy_Owner(), this.getOriginator(), null, "owner", null, 1, 1, OwnedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(provenanceEClass, Provenance.class, "Provenance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(timingPropertyEClass, TimingProperty.class, "TimingProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(isPartOfEClass, IsPartOf.class, "IsPartOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIsPartOf_Whole(), this.getExhibit(), null, "whole", null, 1, 1, IsPartOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(isRevokedAtEClass, IsRevokedAt.class, "IsRevokedAt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(providesContextEClass, ProvidesContext.class, "ProvidesContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getProvidesContext_Element(), this.getEvidenceElement(), null, "element", null, 1, 1, ProvidesContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProvidesContext_Context(), this.getEvidenceGroup(), null, "context", null, 1, 1, ProvidesContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(domainObjectEClass, DomainObject.class, "DomainObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDomainObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(meansThatEClass, MeansThat.class, "MeansThat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMeansThat_Meaning(), this.getDomainAssertion(), null, "meaning", null, 1, 1, MeansThat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(evidenceElementEClass, EvidenceElement.class, "EvidenceElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEvidenceElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, EvidenceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvidenceElement_Description(), this.getDescription(), null, "description", null, 0, -1, EvidenceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvidenceElement_Provenance(), this.getProvenance(), null, "provenance", null, 0, -1, EvidenceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvidenceElement_Timing(), this.getTimingProperty(), null, "timing", null, 0, -1, EvidenceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(careOfEClass, CareOf.class, "CareOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCareOf_Curator(), this.getPerson(), null, "curator", null, 1, 1, CareOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(custodyPropertyEClass, CustodyProperty.class, "CustodyProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(atLocationEClass, AtLocation.class, "AtLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAtLocation_Location(), this.getOrganization(), null, "location", null, 1, 1, AtLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(isCreatedAtEClass, IsCreatedAt.class, "IsCreatedAt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(requiresPackageEClass, RequiresPackage.class, "RequiresPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRequiresPackage_Package(), this.getPackage(), null, "package", null, 1, 1, RequiresPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(activityPropertyEClass, ActivityProperty.class, "ActivityProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(evidencePropertyEClass, EvidenceProperty.class, "EvidenceProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(administrativePropertyEClass, AdministrativeProperty.class, "AdministrativeProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getService_Tool(), this.getRequiresTool(), null, "tool", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(documentPropertyEClass, DocumentProperty.class, "DocumentProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(hasElectronicSourceEClass, HasElectronicSource.class, "HasElectronicSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getHasElectronicSource_Source(), ecorePackage.getEString(), "source", null, 0, 1, HasElectronicSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getHasElectronicSource_Format(), ecorePackage.getEString(), "format", null, 0, 1, HasElectronicSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getHasElectronicSource_FileSize(), ecorePackage.getEIntegerObject(), "fileSize", null, 0, 1, HasElectronicSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(isExpressedInLanguageEClass, IsExpressedInLanguage.class, "IsExpressedInLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIsExpressedInLanguage_Language(), ecorePackage.getEString(), "language", null, 0, 1, IsExpressedInLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getIsExpressedInLanguage_IsPrimary(), ecorePackage.getEBooleanObject(), "IsPrimary", null, 0, 1, IsExpressedInLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(usingProcessEClass, UsingProcess.class, "UsingProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getUsingProcess_Method(), this.getCollectionMethod(), null, "method", null, 1, 1, UsingProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(hasSecurityClassificationEClass, HasSecurityClassification.class, "HasSecurityClassification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getHasSecurityClassification_SecurityClassification(), ecorePackage.getEString(), "securityClassification", null, 0, 1, HasSecurityClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(isReleaseableToEClass, IsReleaseableTo.class, "IsReleaseableTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIsReleaseableTo_Releasability(), ecorePackage.getEString(), "releasability", null, 0, 1, IsReleaseableTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(evidenceGroupEClass, EvidenceGroup.class, "EvidenceGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEvidenceGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, EvidenceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvidenceGroup_Element(), this.getEvidenceElement(), null, "element", null, 0, -1, EvidenceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(hasVersionEClass, HasVersion.class, "HasVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getHasVersion_Version(), ecorePackage.getEString(), "version", null, 0, 1, HasVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(evaluationAttributeEClass, EvaluationAttribute.class, "EvaluationAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEvaluationAttribute_Provenance(), this.getProvenance(), null, "provenance", null, 0, -1, EvaluationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvaluationAttribute_Timing(), this.getTimingProperty(), null, "timing", null, 0, -1, EvaluationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(supercedesEClass, Supercedes.class, "Supercedes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSupercedes_NewAttribute(), this.getEvaluationAttribute(), null, "newAttribute", null, 1, 1, Supercedes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSupercedes_OldAttribute(), this.getEvaluationAttribute(), null, "oldAttribute", null, 1, 1, Supercedes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(hasMediaEClass, HasMedia.class, "HasMedia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getHasMedia_Media(), ecorePackage.getEString(), "media", null, 0, 1, HasMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(exhibitEClass, Exhibit.class, "Exhibit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getExhibit_Name(), ecorePackage.getEString(), "name", null, 0, 1, Exhibit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExhibit_Url(), ecorePackage.getEString(), "url", null, 0, 1, Exhibit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExhibit_ExhibitProperty(), this.getExhibitProperty(), null, "exhibitProperty", null, 0, -1, Exhibit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(meaningEClass, Meaning.class, "Meaning", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(exhibitPropertyEClass, ExhibitProperty.class, "ExhibitProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(evidenceInterpretationEClass, EvidenceInterpretation.class, "EvidenceInterpretation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEvidenceInterpretation_Element(), this.getEvidenceElement(), null, "element", null, 1, 1, EvidenceInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(consistencyLevelEEnum, ConsistencyLevel.class, "ConsistencyLevel"); //$NON-NLS-1$
		addEEnumLiteral(consistencyLevelEEnum, ConsistencyLevel.UNKNOWN);
		addEEnumLiteral(consistencyLevelEEnum, ConsistencyLevel.INFORMAL);
		addEEnumLiteral(consistencyLevelEEnum, ConsistencyLevel.SEMIFORMAL);
		addEEnumLiteral(consistencyLevelEEnum, ConsistencyLevel.FORMAL);

		initEEnum(levelEEnum, Level.class, "Level"); //$NON-NLS-1$
		addEEnumLiteral(levelEEnum, Level.UNKNOWN);
		addEEnumLiteral(levelEEnum, Level.LOW);
		addEEnumLiteral(levelEEnum, Level.MEDIUM_LOW);
		addEEnumLiteral(levelEEnum, Level.MEDIUM);
		addEEnumLiteral(levelEEnum, Level.MEDIUM_HIGH);
		addEEnumLiteral(levelEEnum, Level.HIGH);

		initEEnum(originalityLevelEEnum, OriginalityLevel.class, "OriginalityLevel"); //$NON-NLS-1$
		addEEnumLiteral(originalityLevelEEnum, OriginalityLevel.UNKNOWN);
		addEEnumLiteral(originalityLevelEEnum, OriginalityLevel.DERIVATIVE);
		addEEnumLiteral(originalityLevelEEnum, OriginalityLevel.ORIGINAL);

		initEEnum(reportingLevelEEnum, ReportingLevel.class, "ReportingLevel"); //$NON-NLS-1$
		addEEnumLiteral(reportingLevelEEnum, ReportingLevel.UNKNOWN);
		addEEnumLiteral(reportingLevelEEnum, ReportingLevel.SECONDARY);
		addEEnumLiteral(reportingLevelEEnum, ReportingLevel.PRIMARY);

		initEEnum(standardOfProofEEnum, StandardOfProof.class, "StandardOfProof"); //$NON-NLS-1$
		addEEnumLiteral(standardOfProofEEnum, StandardOfProof.UNKNOWN);
		addEEnumLiteral(standardOfProofEEnum, StandardOfProof.OTHER);
		addEEnumLiteral(standardOfProofEEnum, StandardOfProof.POE);
		addEEnumLiteral(standardOfProofEEnum, StandardOfProof.CCE);
		addEEnumLiteral(standardOfProofEEnum, StandardOfProof.BRD);

		initEEnum(supportLevelEEnum, SupportLevel.class, "SupportLevel"); //$NON-NLS-1$
		addEEnumLiteral(supportLevelEEnum, SupportLevel.UNKNOWN);
		addEEnumLiteral(supportLevelEEnum, SupportLevel.INDIRECT);
		addEEnumLiteral(supportLevelEEnum, SupportLevel.DIRECT);

		initEEnum(completenessLevelEEnum, CompletenessLevel.class, "CompletenessLevel"); //$NON-NLS-1$
		addEEnumLiteral(completenessLevelEEnum, CompletenessLevel.UNKNOWN);
		addEEnumLiteral(completenessLevelEEnum, CompletenessLevel.INCOMPLETE);
		addEEnumLiteral(completenessLevelEEnum, CompletenessLevel.DRAFT);
		addEEnumLiteral(completenessLevelEEnum, CompletenessLevel.FINAL);
		addEEnumLiteral(completenessLevelEEnum, CompletenessLevel.OBSOLETE);

		initEEnum(reliabilityLevelEEnum, ReliabilityLevel.class, "ReliabilityLevel"); //$NON-NLS-1$
		addEEnumLiteral(reliabilityLevelEEnum, ReliabilityLevel.UNKNOWN);
		addEEnumLiteral(reliabilityLevelEEnum, ReliabilityLevel.UN_RELIABLE);
		addEEnumLiteral(reliabilityLevelEEnum, ReliabilityLevel.NOT_USUALLY_RELIABLE);
		addEEnumLiteral(reliabilityLevelEEnum, ReliabilityLevel.USUALLY_RELIABLE);
		addEEnumLiteral(reliabilityLevelEEnum, ReliabilityLevel.FAIRLY_RELIABLE);
		addEEnumLiteral(reliabilityLevelEEnum, ReliabilityLevel.COMPLETELY_RELIABLE);

		initEEnum(accuracyLevelEEnum, AccuracyLevel.class, "AccuracyLevel"); //$NON-NLS-1$
		addEEnumLiteral(accuracyLevelEEnum, AccuracyLevel.UNKNOWN);
		addEEnumLiteral(accuracyLevelEEnum, AccuracyLevel.IMPROBABLE);
		addEEnumLiteral(accuracyLevelEEnum, AccuracyLevel.DOUBTFUL);
		addEEnumLiteral(accuracyLevelEEnum, AccuracyLevel.POSSIBLE);
		addEEnumLiteral(accuracyLevelEEnum, AccuracyLevel.PROBABLE);
		addEEnumLiteral(accuracyLevelEEnum, AccuracyLevel.CONFIRMED);

		initEEnum(confidenceLevelEEnum, ConfidenceLevel.class, "ConfidenceLevel"); //$NON-NLS-1$
		addEEnumLiteral(confidenceLevelEEnum, ConfidenceLevel.UNKNOWN);
		addEEnumLiteral(confidenceLevelEEnum, ConfidenceLevel.REPORTED_AS_UNCERTAIN);
		addEEnumLiteral(confidenceLevelEEnum, ConfidenceLevel.REPORTED_AS_PLAUSIBLE);
		addEEnumLiteral(confidenceLevelEEnum, ConfidenceLevel.REPORTED_AS_FACT);

		// Create resource
		createResource(eNS_URI);
	}

} //EvidencePackageImpl
