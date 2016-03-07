/**
 */
package net.certware.argument.analysis.analysisDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.Term#getCs <em>Cs</em>}</li>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.Term#getSign <em>Sign</em>}</li>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.Term#getN <em>N</em>}</li>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.Term#getFs <em>Fs</em>}</li>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.Term#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends EObject
{
  /**
   * Returns the value of the '<em><b>Cs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cs</em>' attribute.
   * @see #setCs(String)
   * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage#getTerm_Cs()
   * @model
   * @generated
   */
  String getCs();

  /**
   * Sets the value of the '{@link net.certware.argument.analysis.analysisDSL.Term#getCs <em>Cs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cs</em>' attribute.
   * @see #getCs()
   * @generated
   */
  void setCs(String value);

  /**
   * Returns the value of the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sign</em>' attribute.
   * @see #setSign(String)
   * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage#getTerm_Sign()
   * @model
   * @generated
   */
  String getSign();

  /**
   * Sets the value of the '{@link net.certware.argument.analysis.analysisDSL.Term#getSign <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sign</em>' attribute.
   * @see #getSign()
   * @generated
   */
  void setSign(String value);

  /**
   * Returns the value of the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute.
   * @see #setN(String)
   * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage#getTerm_N()
   * @model
   * @generated
   */
  String getN();

  /**
   * Sets the value of the '{@link net.certware.argument.analysis.analysisDSL.Term#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see #getN()
   * @generated
   */
  void setN(String value);

  /**
   * Returns the value of the '<em><b>Fs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fs</em>' attribute.
   * @see #setFs(String)
   * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage#getTerm_Fs()
   * @model
   * @generated
   */
  String getFs();

  /**
   * Sets the value of the '{@link net.certware.argument.analysis.analysisDSL.Term#getFs <em>Fs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fs</em>' attribute.
   * @see #getFs()
   * @generated
   */
  void setFs(String value);

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
   * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage#getTerm_Terms()
   * @model containment="true"
   * @generated
   */
  Terms getTerms();

  /**
   * Sets the value of the '{@link net.certware.argument.analysis.analysisDSL.Term#getTerms <em>Terms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Terms</em>' containment reference.
   * @see #getTerms()
   * @generated
   */
  void setTerms(Terms value);

} // Term
