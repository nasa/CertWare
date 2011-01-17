/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.util.Collection;

import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.WorkingTimeType1;
import net.certware.planning.mspdi.WorkingTimesType1;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Working Times Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.WorkingTimesType1Impl#getWorkingTime <em>Working Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkingTimesType1Impl extends EObjectImpl implements WorkingTimesType1 {
	/**
	 * The cached value of the '{@link #getWorkingTime() <em>Working Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingTime()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkingTimeType1> workingTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkingTimesType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.WORKING_TIMES_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkingTimeType1> getWorkingTime() {
		if (workingTime == null) {
			workingTime = new EObjectContainmentEList<WorkingTimeType1>(WorkingTimeType1.class, this, MspdiPackage.WORKING_TIMES_TYPE1__WORKING_TIME);
		}
		return workingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MspdiPackage.WORKING_TIMES_TYPE1__WORKING_TIME:
				return ((InternalEList<?>)getWorkingTime()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MspdiPackage.WORKING_TIMES_TYPE1__WORKING_TIME:
				return getWorkingTime();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case MspdiPackage.WORKING_TIMES_TYPE1__WORKING_TIME:
				getWorkingTime().clear();
				getWorkingTime().addAll((Collection<? extends WorkingTimeType1>)newValue);
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
			case MspdiPackage.WORKING_TIMES_TYPE1__WORKING_TIME:
				getWorkingTime().clear();
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
			case MspdiPackage.WORKING_TIMES_TYPE1__WORKING_TIME:
				return workingTime != null && !workingTime.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkingTimesType1Impl
