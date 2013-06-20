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
import net.certware.sacm.SACM.Evidence.Organization;
import net.certware.sacm.SACM.Evidence.ProjectProperty;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.OrganizationImpl#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationImpl extends StakeholderImpl implements Organization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.ORGANIZATION__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.ORGANIZATION__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.ORGANIZATION__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.ORGANIZATION__ID:
				return getId();
			case EvidencePackage.ORGANIZATION__TIMING:
				return getTiming();
			case EvidencePackage.ORGANIZATION__CUSTODY:
				return getCustody();
			case EvidencePackage.ORGANIZATION__PROVENANCE:
				return getProvenance();
			case EvidencePackage.ORGANIZATION__EVENT:
				return getEvent();
			case EvidencePackage.ORGANIZATION__NAME:
				return getName();
			case EvidencePackage.ORGANIZATION__CONTENT:
				return getContent();
			case EvidencePackage.ORGANIZATION__PROPERTY:
				return getProperty();
			case EvidencePackage.ORGANIZATION__ADDRESS:
				return getAddress();
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
			case EvidencePackage.ORGANIZATION__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.ORGANIZATION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.ORGANIZATION__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.ORGANIZATION__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.ORGANIZATION__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.ORGANIZATION__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.ORGANIZATION__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.ORGANIZATION__NAME:
				setName((String)newValue);
				return;
			case EvidencePackage.ORGANIZATION__CONTENT:
				setContent((String)newValue);
				return;
			case EvidencePackage.ORGANIZATION__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends ProjectProperty>)newValue);
				return;
			case EvidencePackage.ORGANIZATION__ADDRESS:
				setAddress((String)newValue);
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
			case EvidencePackage.ORGANIZATION__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.ORGANIZATION__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.ORGANIZATION__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.ORGANIZATION__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.ORGANIZATION__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.ORGANIZATION__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.ORGANIZATION__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.ORGANIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvidencePackage.ORGANIZATION__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case EvidencePackage.ORGANIZATION__PROPERTY:
				getProperty().clear();
				return;
			case EvidencePackage.ORGANIZATION__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
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
			case EvidencePackage.ORGANIZATION__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.ORGANIZATION__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.ORGANIZATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.ORGANIZATION__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.ORGANIZATION__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.ORGANIZATION__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.ORGANIZATION__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.ORGANIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvidencePackage.ORGANIZATION__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case EvidencePackage.ORGANIZATION__PROPERTY:
				return property != null && !property.isEmpty();
			case EvidencePackage.ORGANIZATION__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (address: "); //$NON-NLS-1$
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //OrganizationImpl
