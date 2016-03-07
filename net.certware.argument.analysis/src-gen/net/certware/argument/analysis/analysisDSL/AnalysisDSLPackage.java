/**
 */
package net.certware.argument.analysis.analysisDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.certware.argument.analysis.analysisDSL.AnalysisDSLFactory
 * @model kind="package"
 * @generated
 */
public interface AnalysisDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "analysisDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.certware.net/argument/analysis/AnalysisDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "analysisDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AnalysisDSLPackage eINSTANCE = net.certware.argument.analysis.analysisDSL.impl.AnalysisDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link net.certware.argument.analysis.analysisDSL.impl.OutputImpl <em>Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.analysis.analysisDSL.impl.OutputImpl
   * @see net.certware.argument.analysis.analysisDSL.impl.AnalysisDSLPackageImpl#getOutput()
   * @generated
   */
  int OUTPUT = 0;

  /**
   * The feature id for the '<em><b>Lines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__LINES = 0;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.argument.analysis.analysisDSL.impl.LineImpl <em>Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.analysis.analysisDSL.impl.LineImpl
   * @see net.certware.argument.analysis.analysisDSL.impl.AnalysisDSLPackageImpl#getLine()
   * @generated
   */
  int LINE = 1;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE__ITEMS = 0;

  /**
   * The number of structural features of the '<em>Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.argument.analysis.analysisDSL.impl.ClassicLiteralImpl <em>Classic Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.analysis.analysisDSL.impl.ClassicLiteralImpl
   * @see net.certware.argument.analysis.analysisDSL.impl.AnalysisDSLPackageImpl#getClassicLiteral()
   * @generated
   */
  int CLASSIC_LITERAL = 2;

  /**
   * The feature id for the '<em><b>Neg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIC_LITERAL__NEG = 0;

  /**
   * The feature id for the '<em><b>Atom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIC_LITERAL__ATOM = 1;

  /**
   * The number of structural features of the '<em>Classic Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIC_LITERAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.argument.analysis.analysisDSL.impl.AtomImpl <em>Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.analysis.analysisDSL.impl.AtomImpl
   * @see net.certware.argument.analysis.analysisDSL.impl.AnalysisDSLPackageImpl#getAtom()
   * @generated
   */
  int ATOM = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__NAME = 0;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__TERMS = 1;

  /**
   * The number of structural features of the '<em>Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.argument.analysis.analysisDSL.impl.TermsImpl <em>Terms</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.analysis.analysisDSL.impl.TermsImpl
   * @see net.certware.argument.analysis.analysisDSL.impl.AnalysisDSLPackageImpl#getTerms()
   * @generated
   */
  int TERMS = 4;

  /**
   * The feature id for the '<em><b>Car</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS__CAR = 0;

  /**
   * The feature id for the '<em><b>Cdr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS__CDR = 1;

  /**
   * The number of structural features of the '<em>Terms</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.argument.analysis.analysisDSL.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.analysis.analysisDSL.impl.TermImpl
   * @see net.certware.argument.analysis.analysisDSL.impl.AnalysisDSLPackageImpl#getTerm()
   * @generated
   */
  int TERM = 5;

  /**
   * The feature id for the '<em><b>Cs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__CS = 0;

  /**
   * The feature id for the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__SIGN = 1;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__N = 2;

  /**
   * The feature id for the '<em><b>Fs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__FS = 3;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__TERMS = 4;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 5;


  /**
   * Returns the meta object for class '{@link net.certware.argument.analysis.analysisDSL.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output</em>'.
   * @see net.certware.argument.analysis.analysisDSL.Output
   * @generated
   */
  EClass getOutput();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.argument.analysis.analysisDSL.Output#getLines <em>Lines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lines</em>'.
   * @see net.certware.argument.analysis.analysisDSL.Output#getLines()
   * @see #getOutput()
   * @generated
   */
  EReference getOutput_Lines();

  /**
   * Returns the meta object for class '{@link net.certware.argument.analysis.analysisDSL.Line <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line</em>'.
   * @see net.certware.argument.analysis.analysisDSL.Line
   * @generated
   */
  EClass getLine();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.argument.analysis.analysisDSL.Line#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see net.certware.argument.analysis.analysisDSL.Line#getItems()
   * @see #getLine()
   * @generated
   */
  EReference getLine_Items();

  /**
   * Returns the meta object for class '{@link net.certware.argument.analysis.analysisDSL.ClassicLiteral <em>Classic Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classic Literal</em>'.
   * @see net.certware.argument.analysis.analysisDSL.ClassicLiteral
   * @generated
   */
  EClass getClassicLiteral();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.analysis.analysisDSL.ClassicLiteral#getNeg <em>Neg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Neg</em>'.
   * @see net.certware.argument.analysis.analysisDSL.ClassicLiteral#getNeg()
   * @see #getClassicLiteral()
   * @generated
   */
  EAttribute getClassicLiteral_Neg();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.analysis.analysisDSL.ClassicLiteral#getAtom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atom</em>'.
   * @see net.certware.argument.analysis.analysisDSL.ClassicLiteral#getAtom()
   * @see #getClassicLiteral()
   * @generated
   */
  EReference getClassicLiteral_Atom();

  /**
   * Returns the meta object for class '{@link net.certware.argument.analysis.analysisDSL.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom</em>'.
   * @see net.certware.argument.analysis.analysisDSL.Atom
   * @generated
   */
  EClass getAtom();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.analysis.analysisDSL.Atom#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.argument.analysis.analysisDSL.Atom#getName()
   * @see #getAtom()
   * @generated
   */
  EAttribute getAtom_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.analysis.analysisDSL.Atom#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Terms</em>'.
   * @see net.certware.argument.analysis.analysisDSL.Atom#getTerms()
   * @see #getAtom()
   * @generated
   */
  EReference getAtom_Terms();

  /**
   * Returns the meta object for class '{@link net.certware.argument.analysis.analysisDSL.Terms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terms</em>'.
   * @see net.certware.argument.analysis.analysisDSL.Terms
   * @generated
   */
  EClass getTerms();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.analysis.analysisDSL.Terms#getCar <em>Car</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Car</em>'.
   * @see net.certware.argument.analysis.analysisDSL.Terms#getCar()
   * @see #getTerms()
   * @generated
   */
  EReference getTerms_Car();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.argument.analysis.analysisDSL.Terms#getCdr <em>Cdr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cdr</em>'.
   * @see net.certware.argument.analysis.analysisDSL.Terms#getCdr()
   * @see #getTerms()
   * @generated
   */
  EReference getTerms_Cdr();

  /**
   * Returns the meta object for class '{@link net.certware.argument.analysis.analysisDSL.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see net.certware.argument.analysis.analysisDSL.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.analysis.analysisDSL.Term#getCs <em>Cs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cs</em>'.
   * @see net.certware.argument.analysis.analysisDSL.Term#getCs()
   * @see #getTerm()
   * @generated
   */
  EAttribute getTerm_Cs();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.analysis.analysisDSL.Term#getSign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sign</em>'.
   * @see net.certware.argument.analysis.analysisDSL.Term#getSign()
   * @see #getTerm()
   * @generated
   */
  EAttribute getTerm_Sign();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.analysis.analysisDSL.Term#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see net.certware.argument.analysis.analysisDSL.Term#getN()
   * @see #getTerm()
   * @generated
   */
  EAttribute getTerm_N();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.analysis.analysisDSL.Term#getFs <em>Fs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fs</em>'.
   * @see net.certware.argument.analysis.analysisDSL.Term#getFs()
   * @see #getTerm()
   * @generated
   */
  EAttribute getTerm_Fs();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.analysis.analysisDSL.Term#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Terms</em>'.
   * @see net.certware.argument.analysis.analysisDSL.Term#getTerms()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Terms();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AnalysisDSLFactory getAnalysisDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.certware.argument.analysis.analysisDSL.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.analysis.analysisDSL.impl.OutputImpl
     * @see net.certware.argument.analysis.analysisDSL.impl.AnalysisDSLPackageImpl#getOutput()
     * @generated
     */
    EClass OUTPUT = eINSTANCE.getOutput();

    /**
     * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT__LINES = eINSTANCE.getOutput_Lines();

    /**
     * The meta object literal for the '{@link net.certware.argument.analysis.analysisDSL.impl.LineImpl <em>Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.analysis.analysisDSL.impl.LineImpl
     * @see net.certware.argument.analysis.analysisDSL.impl.AnalysisDSLPackageImpl#getLine()
     * @generated
     */
    EClass LINE = eINSTANCE.getLine();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINE__ITEMS = eINSTANCE.getLine_Items();

    /**
     * The meta object literal for the '{@link net.certware.argument.analysis.analysisDSL.impl.ClassicLiteralImpl <em>Classic Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.analysis.analysisDSL.impl.ClassicLiteralImpl
     * @see net.certware.argument.analysis.analysisDSL.impl.AnalysisDSLPackageImpl#getClassicLiteral()
     * @generated
     */
    EClass CLASSIC_LITERAL = eINSTANCE.getClassicLiteral();

    /**
     * The meta object literal for the '<em><b>Neg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIC_LITERAL__NEG = eINSTANCE.getClassicLiteral_Neg();

    /**
     * The meta object literal for the '<em><b>Atom</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIC_LITERAL__ATOM = eINSTANCE.getClassicLiteral_Atom();

    /**
     * The meta object literal for the '{@link net.certware.argument.analysis.analysisDSL.impl.AtomImpl <em>Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.analysis.analysisDSL.impl.AtomImpl
     * @see net.certware.argument.analysis.analysisDSL.impl.AnalysisDSLPackageImpl#getAtom()
     * @generated
     */
    EClass ATOM = eINSTANCE.getAtom();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOM__NAME = eINSTANCE.getAtom_Name();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOM__TERMS = eINSTANCE.getAtom_Terms();

    /**
     * The meta object literal for the '{@link net.certware.argument.analysis.analysisDSL.impl.TermsImpl <em>Terms</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.analysis.analysisDSL.impl.TermsImpl
     * @see net.certware.argument.analysis.analysisDSL.impl.AnalysisDSLPackageImpl#getTerms()
     * @generated
     */
    EClass TERMS = eINSTANCE.getTerms();

    /**
     * The meta object literal for the '<em><b>Car</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMS__CAR = eINSTANCE.getTerms_Car();

    /**
     * The meta object literal for the '<em><b>Cdr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMS__CDR = eINSTANCE.getTerms_Cdr();

    /**
     * The meta object literal for the '{@link net.certware.argument.analysis.analysisDSL.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.analysis.analysisDSL.impl.TermImpl
     * @see net.certware.argument.analysis.analysisDSL.impl.AnalysisDSLPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '<em><b>Cs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__CS = eINSTANCE.getTerm_Cs();

    /**
     * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__SIGN = eINSTANCE.getTerm_Sign();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__N = eINSTANCE.getTerm_N();

    /**
     * The meta object literal for the '<em><b>Fs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__FS = eINSTANCE.getTerm_Fs();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__TERMS = eINSTANCE.getTerm_Terms();

  }

} //AnalysisDSLPackage
