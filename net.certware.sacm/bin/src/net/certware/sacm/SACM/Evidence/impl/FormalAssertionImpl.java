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
import net.certware.sacm.SACM.Evidence.FormalAssertion;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.FormalAssertionImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FormalAssertionImpl extends FormalElementImpl implements FormalAssertion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.FORMAL_ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.FORMAL_ASSERTION__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.FORMAL_ASSERTION__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.FORMAL_ASSERTION__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.FORMAL_ASSERTION__ID:
				return getId();
			case EvidencePackage.FORMAL_ASSERTION__TIMING:
				return getTiming();
			case EvidencePackage.FORMAL_ASSERTION__CUSTODY:
				return getCustody();
			case EvidencePackage.FORMAL_ASSERTION__PROVENANCE:
				return getProvenance();
			case EvidencePackage.FORMAL_ASSERTION__EVENT:
				return getEvent();
			case EvidencePackage.FORMAL_ASSERTION__CONTENT:
				return getContent();
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
			case EvidencePackage.FORMAL_ASSERTION__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.FORMAL_ASSERTION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.FORMAL_ASSERTION__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.FORMAL_ASSERTION__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.FORMAL_ASSERTION__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.FORMAL_ASSERTION__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.FORMAL_ASSERTION__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.FORMAL_ASSERTION__CONTENT:
				setContent((String)newValue);
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
			case EvidencePackage.FORMAL_ASSERTION__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.FORMAL_ASSERTION__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.FORMAL_ASSERTION__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.FORMAL_ASSERTION__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.FORMAL_ASSERTION__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.FORMAL_ASSERTION__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.FORMAL_ASSERTION__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.FORMAL_ASSERTION__CONTENT:
				setContent(CONTENT_EDEFAULT);
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
			case EvidencePackage.FORMAL_ASSERTION__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.FORMAL_ASSERTION__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.FORMAL_ASSERTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.FORMAL_ASSERTION__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.FORMAL_ASSERTION__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.FORMAL_ASSERTION__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.FORMAL_ASSERTION__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.FORMAL_ASSERTION__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
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
		result.append(" (content: "); //$NON-NLS-1$
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //FormalAssertionImpl
