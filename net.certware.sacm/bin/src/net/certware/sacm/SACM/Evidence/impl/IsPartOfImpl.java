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
import net.certware.sacm.SACM.Evidence.Exhibit;
import net.certware.sacm.SACM.Evidence.IsPartOf;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Part Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.IsPartOfImpl#getWhole <em>Whole</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IsPartOfImpl extends ExhibitPropertyImpl implements IsPartOf {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getWhole() <em>Whole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhole()
	 * @generated
	 * @ordered
	 */
	protected Exhibit whole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsPartOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.IS_PART_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exhibit getWhole() {
		if (whole != null && whole.eIsProxy()) {
			InternalEObject oldWhole = (InternalEObject)whole;
			whole = (Exhibit)eResolveProxy(oldWhole);
			if (whole != oldWhole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.IS_PART_OF__WHOLE, oldWhole, whole));
			}
		}
		return whole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exhibit basicGetWhole() {
		return whole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhole(Exhibit newWhole) {
		Exhibit oldWhole = whole;
		whole = newWhole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.IS_PART_OF__WHOLE, oldWhole, whole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.IS_PART_OF__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.IS_PART_OF__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.IS_PART_OF__ID:
				return getId();
			case EvidencePackage.IS_PART_OF__TIMING:
				return getTiming();
			case EvidencePackage.IS_PART_OF__CUSTODY:
				return getCustody();
			case EvidencePackage.IS_PART_OF__PROVENANCE:
				return getProvenance();
			case EvidencePackage.IS_PART_OF__EVENT:
				return getEvent();
			case EvidencePackage.IS_PART_OF__WHOLE:
				if (resolve) return getWhole();
				return basicGetWhole();
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
			case EvidencePackage.IS_PART_OF__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.IS_PART_OF__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.IS_PART_OF__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.IS_PART_OF__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.IS_PART_OF__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.IS_PART_OF__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.IS_PART_OF__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.IS_PART_OF__WHOLE:
				setWhole((Exhibit)newValue);
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
			case EvidencePackage.IS_PART_OF__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.IS_PART_OF__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.IS_PART_OF__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.IS_PART_OF__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.IS_PART_OF__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.IS_PART_OF__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.IS_PART_OF__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.IS_PART_OF__WHOLE:
				setWhole((Exhibit)null);
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
			case EvidencePackage.IS_PART_OF__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.IS_PART_OF__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.IS_PART_OF__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.IS_PART_OF__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.IS_PART_OF__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.IS_PART_OF__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.IS_PART_OF__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.IS_PART_OF__WHOLE:
				return whole != null;
		}
		return eDynamicIsSet(featureID);
	}

} //IsPartOfImpl
