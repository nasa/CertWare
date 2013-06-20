/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.AtLocation;
import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
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
 * An implementation of the model object '<em><b>At Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.AtLocationImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtLocationImpl extends CustodyPropertyImpl implements AtLocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Organization location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.AT_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Organization)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.AT_LOCATION__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Organization newLocation) {
		Organization oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.AT_LOCATION__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.AT_LOCATION__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.AT_LOCATION__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.AT_LOCATION__ID:
				return getId();
			case EvidencePackage.AT_LOCATION__TIMING:
				return getTiming();
			case EvidencePackage.AT_LOCATION__CUSTODY:
				return getCustody();
			case EvidencePackage.AT_LOCATION__PROVENANCE:
				return getProvenance();
			case EvidencePackage.AT_LOCATION__EVENT:
				return getEvent();
			case EvidencePackage.AT_LOCATION__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
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
			case EvidencePackage.AT_LOCATION__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.AT_LOCATION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.AT_LOCATION__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.AT_LOCATION__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.AT_LOCATION__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.AT_LOCATION__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.AT_LOCATION__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.AT_LOCATION__LOCATION:
				setLocation((Organization)newValue);
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
			case EvidencePackage.AT_LOCATION__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.AT_LOCATION__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.AT_LOCATION__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.AT_LOCATION__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.AT_LOCATION__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.AT_LOCATION__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.AT_LOCATION__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.AT_LOCATION__LOCATION:
				setLocation((Organization)null);
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
			case EvidencePackage.AT_LOCATION__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.AT_LOCATION__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.AT_LOCATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.AT_LOCATION__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.AT_LOCATION__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.AT_LOCATION__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.AT_LOCATION__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.AT_LOCATION__LOCATION:
				return location != null;
		}
		return eDynamicIsSet(featureID);
	}

} //AtLocationImpl
