/**
 */
package ftp.impl;

import ftp.DFlipFlop;
import ftp.FtpPackage;
import ftp.Port;
import ftp.SignalPort;
import ftp.TypedPortValue;
import ftp.impl.Predicate;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DFlip Flop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ftp.impl.DFlipFlopImpl#getInPort <em>In Port</em>}</li>
 *   <li>{@link ftp.impl.DFlipFlopImpl#getClockPort <em>Clock Port</em>}</li>
 *   <li>{@link ftp.impl.DFlipFlopImpl#getOutPort <em>Out Port</em>}</li>
 *   <li>{@link ftp.impl.DFlipFlopImpl#getStatePort <em>State Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DFlipFlopImpl extends PrimitiveComponentImpl implements DFlipFlop {
	/**
	 * The cached value of the '{@link #getInPort() <em>In Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPort()
	 * @generated
	 * @ordered
	 */
	protected SignalPort inPort;
	/**
	 * The cached value of the '{@link #getClockPort() <em>Clock Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockPort()
	 * @generated
	 * @ordered
	 */
	protected SignalPort clockPort;
	/**
	 * The cached value of the '{@link #getOutPort() <em>Out Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPort()
	 * @generated
	 * @ordered
	 */
	protected SignalPort outPort;
	/**
	 * The cached value of the '{@link #getStatePort() <em>State Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatePort()
	 * @generated
	 * @ordered
	 */
	protected SignalPort statePort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DFlipFlopImpl() {
		super();
		setType("dTypeFlipFlop");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtpPackage.Literals.DFLIP_FLOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SignalPort getInPort() {
		if (inPort == null) {
			SignalPort sp = new SignalPortImpl();
			sp.setType("In");
			setInPort(sp);
		}
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInPort(SignalPort newInPort, NotificationChain msgs) {
		SignalPort oldInPort = inPort;
		inPort = newInPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.DFLIP_FLOP__IN_PORT, oldInPort, newInPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInPort(SignalPort newInPort) {
		if (newInPort != inPort) {
			NotificationChain msgs = null;
			if (inPort != null)
				msgs = ((InternalEObject)inPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.DFLIP_FLOP__IN_PORT, null, msgs);
			if (newInPort != null)
				msgs = ((InternalEObject)newInPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.DFLIP_FLOP__IN_PORT, null, msgs);
			msgs = basicSetInPort(newInPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.DFLIP_FLOP__IN_PORT, newInPort, newInPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SignalPort getClockPort() {
		if (clockPort == null) {
			SignalPort sp = new SignalPortImpl();
			sp.setType("Clock");
			setClockPort(sp);
		}
		return clockPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClockPort(SignalPort newClockPort, NotificationChain msgs) {
		SignalPort oldClockPort = clockPort;
		clockPort = newClockPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.DFLIP_FLOP__CLOCK_PORT, oldClockPort, newClockPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockPort(SignalPort newClockPort) {
		if (newClockPort != clockPort) {
			NotificationChain msgs = null;
			if (clockPort != null)
				msgs = ((InternalEObject)clockPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.DFLIP_FLOP__CLOCK_PORT, null, msgs);
			if (newClockPort != null)
				msgs = ((InternalEObject)newClockPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.DFLIP_FLOP__CLOCK_PORT, null, msgs);
			msgs = basicSetClockPort(newClockPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.DFLIP_FLOP__CLOCK_PORT, newClockPort, newClockPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SignalPort getOutPort() {
		if (outPort == null) {
			SignalPort sp = new SignalPortImpl();
			sp.setType("Out");
			setOutPort(sp);
		}
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutPort(SignalPort newOutPort, NotificationChain msgs) {
		SignalPort oldOutPort = outPort;
		outPort = newOutPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.DFLIP_FLOP__OUT_PORT, oldOutPort, newOutPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutPort(SignalPort newOutPort) {
		if (newOutPort != outPort) {
			NotificationChain msgs = null;
			if (outPort != null)
				msgs = ((InternalEObject)outPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.DFLIP_FLOP__OUT_PORT, null, msgs);
			if (newOutPort != null)
				msgs = ((InternalEObject)newOutPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.DFLIP_FLOP__OUT_PORT, null, msgs);
			msgs = basicSetOutPort(newOutPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.DFLIP_FLOP__OUT_PORT, newOutPort, newOutPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SignalPort getStatePort() {
		if (statePort == null) {
			SignalPort sp = new SignalPortImpl();
			sp.setType("State");
			setStatePort(sp);
		}
		return statePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatePort(SignalPort newStatePort, NotificationChain msgs) {
		SignalPort oldStatePort = statePort;
		statePort = newStatePort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.DFLIP_FLOP__STATE_PORT, oldStatePort, newStatePort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatePort(SignalPort newStatePort) {
		if (newStatePort != statePort) {
			NotificationChain msgs = null;
			if (statePort != null)
				msgs = ((InternalEObject)statePort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.DFLIP_FLOP__STATE_PORT, null, msgs);
			if (newStatePort != null)
				msgs = ((InternalEObject)newStatePort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.DFLIP_FLOP__STATE_PORT, null, msgs);
			msgs = basicSetStatePort(newStatePort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.DFLIP_FLOP__STATE_PORT, newStatePort, newStatePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FtpPackage.DFLIP_FLOP__IN_PORT:
				return basicSetInPort(null, msgs);
			case FtpPackage.DFLIP_FLOP__CLOCK_PORT:
				return basicSetClockPort(null, msgs);
			case FtpPackage.DFLIP_FLOP__OUT_PORT:
				return basicSetOutPort(null, msgs);
			case FtpPackage.DFLIP_FLOP__STATE_PORT:
				return basicSetStatePort(null, msgs);
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
			case FtpPackage.DFLIP_FLOP__IN_PORT:
				return getInPort();
			case FtpPackage.DFLIP_FLOP__CLOCK_PORT:
				return getClockPort();
			case FtpPackage.DFLIP_FLOP__OUT_PORT:
				return getOutPort();
			case FtpPackage.DFLIP_FLOP__STATE_PORT:
				return getStatePort();
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
			case FtpPackage.DFLIP_FLOP__IN_PORT:
				setInPort((SignalPort)newValue);
				return;
			case FtpPackage.DFLIP_FLOP__CLOCK_PORT:
				setClockPort((SignalPort)newValue);
				return;
			case FtpPackage.DFLIP_FLOP__OUT_PORT:
				setOutPort((SignalPort)newValue);
				return;
			case FtpPackage.DFLIP_FLOP__STATE_PORT:
				setStatePort((SignalPort)newValue);
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
			case FtpPackage.DFLIP_FLOP__IN_PORT:
				setInPort((SignalPort)null);
				return;
			case FtpPackage.DFLIP_FLOP__CLOCK_PORT:
				setClockPort((SignalPort)null);
				return;
			case FtpPackage.DFLIP_FLOP__OUT_PORT:
				setOutPort((SignalPort)null);
				return;
			case FtpPackage.DFLIP_FLOP__STATE_PORT:
				setStatePort((SignalPort)null);
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
			case FtpPackage.DFLIP_FLOP__IN_PORT:
				return inPort != null;
			case FtpPackage.DFLIP_FLOP__CLOCK_PORT:
				return clockPort != null;
			case FtpPackage.DFLIP_FLOP__OUT_PORT:
				return outPort != null;
			case FtpPackage.DFLIP_FLOP__STATE_PORT:
				return statePort != null;
		}
		return super.eIsSet(featureID);
	}

	public List<Port> retrievePorts() {
		
		List<Port> ports = new ArrayList<Port>();
		ports.add(getInPort());
		ports.add(getClockPort());
		ports.add(getOutPort());
		ports.add(getStatePort());
		return ports;
	}
	
	public List<TypedPortValue> retrieveParams() {
		
		return null;
	}
	
	public List<Predicate> translateToLogic() {
				
		if (logic == null) {
			Predicate pred = new Predicate();
			pred.functor = "dTypeFlipFlop/5";
			pred.stateArgs = 1;
			List<String> clauses = new ArrayList<String>();
			
			clauses.add("dTypeFlipFlop(signal(_),signal(0),signal(Q),signal(Q),ok)");
			clauses.add("dTypeFlipFlop(signal(D),signal(1),signal(_),signal(D),ok)");
			clauses.add("dTypeFlipFlop(signal(_),signal(_),signal(_),signal(_),failed)");
					
			pred.clauses = clauses;
			
			List<Predicate> preds = new ArrayList<Predicate>();
			preds.add(pred);
			
			logic = preds; 
		}
		return logic;
	}

} //DFlipFlopImpl
