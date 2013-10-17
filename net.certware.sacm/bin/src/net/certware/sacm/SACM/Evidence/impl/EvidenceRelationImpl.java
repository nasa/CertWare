/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceAttribute;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidenceItem;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.EvidenceRelation;
import net.certware.sacm.SACM.Evidence.FormalAssertion;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceRelationImpl#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceRelationImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EvidenceRelationImpl extends EvidenceEvaluationImpl implements EvidenceRelation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getAssertion() <em>Assertion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertion()
	 * @generated
	 * @ordered
	 */
	protected FormalAssertion assertion;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EvidenceItem subject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.EVIDENCE_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalAssertion getAssertion() {
		if (assertion != null && assertion.eIsProxy()) {
			InternalEObject oldAssertion = (InternalEObject)assertion;
			assertion = (FormalAssertion)eResolveProxy(oldAssertion);
			if (assertion != oldAssertion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.EVIDENCE_RELATION__ASSERTION, oldAssertion, assertion));
			}
		}
		return assertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalAssertion basicGetAssertion() {
		return assertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssertion(FormalAssertion newAssertion) {
		FormalAssertion oldAssertion = assertion;
		assertion = newAssertion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.EVIDENCE_RELATION__ASSERTION, oldAssertion, assertion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceItem getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (EvidenceItem)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.EVIDENCE_RELATION__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceItem basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(EvidenceItem newSubject) {
		EvidenceItem oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.EVIDENCE_RELATION__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_RELATION__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.EVIDENCE_RELATION__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.EVIDENCE_RELATION__ID:
				return getId();
			case EvidencePackage.EVIDENCE_RELATION__TIMING:
				return getTiming();
			case EvidencePackage.EVIDENCE_RELATION__CUSTODY:
				return getCustody();
			case EvidencePackage.EVIDENCE_RELATION__PROVENANCE:
				return getProvenance();
			case EvidencePackage.EVIDENCE_RELATION__EVENT:
				return getEvent();
			case EvidencePackage.EVIDENCE_RELATION__ATTRIBUTE:
				return getAttribute();
			case EvidencePackage.EVIDENCE_RELATION__ASSERTION:
				if (resolve) return getAssertion();
				return basicGetAssertion();
			case EvidencePackage.EVIDENCE_RELATION__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_RELATION__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.EVIDENCE_RELATION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.EVIDENCE_RELATION__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.EVIDENCE_RELATION__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.EVIDENCE_RELATION__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.EVIDENCE_RELATION__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.EVIDENCE_RELATION__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.EVIDENCE_RELATION__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends EvidenceAttribute>)newValue);
				return;
			case EvidencePackage.EVIDENCE_RELATION__ASSERTION:
				setAssertion((FormalAssertion)newValue);
				return;
			case EvidencePackage.EVIDENCE_RELATION__SUBJECT:
				setSubject((EvidenceItem)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_RELATION__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.EVIDENCE_RELATION__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.EVIDENCE_RELATION__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.EVIDENCE_RELATION__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.EVIDENCE_RELATION__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.EVIDENCE_RELATION__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.EVIDENCE_RELATION__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.EVIDENCE_RELATION__ATTRIBUTE:
				getAttribute().clear();
				return;
			case EvidencePackage.EVIDENCE_RELATION__ASSERTION:
				setAssertion((FormalAssertion)null);
				return;
			case EvidencePackage.EVIDENCE_RELATION__SUBJECT:
				setSubject((EvidenceItem)null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_RELATION__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.EVIDENCE_RELATION__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.EVIDENCE_RELATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.EVIDENCE_RELATION__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.EVIDENCE_RELATION__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.EVIDENCE_RELATION__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.EVIDENCE_RELATION__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.EVIDENCE_RELATION__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case EvidencePackage.EVIDENCE_RELATION__ASSERTION:
				return assertion != null;
			case EvidencePackage.EVIDENCE_RELATION__SUBJECT:
				return subject != null;
		}
		return eDynamicIsSet(featureID);
	}

} //EvidenceRelationImpl
