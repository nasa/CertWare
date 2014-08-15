/**
 */
package net.certware.intent.state.stateSpecification.impl;

import net.certware.intent.state.stateSpecification.BigUnitValue;
import net.certware.intent.state.stateSpecification.Component;
import net.certware.intent.state.stateSpecification.ComponentInput;
import net.certware.intent.state.stateSpecification.ComponentOutput;
import net.certware.intent.state.stateSpecification.Device;
import net.certware.intent.state.stateSpecification.DeviceInput;
import net.certware.intent.state.stateSpecification.DeviceOutput;
import net.certware.intent.state.stateSpecification.Input;
import net.certware.intent.state.stateSpecification.Mode;
import net.certware.intent.state.stateSpecification.ModeElement;
import net.certware.intent.state.stateSpecification.ModeElementType;
import net.certware.intent.state.stateSpecification.ModeVariable;
import net.certware.intent.state.stateSpecification.Output;
import net.certware.intent.state.stateSpecification.Specification;
import net.certware.intent.state.stateSpecification.State;
import net.certware.intent.state.stateSpecification.StateElement;
import net.certware.intent.state.stateSpecification.StateList;
import net.certware.intent.state.stateSpecification.StateSpecificationFactory;
import net.certware.intent.state.stateSpecification.StateSpecificationPackage;
import net.certware.intent.state.stateSpecification.StateValue;
import net.certware.intent.state.stateSpecification.StateVariable;
import net.certware.intent.state.stateSpecification.Trigger;
import net.certware.intent.state.stateSpecification.TriggerTable;
import net.certware.intent.state.stateSpecification.ValueList;
import net.certware.intent.state.stateSpecification.ValueRange;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateSpecificationPackageImpl extends EPackageImpl implements StateSpecificationPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modeElementTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modeElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modeVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviceInputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviceOutputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentInputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentOutputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bigUnitValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass triggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass triggerTableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private StateSpecificationPackageImpl()
  {
    super(eNS_URI, StateSpecificationFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link StateSpecificationPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static StateSpecificationPackage init()
  {
    if (isInited) return (StateSpecificationPackage)EPackage.Registry.INSTANCE.getEPackage(StateSpecificationPackage.eNS_URI);

    // Obtain or create and register package
    StateSpecificationPackageImpl theStateSpecificationPackage = (StateSpecificationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StateSpecificationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StateSpecificationPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theStateSpecificationPackage.createPackageContents();

    // Initialize created meta-data
    theStateSpecificationPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theStateSpecificationPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(StateSpecificationPackage.eNS_URI, theStateSpecificationPackage);
    return theStateSpecificationPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpecification()
  {
    return specificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpecification_Name()
  {
    return (EAttribute)specificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecification_Devices()
  {
    return (EReference)specificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecification_Components()
  {
    return (EReference)specificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModeElementType()
  {
    return modeElementTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModeElementType_ElementType()
  {
    return (EAttribute)modeElementTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponent()
  {
    return componentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_Name()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Modes()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_States()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Inputs()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Outputs()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModeElement()
  {
    return modeElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModeElement_Inferred()
  {
    return (EAttribute)modeElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModeElement_Type()
  {
    return (EReference)modeElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModeElement_Modes()
  {
    return (EReference)modeElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateElement()
  {
    return stateElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateElement_Inferred()
  {
    return (EAttribute)stateElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateElement_States()
  {
    return (EReference)stateElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateVariable()
  {
    return stateVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateVariable_Desc()
  {
    return (EAttribute)stateVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateVariable_State()
  {
    return (EReference)stateVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getState()
  {
    return stateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_Initial()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_Value()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModeVariable()
  {
    return modeVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModeVariable_Desc()
  {
    return (EAttribute)modeVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModeVariable_Modes()
  {
    return (EReference)modeVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMode()
  {
    return modeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMode_Initial()
  {
    return (EAttribute)modeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMode_Value()
  {
    return (EAttribute)modeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDevice()
  {
    return deviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDevice_Name()
  {
    return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDevice_Desc()
  {
    return (EAttribute)deviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDevice_Inputs()
  {
    return (EReference)deviceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDevice_Outputs()
  {
    return (EReference)deviceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeviceInput()
  {
    return deviceInputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceInput_Name()
  {
    return (EAttribute)deviceInputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeviceInput_Io()
  {
    return (EReference)deviceInputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeviceInput_Source()
  {
    return (EReference)deviceInputEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeviceOutput()
  {
    return deviceOutputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceOutput_Name()
  {
    return (EAttribute)deviceOutputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeviceOutput_Io()
  {
    return (EReference)deviceOutputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeviceOutput_Target()
  {
    return (EReference)deviceOutputEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentInput()
  {
    return componentInputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentInput_Name()
  {
    return (EAttribute)componentInputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentInput_Io()
  {
    return (EReference)componentInputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentInput_Source()
  {
    return (EReference)componentInputEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentOutput()
  {
    return componentOutputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentOutput_Name()
  {
    return (EAttribute)componentOutputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentOutput_Io()
  {
    return (EReference)componentOutputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentOutput_Target()
  {
    return (EReference)componentOutputEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBigUnitValue()
  {
    return bigUnitValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBigUnitValue_Value()
  {
    return (EAttribute)bigUnitValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBigUnitValue_Units()
  {
    return (EAttribute)bigUnitValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateValue()
  {
    return stateValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateValue_Value()
  {
    return (EAttribute)stateValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateList()
  {
    return stateListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateList_StateList()
  {
    return (EReference)stateListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrigger()
  {
    return triggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrigger_Mode()
  {
    return (EReference)triggerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrigger_List()
  {
    return (EReference)triggerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrigger_Variable()
  {
    return (EReference)triggerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrigger_Value()
  {
    return (EReference)triggerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTriggerTable()
  {
    return triggerTableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTriggerTable_Rows()
  {
    return (EReference)triggerTableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueRange()
  {
    return valueRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueRange_Lower()
  {
    return (EAttribute)valueRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueRange_Upper()
  {
    return (EAttribute)valueRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueRange_RangeType()
  {
    return (EAttribute)valueRangeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueRange_RangeUnits()
  {
    return (EAttribute)valueRangeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueList()
  {
    return valueListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueList_Values()
  {
    return (EAttribute)valueListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutput()
  {
    return outputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutput_Range()
  {
    return (EReference)outputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutput_ValueList()
  {
    return (EReference)outputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutput_Rate()
  {
    return (EReference)outputEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutput_Delay()
  {
    return (EReference)outputEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutput_Deadline()
  {
    return (EReference)outputEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutput_CompletionHandling()
  {
    return (EAttribute)outputEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutput_Variables()
  {
    return (EAttribute)outputEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutput_Relationship()
  {
    return (EAttribute)outputEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutput_MinResponse()
  {
    return (EReference)outputEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutput_MaxResponse()
  {
    return (EReference)outputEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutput_FeebackHandling()
  {
    return (EAttribute)outputEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutput_Reversed()
  {
    return (EAttribute)outputEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutput_References()
  {
    return (EAttribute)outputEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutput_Comments()
  {
    return (EAttribute)outputEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutput_Contents()
  {
    return (EAttribute)outputEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutput_Table()
  {
    return (EReference)outputEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInput()
  {
    return inputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_Range()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_ValueList()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInput_ValueHandling()
  {
    return (EAttribute)inputEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_Granularity()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_ArrivalRateAvg()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_ArrivalRateMinimum()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_ArrivalRateMaximum()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_Obsolescence()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInput_References()
  {
    return (EAttribute)inputEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInput_AppearsIn()
  {
    return (EAttribute)inputEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInput_Description()
  {
    return (EAttribute)inputEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInput_Comments()
  {
    return (EAttribute)inputEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_Structure()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateSpecificationFactory getStateSpecificationFactory()
  {
    return (StateSpecificationFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    specificationEClass = createEClass(SPECIFICATION);
    createEAttribute(specificationEClass, SPECIFICATION__NAME);
    createEReference(specificationEClass, SPECIFICATION__DEVICES);
    createEReference(specificationEClass, SPECIFICATION__COMPONENTS);

    modeElementTypeEClass = createEClass(MODE_ELEMENT_TYPE);
    createEAttribute(modeElementTypeEClass, MODE_ELEMENT_TYPE__ELEMENT_TYPE);

    componentEClass = createEClass(COMPONENT);
    createEAttribute(componentEClass, COMPONENT__NAME);
    createEReference(componentEClass, COMPONENT__MODES);
    createEReference(componentEClass, COMPONENT__STATES);
    createEReference(componentEClass, COMPONENT__INPUTS);
    createEReference(componentEClass, COMPONENT__OUTPUTS);

    modeElementEClass = createEClass(MODE_ELEMENT);
    createEAttribute(modeElementEClass, MODE_ELEMENT__INFERRED);
    createEReference(modeElementEClass, MODE_ELEMENT__TYPE);
    createEReference(modeElementEClass, MODE_ELEMENT__MODES);

    stateElementEClass = createEClass(STATE_ELEMENT);
    createEAttribute(stateElementEClass, STATE_ELEMENT__INFERRED);
    createEReference(stateElementEClass, STATE_ELEMENT__STATES);

    stateVariableEClass = createEClass(STATE_VARIABLE);
    createEAttribute(stateVariableEClass, STATE_VARIABLE__DESC);
    createEReference(stateVariableEClass, STATE_VARIABLE__STATE);

    stateEClass = createEClass(STATE);
    createEAttribute(stateEClass, STATE__INITIAL);
    createEAttribute(stateEClass, STATE__VALUE);

    modeVariableEClass = createEClass(MODE_VARIABLE);
    createEAttribute(modeVariableEClass, MODE_VARIABLE__DESC);
    createEReference(modeVariableEClass, MODE_VARIABLE__MODES);

    modeEClass = createEClass(MODE);
    createEAttribute(modeEClass, MODE__INITIAL);
    createEAttribute(modeEClass, MODE__VALUE);

    deviceEClass = createEClass(DEVICE);
    createEAttribute(deviceEClass, DEVICE__NAME);
    createEAttribute(deviceEClass, DEVICE__DESC);
    createEReference(deviceEClass, DEVICE__INPUTS);
    createEReference(deviceEClass, DEVICE__OUTPUTS);

    deviceInputEClass = createEClass(DEVICE_INPUT);
    createEAttribute(deviceInputEClass, DEVICE_INPUT__NAME);
    createEReference(deviceInputEClass, DEVICE_INPUT__IO);
    createEReference(deviceInputEClass, DEVICE_INPUT__SOURCE);

    deviceOutputEClass = createEClass(DEVICE_OUTPUT);
    createEAttribute(deviceOutputEClass, DEVICE_OUTPUT__NAME);
    createEReference(deviceOutputEClass, DEVICE_OUTPUT__IO);
    createEReference(deviceOutputEClass, DEVICE_OUTPUT__TARGET);

    componentInputEClass = createEClass(COMPONENT_INPUT);
    createEAttribute(componentInputEClass, COMPONENT_INPUT__NAME);
    createEReference(componentInputEClass, COMPONENT_INPUT__IO);
    createEReference(componentInputEClass, COMPONENT_INPUT__SOURCE);

    componentOutputEClass = createEClass(COMPONENT_OUTPUT);
    createEAttribute(componentOutputEClass, COMPONENT_OUTPUT__NAME);
    createEReference(componentOutputEClass, COMPONENT_OUTPUT__IO);
    createEReference(componentOutputEClass, COMPONENT_OUTPUT__TARGET);

    bigUnitValueEClass = createEClass(BIG_UNIT_VALUE);
    createEAttribute(bigUnitValueEClass, BIG_UNIT_VALUE__VALUE);
    createEAttribute(bigUnitValueEClass, BIG_UNIT_VALUE__UNITS);

    stateValueEClass = createEClass(STATE_VALUE);
    createEAttribute(stateValueEClass, STATE_VALUE__VALUE);

    stateListEClass = createEClass(STATE_LIST);
    createEReference(stateListEClass, STATE_LIST__STATE_LIST);

    triggerEClass = createEClass(TRIGGER);
    createEReference(triggerEClass, TRIGGER__MODE);
    createEReference(triggerEClass, TRIGGER__LIST);
    createEReference(triggerEClass, TRIGGER__VARIABLE);
    createEReference(triggerEClass, TRIGGER__VALUE);

    triggerTableEClass = createEClass(TRIGGER_TABLE);
    createEReference(triggerTableEClass, TRIGGER_TABLE__ROWS);

    valueRangeEClass = createEClass(VALUE_RANGE);
    createEAttribute(valueRangeEClass, VALUE_RANGE__LOWER);
    createEAttribute(valueRangeEClass, VALUE_RANGE__UPPER);
    createEAttribute(valueRangeEClass, VALUE_RANGE__RANGE_TYPE);
    createEAttribute(valueRangeEClass, VALUE_RANGE__RANGE_UNITS);

    valueListEClass = createEClass(VALUE_LIST);
    createEAttribute(valueListEClass, VALUE_LIST__VALUES);

    outputEClass = createEClass(OUTPUT);
    createEReference(outputEClass, OUTPUT__RANGE);
    createEReference(outputEClass, OUTPUT__VALUE_LIST);
    createEReference(outputEClass, OUTPUT__RATE);
    createEReference(outputEClass, OUTPUT__DELAY);
    createEReference(outputEClass, OUTPUT__DEADLINE);
    createEAttribute(outputEClass, OUTPUT__COMPLETION_HANDLING);
    createEAttribute(outputEClass, OUTPUT__VARIABLES);
    createEAttribute(outputEClass, OUTPUT__RELATIONSHIP);
    createEReference(outputEClass, OUTPUT__MIN_RESPONSE);
    createEReference(outputEClass, OUTPUT__MAX_RESPONSE);
    createEAttribute(outputEClass, OUTPUT__FEEBACK_HANDLING);
    createEAttribute(outputEClass, OUTPUT__REVERSED);
    createEAttribute(outputEClass, OUTPUT__REFERENCES);
    createEAttribute(outputEClass, OUTPUT__COMMENTS);
    createEAttribute(outputEClass, OUTPUT__CONTENTS);
    createEReference(outputEClass, OUTPUT__TABLE);

    inputEClass = createEClass(INPUT);
    createEReference(inputEClass, INPUT__RANGE);
    createEReference(inputEClass, INPUT__VALUE_LIST);
    createEAttribute(inputEClass, INPUT__VALUE_HANDLING);
    createEReference(inputEClass, INPUT__GRANULARITY);
    createEReference(inputEClass, INPUT__ARRIVAL_RATE_AVG);
    createEReference(inputEClass, INPUT__ARRIVAL_RATE_MINIMUM);
    createEReference(inputEClass, INPUT__ARRIVAL_RATE_MAXIMUM);
    createEReference(inputEClass, INPUT__OBSOLESCENCE);
    createEAttribute(inputEClass, INPUT__REFERENCES);
    createEAttribute(inputEClass, INPUT__APPEARS_IN);
    createEAttribute(inputEClass, INPUT__DESCRIPTION);
    createEAttribute(inputEClass, INPUT__COMMENTS);
    createEReference(inputEClass, INPUT__STRUCTURE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecification_Devices(), this.getDevice(), null, "devices", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecification_Components(), this.getComponent(), null, "components", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modeElementTypeEClass, ModeElementType.class, "ModeElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModeElementType_ElementType(), ecorePackage.getEString(), "elementType", null, 0, 1, ModeElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Modes(), this.getModeElement(), null, "modes", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_States(), this.getStateElement(), null, "states", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Inputs(), this.getComponentInput(), null, "inputs", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Outputs(), this.getComponentOutput(), null, "outputs", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modeElementEClass, ModeElement.class, "ModeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModeElement_Inferred(), ecorePackage.getEBoolean(), "inferred", null, 0, 1, ModeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModeElement_Type(), this.getModeElementType(), null, "type", null, 0, 1, ModeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModeElement_Modes(), this.getModeVariable(), null, "modes", null, 0, -1, ModeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateElementEClass, StateElement.class, "StateElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateElement_Inferred(), ecorePackage.getEBoolean(), "inferred", null, 0, 1, StateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateElement_States(), this.getStateVariable(), null, "states", null, 0, -1, StateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateVariableEClass, StateVariable.class, "StateVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateVariable_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateVariable_State(), this.getState(), null, "state", null, 0, -1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getState_Initial(), ecorePackage.getEBoolean(), "initial", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_Value(), ecorePackage.getEString(), "value", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modeVariableEClass, ModeVariable.class, "ModeVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModeVariable_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, ModeVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModeVariable_Modes(), this.getMode(), null, "modes", null, 0, -1, ModeVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modeEClass, Mode.class, "Mode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMode_Initial(), ecorePackage.getEBoolean(), "initial", null, 0, 1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMode_Value(), ecorePackage.getEString(), "value", null, 0, 1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDevice_Name(), ecorePackage.getEString(), "name", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDevice_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDevice_Inputs(), this.getDeviceInput(), null, "inputs", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDevice_Outputs(), this.getDeviceOutput(), null, "outputs", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceInputEClass, DeviceInput.class, "DeviceInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeviceInput_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeviceInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeviceInput_Io(), this.getInput(), null, "io", null, 0, 1, DeviceInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeviceInput_Source(), this.getComponent(), null, "source", null, 0, 1, DeviceInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceOutputEClass, DeviceOutput.class, "DeviceOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeviceOutput_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeviceOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeviceOutput_Io(), this.getOutput(), null, "io", null, 0, 1, DeviceOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeviceOutput_Target(), this.getComponent(), null, "target", null, 0, 1, DeviceOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentInputEClass, ComponentInput.class, "ComponentInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponentInput_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentInput_Io(), this.getInput(), null, "io", null, 0, 1, ComponentInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentInput_Source(), this.getDevice(), null, "source", null, 0, 1, ComponentInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentOutputEClass, ComponentOutput.class, "ComponentOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponentOutput_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentOutput_Io(), this.getOutput(), null, "io", null, 0, 1, ComponentOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentOutput_Target(), this.getDevice(), null, "target", null, 0, 1, ComponentOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bigUnitValueEClass, BigUnitValue.class, "BigUnitValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBigUnitValue_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, BigUnitValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBigUnitValue_Units(), ecorePackage.getEString(), "units", null, 0, 1, BigUnitValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateValueEClass, StateValue.class, "StateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StateValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateListEClass, StateList.class, "StateList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateList_StateList(), this.getStateValue(), null, "stateList", null, 0, -1, StateList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrigger_Mode(), this.getMode(), null, "mode", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrigger_List(), this.getStateList(), null, "list", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrigger_Variable(), this.getStateVariable(), null, "variable", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrigger_Value(), this.getState(), null, "value", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(triggerTableEClass, TriggerTable.class, "TriggerTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTriggerTable_Rows(), this.getTrigger(), null, "rows", null, 0, -1, TriggerTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueRangeEClass, ValueRange.class, "ValueRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValueRange_Lower(), ecorePackage.getEBigDecimal(), "lower", null, 0, 1, ValueRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValueRange_Upper(), ecorePackage.getEBigDecimal(), "upper", null, 0, 1, ValueRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValueRange_RangeType(), ecorePackage.getEString(), "rangeType", null, 0, 1, ValueRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValueRange_RangeUnits(), ecorePackage.getEString(), "rangeUnits", null, 0, 1, ValueRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueListEClass, ValueList.class, "ValueList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValueList_Values(), ecorePackage.getEString(), "values", null, 0, -1, ValueList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutput_Range(), this.getValueRange(), null, "range", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutput_ValueList(), this.getValueList(), null, "valueList", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutput_Rate(), this.getBigUnitValue(), null, "rate", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutput_Delay(), this.getBigUnitValue(), null, "delay", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutput_Deadline(), this.getBigUnitValue(), null, "deadline", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutput_CompletionHandling(), ecorePackage.getEString(), "completionHandling", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutput_Variables(), ecorePackage.getEString(), "variables", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutput_Relationship(), ecorePackage.getEString(), "relationship", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutput_MinResponse(), this.getBigUnitValue(), null, "minResponse", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutput_MaxResponse(), this.getBigUnitValue(), null, "maxResponse", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutput_FeebackHandling(), ecorePackage.getEString(), "feebackHandling", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutput_Reversed(), ecorePackage.getEString(), "reversed", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutput_References(), ecorePackage.getEString(), "references", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutput_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutput_Contents(), ecorePackage.getEString(), "contents", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutput_Table(), this.getTriggerTable(), null, "table", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInput_Range(), this.getValueRange(), null, "range", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInput_ValueList(), this.getValueList(), null, "valueList", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInput_ValueHandling(), ecorePackage.getEString(), "valueHandling", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInput_Granularity(), this.getBigUnitValue(), null, "granularity", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInput_ArrivalRateAvg(), this.getBigUnitValue(), null, "arrivalRateAvg", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInput_ArrivalRateMinimum(), this.getBigUnitValue(), null, "arrivalRateMinimum", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInput_ArrivalRateMaximum(), this.getBigUnitValue(), null, "arrivalRateMaximum", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInput_Obsolescence(), this.getBigUnitValue(), null, "obsolescence", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInput_References(), ecorePackage.getEString(), "references", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInput_AppearsIn(), ecorePackage.getEString(), "appearsIn", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInput_Description(), ecorePackage.getEString(), "description", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInput_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInput_Structure(), this.getTriggerTable(), null, "structure", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //StateSpecificationPackageImpl
