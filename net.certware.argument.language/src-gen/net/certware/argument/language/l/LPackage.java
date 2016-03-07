/**
 */
package net.certware.argument.language.l;

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
 * @see net.certware.argument.language.l.LFactory
 * @model kind="package"
 * @generated
 */
public interface LPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "l";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.certware.net/argument/language/L";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "l";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LPackage eINSTANCE = net.certware.argument.language.l.impl.LPackageImpl.init();

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.ProgramImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.TermImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getTerm()
   * @generated
   */
  int TERM = 16;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.BasicTermImpl <em>Basic Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.BasicTermImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getBasicTerm()
   * @generated
   */
  int BASIC_TERM = 1;

  /**
   * The number of structural features of the '<em>Basic Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.VariableImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 2;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__IDENTIFIER = 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.TypedVariableImpl <em>Typed Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.TypedVariableImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getTypedVariable()
   * @generated
   */
  int TYPED_VARIABLE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_VARIABLE__NAME = BASIC_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_VARIABLE__VAR = BASIC_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Typed Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_VARIABLE_FEATURE_COUNT = BASIC_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.ArithmeticTermImpl <em>Arithmetic Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.ArithmeticTermImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getArithmeticTerm()
   * @generated
   */
  int ARITHMETIC_TERM = 4;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_TERM__TERM = BASIC_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_TERM__LHS = BASIC_TERM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_TERM__RHS = BASIC_TERM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Arithmetic Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_TERM_FEATURE_COUNT = BASIC_TERM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.ArithmeticLiteralImpl <em>Arithmetic Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.ArithmeticLiteralImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getArithmeticLiteral()
   * @generated
   */
  int ARITHMETIC_LITERAL = 5;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_LITERAL__V = 0;

  /**
   * The feature id for the '<em><b>Tv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_LITERAL__TV = 1;

  /**
   * The feature id for the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_LITERAL__CONST = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_LITERAL__VALUE = 3;

  /**
   * The number of structural features of the '<em>Arithmetic Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_LITERAL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.GroundTermImpl <em>Ground Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.GroundTermImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getGroundTerm()
   * @generated
   */
  int GROUND_TERM = 12;

  /**
   * The number of structural features of the '<em>Ground Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUND_TERM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.GroundArithmeticTermImpl <em>Ground Arithmetic Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.GroundArithmeticTermImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getGroundArithmeticTerm()
   * @generated
   */
  int GROUND_ARITHMETIC_TERM = 6;

  /**
   * The number of structural features of the '<em>Ground Arithmetic Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUND_ARITHMETIC_TERM_FEATURE_COUNT = GROUND_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.GroundArithmeticLiteralImpl <em>Ground Arithmetic Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.GroundArithmeticLiteralImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getGroundArithmeticLiteral()
   * @generated
   */
  int GROUND_ARITHMETIC_LITERAL = 7;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUND_ARITHMETIC_LITERAL__IDENTIFIER = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUND_ARITHMETIC_LITERAL__VALUE = 1;

  /**
   * The number of structural features of the '<em>Ground Arithmetic Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUND_ARITHMETIC_LITERAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.FunctionalTermImpl <em>Functional Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.FunctionalTermImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getFunctionalTerm()
   * @generated
   */
  int FUNCTIONAL_TERM = 8;

  /**
   * The number of structural features of the '<em>Functional Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTIONAL_TERM_FEATURE_COUNT = BASIC_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.GroundFunctionalTermImpl <em>Ground Functional Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.GroundFunctionalTermImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getGroundFunctionalTerm()
   * @generated
   */
  int GROUND_FUNCTIONAL_TERM = 9;

  /**
   * The number of structural features of the '<em>Ground Functional Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUND_FUNCTIONAL_TERM_FEATURE_COUNT = GROUND_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.BasicTermsImpl <em>Basic Terms</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.BasicTermsImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getBasicTerms()
   * @generated
   */
  int BASIC_TERMS = 10;

  /**
   * The feature id for the '<em><b>Car</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TERMS__CAR = 0;

  /**
   * The feature id for the '<em><b>Cdr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TERMS__CDR = 1;

  /**
   * The number of structural features of the '<em>Basic Terms</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TERMS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.GroundTermsImpl <em>Ground Terms</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.GroundTermsImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getGroundTerms()
   * @generated
   */
  int GROUND_TERMS = 11;

  /**
   * The feature id for the '<em><b>Car</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUND_TERMS__CAR = GROUND_FUNCTIONAL_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cdr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUND_TERMS__CDR = GROUND_FUNCTIONAL_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ground Terms</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUND_TERMS_FEATURE_COUNT = GROUND_FUNCTIONAL_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.QuantifiedTermImpl <em>Quantified Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.QuantifiedTermImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getQuantifiedTerm()
   * @generated
   */
  int QUANTIFIED_TERM = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_TERM__NAME = TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Quantified Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.UniversalQuantifiedTermImpl <em>Universal Quantified Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.UniversalQuantifiedTermImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getUniversalQuantifiedTerm()
   * @generated
   */
  int UNIVERSAL_QUANTIFIED_TERM = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSAL_QUANTIFIED_TERM__NAME = QUANTIFIED_TERM__NAME;

  /**
   * The number of structural features of the '<em>Universal Quantified Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSAL_QUANTIFIED_TERM_FEATURE_COUNT = QUANTIFIED_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.ExistentialQuantifiedTermImpl <em>Existential Quantified Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.ExistentialQuantifiedTermImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getExistentialQuantifiedTerm()
   * @generated
   */
  int EXISTENTIAL_QUANTIFIED_TERM = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTENTIAL_QUANTIFIED_TERM__NAME = QUANTIFIED_TERM__NAME;

  /**
   * The number of structural features of the '<em>Existential Quantified Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTENTIAL_QUANTIFIED_TERM_FEATURE_COUNT = QUANTIFIED_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.TermsImpl <em>Terms</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.TermsImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getTerms()
   * @generated
   */
  int TERMS = 17;

  /**
   * The feature id for the '<em><b>Car</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS__CAR = FUNCTIONAL_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cdr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS__CDR = FUNCTIONAL_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Terms</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FEATURE_COUNT = FUNCTIONAL_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.StatementImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 43;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.ConstantDeclarationImpl <em>Constant Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.ConstantDeclarationImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getConstantDeclaration()
   * @generated
   */
  int CONSTANT_DECLARATION = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION__CV = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constant Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.TypeIdImpl <em>Type Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.TypeIdImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getTypeId()
   * @generated
   */
  int TYPE_ID = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ID__NAME = 0;

  /**
   * The number of structural features of the '<em>Type Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.TypeDeclarationImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getTypeDeclaration()
   * @generated
   */
  int TYPE_DECLARATION = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__EXP = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.LimitImpl <em>Limit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.LimitImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getLimit()
   * @generated
   */
  int LIMIT = 21;

  /**
   * The feature id for the '<em><b>Cv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT__CV = 0;

  /**
   * The number of structural features of the '<em>Limit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.SetExpressionImpl <em>Set Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.SetExpressionImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getSetExpression()
   * @generated
   */
  int SET_EXPRESSION = 24;

  /**
   * The number of structural features of the '<em>Set Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.SetImpl <em>Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.SetImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getSet()
   * @generated
   */
  int SET = 22;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET__LHS = SET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET__TERMS = SET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_FEATURE_COUNT = SET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.RangeImpl <em>Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.RangeImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getRange()
   * @generated
   */
  int RANGE = 23;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__LHS = SET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__RHS = SET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FEATURE_COUNT = SET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.SetConstructImpl <em>Set Construct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.SetConstructImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getSetConstruct()
   * @generated
   */
  int SET_CONSTRUCT = 25;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_CONSTRUCT__LHS = SET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_CONSTRUCT__RHS = SET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Set Construct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_CONSTRUCT_FEATURE_COUNT = SET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.TVarsImpl <em>TVars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.TVarsImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getTVars()
   * @generated
   */
  int TVARS = 26;

  /**
   * The feature id for the '<em><b>Car</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TVARS__CAR = 0;

  /**
   * The feature id for the '<em><b>Cdr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TVARS__CDR = 1;

  /**
   * The number of structural features of the '<em>TVars</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TVARS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.TVarImpl <em>TVar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.TVarImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getTVar()
   * @generated
   */
  int TVAR = 27;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TVAR__VAR = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TVAR__ID = 1;

  /**
   * The number of structural features of the '<em>TVar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TVAR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.SentenceImpl <em>Sentence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.SentenceImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getSentence()
   * @generated
   */
  int SENTENCE = 33;

  /**
   * The number of structural features of the '<em>Sentence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.SentenceExprImpl <em>Sentence Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.SentenceExprImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getSentenceExpr()
   * @generated
   */
  int SENTENCE_EXPR = 34;

  /**
   * The number of structural features of the '<em>Sentence Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE_EXPR_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.SentenceLiteralImpl <em>Sentence Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.SentenceLiteralImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getSentenceLiteral()
   * @generated
   */
  int SENTENCE_LITERAL = 35;

  /**
   * The number of structural features of the '<em>Sentence Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE_LITERAL_FEATURE_COUNT = SENTENCE_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.AtomImpl <em>Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.AtomImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getAtom()
   * @generated
   */
  int ATOM = 28;

  /**
   * The number of structural features of the '<em>Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_FEATURE_COUNT = SENTENCE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.PredicateAtomImpl <em>Predicate Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.PredicateAtomImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getPredicateAtom()
   * @generated
   */
  int PREDICATE_ATOM = 29;

  /**
   * The feature id for the '<em><b>Fid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_ATOM__FID = ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_ATOM__TERMS = ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Predicate Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.BasicAtomImpl <em>Basic Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.BasicAtomImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getBasicAtom()
   * @generated
   */
  int BASIC_ATOM = 32;

  /**
   * The number of structural features of the '<em>Basic Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_ATOM_FEATURE_COUNT = SENTENCE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.BasicPredicateAtomImpl <em>Basic Predicate Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.BasicPredicateAtomImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getBasicPredicateAtom()
   * @generated
   */
  int BASIC_PREDICATE_ATOM = 30;

  /**
   * The feature id for the '<em><b>Fid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_PREDICATE_ATOM__FID = BASIC_ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_PREDICATE_ATOM__TERMS = BASIC_ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Basic Predicate Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_PREDICATE_ATOM_FEATURE_COUNT = BASIC_ATOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.BuiltInAtomImpl <em>Built In Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.BuiltInAtomImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getBuiltInAtom()
   * @generated
   */
  int BUILT_IN_ATOM = 31;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_ATOM__LHS = ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_ATOM__OP = ATOM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_ATOM__RHS = ATOM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Built In Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.HeadImpl <em>Head</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.HeadImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getHead()
   * @generated
   */
  int HEAD = 42;

  /**
   * The number of structural features of the '<em>Head</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEAD_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.pSentenceImpl <em>pSentence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.pSentenceImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getpSentence()
   * @generated
   */
  int PSENTENCE = 36;

  /**
   * The number of structural features of the '<em>pSentence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSENTENCE_FEATURE_COUNT = HEAD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.pSentenceLiteralImpl <em>pSentence Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.pSentenceLiteralImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getpSentenceLiteral()
   * @generated
   */
  int PSENTENCE_LITERAL = 37;

  /**
   * The number of structural features of the '<em>pSentence Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSENTENCE_LITERAL_FEATURE_COUNT = SENTENCE_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.MaybeLiteralImpl <em>Maybe Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.MaybeLiteralImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getMaybeLiteral()
   * @generated
   */
  int MAYBE_LITERAL = 38;

  /**
   * The number of structural features of the '<em>Maybe Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAYBE_LITERAL_FEATURE_COUNT = HEAD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.CardinalityConstraintImpl <em>Cardinality Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.CardinalityConstraintImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getCardinalityConstraint()
   * @generated
   */
  int CARDINALITY_CONSTRAINT = 39;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY_CONSTRAINT__LHS = HEAD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Atom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY_CONSTRAINT__ATOM = HEAD_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY_CONSTRAINT__RHS = HEAD_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Cardinality Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY_CONSTRAINT_FEATURE_COUNT = HEAD_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.BoundImpl <em>Bound</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.BoundImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getBound()
   * @generated
   */
  int BOUND = 40;

  /**
   * The feature id for the '<em><b>Av</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUND__AV = 0;

  /**
   * The number of structural features of the '<em>Bound</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOUND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.RuleImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getRule()
   * @generated
   */
  int RULE = 41;

  /**
   * The feature id for the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__HEAD = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__CONDITION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__BODY = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.AdditionImpl <em>Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.AdditionImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getAddition()
   * @generated
   */
  int ADDITION = 44;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__TERM = ARITHMETIC_TERM__TERM;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__LHS = ARITHMETIC_TERM__LHS;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__RHS = ARITHMETIC_TERM__RHS;

  /**
   * The number of structural features of the '<em>Addition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_FEATURE_COUNT = ARITHMETIC_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.MultiplicationImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getMultiplication()
   * @generated
   */
  int MULTIPLICATION = 45;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__TERM = ARITHMETIC_TERM__TERM;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__LHS = ARITHMETIC_TERM__LHS;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__RHS = ARITHMETIC_TERM__RHS;

  /**
   * The number of structural features of the '<em>Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_FEATURE_COUNT = ARITHMETIC_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.GroundAdditionImpl <em>Ground Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.GroundAdditionImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getGroundAddition()
   * @generated
   */
  int GROUND_ADDITION = 46;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUND_ADDITION__TERM = ARITHMETIC_TERM__TERM;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUND_ADDITION__LHS = ARITHMETIC_TERM__LHS;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUND_ADDITION__RHS = ARITHMETIC_TERM__RHS;

  /**
   * The number of structural features of the '<em>Ground Addition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUND_ADDITION_FEATURE_COUNT = ARITHMETIC_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.GroundMultiplicationImpl <em>Ground Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.GroundMultiplicationImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getGroundMultiplication()
   * @generated
   */
  int GROUND_MULTIPLICATION = 47;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUND_MULTIPLICATION__TERM = ARITHMETIC_TERM__TERM;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUND_MULTIPLICATION__LHS = ARITHMETIC_TERM__LHS;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUND_MULTIPLICATION__RHS = ARITHMETIC_TERM__RHS;

  /**
   * The number of structural features of the '<em>Ground Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUND_MULTIPLICATION_FEATURE_COUNT = ARITHMETIC_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.SetAdditionImpl <em>Set Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.SetAdditionImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getSetAddition()
   * @generated
   */
  int SET_ADDITION = 48;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_ADDITION__LEFT = SET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_ADDITION__RIGHT = SET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Set Addition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_ADDITION_FEATURE_COUNT = SET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.SetMultiplicationImpl <em>Set Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.SetMultiplicationImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getSetMultiplication()
   * @generated
   */
  int SET_MULTIPLICATION = 49;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_MULTIPLICATION__LEFT = SET_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_MULTIPLICATION__RIGHT = SET_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Set Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_MULTIPLICATION_FEATURE_COUNT = SET_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.OrSentenceImpl <em>Or Sentence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.OrSentenceImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getOrSentence()
   * @generated
   */
  int OR_SENTENCE = 50;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_SENTENCE__LEFT = SENTENCE_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_SENTENCE__RIGHT = SENTENCE_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or Sentence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_SENTENCE_FEATURE_COUNT = SENTENCE_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.AndSentenceImpl <em>And Sentence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.AndSentenceImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getAndSentence()
   * @generated
   */
  int AND_SENTENCE = 51;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_SENTENCE__LEFT = SENTENCE_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_SENTENCE__RIGHT = SENTENCE_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And Sentence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_SENTENCE_FEATURE_COUNT = SENTENCE_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.pOrSentenceImpl <em>pOr Sentence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.pOrSentenceImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getpOrSentence()
   * @generated
   */
  int POR_SENTENCE = 52;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POR_SENTENCE__LEFT = SENTENCE_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POR_SENTENCE__RIGHT = SENTENCE_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>pOr Sentence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POR_SENTENCE_FEATURE_COUNT = SENTENCE_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.argument.language.l.impl.pAndSentenceImpl <em>pAnd Sentence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.argument.language.l.impl.pAndSentenceImpl
   * @see net.certware.argument.language.l.impl.LPackageImpl#getpAndSentence()
   * @generated
   */
  int PAND_SENTENCE = 53;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAND_SENTENCE__LEFT = SENTENCE_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAND_SENTENCE__RIGHT = SENTENCE_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>pAnd Sentence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAND_SENTENCE_FEATURE_COUNT = SENTENCE_EXPR_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see net.certware.argument.language.l.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.argument.language.l.Program#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see net.certware.argument.language.l.Program#getStatements()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Statements();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.BasicTerm <em>Basic Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Term</em>'.
   * @see net.certware.argument.language.l.BasicTerm
   * @generated
   */
  EClass getBasicTerm();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see net.certware.argument.language.l.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.language.l.Variable#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see net.certware.argument.language.l.Variable#getIdentifier()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Identifier();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.TypedVariable <em>Typed Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typed Variable</em>'.
   * @see net.certware.argument.language.l.TypedVariable
   * @generated
   */
  EClass getTypedVariable();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.language.l.TypedVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.argument.language.l.TypedVariable#getName()
   * @see #getTypedVariable()
   * @generated
   */
  EAttribute getTypedVariable_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.TypedVariable#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see net.certware.argument.language.l.TypedVariable#getVar()
   * @see #getTypedVariable()
   * @generated
   */
  EReference getTypedVariable_Var();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.ArithmeticTerm <em>Arithmetic Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arithmetic Term</em>'.
   * @see net.certware.argument.language.l.ArithmeticTerm
   * @generated
   */
  EClass getArithmeticTerm();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.ArithmeticTerm#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see net.certware.argument.language.l.ArithmeticTerm#getTerm()
   * @see #getArithmeticTerm()
   * @generated
   */
  EReference getArithmeticTerm_Term();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.ArithmeticTerm#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see net.certware.argument.language.l.ArithmeticTerm#getLhs()
   * @see #getArithmeticTerm()
   * @generated
   */
  EReference getArithmeticTerm_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.ArithmeticTerm#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see net.certware.argument.language.l.ArithmeticTerm#getRhs()
   * @see #getArithmeticTerm()
   * @generated
   */
  EReference getArithmeticTerm_Rhs();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.ArithmeticLiteral <em>Arithmetic Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arithmetic Literal</em>'.
   * @see net.certware.argument.language.l.ArithmeticLiteral
   * @generated
   */
  EClass getArithmeticLiteral();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.ArithmeticLiteral#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V</em>'.
   * @see net.certware.argument.language.l.ArithmeticLiteral#getV()
   * @see #getArithmeticLiteral()
   * @generated
   */
  EReference getArithmeticLiteral_V();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.ArithmeticLiteral#getTv <em>Tv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tv</em>'.
   * @see net.certware.argument.language.l.ArithmeticLiteral#getTv()
   * @see #getArithmeticLiteral()
   * @generated
   */
  EReference getArithmeticLiteral_Tv();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.language.l.ArithmeticLiteral#getConst <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const</em>'.
   * @see net.certware.argument.language.l.ArithmeticLiteral#getConst()
   * @see #getArithmeticLiteral()
   * @generated
   */
  EAttribute getArithmeticLiteral_Const();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.language.l.ArithmeticLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.certware.argument.language.l.ArithmeticLiteral#getValue()
   * @see #getArithmeticLiteral()
   * @generated
   */
  EAttribute getArithmeticLiteral_Value();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.GroundArithmeticTerm <em>Ground Arithmetic Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ground Arithmetic Term</em>'.
   * @see net.certware.argument.language.l.GroundArithmeticTerm
   * @generated
   */
  EClass getGroundArithmeticTerm();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.GroundArithmeticLiteral <em>Ground Arithmetic Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ground Arithmetic Literal</em>'.
   * @see net.certware.argument.language.l.GroundArithmeticLiteral
   * @generated
   */
  EClass getGroundArithmeticLiteral();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.language.l.GroundArithmeticLiteral#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see net.certware.argument.language.l.GroundArithmeticLiteral#getIdentifier()
   * @see #getGroundArithmeticLiteral()
   * @generated
   */
  EAttribute getGroundArithmeticLiteral_Identifier();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.language.l.GroundArithmeticLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.certware.argument.language.l.GroundArithmeticLiteral#getValue()
   * @see #getGroundArithmeticLiteral()
   * @generated
   */
  EAttribute getGroundArithmeticLiteral_Value();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.FunctionalTerm <em>Functional Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Functional Term</em>'.
   * @see net.certware.argument.language.l.FunctionalTerm
   * @generated
   */
  EClass getFunctionalTerm();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.GroundFunctionalTerm <em>Ground Functional Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ground Functional Term</em>'.
   * @see net.certware.argument.language.l.GroundFunctionalTerm
   * @generated
   */
  EClass getGroundFunctionalTerm();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.BasicTerms <em>Basic Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Terms</em>'.
   * @see net.certware.argument.language.l.BasicTerms
   * @generated
   */
  EClass getBasicTerms();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.BasicTerms#getCar <em>Car</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Car</em>'.
   * @see net.certware.argument.language.l.BasicTerms#getCar()
   * @see #getBasicTerms()
   * @generated
   */
  EReference getBasicTerms_Car();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.argument.language.l.BasicTerms#getCdr <em>Cdr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cdr</em>'.
   * @see net.certware.argument.language.l.BasicTerms#getCdr()
   * @see #getBasicTerms()
   * @generated
   */
  EReference getBasicTerms_Cdr();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.GroundTerms <em>Ground Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ground Terms</em>'.
   * @see net.certware.argument.language.l.GroundTerms
   * @generated
   */
  EClass getGroundTerms();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.GroundTerms#getCar <em>Car</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Car</em>'.
   * @see net.certware.argument.language.l.GroundTerms#getCar()
   * @see #getGroundTerms()
   * @generated
   */
  EReference getGroundTerms_Car();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.argument.language.l.GroundTerms#getCdr <em>Cdr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cdr</em>'.
   * @see net.certware.argument.language.l.GroundTerms#getCdr()
   * @see #getGroundTerms()
   * @generated
   */
  EReference getGroundTerms_Cdr();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.GroundTerm <em>Ground Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ground Term</em>'.
   * @see net.certware.argument.language.l.GroundTerm
   * @generated
   */
  EClass getGroundTerm();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.QuantifiedTerm <em>Quantified Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantified Term</em>'.
   * @see net.certware.argument.language.l.QuantifiedTerm
   * @generated
   */
  EClass getQuantifiedTerm();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.QuantifiedTerm#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see net.certware.argument.language.l.QuantifiedTerm#getName()
   * @see #getQuantifiedTerm()
   * @generated
   */
  EReference getQuantifiedTerm_Name();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.UniversalQuantifiedTerm <em>Universal Quantified Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Universal Quantified Term</em>'.
   * @see net.certware.argument.language.l.UniversalQuantifiedTerm
   * @generated
   */
  EClass getUniversalQuantifiedTerm();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.ExistentialQuantifiedTerm <em>Existential Quantified Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Existential Quantified Term</em>'.
   * @see net.certware.argument.language.l.ExistentialQuantifiedTerm
   * @generated
   */
  EClass getExistentialQuantifiedTerm();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see net.certware.argument.language.l.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.Terms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terms</em>'.
   * @see net.certware.argument.language.l.Terms
   * @generated
   */
  EClass getTerms();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.Terms#getCar <em>Car</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Car</em>'.
   * @see net.certware.argument.language.l.Terms#getCar()
   * @see #getTerms()
   * @generated
   */
  EReference getTerms_Car();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.argument.language.l.Terms#getCdr <em>Cdr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cdr</em>'.
   * @see net.certware.argument.language.l.Terms#getCdr()
   * @see #getTerms()
   * @generated
   */
  EReference getTerms_Cdr();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.ConstantDeclaration <em>Constant Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Declaration</em>'.
   * @see net.certware.argument.language.l.ConstantDeclaration
   * @generated
   */
  EClass getConstantDeclaration();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.language.l.ConstantDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.argument.language.l.ConstantDeclaration#getName()
   * @see #getConstantDeclaration()
   * @generated
   */
  EAttribute getConstantDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.ConstantDeclaration#getCv <em>Cv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cv</em>'.
   * @see net.certware.argument.language.l.ConstantDeclaration#getCv()
   * @see #getConstantDeclaration()
   * @generated
   */
  EReference getConstantDeclaration_Cv();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.TypeId <em>Type Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Id</em>'.
   * @see net.certware.argument.language.l.TypeId
   * @generated
   */
  EClass getTypeId();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.language.l.TypeId#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.argument.language.l.TypeId#getName()
   * @see #getTypeId()
   * @generated
   */
  EAttribute getTypeId_Name();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.TypeDeclaration <em>Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Declaration</em>'.
   * @see net.certware.argument.language.l.TypeDeclaration
   * @generated
   */
  EClass getTypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.TypeDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see net.certware.argument.language.l.TypeDeclaration#getName()
   * @see #getTypeDeclaration()
   * @generated
   */
  EReference getTypeDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.TypeDeclaration#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see net.certware.argument.language.l.TypeDeclaration#getExp()
   * @see #getTypeDeclaration()
   * @generated
   */
  EReference getTypeDeclaration_Exp();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.Limit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Limit</em>'.
   * @see net.certware.argument.language.l.Limit
   * @generated
   */
  EClass getLimit();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.Limit#getCv <em>Cv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cv</em>'.
   * @see net.certware.argument.language.l.Limit#getCv()
   * @see #getLimit()
   * @generated
   */
  EReference getLimit_Cv();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.Set <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set</em>'.
   * @see net.certware.argument.language.l.Set
   * @generated
   */
  EClass getSet();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.language.l.Set#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lhs</em>'.
   * @see net.certware.argument.language.l.Set#getLhs()
   * @see #getSet()
   * @generated
   */
  EAttribute getSet_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.Set#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Terms</em>'.
   * @see net.certware.argument.language.l.Set#getTerms()
   * @see #getSet()
   * @generated
   */
  EReference getSet_Terms();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range</em>'.
   * @see net.certware.argument.language.l.Range
   * @generated
   */
  EClass getRange();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.Range#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see net.certware.argument.language.l.Range#getLhs()
   * @see #getRange()
   * @generated
   */
  EReference getRange_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.Range#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see net.certware.argument.language.l.Range#getRhs()
   * @see #getRange()
   * @generated
   */
  EReference getRange_Rhs();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.SetExpression <em>Set Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Expression</em>'.
   * @see net.certware.argument.language.l.SetExpression
   * @generated
   */
  EClass getSetExpression();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.SetConstruct <em>Set Construct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Construct</em>'.
   * @see net.certware.argument.language.l.SetConstruct
   * @generated
   */
  EClass getSetConstruct();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.SetConstruct#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see net.certware.argument.language.l.SetConstruct#getLhs()
   * @see #getSetConstruct()
   * @generated
   */
  EReference getSetConstruct_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.SetConstruct#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see net.certware.argument.language.l.SetConstruct#getRhs()
   * @see #getSetConstruct()
   * @generated
   */
  EReference getSetConstruct_Rhs();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.TVars <em>TVars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TVars</em>'.
   * @see net.certware.argument.language.l.TVars
   * @generated
   */
  EClass getTVars();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.TVars#getCar <em>Car</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Car</em>'.
   * @see net.certware.argument.language.l.TVars#getCar()
   * @see #getTVars()
   * @generated
   */
  EReference getTVars_Car();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.argument.language.l.TVars#getCdr <em>Cdr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cdr</em>'.
   * @see net.certware.argument.language.l.TVars#getCdr()
   * @see #getTVars()
   * @generated
   */
  EReference getTVars_Cdr();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.TVar <em>TVar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TVar</em>'.
   * @see net.certware.argument.language.l.TVar
   * @generated
   */
  EClass getTVar();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.TVar#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see net.certware.argument.language.l.TVar#getVar()
   * @see #getTVar()
   * @generated
   */
  EReference getTVar_Var();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.TVar#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see net.certware.argument.language.l.TVar#getId()
   * @see #getTVar()
   * @generated
   */
  EReference getTVar_Id();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom</em>'.
   * @see net.certware.argument.language.l.Atom
   * @generated
   */
  EClass getAtom();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.PredicateAtom <em>Predicate Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Atom</em>'.
   * @see net.certware.argument.language.l.PredicateAtom
   * @generated
   */
  EClass getPredicateAtom();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.language.l.PredicateAtom#getFid <em>Fid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fid</em>'.
   * @see net.certware.argument.language.l.PredicateAtom#getFid()
   * @see #getPredicateAtom()
   * @generated
   */
  EAttribute getPredicateAtom_Fid();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.PredicateAtom#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Terms</em>'.
   * @see net.certware.argument.language.l.PredicateAtom#getTerms()
   * @see #getPredicateAtom()
   * @generated
   */
  EReference getPredicateAtom_Terms();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.BasicPredicateAtom <em>Basic Predicate Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Predicate Atom</em>'.
   * @see net.certware.argument.language.l.BasicPredicateAtom
   * @generated
   */
  EClass getBasicPredicateAtom();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.language.l.BasicPredicateAtom#getFid <em>Fid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fid</em>'.
   * @see net.certware.argument.language.l.BasicPredicateAtom#getFid()
   * @see #getBasicPredicateAtom()
   * @generated
   */
  EAttribute getBasicPredicateAtom_Fid();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.BasicPredicateAtom#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Terms</em>'.
   * @see net.certware.argument.language.l.BasicPredicateAtom#getTerms()
   * @see #getBasicPredicateAtom()
   * @generated
   */
  EReference getBasicPredicateAtom_Terms();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.BuiltInAtom <em>Built In Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Atom</em>'.
   * @see net.certware.argument.language.l.BuiltInAtom
   * @generated
   */
  EClass getBuiltInAtom();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.BuiltInAtom#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see net.certware.argument.language.l.BuiltInAtom#getLhs()
   * @see #getBuiltInAtom()
   * @generated
   */
  EReference getBuiltInAtom_Lhs();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.language.l.BuiltInAtom#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see net.certware.argument.language.l.BuiltInAtom#getOp()
   * @see #getBuiltInAtom()
   * @generated
   */
  EAttribute getBuiltInAtom_Op();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.BuiltInAtom#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see net.certware.argument.language.l.BuiltInAtom#getRhs()
   * @see #getBuiltInAtom()
   * @generated
   */
  EReference getBuiltInAtom_Rhs();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.BasicAtom <em>Basic Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Atom</em>'.
   * @see net.certware.argument.language.l.BasicAtom
   * @generated
   */
  EClass getBasicAtom();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.Sentence <em>Sentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sentence</em>'.
   * @see net.certware.argument.language.l.Sentence
   * @generated
   */
  EClass getSentence();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.SentenceExpr <em>Sentence Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sentence Expr</em>'.
   * @see net.certware.argument.language.l.SentenceExpr
   * @generated
   */
  EClass getSentenceExpr();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.SentenceLiteral <em>Sentence Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sentence Literal</em>'.
   * @see net.certware.argument.language.l.SentenceLiteral
   * @generated
   */
  EClass getSentenceLiteral();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.pSentence <em>pSentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>pSentence</em>'.
   * @see net.certware.argument.language.l.pSentence
   * @generated
   */
  EClass getpSentence();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.pSentenceLiteral <em>pSentence Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>pSentence Literal</em>'.
   * @see net.certware.argument.language.l.pSentenceLiteral
   * @generated
   */
  EClass getpSentenceLiteral();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.MaybeLiteral <em>Maybe Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Maybe Literal</em>'.
   * @see net.certware.argument.language.l.MaybeLiteral
   * @generated
   */
  EClass getMaybeLiteral();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.CardinalityConstraint <em>Cardinality Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cardinality Constraint</em>'.
   * @see net.certware.argument.language.l.CardinalityConstraint
   * @generated
   */
  EClass getCardinalityConstraint();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.CardinalityConstraint#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see net.certware.argument.language.l.CardinalityConstraint#getLhs()
   * @see #getCardinalityConstraint()
   * @generated
   */
  EReference getCardinalityConstraint_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.CardinalityConstraint#getAtom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atom</em>'.
   * @see net.certware.argument.language.l.CardinalityConstraint#getAtom()
   * @see #getCardinalityConstraint()
   * @generated
   */
  EReference getCardinalityConstraint_Atom();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.CardinalityConstraint#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see net.certware.argument.language.l.CardinalityConstraint#getRhs()
   * @see #getCardinalityConstraint()
   * @generated
   */
  EReference getCardinalityConstraint_Rhs();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.Bound <em>Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bound</em>'.
   * @see net.certware.argument.language.l.Bound
   * @generated
   */
  EClass getBound();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.Bound#getAv <em>Av</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Av</em>'.
   * @see net.certware.argument.language.l.Bound#getAv()
   * @see #getBound()
   * @generated
   */
  EReference getBound_Av();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see net.certware.argument.language.l.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.Rule#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head</em>'.
   * @see net.certware.argument.language.l.Rule#getHead()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Head();

  /**
   * Returns the meta object for the attribute '{@link net.certware.argument.language.l.Rule#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see net.certware.argument.language.l.Rule#getCondition()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Condition();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.Rule#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see net.certware.argument.language.l.Rule#getBody()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Body();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.Head <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Head</em>'.
   * @see net.certware.argument.language.l.Head
   * @generated
   */
  EClass getHead();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see net.certware.argument.language.l.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition</em>'.
   * @see net.certware.argument.language.l.Addition
   * @generated
   */
  EClass getAddition();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication</em>'.
   * @see net.certware.argument.language.l.Multiplication
   * @generated
   */
  EClass getMultiplication();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.GroundAddition <em>Ground Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ground Addition</em>'.
   * @see net.certware.argument.language.l.GroundAddition
   * @generated
   */
  EClass getGroundAddition();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.GroundMultiplication <em>Ground Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ground Multiplication</em>'.
   * @see net.certware.argument.language.l.GroundMultiplication
   * @generated
   */
  EClass getGroundMultiplication();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.SetAddition <em>Set Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Addition</em>'.
   * @see net.certware.argument.language.l.SetAddition
   * @generated
   */
  EClass getSetAddition();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.SetAddition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.certware.argument.language.l.SetAddition#getLeft()
   * @see #getSetAddition()
   * @generated
   */
  EReference getSetAddition_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.SetAddition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.certware.argument.language.l.SetAddition#getRight()
   * @see #getSetAddition()
   * @generated
   */
  EReference getSetAddition_Right();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.SetMultiplication <em>Set Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Multiplication</em>'.
   * @see net.certware.argument.language.l.SetMultiplication
   * @generated
   */
  EClass getSetMultiplication();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.SetMultiplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.certware.argument.language.l.SetMultiplication#getLeft()
   * @see #getSetMultiplication()
   * @generated
   */
  EReference getSetMultiplication_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.SetMultiplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.certware.argument.language.l.SetMultiplication#getRight()
   * @see #getSetMultiplication()
   * @generated
   */
  EReference getSetMultiplication_Right();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.OrSentence <em>Or Sentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Sentence</em>'.
   * @see net.certware.argument.language.l.OrSentence
   * @generated
   */
  EClass getOrSentence();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.OrSentence#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.certware.argument.language.l.OrSentence#getLeft()
   * @see #getOrSentence()
   * @generated
   */
  EReference getOrSentence_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.OrSentence#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.certware.argument.language.l.OrSentence#getRight()
   * @see #getOrSentence()
   * @generated
   */
  EReference getOrSentence_Right();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.AndSentence <em>And Sentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Sentence</em>'.
   * @see net.certware.argument.language.l.AndSentence
   * @generated
   */
  EClass getAndSentence();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.AndSentence#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.certware.argument.language.l.AndSentence#getLeft()
   * @see #getAndSentence()
   * @generated
   */
  EReference getAndSentence_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.AndSentence#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.certware.argument.language.l.AndSentence#getRight()
   * @see #getAndSentence()
   * @generated
   */
  EReference getAndSentence_Right();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.pOrSentence <em>pOr Sentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>pOr Sentence</em>'.
   * @see net.certware.argument.language.l.pOrSentence
   * @generated
   */
  EClass getpOrSentence();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.pOrSentence#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.certware.argument.language.l.pOrSentence#getLeft()
   * @see #getpOrSentence()
   * @generated
   */
  EReference getpOrSentence_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.pOrSentence#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.certware.argument.language.l.pOrSentence#getRight()
   * @see #getpOrSentence()
   * @generated
   */
  EReference getpOrSentence_Right();

  /**
   * Returns the meta object for class '{@link net.certware.argument.language.l.pAndSentence <em>pAnd Sentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>pAnd Sentence</em>'.
   * @see net.certware.argument.language.l.pAndSentence
   * @generated
   */
  EClass getpAndSentence();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.pAndSentence#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.certware.argument.language.l.pAndSentence#getLeft()
   * @see #getpAndSentence()
   * @generated
   */
  EReference getpAndSentence_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.argument.language.l.pAndSentence#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.certware.argument.language.l.pAndSentence#getRight()
   * @see #getpAndSentence()
   * @generated
   */
  EReference getpAndSentence_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LFactory getLFactory();

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
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.ProgramImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__STATEMENTS = eINSTANCE.getProgram_Statements();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.BasicTermImpl <em>Basic Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.BasicTermImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getBasicTerm()
     * @generated
     */
    EClass BASIC_TERM = eINSTANCE.getBasicTerm();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.VariableImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__IDENTIFIER = eINSTANCE.getVariable_Identifier();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.TypedVariableImpl <em>Typed Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.TypedVariableImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getTypedVariable()
     * @generated
     */
    EClass TYPED_VARIABLE = eINSTANCE.getTypedVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPED_VARIABLE__NAME = eINSTANCE.getTypedVariable_Name();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPED_VARIABLE__VAR = eINSTANCE.getTypedVariable_Var();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.ArithmeticTermImpl <em>Arithmetic Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.ArithmeticTermImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getArithmeticTerm()
     * @generated
     */
    EClass ARITHMETIC_TERM = eINSTANCE.getArithmeticTerm();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARITHMETIC_TERM__TERM = eINSTANCE.getArithmeticTerm_Term();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARITHMETIC_TERM__LHS = eINSTANCE.getArithmeticTerm_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARITHMETIC_TERM__RHS = eINSTANCE.getArithmeticTerm_Rhs();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.ArithmeticLiteralImpl <em>Arithmetic Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.ArithmeticLiteralImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getArithmeticLiteral()
     * @generated
     */
    EClass ARITHMETIC_LITERAL = eINSTANCE.getArithmeticLiteral();

    /**
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARITHMETIC_LITERAL__V = eINSTANCE.getArithmeticLiteral_V();

    /**
     * The meta object literal for the '<em><b>Tv</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARITHMETIC_LITERAL__TV = eINSTANCE.getArithmeticLiteral_Tv();

    /**
     * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARITHMETIC_LITERAL__CONST = eINSTANCE.getArithmeticLiteral_Const();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARITHMETIC_LITERAL__VALUE = eINSTANCE.getArithmeticLiteral_Value();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.GroundArithmeticTermImpl <em>Ground Arithmetic Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.GroundArithmeticTermImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getGroundArithmeticTerm()
     * @generated
     */
    EClass GROUND_ARITHMETIC_TERM = eINSTANCE.getGroundArithmeticTerm();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.GroundArithmeticLiteralImpl <em>Ground Arithmetic Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.GroundArithmeticLiteralImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getGroundArithmeticLiteral()
     * @generated
     */
    EClass GROUND_ARITHMETIC_LITERAL = eINSTANCE.getGroundArithmeticLiteral();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUND_ARITHMETIC_LITERAL__IDENTIFIER = eINSTANCE.getGroundArithmeticLiteral_Identifier();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUND_ARITHMETIC_LITERAL__VALUE = eINSTANCE.getGroundArithmeticLiteral_Value();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.FunctionalTermImpl <em>Functional Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.FunctionalTermImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getFunctionalTerm()
     * @generated
     */
    EClass FUNCTIONAL_TERM = eINSTANCE.getFunctionalTerm();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.GroundFunctionalTermImpl <em>Ground Functional Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.GroundFunctionalTermImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getGroundFunctionalTerm()
     * @generated
     */
    EClass GROUND_FUNCTIONAL_TERM = eINSTANCE.getGroundFunctionalTerm();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.BasicTermsImpl <em>Basic Terms</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.BasicTermsImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getBasicTerms()
     * @generated
     */
    EClass BASIC_TERMS = eINSTANCE.getBasicTerms();

    /**
     * The meta object literal for the '<em><b>Car</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TERMS__CAR = eINSTANCE.getBasicTerms_Car();

    /**
     * The meta object literal for the '<em><b>Cdr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_TERMS__CDR = eINSTANCE.getBasicTerms_Cdr();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.GroundTermsImpl <em>Ground Terms</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.GroundTermsImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getGroundTerms()
     * @generated
     */
    EClass GROUND_TERMS = eINSTANCE.getGroundTerms();

    /**
     * The meta object literal for the '<em><b>Car</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUND_TERMS__CAR = eINSTANCE.getGroundTerms_Car();

    /**
     * The meta object literal for the '<em><b>Cdr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUND_TERMS__CDR = eINSTANCE.getGroundTerms_Cdr();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.GroundTermImpl <em>Ground Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.GroundTermImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getGroundTerm()
     * @generated
     */
    EClass GROUND_TERM = eINSTANCE.getGroundTerm();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.QuantifiedTermImpl <em>Quantified Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.QuantifiedTermImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getQuantifiedTerm()
     * @generated
     */
    EClass QUANTIFIED_TERM = eINSTANCE.getQuantifiedTerm();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_TERM__NAME = eINSTANCE.getQuantifiedTerm_Name();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.UniversalQuantifiedTermImpl <em>Universal Quantified Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.UniversalQuantifiedTermImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getUniversalQuantifiedTerm()
     * @generated
     */
    EClass UNIVERSAL_QUANTIFIED_TERM = eINSTANCE.getUniversalQuantifiedTerm();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.ExistentialQuantifiedTermImpl <em>Existential Quantified Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.ExistentialQuantifiedTermImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getExistentialQuantifiedTerm()
     * @generated
     */
    EClass EXISTENTIAL_QUANTIFIED_TERM = eINSTANCE.getExistentialQuantifiedTerm();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.TermImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.TermsImpl <em>Terms</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.TermsImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getTerms()
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
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.ConstantDeclarationImpl <em>Constant Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.ConstantDeclarationImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getConstantDeclaration()
     * @generated
     */
    EClass CONSTANT_DECLARATION = eINSTANCE.getConstantDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_DECLARATION__NAME = eINSTANCE.getConstantDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Cv</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DECLARATION__CV = eINSTANCE.getConstantDeclaration_Cv();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.TypeIdImpl <em>Type Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.TypeIdImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getTypeId()
     * @generated
     */
    EClass TYPE_ID = eINSTANCE.getTypeId();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_ID__NAME = eINSTANCE.getTypeId_Name();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.TypeDeclarationImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getTypeDeclaration()
     * @generated
     */
    EClass TYPE_DECLARATION = eINSTANCE.getTypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__NAME = eINSTANCE.getTypeDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__EXP = eINSTANCE.getTypeDeclaration_Exp();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.LimitImpl <em>Limit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.LimitImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getLimit()
     * @generated
     */
    EClass LIMIT = eINSTANCE.getLimit();

    /**
     * The meta object literal for the '<em><b>Cv</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIMIT__CV = eINSTANCE.getLimit_Cv();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.SetImpl <em>Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.SetImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getSet()
     * @generated
     */
    EClass SET = eINSTANCE.getSet();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET__LHS = eINSTANCE.getSet_Lhs();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET__TERMS = eINSTANCE.getSet_Terms();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.RangeImpl <em>Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.RangeImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getRange()
     * @generated
     */
    EClass RANGE = eINSTANCE.getRange();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE__LHS = eINSTANCE.getRange_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE__RHS = eINSTANCE.getRange_Rhs();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.SetExpressionImpl <em>Set Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.SetExpressionImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getSetExpression()
     * @generated
     */
    EClass SET_EXPRESSION = eINSTANCE.getSetExpression();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.SetConstructImpl <em>Set Construct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.SetConstructImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getSetConstruct()
     * @generated
     */
    EClass SET_CONSTRUCT = eINSTANCE.getSetConstruct();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_CONSTRUCT__LHS = eINSTANCE.getSetConstruct_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_CONSTRUCT__RHS = eINSTANCE.getSetConstruct_Rhs();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.TVarsImpl <em>TVars</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.TVarsImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getTVars()
     * @generated
     */
    EClass TVARS = eINSTANCE.getTVars();

    /**
     * The meta object literal for the '<em><b>Car</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TVARS__CAR = eINSTANCE.getTVars_Car();

    /**
     * The meta object literal for the '<em><b>Cdr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TVARS__CDR = eINSTANCE.getTVars_Cdr();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.TVarImpl <em>TVar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.TVarImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getTVar()
     * @generated
     */
    EClass TVAR = eINSTANCE.getTVar();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TVAR__VAR = eINSTANCE.getTVar_Var();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TVAR__ID = eINSTANCE.getTVar_Id();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.AtomImpl <em>Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.AtomImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getAtom()
     * @generated
     */
    EClass ATOM = eINSTANCE.getAtom();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.PredicateAtomImpl <em>Predicate Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.PredicateAtomImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getPredicateAtom()
     * @generated
     */
    EClass PREDICATE_ATOM = eINSTANCE.getPredicateAtom();

    /**
     * The meta object literal for the '<em><b>Fid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREDICATE_ATOM__FID = eINSTANCE.getPredicateAtom_Fid();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_ATOM__TERMS = eINSTANCE.getPredicateAtom_Terms();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.BasicPredicateAtomImpl <em>Basic Predicate Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.BasicPredicateAtomImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getBasicPredicateAtom()
     * @generated
     */
    EClass BASIC_PREDICATE_ATOM = eINSTANCE.getBasicPredicateAtom();

    /**
     * The meta object literal for the '<em><b>Fid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_PREDICATE_ATOM__FID = eINSTANCE.getBasicPredicateAtom_Fid();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_PREDICATE_ATOM__TERMS = eINSTANCE.getBasicPredicateAtom_Terms();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.BuiltInAtomImpl <em>Built In Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.BuiltInAtomImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getBuiltInAtom()
     * @generated
     */
    EClass BUILT_IN_ATOM = eINSTANCE.getBuiltInAtom();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILT_IN_ATOM__LHS = eINSTANCE.getBuiltInAtom_Lhs();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILT_IN_ATOM__OP = eINSTANCE.getBuiltInAtom_Op();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILT_IN_ATOM__RHS = eINSTANCE.getBuiltInAtom_Rhs();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.BasicAtomImpl <em>Basic Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.BasicAtomImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getBasicAtom()
     * @generated
     */
    EClass BASIC_ATOM = eINSTANCE.getBasicAtom();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.SentenceImpl <em>Sentence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.SentenceImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getSentence()
     * @generated
     */
    EClass SENTENCE = eINSTANCE.getSentence();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.SentenceExprImpl <em>Sentence Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.SentenceExprImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getSentenceExpr()
     * @generated
     */
    EClass SENTENCE_EXPR = eINSTANCE.getSentenceExpr();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.SentenceLiteralImpl <em>Sentence Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.SentenceLiteralImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getSentenceLiteral()
     * @generated
     */
    EClass SENTENCE_LITERAL = eINSTANCE.getSentenceLiteral();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.pSentenceImpl <em>pSentence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.pSentenceImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getpSentence()
     * @generated
     */
    EClass PSENTENCE = eINSTANCE.getpSentence();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.pSentenceLiteralImpl <em>pSentence Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.pSentenceLiteralImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getpSentenceLiteral()
     * @generated
     */
    EClass PSENTENCE_LITERAL = eINSTANCE.getpSentenceLiteral();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.MaybeLiteralImpl <em>Maybe Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.MaybeLiteralImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getMaybeLiteral()
     * @generated
     */
    EClass MAYBE_LITERAL = eINSTANCE.getMaybeLiteral();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.CardinalityConstraintImpl <em>Cardinality Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.CardinalityConstraintImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getCardinalityConstraint()
     * @generated
     */
    EClass CARDINALITY_CONSTRAINT = eINSTANCE.getCardinalityConstraint();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CARDINALITY_CONSTRAINT__LHS = eINSTANCE.getCardinalityConstraint_Lhs();

    /**
     * The meta object literal for the '<em><b>Atom</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CARDINALITY_CONSTRAINT__ATOM = eINSTANCE.getCardinalityConstraint_Atom();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CARDINALITY_CONSTRAINT__RHS = eINSTANCE.getCardinalityConstraint_Rhs();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.BoundImpl <em>Bound</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.BoundImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getBound()
     * @generated
     */
    EClass BOUND = eINSTANCE.getBound();

    /**
     * The meta object literal for the '<em><b>Av</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOUND__AV = eINSTANCE.getBound_Av();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.RuleImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__HEAD = eINSTANCE.getRule_Head();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__CONDITION = eINSTANCE.getRule_Condition();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__BODY = eINSTANCE.getRule_Body();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.HeadImpl <em>Head</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.HeadImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getHead()
     * @generated
     */
    EClass HEAD = eINSTANCE.getHead();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.StatementImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.AdditionImpl <em>Addition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.AdditionImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getAddition()
     * @generated
     */
    EClass ADDITION = eINSTANCE.getAddition();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.MultiplicationImpl <em>Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.MultiplicationImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getMultiplication()
     * @generated
     */
    EClass MULTIPLICATION = eINSTANCE.getMultiplication();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.GroundAdditionImpl <em>Ground Addition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.GroundAdditionImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getGroundAddition()
     * @generated
     */
    EClass GROUND_ADDITION = eINSTANCE.getGroundAddition();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.GroundMultiplicationImpl <em>Ground Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.GroundMultiplicationImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getGroundMultiplication()
     * @generated
     */
    EClass GROUND_MULTIPLICATION = eINSTANCE.getGroundMultiplication();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.SetAdditionImpl <em>Set Addition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.SetAdditionImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getSetAddition()
     * @generated
     */
    EClass SET_ADDITION = eINSTANCE.getSetAddition();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_ADDITION__LEFT = eINSTANCE.getSetAddition_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_ADDITION__RIGHT = eINSTANCE.getSetAddition_Right();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.SetMultiplicationImpl <em>Set Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.SetMultiplicationImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getSetMultiplication()
     * @generated
     */
    EClass SET_MULTIPLICATION = eINSTANCE.getSetMultiplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_MULTIPLICATION__LEFT = eINSTANCE.getSetMultiplication_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_MULTIPLICATION__RIGHT = eINSTANCE.getSetMultiplication_Right();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.OrSentenceImpl <em>Or Sentence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.OrSentenceImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getOrSentence()
     * @generated
     */
    EClass OR_SENTENCE = eINSTANCE.getOrSentence();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_SENTENCE__LEFT = eINSTANCE.getOrSentence_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_SENTENCE__RIGHT = eINSTANCE.getOrSentence_Right();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.AndSentenceImpl <em>And Sentence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.AndSentenceImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getAndSentence()
     * @generated
     */
    EClass AND_SENTENCE = eINSTANCE.getAndSentence();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_SENTENCE__LEFT = eINSTANCE.getAndSentence_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_SENTENCE__RIGHT = eINSTANCE.getAndSentence_Right();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.pOrSentenceImpl <em>pOr Sentence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.pOrSentenceImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getpOrSentence()
     * @generated
     */
    EClass POR_SENTENCE = eINSTANCE.getpOrSentence();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POR_SENTENCE__LEFT = eINSTANCE.getpOrSentence_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POR_SENTENCE__RIGHT = eINSTANCE.getpOrSentence_Right();

    /**
     * The meta object literal for the '{@link net.certware.argument.language.l.impl.pAndSentenceImpl <em>pAnd Sentence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.argument.language.l.impl.pAndSentenceImpl
     * @see net.certware.argument.language.l.impl.LPackageImpl#getpAndSentence()
     * @generated
     */
    EClass PAND_SENTENCE = eINSTANCE.getpAndSentence();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAND_SENTENCE__LEFT = eINSTANCE.getpAndSentence_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAND_SENTENCE__RIGHT = eINSTANCE.getpAndSentence_Right();

  }

} //LPackage
