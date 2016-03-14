/**
 */
package ftp.impl;

import ftp.FtpPackage;
import ftp.VisualValue;
import ftp.VisualValues;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ftp.impl.VisualValueImpl#getBulb <em>Bulb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualValueImpl extends TypedPortValueImpl implements VisualValue {
	/**
	 * The default value of the '{@link #getBulb() <em>Bulb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulb()
	 * @generated
	 * @ordered
	 */
	protected static final VisualValues BULB_EDEFAULT = VisualValues.LIGHT;

	/**
	 * The cached value of the '{@link #getBulb() <em>Bulb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulb()
	 * @generated
	 * @ordered
	 */
	protected VisualValues bulb = BULB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtpPackage.Literals.VISUAL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualValues getBulb() {
		return bulb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBulb(VisualValues newBulb) {
		VisualValues oldBulb = bulb;
		bulb = newBulb == null ? BULB_EDEFAULT : newBulb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.VISUAL_VALUE__BULB, oldBulb, bulb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FtpPackage.VISUAL_VALUE__BULB:
				return getBulb();
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
			case FtpPackage.VISUAL_VALUE__BULB:
				setBulb((VisualValues)newValue);
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
			case FtpPackage.VISUAL_VALUE__BULB:
				setBulb(BULB_EDEFAULT);
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
			case FtpPackage.VISUAL_VALUE__BULB:
				return bulb != BULB_EDEFAULT;
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
		result.append(" (bulb: ");
		result.append(bulb);
		result.append(')');
		return result.toString();
	}

} //VisualValueImpl
