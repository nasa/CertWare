/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Argumentation.Claim;

import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.ReferencedClaim;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenced Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ReferencedClaimImpl#getClaim <em>Claim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferencedClaimImpl extends FormalAssertionImpl implements ReferencedClaim {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getClaim() <em>Claim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaim()
	 * @generated
	 * @ordered
	 */
	protected Claim claim;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencedClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.REFERENCED_CLAIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim getClaim() {
		if (claim != null && claim.eIsProxy()) {
			InternalEObject oldClaim = (InternalEObject)claim;
			claim = (Claim)eResolveProxy(oldClaim);
			if (claim != oldClaim) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.REFERENCED_CLAIM__CLAIM, oldClaim, claim));
			}
		}
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim basicGetClaim() {
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaim(Claim newClaim) {
		Claim oldClaim = claim;
		claim = newClaim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.REFERENCED_CLAIM__CLAIM, oldClaim, claim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.REFERENCED_CLAIM__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.REFERENCED_CLAIM__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.REFERENCED_CLAIM__ID:
				return getId();
			case EvidencePackage.REFERENCED_CLAIM__TIMING:
				return getTiming();
			case EvidencePackage.REFERENCED_CLAIM__CUSTODY:
				return getCustody();
			case EvidencePackage.REFERENCED_CLAIM__PROVENANCE:
				return getProvenance();
			case EvidencePackage.REFERENCED_CLAIM__EVENT:
				return getEvent();
			case EvidencePackage.REFERENCED_CLAIM__CONTENT:
				return getContent();
			case EvidencePackage.REFERENCED_CLAIM__CLAIM:
				if (resolve) return getClaim();
				return basicGetClaim();
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
			case EvidencePackage.REFERENCED_CLAIM__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.REFERENCED_CLAIM__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.REFERENCED_CLAIM__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.REFERENCED_CLAIM__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.REFERENCED_CLAIM__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.REFERENCED_CLAIM__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.REFERENCED_CLAIM__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.REFERENCED_CLAIM__CONTENT:
				setContent((String)newValue);
				return;
			case EvidencePackage.REFERENCED_CLAIM__CLAIM:
				setClaim((Claim)newValue);
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
			case EvidencePackage.REFERENCED_CLAIM__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.REFERENCED_CLAIM__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.REFERENCED_CLAIM__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.REFERENCED_CLAIM__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.REFERENCED_CLAIM__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.REFERENCED_CLAIM__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.REFERENCED_CLAIM__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.REFERENCED_CLAIM__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case EvidencePackage.REFERENCED_CLAIM__CLAIM:
				setClaim((Claim)null);
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
			case EvidencePackage.REFERENCED_CLAIM__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.REFERENCED_CLAIM__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.REFERENCED_CLAIM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.REFERENCED_CLAIM__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.REFERENCED_CLAIM__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.REFERENCED_CLAIM__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.REFERENCED_CLAIM__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.REFERENCED_CLAIM__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case EvidencePackage.REFERENCED_CLAIM__CLAIM:
				return claim != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ReferencedClaimImpl
