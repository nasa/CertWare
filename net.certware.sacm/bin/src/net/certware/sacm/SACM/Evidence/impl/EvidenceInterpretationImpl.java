/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceAttribute;
import net.certware.sacm.SACM.Evidence.EvidenceElement;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidenceInterpretation;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interpretation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceInterpretationImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EvidenceInterpretationImpl extends EvidenceEvaluationImpl implements EvidenceInterpretation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EvidenceElement subject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceInterpretationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.EVIDENCE_INTERPRETATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceElement getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (EvidenceElement)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.EVIDENCE_INTERPRETATION__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceElement basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(EvidenceElement newSubject) {
		EvidenceElement oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.EVIDENCE_INTERPRETATION__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_INTERPRETATION__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.EVIDENCE_INTERPRETATION__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.EVIDENCE_INTERPRETATION__ID:
				return getId();
			case EvidencePackage.EVIDENCE_INTERPRETATION__TIMING:
				return getTiming();
			case EvidencePackage.EVIDENCE_INTERPRETATION__CUSTODY:
				return getCustody();
			case EvidencePackage.EVIDENCE_INTERPRETATION__PROVENANCE:
				return getProvenance();
			case EvidencePackage.EVIDENCE_INTERPRETATION__EVENT:
				return getEvent();
			case EvidencePackage.EVIDENCE_INTERPRETATION__ATTRIBUTE:
				return getAttribute();
			case EvidencePackage.EVIDENCE_INTERPRETATION__SUBJECT:
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
			case EvidencePackage.EVIDENCE_INTERPRETATION__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.EVIDENCE_INTERPRETATION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.EVIDENCE_INTERPRETATION__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.EVIDENCE_INTERPRETATION__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.EVIDENCE_INTERPRETATION__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.EVIDENCE_INTERPRETATION__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.EVIDENCE_INTERPRETATION__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.EVIDENCE_INTERPRETATION__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends EvidenceAttribute>)newValue);
				return;
			case EvidencePackage.EVIDENCE_INTERPRETATION__SUBJECT:
				setSubject((EvidenceElement)newValue);
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
			case EvidencePackage.EVIDENCE_INTERPRETATION__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.EVIDENCE_INTERPRETATION__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.EVIDENCE_INTERPRETATION__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.EVIDENCE_INTERPRETATION__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.EVIDENCE_INTERPRETATION__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.EVIDENCE_INTERPRETATION__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.EVIDENCE_INTERPRETATION__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.EVIDENCE_INTERPRETATION__ATTRIBUTE:
				getAttribute().clear();
				return;
			case EvidencePackage.EVIDENCE_INTERPRETATION__SUBJECT:
				setSubject((EvidenceElement)null);
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
			case EvidencePackage.EVIDENCE_INTERPRETATION__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.EVIDENCE_INTERPRETATION__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.EVIDENCE_INTERPRETATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.EVIDENCE_INTERPRETATION__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.EVIDENCE_INTERPRETATION__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.EVIDENCE_INTERPRETATION__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.EVIDENCE_INTERPRETATION__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.EVIDENCE_INTERPRETATION__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case EvidencePackage.EVIDENCE_INTERPRETATION__SUBJECT:
				return subject != null;
		}
		return eDynamicIsSet(featureID);
	}

} //EvidenceInterpretationImpl
