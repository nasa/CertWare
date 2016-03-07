/**
 */
package net.certware.argument.analysis.analysisDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classic Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.ClassicLiteral#getNeg <em>Neg</em>}</li>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.ClassicLiteral#getAtom <em>Atom</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage#getClassicLiteral()
 * @model
 * @generated
 */
public interface ClassicLiteral extends EObject
{
  /**
   * Returns the value of the '<em><b>Neg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Neg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Neg</em>' attribute.
   * @see #setNeg(String)
   * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage#getClassicLiteral_Neg()
   * @model
   * @generated
   */
  String getNeg();

  /**
   * Sets the value of the '{@link net.certware.argument.analysis.analysisDSL.ClassicLiteral#getNeg <em>Neg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Neg</em>' attribute.
   * @see #getNeg()
   * @generated
   */
  void setNeg(String value);

  /**
   * Returns the value of the '<em><b>Atom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atom</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atom</em>' containment reference.
   * @see #setAtom(Atom)
   * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage#getClassicLiteral_Atom()
   * @model containment="true"
   * @generated
   */
  Atom getAtom();

  /**
   * Sets the value of the '{@link net.certware.argument.analysis.analysisDSL.ClassicLiteral#getAtom <em>Atom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atom</em>' containment reference.
   * @see #getAtom()
   * @generated
   */
  void setAtom(Atom value);

} // ClassicLiteral
