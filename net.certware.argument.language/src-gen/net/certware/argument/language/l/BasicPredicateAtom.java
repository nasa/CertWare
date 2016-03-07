/**
 */
package net.certware.argument.language.l;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Predicate Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.BasicPredicateAtom#getFid <em>Fid</em>}</li>
 *   <li>{@link net.certware.argument.language.l.BasicPredicateAtom#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.language.l.LPackage#getBasicPredicateAtom()
 * @model
 * @generated
 */
public interface BasicPredicateAtom extends BasicAtom, pSentenceLiteral, MaybeLiteral
{
  /**
   * Returns the value of the '<em><b>Fid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fid</em>' attribute.
   * @see #setFid(String)
   * @see net.certware.argument.language.l.LPackage#getBasicPredicateAtom_Fid()
   * @model
   * @generated
   */
  String getFid();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.BasicPredicateAtom#getFid <em>Fid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fid</em>' attribute.
   * @see #getFid()
   * @generated
   */
  void setFid(String value);

  /**
   * Returns the value of the '<em><b>Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Terms</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terms</em>' containment reference.
   * @see #setTerms(BasicTerms)
   * @see net.certware.argument.language.l.LPackage#getBasicPredicateAtom_Terms()
   * @model containment="true"
   * @generated
   */
  BasicTerms getTerms();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.BasicPredicateAtom#getTerms <em>Terms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Terms</em>' containment reference.
   * @see #getTerms()
   * @generated
   */
  void setTerms(BasicTerms value);

} // BasicPredicateAtom
