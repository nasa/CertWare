/**
 */
package ftp.impl;

import ftp.ElectricalValue;
import ftp.FtpPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electrical Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ftp.impl.ElectricalValueImpl#getCurrent <em>Current</em>}</li>
 *   <li>{@link ftp.impl.ElectricalValueImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link ftp.impl.ElectricalValueImpl#isAnyCurrent <em>Any Current</em>}</li>
 *   <li>{@link ftp.impl.ElectricalValueImpl#isAnyVoltage <em>Any Voltage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectricalValueImpl extends TypedPortValueImpl implements ElectricalValue {
	/**
	 * The default value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected float current = CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected float voltage = VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnyCurrent() <em>Any Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnyCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANY_CURRENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnyCurrent() <em>Any Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnyCurrent()
	 * @generated
	 * @ordered
	 */
	protected boolean anyCurrent = ANY_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnyVoltage() <em>Any Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnyVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANY_VOLTAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnyVoltage() <em>Any Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnyVoltage()
	 * @generated
	 * @ordered
	 */
	protected boolean anyVoltage = ANY_VOLTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricalValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtpPackage.Literals.ELECTRICAL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent(float newCurrent) {
		float oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.ELECTRICAL_VALUE__CURRENT, oldCurrent, current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVoltage() {
		return voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage(float newVoltage) {
		float oldVoltage = voltage;
		voltage = newVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.ELECTRICAL_VALUE__VOLTAGE, oldVoltage, voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnyCurrent() {
		return anyCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAnyCurrent(boolean newAnyCurrent) {
		boolean oldAnyCurrent = anyCurrent;
		anyCurrent = newAnyCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.ELECTRICAL_VALUE__ANY_CURRENT, oldAnyCurrent, anyCurrent));
		// custom addition:
		if (oldAnyCurrent == false && anyCurrent == true)
			setCurrent(CURRENT_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnyVoltage() {
		return anyVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAnyVoltage(boolean newAnyVoltage) {
		boolean oldAnyVoltage = anyVoltage;
		anyVoltage = newAnyVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.ELECTRICAL_VALUE__ANY_VOLTAGE, oldAnyVoltage, anyVoltage));
		// custom addition:
		if (oldAnyVoltage == false && anyVoltage == true)
			setVoltage(VOLTAGE_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FtpPackage.ELECTRICAL_VALUE__CURRENT:
				return getCurrent();
			case FtpPackage.ELECTRICAL_VALUE__VOLTAGE:
				return getVoltage();
			case FtpPackage.ELECTRICAL_VALUE__ANY_CURRENT:
				return isAnyCurrent();
			case FtpPackage.ELECTRICAL_VALUE__ANY_VOLTAGE:
				return isAnyVoltage();
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
			case FtpPackage.ELECTRICAL_VALUE__CURRENT:
				setCurrent((Float)newValue);
				return;
			case FtpPackage.ELECTRICAL_VALUE__VOLTAGE:
				setVoltage((Float)newValue);
				return;
			case FtpPackage.ELECTRICAL_VALUE__ANY_CURRENT:
				setAnyCurrent((Boolean)newValue);
				return;
			case FtpPackage.ELECTRICAL_VALUE__ANY_VOLTAGE:
				setAnyVoltage((Boolean)newValue);
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
			case FtpPackage.ELECTRICAL_VALUE__CURRENT:
				setCurrent(CURRENT_EDEFAULT);
				return;
			case FtpPackage.ELECTRICAL_VALUE__VOLTAGE:
				setVoltage(VOLTAGE_EDEFAULT);
				return;
			case FtpPackage.ELECTRICAL_VALUE__ANY_CURRENT:
				setAnyCurrent(ANY_CURRENT_EDEFAULT);
				return;
			case FtpPackage.ELECTRICAL_VALUE__ANY_VOLTAGE:
				setAnyVoltage(ANY_VOLTAGE_EDEFAULT);
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
			case FtpPackage.ELECTRICAL_VALUE__CURRENT:
				return current != CURRENT_EDEFAULT;
			case FtpPackage.ELECTRICAL_VALUE__VOLTAGE:
				return voltage != VOLTAGE_EDEFAULT;
			case FtpPackage.ELECTRICAL_VALUE__ANY_CURRENT:
				return anyCurrent != ANY_CURRENT_EDEFAULT;
			case FtpPackage.ELECTRICAL_VALUE__ANY_VOLTAGE:
				return anyVoltage != ANY_VOLTAGE_EDEFAULT;
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
		result.append(" (current: ");
		result.append(current);
		result.append(", voltage: ");
		result.append(voltage);
		result.append(", anyCurrent: ");
		result.append(anyCurrent);
		result.append(", anyVoltage: ");
		result.append(anyVoltage);
		result.append(')');
		return result.toString();
	}

} //ElectricalValueImpl
