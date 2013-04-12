/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.OutputBinding#getActual <em>Actual</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.OutputBinding#getFormal <em>Formal</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getOutputBinding()
 * @model
 * @generated
 */
public interface OutputBinding extends EObject
{
  /**
   * Returns the value of the '<em><b>Actual</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actual</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actual</em>' attribute.
   * @see #setActual(String)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getOutputBinding_Actual()
   * @model
   * @generated
   */
  String getActual();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.OutputBinding#getActual <em>Actual</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actual</em>' attribute.
   * @see #getActual()
   * @generated
   */
  void setActual(String value);

  /**
   * Returns the value of the '<em><b>Formal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formal</em>' attribute.
   * @see #setFormal(String)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getOutputBinding_Formal()
   * @model
   * @generated
   */
  String getFormal();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.OutputBinding#getFormal <em>Formal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal</em>' attribute.
   * @see #getFormal()
   * @generated
   */
  void setFormal(String value);

} // OutputBinding
