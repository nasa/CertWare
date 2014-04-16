/**
 */
package net.certware.state.stateAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.StateVariable#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.StateVariable#getStateConstraints <em>State Constraints</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.StateVariable#getStateUpdates <em>State Updates</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getStateVariable()
 * @model
 * @generated
 */
public interface StateVariable extends EObject
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getStateVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.StateVariable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>State Constraints</b></em>' reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.StateConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Constraints</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Constraints</em>' reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getStateVariable_StateConstraints()
   * @model
   * @generated
   */
  EList<StateConstraint> getStateConstraints();

  /**
   * Returns the value of the '<em><b>State Updates</b></em>' reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.StateUpdate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Updates</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Updates</em>' reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getStateVariable_StateUpdates()
   * @model
   * @generated
   */
  EList<StateUpdate> getStateUpdates();

} // StateVariable
