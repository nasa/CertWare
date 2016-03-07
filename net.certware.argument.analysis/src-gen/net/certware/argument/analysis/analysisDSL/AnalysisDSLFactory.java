/**
 */
package net.certware.argument.analysis.analysisDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage
 * @generated
 */
public interface AnalysisDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AnalysisDSLFactory eINSTANCE = net.certware.argument.analysis.analysisDSL.impl.AnalysisDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output</em>'.
   * @generated
   */
  Output createOutput();

  /**
   * Returns a new object of class '<em>Line</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Line</em>'.
   * @generated
   */
  Line createLine();

  /**
   * Returns a new object of class '<em>Classic Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Classic Literal</em>'.
   * @generated
   */
  ClassicLiteral createClassicLiteral();

  /**
   * Returns a new object of class '<em>Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atom</em>'.
   * @generated
   */
  Atom createAtom();

  /**
   * Returns a new object of class '<em>Terms</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terms</em>'.
   * @generated
   */
  Terms createTerms();

  /**
   * Returns a new object of class '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term</em>'.
   * @generated
   */
  Term createTerm();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AnalysisDSLPackage getAnalysisDSLPackage();

} //AnalysisDSLFactory
