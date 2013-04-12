/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.DomainDefinition#getHeader <em>Header</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.DomainDefinition#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getDomainDefinition()
 * @model
 * @generated
 */
public interface DomainDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header</em>' containment reference.
   * @see #setHeader(DomainHeader)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getDomainDefinition_Header()
   * @model containment="true"
   * @generated
   */
  DomainHeader getHeader();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.DomainDefinition#getHeader <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' containment reference.
   * @see #getHeader()
   * @generated
   */
  void setHeader(DomainHeader value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.evidence.hugin.netDSL.DomainElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getDomainDefinition_Elements()
   * @model containment="true"
   * @generated
   */
  EList<DomainElement> getElements();

} // DomainDefinition
