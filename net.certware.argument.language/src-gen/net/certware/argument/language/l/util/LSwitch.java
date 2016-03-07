/**
 */
package net.certware.argument.language.l.util;

import net.certware.argument.language.l.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.certware.argument.language.l.LPackage
 * @generated
 */
public class LSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.BASIC_TERM:
      {
        BasicTerm basicTerm = (BasicTerm)theEObject;
        T result = caseBasicTerm(basicTerm);
        if (result == null) result = caseTerm(basicTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.TYPED_VARIABLE:
      {
        TypedVariable typedVariable = (TypedVariable)theEObject;
        T result = caseTypedVariable(typedVariable);
        if (result == null) result = caseBasicTerm(typedVariable);
        if (result == null) result = caseTerm(typedVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.ARITHMETIC_TERM:
      {
        ArithmeticTerm arithmeticTerm = (ArithmeticTerm)theEObject;
        T result = caseArithmeticTerm(arithmeticTerm);
        if (result == null) result = caseBasicTerm(arithmeticTerm);
        if (result == null) result = caseGroundArithmeticTerm(arithmeticTerm);
        if (result == null) result = caseTerm(arithmeticTerm);
        if (result == null) result = caseGroundTerm(arithmeticTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.ARITHMETIC_LITERAL:
      {
        ArithmeticLiteral arithmeticLiteral = (ArithmeticLiteral)theEObject;
        T result = caseArithmeticLiteral(arithmeticLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.GROUND_ARITHMETIC_TERM:
      {
        GroundArithmeticTerm groundArithmeticTerm = (GroundArithmeticTerm)theEObject;
        T result = caseGroundArithmeticTerm(groundArithmeticTerm);
        if (result == null) result = caseGroundTerm(groundArithmeticTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.GROUND_ARITHMETIC_LITERAL:
      {
        GroundArithmeticLiteral groundArithmeticLiteral = (GroundArithmeticLiteral)theEObject;
        T result = caseGroundArithmeticLiteral(groundArithmeticLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.FUNCTIONAL_TERM:
      {
        FunctionalTerm functionalTerm = (FunctionalTerm)theEObject;
        T result = caseFunctionalTerm(functionalTerm);
        if (result == null) result = caseBasicTerm(functionalTerm);
        if (result == null) result = caseTerm(functionalTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.GROUND_FUNCTIONAL_TERM:
      {
        GroundFunctionalTerm groundFunctionalTerm = (GroundFunctionalTerm)theEObject;
        T result = caseGroundFunctionalTerm(groundFunctionalTerm);
        if (result == null) result = caseGroundTerm(groundFunctionalTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.BASIC_TERMS:
      {
        BasicTerms basicTerms = (BasicTerms)theEObject;
        T result = caseBasicTerms(basicTerms);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.GROUND_TERMS:
      {
        GroundTerms groundTerms = (GroundTerms)theEObject;
        T result = caseGroundTerms(groundTerms);
        if (result == null) result = caseGroundFunctionalTerm(groundTerms);
        if (result == null) result = caseGroundTerm(groundTerms);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.GROUND_TERM:
      {
        GroundTerm groundTerm = (GroundTerm)theEObject;
        T result = caseGroundTerm(groundTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.QUANTIFIED_TERM:
      {
        QuantifiedTerm quantifiedTerm = (QuantifiedTerm)theEObject;
        T result = caseQuantifiedTerm(quantifiedTerm);
        if (result == null) result = caseTerm(quantifiedTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.UNIVERSAL_QUANTIFIED_TERM:
      {
        UniversalQuantifiedTerm universalQuantifiedTerm = (UniversalQuantifiedTerm)theEObject;
        T result = caseUniversalQuantifiedTerm(universalQuantifiedTerm);
        if (result == null) result = caseQuantifiedTerm(universalQuantifiedTerm);
        if (result == null) result = caseTerm(universalQuantifiedTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.EXISTENTIAL_QUANTIFIED_TERM:
      {
        ExistentialQuantifiedTerm existentialQuantifiedTerm = (ExistentialQuantifiedTerm)theEObject;
        T result = caseExistentialQuantifiedTerm(existentialQuantifiedTerm);
        if (result == null) result = caseQuantifiedTerm(existentialQuantifiedTerm);
        if (result == null) result = caseTerm(existentialQuantifiedTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.TERMS:
      {
        Terms terms = (Terms)theEObject;
        T result = caseTerms(terms);
        if (result == null) result = caseFunctionalTerm(terms);
        if (result == null) result = caseBasicTerm(terms);
        if (result == null) result = caseTerm(terms);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.CONSTANT_DECLARATION:
      {
        ConstantDeclaration constantDeclaration = (ConstantDeclaration)theEObject;
        T result = caseConstantDeclaration(constantDeclaration);
        if (result == null) result = caseStatement(constantDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.TYPE_ID:
      {
        TypeId typeId = (TypeId)theEObject;
        T result = caseTypeId(typeId);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.TYPE_DECLARATION:
      {
        TypeDeclaration typeDeclaration = (TypeDeclaration)theEObject;
        T result = caseTypeDeclaration(typeDeclaration);
        if (result == null) result = caseStatement(typeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.LIMIT:
      {
        Limit limit = (Limit)theEObject;
        T result = caseLimit(limit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.SET:
      {
        Set set = (Set)theEObject;
        T result = caseSet(set);
        if (result == null) result = caseSetExpression(set);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.RANGE:
      {
        Range range = (Range)theEObject;
        T result = caseRange(range);
        if (result == null) result = caseSetExpression(range);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.SET_EXPRESSION:
      {
        SetExpression setExpression = (SetExpression)theEObject;
        T result = caseSetExpression(setExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.SET_CONSTRUCT:
      {
        SetConstruct setConstruct = (SetConstruct)theEObject;
        T result = caseSetConstruct(setConstruct);
        if (result == null) result = caseSetExpression(setConstruct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.TVARS:
      {
        TVars tVars = (TVars)theEObject;
        T result = caseTVars(tVars);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.TVAR:
      {
        TVar tVar = (TVar)theEObject;
        T result = caseTVar(tVar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.ATOM:
      {
        Atom atom = (Atom)theEObject;
        T result = caseAtom(atom);
        if (result == null) result = caseSentenceLiteral(atom);
        if (result == null) result = caseSentenceExpr(atom);
        if (result == null) result = caseSentence(atom);
        if (result == null) result = casepSentence(atom);
        if (result == null) result = caseHead(atom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.PREDICATE_ATOM:
      {
        PredicateAtom predicateAtom = (PredicateAtom)theEObject;
        T result = casePredicateAtom(predicateAtom);
        if (result == null) result = caseAtom(predicateAtom);
        if (result == null) result = casepSentenceLiteral(predicateAtom);
        if (result == null) result = caseSentenceLiteral(predicateAtom);
        if (result == null) result = caseSentenceExpr(predicateAtom);
        if (result == null) result = caseSentence(predicateAtom);
        if (result == null) result = casepSentence(predicateAtom);
        if (result == null) result = caseHead(predicateAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.BASIC_PREDICATE_ATOM:
      {
        BasicPredicateAtom basicPredicateAtom = (BasicPredicateAtom)theEObject;
        T result = caseBasicPredicateAtom(basicPredicateAtom);
        if (result == null) result = caseBasicAtom(basicPredicateAtom);
        if (result == null) result = casepSentenceLiteral(basicPredicateAtom);
        if (result == null) result = caseMaybeLiteral(basicPredicateAtom);
        if (result == null) result = caseSentenceLiteral(basicPredicateAtom);
        if (result == null) result = caseSentenceExpr(basicPredicateAtom);
        if (result == null) result = caseSentence(basicPredicateAtom);
        if (result == null) result = casepSentence(basicPredicateAtom);
        if (result == null) result = caseHead(basicPredicateAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.BUILT_IN_ATOM:
      {
        BuiltInAtom builtInAtom = (BuiltInAtom)theEObject;
        T result = caseBuiltInAtom(builtInAtom);
        if (result == null) result = caseAtom(builtInAtom);
        if (result == null) result = caseBasicAtom(builtInAtom);
        if (result == null) result = caseSentenceLiteral(builtInAtom);
        if (result == null) result = caseSentenceExpr(builtInAtom);
        if (result == null) result = caseSentence(builtInAtom);
        if (result == null) result = casepSentence(builtInAtom);
        if (result == null) result = caseHead(builtInAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.BASIC_ATOM:
      {
        BasicAtom basicAtom = (BasicAtom)theEObject;
        T result = caseBasicAtom(basicAtom);
        if (result == null) result = caseSentenceLiteral(basicAtom);
        if (result == null) result = caseSentenceExpr(basicAtom);
        if (result == null) result = caseSentence(basicAtom);
        if (result == null) result = casepSentence(basicAtom);
        if (result == null) result = caseHead(basicAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.SENTENCE:
      {
        Sentence sentence = (Sentence)theEObject;
        T result = caseSentence(sentence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.SENTENCE_EXPR:
      {
        SentenceExpr sentenceExpr = (SentenceExpr)theEObject;
        T result = caseSentenceExpr(sentenceExpr);
        if (result == null) result = caseSentence(sentenceExpr);
        if (result == null) result = casepSentence(sentenceExpr);
        if (result == null) result = caseHead(sentenceExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.SENTENCE_LITERAL:
      {
        SentenceLiteral sentenceLiteral = (SentenceLiteral)theEObject;
        T result = caseSentenceLiteral(sentenceLiteral);
        if (result == null) result = caseSentenceExpr(sentenceLiteral);
        if (result == null) result = caseSentence(sentenceLiteral);
        if (result == null) result = casepSentence(sentenceLiteral);
        if (result == null) result = caseHead(sentenceLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.PSENTENCE:
      {
        pSentence pSentence = (pSentence)theEObject;
        T result = casepSentence(pSentence);
        if (result == null) result = caseHead(pSentence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.PSENTENCE_LITERAL:
      {
        pSentenceLiteral pSentenceLiteral = (pSentenceLiteral)theEObject;
        T result = casepSentenceLiteral(pSentenceLiteral);
        if (result == null) result = caseSentenceExpr(pSentenceLiteral);
        if (result == null) result = caseSentence(pSentenceLiteral);
        if (result == null) result = casepSentence(pSentenceLiteral);
        if (result == null) result = caseHead(pSentenceLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.MAYBE_LITERAL:
      {
        MaybeLiteral maybeLiteral = (MaybeLiteral)theEObject;
        T result = caseMaybeLiteral(maybeLiteral);
        if (result == null) result = caseHead(maybeLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.CARDINALITY_CONSTRAINT:
      {
        CardinalityConstraint cardinalityConstraint = (CardinalityConstraint)theEObject;
        T result = caseCardinalityConstraint(cardinalityConstraint);
        if (result == null) result = caseHead(cardinalityConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.BOUND:
      {
        Bound bound = (Bound)theEObject;
        T result = caseBound(bound);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = caseStatement(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.HEAD:
      {
        Head head = (Head)theEObject;
        T result = caseHead(head);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.ADDITION:
      {
        Addition addition = (Addition)theEObject;
        T result = caseAddition(addition);
        if (result == null) result = caseArithmeticTerm(addition);
        if (result == null) result = caseBasicTerm(addition);
        if (result == null) result = caseGroundArithmeticTerm(addition);
        if (result == null) result = caseTerm(addition);
        if (result == null) result = caseGroundTerm(addition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.MULTIPLICATION:
      {
        Multiplication multiplication = (Multiplication)theEObject;
        T result = caseMultiplication(multiplication);
        if (result == null) result = caseArithmeticTerm(multiplication);
        if (result == null) result = caseBasicTerm(multiplication);
        if (result == null) result = caseGroundArithmeticTerm(multiplication);
        if (result == null) result = caseTerm(multiplication);
        if (result == null) result = caseGroundTerm(multiplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.GROUND_ADDITION:
      {
        GroundAddition groundAddition = (GroundAddition)theEObject;
        T result = caseGroundAddition(groundAddition);
        if (result == null) result = caseArithmeticTerm(groundAddition);
        if (result == null) result = caseBasicTerm(groundAddition);
        if (result == null) result = caseGroundArithmeticTerm(groundAddition);
        if (result == null) result = caseTerm(groundAddition);
        if (result == null) result = caseGroundTerm(groundAddition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.GROUND_MULTIPLICATION:
      {
        GroundMultiplication groundMultiplication = (GroundMultiplication)theEObject;
        T result = caseGroundMultiplication(groundMultiplication);
        if (result == null) result = caseArithmeticTerm(groundMultiplication);
        if (result == null) result = caseBasicTerm(groundMultiplication);
        if (result == null) result = caseGroundArithmeticTerm(groundMultiplication);
        if (result == null) result = caseTerm(groundMultiplication);
        if (result == null) result = caseGroundTerm(groundMultiplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.SET_ADDITION:
      {
        SetAddition setAddition = (SetAddition)theEObject;
        T result = caseSetAddition(setAddition);
        if (result == null) result = caseSetExpression(setAddition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.SET_MULTIPLICATION:
      {
        SetMultiplication setMultiplication = (SetMultiplication)theEObject;
        T result = caseSetMultiplication(setMultiplication);
        if (result == null) result = caseSetExpression(setMultiplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.OR_SENTENCE:
      {
        OrSentence orSentence = (OrSentence)theEObject;
        T result = caseOrSentence(orSentence);
        if (result == null) result = caseSentenceExpr(orSentence);
        if (result == null) result = caseSentence(orSentence);
        if (result == null) result = casepSentence(orSentence);
        if (result == null) result = caseHead(orSentence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.AND_SENTENCE:
      {
        AndSentence andSentence = (AndSentence)theEObject;
        T result = caseAndSentence(andSentence);
        if (result == null) result = caseSentenceExpr(andSentence);
        if (result == null) result = caseSentence(andSentence);
        if (result == null) result = casepSentence(andSentence);
        if (result == null) result = caseHead(andSentence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.POR_SENTENCE:
      {
        pOrSentence pOrSentence = (pOrSentence)theEObject;
        T result = casepOrSentence(pOrSentence);
        if (result == null) result = caseSentenceExpr(pOrSentence);
        if (result == null) result = caseSentence(pOrSentence);
        if (result == null) result = casepSentence(pOrSentence);
        if (result == null) result = caseHead(pOrSentence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LPackage.PAND_SENTENCE:
      {
        pAndSentence pAndSentence = (pAndSentence)theEObject;
        T result = casepAndSentence(pAndSentence);
        if (result == null) result = caseSentenceExpr(pAndSentence);
        if (result == null) result = caseSentence(pAndSentence);
        if (result == null) result = casepSentence(pAndSentence);
        if (result == null) result = caseHead(pAndSentence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicTerm(BasicTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedVariable(TypedVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticTerm(ArithmeticTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticLiteral(ArithmeticLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ground Arithmetic Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ground Arithmetic Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroundArithmeticTerm(GroundArithmeticTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ground Arithmetic Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ground Arithmetic Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroundArithmeticLiteral(GroundArithmeticLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Functional Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Functional Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionalTerm(FunctionalTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ground Functional Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ground Functional Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroundFunctionalTerm(GroundFunctionalTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Terms</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Terms</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicTerms(BasicTerms object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ground Terms</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ground Terms</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroundTerms(GroundTerms object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ground Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ground Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroundTerm(GroundTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantified Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantified Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantifiedTerm(QuantifiedTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Universal Quantified Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Universal Quantified Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUniversalQuantifiedTerm(UniversalQuantifiedTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Existential Quantified Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Existential Quantified Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExistentialQuantifiedTerm(ExistentialQuantifiedTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerm(Term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terms</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terms</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerms(Terms object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantDeclaration(ConstantDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeId(TypeId object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDeclaration(TypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Limit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Limit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLimit(Limit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSet(Set object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRange(Range object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetExpression(SetExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Construct</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Construct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetConstruct(SetConstruct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TVars</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TVars</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTVars(TVars object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TVar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TVar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTVar(TVar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtom(Atom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateAtom(PredicateAtom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Predicate Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Predicate Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicPredicateAtom(BasicPredicateAtom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Built In Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Built In Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuiltInAtom(BuiltInAtom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicAtom(BasicAtom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sentence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sentence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSentence(Sentence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sentence Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sentence Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSentenceExpr(SentenceExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sentence Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sentence Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSentenceLiteral(SentenceLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>pSentence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>pSentence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepSentence(pSentence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>pSentence Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>pSentence Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepSentenceLiteral(pSentenceLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Maybe Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Maybe Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaybeLiteral(MaybeLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cardinality Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cardinality Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCardinalityConstraint(CardinalityConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bound</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bound</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBound(Bound object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Head</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Head</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHead(Head object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddition(Addition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplication(Multiplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ground Addition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ground Addition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroundAddition(GroundAddition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ground Multiplication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ground Multiplication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroundMultiplication(GroundMultiplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Addition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Addition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetAddition(SetAddition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Multiplication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Multiplication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetMultiplication(SetMultiplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Sentence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Sentence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrSentence(OrSentence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Sentence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Sentence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndSentence(AndSentence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>pOr Sentence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>pOr Sentence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepOrSentence(pOrSentence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>pAnd Sentence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>pAnd Sentence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepAndSentence(pAndSentence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LSwitch
