/**
 */
package net.certware.planning.cpn.cpnDsl.impl;

import net.certware.planning.cpn.cpnDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CpnDslFactoryImpl extends EFactoryImpl implements CpnDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CpnDslFactory init()
  {
    try
    {
      CpnDslFactory theCpnDslFactory = (CpnDslFactory)EPackage.Registry.INSTANCE.getEFactory(CpnDslPackage.eNS_URI);
      if (theCpnDslFactory != null)
      {
        return theCpnDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CpnDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CpnDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CpnDslPackage.PLANS: return createPlans();
      case CpnDslPackage.ARGUMENT_MODELS: return createArgumentModels();
      case CpnDslPackage.ALLOCATION: return createAllocation();
      case CpnDslPackage.PLAN: return createPlan();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plans createPlans()
  {
    PlansImpl plans = new PlansImpl();
    return plans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentModels createArgumentModels()
  {
    ArgumentModelsImpl argumentModels = new ArgumentModelsImpl();
    return argumentModels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Allocation createAllocation()
  {
    AllocationImpl allocation = new AllocationImpl();
    return allocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plan createPlan()
  {
    PlanImpl plan = new PlanImpl();
    return plan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CpnDslPackage getCpnDslPackage()
  {
    return (CpnDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CpnDslPackage getPackage()
  {
    return CpnDslPackage.eINSTANCE;
  }

} //CpnDslFactoryImpl
