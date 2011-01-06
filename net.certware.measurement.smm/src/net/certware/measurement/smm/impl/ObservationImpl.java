/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm.impl;

import java.util.Date;

import net.certware.measurement.smm.Observation;
import net.certware.measurement.smm.SmmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.impl.ObservationImpl#getObserver <em>Observer</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.ObservationImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.ObservationImpl#getWhenObserved <em>When Observed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservationImpl extends SmmElementImpl implements Observation {
	/**
	 * The default value of the '{@link #getObserver() <em>Observer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserver()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObserver() <em>Observer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserver()
	 * @generated
	 * @ordered
	 */
	protected String observer = OBSERVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected String tool = TOOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhenObserved() <em>When Observed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenObserved()
	 * @generated
	 * @ordered
	 */
	protected static final Date WHEN_OBSERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhenObserved() <em>When Observed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenObserved()
	 * @generated
	 * @ordered
	 */
	protected Date whenObserved = WHEN_OBSERVED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObserver() {
		return observer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObserver(String newObserver) {
		String oldObserver = observer;
		observer = newObserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.OBSERVATION__OBSERVER, oldObserver, observer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTool(String newTool) {
		String oldTool = tool;
		tool = newTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.OBSERVATION__TOOL, oldTool, tool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getWhenObserved() {
		return whenObserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenObserved(Date newWhenObserved) {
		Date oldWhenObserved = whenObserved;
		whenObserved = newWhenObserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.OBSERVATION__WHEN_OBSERVED, oldWhenObserved, whenObserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmmPackage.OBSERVATION__OBSERVER:
				return getObserver();
			case SmmPackage.OBSERVATION__TOOL:
				return getTool();
			case SmmPackage.OBSERVATION__WHEN_OBSERVED:
				return getWhenObserved();
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
			case SmmPackage.OBSERVATION__OBSERVER:
				setObserver((String)newValue);
				return;
			case SmmPackage.OBSERVATION__TOOL:
				setTool((String)newValue);
				return;
			case SmmPackage.OBSERVATION__WHEN_OBSERVED:
				setWhenObserved((Date)newValue);
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
			case SmmPackage.OBSERVATION__OBSERVER:
				setObserver(OBSERVER_EDEFAULT);
				return;
			case SmmPackage.OBSERVATION__TOOL:
				setTool(TOOL_EDEFAULT);
				return;
			case SmmPackage.OBSERVATION__WHEN_OBSERVED:
				setWhenObserved(WHEN_OBSERVED_EDEFAULT);
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
			case SmmPackage.OBSERVATION__OBSERVER:
				return OBSERVER_EDEFAULT == null ? observer != null : !OBSERVER_EDEFAULT.equals(observer);
			case SmmPackage.OBSERVATION__TOOL:
				return TOOL_EDEFAULT == null ? tool != null : !TOOL_EDEFAULT.equals(tool);
			case SmmPackage.OBSERVATION__WHEN_OBSERVED:
				return WHEN_OBSERVED_EDEFAULT == null ? whenObserved != null : !WHEN_OBSERVED_EDEFAULT.equals(whenObserved);
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
		result.append(" (observer: "); //$NON-NLS-1$
		result.append(observer);
		result.append(", tool: "); //$NON-NLS-1$
		result.append(tool);
		result.append(", whenObserved: "); //$NON-NLS-1$
		result.append(whenObserved);
		result.append(')');
		return result.toString();
	}

} //ObservationImpl
