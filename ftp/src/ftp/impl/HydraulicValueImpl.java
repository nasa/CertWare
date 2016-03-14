/**
 */
package ftp.impl;

import ftp.FtpPackage;
import ftp.HydraulicValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hydraulic Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ftp.impl.HydraulicValueImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link ftp.impl.HydraulicValueImpl#getPressure <em>Pressure</em>}</li>
 *   <li>{@link ftp.impl.HydraulicValueImpl#isAnyFlow <em>Any Flow</em>}</li>
 *   <li>{@link ftp.impl.HydraulicValueImpl#isAnyPressure <em>Any Pressure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HydraulicValueImpl extends TypedPortValueImpl implements HydraulicValue {
	/**
	 * The default value of the '{@link #getFlow() <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected static final float FLOW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFlow() <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected float flow = FLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getPressure() <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressure()
	 * @generated
	 * @ordered
	 */
	protected static final float PRESSURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPressure() <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressure()
	 * @generated
	 * @ordered
	 */
	protected float pressure = PRESSURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnyFlow() <em>Any Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnyFlow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANY_FLOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnyFlow() <em>Any Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnyFlow()
	 * @generated
	 * @ordered
	 */
	protected boolean anyFlow = ANY_FLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnyPressure() <em>Any Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnyPressure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANY_PRESSURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnyPressure() <em>Any Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnyPressure()
	 * @generated
	 * @ordered
	 */
	protected boolean anyPressure = ANY_PRESSURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydraulicValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtpPackage.Literals.HYDRAULIC_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFlow() {
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlow(float newFlow) {
		float oldFlow = flow;
		flow = newFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.HYDRAULIC_VALUE__FLOW, oldFlow, flow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPressure() {
		return pressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressure(float newPressure) {
		float oldPressure = pressure;
		pressure = newPressure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.HYDRAULIC_VALUE__PRESSURE, oldPressure, pressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnyFlow() {
		return anyFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAnyFlow(boolean newAnyFlow) {
		boolean oldAnyFlow = anyFlow;
		anyFlow = newAnyFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.HYDRAULIC_VALUE__ANY_FLOW, oldAnyFlow, anyFlow));
		if (oldAnyFlow == false && newAnyFlow == true)
			setFlow(FLOW_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnyPressure() {
		return anyPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAnyPressure(boolean newAnyPressure) {
		boolean oldAnyPressure = anyPressure;
		anyPressure = newAnyPressure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.HYDRAULIC_VALUE__ANY_PRESSURE, oldAnyPressure, anyPressure));
		if (oldAnyPressure == false && newAnyPressure == true)
			setPressure(PRESSURE_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FtpPackage.HYDRAULIC_VALUE__FLOW:
				return getFlow();
			case FtpPackage.HYDRAULIC_VALUE__PRESSURE:
				return getPressure();
			case FtpPackage.HYDRAULIC_VALUE__ANY_FLOW:
				return isAnyFlow();
			case FtpPackage.HYDRAULIC_VALUE__ANY_PRESSURE:
				return isAnyPressure();
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
			case FtpPackage.HYDRAULIC_VALUE__FLOW:
				setFlow((Float)newValue);
				return;
			case FtpPackage.HYDRAULIC_VALUE__PRESSURE:
				setPressure((Float)newValue);
				return;
			case FtpPackage.HYDRAULIC_VALUE__ANY_FLOW:
				setAnyFlow((Boolean)newValue);
				return;
			case FtpPackage.HYDRAULIC_VALUE__ANY_PRESSURE:
				setAnyPressure((Boolean)newValue);
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
			case FtpPackage.HYDRAULIC_VALUE__FLOW:
				setFlow(FLOW_EDEFAULT);
				return;
			case FtpPackage.HYDRAULIC_VALUE__PRESSURE:
				setPressure(PRESSURE_EDEFAULT);
				return;
			case FtpPackage.HYDRAULIC_VALUE__ANY_FLOW:
				setAnyFlow(ANY_FLOW_EDEFAULT);
				return;
			case FtpPackage.HYDRAULIC_VALUE__ANY_PRESSURE:
				setAnyPressure(ANY_PRESSURE_EDEFAULT);
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
			case FtpPackage.HYDRAULIC_VALUE__FLOW:
				return flow != FLOW_EDEFAULT;
			case FtpPackage.HYDRAULIC_VALUE__PRESSURE:
				return pressure != PRESSURE_EDEFAULT;
			case FtpPackage.HYDRAULIC_VALUE__ANY_FLOW:
				return anyFlow != ANY_FLOW_EDEFAULT;
			case FtpPackage.HYDRAULIC_VALUE__ANY_PRESSURE:
				return anyPressure != ANY_PRESSURE_EDEFAULT;
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
		result.append(" (flow: ");
		result.append(flow);
		result.append(", pressure: ");
		result.append(pressure);
		result.append(", anyFlow: ");
		result.append(anyFlow);
		result.append(", anyPressure: ");
		result.append(anyPressure);
		result.append(')');
		return result.toString();
	}

} //HydraulicValueImpl
