/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.evidence.evidence.util;

import java.util.List;

import net.certware.evidence.evidence.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see net.certware.evidence.evidence.EvidencePackage
 * @generated
 */
public class EvidenceSwitch<T> {
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
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EvidencePackage.EVIDENCE_ATTRIBUTE: {
				EvidenceAttribute evidenceAttribute = (EvidenceAttribute)theEObject;
				T result = caseEvidenceAttribute(evidenceAttribute);
				if (result == null) result = caseEvaluationAttribute(evidenceAttribute);
				if (result == null) result = caseElement(evidenceAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CONSISTENCY: {
				Consistency consistency = (Consistency)theEObject;
				T result = caseConsistency(consistency);
				if (result == null) result = caseDocumentAttribute(consistency);
				if (result == null) result = caseEvaluationAttribute(consistency);
				if (result == null) result = caseElement(consistency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.COMPLETENESS: {
				Completeness completeness = (Completeness)theEObject;
				T result = caseCompleteness(completeness);
				if (result == null) result = caseDocumentAttribute(completeness);
				if (result == null) result = caseEvaluationAttribute(completeness);
				if (result == null) result = caseElement(completeness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = caseExhibit(document);
				if (result == null) result = caseEvidenceItem(document);
				if (result == null) result = caseEvidenceElement(document);
				if (result == null) result = caseElement(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CONFIDENCE: {
				Confidence confidence = (Confidence)theEObject;
				T result = caseConfidence(confidence);
				if (result == null) result = caseEvidenceAttribute(confidence);
				if (result == null) result = caseEvaluationAttribute(confidence);
				if (result == null) result = caseElement(confidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.APPROVED_BY: {
				ApprovedBy approvedBy = (ApprovedBy)theEObject;
				T result = caseApprovedBy(approvedBy);
				if (result == null) result = caseProvenance(approvedBy);
				if (result == null) result = caseEvidenceProperty(approvedBy);
				if (result == null) result = caseElement(approvedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.DESCRIPTION: {
				Description description = (Description)theEObject;
				T result = caseDescription(description);
				if (result == null) result = caseElement(description);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CREATED_BY: {
				CreatedBy createdBy = (CreatedBy)theEObject;
				T result = caseCreatedBy(createdBy);
				if (result == null) result = caseProvenance(createdBy);
				if (result == null) result = caseEvidenceProperty(createdBy);
				if (result == null) result = caseElement(createdBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = caseCollectionMethod(tool);
				if (result == null) result = caseObject(tool);
				if (result == null) result = caseFormalObject(tool);
				if (result == null) result = caseDomainObject(tool);
				if (result == null) result = caseMeaning(tool);
				if (result == null) result = caseEvidenceItem(tool);
				if (result == null) result = caseEvidenceElement(tool);
				if (result == null) result = caseElement(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = caseCollectionMethod(method);
				if (result == null) result = caseObject(method);
				if (result == null) result = caseFormalObject(method);
				if (result == null) result = caseDomainObject(method);
				if (result == null) result = caseMeaning(method);
				if (result == null) result = caseEvidenceItem(method);
				if (result == null) result = caseEvidenceElement(method);
				if (result == null) result = caseElement(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.REQUIRES_TOOL: {
				RequiresTool requiresTool = (RequiresTool)theEObject;
				T result = caseRequiresTool(requiresTool);
				if (result == null) result = caseEvidenceProperty(requiresTool);
				if (result == null) result = caseElement(requiresTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_ITEM: {
				EvidenceItem evidenceItem = (EvidenceItem)theEObject;
				T result = caseEvidenceItem(evidenceItem);
				if (result == null) result = caseEvidenceElement(evidenceItem);
				if (result == null) result = caseElement(evidenceItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_BASED_ON: {
				IsBasedOn isBasedOn = (IsBasedOn)theEObject;
				T result = caseIsBasedOn(isBasedOn);
				if (result == null) result = caseDocumentProperty(isBasedOn);
				if (result == null) result = caseEvidenceProperty(isBasedOn);
				if (result == null) result = caseElement(isBasedOn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.DOMAIN_ASSERTION: {
				DomainAssertion domainAssertion = (DomainAssertion)theEObject;
				T result = caseDomainAssertion(domainAssertion);
				if (result == null) result = caseMeaning(domainAssertion);
				if (result == null) result = caseEvidenceItem(domainAssertion);
				if (result == null) result = caseEvidenceElement(domainAssertion);
				if (result == null) result = caseElement(domainAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_A: {
				IsA isA = (IsA)theEObject;
				T result = caseIsA(isA);
				if (result == null) result = caseEvidenceInterpretation(isA);
				if (result == null) result = caseEvidenceEvaluation(isA);
				if (result == null) result = caseEvidenceElement(isA);
				if (result == null) result = caseElement(isA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_CHARACTERIZED_BY: {
				IsCharacterizedBy isCharacterizedBy = (IsCharacterizedBy)theEObject;
				T result = caseIsCharacterizedBy(isCharacterizedBy);
				if (result == null) result = caseEvidenceInterpretation(isCharacterizedBy);
				if (result == null) result = caseEvidenceEvaluation(isCharacterizedBy);
				if (result == null) result = caseEvidenceElement(isCharacterizedBy);
				if (result == null) result = caseElement(isCharacterizedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseOriginator(person);
				if (result == null) result = caseObject(person);
				if (result == null) result = caseFormalObject(person);
				if (result == null) result = caseDomainObject(person);
				if (result == null) result = caseMeaning(person);
				if (result == null) result = caseEvidenceItem(person);
				if (result == null) result = caseEvidenceElement(person);
				if (result == null) result = caseElement(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseOriginator(organization);
				if (result == null) result = caseObject(organization);
				if (result == null) result = caseFormalObject(organization);
				if (result == null) result = caseDomainObject(organization);
				if (result == null) result = caseMeaning(organization);
				if (result == null) result = caseEvidenceItem(organization);
				if (result == null) result = caseEvidenceElement(organization);
				if (result == null) result = caseElement(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.PACKAGE: {
				net.certware.evidence.evidence.Package package_ = (net.certware.evidence.evidence.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseAdministrativeElement(package_);
				if (result == null) result = caseElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.END_TIME: {
				EndTime endTime = (EndTime)theEObject;
				T result = caseEndTime(endTime);
				if (result == null) result = caseEffectiveTime(endTime);
				if (result == null) result = caseTimingProperty(endTime);
				if (result == null) result = caseEvidenceProperty(endTime);
				if (result == null) result = caseElement(endTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.ASSERTION: {
				Assertion assertion = (Assertion)theEObject;
				T result = caseAssertion(assertion);
				if (result == null) result = caseDomainAssertion(assertion);
				if (result == null) result = caseMeaning(assertion);
				if (result == null) result = caseEvidenceItem(assertion);
				if (result == null) result = caseEvidenceElement(assertion);
				if (result == null) result = caseElement(assertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.FORMAL_OBJECT: {
				FormalObject formalObject = (FormalObject)theEObject;
				T result = caseFormalObject(formalObject);
				if (result == null) result = caseDomainObject(formalObject);
				if (result == null) result = caseMeaning(formalObject);
				if (result == null) result = caseEvidenceItem(formalObject);
				if (result == null) result = caseEvidenceElement(formalObject);
				if (result == null) result = caseElement(formalObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.OBJECT: {
				net.certware.evidence.evidence.Object object = (net.certware.evidence.evidence.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = caseFormalObject(object);
				if (result == null) result = caseDomainObject(object);
				if (result == null) result = caseMeaning(object);
				if (result == null) result = caseEvidenceItem(object);
				if (result == null) result = caseEvidenceElement(object);
				if (result == null) result = caseElement(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.COMPOSITE_SUBJECT: {
				CompositeSubject compositeSubject = (CompositeSubject)theEObject;
				T result = caseCompositeSubject(compositeSubject);
				if (result == null) result = caseDomainObject(compositeSubject);
				if (result == null) result = caseMeaning(compositeSubject);
				if (result == null) result = caseEvidenceItem(compositeSubject);
				if (result == null) result = caseEvidenceElement(compositeSubject);
				if (result == null) result = caseElement(compositeSubject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.ROLE_BINDING: {
				RoleBinding roleBinding = (RoleBinding)theEObject;
				T result = caseRoleBinding(roleBinding);
				if (result == null) result = caseElement(roleBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.START_TIME: {
				StartTime startTime = (StartTime)theEObject;
				T result = caseStartTime(startTime);
				if (result == null) result = caseEffectiveTime(startTime);
				if (result == null) result = caseTimingProperty(startTime);
				if (result == null) result = caseEvidenceProperty(startTime);
				if (result == null) result = caseElement(startTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.RELEVANCE: {
				Relevance relevance = (Relevance)theEObject;
				T result = caseRelevance(relevance);
				if (result == null) result = caseEvidenceAttribute(relevance);
				if (result == null) result = caseEvaluationAttribute(relevance);
				if (result == null) result = caseElement(relevance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.SIGNIFICANCE: {
				Significance significance = (Significance)theEObject;
				T result = caseSignificance(significance);
				if (result == null) result = caseEvidenceAttribute(significance);
				if (result == null) result = caseEvaluationAttribute(significance);
				if (result == null) result = caseElement(significance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.ACCURACY: {
				Accuracy accuracy = (Accuracy)theEObject;
				T result = caseAccuracy(accuracy);
				if (result == null) result = caseEvidenceAttribute(accuracy);
				if (result == null) result = caseEvaluationAttribute(accuracy);
				if (result == null) result = caseElement(accuracy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.HAS_ROLE_IN: {
				HasRoleIn hasRoleIn = (HasRoleIn)theEObject;
				T result = caseHasRoleIn(hasRoleIn);
				if (result == null) result = caseEvidenceProperty(hasRoleIn);
				if (result == null) result = caseElement(hasRoleIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_SCOPED_BY: {
				IsScopedBy isScopedBy = (IsScopedBy)theEObject;
				T result = caseIsScopedBy(isScopedBy);
				if (result == null) result = caseEvidenceInterpretation(isScopedBy);
				if (result == null) result = caseEvidenceEvaluation(isScopedBy);
				if (result == null) result = caseEvidenceElement(isScopedBy);
				if (result == null) result = caseElement(isScopedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EFFECTIVE_TIME: {
				EffectiveTime effectiveTime = (EffectiveTime)theEObject;
				T result = caseEffectiveTime(effectiveTime);
				if (result == null) result = caseTimingProperty(effectiveTime);
				if (result == null) result = caseEvidenceProperty(effectiveTime);
				if (result == null) result = caseElement(effectiveTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.AT_TIME: {
				AtTime atTime = (AtTime)theEObject;
				T result = caseAtTime(atTime);
				if (result == null) result = caseTimingProperty(atTime);
				if (result == null) result = caseEvidenceProperty(atTime);
				if (result == null) result = caseElement(atTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.ORIGINALITY: {
				Originality originality = (Originality)theEObject;
				T result = caseOriginality(originality);
				if (result == null) result = caseDocumentAttribute(originality);
				if (result == null) result = caseEvaluationAttribute(originality);
				if (result == null) result = caseElement(originality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.REPORTING: {
				Reporting reporting = (Reporting)theEObject;
				T result = caseReporting(reporting);
				if (result == null) result = caseEvidenceAttribute(reporting);
				if (result == null) result = caseEvaluationAttribute(reporting);
				if (result == null) result = caseElement(reporting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.RELIABILITY: {
				Reliability reliability = (Reliability)theEObject;
				T result = caseReliability(reliability);
				if (result == null) result = caseDocumentAttribute(reliability);
				if (result == null) result = caseEvaluationAttribute(reliability);
				if (result == null) result = caseElement(reliability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.SUPPORTS: {
				Supports supports = (Supports)theEObject;
				T result = caseSupports(supports);
				if (result == null) result = caseEvidenceRelation(supports);
				if (result == null) result = caseEvidenceEvaluation(supports);
				if (result == null) result = caseEvidenceElement(supports);
				if (result == null) result = caseElement(supports);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_GENERATED_AT: {
				IsGeneratedAt isGeneratedAt = (IsGeneratedAt)theEObject;
				T result = caseIsGeneratedAt(isGeneratedAt);
				if (result == null) result = caseEvidenceEvent(isGeneratedAt);
				if (result == null) result = caseEvidenceElement(isGeneratedAt);
				if (result == null) result = caseElement(isGeneratedAt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.COLLECTION_METHOD: {
				CollectionMethod collectionMethod = (CollectionMethod)theEObject;
				T result = caseCollectionMethod(collectionMethod);
				if (result == null) result = caseObject(collectionMethod);
				if (result == null) result = caseFormalObject(collectionMethod);
				if (result == null) result = caseDomainObject(collectionMethod);
				if (result == null) result = caseMeaning(collectionMethod);
				if (result == null) result = caseEvidenceItem(collectionMethod);
				if (result == null) result = caseEvidenceElement(collectionMethod);
				if (result == null) result = caseElement(collectionMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_RELATION: {
				EvidenceRelation evidenceRelation = (EvidenceRelation)theEObject;
				T result = caseEvidenceRelation(evidenceRelation);
				if (result == null) result = caseEvidenceEvaluation(evidenceRelation);
				if (result == null) result = caseEvidenceElement(evidenceRelation);
				if (result == null) result = caseElement(evidenceRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.SUPPORT: {
				Support support = (Support)theEObject;
				T result = caseSupport(support);
				if (result == null) result = caseEvidenceAttribute(support);
				if (result == null) result = caseEvaluationAttribute(support);
				if (result == null) result = caseElement(support);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CONFLICTS: {
				Conflicts conflicts = (Conflicts)theEObject;
				T result = caseConflicts(conflicts);
				if (result == null) result = caseEvidenceObservation(conflicts);
				if (result == null) result = caseEvidenceEvaluation(conflicts);
				if (result == null) result = caseEvidenceElement(conflicts);
				if (result == null) result = caseElement(conflicts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.RATIONALE: {
				Rationale rationale = (Rationale)theEObject;
				T result = caseRationale(rationale);
				if (result == null) result = caseElement(rationale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.REFUTES: {
				Refutes refutes = (Refutes)theEObject;
				T result = caseRefutes(refutes);
				if (result == null) result = caseEvidenceResolution(refutes);
				if (result == null) result = caseEvidenceEvaluation(refutes);
				if (result == null) result = caseEvidenceElement(refutes);
				if (result == null) result = caseElement(refutes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.NEGATES: {
				Negates negates = (Negates)theEObject;
				T result = caseNegates(negates);
				if (result == null) result = caseEvidenceResolution(negates);
				if (result == null) result = caseEvidenceEvaluation(negates);
				if (result == null) result = caseEvidenceElement(negates);
				if (result == null) result = caseElement(negates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.UNKNOWN_SUBJECT: {
				UnknownSubject unknownSubject = (UnknownSubject)theEObject;
				T result = caseUnknownSubject(unknownSubject);
				if (result == null) result = caseFormalObject(unknownSubject);
				if (result == null) result = caseDomainObject(unknownSubject);
				if (result == null) result = caseMeaning(unknownSubject);
				if (result == null) result = caseEvidenceItem(unknownSubject);
				if (result == null) result = caseEvidenceElement(unknownSubject);
				if (result == null) result = caseElement(unknownSubject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_EVALUATION: {
				EvidenceEvaluation evidenceEvaluation = (EvidenceEvaluation)theEObject;
				T result = caseEvidenceEvaluation(evidenceEvaluation);
				if (result == null) result = caseEvidenceElement(evidenceEvaluation);
				if (result == null) result = caseElement(evidenceEvaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.RESOLVES: {
				Resolves resolves = (Resolves)theEObject;
				T result = caseResolves(resolves);
				if (result == null) result = caseEvidenceResolution(resolves);
				if (result == null) result = caseEvidenceEvaluation(resolves);
				if (result == null) result = caseEvidenceElement(resolves);
				if (result == null) result = caseElement(resolves);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.ORIGINATOR: {
				Originator originator = (Originator)theEObject;
				T result = caseOriginator(originator);
				if (result == null) result = caseObject(originator);
				if (result == null) result = caseFormalObject(originator);
				if (result == null) result = caseDomainObject(originator);
				if (result == null) result = caseMeaning(originator);
				if (result == null) result = caseEvidenceItem(originator);
				if (result == null) result = caseEvidenceElement(originator);
				if (result == null) result = caseElement(originator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_REQUEST: {
				EvidenceRequest evidenceRequest = (EvidenceRequest)theEObject;
				T result = caseEvidenceRequest(evidenceRequest);
				if (result == null) result = caseAdministrativeElement(evidenceRequest);
				if (result == null) result = caseElement(evidenceRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.PROJECT_OBJECTIVE: {
				ProjectObjective projectObjective = (ProjectObjective)theEObject;
				T result = caseProjectObjective(projectObjective);
				if (result == null) result = caseAdministrativeElement(projectObjective);
				if (result == null) result = caseElement(projectObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseAdministrativeElement(activity);
				if (result == null) result = caseElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.DEPENDS_ON: {
				DependsOn dependsOn = (DependsOn)theEObject;
				T result = caseDependsOn(dependsOn);
				if (result == null) result = caseActivityProperty(dependsOn);
				if (result == null) result = caseAdministrativeProperty(dependsOn);
				if (result == null) result = caseElement(dependsOn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_ASSOCIATED_WITH: {
				IsAssociatedWith isAssociatedWith = (IsAssociatedWith)theEObject;
				T result = caseIsAssociatedWith(isAssociatedWith);
				if (result == null) result = caseActivityProperty(isAssociatedWith);
				if (result == null) result = caseAdministrativeProperty(isAssociatedWith);
				if (result == null) result = caseElement(isAssociatedWith);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.REQUIRES_METHOD: {
				RequiresMethod requiresMethod = (RequiresMethod)theEObject;
				T result = caseRequiresMethod(requiresMethod);
				if (result == null) result = caseActivityProperty(requiresMethod);
				if (result == null) result = caseAdministrativeProperty(requiresMethod);
				if (result == null) result = caseElement(requiresMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.SATISFIES: {
				Satisfies satisfies = (Satisfies)theEObject;
				T result = caseSatisfies(satisfies);
				if (result == null) result = caseActivityProperty(satisfies);
				if (result == null) result = caseAdministrativeProperty(satisfies);
				if (result == null) result = caseElement(satisfies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.ADMINISTRATIVE_ELEMENT: {
				AdministrativeElement administrativeElement = (AdministrativeElement)theEObject;
				T result = caseAdministrativeElement(administrativeElement);
				if (result == null) result = caseElement(administrativeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.DOMAIN_CLAIM: {
				DomainClaim domainClaim = (DomainClaim)theEObject;
				T result = caseDomainClaim(domainClaim);
				if (result == null) result = caseDomainAssertion(domainClaim);
				if (result == null) result = caseMeaning(domainClaim);
				if (result == null) result = caseEvidenceItem(domainClaim);
				if (result == null) result = caseEvidenceElement(domainClaim);
				if (result == null) result = caseElement(domainClaim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_OBSERVATION: {
				EvidenceObservation evidenceObservation = (EvidenceObservation)theEObject;
				T result = caseEvidenceObservation(evidenceObservation);
				if (result == null) result = caseEvidenceEvaluation(evidenceObservation);
				if (result == null) result = caseEvidenceElement(evidenceObservation);
				if (result == null) result = caseElement(evidenceObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_RESOLUTION: {
				EvidenceResolution evidenceResolution = (EvidenceResolution)theEObject;
				T result = caseEvidenceResolution(evidenceResolution);
				if (result == null) result = caseEvidenceEvaluation(evidenceResolution);
				if (result == null) result = caseEvidenceElement(evidenceResolution);
				if (result == null) result = caseElement(evidenceResolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.WEAKENS: {
				Weakens weakens = (Weakens)theEObject;
				T result = caseWeakens(weakens);
				if (result == null) result = caseContributes(weakens);
				if (result == null) result = caseEvidenceObservation(weakens);
				if (result == null) result = caseEvidenceEvaluation(weakens);
				if (result == null) result = caseEvidenceElement(weakens);
				if (result == null) result = caseElement(weakens);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.AMPLIFIES: {
				Amplifies amplifies = (Amplifies)theEObject;
				T result = caseAmplifies(amplifies);
				if (result == null) result = caseContributes(amplifies);
				if (result == null) result = caseEvidenceObservation(amplifies);
				if (result == null) result = caseEvidenceEvaluation(amplifies);
				if (result == null) result = caseEvidenceElement(amplifies);
				if (result == null) result = caseElement(amplifies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CONTRIBUTES: {
				Contributes contributes = (Contributes)theEObject;
				T result = caseContributes(contributes);
				if (result == null) result = caseEvidenceObservation(contributes);
				if (result == null) result = caseEvidenceEvaluation(contributes);
				if (result == null) result = caseEvidenceElement(contributes);
				if (result == null) result = caseElement(contributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CHALLENGES: {
				Challenges challenges = (Challenges)theEObject;
				T result = caseChallenges(challenges);
				if (result == null) result = caseEvidenceRelation(challenges);
				if (result == null) result = caseEvidenceEvaluation(challenges);
				if (result == null) result = caseEvidenceElement(challenges);
				if (result == null) result = caseElement(challenges);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.STRENGTH: {
				Strength strength = (Strength)theEObject;
				T result = caseStrength(strength);
				if (result == null) result = caseEvidenceAttribute(strength);
				if (result == null) result = caseEvaluationAttribute(strength);
				if (result == null) result = caseElement(strength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_ACQUIRED_AT: {
				IsAcquiredAt isAcquiredAt = (IsAcquiredAt)theEObject;
				T result = caseIsAcquiredAt(isAcquiredAt);
				if (result == null) result = caseEvidenceEvent(isAcquiredAt);
				if (result == null) result = caseEvidenceElement(isAcquiredAt);
				if (result == null) result = caseElement(isAcquiredAt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_TRANSFERRED_TO: {
				IsTransferredTo isTransferredTo = (IsTransferredTo)theEObject;
				T result = caseIsTransferredTo(isTransferredTo);
				if (result == null) result = caseEvidenceEvent(isTransferredTo);
				if (result == null) result = caseEvidenceElement(isTransferredTo);
				if (result == null) result = caseElement(isTransferredTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.DOCUMENT_ATTRIBUTE: {
				DocumentAttribute documentAttribute = (DocumentAttribute)theEObject;
				T result = caseDocumentAttribute(documentAttribute);
				if (result == null) result = caseEvaluationAttribute(documentAttribute);
				if (result == null) result = caseElement(documentAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_EVENT: {
				EvidenceEvent evidenceEvent = (EvidenceEvent)theEObject;
				T result = caseEvidenceEvent(evidenceEvent);
				if (result == null) result = caseEvidenceElement(evidenceEvent);
				if (result == null) result = caseElement(evidenceEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.OWNED_BY: {
				OwnedBy ownedBy = (OwnedBy)theEObject;
				T result = caseOwnedBy(ownedBy);
				if (result == null) result = caseProvenance(ownedBy);
				if (result == null) result = caseEvidenceProperty(ownedBy);
				if (result == null) result = caseElement(ownedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.PROVENANCE: {
				Provenance provenance = (Provenance)theEObject;
				T result = caseProvenance(provenance);
				if (result == null) result = caseEvidenceProperty(provenance);
				if (result == null) result = caseElement(provenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.TIMING_PROPERTY: {
				TimingProperty timingProperty = (TimingProperty)theEObject;
				T result = caseTimingProperty(timingProperty);
				if (result == null) result = caseEvidenceProperty(timingProperty);
				if (result == null) result = caseElement(timingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_PART_OF: {
				IsPartOf isPartOf = (IsPartOf)theEObject;
				T result = caseIsPartOf(isPartOf);
				if (result == null) result = caseExhibitProperty(isPartOf);
				if (result == null) result = caseEvidenceProperty(isPartOf);
				if (result == null) result = caseElement(isPartOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_REVOKED_AT: {
				IsRevokedAt isRevokedAt = (IsRevokedAt)theEObject;
				T result = caseIsRevokedAt(isRevokedAt);
				if (result == null) result = caseEvidenceEvent(isRevokedAt);
				if (result == null) result = caseEvidenceElement(isRevokedAt);
				if (result == null) result = caseElement(isRevokedAt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.PROVIDES_CONTEXT: {
				ProvidesContext providesContext = (ProvidesContext)theEObject;
				T result = caseProvidesContext(providesContext);
				if (result == null) result = caseEvidenceEvaluation(providesContext);
				if (result == null) result = caseEvidenceElement(providesContext);
				if (result == null) result = caseElement(providesContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.DOMAIN_OBJECT: {
				DomainObject domainObject = (DomainObject)theEObject;
				T result = caseDomainObject(domainObject);
				if (result == null) result = caseMeaning(domainObject);
				if (result == null) result = caseEvidenceItem(domainObject);
				if (result == null) result = caseEvidenceElement(domainObject);
				if (result == null) result = caseElement(domainObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.MEANS_THAT: {
				MeansThat meansThat = (MeansThat)theEObject;
				T result = caseMeansThat(meansThat);
				if (result == null) result = caseEvidenceInterpretation(meansThat);
				if (result == null) result = caseEvidenceEvaluation(meansThat);
				if (result == null) result = caseEvidenceElement(meansThat);
				if (result == null) result = caseElement(meansThat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_ELEMENT: {
				EvidenceElement evidenceElement = (EvidenceElement)theEObject;
				T result = caseEvidenceElement(evidenceElement);
				if (result == null) result = caseElement(evidenceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CARE_OF: {
				CareOf careOf = (CareOf)theEObject;
				T result = caseCareOf(careOf);
				if (result == null) result = caseCustodyProperty(careOf);
				if (result == null) result = caseEvidenceProperty(careOf);
				if (result == null) result = caseElement(careOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.CUSTODY_PROPERTY: {
				CustodyProperty custodyProperty = (CustodyProperty)theEObject;
				T result = caseCustodyProperty(custodyProperty);
				if (result == null) result = caseEvidenceProperty(custodyProperty);
				if (result == null) result = caseElement(custodyProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.AT_LOCATION: {
				AtLocation atLocation = (AtLocation)theEObject;
				T result = caseAtLocation(atLocation);
				if (result == null) result = caseCustodyProperty(atLocation);
				if (result == null) result = caseEvidenceProperty(atLocation);
				if (result == null) result = caseElement(atLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_CREATED_AT: {
				IsCreatedAt isCreatedAt = (IsCreatedAt)theEObject;
				T result = caseIsCreatedAt(isCreatedAt);
				if (result == null) result = caseEvidenceEvent(isCreatedAt);
				if (result == null) result = caseEvidenceElement(isCreatedAt);
				if (result == null) result = caseElement(isCreatedAt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.REQUIRES_PACKAGE: {
				RequiresPackage requiresPackage = (RequiresPackage)theEObject;
				T result = caseRequiresPackage(requiresPackage);
				if (result == null) result = caseAdministrativeProperty(requiresPackage);
				if (result == null) result = caseElement(requiresPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.ACTIVITY_PROPERTY: {
				ActivityProperty activityProperty = (ActivityProperty)theEObject;
				T result = caseActivityProperty(activityProperty);
				if (result == null) result = caseAdministrativeProperty(activityProperty);
				if (result == null) result = caseElement(activityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_PROPERTY: {
				EvidenceProperty evidenceProperty = (EvidenceProperty)theEObject;
				T result = caseEvidenceProperty(evidenceProperty);
				if (result == null) result = caseElement(evidenceProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.ADMINISTRATIVE_PROPERTY: {
				AdministrativeProperty administrativeProperty = (AdministrativeProperty)theEObject;
				T result = caseAdministrativeProperty(administrativeProperty);
				if (result == null) result = caseElement(administrativeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseCollectionMethod(service);
				if (result == null) result = caseObject(service);
				if (result == null) result = caseFormalObject(service);
				if (result == null) result = caseDomainObject(service);
				if (result == null) result = caseMeaning(service);
				if (result == null) result = caseEvidenceItem(service);
				if (result == null) result = caseEvidenceElement(service);
				if (result == null) result = caseElement(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.DOCUMENT_PROPERTY: {
				DocumentProperty documentProperty = (DocumentProperty)theEObject;
				T result = caseDocumentProperty(documentProperty);
				if (result == null) result = caseEvidenceProperty(documentProperty);
				if (result == null) result = caseElement(documentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.HAS_ELECTRONIC_SOURCE: {
				HasElectronicSource hasElectronicSource = (HasElectronicSource)theEObject;
				T result = caseHasElectronicSource(hasElectronicSource);
				if (result == null) result = caseExhibitProperty(hasElectronicSource);
				if (result == null) result = caseEvidenceProperty(hasElectronicSource);
				if (result == null) result = caseElement(hasElectronicSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE: {
				IsExpressedInLanguage isExpressedInLanguage = (IsExpressedInLanguage)theEObject;
				T result = caseIsExpressedInLanguage(isExpressedInLanguage);
				if (result == null) result = caseDocumentProperty(isExpressedInLanguage);
				if (result == null) result = caseEvidenceProperty(isExpressedInLanguage);
				if (result == null) result = caseElement(isExpressedInLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.USING_PROCESS: {
				UsingProcess usingProcess = (UsingProcess)theEObject;
				T result = caseUsingProcess(usingProcess);
				if (result == null) result = caseCustodyProperty(usingProcess);
				if (result == null) result = caseEvidenceProperty(usingProcess);
				if (result == null) result = caseElement(usingProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.HAS_SECURITY_CLASSIFICATION: {
				HasSecurityClassification hasSecurityClassification = (HasSecurityClassification)theEObject;
				T result = caseHasSecurityClassification(hasSecurityClassification);
				if (result == null) result = caseDocumentProperty(hasSecurityClassification);
				if (result == null) result = caseEvidenceProperty(hasSecurityClassification);
				if (result == null) result = caseElement(hasSecurityClassification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.IS_RELEASEABLE_TO: {
				IsReleaseableTo isReleaseableTo = (IsReleaseableTo)theEObject;
				T result = caseIsReleaseableTo(isReleaseableTo);
				if (result == null) result = caseDocumentProperty(isReleaseableTo);
				if (result == null) result = caseEvidenceProperty(isReleaseableTo);
				if (result == null) result = caseElement(isReleaseableTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_GROUP: {
				EvidenceGroup evidenceGroup = (EvidenceGroup)theEObject;
				T result = caseEvidenceGroup(evidenceGroup);
				if (result == null) result = caseEvidenceItem(evidenceGroup);
				if (result == null) result = caseEvidenceElement(evidenceGroup);
				if (result == null) result = caseElement(evidenceGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.HAS_VERSION: {
				HasVersion hasVersion = (HasVersion)theEObject;
				T result = caseHasVersion(hasVersion);
				if (result == null) result = caseDocumentProperty(hasVersion);
				if (result == null) result = caseEvidenceProperty(hasVersion);
				if (result == null) result = caseElement(hasVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVALUATION_ATTRIBUTE: {
				EvaluationAttribute evaluationAttribute = (EvaluationAttribute)theEObject;
				T result = caseEvaluationAttribute(evaluationAttribute);
				if (result == null) result = caseElement(evaluationAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.SUPERCEDES: {
				Supercedes supercedes = (Supercedes)theEObject;
				T result = caseSupercedes(supercedes);
				if (result == null) result = caseEvidenceEvaluation(supercedes);
				if (result == null) result = caseEvidenceElement(supercedes);
				if (result == null) result = caseElement(supercedes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.HAS_MEDIA: {
				HasMedia hasMedia = (HasMedia)theEObject;
				T result = caseHasMedia(hasMedia);
				if (result == null) result = caseExhibitProperty(hasMedia);
				if (result == null) result = caseEvidenceProperty(hasMedia);
				if (result == null) result = caseElement(hasMedia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EXHIBIT: {
				Exhibit exhibit = (Exhibit)theEObject;
				T result = caseExhibit(exhibit);
				if (result == null) result = caseEvidenceItem(exhibit);
				if (result == null) result = caseEvidenceElement(exhibit);
				if (result == null) result = caseElement(exhibit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.MEANING: {
				Meaning meaning = (Meaning)theEObject;
				T result = caseMeaning(meaning);
				if (result == null) result = caseEvidenceItem(meaning);
				if (result == null) result = caseEvidenceElement(meaning);
				if (result == null) result = caseElement(meaning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EXHIBIT_PROPERTY: {
				ExhibitProperty exhibitProperty = (ExhibitProperty)theEObject;
				T result = caseExhibitProperty(exhibitProperty);
				if (result == null) result = caseEvidenceProperty(exhibitProperty);
				if (result == null) result = caseElement(exhibitProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EvidencePackage.EVIDENCE_INTERPRETATION: {
				EvidenceInterpretation evidenceInterpretation = (EvidenceInterpretation)theEObject;
				T result = caseEvidenceInterpretation(evidenceInterpretation);
				if (result == null) result = caseEvidenceEvaluation(evidenceInterpretation);
				if (result == null) result = caseEvidenceElement(evidenceInterpretation);
				if (result == null) result = caseElement(evidenceInterpretation);
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
	public T caseElement(Element object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription(Description object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Requires Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requires Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiresTool(RequiresTool object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Domain Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainAssertion(DomainAssertion object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(net.certware.evidence.evidence.Package object) {
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
	public T caseObject(net.certware.evidence.evidence.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSubject(CompositeSubject object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Rationale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rationale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRationale(Rationale object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownSubject(UnknownSubject object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Originator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Originator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOriginator(Originator object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Is Associated With</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Associated With</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsAssociatedWith(IsAssociatedWith object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requires Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requires Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiresMethod(RequiresMethod object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Administrative Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrative Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrativeElement(AdministrativeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainClaim(DomainClaim object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Document Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentAttribute(DocumentAttribute object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Domain Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainObject(DomainObject object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Requires Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requires Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiresPackage(RequiresPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityProperty(ActivityProperty object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Administrative Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrative Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrativeProperty(AdministrativeProperty object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationAttribute(EvaluationAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supercedes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supercedes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupercedes(Supercedes object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Meaning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meaning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeaning(Meaning object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //EvidenceSwitch
