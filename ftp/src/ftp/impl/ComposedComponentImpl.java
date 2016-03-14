/**
 */
package ftp.impl;

import ftp.Component;
import ftp.ComposedComponent;
import ftp.CompositionElement;
import ftp.Connection;
import ftp.FtpPackage;
import ftp.Port;
import ftp.SignalConstant;
import ftp.TypedPortValue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composed Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ftp.impl.ComposedComponentImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link ftp.impl.ComposedComponentImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposedComponentImpl extends ComponentImpl implements ComposedComponent {
	/**
	 * The cached value of the '{@link #getComposition() <em>Composition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionElement> composition;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtpPackage.Literals.COMPOSED_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositionElement> getComposition() {
		if (composition == null) {
			composition = new EObjectContainmentEList<CompositionElement>(CompositionElement.class, this, FtpPackage.COMPOSED_COMPONENT__COMPOSITION);
		}
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, FtpPackage.COMPOSED_COMPONENT__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FtpPackage.COMPOSED_COMPONENT__COMPOSITION:
				return ((InternalEList<?>)getComposition()).basicRemove(otherEnd, msgs);
			case FtpPackage.COMPOSED_COMPONENT__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
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
			case FtpPackage.COMPOSED_COMPONENT__COMPOSITION:
				return getComposition();
			case FtpPackage.COMPOSED_COMPONENT__PORTS:
				return getPorts();
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
			case FtpPackage.COMPOSED_COMPONENT__COMPOSITION:
				getComposition().clear();
				getComposition().addAll((Collection<? extends CompositionElement>)newValue);
				return;
			case FtpPackage.COMPOSED_COMPONENT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
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
			case FtpPackage.COMPOSED_COMPONENT__COMPOSITION:
				getComposition().clear();
				return;
			case FtpPackage.COMPOSED_COMPONENT__PORTS:
				getPorts().clear();
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
			case FtpPackage.COMPOSED_COMPONENT__COMPOSITION:
				return composition != null && !composition.isEmpty();
			case FtpPackage.COMPOSED_COMPONENT__PORTS:
				return ports != null && !ports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public List<Port> retrievePorts() {
		List<Port> ports = new ArrayList<Port>();
		ports.addAll(getPorts());
		return ports;
	}
	
	public List<TypedPortValue> retrieveParams() {
		
		return null;
	}
	
	public List<Predicate> translateToLogic() {
		
		EList<Port> ports = getPorts();
		EList<CompositionElement> elements = getComposition();
		if (ports.isEmpty() || elements.isEmpty()) {
			return null;
		}
		Map<Port,String> dict = new HashMap<Port,String>();
		PredicateSet predSet = new PredicateSet();
		
		// compose the non-state head parameters 
		StringBuffer head = new StringBuffer();
		head.append(getSafeFunctor());
		head.append("(");
		int i;
		for (i=0; i<ports.size(); i++) {
			String var = "X"+Integer.toString(i);
			dict.put(ports.get(i), var);
			if (i>0) {
				head.append(",");
			}
			head.append(var);
		}
		head.append(",");
		
		// record the non-unique components
		Map<String,Integer> comp_names = new HashMap<String,Integer>();
		for (CompositionElement e : elements) {
			if (e instanceof Component) {
				String cName = ((Component) e).getSafeFunctor();
				if (comp_names.containsKey(cName))
					comp_names.put(cName, comp_names.get(cName)+1);
				else
					comp_names.put(cName, 1);
			}
		}
		
		// compose the component() body literals
		Map<String,Integer> multi_comp_names = new HashMap<String,Integer>();
		StringBuffer body = new StringBuffer();
		int number_of_states = 0;
		int number_of_components = 0;
		for (CompositionElement e : elements) {
			if (e instanceof SignalConstant) { // GENERAIZE THIS TO PortValueConstant
				if (number_of_components > 0)
					body.append(",");
				number_of_components++;
				// component-term argument
				body.append(((Component) e).getSafeFunctor()); // functor
				body.append("(");
				List<Port> cports = ((Component) e).retrievePorts();
				for (Port p : cports) { // only one
					String var = "X"+Integer.toString(i);
					dict.put(p, var);
					i++;
					body.append(var);
					body.append(",");
				}
				List<TypedPortValue> params = ((Component) e).retrieveParams();
				for (TypedPortValue tpv : params) { // only one
					tpv.toBuffer(body);
				}
				body.append(")");
				List<Predicate> preds = ((Component) e).translateToLogic();
				for (Predicate p : preds) { // only one
					predSet.add(p); // only if unique
				}
			}
			else if (e instanceof Component) {
				String cName = ((Component) e).getSafeFunctor();
				if (number_of_components > 0)
					body.append(",");
				number_of_components++;
				body.append("component(");
				
				// name argument
				if (comp_names.get(cName) == 1) { //unique in the composition
					body.append("the");
				}
				else {
					int nth;
					if (!multi_comp_names.containsKey(cName))
						nth = 1;
					else
						nth = multi_comp_names.get(cName) + 1;
					body.append(Integer.toString(nth));
					multi_comp_names.put(cName, nth);
				}
				body.append(",");
				
				// component-term argument
				body.append(((Component) e).getSafeFunctor()); // functor
				body.append("(");
				List<Port> cports = ((Component) e).retrievePorts(); // to allow for List of fixed primitive ports
				int args = 0;
				for (Port p : cports) {
					String var = "X"+Integer.toString(i);
					dict.put(p, var);
					i++;
					if (args > 0)
						body.append(",");
					body.append(var);
					args++;
				}
				int number_of_params = 0;
				List<TypedPortValue> params = ((Component) e).retrieveParams();
				if (params != null) {
					for (TypedPortValue tpv : params) {
						if (args > 0)
							body.append(",");
						tpv.toBuffer(body);
						args++;
					}
					number_of_params = params.size();
				}
				body.append(",_),");
				
				// add the state-conjunction argument
				List<Predicate> preds = ((Component) e).translateToLogic();
				for (Predicate p : preds) {
					predSet.add(p); // only if unique
					// if this is the predicate for the Component itself ...
					if (p.functor.equals(((Component) e).getSafeFunctor()+"/"+Integer.toString(cports.size()+number_of_params+1))) {
						int how_many = p.stateArgs;
						body.append(stateVars(number_of_states+1,how_many));
						body.append(")");
						number_of_states += how_many;
					}
				}

			}
		}
		// finish the head with its state arg conjunction 
		head.append(stateVars(1,number_of_states) + ")");
		
		// compose the connection() body literals
		int number_of_connections = 0;
		for (CompositionElement e : elements) {
			if (e instanceof Connection) {
				if (number_of_connections > 0 || number_of_components > 0)
					body.append(",");
				number_of_connections++;
				body.append("connected([");
			    body.append(dict.get(((Connection) e).getFromPort())); // variable name previously assigned to this port
				body.append(",");
				body.append(dict.get(((Connection) e).getToPort())); // variable name previously assigned to this port
				body.append("])");
			}
		}
		
		// create a new Predicate object for self
		Predicate myPred = new Predicate();
		myPred.functor = safeFunctor+"/"+Integer.toString(ports.size()+1);
		myPred.stateArgs = number_of_states;
		myPred.clauses = new ArrayList<String>();
		myPred.clauses.add("(" + head + ":-" + body + ")");
		predSet.add(myPred);

		return predSet.preds;
	}
	
	private String stateVars(int from, int how_many) {
		if (how_many == 1) {
			return("S"+Integer.toString(from));
		}
		else {
			StringBuffer buf = new StringBuffer();
			buf.append("(");
			for (int i=0,n=from; i<how_many; i++,n++) {
				if (i>0)
					buf.append(",");
				buf.append("S"+Integer.toString(n));
			}
			buf.append(")");
			return buf.toString();
		}
	}
	
	public class PredicateSet {
		
		ArrayList<Predicate> preds;
		
		public PredicateSet() {
			preds = new ArrayList<Predicate>();
		}
		
		public void add(Predicate p) {
			boolean already_here = false;
			for (int i=0; i<preds.size(); i++) {
				if (p.functor.equals(preds.get(i).functor)) {
					already_here = true;
					break;
				}
			}
			if (!already_here) {
				preds.add(p);
			}
		}
	} 
	
} //ComposedComponentImpl
