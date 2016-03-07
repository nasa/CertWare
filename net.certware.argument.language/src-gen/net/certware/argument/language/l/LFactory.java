/**
 */
package net.certware.argument.language.l;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.argument.language.l.LPackage
 * @generated
 */
public interface LFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LFactory eINSTANCE = net.certware.argument.language.l.impl.LFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Basic Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Term</em>'.
   * @generated
   */
  BasicTerm createBasicTerm();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Typed Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typed Variable</em>'.
   * @generated
   */
  TypedVariable createTypedVariable();

  /**
   * Returns a new object of class '<em>Arithmetic Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arithmetic Term</em>'.
   * @generated
   */
  ArithmeticTerm createArithmeticTerm();

  /**
   * Returns a new object of class '<em>Arithmetic Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arithmetic Literal</em>'.
   * @generated
   */
  ArithmeticLiteral createArithmeticLiteral();

  /**
   * Returns a new object of class '<em>Ground Arithmetic Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ground Arithmetic Term</em>'.
   * @generated
   */
  GroundArithmeticTerm createGroundArithmeticTerm();

  /**
   * Returns a new object of class '<em>Ground Arithmetic Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ground Arithmetic Literal</em>'.
   * @generated
   */
  GroundArithmeticLiteral createGroundArithmeticLiteral();

  /**
   * Returns a new object of class '<em>Functional Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Functional Term</em>'.
   * @generated
   */
  FunctionalTerm createFunctionalTerm();

  /**
   * Returns a new object of class '<em>Ground Functional Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ground Functional Term</em>'.
   * @generated
   */
  GroundFunctionalTerm createGroundFunctionalTerm();

  /**
   * Returns a new object of class '<em>Basic Terms</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Terms</em>'.
   * @generated
   */
  BasicTerms createBasicTerms();

  /**
   * Returns a new object of class '<em>Ground Terms</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ground Terms</em>'.
   * @generated
   */
  GroundTerms createGroundTerms();

  /**
   * Returns a new object of class '<em>Ground Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ground Term</em>'.
   * @generated
   */
  GroundTerm createGroundTerm();

  /**
   * Returns a new object of class '<em>Quantified Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quantified Term</em>'.
   * @generated
   */
  QuantifiedTerm createQuantifiedTerm();

  /**
   * Returns a new object of class '<em>Universal Quantified Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Universal Quantified Term</em>'.
   * @generated
   */
  UniversalQuantifiedTerm createUniversalQuantifiedTerm();

  /**
   * Returns a new object of class '<em>Existential Quantified Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Existential Quantified Term</em>'.
   * @generated
   */
  ExistentialQuantifiedTerm createExistentialQuantifiedTerm();

  /**
   * Returns a new object of class '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term</em>'.
   * @generated
   */
  Term createTerm();

  /**
   * Returns a new object of class '<em>Terms</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terms</em>'.
   * @generated
   */
  Terms createTerms();

  /**
   * Returns a new object of class '<em>Constant Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Declaration</em>'.
   * @generated
   */
  ConstantDeclaration createConstantDeclaration();

  /**
   * Returns a new object of class '<em>Type Id</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Id</em>'.
   * @generated
   */
  TypeId createTypeId();

  /**
   * Returns a new object of class '<em>Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Declaration</em>'.
   * @generated
   */
  TypeDeclaration createTypeDeclaration();

  /**
   * Returns a new object of class '<em>Limit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Limit</em>'.
   * @generated
   */
  Limit createLimit();

  /**
   * Returns a new object of class '<em>Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set</em>'.
   * @generated
   */
  Set createSet();

  /**
   * Returns a new object of class '<em>Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range</em>'.
   * @generated
   */
  Range createRange();

  /**
   * Returns a new object of class '<em>Set Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Expression</em>'.
   * @generated
   */
  SetExpression createSetExpression();

  /**
   * Returns a new object of class '<em>Set Construct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Construct</em>'.
   * @generated
   */
  SetConstruct createSetConstruct();

  /**
   * Returns a new object of class '<em>TVars</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TVars</em>'.
   * @generated
   */
  TVars createTVars();

  /**
   * Returns a new object of class '<em>TVar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TVar</em>'.
   * @generated
   */
  TVar createTVar();

  /**
   * Returns a new object of class '<em>Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atom</em>'.
   * @generated
   */
  Atom createAtom();

  /**
   * Returns a new object of class '<em>Predicate Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Atom</em>'.
   * @generated
   */
  PredicateAtom createPredicateAtom();

  /**
   * Returns a new object of class '<em>Basic Predicate Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Predicate Atom</em>'.
   * @generated
   */
  BasicPredicateAtom createBasicPredicateAtom();

  /**
   * Returns a new object of class '<em>Built In Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Built In Atom</em>'.
   * @generated
   */
  BuiltInAtom createBuiltInAtom();

  /**
   * Returns a new object of class '<em>Basic Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Atom</em>'.
   * @generated
   */
  BasicAtom createBasicAtom();

  /**
   * Returns a new object of class '<em>Sentence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sentence</em>'.
   * @generated
   */
  Sentence createSentence();

  /**
   * Returns a new object of class '<em>Sentence Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sentence Expr</em>'.
   * @generated
   */
  SentenceExpr createSentenceExpr();

  /**
   * Returns a new object of class '<em>Sentence Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sentence Literal</em>'.
   * @generated
   */
  SentenceLiteral createSentenceLiteral();

  /**
   * Returns a new object of class '<em>pSentence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>pSentence</em>'.
   * @generated
   */
  pSentence createpSentence();

  /**
   * Returns a new object of class '<em>pSentence Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>pSentence Literal</em>'.
   * @generated
   */
  pSentenceLiteral createpSentenceLiteral();

  /**
   * Returns a new object of class '<em>Maybe Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Maybe Literal</em>'.
   * @generated
   */
  MaybeLiteral createMaybeLiteral();

  /**
   * Returns a new object of class '<em>Cardinality Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cardinality Constraint</em>'.
   * @generated
   */
  CardinalityConstraint createCardinalityConstraint();

  /**
   * Returns a new object of class '<em>Bound</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bound</em>'.
   * @generated
   */
  Bound createBound();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Head</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Head</em>'.
   * @generated
   */
  Head createHead();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Addition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Addition</em>'.
   * @generated
   */
  Addition createAddition();

  /**
   * Returns a new object of class '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplication</em>'.
   * @generated
   */
  Multiplication createMultiplication();

  /**
   * Returns a new object of class '<em>Ground Addition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ground Addition</em>'.
   * @generated
   */
  GroundAddition createGroundAddition();

  /**
   * Returns a new object of class '<em>Ground Multiplication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ground Multiplication</em>'.
   * @generated
   */
  GroundMultiplication createGroundMultiplication();

  /**
   * Returns a new object of class '<em>Set Addition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Addition</em>'.
   * @generated
   */
  SetAddition createSetAddition();

  /**
   * Returns a new object of class '<em>Set Multiplication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Multiplication</em>'.
   * @generated
   */
  SetMultiplication createSetMultiplication();

  /**
   * Returns a new object of class '<em>Or Sentence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Sentence</em>'.
   * @generated
   */
  OrSentence createOrSentence();

  /**
   * Returns a new object of class '<em>And Sentence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Sentence</em>'.
   * @generated
   */
  AndSentence createAndSentence();

  /**
   * Returns a new object of class '<em>pOr Sentence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>pOr Sentence</em>'.
   * @generated
   */
  pOrSentence createpOrSentence();

  /**
   * Returns a new object of class '<em>pAnd Sentence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>pAnd Sentence</em>'.
   * @generated
   */
  pAndSentence createpAndSentence();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LPackage getLPackage();

} //LFactory
