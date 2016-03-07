/**
 */
package net.certware.argument.analysis.analysisDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.Atom#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.Atom#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage#getAtom()
 * @model
 * @generated
 */
public interface Atom extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage#getAtom_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.argument.analysis.analysisDSL.Atom#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Terms</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terms</em>' containment reference.
   * @see #setTerms(Terms)
   * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage#getAtom_Terms()
   * @model containment="true"
   * @generated
   */
  Terms getTerms();

  /**
   * Sets the value of the '{@link net.certware.argument.analysis.analysisDSL.Atom#getTerms <em>Terms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Terms</em>' containment reference.
   * @see #getTerms()
   * @generated
   */
  void setTerms(Terms value);

} // Atom
