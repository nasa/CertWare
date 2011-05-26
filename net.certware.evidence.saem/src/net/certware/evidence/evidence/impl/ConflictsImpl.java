/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.evidence.evidence.impl;

import net.certware.evidence.evidence.Conflicts;
import net.certware.evidence.evidence.DomainAssertion;
import net.certware.evidence.evidence.EvidencePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conflicts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.impl.ConflictsImpl#getAssertion1 <em>Assertion1</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.ConflictsImpl#getAssertion2 <em>Assertion2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConflictsImpl extends EvidenceObservationImpl implements Conflicts {
	/**
	 * The cached value of the '{@link #getAssertion1() <em>Assertion1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertion1()
	 * @generated
	 * @ordered
	 */
	protected DomainAssertion assertion1;

	/**
	 * The cached value of the '{@link #getAssertion2() <em>Assertion2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertion2()
	 * @generated
	 * @ordered
	 */
	protected DomainAssertion assertion2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConflictsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.CONFLICTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAssertion getAssertion1() {
		if (assertion1 != null && assertion1.eIsProxy()) {
			InternalEObject oldAssertion1 = (InternalEObject)assertion1;
			assertion1 = (DomainAssertion)eResolveProxy(oldAssertion1);
			if (assertion1 != oldAssertion1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.CONFLICTS__ASSERTION1, oldAssertion1, assertion1));
			}
		}
		return assertion1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAssertion basicGetAssertion1() {
		return assertion1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssertion1(DomainAssertion newAssertion1) {
		DomainAssertion oldAssertion1 = assertion1;
		assertion1 = newAssertion1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.CONFLICTS__ASSERTION1, oldAssertion1, assertion1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAssertion getAssertion2() {
		if (assertion2 != null && assertion2.eIsProxy()) {
			InternalEObject oldAssertion2 = (InternalEObject)assertion2;
			assertion2 = (DomainAssertion)eResolveProxy(oldAssertion2);
			if (assertion2 != oldAssertion2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.CONFLICTS__ASSERTION2, oldAssertion2, assertion2));
			}
		}
		return assertion2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAssertion basicGetAssertion2() {
		return assertion2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssertion2(DomainAssertion newAssertion2) {
		DomainAssertion oldAssertion2 = assertion2;
		assertion2 = newAssertion2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.CONFLICTS__ASSERTION2, oldAssertion2, assertion2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.CONFLICTS__ASSERTION1:
				if (resolve) return getAssertion1();
				return basicGetAssertion1();
			case EvidencePackage.CONFLICTS__ASSERTION2:
				if (resolve) return getAssertion2();
				return basicGetAssertion2();
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
			case EvidencePackage.CONFLICTS__ASSERTION1:
				setAssertion1((DomainAssertion)newValue);
				return;
			case EvidencePackage.CONFLICTS__ASSERTION2:
				setAssertion2((DomainAssertion)newValue);
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
			case EvidencePackage.CONFLICTS__ASSERTION1:
				setAssertion1((DomainAssertion)null);
				return;
			case EvidencePackage.CONFLICTS__ASSERTION2:
				setAssertion2((DomainAssertion)null);
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
			case EvidencePackage.CONFLICTS__ASSERTION1:
				return assertion1 != null;
			case EvidencePackage.CONFLICTS__ASSERTION2:
				return assertion2 != null;
		}
		return super.eIsSet(featureID);
	}

} //ConflictsImpl
