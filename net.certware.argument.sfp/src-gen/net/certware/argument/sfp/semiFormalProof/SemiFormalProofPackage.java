/**
 */
package net.certware.argument.sfp.semiFormalProof;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofFactory
 * @model kind="package"
 * @generated
 */
public interface SemiFormalProofPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "semiFormalProof";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.certware.net/argument/sfp/SemiFormalProof";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "semiFormalProof";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SemiFormalProofPackage eINSTANCE = net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl.init();

  /**
   * The meta object id for the '{@link net.certware.argument.sfp.semiFormalProof.impl.ProofImpl <em>Proof</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.sfp.semiFormalProof.impl.ProofImpl
   * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getProof()
   * @generated
   */
  int PROOF = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROOF__TITLE = 0;

  /**
   * The feature id for the '<em><b>Justifications</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROOF__JUSTIFICATIONS = 1;

  /**
   * The feature id for the '<em><b>Proof Steps</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROOF__PROOF_STEPS = 2;

  /**
   * The number of structural features of the '<em>Proof</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROOF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.argument.sfp.semiFormalProof.impl.JustificationsImpl <em>Justifications</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.sfp.semiFormalProof.impl.JustificationsImpl
   * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getJustifications()
   * @generated
   */
  int JUSTIFICATIONS = 1;

  /**
   * The feature id for the '<em><b>Justifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUSTIFICATIONS__JUSTIFICATIONS = 0;

  /**
   * The number of structural features of the '<em>Justifications</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUSTIFICATIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.argument.sfp.semiFormalProof.impl.JustificationImpl <em>Justification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.sfp.semiFormalProof.impl.JustificationImpl
   * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getJustification()
   * @generated
   */
  int JUSTIFICATION = 2;

  /**
   * The feature id for the '<em><b>Hypothesis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUSTIFICATION__HYPOTHESIS = 0;

  /**
   * The feature id for the '<em><b>Epsilon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUSTIFICATION__EPSILON = 1;

  /**
   * The feature id for the '<em><b>Numeral</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUSTIFICATION__NUMERAL = 2;

  /**
   * The feature id for the '<em><b>Assertion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUSTIFICATION__ASSERTION = 3;

  /**
   * The feature id for the '<em><b>Entailment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUSTIFICATION__ENTAILMENT = 4;

  /**
   * The number of structural features of the '<em>Justification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUSTIFICATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link net.certware.argument.sfp.semiFormalProof.impl.QuotedAssertionImpl <em>Quoted Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.sfp.semiFormalProof.impl.QuotedAssertionImpl
   * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getQuotedAssertion()
   * @generated
   */
  int QUOTED_ASSERTION = 3;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUOTED_ASSERTION__TEXT = 0;

  /**
   * The number of structural features of the '<em>Quoted Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUOTED_ASSERTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.argument.sfp.semiFormalProof.impl.EntailmentImpl <em>Entailment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.sfp.semiFormalProof.impl.EntailmentImpl
   * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getEntailment()
   * @generated
   */
  int ENTAILMENT = 4;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTAILMENT__HEAD = 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTAILMENT__TAIL = 1;

  /**
   * The number of structural features of the '<em>Entailment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTAILMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.argument.sfp.semiFormalProof.impl.ConjunctionImpl <em>Conjunction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.sfp.semiFormalProof.impl.ConjunctionImpl
   * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getConjunction()
   * @generated
   */
  int CONJUNCTION = 5;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION__LHS = 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION__RHS = 1;

  /**
   * The number of structural features of the '<em>Conjunction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.argument.sfp.semiFormalProof.impl.ProofStepsImpl <em>Proof Steps</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.sfp.semiFormalProof.impl.ProofStepsImpl
   * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getProofSteps()
   * @generated
   */
  int PROOF_STEPS = 6;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROOF_STEPS__STATEMENTS = 0;

  /**
   * The feature id for the '<em><b>Epsilon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROOF_STEPS__EPSILON = 1;

  /**
   * The number of structural features of the '<em>Proof Steps</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROOF_STEPS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.argument.sfp.semiFormalProof.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.sfp.semiFormalProof.impl.StatementImpl
   * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__ID = 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Justification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__JUSTIFICATION = 2;

  /**
   * The feature id for the '<em><b>Validation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__VALIDATION = 3;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.certware.argument.sfp.semiFormalProof.impl.ValidationImpl <em>Validation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.sfp.semiFormalProof.impl.ValidationImpl
   * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getValidation()
   * @generated
   */
  int VALIDATION = 8;

  /**
   * The feature id for the '<em><b>Author</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION__AUTHOR = 0;

  /**
   * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION__TIME_STAMP = 1;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION__STATE = 2;

  /**
   * The number of structural features of the '<em>Validation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.argument.sfp.semiFormalProof.ValidationKind <em>Validation Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.sfp.semiFormalProof.ValidationKind
   * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getValidationKind()
   * @generated
   */
  int VALIDATION_KIND = 9;


  /**
   * Returns the meta object for class '{@link net.certware.argument.sfp.semiFormalProof.Proof <em>Proof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proof</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Proof
   * @generated
   */
  EClass getProof();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.sfp.semiFormalProof.Proof#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Proof#getTitle()
   * @see #getProof()
   * @generated
   */
  EAttribute getProof_Title();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.sfp.semiFormalProof.Proof#getJustifications <em>Justifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Justifications</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Proof#getJustifications()
   * @see #getProof()
   * @generated
   */
  EReference getProof_Justifications();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.sfp.semiFormalProof.Proof#getProofSteps <em>Proof Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Proof Steps</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Proof#getProofSteps()
   * @see #getProof()
   * @generated
   */
  EReference getProof_ProofSteps();

  /**
   * Returns the meta object for class '{@link net.certware.argument.sfp.semiFormalProof.Justifications <em>Justifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Justifications</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Justifications
   * @generated
   */
  EClass getJustifications();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.argument.sfp.semiFormalProof.Justifications#getJustifications <em>Justifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Justifications</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Justifications#getJustifications()
   * @see #getJustifications()
   * @generated
   */
  EReference getJustifications_Justifications();

  /**
   * Returns the meta object for class '{@link net.certware.argument.sfp.semiFormalProof.Justification <em>Justification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Justification</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Justification
   * @generated
   */
  EClass getJustification();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.sfp.semiFormalProof.Justification#isHypothesis <em>Hypothesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hypothesis</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Justification#isHypothesis()
   * @see #getJustification()
   * @generated
   */
  EAttribute getJustification_Hypothesis();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.sfp.semiFormalProof.Justification#isEpsilon <em>Epsilon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Epsilon</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Justification#isEpsilon()
   * @see #getJustification()
   * @generated
   */
  EAttribute getJustification_Epsilon();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.sfp.semiFormalProof.Justification#getNumeral <em>Numeral</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Numeral</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Justification#getNumeral()
   * @see #getJustification()
   * @generated
   */
  EAttribute getJustification_Numeral();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.sfp.semiFormalProof.Justification#getAssertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assertion</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Justification#getAssertion()
   * @see #getJustification()
   * @generated
   */
  EReference getJustification_Assertion();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.sfp.semiFormalProof.Justification#getEntailment <em>Entailment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entailment</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Justification#getEntailment()
   * @see #getJustification()
   * @generated
   */
  EReference getJustification_Entailment();

  /**
   * Returns the meta object for class '{@link net.certware.argument.sfp.semiFormalProof.QuotedAssertion <em>Quoted Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quoted Assertion</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.QuotedAssertion
   * @generated
   */
  EClass getQuotedAssertion();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.sfp.semiFormalProof.QuotedAssertion#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.QuotedAssertion#getText()
   * @see #getQuotedAssertion()
   * @generated
   */
  EAttribute getQuotedAssertion_Text();

  /**
   * Returns the meta object for class '{@link net.certware.argument.sfp.semiFormalProof.Entailment <em>Entailment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entailment</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Entailment
   * @generated
   */
  EClass getEntailment();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.sfp.semiFormalProof.Entailment#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Entailment#getHead()
   * @see #getEntailment()
   * @generated
   */
  EReference getEntailment_Head();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.sfp.semiFormalProof.Entailment#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tail</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Entailment#getTail()
   * @see #getEntailment()
   * @generated
   */
  EAttribute getEntailment_Tail();

  /**
   * Returns the meta object for class '{@link net.certware.argument.sfp.semiFormalProof.Conjunction <em>Conjunction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conjunction</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Conjunction
   * @generated
   */
  EClass getConjunction();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.sfp.semiFormalProof.Conjunction#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lhs</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Conjunction#getLhs()
   * @see #getConjunction()
   * @generated
   */
  EAttribute getConjunction_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.sfp.semiFormalProof.Conjunction#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Conjunction#getRhs()
   * @see #getConjunction()
   * @generated
   */
  EReference getConjunction_Rhs();

  /**
   * Returns the meta object for class '{@link net.certware.argument.sfp.semiFormalProof.ProofSteps <em>Proof Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proof Steps</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.ProofSteps
   * @generated
   */
  EClass getProofSteps();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.argument.sfp.semiFormalProof.ProofSteps#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.ProofSteps#getStatements()
   * @see #getProofSteps()
   * @generated
   */
  EReference getProofSteps_Statements();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.sfp.semiFormalProof.ProofSteps#isEpsilon <em>Epsilon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Epsilon</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.ProofSteps#isEpsilon()
   * @see #getProofSteps()
   * @generated
   */
  EAttribute getProofSteps_Epsilon();

  /**
   * Returns the meta object for class '{@link net.certware.argument.sfp.semiFormalProof.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.sfp.semiFormalProof.Statement#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Statement#getId()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Id();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.sfp.semiFormalProof.Statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Statement</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Statement#getStatement()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Statement();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.sfp.semiFormalProof.Statement#getJustification <em>Justification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Justification</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Statement#getJustification()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Justification();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.sfp.semiFormalProof.Statement#getValidation <em>Validation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Validation</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Statement#getValidation()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Validation();

  /**
   * Returns the meta object for class '{@link net.certware.argument.sfp.semiFormalProof.Validation <em>Validation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Validation</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Validation
   * @generated
   */
  EClass getValidation();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.sfp.semiFormalProof.Validation#getAuthor <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Author</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Validation#getAuthor()
   * @see #getValidation()
   * @generated
   */
  EAttribute getValidation_Author();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.sfp.semiFormalProof.Validation#getTimeStamp <em>Time Stamp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time Stamp</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Validation#getTimeStamp()
   * @see #getValidation()
   * @generated
   */
  EAttribute getValidation_TimeStamp();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.sfp.semiFormalProof.Validation#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.Validation#getState()
   * @see #getValidation()
   * @generated
   */
  EAttribute getValidation_State();

  /**
   * Returns the meta object for enum '{@link net.certware.argument.sfp.semiFormalProof.ValidationKind <em>Validation Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Validation Kind</em>'.
   * @see net.certware.argument.sfp.semiFormalProof.ValidationKind
   * @generated
   */
  EEnum getValidationKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SemiFormalProofFactory getSemiFormalProofFactory();

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
     * The meta object literal for the '{@link net.certware.argument.sfp.semiFormalProof.impl.ProofImpl <em>Proof</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.sfp.semiFormalProof.impl.ProofImpl
     * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getProof()
     * @generated
     */
    EClass PROOF = eINSTANCE.getProof();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROOF__TITLE = eINSTANCE.getProof_Title();

    /**
     * The meta object literal for the '<em><b>Justifications</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROOF__JUSTIFICATIONS = eINSTANCE.getProof_Justifications();

    /**
     * The meta object literal for the '<em><b>Proof Steps</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROOF__PROOF_STEPS = eINSTANCE.getProof_ProofSteps();

    /**
     * The meta object literal for the '{@link net.certware.argument.sfp.semiFormalProof.impl.JustificationsImpl <em>Justifications</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.sfp.semiFormalProof.impl.JustificationsImpl
     * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getJustifications()
     * @generated
     */
    EClass JUSTIFICATIONS = eINSTANCE.getJustifications();

    /**
     * The meta object literal for the '<em><b>Justifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JUSTIFICATIONS__JUSTIFICATIONS = eINSTANCE.getJustifications_Justifications();

    /**
     * The meta object literal for the '{@link net.certware.argument.sfp.semiFormalProof.impl.JustificationImpl <em>Justification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.sfp.semiFormalProof.impl.JustificationImpl
     * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getJustification()
     * @generated
     */
    EClass JUSTIFICATION = eINSTANCE.getJustification();

    /**
     * The meta object literal for the '<em><b>Hypothesis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JUSTIFICATION__HYPOTHESIS = eINSTANCE.getJustification_Hypothesis();

    /**
     * The meta object literal for the '<em><b>Epsilon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JUSTIFICATION__EPSILON = eINSTANCE.getJustification_Epsilon();

    /**
     * The meta object literal for the '<em><b>Numeral</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JUSTIFICATION__NUMERAL = eINSTANCE.getJustification_Numeral();

    /**
     * The meta object literal for the '<em><b>Assertion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JUSTIFICATION__ASSERTION = eINSTANCE.getJustification_Assertion();

    /**
     * The meta object literal for the '<em><b>Entailment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JUSTIFICATION__ENTAILMENT = eINSTANCE.getJustification_Entailment();

    /**
     * The meta object literal for the '{@link net.certware.argument.sfp.semiFormalProof.impl.QuotedAssertionImpl <em>Quoted Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.sfp.semiFormalProof.impl.QuotedAssertionImpl
     * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getQuotedAssertion()
     * @generated
     */
    EClass QUOTED_ASSERTION = eINSTANCE.getQuotedAssertion();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUOTED_ASSERTION__TEXT = eINSTANCE.getQuotedAssertion_Text();

    /**
     * The meta object literal for the '{@link net.certware.argument.sfp.semiFormalProof.impl.EntailmentImpl <em>Entailment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.sfp.semiFormalProof.impl.EntailmentImpl
     * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getEntailment()
     * @generated
     */
    EClass ENTAILMENT = eINSTANCE.getEntailment();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTAILMENT__HEAD = eINSTANCE.getEntailment_Head();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTAILMENT__TAIL = eINSTANCE.getEntailment_Tail();

    /**
     * The meta object literal for the '{@link net.certware.argument.sfp.semiFormalProof.impl.ConjunctionImpl <em>Conjunction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.sfp.semiFormalProof.impl.ConjunctionImpl
     * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getConjunction()
     * @generated
     */
    EClass CONJUNCTION = eINSTANCE.getConjunction();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONJUNCTION__LHS = eINSTANCE.getConjunction_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONJUNCTION__RHS = eINSTANCE.getConjunction_Rhs();

    /**
     * The meta object literal for the '{@link net.certware.argument.sfp.semiFormalProof.impl.ProofStepsImpl <em>Proof Steps</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.sfp.semiFormalProof.impl.ProofStepsImpl
     * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getProofSteps()
     * @generated
     */
    EClass PROOF_STEPS = eINSTANCE.getProofSteps();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROOF_STEPS__STATEMENTS = eINSTANCE.getProofSteps_Statements();

    /**
     * The meta object literal for the '<em><b>Epsilon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROOF_STEPS__EPSILON = eINSTANCE.getProofSteps_Epsilon();

    /**
     * The meta object literal for the '{@link net.certware.argument.sfp.semiFormalProof.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.sfp.semiFormalProof.impl.StatementImpl
     * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__ID = eINSTANCE.getStatement_Id();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__STATEMENT = eINSTANCE.getStatement_Statement();

    /**
     * The meta object literal for the '<em><b>Justification</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__JUSTIFICATION = eINSTANCE.getStatement_Justification();

    /**
     * The meta object literal for the '<em><b>Validation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__VALIDATION = eINSTANCE.getStatement_Validation();

    /**
     * The meta object literal for the '{@link net.certware.argument.sfp.semiFormalProof.impl.ValidationImpl <em>Validation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.sfp.semiFormalProof.impl.ValidationImpl
     * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getValidation()
     * @generated
     */
    EClass VALIDATION = eINSTANCE.getValidation();

    /**
     * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALIDATION__AUTHOR = eINSTANCE.getValidation_Author();

    /**
     * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALIDATION__TIME_STAMP = eINSTANCE.getValidation_TimeStamp();

    /**
     * The meta object literal for the '<em><b>State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALIDATION__STATE = eINSTANCE.getValidation_State();

    /**
     * The meta object literal for the '{@link net.certware.argument.sfp.semiFormalProof.ValidationKind <em>Validation Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.sfp.semiFormalProof.ValidationKind
     * @see net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofPackageImpl#getValidationKind()
     * @generated
     */
    EEnum VALIDATION_KIND = eINSTANCE.getValidationKind();

  }

} //SemiFormalProofPackage
