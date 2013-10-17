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
import net.certware.sacm.SACM.Evidence.FormalObject;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.FormalObjectImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FormalObjectImpl extends FormalElementImpl implements FormalObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.FORMAL_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.FORMAL_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.FORMAL_OBJECT__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.FORMAL_OBJECT__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.FORMAL_OBJECT__ID:
				return getId();
			case EvidencePackage.FORMAL_OBJECT__TIMING:
				return getTiming();
			case EvidencePackage.FORMAL_OBJECT__CUSTODY:
				return getCustody();
			case EvidencePackage.FORMAL_OBJECT__PROVENANCE:
				return getProvenance();
			case EvidencePackage.FORMAL_OBJECT__EVENT:
				return getEvent();
			case EvidencePackage.FORMAL_OBJECT__NAME:
				return getName();
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
			case EvidencePackage.FORMAL_OBJECT__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.FORMAL_OBJECT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.FORMAL_OBJECT__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.FORMAL_OBJECT__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.FORMAL_OBJECT__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.FORMAL_OBJECT__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.FORMAL_OBJECT__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.FORMAL_OBJECT__NAME:
				setName((String)newValue);
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
			case EvidencePackage.FORMAL_OBJECT__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.FORMAL_OBJECT__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.FORMAL_OBJECT__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.FORMAL_OBJECT__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.FORMAL_OBJECT__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.FORMAL_OBJECT__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.FORMAL_OBJECT__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.FORMAL_OBJECT__NAME:
				setName(NAME_EDEFAULT);
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
			case EvidencePackage.FORMAL_OBJECT__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.FORMAL_OBJECT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.FORMAL_OBJECT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.FORMAL_OBJECT__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.FORMAL_OBJECT__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.FORMAL_OBJECT__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.FORMAL_OBJECT__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.FORMAL_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FormalObjectImpl
