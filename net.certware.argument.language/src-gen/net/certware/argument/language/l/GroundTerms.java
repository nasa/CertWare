/**
 */
package net.certware.argument.language.l;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Terms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.GroundTerms#getCar <em>Car</em>}</li>
 *   <li>{@link net.certware.argument.language.l.GroundTerms#getCdr <em>Cdr</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.language.l.LPackage#getGroundTerms()
 * @model
 * @generated
 */
public interface GroundTerms extends GroundFunctionalTerm
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
   * @see #setCar(GroundTerm)
   * @see net.certware.argument.language.l.LPackage#getGroundTerms_Car()
   * @model containment="true"
   * @generated
   */
  GroundTerm getCar();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.GroundTerms#getCar <em>Car</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Car</em>' containment reference.
   * @see #getCar()
   * @generated
   */
  void setCar(GroundTerm value);

  /**
   * Returns the value of the '<em><b>Cdr</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.argument.language.l.GroundTerm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cdr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cdr</em>' containment reference list.
   * @see net.certware.argument.language.l.LPackage#getGroundTerms_Cdr()
   * @model containment="true"
   * @generated
   */
  EList<GroundTerm> getCdr();

} // GroundTerms
