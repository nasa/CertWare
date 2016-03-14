/**
 */
package ftp.impl;

import ftp.AnalogLamp;
import ftp.ElectricalPort;
import ftp.FtpPackage;
import ftp.Port;
import ftp.TypedPortValue;
import ftp.VisualPort;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analog Lamp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ftp.impl.AnalogLampImpl#getInPort <em>In Port</em>}</li>
 *   <li>{@link ftp.impl.AnalogLampImpl#getOutPort <em>Out Port</em>}</li>
 *   <li>{@link ftp.impl.AnalogLampImpl#getLightPort <em>Light Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogLampImpl extends PrimitiveComponentImpl implements AnalogLamp {
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
	 * The cached value of the '{@link #getOutPort() <em>Out Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPort()
	 * @generated
	 * @ordered
	 */
	protected ElectricalPort outPort;
	/**
	 * The cached value of the '{@link #getLightPort() <em>Light Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightPort()
	 * @generated
	 * @ordered
	 */
	protected VisualPort lightPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected AnalogLampImpl() {
		super();
		setType("a_lamp");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtpPackage.Literals.ANALOG_LAMP;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.ANALOG_LAMP__IN_PORT, oldInPort, newInPort);
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
				msgs = ((InternalEObject)inPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.ANALOG_LAMP__IN_PORT, null, msgs);
			if (newInPort != null)
				msgs = ((InternalEObject)newInPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.ANALOG_LAMP__IN_PORT, null, msgs);
			msgs = basicSetInPort(newInPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.ANALOG_LAMP__IN_PORT, newInPort, newInPort));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.ANALOG_LAMP__OUT_PORT, oldOutPort, newOutPort);
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
				msgs = ((InternalEObject)outPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.ANALOG_LAMP__OUT_PORT, null, msgs);
			if (newOutPort != null)
				msgs = ((InternalEObject)newOutPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.ANALOG_LAMP__OUT_PORT, null, msgs);
			msgs = basicSetOutPort(newOutPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.ANALOG_LAMP__OUT_PORT, newOutPort, newOutPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VisualPort getLightPort() {
		if (lightPort == null) {
			VisualPort op = new VisualPortImpl();
			op.setType("Bulb");
			setLightPort(op);
		}
		return lightPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLightPort(VisualPort newLightPort, NotificationChain msgs) {
		VisualPort oldLightPort = lightPort;
		lightPort = newLightPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.ANALOG_LAMP__LIGHT_PORT, oldLightPort, newLightPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightPort(VisualPort newLightPort) {
		if (newLightPort != lightPort) {
			NotificationChain msgs = null;
			if (lightPort != null)
				msgs = ((InternalEObject)lightPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.ANALOG_LAMP__LIGHT_PORT, null, msgs);
			if (newLightPort != null)
				msgs = ((InternalEObject)newLightPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.ANALOG_LAMP__LIGHT_PORT, null, msgs);
			msgs = basicSetLightPort(newLightPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.ANALOG_LAMP__LIGHT_PORT, newLightPort, newLightPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FtpPackage.ANALOG_LAMP__IN_PORT:
				return basicSetInPort(null, msgs);
			case FtpPackage.ANALOG_LAMP__OUT_PORT:
				return basicSetOutPort(null, msgs);
			case FtpPackage.ANALOG_LAMP__LIGHT_PORT:
				return basicSetLightPort(null, msgs);
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
			case FtpPackage.ANALOG_LAMP__IN_PORT:
				return getInPort();
			case FtpPackage.ANALOG_LAMP__OUT_PORT:
				return getOutPort();
			case FtpPackage.ANALOG_LAMP__LIGHT_PORT:
				return getLightPort();
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
			case FtpPackage.ANALOG_LAMP__IN_PORT:
				setInPort((ElectricalPort)newValue);
				return;
			case FtpPackage.ANALOG_LAMP__OUT_PORT:
				setOutPort((ElectricalPort)newValue);
				return;
			case FtpPackage.ANALOG_LAMP__LIGHT_PORT:
				setLightPort((VisualPort)newValue);
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
			case FtpPackage.ANALOG_LAMP__IN_PORT:
				setInPort((ElectricalPort)null);
				return;
			case FtpPackage.ANALOG_LAMP__OUT_PORT:
				setOutPort((ElectricalPort)null);
				return;
			case FtpPackage.ANALOG_LAMP__LIGHT_PORT:
				setLightPort((VisualPort)null);
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
			case FtpPackage.ANALOG_LAMP__IN_PORT:
				return inPort != null;
			case FtpPackage.ANALOG_LAMP__OUT_PORT:
				return outPort != null;
			case FtpPackage.ANALOG_LAMP__LIGHT_PORT:
				return lightPort != null;
		}
		return super.eIsSet(featureID);
	}

	public List<Port> retrievePorts() {
		
		List<Port> ports = new ArrayList<Port>();
		ports.add(getInPort());
		ports.add(getOutPort());
		ports.add(getLightPort());
		return ports;
	}
	
	public List<TypedPortValue> retrieveParams() {
		
		return null;
	}
	
	public List<Predicate> translateToLogic() {
		
		if (logic == null) {
			Predicate pred = new Predicate();
			pred.functor = "a_lamp/4";
			pred.stateArgs = 1;
			List<String> clauses = new ArrayList<String>();
			
			clauses.add("a_lamp(electrical(_V1,0),electrical(_V2,0),visual(dark),failed(blown))");
			clauses.add("(a_lamp(electrical(V1,0),electrical(V2,0),visual(dark),ok):-{V1-V2 = 0})");
			clauses.add("(a_lamp(electrical(V1,I1),electrical(V2,_I2),visual(light),ok):-{V1-V2 > 0,I1 > 0})");
			clauses.add("(a_lamp(electrical(V1,I1),electrical(V2,_I2),visual(light),ok):-{V1-V2 < 0,I1 < 0})");
					
			pred.clauses = clauses;
			
			List<Predicate> preds = new ArrayList<Predicate>();
			preds.add(pred);
			
			logic = preds; 
		}
		return logic;
	}
	
} //AnalogLampImpl
