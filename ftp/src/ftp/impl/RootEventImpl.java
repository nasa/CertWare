/**
 */
package ftp.impl;

import ftp.FTNode;
import ftp.FtpPackage;
import ftp.RootEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ftp.impl.RootEventImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link ftp.impl.RootEventImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootEventImpl extends FTNodeImpl implements RootEvent {
	/**
	 * The default value of the '{@link #getObservation() <em>Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservation() <em>Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected String observation = OBSERVATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<FTNode> inputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtpPackage.Literals.ROOT_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObservation() {
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservation(String newObservation) {
		String oldObservation = observation;
		observation = newObservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.ROOT_EVENT__OBSERVATION, oldObservation, observation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FTNode> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<FTNode>(FTNode.class, this, FtpPackage.ROOT_EVENT__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FtpPackage.ROOT_EVENT__OBSERVATION:
				return getObservation();
			case FtpPackage.ROOT_EVENT__INPUTS:
				return getInputs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FtpPackage.ROOT_EVENT__OBSERVATION:
				setObservation((String)newValue);
				return;
			case FtpPackage.ROOT_EVENT__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends FTNode>)newValue);
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
			case FtpPackage.ROOT_EVENT__OBSERVATION:
				setObservation(OBSERVATION_EDEFAULT);
				return;
			case FtpPackage.ROOT_EVENT__INPUTS:
				getInputs().clear();
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
			case FtpPackage.ROOT_EVENT__OBSERVATION:
				return OBSERVATION_EDEFAULT == null ? observation != null : !OBSERVATION_EDEFAULT.equals(observation);
			case FtpPackage.ROOT_EVENT__INPUTS:
				return inputs != null && !inputs.isEmpty();
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
		result.append(" (observation: ");
		result.append(observation);
		result.append(')');
		return result.toString();
	}

} //RootEventImpl
