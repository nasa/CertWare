/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.evidence.evidence.impl;

import net.certware.evidence.evidence.EvidencePackage;
import net.certware.evidence.evidence.IsReleaseableTo;

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
 *   <li>{@link net.certware.evidence.evidence.impl.IsReleaseableToImpl#getReleasability <em>Releasability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IsReleaseableToImpl extends DocumentPropertyImpl implements IsReleaseableTo {
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
	protected IsReleaseableToImpl() {
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
			case EvidencePackage.IS_RELEASEABLE_TO__RELEASABILITY:
				return getReleasability();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvidencePackage.IS_RELEASEABLE_TO__RELEASABILITY:
				setReleasability((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EvidencePackage.IS_RELEASEABLE_TO__RELEASABILITY:
				setReleasability(RELEASABILITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EvidencePackage.IS_RELEASEABLE_TO__RELEASABILITY:
				return RELEASABILITY_EDEFAULT == null ? releasability != null : !RELEASABILITY_EDEFAULT.equals(releasability);
		}
		return super.eIsSet(featureID);
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
