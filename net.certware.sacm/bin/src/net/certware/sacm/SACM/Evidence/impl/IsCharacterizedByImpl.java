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
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.FormalAssertion;
import net.certware.sacm.SACM.Evidence.IsCharacterizedBy;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Characterized By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.IsCharacterizedByImpl#getAssertion <em>Assertion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IsCharacterizedByImpl extends EvidenceInterpretationImpl implements IsCharacterizedBy {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsCharacterizedByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.IS_CHARACTERIZED_BY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.IS_CHARACTERIZED_BY__ASSERTION, oldAssertion, assertion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.IS_CHARACTERIZED_BY__ASSERTION, oldAssertion, assertion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.IS_CHARACTERIZED_BY__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.IS_CHARACTERIZED_BY__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.IS_CHARACTERIZED_BY__ID:
				return getId();
			case EvidencePackage.IS_CHARACTERIZED_BY__TIMING:
				return getTiming();
			case EvidencePackage.IS_CHARACTERIZED_BY__CUSTODY:
				return getCustody();
			case EvidencePackage.IS_CHARACTERIZED_BY__PROVENANCE:
				return getProvenance();
			case EvidencePackage.IS_CHARACTERIZED_BY__EVENT:
				return getEvent();
			case EvidencePackage.IS_CHARACTERIZED_BY__ATTRIBUTE:
				return getAttribute();
			case EvidencePackage.IS_CHARACTERIZED_BY__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case EvidencePackage.IS_CHARACTERIZED_BY__ASSERTION:
				if (resolve) return getAssertion();
				return basicGetAssertion();
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
			case EvidencePackage.IS_CHARACTERIZED_BY__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends EvidenceAttribute>)newValue);
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__SUBJECT:
				setSubject((EvidenceElement)newValue);
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__ASSERTION:
				setAssertion((FormalAssertion)newValue);
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
			case EvidencePackage.IS_CHARACTERIZED_BY__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__ATTRIBUTE:
				getAttribute().clear();
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__SUBJECT:
				setSubject((EvidenceElement)null);
				return;
			case EvidencePackage.IS_CHARACTERIZED_BY__ASSERTION:
				setAssertion((FormalAssertion)null);
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
			case EvidencePackage.IS_CHARACTERIZED_BY__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.IS_CHARACTERIZED_BY__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.IS_CHARACTERIZED_BY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.IS_CHARACTERIZED_BY__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.IS_CHARACTERIZED_BY__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.IS_CHARACTERIZED_BY__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.IS_CHARACTERIZED_BY__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.IS_CHARACTERIZED_BY__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case EvidencePackage.IS_CHARACTERIZED_BY__SUBJECT:
				return subject != null;
			case EvidencePackage.IS_CHARACTERIZED_BY__ASSERTION:
				return assertion != null;
		}
		return eDynamicIsSet(featureID);
	}

} //IsCharacterizedByImpl
