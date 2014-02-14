/**
 */
package net.certware.intent.state.stateSpecification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.certware.intent.state.stateSpecification.StateSpecificationFactory
 * @model kind="package"
 * @generated
 */
public interface StateSpecificationPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "stateSpecification";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.certware.net/intent/state/StateSpecification";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "stateSpecification";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StateSpecificationPackage eINSTANCE = net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl.init();

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.SpecificationImpl <em>Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.SpecificationImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getSpecification()
   * @generated
   */
  int SPECIFICATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Devices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__DEVICES = 1;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__COMPONENTS = 2;

  /**
   * The number of structural features of the '<em>Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.ModeElementTypeImpl <em>Mode Element Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.ModeElementTypeImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getModeElementType()
   * @generated
   */
  int MODE_ELEMENT_TYPE = 1;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_ELEMENT_TYPE__ELEMENT_TYPE = 0;

  /**
   * The number of structural features of the '<em>Mode Element Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_ELEMENT_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.ComponentImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Modes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__MODES = 1;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__STATES = 2;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__INPUTS = 3;

  /**
   * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__OUTPUTS = 4;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.ModeElementImpl <em>Mode Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.ModeElementImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getModeElement()
   * @generated
   */
  int MODE_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Inferred</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_ELEMENT__INFERRED = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_ELEMENT__TYPE = 1;

  /**
   * The feature id for the '<em><b>Modes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_ELEMENT__MODES = 2;

  /**
   * The number of structural features of the '<em>Mode Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.StateElementImpl <em>State Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.StateElementImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getStateElement()
   * @generated
   */
  int STATE_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Inferred</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ELEMENT__INFERRED = 0;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ELEMENT__STATES = 1;

  /**
   * The number of structural features of the '<em>State Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.StateVariableImpl <em>State Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.StateVariableImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getStateVariable()
   * @generated
   */
  int STATE_VARIABLE = 5;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE__DESC = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE__STATE = 1;

  /**
   * The number of structural features of the '<em>State Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.StateImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getState()
   * @generated
   */
  int STATE = 6;

  /**
   * The feature id for the '<em><b>Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__INITIAL = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__VALUE = 1;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.ModeVariableImpl <em>Mode Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.ModeVariableImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getModeVariable()
   * @generated
   */
  int MODE_VARIABLE = 7;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_VARIABLE__DESC = 0;

  /**
   * The feature id for the '<em><b>Modes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_VARIABLE__MODES = 1;

  /**
   * The number of structural features of the '<em>Mode Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.ModeImpl <em>Mode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.ModeImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getMode()
   * @generated
   */
  int MODE = 8;

  /**
   * The feature id for the '<em><b>Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE__INITIAL = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Mode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.DeviceImpl <em>Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.DeviceImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getDevice()
   * @generated
   */
  int DEVICE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__DESC = 1;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__INPUTS = 2;

  /**
   * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__OUTPUTS = 3;

  /**
   * The number of structural features of the '<em>Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.DeviceInputImpl <em>Device Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.DeviceInputImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getDeviceInput()
   * @generated
   */
  int DEVICE_INPUT = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_INPUT__NAME = 0;

  /**
   * The feature id for the '<em><b>Io</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_INPUT__IO = 1;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_INPUT__SOURCE = 2;

  /**
   * The number of structural features of the '<em>Device Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_INPUT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.DeviceOutputImpl <em>Device Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.DeviceOutputImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getDeviceOutput()
   * @generated
   */
  int DEVICE_OUTPUT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_OUTPUT__NAME = 0;

  /**
   * The feature id for the '<em><b>Io</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_OUTPUT__IO = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_OUTPUT__TARGET = 2;

  /**
   * The number of structural features of the '<em>Device Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_OUTPUT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.ComponentInputImpl <em>Component Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.ComponentInputImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getComponentInput()
   * @generated
   */
  int COMPONENT_INPUT = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INPUT__NAME = 0;

  /**
   * The feature id for the '<em><b>Io</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INPUT__IO = 1;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INPUT__SOURCE = 2;

  /**
   * The number of structural features of the '<em>Component Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INPUT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.ComponentOutputImpl <em>Component Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.ComponentOutputImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getComponentOutput()
   * @generated
   */
  int COMPONENT_OUTPUT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OUTPUT__NAME = 0;

  /**
   * The feature id for the '<em><b>Io</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OUTPUT__IO = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OUTPUT__TARGET = 2;

  /**
   * The number of structural features of the '<em>Component Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OUTPUT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.BigUnitValueImpl <em>Big Unit Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.BigUnitValueImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getBigUnitValue()
   * @generated
   */
  int BIG_UNIT_VALUE = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_UNIT_VALUE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Units</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_UNIT_VALUE__UNITS = 1;

  /**
   * The number of structural features of the '<em>Big Unit Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_UNIT_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.StateValueImpl <em>State Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.StateValueImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getStateValue()
   * @generated
   */
  int STATE_VALUE = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>State Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.StateListImpl <em>State List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.StateListImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getStateList()
   * @generated
   */
  int STATE_LIST = 16;

  /**
   * The feature id for the '<em><b>State List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_LIST__STATE_LIST = 0;

  /**
   * The number of structural features of the '<em>State List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.TriggerImpl <em>Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.TriggerImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getTrigger()
   * @generated
   */
  int TRIGGER = 17;

  /**
   * The feature id for the '<em><b>Mode</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__MODE = 0;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__LIST = 1;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__VARIABLE = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__VALUE = 3;

  /**
   * The number of structural features of the '<em>Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.TriggerTableImpl <em>Trigger Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.TriggerTableImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getTriggerTable()
   * @generated
   */
  int TRIGGER_TABLE = 18;

  /**
   * The feature id for the '<em><b>Rows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_TABLE__ROWS = 0;

  /**
   * The number of structural features of the '<em>Trigger Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_TABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.ValueRangeImpl <em>Value Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.ValueRangeImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getValueRange()
   * @generated
   */
  int VALUE_RANGE = 19;

  /**
   * The feature id for the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_RANGE__LOWER = 0;

  /**
   * The feature id for the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_RANGE__UPPER = 1;

  /**
   * The feature id for the '<em><b>Range Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_RANGE__RANGE_TYPE = 2;

  /**
   * The feature id for the '<em><b>Range Units</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_RANGE__RANGE_UNITS = 3;

  /**
   * The number of structural features of the '<em>Value Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_RANGE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.ValueListImpl <em>Value List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.ValueListImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getValueList()
   * @generated
   */
  int VALUE_LIST = 20;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_LIST__VALUES = 0;

  /**
   * The number of structural features of the '<em>Value List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.OutputImpl <em>Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.OutputImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getOutput()
   * @generated
   */
  int OUTPUT = 21;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__RANGE = 0;

  /**
   * The feature id for the '<em><b>Value List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__VALUE_LIST = 1;

  /**
   * The feature id for the '<em><b>Rate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__RATE = 2;

  /**
   * The feature id for the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__DELAY = 3;

  /**
   * The feature id for the '<em><b>Deadline</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__DEADLINE = 4;

  /**
   * The feature id for the '<em><b>Completion Handling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__COMPLETION_HANDLING = 5;

  /**
   * The feature id for the '<em><b>Variables</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__VARIABLES = 6;

  /**
   * The feature id for the '<em><b>Relationship</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__RELATIONSHIP = 7;

  /**
   * The feature id for the '<em><b>Min Response</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__MIN_RESPONSE = 8;

  /**
   * The feature id for the '<em><b>Max Response</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__MAX_RESPONSE = 9;

  /**
   * The feature id for the '<em><b>Feeback Handling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__FEEBACK_HANDLING = 10;

  /**
   * The feature id for the '<em><b>Reversed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__REVERSED = 11;

  /**
   * The feature id for the '<em><b>References</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__REFERENCES = 12;

  /**
   * The feature id for the '<em><b>Comments</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__COMMENTS = 13;

  /**
   * The feature id for the '<em><b>Contents</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__CONTENTS = 14;

  /**
   * The feature id for the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__TABLE = 15;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FEATURE_COUNT = 16;

  /**
   * The meta object id for the '{@link net.certware.intent.state.stateSpecification.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.state.stateSpecification.impl.InputImpl
   * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getInput()
   * @generated
   */
  int INPUT = 22;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__RANGE = 0;

  /**
   * The feature id for the '<em><b>Value List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__VALUE_LIST = 1;

  /**
   * The feature id for the '<em><b>Value Handling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__VALUE_HANDLING = 2;

  /**
   * The feature id for the '<em><b>Granularity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__GRANULARITY = 3;

  /**
   * The feature id for the '<em><b>Arrival Rate Avg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__ARRIVAL_RATE_AVG = 4;

  /**
   * The feature id for the '<em><b>Arrival Rate Minimum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__ARRIVAL_RATE_MINIMUM = 5;

  /**
   * The feature id for the '<em><b>Arrival Rate Maximum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__ARRIVAL_RATE_MAXIMUM = 6;

  /**
   * The feature id for the '<em><b>Obsolescence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__OBSOLESCENCE = 7;

  /**
   * The feature id for the '<em><b>References</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__REFERENCES = 8;

  /**
   * The feature id for the '<em><b>Appears In</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__APPEARS_IN = 9;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__DESCRIPTION = 10;

  /**
   * The feature id for the '<em><b>Comments</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__COMMENTS = 11;

  /**
   * The feature id for the '<em><b>Structure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__STRUCTURE = 12;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = 13;


  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.Specification <em>Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specification</em>'.
   * @see net.certware.intent.state.stateSpecification.Specification
   * @generated
   */
  EClass getSpecification();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Specification#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.intent.state.stateSpecification.Specification#getName()
   * @see #getSpecification()
   * @generated
   */
  EAttribute getSpecification_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.state.stateSpecification.Specification#getDevices <em>Devices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Devices</em>'.
   * @see net.certware.intent.state.stateSpecification.Specification#getDevices()
   * @see #getSpecification()
   * @generated
   */
  EReference getSpecification_Devices();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.state.stateSpecification.Specification#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see net.certware.intent.state.stateSpecification.Specification#getComponents()
   * @see #getSpecification()
   * @generated
   */
  EReference getSpecification_Components();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.ModeElementType <em>Mode Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mode Element Type</em>'.
   * @see net.certware.intent.state.stateSpecification.ModeElementType
   * @generated
   */
  EClass getModeElementType();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.ModeElementType#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element Type</em>'.
   * @see net.certware.intent.state.stateSpecification.ModeElementType#getElementType()
   * @see #getModeElementType()
   * @generated
   */
  EAttribute getModeElementType_ElementType();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see net.certware.intent.state.stateSpecification.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.intent.state.stateSpecification.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.state.stateSpecification.Component#getModes <em>Modes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modes</em>'.
   * @see net.certware.intent.state.stateSpecification.Component#getModes()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Modes();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.state.stateSpecification.Component#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see net.certware.intent.state.stateSpecification.Component#getStates()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_States();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.state.stateSpecification.Component#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see net.certware.intent.state.stateSpecification.Component#getInputs()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Inputs();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.state.stateSpecification.Component#getOutputs <em>Outputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outputs</em>'.
   * @see net.certware.intent.state.stateSpecification.Component#getOutputs()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Outputs();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.ModeElement <em>Mode Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mode Element</em>'.
   * @see net.certware.intent.state.stateSpecification.ModeElement
   * @generated
   */
  EClass getModeElement();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.ModeElement#isInferred <em>Inferred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inferred</em>'.
   * @see net.certware.intent.state.stateSpecification.ModeElement#isInferred()
   * @see #getModeElement()
   * @generated
   */
  EAttribute getModeElement_Inferred();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.ModeElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.certware.intent.state.stateSpecification.ModeElement#getType()
   * @see #getModeElement()
   * @generated
   */
  EReference getModeElement_Type();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.state.stateSpecification.ModeElement#getModes <em>Modes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modes</em>'.
   * @see net.certware.intent.state.stateSpecification.ModeElement#getModes()
   * @see #getModeElement()
   * @generated
   */
  EReference getModeElement_Modes();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.StateElement <em>State Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Element</em>'.
   * @see net.certware.intent.state.stateSpecification.StateElement
   * @generated
   */
  EClass getStateElement();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.StateElement#isInferred <em>Inferred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inferred</em>'.
   * @see net.certware.intent.state.stateSpecification.StateElement#isInferred()
   * @see #getStateElement()
   * @generated
   */
  EAttribute getStateElement_Inferred();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.state.stateSpecification.StateElement#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see net.certware.intent.state.stateSpecification.StateElement#getStates()
   * @see #getStateElement()
   * @generated
   */
  EReference getStateElement_States();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.StateVariable <em>State Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Variable</em>'.
   * @see net.certware.intent.state.stateSpecification.StateVariable
   * @generated
   */
  EClass getStateVariable();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.StateVariable#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see net.certware.intent.state.stateSpecification.StateVariable#getDesc()
   * @see #getStateVariable()
   * @generated
   */
  EAttribute getStateVariable_Desc();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.state.stateSpecification.StateVariable#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State</em>'.
   * @see net.certware.intent.state.stateSpecification.StateVariable#getState()
   * @see #getStateVariable()
   * @generated
   */
  EReference getStateVariable_State();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see net.certware.intent.state.stateSpecification.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.State#isInitial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial</em>'.
   * @see net.certware.intent.state.stateSpecification.State#isInitial()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Initial();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.State#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.certware.intent.state.stateSpecification.State#getValue()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Value();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.ModeVariable <em>Mode Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mode Variable</em>'.
   * @see net.certware.intent.state.stateSpecification.ModeVariable
   * @generated
   */
  EClass getModeVariable();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.ModeVariable#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see net.certware.intent.state.stateSpecification.ModeVariable#getDesc()
   * @see #getModeVariable()
   * @generated
   */
  EAttribute getModeVariable_Desc();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.state.stateSpecification.ModeVariable#getModes <em>Modes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modes</em>'.
   * @see net.certware.intent.state.stateSpecification.ModeVariable#getModes()
   * @see #getModeVariable()
   * @generated
   */
  EReference getModeVariable_Modes();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.Mode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mode</em>'.
   * @see net.certware.intent.state.stateSpecification.Mode
   * @generated
   */
  EClass getMode();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Mode#isInitial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial</em>'.
   * @see net.certware.intent.state.stateSpecification.Mode#isInitial()
   * @see #getMode()
   * @generated
   */
  EAttribute getMode_Initial();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Mode#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.certware.intent.state.stateSpecification.Mode#getValue()
   * @see #getMode()
   * @generated
   */
  EAttribute getMode_Value();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.Device <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device</em>'.
   * @see net.certware.intent.state.stateSpecification.Device
   * @generated
   */
  EClass getDevice();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Device#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.intent.state.stateSpecification.Device#getName()
   * @see #getDevice()
   * @generated
   */
  EAttribute getDevice_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Device#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see net.certware.intent.state.stateSpecification.Device#getDesc()
   * @see #getDevice()
   * @generated
   */
  EAttribute getDevice_Desc();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.state.stateSpecification.Device#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see net.certware.intent.state.stateSpecification.Device#getInputs()
   * @see #getDevice()
   * @generated
   */
  EReference getDevice_Inputs();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.state.stateSpecification.Device#getOutputs <em>Outputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outputs</em>'.
   * @see net.certware.intent.state.stateSpecification.Device#getOutputs()
   * @see #getDevice()
   * @generated
   */
  EReference getDevice_Outputs();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.DeviceInput <em>Device Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device Input</em>'.
   * @see net.certware.intent.state.stateSpecification.DeviceInput
   * @generated
   */
  EClass getDeviceInput();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.DeviceInput#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.intent.state.stateSpecification.DeviceInput#getName()
   * @see #getDeviceInput()
   * @generated
   */
  EAttribute getDeviceInput_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.DeviceInput#getIo <em>Io</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Io</em>'.
   * @see net.certware.intent.state.stateSpecification.DeviceInput#getIo()
   * @see #getDeviceInput()
   * @generated
   */
  EReference getDeviceInput_Io();

  /**
   * Returns the meta object for the reference '{@link net.certware.intent.state.stateSpecification.DeviceInput#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see net.certware.intent.state.stateSpecification.DeviceInput#getSource()
   * @see #getDeviceInput()
   * @generated
   */
  EReference getDeviceInput_Source();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.DeviceOutput <em>Device Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device Output</em>'.
   * @see net.certware.intent.state.stateSpecification.DeviceOutput
   * @generated
   */
  EClass getDeviceOutput();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.DeviceOutput#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.intent.state.stateSpecification.DeviceOutput#getName()
   * @see #getDeviceOutput()
   * @generated
   */
  EAttribute getDeviceOutput_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.DeviceOutput#getIo <em>Io</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Io</em>'.
   * @see net.certware.intent.state.stateSpecification.DeviceOutput#getIo()
   * @see #getDeviceOutput()
   * @generated
   */
  EReference getDeviceOutput_Io();

  /**
   * Returns the meta object for the reference '{@link net.certware.intent.state.stateSpecification.DeviceOutput#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see net.certware.intent.state.stateSpecification.DeviceOutput#getTarget()
   * @see #getDeviceOutput()
   * @generated
   */
  EReference getDeviceOutput_Target();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.ComponentInput <em>Component Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Input</em>'.
   * @see net.certware.intent.state.stateSpecification.ComponentInput
   * @generated
   */
  EClass getComponentInput();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.ComponentInput#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.intent.state.stateSpecification.ComponentInput#getName()
   * @see #getComponentInput()
   * @generated
   */
  EAttribute getComponentInput_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.ComponentInput#getIo <em>Io</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Io</em>'.
   * @see net.certware.intent.state.stateSpecification.ComponentInput#getIo()
   * @see #getComponentInput()
   * @generated
   */
  EReference getComponentInput_Io();

  /**
   * Returns the meta object for the reference '{@link net.certware.intent.state.stateSpecification.ComponentInput#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see net.certware.intent.state.stateSpecification.ComponentInput#getSource()
   * @see #getComponentInput()
   * @generated
   */
  EReference getComponentInput_Source();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.ComponentOutput <em>Component Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Output</em>'.
   * @see net.certware.intent.state.stateSpecification.ComponentOutput
   * @generated
   */
  EClass getComponentOutput();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.ComponentOutput#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.intent.state.stateSpecification.ComponentOutput#getName()
   * @see #getComponentOutput()
   * @generated
   */
  EAttribute getComponentOutput_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.ComponentOutput#getIo <em>Io</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Io</em>'.
   * @see net.certware.intent.state.stateSpecification.ComponentOutput#getIo()
   * @see #getComponentOutput()
   * @generated
   */
  EReference getComponentOutput_Io();

  /**
   * Returns the meta object for the reference '{@link net.certware.intent.state.stateSpecification.ComponentOutput#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see net.certware.intent.state.stateSpecification.ComponentOutput#getTarget()
   * @see #getComponentOutput()
   * @generated
   */
  EReference getComponentOutput_Target();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.BigUnitValue <em>Big Unit Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Big Unit Value</em>'.
   * @see net.certware.intent.state.stateSpecification.BigUnitValue
   * @generated
   */
  EClass getBigUnitValue();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.BigUnitValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.certware.intent.state.stateSpecification.BigUnitValue#getValue()
   * @see #getBigUnitValue()
   * @generated
   */
  EAttribute getBigUnitValue_Value();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.BigUnitValue#getUnits <em>Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Units</em>'.
   * @see net.certware.intent.state.stateSpecification.BigUnitValue#getUnits()
   * @see #getBigUnitValue()
   * @generated
   */
  EAttribute getBigUnitValue_Units();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.StateValue <em>State Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Value</em>'.
   * @see net.certware.intent.state.stateSpecification.StateValue
   * @generated
   */
  EClass getStateValue();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.StateValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.certware.intent.state.stateSpecification.StateValue#getValue()
   * @see #getStateValue()
   * @generated
   */
  EAttribute getStateValue_Value();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.StateList <em>State List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State List</em>'.
   * @see net.certware.intent.state.stateSpecification.StateList
   * @generated
   */
  EClass getStateList();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.state.stateSpecification.StateList#getStateList <em>State List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State List</em>'.
   * @see net.certware.intent.state.stateSpecification.StateList#getStateList()
   * @see #getStateList()
   * @generated
   */
  EReference getStateList_StateList();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger</em>'.
   * @see net.certware.intent.state.stateSpecification.Trigger
   * @generated
   */
  EClass getTrigger();

  /**
   * Returns the meta object for the reference '{@link net.certware.intent.state.stateSpecification.Trigger#getMode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Mode</em>'.
   * @see net.certware.intent.state.stateSpecification.Trigger#getMode()
   * @see #getTrigger()
   * @generated
   */
  EReference getTrigger_Mode();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.Trigger#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see net.certware.intent.state.stateSpecification.Trigger#getList()
   * @see #getTrigger()
   * @generated
   */
  EReference getTrigger_List();

  /**
   * Returns the meta object for the reference '{@link net.certware.intent.state.stateSpecification.Trigger#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see net.certware.intent.state.stateSpecification.Trigger#getVariable()
   * @see #getTrigger()
   * @generated
   */
  EReference getTrigger_Variable();

  /**
   * Returns the meta object for the reference '{@link net.certware.intent.state.stateSpecification.Trigger#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see net.certware.intent.state.stateSpecification.Trigger#getValue()
   * @see #getTrigger()
   * @generated
   */
  EReference getTrigger_Value();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.TriggerTable <em>Trigger Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger Table</em>'.
   * @see net.certware.intent.state.stateSpecification.TriggerTable
   * @generated
   */
  EClass getTriggerTable();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.state.stateSpecification.TriggerTable#getRows <em>Rows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rows</em>'.
   * @see net.certware.intent.state.stateSpecification.TriggerTable#getRows()
   * @see #getTriggerTable()
   * @generated
   */
  EReference getTriggerTable_Rows();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.ValueRange <em>Value Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Range</em>'.
   * @see net.certware.intent.state.stateSpecification.ValueRange
   * @generated
   */
  EClass getValueRange();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.ValueRange#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower</em>'.
   * @see net.certware.intent.state.stateSpecification.ValueRange#getLower()
   * @see #getValueRange()
   * @generated
   */
  EAttribute getValueRange_Lower();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.ValueRange#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper</em>'.
   * @see net.certware.intent.state.stateSpecification.ValueRange#getUpper()
   * @see #getValueRange()
   * @generated
   */
  EAttribute getValueRange_Upper();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.ValueRange#getRangeType <em>Range Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range Type</em>'.
   * @see net.certware.intent.state.stateSpecification.ValueRange#getRangeType()
   * @see #getValueRange()
   * @generated
   */
  EAttribute getValueRange_RangeType();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.ValueRange#getRangeUnits <em>Range Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range Units</em>'.
   * @see net.certware.intent.state.stateSpecification.ValueRange#getRangeUnits()
   * @see #getValueRange()
   * @generated
   */
  EAttribute getValueRange_RangeUnits();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.ValueList <em>Value List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value List</em>'.
   * @see net.certware.intent.state.stateSpecification.ValueList
   * @generated
   */
  EClass getValueList();

  /**
   * Returns the meta object for the attribute list '{@link net.certware.intent.state.stateSpecification.ValueList#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see net.certware.intent.state.stateSpecification.ValueList#getValues()
   * @see #getValueList()
   * @generated
   */
  EAttribute getValueList_Values();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output</em>'.
   * @see net.certware.intent.state.stateSpecification.Output
   * @generated
   */
  EClass getOutput();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.Output#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see net.certware.intent.state.stateSpecification.Output#getRange()
   * @see #getOutput()
   * @generated
   */
  EReference getOutput_Range();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.Output#getValueList <em>Value List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value List</em>'.
   * @see net.certware.intent.state.stateSpecification.Output#getValueList()
   * @see #getOutput()
   * @generated
   */
  EReference getOutput_ValueList();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.Output#getRate <em>Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rate</em>'.
   * @see net.certware.intent.state.stateSpecification.Output#getRate()
   * @see #getOutput()
   * @generated
   */
  EReference getOutput_Rate();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.Output#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delay</em>'.
   * @see net.certware.intent.state.stateSpecification.Output#getDelay()
   * @see #getOutput()
   * @generated
   */
  EReference getOutput_Delay();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.Output#getDeadline <em>Deadline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Deadline</em>'.
   * @see net.certware.intent.state.stateSpecification.Output#getDeadline()
   * @see #getOutput()
   * @generated
   */
  EReference getOutput_Deadline();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Output#getCompletionHandling <em>Completion Handling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Completion Handling</em>'.
   * @see net.certware.intent.state.stateSpecification.Output#getCompletionHandling()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_CompletionHandling();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Output#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variables</em>'.
   * @see net.certware.intent.state.stateSpecification.Output#getVariables()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_Variables();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Output#getRelationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relationship</em>'.
   * @see net.certware.intent.state.stateSpecification.Output#getRelationship()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_Relationship();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.Output#getMinResponse <em>Min Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min Response</em>'.
   * @see net.certware.intent.state.stateSpecification.Output#getMinResponse()
   * @see #getOutput()
   * @generated
   */
  EReference getOutput_MinResponse();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.Output#getMaxResponse <em>Max Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max Response</em>'.
   * @see net.certware.intent.state.stateSpecification.Output#getMaxResponse()
   * @see #getOutput()
   * @generated
   */
  EReference getOutput_MaxResponse();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Output#getFeebackHandling <em>Feeback Handling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feeback Handling</em>'.
   * @see net.certware.intent.state.stateSpecification.Output#getFeebackHandling()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_FeebackHandling();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Output#getReversed <em>Reversed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reversed</em>'.
   * @see net.certware.intent.state.stateSpecification.Output#getReversed()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_Reversed();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Output#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>References</em>'.
   * @see net.certware.intent.state.stateSpecification.Output#getReferences()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_References();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Output#getComments <em>Comments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comments</em>'.
   * @see net.certware.intent.state.stateSpecification.Output#getComments()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_Comments();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Output#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Contents</em>'.
   * @see net.certware.intent.state.stateSpecification.Output#getContents()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_Contents();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.Output#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table</em>'.
   * @see net.certware.intent.state.stateSpecification.Output#getTable()
   * @see #getOutput()
   * @generated
   */
  EReference getOutput_Table();

  /**
   * Returns the meta object for class '{@link net.certware.intent.state.stateSpecification.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see net.certware.intent.state.stateSpecification.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.Input#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see net.certware.intent.state.stateSpecification.Input#getRange()
   * @see #getInput()
   * @generated
   */
  EReference getInput_Range();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.Input#getValueList <em>Value List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value List</em>'.
   * @see net.certware.intent.state.stateSpecification.Input#getValueList()
   * @see #getInput()
   * @generated
   */
  EReference getInput_ValueList();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Input#getValueHandling <em>Value Handling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Handling</em>'.
   * @see net.certware.intent.state.stateSpecification.Input#getValueHandling()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_ValueHandling();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.Input#getGranularity <em>Granularity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Granularity</em>'.
   * @see net.certware.intent.state.stateSpecification.Input#getGranularity()
   * @see #getInput()
   * @generated
   */
  EReference getInput_Granularity();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.Input#getArrivalRateAvg <em>Arrival Rate Avg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arrival Rate Avg</em>'.
   * @see net.certware.intent.state.stateSpecification.Input#getArrivalRateAvg()
   * @see #getInput()
   * @generated
   */
  EReference getInput_ArrivalRateAvg();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.Input#getArrivalRateMinimum <em>Arrival Rate Minimum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arrival Rate Minimum</em>'.
   * @see net.certware.intent.state.stateSpecification.Input#getArrivalRateMinimum()
   * @see #getInput()
   * @generated
   */
  EReference getInput_ArrivalRateMinimum();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.Input#getArrivalRateMaximum <em>Arrival Rate Maximum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arrival Rate Maximum</em>'.
   * @see net.certware.intent.state.stateSpecification.Input#getArrivalRateMaximum()
   * @see #getInput()
   * @generated
   */
  EReference getInput_ArrivalRateMaximum();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.Input#getObsolescence <em>Obsolescence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Obsolescence</em>'.
   * @see net.certware.intent.state.stateSpecification.Input#getObsolescence()
   * @see #getInput()
   * @generated
   */
  EReference getInput_Obsolescence();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Input#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>References</em>'.
   * @see net.certware.intent.state.stateSpecification.Input#getReferences()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_References();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Input#getAppearsIn <em>Appears In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Appears In</em>'.
   * @see net.certware.intent.state.stateSpecification.Input#getAppearsIn()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_AppearsIn();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Input#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.intent.state.stateSpecification.Input#getDescription()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_Description();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.state.stateSpecification.Input#getComments <em>Comments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comments</em>'.
   * @see net.certware.intent.state.stateSpecification.Input#getComments()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_Comments();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.state.stateSpecification.Input#getStructure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structure</em>'.
   * @see net.certware.intent.state.stateSpecification.Input#getStructure()
   * @see #getInput()
   * @generated
   */
  EReference getInput_Structure();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  StateSpecificationFactory getStateSpecificationFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.SpecificationImpl <em>Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.SpecificationImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getSpecification()
     * @generated
     */
    EClass SPECIFICATION = eINSTANCE.getSpecification();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIFICATION__NAME = eINSTANCE.getSpecification_Name();

    /**
     * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFICATION__DEVICES = eINSTANCE.getSpecification_Devices();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFICATION__COMPONENTS = eINSTANCE.getSpecification_Components();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.ModeElementTypeImpl <em>Mode Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.ModeElementTypeImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getModeElementType()
     * @generated
     */
    EClass MODE_ELEMENT_TYPE = eINSTANCE.getModeElementType();

    /**
     * The meta object literal for the '<em><b>Element Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODE_ELEMENT_TYPE__ELEMENT_TYPE = eINSTANCE.getModeElementType_ElementType();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.ComponentImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getComponent()
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
     * The meta object literal for the '<em><b>Modes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__MODES = eINSTANCE.getComponent_Modes();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__STATES = eINSTANCE.getComponent_States();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__INPUTS = eINSTANCE.getComponent_Inputs();

    /**
     * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__OUTPUTS = eINSTANCE.getComponent_Outputs();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.ModeElementImpl <em>Mode Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.ModeElementImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getModeElement()
     * @generated
     */
    EClass MODE_ELEMENT = eINSTANCE.getModeElement();

    /**
     * The meta object literal for the '<em><b>Inferred</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODE_ELEMENT__INFERRED = eINSTANCE.getModeElement_Inferred();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODE_ELEMENT__TYPE = eINSTANCE.getModeElement_Type();

    /**
     * The meta object literal for the '<em><b>Modes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODE_ELEMENT__MODES = eINSTANCE.getModeElement_Modes();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.StateElementImpl <em>State Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.StateElementImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getStateElement()
     * @generated
     */
    EClass STATE_ELEMENT = eINSTANCE.getStateElement();

    /**
     * The meta object literal for the '<em><b>Inferred</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_ELEMENT__INFERRED = eINSTANCE.getStateElement_Inferred();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_ELEMENT__STATES = eINSTANCE.getStateElement_States();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.StateVariableImpl <em>State Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.StateVariableImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getStateVariable()
     * @generated
     */
    EClass STATE_VARIABLE = eINSTANCE.getStateVariable();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_VARIABLE__DESC = eINSTANCE.getStateVariable_Desc();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_VARIABLE__STATE = eINSTANCE.getStateVariable_State();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.StateImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__INITIAL = eINSTANCE.getState_Initial();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__VALUE = eINSTANCE.getState_Value();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.ModeVariableImpl <em>Mode Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.ModeVariableImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getModeVariable()
     * @generated
     */
    EClass MODE_VARIABLE = eINSTANCE.getModeVariable();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODE_VARIABLE__DESC = eINSTANCE.getModeVariable_Desc();

    /**
     * The meta object literal for the '<em><b>Modes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODE_VARIABLE__MODES = eINSTANCE.getModeVariable_Modes();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.ModeImpl <em>Mode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.ModeImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getMode()
     * @generated
     */
    EClass MODE = eINSTANCE.getMode();

    /**
     * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODE__INITIAL = eINSTANCE.getMode_Initial();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODE__VALUE = eINSTANCE.getMode_Value();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.DeviceImpl <em>Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.DeviceImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getDevice()
     * @generated
     */
    EClass DEVICE = eINSTANCE.getDevice();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE__DESC = eINSTANCE.getDevice_Desc();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE__INPUTS = eINSTANCE.getDevice_Inputs();

    /**
     * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE__OUTPUTS = eINSTANCE.getDevice_Outputs();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.DeviceInputImpl <em>Device Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.DeviceInputImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getDeviceInput()
     * @generated
     */
    EClass DEVICE_INPUT = eINSTANCE.getDeviceInput();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_INPUT__NAME = eINSTANCE.getDeviceInput_Name();

    /**
     * The meta object literal for the '<em><b>Io</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE_INPUT__IO = eINSTANCE.getDeviceInput_Io();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE_INPUT__SOURCE = eINSTANCE.getDeviceInput_Source();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.DeviceOutputImpl <em>Device Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.DeviceOutputImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getDeviceOutput()
     * @generated
     */
    EClass DEVICE_OUTPUT = eINSTANCE.getDeviceOutput();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_OUTPUT__NAME = eINSTANCE.getDeviceOutput_Name();

    /**
     * The meta object literal for the '<em><b>Io</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE_OUTPUT__IO = eINSTANCE.getDeviceOutput_Io();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE_OUTPUT__TARGET = eINSTANCE.getDeviceOutput_Target();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.ComponentInputImpl <em>Component Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.ComponentInputImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getComponentInput()
     * @generated
     */
    EClass COMPONENT_INPUT = eINSTANCE.getComponentInput();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_INPUT__NAME = eINSTANCE.getComponentInput_Name();

    /**
     * The meta object literal for the '<em><b>Io</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_INPUT__IO = eINSTANCE.getComponentInput_Io();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_INPUT__SOURCE = eINSTANCE.getComponentInput_Source();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.ComponentOutputImpl <em>Component Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.ComponentOutputImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getComponentOutput()
     * @generated
     */
    EClass COMPONENT_OUTPUT = eINSTANCE.getComponentOutput();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_OUTPUT__NAME = eINSTANCE.getComponentOutput_Name();

    /**
     * The meta object literal for the '<em><b>Io</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_OUTPUT__IO = eINSTANCE.getComponentOutput_Io();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_OUTPUT__TARGET = eINSTANCE.getComponentOutput_Target();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.BigUnitValueImpl <em>Big Unit Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.BigUnitValueImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getBigUnitValue()
     * @generated
     */
    EClass BIG_UNIT_VALUE = eINSTANCE.getBigUnitValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIG_UNIT_VALUE__VALUE = eINSTANCE.getBigUnitValue_Value();

    /**
     * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIG_UNIT_VALUE__UNITS = eINSTANCE.getBigUnitValue_Units();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.StateValueImpl <em>State Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.StateValueImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getStateValue()
     * @generated
     */
    EClass STATE_VALUE = eINSTANCE.getStateValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_VALUE__VALUE = eINSTANCE.getStateValue_Value();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.StateListImpl <em>State List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.StateListImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getStateList()
     * @generated
     */
    EClass STATE_LIST = eINSTANCE.getStateList();

    /**
     * The meta object literal for the '<em><b>State List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_LIST__STATE_LIST = eINSTANCE.getStateList_StateList();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.TriggerImpl <em>Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.TriggerImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getTrigger()
     * @generated
     */
    EClass TRIGGER = eINSTANCE.getTrigger();

    /**
     * The meta object literal for the '<em><b>Mode</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER__MODE = eINSTANCE.getTrigger_Mode();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER__LIST = eINSTANCE.getTrigger_List();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER__VARIABLE = eINSTANCE.getTrigger_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER__VALUE = eINSTANCE.getTrigger_Value();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.TriggerTableImpl <em>Trigger Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.TriggerTableImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getTriggerTable()
     * @generated
     */
    EClass TRIGGER_TABLE = eINSTANCE.getTriggerTable();

    /**
     * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER_TABLE__ROWS = eINSTANCE.getTriggerTable_Rows();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.ValueRangeImpl <em>Value Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.ValueRangeImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getValueRange()
     * @generated
     */
    EClass VALUE_RANGE = eINSTANCE.getValueRange();

    /**
     * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_RANGE__LOWER = eINSTANCE.getValueRange_Lower();

    /**
     * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_RANGE__UPPER = eINSTANCE.getValueRange_Upper();

    /**
     * The meta object literal for the '<em><b>Range Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_RANGE__RANGE_TYPE = eINSTANCE.getValueRange_RangeType();

    /**
     * The meta object literal for the '<em><b>Range Units</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_RANGE__RANGE_UNITS = eINSTANCE.getValueRange_RangeUnits();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.ValueListImpl <em>Value List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.ValueListImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getValueList()
     * @generated
     */
    EClass VALUE_LIST = eINSTANCE.getValueList();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_LIST__VALUES = eINSTANCE.getValueList_Values();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.OutputImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getOutput()
     * @generated
     */
    EClass OUTPUT = eINSTANCE.getOutput();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT__RANGE = eINSTANCE.getOutput_Range();

    /**
     * The meta object literal for the '<em><b>Value List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT__VALUE_LIST = eINSTANCE.getOutput_ValueList();

    /**
     * The meta object literal for the '<em><b>Rate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT__RATE = eINSTANCE.getOutput_Rate();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT__DELAY = eINSTANCE.getOutput_Delay();

    /**
     * The meta object literal for the '<em><b>Deadline</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT__DEADLINE = eINSTANCE.getOutput_Deadline();

    /**
     * The meta object literal for the '<em><b>Completion Handling</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__COMPLETION_HANDLING = eINSTANCE.getOutput_CompletionHandling();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__VARIABLES = eINSTANCE.getOutput_Variables();

    /**
     * The meta object literal for the '<em><b>Relationship</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__RELATIONSHIP = eINSTANCE.getOutput_Relationship();

    /**
     * The meta object literal for the '<em><b>Min Response</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT__MIN_RESPONSE = eINSTANCE.getOutput_MinResponse();

    /**
     * The meta object literal for the '<em><b>Max Response</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT__MAX_RESPONSE = eINSTANCE.getOutput_MaxResponse();

    /**
     * The meta object literal for the '<em><b>Feeback Handling</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__FEEBACK_HANDLING = eINSTANCE.getOutput_FeebackHandling();

    /**
     * The meta object literal for the '<em><b>Reversed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__REVERSED = eINSTANCE.getOutput_Reversed();

    /**
     * The meta object literal for the '<em><b>References</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__REFERENCES = eINSTANCE.getOutput_References();

    /**
     * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__COMMENTS = eINSTANCE.getOutput_Comments();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__CONTENTS = eINSTANCE.getOutput_Contents();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT__TABLE = eINSTANCE.getOutput_Table();

    /**
     * The meta object literal for the '{@link net.certware.intent.state.stateSpecification.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.state.stateSpecification.impl.InputImpl
     * @see net.certware.intent.state.stateSpecification.impl.StateSpecificationPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__RANGE = eINSTANCE.getInput_Range();

    /**
     * The meta object literal for the '<em><b>Value List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__VALUE_LIST = eINSTANCE.getInput_ValueList();

    /**
     * The meta object literal for the '<em><b>Value Handling</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__VALUE_HANDLING = eINSTANCE.getInput_ValueHandling();

    /**
     * The meta object literal for the '<em><b>Granularity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__GRANULARITY = eINSTANCE.getInput_Granularity();

    /**
     * The meta object literal for the '<em><b>Arrival Rate Avg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__ARRIVAL_RATE_AVG = eINSTANCE.getInput_ArrivalRateAvg();

    /**
     * The meta object literal for the '<em><b>Arrival Rate Minimum</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__ARRIVAL_RATE_MINIMUM = eINSTANCE.getInput_ArrivalRateMinimum();

    /**
     * The meta object literal for the '<em><b>Arrival Rate Maximum</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__ARRIVAL_RATE_MAXIMUM = eINSTANCE.getInput_ArrivalRateMaximum();

    /**
     * The meta object literal for the '<em><b>Obsolescence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__OBSOLESCENCE = eINSTANCE.getInput_Obsolescence();

    /**
     * The meta object literal for the '<em><b>References</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__REFERENCES = eINSTANCE.getInput_References();

    /**
     * The meta object literal for the '<em><b>Appears In</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__APPEARS_IN = eINSTANCE.getInput_AppearsIn();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__DESCRIPTION = eINSTANCE.getInput_Description();

    /**
     * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__COMMENTS = eINSTANCE.getInput_Comments();

    /**
     * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__STRUCTURE = eINSTANCE.getInput_Structure();

  }

} //StateSpecificationPackage
