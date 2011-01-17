/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.math.BigInteger;

import net.certware.planning.mspdi.CalendarType;
import net.certware.planning.mspdi.ExceptionsType;
import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.WeekDaysType;
import net.certware.planning.mspdi.WorkWeeksType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calendar Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.CalendarTypeImpl#getUID <em>UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.CalendarTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.CalendarTypeImpl#isIsBaseCalendar <em>Is Base Calendar</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.CalendarTypeImpl#getBaseCalendarUID <em>Base Calendar UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.CalendarTypeImpl#getWeekDays <em>Week Days</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.CalendarTypeImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.CalendarTypeImpl#getWorkWeeks <em>Work Weeks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CalendarTypeImpl extends EObjectImpl implements CalendarType {
	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger uID = UID_EDEFAULT;

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
	 * The default value of the '{@link #isIsBaseCalendar() <em>Is Base Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBaseCalendar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BASE_CALENDAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBaseCalendar() <em>Is Base Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBaseCalendar()
	 * @generated
	 * @ordered
	 */
	protected boolean isBaseCalendar = IS_BASE_CALENDAR_EDEFAULT;

	/**
	 * This is true if the Is Base Calendar attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isBaseCalendarESet;

	/**
	 * The default value of the '{@link #getBaseCalendarUID() <em>Base Calendar UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCalendarUID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BASE_CALENDAR_UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseCalendarUID() <em>Base Calendar UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCalendarUID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger baseCalendarUID = BASE_CALENDAR_UID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWeekDays() <em>Week Days</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekDays()
	 * @generated
	 * @ordered
	 */
	protected WeekDaysType weekDays;

	/**
	 * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected ExceptionsType exceptions;

	/**
	 * The cached value of the '{@link #getWorkWeeks() <em>Work Weeks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkWeeks()
	 * @generated
	 * @ordered
	 */
	protected WorkWeeksType workWeeks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalendarTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.CALENDAR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUID(BigInteger newUID) {
		BigInteger oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.CALENDAR_TYPE__UID, oldUID, uID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.CALENDAR_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBaseCalendar() {
		return isBaseCalendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBaseCalendar(boolean newIsBaseCalendar) {
		boolean oldIsBaseCalendar = isBaseCalendar;
		isBaseCalendar = newIsBaseCalendar;
		boolean oldIsBaseCalendarESet = isBaseCalendarESet;
		isBaseCalendarESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.CALENDAR_TYPE__IS_BASE_CALENDAR, oldIsBaseCalendar, isBaseCalendar, !oldIsBaseCalendarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsBaseCalendar() {
		boolean oldIsBaseCalendar = isBaseCalendar;
		boolean oldIsBaseCalendarESet = isBaseCalendarESet;
		isBaseCalendar = IS_BASE_CALENDAR_EDEFAULT;
		isBaseCalendarESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.CALENDAR_TYPE__IS_BASE_CALENDAR, oldIsBaseCalendar, IS_BASE_CALENDAR_EDEFAULT, oldIsBaseCalendarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsBaseCalendar() {
		return isBaseCalendarESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBaseCalendarUID() {
		return baseCalendarUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseCalendarUID(BigInteger newBaseCalendarUID) {
		BigInteger oldBaseCalendarUID = baseCalendarUID;
		baseCalendarUID = newBaseCalendarUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.CALENDAR_TYPE__BASE_CALENDAR_UID, oldBaseCalendarUID, baseCalendarUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekDaysType getWeekDays() {
		return weekDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeekDays(WeekDaysType newWeekDays, NotificationChain msgs) {
		WeekDaysType oldWeekDays = weekDays;
		weekDays = newWeekDays;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.CALENDAR_TYPE__WEEK_DAYS, oldWeekDays, newWeekDays);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeekDays(WeekDaysType newWeekDays) {
		if (newWeekDays != weekDays) {
			NotificationChain msgs = null;
			if (weekDays != null)
				msgs = ((InternalEObject)weekDays).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.CALENDAR_TYPE__WEEK_DAYS, null, msgs);
			if (newWeekDays != null)
				msgs = ((InternalEObject)newWeekDays).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.CALENDAR_TYPE__WEEK_DAYS, null, msgs);
			msgs = basicSetWeekDays(newWeekDays, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.CALENDAR_TYPE__WEEK_DAYS, newWeekDays, newWeekDays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionsType getExceptions() {
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptions(ExceptionsType newExceptions, NotificationChain msgs) {
		ExceptionsType oldExceptions = exceptions;
		exceptions = newExceptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.CALENDAR_TYPE__EXCEPTIONS, oldExceptions, newExceptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptions(ExceptionsType newExceptions) {
		if (newExceptions != exceptions) {
			NotificationChain msgs = null;
			if (exceptions != null)
				msgs = ((InternalEObject)exceptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.CALENDAR_TYPE__EXCEPTIONS, null, msgs);
			if (newExceptions != null)
				msgs = ((InternalEObject)newExceptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.CALENDAR_TYPE__EXCEPTIONS, null, msgs);
			msgs = basicSetExceptions(newExceptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.CALENDAR_TYPE__EXCEPTIONS, newExceptions, newExceptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkWeeksType getWorkWeeks() {
		return workWeeks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkWeeks(WorkWeeksType newWorkWeeks, NotificationChain msgs) {
		WorkWeeksType oldWorkWeeks = workWeeks;
		workWeeks = newWorkWeeks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.CALENDAR_TYPE__WORK_WEEKS, oldWorkWeeks, newWorkWeeks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkWeeks(WorkWeeksType newWorkWeeks) {
		if (newWorkWeeks != workWeeks) {
			NotificationChain msgs = null;
			if (workWeeks != null)
				msgs = ((InternalEObject)workWeeks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.CALENDAR_TYPE__WORK_WEEKS, null, msgs);
			if (newWorkWeeks != null)
				msgs = ((InternalEObject)newWorkWeeks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.CALENDAR_TYPE__WORK_WEEKS, null, msgs);
			msgs = basicSetWorkWeeks(newWorkWeeks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.CALENDAR_TYPE__WORK_WEEKS, newWorkWeeks, newWorkWeeks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MspdiPackage.CALENDAR_TYPE__WEEK_DAYS:
				return basicSetWeekDays(null, msgs);
			case MspdiPackage.CALENDAR_TYPE__EXCEPTIONS:
				return basicSetExceptions(null, msgs);
			case MspdiPackage.CALENDAR_TYPE__WORK_WEEKS:
				return basicSetWorkWeeks(null, msgs);
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
			case MspdiPackage.CALENDAR_TYPE__UID:
				return getUID();
			case MspdiPackage.CALENDAR_TYPE__NAME:
				return getName();
			case MspdiPackage.CALENDAR_TYPE__IS_BASE_CALENDAR:
				return isIsBaseCalendar();
			case MspdiPackage.CALENDAR_TYPE__BASE_CALENDAR_UID:
				return getBaseCalendarUID();
			case MspdiPackage.CALENDAR_TYPE__WEEK_DAYS:
				return getWeekDays();
			case MspdiPackage.CALENDAR_TYPE__EXCEPTIONS:
				return getExceptions();
			case MspdiPackage.CALENDAR_TYPE__WORK_WEEKS:
				return getWorkWeeks();
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
			case MspdiPackage.CALENDAR_TYPE__UID:
				setUID((BigInteger)newValue);
				return;
			case MspdiPackage.CALENDAR_TYPE__NAME:
				setName((String)newValue);
				return;
			case MspdiPackage.CALENDAR_TYPE__IS_BASE_CALENDAR:
				setIsBaseCalendar((Boolean)newValue);
				return;
			case MspdiPackage.CALENDAR_TYPE__BASE_CALENDAR_UID:
				setBaseCalendarUID((BigInteger)newValue);
				return;
			case MspdiPackage.CALENDAR_TYPE__WEEK_DAYS:
				setWeekDays((WeekDaysType)newValue);
				return;
			case MspdiPackage.CALENDAR_TYPE__EXCEPTIONS:
				setExceptions((ExceptionsType)newValue);
				return;
			case MspdiPackage.CALENDAR_TYPE__WORK_WEEKS:
				setWorkWeeks((WorkWeeksType)newValue);
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
			case MspdiPackage.CALENDAR_TYPE__UID:
				setUID(UID_EDEFAULT);
				return;
			case MspdiPackage.CALENDAR_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MspdiPackage.CALENDAR_TYPE__IS_BASE_CALENDAR:
				unsetIsBaseCalendar();
				return;
			case MspdiPackage.CALENDAR_TYPE__BASE_CALENDAR_UID:
				setBaseCalendarUID(BASE_CALENDAR_UID_EDEFAULT);
				return;
			case MspdiPackage.CALENDAR_TYPE__WEEK_DAYS:
				setWeekDays((WeekDaysType)null);
				return;
			case MspdiPackage.CALENDAR_TYPE__EXCEPTIONS:
				setExceptions((ExceptionsType)null);
				return;
			case MspdiPackage.CALENDAR_TYPE__WORK_WEEKS:
				setWorkWeeks((WorkWeeksType)null);
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
			case MspdiPackage.CALENDAR_TYPE__UID:
				return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
			case MspdiPackage.CALENDAR_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MspdiPackage.CALENDAR_TYPE__IS_BASE_CALENDAR:
				return isSetIsBaseCalendar();
			case MspdiPackage.CALENDAR_TYPE__BASE_CALENDAR_UID:
				return BASE_CALENDAR_UID_EDEFAULT == null ? baseCalendarUID != null : !BASE_CALENDAR_UID_EDEFAULT.equals(baseCalendarUID);
			case MspdiPackage.CALENDAR_TYPE__WEEK_DAYS:
				return weekDays != null;
			case MspdiPackage.CALENDAR_TYPE__EXCEPTIONS:
				return exceptions != null;
			case MspdiPackage.CALENDAR_TYPE__WORK_WEEKS:
				return workWeeks != null;
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
		result.append(" (uID: ");
		result.append(uID);
		result.append(", name: ");
		result.append(name);
		result.append(", isBaseCalendar: ");
		if (isBaseCalendarESet) result.append(isBaseCalendar); else result.append("<unset>");
		result.append(", baseCalendarUID: ");
		result.append(baseCalendarUID);
		result.append(')');
		return result.toString();
	}

} //CalendarTypeImpl
