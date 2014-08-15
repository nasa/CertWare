/**
 */
package net.certware.intent.state.stateSpecification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage
 * @generated
 */
public interface StateSpecificationFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StateSpecificationFactory eINSTANCE = net.certware.intent.state.stateSpecification.impl.StateSpecificationFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Specification</em>'.
   * @generated
   */
  Specification createSpecification();

  /**
   * Returns a new object of class '<em>Mode Element Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mode Element Type</em>'.
   * @generated
   */
  ModeElementType createModeElementType();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>Mode Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mode Element</em>'.
   * @generated
   */
  ModeElement createModeElement();

  /**
   * Returns a new object of class '<em>State Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Element</em>'.
   * @generated
   */
  StateElement createStateElement();

  /**
   * Returns a new object of class '<em>State Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Variable</em>'.
   * @generated
   */
  StateVariable createStateVariable();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Mode Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mode Variable</em>'.
   * @generated
   */
  ModeVariable createModeVariable();

  /**
   * Returns a new object of class '<em>Mode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mode</em>'.
   * @generated
   */
  Mode createMode();

  /**
   * Returns a new object of class '<em>Device</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Device</em>'.
   * @generated
   */
  Device createDevice();

  /**
   * Returns a new object of class '<em>Device Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Device Input</em>'.
   * @generated
   */
  DeviceInput createDeviceInput();

  /**
   * Returns a new object of class '<em>Device Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Device Output</em>'.
   * @generated
   */
  DeviceOutput createDeviceOutput();

  /**
   * Returns a new object of class '<em>Component Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Input</em>'.
   * @generated
   */
  ComponentInput createComponentInput();

  /**
   * Returns a new object of class '<em>Component Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Output</em>'.
   * @generated
   */
  ComponentOutput createComponentOutput();

  /**
   * Returns a new object of class '<em>Big Unit Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Big Unit Value</em>'.
   * @generated
   */
  BigUnitValue createBigUnitValue();

  /**
   * Returns a new object of class '<em>State Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Value</em>'.
   * @generated
   */
  StateValue createStateValue();

  /**
   * Returns a new object of class '<em>State List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State List</em>'.
   * @generated
   */
  StateList createStateList();

  /**
   * Returns a new object of class '<em>Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trigger</em>'.
   * @generated
   */
  Trigger createTrigger();

  /**
   * Returns a new object of class '<em>Trigger Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trigger Table</em>'.
   * @generated
   */
  TriggerTable createTriggerTable();

  /**
   * Returns a new object of class '<em>Value Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Range</em>'.
   * @generated
   */
  ValueRange createValueRange();

  /**
   * Returns a new object of class '<em>Value List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value List</em>'.
   * @generated
   */
  ValueList createValueList();

  /**
   * Returns a new object of class '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output</em>'.
   * @generated
   */
  Output createOutput();

  /**
   * Returns a new object of class '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input</em>'.
   * @generated
   */
  Input createInput();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  StateSpecificationPackage getStateSpecificationPackage();

} //StateSpecificationFactory
