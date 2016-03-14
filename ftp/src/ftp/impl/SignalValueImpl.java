/**
 */
package ftp.impl;

import ftp.FtpPackage;
import ftp.SignalValue;
import ftp.SignalValues;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ftp.impl.SignalValueImpl#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalValueImpl extends TypedPortValueImpl implements SignalValue {
	/**
	 * The default value of the '{@link #getSignal() <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected static final SignalValues SIGNAL_EDEFAULT = SignalValues.OFF;

	/**
	 * The cached value of the '{@link #getSignal() <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected SignalValues signal = SIGNAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtpPackage.Literals.SIGNAL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalValues getSignal() {
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal(SignalValues newSignal) {
		SignalValues oldSignal = signal;
		signal = newSignal == null ? SIGNAL_EDEFAULT : newSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.SIGNAL_VALUE__SIGNAL, oldSignal, signal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FtpPackage.SIGNAL_VALUE__SIGNAL:
				return getSignal();
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
			case FtpPackage.SIGNAL_VALUE__SIGNAL:
				setSignal((SignalValues)newValue);
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
			case FtpPackage.SIGNAL_VALUE__SIGNAL:
				setSignal(SIGNAL_EDEFAULT);
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
			case FtpPackage.SIGNAL_VALUE__SIGNAL:
				return signal != SIGNAL_EDEFAULT;
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
		result.append(" (signal: ");
		result.append(signal);
		result.append(')');
		return result.toString();
	}

} //SignalValueImpl
