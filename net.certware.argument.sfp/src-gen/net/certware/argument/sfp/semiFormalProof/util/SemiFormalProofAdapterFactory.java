/**
 */
package net.certware.argument.sfp.semiFormalProof.util;

import net.certware.argument.sfp.semiFormalProof.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage
 * @generated
 */
public class SemiFormalProofAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SemiFormalProofPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SemiFormalProofAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SemiFormalProofPackage.eINSTANCE;
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
  protected SemiFormalProofSwitch<Adapter> modelSwitch =
    new SemiFormalProofSwitch<Adapter>()
    {
      @Override
      public Adapter caseProof(Proof object)
      {
        return createProofAdapter();
      }
      @Override
      public Adapter caseJustifications(Justifications object)
      {
        return createJustificationsAdapter();
      }
      @Override
      public Adapter caseJustification(Justification object)
      {
        return createJustificationAdapter();
      }
      @Override
      public Adapter caseQuotedAssertion(QuotedAssertion object)
      {
        return createQuotedAssertionAdapter();
      }
      @Override
      public Adapter caseEntailment(Entailment object)
      {
        return createEntailmentAdapter();
      }
      @Override
      public Adapter caseConjunction(Conjunction object)
      {
        return createConjunctionAdapter();
      }
      @Override
      public Adapter caseProofSteps(ProofSteps object)
      {
        return createProofStepsAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseValidation(Validation object)
      {
        return createValidationAdapter();
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
   * Creates a new adapter for an object of class '{@link net.certware.argument.sfp.semiFormalProof.Proof <em>Proof</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.sfp.semiFormalProof.Proof
   * @generated
   */
  public Adapter createProofAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.sfp.semiFormalProof.Justifications <em>Justifications</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.sfp.semiFormalProof.Justifications
   * @generated
   */
  public Adapter createJustificationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.sfp.semiFormalProof.Justification <em>Justification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.sfp.semiFormalProof.Justification
   * @generated
   */
  public Adapter createJustificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.sfp.semiFormalProof.QuotedAssertion <em>Quoted Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.sfp.semiFormalProof.QuotedAssertion
   * @generated
   */
  public Adapter createQuotedAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.sfp.semiFormalProof.Entailment <em>Entailment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.sfp.semiFormalProof.Entailment
   * @generated
   */
  public Adapter createEntailmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.sfp.semiFormalProof.Conjunction <em>Conjunction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.sfp.semiFormalProof.Conjunction
   * @generated
   */
  public Adapter createConjunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.sfp.semiFormalProof.ProofSteps <em>Proof Steps</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.sfp.semiFormalProof.ProofSteps
   * @generated
   */
  public Adapter createProofStepsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.sfp.semiFormalProof.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.sfp.semiFormalProof.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.argument.sfp.semiFormalProof.Validation <em>Validation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.argument.sfp.semiFormalProof.Validation
   * @generated
   */
  public Adapter createValidationAdapter()
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

} //SemiFormalProofAdapterFactory
