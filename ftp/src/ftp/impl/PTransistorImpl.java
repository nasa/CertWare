/**
 */
package ftp.impl;

import ftp.FtpPackage;
import ftp.PTransistor;
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
 * An implementation of the model object '<em><b>PTransistor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ftp.impl.PTransistorImpl#getGate <em>Gate</em>}</li>
 *   <li>{@link ftp.impl.PTransistorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ftp.impl.PTransistorImpl#getDrain <em>Drain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTransistorImpl extends PrimitiveComponentImpl implements PTransistor {
	/**
	 * The cached value of the '{@link #getGate() <em>Gate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGate()
	 * @generated
	 * @ordered
	 */
	protected SignalPort gate;
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SignalPort source;
	/**
	 * The cached value of the '{@link #getDrain() <em>Drain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrain()
	 * @generated
	 * @ordered
	 */
	protected SignalPort drain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PTransistorImpl() {
		super();
		setType("ptrans");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtpPackage.Literals.PTRANSISTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SignalPort getGate() {
		if (gate == null) {
			SignalPort sp = new SignalPortImpl();
			sp.setType("Gate");
			setGate(sp);
		}
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGate(SignalPort newGate, NotificationChain msgs) {
		SignalPort oldGate = gate;
		gate = newGate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.PTRANSISTOR__GATE, oldGate, newGate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGate(SignalPort newGate) {
		if (newGate != gate) {
			NotificationChain msgs = null;
			if (gate != null)
				msgs = ((InternalEObject)gate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.PTRANSISTOR__GATE, null, msgs);
			if (newGate != null)
				msgs = ((InternalEObject)newGate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.PTRANSISTOR__GATE, null, msgs);
			msgs = basicSetGate(newGate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.PTRANSISTOR__GATE, newGate, newGate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SignalPort getSource() {
		if (source == null) {
			SignalPort sp = new SignalPortImpl();
			sp.setType("Source");
			setSource(sp);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(SignalPort newSource, NotificationChain msgs) {
		SignalPort oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.PTRANSISTOR__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SignalPort newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.PTRANSISTOR__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.PTRANSISTOR__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.PTRANSISTOR__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SignalPort getDrain() {
		if (drain == null) {
			SignalPort sp = new SignalPortImpl();
			sp.setType("Drain");
			setDrain(sp);
		}
		return drain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDrain(SignalPort newDrain, NotificationChain msgs) {
		SignalPort oldDrain = drain;
		drain = newDrain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.PTRANSISTOR__DRAIN, oldDrain, newDrain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrain(SignalPort newDrain) {
		if (newDrain != drain) {
			NotificationChain msgs = null;
			if (drain != null)
				msgs = ((InternalEObject)drain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.PTRANSISTOR__DRAIN, null, msgs);
			if (newDrain != null)
				msgs = ((InternalEObject)newDrain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.PTRANSISTOR__DRAIN, null, msgs);
			msgs = basicSetDrain(newDrain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.PTRANSISTOR__DRAIN, newDrain, newDrain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FtpPackage.PTRANSISTOR__GATE:
				return basicSetGate(null, msgs);
			case FtpPackage.PTRANSISTOR__SOURCE:
				return basicSetSource(null, msgs);
			case FtpPackage.PTRANSISTOR__DRAIN:
				return basicSetDrain(null, msgs);
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
			case FtpPackage.PTRANSISTOR__GATE:
				return getGate();
			case FtpPackage.PTRANSISTOR__SOURCE:
				return getSource();
			case FtpPackage.PTRANSISTOR__DRAIN:
				return getDrain();
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
			case FtpPackage.PTRANSISTOR__GATE:
				setGate((SignalPort)newValue);
				return;
			case FtpPackage.PTRANSISTOR__SOURCE:
				setSource((SignalPort)newValue);
				return;
			case FtpPackage.PTRANSISTOR__DRAIN:
				setDrain((SignalPort)newValue);
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
			case FtpPackage.PTRANSISTOR__GATE:
				setGate((SignalPort)null);
				return;
			case FtpPackage.PTRANSISTOR__SOURCE:
				setSource((SignalPort)null);
				return;
			case FtpPackage.PTRANSISTOR__DRAIN:
				setDrain((SignalPort)null);
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
			case FtpPackage.PTRANSISTOR__GATE:
				return gate != null;
			case FtpPackage.PTRANSISTOR__SOURCE:
				return source != null;
			case FtpPackage.PTRANSISTOR__DRAIN:
				return drain != null;
		}
		return super.eIsSet(featureID);
	}

	public List<Port> retrievePorts() {
		
		List<Port> ports = new ArrayList<Port>();
		ports.add(getGate());
		ports.add(getSource());
		ports.add(getDrain());
		return ports;
	}
	
	public List<TypedPortValue> retrieveParams() {
		
		return null;
	}
	
	public List<Predicate> translateToLogic() {
		
		if (logic == null) {
			Predicate pred = new Predicate();
			pred.functor = "ptrans/4";
			pred.stateArgs = 1;
			List<String> clauses = new ArrayList<String>();
			
			clauses.add("ptrans(signal(0),signal(Y),signal(Y),ok)");
			clauses.add("ptrans(signal(1),signal(_),signal(_),ok)");
			clauses.add("ptrans(signal(_),signal(_),signal(_),failed)");
					
			pred.clauses = clauses;
			
			List<Predicate> preds = new ArrayList<Predicate>();
			preds.add(pred);
			
			logic = preds; 
		}
		return logic;
	}

} //PTransistorImpl
