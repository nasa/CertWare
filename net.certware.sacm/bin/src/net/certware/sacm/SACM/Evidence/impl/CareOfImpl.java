/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CareOf;
import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.Person;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.CareOfImpl#getCustodian <em>Custodian</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CareOfImpl extends CustodyPropertyImpl implements CareOf {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getCustodian() <em>Custodian</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian()
	 * @generated
	 * @ordered
	 */
	protected Person custodian;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CareOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.CARE_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getCustodian() {
		if (custodian != null && custodian.eIsProxy()) {
			InternalEObject oldCustodian = (InternalEObject)custodian;
			custodian = (Person)eResolveProxy(oldCustodian);
			if (custodian != oldCustodian) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.CARE_OF__CUSTODIAN, oldCustodian, custodian));
			}
		}
		return custodian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetCustodian() {
		return custodian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustodian(Person newCustodian) {
		Person oldCustodian = custodian;
		custodian = newCustodian;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.CARE_OF__CUSTODIAN, oldCustodian, custodian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.CARE_OF__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.CARE_OF__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.CARE_OF__ID:
				return getId();
			case EvidencePackage.CARE_OF__TIMING:
				return getTiming();
			case EvidencePackage.CARE_OF__CUSTODY:
				return getCustody();
			case EvidencePackage.CARE_OF__PROVENANCE:
				return getProvenance();
			case EvidencePackage.CARE_OF__EVENT:
				return getEvent();
			case EvidencePackage.CARE_OF__CUSTODIAN:
				if (resolve) return getCustodian();
				return basicGetCustodian();
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
			case EvidencePackage.CARE_OF__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.CARE_OF__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.CARE_OF__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.CARE_OF__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.CARE_OF__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.CARE_OF__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.CARE_OF__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.CARE_OF__CUSTODIAN:
				setCustodian((Person)newValue);
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
			case EvidencePackage.CARE_OF__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.CARE_OF__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.CARE_OF__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.CARE_OF__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.CARE_OF__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.CARE_OF__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.CARE_OF__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.CARE_OF__CUSTODIAN:
				setCustodian((Person)null);
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
			case EvidencePackage.CARE_OF__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.CARE_OF__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.CARE_OF__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.CARE_OF__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.CARE_OF__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.CARE_OF__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.CARE_OF__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.CARE_OF__CUSTODIAN:
				return custodian != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CareOfImpl
