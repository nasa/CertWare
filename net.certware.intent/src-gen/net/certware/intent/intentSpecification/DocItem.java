/**
 */
package net.certware.intent.intentSpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.intentSpecification.DocItem#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.DocItem#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.DocItem#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getDocItem()
 * @model
 * @generated
 */
public interface DocItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(DocItemType)
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getDocItem_Type()
   * @model containment="true"
   * @generated
   */
  DocItemType getType();

  /**
   * Sets the value of the '{@link net.certware.intent.intentSpecification.DocItem#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(DocItemType value);

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
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getDocItem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.intent.intentSpecification.DocItem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' attribute.
   * @see #setRef(String)
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getDocItem_Ref()
   * @model
   * @generated
   */
  String getRef();

  /**
   * Sets the value of the '{@link net.certware.intent.intentSpecification.DocItem#getRef <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' attribute.
   * @see #getRef()
   * @generated
   */
  void setRef(String value);

} // DocItem
