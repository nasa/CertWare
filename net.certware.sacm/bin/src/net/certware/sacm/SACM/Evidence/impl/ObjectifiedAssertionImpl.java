/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.FormalAssertion;
import net.certware.sacm.SACM.Evidence.ObjectifiedAssertion;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objectified Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ObjectifiedAssertionImpl#getAssertion <em>Assertion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectifiedAssertionImpl extends FormalObjectImpl implements ObjectifiedAssertion {
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
	public ObjectifiedAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.OBJECTIFIED_ASSERTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.OBJECTIFIED_ASSERTION__ASSERTION, oldAssertion, assertion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.OBJECTIFIED_ASSERTION__ASSERTION, oldAssertion, assertion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.OBJECTIFIED_ASSERTION__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.OBJECTIFIED_ASSERTION__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.OBJECTIFIED_ASSERTION__ID:
				return getId();
			case EvidencePackage.OBJECTIFIED_ASSERTION__TIMING:
				return getTiming();
			case EvidencePackage.OBJECTIFIED_ASSERTION__CUSTODY:
				return getCustody();
			case EvidencePackage.OBJECTIFIED_ASSERTION__PROVENANCE:
				return getProvenance();
			case EvidencePackage.OBJECTIFIED_ASSERTION__EVENT:
				return getEvent();
			case EvidencePackage.OBJECTIFIED_ASSERTION__NAME:
				return getName();
			case EvidencePackage.OBJECTIFIED_ASSERTION__ASSERTION:
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
			case EvidencePackage.OBJECTIFIED_ASSERTION__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.OBJECTIFIED_ASSERTION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.OBJECTIFIED_ASSERTION__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.OBJECTIFIED_ASSERTION__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.OBJECTIFIED_ASSERTION__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.OBJECTIFIED_ASSERTION__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.OBJECTIFIED_ASSERTION__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.OBJECTIFIED_ASSERTION__NAME:
				setName((String)newValue);
				return;
			case EvidencePackage.OBJECTIFIED_ASSERTION__ASSERTION:
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
			case EvidencePackage.OBJECTIFIED_ASSERTION__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.OBJECTIFIED_ASSERTION__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.OBJECTIFIED_ASSERTION__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.OBJECTIFIED_ASSERTION__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.OBJECTIFIED_ASSERTION__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.OBJECTIFIED_ASSERTION__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.OBJECTIFIED_ASSERTION__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.OBJECTIFIED_ASSERTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvidencePackage.OBJECTIFIED_ASSERTION__ASSERTION:
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
			case EvidencePackage.OBJECTIFIED_ASSERTION__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.OBJECTIFIED_ASSERTION__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.OBJECTIFIED_ASSERTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.OBJECTIFIED_ASSERTION__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.OBJECTIFIED_ASSERTION__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.OBJECTIFIED_ASSERTION__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.OBJECTIFIED_ASSERTION__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.OBJECTIFIED_ASSERTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvidencePackage.OBJECTIFIED_ASSERTION__ASSERTION:
				return assertion != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ObjectifiedAssertionImpl
