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
 * A representation of the model object '<em><b>Matrix Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.MatrixRow#getR5 <em>R5</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.MatrixRow#getR4 <em>R4</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.MatrixRow#getR3 <em>R3</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.MatrixRow#getR2 <em>R2</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.MatrixRow#getR1 <em>R1</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getMatrixRow()
 * @model
 * @generated
 */
public interface MatrixRow extends EObject
{
  /**
   * Returns the value of the '<em><b>R5</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.evidence.hugin.netDSL.MatrixRow}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>R5</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>R5</em>' containment reference list.
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getMatrixRow_R5()
   * @model containment="true"
   * @generated
   */
  EList<MatrixRow> getR5();

  /**
   * Returns the value of the '<em><b>R4</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.evidence.hugin.netDSL.MatrixRow}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>R4</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>R4</em>' containment reference list.
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getMatrixRow_R4()
   * @model containment="true"
   * @generated
   */
  EList<MatrixRow> getR4();

  /**
   * Returns the value of the '<em><b>R3</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.evidence.hugin.netDSL.MatrixRow}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>R3</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>R3</em>' containment reference list.
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getMatrixRow_R3()
   * @model containment="true"
   * @generated
   */
  EList<MatrixRow> getR3();

  /**
   * Returns the value of the '<em><b>R2</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.evidence.hugin.netDSL.MatrixRow}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>R2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>R2</em>' containment reference list.
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getMatrixRow_R2()
   * @model containment="true"
   * @generated
   */
  EList<MatrixRow> getR2();

  /**
   * Returns the value of the '<em><b>R1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>R1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>R1</em>' containment reference.
   * @see #setR1(MatrixRow)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getMatrixRow_R1()
   * @model containment="true"
   * @generated
   */
  MatrixRow getR1();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.MatrixRow#getR1 <em>R1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>R1</em>' containment reference.
   * @see #getR1()
   * @generated
   */
  void setR1(MatrixRow value);

} // MatrixRow
