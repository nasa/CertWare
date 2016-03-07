/**
 */
package net.certware.argument.analysis.analysisDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.Line#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends EObject
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.argument.analysis.analysisDSL.ClassicLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage#getLine_Items()
   * @model containment="true"
   * @generated
   */
  EList<ClassicLiteral> getItems();

} // Line
