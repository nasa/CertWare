/**
 */
package net.certware.intent.state.stateSpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.Trigger#getMode <em>Mode</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Trigger#getList <em>List</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Trigger#getVariable <em>Variable</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Trigger#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject
{
  /**
   * Returns the value of the '<em><b>Mode</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mode</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' reference.
   * @see #setMode(Mode)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getTrigger_Mode()
   * @model
   * @generated
   */
  Mode getMode();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Trigger#getMode <em>Mode</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' reference.
   * @see #getMode()
   * @generated
   */
  void setMode(Mode value);

  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference.
   * @see #setList(StateList)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getTrigger_List()
   * @model containment="true"
   * @generated
   */
  StateList getList();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Trigger#getList <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' containment reference.
   * @see #getList()
   * @generated
   */
  void setList(StateList value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(StateVariable)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getTrigger_Variable()
   * @model
   * @generated
   */
  StateVariable getVariable();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Trigger#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(StateVariable value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(State)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getTrigger_Value()
   * @model
   * @generated
   */
  State getValue();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Trigger#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(State value);

} // Trigger
