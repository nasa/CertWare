/**
 */
package net.certware.planning.cpn.cpnDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.Plans#getArgumentmodels <em>Argumentmodels</em>}</li>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.Plans#getPlans <em>Plans</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.cpn.cpnDsl.CpnDslPackage#getPlans()
 * @model
 * @generated
 */
public interface Plans extends EObject
{
  /**
   * Returns the value of the '<em><b>Argumentmodels</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.planning.cpn.cpnDsl.ArgumentModels}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argumentmodels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argumentmodels</em>' containment reference list.
   * @see net.certware.planning.cpn.cpnDsl.CpnDslPackage#getPlans_Argumentmodels()
   * @model containment="true"
   * @generated
   */
  EList<ArgumentModels> getArgumentmodels();

  /**
   * Returns the value of the '<em><b>Plans</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.planning.cpn.cpnDsl.Plan}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plans</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plans</em>' containment reference list.
   * @see net.certware.planning.cpn.cpnDsl.CpnDslPackage#getPlans_Plans()
   * @model containment="true"
   * @generated
   */
  EList<Plan> getPlans();

} // Plans
