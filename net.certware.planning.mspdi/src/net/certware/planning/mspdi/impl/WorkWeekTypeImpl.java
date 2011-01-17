/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.util.Collection;

import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.TimePeriodType;
import net.certware.planning.mspdi.WeekDayType;
import net.certware.planning.mspdi.WorkWeekType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Week Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.WorkWeekTypeImpl#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.WorkWeekTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.WorkWeekTypeImpl#getWeekDay <em>Week Day</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkWeekTypeImpl extends EObjectImpl implements WorkWeekType {
	/**
	 * The cached value of the '{@link #getTimePeriod() <em>Time Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePeriod()
	 * @generated
	 * @ordered
	 */
	protected TimePeriodType timePeriod;

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
	 * The cached value of the '{@link #getWeekDay() <em>Week Day</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekDay()
	 * @generated
	 * @ordered
	 */
	protected EList<WeekDayType> weekDay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkWeekTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.WORK_WEEK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePeriodType getTimePeriod() {
		return timePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimePeriod(TimePeriodType newTimePeriod, NotificationChain msgs) {
		TimePeriodType oldTimePeriod = timePeriod;
		timePeriod = newTimePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.WORK_WEEK_TYPE__TIME_PERIOD, oldTimePeriod, newTimePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimePeriod(TimePeriodType newTimePeriod) {
		if (newTimePeriod != timePeriod) {
			NotificationChain msgs = null;
			if (timePeriod != null)
				msgs = ((InternalEObject)timePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.WORK_WEEK_TYPE__TIME_PERIOD, null, msgs);
			if (newTimePeriod != null)
				msgs = ((InternalEObject)newTimePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.WORK_WEEK_TYPE__TIME_PERIOD, null, msgs);
			msgs = basicSetTimePeriod(newTimePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.WORK_WEEK_TYPE__TIME_PERIOD, newTimePeriod, newTimePeriod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.WORK_WEEK_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WeekDayType> getWeekDay() {
		if (weekDay == null) {
			weekDay = new EObjectContainmentEList<WeekDayType>(WeekDayType.class, this, MspdiPackage.WORK_WEEK_TYPE__WEEK_DAY);
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
			case MspdiPackage.WORK_WEEK_TYPE__TIME_PERIOD:
				return basicSetTimePeriod(null, msgs);
			case MspdiPackage.WORK_WEEK_TYPE__WEEK_DAY:
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
			case MspdiPackage.WORK_WEEK_TYPE__TIME_PERIOD:
				return getTimePeriod();
			case MspdiPackage.WORK_WEEK_TYPE__NAME:
				return getName();
			case MspdiPackage.WORK_WEEK_TYPE__WEEK_DAY:
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
			case MspdiPackage.WORK_WEEK_TYPE__TIME_PERIOD:
				setTimePeriod((TimePeriodType)newValue);
				return;
			case MspdiPackage.WORK_WEEK_TYPE__NAME:
				setName((String)newValue);
				return;
			case MspdiPackage.WORK_WEEK_TYPE__WEEK_DAY:
				getWeekDay().clear();
				getWeekDay().addAll((Collection<? extends WeekDayType>)newValue);
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
			case MspdiPackage.WORK_WEEK_TYPE__TIME_PERIOD:
				setTimePeriod((TimePeriodType)null);
				return;
			case MspdiPackage.WORK_WEEK_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MspdiPackage.WORK_WEEK_TYPE__WEEK_DAY:
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
			case MspdiPackage.WORK_WEEK_TYPE__TIME_PERIOD:
				return timePeriod != null;
			case MspdiPackage.WORK_WEEK_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MspdiPackage.WORK_WEEK_TYPE__WEEK_DAY:
				return weekDay != null && !weekDay.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WorkWeekTypeImpl
