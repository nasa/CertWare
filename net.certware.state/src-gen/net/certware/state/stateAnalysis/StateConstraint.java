/**
 */
package net.certware.state.stateAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.StateConstraint#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.StateConstraint#getControllers <em>Controllers</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.StateConstraint#getEstimators <em>Estimators</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getStateConstraint()
 * @model
 * @generated
 */
public interface StateConstraint extends EObject
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getStateConstraint_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.StateConstraint#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Controllers</b></em>' reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.Controller}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Controllers</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controllers</em>' reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getStateConstraint_Controllers()
   * @model
   * @generated
   */
  EList<Controller> getControllers();

  /**
   * Returns the value of the '<em><b>Estimators</b></em>' reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.Estimator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estimators</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estimators</em>' reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getStateConstraint_Estimators()
   * @model
   * @generated
   */
  EList<Estimator> getEstimators();

} // StateConstraint
