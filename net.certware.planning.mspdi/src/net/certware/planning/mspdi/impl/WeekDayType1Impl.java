/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import net.certware.planning.mspdi.DayTypeType1;
import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.TimePeriodType2;
import net.certware.planning.mspdi.WeekDayType1;
import net.certware.planning.mspdi.WorkingTimesType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Week Day Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.WeekDayType1Impl#getDayType <em>Day Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.WeekDayType1Impl#isDayWorking <em>Day Working</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.WeekDayType1Impl#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.WeekDayType1Impl#getWorkingTimes <em>Working Times</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeekDayType1Impl extends EObjectImpl implements WeekDayType1 {
	/**
	 * The default value of the '{@link #getDayType() <em>Day Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayType()
	 * @generated
	 * @ordered
	 */
	protected static final DayTypeType1 DAY_TYPE_EDEFAULT = DayTypeType1._0;

	/**
	 * The cached value of the '{@link #getDayType() <em>Day Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayType()
	 * @generated
	 * @ordered
	 */
	protected DayTypeType1 dayType = DAY_TYPE_EDEFAULT;

	/**
	 * This is true if the Day Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dayTypeESet;

	/**
	 * The default value of the '{@link #isDayWorking() <em>Day Working</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDayWorking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DAY_WORKING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDayWorking() <em>Day Working</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDayWorking()
	 * @generated
	 * @ordered
	 */
	protected boolean dayWorking = DAY_WORKING_EDEFAULT;

	/**
	 * This is true if the Day Working attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dayWorkingESet;

	/**
	 * The cached value of the '{@link #getTimePeriod() <em>Time Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePeriod()
	 * @generated
	 * @ordered
	 */
	protected TimePeriodType2 timePeriod;

	/**
	 * The cached value of the '{@link #getWorkingTimes() <em>Working Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingTimes()
	 * @generated
	 * @ordered
	 */
	protected WorkingTimesType1 workingTimes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeekDayType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.WEEK_DAY_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayTypeType1 getDayType() {
		return dayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayType(DayTypeType1 newDayType) {
		DayTypeType1 oldDayType = dayType;
		dayType = newDayType == null ? DAY_TYPE_EDEFAULT : newDayType;
		boolean oldDayTypeESet = dayTypeESet;
		dayTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.WEEK_DAY_TYPE1__DAY_TYPE, oldDayType, dayType, !oldDayTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDayType() {
		DayTypeType1 oldDayType = dayType;
		boolean oldDayTypeESet = dayTypeESet;
		dayType = DAY_TYPE_EDEFAULT;
		dayTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.WEEK_DAY_TYPE1__DAY_TYPE, oldDayType, DAY_TYPE_EDEFAULT, oldDayTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDayType() {
		return dayTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDayWorking() {
		return dayWorking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayWorking(boolean newDayWorking) {
		boolean oldDayWorking = dayWorking;
		dayWorking = newDayWorking;
		boolean oldDayWorkingESet = dayWorkingESet;
		dayWorkingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.WEEK_DAY_TYPE1__DAY_WORKING, oldDayWorking, dayWorking, !oldDayWorkingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDayWorking() {
		boolean oldDayWorking = dayWorking;
		boolean oldDayWorkingESet = dayWorkingESet;
		dayWorking = DAY_WORKING_EDEFAULT;
		dayWorkingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.WEEK_DAY_TYPE1__DAY_WORKING, oldDayWorking, DAY_WORKING_EDEFAULT, oldDayWorkingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDayWorking() {
		return dayWorkingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePeriodType2 getTimePeriod() {
		return timePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimePeriod(TimePeriodType2 newTimePeriod, NotificationChain msgs) {
		TimePeriodType2 oldTimePeriod = timePeriod;
		timePeriod = newTimePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.WEEK_DAY_TYPE1__TIME_PERIOD, oldTimePeriod, newTimePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimePeriod(TimePeriodType2 newTimePeriod) {
		if (newTimePeriod != timePeriod) {
			NotificationChain msgs = null;
			if (timePeriod != null)
				msgs = ((InternalEObject)timePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.WEEK_DAY_TYPE1__TIME_PERIOD, null, msgs);
			if (newTimePeriod != null)
				msgs = ((InternalEObject)newTimePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.WEEK_DAY_TYPE1__TIME_PERIOD, null, msgs);
			msgs = basicSetTimePeriod(newTimePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.WEEK_DAY_TYPE1__TIME_PERIOD, newTimePeriod, newTimePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkingTimesType1 getWorkingTimes() {
		return workingTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkingTimes(WorkingTimesType1 newWorkingTimes, NotificationChain msgs) {
		WorkingTimesType1 oldWorkingTimes = workingTimes;
		workingTimes = newWorkingTimes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.WEEK_DAY_TYPE1__WORKING_TIMES, oldWorkingTimes, newWorkingTimes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkingTimes(WorkingTimesType1 newWorkingTimes) {
		if (newWorkingTimes != workingTimes) {
			NotificationChain msgs = null;
			if (workingTimes != null)
				msgs = ((InternalEObject)workingTimes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.WEEK_DAY_TYPE1__WORKING_TIMES, null, msgs);
			if (newWorkingTimes != null)
				msgs = ((InternalEObject)newWorkingTimes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.WEEK_DAY_TYPE1__WORKING_TIMES, null, msgs);
			msgs = basicSetWorkingTimes(newWorkingTimes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.WEEK_DAY_TYPE1__WORKING_TIMES, newWorkingTimes, newWorkingTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MspdiPackage.WEEK_DAY_TYPE1__TIME_PERIOD:
				return basicSetTimePeriod(null, msgs);
			case MspdiPackage.WEEK_DAY_TYPE1__WORKING_TIMES:
				return basicSetWorkingTimes(null, msgs);
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
			case MspdiPackage.WEEK_DAY_TYPE1__DAY_TYPE:
				return getDayType();
			case MspdiPackage.WEEK_DAY_TYPE1__DAY_WORKING:
				return isDayWorking();
			case MspdiPackage.WEEK_DAY_TYPE1__TIME_PERIOD:
				return getTimePeriod();
			case MspdiPackage.WEEK_DAY_TYPE1__WORKING_TIMES:
				return getWorkingTimes();
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
			case MspdiPackage.WEEK_DAY_TYPE1__DAY_TYPE:
				setDayType((DayTypeType1)newValue);
				return;
			case MspdiPackage.WEEK_DAY_TYPE1__DAY_WORKING:
				setDayWorking((Boolean)newValue);
				return;
			case MspdiPackage.WEEK_DAY_TYPE1__TIME_PERIOD:
				setTimePeriod((TimePeriodType2)newValue);
				return;
			case MspdiPackage.WEEK_DAY_TYPE1__WORKING_TIMES:
				setWorkingTimes((WorkingTimesType1)newValue);
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
			case MspdiPackage.WEEK_DAY_TYPE1__DAY_TYPE:
				unsetDayType();
				return;
			case MspdiPackage.WEEK_DAY_TYPE1__DAY_WORKING:
				unsetDayWorking();
				return;
			case MspdiPackage.WEEK_DAY_TYPE1__TIME_PERIOD:
				setTimePeriod((TimePeriodType2)null);
				return;
			case MspdiPackage.WEEK_DAY_TYPE1__WORKING_TIMES:
				setWorkingTimes((WorkingTimesType1)null);
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
			case MspdiPackage.WEEK_DAY_TYPE1__DAY_TYPE:
				return isSetDayType();
			case MspdiPackage.WEEK_DAY_TYPE1__DAY_WORKING:
				return isSetDayWorking();
			case MspdiPackage.WEEK_DAY_TYPE1__TIME_PERIOD:
				return timePeriod != null;
			case MspdiPackage.WEEK_DAY_TYPE1__WORKING_TIMES:
				return workingTimes != null;
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
		result.append(" (dayType: ");
		if (dayTypeESet) result.append(dayType); else result.append("<unset>");
		result.append(", dayWorking: ");
		if (dayWorkingESet) result.append(dayWorking); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //WeekDayType1Impl
