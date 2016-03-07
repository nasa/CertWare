/**
 */
package net.certware.argument.language.l.util;

import net.certware.argument.language.l.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.argument.language.l.LPackage
 * @generated
 */
public class LAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LSwitch<Adapter> modelSwitch =
    new LSwitch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseBasicTerm(BasicTerm object)
      {
        return createBasicTermAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseTypedVariable(TypedVariable object)
      {
        return createTypedVariableAdapter();
      }
      @Override
      public Adapter caseArithmeticTerm(ArithmeticTerm object)
      {
        return createArithmeticTermAdapter();
      }
      @Override
      public Adapter caseArithmeticLiteral(ArithmeticLiteral object)
      {
        return createArithmeticLiteralAdapter();
      }
      @Override
      public Adapter caseGroundArithmeticTerm(GroundArithmeticTerm object)
      {
        return createGroundArithmeticTermAdapter();
      }
      @Override
      public Adapter caseGroundArithmeticLiteral(GroundArithmeticLiteral object)
      {
        return createGroundArithmeticLiteralAdapter();
      }
      @Override
      public Adapter caseFunctionalTerm(FunctionalTerm object)
      {
        return createFunctionalTermAdapter();
      }
      @Override
      public Adapter caseGroundFunctionalTerm(GroundFunctionalTerm object)
      {
        return createGroundFunctionalTermAdapter();
      }
      @Override
      public Adapter caseBasicTerms(BasicTerms object)
      {
        return createBasicTermsAdapter();
      }
      @Override
      public Adapter caseGroundTerms(GroundTerms object)
      {
        return createGroundTermsAdapter();
      }
      @Override
      public Adapter caseGroundTerm(GroundTerm object)
      {
        return createGroundTermAdapter();
      }
      @Override
      public Adapter caseQuantifiedTerm(QuantifiedTerm object)
      {
        return createQuantifiedTermAdapter();
      }
      @Override
      public Adapter caseUniversalQuantifiedTerm(UniversalQuantifiedTerm object)
      {
        return createUniversalQuantifiedTermAdapter();
      }
      @Override
      public Adapter caseExistentialQuantifiedTerm(ExistentialQuantifiedTerm object)
      {
        return createExistentialQuantifiedTermAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
      }
      @Override
      public Adapter caseTerms(Terms object)
      {
        return createTermsAdapter();
      }
      @Override
      public Adapter caseConstantDeclaration(ConstantDeclaration object)
      {
        return createConstantDeclarationAdapter();
      }
      @Override
      public Adapter caseTypeId(TypeId object)
      {
        return createTypeIdAdapter();
      }
      @Override
      public Adapter caseTypeDeclaration(TypeDeclaration object)
      {
        return createTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseLimit(Limit object)
      {
        return createLimitAdapter();
      }
      @Override
      public Adapter caseSet(Set object)
      {
        return createSetAdapter();
      }
      @Override
      public Adapter caseRange(Range object)
      {
        return createRangeAdapter();
      }
      @Override
      public Adapter caseSetExpression(SetExpression object)
      {
        return createSetExpressionAdapter();
      }
      @Override
      public Adapter caseSetConstruct(SetConstruct object)
      {
        return createSetConstructAdapter();
      }
      @Override
      public Adapter caseTVars(TVars object)
      {
        return createTVarsAdapter();
      }
      @Override
      public Adapter caseTVar(TVar object)
      {
        return createTVarAdapter();
      }
      @Override
      public Adapter caseAtom(Atom object)
      {
        return createAtomAdapter();
      }
      @Override
      public Adapter casePredicateAtom(PredicateAtom object)
      {
        return createPredicateAtomAdapter();
      }
      @Override
      public Adapter caseBasicPredicateAtom(BasicPredicateAtom object)
      {
        return createBasicPredicateAtomAdapter();
      }
      @Override
      public Adapter caseBuiltInAtom(BuiltInAtom object)
      {
        return createBuiltInAtomAdapter();
      }
      @Override
      public Adapter caseBasicAtom(BasicAtom object)
      {
        return createBasicAtomAdapter();
      }
      @Override
      public Adapter caseSentence(Sentence object)
      {
        return createSentenceAdapter();
      }
      @Override
      public Adapter caseSentenceExpr(SentenceExpr object)
      {
        return createSentenceExprAdapter();
      }
      @Override
      public Adapter caseSentenceLiteral(SentenceLiteral object)
      {
        return createSentenceLiteralAdapter();
      }
      @Override
      public Adapter casepSentence(pSentence object)
      {
        return createpSentenceAdapter();
      }
      @Override
      public Adapter casepSentenceLiteral(pSentenceLiteral object)
      {
        return createpSentenceLiteralAdapter();
      }
      @Override
      public Adapter caseMaybeLiteral(MaybeLiteral object)
      {
        return createMaybeLiteralAdapter();
      }
      @Override
      public Adapter caseCardinalityConstraint(CardinalityConstraint object)
      {
        return createCardinalityConstraintAdapter();
      }
      @Override
      public Adapter caseBound(Bound object)
      {
        return createBoundAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseHead(Head object)
      {
        return createHeadAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseAddition(Addition object)
      {
        return createAdditionAdapter();
      }
      @Override
      public Adapter caseMultiplication(Multiplication object)
      {
        return createMultiplicationAdapter();
      }
      @Override
      public Adapter caseGroundAddition(GroundAddition object)
      {
        return createGroundAdditionAdapter();
      }
      @Override
      public Adapter caseGroundMultiplication(GroundMultiplication object)
      {
        return createGroundMultiplicationAdapter();
      }
      @Override
      public Adapter caseSetAddition(SetAddition object)
      {
        return createSetAdditionAdapter();
      }
      @Override
      public Adapter caseSetMultiplication(SetMultiplication object)
      {
        return createSetMultiplicationAdapter();
      }
      @Override
      public Adapter caseOrSentence(OrSentence object)
      {
        return createOrSentenceAdapter();
      }
      @Override
      public Adapter caseAndSentence(AndSentence object)
      {
        return createAndSentenceAdapter();
      }
      @Override
      public Adapter casepOrSentence(pOrSentence object)
      {
        return createpOrSentenceAdapter();
      }
      @Override
      public Adapter casepAndSentence(pAndSentence object)
      {
        return createpAndSentenceAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.BasicTerm <em>Basic Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.BasicTerm
   * @generated
   */
  public Adapter createBasicTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.TypedVariable <em>Typed Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.TypedVariable
   * @generated
   */
  public Adapter createTypedVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.ArithmeticTerm <em>Arithmetic Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.ArithmeticTerm
   * @generated
   */
  public Adapter createArithmeticTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.ArithmeticLiteral <em>Arithmetic Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.ArithmeticLiteral
   * @generated
   */
  public Adapter createArithmeticLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.GroundArithmeticTerm <em>Ground Arithmetic Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.GroundArithmeticTerm
   * @generated
   */
  public Adapter createGroundArithmeticTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.GroundArithmeticLiteral <em>Ground Arithmetic Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.GroundArithmeticLiteral
   * @generated
   */
  public Adapter createGroundArithmeticLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.FunctionalTerm <em>Functional Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.FunctionalTerm
   * @generated
   */
  public Adapter createFunctionalTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.GroundFunctionalTerm <em>Ground Functional Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.GroundFunctionalTerm
   * @generated
   */
  public Adapter createGroundFunctionalTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.BasicTerms <em>Basic Terms</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.BasicTerms
   * @generated
   */
  public Adapter createBasicTermsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.GroundTerms <em>Ground Terms</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.GroundTerms
   * @generated
   */
  public Adapter createGroundTermsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.GroundTerm <em>Ground Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.GroundTerm
   * @generated
   */
  public Adapter createGroundTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.QuantifiedTerm <em>Quantified Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.QuantifiedTerm
   * @generated
   */
  public Adapter createQuantifiedTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.UniversalQuantifiedTerm <em>Universal Quantified Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.UniversalQuantifiedTerm
   * @generated
   */
  public Adapter createUniversalQuantifiedTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.ExistentialQuantifiedTerm <em>Existential Quantified Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.ExistentialQuantifiedTerm
   * @generated
   */
  public Adapter createExistentialQuantifiedTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.Terms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.Terms
   * @generated
   */
  public Adapter createTermsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.ConstantDeclaration <em>Constant Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.ConstantDeclaration
   * @generated
   */
  public Adapter createConstantDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.TypeId <em>Type Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.TypeId
   * @generated
   */
  public Adapter createTypeIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.TypeDeclaration <em>Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.TypeDeclaration
   * @generated
   */
  public Adapter createTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.Limit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.Limit
   * @generated
   */
  public Adapter createLimitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.Set <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.Set
   * @generated
   */
  public Adapter createSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.Range
   * @generated
   */
  public Adapter createRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.SetExpression <em>Set Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.SetExpression
   * @generated
   */
  public Adapter createSetExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.SetConstruct <em>Set Construct</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.SetConstruct
   * @generated
   */
  public Adapter createSetConstructAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.TVars <em>TVars</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.TVars
   * @generated
   */
  public Adapter createTVarsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.TVar <em>TVar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.TVar
   * @generated
   */
  public Adapter createTVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.Atom
   * @generated
   */
  public Adapter createAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.PredicateAtom <em>Predicate Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.PredicateAtom
   * @generated
   */
  public Adapter createPredicateAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.BasicPredicateAtom <em>Basic Predicate Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.BasicPredicateAtom
   * @generated
   */
  public Adapter createBasicPredicateAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.BuiltInAtom <em>Built In Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.BuiltInAtom
   * @generated
   */
  public Adapter createBuiltInAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.BasicAtom <em>Basic Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.BasicAtom
   * @generated
   */
  public Adapter createBasicAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.Sentence <em>Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.Sentence
   * @generated
   */
  public Adapter createSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.SentenceExpr <em>Sentence Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.SentenceExpr
   * @generated
   */
  public Adapter createSentenceExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.SentenceLiteral <em>Sentence Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.SentenceLiteral
   * @generated
   */
  public Adapter createSentenceLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.pSentence <em>pSentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.pSentence
   * @generated
   */
  public Adapter createpSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.pSentenceLiteral <em>pSentence Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.pSentenceLiteral
   * @generated
   */
  public Adapter createpSentenceLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.MaybeLiteral <em>Maybe Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.MaybeLiteral
   * @generated
   */
  public Adapter createMaybeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.CardinalityConstraint <em>Cardinality Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.CardinalityConstraint
   * @generated
   */
  public Adapter createCardinalityConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.Bound <em>Bound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.Bound
   * @generated
   */
  public Adapter createBoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.Head <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.Head
   * @generated
   */
  public Adapter createHeadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.Addition
   * @generated
   */
  public Adapter createAdditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.Multiplication
   * @generated
   */
  public Adapter createMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.GroundAddition <em>Ground Addition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.GroundAddition
   * @generated
   */
  public Adapter createGroundAdditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.GroundMultiplication <em>Ground Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.GroundMultiplication
   * @generated
   */
  public Adapter createGroundMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.SetAddition <em>Set Addition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.SetAddition
   * @generated
   */
  public Adapter createSetAdditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.SetMultiplication <em>Set Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.SetMultiplication
   * @generated
   */
  public Adapter createSetMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.OrSentence <em>Or Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.OrSentence
   * @generated
   */
  public Adapter createOrSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.AndSentence <em>And Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.AndSentence
   * @generated
   */
  public Adapter createAndSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.pOrSentence <em>pOr Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.pOrSentence
   * @generated
   */
  public Adapter createpOrSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.language.l.pAndSentence <em>pAnd Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.language.l.pAndSentence
   * @generated
   */
  public Adapter createpAndSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LAdapterFactory
