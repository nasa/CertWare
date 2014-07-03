/**
 */
package stateAnalysis;

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
 *   <li>{@link stateAnalysis.StateVariable#getRepresentationType <em>Representation Type</em>}</li>
 *   <li>{@link stateAnalysis.StateVariable#getInStateConstraints <em>In State Constraints</em>}</li>
 *   <li>{@link stateAnalysis.StateVariable#getOutStateConstraints <em>Out State Constraints</em>}</li>
 *   <li>{@link stateAnalysis.StateVariable#getStateUpdates <em>State Updates</em>}</li>
 *   <li>{@link stateAnalysis.StateVariable#getInfluencedBy <em>Influenced By</em>}</li>
 * </ul>
 * </p>
 *
 * @see stateAnalysis.StateAnalysisPackage#getStateVariable()
 * @model annotation="gmf.node label='name' label.pattern='SV: {0}' tool.name='State Variable'"
 * @generated
 */
public interface StateVariable extends Component
{
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
   * @see stateAnalysis.StateAnalysisPackage#getStateVariable_RepresentationType()
   * @model
   * @generated
   */
  String getRepresentationType();

  /**
   * Sets the value of the '{@link stateAnalysis.StateVariable#getRepresentationType <em>Representation Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Representation Type</em>' attribute.
   * @see #getRepresentationType()
   * @generated
   */
  void setRepresentationType(String value);

  /**
   * Returns the value of the '<em><b>In State Constraints</b></em>' containment reference list.
   * The list contents are of type {@link stateAnalysis.StateConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In State Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In State Constraints</em>' containment reference list.
   * @see stateAnalysis.StateAnalysisPackage#getStateVariable_InStateConstraints()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='list'"
   * @generated
   */
  EList<StateConstraint> getInStateConstraints();

  /**
   * Returns the value of the '<em><b>Out State Constraints</b></em>' containment reference list.
   * The list contents are of type {@link stateAnalysis.StateConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out State Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out State Constraints</em>' containment reference list.
   * @see stateAnalysis.StateAnalysisPackage#getStateVariable_OutStateConstraints()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='list'"
   * @generated
   */
  EList<StateConstraint> getOutStateConstraints();

  /**
   * Returns the value of the '<em><b>State Updates</b></em>' containment reference list.
   * The list contents are of type {@link stateAnalysis.StateUpdate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Updates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Updates</em>' containment reference list.
   * @see stateAnalysis.StateAnalysisPackage#getStateVariable_StateUpdates()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='list'"
   * @generated
   */
  EList<StateUpdate> getStateUpdates();

  /**
   * Returns the value of the '<em><b>Influenced By</b></em>' containment reference list.
   * The list contents are of type {@link stateAnalysis.StateVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Influenced By</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Influenced By</em>' containment reference list.
   * @see stateAnalysis.StateAnalysisPackage#getStateVariable_InfluencedBy()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='list'"
   * @generated
   */
  EList<StateVariable> getInfluencedBy();

} // StateVariable
