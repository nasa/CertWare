/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence.util;

import net.certware.evidence.evidence.Accuracy;
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
import net.certware.evidence.evidence.CompositeSubject;
import net.certware.evidence.evidence.Confidence;
import net.certware.evidence.evidence.Conflicts;
import net.certware.evidence.evidence.Consistency;
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
import net.certware.evidence.evidence.Meaning;
import net.certware.evidence.evidence.MeansThat;
import net.certware.evidence.evidence.Method;
import net.certware.evidence.evidence.Negates;
import net.certware.evidence.evidence.Organization;
import net.certware.evidence.evidence.Originality;
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
import net.certware.evidence.evidence.Reporting;
import net.certware.evidence.evidence.RequiresMethod;
import net.certware.evidence.evidence.RequiresPackage;
import net.certware.evidence.evidence.RequiresTool;
import net.certware.evidence.evidence.Resolves;
import net.certware.evidence.evidence.RoleBinding;
import net.certware.evidence.evidence.Satisfies;
import net.certware.evidence.evidence.Service;
import net.certware.evidence.evidence.Significance;
import net.certware.evidence.evidence.StartTime;
import net.certware.evidence.evidence.Strength;
import net.certware.evidence.evidence.Supercedes;
import net.certware.evidence.evidence.Support;
import net.certware.evidence.evidence.Supports;
import net.certware.evidence.evidence.TimingProperty;
import net.certware.evidence.evidence.Tool;
import net.certware.evidence.evidence.UnknownSubject;
import net.certware.evidence.evidence.UsingProcess;
import net.certware.evidence.evidence.Weakens;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.evidence.evidence.EvidencePackage
 * @generated
 */
public class EvidenceAdapterFactory extends AdapterFactoryImpl {
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
			public Adapter caseElement(Element object) {
				return createElementAdapter();
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
			public Adapter caseDescription(Description object) {
				return createDescriptionAdapter();
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
			public Adapter caseRequiresTool(RequiresTool object) {
				return createRequiresToolAdapter();
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
			public Adapter caseDomainAssertion(DomainAssertion object) {
				return createDomainAssertionAdapter();
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
			public Adapter casePackage(net.certware.evidence.evidence.Package object) {
				return createPackageAdapter();
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
			public Adapter caseFormalObject(FormalObject object) {
				return createFormalObjectAdapter();
			}
			@Override
			public Adapter caseObject(net.certware.evidence.evidence.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseCompositeSubject(CompositeSubject object) {
				return createCompositeSubjectAdapter();
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
			public Adapter caseRationale(Rationale object) {
				return createRationaleAdapter();
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
			public Adapter caseUnknownSubject(UnknownSubject object) {
				return createUnknownSubjectAdapter();
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
			public Adapter caseOriginator(Originator object) {
				return createOriginatorAdapter();
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
			public Adapter caseIsAssociatedWith(IsAssociatedWith object) {
				return createIsAssociatedWithAdapter();
			}
			@Override
			public Adapter caseRequiresMethod(RequiresMethod object) {
				return createRequiresMethodAdapter();
			}
			@Override
			public Adapter caseSatisfies(Satisfies object) {
				return createSatisfiesAdapter();
			}
			@Override
			public Adapter caseAdministrativeElement(AdministrativeElement object) {
				return createAdministrativeElementAdapter();
			}
			@Override
			public Adapter caseDomainClaim(DomainClaim object) {
				return createDomainClaimAdapter();
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
			public Adapter caseDocumentAttribute(DocumentAttribute object) {
				return createDocumentAttributeAdapter();
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
			public Adapter caseDomainObject(DomainObject object) {
				return createDomainObjectAdapter();
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
			public Adapter caseRequiresPackage(RequiresPackage object) {
				return createRequiresPackageAdapter();
			}
			@Override
			public Adapter caseActivityProperty(ActivityProperty object) {
				return createActivityPropertyAdapter();
			}
			@Override
			public Adapter caseEvidenceProperty(EvidenceProperty object) {
				return createEvidencePropertyAdapter();
			}
			@Override
			public Adapter caseAdministrativeProperty(AdministrativeProperty object) {
				return createAdministrativePropertyAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseDocumentProperty(DocumentProperty object) {
				return createDocumentPropertyAdapter();
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
			public Adapter caseEvaluationAttribute(EvaluationAttribute object) {
				return createEvaluationAttributeAdapter();
			}
			@Override
			public Adapter caseSupercedes(Supercedes object) {
				return createSupercedesAdapter();
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
			public Adapter caseMeaning(Meaning object) {
				return createMeaningAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.EvidenceAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.EvidenceAttribute
	 * @generated
	 */
	public Adapter createEvidenceAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Consistency <em>Consistency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Consistency
	 * @generated
	 */
	public Adapter createConsistencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Completeness <em>Completeness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Completeness
	 * @generated
	 */
	public Adapter createCompletenessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Confidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Confidence
	 * @generated
	 */
	public Adapter createConfidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.ApprovedBy <em>Approved By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.ApprovedBy
	 * @generated
	 */
	public Adapter createApprovedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Description
	 * @generated
	 */
	public Adapter createDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.CreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.CreatedBy
	 * @generated
	 */
	public Adapter createCreatedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Tool
	 * @generated
	 */
	public Adapter createToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.RequiresTool <em>Requires Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.RequiresTool
	 * @generated
	 */
	public Adapter createRequiresToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.EvidenceItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.EvidenceItem
	 * @generated
	 */
	public Adapter createEvidenceItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.IsBasedOn <em>Is Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.IsBasedOn
	 * @generated
	 */
	public Adapter createIsBasedOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.DomainAssertion <em>Domain Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.DomainAssertion
	 * @generated
	 */
	public Adapter createDomainAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.IsA <em>Is A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.IsA
	 * @generated
	 */
	public Adapter createIsAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.IsCharacterizedBy <em>Is Characterized By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.IsCharacterizedBy
	 * @generated
	 */
	public Adapter createIsCharacterizedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Organization
	 * @generated
	 */
	public Adapter createOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.EndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.EndTime
	 * @generated
	 */
	public Adapter createEndTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Assertion
	 * @generated
	 */
	public Adapter createAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.FormalObject <em>Formal Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.FormalObject
	 * @generated
	 */
	public Adapter createFormalObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.CompositeSubject <em>Composite Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.CompositeSubject
	 * @generated
	 */
	public Adapter createCompositeSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.RoleBinding <em>Role Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.RoleBinding
	 * @generated
	 */
	public Adapter createRoleBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.StartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.StartTime
	 * @generated
	 */
	public Adapter createStartTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Relevance <em>Relevance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Relevance
	 * @generated
	 */
	public Adapter createRelevanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Significance <em>Significance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Significance
	 * @generated
	 */
	public Adapter createSignificanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Accuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Accuracy
	 * @generated
	 */
	public Adapter createAccuracyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.HasRoleIn <em>Has Role In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.HasRoleIn
	 * @generated
	 */
	public Adapter createHasRoleInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.IsScopedBy <em>Is Scoped By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.IsScopedBy
	 * @generated
	 */
	public Adapter createIsScopedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.EffectiveTime <em>Effective Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.EffectiveTime
	 * @generated
	 */
	public Adapter createEffectiveTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.AtTime <em>At Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.AtTime
	 * @generated
	 */
	public Adapter createAtTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Originality <em>Originality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Originality
	 * @generated
	 */
	public Adapter createOriginalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Reporting <em>Reporting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Reporting
	 * @generated
	 */
	public Adapter createReportingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Reliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Reliability
	 * @generated
	 */
	public Adapter createReliabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Supports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Supports
	 * @generated
	 */
	public Adapter createSupportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.IsGeneratedAt <em>Is Generated At</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.IsGeneratedAt
	 * @generated
	 */
	public Adapter createIsGeneratedAtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.CollectionMethod <em>Collection Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.CollectionMethod
	 * @generated
	 */
	public Adapter createCollectionMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.EvidenceRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.EvidenceRelation
	 * @generated
	 */
	public Adapter createEvidenceRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Support <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Support
	 * @generated
	 */
	public Adapter createSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Conflicts <em>Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Conflicts
	 * @generated
	 */
	public Adapter createConflictsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Rationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Rationale
	 * @generated
	 */
	public Adapter createRationaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Refutes <em>Refutes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Refutes
	 * @generated
	 */
	public Adapter createRefutesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Negates <em>Negates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Negates
	 * @generated
	 */
	public Adapter createNegatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.UnknownSubject <em>Unknown Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.UnknownSubject
	 * @generated
	 */
	public Adapter createUnknownSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.EvidenceEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.EvidenceEvaluation
	 * @generated
	 */
	public Adapter createEvidenceEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Resolves <em>Resolves</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Resolves
	 * @generated
	 */
	public Adapter createResolvesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Originator <em>Originator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Originator
	 * @generated
	 */
	public Adapter createOriginatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.EvidenceRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.EvidenceRequest
	 * @generated
	 */
	public Adapter createEvidenceRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.ProjectObjective <em>Project Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.ProjectObjective
	 * @generated
	 */
	public Adapter createProjectObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.DependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.DependsOn
	 * @generated
	 */
	public Adapter createDependsOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.IsAssociatedWith <em>Is Associated With</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.IsAssociatedWith
	 * @generated
	 */
	public Adapter createIsAssociatedWithAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.RequiresMethod <em>Requires Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.RequiresMethod
	 * @generated
	 */
	public Adapter createRequiresMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Satisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Satisfies
	 * @generated
	 */
	public Adapter createSatisfiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.AdministrativeElement <em>Administrative Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.AdministrativeElement
	 * @generated
	 */
	public Adapter createAdministrativeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.DomainClaim <em>Domain Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.DomainClaim
	 * @generated
	 */
	public Adapter createDomainClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.EvidenceObservation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.EvidenceObservation
	 * @generated
	 */
	public Adapter createEvidenceObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.EvidenceResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.EvidenceResolution
	 * @generated
	 */
	public Adapter createEvidenceResolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Weakens <em>Weakens</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Weakens
	 * @generated
	 */
	public Adapter createWeakensAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Amplifies <em>Amplifies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Amplifies
	 * @generated
	 */
	public Adapter createAmplifiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Contributes <em>Contributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Contributes
	 * @generated
	 */
	public Adapter createContributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Challenges <em>Challenges</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Challenges
	 * @generated
	 */
	public Adapter createChallengesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Strength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Strength
	 * @generated
	 */
	public Adapter createStrengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.IsAcquiredAt <em>Is Acquired At</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.IsAcquiredAt
	 * @generated
	 */
	public Adapter createIsAcquiredAtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.IsTransferredTo <em>Is Transferred To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.IsTransferredTo
	 * @generated
	 */
	public Adapter createIsTransferredToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.DocumentAttribute <em>Document Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.DocumentAttribute
	 * @generated
	 */
	public Adapter createDocumentAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.EvidenceEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.EvidenceEvent
	 * @generated
	 */
	public Adapter createEvidenceEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.OwnedBy <em>Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.OwnedBy
	 * @generated
	 */
	public Adapter createOwnedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Provenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Provenance
	 * @generated
	 */
	public Adapter createProvenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.TimingProperty <em>Timing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.TimingProperty
	 * @generated
	 */
	public Adapter createTimingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.IsPartOf <em>Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.IsPartOf
	 * @generated
	 */
	public Adapter createIsPartOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.IsRevokedAt <em>Is Revoked At</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.IsRevokedAt
	 * @generated
	 */
	public Adapter createIsRevokedAtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.ProvidesContext <em>Provides Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.ProvidesContext
	 * @generated
	 */
	public Adapter createProvidesContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.DomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.DomainObject
	 * @generated
	 */
	public Adapter createDomainObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.MeansThat <em>Means That</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.MeansThat
	 * @generated
	 */
	public Adapter createMeansThatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.EvidenceElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.EvidenceElement
	 * @generated
	 */
	public Adapter createEvidenceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.CareOf <em>Care Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.CareOf
	 * @generated
	 */
	public Adapter createCareOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.CustodyProperty <em>Custody Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.CustodyProperty
	 * @generated
	 */
	public Adapter createCustodyPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.AtLocation <em>At Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.AtLocation
	 * @generated
	 */
	public Adapter createAtLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.IsCreatedAt <em>Is Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.IsCreatedAt
	 * @generated
	 */
	public Adapter createIsCreatedAtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.RequiresPackage <em>Requires Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.RequiresPackage
	 * @generated
	 */
	public Adapter createRequiresPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.ActivityProperty <em>Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.ActivityProperty
	 * @generated
	 */
	public Adapter createActivityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.EvidenceProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.EvidenceProperty
	 * @generated
	 */
	public Adapter createEvidencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.AdministrativeProperty <em>Administrative Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.AdministrativeProperty
	 * @generated
	 */
	public Adapter createAdministrativePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.DocumentProperty <em>Document Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.DocumentProperty
	 * @generated
	 */
	public Adapter createDocumentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.HasElectronicSource <em>Has Electronic Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.HasElectronicSource
	 * @generated
	 */
	public Adapter createHasElectronicSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.IsExpressedInLanguage <em>Is Expressed In Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.IsExpressedInLanguage
	 * @generated
	 */
	public Adapter createIsExpressedInLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.UsingProcess <em>Using Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.UsingProcess
	 * @generated
	 */
	public Adapter createUsingProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.HasSecurityClassification <em>Has Security Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.HasSecurityClassification
	 * @generated
	 */
	public Adapter createHasSecurityClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.IsReleaseableTo <em>Is Releaseable To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.IsReleaseableTo
	 * @generated
	 */
	public Adapter createIsReleaseableToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.EvidenceGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.EvidenceGroup
	 * @generated
	 */
	public Adapter createEvidenceGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.HasVersion <em>Has Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.HasVersion
	 * @generated
	 */
	public Adapter createHasVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.EvaluationAttribute <em>Evaluation Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.EvaluationAttribute
	 * @generated
	 */
	public Adapter createEvaluationAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Supercedes <em>Supercedes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Supercedes
	 * @generated
	 */
	public Adapter createSupercedesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.HasMedia <em>Has Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.HasMedia
	 * @generated
	 */
	public Adapter createHasMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Exhibit <em>Exhibit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Exhibit
	 * @generated
	 */
	public Adapter createExhibitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.Meaning <em>Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.Meaning
	 * @generated
	 */
	public Adapter createMeaningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.ExhibitProperty <em>Exhibit Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.ExhibitProperty
	 * @generated
	 */
	public Adapter createExhibitPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.evidence.evidence.EvidenceInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.evidence.evidence.EvidenceInterpretation
	 * @generated
	 */
	public Adapter createEvidenceInterpretationAdapter() {
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
