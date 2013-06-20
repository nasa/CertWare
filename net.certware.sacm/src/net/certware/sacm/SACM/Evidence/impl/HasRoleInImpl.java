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
import net.certware.sacm.SACM.Evidence.HasRoleIn;
import net.certware.sacm.SACM.Evidence.Organization;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has Role In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.HasRoleInImpl#getRole <em>Role</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.HasRoleInImpl#getOrganization <em>Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HasRoleInImpl extends ProjectPropertyImpl implements HasRoleIn {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization organization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HasRoleInImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.HAS_ROLE_IN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.HAS_ROLE_IN__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		if (organization != null && organization.eIsProxy()) {
			InternalEObject oldOrganization = (InternalEObject)organization;
			organization = (Organization)eResolveProxy(oldOrganization);
			if (organization != oldOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.HAS_ROLE_IN__ORGANIZATION, oldOrganization, organization));
			}
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		Organization oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.HAS_ROLE_IN__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.HAS_ROLE_IN__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.HAS_ROLE_IN__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.HAS_ROLE_IN__ID:
				return getId();
			case EvidencePackage.HAS_ROLE_IN__TIMING:
				return getTiming();
			case EvidencePackage.HAS_ROLE_IN__CUSTODY:
				return getCustody();
			case EvidencePackage.HAS_ROLE_IN__PROVENANCE:
				return getProvenance();
			case EvidencePackage.HAS_ROLE_IN__EVENT:
				return getEvent();
			case EvidencePackage.HAS_ROLE_IN__ROLE:
				return getRole();
			case EvidencePackage.HAS_ROLE_IN__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
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
			case EvidencePackage.HAS_ROLE_IN__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.HAS_ROLE_IN__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.HAS_ROLE_IN__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.HAS_ROLE_IN__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.HAS_ROLE_IN__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.HAS_ROLE_IN__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.HAS_ROLE_IN__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.HAS_ROLE_IN__ROLE:
				setRole((String)newValue);
				return;
			case EvidencePackage.HAS_ROLE_IN__ORGANIZATION:
				setOrganization((Organization)newValue);
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
			case EvidencePackage.HAS_ROLE_IN__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.HAS_ROLE_IN__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.HAS_ROLE_IN__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.HAS_ROLE_IN__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.HAS_ROLE_IN__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.HAS_ROLE_IN__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.HAS_ROLE_IN__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.HAS_ROLE_IN__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case EvidencePackage.HAS_ROLE_IN__ORGANIZATION:
				setOrganization((Organization)null);
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
			case EvidencePackage.HAS_ROLE_IN__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.HAS_ROLE_IN__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.HAS_ROLE_IN__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.HAS_ROLE_IN__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.HAS_ROLE_IN__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.HAS_ROLE_IN__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.HAS_ROLE_IN__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.HAS_ROLE_IN__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case EvidencePackage.HAS_ROLE_IN__ORGANIZATION:
				return organization != null;
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
		result.append(" (role: "); //$NON-NLS-1$
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //HasRoleInImpl
