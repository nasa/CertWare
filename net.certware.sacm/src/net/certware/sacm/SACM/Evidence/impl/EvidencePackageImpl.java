/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import net.certware.sacm.SACM.Argumentation.ArgumentationPackage;

import net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl;

import net.certware.sacm.SACM.Evidence.Accuracy;
import net.certware.sacm.SACM.Evidence.AccuracyLevel;
import net.certware.sacm.SACM.Evidence.Activity;
import net.certware.sacm.SACM.Evidence.Amplifies;
import net.certware.sacm.SACM.Evidence.ApprovedBy;
import net.certware.sacm.SACM.Evidence.Assertion;
import net.certware.sacm.SACM.Evidence.AtLocation;
import net.certware.sacm.SACM.Evidence.AtTime;
import net.certware.sacm.SACM.Evidence.CareOf;
import net.certware.sacm.SACM.Evidence.Challenges;
import net.certware.sacm.SACM.Evidence.CollectionMethod;
import net.certware.sacm.SACM.Evidence.Completeness;
import net.certware.sacm.SACM.Evidence.CompletenessLevel;
import net.certware.sacm.SACM.Evidence.CompliesTo;
import net.certware.sacm.SACM.Evidence.CompositeObject;
import net.certware.sacm.SACM.Evidence.Confidence;
import net.certware.sacm.SACM.Evidence.ConfidenceLevel;
import net.certware.sacm.SACM.Evidence.Conflicts;
import net.certware.sacm.SACM.Evidence.Consistency;
import net.certware.sacm.SACM.Evidence.ConsistencyLevel;
import net.certware.sacm.SACM.Evidence.ContainerCompleteness;
import net.certware.sacm.SACM.Evidence.ContainerConsistency;
import net.certware.sacm.SACM.Evidence.Contributes;
import net.certware.sacm.SACM.Evidence.CreatedBy;
import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.DependsOn;
import net.certware.sacm.SACM.Evidence.Document;
import net.certware.sacm.SACM.Evidence.DocumentProperty;
import net.certware.sacm.SACM.Evidence.EffectiveTime;
import net.certware.sacm.SACM.Evidence.EndTime;
import net.certware.sacm.SACM.Evidence.EvidenceAssertion;
import net.certware.sacm.SACM.Evidence.EvidenceAttribute;
import net.certware.sacm.SACM.Evidence.EvidenceContainer;
import net.certware.sacm.SACM.Evidence.EvidenceElement;
import net.certware.sacm.SACM.Evidence.EvidenceEvaluation;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidenceFactory;
import net.certware.sacm.SACM.Evidence.EvidenceGroup;
import net.certware.sacm.SACM.Evidence.EvidenceInterpretation;
import net.certware.sacm.SACM.Evidence.EvidenceItem;
import net.certware.sacm.SACM.Evidence.EvidenceObservation;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.EvidenceProperty;
import net.certware.sacm.SACM.Evidence.EvidenceRelation;
import net.certware.sacm.SACM.Evidence.EvidenceRequest;
import net.certware.sacm.SACM.Evidence.EvidenceResolution;
import net.certware.sacm.SACM.Evidence.Exhibit;
import net.certware.sacm.SACM.Evidence.ExhibitProperty;
import net.certware.sacm.SACM.Evidence.ExtendedDocumentProperty;
import net.certware.sacm.SACM.Evidence.ExtendedEvidenceAttribute;
import net.certware.sacm.SACM.Evidence.ExtendedProjectProperty;
import net.certware.sacm.SACM.Evidence.FormalAssertion;
import net.certware.sacm.SACM.Evidence.FormalElement;
import net.certware.sacm.SACM.Evidence.FormalObject;
import net.certware.sacm.SACM.Evidence.HasElectronicSource;
import net.certware.sacm.SACM.Evidence.HasMedia;
import net.certware.sacm.SACM.Evidence.HasRoleIn;
import net.certware.sacm.SACM.Evidence.HasSecurityClassification;
import net.certware.sacm.SACM.Evidence.HasVersion;
import net.certware.sacm.SACM.Evidence.IsA;
import net.certware.sacm.SACM.Evidence.IsAcquiredAt;
import net.certware.sacm.SACM.Evidence.IsBasedOn;
import net.certware.sacm.SACM.Evidence.IsCharacterizedBy;
import net.certware.sacm.SACM.Evidence.IsCreatedAt;
import net.certware.sacm.SACM.Evidence.IsExpressedInLanguage;
import net.certware.sacm.SACM.Evidence.IsGeneratedAt;
import net.certware.sacm.SACM.Evidence.IsModifiedBy;
import net.certware.sacm.SACM.Evidence.IsPartOf;
import net.certware.sacm.SACM.Evidence.IsReleaseableTo;
import net.certware.sacm.SACM.Evidence.IsRevokedAt;
import net.certware.sacm.SACM.Evidence.IsScopedBy;
import net.certware.sacm.SACM.Evidence.IsTransferredTo;
import net.certware.sacm.SACM.Evidence.Level;
import net.certware.sacm.SACM.Evidence.MeansThat;
import net.certware.sacm.SACM.Evidence.Method;
import net.certware.sacm.SACM.Evidence.Negates;
import net.certware.sacm.SACM.Evidence.ObjectifiedAssertion;
import net.certware.sacm.SACM.Evidence.Organization;
import net.certware.sacm.SACM.Evidence.Originality;
import net.certware.sacm.SACM.Evidence.OriginalityLevel;
import net.certware.sacm.SACM.Evidence.OwnedBy;
import net.certware.sacm.SACM.Evidence.PerformedBy;
import net.certware.sacm.SACM.Evidence.Person;
import net.certware.sacm.SACM.Evidence.ProjectElement;
import net.certware.sacm.SACM.Evidence.ProjectObjective;
import net.certware.sacm.SACM.Evidence.ProjectProperty;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.ProvidesContext;
import net.certware.sacm.SACM.Evidence.Record;
import net.certware.sacm.SACM.Evidence.ReferencedClaim;
import net.certware.sacm.SACM.Evidence.Refutes;
import net.certware.sacm.SACM.Evidence.Relevance;
import net.certware.sacm.SACM.Evidence.Reliability;
import net.certware.sacm.SACM.Evidence.ReliabilityLevel;
import net.certware.sacm.SACM.Evidence.Reporting;
import net.certware.sacm.SACM.Evidence.ReportingLevel;
import net.certware.sacm.SACM.Evidence.RequiresContainer;
import net.certware.sacm.SACM.Evidence.Resolves;
import net.certware.sacm.SACM.Evidence.RoleBinding;
import net.certware.sacm.SACM.Evidence.Satisfies;
import net.certware.sacm.SACM.Evidence.Service;
import net.certware.sacm.SACM.Evidence.Significance;
import net.certware.sacm.SACM.Evidence.Stakeholder;
import net.certware.sacm.SACM.Evidence.StandardOfProof;
import net.certware.sacm.SACM.Evidence.StartTime;
import net.certware.sacm.SACM.Evidence.Strength;
import net.certware.sacm.SACM.Evidence.Support;
import net.certware.sacm.SACM.Evidence.SupportLevel;
import net.certware.sacm.SACM.Evidence.Supports;
import net.certware.sacm.SACM.Evidence.TimingProperty;
import net.certware.sacm.SACM.Evidence.Tool;
import net.certware.sacm.SACM.Evidence.UnknownObject;
import net.certware.sacm.SACM.Evidence.UsingProcess;
import net.certware.sacm.SACM.Evidence.Weakens;

import net.certware.sacm.SACM.SACMPackage;

import net.certware.sacm.SACM.impl.SACMPackageImpl;

import org.eclipse.emf.common.util.URI;

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
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

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
	private EClass formalAssertionEClass = null;

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
	private EClass evidenceContainerEClass = null;

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
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeObjectEClass = null;

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
	private EClass unknownObjectEClass = null;

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
	private EClass stakeholderEClass = null;

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
	private EClass satisfiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencedClaimEClass = null;

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
	private EClass documentPropertyEClass = null;

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
	private EClass formalObjectEClass = null;

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
	private EClass requiresContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectPropertyEClass = null;

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
	private EClass formalElementEClass = null;

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
	private EClass evidenceAssertionEClass = null;

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
	private EClass extendedEvidenceAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedDocumentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectifiedAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isModifiedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerConsistencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerCompletenessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compliesToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedProjectPropertyEClass = null;

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
	private EEnum completenessLevelEEnum = null;

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
	private EEnum supportLevelEEnum = null;

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
	private EEnum confidenceLevelEEnum = null;

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
	private EEnum standardOfProofEEnum = null;

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
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#eNS_URI
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

		// Obtain or create and register interdependencies
		SACMPackageImpl theSACMPackage = (SACMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SACMPackage.eNS_URI) instanceof SACMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SACMPackage.eNS_URI) : SACMPackage.eINSTANCE);
		ArgumentationPackageImpl theArgumentationPackage = (ArgumentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI) instanceof ArgumentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI) : ArgumentationPackage.eINSTANCE);

		// Create package meta-data objects
		theEvidencePackage.createPackageContents();
		theSACMPackage.createPackageContents();
		theArgumentationPackage.createPackageContents();

		// Initialize created meta-data
		theEvidencePackage.initializePackageContents();
		theSACMPackage.initializePackageContents();
		theArgumentationPackage.initializePackageContents();

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
	public EAttribute getDocument_Citation() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(1);
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
	public EClass getEvidenceItem() {
		return evidenceItemEClass;
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
	public EClass getFormalAssertion() {
		return formalAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormalAssertion_Content() {
		return (EAttribute)formalAssertionEClass.getEStructuralFeatures().get(0);
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
	public EReference getIsCharacterizedBy_Assertion() {
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
	public EClass getEvidenceContainer() {
		return evidenceContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvidenceContainer_Name() {
		return (EAttribute)evidenceContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceContainer_Evaluation() {
		return (EReference)evidenceContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceContainer_Item() {
		return (EReference)evidenceContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvidenceContainer_Gid() {
		return (EAttribute)evidenceContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceContainer_Property() {
		return (EReference)evidenceContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvidenceContainer_Version() {
		return (EAttribute)evidenceContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceContainer_Element() {
		return (EReference)evidenceContainerEClass.getEStructuralFeatures().get(6);
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
	public EReference getEndTime_Datetime() {
		return (EReference)endTimeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAssertion_Facttype() {
		return (EAttribute)assertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertion_Role() {
		return (EReference)assertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertion_Definition() {
		return (EReference)assertionEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getObject_Concept() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Definition() {
		return (EReference)objectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeObject() {
		return compositeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeObject_Element() {
		return (EReference)compositeObjectEClass.getEStructuralFeatures().get(0);
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
	public EReference getStartTime_Datetime() {
		return (EReference)startTimeEClass.getEStructuralFeatures().get(0);
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
	public EReference getAtTime_DateTtime() {
		return (EReference)atTimeEClass.getEStructuralFeatures().get(0);
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
	public EReference getEvidenceRelation_Assertion() {
		return (EReference)evidenceRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceRelation_Subject() {
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
	public EReference getConflicts_Assertion() {
		return (EReference)conflictsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflicts_Subject() {
		return (EReference)conflictsEClass.getEStructuralFeatures().get(1);
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
	public EClass getUnknownObject() {
		return unknownObjectEClass;
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
	public EClass getStakeholder() {
		return stakeholderEClass;
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
	public EClass getProjectObjective() {
		return projectObjectiveEClass;
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
	public EClass getDependsOn() {
		return dependsOnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependsOn_Element() {
		return (EReference)dependsOnEClass.getEStructuralFeatures().get(0);
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
	public EReference getSatisfies_Element() {
		return (EReference)satisfiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectElement() {
		return projectElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectElement_Name() {
		return (EAttribute)projectElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectElement_Content() {
		return (EAttribute)projectElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectElement_Property() {
		return (EReference)projectElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencedClaim() {
		return referencedClaimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencedClaim_Claim() {
		return (EReference)referencedClaimEClass.getEStructuralFeatures().get(0);
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
	public EReference getEvidenceResolution_Subject() {
		return (EReference)evidenceResolutionEClass.getEStructuralFeatures().get(0);
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
	public EReference getContributes_Subject() {
		return (EReference)contributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContributes_Relation() {
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
	public EClass getDocumentProperty() {
		return documentPropertyEClass;
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
	public EReference getProvidesContext_Context() {
		return (EReference)providesContextEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getFormalObject_Name() {
		return (EAttribute)formalObjectEClass.getEStructuralFeatures().get(0);
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
	public EReference getEvidenceElement_Timing() {
		return (EReference)evidenceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidenceElement_Custody() {
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
	public EReference getEvidenceElement_Event() {
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
	public EReference getCareOf_Custodian() {
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
	public EClass getRequiresContainer() {
		return requiresContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiresContainer_Container() {
		return (EReference)requiresContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectProperty() {
		return projectPropertyEClass;
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
	public EReference getExhibit_Property() {
		return (EReference)exhibitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalElement() {
		return formalElementEClass;
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
	public EReference getEvidenceInterpretation_Subject() {
		return (EReference)evidenceInterpretationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidenceAssertion() {
		return evidenceAssertionEClass;
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
	public EClass getExtendedEvidenceAttribute() {
		return extendedEvidenceAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedDocumentProperty() {
		return extendedDocumentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecord() {
		return recordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecord_Name() {
		return (EAttribute)recordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecord_Content() {
		return (EAttribute)recordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectifiedAssertion() {
		return objectifiedAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectifiedAssertion_Assertion() {
		return (EReference)objectifiedAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsModifiedBy() {
		return isModifiedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformedBy() {
		return performedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformedBy_Executor() {
		return (EReference)performedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerConsistency() {
		return containerConsistencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerConsistency_Value() {
		return (EAttribute)containerConsistencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerCompleteness() {
		return containerCompletenessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerCompleteness_Value() {
		return (EAttribute)containerCompletenessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompliesTo() {
		return compliesToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompliesTo_Criteria() {
		return (EAttribute)compliesToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedProjectProperty() {
		return extendedProjectPropertyEClass;
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
	public EEnum getCompletenessLevel() {
		return completenessLevelEEnum;
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
	public EEnum getSupportLevel() {
		return supportLevelEEnum;
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
	public EEnum getConfidenceLevel() {
		return confidenceLevelEEnum;
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
	public EEnum getStandardOfProof() {
		return standardOfProofEEnum;
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

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__TITLE);
		createEAttribute(documentEClass, DOCUMENT__CITATION);

		confidenceEClass = createEClass(CONFIDENCE);
		createEAttribute(confidenceEClass, CONFIDENCE__VALUE);

		approvedByEClass = createEClass(APPROVED_BY);
		createEReference(approvedByEClass, APPROVED_BY__SUPERVISOR);

		createdByEClass = createEClass(CREATED_BY);
		createEReference(createdByEClass, CREATED_BY__SOURCE);

		toolEClass = createEClass(TOOL);
		createEAttribute(toolEClass, TOOL__VERSION);

		methodEClass = createEClass(METHOD);

		evidenceItemEClass = createEClass(EVIDENCE_ITEM);

		isBasedOnEClass = createEClass(IS_BASED_ON);
		createEReference(isBasedOnEClass, IS_BASED_ON__SOURCE);

		formalAssertionEClass = createEClass(FORMAL_ASSERTION);
		createEAttribute(formalAssertionEClass, FORMAL_ASSERTION__CONTENT);

		isAEClass = createEClass(IS_A);
		createEReference(isAEClass, IS_A__DEFINITION);

		isCharacterizedByEClass = createEClass(IS_CHARACTERIZED_BY);
		createEReference(isCharacterizedByEClass, IS_CHARACTERIZED_BY__ASSERTION);

		personEClass = createEClass(PERSON);

		organizationEClass = createEClass(ORGANIZATION);
		createEAttribute(organizationEClass, ORGANIZATION__ADDRESS);

		evidenceContainerEClass = createEClass(EVIDENCE_CONTAINER);
		createEAttribute(evidenceContainerEClass, EVIDENCE_CONTAINER__NAME);
		createEReference(evidenceContainerEClass, EVIDENCE_CONTAINER__EVALUATION);
		createEReference(evidenceContainerEClass, EVIDENCE_CONTAINER__ITEM);
		createEAttribute(evidenceContainerEClass, EVIDENCE_CONTAINER__GID);
		createEReference(evidenceContainerEClass, EVIDENCE_CONTAINER__PROPERTY);
		createEAttribute(evidenceContainerEClass, EVIDENCE_CONTAINER__VERSION);
		createEReference(evidenceContainerEClass, EVIDENCE_CONTAINER__ELEMENT);

		endTimeEClass = createEClass(END_TIME);
		createEReference(endTimeEClass, END_TIME__DATETIME);

		assertionEClass = createEClass(ASSERTION);
		createEAttribute(assertionEClass, ASSERTION__FACTTYPE);
		createEReference(assertionEClass, ASSERTION__ROLE);
		createEReference(assertionEClass, ASSERTION__DEFINITION);

		objectEClass = createEClass(OBJECT);
		createEAttribute(objectEClass, OBJECT__CONCEPT);
		createEReference(objectEClass, OBJECT__DEFINITION);

		compositeObjectEClass = createEClass(COMPOSITE_OBJECT);
		createEReference(compositeObjectEClass, COMPOSITE_OBJECT__ELEMENT);

		roleBindingEClass = createEClass(ROLE_BINDING);
		createEAttribute(roleBindingEClass, ROLE_BINDING__ROLE);
		createEReference(roleBindingEClass, ROLE_BINDING__SUBJECT);

		startTimeEClass = createEClass(START_TIME);
		createEReference(startTimeEClass, START_TIME__DATETIME);

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
		createEReference(atTimeEClass, AT_TIME__DATE_TTIME);

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
		createEReference(evidenceRelationEClass, EVIDENCE_RELATION__ASSERTION);
		createEReference(evidenceRelationEClass, EVIDENCE_RELATION__SUBJECT);

		supportEClass = createEClass(SUPPORT);
		createEAttribute(supportEClass, SUPPORT__VALUE);

		conflictsEClass = createEClass(CONFLICTS);
		createEReference(conflictsEClass, CONFLICTS__ASSERTION);
		createEReference(conflictsEClass, CONFLICTS__SUBJECT);

		refutesEClass = createEClass(REFUTES);
		createEReference(refutesEClass, REFUTES__ELEMENT);

		negatesEClass = createEClass(NEGATES);
		createEReference(negatesEClass, NEGATES__ELEMENT);

		unknownObjectEClass = createEClass(UNKNOWN_OBJECT);

		evidenceEvaluationEClass = createEClass(EVIDENCE_EVALUATION);
		createEReference(evidenceEvaluationEClass, EVIDENCE_EVALUATION__ATTRIBUTE);

		resolvesEClass = createEClass(RESOLVES);
		createEReference(resolvesEClass, RESOLVES__ELEMENT);

		stakeholderEClass = createEClass(STAKEHOLDER);

		evidenceRequestEClass = createEClass(EVIDENCE_REQUEST);
		createEReference(evidenceRequestEClass, EVIDENCE_REQUEST__ITEM);

		projectObjectiveEClass = createEClass(PROJECT_OBJECTIVE);

		activityEClass = createEClass(ACTIVITY);

		dependsOnEClass = createEClass(DEPENDS_ON);
		createEReference(dependsOnEClass, DEPENDS_ON__ELEMENT);

		satisfiesEClass = createEClass(SATISFIES);
		createEReference(satisfiesEClass, SATISFIES__ELEMENT);

		projectElementEClass = createEClass(PROJECT_ELEMENT);
		createEAttribute(projectElementEClass, PROJECT_ELEMENT__NAME);
		createEAttribute(projectElementEClass, PROJECT_ELEMENT__CONTENT);
		createEReference(projectElementEClass, PROJECT_ELEMENT__PROPERTY);

		referencedClaimEClass = createEClass(REFERENCED_CLAIM);
		createEReference(referencedClaimEClass, REFERENCED_CLAIM__CLAIM);

		evidenceObservationEClass = createEClass(EVIDENCE_OBSERVATION);

		evidenceResolutionEClass = createEClass(EVIDENCE_RESOLUTION);
		createEReference(evidenceResolutionEClass, EVIDENCE_RESOLUTION__SUBJECT);

		weakensEClass = createEClass(WEAKENS);

		amplifiesEClass = createEClass(AMPLIFIES);

		contributesEClass = createEClass(CONTRIBUTES);
		createEReference(contributesEClass, CONTRIBUTES__SUBJECT);
		createEReference(contributesEClass, CONTRIBUTES__RELATION);

		challengesEClass = createEClass(CHALLENGES);

		strengthEClass = createEClass(STRENGTH);
		createEAttribute(strengthEClass, STRENGTH__VALUE);

		isAcquiredAtEClass = createEClass(IS_ACQUIRED_AT);

		isTransferredToEClass = createEClass(IS_TRANSFERRED_TO);

		documentPropertyEClass = createEClass(DOCUMENT_PROPERTY);

		evidenceEventEClass = createEClass(EVIDENCE_EVENT);

		ownedByEClass = createEClass(OWNED_BY);
		createEReference(ownedByEClass, OWNED_BY__OWNER);

		provenanceEClass = createEClass(PROVENANCE);

		timingPropertyEClass = createEClass(TIMING_PROPERTY);

		isPartOfEClass = createEClass(IS_PART_OF);
		createEReference(isPartOfEClass, IS_PART_OF__WHOLE);

		isRevokedAtEClass = createEClass(IS_REVOKED_AT);

		providesContextEClass = createEClass(PROVIDES_CONTEXT);
		createEReference(providesContextEClass, PROVIDES_CONTEXT__CONTEXT);

		formalObjectEClass = createEClass(FORMAL_OBJECT);
		createEAttribute(formalObjectEClass, FORMAL_OBJECT__NAME);

		meansThatEClass = createEClass(MEANS_THAT);
		createEReference(meansThatEClass, MEANS_THAT__MEANING);

		evidenceElementEClass = createEClass(EVIDENCE_ELEMENT);
		createEReference(evidenceElementEClass, EVIDENCE_ELEMENT__TIMING);
		createEReference(evidenceElementEClass, EVIDENCE_ELEMENT__CUSTODY);
		createEReference(evidenceElementEClass, EVIDENCE_ELEMENT__PROVENANCE);
		createEReference(evidenceElementEClass, EVIDENCE_ELEMENT__EVENT);

		careOfEClass = createEClass(CARE_OF);
		createEReference(careOfEClass, CARE_OF__CUSTODIAN);

		custodyPropertyEClass = createEClass(CUSTODY_PROPERTY);

		atLocationEClass = createEClass(AT_LOCATION);
		createEReference(atLocationEClass, AT_LOCATION__LOCATION);

		isCreatedAtEClass = createEClass(IS_CREATED_AT);

		requiresContainerEClass = createEClass(REQUIRES_CONTAINER);
		createEReference(requiresContainerEClass, REQUIRES_CONTAINER__CONTAINER);

		projectPropertyEClass = createEClass(PROJECT_PROPERTY);

		serviceEClass = createEClass(SERVICE);

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

		hasMediaEClass = createEClass(HAS_MEDIA);
		createEAttribute(hasMediaEClass, HAS_MEDIA__MEDIA);

		exhibitEClass = createEClass(EXHIBIT);
		createEAttribute(exhibitEClass, EXHIBIT__NAME);
		createEAttribute(exhibitEClass, EXHIBIT__URL);
		createEReference(exhibitEClass, EXHIBIT__PROPERTY);

		formalElementEClass = createEClass(FORMAL_ELEMENT);

		exhibitPropertyEClass = createEClass(EXHIBIT_PROPERTY);

		evidenceInterpretationEClass = createEClass(EVIDENCE_INTERPRETATION);
		createEReference(evidenceInterpretationEClass, EVIDENCE_INTERPRETATION__SUBJECT);

		evidenceAssertionEClass = createEClass(EVIDENCE_ASSERTION);

		evidencePropertyEClass = createEClass(EVIDENCE_PROPERTY);

		extendedEvidenceAttributeEClass = createEClass(EXTENDED_EVIDENCE_ATTRIBUTE);

		extendedDocumentPropertyEClass = createEClass(EXTENDED_DOCUMENT_PROPERTY);

		recordEClass = createEClass(RECORD);
		createEAttribute(recordEClass, RECORD__NAME);
		createEAttribute(recordEClass, RECORD__CONTENT);

		objectifiedAssertionEClass = createEClass(OBJECTIFIED_ASSERTION);
		createEReference(objectifiedAssertionEClass, OBJECTIFIED_ASSERTION__ASSERTION);

		isModifiedByEClass = createEClass(IS_MODIFIED_BY);

		performedByEClass = createEClass(PERFORMED_BY);
		createEReference(performedByEClass, PERFORMED_BY__EXECUTOR);

		containerConsistencyEClass = createEClass(CONTAINER_CONSISTENCY);
		createEAttribute(containerConsistencyEClass, CONTAINER_CONSISTENCY__VALUE);

		containerCompletenessEClass = createEClass(CONTAINER_COMPLETENESS);
		createEAttribute(containerCompletenessEClass, CONTAINER_COMPLETENESS__VALUE);

		compliesToEClass = createEClass(COMPLIES_TO);
		createEAttribute(compliesToEClass, COMPLIES_TO__CRITERIA);

		extendedProjectPropertyEClass = createEClass(EXTENDED_PROJECT_PROPERTY);

		// Create enums
		reliabilityLevelEEnum = createEEnum(RELIABILITY_LEVEL);
		completenessLevelEEnum = createEEnum(COMPLETENESS_LEVEL);
		originalityLevelEEnum = createEEnum(ORIGINALITY_LEVEL);
		consistencyLevelEEnum = createEEnum(CONSISTENCY_LEVEL);
		levelEEnum = createEEnum(LEVEL);
		supportLevelEEnum = createEEnum(SUPPORT_LEVEL);
		reportingLevelEEnum = createEEnum(REPORTING_LEVEL);
		confidenceLevelEEnum = createEEnum(CONFIDENCE_LEVEL);
		accuracyLevelEEnum = createEEnum(ACCURACY_LEVEL);
		standardOfProofEEnum = createEEnum(STANDARD_OF_PROOF);
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

		// Obtain other dependent packages
		SACMPackage theSACMPackage = (SACMPackage)EPackage.Registry.INSTANCE.getEPackage(SACMPackage.eNS_URI);
		ArgumentationPackage theArgumentationPackage = (ArgumentationPackage)EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		evidenceAttributeEClass.getESuperTypes().add(this.getEvidenceAssertion());
		consistencyEClass.getESuperTypes().add(this.getDocumentProperty());
		completenessEClass.getESuperTypes().add(this.getDocumentProperty());
		documentEClass.getESuperTypes().add(this.getExhibit());
		confidenceEClass.getESuperTypes().add(this.getEvidenceAttribute());
		approvedByEClass.getESuperTypes().add(this.getProvenance());
		createdByEClass.getESuperTypes().add(this.getProvenance());
		toolEClass.getESuperTypes().add(this.getCollectionMethod());
		methodEClass.getESuperTypes().add(this.getCollectionMethod());
		evidenceItemEClass.getESuperTypes().add(this.getEvidenceElement());
		isBasedOnEClass.getESuperTypes().add(this.getExhibitProperty());
		formalAssertionEClass.getESuperTypes().add(this.getFormalElement());
		isAEClass.getESuperTypes().add(this.getEvidenceInterpretation());
		isCharacterizedByEClass.getESuperTypes().add(this.getEvidenceInterpretation());
		personEClass.getESuperTypes().add(this.getStakeholder());
		organizationEClass.getESuperTypes().add(this.getStakeholder());
		evidenceContainerEClass.getESuperTypes().add(theSACMPackage.getModelElement());
		endTimeEClass.getESuperTypes().add(this.getEffectiveTime());
		assertionEClass.getESuperTypes().add(this.getFormalAssertion());
		objectEClass.getESuperTypes().add(this.getFormalObject());
		compositeObjectEClass.getESuperTypes().add(this.getFormalObject());
		roleBindingEClass.getESuperTypes().add(theSACMPackage.getUtilityElement());
		startTimeEClass.getESuperTypes().add(this.getEffectiveTime());
		relevanceEClass.getESuperTypes().add(this.getEvidenceAttribute());
		significanceEClass.getESuperTypes().add(this.getEvidenceAttribute());
		accuracyEClass.getESuperTypes().add(this.getEvidenceAttribute());
		hasRoleInEClass.getESuperTypes().add(this.getProjectProperty());
		isScopedByEClass.getESuperTypes().add(this.getEvidenceInterpretation());
		effectiveTimeEClass.getESuperTypes().add(this.getTimingProperty());
		atTimeEClass.getESuperTypes().add(this.getTimingProperty());
		originalityEClass.getESuperTypes().add(this.getDocumentProperty());
		reportingEClass.getESuperTypes().add(this.getEvidenceAttribute());
		reliabilityEClass.getESuperTypes().add(this.getDocumentProperty());
		supportsEClass.getESuperTypes().add(this.getEvidenceRelation());
		isGeneratedAtEClass.getESuperTypes().add(this.getEvidenceEvent());
		collectionMethodEClass.getESuperTypes().add(this.getProjectElement());
		evidenceRelationEClass.getESuperTypes().add(this.getEvidenceEvaluation());
		supportEClass.getESuperTypes().add(this.getEvidenceAttribute());
		conflictsEClass.getESuperTypes().add(this.getEvidenceObservation());
		refutesEClass.getESuperTypes().add(this.getEvidenceResolution());
		negatesEClass.getESuperTypes().add(this.getEvidenceResolution());
		unknownObjectEClass.getESuperTypes().add(this.getFormalObject());
		evidenceEvaluationEClass.getESuperTypes().add(this.getEvidenceAssertion());
		resolvesEClass.getESuperTypes().add(this.getEvidenceResolution());
		stakeholderEClass.getESuperTypes().add(this.getProjectElement());
		evidenceRequestEClass.getESuperTypes().add(this.getProjectElement());
		projectObjectiveEClass.getESuperTypes().add(this.getProjectElement());
		activityEClass.getESuperTypes().add(this.getProjectElement());
		dependsOnEClass.getESuperTypes().add(this.getProjectProperty());
		satisfiesEClass.getESuperTypes().add(this.getProjectProperty());
		projectElementEClass.getESuperTypes().add(this.getEvidenceElement());
		referencedClaimEClass.getESuperTypes().add(this.getFormalAssertion());
		evidenceObservationEClass.getESuperTypes().add(this.getEvidenceEvaluation());
		evidenceResolutionEClass.getESuperTypes().add(this.getEvidenceEvaluation());
		weakensEClass.getESuperTypes().add(this.getContributes());
		amplifiesEClass.getESuperTypes().add(this.getContributes());
		contributesEClass.getESuperTypes().add(this.getEvidenceObservation());
		challengesEClass.getESuperTypes().add(this.getEvidenceRelation());
		strengthEClass.getESuperTypes().add(this.getEvidenceAttribute());
		isAcquiredAtEClass.getESuperTypes().add(this.getEvidenceEvent());
		isTransferredToEClass.getESuperTypes().add(this.getEvidenceEvent());
		documentPropertyEClass.getESuperTypes().add(this.getExhibitProperty());
		evidenceEventEClass.getESuperTypes().add(this.getEvidenceProperty());
		ownedByEClass.getESuperTypes().add(this.getProvenance());
		provenanceEClass.getESuperTypes().add(this.getEvidenceProperty());
		timingPropertyEClass.getESuperTypes().add(this.getEvidenceProperty());
		isPartOfEClass.getESuperTypes().add(this.getExhibitProperty());
		isRevokedAtEClass.getESuperTypes().add(this.getEvidenceEvent());
		providesContextEClass.getESuperTypes().add(this.getEvidenceInterpretation());
		formalObjectEClass.getESuperTypes().add(this.getFormalElement());
		meansThatEClass.getESuperTypes().add(this.getEvidenceInterpretation());
		evidenceElementEClass.getESuperTypes().add(theSACMPackage.getModelElement());
		careOfEClass.getESuperTypes().add(this.getCustodyProperty());
		custodyPropertyEClass.getESuperTypes().add(this.getEvidenceProperty());
		atLocationEClass.getESuperTypes().add(this.getCustodyProperty());
		isCreatedAtEClass.getESuperTypes().add(this.getEvidenceEvent());
		requiresContainerEClass.getESuperTypes().add(this.getProjectProperty());
		projectPropertyEClass.getESuperTypes().add(this.getEvidenceProperty());
		serviceEClass.getESuperTypes().add(this.getCollectionMethod());
		hasElectronicSourceEClass.getESuperTypes().add(this.getExhibitProperty());
		isExpressedInLanguageEClass.getESuperTypes().add(this.getDocumentProperty());
		usingProcessEClass.getESuperTypes().add(this.getCustodyProperty());
		hasSecurityClassificationEClass.getESuperTypes().add(this.getDocumentProperty());
		isReleaseableToEClass.getESuperTypes().add(this.getDocumentProperty());
		evidenceGroupEClass.getESuperTypes().add(this.getEvidenceItem());
		hasVersionEClass.getESuperTypes().add(this.getDocumentProperty());
		hasMediaEClass.getESuperTypes().add(this.getExhibitProperty());
		exhibitEClass.getESuperTypes().add(this.getEvidenceItem());
		formalElementEClass.getESuperTypes().add(this.getEvidenceItem());
		exhibitPropertyEClass.getESuperTypes().add(this.getEvidenceProperty());
		evidenceInterpretationEClass.getESuperTypes().add(this.getEvidenceEvaluation());
		evidenceAssertionEClass.getESuperTypes().add(this.getEvidenceElement());
		evidencePropertyEClass.getESuperTypes().add(this.getEvidenceAssertion());
		extendedEvidenceAttributeEClass.getESuperTypes().add(this.getEvidenceAttribute());
		extendedDocumentPropertyEClass.getESuperTypes().add(this.getDocumentProperty());
		recordEClass.getESuperTypes().add(this.getEvidenceItem());
		objectifiedAssertionEClass.getESuperTypes().add(this.getFormalObject());
		isModifiedByEClass.getESuperTypes().add(this.getEvidenceEvent());
		performedByEClass.getESuperTypes().add(this.getProvenance());
		containerConsistencyEClass.getESuperTypes().add(this.getProjectProperty());
		containerCompletenessEClass.getESuperTypes().add(this.getProjectProperty());
		compliesToEClass.getESuperTypes().add(this.getProjectProperty());
		extendedProjectPropertyEClass.getESuperTypes().add(this.getProjectProperty());

		// Initialize classes and features; add operations and parameters
		initEClass(evidenceAttributeEClass, EvidenceAttribute.class, "EvidenceAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(consistencyEClass, Consistency.class, "Consistency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getConsistency_Value(), this.getConsistencyLevel(), "value", null, 1, 1, Consistency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(completenessEClass, Completeness.class, "Completeness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCompleteness_Status(), this.getCompletenessLevel(), "status", null, 1, 1, Completeness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDocument_Title(), theSACMPackage.getString(), "title", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDocument_Citation(), theSACMPackage.getString(), "citation", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(confidenceEClass, Confidence.class, "Confidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getConfidence_Value(), this.getConfidenceLevel(), "value", null, 1, 1, Confidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(approvedByEClass, ApprovedBy.class, "ApprovedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getApprovedBy_Supervisor(), this.getStakeholder(), null, "supervisor", null, 1, 1, ApprovedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(createdByEClass, CreatedBy.class, "CreatedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCreatedBy_Source(), this.getStakeholder(), null, "source", null, 1, 1, CreatedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(toolEClass, Tool.class, "Tool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTool_Version(), theSACMPackage.getString(), "version", null, 1, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(evidenceItemEClass, EvidenceItem.class, "EvidenceItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(isBasedOnEClass, IsBasedOn.class, "IsBasedOn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIsBasedOn_Source(), this.getEvidenceItem(), null, "source", null, 1, 1, IsBasedOn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(formalAssertionEClass, FormalAssertion.class, "FormalAssertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFormalAssertion_Content(), theSACMPackage.getString(), "content", null, 1, 1, FormalAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(isAEClass, IsA.class, "IsA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIsA_Definition(), this.getFormalElement(), null, "definition", null, 1, 1, IsA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(isCharacterizedByEClass, IsCharacterizedBy.class, "IsCharacterizedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIsCharacterizedBy_Assertion(), this.getFormalAssertion(), null, "assertion", null, 1, 1, IsCharacterizedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOrganization_Address(), theSACMPackage.getString(), "address", null, 1, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(evidenceContainerEClass, EvidenceContainer.class, "EvidenceContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEvidenceContainer_Name(), theSACMPackage.getString(), "name", null, 1, 1, EvidenceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvidenceContainer_Evaluation(), this.getEvidenceEvaluation(), null, "evaluation", null, 0, -1, EvidenceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvidenceContainer_Item(), this.getEvidenceItem(), null, "item", null, 0, -1, EvidenceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEvidenceContainer_Gid(), theSACMPackage.getString(), "gid", null, 1, 1, EvidenceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvidenceContainer_Property(), this.getProjectProperty(), null, "property", null, 0, -1, EvidenceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEvidenceContainer_Version(), theSACMPackage.getString(), "version", null, 1, 1, EvidenceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvidenceContainer_Element(), this.getProjectElement(), null, "element", null, 0, -1, EvidenceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(endTimeEClass, EndTime.class, "EndTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEndTime_Datetime(), theSACMPackage.getDatetime(), null, "datetime", null, 1, 1, EndTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(assertionEClass, Assertion.class, "Assertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAssertion_Facttype(), theSACMPackage.getString(), "facttype", null, 1, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAssertion_Role(), this.getRoleBinding(), null, "role", null, 0, -1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAssertion_Definition(), ecorePackage.getEObject(), null, "definition", null, 1, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(objectEClass, net.certware.sacm.SACM.Evidence.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getObject_Concept(), theSACMPackage.getString(), "concept", null, 1, 1, net.certware.sacm.SACM.Evidence.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getObject_Definition(), ecorePackage.getEObject(), null, "definition", null, 1, 1, net.certware.sacm.SACM.Evidence.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(compositeObjectEClass, CompositeObject.class, "CompositeObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCompositeObject_Element(), this.getFormalObject(), null, "element", null, 0, -1, CompositeObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(roleBindingEClass, RoleBinding.class, "RoleBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRoleBinding_Role(), theSACMPackage.getString(), "role", null, 1, 1, RoleBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRoleBinding_Subject(), this.getFormalObject(), null, "subject", null, 0, 1, RoleBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(startTimeEClass, StartTime.class, "StartTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStartTime_Datetime(), theSACMPackage.getDatetime(), null, "datetime", null, 1, 1, StartTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(relevanceEClass, Relevance.class, "Relevance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRelevance_Value(), this.getLevel(), "value", null, 1, 1, Relevance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(significanceEClass, Significance.class, "Significance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSignificance_Value(), this.getLevel(), "value", null, 1, 1, Significance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(accuracyEClass, Accuracy.class, "Accuracy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAccuracy_Value(), this.getAccuracyLevel(), "value", null, 1, 1, Accuracy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(hasRoleInEClass, HasRoleIn.class, "HasRoleIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getHasRoleIn_Role(), theSACMPackage.getString(), "role", null, 1, 1, HasRoleIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getHasRoleIn_Organization(), this.getOrganization(), null, "organization", null, 1, 1, HasRoleIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(isScopedByEClass, IsScopedBy.class, "IsScopedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIsScopedBy_Scope(), this.getFormalElement(), null, "scope", null, 1, 1, IsScopedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(effectiveTimeEClass, EffectiveTime.class, "EffectiveTime", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(atTimeEClass, AtTime.class, "AtTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAtTime_DateTtime(), theSACMPackage.getDatetime(), null, "dateTtime", null, 1, 1, AtTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(originalityEClass, Originality.class, "Originality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOriginality_Value(), this.getOriginalityLevel(), "value", null, 1, 1, Originality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(reportingEClass, Reporting.class, "Reporting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getReporting_Value(), this.getReportingLevel(), "value", null, 1, 1, Reporting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(reliabilityEClass, Reliability.class, "Reliability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getReliability_Value(), this.getReliabilityLevel(), "value", null, 1, 1, Reliability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(supportsEClass, Supports.class, "Supports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(isGeneratedAtEClass, IsGeneratedAt.class, "IsGeneratedAt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(collectionMethodEClass, CollectionMethod.class, "CollectionMethod", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(evidenceRelationEClass, EvidenceRelation.class, "EvidenceRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEvidenceRelation_Assertion(), this.getFormalAssertion(), null, "assertion", null, 1, 1, EvidenceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvidenceRelation_Subject(), this.getEvidenceItem(), null, "subject", null, 1, 1, EvidenceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(supportEClass, Support.class, "Support", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSupport_Value(), this.getSupportLevel(), "value", null, 1, 1, Support.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(conflictsEClass, Conflicts.class, "Conflicts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConflicts_Assertion(), this.getFormalAssertion(), null, "assertion", null, 1, 1, Conflicts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConflicts_Subject(), this.getFormalAssertion(), null, "subject", null, 1, 1, Conflicts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(refutesEClass, Refutes.class, "Refutes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRefutes_Element(), this.getFormalAssertion(), null, "element", null, 1, 1, Refutes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(negatesEClass, Negates.class, "Negates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNegates_Element(), this.getEvidenceRelation(), null, "element", null, 1, 1, Negates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(unknownObjectEClass, UnknownObject.class, "UnknownObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(evidenceEvaluationEClass, EvidenceEvaluation.class, "EvidenceEvaluation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEvidenceEvaluation_Attribute(), this.getEvidenceAttribute(), null, "attribute", null, 0, -1, EvidenceEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(resolvesEClass, Resolves.class, "Resolves", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getResolves_Element(), this.getEvidenceObservation(), null, "element", null, 1, 1, Resolves.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(stakeholderEClass, Stakeholder.class, "Stakeholder", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(evidenceRequestEClass, EvidenceRequest.class, "EvidenceRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEvidenceRequest_Item(), this.getEvidenceItem(), null, "item", null, 0, -1, EvidenceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(projectObjectiveEClass, ProjectObjective.class, "ProjectObjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(dependsOnEClass, DependsOn.class, "DependsOn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDependsOn_Element(), this.getProjectElement(), null, "element", null, 1, 1, DependsOn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(satisfiesEClass, Satisfies.class, "Satisfies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSatisfies_Element(), this.getProjectElement(), null, "element", null, 1, 1, Satisfies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(projectElementEClass, ProjectElement.class, "ProjectElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getProjectElement_Name(), theSACMPackage.getString(), "name", null, 1, 1, ProjectElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProjectElement_Content(), theSACMPackage.getString(), "content", null, 1, 1, ProjectElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getProjectElement_Property(), this.getProjectProperty(), null, "property", null, 0, -1, ProjectElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(referencedClaimEClass, ReferencedClaim.class, "ReferencedClaim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getReferencedClaim_Claim(), theArgumentationPackage.getClaim(), null, "claim", null, 0, 1, ReferencedClaim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(evidenceObservationEClass, EvidenceObservation.class, "EvidenceObservation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(evidenceResolutionEClass, EvidenceResolution.class, "EvidenceResolution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEvidenceResolution_Subject(), this.getEvidenceElement(), null, "subject", null, 1, 1, EvidenceResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(weakensEClass, Weakens.class, "Weakens", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(amplifiesEClass, Amplifies.class, "Amplifies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(contributesEClass, Contributes.class, "Contributes", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getContributes_Subject(), this.getEvidenceRelation(), null, "subject", null, 1, 1, Contributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getContributes_Relation(), this.getEvidenceRelation(), null, "relation", null, 1, 1, Contributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(challengesEClass, Challenges.class, "Challenges", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(strengthEClass, Strength.class, "Strength", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStrength_Value(), theSACMPackage.getInteger(), "value", null, 1, 1, Strength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(isAcquiredAtEClass, IsAcquiredAt.class, "IsAcquiredAt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(isTransferredToEClass, IsTransferredTo.class, "IsTransferredTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(documentPropertyEClass, DocumentProperty.class, "DocumentProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(evidenceEventEClass, EvidenceEvent.class, "EvidenceEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ownedByEClass, OwnedBy.class, "OwnedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOwnedBy_Owner(), this.getStakeholder(), null, "owner", null, 1, 1, OwnedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(provenanceEClass, Provenance.class, "Provenance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(timingPropertyEClass, TimingProperty.class, "TimingProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(isPartOfEClass, IsPartOf.class, "IsPartOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIsPartOf_Whole(), this.getExhibit(), null, "whole", null, 1, 1, IsPartOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(isRevokedAtEClass, IsRevokedAt.class, "IsRevokedAt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(providesContextEClass, ProvidesContext.class, "ProvidesContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getProvidesContext_Context(), this.getEvidenceElement(), null, "context", null, 1, 1, ProvidesContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(formalObjectEClass, FormalObject.class, "FormalObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFormalObject_Name(), theSACMPackage.getString(), "name", null, 1, 1, FormalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(meansThatEClass, MeansThat.class, "MeansThat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMeansThat_Meaning(), this.getFormalAssertion(), null, "meaning", null, 1, 1, MeansThat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(evidenceElementEClass, EvidenceElement.class, "EvidenceElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEvidenceElement_Timing(), this.getTimingProperty(), null, "timing", null, 0, -1, EvidenceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvidenceElement_Custody(), this.getCustodyProperty(), null, "custody", null, 0, -1, EvidenceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvidenceElement_Provenance(), this.getProvenance(), null, "provenance", null, 0, -1, EvidenceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvidenceElement_Event(), this.getEvidenceEvent(), null, "event", null, 0, -1, EvidenceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(careOfEClass, CareOf.class, "CareOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCareOf_Custodian(), this.getPerson(), null, "custodian", null, 1, 1, CareOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(custodyPropertyEClass, CustodyProperty.class, "CustodyProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(atLocationEClass, AtLocation.class, "AtLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAtLocation_Location(), this.getOrganization(), null, "location", null, 1, 1, AtLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(isCreatedAtEClass, IsCreatedAt.class, "IsCreatedAt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(requiresContainerEClass, RequiresContainer.class, "RequiresContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRequiresContainer_Container(), this.getEvidenceContainer(), null, "container", null, 1, 1, RequiresContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(projectPropertyEClass, ProjectProperty.class, "ProjectProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(hasElectronicSourceEClass, HasElectronicSource.class, "HasElectronicSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getHasElectronicSource_Source(), theSACMPackage.getString(), "source", null, 1, 1, HasElectronicSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getHasElectronicSource_Format(), theSACMPackage.getString(), "format", null, 1, 1, HasElectronicSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getHasElectronicSource_FileSize(), theSACMPackage.getInteger(), "fileSize", null, 1, 1, HasElectronicSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(isExpressedInLanguageEClass, IsExpressedInLanguage.class, "IsExpressedInLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIsExpressedInLanguage_Language(), theSACMPackage.getString(), "language", null, 1, 1, IsExpressedInLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getIsExpressedInLanguage_IsPrimary(), theSACMPackage.getBoolean(), "IsPrimary", null, 1, 1, IsExpressedInLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(usingProcessEClass, UsingProcess.class, "UsingProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getUsingProcess_Method(), this.getCollectionMethod(), null, "method", null, 1, 1, UsingProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(hasSecurityClassificationEClass, HasSecurityClassification.class, "HasSecurityClassification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getHasSecurityClassification_SecurityClassification(), theSACMPackage.getString(), "securityClassification", null, 1, 1, HasSecurityClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(isReleaseableToEClass, IsReleaseableTo.class, "IsReleaseableTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIsReleaseableTo_Releasability(), theSACMPackage.getString(), "releasability", null, 1, 1, IsReleaseableTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(evidenceGroupEClass, EvidenceGroup.class, "EvidenceGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEvidenceGroup_Name(), theSACMPackage.getString(), "name", null, 1, 1, EvidenceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvidenceGroup_Element(), this.getEvidenceElement(), null, "element", null, 0, -1, EvidenceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(hasVersionEClass, HasVersion.class, "HasVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getHasVersion_Version(), theSACMPackage.getString(), "version", null, 1, 1, HasVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(hasMediaEClass, HasMedia.class, "HasMedia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getHasMedia_Media(), theSACMPackage.getString(), "media", null, 1, 1, HasMedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(exhibitEClass, Exhibit.class, "Exhibit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getExhibit_Name(), theSACMPackage.getString(), "name", null, 1, 1, Exhibit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExhibit_Url(), theSACMPackage.getString(), "url", null, 1, 1, Exhibit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getExhibit_Property(), this.getExhibitProperty(), null, "property", null, 0, -1, Exhibit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(formalElementEClass, FormalElement.class, "FormalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(exhibitPropertyEClass, ExhibitProperty.class, "ExhibitProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(evidenceInterpretationEClass, EvidenceInterpretation.class, "EvidenceInterpretation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEvidenceInterpretation_Subject(), this.getEvidenceElement(), null, "subject", null, 1, 1, EvidenceInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(evidenceAssertionEClass, EvidenceAssertion.class, "EvidenceAssertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(evidencePropertyEClass, EvidenceProperty.class, "EvidenceProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(extendedEvidenceAttributeEClass, ExtendedEvidenceAttribute.class, "ExtendedEvidenceAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(extendedDocumentPropertyEClass, ExtendedDocumentProperty.class, "ExtendedDocumentProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(recordEClass, Record.class, "Record", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRecord_Name(), theSACMPackage.getString(), "name", null, 1, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRecord_Content(), theSACMPackage.getString(), "content", null, 1, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(objectifiedAssertionEClass, ObjectifiedAssertion.class, "ObjectifiedAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getObjectifiedAssertion_Assertion(), this.getFormalAssertion(), null, "assertion", null, 1, 1, ObjectifiedAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(isModifiedByEClass, IsModifiedBy.class, "IsModifiedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(performedByEClass, PerformedBy.class, "PerformedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPerformedBy_Executor(), this.getStakeholder(), null, "executor", null, 1, 1, PerformedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(containerConsistencyEClass, ContainerConsistency.class, "ContainerConsistency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getContainerConsistency_Value(), this.getConsistencyLevel(), "value", null, 1, 1, ContainerConsistency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(containerCompletenessEClass, ContainerCompleteness.class, "ContainerCompleteness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getContainerCompleteness_Value(), this.getCompletenessLevel(), "value", null, 1, 1, ContainerCompleteness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(compliesToEClass, CompliesTo.class, "CompliesTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCompliesTo_Criteria(), this.getStandardOfProof(), "criteria", null, 1, 1, CompliesTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(extendedProjectPropertyEClass, ExtendedProjectProperty.class, "ExtendedProjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(reliabilityLevelEEnum, ReliabilityLevel.class, "ReliabilityLevel"); //$NON-NLS-1$
		addEEnumLiteral(reliabilityLevelEEnum, ReliabilityLevel.UNKNOWN);
		addEEnumLiteral(reliabilityLevelEEnum, ReliabilityLevel.UN_RELIABLE);
		addEEnumLiteral(reliabilityLevelEEnum, ReliabilityLevel.NOT_USUALLY_RELIABLE);
		addEEnumLiteral(reliabilityLevelEEnum, ReliabilityLevel.USUALLY_RELIABLE);
		addEEnumLiteral(reliabilityLevelEEnum, ReliabilityLevel.FAIRLY_RELIABLE);
		addEEnumLiteral(reliabilityLevelEEnum, ReliabilityLevel.COMPLETELY_RELIABLE);

		initEEnum(completenessLevelEEnum, CompletenessLevel.class, "CompletenessLevel"); //$NON-NLS-1$
		addEEnumLiteral(completenessLevelEEnum, CompletenessLevel.UNKNOWN);
		addEEnumLiteral(completenessLevelEEnum, CompletenessLevel.INCOMPLETE);
		addEEnumLiteral(completenessLevelEEnum, CompletenessLevel.DRAFT);
		addEEnumLiteral(completenessLevelEEnum, CompletenessLevel.FINAL);
		addEEnumLiteral(completenessLevelEEnum, CompletenessLevel.OBSOLETE);

		initEEnum(originalityLevelEEnum, OriginalityLevel.class, "OriginalityLevel"); //$NON-NLS-1$
		addEEnumLiteral(originalityLevelEEnum, OriginalityLevel.UNKNOWN);
		addEEnumLiteral(originalityLevelEEnum, OriginalityLevel.DERIVATIVE);
		addEEnumLiteral(originalityLevelEEnum, OriginalityLevel.ORIGINAL);

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

		initEEnum(supportLevelEEnum, SupportLevel.class, "SupportLevel"); //$NON-NLS-1$
		addEEnumLiteral(supportLevelEEnum, SupportLevel.UNKNOWN);
		addEEnumLiteral(supportLevelEEnum, SupportLevel.INDIRECT);
		addEEnumLiteral(supportLevelEEnum, SupportLevel.DIRECT);

		initEEnum(reportingLevelEEnum, ReportingLevel.class, "ReportingLevel"); //$NON-NLS-1$
		addEEnumLiteral(reportingLevelEEnum, ReportingLevel.UNKNOWN);
		addEEnumLiteral(reportingLevelEEnum, ReportingLevel.SECONDARY);
		addEEnumLiteral(reportingLevelEEnum, ReportingLevel.PRIMARY);

		initEEnum(confidenceLevelEEnum, ConfidenceLevel.class, "ConfidenceLevel"); //$NON-NLS-1$
		addEEnumLiteral(confidenceLevelEEnum, ConfidenceLevel.UNKNOWN);
		addEEnumLiteral(confidenceLevelEEnum, ConfidenceLevel.REPORTED_AS_UNCERTAIN);
		addEEnumLiteral(confidenceLevelEEnum, ConfidenceLevel.REPORTED_AS_PLAUSIBLE);
		addEEnumLiteral(confidenceLevelEEnum, ConfidenceLevel.REPORTED_AS_FACT);

		initEEnum(accuracyLevelEEnum, AccuracyLevel.class, "AccuracyLevel"); //$NON-NLS-1$
		addEEnumLiteral(accuracyLevelEEnum, AccuracyLevel.UNKNOWN);
		addEEnumLiteral(accuracyLevelEEnum, AccuracyLevel.IMPROBABLE);
		addEEnumLiteral(accuracyLevelEEnum, AccuracyLevel.DOUBTFUL);
		addEEnumLiteral(accuracyLevelEEnum, AccuracyLevel.POSSIBLE);
		addEEnumLiteral(accuracyLevelEEnum, AccuracyLevel.PROBABLE);
		addEEnumLiteral(accuracyLevelEEnum, AccuracyLevel.CONFIRMED);

		initEEnum(standardOfProofEEnum, StandardOfProof.class, "StandardOfProof"); //$NON-NLS-1$
		addEEnumLiteral(standardOfProofEEnum, StandardOfProof.UNKNOWN);
		addEEnumLiteral(standardOfProofEEnum, StandardOfProof.OTHER);
		addEEnumLiteral(standardOfProofEEnum, StandardOfProof.POE);
		addEEnumLiteral(standardOfProofEEnum, StandardOfProof.RCE);
		addEEnumLiteral(standardOfProofEEnum, StandardOfProof.CCE);
		addEEnumLiteral(standardOfProofEEnum, StandardOfProof.BRD);

		// Create annotations
		// null
		createNullAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence") //$NON-NLS-1$
		   });		
		addAnnotation
		  (evidenceAttributeEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/EvidenceAttribute") //$NON-NLS-1$
		   });		
		addAnnotation
		  (consistencyEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Consistency") //$NON-NLS-1$
		   });		
		addAnnotation
		  (completenessEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Completeness") //$NON-NLS-1$
		   });		
		addAnnotation
		  (documentEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Document") //$NON-NLS-1$
		   });		
		addAnnotation
		  (confidenceEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Confidence") //$NON-NLS-1$
		   });		
		addAnnotation
		  (approvedByEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/ApprovedBy") //$NON-NLS-1$
		   });		
		addAnnotation
		  (createdByEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/CreatedBy") //$NON-NLS-1$
		   });		
		addAnnotation
		  (toolEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Tool") //$NON-NLS-1$
		   });		
		addAnnotation
		  (methodEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Method") //$NON-NLS-1$
		   });		
		addAnnotation
		  (evidenceItemEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/EvidenceItem") //$NON-NLS-1$
		   });		
		addAnnotation
		  (isBasedOnEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/IsBasedOn") //$NON-NLS-1$
		   });		
		addAnnotation
		  (formalAssertionEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/FormalAssertion") //$NON-NLS-1$
		   });		
		addAnnotation
		  (isAEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/IsA") //$NON-NLS-1$
		   });		
		addAnnotation
		  (isCharacterizedByEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/IsCharacterizedBy") //$NON-NLS-1$
		   });		
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Person") //$NON-NLS-1$
		   });		
		addAnnotation
		  (organizationEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Organization") //$NON-NLS-1$
		   });		
		addAnnotation
		  (evidenceContainerEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/EvidenceContainer") //$NON-NLS-1$
		   });		
		addAnnotation
		  (endTimeEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/EndTime") //$NON-NLS-1$
		   });		
		addAnnotation
		  (assertionEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Assertion") //$NON-NLS-1$
		   });		
		addAnnotation
		  (objectEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Object") //$NON-NLS-1$
		   });		
		addAnnotation
		  (compositeObjectEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/CompositeObject") //$NON-NLS-1$
		   });		
		addAnnotation
		  (roleBindingEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/RoleBinding") //$NON-NLS-1$
		   });		
		addAnnotation
		  (startTimeEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/StartTime") //$NON-NLS-1$
		   });		
		addAnnotation
		  (relevanceEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Relevance") //$NON-NLS-1$
		   });		
		addAnnotation
		  (significanceEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Significance") //$NON-NLS-1$
		   });		
		addAnnotation
		  (accuracyEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Accuracy") //$NON-NLS-1$
		   });		
		addAnnotation
		  (hasRoleInEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/HasRoleIn") //$NON-NLS-1$
		   });		
		addAnnotation
		  (isScopedByEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/IsScopedBy") //$NON-NLS-1$
		   });		
		addAnnotation
		  (effectiveTimeEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/EffectiveTime") //$NON-NLS-1$
		   });		
		addAnnotation
		  (atTimeEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/AtTime") //$NON-NLS-1$
		   });		
		addAnnotation
		  (originalityEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Originality") //$NON-NLS-1$
		   });		
		addAnnotation
		  (reportingEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Reporting") //$NON-NLS-1$
		   });		
		addAnnotation
		  (reliabilityEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Reliability") //$NON-NLS-1$
		   });		
		addAnnotation
		  (supportsEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Supports") //$NON-NLS-1$
		   });		
		addAnnotation
		  (isGeneratedAtEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/IsGeneratedAt") //$NON-NLS-1$
		   });		
		addAnnotation
		  (collectionMethodEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/CollectionMethod") //$NON-NLS-1$
		   });		
		addAnnotation
		  (evidenceRelationEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/EvidenceRelation") //$NON-NLS-1$
		   });		
		addAnnotation
		  (supportEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Support") //$NON-NLS-1$
		   });		
		addAnnotation
		  (conflictsEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Conflicts") //$NON-NLS-1$
		   });		
		addAnnotation
		  (refutesEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Refutes") //$NON-NLS-1$
		   });		
		addAnnotation
		  (negatesEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Negates") //$NON-NLS-1$
		   });		
		addAnnotation
		  (unknownObjectEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/UnknownObject") //$NON-NLS-1$
		   });		
		addAnnotation
		  (evidenceEvaluationEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/EvidenceEvaluation") //$NON-NLS-1$
		   });		
		addAnnotation
		  (resolvesEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Resolves") //$NON-NLS-1$
		   });		
		addAnnotation
		  (stakeholderEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Stakeholder") //$NON-NLS-1$
		   });		
		addAnnotation
		  (evidenceRequestEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/EvidenceRequest") //$NON-NLS-1$
		   });		
		addAnnotation
		  (projectObjectiveEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/ProjectObjective") //$NON-NLS-1$
		   });		
		addAnnotation
		  (activityEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Activity") //$NON-NLS-1$
		   });		
		addAnnotation
		  (dependsOnEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/DependsOn") //$NON-NLS-1$
		   });		
		addAnnotation
		  (satisfiesEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Satisfies") //$NON-NLS-1$
		   });		
		addAnnotation
		  (projectElementEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/ProjectElement") //$NON-NLS-1$
		   });		
		addAnnotation
		  (referencedClaimEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/ReferencedClaim") //$NON-NLS-1$
		   });		
		addAnnotation
		  (evidenceObservationEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/EvidenceObservation") //$NON-NLS-1$
		   });		
		addAnnotation
		  (evidenceResolutionEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/EvidenceResolution") //$NON-NLS-1$
		   });		
		addAnnotation
		  (weakensEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Weakens") //$NON-NLS-1$
		   });		
		addAnnotation
		  (amplifiesEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Amplifies") //$NON-NLS-1$
		   });		
		addAnnotation
		  (contributesEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Contributes") //$NON-NLS-1$
		   });		
		addAnnotation
		  (challengesEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Challenges") //$NON-NLS-1$
		   });		
		addAnnotation
		  (strengthEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Strength") //$NON-NLS-1$
		   });		
		addAnnotation
		  (isAcquiredAtEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/IsAcquiredAt") //$NON-NLS-1$
		   });		
		addAnnotation
		  (isTransferredToEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/IsTransferredTo") //$NON-NLS-1$
		   });		
		addAnnotation
		  (documentPropertyEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/DocumentProperty") //$NON-NLS-1$
		   });		
		addAnnotation
		  (evidenceEventEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/EvidenceEvent") //$NON-NLS-1$
		   });		
		addAnnotation
		  (ownedByEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/OwnedBy") //$NON-NLS-1$
		   });		
		addAnnotation
		  (provenanceEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Provenance") //$NON-NLS-1$
		   });		
		addAnnotation
		  (timingPropertyEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/TimingProperty") //$NON-NLS-1$
		   });		
		addAnnotation
		  (isPartOfEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/IsPartOf") //$NON-NLS-1$
		   });		
		addAnnotation
		  (isRevokedAtEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/IsRevokedAt") //$NON-NLS-1$
		   });		
		addAnnotation
		  (providesContextEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/ProvidesContext") //$NON-NLS-1$
		   });		
		addAnnotation
		  (formalObjectEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/FormalObject") //$NON-NLS-1$
		   });		
		addAnnotation
		  (meansThatEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/MeansThat") //$NON-NLS-1$
		   });		
		addAnnotation
		  (evidenceElementEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/EvidenceElement") //$NON-NLS-1$
		   });		
		addAnnotation
		  (careOfEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/CareOf") //$NON-NLS-1$
		   });		
		addAnnotation
		  (custodyPropertyEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/CustodyProperty") //$NON-NLS-1$
		   });		
		addAnnotation
		  (atLocationEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/AtLocation") //$NON-NLS-1$
		   });		
		addAnnotation
		  (isCreatedAtEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/IsCreatedAt") //$NON-NLS-1$
		   });		
		addAnnotation
		  (requiresContainerEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/RequiresContainer") //$NON-NLS-1$
		   });		
		addAnnotation
		  (projectPropertyEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/ProjectProperty") //$NON-NLS-1$
		   });		
		addAnnotation
		  (serviceEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Service") //$NON-NLS-1$
		   });		
		addAnnotation
		  (hasElectronicSourceEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/HasElectronicSource") //$NON-NLS-1$
		   });		
		addAnnotation
		  (isExpressedInLanguageEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/IsExpressedInLanguage") //$NON-NLS-1$
		   });		
		addAnnotation
		  (usingProcessEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/UsingProcess") //$NON-NLS-1$
		   });		
		addAnnotation
		  (hasSecurityClassificationEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/HasSecurityClassification") //$NON-NLS-1$
		   });		
		addAnnotation
		  (isReleaseableToEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/IsReleaseableTo") //$NON-NLS-1$
		   });		
		addAnnotation
		  (evidenceGroupEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/EvidenceGroup") //$NON-NLS-1$
		   });		
		addAnnotation
		  (hasVersionEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/HasVersion") //$NON-NLS-1$
		   });		
		addAnnotation
		  (hasMediaEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/HasMedia") //$NON-NLS-1$
		   });		
		addAnnotation
		  (exhibitEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Exhibit") //$NON-NLS-1$
		   });		
		addAnnotation
		  (formalElementEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/FormalElement") //$NON-NLS-1$
		   });		
		addAnnotation
		  (exhibitPropertyEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/ExhibitProperty") //$NON-NLS-1$
		   });		
		addAnnotation
		  (evidenceInterpretationEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/EvidenceInterpretation") //$NON-NLS-1$
		   });		
		addAnnotation
		  (reliabilityLevelEEnum, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/ReliabilityLevel") //$NON-NLS-1$
		   });		
		addAnnotation
		  (completenessLevelEEnum, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/CompletenessLevel") //$NON-NLS-1$
		   });		
		addAnnotation
		  (originalityLevelEEnum, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/OriginalityLevel") //$NON-NLS-1$
		   });		
		addAnnotation
		  (consistencyLevelEEnum, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/ConsistencyLevel") //$NON-NLS-1$
		   });		
		addAnnotation
		  (levelEEnum, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/Level") //$NON-NLS-1$
		   });		
		addAnnotation
		  (supportLevelEEnum, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/SupportLevel") //$NON-NLS-1$
		   });		
		addAnnotation
		  (reportingLevelEEnum, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/ReportingLevel") //$NON-NLS-1$
		   });		
		addAnnotation
		  (confidenceLevelEEnum, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/ConfidenceLevel") //$NON-NLS-1$
		   });		
		addAnnotation
		  (accuracyLevelEEnum, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/AccuracyLevel") //$NON-NLS-1$
		   });		
		addAnnotation
		  (standardOfProofEEnum, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(SACMPackage.eNS_URI).appendFragment("//Evidence/StandardOfProof") //$NON-NLS-1$
		   });
	}

} //EvidencePackageImpl
