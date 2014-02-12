/**
 */
package net.certware.intent.intentSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.intentSpecification.Specification#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.Specification#getRefinements <em>Refinements</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject
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
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getSpecification_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.intent.intentSpecification.Specification#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Refinements</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.intent.intentSpecification.Refinement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refinements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refinements</em>' containment reference list.
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getSpecification_Refinements()
   * @model containment="true"
   * @generated
   */
  EList<Refinement> getRefinements();

} // Specification
