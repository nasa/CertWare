/**
 */
package net.certware.intent.state.stateSpecification.impl;

import net.certware.intent.state.stateSpecification.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateSpecificationFactoryImpl extends EFactoryImpl implements StateSpecificationFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StateSpecificationFactory init()
  {
    try
    {
      StateSpecificationFactory theStateSpecificationFactory = (StateSpecificationFactory)EPackage.Registry.INSTANCE.getEFactory(StateSpecificationPackage.eNS_URI);
      if (theStateSpecificationFactory != null)
      {
        return theStateSpecificationFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new StateSpecificationFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateSpecificationFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case StateSpecificationPackage.SPECIFICATION: return createSpecification();
      case StateSpecificationPackage.MODE_ELEMENT_TYPE: return createModeElementType();
      case StateSpecificationPackage.COMPONENT: return createComponent();
      case StateSpecificationPackage.MODE_ELEMENT: return createModeElement();
      case StateSpecificationPackage.STATE_ELEMENT: return createStateElement();
      case StateSpecificationPackage.STATE_VARIABLE: return createStateVariable();
      case StateSpecificationPackage.STATE: return createState();
      case StateSpecificationPackage.MODE_VARIABLE: return createModeVariable();
      case StateSpecificationPackage.MODE: return createMode();
      case StateSpecificationPackage.DEVICE: return createDevice();
      case StateSpecificationPackage.DEVICE_INPUT: return createDeviceInput();
      case StateSpecificationPackage.DEVICE_OUTPUT: return createDeviceOutput();
      case StateSpecificationPackage.COMPONENT_INPUT: return createComponentInput();
      case StateSpecificationPackage.COMPONENT_OUTPUT: return createComponentOutput();
      case StateSpecificationPackage.BIG_UNIT_VALUE: return createBigUnitValue();
      case StateSpecificationPackage.STATE_VALUE: return createStateValue();
      case StateSpecificationPackage.STATE_LIST: return createStateList();
      case StateSpecificationPackage.TRIGGER: return createTrigger();
      case StateSpecificationPackage.TRIGGER_TABLE: return createTriggerTable();
      case StateSpecificationPackage.VALUE_RANGE: return createValueRange();
      case StateSpecificationPackage.VALUE_LIST: return createValueList();
      case StateSpecificationPackage.OUTPUT: return createOutput();
      case StateSpecificationPackage.INPUT: return createInput();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Specification createSpecification()
  {
    SpecificationImpl specification = new SpecificationImpl();
    return specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModeElementType createModeElementType()
  {
    ModeElementTypeImpl modeElementType = new ModeElementTypeImpl();
    return modeElementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModeElement createModeElement()
  {
    ModeElementImpl modeElement = new ModeElementImpl();
    return modeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateElement createStateElement()
  {
    StateElementImpl stateElement = new StateElementImpl();
    return stateElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateVariable createStateVariable()
  {
    StateVariableImpl stateVariable = new StateVariableImpl();
    return stateVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModeVariable createModeVariable()
  {
    ModeVariableImpl modeVariable = new ModeVariableImpl();
    return modeVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mode createMode()
  {
    ModeImpl mode = new ModeImpl();
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Device createDevice()
  {
    DeviceImpl device = new DeviceImpl();
    return device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceInput createDeviceInput()
  {
    DeviceInputImpl deviceInput = new DeviceInputImpl();
    return deviceInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceOutput createDeviceOutput()
  {
    DeviceOutputImpl deviceOutput = new DeviceOutputImpl();
    return deviceOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentInput createComponentInput()
  {
    ComponentInputImpl componentInput = new ComponentInputImpl();
    return componentInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentOutput createComponentOutput()
  {
    ComponentOutputImpl componentOutput = new ComponentOutputImpl();
    return componentOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigUnitValue createBigUnitValue()
  {
    BigUnitValueImpl bigUnitValue = new BigUnitValueImpl();
    return bigUnitValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateValue createStateValue()
  {
    StateValueImpl stateValue = new StateValueImpl();
    return stateValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateList createStateList()
  {
    StateListImpl stateList = new StateListImpl();
    return stateList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger createTrigger()
  {
    TriggerImpl trigger = new TriggerImpl();
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriggerTable createTriggerTable()
  {
    TriggerTableImpl triggerTable = new TriggerTableImpl();
    return triggerTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueRange createValueRange()
  {
    ValueRangeImpl valueRange = new ValueRangeImpl();
    return valueRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueList createValueList()
  {
    ValueListImpl valueList = new ValueListImpl();
    return valueList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateSpecificationPackage getStateSpecificationPackage()
  {
    return (StateSpecificationPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static StateSpecificationPackage getPackage()
  {
    return StateSpecificationPackage.eINSTANCE;
  }

} //StateSpecificationFactoryImpl
