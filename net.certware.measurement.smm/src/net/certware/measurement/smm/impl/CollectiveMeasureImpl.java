/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm.impl;

import net.certware.measurement.smm.Accumulator;
import net.certware.measurement.smm.CollectiveMeasure;
import net.certware.measurement.smm.DimensionalMeasure;
import net.certware.measurement.smm.SmmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collective Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.impl.CollectiveMeasureImpl#getBaseMeasure <em>Base Measure</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.CollectiveMeasureImpl#getAccumulator <em>Accumulator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectiveMeasureImpl extends DimensionalMeasureImpl implements CollectiveMeasure {
	/**
	 * The cached value of the '{@link #getBaseMeasure() <em>Base Measure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasure()
	 * @generated
	 * @ordered
	 */
	protected DimensionalMeasure baseMeasure;

	/**
	 * The default value of the '{@link #getAccumulator() <em>Accumulator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccumulator()
	 * @generated
	 * @ordered
	 */
	protected static final Accumulator ACCUMULATOR_EDEFAULT = Accumulator.SUM;

	/**
	 * The cached value of the '{@link #getAccumulator() <em>Accumulator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccumulator()
	 * @generated
	 * @ordered
	 */
	protected Accumulator accumulator = ACCUMULATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectiveMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.COLLECTIVE_MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionalMeasure getBaseMeasure() {
		if (baseMeasure != null && baseMeasure.eIsProxy()) {
			InternalEObject oldBaseMeasure = (InternalEObject)baseMeasure;
			baseMeasure = (DimensionalMeasure)eResolveProxy(oldBaseMeasure);
			if (baseMeasure != oldBaseMeasure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.COLLECTIVE_MEASURE__BASE_MEASURE, oldBaseMeasure, baseMeasure));
			}
		}
		return baseMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionalMeasure basicGetBaseMeasure() {
		return baseMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseMeasure(DimensionalMeasure newBaseMeasure) {
		DimensionalMeasure oldBaseMeasure = baseMeasure;
		baseMeasure = newBaseMeasure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.COLLECTIVE_MEASURE__BASE_MEASURE, oldBaseMeasure, baseMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accumulator getAccumulator() {
		return accumulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccumulator(Accumulator newAccumulator) {
		Accumulator oldAccumulator = accumulator;
		accumulator = newAccumulator == null ? ACCUMULATOR_EDEFAULT : newAccumulator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.COLLECTIVE_MEASURE__ACCUMULATOR, oldAccumulator, accumulator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmmPackage.COLLECTIVE_MEASURE__BASE_MEASURE:
				if (resolve) return getBaseMeasure();
				return basicGetBaseMeasure();
			case SmmPackage.COLLECTIVE_MEASURE__ACCUMULATOR:
				return getAccumulator();
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
			case SmmPackage.COLLECTIVE_MEASURE__BASE_MEASURE:
				setBaseMeasure((DimensionalMeasure)newValue);
				return;
			case SmmPackage.COLLECTIVE_MEASURE__ACCUMULATOR:
				setAccumulator((Accumulator)newValue);
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
			case SmmPackage.COLLECTIVE_MEASURE__BASE_MEASURE:
				setBaseMeasure((DimensionalMeasure)null);
				return;
			case SmmPackage.COLLECTIVE_MEASURE__ACCUMULATOR:
				setAccumulator(ACCUMULATOR_EDEFAULT);
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
			case SmmPackage.COLLECTIVE_MEASURE__BASE_MEASURE:
				return baseMeasure != null;
			case SmmPackage.COLLECTIVE_MEASURE__ACCUMULATOR:
				return accumulator != ACCUMULATOR_EDEFAULT;
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
		result.append(" (accumulator: "); //$NON-NLS-1$
		result.append(accumulator);
		result.append(')');
		return result.toString();
	}

} //CollectiveMeasureImpl
