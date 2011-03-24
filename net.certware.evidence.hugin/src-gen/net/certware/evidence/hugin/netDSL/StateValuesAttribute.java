/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;

import java.lang.Integer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Values Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.StateValuesAttribute#getNumbers <em>Numbers</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getStateValuesAttribute()
 * @model
 * @generated
 */
public interface StateValuesAttribute extends Attribute
{
  /**
   * Returns the value of the '<em><b>Numbers</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numbers</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numbers</em>' attribute list.
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getStateValuesAttribute_Numbers()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getNumbers();

} // StateValuesAttribute
