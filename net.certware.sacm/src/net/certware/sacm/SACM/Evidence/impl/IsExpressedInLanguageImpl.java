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
import net.certware.sacm.SACM.Evidence.IsExpressedInLanguage;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

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
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.IsExpressedInLanguageImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.IsExpressedInLanguageImpl#getIsPrimary <em>Is Primary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IsExpressedInLanguageImpl extends DocumentPropertyImpl implements IsExpressedInLanguage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

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
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__ID:
				return getId();
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__TIMING:
				return getTiming();
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__CUSTODY:
				return getCustody();
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__PROVENANCE:
				return getProvenance();
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__EVENT:
				return getEvent();
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__LANGUAGE:
				return getLanguage();
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__IS_PRIMARY:
				return getIsPrimary();
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
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__IS_PRIMARY:
				setIsPrimary((Boolean)newValue);
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
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__IS_PRIMARY:
				setIsPrimary(IS_PRIMARY_EDEFAULT);
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
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case EvidencePackage.IS_EXPRESSED_IN_LANGUAGE__IS_PRIMARY:
				return IS_PRIMARY_EDEFAULT == null ? isPrimary != null : !IS_PRIMARY_EDEFAULT.equals(isPrimary);
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
		result.append(" (language: "); //$NON-NLS-1$
		result.append(language);
		result.append(", IsPrimary: "); //$NON-NLS-1$
		result.append(isPrimary);
		result.append(')');
		return result.toString();
	}

} //IsExpressedInLanguageImpl
