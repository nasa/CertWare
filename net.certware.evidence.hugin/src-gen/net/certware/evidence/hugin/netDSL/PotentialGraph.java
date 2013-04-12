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
 * A representation of the model object '<em><b>Potential Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.PotentialGraph#getChildren <em>Children</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.PotentialGraph#getParents <em>Parents</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getPotentialGraph()
 * @model
 * @generated
 */
public interface PotentialGraph extends EObject
{
  /**
   * Returns the value of the '<em><b>Children</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' attribute list.
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getPotentialGraph_Children()
   * @model unique="false"
   * @generated
   */
  EList<String> getChildren();

  /**
   * Returns the value of the '<em><b>Parents</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parents</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parents</em>' attribute list.
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getPotentialGraph_Parents()
   * @model unique="false"
   * @generated
   */
  EList<String> getParents();

} // PotentialGraph
