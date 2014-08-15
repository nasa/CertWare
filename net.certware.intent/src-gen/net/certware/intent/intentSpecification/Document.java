/**
 */
package net.certware.intent.intentSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.intentSpecification.Document#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject
{
  /**
   * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.intent.intentSpecification.DocItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' containment reference list.
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getDocument_Entries()
   * @model containment="true"
   * @generated
   */
  EList<DocItem> getEntries();

} // Document
