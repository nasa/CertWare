/**
 */
package ftp.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.cs3.prolog.connector.Connector;
import org.cs3.prolog.connector.process.PrologProcess;
import org.cs3.prolog.connector.process.PrologProcessException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ftp.AndGate;
import ftp.Component;
import ftp.FTNode;
import ftp.Fault;
import ftp.FaultTree;
import ftp.FtpPackage;
import ftp.Observation;
import ftp.OrGate;
import ftp.Port;
import ftp.PortValue;
import ftp.RootEvent;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ftp.impl.ObservationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link ftp.impl.ObservationImpl#getPortValues <em>Port Values</em>}</li>
 *   <li>{@link ftp.impl.ObservationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ftp.impl.ObservationImpl#getFaultLimit <em>Fault Limit</em>}</li>
 *   <li>{@link ftp.impl.ObservationImpl#getFaulttree <em>Faulttree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationImpl extends MinimalEObjectImpl.Container implements Observation {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * The cached value of the '{@link #getPortValues() <em>Port Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortValues()
	 * @generated
	 * @ordered
	 */
	protected EList<PortValue> portValues;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaultLimit() <em>Fault Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int FAULT_LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFaultLimit() <em>Fault Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultLimit()
	 * @generated
	 * @ordered
	 */
	protected int faultLimit = FAULT_LIMIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFaulttree() <em>Faulttree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaulttree()
	 * @generated
	 * @ordered
	 */
	protected FaultTree faulttree;

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
		return FtpPackage.Literals.OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (Component)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FtpPackage.OBSERVATION__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.OBSERVATION__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortValue> getPortValues() {
		if (portValues == null) {
			portValues = new EObjectContainmentEList<PortValue>(PortValue.class, this, FtpPackage.OBSERVATION__PORT_VALUES);
		}
		return portValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.OBSERVATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFaultLimit() {
		return faultLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultLimit(int newFaultLimit) {
		int oldFaultLimit = faultLimit;
		faultLimit = newFaultLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.OBSERVATION__FAULT_LIMIT, oldFaultLimit, faultLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultTree getFaulttree() {
		return faulttree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaulttree(FaultTree newFaulttree, NotificationChain msgs) {
		FaultTree oldFaulttree = faulttree;
		faulttree = newFaulttree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtpPackage.OBSERVATION__FAULTTREE, oldFaulttree, newFaulttree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaulttree(FaultTree newFaulttree) {
		if (newFaulttree != faulttree) {
			NotificationChain msgs = null;
			if (faulttree != null)
				msgs = ((InternalEObject)faulttree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtpPackage.OBSERVATION__FAULTTREE, null, msgs);
			if (newFaulttree != null)
				msgs = ((InternalEObject)newFaulttree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtpPackage.OBSERVATION__FAULTTREE, null, msgs);
			msgs = basicSetFaulttree(newFaulttree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtpPackage.OBSERVATION__FAULTTREE, newFaulttree, newFaulttree));
	}

	private static final String compile_fault_trees_pl = "assertz((:-(min_fault_tree(A,B,I),','(copy_term(','(A,B),','(D,C)),','(setof(C,D,E),','(filter_for_time_and_fails(E,F),','(!,','(eliminate_supersets(F,G),','(!,','(factor_intersections(G,H),','(!,boolean_conversion(or,H,I)))))))))))),assertz((:-(min_fault_tree(A,B,C,I),','(findall(D,prune(A,B,C,D),E),','(sort(E,F),','(eliminate_supersets(F,G),','(!,','(factor_intersections(G,H),','(!,boolean_conversion(or,H,I)))))))))),assertz((:-(prune(A,B,E,D),','(call(A),','(convert_time_series(B,C),','(filter_conj(C,D),','(=(D,'.'(_,_)),fault_limit(E,D)))))))),assertz(fault_limit(fault_limit(0),_)),assertz((:-(fault_limit(fault_limit(A),B),','(>(A,0),','(length(B,C),<(C,+(A,1))))))),assertz(filter_for_time_and_fails([],[])),assertz((:-(filter_for_time_and_fails('.'(A,C),F),','(convert_time_series(A,B),','(filter_conj(B,D),','(filter_for_time_and_fails(C,E),combine(D,E,F))))))),assertz(combine([],A,A)),assertz((:-(combine(A,B,'.'(A,B)),\\=(A,[])))),assertz((:-(convert_time_series(A,B),','(is_a_list(A),','(!,convert_time_series(1,A,B)))))),assertz(convert_time_series(state(A,B),state(0,A,B))),assertz((:-(convert_time_series(','(A,C),','(B,D)),','(convert_time_series(A,B),convert_time_series(C,D))))),assertz((:-(convert_time_series(A,'.'(B,[]),C),convert_time_conj(A,B,C)))),assertz((:-(convert_time_series(A,'.'(B,E),','(C,F)),','(convert_time_conj(A,B,C),','(is(D,+(A,1)),convert_time_series(D,E,F)))))),assertz(convert_time_conj(A,state(B,C),state(A,B,C))),assertz((:-(convert_time_conj(A,','(state(B,C),D),','(state(A,B,C),E)),convert_time_conj(A,D,E)))),assertz((:-(filter_conj(','(A,B),E),','(filter_conj(A,C),','(filter_conj(B,D),append(C,D,E)))))),assertz((:-(filter_conj(state(_,_,A),[]),\\+(fail_state(A))))),assertz((:-(filter_conj(state(A,B,C),'.'(state(A,B,C),[])),fail_state(C)))),assertz(fail_state(failed)),assertz(fail_state(failed(_))),assertz(eliminate_supersets([],[])),assertz((:-(eliminate_supersets('.'(A,B),F),','(part(A,B,C,D),','(eliminate_supersets(C,E),append(D,E,F)))))),assertz((:-(part(A,[],[],'.'(A,[])),!))),assertz((:-(part(A,'.'(B,D),E,F),','(subset(A,B,C),part(C,A,'.'(B,D),E,F))))),assertz((:-(part(right,_,A,A,[]),!))),assertz((:-(part(A,B,'.'(_,C),D,E),','(;(=(A,left),=(A,both)),','(!,part(B,C,D,E)))))),assertz((:-(part(neither,B,'.'(A,C),'.'(A,D),E),part(B,C,D,E)))),assertz((:-(subset(A,B,G),','(intersection(A,B,C),','(!,','(size(A,D),','(size(B,E),','(size(C,F),q(D,E,F,G))))))))),assertz((:-(q(A,A,A,both),!))),assertz((:-(q(A,_,A,left),!))),assertz((:-(q(_,A,A,right),!))),assertz(q(_,_,_,neither)),assertz(factor_intersections([],[])),assertz((:-(factor_intersections(A,E),','(largest_common_subset(A,B,C,D),factor_intersections0(A,B,C,D,E))))),assertz(factor_intersections0(A,none,[],_,A)),assertz((:-(factor_intersections0(_,A,B,D,G),','(differences(A,B,C),','(append(A,'.'(C,[]),E),','(factor_intersections(D,F),append('.'(E,[]),F,G))))))),assertz((:-(largest_common_subset(A,C,D,E),','(lcs([],A,B),','(most_leaves_eliminated(B,C),split(A,C,D,E)))))),assertz(lcs(A,[],A)),assertz((:-(lcs(A,'.'(B,C),E),','(lcs0(A,B,C,D),lcs(D,C,E))))),assertz(lcs0(A,_,[],A)),assertz((:-(lcs0(E,A,'.'(B,G),H),','(intersection(A,B,C),','(size(C,D),','(add_unique(','(C,D),E,F),lcs0(F,A,G,H))))))),assertz(size([],0)),assertz((:-(size('.'(_,A),B),','(size(A,C),is(B,+(C,1)))))),assertz(add_unique(','([],0),A,A)),assertz(add_unique(','(A,B),[],'.'(','(A,B),[]))),assertz((:-(add_unique(','(A,E),'.'(','(A,D),B),'.'(','(A,C),B)),is(C,+(D,E))))),assertz((:-(add_unique(','(C,D),'.'(','(A,B),E),'.'(','(A,B),F)),','(\\+(=(C,A)),add_unique(','(C,D),E,F))))),assertz((:-(most_leaves_eliminated(A,B),mle(','(none,0),A,B)))),assertz(mle(','(A,_),[],A)),assertz((:-(mle(','(_,A),'.'(','(C,B),D),E),','(<(A,B),mle(','(C,B),D,E))))),assertz((:-(mle(','(C,A),'.'(','(_,B),D),E),','(\\+(<(A,B)),mle(','(C,A),D,E))))),assertz(differences(_,[],[])),assertz((:-(differences(A,'.'(B,D),'.'(C,E)),','(diff(A,B,C),differences(A,D,E))))),assertz(diff([],A,A)),assertz(diff(_,[],[])),assertz((:-(diff('.'(A,C),B,E),','(remove(A,B,D),diff(C,D,E))))),assertz(remove(_,[],[])),assertz(remove(A,'.'(A,B),B)),assertz((:-(remove(B,'.'(A,C),'.'(A,D)),','(\\+(=(B,A)),remove(B,C,D))))),assertz(split(A,none,[],A)),assertz(split([],_,[],[])),assertz((:-(split('.'(A,B),A,C,D),split(B,A,C,D)))),assertz((:-(split('.'(A,C),B,D,'.'(A,E)),','(\\+(=(A,B)),','(intersection(A,B,[]),split(C,B,D,E)))))),assertz((:-(split('.'(A,C),B,'.'(A,D),E),','(\\+(=(A,B)),','(intersection(A,B,'.'(_,_)),split(C,B,D,E)))))),assertz(intersection([],_,[])),assertz(intersection(_,[],[])),assertz((:-(intersection('.'(A,C),B,'.'(A,D)),','(member(A,B),intersection(C,B,D))))),assertz((:-(intersection('.'(A,C),B,D),','(\\+(member(A,B)),intersection(C,B,D))))),assertz((:-(member(A,'.'(A,_)),!))),assertz((:-(member(A,'.'(_,B)),member(A,B)))),assertz(boolean_conversion(_,[],[])),assertz((:-(boolean_conversion(_,A,A),=(A,fault(_))))),assertz((:-(boolean_conversion(_,A,B),','(=(A,state(_,_,_)),flatten_state(A,B))))),assertz((:-(boolean_conversion(A,'.'(C,[]),D),','(switch_op(A,B),boolean_conversion(B,C,D))))),assertz((:-(boolean_conversion(B,A,D),','(=(A,'.'(_,'.'(_,_))),','(switch_op(B,C),','(convert_subterms(C,A,E),=..(D,'.'(B,E)))))))),assertz((:-(flatten_state(state(F,A,B),fault(G)),','(flatten_list(A,C),','(atomize_term(B,D),','(atom_concat(C,D,E),add_time(E,F,G))))))),assertz(flatten_list([],'')),assertz((:-(flatten_list('.'(B,A),E),','(flatten_list(A,D),','(atom_concat(B,' ',C),atom_concat(C,D,E)))))),assertz((:-(atomize_term(A,A),','(atom(A),!)))),assertz((:-(atomize_term(A,B),','(number(A),','(!,atom_number(B,A)))))),assertz((:-(atomize_term(A,F),','(=..(A,'.'(B,C)),','(atom_concat(B,'(',D),','(atomize_args(C,E),atom_concat(D,E,F))))))),assertz(atomize_args([],')')),assertz((:-(atomize_args('.'(B,A),E),','(atomize_args(A,D),','(atomize_term(B,C),atom_concat(C,D,E)))))),assertz(add_time(A,0,A)),assertz((:-(add_time(B,A,E),','(>(A,0),','(atom_concat(B,' in state ',C),','(atom_number(D,A),atom_concat(C,D,E))))))),assertz(switch_op(or,and)),assertz(switch_op(and,or)),assertz(convert_subterms(_,[],[])),assertz((:-(convert_subterms(A,'.'(B,D),'.'(C,E)),','(boolean_conversion(A,B,C),convert_subterms(A,D,E))))),assertz((:-(component(E,A,F),','(functor(A,D,B),','(call(A),','(arg(B,A,C),rename_state(C,D,E,F))))))),assertz((:-(rename_state(state(B,A),C,the,state(D,A)),','(!,append(B,'.'(of,'.'(the,'.'(C,[]))),D))))),assertz((:-(rename_state(state(B,A),C,D,state(E,A)),','(!,append(B,'.'(of,'.'(C,'.'(D,[]))),E))))),assertz((:-(rename_state(','(A,E),B,C,','(D,F)),','(!,','(rename_state(A,B,C,D),rename_state(E,B,C,F)))))),assertz((:-(rename_state(A,_,_,A),','(is_a_list(A),!)))),assertz((:-(rename_state(B,A,the,state('.'(the,'.'(A,[])),B)),!))),assertz(rename_state(C,A,B,state('.'(A,'.'(B,[])),C))),assertz(is_a_list([])),assertz(is_a_list('.'(_,_))),assertz(connected([])),assertz(connected('.'(_,[]))),assertz((:-(connected('.'(A,B)),','(terminal_type(A,_,_),connected('.'(A,B),0))))),assertz((:-(connected('.'(A,'.'(B,C))),','(=(A,B),connected('.'(B,C)))))),assertz((:-(connected('.'(A,[]),B),','(terminal_type(A,_,C),{}(=(+(B,C),0)))))),assertz((:-(connected('.'(A,'.'(B,G)),E),','(terminal_type(A,C,F),','(terminal_type(B,D,_),','({}(','(=(C,D),=(H,+(E,F)))),connected('.'(B,G),H))))))),assertz(terminal_type(electrical(A,B),A,B)),assertz(terminal_type(hydraulic(A,B),A,B)),assertz(terminal_type(mechanical(A,B),A,B)),compile_predicates([add_time/3,add_unique/3,atomize_args/2,atomize_term/2,boolean_conversion/3,combine/3,component/3,connected/1,connected/2,convert_subterms/3,convert_time_conj/3,convert_time_series/2,convert_time_series/3,diff/3,differences/3,eliminate_supersets/2,factor_intersections/2,factor_intersections0/5,fail_state/1,fault_limit/2,filter_conj/2,filter_for_time_and_fails/2,flatten_list/2,flatten_state/2,intersection/3,is_a_list/1,largest_common_subset/4,lcs/3,lcs0/4,member/2,min_fault_tree/3,min_fault_tree/4,mle/3,most_leaves_eliminated/2,part/4,part/5,prune/4,q/4,remove/3,rename_state/4,size/2,split/4,subset/3,switch_op/2,terminal_type/3]),";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FaultTree buildFaultTree() {
		if (component == null || portValues == null || (portValues != null && portValues.isEmpty())) {
			return null;
		}
		
		StringBuffer query = new StringBuffer();
		query.append("use_module(library(clpr)),");
		query.append(compile_fault_trees_pl);
					// NEED TO RELATIVIZE THIS REFERENCE ...
		//*************************************************************		
//		query.append("consult('/Users/Mac/workspace-prolog/FTA/CertWare/fault_trees.pl'),");
		//*************************************************************		
/*		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IPath root_path = myWorkspaceRoot.getLocation();
		IProject myFTP = myWorkspaceRoot.getProject("ftp");
		   // open if necessary
		if (myFTP.exists() && !myFTP.isOpen())
			try {
				myFTP.open(null);
			} catch (CoreException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		IPath ftp_path = myFTP.getLocation();
		IFile fault_trees = myFTP.getFile("fault_trees.pl");
		IPath ft_path1 = fault_trees.getLocation();
		IPath ft_path2 = fault_trees.getRawLocation();
		URI ft_uri1 = fault_trees.getLocationURI();
		URI ft_uri2 = fault_trees.getRawLocationURI(); */
		//*************************************************************		
		
		// assert all of the predicate definitions
		List<Predicate> preds = getComponent().translateToLogic();
		for (Predicate p : preds) {
			List<String> clauses = p.clauses;
			for (String c : clauses) {
				query.append("assertz(" + c + "),");
			}
		}
		
		//translate PortValues to min_fault_tree query
		query.append("min_fault_tree(");
		query.append(getComponent().getSafeFunctor() + "(");
		List<Port> ports = getComponent().retrievePorts();
		EList<PortValue> pvs = getPortValues();
		int number_of_args = 0;
		for (Port p : ports) {
			if (number_of_args > 0)
				query.append(",");
			boolean found = false;
			for (PortValue pv : pvs) {
				if (pv.getPort().equals(p)) {
					pv.getValue().toBuffer(query);
					found = true;
					break;
				}
			}
			if (!found) {
				query.append("_");
			}
			number_of_args++;
		}
		query.append(",State),State,fault_limit(");
		query.append(getFaultLimit());
		query.append("),Tree).");
		
		// execute query in a Prolog process
		Map<String, Object> result = null;
		PrologProcess prolog = null;
		try {
			// NEED TO PARAMATERIZE THE SWIPL EXECUTABLE ...
			//*************************************************************		
			prolog = Connector.newPrologProcess("/applications/swi-prolog.app/contents/macos/swipl");
//			prolog = Connector.newPrologProcess();
			//*************************************************************		
			String queryStr = query.toString(); // for debugging ...
			result = prolog.queryOnce(queryStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PrologProcessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				prolog.stop();
			} catch (PrologProcessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
		// build the root event
		RootEvent root = new RootEventImpl();
		StringBuffer sb = new StringBuffer();
		
		if (result == null) {
			sb.append("NO FAULT STATES ARE COMPATIBLE WITH ");
		}
		sb.append(getComponent().getType());
		sb.append(':');
		for (PortValue pv : pvs) {
			sb.append(' ');
			sb.append(pv.getPort().getType());
			sb.append(" = ");
			pv.getValue().toBuffer(sb);
			sb.append(',');
		}
		sb.deleteCharAt(sb.length()-1);
		
		FaultTree ft = new FaultTreeImpl();
		ft.getFtnodes().add(root);
		ft.setRoot(root);
		
		if (result != null) {		
			String term = new String(result.get("Tree").toString());
			if (term.equals("[]")) {
				sb.append(" THERE ARE NO SOLUTIONS WITH FEWER THAN " + Integer.toString(getFaultLimit()+1) + " FAULTS");
			}
			else {
				SubTree subtree = buildSubTree(term, 0, ft);
				root.getInputs().add(subtree.faultTree);
			}
		}
		root.setObservation(sb.toString());
		return ft; 
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FtpPackage.OBSERVATION__PORT_VALUES:
				return ((InternalEList<?>)getPortValues()).basicRemove(otherEnd, msgs);
			case FtpPackage.OBSERVATION__FAULTTREE:
				return basicSetFaulttree(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	private SubTree buildSubTree(String root, int start, FaultTree ft) {
		
		int next;
		FTNode ftnode;
		EList<FTNode> inputs;
		
		if (root.indexOf("or",start) == start) {
			OrGate or = new OrGateImpl();
			inputs = or.getInputs();
			ftnode = or;
			next = start+3;
		}
		else if (root.indexOf("and",start) == start) {
			AndGate and = new AndGateImpl();
			inputs = and.getInputs();
			ftnode = and;
			next = start+4;
		}
		else if (root.indexOf("fault",start) == start) {
			Fault fault = new FaultImpl();
			int begin = start+7; // start after opening "fault('"
			int end = root.indexOf('\'', begin); 
			fault.setDescription(root.substring(begin, end));
			ft.getFtnodes().add(fault);
			return new SubTree(fault,end+2); // after "')"
		}
		else
			return null;
		
		while (root.charAt(next) != ')') {
			if (root.charAt(next) == ',')
				next++;
			SubTree st = buildSubTree(root, next, ft);
			inputs.add(st.faultTree);
			next = st.next;
		}
		ft.getFtnodes().add(ftnode);
		return new SubTree(ftnode,next+1);

	}
	
	private class SubTree {
		
		FTNode faultTree;
		int next;
		
		SubTree(FTNode ft, int i) {
			faultTree = ft;
			next = i;
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FtpPackage.OBSERVATION__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case FtpPackage.OBSERVATION__PORT_VALUES:
				return getPortValues();
			case FtpPackage.OBSERVATION__NAME:
				return getName();
			case FtpPackage.OBSERVATION__FAULT_LIMIT:
				return getFaultLimit();
			case FtpPackage.OBSERVATION__FAULTTREE:
				return getFaulttree();
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
			case FtpPackage.OBSERVATION__COMPONENT:
				setComponent((Component)newValue);
				return;
			case FtpPackage.OBSERVATION__PORT_VALUES:
				getPortValues().clear();
				getPortValues().addAll((Collection<? extends PortValue>)newValue);
				return;
			case FtpPackage.OBSERVATION__NAME:
				setName((String)newValue);
				return;
			case FtpPackage.OBSERVATION__FAULT_LIMIT:
				setFaultLimit((Integer)newValue);
				return;
			case FtpPackage.OBSERVATION__FAULTTREE:
				setFaulttree((FaultTree)newValue);
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
			case FtpPackage.OBSERVATION__COMPONENT:
				setComponent((Component)null);
				return;
			case FtpPackage.OBSERVATION__PORT_VALUES:
				getPortValues().clear();
				return;
			case FtpPackage.OBSERVATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FtpPackage.OBSERVATION__FAULT_LIMIT:
				setFaultLimit(FAULT_LIMIT_EDEFAULT);
				return;
			case FtpPackage.OBSERVATION__FAULTTREE:
				setFaulttree((FaultTree)null);
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
			case FtpPackage.OBSERVATION__COMPONENT:
				return component != null;
			case FtpPackage.OBSERVATION__PORT_VALUES:
				return portValues != null && !portValues.isEmpty();
			case FtpPackage.OBSERVATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FtpPackage.OBSERVATION__FAULT_LIMIT:
				return faultLimit != FAULT_LIMIT_EDEFAULT;
			case FtpPackage.OBSERVATION__FAULTTREE:
				return faulttree != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FtpPackage.OBSERVATION___BUILD_FAULT_TREE:
				return buildFaultTree();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", faultLimit: ");
		result.append(faultLimit);
		result.append(')');
		return result.toString();
	}

} //ObservationImpl
