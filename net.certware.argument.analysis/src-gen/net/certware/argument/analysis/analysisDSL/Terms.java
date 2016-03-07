/**
 */
package net.certware.argument.analysis.analysisDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.Terms#getCar <em>Car</em>}</li>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.Terms#getCdr <em>Cdr</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage#getTerms()
 * @model
 * @generated
 */
public interface Terms extends EObject
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
   * @see #setCar(Term)
   * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage#getTerms_Car()
   * @model containment="true"
   * @generated
   */
  Term getCar();

  /**
   * Sets the value of the '{@link net.certware.argument.analysis.analysisDSL.Terms#getCar <em>Car</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Car</em>' containment reference.
   * @see #getCar()
   * @generated
   */
  void setCar(Term value);

  /**
   * Returns the value of the '<em><b>Cdr</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.argument.analysis.analysisDSL.Term}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cdr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cdr</em>' containment reference list.
   * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage#getTerms_Cdr()
   * @model containment="true"
   * @generated
   */
  EList<Term> getCdr();

} // Terms
