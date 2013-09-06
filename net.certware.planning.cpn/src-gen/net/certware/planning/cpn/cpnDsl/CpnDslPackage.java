/**
 */
package net.certware.planning.cpn.cpnDsl;

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
 * @see net.certware.planning.cpn.cpnDsl.CpnDslFactory
 * @model kind="package"
 * @generated
 */
public interface CpnDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cpnDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.certware.net/planning/cpn/CpnDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cpnDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CpnDslPackage eINSTANCE = net.certware.planning.cpn.cpnDsl.impl.CpnDslPackageImpl.init();

  /**
   * The meta object id for the '{@link net.certware.planning.cpn.cpnDsl.impl.PlansImpl <em>Plans</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.planning.cpn.cpnDsl.impl.PlansImpl
   * @see net.certware.planning.cpn.cpnDsl.impl.CpnDslPackageImpl#getPlans()
   * @generated
   */
  int PLANS = 0;

  /**
   * The feature id for the '<em><b>Argumentmodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANS__ARGUMENTMODELS = 0;

  /**
   * The feature id for the '<em><b>Plans</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANS__PLANS = 1;

  /**
   * The number of structural features of the '<em>Plans</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.planning.cpn.cpnDsl.impl.ArgumentModelsImpl <em>Argument Models</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.planning.cpn.cpnDsl.impl.ArgumentModelsImpl
   * @see net.certware.planning.cpn.cpnDsl.impl.CpnDslPackageImpl#getArgumentModels()
   * @generated
   */
  int ARGUMENT_MODELS = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_MODELS__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Argument Models</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_MODELS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.planning.cpn.cpnDsl.impl.AllocationImpl <em>Allocation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.planning.cpn.cpnDsl.impl.AllocationImpl
   * @see net.certware.planning.cpn.cpnDsl.impl.CpnDslPackageImpl#getAllocation()
   * @generated
   */
  int ALLOCATION = 2;

  /**
   * The feature id for the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATION__COST = 0;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATION__DURATION = 1;

  /**
   * The feature id for the '<em><b>Team</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATION__TEAM = 2;

  /**
   * The feature id for the '<em><b>Facility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATION__FACILITY = 3;

  /**
   * The number of structural features of the '<em>Allocation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOCATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.certware.planning.cpn.cpnDsl.impl.PlanImpl <em>Plan</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.planning.cpn.cpnDsl.impl.PlanImpl
   * @see net.certware.planning.cpn.cpnDsl.impl.CpnDslPackageImpl#getPlan()
   * @generated
   */
  int PLAN = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN__ID = 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN__ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Estimated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN__ESTIMATED = 2;

  /**
   * The feature id for the '<em><b>Actual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN__ACTUAL = 3;

  /**
   * The number of structural features of the '<em>Plan</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link net.certware.planning.cpn.cpnDsl.Plans <em>Plans</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plans</em>'.
   * @see net.certware.planning.cpn.cpnDsl.Plans
   * @generated
   */
  EClass getPlans();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.planning.cpn.cpnDsl.Plans#getArgumentmodels <em>Argumentmodels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Argumentmodels</em>'.
   * @see net.certware.planning.cpn.cpnDsl.Plans#getArgumentmodels()
   * @see #getPlans()
   * @generated
   */
  EReference getPlans_Argumentmodels();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.planning.cpn.cpnDsl.Plans#getPlans <em>Plans</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Plans</em>'.
   * @see net.certware.planning.cpn.cpnDsl.Plans#getPlans()
   * @see #getPlans()
   * @generated
   */
  EReference getPlans_Plans();

  /**
   * Returns the meta object for class '{@link net.certware.planning.cpn.cpnDsl.ArgumentModels <em>Argument Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument Models</em>'.
   * @see net.certware.planning.cpn.cpnDsl.ArgumentModels
   * @generated
   */
  EClass getArgumentModels();

  /**
   * Returns the meta object for the attribute '{@link net.certware.planning.cpn.cpnDsl.ArgumentModels#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see net.certware.planning.cpn.cpnDsl.ArgumentModels#getImportURI()
   * @see #getArgumentModels()
   * @generated
   */
  EAttribute getArgumentModels_ImportURI();

  /**
   * Returns the meta object for class '{@link net.certware.planning.cpn.cpnDsl.Allocation <em>Allocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Allocation</em>'.
   * @see net.certware.planning.cpn.cpnDsl.Allocation
   * @generated
   */
  EClass getAllocation();

  /**
   * Returns the meta object for the attribute '{@link net.certware.planning.cpn.cpnDsl.Allocation#getCost <em>Cost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cost</em>'.
   * @see net.certware.planning.cpn.cpnDsl.Allocation#getCost()
   * @see #getAllocation()
   * @generated
   */
  EAttribute getAllocation_Cost();

  /**
   * Returns the meta object for the attribute '{@link net.certware.planning.cpn.cpnDsl.Allocation#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see net.certware.planning.cpn.cpnDsl.Allocation#getDuration()
   * @see #getAllocation()
   * @generated
   */
  EAttribute getAllocation_Duration();

  /**
   * Returns the meta object for the attribute '{@link net.certware.planning.cpn.cpnDsl.Allocation#getTeam <em>Team</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Team</em>'.
   * @see net.certware.planning.cpn.cpnDsl.Allocation#getTeam()
   * @see #getAllocation()
   * @generated
   */
  EAttribute getAllocation_Team();

  /**
   * Returns the meta object for the attribute '{@link net.certware.planning.cpn.cpnDsl.Allocation#getFacility <em>Facility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Facility</em>'.
   * @see net.certware.planning.cpn.cpnDsl.Allocation#getFacility()
   * @see #getAllocation()
   * @generated
   */
  EAttribute getAllocation_Facility();

  /**
   * Returns the meta object for class '{@link net.certware.planning.cpn.cpnDsl.Plan <em>Plan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plan</em>'.
   * @see net.certware.planning.cpn.cpnDsl.Plan
   * @generated
   */
  EClass getPlan();

  /**
   * Returns the meta object for the attribute '{@link net.certware.planning.cpn.cpnDsl.Plan#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see net.certware.planning.cpn.cpnDsl.Plan#getId()
   * @see #getPlan()
   * @generated
   */
  EAttribute getPlan_Id();

  /**
   * Returns the meta object for the reference '{@link net.certware.planning.cpn.cpnDsl.Plan#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see net.certware.planning.cpn.cpnDsl.Plan#getElement()
   * @see #getPlan()
   * @generated
   */
  EReference getPlan_Element();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.planning.cpn.cpnDsl.Plan#getEstimated <em>Estimated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Estimated</em>'.
   * @see net.certware.planning.cpn.cpnDsl.Plan#getEstimated()
   * @see #getPlan()
   * @generated
   */
  EReference getPlan_Estimated();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.planning.cpn.cpnDsl.Plan#getActual <em>Actual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actual</em>'.
   * @see net.certware.planning.cpn.cpnDsl.Plan#getActual()
   * @see #getPlan()
   * @generated
   */
  EReference getPlan_Actual();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CpnDslFactory getCpnDslFactory();

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
     * The meta object literal for the '{@link net.certware.planning.cpn.cpnDsl.impl.PlansImpl <em>Plans</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.planning.cpn.cpnDsl.impl.PlansImpl
     * @see net.certware.planning.cpn.cpnDsl.impl.CpnDslPackageImpl#getPlans()
     * @generated
     */
    EClass PLANS = eINSTANCE.getPlans();

    /**
     * The meta object literal for the '<em><b>Argumentmodels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLANS__ARGUMENTMODELS = eINSTANCE.getPlans_Argumentmodels();

    /**
     * The meta object literal for the '<em><b>Plans</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLANS__PLANS = eINSTANCE.getPlans_Plans();

    /**
     * The meta object literal for the '{@link net.certware.planning.cpn.cpnDsl.impl.ArgumentModelsImpl <em>Argument Models</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.planning.cpn.cpnDsl.impl.ArgumentModelsImpl
     * @see net.certware.planning.cpn.cpnDsl.impl.CpnDslPackageImpl#getArgumentModels()
     * @generated
     */
    EClass ARGUMENT_MODELS = eINSTANCE.getArgumentModels();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT_MODELS__IMPORT_URI = eINSTANCE.getArgumentModels_ImportURI();

    /**
     * The meta object literal for the '{@link net.certware.planning.cpn.cpnDsl.impl.AllocationImpl <em>Allocation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.planning.cpn.cpnDsl.impl.AllocationImpl
     * @see net.certware.planning.cpn.cpnDsl.impl.CpnDslPackageImpl#getAllocation()
     * @generated
     */
    EClass ALLOCATION = eINSTANCE.getAllocation();

    /**
     * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALLOCATION__COST = eINSTANCE.getAllocation_Cost();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALLOCATION__DURATION = eINSTANCE.getAllocation_Duration();

    /**
     * The meta object literal for the '<em><b>Team</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALLOCATION__TEAM = eINSTANCE.getAllocation_Team();

    /**
     * The meta object literal for the '<em><b>Facility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALLOCATION__FACILITY = eINSTANCE.getAllocation_Facility();

    /**
     * The meta object literal for the '{@link net.certware.planning.cpn.cpnDsl.impl.PlanImpl <em>Plan</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.planning.cpn.cpnDsl.impl.PlanImpl
     * @see net.certware.planning.cpn.cpnDsl.impl.CpnDslPackageImpl#getPlan()
     * @generated
     */
    EClass PLAN = eINSTANCE.getPlan();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLAN__ID = eINSTANCE.getPlan_Id();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAN__ELEMENT = eINSTANCE.getPlan_Element();

    /**
     * The meta object literal for the '<em><b>Estimated</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAN__ESTIMATED = eINSTANCE.getPlan_Estimated();

    /**
     * The meta object literal for the '<em><b>Actual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAN__ACTUAL = eINSTANCE.getPlan_Actual();

  }

} //CpnDslPackage
