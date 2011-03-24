/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence.impl;

import net.certware.evidence.evidence.EvidencePackage;
import net.certware.evidence.evidence.IsExpressedInLanguage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Expressed In Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.impl.IsExpressedInLanguageImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.IsExpressedInLanguageImpl#getIsPrimary <em>Is Primary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IsExpressedInLanguageImpl extends DocumentPropertyImpl implements IsExpressedInLanguage {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsPrimary() <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPrimary()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PRIMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsPrimary() <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPrimary()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPrimary = IS_PRIMARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsExpressedInLanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.IS_EXPRESSED_IN_LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPrimary() {
		return isPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPrimary(Boolean newIsPrimary) {
		Boolean oldIsPrimary = isPrimary;
		isPrimary = newIsPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__IS_PRIMARY, oldIsPrimary, isPrimary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__LANGUAGE:
				return getLanguage();
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__IS_PRIMARY:
				return getIsPrimary();
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
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__IS_PRIMARY:
				setIsPrimary((Boolean)newValue);
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
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__IS_PRIMARY:
				setIsPrimary(IS_PRIMARY_EDEFAULT);
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
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__IS_PRIMARY:
				return IS_PRIMARY_EDEFAULT == null ? isPrimary != null : !IS_PRIMARY_EDEFAULT.equals(isPrimary);
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
		result.append(" (language: "); //$NON-NLS-1$
		result.append(language);
		result.append(", IsPrimary: "); //$NON-NLS-1$
		result.append(isPrimary);
		result.append(')');
		return result.toString();
	}

} //IsExpressedInLanguageImpl
