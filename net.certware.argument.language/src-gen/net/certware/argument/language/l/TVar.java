/**
 */
package net.certware.argument.language.l;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TVar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.TVar#getVar <em>Var</em>}</li>
 *   <li>{@link net.certware.argument.language.l.TVar#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.language.l.LPackage#getTVar()
 * @model
 * @generated
 */
public interface TVar extends EObject
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(Variable)
   * @see net.certware.argument.language.l.LPackage#getTVar_Var()
   * @model containment="true"
   * @generated
   */
  Variable getVar();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.TVar#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Variable value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(TypeId)
   * @see net.certware.argument.language.l.LPackage#getTVar_Id()
   * @model containment="true"
   * @generated
   */
  TypeId getId();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.TVar#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(TypeId value);

} // TVar
