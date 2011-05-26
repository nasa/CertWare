/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.evidence.evidence.impl;

import net.certware.evidence.evidence.Contributes;
import net.certware.evidence.evidence.EvidencePackage;
import net.certware.evidence.evidence.EvidenceRelation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.impl.ContributesImpl#getRelation1 <em>Relation1</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.ContributesImpl#getRelation2 <em>Relation2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContributesImpl extends EvidenceObservationImpl implements Contributes {
	/**
	 * The cached value of the '{@link #getRelation1() <em>Relation1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation1()
	 * @generated
	 * @ordered
	 */
	protected EvidenceRelation relation1;

	/**
	 * The cached value of the '{@link #getRelation2() <em>Relation2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation2()
	 * @generated
	 * @ordered
	 */
	protected EvidenceRelation relation2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.CONTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceRelation getRelation1() {
		if (relation1 != null && relation1.eIsProxy()) {
			InternalEObject oldRelation1 = (InternalEObject)relation1;
			relation1 = (EvidenceRelation)eResolveProxy(oldRelation1);
			if (relation1 != oldRelation1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.CONTRIBUTES__RELATION1, oldRelation1, relation1));
			}
		}
		return relation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceRelation basicGetRelation1() {
		return relation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelation1(EvidenceRelation newRelation1) {
		EvidenceRelation oldRelation1 = relation1;
		relation1 = newRelation1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.CONTRIBUTES__RELATION1, oldRelation1, relation1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceRelation getRelation2() {
		if (relation2 != null && relation2.eIsProxy()) {
			InternalEObject oldRelation2 = (InternalEObject)relation2;
			relation2 = (EvidenceRelation)eResolveProxy(oldRelation2);
			if (relation2 != oldRelation2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.CONTRIBUTES__RELATION2, oldRelation2, relation2));
			}
		}
		return relation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceRelation basicGetRelation2() {
		return relation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelation2(EvidenceRelation newRelation2) {
		EvidenceRelation oldRelation2 = relation2;
		relation2 = newRelation2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.CONTRIBUTES__RELATION2, oldRelation2, relation2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.CONTRIBUTES__RELATION1:
				if (resolve) return getRelation1();
				return basicGetRelation1();
			case EvidencePackage.CONTRIBUTES__RELATION2:
				if (resolve) return getRelation2();
				return basicGetRelation2();
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
			case EvidencePackage.CONTRIBUTES__RELATION1:
				setRelation1((EvidenceRelation)newValue);
				return;
			case EvidencePackage.CONTRIBUTES__RELATION2:
				setRelation2((EvidenceRelation)newValue);
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
			case EvidencePackage.CONTRIBUTES__RELATION1:
				setRelation1((EvidenceRelation)null);
				return;
			case EvidencePackage.CONTRIBUTES__RELATION2:
				setRelation2((EvidenceRelation)null);
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
			case EvidencePackage.CONTRIBUTES__RELATION1:
				return relation1 != null;
			case EvidencePackage.CONTRIBUTES__RELATION2:
				return relation2 != null;
		}
		return super.eIsSet(featureID);
	}

} //ContributesImpl
