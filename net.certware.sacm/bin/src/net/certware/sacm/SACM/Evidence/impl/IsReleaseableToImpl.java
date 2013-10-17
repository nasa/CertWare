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
import net.certware.sacm.SACM.Evidence.IsReleaseableTo;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Releaseable To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.IsReleaseableToImpl#getReleasability <em>Releasability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IsReleaseableToImpl extends DocumentPropertyImpl implements IsReleaseableTo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getReleasability() <em>Releasability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleasability()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleasability() <em>Releasability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleasability()
	 * @generated
	 * @ordered
	 */
	protected String releasability = RELEASABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsReleaseableToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.IS_RELEASEABLE_TO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReleasability() {
		return releasability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleasability(String newReleasability) {
		String oldReleasability = releasability;
		releasability = newReleasability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.IS_RELEASEABLE_TO__RELEASABILITY, oldReleasability, releasability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.IS_RELEASEABLE_TO__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.IS_RELEASEABLE_TO__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.IS_RELEASEABLE_TO__ID:
				return getId();
			case EvidencePackage.IS_RELEASEABLE_TO__TIMING:
				return getTiming();
			case EvidencePackage.IS_RELEASEABLE_TO__CUSTODY:
				return getCustody();
			case EvidencePackage.IS_RELEASEABLE_TO__PROVENANCE:
				return getProvenance();
			case EvidencePackage.IS_RELEASEABLE_TO__EVENT:
				return getEvent();
			case EvidencePackage.IS_RELEASEABLE_TO__RELEASABILITY:
				return getReleasability();
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
			case EvidencePackage.IS_RELEASEABLE_TO__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.IS_RELEASEABLE_TO__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.IS_RELEASEABLE_TO__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.IS_RELEASEABLE_TO__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.IS_RELEASEABLE_TO__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.IS_RELEASEABLE_TO__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.IS_RELEASEABLE_TO__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.IS_RELEASEABLE_TO__RELEASABILITY:
				setReleasability((String)newValue);
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
			case EvidencePackage.IS_RELEASEABLE_TO__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.IS_RELEASEABLE_TO__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.IS_RELEASEABLE_TO__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.IS_RELEASEABLE_TO__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.IS_RELEASEABLE_TO__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.IS_RELEASEABLE_TO__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.IS_RELEASEABLE_TO__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.IS_RELEASEABLE_TO__RELEASABILITY:
				setReleasability(RELEASABILITY_EDEFAULT);
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
			case EvidencePackage.IS_RELEASEABLE_TO__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.IS_RELEASEABLE_TO__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.IS_RELEASEABLE_TO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.IS_RELEASEABLE_TO__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.IS_RELEASEABLE_TO__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.IS_RELEASEABLE_TO__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.IS_RELEASEABLE_TO__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.IS_RELEASEABLE_TO__RELEASABILITY:
				return RELEASABILITY_EDEFAULT == null ? releasability != null : !RELEASABILITY_EDEFAULT.equals(releasability);
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
		result.append(" (releasability: "); //$NON-NLS-1$
		result.append(releasability);
		result.append(')');
		return result.toString();
	}

} //IsReleaseableToImpl
