/**
 */
package net.certware.intent.state.stateSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.StateElement#isInferred <em>Inferred</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.StateElement#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getStateElement()
 * @model
 * @generated
 */
public interface StateElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Inferred</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inferred</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inferred</em>' attribute.
   * @see #setInferred(boolean)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getStateElement_Inferred()
   * @model
   * @generated
   */
  boolean isInferred();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.StateElement#isInferred <em>Inferred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inferred</em>' attribute.
   * @see #isInferred()
   * @generated
   */
  void setInferred(boolean value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.intent.state.stateSpecification.StateVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getStateElement_States()
   * @model containment="true"
   * @generated
   */
  EList<StateVariable> getStates();

} // StateElement
