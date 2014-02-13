/**
 */
package net.certware.intent.state.stateSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.Component#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Component#getModes <em>Modes</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Component#getStates <em>States</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Component#getInputs <em>Inputs</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Component#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Component#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Modes</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.intent.state.stateSpecification.ModeElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modes</em>' containment reference list.
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getComponent_Modes()
   * @model containment="true"
   * @generated
   */
  EList<ModeElement> getModes();

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.intent.state.stateSpecification.StateElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getComponent_States()
   * @model containment="true"
   * @generated
   */
  EList<StateElement> getStates();

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.intent.state.stateSpecification.ComponentInput}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference list.
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getComponent_Inputs()
   * @model containment="true"
   * @generated
   */
  EList<ComponentInput> getInputs();

  /**
   * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.intent.state.stateSpecification.ComponentOutput}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outputs</em>' containment reference list.
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getComponent_Outputs()
   * @model containment="true"
   * @generated
   */
  EList<ComponentOutput> getOutputs();

} // Component
