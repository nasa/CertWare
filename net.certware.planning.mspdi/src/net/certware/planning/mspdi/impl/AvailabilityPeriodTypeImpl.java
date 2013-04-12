/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import net.certware.planning.mspdi.AvailabilityPeriodType;
import net.certware.planning.mspdi.MspdiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Availability Period Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.AvailabilityPeriodTypeImpl#getAvailableFrom <em>Available From</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AvailabilityPeriodTypeImpl#getAvailableTo <em>Available To</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.AvailabilityPeriodTypeImpl#getAvailableUnits <em>Available Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AvailabilityPeriodTypeImpl extends EObjectImpl implements AvailabilityPeriodType {
	/**
	 * The default value of the '{@link #getAvailableFrom() <em>Available From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableFrom()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar AVAILABLE_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableFrom() <em>Available From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableFrom()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar availableFrom = AVAILABLE_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableTo() <em>Available To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTo()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar AVAILABLE_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableTo() <em>Available To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTo()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar availableTo = AVAILABLE_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableUnits() <em>Available Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableUnits()
	 * @generated
	 * @ordered
	 */
	protected static final float AVAILABLE_UNITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAvailableUnits() <em>Available Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableUnits()
	 * @generated
	 * @ordered
	 */
	protected float availableUnits = AVAILABLE_UNITS_EDEFAULT;

	/**
	 * This is true if the Available Units attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean availableUnitsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailabilityPeriodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.AVAILABILITY_PERIOD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getAvailableFrom() {
		return availableFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableFrom(XMLGregorianCalendar newAvailableFrom) {
		XMLGregorianCalendar oldAvailableFrom = availableFrom;
		availableFrom = newAvailableFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.AVAILABILITY_PERIOD_TYPE__AVAILABLE_FROM, oldAvailableFrom, availableFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getAvailableTo() {
		return availableTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableTo(XMLGregorianCalendar newAvailableTo) {
		XMLGregorianCalendar oldAvailableTo = availableTo;
		availableTo = newAvailableTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.AVAILABILITY_PERIOD_TYPE__AVAILABLE_TO, oldAvailableTo, availableTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAvailableUnits() {
		return availableUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableUnits(float newAvailableUnits) {
		float oldAvailableUnits = availableUnits;
		availableUnits = newAvailableUnits;
		boolean oldAvailableUnitsESet = availableUnitsESet;
		availableUnitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.AVAILABILITY_PERIOD_TYPE__AVAILABLE_UNITS, oldAvailableUnits, availableUnits, !oldAvailableUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAvailableUnits() {
		float oldAvailableUnits = availableUnits;
		boolean oldAvailableUnitsESet = availableUnitsESet;
		availableUnits = AVAILABLE_UNITS_EDEFAULT;
		availableUnitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.AVAILABILITY_PERIOD_TYPE__AVAILABLE_UNITS, oldAvailableUnits, AVAILABLE_UNITS_EDEFAULT, oldAvailableUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAvailableUnits() {
		return availableUnitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MspdiPackage.AVAILABILITY_PERIOD_TYPE__AVAILABLE_FROM:
				return getAvailableFrom();
			case MspdiPackage.AVAILABILITY_PERIOD_TYPE__AVAILABLE_TO:
				return getAvailableTo();
			case MspdiPackage.AVAILABILITY_PERIOD_TYPE__AVAILABLE_UNITS:
				return getAvailableUnits();
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
			case MspdiPackage.AVAILABILITY_PERIOD_TYPE__AVAILABLE_FROM:
				setAvailableFrom((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.AVAILABILITY_PERIOD_TYPE__AVAILABLE_TO:
				setAvailableTo((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.AVAILABILITY_PERIOD_TYPE__AVAILABLE_UNITS:
				setAvailableUnits((Float)newValue);
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
			case MspdiPackage.AVAILABILITY_PERIOD_TYPE__AVAILABLE_FROM:
				setAvailableFrom(AVAILABLE_FROM_EDEFAULT);
				return;
			case MspdiPackage.AVAILABILITY_PERIOD_TYPE__AVAILABLE_TO:
				setAvailableTo(AVAILABLE_TO_EDEFAULT);
				return;
			case MspdiPackage.AVAILABILITY_PERIOD_TYPE__AVAILABLE_UNITS:
				unsetAvailableUnits();
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
			case MspdiPackage.AVAILABILITY_PERIOD_TYPE__AVAILABLE_FROM:
				return AVAILABLE_FROM_EDEFAULT == null ? availableFrom != null : !AVAILABLE_FROM_EDEFAULT.equals(availableFrom);
			case MspdiPackage.AVAILABILITY_PERIOD_TYPE__AVAILABLE_TO:
				return AVAILABLE_TO_EDEFAULT == null ? availableTo != null : !AVAILABLE_TO_EDEFAULT.equals(availableTo);
			case MspdiPackage.AVAILABILITY_PERIOD_TYPE__AVAILABLE_UNITS:
				return isSetAvailableUnits();
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
		result.append(" (availableFrom: ");
		result.append(availableFrom);
		result.append(", availableTo: ");
		result.append(availableTo);
		result.append(", availableUnits: ");
		if (availableUnitsESet) result.append(availableUnits); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AvailabilityPeriodTypeImpl
