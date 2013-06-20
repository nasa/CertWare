/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.util;

import net.certware.sacm.SACM.Evidence.Accuracy;
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
import net.certware.sacm.SACM.Evidence.CompliesTo;
import net.certware.sacm.SACM.Evidence.CompositeObject;
import net.certware.sacm.SACM.Evidence.Confidence;
import net.certware.sacm.SACM.Evidence.Conflicts;
import net.certware.sacm.SACM.Evidence.Consistency;
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
import net.certware.sacm.SACM.Evidence.MeansThat;
import net.certware.sacm.SACM.Evidence.Method;
import net.certware.sacm.SACM.Evidence.Negates;
import net.certware.sacm.SACM.Evidence.ObjectifiedAssertion;
import net.certware.sacm.SACM.Evidence.Organization;
import net.certware.sacm.SACM.Evidence.Originality;
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
import net.certware.sacm.SACM.Evidence.Reporting;
import net.certware.sacm.SACM.Evidence.RequiresContainer;
import net.certware.sacm.SACM.Evidence.Resolves;
import net.certware.sacm.SACM.Evidence.RoleBinding;
import net.certware.sacm.SACM.Evidence.Satisfies;
import net.certware.sacm.SACM.Evidence.Service;
import net.certware.sacm.SACM.Evidence.Significance;
import net.certware.sacm.SACM.Evidence.Stakeholder;
import net.certware.sacm.SACM.Evidence.StartTime;
import net.certware.sacm.SACM.Evidence.Strength;
import net.certware.sacm.SACM.Evidence.Support;
import net.certware.sacm.SACM.Evidence.Supports;
import net.certware.sacm.SACM.Evidence.TimingProperty;
import net.certware.sacm.SACM.Evidence.Tool;
import net.certware.sacm.SACM.Evidence.UnknownObject;
import net.certware.sacm.SACM.Evidence.UsingProcess;
import net.certware.sacm.SACM.Evidence.Weakens;

import net.certware.sacm.SACM.ModelElement;
import net.certware.sacm.SACM.SACMElement;
import net.certware.sacm.SACM.UtilityElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage
 * @generated
 */
public class EvidenceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EvidencePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EvidencePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceSwitch<Adapter> modelSwitch =
		new EvidenceSwitch<Adapter>() {
			@Override
			public Adapter caseEvidenceAttribute(EvidenceAttribute object) {
				return createEvidenceAttributeAdapter();
			}
			@Override
			public Adapter caseConsistency(Consistency object) {
				return createConsistencyAdapter();
			}
			@Override
			public Adapter caseCompleteness(Completeness object) {
				return createCompletenessAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseConfidence(Confidence object) {
				return createConfidenceAdapter();
			}
			@Override
			public Adapter caseApprovedBy(ApprovedBy object) {
				return createApprovedByAdapter();
			}
			@Override
			public Adapter caseCreatedBy(CreatedBy object) {
				return createCreatedByAdapter();
			}
			@Override
			public Adapter caseTool(Tool object) {
				return createToolAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter caseEvidenceItem(EvidenceItem object) {
				return createEvidenceItemAdapter();
			}
			@Override
			public Adapter caseIsBasedOn(IsBasedOn object) {
				return createIsBasedOnAdapter();
			}
			@Override
			public Adapter caseFormalAssertion(FormalAssertion object) {
				return createFormalAssertionAdapter();
			}
			@Override
			public Adapter caseIsA(IsA object) {
				return createIsAAdapter();
			}
			@Override
			public Adapter caseIsCharacterizedBy(IsCharacterizedBy object) {
				return createIsCharacterizedByAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseOrganization(Organization object) {
				return createOrganizationAdapter();
			}
			@Override
			public Adapter caseEvidenceContainer(EvidenceContainer object) {
				return createEvidenceContainerAdapter();
			}
			@Override
			public Adapter caseEndTime(EndTime object) {
				return createEndTimeAdapter();
			}
			@Override
			public Adapter caseAssertion(Assertion object) {
				return createAssertionAdapter();
			}
			@Override
			public Adapter caseObject(net.certware.sacm.SACM.Evidence.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseCompositeObject(CompositeObject object) {
				return createCompositeObjectAdapter();
			}
			@Override
			public Adapter caseRoleBinding(RoleBinding object) {
				return createRoleBindingAdapter();
			}
			@Override
			public Adapter caseStartTime(StartTime object) {
				return createStartTimeAdapter();
			}
			@Override
			public Adapter caseRelevance(Relevance object) {
				return createRelevanceAdapter();
			}
			@Override
			public Adapter caseSignificance(Significance object) {
				return createSignificanceAdapter();
			}
			@Override
			public Adapter caseAccuracy(Accuracy object) {
				return createAccuracyAdapter();
			}
			@Override
			public Adapter caseHasRoleIn(HasRoleIn object) {
				return createHasRoleInAdapter();
			}
			@Override
			public Adapter caseIsScopedBy(IsScopedBy object) {
				return createIsScopedByAdapter();
			}
			@Override
			public Adapter caseEffectiveTime(EffectiveTime object) {
				return createEffectiveTimeAdapter();
			}
			@Override
			public Adapter caseAtTime(AtTime object) {
				return createAtTimeAdapter();
			}
			@Override
			public Adapter caseOriginality(Originality object) {
				return createOriginalityAdapter();
			}
			@Override
			public Adapter caseReporting(Reporting object) {
				return createReportingAdapter();
			}
			@Override
			public Adapter caseReliability(Reliability object) {
				return createReliabilityAdapter();
			}
			@Override
			public Adapter caseSupports(Supports object) {
				return createSupportsAdapter();
			}
			@Override
			public Adapter caseIsGeneratedAt(IsGeneratedAt object) {
				return createIsGeneratedAtAdapter();
			}
			@Override
			public Adapter caseCollectionMethod(CollectionMethod object) {
				return createCollectionMethodAdapter();
			}
			@Override
			public Adapter caseEvidenceRelation(EvidenceRelation object) {
				return createEvidenceRelationAdapter();
			}
			@Override
			public Adapter caseSupport(Support object) {
				return createSupportAdapter();
			}
			@Override
			public Adapter caseConflicts(Conflicts object) {
				return createConflictsAdapter();
			}
			@Override
			public Adapter caseRefutes(Refutes object) {
				return createRefutesAdapter();
			}
			@Override
			public Adapter caseNegates(Negates object) {
				return createNegatesAdapter();
			}
			@Override
			public Adapter caseUnknownObject(UnknownObject object) {
				return createUnknownObjectAdapter();
			}
			@Override
			public Adapter caseEvidenceEvaluation(EvidenceEvaluation object) {
				return createEvidenceEvaluationAdapter();
			}
			@Override
			public Adapter caseResolves(Resolves object) {
				return createResolvesAdapter();
			}
			@Override
			public Adapter caseStakeholder(Stakeholder object) {
				return createStakeholderAdapter();
			}
			@Override
			public Adapter caseEvidenceRequest(EvidenceRequest object) {
				return createEvidenceRequestAdapter();
			}
			@Override
			public Adapter caseProjectObjective(ProjectObjective object) {
				return createProjectObjectiveAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseDependsOn(DependsOn object) {
				return createDependsOnAdapter();
			}
			@Override
			public Adapter caseSatisfies(Satisfies object) {
				return createSatisfiesAdapter();
			}
			@Override
			public Adapter caseProjectElement(ProjectElement object) {
				return createProjectElementAdapter();
			}
			@Override
			public Adapter caseReferencedClaim(ReferencedClaim object) {
				return createReferencedClaimAdapter();
			}
			@Override
			public Adapter caseEvidenceObservation(EvidenceObservation object) {
				return createEvidenceObservationAdapter();
			}
			@Override
			public Adapter caseEvidenceResolution(EvidenceResolution object) {
				return createEvidenceResolutionAdapter();
			}
			@Override
			public Adapter caseWeakens(Weakens object) {
				return createWeakensAdapter();
			}
			@Override
			public Adapter caseAmplifies(Amplifies object) {
				return createAmplifiesAdapter();
			}
			@Override
			public Adapter caseContributes(Contributes object) {
				return createContributesAdapter();
			}
			@Override
			public Adapter caseChallenges(Challenges object) {
				return createChallengesAdapter();
			}
			@Override
			public Adapter caseStrength(Strength object) {
				return createStrengthAdapter();
			}
			@Override
			public Adapter caseIsAcquiredAt(IsAcquiredAt object) {
				return createIsAcquiredAtAdapter();
			}
			@Override
			public Adapter caseIsTransferredTo(IsTransferredTo object) {
				return createIsTransferredToAdapter();
			}
			@Override
			public Adapter caseDocumentProperty(DocumentProperty object) {
				return createDocumentPropertyAdapter();
			}
			@Override
			public Adapter caseEvidenceEvent(EvidenceEvent object) {
				return createEvidenceEventAdapter();
			}
			@Override
			public Adapter caseOwnedBy(OwnedBy object) {
				return createOwnedByAdapter();
			}
			@Override
			public Adapter caseProvenance(Provenance object) {
				return createProvenanceAdapter();
			}
			@Override
			public Adapter caseTimingProperty(TimingProperty object) {
				return createTimingPropertyAdapter();
			}
			@Override
			public Adapter caseIsPartOf(IsPartOf object) {
				return createIsPartOfAdapter();
			}
			@Override
			public Adapter caseIsRevokedAt(IsRevokedAt object) {
				return createIsRevokedAtAdapter();
			}
			@Override
			public Adapter caseProvidesContext(ProvidesContext object) {
				return createProvidesContextAdapter();
			}
			@Override
			public Adapter caseFormalObject(FormalObject object) {
				return createFormalObjectAdapter();
			}
			@Override
			public Adapter caseMeansThat(MeansThat object) {
				return createMeansThatAdapter();
			}
			@Override
			public Adapter caseEvidenceElement(EvidenceElement object) {
				return createEvidenceElementAdapter();
			}
			@Override
			public Adapter caseCareOf(CareOf object) {
				return createCareOfAdapter();
			}
			@Override
			public Adapter caseCustodyProperty(CustodyProperty object) {
				return createCustodyPropertyAdapter();
			}
			@Override
			public Adapter caseAtLocation(AtLocation object) {
				return createAtLocationAdapter();
			}
			@Override
			public Adapter caseIsCreatedAt(IsCreatedAt object) {
				return createIsCreatedAtAdapter();
			}
			@Override
			public Adapter caseRequiresContainer(RequiresContainer object) {
				return createRequiresContainerAdapter();
			}
			@Override
			public Adapter caseProjectProperty(ProjectProperty object) {
				return createProjectPropertyAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseHasElectronicSource(HasElectronicSource object) {
				return createHasElectronicSourceAdapter();
			}
			@Override
			public Adapter caseIsExpressedInLanguage(IsExpressedInLanguage object) {
				return createIsExpressedInLanguageAdapter();
			}
			@Override
			public Adapter caseUsingProcess(UsingProcess object) {
				return createUsingProcessAdapter();
			}
			@Override
			public Adapter caseHasSecurityClassification(HasSecurityClassification object) {
				return createHasSecurityClassificationAdapter();
			}
			@Override
			public Adapter caseIsReleaseableTo(IsReleaseableTo object) {
				return createIsReleaseableToAdapter();
			}
			@Override
			public Adapter caseEvidenceGroup(EvidenceGroup object) {
				return createEvidenceGroupAdapter();
			}
			@Override
			public Adapter caseHasVersion(HasVersion object) {
				return createHasVersionAdapter();
			}
			@Override
			public Adapter caseHasMedia(HasMedia object) {
				return createHasMediaAdapter();
			}
			@Override
			public Adapter caseExhibit(Exhibit object) {
				return createExhibitAdapter();
			}
			@Override
			public Adapter caseFormalElement(FormalElement object) {
				return createFormalElementAdapter();
			}
			@Override
			public Adapter caseExhibitProperty(ExhibitProperty object) {
				return createExhibitPropertyAdapter();
			}
			@Override
			public Adapter caseEvidenceInterpretation(EvidenceInterpretation object) {
				return createEvidenceInterpretationAdapter();
			}
			@Override
			public Adapter caseEvidenceAssertion(EvidenceAssertion object) {
				return createEvidenceAssertionAdapter();
			}
			@Override
			public Adapter caseEvidenceProperty(EvidenceProperty object) {
				return createEvidencePropertyAdapter();
			}
			@Override
			public Adapter caseExtendedEvidenceAttribute(ExtendedEvidenceAttribute object) {
				return createExtendedEvidenceAttributeAdapter();
			}
			@Override
			public Adapter caseExtendedDocumentProperty(ExtendedDocumentProperty object) {
				return createExtendedDocumentPropertyAdapter();
			}
			@Override
			public Adapter caseRecord(Record object) {
				return createRecordAdapter();
			}
			@Override
			public Adapter caseObjectifiedAssertion(ObjectifiedAssertion object) {
				return createObjectifiedAssertionAdapter();
			}
			@Override
			public Adapter caseIsModifiedBy(IsModifiedBy object) {
				return createIsModifiedByAdapter();
			}
			@Override
			public Adapter casePerformedBy(PerformedBy object) {
				return createPerformedByAdapter();
			}
			@Override
			public Adapter caseContainerConsistency(ContainerConsistency object) {
				return createContainerConsistencyAdapter();
			}
			@Override
			public Adapter caseContainerCompleteness(ContainerCompleteness object) {
				return createContainerCompletenessAdapter();
			}
			@Override
			public Adapter caseCompliesTo(CompliesTo object) {
				return createCompliesToAdapter();
			}
			@Override
			public Adapter caseExtendedProjectProperty(ExtendedProjectProperty object) {
				return createExtendedProjectPropertyAdapter();
			}
			@Override
			public Adapter caseSACMElement(SACMElement object) {
				return createSACMElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseUtilityElement(UtilityElement object) {
				return createUtilityElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.EvidenceAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceAttribute
	 * @generated
	 */
	public Adapter createEvidenceAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Consistency <em>Consistency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Consistency
	 * @generated
	 */
	public Adapter createConsistencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Completeness <em>Completeness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Completeness
	 * @generated
	 */
	public Adapter createCompletenessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Confidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Confidence
	 * @generated
	 */
	public Adapter createConfidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.ApprovedBy <em>Approved By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.ApprovedBy
	 * @generated
	 */
	public Adapter createApprovedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.CreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.CreatedBy
	 * @generated
	 */
	public Adapter createCreatedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Tool
	 * @generated
	 */
	public Adapter createToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.EvidenceItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceItem
	 * @generated
	 */
	public Adapter createEvidenceItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.IsBasedOn <em>Is Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.IsBasedOn
	 * @generated
	 */
	public Adapter createIsBasedOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.FormalAssertion <em>Formal Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.FormalAssertion
	 * @generated
	 */
	public Adapter createFormalAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.IsA <em>Is A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.IsA
	 * @generated
	 */
	public Adapter createIsAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.IsCharacterizedBy <em>Is Characterized By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.IsCharacterizedBy
	 * @generated
	 */
	public Adapter createIsCharacterizedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Organization
	 * @generated
	 */
	public Adapter createOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.EvidenceContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceContainer
	 * @generated
	 */
	public Adapter createEvidenceContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.EndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.EndTime
	 * @generated
	 */
	public Adapter createEndTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Assertion
	 * @generated
	 */
	public Adapter createAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.CompositeObject <em>Composite Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.CompositeObject
	 * @generated
	 */
	public Adapter createCompositeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.RoleBinding <em>Role Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.RoleBinding
	 * @generated
	 */
	public Adapter createRoleBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.StartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.StartTime
	 * @generated
	 */
	public Adapter createStartTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Relevance <em>Relevance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Relevance
	 * @generated
	 */
	public Adapter createRelevanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Significance <em>Significance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Significance
	 * @generated
	 */
	public Adapter createSignificanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Accuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Accuracy
	 * @generated
	 */
	public Adapter createAccuracyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.HasRoleIn <em>Has Role In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.HasRoleIn
	 * @generated
	 */
	public Adapter createHasRoleInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.IsScopedBy <em>Is Scoped By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.IsScopedBy
	 * @generated
	 */
	public Adapter createIsScopedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.EffectiveTime <em>Effective Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.EffectiveTime
	 * @generated
	 */
	public Adapter createEffectiveTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.AtTime <em>At Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.AtTime
	 * @generated
	 */
	public Adapter createAtTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Originality <em>Originality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Originality
	 * @generated
	 */
	public Adapter createOriginalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Reporting <em>Reporting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Reporting
	 * @generated
	 */
	public Adapter createReportingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Reliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Reliability
	 * @generated
	 */
	public Adapter createReliabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Supports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Supports
	 * @generated
	 */
	public Adapter createSupportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.IsGeneratedAt <em>Is Generated At</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.IsGeneratedAt
	 * @generated
	 */
	public Adapter createIsGeneratedAtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.CollectionMethod <em>Collection Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.CollectionMethod
	 * @generated
	 */
	public Adapter createCollectionMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.EvidenceRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceRelation
	 * @generated
	 */
	public Adapter createEvidenceRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Support <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Support
	 * @generated
	 */
	public Adapter createSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Conflicts <em>Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Conflicts
	 * @generated
	 */
	public Adapter createConflictsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Refutes <em>Refutes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Refutes
	 * @generated
	 */
	public Adapter createRefutesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Negates <em>Negates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Negates
	 * @generated
	 */
	public Adapter createNegatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.UnknownObject <em>Unknown Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.UnknownObject
	 * @generated
	 */
	public Adapter createUnknownObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.EvidenceEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceEvaluation
	 * @generated
	 */
	public Adapter createEvidenceEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Resolves <em>Resolves</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Resolves
	 * @generated
	 */
	public Adapter createResolvesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Stakeholder
	 * @generated
	 */
	public Adapter createStakeholderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.EvidenceRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceRequest
	 * @generated
	 */
	public Adapter createEvidenceRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.ProjectObjective <em>Project Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.ProjectObjective
	 * @generated
	 */
	public Adapter createProjectObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.DependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.DependsOn
	 * @generated
	 */
	public Adapter createDependsOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Satisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Satisfies
	 * @generated
	 */
	public Adapter createSatisfiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.ProjectElement <em>Project Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.ProjectElement
	 * @generated
	 */
	public Adapter createProjectElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.ReferencedClaim <em>Referenced Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.ReferencedClaim
	 * @generated
	 */
	public Adapter createReferencedClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.EvidenceObservation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceObservation
	 * @generated
	 */
	public Adapter createEvidenceObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.EvidenceResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceResolution
	 * @generated
	 */
	public Adapter createEvidenceResolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Weakens <em>Weakens</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Weakens
	 * @generated
	 */
	public Adapter createWeakensAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Amplifies <em>Amplifies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Amplifies
	 * @generated
	 */
	public Adapter createAmplifiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Contributes <em>Contributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Contributes
	 * @generated
	 */
	public Adapter createContributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Challenges <em>Challenges</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Challenges
	 * @generated
	 */
	public Adapter createChallengesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Strength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Strength
	 * @generated
	 */
	public Adapter createStrengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.IsAcquiredAt <em>Is Acquired At</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.IsAcquiredAt
	 * @generated
	 */
	public Adapter createIsAcquiredAtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.IsTransferredTo <em>Is Transferred To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.IsTransferredTo
	 * @generated
	 */
	public Adapter createIsTransferredToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.DocumentProperty <em>Document Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.DocumentProperty
	 * @generated
	 */
	public Adapter createDocumentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.EvidenceEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceEvent
	 * @generated
	 */
	public Adapter createEvidenceEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.OwnedBy <em>Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.OwnedBy
	 * @generated
	 */
	public Adapter createOwnedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Provenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Provenance
	 * @generated
	 */
	public Adapter createProvenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.TimingProperty <em>Timing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.TimingProperty
	 * @generated
	 */
	public Adapter createTimingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.IsPartOf <em>Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.IsPartOf
	 * @generated
	 */
	public Adapter createIsPartOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.IsRevokedAt <em>Is Revoked At</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.IsRevokedAt
	 * @generated
	 */
	public Adapter createIsRevokedAtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.ProvidesContext <em>Provides Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.ProvidesContext
	 * @generated
	 */
	public Adapter createProvidesContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.FormalObject <em>Formal Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.FormalObject
	 * @generated
	 */
	public Adapter createFormalObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.MeansThat <em>Means That</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.MeansThat
	 * @generated
	 */
	public Adapter createMeansThatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.EvidenceElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceElement
	 * @generated
	 */
	public Adapter createEvidenceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.CareOf <em>Care Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.CareOf
	 * @generated
	 */
	public Adapter createCareOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.CustodyProperty <em>Custody Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.CustodyProperty
	 * @generated
	 */
	public Adapter createCustodyPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.AtLocation <em>At Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.AtLocation
	 * @generated
	 */
	public Adapter createAtLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.IsCreatedAt <em>Is Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.IsCreatedAt
	 * @generated
	 */
	public Adapter createIsCreatedAtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.RequiresContainer <em>Requires Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.RequiresContainer
	 * @generated
	 */
	public Adapter createRequiresContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.ProjectProperty <em>Project Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.ProjectProperty
	 * @generated
	 */
	public Adapter createProjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.HasElectronicSource <em>Has Electronic Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.HasElectronicSource
	 * @generated
	 */
	public Adapter createHasElectronicSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.IsExpressedInLanguage <em>Is Expressed In Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.IsExpressedInLanguage
	 * @generated
	 */
	public Adapter createIsExpressedInLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.UsingProcess <em>Using Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.UsingProcess
	 * @generated
	 */
	public Adapter createUsingProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.HasSecurityClassification <em>Has Security Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.HasSecurityClassification
	 * @generated
	 */
	public Adapter createHasSecurityClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.IsReleaseableTo <em>Is Releaseable To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.IsReleaseableTo
	 * @generated
	 */
	public Adapter createIsReleaseableToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.EvidenceGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceGroup
	 * @generated
	 */
	public Adapter createEvidenceGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.HasVersion <em>Has Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.HasVersion
	 * @generated
	 */
	public Adapter createHasVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.HasMedia <em>Has Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.HasMedia
	 * @generated
	 */
	public Adapter createHasMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Exhibit <em>Exhibit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Exhibit
	 * @generated
	 */
	public Adapter createExhibitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.FormalElement <em>Formal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.FormalElement
	 * @generated
	 */
	public Adapter createFormalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.ExhibitProperty <em>Exhibit Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.ExhibitProperty
	 * @generated
	 */
	public Adapter createExhibitPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.EvidenceInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceInterpretation
	 * @generated
	 */
	public Adapter createEvidenceInterpretationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.EvidenceAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceAssertion
	 * @generated
	 */
	public Adapter createEvidenceAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.EvidenceProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceProperty
	 * @generated
	 */
	public Adapter createEvidencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.ExtendedEvidenceAttribute <em>Extended Evidence Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.ExtendedEvidenceAttribute
	 * @generated
	 */
	public Adapter createExtendedEvidenceAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.ExtendedDocumentProperty <em>Extended Document Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.ExtendedDocumentProperty
	 * @generated
	 */
	public Adapter createExtendedDocumentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.Record
	 * @generated
	 */
	public Adapter createRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.ObjectifiedAssertion <em>Objectified Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.ObjectifiedAssertion
	 * @generated
	 */
	public Adapter createObjectifiedAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.IsModifiedBy <em>Is Modified By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.IsModifiedBy
	 * @generated
	 */
	public Adapter createIsModifiedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.PerformedBy <em>Performed By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.PerformedBy
	 * @generated
	 */
	public Adapter createPerformedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.ContainerConsistency <em>Container Consistency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.ContainerConsistency
	 * @generated
	 */
	public Adapter createContainerConsistencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.ContainerCompleteness <em>Container Completeness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.ContainerCompleteness
	 * @generated
	 */
	public Adapter createContainerCompletenessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.CompliesTo <em>Complies To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.CompliesTo
	 * @generated
	 */
	public Adapter createCompliesToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.Evidence.ExtendedProjectProperty <em>Extended Project Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.Evidence.ExtendedProjectProperty
	 * @generated
	 */
	public Adapter createExtendedProjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.SACMElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.SACMElement
	 * @generated
	 */
	public Adapter createSACMElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.sacm.SACM.UtilityElement <em>Utility Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.sacm.SACM.UtilityElement
	 * @generated
	 */
	public Adapter createUtilityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EvidenceAdapterFactory
