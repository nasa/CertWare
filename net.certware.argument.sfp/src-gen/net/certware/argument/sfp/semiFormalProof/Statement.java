/**
 */
package net.certware.argument.sfp.semiFormalProof;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Statement#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Statement#getStatement <em>Statement</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Statement#getJustification <em>Justification</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Statement#getValidation <em>Validation</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getStatement_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Statement#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' attribute.
   * @see #setStatement(String)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getStatement_Statement()
   * @model
   * @generated
   */
  String getStatement();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Statement#getStatement <em>Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' attribute.
   * @see #getStatement()
   * @generated
   */
  void setStatement(String value);

  /**
   * Returns the value of the '<em><b>Justification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Justification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Justification</em>' containment reference.
   * @see #setJustification(Justifications)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getStatement_Justification()
   * @model containment="true"
   * @generated
   */
  Justifications getJustification();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Statement#getJustification <em>Justification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Justification</em>' containment reference.
   * @see #getJustification()
   * @generated
   */
  void setJustification(Justifications value);

  /**
   * Returns the value of the '<em><b>Validation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validation</em>' containment reference.
   * @see #setValidation(Validation)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getStatement_Validation()
   * @model containment="true"
   * @generated
   */
  Validation getValidation();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Statement#getValidation <em>Validation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validation</em>' containment reference.
   * @see #getValidation()
   * @generated
   */
  void setValidation(Validation value);

} // Statement
