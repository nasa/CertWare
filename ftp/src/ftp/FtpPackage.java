/**
 */
package ftp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ftp.FtpFactory
 * @model kind="package"
 * @generated
 */
public interface FtpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ftp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ftp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ftp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FtpPackage eINSTANCE = ftp.impl.FtpPackageImpl.init();

	/**
	 * The meta object id for the '{@link ftp.impl.FaultTreeImpl <em>Fault Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.FaultTreeImpl
	 * @see ftp.impl.FtpPackageImpl#getFaultTree()
	 * @generated
	 */
	int FAULT_TREE = 0;

	/**
	 * The feature id for the '<em><b>Ftnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__FTNODES = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__ROOT = 1;

	/**
	 * The number of structural features of the '<em>Fault Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fault Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ftp.impl.FTNodeImpl <em>FT Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.FTNodeImpl
	 * @see ftp.impl.FtpPackageImpl#getFTNode()
	 * @generated
	 */
	int FT_NODE = 1;

	/**
	 * The number of structural features of the '<em>FT Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FT_NODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>FT Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FT_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ftp.impl.OrGateImpl <em>Or Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.OrGateImpl
	 * @see ftp.impl.FtpPackageImpl#getOrGate()
	 * @generated
	 */
	int OR_GATE = 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__INPUTS = FT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE_FEATURE_COUNT = FT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Or Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE_OPERATION_COUNT = FT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.AndGateImpl <em>And Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.AndGateImpl
	 * @see ftp.impl.FtpPackageImpl#getAndGate()
	 * @generated
	 */
	int AND_GATE = 3;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__INPUTS = FT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE_FEATURE_COUNT = FT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>And Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE_OPERATION_COUNT = FT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.FaultImpl <em>Fault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.FaultImpl
	 * @see ftp.impl.FtpPackageImpl#getFault()
	 * @generated
	 */
	int FAULT = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT__DESCRIPTION = FT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FEATURE_COUNT = FT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_OPERATION_COUNT = FT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.ObservationImpl <em>Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.ObservationImpl
	 * @see ftp.impl.FtpPackageImpl#getObservation()
	 * @generated
	 */
	int OBSERVATION = 5;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Port Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__PORT_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Fault Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__FAULT_LIMIT = 3;

	/**
	 * The feature id for the '<em><b>Faulttree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__FAULTTREE = 4;

	/**
	 * The number of structural features of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Build Fault Tree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION___BUILD_FAULT_TREE = 0;

	/**
	 * The number of operations of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ftp.impl.CompositionElementImpl <em>Composition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.CompositionElementImpl
	 * @see ftp.impl.FtpPackageImpl#getCompositionElement()
	 * @generated
	 */
	int COMPOSITION_ELEMENT = 17;

	/**
	 * The number of structural features of the '<em>Composition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Composition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ftp.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.ComponentImpl
	 * @see ftp.impl.FtpPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = COMPOSITION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE = COMPOSITION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = COMPOSITION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = COMPOSITION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.PortImpl
	 * @see ftp.impl.FtpPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>New Port Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___NEW_PORT_VALUE = 0;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ftp.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.ConnectionImpl
	 * @see ftp.impl.FtpPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 8;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FROM_PORT = COMPOSITION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TO_PORT = COMPOSITION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = COMPOSITION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = COMPOSITION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.DigintalConnectionImpl <em>Digintal Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.DigintalConnectionImpl
	 * @see ftp.impl.FtpPackageImpl#getDigintalConnection()
	 * @generated
	 */
	int DIGINTAL_CONNECTION = 9;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGINTAL_CONNECTION__FROM_PORT = CONNECTION__FROM_PORT;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGINTAL_CONNECTION__TO_PORT = CONNECTION__TO_PORT;

	/**
	 * The number of structural features of the '<em>Digintal Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGINTAL_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Digintal Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGINTAL_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.AnalogConnectionImpl <em>Analog Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.AnalogConnectionImpl
	 * @see ftp.impl.FtpPackageImpl#getAnalogConnection()
	 * @generated
	 */
	int ANALOG_CONNECTION = 10;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_CONNECTION__FROM_PORT = CONNECTION__FROM_PORT;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_CONNECTION__TO_PORT = CONNECTION__TO_PORT;

	/**
	 * The number of structural features of the '<em>Analog Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Analog Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.SignalConnectionImpl <em>Signal Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.SignalConnectionImpl
	 * @see ftp.impl.FtpPackageImpl#getSignalConnection()
	 * @generated
	 */
	int SIGNAL_CONNECTION = 11;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CONNECTION__FROM_PORT = DIGINTAL_CONNECTION__FROM_PORT;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CONNECTION__TO_PORT = DIGINTAL_CONNECTION__TO_PORT;

	/**
	 * The number of structural features of the '<em>Signal Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CONNECTION_FEATURE_COUNT = DIGINTAL_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Signal Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CONNECTION_OPERATION_COUNT = DIGINTAL_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.ElectricalConnectionImpl <em>Electrical Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.ElectricalConnectionImpl
	 * @see ftp.impl.FtpPackageImpl#getElectricalConnection()
	 * @generated
	 */
	int ELECTRICAL_CONNECTION = 12;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_CONNECTION__FROM_PORT = ANALOG_CONNECTION__FROM_PORT;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_CONNECTION__TO_PORT = ANALOG_CONNECTION__TO_PORT;

	/**
	 * The number of structural features of the '<em>Electrical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_CONNECTION_FEATURE_COUNT = ANALOG_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Electrical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_CONNECTION_OPERATION_COUNT = ANALOG_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.HydraulicConnectionImpl <em>Hydraulic Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.HydraulicConnectionImpl
	 * @see ftp.impl.FtpPackageImpl#getHydraulicConnection()
	 * @generated
	 */
	int HYDRAULIC_CONNECTION = 13;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_CONNECTION__FROM_PORT = ANALOG_CONNECTION__FROM_PORT;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_CONNECTION__TO_PORT = ANALOG_CONNECTION__TO_PORT;

	/**
	 * The number of structural features of the '<em>Hydraulic Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_CONNECTION_FEATURE_COUNT = ANALOG_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hydraulic Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_CONNECTION_OPERATION_COUNT = ANALOG_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.MechanicalConnectionImpl <em>Mechanical Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.MechanicalConnectionImpl
	 * @see ftp.impl.FtpPackageImpl#getMechanicalConnection()
	 * @generated
	 */
	int MECHANICAL_CONNECTION = 14;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_CONNECTION__FROM_PORT = ANALOG_CONNECTION__FROM_PORT;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_CONNECTION__TO_PORT = ANALOG_CONNECTION__TO_PORT;

	/**
	 * The number of structural features of the '<em>Mechanical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_CONNECTION_FEATURE_COUNT = ANALOG_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mechanical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_CONNECTION_OPERATION_COUNT = ANALOG_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.PrimitiveComponentImpl <em>Primitive Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.PrimitiveComponentImpl
	 * @see ftp.impl.FtpPackageImpl#getPrimitiveComponent()
	 * @generated
	 */
	int PRIMITIVE_COMPONENT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT__TYPE = COMPONENT__TYPE;

	/**
	 * The number of structural features of the '<em>Primitive Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.ComposedComponentImpl <em>Composed Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.ComposedComponentImpl
	 * @see ftp.impl.FtpPackageImpl#getComposedComponent()
	 * @generated
	 */
	int COMPOSED_COMPONENT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_COMPONENT__TYPE = COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_COMPONENT__COMPOSITION = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_COMPONENT__PORTS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composed Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composed Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.PortValueImpl <em>Port Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.PortValueImpl
	 * @see ftp.impl.FtpPackageImpl#getPortValue()
	 * @generated
	 */
	int PORT_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VALUE__PORT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Port Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ftp.impl.ResistorImpl <em>Resistor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.ResistorImpl
	 * @see ftp.impl.FtpPackageImpl#getResistor()
	 * @generated
	 */
	int RESISTOR = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__NAME = PRIMITIVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__TYPE = PRIMITIVE_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__RESISTANCE = PRIMITIVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__IN_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR__OUT_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resistor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_FEATURE_COUNT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Resistor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_OPERATION_COUNT = PRIMITIVE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.CapacitorImpl <em>Capacitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.CapacitorImpl
	 * @see ftp.impl.FtpPackageImpl#getCapacitor()
	 * @generated
	 */
	int CAPACITOR = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITOR__NAME = PRIMITIVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITOR__TYPE = PRIMITIVE_COMPONENT__TYPE;

	/**
	 * The number of structural features of the '<em>Capacitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITOR_FEATURE_COUNT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Capacitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITOR_OPERATION_COUNT = PRIMITIVE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.AnalogBatteryImpl <em>Analog Battery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.AnalogBatteryImpl
	 * @see ftp.impl.FtpPackageImpl#getAnalogBattery()
	 * @generated
	 */
	int ANALOG_BATTERY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_BATTERY__NAME = PRIMITIVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_BATTERY__TYPE = PRIMITIVE_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_BATTERY__IN_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_BATTERY__OUT_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_BATTERY__VOLTAGE = PRIMITIVE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Analog Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_BATTERY_FEATURE_COUNT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Analog Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_BATTERY_OPERATION_COUNT = PRIMITIVE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.AnalogSwitchImpl <em>Analog Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.AnalogSwitchImpl
	 * @see ftp.impl.FtpPackageImpl#getAnalogSwitch()
	 * @generated
	 */
	int ANALOG_SWITCH = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SWITCH__NAME = PRIMITIVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SWITCH__TYPE = PRIMITIVE_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SWITCH__IN_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Set Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SWITCH__SET_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SWITCH__OUT_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Analog Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SWITCH_FEATURE_COUNT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Analog Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_SWITCH_OPERATION_COUNT = PRIMITIVE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.AnalogLampImpl <em>Analog Lamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.AnalogLampImpl
	 * @see ftp.impl.FtpPackageImpl#getAnalogLamp()
	 * @generated
	 */
	int ANALOG_LAMP = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LAMP__NAME = PRIMITIVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LAMP__TYPE = PRIMITIVE_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LAMP__IN_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LAMP__OUT_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Light Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LAMP__LIGHT_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Analog Lamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LAMP_FEATURE_COUNT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Analog Lamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_LAMP_OPERATION_COUNT = PRIMITIVE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.DigitalBatteryImpl <em>Digital Battery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.DigitalBatteryImpl
	 * @see ftp.impl.FtpPackageImpl#getDigitalBattery()
	 * @generated
	 */
	int DIGITAL_BATTERY = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_BATTERY__NAME = PRIMITIVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_BATTERY__TYPE = PRIMITIVE_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_BATTERY__IN_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_BATTERY__OUT_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Digital Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_BATTERY_FEATURE_COUNT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Digital Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_BATTERY_OPERATION_COUNT = PRIMITIVE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.DigitalSwitchImpl <em>Digital Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.DigitalSwitchImpl
	 * @see ftp.impl.FtpPackageImpl#getDigitalSwitch()
	 * @generated
	 */
	int DIGITAL_SWITCH = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SWITCH__NAME = PRIMITIVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SWITCH__TYPE = PRIMITIVE_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SWITCH__IN_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Set Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SWITCH__SET_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SWITCH__OUT_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Digital Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SWITCH_FEATURE_COUNT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Digital Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SWITCH_OPERATION_COUNT = PRIMITIVE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.DigitalLampImpl <em>Digital Lamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.DigitalLampImpl
	 * @see ftp.impl.FtpPackageImpl#getDigitalLamp()
	 * @generated
	 */
	int DIGITAL_LAMP = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_LAMP__NAME = PRIMITIVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_LAMP__TYPE = PRIMITIVE_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_LAMP__IN_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_LAMP__OUT_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Light Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_LAMP__LIGHT_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Digital Lamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_LAMP_FEATURE_COUNT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Digital Lamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_LAMP_OPERATION_COUNT = PRIMITIVE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.NotImpl
	 * @see ftp.impl.FtpPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__NAME = PRIMITIVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__TYPE = PRIMITIVE_COMPONENT__TYPE;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = PRIMITIVE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.XorImpl <em>Xor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.XorImpl
	 * @see ftp.impl.FtpPackageImpl#getXor()
	 * @generated
	 */
	int XOR = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__NAME = PRIMITIVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__TYPE = PRIMITIVE_COMPONENT__TYPE;

	/**
	 * The number of structural features of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATION_COUNT = PRIMITIVE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.AndImpl
	 * @see ftp.impl.FtpPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__NAME = PRIMITIVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__TYPE = PRIMITIVE_COMPONENT__TYPE;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = PRIMITIVE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.NTransistorImpl <em>NTransistor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.NTransistorImpl
	 * @see ftp.impl.FtpPackageImpl#getNTransistor()
	 * @generated
	 */
	int NTRANSISTOR = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTRANSISTOR__NAME = PRIMITIVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTRANSISTOR__TYPE = PRIMITIVE_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Gate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTRANSISTOR__GATE = PRIMITIVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTRANSISTOR__SOURCE = PRIMITIVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Drain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTRANSISTOR__DRAIN = PRIMITIVE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>NTransistor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTRANSISTOR_FEATURE_COUNT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>NTransistor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTRANSISTOR_OPERATION_COUNT = PRIMITIVE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.PTransistorImpl <em>PTransistor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.PTransistorImpl
	 * @see ftp.impl.FtpPackageImpl#getPTransistor()
	 * @generated
	 */
	int PTRANSISTOR = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRANSISTOR__NAME = PRIMITIVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRANSISTOR__TYPE = PRIMITIVE_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Gate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRANSISTOR__GATE = PRIMITIVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRANSISTOR__SOURCE = PRIMITIVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Drain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRANSISTOR__DRAIN = PRIMITIVE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PTransistor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRANSISTOR_FEATURE_COUNT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>PTransistor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTRANSISTOR_OPERATION_COUNT = PRIMITIVE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.DFlipFlopImpl <em>DFlip Flop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.DFlipFlopImpl
	 * @see ftp.impl.FtpPackageImpl#getDFlipFlop()
	 * @generated
	 */
	int DFLIP_FLOP = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFLIP_FLOP__NAME = PRIMITIVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFLIP_FLOP__TYPE = PRIMITIVE_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFLIP_FLOP__IN_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clock Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFLIP_FLOP__CLOCK_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFLIP_FLOP__OUT_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFLIP_FLOP__STATE_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DFlip Flop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFLIP_FLOP_FEATURE_COUNT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>DFlip Flop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFLIP_FLOP_OPERATION_COUNT = PRIMITIVE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.SignalPortImpl <em>Signal Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.SignalPortImpl
	 * @see ftp.impl.FtpPackageImpl#getSignalPort()
	 * @generated
	 */
	int SIGNAL_PORT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_PORT__TYPE = PORT__TYPE;

	/**
	 * The number of structural features of the '<em>Signal Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>New Port Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_PORT___NEW_PORT_VALUE = PORT___NEW_PORT_VALUE;

	/**
	 * The number of operations of the '<em>Signal Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.ElectricalPortImpl <em>Electrical Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.ElectricalPortImpl
	 * @see ftp.impl.FtpPackageImpl#getElectricalPort()
	 * @generated
	 */
	int ELECTRICAL_PORT = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_PORT__TYPE = PORT__TYPE;

	/**
	 * The number of structural features of the '<em>Electrical Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>New Port Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_PORT___NEW_PORT_VALUE = PORT___NEW_PORT_VALUE;

	/**
	 * The number of operations of the '<em>Electrical Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.HydraulicPortImpl <em>Hydraulic Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.HydraulicPortImpl
	 * @see ftp.impl.FtpPackageImpl#getHydraulicPort()
	 * @generated
	 */
	int HYDRAULIC_PORT = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_PORT__TYPE = PORT__TYPE;

	/**
	 * The number of structural features of the '<em>Hydraulic Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>New Port Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_PORT___NEW_PORT_VALUE = PORT___NEW_PORT_VALUE;

	/**
	 * The number of operations of the '<em>Hydraulic Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.VisualPortImpl <em>Visual Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.VisualPortImpl
	 * @see ftp.impl.FtpPackageImpl#getVisualPort()
	 * @generated
	 */
	int VISUAL_PORT = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_PORT__TYPE = PORT__TYPE;

	/**
	 * The number of structural features of the '<em>Visual Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>New Port Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_PORT___NEW_PORT_VALUE = PORT___NEW_PORT_VALUE;

	/**
	 * The number of operations of the '<em>Visual Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.VisualConnectionImpl <em>Visual Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.VisualConnectionImpl
	 * @see ftp.impl.FtpPackageImpl#getVisualConnection()
	 * @generated
	 */
	int VISUAL_CONNECTION = 37;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_CONNECTION__FROM_PORT = CONNECTION__FROM_PORT;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_CONNECTION__TO_PORT = CONNECTION__TO_PORT;

	/**
	 * The number of structural features of the '<em>Visual Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Visual Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.MechanicalPortImpl <em>Mechanical Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.MechanicalPortImpl
	 * @see ftp.impl.FtpPackageImpl#getMechanicalPort()
	 * @generated
	 */
	int MECHANICAL_PORT = 40;

	/**
	 * The meta object id for the '{@link ftp.impl.FaultTreeContextImpl <em>Fault Tree Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.FaultTreeContextImpl
	 * @see ftp.impl.FtpPackageImpl#getFaultTreeContext()
	 * @generated
	 */
	int FAULT_TREE_CONTEXT = 38;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE_CONTEXT__COMPOSITION = 0;

	/**
	 * The feature id for the '<em><b>Observations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE_CONTEXT__OBSERVATIONS = 1;

	/**
	 * The number of structural features of the '<em>Fault Tree Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE_CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fault Tree Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ftp.impl.RootEventImpl <em>Root Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.RootEventImpl
	 * @see ftp.impl.FtpPackageImpl#getRootEvent()
	 * @generated
	 */
	int ROOT_EVENT = 39;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_EVENT__OBSERVATION = FT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_EVENT__INPUTS = FT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Root Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_EVENT_FEATURE_COUNT = FT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Root Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_EVENT_OPERATION_COUNT = FT_NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PORT__TYPE = PORT__TYPE;

	/**
	 * The number of structural features of the '<em>Mechanical Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>New Port Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PORT___NEW_PORT_VALUE = PORT___NEW_PORT_VALUE;

	/**
	 * The number of operations of the '<em>Mechanical Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.HydraulicValueImpl <em>Hydraulic Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.HydraulicValueImpl
	 * @see ftp.impl.FtpPackageImpl#getHydraulicValue()
	 * @generated
	 */
	int HYDRAULIC_VALUE = 44;

	/**
	 * The meta object id for the '{@link ftp.impl.TypedPortValueImpl <em>Typed Port Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.TypedPortValueImpl
	 * @see ftp.impl.FtpPackageImpl#getTypedPortValue()
	 * @generated
	 */
	int TYPED_PORT_VALUE = 41;

	/**
	 * The number of structural features of the '<em>Typed Port Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PORT_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Typed Port Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_PORT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ftp.impl.SignalValueImpl <em>Signal Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.SignalValueImpl
	 * @see ftp.impl.FtpPackageImpl#getSignalValue()
	 * @generated
	 */
	int SIGNAL_VALUE = 42;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_VALUE__SIGNAL = TYPED_PORT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_VALUE_FEATURE_COUNT = TYPED_PORT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Signal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_VALUE_OPERATION_COUNT = TYPED_PORT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.ElectricalValueImpl <em>Electrical Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.ElectricalValueImpl
	 * @see ftp.impl.FtpPackageImpl#getElectricalValue()
	 * @generated
	 */
	int ELECTRICAL_VALUE = 43;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_VALUE__CURRENT = TYPED_PORT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_VALUE__VOLTAGE = TYPED_PORT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Any Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_VALUE__ANY_CURRENT = TYPED_PORT_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Any Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_VALUE__ANY_VOLTAGE = TYPED_PORT_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Electrical Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_VALUE_FEATURE_COUNT = TYPED_PORT_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Electrical Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_VALUE_OPERATION_COUNT = TYPED_PORT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_VALUE__FLOW = TYPED_PORT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_VALUE__PRESSURE = TYPED_PORT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Any Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_VALUE__ANY_FLOW = TYPED_PORT_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Any Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_VALUE__ANY_PRESSURE = TYPED_PORT_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Hydraulic Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_VALUE_FEATURE_COUNT = TYPED_PORT_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Hydraulic Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYDRAULIC_VALUE_OPERATION_COUNT = TYPED_PORT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.VisualValueImpl <em>Visual Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.VisualValueImpl
	 * @see ftp.impl.FtpPackageImpl#getVisualValue()
	 * @generated
	 */
	int VISUAL_VALUE = 45;

	/**
	 * The feature id for the '<em><b>Bulb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_VALUE__BULB = TYPED_PORT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visual Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_VALUE_FEATURE_COUNT = TYPED_PORT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Visual Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_VALUE_OPERATION_COUNT = TYPED_PORT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.FloatValueImpl <em>Float Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.FloatValueImpl
	 * @see ftp.impl.FtpPackageImpl#getFloatValue()
	 * @generated
	 */
	int FLOAT_VALUE = 46;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_VALUE__VALUE = TYPED_PORT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_VALUE_FEATURE_COUNT = TYPED_PORT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Float Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_VALUE_OPERATION_COUNT = TYPED_PORT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.impl.SignalConstantImpl <em>Signal Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.impl.SignalConstantImpl
	 * @see ftp.impl.FtpPackageImpl#getSignalConstant()
	 * @generated
	 */
	int SIGNAL_CONSTANT = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CONSTANT__NAME = PRIMITIVE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CONSTANT__TYPE = PRIMITIVE_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CONSTANT__OUT_PORT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CONSTANT__VALUE = PRIMITIVE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signal Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CONSTANT_FEATURE_COUNT = PRIMITIVE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Signal Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_CONSTANT_OPERATION_COUNT = PRIMITIVE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftp.SignalValues <em>Signal Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.SignalValues
	 * @see ftp.impl.FtpPackageImpl#getSignalValues()
	 * @generated
	 */
	int SIGNAL_VALUES = 48;

	/**
	 * The meta object id for the '{@link ftp.VisualValues <em>Visual Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftp.VisualValues
	 * @see ftp.impl.FtpPackageImpl#getVisualValues()
	 * @generated
	 */
	int VISUAL_VALUES = 49;

	/**
	 * Returns the meta object for class '{@link ftp.FaultTree <em>Fault Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Tree</em>'.
	 * @see ftp.FaultTree
	 * @generated
	 */
	EClass getFaultTree();

	/**
	 * Returns the meta object for the containment reference list '{@link ftp.FaultTree#getFtnodes <em>Ftnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ftnodes</em>'.
	 * @see ftp.FaultTree#getFtnodes()
	 * @see #getFaultTree()
	 * @generated
	 */
	EReference getFaultTree_Ftnodes();

	/**
	 * Returns the meta object for the reference '{@link ftp.FaultTree#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see ftp.FaultTree#getRoot()
	 * @see #getFaultTree()
	 * @generated
	 */
	EReference getFaultTree_Root();

	/**
	 * Returns the meta object for class '{@link ftp.FTNode <em>FT Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FT Node</em>'.
	 * @see ftp.FTNode
	 * @generated
	 */
	EClass getFTNode();

	/**
	 * Returns the meta object for class '{@link ftp.OrGate <em>Or Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Gate</em>'.
	 * @see ftp.OrGate
	 * @generated
	 */
	EClass getOrGate();

	/**
	 * Returns the meta object for the reference list '{@link ftp.OrGate#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see ftp.OrGate#getInputs()
	 * @see #getOrGate()
	 * @generated
	 */
	EReference getOrGate_Inputs();

	/**
	 * Returns the meta object for class '{@link ftp.AndGate <em>And Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Gate</em>'.
	 * @see ftp.AndGate
	 * @generated
	 */
	EClass getAndGate();

	/**
	 * Returns the meta object for the reference list '{@link ftp.AndGate#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see ftp.AndGate#getInputs()
	 * @see #getAndGate()
	 * @generated
	 */
	EReference getAndGate_Inputs();

	/**
	 * Returns the meta object for class '{@link ftp.Fault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault</em>'.
	 * @see ftp.Fault
	 * @generated
	 */
	EClass getFault();

	/**
	 * Returns the meta object for the attribute '{@link ftp.Fault#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ftp.Fault#getDescription()
	 * @see #getFault()
	 * @generated
	 */
	EAttribute getFault_Description();

	/**
	 * Returns the meta object for class '{@link ftp.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation</em>'.
	 * @see ftp.Observation
	 * @generated
	 */
	EClass getObservation();

	/**
	 * Returns the meta object for the reference '{@link ftp.Observation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see ftp.Observation#getComponent()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link ftp.Observation#getPortValues <em>Port Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Values</em>'.
	 * @see ftp.Observation#getPortValues()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_PortValues();

	/**
	 * Returns the meta object for the attribute '{@link ftp.Observation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ftp.Observation#getName()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_Name();

	/**
	 * Returns the meta object for the attribute '{@link ftp.Observation#getFaultLimit <em>Fault Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Limit</em>'.
	 * @see ftp.Observation#getFaultLimit()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_FaultLimit();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.Observation#getFaulttree <em>Faulttree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Faulttree</em>'.
	 * @see ftp.Observation#getFaulttree()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Faulttree();

	/**
	 * Returns the meta object for the '{@link ftp.Observation#buildFaultTree() <em>Build Fault Tree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Fault Tree</em>' operation.
	 * @see ftp.Observation#buildFaultTree()
	 * @generated
	 */
	EOperation getObservation__BuildFaultTree();

	/**
	 * Returns the meta object for class '{@link ftp.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see ftp.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link ftp.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ftp.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link ftp.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ftp.Component#getType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Type();

	/**
	 * Returns the meta object for class '{@link ftp.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see ftp.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link ftp.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ftp.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link ftp.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ftp.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for the '{@link ftp.Port#newPortValue() <em>New Port Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Port Value</em>' operation.
	 * @see ftp.Port#newPortValue()
	 * @generated
	 */
	EOperation getPort__NewPortValue();

	/**
	 * Returns the meta object for class '{@link ftp.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see ftp.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link ftp.Connection#getFromPort <em>From Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Port</em>'.
	 * @see ftp.Connection#getFromPort()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_FromPort();

	/**
	 * Returns the meta object for the reference '{@link ftp.Connection#getToPort <em>To Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Port</em>'.
	 * @see ftp.Connection#getToPort()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ToPort();

	/**
	 * Returns the meta object for class '{@link ftp.DigintalConnection <em>Digintal Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digintal Connection</em>'.
	 * @see ftp.DigintalConnection
	 * @generated
	 */
	EClass getDigintalConnection();

	/**
	 * Returns the meta object for class '{@link ftp.AnalogConnection <em>Analog Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Connection</em>'.
	 * @see ftp.AnalogConnection
	 * @generated
	 */
	EClass getAnalogConnection();

	/**
	 * Returns the meta object for class '{@link ftp.SignalConnection <em>Signal Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Connection</em>'.
	 * @see ftp.SignalConnection
	 * @generated
	 */
	EClass getSignalConnection();

	/**
	 * Returns the meta object for class '{@link ftp.ElectricalConnection <em>Electrical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electrical Connection</em>'.
	 * @see ftp.ElectricalConnection
	 * @generated
	 */
	EClass getElectricalConnection();

	/**
	 * Returns the meta object for class '{@link ftp.HydraulicConnection <em>Hydraulic Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hydraulic Connection</em>'.
	 * @see ftp.HydraulicConnection
	 * @generated
	 */
	EClass getHydraulicConnection();

	/**
	 * Returns the meta object for class '{@link ftp.MechanicalConnection <em>Mechanical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mechanical Connection</em>'.
	 * @see ftp.MechanicalConnection
	 * @generated
	 */
	EClass getMechanicalConnection();

	/**
	 * Returns the meta object for class '{@link ftp.PrimitiveComponent <em>Primitive Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Component</em>'.
	 * @see ftp.PrimitiveComponent
	 * @generated
	 */
	EClass getPrimitiveComponent();

	/**
	 * Returns the meta object for class '{@link ftp.ComposedComponent <em>Composed Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Component</em>'.
	 * @see ftp.ComposedComponent
	 * @generated
	 */
	EClass getComposedComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link ftp.ComposedComponent#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composition</em>'.
	 * @see ftp.ComposedComponent#getComposition()
	 * @see #getComposedComponent()
	 * @generated
	 */
	EReference getComposedComponent_Composition();

	/**
	 * Returns the meta object for the containment reference list '{@link ftp.ComposedComponent#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see ftp.ComposedComponent#getPorts()
	 * @see #getComposedComponent()
	 * @generated
	 */
	EReference getComposedComponent_Ports();

	/**
	 * Returns the meta object for class '{@link ftp.CompositionElement <em>Composition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Element</em>'.
	 * @see ftp.CompositionElement
	 * @generated
	 */
	EClass getCompositionElement();

	/**
	 * Returns the meta object for class '{@link ftp.PortValue <em>Port Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Value</em>'.
	 * @see ftp.PortValue
	 * @generated
	 */
	EClass getPortValue();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.PortValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see ftp.PortValue#getValue()
	 * @see #getPortValue()
	 * @generated
	 */
	EReference getPortValue_Value();

	/**
	 * Returns the meta object for the reference '{@link ftp.PortValue#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see ftp.PortValue#getPort()
	 * @see #getPortValue()
	 * @generated
	 */
	EReference getPortValue_Port();

	/**
	 * Returns the meta object for class '{@link ftp.Resistor <em>Resistor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resistor</em>'.
	 * @see ftp.Resistor
	 * @generated
	 */
	EClass getResistor();

	/**
	 * Returns the meta object for the attribute '{@link ftp.Resistor#getResistance <em>Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resistance</em>'.
	 * @see ftp.Resistor#getResistance()
	 * @see #getResistor()
	 * @generated
	 */
	EAttribute getResistor_Resistance();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.Resistor#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Port</em>'.
	 * @see ftp.Resistor#getInPort()
	 * @see #getResistor()
	 * @generated
	 */
	EReference getResistor_InPort();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.Resistor#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Port</em>'.
	 * @see ftp.Resistor#getOutPort()
	 * @see #getResistor()
	 * @generated
	 */
	EReference getResistor_OutPort();

	/**
	 * Returns the meta object for class '{@link ftp.Capacitor <em>Capacitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capacitor</em>'.
	 * @see ftp.Capacitor
	 * @generated
	 */
	EClass getCapacitor();

	/**
	 * Returns the meta object for class '{@link ftp.AnalogBattery <em>Analog Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Battery</em>'.
	 * @see ftp.AnalogBattery
	 * @generated
	 */
	EClass getAnalogBattery();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.AnalogBattery#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Port</em>'.
	 * @see ftp.AnalogBattery#getInPort()
	 * @see #getAnalogBattery()
	 * @generated
	 */
	EReference getAnalogBattery_InPort();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.AnalogBattery#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Port</em>'.
	 * @see ftp.AnalogBattery#getOutPort()
	 * @see #getAnalogBattery()
	 * @generated
	 */
	EReference getAnalogBattery_OutPort();

	/**
	 * Returns the meta object for the attribute '{@link ftp.AnalogBattery#getVoltage <em>Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage</em>'.
	 * @see ftp.AnalogBattery#getVoltage()
	 * @see #getAnalogBattery()
	 * @generated
	 */
	EAttribute getAnalogBattery_Voltage();

	/**
	 * Returns the meta object for class '{@link ftp.AnalogSwitch <em>Analog Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Switch</em>'.
	 * @see ftp.AnalogSwitch
	 * @generated
	 */
	EClass getAnalogSwitch();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.AnalogSwitch#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Port</em>'.
	 * @see ftp.AnalogSwitch#getInPort()
	 * @see #getAnalogSwitch()
	 * @generated
	 */
	EReference getAnalogSwitch_InPort();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.AnalogSwitch#getSetPort <em>Set Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Port</em>'.
	 * @see ftp.AnalogSwitch#getSetPort()
	 * @see #getAnalogSwitch()
	 * @generated
	 */
	EReference getAnalogSwitch_SetPort();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.AnalogSwitch#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Port</em>'.
	 * @see ftp.AnalogSwitch#getOutPort()
	 * @see #getAnalogSwitch()
	 * @generated
	 */
	EReference getAnalogSwitch_OutPort();

	/**
	 * Returns the meta object for class '{@link ftp.AnalogLamp <em>Analog Lamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Lamp</em>'.
	 * @see ftp.AnalogLamp
	 * @generated
	 */
	EClass getAnalogLamp();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.AnalogLamp#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Port</em>'.
	 * @see ftp.AnalogLamp#getInPort()
	 * @see #getAnalogLamp()
	 * @generated
	 */
	EReference getAnalogLamp_InPort();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.AnalogLamp#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Port</em>'.
	 * @see ftp.AnalogLamp#getOutPort()
	 * @see #getAnalogLamp()
	 * @generated
	 */
	EReference getAnalogLamp_OutPort();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.AnalogLamp#getLightPort <em>Light Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Light Port</em>'.
	 * @see ftp.AnalogLamp#getLightPort()
	 * @see #getAnalogLamp()
	 * @generated
	 */
	EReference getAnalogLamp_LightPort();

	/**
	 * Returns the meta object for class '{@link ftp.DigitalBattery <em>Digital Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Battery</em>'.
	 * @see ftp.DigitalBattery
	 * @generated
	 */
	EClass getDigitalBattery();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.DigitalBattery#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Port</em>'.
	 * @see ftp.DigitalBattery#getInPort()
	 * @see #getDigitalBattery()
	 * @generated
	 */
	EReference getDigitalBattery_InPort();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.DigitalBattery#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Port</em>'.
	 * @see ftp.DigitalBattery#getOutPort()
	 * @see #getDigitalBattery()
	 * @generated
	 */
	EReference getDigitalBattery_OutPort();

	/**
	 * Returns the meta object for class '{@link ftp.DigitalSwitch <em>Digital Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Switch</em>'.
	 * @see ftp.DigitalSwitch
	 * @generated
	 */
	EClass getDigitalSwitch();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.DigitalSwitch#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Port</em>'.
	 * @see ftp.DigitalSwitch#getInPort()
	 * @see #getDigitalSwitch()
	 * @generated
	 */
	EReference getDigitalSwitch_InPort();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.DigitalSwitch#getSetPort <em>Set Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Port</em>'.
	 * @see ftp.DigitalSwitch#getSetPort()
	 * @see #getDigitalSwitch()
	 * @generated
	 */
	EReference getDigitalSwitch_SetPort();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.DigitalSwitch#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Port</em>'.
	 * @see ftp.DigitalSwitch#getOutPort()
	 * @see #getDigitalSwitch()
	 * @generated
	 */
	EReference getDigitalSwitch_OutPort();

	/**
	 * Returns the meta object for class '{@link ftp.DigitalLamp <em>Digital Lamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Lamp</em>'.
	 * @see ftp.DigitalLamp
	 * @generated
	 */
	EClass getDigitalLamp();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.DigitalLamp#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Port</em>'.
	 * @see ftp.DigitalLamp#getInPort()
	 * @see #getDigitalLamp()
	 * @generated
	 */
	EReference getDigitalLamp_InPort();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.DigitalLamp#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Port</em>'.
	 * @see ftp.DigitalLamp#getOutPort()
	 * @see #getDigitalLamp()
	 * @generated
	 */
	EReference getDigitalLamp_OutPort();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.DigitalLamp#getLightPort <em>Light Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Light Port</em>'.
	 * @see ftp.DigitalLamp#getLightPort()
	 * @see #getDigitalLamp()
	 * @generated
	 */
	EReference getDigitalLamp_LightPort();

	/**
	 * Returns the meta object for class '{@link ftp.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see ftp.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link ftp.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor</em>'.
	 * @see ftp.Xor
	 * @generated
	 */
	EClass getXor();

	/**
	 * Returns the meta object for class '{@link ftp.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see ftp.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link ftp.NTransistor <em>NTransistor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NTransistor</em>'.
	 * @see ftp.NTransistor
	 * @generated
	 */
	EClass getNTransistor();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.NTransistor#getGate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gate</em>'.
	 * @see ftp.NTransistor#getGate()
	 * @see #getNTransistor()
	 * @generated
	 */
	EReference getNTransistor_Gate();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.NTransistor#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see ftp.NTransistor#getSource()
	 * @see #getNTransistor()
	 * @generated
	 */
	EReference getNTransistor_Source();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.NTransistor#getDrain <em>Drain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drain</em>'.
	 * @see ftp.NTransistor#getDrain()
	 * @see #getNTransistor()
	 * @generated
	 */
	EReference getNTransistor_Drain();

	/**
	 * Returns the meta object for class '{@link ftp.PTransistor <em>PTransistor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PTransistor</em>'.
	 * @see ftp.PTransistor
	 * @generated
	 */
	EClass getPTransistor();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.PTransistor#getGate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gate</em>'.
	 * @see ftp.PTransistor#getGate()
	 * @see #getPTransistor()
	 * @generated
	 */
	EReference getPTransistor_Gate();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.PTransistor#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see ftp.PTransistor#getSource()
	 * @see #getPTransistor()
	 * @generated
	 */
	EReference getPTransistor_Source();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.PTransistor#getDrain <em>Drain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drain</em>'.
	 * @see ftp.PTransistor#getDrain()
	 * @see #getPTransistor()
	 * @generated
	 */
	EReference getPTransistor_Drain();

	/**
	 * Returns the meta object for class '{@link ftp.DFlipFlop <em>DFlip Flop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFlip Flop</em>'.
	 * @see ftp.DFlipFlop
	 * @generated
	 */
	EClass getDFlipFlop();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.DFlipFlop#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Port</em>'.
	 * @see ftp.DFlipFlop#getInPort()
	 * @see #getDFlipFlop()
	 * @generated
	 */
	EReference getDFlipFlop_InPort();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.DFlipFlop#getClockPort <em>Clock Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clock Port</em>'.
	 * @see ftp.DFlipFlop#getClockPort()
	 * @see #getDFlipFlop()
	 * @generated
	 */
	EReference getDFlipFlop_ClockPort();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.DFlipFlop#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Port</em>'.
	 * @see ftp.DFlipFlop#getOutPort()
	 * @see #getDFlipFlop()
	 * @generated
	 */
	EReference getDFlipFlop_OutPort();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.DFlipFlop#getStatePort <em>State Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Port</em>'.
	 * @see ftp.DFlipFlop#getStatePort()
	 * @see #getDFlipFlop()
	 * @generated
	 */
	EReference getDFlipFlop_StatePort();

	/**
	 * Returns the meta object for class '{@link ftp.SignalPort <em>Signal Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Port</em>'.
	 * @see ftp.SignalPort
	 * @generated
	 */
	EClass getSignalPort();

	/**
	 * Returns the meta object for class '{@link ftp.ElectricalPort <em>Electrical Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electrical Port</em>'.
	 * @see ftp.ElectricalPort
	 * @generated
	 */
	EClass getElectricalPort();

	/**
	 * Returns the meta object for class '{@link ftp.HydraulicPort <em>Hydraulic Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hydraulic Port</em>'.
	 * @see ftp.HydraulicPort
	 * @generated
	 */
	EClass getHydraulicPort();

	/**
	 * Returns the meta object for class '{@link ftp.VisualPort <em>Visual Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Port</em>'.
	 * @see ftp.VisualPort
	 * @generated
	 */
	EClass getVisualPort();

	/**
	 * Returns the meta object for class '{@link ftp.VisualConnection <em>Visual Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Connection</em>'.
	 * @see ftp.VisualConnection
	 * @generated
	 */
	EClass getVisualConnection();

	/**
	 * Returns the meta object for class '{@link ftp.MechanicalPort <em>Mechanical Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mechanical Port</em>'.
	 * @see ftp.MechanicalPort
	 * @generated
	 */
	EClass getMechanicalPort();

	/**
	 * Returns the meta object for class '{@link ftp.TypedPortValue <em>Typed Port Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Port Value</em>'.
	 * @see ftp.TypedPortValue
	 * @generated
	 */
	EClass getTypedPortValue();

	/**
	 * Returns the meta object for class '{@link ftp.SignalValue <em>Signal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Value</em>'.
	 * @see ftp.SignalValue
	 * @generated
	 */
	EClass getSignalValue();

	/**
	 * Returns the meta object for the attribute '{@link ftp.SignalValue#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal</em>'.
	 * @see ftp.SignalValue#getSignal()
	 * @see #getSignalValue()
	 * @generated
	 */
	EAttribute getSignalValue_Signal();

	/**
	 * Returns the meta object for class '{@link ftp.ElectricalValue <em>Electrical Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electrical Value</em>'.
	 * @see ftp.ElectricalValue
	 * @generated
	 */
	EClass getElectricalValue();

	/**
	 * Returns the meta object for the attribute '{@link ftp.ElectricalValue#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see ftp.ElectricalValue#getCurrent()
	 * @see #getElectricalValue()
	 * @generated
	 */
	EAttribute getElectricalValue_Current();

	/**
	 * Returns the meta object for the attribute '{@link ftp.ElectricalValue#getVoltage <em>Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage</em>'.
	 * @see ftp.ElectricalValue#getVoltage()
	 * @see #getElectricalValue()
	 * @generated
	 */
	EAttribute getElectricalValue_Voltage();

	/**
	 * Returns the meta object for the attribute '{@link ftp.ElectricalValue#isAnyCurrent <em>Any Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Any Current</em>'.
	 * @see ftp.ElectricalValue#isAnyCurrent()
	 * @see #getElectricalValue()
	 * @generated
	 */
	EAttribute getElectricalValue_AnyCurrent();

	/**
	 * Returns the meta object for the attribute '{@link ftp.ElectricalValue#isAnyVoltage <em>Any Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Any Voltage</em>'.
	 * @see ftp.ElectricalValue#isAnyVoltage()
	 * @see #getElectricalValue()
	 * @generated
	 */
	EAttribute getElectricalValue_AnyVoltage();

	/**
	 * Returns the meta object for class '{@link ftp.HydraulicValue <em>Hydraulic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hydraulic Value</em>'.
	 * @see ftp.HydraulicValue
	 * @generated
	 */
	EClass getHydraulicValue();

	/**
	 * Returns the meta object for the attribute '{@link ftp.HydraulicValue#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow</em>'.
	 * @see ftp.HydraulicValue#getFlow()
	 * @see #getHydraulicValue()
	 * @generated
	 */
	EAttribute getHydraulicValue_Flow();

	/**
	 * Returns the meta object for the attribute '{@link ftp.HydraulicValue#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure</em>'.
	 * @see ftp.HydraulicValue#getPressure()
	 * @see #getHydraulicValue()
	 * @generated
	 */
	EAttribute getHydraulicValue_Pressure();

	/**
	 * Returns the meta object for the attribute '{@link ftp.HydraulicValue#isAnyFlow <em>Any Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Any Flow</em>'.
	 * @see ftp.HydraulicValue#isAnyFlow()
	 * @see #getHydraulicValue()
	 * @generated
	 */
	EAttribute getHydraulicValue_AnyFlow();

	/**
	 * Returns the meta object for the attribute '{@link ftp.HydraulicValue#isAnyPressure <em>Any Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Any Pressure</em>'.
	 * @see ftp.HydraulicValue#isAnyPressure()
	 * @see #getHydraulicValue()
	 * @generated
	 */
	EAttribute getHydraulicValue_AnyPressure();

	/**
	 * Returns the meta object for class '{@link ftp.VisualValue <em>Visual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Value</em>'.
	 * @see ftp.VisualValue
	 * @generated
	 */
	EClass getVisualValue();

	/**
	 * Returns the meta object for the attribute '{@link ftp.VisualValue#getBulb <em>Bulb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bulb</em>'.
	 * @see ftp.VisualValue#getBulb()
	 * @see #getVisualValue()
	 * @generated
	 */
	EAttribute getVisualValue_Bulb();

	/**
	 * Returns the meta object for class '{@link ftp.FloatValue <em>Float Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Value</em>'.
	 * @see ftp.FloatValue
	 * @generated
	 */
	EClass getFloatValue();

	/**
	 * Returns the meta object for the attribute '{@link ftp.FloatValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ftp.FloatValue#getValue()
	 * @see #getFloatValue()
	 * @generated
	 */
	EAttribute getFloatValue_Value();

	/**
	 * Returns the meta object for class '{@link ftp.SignalConstant <em>Signal Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Constant</em>'.
	 * @see ftp.SignalConstant
	 * @generated
	 */
	EClass getSignalConstant();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.SignalConstant#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Port</em>'.
	 * @see ftp.SignalConstant#getOutPort()
	 * @see #getSignalConstant()
	 * @generated
	 */
	EReference getSignalConstant_OutPort();

	/**
	 * Returns the meta object for the attribute '{@link ftp.SignalConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ftp.SignalConstant#getValue()
	 * @see #getSignalConstant()
	 * @generated
	 */
	EAttribute getSignalConstant_Value();

	/**
	 * Returns the meta object for enum '{@link ftp.SignalValues <em>Signal Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Values</em>'.
	 * @see ftp.SignalValues
	 * @generated
	 */
	EEnum getSignalValues();

	/**
	 * Returns the meta object for enum '{@link ftp.VisualValues <em>Visual Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visual Values</em>'.
	 * @see ftp.VisualValues
	 * @generated
	 */
	EEnum getVisualValues();

	/**
	 * Returns the meta object for class '{@link ftp.FaultTreeContext <em>Fault Tree Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Tree Context</em>'.
	 * @see ftp.FaultTreeContext
	 * @generated
	 */
	EClass getFaultTreeContext();

	/**
	 * Returns the meta object for the containment reference '{@link ftp.FaultTreeContext#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composition</em>'.
	 * @see ftp.FaultTreeContext#getComposition()
	 * @see #getFaultTreeContext()
	 * @generated
	 */
	EReference getFaultTreeContext_Composition();

	/**
	 * Returns the meta object for the containment reference list '{@link ftp.FaultTreeContext#getObservations <em>Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Observations</em>'.
	 * @see ftp.FaultTreeContext#getObservations()
	 * @see #getFaultTreeContext()
	 * @generated
	 */
	EReference getFaultTreeContext_Observations();

	/**
	 * Returns the meta object for class '{@link ftp.RootEvent <em>Root Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Event</em>'.
	 * @see ftp.RootEvent
	 * @generated
	 */
	EClass getRootEvent();

	/**
	 * Returns the meta object for the attribute '{@link ftp.RootEvent#getObservation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observation</em>'.
	 * @see ftp.RootEvent#getObservation()
	 * @see #getRootEvent()
	 * @generated
	 */
	EAttribute getRootEvent_Observation();

	/**
	 * Returns the meta object for the reference list '{@link ftp.RootEvent#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see ftp.RootEvent#getInputs()
	 * @see #getRootEvent()
	 * @generated
	 */
	EReference getRootEvent_Inputs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FtpFactory getFtpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ftp.impl.FaultTreeImpl <em>Fault Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.FaultTreeImpl
		 * @see ftp.impl.FtpPackageImpl#getFaultTree()
		 * @generated
		 */
		EClass FAULT_TREE = eINSTANCE.getFaultTree();

		/**
		 * The meta object literal for the '<em><b>Ftnodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_TREE__FTNODES = eINSTANCE.getFaultTree_Ftnodes();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_TREE__ROOT = eINSTANCE.getFaultTree_Root();

		/**
		 * The meta object literal for the '{@link ftp.impl.FTNodeImpl <em>FT Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.FTNodeImpl
		 * @see ftp.impl.FtpPackageImpl#getFTNode()
		 * @generated
		 */
		EClass FT_NODE = eINSTANCE.getFTNode();

		/**
		 * The meta object literal for the '{@link ftp.impl.OrGateImpl <em>Or Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.OrGateImpl
		 * @see ftp.impl.FtpPackageImpl#getOrGate()
		 * @generated
		 */
		EClass OR_GATE = eINSTANCE.getOrGate();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_GATE__INPUTS = eINSTANCE.getOrGate_Inputs();

		/**
		 * The meta object literal for the '{@link ftp.impl.AndGateImpl <em>And Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.AndGateImpl
		 * @see ftp.impl.FtpPackageImpl#getAndGate()
		 * @generated
		 */
		EClass AND_GATE = eINSTANCE.getAndGate();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_GATE__INPUTS = eINSTANCE.getAndGate_Inputs();

		/**
		 * The meta object literal for the '{@link ftp.impl.FaultImpl <em>Fault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.FaultImpl
		 * @see ftp.impl.FtpPackageImpl#getFault()
		 * @generated
		 */
		EClass FAULT = eINSTANCE.getFault();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT__DESCRIPTION = eINSTANCE.getFault_Description();

		/**
		 * The meta object literal for the '{@link ftp.impl.ObservationImpl <em>Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.ObservationImpl
		 * @see ftp.impl.FtpPackageImpl#getObservation()
		 * @generated
		 */
		EClass OBSERVATION = eINSTANCE.getObservation();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__COMPONENT = eINSTANCE.getObservation_Component();

		/**
		 * The meta object literal for the '<em><b>Port Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__PORT_VALUES = eINSTANCE.getObservation_PortValues();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVATION__NAME = eINSTANCE.getObservation_Name();

		/**
		 * The meta object literal for the '<em><b>Fault Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVATION__FAULT_LIMIT = eINSTANCE.getObservation_FaultLimit();

		/**
		 * The meta object literal for the '<em><b>Faulttree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__FAULTTREE = eINSTANCE.getObservation_Faulttree();

		/**
		 * The meta object literal for the '<em><b>Build Fault Tree</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBSERVATION___BUILD_FAULT_TREE = eINSTANCE.getObservation__BuildFaultTree();

		/**
		 * The meta object literal for the '{@link ftp.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.ComponentImpl
		 * @see ftp.impl.FtpPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__TYPE = eINSTANCE.getComponent_Type();

		/**
		 * The meta object literal for the '{@link ftp.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.PortImpl
		 * @see ftp.impl.FtpPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '<em><b>New Port Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PORT___NEW_PORT_VALUE = eINSTANCE.getPort__NewPortValue();

		/**
		 * The meta object literal for the '{@link ftp.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.ConnectionImpl
		 * @see ftp.impl.FtpPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>From Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__FROM_PORT = eINSTANCE.getConnection_FromPort();

		/**
		 * The meta object literal for the '<em><b>To Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TO_PORT = eINSTANCE.getConnection_ToPort();

		/**
		 * The meta object literal for the '{@link ftp.impl.DigintalConnectionImpl <em>Digintal Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.DigintalConnectionImpl
		 * @see ftp.impl.FtpPackageImpl#getDigintalConnection()
		 * @generated
		 */
		EClass DIGINTAL_CONNECTION = eINSTANCE.getDigintalConnection();

		/**
		 * The meta object literal for the '{@link ftp.impl.AnalogConnectionImpl <em>Analog Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.AnalogConnectionImpl
		 * @see ftp.impl.FtpPackageImpl#getAnalogConnection()
		 * @generated
		 */
		EClass ANALOG_CONNECTION = eINSTANCE.getAnalogConnection();

		/**
		 * The meta object literal for the '{@link ftp.impl.SignalConnectionImpl <em>Signal Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.SignalConnectionImpl
		 * @see ftp.impl.FtpPackageImpl#getSignalConnection()
		 * @generated
		 */
		EClass SIGNAL_CONNECTION = eINSTANCE.getSignalConnection();

		/**
		 * The meta object literal for the '{@link ftp.impl.ElectricalConnectionImpl <em>Electrical Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.ElectricalConnectionImpl
		 * @see ftp.impl.FtpPackageImpl#getElectricalConnection()
		 * @generated
		 */
		EClass ELECTRICAL_CONNECTION = eINSTANCE.getElectricalConnection();

		/**
		 * The meta object literal for the '{@link ftp.impl.HydraulicConnectionImpl <em>Hydraulic Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.HydraulicConnectionImpl
		 * @see ftp.impl.FtpPackageImpl#getHydraulicConnection()
		 * @generated
		 */
		EClass HYDRAULIC_CONNECTION = eINSTANCE.getHydraulicConnection();

		/**
		 * The meta object literal for the '{@link ftp.impl.MechanicalConnectionImpl <em>Mechanical Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.MechanicalConnectionImpl
		 * @see ftp.impl.FtpPackageImpl#getMechanicalConnection()
		 * @generated
		 */
		EClass MECHANICAL_CONNECTION = eINSTANCE.getMechanicalConnection();

		/**
		 * The meta object literal for the '{@link ftp.impl.PrimitiveComponentImpl <em>Primitive Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.PrimitiveComponentImpl
		 * @see ftp.impl.FtpPackageImpl#getPrimitiveComponent()
		 * @generated
		 */
		EClass PRIMITIVE_COMPONENT = eINSTANCE.getPrimitiveComponent();

		/**
		 * The meta object literal for the '{@link ftp.impl.ComposedComponentImpl <em>Composed Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.ComposedComponentImpl
		 * @see ftp.impl.FtpPackageImpl#getComposedComponent()
		 * @generated
		 */
		EClass COMPOSED_COMPONENT = eINSTANCE.getComposedComponent();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_COMPONENT__COMPOSITION = eINSTANCE.getComposedComponent_Composition();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_COMPONENT__PORTS = eINSTANCE.getComposedComponent_Ports();

		/**
		 * The meta object literal for the '{@link ftp.impl.CompositionElementImpl <em>Composition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.CompositionElementImpl
		 * @see ftp.impl.FtpPackageImpl#getCompositionElement()
		 * @generated
		 */
		EClass COMPOSITION_ELEMENT = eINSTANCE.getCompositionElement();

		/**
		 * The meta object literal for the '{@link ftp.impl.PortValueImpl <em>Port Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.PortValueImpl
		 * @see ftp.impl.FtpPackageImpl#getPortValue()
		 * @generated
		 */
		EClass PORT_VALUE = eINSTANCE.getPortValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_VALUE__VALUE = eINSTANCE.getPortValue_Value();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_VALUE__PORT = eINSTANCE.getPortValue_Port();

		/**
		 * The meta object literal for the '{@link ftp.impl.ResistorImpl <em>Resistor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.ResistorImpl
		 * @see ftp.impl.FtpPackageImpl#getResistor()
		 * @generated
		 */
		EClass RESISTOR = eINSTANCE.getResistor();

		/**
		 * The meta object literal for the '<em><b>Resistance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESISTOR__RESISTANCE = eINSTANCE.getResistor_Resistance();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESISTOR__IN_PORT = eINSTANCE.getResistor_InPort();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESISTOR__OUT_PORT = eINSTANCE.getResistor_OutPort();

		/**
		 * The meta object literal for the '{@link ftp.impl.CapacitorImpl <em>Capacitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.CapacitorImpl
		 * @see ftp.impl.FtpPackageImpl#getCapacitor()
		 * @generated
		 */
		EClass CAPACITOR = eINSTANCE.getCapacitor();

		/**
		 * The meta object literal for the '{@link ftp.impl.AnalogBatteryImpl <em>Analog Battery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.AnalogBatteryImpl
		 * @see ftp.impl.FtpPackageImpl#getAnalogBattery()
		 * @generated
		 */
		EClass ANALOG_BATTERY = eINSTANCE.getAnalogBattery();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_BATTERY__IN_PORT = eINSTANCE.getAnalogBattery_InPort();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_BATTERY__OUT_PORT = eINSTANCE.getAnalogBattery_OutPort();

		/**
		 * The meta object literal for the '<em><b>Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOG_BATTERY__VOLTAGE = eINSTANCE.getAnalogBattery_Voltage();

		/**
		 * The meta object literal for the '{@link ftp.impl.AnalogSwitchImpl <em>Analog Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.AnalogSwitchImpl
		 * @see ftp.impl.FtpPackageImpl#getAnalogSwitch()
		 * @generated
		 */
		EClass ANALOG_SWITCH = eINSTANCE.getAnalogSwitch();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_SWITCH__IN_PORT = eINSTANCE.getAnalogSwitch_InPort();

		/**
		 * The meta object literal for the '<em><b>Set Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_SWITCH__SET_PORT = eINSTANCE.getAnalogSwitch_SetPort();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_SWITCH__OUT_PORT = eINSTANCE.getAnalogSwitch_OutPort();

		/**
		 * The meta object literal for the '{@link ftp.impl.AnalogLampImpl <em>Analog Lamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.AnalogLampImpl
		 * @see ftp.impl.FtpPackageImpl#getAnalogLamp()
		 * @generated
		 */
		EClass ANALOG_LAMP = eINSTANCE.getAnalogLamp();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_LAMP__IN_PORT = eINSTANCE.getAnalogLamp_InPort();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_LAMP__OUT_PORT = eINSTANCE.getAnalogLamp_OutPort();

		/**
		 * The meta object literal for the '<em><b>Light Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_LAMP__LIGHT_PORT = eINSTANCE.getAnalogLamp_LightPort();

		/**
		 * The meta object literal for the '{@link ftp.impl.DigitalBatteryImpl <em>Digital Battery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.DigitalBatteryImpl
		 * @see ftp.impl.FtpPackageImpl#getDigitalBattery()
		 * @generated
		 */
		EClass DIGITAL_BATTERY = eINSTANCE.getDigitalBattery();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_BATTERY__IN_PORT = eINSTANCE.getDigitalBattery_InPort();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_BATTERY__OUT_PORT = eINSTANCE.getDigitalBattery_OutPort();

		/**
		 * The meta object literal for the '{@link ftp.impl.DigitalSwitchImpl <em>Digital Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.DigitalSwitchImpl
		 * @see ftp.impl.FtpPackageImpl#getDigitalSwitch()
		 * @generated
		 */
		EClass DIGITAL_SWITCH = eINSTANCE.getDigitalSwitch();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_SWITCH__IN_PORT = eINSTANCE.getDigitalSwitch_InPort();

		/**
		 * The meta object literal for the '<em><b>Set Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_SWITCH__SET_PORT = eINSTANCE.getDigitalSwitch_SetPort();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_SWITCH__OUT_PORT = eINSTANCE.getDigitalSwitch_OutPort();

		/**
		 * The meta object literal for the '{@link ftp.impl.DigitalLampImpl <em>Digital Lamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.DigitalLampImpl
		 * @see ftp.impl.FtpPackageImpl#getDigitalLamp()
		 * @generated
		 */
		EClass DIGITAL_LAMP = eINSTANCE.getDigitalLamp();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_LAMP__IN_PORT = eINSTANCE.getDigitalLamp_InPort();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_LAMP__OUT_PORT = eINSTANCE.getDigitalLamp_OutPort();

		/**
		 * The meta object literal for the '<em><b>Light Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_LAMP__LIGHT_PORT = eINSTANCE.getDigitalLamp_LightPort();

		/**
		 * The meta object literal for the '{@link ftp.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.NotImpl
		 * @see ftp.impl.FtpPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link ftp.impl.XorImpl <em>Xor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.XorImpl
		 * @see ftp.impl.FtpPackageImpl#getXor()
		 * @generated
		 */
		EClass XOR = eINSTANCE.getXor();

		/**
		 * The meta object literal for the '{@link ftp.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.AndImpl
		 * @see ftp.impl.FtpPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link ftp.impl.NTransistorImpl <em>NTransistor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.NTransistorImpl
		 * @see ftp.impl.FtpPackageImpl#getNTransistor()
		 * @generated
		 */
		EClass NTRANSISTOR = eINSTANCE.getNTransistor();

		/**
		 * The meta object literal for the '<em><b>Gate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NTRANSISTOR__GATE = eINSTANCE.getNTransistor_Gate();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NTRANSISTOR__SOURCE = eINSTANCE.getNTransistor_Source();

		/**
		 * The meta object literal for the '<em><b>Drain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NTRANSISTOR__DRAIN = eINSTANCE.getNTransistor_Drain();

		/**
		 * The meta object literal for the '{@link ftp.impl.PTransistorImpl <em>PTransistor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.PTransistorImpl
		 * @see ftp.impl.FtpPackageImpl#getPTransistor()
		 * @generated
		 */
		EClass PTRANSISTOR = eINSTANCE.getPTransistor();

		/**
		 * The meta object literal for the '<em><b>Gate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTRANSISTOR__GATE = eINSTANCE.getPTransistor_Gate();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTRANSISTOR__SOURCE = eINSTANCE.getPTransistor_Source();

		/**
		 * The meta object literal for the '<em><b>Drain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTRANSISTOR__DRAIN = eINSTANCE.getPTransistor_Drain();

		/**
		 * The meta object literal for the '{@link ftp.impl.DFlipFlopImpl <em>DFlip Flop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.DFlipFlopImpl
		 * @see ftp.impl.FtpPackageImpl#getDFlipFlop()
		 * @generated
		 */
		EClass DFLIP_FLOP = eINSTANCE.getDFlipFlop();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFLIP_FLOP__IN_PORT = eINSTANCE.getDFlipFlop_InPort();

		/**
		 * The meta object literal for the '<em><b>Clock Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFLIP_FLOP__CLOCK_PORT = eINSTANCE.getDFlipFlop_ClockPort();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFLIP_FLOP__OUT_PORT = eINSTANCE.getDFlipFlop_OutPort();

		/**
		 * The meta object literal for the '<em><b>State Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFLIP_FLOP__STATE_PORT = eINSTANCE.getDFlipFlop_StatePort();

		/**
		 * The meta object literal for the '{@link ftp.impl.SignalPortImpl <em>Signal Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.SignalPortImpl
		 * @see ftp.impl.FtpPackageImpl#getSignalPort()
		 * @generated
		 */
		EClass SIGNAL_PORT = eINSTANCE.getSignalPort();

		/**
		 * The meta object literal for the '{@link ftp.impl.ElectricalPortImpl <em>Electrical Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.ElectricalPortImpl
		 * @see ftp.impl.FtpPackageImpl#getElectricalPort()
		 * @generated
		 */
		EClass ELECTRICAL_PORT = eINSTANCE.getElectricalPort();

		/**
		 * The meta object literal for the '{@link ftp.impl.HydraulicPortImpl <em>Hydraulic Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.HydraulicPortImpl
		 * @see ftp.impl.FtpPackageImpl#getHydraulicPort()
		 * @generated
		 */
		EClass HYDRAULIC_PORT = eINSTANCE.getHydraulicPort();

		/**
		 * The meta object literal for the '{@link ftp.impl.VisualPortImpl <em>Visual Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.VisualPortImpl
		 * @see ftp.impl.FtpPackageImpl#getVisualPort()
		 * @generated
		 */
		EClass VISUAL_PORT = eINSTANCE.getVisualPort();

		/**
		 * The meta object literal for the '{@link ftp.impl.VisualConnectionImpl <em>Visual Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.VisualConnectionImpl
		 * @see ftp.impl.FtpPackageImpl#getVisualConnection()
		 * @generated
		 */
		EClass VISUAL_CONNECTION = eINSTANCE.getVisualConnection();

		/**
		 * The meta object literal for the '{@link ftp.impl.MechanicalPortImpl <em>Mechanical Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.MechanicalPortImpl
		 * @see ftp.impl.FtpPackageImpl#getMechanicalPort()
		 * @generated
		 */
		EClass MECHANICAL_PORT = eINSTANCE.getMechanicalPort();

		/**
		 * The meta object literal for the '{@link ftp.impl.TypedPortValueImpl <em>Typed Port Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.TypedPortValueImpl
		 * @see ftp.impl.FtpPackageImpl#getTypedPortValue()
		 * @generated
		 */
		EClass TYPED_PORT_VALUE = eINSTANCE.getTypedPortValue();

		/**
		 * The meta object literal for the '{@link ftp.impl.SignalValueImpl <em>Signal Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.SignalValueImpl
		 * @see ftp.impl.FtpPackageImpl#getSignalValue()
		 * @generated
		 */
		EClass SIGNAL_VALUE = eINSTANCE.getSignalValue();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_VALUE__SIGNAL = eINSTANCE.getSignalValue_Signal();

		/**
		 * The meta object literal for the '{@link ftp.impl.ElectricalValueImpl <em>Electrical Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.ElectricalValueImpl
		 * @see ftp.impl.FtpPackageImpl#getElectricalValue()
		 * @generated
		 */
		EClass ELECTRICAL_VALUE = eINSTANCE.getElectricalValue();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRICAL_VALUE__CURRENT = eINSTANCE.getElectricalValue_Current();

		/**
		 * The meta object literal for the '<em><b>Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRICAL_VALUE__VOLTAGE = eINSTANCE.getElectricalValue_Voltage();

		/**
		 * The meta object literal for the '<em><b>Any Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRICAL_VALUE__ANY_CURRENT = eINSTANCE.getElectricalValue_AnyCurrent();

		/**
		 * The meta object literal for the '<em><b>Any Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRICAL_VALUE__ANY_VOLTAGE = eINSTANCE.getElectricalValue_AnyVoltage();

		/**
		 * The meta object literal for the '{@link ftp.impl.HydraulicValueImpl <em>Hydraulic Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.HydraulicValueImpl
		 * @see ftp.impl.FtpPackageImpl#getHydraulicValue()
		 * @generated
		 */
		EClass HYDRAULIC_VALUE = eINSTANCE.getHydraulicValue();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRAULIC_VALUE__FLOW = eINSTANCE.getHydraulicValue_Flow();

		/**
		 * The meta object literal for the '<em><b>Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRAULIC_VALUE__PRESSURE = eINSTANCE.getHydraulicValue_Pressure();

		/**
		 * The meta object literal for the '<em><b>Any Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRAULIC_VALUE__ANY_FLOW = eINSTANCE.getHydraulicValue_AnyFlow();

		/**
		 * The meta object literal for the '<em><b>Any Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYDRAULIC_VALUE__ANY_PRESSURE = eINSTANCE.getHydraulicValue_AnyPressure();

		/**
		 * The meta object literal for the '{@link ftp.impl.VisualValueImpl <em>Visual Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.VisualValueImpl
		 * @see ftp.impl.FtpPackageImpl#getVisualValue()
		 * @generated
		 */
		EClass VISUAL_VALUE = eINSTANCE.getVisualValue();

		/**
		 * The meta object literal for the '<em><b>Bulb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_VALUE__BULB = eINSTANCE.getVisualValue_Bulb();

		/**
		 * The meta object literal for the '{@link ftp.impl.FloatValueImpl <em>Float Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.FloatValueImpl
		 * @see ftp.impl.FtpPackageImpl#getFloatValue()
		 * @generated
		 */
		EClass FLOAT_VALUE = eINSTANCE.getFloatValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_VALUE__VALUE = eINSTANCE.getFloatValue_Value();

		/**
		 * The meta object literal for the '{@link ftp.impl.SignalConstantImpl <em>Signal Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.SignalConstantImpl
		 * @see ftp.impl.FtpPackageImpl#getSignalConstant()
		 * @generated
		 */
		EClass SIGNAL_CONSTANT = eINSTANCE.getSignalConstant();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_CONSTANT__OUT_PORT = eINSTANCE.getSignalConstant_OutPort();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_CONSTANT__VALUE = eINSTANCE.getSignalConstant_Value();

		/**
		 * The meta object literal for the '{@link ftp.SignalValues <em>Signal Values</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.SignalValues
		 * @see ftp.impl.FtpPackageImpl#getSignalValues()
		 * @generated
		 */
		EEnum SIGNAL_VALUES = eINSTANCE.getSignalValues();

		/**
		 * The meta object literal for the '{@link ftp.VisualValues <em>Visual Values</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.VisualValues
		 * @see ftp.impl.FtpPackageImpl#getVisualValues()
		 * @generated
		 */
		EEnum VISUAL_VALUES = eINSTANCE.getVisualValues();

		/**
		 * The meta object literal for the '{@link ftp.impl.FaultTreeContextImpl <em>Fault Tree Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.FaultTreeContextImpl
		 * @see ftp.impl.FtpPackageImpl#getFaultTreeContext()
		 * @generated
		 */
		EClass FAULT_TREE_CONTEXT = eINSTANCE.getFaultTreeContext();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_TREE_CONTEXT__COMPOSITION = eINSTANCE.getFaultTreeContext_Composition();

		/**
		 * The meta object literal for the '<em><b>Observations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_TREE_CONTEXT__OBSERVATIONS = eINSTANCE.getFaultTreeContext_Observations();

		/**
		 * The meta object literal for the '{@link ftp.impl.RootEventImpl <em>Root Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftp.impl.RootEventImpl
		 * @see ftp.impl.FtpPackageImpl#getRootEvent()
		 * @generated
		 */
		EClass ROOT_EVENT = eINSTANCE.getRootEvent();

		/**
		 * The meta object literal for the '<em><b>Observation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT_EVENT__OBSERVATION = eINSTANCE.getRootEvent_Observation();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_EVENT__INPUTS = eINSTANCE.getRootEvent_Inputs();

	}

} //FtpPackage
