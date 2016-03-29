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
 * </p>
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.StateVariable#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.StateVariable#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.StateVariable#getRepresentationType <em>Representation Type</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.StateVariable#getInStateConstraints <em>In State Constraints</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.StateVariable#getOutStateConstraints <em>Out State Constraints</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.StateVariable#getStateUpdates <em>State Updates</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.StateVariable#getInfluencedBy <em>Influenced By</em>}</li>
 * </ul>
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
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getStateVariable_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.StateVariable#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Representation Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Representation Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Representation Type</em>' attribute.
   * @see #setRepresentationType(String)
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getStateVariable_RepresentationType()
   * @model
   * @generated
   */
  String getRepresentationType();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.StateVariable#getRepresentationType <em>Representation Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Representation Type</em>' attribute.
   * @see #getRepresentationType()
   * @generated
   */
  void setRepresentationType(String value);

  /**
   * Returns the value of the '<em><b>In State Constraints</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.StateConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In State Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In State Constraints</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getStateVariable_InStateConstraints()
   * @model containment="true"
   * @generated
   */
  EList<StateConstraint> getInStateConstraints();

  /**
   * Returns the value of the '<em><b>Out State Constraints</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.StateConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out State Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out State Constraints</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getStateVariable_OutStateConstraints()
   * @model containment="true"
   * @generated
   */
  EList<StateConstraint> getOutStateConstraints();

  /**
   * Returns the value of the '<em><b>State Updates</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.StateUpdate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Updates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Updates</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getStateVariable_StateUpdates()
   * @model containment="true"
   * @generated
   */
  EList<StateUpdate> getStateUpdates();

  /**
   * Returns the value of the '<em><b>Influenced By</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.StateVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Influenced By</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Influenced By</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getStateVariable_InfluencedBy()
   * @model containment="true"
   * @generated
   */
  EList<StateVariable> getInfluencedBy();

} // StateVariable
