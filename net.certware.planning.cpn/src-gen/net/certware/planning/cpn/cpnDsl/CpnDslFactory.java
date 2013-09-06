/**
 */
package net.certware.planning.cpn.cpnDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.planning.cpn.cpnDsl.CpnDslPackage
 * @generated
 */
public interface CpnDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CpnDslFactory eINSTANCE = net.certware.planning.cpn.cpnDsl.impl.CpnDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Plans</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plans</em>'.
   * @generated
   */
  Plans createPlans();

  /**
   * Returns a new object of class '<em>Argument Models</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument Models</em>'.
   * @generated
   */
  ArgumentModels createArgumentModels();

  /**
   * Returns a new object of class '<em>Allocation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Allocation</em>'.
   * @generated
   */
  Allocation createAllocation();

  /**
   * Returns a new object of class '<em>Plan</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plan</em>'.
   * @generated
   */
  Plan createPlan();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CpnDslPackage getCpnDslPackage();

} //CpnDslFactory
