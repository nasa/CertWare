/**
 */
package net.certware.argument.sfp.semiFormalProof;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quoted Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.QuotedAssertion#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getQuotedAssertion()
 * @model
 * @generated
 */
public interface QuotedAssertion extends EObject
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getQuotedAssertion_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.QuotedAssertion#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // QuotedAssertion
