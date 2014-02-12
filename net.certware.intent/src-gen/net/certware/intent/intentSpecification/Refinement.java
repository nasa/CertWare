/**
 */
package net.certware.intent.intentSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.intentSpecification.Refinement#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.Refinement#getDesc <em>Desc</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.Refinement#getIntents <em>Intents</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getRefinement()
 * @model
 * @generated
 */
public interface Refinement extends EObject
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
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getRefinement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.intent.intentSpecification.Refinement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Desc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Desc</em>' attribute.
   * @see #setDesc(String)
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getRefinement_Desc()
   * @model
   * @generated
   */
  String getDesc();

  /**
   * Sets the value of the '{@link net.certware.intent.intentSpecification.Refinement#getDesc <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desc</em>' attribute.
   * @see #getDesc()
   * @generated
   */
  void setDesc(String value);

  /**
   * Returns the value of the '<em><b>Intents</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.intent.intentSpecification.Intent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intents</em>' containment reference list.
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getRefinement_Intents()
   * @model containment="true"
   * @generated
   */
  EList<Intent> getIntents();

} // Refinement
