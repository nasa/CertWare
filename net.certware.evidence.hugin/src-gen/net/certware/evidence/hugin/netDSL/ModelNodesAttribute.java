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
 * A representation of the model object '<em><b>Model Nodes Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.ModelNodesAttribute#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getModelNodesAttribute()
 * @model
 * @generated
 */
public interface ModelNodesAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Configurations</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configurations</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configurations</em>' attribute list.
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getModelNodesAttribute_Configurations()
   * @model unique="false"
   * @generated
   */
  EList<String> getConfigurations();

} // ModelNodesAttribute
