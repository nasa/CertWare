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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage
 * @generated
 */
public class EvidenceSwitch<T> extends Switch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EvidencePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceSwitch() {
		if (modelPackage == null) {
			modelPackage = EvidencePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EvidencePackage.EVIDENCE_ATTRIBUTE: {
				EvidenceAttribute evidenceAttribute = (EvidenceAttribute)theEObject;
				T result = caseEvidenceAttribute(evidenceAttribute);
				if (result == null) result = caseEvidenceAssertion(evidenceAttribute);
				if (result == null) result = caseEvidenceElement(evidenceAttribute);
				if (result == null) result = caseModelElement(evidenceAttribute);
				if (result == null) result = caseSACMElement(evidenceAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CONSISTENCY: {
				Consistency consistency = (Consistency)theEObject;
				T result = caseConsistency(consistency);
				if (result == null) result = caseDocumentProperty(consistency);
				if (result == null) result = caseExhibitProperty(consistency);
				if (result == null) result = caseEvidenceProperty(consistency);
				if (result == null) result = caseEvidenceAssertion(consistency);
				if (result == null) result = caseEvidenceElement(consistency);
				if (result == null) result = caseModelElement(consistency);
				if (result == null) result = caseSACMElement(consistency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.COMPLETENESS: {
				Completeness completeness = (Completeness)theEObject;
				T result = caseCompleteness(completeness);
				if (result == null) result = caseDocumentProperty(completeness);
				if (result == null) result = caseExhibitProperty(completeness);
				if (result == null) result = caseEvidenceProperty(completeness);
				if (result == null) result = caseEvidenceAssertion(completeness);
				if (result == null) result = caseEvidenceElement(completeness);
				if (result == null) result = caseModelElement(completeness);
				if (result == null) result = caseSACMElement(completeness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = caseExhibit(document);
				if (result == null) result = caseEvidenceItem(document);
				if (result == null) result = caseEvidenceElement(document);
				if (result == null) result = caseModelElement(document);
				if (result == null) result = caseSACMElement(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CONFIDENCE: {
				Confidence confidence = (Confidence)theEObject;
				T result = caseConfidence(confidence);
				if (result == null) result = caseEvidenceAttribute(confidence);
				if (result == null) result = caseEvidenceAssertion(confidence);
				if (result == null) result = caseEvidenceElement(confidence);
				if (result == null) result = caseModelElement(confidence);
				if (result == null) result = caseSACMElement(confidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.APPROVED_BY: {
				ApprovedBy approvedBy = (ApprovedBy)theEObject;
				T result = caseApprovedBy(approvedBy);
				if (result == null) result = caseProvenance(approvedBy);
				if (result == null) result = caseEvidenceProperty(approvedBy);
				if (result == null) result = caseEvidenceAssertion(approvedBy);
				if (result == null) result = caseEvidenceElement(approvedBy);
				if (result == null) result = caseModelElement(approvedBy);
				if (result == null) result = caseSACMElement(approvedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CREATED_BY: {
				CreatedBy createdBy = (CreatedBy)theEObject;
				T result = caseCreatedBy(createdBy);
				if (result == null) result = caseProvenance(createdBy);
				if (result == null) result = caseEvidenceProperty(createdBy);
				if (result == null) result = caseEvidenceAssertion(createdBy);
				if (result == null) result = caseEvidenceElement(createdBy);
				if (result == null) result = caseModelElement(createdBy);
				if (result == null) result = caseSACMElement(createdBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = caseCollectionMethod(tool);
				if (result == null) result = caseProjectElement(tool);
				if (result == null) result = caseEvidenceElement(tool);
				if (result == null) result = caseModelElement(tool);
				if (result == null) result = caseSACMElement(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = caseCollectionMethod(method);
				if (result == null) result = caseProjectElement(method);
				if (result == null) result = caseEvidenceElement(method);
				if (result == null) result = caseModelElement(method);
				if (result == null) result = caseSACMElement(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_ITEM: {
				EvidenceItem evidenceItem = (EvidenceItem)theEObject;
				T result = caseEvidenceItem(evidenceItem);
				if (result == null) result = caseEvidenceElement(evidenceItem);
				if (result == null) result = caseModelElement(evidenceItem);
				if (result == null) result = caseSACMElement(evidenceItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_BASED_ON: {
				IsBasedOn isBasedOn = (IsBasedOn)theEObject;
				T result = caseIsBasedOn(isBasedOn);
				if (result == null) result = caseExhibitProperty(isBasedOn);
				if (result == null) result = caseEvidenceProperty(isBasedOn);
				if (result == null) result = caseEvidenceAssertion(isBasedOn);
				if (result == null) result = caseEvidenceElement(isBasedOn);
				if (result == null) result = caseModelElement(isBasedOn);
				if (result == null) result = caseSACMElement(isBasedOn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.FORMAL_ASSERTION: {
				FormalAssertion formalAssertion = (FormalAssertion)theEObject;
				T result = caseFormalAssertion(formalAssertion);
				if (result == null) result = caseFormalElement(formalAssertion);
				if (result == null) result = caseEvidenceItem(formalAssertion);
				if (result == null) result = caseEvidenceElement(formalAssertion);
				if (result == null) result = caseModelElement(formalAssertion);
				if (result == null) result = caseSACMElement(formalAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_A: {
				IsA isA = (IsA)theEObject;
				T result = caseIsA(isA);
				if (result == null) result = caseEvidenceInterpretation(isA);
				if (result == null) result = caseEvidenceEvaluation(isA);
				if (result == null) result = caseEvidenceAssertion(isA);
				if (result == null) result = caseEvidenceElement(isA);
				if (result == null) result = caseModelElement(isA);
				if (result == null) result = caseSACMElement(isA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_CHARACTERIZED_BY: {
				IsCharacterizedBy isCharacterizedBy = (IsCharacterizedBy)theEObject;
				T result = caseIsCharacterizedBy(isCharacterizedBy);
				if (result == null) result = caseEvidenceInterpretation(isCharacterizedBy);
				if (result == null) result = caseEvidenceEvaluation(isCharacterizedBy);
				if (result == null) result = caseEvidenceAssertion(isCharacterizedBy);
				if (result == null) result = caseEvidenceElement(isCharacterizedBy);
				if (result == null) result = caseModelElement(isCharacterizedBy);
				if (result == null) result = caseSACMElement(isCharacterizedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseStakeholder(person);
				if (result == null) result = caseProjectElement(person);
				if (result == null) result = caseEvidenceElement(person);
				if (result == null) result = caseModelElement(person);
				if (result == null) result = caseSACMElement(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseStakeholder(organization);
				if (result == null) result = caseProjectElement(organization);
				if (result == null) result = caseEvidenceElement(organization);
				if (result == null) result = caseModelElement(organization);
				if (result == null) result = caseSACMElement(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_CONTAINER: {
				EvidenceContainer evidenceContainer = (EvidenceContainer)theEObject;
				T result = caseEvidenceContainer(evidenceContainer);
				if (result == null) result = caseModelElement(evidenceContainer);
				if (result == null) result = caseSACMElement(evidenceContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.END_TIME: {
				EndTime endTime = (EndTime)theEObject;
				T result = caseEndTime(endTime);
				if (result == null) result = caseEffectiveTime(endTime);
				if (result == null) result = caseTimingProperty(endTime);
				if (result == null) result = caseEvidenceProperty(endTime);
				if (result == null) result = caseEvidenceAssertion(endTime);
				if (result == null) result = caseEvidenceElement(endTime);
				if (result == null) result = caseModelElement(endTime);
				if (result == null) result = caseSACMElement(endTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.ASSERTION: {
				Assertion assertion = (Assertion)theEObject;
				T result = caseAssertion(assertion);
				if (result == null) result = caseFormalAssertion(assertion);
				if (result == null) result = caseFormalElement(assertion);
				if (result == null) result = caseEvidenceItem(assertion);
				if (result == null) result = caseEvidenceElement(assertion);
				if (result == null) result = caseModelElement(assertion);
				if (result == null) result = caseSACMElement(assertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.OBJECT: {
				net.certware.sacm.SACM.Evidence.Object object = (net.certware.sacm.SACM.Evidence.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = caseFormalObject(object);
				if (result == null) result = caseFormalElement(object);
				if (result == null) result = caseEvidenceItem(object);
				if (result == null) result = caseEvidenceElement(object);
				if (result == null) result = caseModelElement(object);
				if (result == null) result = caseSACMElement(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.COMPOSITE_OBJECT: {
				CompositeObject compositeObject = (CompositeObject)theEObject;
				T result = caseCompositeObject(compositeObject);
				if (result == null) result = caseFormalObject(compositeObject);
				if (result == null) result = caseFormalElement(compositeObject);
				if (result == null) result = caseEvidenceItem(compositeObject);
				if (result == null) result = caseEvidenceElement(compositeObject);
				if (result == null) result = caseModelElement(compositeObject);
				if (result == null) result = caseSACMElement(compositeObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.ROLE_BINDING: {
				RoleBinding roleBinding = (RoleBinding)theEObject;
				T result = caseRoleBinding(roleBinding);
				if (result == null) result = caseUtilityElement(roleBinding);
				if (result == null) result = caseSACMElement(roleBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.START_TIME: {
				StartTime startTime = (StartTime)theEObject;
				T result = caseStartTime(startTime);
				if (result == null) result = caseEffectiveTime(startTime);
				if (result == null) result = caseTimingProperty(startTime);
				if (result == null) result = caseEvidenceProperty(startTime);
				if (result == null) result = caseEvidenceAssertion(startTime);
				if (result == null) result = caseEvidenceElement(startTime);
				if (result == null) result = caseModelElement(startTime);
				if (result == null) result = caseSACMElement(startTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.RELEVANCE: {
				Relevance relevance = (Relevance)theEObject;
				T result = caseRelevance(relevance);
				if (result == null) result = caseEvidenceAttribute(relevance);
				if (result == null) result = caseEvidenceAssertion(relevance);
				if (result == null) result = caseEvidenceElement(relevance);
				if (result == null) result = caseModelElement(relevance);
				if (result == null) result = caseSACMElement(relevance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.SIGNIFICANCE: {
				Significance significance = (Significance)theEObject;
				T result = caseSignificance(significance);
				if (result == null) result = caseEvidenceAttribute(significance);
				if (result == null) result = caseEvidenceAssertion(significance);
				if (result == null) result = caseEvidenceElement(significance);
				if (result == null) result = caseModelElement(significance);
				if (result == null) result = caseSACMElement(significance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.ACCURACY: {
				Accuracy accuracy = (Accuracy)theEObject;
				T result = caseAccuracy(accuracy);
				if (result == null) result = caseEvidenceAttribute(accuracy);
				if (result == null) result = caseEvidenceAssertion(accuracy);
				if (result == null) result = caseEvidenceElement(accuracy);
				if (result == null) result = caseModelElement(accuracy);
				if (result == null) result = caseSACMElement(accuracy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.HAS_ROLE_IN: {
				HasRoleIn hasRoleIn = (HasRoleIn)theEObject;
				T result = caseHasRoleIn(hasRoleIn);
				if (result == null) result = caseProjectProperty(hasRoleIn);
				if (result == null) result = caseEvidenceProperty(hasRoleIn);
				if (result == null) result = caseEvidenceAssertion(hasRoleIn);
				if (result == null) result = caseEvidenceElement(hasRoleIn);
				if (result == null) result = caseModelElement(hasRoleIn);
				if (result == null) result = caseSACMElement(hasRoleIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_SCOPED_BY: {
				IsScopedBy isScopedBy = (IsScopedBy)theEObject;
				T result = caseIsScopedBy(isScopedBy);
				if (result == null) result = caseEvidenceInterpretation(isScopedBy);
				if (result == null) result = caseEvidenceEvaluation(isScopedBy);
				if (result == null) result = caseEvidenceAssertion(isScopedBy);
				if (result == null) result = caseEvidenceElement(isScopedBy);
				if (result == null) result = caseModelElement(isScopedBy);
				if (result == null) result = caseSACMElement(isScopedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EFFECTIVE_TIME: {
				EffectiveTime effectiveTime = (EffectiveTime)theEObject;
				T result = caseEffectiveTime(effectiveTime);
				if (result == null) result = caseTimingProperty(effectiveTime);
				if (result == null) result = caseEvidenceProperty(effectiveTime);
				if (result == null) result = caseEvidenceAssertion(effectiveTime);
				if (result == null) result = caseEvidenceElement(effectiveTime);
				if (result == null) result = caseModelElement(effectiveTime);
				if (result == null) result = caseSACMElement(effectiveTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.AT_TIME: {
				AtTime atTime = (AtTime)theEObject;
				T result = caseAtTime(atTime);
				if (result == null) result = caseTimingProperty(atTime);
				if (result == null) result = caseEvidenceProperty(atTime);
				if (result == null) result = caseEvidenceAssertion(atTime);
				if (result == null) result = caseEvidenceElement(atTime);
				if (result == null) result = caseModelElement(atTime);
				if (result == null) result = caseSACMElement(atTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.ORIGINALITY: {
				Originality originality = (Originality)theEObject;
				T result = caseOriginality(originality);
				if (result == null) result = caseDocumentProperty(originality);
				if (result == null) result = caseExhibitProperty(originality);
				if (result == null) result = caseEvidenceProperty(originality);
				if (result == null) result = caseEvidenceAssertion(originality);
				if (result == null) result = caseEvidenceElement(originality);
				if (result == null) result = caseModelElement(originality);
				if (result == null) result = caseSACMElement(originality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.REPORTING: {
				Reporting reporting = (Reporting)theEObject;
				T result = caseReporting(reporting);
				if (result == null) result = caseEvidenceAttribute(reporting);
				if (result == null) result = caseEvidenceAssertion(reporting);
				if (result == null) result = caseEvidenceElement(reporting);
				if (result == null) result = caseModelElement(reporting);
				if (result == null) result = caseSACMElement(reporting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.RELIABILITY: {
				Reliability reliability = (Reliability)theEObject;
				T result = caseReliability(reliability);
				if (result == null) result = caseDocumentProperty(reliability);
				if (result == null) result = caseExhibitProperty(reliability);
				if (result == null) result = caseEvidenceProperty(reliability);
				if (result == null) result = caseEvidenceAssertion(reliability);
				if (result == null) result = caseEvidenceElement(reliability);
				if (result == null) result = caseModelElement(reliability);
				if (result == null) result = caseSACMElement(reliability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.SUPPORTS: {
				Supports supports = (Supports)theEObject;
				T result = caseSupports(supports);
				if (result == null) result = caseEvidenceRelation(supports);
				if (result == null) result = caseEvidenceEvaluation(supports);
				if (result == null) result = caseEvidenceAssertion(supports);
				if (result == null) result = caseEvidenceElement(supports);
				if (result == null) result = caseModelElement(supports);
				if (result == null) result = caseSACMElement(supports);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_GENERATED_AT: {
				IsGeneratedAt isGeneratedAt = (IsGeneratedAt)theEObject;
				T result = caseIsGeneratedAt(isGeneratedAt);
				if (result == null) result = caseEvidenceEvent(isGeneratedAt);
				if (result == null) result = caseEvidenceProperty(isGeneratedAt);
				if (result == null) result = caseEvidenceAssertion(isGeneratedAt);
				if (result == null) result = caseEvidenceElement(isGeneratedAt);
				if (result == null) result = caseModelElement(isGeneratedAt);
				if (result == null) result = caseSACMElement(isGeneratedAt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.COLLECTION_METHOD: {
				CollectionMethod collectionMethod = (CollectionMethod)theEObject;
				T result = caseCollectionMethod(collectionMethod);
				if (result == null) result = caseProjectElement(collectionMethod);
				if (result == null) result = caseEvidenceElement(collectionMethod);
				if (result == null) result = caseModelElement(collectionMethod);
				if (result == null) result = caseSACMElement(collectionMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_RELATION: {
				EvidenceRelation evidenceRelation = (EvidenceRelation)theEObject;
				T result = caseEvidenceRelation(evidenceRelation);
				if (result == null) result = caseEvidenceEvaluation(evidenceRelation);
				if (result == null) result = caseEvidenceAssertion(evidenceRelation);
				if (result == null) result = caseEvidenceElement(evidenceRelation);
				if (result == null) result = caseModelElement(evidenceRelation);
				if (result == null) result = caseSACMElement(evidenceRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.SUPPORT: {
				Support support = (Support)theEObject;
				T result = caseSupport(support);
				if (result == null) result = caseEvidenceAttribute(support);
				if (result == null) result = caseEvidenceAssertion(support);
				if (result == null) result = caseEvidenceElement(support);
				if (result == null) result = caseModelElement(support);
				if (result == null) result = caseSACMElement(support);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CONFLICTS: {
				Conflicts conflicts = (Conflicts)theEObject;
				T result = caseConflicts(conflicts);
				if (result == null) result = caseEvidenceObservation(conflicts);
				if (result == null) result = caseEvidenceEvaluation(conflicts);
				if (result == null) result = caseEvidenceAssertion(conflicts);
				if (result == null) result = caseEvidenceElement(conflicts);
				if (result == null) result = caseModelElement(conflicts);
				if (result == null) result = caseSACMElement(conflicts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.REFUTES: {
				Refutes refutes = (Refutes)theEObject;
				T result = caseRefutes(refutes);
				if (result == null) result = caseEvidenceResolution(refutes);
				if (result == null) result = caseEvidenceEvaluation(refutes);
				if (result == null) result = caseEvidenceAssertion(refutes);
				if (result == null) result = caseEvidenceElement(refutes);
				if (result == null) result = caseModelElement(refutes);
				if (result == null) result = caseSACMElement(refutes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.NEGATES: {
				Negates negates = (Negates)theEObject;
				T result = caseNegates(negates);
				if (result == null) result = caseEvidenceResolution(negates);
				if (result == null) result = caseEvidenceEvaluation(negates);
				if (result == null) result = caseEvidenceAssertion(negates);
				if (result == null) result = caseEvidenceElement(negates);
				if (result == null) result = caseModelElement(negates);
				if (result == null) result = caseSACMElement(negates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.UNKNOWN_OBJECT: {
				UnknownObject unknownObject = (UnknownObject)theEObject;
				T result = caseUnknownObject(unknownObject);
				if (result == null) result = caseFormalObject(unknownObject);
				if (result == null) result = caseFormalElement(unknownObject);
				if (result == null) result = caseEvidenceItem(unknownObject);
				if (result == null) result = caseEvidenceElement(unknownObject);
				if (result == null) result = caseModelElement(unknownObject);
				if (result == null) result = caseSACMElement(unknownObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_EVALUATION: {
				EvidenceEvaluation evidenceEvaluation = (EvidenceEvaluation)theEObject;
				T result = caseEvidenceEvaluation(evidenceEvaluation);
				if (result == null) result = caseEvidenceAssertion(evidenceEvaluation);
				if (result == null) result = caseEvidenceElement(evidenceEvaluation);
				if (result == null) result = caseModelElement(evidenceEvaluation);
				if (result == null) result = caseSACMElement(evidenceEvaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.RESOLVES: {
				Resolves resolves = (Resolves)theEObject;
				T result = caseResolves(resolves);
				if (result == null) result = caseEvidenceResolution(resolves);
				if (result == null) result = caseEvidenceEvaluation(resolves);
				if (result == null) result = caseEvidenceAssertion(resolves);
				if (result == null) result = caseEvidenceElement(resolves);
				if (result == null) result = caseModelElement(resolves);
				if (result == null) result = caseSACMElement(resolves);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.STAKEHOLDER: {
				Stakeholder stakeholder = (Stakeholder)theEObject;
				T result = caseStakeholder(stakeholder);
				if (result == null) result = caseProjectElement(stakeholder);
				if (result == null) result = caseEvidenceElement(stakeholder);
				if (result == null) result = caseModelElement(stakeholder);
				if (result == null) result = caseSACMElement(stakeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_REQUEST: {
				EvidenceRequest evidenceRequest = (EvidenceRequest)theEObject;
				T result = caseEvidenceRequest(evidenceRequest);
				if (result == null) result = caseProjectElement(evidenceRequest);
				if (result == null) result = caseEvidenceElement(evidenceRequest);
				if (result == null) result = caseModelElement(evidenceRequest);
				if (result == null) result = caseSACMElement(evidenceRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.PROJECT_OBJECTIVE: {
				ProjectObjective projectObjective = (ProjectObjective)theEObject;
				T result = caseProjectObjective(projectObjective);
				if (result == null) result = caseProjectElement(projectObjective);
				if (result == null) result = caseEvidenceElement(projectObjective);
				if (result == null) result = caseModelElement(projectObjective);
				if (result == null) result = caseSACMElement(projectObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseProjectElement(activity);
				if (result == null) result = caseEvidenceElement(activity);
				if (result == null) result = caseModelElement(activity);
				if (result == null) result = caseSACMElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.DEPENDS_ON: {
				DependsOn dependsOn = (DependsOn)theEObject;
				T result = caseDependsOn(dependsOn);
				if (result == null) result = caseProjectProperty(dependsOn);
				if (result == null) result = caseEvidenceProperty(dependsOn);
				if (result == null) result = caseEvidenceAssertion(dependsOn);
				if (result == null) result = caseEvidenceElement(dependsOn);
				if (result == null) result = caseModelElement(dependsOn);
				if (result == null) result = caseSACMElement(dependsOn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.SATISFIES: {
				Satisfies satisfies = (Satisfies)theEObject;
				T result = caseSatisfies(satisfies);
				if (result == null) result = caseProjectProperty(satisfies);
				if (result == null) result = caseEvidenceProperty(satisfies);
				if (result == null) result = caseEvidenceAssertion(satisfies);
				if (result == null) result = caseEvidenceElement(satisfies);
				if (result == null) result = caseModelElement(satisfies);
				if (result == null) result = caseSACMElement(satisfies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.PROJECT_ELEMENT: {
				ProjectElement projectElement = (ProjectElement)theEObject;
				T result = caseProjectElement(projectElement);
				if (result == null) result = caseEvidenceElement(projectElement);
				if (result == null) result = caseModelElement(projectElement);
				if (result == null) result = caseSACMElement(projectElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.REFERENCED_CLAIM: {
				ReferencedClaim referencedClaim = (ReferencedClaim)theEObject;
				T result = caseReferencedClaim(referencedClaim);
				if (result == null) result = caseFormalAssertion(referencedClaim);
				if (result == null) result = caseFormalElement(referencedClaim);
				if (result == null) result = caseEvidenceItem(referencedClaim);
				if (result == null) result = caseEvidenceElement(referencedClaim);
				if (result == null) result = caseModelElement(referencedClaim);
				if (result == null) result = caseSACMElement(referencedClaim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_OBSERVATION: {
				EvidenceObservation evidenceObservation = (EvidenceObservation)theEObject;
				T result = caseEvidenceObservation(evidenceObservation);
				if (result == null) result = caseEvidenceEvaluation(evidenceObservation);
				if (result == null) result = caseEvidenceAssertion(evidenceObservation);
				if (result == null) result = caseEvidenceElement(evidenceObservation);
				if (result == null) result = caseModelElement(evidenceObservation);
				if (result == null) result = caseSACMElement(evidenceObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_RESOLUTION: {
				EvidenceResolution evidenceResolution = (EvidenceResolution)theEObject;
				T result = caseEvidenceResolution(evidenceResolution);
				if (result == null) result = caseEvidenceEvaluation(evidenceResolution);
				if (result == null) result = caseEvidenceAssertion(evidenceResolution);
				if (result == null) result = caseEvidenceElement(evidenceResolution);
				if (result == null) result = caseModelElement(evidenceResolution);
				if (result == null) result = caseSACMElement(evidenceResolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.WEAKENS: {
				Weakens weakens = (Weakens)theEObject;
				T result = caseWeakens(weakens);
				if (result == null) result = caseContributes(weakens);
				if (result == null) result = caseEvidenceObservation(weakens);
				if (result == null) result = caseEvidenceEvaluation(weakens);
				if (result == null) result = caseEvidenceAssertion(weakens);
				if (result == null) result = caseEvidenceElement(weakens);
				if (result == null) result = caseModelElement(weakens);
				if (result == null) result = caseSACMElement(weakens);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.AMPLIFIES: {
				Amplifies amplifies = (Amplifies)theEObject;
				T result = caseAmplifies(amplifies);
				if (result == null) result = caseContributes(amplifies);
				if (result == null) result = caseEvidenceObservation(amplifies);
				if (result == null) result = caseEvidenceEvaluation(amplifies);
				if (result == null) result = caseEvidenceAssertion(amplifies);
				if (result == null) result = caseEvidenceElement(amplifies);
				if (result == null) result = caseModelElement(amplifies);
				if (result == null) result = caseSACMElement(amplifies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CONTRIBUTES: {
				Contributes contributes = (Contributes)theEObject;
				T result = caseContributes(contributes);
				if (result == null) result = caseEvidenceObservation(contributes);
				if (result == null) result = caseEvidenceEvaluation(contributes);
				if (result == null) result = caseEvidenceAssertion(contributes);
				if (result == null) result = caseEvidenceElement(contributes);
				if (result == null) result = caseModelElement(contributes);
				if (result == null) result = caseSACMElement(contributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CHALLENGES: {
				Challenges challenges = (Challenges)theEObject;
				T result = caseChallenges(challenges);
				if (result == null) result = caseEvidenceRelation(challenges);
				if (result == null) result = caseEvidenceEvaluation(challenges);
				if (result == null) result = caseEvidenceAssertion(challenges);
				if (result == null) result = caseEvidenceElement(challenges);
				if (result == null) result = caseModelElement(challenges);
				if (result == null) result = caseSACMElement(challenges);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.STRENGTH: {
				Strength strength = (Strength)theEObject;
				T result = caseStrength(strength);
				if (result == null) result = caseEvidenceAttribute(strength);
				if (result == null) result = caseEvidenceAssertion(strength);
				if (result == null) result = caseEvidenceElement(strength);
				if (result == null) result = caseModelElement(strength);
				if (result == null) result = caseSACMElement(strength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_ACQUIRED_AT: {
				IsAcquiredAt isAcquiredAt = (IsAcquiredAt)theEObject;
				T result = caseIsAcquiredAt(isAcquiredAt);
				if (result == null) result = caseEvidenceEvent(isAcquiredAt);
				if (result == null) result = caseEvidenceProperty(isAcquiredAt);
				if (result == null) result = caseEvidenceAssertion(isAcquiredAt);
				if (result == null) result = caseEvidenceElement(isAcquiredAt);
				if (result == null) result = caseModelElement(isAcquiredAt);
				if (result == null) result = caseSACMElement(isAcquiredAt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_TRANSFERRED_TO: {
				IsTransferredTo isTransferredTo = (IsTransferredTo)theEObject;
				T result = caseIsTransferredTo(isTransferredTo);
				if (result == null) result = caseEvidenceEvent(isTransferredTo);
				if (result == null) result = caseEvidenceProperty(isTransferredTo);
				if (result == null) result = caseEvidenceAssertion(isTransferredTo);
				if (result == null) result = caseEvidenceElement(isTransferredTo);
				if (result == null) result = caseModelElement(isTransferredTo);
				if (result == null) result = caseSACMElement(isTransferredTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.DOCUMENT_PROPERTY: {
				DocumentProperty documentProperty = (DocumentProperty)theEObject;
				T result = caseDocumentProperty(documentProperty);
				if (result == null) result = caseExhibitProperty(documentProperty);
				if (result == null) result = caseEvidenceProperty(documentProperty);
				if (result == null) result = caseEvidenceAssertion(documentProperty);
				if (result == null) result = caseEvidenceElement(documentProperty);
				if (result == null) result = caseModelElement(documentProperty);
				if (result == null) result = caseSACMElement(documentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_EVENT: {
				EvidenceEvent evidenceEvent = (EvidenceEvent)theEObject;
				T result = caseEvidenceEvent(evidenceEvent);
				if (result == null) result = caseEvidenceProperty(evidenceEvent);
				if (result == null) result = caseEvidenceAssertion(evidenceEvent);
				if (result == null) result = caseEvidenceElement(evidenceEvent);
				if (result == null) result = caseModelElement(evidenceEvent);
				if (result == null) result = caseSACMElement(evidenceEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.OWNED_BY: {
				OwnedBy ownedBy = (OwnedBy)theEObject;
				T result = caseOwnedBy(ownedBy);
				if (result == null) result = caseProvenance(ownedBy);
				if (result == null) result = caseEvidenceProperty(ownedBy);
				if (result == null) result = caseEvidenceAssertion(ownedBy);
				if (result == null) result = caseEvidenceElement(ownedBy);
				if (result == null) result = caseModelElement(ownedBy);
				if (result == null) result = caseSACMElement(ownedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.PROVENANCE: {
				Provenance provenance = (Provenance)theEObject;
				T result = caseProvenance(provenance);
				if (result == null) result = caseEvidenceProperty(provenance);
				if (result == null) result = caseEvidenceAssertion(provenance);
				if (result == null) result = caseEvidenceElement(provenance);
				if (result == null) result = caseModelElement(provenance);
				if (result == null) result = caseSACMElement(provenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.TIMING_PROPERTY: {
				TimingProperty timingProperty = (TimingProperty)theEObject;
				T result = caseTimingProperty(timingProperty);
				if (result == null) result = caseEvidenceProperty(timingProperty);
				if (result == null) result = caseEvidenceAssertion(timingProperty);
				if (result == null) result = caseEvidenceElement(timingProperty);
				if (result == null) result = caseModelElement(timingProperty);
				if (result == null) result = caseSACMElement(timingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_PART_OF: {
				IsPartOf isPartOf = (IsPartOf)theEObject;
				T result = caseIsPartOf(isPartOf);
				if (result == null) result = caseExhibitProperty(isPartOf);
				if (result == null) result = caseEvidenceProperty(isPartOf);
				if (result == null) result = caseEvidenceAssertion(isPartOf);
				if (result == null) result = caseEvidenceElement(isPartOf);
				if (result == null) result = caseModelElement(isPartOf);
				if (result == null) result = caseSACMElement(isPartOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_REVOKED_AT: {
				IsRevokedAt isRevokedAt = (IsRevokedAt)theEObject;
				T result = caseIsRevokedAt(isRevokedAt);
				if (result == null) result = caseEvidenceEvent(isRevokedAt);
				if (result == null) result = caseEvidenceProperty(isRevokedAt);
				if (result == null) result = caseEvidenceAssertion(isRevokedAt);
				if (result == null) result = caseEvidenceElement(isRevokedAt);
				if (result == null) result = caseModelElement(isRevokedAt);
				if (result == null) result = caseSACMElement(isRevokedAt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.PROVIDES_CONTEXT: {
				ProvidesContext providesContext = (ProvidesContext)theEObject;
				T result = caseProvidesContext(providesContext);
				if (result == null) result = caseEvidenceInterpretation(providesContext);
				if (result == null) result = caseEvidenceEvaluation(providesContext);
				if (result == null) result = caseEvidenceAssertion(providesContext);
				if (result == null) result = caseEvidenceElement(providesContext);
				if (result == null) result = caseModelElement(providesContext);
				if (result == null) result = caseSACMElement(providesContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.FORMAL_OBJECT: {
				FormalObject formalObject = (FormalObject)theEObject;
				T result = caseFormalObject(formalObject);
				if (result == null) result = caseFormalElement(formalObject);
				if (result == null) result = caseEvidenceItem(formalObject);
				if (result == null) result = caseEvidenceElement(formalObject);
				if (result == null) result = caseModelElement(formalObject);
				if (result == null) result = caseSACMElement(formalObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.MEANS_THAT: {
				MeansThat meansThat = (MeansThat)theEObject;
				T result = caseMeansThat(meansThat);
				if (result == null) result = caseEvidenceInterpretation(meansThat);
				if (result == null) result = caseEvidenceEvaluation(meansThat);
				if (result == null) result = caseEvidenceAssertion(meansThat);
				if (result == null) result = caseEvidenceElement(meansThat);
				if (result == null) result = caseModelElement(meansThat);
				if (result == null) result = caseSACMElement(meansThat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_ELEMENT: {
				EvidenceElement evidenceElement = (EvidenceElement)theEObject;
				T result = caseEvidenceElement(evidenceElement);
				if (result == null) result = caseModelElement(evidenceElement);
				if (result == null) result = caseSACMElement(evidenceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CARE_OF: {
				CareOf careOf = (CareOf)theEObject;
				T result = caseCareOf(careOf);
				if (result == null) result = caseCustodyProperty(careOf);
				if (result == null) result = caseEvidenceProperty(careOf);
				if (result == null) result = caseEvidenceAssertion(careOf);
				if (result == null) result = caseEvidenceElement(careOf);
				if (result == null) result = caseModelElement(careOf);
				if (result == null) result = caseSACMElement(careOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CUSTODY_PROPERTY: {
				CustodyProperty custodyProperty = (CustodyProperty)theEObject;
				T result = caseCustodyProperty(custodyProperty);
				if (result == null) result = caseEvidenceProperty(custodyProperty);
				if (result == null) result = caseEvidenceAssertion(custodyProperty);
				if (result == null) result = caseEvidenceElement(custodyProperty);
				if (result == null) result = caseModelElement(custodyProperty);
				if (result == null) result = caseSACMElement(custodyProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.AT_LOCATION: {
				AtLocation atLocation = (AtLocation)theEObject;
				T result = caseAtLocation(atLocation);
				if (result == null) result = caseCustodyProperty(atLocation);
				if (result == null) result = caseEvidenceProperty(atLocation);
				if (result == null) result = caseEvidenceAssertion(atLocation);
				if (result == null) result = caseEvidenceElement(atLocation);
				if (result == null) result = caseModelElement(atLocation);
				if (result == null) result = caseSACMElement(atLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_CREATED_AT: {
				IsCreatedAt isCreatedAt = (IsCreatedAt)theEObject;
				T result = caseIsCreatedAt(isCreatedAt);
				if (result == null) result = caseEvidenceEvent(isCreatedAt);
				if (result == null) result = caseEvidenceProperty(isCreatedAt);
				if (result == null) result = caseEvidenceAssertion(isCreatedAt);
				if (result == null) result = caseEvidenceElement(isCreatedAt);
				if (result == null) result = caseModelElement(isCreatedAt);
				if (result == null) result = caseSACMElement(isCreatedAt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.REQUIRES_CONTAINER: {
				RequiresContainer requiresContainer = (RequiresContainer)theEObject;
				T result = caseRequiresContainer(requiresContainer);
				if (result == null) result = caseProjectProperty(requiresContainer);
				if (result == null) result = caseEvidenceProperty(requiresContainer);
				if (result == null) result = caseEvidenceAssertion(requiresContainer);
				if (result == null) result = caseEvidenceElement(requiresContainer);
				if (result == null) result = caseModelElement(requiresContainer);
				if (result == null) result = caseSACMElement(requiresContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.PROJECT_PROPERTY: {
				ProjectProperty projectProperty = (ProjectProperty)theEObject;
				T result = caseProjectProperty(projectProperty);
				if (result == null) result = caseEvidenceProperty(projectProperty);
				if (result == null) result = caseEvidenceAssertion(projectProperty);
				if (result == null) result = caseEvidenceElement(projectProperty);
				if (result == null) result = caseModelElement(projectProperty);
				if (result == null) result = caseSACMElement(projectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseCollectionMethod(service);
				if (result == null) result = caseProjectElement(service);
				if (result == null) result = caseEvidenceElement(service);
				if (result == null) result = caseModelElement(service);
				if (result == null) result = caseSACMElement(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.HAS_ELECTRONIC_SOURCE: {
				HasElectronicSource hasElectronicSource = (HasElectronicSource)theEObject;
				T result = caseHasElectronicSource(hasElectronicSource);
				if (result == null) result = caseExhibitProperty(hasElectronicSource);
				if (result == null) result = caseEvidenceProperty(hasElectronicSource);
				if (result == null) result = caseEvidenceAssertion(hasElectronicSource);
				if (result == null) result = caseEvidenceElement(hasElectronicSource);
				if (result == null) result = caseModelElement(hasElectronicSource);
				if (result == null) result = caseSACMElement(hasElectronicSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE: {
				IsExpressedInLanguage isExpressedInLanguage = (IsExpressedInLanguage)theEObject;
				T result = caseIsExpressedInLanguage(isExpressedInLanguage);
				if (result == null) result = caseDocumentProperty(isExpressedInLanguage);
				if (result == null) result = caseExhibitProperty(isExpressedInLanguage);
				if (result == null) result = caseEvidenceProperty(isExpressedInLanguage);
				if (result == null) result = caseEvidenceAssertion(isExpressedInLanguage);
				if (result == null) result = caseEvidenceElement(isExpressedInLanguage);
				if (result == null) result = caseModelElement(isExpressedInLanguage);
				if (result == null) result = caseSACMElement(isExpressedInLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.USING_PROCESS: {
				UsingProcess usingProcess = (UsingProcess)theEObject;
				T result = caseUsingProcess(usingProcess);
				if (result == null) result = caseCustodyProperty(usingProcess);
				if (result == null) result = caseEvidenceProperty(usingProcess);
				if (result == null) result = caseEvidenceAssertion(usingProcess);
				if (result == null) result = caseEvidenceElement(usingProcess);
				if (result == null) result = caseModelElement(usingProcess);
				if (result == null) result = caseSACMElement(usingProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.HAS_SECURITY_CLASSIFICATION: {
				HasSecurityClassification hasSecurityClassification = (HasSecurityClassification)theEObject;
				T result = caseHasSecurityClassification(hasSecurityClassification);
				if (result == null) result = caseDocumentProperty(hasSecurityClassification);
				if (result == null) result = caseExhibitProperty(hasSecurityClassification);
				if (result == null) result = caseEvidenceProperty(hasSecurityClassification);
				if (result == null) result = caseEvidenceAssertion(hasSecurityClassification);
				if (result == null) result = caseEvidenceElement(hasSecurityClassification);
				if (result == null) result = caseModelElement(hasSecurityClassification);
				if (result == null) result = caseSACMElement(hasSecurityClassification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_RELEASEABLE_TO: {
				IsReleaseableTo isReleaseableTo = (IsReleaseableTo)theEObject;
				T result = caseIsReleaseableTo(isReleaseableTo);
				if (result == null) result = caseDocumentProperty(isReleaseableTo);
				if (result == null) result = caseExhibitProperty(isReleaseableTo);
				if (result == null) result = caseEvidenceProperty(isReleaseableTo);
				if (result == null) result = caseEvidenceAssertion(isReleaseableTo);
				if (result == null) result = caseEvidenceElement(isReleaseableTo);
				if (result == null) result = caseModelElement(isReleaseableTo);
				if (result == null) result = caseSACMElement(isReleaseableTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_GROUP: {
				EvidenceGroup evidenceGroup = (EvidenceGroup)theEObject;
				T result = caseEvidenceGroup(evidenceGroup);
				if (result == null) result = caseEvidenceItem(evidenceGroup);
				if (result == null) result = caseEvidenceElement(evidenceGroup);
				if (result == null) result = caseModelElement(evidenceGroup);
				if (result == null) result = caseSACMElement(evidenceGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.HAS_VERSION: {
				HasVersion hasVersion = (HasVersion)theEObject;
				T result = caseHasVersion(hasVersion);
				if (result == null) result = caseDocumentProperty(hasVersion);
				if (result == null) result = caseExhibitProperty(hasVersion);
				if (result == null) result = caseEvidenceProperty(hasVersion);
				if (result == null) result = caseEvidenceAssertion(hasVersion);
				if (result == null) result = caseEvidenceElement(hasVersion);
				if (result == null) result = caseModelElement(hasVersion);
				if (result == null) result = caseSACMElement(hasVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.HAS_MEDIA: {
				HasMedia hasMedia = (HasMedia)theEObject;
				T result = caseHasMedia(hasMedia);
				if (result == null) result = caseExhibitProperty(hasMedia);
				if (result == null) result = caseEvidenceProperty(hasMedia);
				if (result == null) result = caseEvidenceAssertion(hasMedia);
				if (result == null) result = caseEvidenceElement(hasMedia);
				if (result == null) result = caseModelElement(hasMedia);
				if (result == null) result = caseSACMElement(hasMedia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EXHIBIT: {
				Exhibit exhibit = (Exhibit)theEObject;
				T result = caseExhibit(exhibit);
				if (result == null) result = caseEvidenceItem(exhibit);
				if (result == null) result = caseEvidenceElement(exhibit);
				if (result == null) result = caseModelElement(exhibit);
				if (result == null) result = caseSACMElement(exhibit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.FORMAL_ELEMENT: {
				FormalElement formalElement = (FormalElement)theEObject;
				T result = caseFormalElement(formalElement);
				if (result == null) result = caseEvidenceItem(formalElement);
				if (result == null) result = caseEvidenceElement(formalElement);
				if (result == null) result = caseModelElement(formalElement);
				if (result == null) result = caseSACMElement(formalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EXHIBIT_PROPERTY: {
				ExhibitProperty exhibitProperty = (ExhibitProperty)theEObject;
				T result = caseExhibitProperty(exhibitProperty);
				if (result == null) result = caseEvidenceProperty(exhibitProperty);
				if (result == null) result = caseEvidenceAssertion(exhibitProperty);
				if (result == null) result = caseEvidenceElement(exhibitProperty);
				if (result == null) result = caseModelElement(exhibitProperty);
				if (result == null) result = caseSACMElement(exhibitProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_INTERPRETATION: {
				EvidenceInterpretation evidenceInterpretation = (EvidenceInterpretation)theEObject;
				T result = caseEvidenceInterpretation(evidenceInterpretation);
				if (result == null) result = caseEvidenceEvaluation(evidenceInterpretation);
				if (result == null) result = caseEvidenceAssertion(evidenceInterpretation);
				if (result == null) result = caseEvidenceElement(evidenceInterpretation);
				if (result == null) result = caseModelElement(evidenceInterpretation);
				if (result == null) result = caseSACMElement(evidenceInterpretation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_ASSERTION: {
				EvidenceAssertion evidenceAssertion = (EvidenceAssertion)theEObject;
				T result = caseEvidenceAssertion(evidenceAssertion);
				if (result == null) result = caseEvidenceElement(evidenceAssertion);
				if (result == null) result = caseModelElement(evidenceAssertion);
				if (result == null) result = caseSACMElement(evidenceAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_PROPERTY: {
				EvidenceProperty evidenceProperty = (EvidenceProperty)theEObject;
				T result = caseEvidenceProperty(evidenceProperty);
				if (result == null) result = caseEvidenceAssertion(evidenceProperty);
				if (result == null) result = caseEvidenceElement(evidenceProperty);
				if (result == null) result = caseModelElement(evidenceProperty);
				if (result == null) result = caseSACMElement(evidenceProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EXTENDED_EVIDENCE_ATTRIBUTE: {
				ExtendedEvidenceAttribute extendedEvidenceAttribute = (ExtendedEvidenceAttribute)theEObject;
				T result = caseExtendedEvidenceAttribute(extendedEvidenceAttribute);
				if (result == null) result = caseEvidenceAttribute(extendedEvidenceAttribute);
				if (result == null) result = caseEvidenceAssertion(extendedEvidenceAttribute);
				if (result == null) result = caseEvidenceElement(extendedEvidenceAttribute);
				if (result == null) result = caseModelElement(extendedEvidenceAttribute);
				if (result == null) result = caseSACMElement(extendedEvidenceAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EXTENDED_DOCUMENT_PROPERTY: {
				ExtendedDocumentProperty extendedDocumentProperty = (ExtendedDocumentProperty)theEObject;
				T result = caseExtendedDocumentProperty(extendedDocumentProperty);
				if (result == null) result = caseDocumentProperty(extendedDocumentProperty);
				if (result == null) result = caseExhibitProperty(extendedDocumentProperty);
				if (result == null) result = caseEvidenceProperty(extendedDocumentProperty);
				if (result == null) result = caseEvidenceAssertion(extendedDocumentProperty);
				if (result == null) result = caseEvidenceElement(extendedDocumentProperty);
				if (result == null) result = caseModelElement(extendedDocumentProperty);
				if (result == null) result = caseSACMElement(extendedDocumentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.RECORD: {
				Record record = (Record)theEObject;
				T result = caseRecord(record);
				if (result == null) result = caseEvidenceItem(record);
				if (result == null) result = caseEvidenceElement(record);
				if (result == null) result = caseModelElement(record);
				if (result == null) result = caseSACMElement(record);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.OBJECTIFIED_ASSERTION: {
				ObjectifiedAssertion objectifiedAssertion = (ObjectifiedAssertion)theEObject;
				T result = caseObjectifiedAssertion(objectifiedAssertion);
				if (result == null) result = caseFormalObject(objectifiedAssertion);
				if (result == null) result = caseFormalElement(objectifiedAssertion);
				if (result == null) result = caseEvidenceItem(objectifiedAssertion);
				if (result == null) result = caseEvidenceElement(objectifiedAssertion);
				if (result == null) result = caseModelElement(objectifiedAssertion);
				if (result == null) result = caseSACMElement(objectifiedAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_MODIFIED_BY: {
				IsModifiedBy isModifiedBy = (IsModifiedBy)theEObject;
				T result = caseIsModifiedBy(isModifiedBy);
				if (result == null) result = caseEvidenceEvent(isModifiedBy);
				if (result == null) result = caseEvidenceProperty(isModifiedBy);
				if (result == null) result = caseEvidenceAssertion(isModifiedBy);
				if (result == null) result = caseEvidenceElement(isModifiedBy);
				if (result == null) result = caseModelElement(isModifiedBy);
				if (result == null) result = caseSACMElement(isModifiedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.PERFORMED_BY: {
				PerformedBy performedBy = (PerformedBy)theEObject;
				T result = casePerformedBy(performedBy);
				if (result == null) result = caseProvenance(performedBy);
				if (result == null) result = caseEvidenceProperty(performedBy);
				if (result == null) result = caseEvidenceAssertion(performedBy);
				if (result == null) result = caseEvidenceElement(performedBy);
				if (result == null) result = caseModelElement(performedBy);
				if (result == null) result = caseSACMElement(performedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CONTAINER_CONSISTENCY: {
				ContainerConsistency containerConsistency = (ContainerConsistency)theEObject;
				T result = caseContainerConsistency(containerConsistency);
				if (result == null) result = caseProjectProperty(containerConsistency);
				if (result == null) result = caseEvidenceProperty(containerConsistency);
				if (result == null) result = caseEvidenceAssertion(containerConsistency);
				if (result == null) result = caseEvidenceElement(containerConsistency);
				if (result == null) result = caseModelElement(containerConsistency);
				if (result == null) result = caseSACMElement(containerConsistency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CONTAINER_COMPLETENESS: {
				ContainerCompleteness containerCompleteness = (ContainerCompleteness)theEObject;
				T result = caseContainerCompleteness(containerCompleteness);
				if (result == null) result = caseProjectProperty(containerCompleteness);
				if (result == null) result = caseEvidenceProperty(containerCompleteness);
				if (result == null) result = caseEvidenceAssertion(containerCompleteness);
				if (result == null) result = caseEvidenceElement(containerCompleteness);
				if (result == null) result = caseModelElement(containerCompleteness);
				if (result == null) result = caseSACMElement(containerCompleteness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.COMPLIES_TO: {
				CompliesTo compliesTo = (CompliesTo)theEObject;
				T result = caseCompliesTo(compliesTo);
				if (result == null) result = caseProjectProperty(compliesTo);
				if (result == null) result = caseEvidenceProperty(compliesTo);
				if (result == null) result = caseEvidenceAssertion(compliesTo);
				if (result == null) result = caseEvidenceElement(compliesTo);
				if (result == null) result = caseModelElement(compliesTo);
				if (result == null) result = caseSACMElement(compliesTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EXTENDED_PROJECT_PROPERTY: {
				ExtendedProjectProperty extendedProjectProperty = (ExtendedProjectProperty)theEObject;
				T result = caseExtendedProjectProperty(extendedProjectProperty);
				if (result == null) result = caseProjectProperty(extendedProjectProperty);
				if (result == null) result = caseEvidenceProperty(extendedProjectProperty);
				if (result == null) result = caseEvidenceAssertion(extendedProjectProperty);
				if (result == null) result = caseEvidenceElement(extendedProjectProperty);
				if (result == null) result = caseModelElement(extendedProjectProperty);
				if (result == null) result = caseSACMElement(extendedProjectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceAttribute(EvidenceAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consistency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consistency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsistency(Consistency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Completeness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Completeness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompleteness(Completeness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfidence(Confidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Approved By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Approved By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApprovedBy(ApprovedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Created By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Created By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreatedBy(CreatedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceItem(EvidenceItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Based On</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Based On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsBasedOn(IsBasedOn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalAssertion(FormalAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsA(IsA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Characterized By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Characterized By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsCharacterizedBy(IsCharacterizedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceContainer(EvidenceContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndTime(EndTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertion(Assertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(net.certware.sacm.SACM.Evidence.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeObject(CompositeObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleBinding(RoleBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartTime(StartTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relevance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relevance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelevance(Relevance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Significance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Significance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignificance(Significance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accuracy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accuracy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccuracy(Accuracy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Role In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Role In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasRoleIn(HasRoleIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Scoped By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Scoped By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsScopedBy(IsScopedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effective Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effective Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectiveTime(EffectiveTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>At Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>At Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtTime(AtTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Originality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Originality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOriginality(Originality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reporting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reporting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReporting(Reporting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reliability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reliability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReliability(Reliability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupports(Supports object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Generated At</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Generated At</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsGeneratedAt(IsGeneratedAt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionMethod(CollectionMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceRelation(EvidenceRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupport(Support object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conflicts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conflicts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConflicts(Conflicts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refutes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refutes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefutes(Refutes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegates(Negates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownObject(UnknownObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceEvaluation(EvidenceEvaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolves</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolves</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolves(Resolves object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStakeholder(Stakeholder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceRequest(EvidenceRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectObjective(ProjectObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Depends On</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Depends On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependsOn(DependsOn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satisfies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satisfies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatisfies(Satisfies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectElement(ProjectElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenced Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenced Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencedClaim(ReferencedClaim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceObservation(EvidenceObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceResolution(EvidenceResolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weakens</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weakens</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeakens(Weakens object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amplifies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amplifies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmplifies(Amplifies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContributes(Contributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Challenges</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Challenges</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChallenges(Challenges object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strength</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strength</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrength(Strength object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Acquired At</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Acquired At</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsAcquiredAt(IsAcquiredAt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Transferred To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Transferred To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsTransferredTo(IsTransferredTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentProperty(DocumentProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceEvent(EvidenceEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Owned By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Owned By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwnedBy(OwnedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvenance(Provenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingProperty(TimingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Part Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Part Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsPartOf(IsPartOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Revoked At</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Revoked At</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsRevokedAt(IsRevokedAt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provides Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provides Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidesContext(ProvidesContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalObject(FormalObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Means That</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Means That</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeansThat(MeansThat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceElement(EvidenceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCareOf(CareOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custody Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custody Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustodyProperty(CustodyProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>At Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>At Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtLocation(AtLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Created At</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Created At</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsCreatedAt(IsCreatedAt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requires Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requires Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiresContainer(RequiresContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectProperty(ProjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Electronic Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Electronic Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasElectronicSource(HasElectronicSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Expressed In Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Expressed In Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsExpressedInLanguage(IsExpressedInLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Using Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Using Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsingProcess(UsingProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Security Classification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Security Classification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasSecurityClassification(HasSecurityClassification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Releaseable To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Releaseable To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsReleaseableTo(IsReleaseableTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceGroup(EvidenceGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasVersion(HasVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasMedia(HasMedia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exhibit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exhibit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExhibit(Exhibit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalElement(FormalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exhibit Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exhibit Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExhibitProperty(ExhibitProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interpretation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interpretation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceInterpretation(EvidenceInterpretation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceAssertion(EvidenceAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceProperty(EvidenceProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Evidence Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Evidence Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedEvidenceAttribute(ExtendedEvidenceAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Document Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Document Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedDocumentProperty(ExtendedDocumentProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecord(Record object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objectified Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objectified Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectifiedAssertion(ObjectifiedAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Modified By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Modified By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsModifiedBy(IsModifiedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performed By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performed By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformedBy(PerformedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Consistency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Consistency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerConsistency(ContainerConsistency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Completeness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Completeness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerCompleteness(ContainerCompleteness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complies To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complies To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompliesTo(CompliesTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Project Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Project Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedProjectProperty(ExtendedProjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSACMElement(SACMElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utility Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utility Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtilityElement(UtilityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EvidenceSwitch
