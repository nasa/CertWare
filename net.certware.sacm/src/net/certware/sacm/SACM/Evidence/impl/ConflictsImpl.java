/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.Conflicts;
import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceAttribute;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
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
 * An implementation of the model object '<em><b>Conflicts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ConflictsImpl#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ConflictsImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConflictsImpl extends EvidenceObservationImpl implements Conflicts {
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
	protected FormalAssertion subject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConflictsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.CONFLICTS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.CONFLICTS__ASSERTION, oldAssertion, assertion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.CONFLICTS__ASSERTION, oldAssertion, assertion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalAssertion getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (FormalAssertion)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.CONFLICTS__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalAssertion basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(FormalAssertion newSubject) {
		FormalAssertion oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.CONFLICTS__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.CONFLICTS__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.CONFLICTS__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.CONFLICTS__ID:
				return getId();
			case EvidencePackage.CONFLICTS__TIMING:
				return getTiming();
			case EvidencePackage.CONFLICTS__CUSTODY:
				return getCustody();
			case EvidencePackage.CONFLICTS__PROVENANCE:
				return getProvenance();
			case EvidencePackage.CONFLICTS__EVENT:
				return getEvent();
			case EvidencePackage.CONFLICTS__ATTRIBUTE:
				return getAttribute();
			case EvidencePackage.CONFLICTS__ASSERTION:
				if (resolve) return getAssertion();
				return basicGetAssertion();
			case EvidencePackage.CONFLICTS__SUBJECT:
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
			case EvidencePackage.CONFLICTS__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.CONFLICTS__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.CONFLICTS__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.CONFLICTS__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.CONFLICTS__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.CONFLICTS__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.CONFLICTS__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.CONFLICTS__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends EvidenceAttribute>)newValue);
				return;
			case EvidencePackage.CONFLICTS__ASSERTION:
				setAssertion((FormalAssertion)newValue);
				return;
			case EvidencePackage.CONFLICTS__SUBJECT:
				setSubject((FormalAssertion)newValue);
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
			case EvidencePackage.CONFLICTS__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.CONFLICTS__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.CONFLICTS__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.CONFLICTS__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.CONFLICTS__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.CONFLICTS__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.CONFLICTS__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.CONFLICTS__ATTRIBUTE:
				getAttribute().clear();
				return;
			case EvidencePackage.CONFLICTS__ASSERTION:
				setAssertion((FormalAssertion)null);
				return;
			case EvidencePackage.CONFLICTS__SUBJECT:
				setSubject((FormalAssertion)null);
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
			case EvidencePackage.CONFLICTS__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.CONFLICTS__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.CONFLICTS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.CONFLICTS__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.CONFLICTS__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.CONFLICTS__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.CONFLICTS__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.CONFLICTS__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case EvidencePackage.CONFLICTS__ASSERTION:
				return assertion != null;
			case EvidencePackage.CONFLICTS__SUBJECT:
				return subject != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ConflictsImpl
