/**
 */
package net.certware.intent.intentSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.intentSpecification.ListItem#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.ListItem#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.ListItem#getDesc <em>Desc</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.ListItem#getDocReferences <em>Doc References</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.ListItem#getItemReferences <em>Item References</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.ListItem#getModelReferences <em>Model References</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getListItem()
 * @model
 * @generated
 */
public interface ListItem extends EObject
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
   * @see #setType(ListItemType)
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getListItem_Type()
   * @model containment="true"
   * @generated
   */
  ListItemType getType();

  /**
   * Sets the value of the '{@link net.certware.intent.intentSpecification.ListItem#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ListItemType value);

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
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getListItem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.intent.intentSpecification.ListItem#getName <em>Name</em>}' attribute.
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
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getListItem_Desc()
   * @model
   * @generated
   */
  String getDesc();

  /**
   * Sets the value of the '{@link net.certware.intent.intentSpecification.ListItem#getDesc <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desc</em>' attribute.
   * @see #getDesc()
   * @generated
   */
  void setDesc(String value);

  /**
   * Returns the value of the '<em><b>Doc References</b></em>' reference list.
   * The list contents are of type {@link net.certware.intent.intentSpecification.DocItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doc References</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc References</em>' reference list.
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getListItem_DocReferences()
   * @model
   * @generated
   */
  EList<DocItem> getDocReferences();

  /**
   * Returns the value of the '<em><b>Item References</b></em>' reference list.
   * The list contents are of type {@link net.certware.intent.intentSpecification.ListItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item References</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item References</em>' reference list.
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getListItem_ItemReferences()
   * @model
   * @generated
   */
  EList<ListItem> getItemReferences();

  /**
   * Returns the value of the '<em><b>Model References</b></em>' reference list.
   * The list contents are of type {@link net.certware.intent.intentSpecification.ModelItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model References</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model References</em>' reference list.
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getListItem_ModelReferences()
   * @model
   * @generated
   */
  EList<ModelItem> getModelReferences();

} // ListItem
