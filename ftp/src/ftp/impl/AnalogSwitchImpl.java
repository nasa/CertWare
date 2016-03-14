/**
 */
package ftp.impl;

import ftp.AnalogSwitch;
import ftp.ElectricalPort;
import ftp.FtpPackage;
import ftp.Port;
import ftp.SignalPort;
import ftp.TypedPortValue;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analog Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ftp.impl.AnalogSwitchImpl#getInPort <em>In Port</em>}</li>
 *   <li>{@link ftp.impl.AnalogSwitchImpl#getSetPort <em>Set Port</em>}</li>
 *   <li>{@link ftp.impl.AnalogSwitchImpl#getOutPort <em>Out Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogSwitchImpl extends PrimitiveComponentImpl implements AnalogSwitch {
	/**
	 * The cached value of the '{@link #getInPort() <em>In Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPort()
	 * @generated
	 * @ordered
	 */
	protected ElectricalPort inPort;
	/**
	 * The cached value of the '{@link #getSetPort() <em>Set Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetPort()
	 * @generated
	 * @ordered
	 */
	protected SignalPort setPort;
	/**
	 * The cached value of the '{@link #getOutPort() <em>Out Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPort()
	 * @generated
	 * @ordered
	 */
	protected ElectricalPort outPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected AnalogSwitchImpl() {
		super();
		setType("a_switch");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtpPackage.Literals.ANALOG_SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ElectricalPort getInPort() {
		if (inPort == null) {
			ElectricalPort ep = new ElectricalPortImpl();
			ep.setType("In");
			setInPort(ep);
		}
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInPort(ElectricalPort newInPort, NotificationChain msgs) {
		ElectricalPort oldInPort = inPort;
		inPort = newInPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.ANALOG_SWITCH__IN_PORT, oldInPort, newInPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInPort(ElectricalPort newInPort) {
		if (newInPort != inPort) {
			NotificationChain msgs = null;
			if (inPort != null)
				msgs = ((InternalEObject)inPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.ANALOG_SWITCH__IN_PORT, null, msgs);
			if (newInPort != null)
				msgs = ((InternalEObject)newInPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.ANALOG_SWITCH__IN_PORT, null, msgs);
			msgs = basicSetInPort(newInPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.ANALOG_SWITCH__IN_PORT, newInPort, newInPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SignalPort getSetPort() {
		if (setPort == null) {
			SignalPort sp = new SignalPortImpl();
			sp.setType("Set");
			setSetPort(sp);
		}
		return setPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetPort(SignalPort newSetPort, NotificationChain msgs) {
		SignalPort oldSetPort = setPort;
		setPort = newSetPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.ANALOG_SWITCH__SET_PORT, oldSetPort, newSetPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetPort(SignalPort newSetPort) {
		if (newSetPort != setPort) {
			NotificationChain msgs = null;
			if (setPort != null)
				msgs = ((InternalEObject)setPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.ANALOG_SWITCH__SET_PORT, null, msgs);
			if (newSetPort != null)
				msgs = ((InternalEObject)newSetPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.ANALOG_SWITCH__SET_PORT, null, msgs);
			msgs = basicSetSetPort(newSetPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.ANALOG_SWITCH__SET_PORT, newSetPort, newSetPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ElectricalPort getOutPort() {
		if (outPort == null) {
			ElectricalPort ep = new ElectricalPortImpl();
			ep.setType("Out");
			setOutPort(ep);
		}
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutPort(ElectricalPort newOutPort, NotificationChain msgs) {
		ElectricalPort oldOutPort = outPort;
		outPort = newOutPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.ANALOG_SWITCH__OUT_PORT, oldOutPort, newOutPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutPort(ElectricalPort newOutPort) {
		if (newOutPort != outPort) {
			NotificationChain msgs = null;
			if (outPort != null)
				msgs = ((InternalEObject)outPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.ANALOG_SWITCH__OUT_PORT, null, msgs);
			if (newOutPort != null)
				msgs = ((InternalEObject)newOutPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.ANALOG_SWITCH__OUT_PORT, null, msgs);
			msgs = basicSetOutPort(newOutPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.ANALOG_SWITCH__OUT_PORT, newOutPort, newOutPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FtpPackage.ANALOG_SWITCH__IN_PORT:
				return basicSetInPort(null, msgs);
			case FtpPackage.ANALOG_SWITCH__SET_PORT:
				return basicSetSetPort(null, msgs);
			case FtpPackage.ANALOG_SWITCH__OUT_PORT:
				return basicSetOutPort(null, msgs);
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
			case FtpPackage.ANALOG_SWITCH__IN_PORT:
				return getInPort();
			case FtpPackage.ANALOG_SWITCH__SET_PORT:
				return getSetPort();
			case FtpPackage.ANALOG_SWITCH__OUT_PORT:
				return getOutPort();
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
			case FtpPackage.ANALOG_SWITCH__IN_PORT:
				setInPort((ElectricalPort)newValue);
				return;
			case FtpPackage.ANALOG_SWITCH__SET_PORT:
				setSetPort((SignalPort)newValue);
				return;
			case FtpPackage.ANALOG_SWITCH__OUT_PORT:
				setOutPort((ElectricalPort)newValue);
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
			case FtpPackage.ANALOG_SWITCH__IN_PORT:
				setInPort((ElectricalPort)null);
				return;
			case FtpPackage.ANALOG_SWITCH__SET_PORT:
				setSetPort((SignalPort)null);
				return;
			case FtpPackage.ANALOG_SWITCH__OUT_PORT:
				setOutPort((ElectricalPort)null);
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
			case FtpPackage.ANALOG_SWITCH__IN_PORT:
				return inPort != null;
			case FtpPackage.ANALOG_SWITCH__SET_PORT:
				return setPort != null;
			case FtpPackage.ANALOG_SWITCH__OUT_PORT:
				return outPort != null;
		}
		return super.eIsSet(featureID);
	}

	public List<Port> retrievePorts() {
		
		List<Port> ports = new ArrayList<Port>();
		ports.add(getInPort());
		ports.add(getSetPort());
		ports.add(getOutPort());
		return ports;
	}
	
	public List<TypedPortValue> retrieveParams() {
		
		return null;
	}
	
	public List<Predicate> translateToLogic() {
		
		if (logic == null) {
			Predicate pred = new Predicate();
			pred.functor = "a_switch/4";
			pred.stateArgs = 1;
			List<String> clauses = new ArrayList<String>();
			
			clauses.add("(a_switch(electrical(V1,I1),signal(1),electrical(V2,I2),ok):-{I1 + I2 = 0,V1-V2 = 0})");
			clauses.add("a_switch(electrical(_V1,0),signal(0),electrical(_V2,0),ok)");
			clauses.add("(a_switch(electrical(V1,I1),signal(_),electrical(V2,I2),failed(short)):-{I1 + I2 = 0,V1-V2 = 0})");
			clauses.add("a_switch(electrical(_V1,0),signal(_),electrical(_V2,0),failed(open))");
					
			pred.clauses = clauses;
			
			List<Predicate> preds = new ArrayList<Predicate>();
			preds.add(pred);
			
			logic = preds; 
		}
		return logic;
	}

} //AnalogSwitchImpl
