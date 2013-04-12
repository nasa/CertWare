/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.math.BigInteger;

import net.certware.planning.mspdi.ExceptionType;
import net.certware.planning.mspdi.MonthItemType;
import net.certware.planning.mspdi.MonthPositionType;
import net.certware.planning.mspdi.MonthType;
import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.TimePeriodType1;
import net.certware.planning.mspdi.TypeType;
import net.certware.planning.mspdi.WorkingTimesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.ExceptionTypeImpl#isEnteredByOccurrences <em>Entered By Occurrences</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExceptionTypeImpl#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExceptionTypeImpl#getOccurrences <em>Occurrences</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExceptionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExceptionTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExceptionTypeImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExceptionTypeImpl#getDaysOfWeek <em>Days Of Week</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExceptionTypeImpl#getMonthItem <em>Month Item</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExceptionTypeImpl#getMonthPosition <em>Month Position</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExceptionTypeImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExceptionTypeImpl#getMonthDay <em>Month Day</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExceptionTypeImpl#isDayWorking <em>Day Working</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExceptionTypeImpl#getWorkingTimes <em>Working Times</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExceptionTypeImpl extends EObjectImpl implements ExceptionType {
	/**
	 * The default value of the '{@link #isEnteredByOccurrences() <em>Entered By Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnteredByOccurrences()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENTERED_BY_OCCURRENCES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnteredByOccurrences() <em>Entered By Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnteredByOccurrences()
	 * @generated
	 * @ordered
	 */
	protected boolean enteredByOccurrences = ENTERED_BY_OCCURRENCES_EDEFAULT;

	/**
	 * This is true if the Entered By Occurrences attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enteredByOccurrencesESet;

	/**
	 * The cached value of the '{@link #getTimePeriod() <em>Time Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePeriod()
	 * @generated
	 * @ordered
	 */
	protected TimePeriodType1 timePeriod;

	/**
	 * The default value of the '{@link #getOccurrences() <em>Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrences()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OCCURRENCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOccurrences() <em>Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrences()
	 * @generated
	 * @ordered
	 */
	protected BigInteger occurrences = OCCURRENCES_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType._1;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected BigInteger period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDaysOfWeek() <em>Days Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysOfWeek()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DAYS_OF_WEEK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDaysOfWeek() <em>Days Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysOfWeek()
	 * @generated
	 * @ordered
	 */
	protected BigInteger daysOfWeek = DAYS_OF_WEEK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonthItem() <em>Month Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthItem()
	 * @generated
	 * @ordered
	 */
	protected static final MonthItemType MONTH_ITEM_EDEFAULT = MonthItemType._0;

	/**
	 * The cached value of the '{@link #getMonthItem() <em>Month Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthItem()
	 * @generated
	 * @ordered
	 */
	protected MonthItemType monthItem = MONTH_ITEM_EDEFAULT;

	/**
	 * This is true if the Month Item attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean monthItemESet;

	/**
	 * The default value of the '{@link #getMonthPosition() <em>Month Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthPosition()
	 * @generated
	 * @ordered
	 */
	protected static final MonthPositionType MONTH_POSITION_EDEFAULT = MonthPositionType._0;

	/**
	 * The cached value of the '{@link #getMonthPosition() <em>Month Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthPosition()
	 * @generated
	 * @ordered
	 */
	protected MonthPositionType monthPosition = MONTH_POSITION_EDEFAULT;

	/**
	 * This is true if the Month Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean monthPositionESet;

	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final MonthType MONTH_EDEFAULT = MonthType._0;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected MonthType month = MONTH_EDEFAULT;

	/**
	 * This is true if the Month attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean monthESet;

	/**
	 * The default value of the '{@link #getMonthDay() <em>Month Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthDay()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MONTH_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonthDay() <em>Month Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthDay()
	 * @generated
	 * @ordered
	 */
	protected BigInteger monthDay = MONTH_DAY_EDEFAULT;

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
	 * The cached value of the '{@link #getWorkingTimes() <em>Working Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingTimes()
	 * @generated
	 * @ordered
	 */
	protected WorkingTimesType workingTimes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.EXCEPTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnteredByOccurrences() {
		return enteredByOccurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnteredByOccurrences(boolean newEnteredByOccurrences) {
		boolean oldEnteredByOccurrences = enteredByOccurrences;
		enteredByOccurrences = newEnteredByOccurrences;
		boolean oldEnteredByOccurrencesESet = enteredByOccurrencesESet;
		enteredByOccurrencesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXCEPTION_TYPE__ENTERED_BY_OCCURRENCES, oldEnteredByOccurrences, enteredByOccurrences, !oldEnteredByOccurrencesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnteredByOccurrences() {
		boolean oldEnteredByOccurrences = enteredByOccurrences;
		boolean oldEnteredByOccurrencesESet = enteredByOccurrencesESet;
		enteredByOccurrences = ENTERED_BY_OCCURRENCES_EDEFAULT;
		enteredByOccurrencesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.EXCEPTION_TYPE__ENTERED_BY_OCCURRENCES, oldEnteredByOccurrences, ENTERED_BY_OCCURRENCES_EDEFAULT, oldEnteredByOccurrencesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnteredByOccurrences() {
		return enteredByOccurrencesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePeriodType1 getTimePeriod() {
		return timePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimePeriod(TimePeriodType1 newTimePeriod, NotificationChain msgs) {
		TimePeriodType1 oldTimePeriod = timePeriod;
		timePeriod = newTimePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.EXCEPTION_TYPE__TIME_PERIOD, oldTimePeriod, newTimePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimePeriod(TimePeriodType1 newTimePeriod) {
		if (newTimePeriod != timePeriod) {
			NotificationChain msgs = null;
			if (timePeriod != null)
				msgs = ((InternalEObject)timePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.EXCEPTION_TYPE__TIME_PERIOD, null, msgs);
			if (newTimePeriod != null)
				msgs = ((InternalEObject)newTimePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.EXCEPTION_TYPE__TIME_PERIOD, null, msgs);
			msgs = basicSetTimePeriod(newTimePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXCEPTION_TYPE__TIME_PERIOD, newTimePeriod, newTimePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOccurrences() {
		return occurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrences(BigInteger newOccurrences) {
		BigInteger oldOccurrences = occurrences;
		occurrences = newOccurrences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXCEPTION_TYPE__OCCURRENCES, oldOccurrences, occurrences));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXCEPTION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXCEPTION_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.EXCEPTION_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(BigInteger newPeriod) {
		BigInteger oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXCEPTION_TYPE__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDaysOfWeek() {
		return daysOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaysOfWeek(BigInteger newDaysOfWeek) {
		BigInteger oldDaysOfWeek = daysOfWeek;
		daysOfWeek = newDaysOfWeek;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXCEPTION_TYPE__DAYS_OF_WEEK, oldDaysOfWeek, daysOfWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthItemType getMonthItem() {
		return monthItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonthItem(MonthItemType newMonthItem) {
		MonthItemType oldMonthItem = monthItem;
		monthItem = newMonthItem == null ? MONTH_ITEM_EDEFAULT : newMonthItem;
		boolean oldMonthItemESet = monthItemESet;
		monthItemESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXCEPTION_TYPE__MONTH_ITEM, oldMonthItem, monthItem, !oldMonthItemESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMonthItem() {
		MonthItemType oldMonthItem = monthItem;
		boolean oldMonthItemESet = monthItemESet;
		monthItem = MONTH_ITEM_EDEFAULT;
		monthItemESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.EXCEPTION_TYPE__MONTH_ITEM, oldMonthItem, MONTH_ITEM_EDEFAULT, oldMonthItemESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMonthItem() {
		return monthItemESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthPositionType getMonthPosition() {
		return monthPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonthPosition(MonthPositionType newMonthPosition) {
		MonthPositionType oldMonthPosition = monthPosition;
		monthPosition = newMonthPosition == null ? MONTH_POSITION_EDEFAULT : newMonthPosition;
		boolean oldMonthPositionESet = monthPositionESet;
		monthPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXCEPTION_TYPE__MONTH_POSITION, oldMonthPosition, monthPosition, !oldMonthPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMonthPosition() {
		MonthPositionType oldMonthPosition = monthPosition;
		boolean oldMonthPositionESet = monthPositionESet;
		monthPosition = MONTH_POSITION_EDEFAULT;
		monthPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.EXCEPTION_TYPE__MONTH_POSITION, oldMonthPosition, MONTH_POSITION_EDEFAULT, oldMonthPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMonthPosition() {
		return monthPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthType getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(MonthType newMonth) {
		MonthType oldMonth = month;
		month = newMonth == null ? MONTH_EDEFAULT : newMonth;
		boolean oldMonthESet = monthESet;
		monthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXCEPTION_TYPE__MONTH, oldMonth, month, !oldMonthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMonth() {
		MonthType oldMonth = month;
		boolean oldMonthESet = monthESet;
		month = MONTH_EDEFAULT;
		monthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.EXCEPTION_TYPE__MONTH, oldMonth, MONTH_EDEFAULT, oldMonthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMonth() {
		return monthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMonthDay() {
		return monthDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonthDay(BigInteger newMonthDay) {
		BigInteger oldMonthDay = monthDay;
		monthDay = newMonthDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXCEPTION_TYPE__MONTH_DAY, oldMonthDay, monthDay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXCEPTION_TYPE__DAY_WORKING, oldDayWorking, dayWorking, !oldDayWorkingESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.EXCEPTION_TYPE__DAY_WORKING, oldDayWorking, DAY_WORKING_EDEFAULT, oldDayWorkingESet));
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
	public WorkingTimesType getWorkingTimes() {
		return workingTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkingTimes(WorkingTimesType newWorkingTimes, NotificationChain msgs) {
		WorkingTimesType oldWorkingTimes = workingTimes;
		workingTimes = newWorkingTimes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.EXCEPTION_TYPE__WORKING_TIMES, oldWorkingTimes, newWorkingTimes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkingTimes(WorkingTimesType newWorkingTimes) {
		if (newWorkingTimes != workingTimes) {
			NotificationChain msgs = null;
			if (workingTimes != null)
				msgs = ((InternalEObject)workingTimes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.EXCEPTION_TYPE__WORKING_TIMES, null, msgs);
			if (newWorkingTimes != null)
				msgs = ((InternalEObject)newWorkingTimes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.EXCEPTION_TYPE__WORKING_TIMES, null, msgs);
			msgs = basicSetWorkingTimes(newWorkingTimes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXCEPTION_TYPE__WORKING_TIMES, newWorkingTimes, newWorkingTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MspdiPackage.EXCEPTION_TYPE__TIME_PERIOD:
				return basicSetTimePeriod(null, msgs);
			case MspdiPackage.EXCEPTION_TYPE__WORKING_TIMES:
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
			case MspdiPackage.EXCEPTION_TYPE__ENTERED_BY_OCCURRENCES:
				return isEnteredByOccurrences();
			case MspdiPackage.EXCEPTION_TYPE__TIME_PERIOD:
				return getTimePeriod();
			case MspdiPackage.EXCEPTION_TYPE__OCCURRENCES:
				return getOccurrences();
			case MspdiPackage.EXCEPTION_TYPE__NAME:
				return getName();
			case MspdiPackage.EXCEPTION_TYPE__TYPE:
				return getType();
			case MspdiPackage.EXCEPTION_TYPE__PERIOD:
				return getPeriod();
			case MspdiPackage.EXCEPTION_TYPE__DAYS_OF_WEEK:
				return getDaysOfWeek();
			case MspdiPackage.EXCEPTION_TYPE__MONTH_ITEM:
				return getMonthItem();
			case MspdiPackage.EXCEPTION_TYPE__MONTH_POSITION:
				return getMonthPosition();
			case MspdiPackage.EXCEPTION_TYPE__MONTH:
				return getMonth();
			case MspdiPackage.EXCEPTION_TYPE__MONTH_DAY:
				return getMonthDay();
			case MspdiPackage.EXCEPTION_TYPE__DAY_WORKING:
				return isDayWorking();
			case MspdiPackage.EXCEPTION_TYPE__WORKING_TIMES:
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
			case MspdiPackage.EXCEPTION_TYPE__ENTERED_BY_OCCURRENCES:
				setEnteredByOccurrences((Boolean)newValue);
				return;
			case MspdiPackage.EXCEPTION_TYPE__TIME_PERIOD:
				setTimePeriod((TimePeriodType1)newValue);
				return;
			case MspdiPackage.EXCEPTION_TYPE__OCCURRENCES:
				setOccurrences((BigInteger)newValue);
				return;
			case MspdiPackage.EXCEPTION_TYPE__NAME:
				setName((String)newValue);
				return;
			case MspdiPackage.EXCEPTION_TYPE__TYPE:
				setType((TypeType)newValue);
				return;
			case MspdiPackage.EXCEPTION_TYPE__PERIOD:
				setPeriod((BigInteger)newValue);
				return;
			case MspdiPackage.EXCEPTION_TYPE__DAYS_OF_WEEK:
				setDaysOfWeek((BigInteger)newValue);
				return;
			case MspdiPackage.EXCEPTION_TYPE__MONTH_ITEM:
				setMonthItem((MonthItemType)newValue);
				return;
			case MspdiPackage.EXCEPTION_TYPE__MONTH_POSITION:
				setMonthPosition((MonthPositionType)newValue);
				return;
			case MspdiPackage.EXCEPTION_TYPE__MONTH:
				setMonth((MonthType)newValue);
				return;
			case MspdiPackage.EXCEPTION_TYPE__MONTH_DAY:
				setMonthDay((BigInteger)newValue);
				return;
			case MspdiPackage.EXCEPTION_TYPE__DAY_WORKING:
				setDayWorking((Boolean)newValue);
				return;
			case MspdiPackage.EXCEPTION_TYPE__WORKING_TIMES:
				setWorkingTimes((WorkingTimesType)newValue);
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
			case MspdiPackage.EXCEPTION_TYPE__ENTERED_BY_OCCURRENCES:
				unsetEnteredByOccurrences();
				return;
			case MspdiPackage.EXCEPTION_TYPE__TIME_PERIOD:
				setTimePeriod((TimePeriodType1)null);
				return;
			case MspdiPackage.EXCEPTION_TYPE__OCCURRENCES:
				setOccurrences(OCCURRENCES_EDEFAULT);
				return;
			case MspdiPackage.EXCEPTION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MspdiPackage.EXCEPTION_TYPE__TYPE:
				unsetType();
				return;
			case MspdiPackage.EXCEPTION_TYPE__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case MspdiPackage.EXCEPTION_TYPE__DAYS_OF_WEEK:
				setDaysOfWeek(DAYS_OF_WEEK_EDEFAULT);
				return;
			case MspdiPackage.EXCEPTION_TYPE__MONTH_ITEM:
				unsetMonthItem();
				return;
			case MspdiPackage.EXCEPTION_TYPE__MONTH_POSITION:
				unsetMonthPosition();
				return;
			case MspdiPackage.EXCEPTION_TYPE__MONTH:
				unsetMonth();
				return;
			case MspdiPackage.EXCEPTION_TYPE__MONTH_DAY:
				setMonthDay(MONTH_DAY_EDEFAULT);
				return;
			case MspdiPackage.EXCEPTION_TYPE__DAY_WORKING:
				unsetDayWorking();
				return;
			case MspdiPackage.EXCEPTION_TYPE__WORKING_TIMES:
				setWorkingTimes((WorkingTimesType)null);
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
			case MspdiPackage.EXCEPTION_TYPE__ENTERED_BY_OCCURRENCES:
				return isSetEnteredByOccurrences();
			case MspdiPackage.EXCEPTION_TYPE__TIME_PERIOD:
				return timePeriod != null;
			case MspdiPackage.EXCEPTION_TYPE__OCCURRENCES:
				return OCCURRENCES_EDEFAULT == null ? occurrences != null : !OCCURRENCES_EDEFAULT.equals(occurrences);
			case MspdiPackage.EXCEPTION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MspdiPackage.EXCEPTION_TYPE__TYPE:
				return isSetType();
			case MspdiPackage.EXCEPTION_TYPE__PERIOD:
				return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
			case MspdiPackage.EXCEPTION_TYPE__DAYS_OF_WEEK:
				return DAYS_OF_WEEK_EDEFAULT == null ? daysOfWeek != null : !DAYS_OF_WEEK_EDEFAULT.equals(daysOfWeek);
			case MspdiPackage.EXCEPTION_TYPE__MONTH_ITEM:
				return isSetMonthItem();
			case MspdiPackage.EXCEPTION_TYPE__MONTH_POSITION:
				return isSetMonthPosition();
			case MspdiPackage.EXCEPTION_TYPE__MONTH:
				return isSetMonth();
			case MspdiPackage.EXCEPTION_TYPE__MONTH_DAY:
				return MONTH_DAY_EDEFAULT == null ? monthDay != null : !MONTH_DAY_EDEFAULT.equals(monthDay);
			case MspdiPackage.EXCEPTION_TYPE__DAY_WORKING:
				return isSetDayWorking();
			case MspdiPackage.EXCEPTION_TYPE__WORKING_TIMES:
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
		result.append(" (enteredByOccurrences: ");
		if (enteredByOccurrencesESet) result.append(enteredByOccurrences); else result.append("<unset>");
		result.append(", occurrences: ");
		result.append(occurrences);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", period: ");
		result.append(period);
		result.append(", daysOfWeek: ");
		result.append(daysOfWeek);
		result.append(", monthItem: ");
		if (monthItemESet) result.append(monthItem); else result.append("<unset>");
		result.append(", monthPosition: ");
		if (monthPositionESet) result.append(monthPosition); else result.append("<unset>");
		result.append(", month: ");
		if (monthESet) result.append(month); else result.append("<unset>");
		result.append(", monthDay: ");
		result.append(monthDay);
		result.append(", dayWorking: ");
		if (dayWorkingESet) result.append(dayWorking); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ExceptionTypeImpl
