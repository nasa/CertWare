/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence.impl;

import net.certware.evidence.evidence.EvidencePackage;
import net.certware.evidence.evidence.HasSecurityClassification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has Security Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.impl.HasSecurityClassificationImpl#getSecurityClassification <em>Security Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HasSecurityClassificationImpl extends DocumentPropertyImpl implements HasSecurityClassification {
	/**
	 * The default value of the '{@link #getSecurityClassification() <em>Security Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_CLASSIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityClassification() <em>Security Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityClassification()
	 * @generated
	 * @ordered
	 */
	protected String securityClassification = SECURITY_CLASSIFICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HasSecurityClassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.HAS_SECURITY_CLASSIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityClassification() {
		return securityClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityClassification(String newSecurityClassification) {
		String oldSecurityClassification = securityClassification;
		securityClassification = newSecurityClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.HAS_SECURITY_CLASSIFICATION__SECURITY_CLASSIFICATION, oldSecurityClassification, securityClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.HAS_SECURITY_CLASSIFICATION__SECURITY_CLASSIFICATION:
				return getSecurityClassification();
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
			case EvidencePackage.HAS_SECURITY_CLASSIFICATION__SECURITY_CLASSIFICATION:
				setSecurityClassification((String)newValue);
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
			case EvidencePackage.HAS_SECURITY_CLASSIFICATION__SECURITY_CLASSIFICATION:
				setSecurityClassification(SECURITY_CLASSIFICATION_EDEFAULT);
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
			case EvidencePackage.HAS_SECURITY_CLASSIFICATION__SECURITY_CLASSIFICATION:
				return SECURITY_CLASSIFICATION_EDEFAULT == null ? securityClassification != null : !SECURITY_CLASSIFICATION_EDEFAULT.equals(securityClassification);
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
		result.append(" (securityClassification: "); //$NON-NLS-1$
		result.append(securityClassification);
		result.append(')');
		return result.toString();
	}

} //HasSecurityClassificationImpl
