/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.util.Collection;

import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.WeekDayType1;
import net.certware.planning.mspdi.WeekDaysType;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Week Days Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.WeekDaysTypeImpl#getWeekDay <em>Week Day</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeekDaysTypeImpl extends EObjectImpl implements WeekDaysType {
	/**
	 * The cached value of the '{@link #getWeekDay() <em>Week Day</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekDay()
	 * @generated
	 * @ordered
	 */
	protected EList<WeekDayType1> weekDay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeekDaysTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.WEEK_DAYS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WeekDayType1> getWeekDay() {
		if (weekDay == null) {
			weekDay = new EObjectContainmentEList<WeekDayType1>(WeekDayType1.class, this, MspdiPackage.WEEK_DAYS_TYPE__WEEK_DAY);
		}
		return weekDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MspdiPackage.WEEK_DAYS_TYPE__WEEK_DAY:
				return ((InternalEList<?>)getWeekDay()).basicRemove(otherEnd, msgs);
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
			case MspdiPackage.WEEK_DAYS_TYPE__WEEK_DAY:
				return getWeekDay();
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
			case MspdiPackage.WEEK_DAYS_TYPE__WEEK_DAY:
				getWeekDay().clear();
				getWeekDay().addAll((Collection<? extends WeekDayType1>)newValue);
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
			case MspdiPackage.WEEK_DAYS_TYPE__WEEK_DAY:
				getWeekDay().clear();
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
			case MspdiPackage.WEEK_DAYS_TYPE__WEEK_DAY:
				return weekDay != null && !weekDay.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WeekDaysTypeImpl
