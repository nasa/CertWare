/**
 */
package net.certware.argument.language.l;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Terms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.BasicTerms#getCar <em>Car</em>}</li>
 *   <li>{@link net.certware.argument.language.l.BasicTerms#getCdr <em>Cdr</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.language.l.LPackage#getBasicTerms()
 * @model
 * @generated
 */
public interface BasicTerms extends EObject
{
  /**
   * Returns the value of the '<em><b>Car</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Car</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Car</em>' containment reference.
   * @see #setCar(BasicTerm)
   * @see net.certware.argument.language.l.LPackage#getBasicTerms_Car()
   * @model containment="true"
   * @generated
   */
  BasicTerm getCar();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.BasicTerms#getCar <em>Car</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Car</em>' containment reference.
   * @see #getCar()
   * @generated
   */
  void setCar(BasicTerm value);

  /**
   * Returns the value of the '<em><b>Cdr</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.argument.language.l.BasicTerm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cdr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cdr</em>' containment reference list.
   * @see net.certware.argument.language.l.LPackage#getBasicTerms_Cdr()
   * @model containment="true"
   * @generated
   */
  EList<BasicTerm> getCdr();

} // BasicTerms
