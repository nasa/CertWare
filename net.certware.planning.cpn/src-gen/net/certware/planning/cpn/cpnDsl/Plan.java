/**
 */
package net.certware.planning.cpn.cpnDsl;

import net.certware.sacm.SACM.ModelElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.Plan#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.Plan#getElement <em>Element</em>}</li>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.Plan#getEstimated <em>Estimated</em>}</li>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.Plan#getActual <em>Actual</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.cpn.cpnDsl.CpnDslPackage#getPlan()
 * @model
 * @generated
 */
public interface Plan extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see net.certware.planning.cpn.cpnDsl.CpnDslPackage#getPlan_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link net.certware.planning.cpn.cpnDsl.Plan#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' reference.
   * @see #setElement(ModelElement)
   * @see net.certware.planning.cpn.cpnDsl.CpnDslPackage#getPlan_Element()
   * @model
   * @generated
   */
  ModelElement getElement();

  /**
   * Sets the value of the '{@link net.certware.planning.cpn.cpnDsl.Plan#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(ModelElement value);

  /**
   * Returns the value of the '<em><b>Estimated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estimated</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estimated</em>' containment reference.
   * @see #setEstimated(Allocation)
   * @see net.certware.planning.cpn.cpnDsl.CpnDslPackage#getPlan_Estimated()
   * @model containment="true"
   * @generated
   */
  Allocation getEstimated();

  /**
   * Sets the value of the '{@link net.certware.planning.cpn.cpnDsl.Plan#getEstimated <em>Estimated</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Estimated</em>' containment reference.
   * @see #getEstimated()
   * @generated
   */
  void setEstimated(Allocation value);

  /**
   * Returns the value of the '<em><b>Actual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actual</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actual</em>' containment reference.
   * @see #setActual(Allocation)
   * @see net.certware.planning.cpn.cpnDsl.CpnDslPackage#getPlan_Actual()
   * @model containment="true"
   * @generated
   */
  Allocation getActual();

  /**
   * Sets the value of the '{@link net.certware.planning.cpn.cpnDsl.Plan#getActual <em>Actual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actual</em>' containment reference.
   * @see #getActual()
   * @generated
   */
  void setActual(Allocation value);

} // Plan
