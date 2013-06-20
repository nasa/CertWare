/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Argumentation.ArgumentationPackage;
import net.certware.sacm.SACM.Argumentation.Claim;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.impl.ClaimImpl#getAssumed <em>Assumed</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.impl.ClaimImpl#getToBeSupported <em>To Be Supported</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaimImpl extends AssertionImpl implements Claim {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getAssumed() <em>Assumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ASSUMED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssumed() <em>Assumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumed()
	 * @generated
	 * @ordered
	 */
	protected Boolean assumed = ASSUMED_EDEFAULT;

	/**
	 * The default value of the '{@link #getToBeSupported() <em>To Be Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBeSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TO_BE_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToBeSupported() <em>To Be Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBeSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean toBeSupported = TO_BE_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.CLAIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAssumed() {
		return assumed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssumed(Boolean newAssumed) {
		Boolean oldAssumed = assumed;
		assumed = newAssumed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.CLAIM__ASSUMED, oldAssumed, assumed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getToBeSupported() {
		return toBeSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBeSupported(Boolean newToBeSupported) {
		Boolean oldToBeSupported = toBeSupported;
		toBeSupported = newToBeSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.CLAIM__TO_BE_SUPPORTED, oldToBeSupported, toBeSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArgumentationPackage.CLAIM__TAGGED_VALUE:
				return getTaggedValue();
			case ArgumentationPackage.CLAIM__ANNOTATION:
				return getAnnotation();
			case ArgumentationPackage.CLAIM__ID:
				return getId();
			case ArgumentationPackage.CLAIM__DESCRIPTION:
				return getDescription();
			case ArgumentationPackage.CLAIM__CONTENT:
				return getContent();
			case ArgumentationPackage.CLAIM__ASSUMED:
				return getAssumed();
			case ArgumentationPackage.CLAIM__TO_BE_SUPPORTED:
				return getToBeSupported();
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
			case ArgumentationPackage.CLAIM__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case ArgumentationPackage.CLAIM__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ArgumentationPackage.CLAIM__ID:
				setId((String)newValue);
				return;
			case ArgumentationPackage.CLAIM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ArgumentationPackage.CLAIM__CONTENT:
				setContent((String)newValue);
				return;
			case ArgumentationPackage.CLAIM__ASSUMED:
				setAssumed((Boolean)newValue);
				return;
			case ArgumentationPackage.CLAIM__TO_BE_SUPPORTED:
				setToBeSupported((Boolean)newValue);
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
			case ArgumentationPackage.CLAIM__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case ArgumentationPackage.CLAIM__ANNOTATION:
				getAnnotation().clear();
				return;
			case ArgumentationPackage.CLAIM__ID:
				setId(ID_EDEFAULT);
				return;
			case ArgumentationPackage.CLAIM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ArgumentationPackage.CLAIM__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case ArgumentationPackage.CLAIM__ASSUMED:
				setAssumed(ASSUMED_EDEFAULT);
				return;
			case ArgumentationPackage.CLAIM__TO_BE_SUPPORTED:
				setToBeSupported(TO_BE_SUPPORTED_EDEFAULT);
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
			case ArgumentationPackage.CLAIM__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case ArgumentationPackage.CLAIM__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case ArgumentationPackage.CLAIM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ArgumentationPackage.CLAIM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ArgumentationPackage.CLAIM__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case ArgumentationPackage.CLAIM__ASSUMED:
				return ASSUMED_EDEFAULT == null ? assumed != null : !ASSUMED_EDEFAULT.equals(assumed);
			case ArgumentationPackage.CLAIM__TO_BE_SUPPORTED:
				return TO_BE_SUPPORTED_EDEFAULT == null ? toBeSupported != null : !TO_BE_SUPPORTED_EDEFAULT.equals(toBeSupported);
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
		result.append(" (assumed: "); //$NON-NLS-1$
		result.append(assumed);
		result.append(", toBeSupported: "); //$NON-NLS-1$
		result.append(toBeSupported);
		result.append(')');
		return result.toString();
	}

} //ClaimImpl
