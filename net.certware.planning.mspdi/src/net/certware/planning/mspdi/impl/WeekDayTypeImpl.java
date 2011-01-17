/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import net.certware.planning.mspdi.DayTypeType;
import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.WeekDayType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Week Day Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.WeekDayTypeImpl#getDayType <em>Day Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.WeekDayTypeImpl#isDayWorking <em>Day Working</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeekDayTypeImpl extends EObjectImpl implements WeekDayType {
	/**
	 * The default value of the '{@link #getDayType() <em>Day Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayType()
	 * @generated
	 * @ordered
	 */
	protected static final DayTypeType DAY_TYPE_EDEFAULT = DayTypeType._0;

	/**
	 * The cached value of the '{@link #getDayType() <em>Day Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayType()
	 * @generated
	 * @ordered
	 */
	protected DayTypeType dayType = DAY_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeekDayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.WEEK_DAY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayTypeType getDayType() {
		return dayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayType(DayTypeType newDayType) {
		DayTypeType oldDayType = dayType;
		dayType = newDayType == null ? DAY_TYPE_EDEFAULT : newDayType;
		boolean oldDayTypeESet = dayTypeESet;
		dayTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.WEEK_DAY_TYPE__DAY_TYPE, oldDayType, dayType, !oldDayTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDayType() {
		DayTypeType oldDayType = dayType;
		boolean oldDayTypeESet = dayTypeESet;
		dayType = DAY_TYPE_EDEFAULT;
		dayTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.WEEK_DAY_TYPE__DAY_TYPE, oldDayType, DAY_TYPE_EDEFAULT, oldDayTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.WEEK_DAY_TYPE__DAY_WORKING, oldDayWorking, dayWorking, !oldDayWorkingESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.WEEK_DAY_TYPE__DAY_WORKING, oldDayWorking, DAY_WORKING_EDEFAULT, oldDayWorkingESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MspdiPackage.WEEK_DAY_TYPE__DAY_TYPE:
				return getDayType();
			case MspdiPackage.WEEK_DAY_TYPE__DAY_WORKING:
				return isDayWorking();
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
			case MspdiPackage.WEEK_DAY_TYPE__DAY_TYPE:
				setDayType((DayTypeType)newValue);
				return;
			case MspdiPackage.WEEK_DAY_TYPE__DAY_WORKING:
				setDayWorking((Boolean)newValue);
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
			case MspdiPackage.WEEK_DAY_TYPE__DAY_TYPE:
				unsetDayType();
				return;
			case MspdiPackage.WEEK_DAY_TYPE__DAY_WORKING:
				unsetDayWorking();
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
			case MspdiPackage.WEEK_DAY_TYPE__DAY_TYPE:
				return isSetDayType();
			case MspdiPackage.WEEK_DAY_TYPE__DAY_WORKING:
				return isSetDayWorking();
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

} //WeekDayTypeImpl
