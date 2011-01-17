/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.WorkingTimeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Working Time Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.WorkingTimeTypeImpl#getFromTime <em>From Time</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.WorkingTimeTypeImpl#getToTime <em>To Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkingTimeTypeImpl extends EObjectImpl implements WorkingTimeType {
	/**
	 * The default value of the '{@link #getFromTime() <em>From Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FROM_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromTime() <em>From Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar fromTime = FROM_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getToTime() <em>To Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TO_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToTime() <em>To Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar toTime = TO_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkingTimeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.WORKING_TIME_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFromTime() {
		return fromTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromTime(XMLGregorianCalendar newFromTime) {
		XMLGregorianCalendar oldFromTime = fromTime;
		fromTime = newFromTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.WORKING_TIME_TYPE__FROM_TIME, oldFromTime, fromTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getToTime() {
		return toTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToTime(XMLGregorianCalendar newToTime) {
		XMLGregorianCalendar oldToTime = toTime;
		toTime = newToTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.WORKING_TIME_TYPE__TO_TIME, oldToTime, toTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MspdiPackage.WORKING_TIME_TYPE__FROM_TIME:
				return getFromTime();
			case MspdiPackage.WORKING_TIME_TYPE__TO_TIME:
				return getToTime();
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
			case MspdiPackage.WORKING_TIME_TYPE__FROM_TIME:
				setFromTime((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.WORKING_TIME_TYPE__TO_TIME:
				setToTime((XMLGregorianCalendar)newValue);
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
			case MspdiPackage.WORKING_TIME_TYPE__FROM_TIME:
				setFromTime(FROM_TIME_EDEFAULT);
				return;
			case MspdiPackage.WORKING_TIME_TYPE__TO_TIME:
				setToTime(TO_TIME_EDEFAULT);
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
			case MspdiPackage.WORKING_TIME_TYPE__FROM_TIME:
				return FROM_TIME_EDEFAULT == null ? fromTime != null : !FROM_TIME_EDEFAULT.equals(fromTime);
			case MspdiPackage.WORKING_TIME_TYPE__TO_TIME:
				return TO_TIME_EDEFAULT == null ? toTime != null : !TO_TIME_EDEFAULT.equals(toTime);
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
		result.append(" (fromTime: ");
		result.append(fromTime);
		result.append(", toTime: ");
		result.append(toTime);
		result.append(')');
		return result.toString();
	}

} //WorkingTimeTypeImpl
