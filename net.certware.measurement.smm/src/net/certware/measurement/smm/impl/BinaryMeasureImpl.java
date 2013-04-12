/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm.impl;

import net.certware.measurement.smm.BinaryMeasure;
import net.certware.measurement.smm.DimensionalMeasure;
import net.certware.measurement.smm.SmmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.impl.BinaryMeasureImpl#getFunctor <em>Functor</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.BinaryMeasureImpl#getBaseMeasure1 <em>Base Measure1</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.BinaryMeasureImpl#getBaseMeasure2 <em>Base Measure2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryMeasureImpl extends DimensionalMeasureImpl implements BinaryMeasure {
	/**
	 * The default value of the '{@link #getFunctor() <em>Functor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctor()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctor() <em>Functor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctor()
	 * @generated
	 * @ordered
	 */
	protected String functor = FUNCTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaseMeasure1() <em>Base Measure1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasure1()
	 * @generated
	 * @ordered
	 */
	protected DimensionalMeasure baseMeasure1;

	/**
	 * The cached value of the '{@link #getBaseMeasure2() <em>Base Measure2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasure2()
	 * @generated
	 * @ordered
	 */
	protected DimensionalMeasure baseMeasure2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.BINARY_MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunctor() {
		return functor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctor(String newFunctor) {
		String oldFunctor = functor;
		functor = newFunctor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.BINARY_MEASURE__FUNCTOR, oldFunctor, functor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionalMeasure getBaseMeasure1() {
		if (baseMeasure1 != null && baseMeasure1.eIsProxy()) {
			InternalEObject oldBaseMeasure1 = (InternalEObject)baseMeasure1;
			baseMeasure1 = (DimensionalMeasure)eResolveProxy(oldBaseMeasure1);
			if (baseMeasure1 != oldBaseMeasure1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.BINARY_MEASURE__BASE_MEASURE1, oldBaseMeasure1, baseMeasure1));
			}
		}
		return baseMeasure1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionalMeasure basicGetBaseMeasure1() {
		return baseMeasure1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseMeasure1(DimensionalMeasure newBaseMeasure1) {
		DimensionalMeasure oldBaseMeasure1 = baseMeasure1;
		baseMeasure1 = newBaseMeasure1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.BINARY_MEASURE__BASE_MEASURE1, oldBaseMeasure1, baseMeasure1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionalMeasure getBaseMeasure2() {
		if (baseMeasure2 != null && baseMeasure2.eIsProxy()) {
			InternalEObject oldBaseMeasure2 = (InternalEObject)baseMeasure2;
			baseMeasure2 = (DimensionalMeasure)eResolveProxy(oldBaseMeasure2);
			if (baseMeasure2 != oldBaseMeasure2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.BINARY_MEASURE__BASE_MEASURE2, oldBaseMeasure2, baseMeasure2));
			}
		}
		return baseMeasure2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionalMeasure basicGetBaseMeasure2() {
		return baseMeasure2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseMeasure2(DimensionalMeasure newBaseMeasure2) {
		DimensionalMeasure oldBaseMeasure2 = baseMeasure2;
		baseMeasure2 = newBaseMeasure2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.BINARY_MEASURE__BASE_MEASURE2, oldBaseMeasure2, baseMeasure2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmmPackage.BINARY_MEASURE__FUNCTOR:
				return getFunctor();
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE1:
				if (resolve) return getBaseMeasure1();
				return basicGetBaseMeasure1();
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE2:
				if (resolve) return getBaseMeasure2();
				return basicGetBaseMeasure2();
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
			case SmmPackage.BINARY_MEASURE__FUNCTOR:
				setFunctor((String)newValue);
				return;
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE1:
				setBaseMeasure1((DimensionalMeasure)newValue);
				return;
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE2:
				setBaseMeasure2((DimensionalMeasure)newValue);
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
			case SmmPackage.BINARY_MEASURE__FUNCTOR:
				setFunctor(FUNCTOR_EDEFAULT);
				return;
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE1:
				setBaseMeasure1((DimensionalMeasure)null);
				return;
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE2:
				setBaseMeasure2((DimensionalMeasure)null);
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
			case SmmPackage.BINARY_MEASURE__FUNCTOR:
				return FUNCTOR_EDEFAULT == null ? functor != null : !FUNCTOR_EDEFAULT.equals(functor);
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE1:
				return baseMeasure1 != null;
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE2:
				return baseMeasure2 != null;
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
		result.append(" (functor: "); //$NON-NLS-1$
		result.append(functor);
		result.append(')');
		return result.toString();
	}

} //BinaryMeasureImpl
