/**
 */
package stateAnalysis.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import stateAnalysis.Component;
import stateAnalysis.Controller;
import stateAnalysis.DataCollection;
import stateAnalysis.DataProduct;
import stateAnalysis.Deployment;
import stateAnalysis.DeploymentSet;
import stateAnalysis.Device;
import stateAnalysis.DeviceCommand;
import stateAnalysis.DeviceMeasurement;
import stateAnalysis.Estimator;
import stateAnalysis.HardwareAdapter;
import stateAnalysis.HardwareCommand;
import stateAnalysis.HardwareMeasurement;
import stateAnalysis.QosPolicy;
import stateAnalysis.StateAnalysisFactory;
import stateAnalysis.StateAnalysisPackage;
import stateAnalysis.StateConstraint;
import stateAnalysis.StateUpdate;
import stateAnalysis.StateVariable;
import stateAnalysis.Subsystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateAnalysisPackageImpl extends EPackageImpl implements StateAnalysisPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subsystemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deploymentSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qosPolicyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataProductEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataCollectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deploymentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controllerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass estimatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateUpdateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hardwareCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hardwareMeasurementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviceCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviceMeasurementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hardwareAdapterEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see stateAnalysis.StateAnalysisPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private StateAnalysisPackageImpl()
  {
    super(eNS_URI, StateAnalysisFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link StateAnalysisPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static StateAnalysisPackage init()
  {
    if (isInited) return (StateAnalysisPackage)EPackage.Registry.INSTANCE.getEPackage(StateAnalysisPackage.eNS_URI);

    // Obtain or create and register package
    StateAnalysisPackageImpl theStateAnalysisPackage = (StateAnalysisPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StateAnalysisPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StateAnalysisPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theStateAnalysisPackage.createPackageContents();

    // Initialize created meta-data
    theStateAnalysisPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theStateAnalysisPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(StateAnalysisPackage.eNS_URI, theStateAnalysisPackage);
    return theStateAnalysisPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystem()
  {
    return systemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystem_Name()
  {
    return (EAttribute)systemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystem_Description()
  {
    return (EAttribute)systemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystem_Subsystems()
  {
    return (EReference)systemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubsystem()
  {
    return subsystemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubsystem_Name()
  {
    return (EAttribute)subsystemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubsystem_Description()
  {
    return (EAttribute)subsystemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubsystem_DeploymentSets()
  {
    return (EReference)subsystemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeploymentSet()
  {
    return deploymentSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeploymentSet_Name()
  {
    return (EAttribute)deploymentSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeploymentSet_Description()
  {
    return (EAttribute)deploymentSetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploymentSet_Deployments()
  {
    return (EReference)deploymentSetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQosPolicy()
  {
    return qosPolicyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQosPolicy_Name()
  {
    return (EAttribute)qosPolicyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQosPolicy_Description()
  {
    return (EAttribute)qosPolicyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQosPolicy_Policy()
  {
    return (EAttribute)qosPolicyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataProduct()
  {
    return dataProductEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataProduct_Name()
  {
    return (EAttribute)dataProductEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataProduct_Description()
  {
    return (EAttribute)dataProductEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataProduct_Content()
  {
    return (EAttribute)dataProductEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataCollection()
  {
    return dataCollectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataCollection_Name()
  {
    return (EAttribute)dataCollectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataCollection_Description()
  {
    return (EAttribute)dataCollectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataCollection_Policies()
  {
    return (EReference)dataCollectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataCollection_Products()
  {
    return (EReference)dataCollectionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeployment()
  {
    return deploymentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployment_Name()
  {
    return (EAttribute)deploymentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployment_Description()
  {
    return (EAttribute)deploymentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployment_Components()
  {
    return (EReference)deploymentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployment_Catalogs()
  {
    return (EReference)deploymentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponent()
  {
    return componentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_Name()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_Description()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_StateVariables()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Controllers()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Estimators()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Adapters()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateVariable()
  {
    return stateVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateVariable_Name()
  {
    return (EAttribute)stateVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateVariable_Description()
  {
    return (EAttribute)stateVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateVariable_RepresentationType()
  {
    return (EAttribute)stateVariableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateVariable_InStateConstraints()
  {
    return (EReference)stateVariableEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateVariable_OutStateConstraints()
  {
    return (EReference)stateVariableEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateVariable_StateUpdates()
  {
    return (EReference)stateVariableEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateVariable_InfluencedBy()
  {
    return (EReference)stateVariableEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getController()
  {
    return controllerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getController_Name()
  {
    return (EAttribute)controllerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getController_Description()
  {
    return (EAttribute)controllerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getController_Delegates()
  {
    return (EReference)controllerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getController_StateConstraint()
  {
    return (EReference)controllerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getController_HardwareCommand()
  {
    return (EReference)controllerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEstimator()
  {
    return estimatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEstimator_Name()
  {
    return (EAttribute)estimatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEstimator_Description()
  {
    return (EAttribute)estimatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEstimator_DistilledMeasurements()
  {
    return (EReference)estimatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEstimator_StateConstraints()
  {
    return (EReference)estimatorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEstimator_StateUpdates()
  {
    return (EReference)estimatorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEstimator_HardwareMeasurement()
  {
    return (EReference)estimatorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateConstraint()
  {
    return stateConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateConstraint_Name()
  {
    return (EAttribute)stateConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateConstraint_Description()
  {
    return (EAttribute)stateConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateUpdate()
  {
    return stateUpdateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateUpdate_Name()
  {
    return (EAttribute)stateUpdateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateUpdate_Description()
  {
    return (EAttribute)stateUpdateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHardwareCommand()
  {
    return hardwareCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHardwareCommand_Name()
  {
    return (EAttribute)hardwareCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHardwareCommand_Description()
  {
    return (EAttribute)hardwareCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHardwareMeasurement()
  {
    return hardwareMeasurementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHardwareMeasurement_Name()
  {
    return (EAttribute)hardwareMeasurementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHardwareMeasurement_Description()
  {
    return (EAttribute)hardwareMeasurementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDevice()
  {
    return deviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDevice_Name()
  {
    return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDevice_Description()
  {
    return (EAttribute)deviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDevice_DeviceCommands()
  {
    return (EReference)deviceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDevice_DeviceMeasurements()
  {
    return (EReference)deviceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeviceCommand()
  {
    return deviceCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceCommand_Name()
  {
    return (EAttribute)deviceCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceCommand_Description()
  {
    return (EAttribute)deviceCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeviceMeasurement()
  {
    return deviceMeasurementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceMeasurement_Name()
  {
    return (EAttribute)deviceMeasurementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceMeasurement_Description()
  {
    return (EAttribute)deviceMeasurementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHardwareAdapter()
  {
    return hardwareAdapterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHardwareAdapter_Name()
  {
    return (EAttribute)hardwareAdapterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHardwareAdapter_Description()
  {
    return (EAttribute)hardwareAdapterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHardwareAdapter_HardwareCommands()
  {
    return (EReference)hardwareAdapterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHardwareAdapter_HardwareMeasurements()
  {
    return (EReference)hardwareAdapterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHardwareAdapter_Devices()
  {
    return (EReference)hardwareAdapterEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateAnalysisFactory getStateAnalysisFactory()
  {
    return (StateAnalysisFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    systemEClass = createEClass(SYSTEM);
    createEAttribute(systemEClass, SYSTEM__NAME);
    createEAttribute(systemEClass, SYSTEM__DESCRIPTION);
    createEReference(systemEClass, SYSTEM__SUBSYSTEMS);

    subsystemEClass = createEClass(SUBSYSTEM);
    createEAttribute(subsystemEClass, SUBSYSTEM__NAME);
    createEAttribute(subsystemEClass, SUBSYSTEM__DESCRIPTION);
    createEReference(subsystemEClass, SUBSYSTEM__DEPLOYMENT_SETS);

    deploymentSetEClass = createEClass(DEPLOYMENT_SET);
    createEAttribute(deploymentSetEClass, DEPLOYMENT_SET__NAME);
    createEAttribute(deploymentSetEClass, DEPLOYMENT_SET__DESCRIPTION);
    createEReference(deploymentSetEClass, DEPLOYMENT_SET__DEPLOYMENTS);

    deploymentEClass = createEClass(DEPLOYMENT);
    createEAttribute(deploymentEClass, DEPLOYMENT__NAME);
    createEAttribute(deploymentEClass, DEPLOYMENT__DESCRIPTION);
    createEReference(deploymentEClass, DEPLOYMENT__COMPONENTS);
    createEReference(deploymentEClass, DEPLOYMENT__CATALOGS);

    componentEClass = createEClass(COMPONENT);
    createEAttribute(componentEClass, COMPONENT__NAME);
    createEAttribute(componentEClass, COMPONENT__DESCRIPTION);
    createEReference(componentEClass, COMPONENT__STATE_VARIABLES);
    createEReference(componentEClass, COMPONENT__CONTROLLERS);
    createEReference(componentEClass, COMPONENT__ESTIMATORS);
    createEReference(componentEClass, COMPONENT__ADAPTERS);

    dataCollectionEClass = createEClass(DATA_COLLECTION);
    createEAttribute(dataCollectionEClass, DATA_COLLECTION__NAME);
    createEAttribute(dataCollectionEClass, DATA_COLLECTION__DESCRIPTION);
    createEReference(dataCollectionEClass, DATA_COLLECTION__POLICIES);
    createEReference(dataCollectionEClass, DATA_COLLECTION__PRODUCTS);

    qosPolicyEClass = createEClass(QOS_POLICY);
    createEAttribute(qosPolicyEClass, QOS_POLICY__NAME);
    createEAttribute(qosPolicyEClass, QOS_POLICY__DESCRIPTION);
    createEAttribute(qosPolicyEClass, QOS_POLICY__POLICY);

    dataProductEClass = createEClass(DATA_PRODUCT);
    createEAttribute(dataProductEClass, DATA_PRODUCT__NAME);
    createEAttribute(dataProductEClass, DATA_PRODUCT__DESCRIPTION);
    createEAttribute(dataProductEClass, DATA_PRODUCT__CONTENT);

    stateVariableEClass = createEClass(STATE_VARIABLE);
    createEAttribute(stateVariableEClass, STATE_VARIABLE__NAME);
    createEAttribute(stateVariableEClass, STATE_VARIABLE__DESCRIPTION);
    createEAttribute(stateVariableEClass, STATE_VARIABLE__REPRESENTATION_TYPE);
    createEReference(stateVariableEClass, STATE_VARIABLE__IN_STATE_CONSTRAINTS);
    createEReference(stateVariableEClass, STATE_VARIABLE__OUT_STATE_CONSTRAINTS);
    createEReference(stateVariableEClass, STATE_VARIABLE__STATE_UPDATES);
    createEReference(stateVariableEClass, STATE_VARIABLE__INFLUENCED_BY);

    controllerEClass = createEClass(CONTROLLER);
    createEAttribute(controllerEClass, CONTROLLER__NAME);
    createEAttribute(controllerEClass, CONTROLLER__DESCRIPTION);
    createEReference(controllerEClass, CONTROLLER__DELEGATES);
    createEReference(controllerEClass, CONTROLLER__STATE_CONSTRAINT);
    createEReference(controllerEClass, CONTROLLER__HARDWARE_COMMAND);

    estimatorEClass = createEClass(ESTIMATOR);
    createEAttribute(estimatorEClass, ESTIMATOR__NAME);
    createEAttribute(estimatorEClass, ESTIMATOR__DESCRIPTION);
    createEReference(estimatorEClass, ESTIMATOR__DISTILLED_MEASUREMENTS);
    createEReference(estimatorEClass, ESTIMATOR__STATE_CONSTRAINTS);
    createEReference(estimatorEClass, ESTIMATOR__STATE_UPDATES);
    createEReference(estimatorEClass, ESTIMATOR__HARDWARE_MEASUREMENT);

    hardwareAdapterEClass = createEClass(HARDWARE_ADAPTER);
    createEAttribute(hardwareAdapterEClass, HARDWARE_ADAPTER__NAME);
    createEAttribute(hardwareAdapterEClass, HARDWARE_ADAPTER__DESCRIPTION);
    createEReference(hardwareAdapterEClass, HARDWARE_ADAPTER__HARDWARE_COMMANDS);
    createEReference(hardwareAdapterEClass, HARDWARE_ADAPTER__HARDWARE_MEASUREMENTS);
    createEReference(hardwareAdapterEClass, HARDWARE_ADAPTER__DEVICES);

    deviceEClass = createEClass(DEVICE);
    createEAttribute(deviceEClass, DEVICE__NAME);
    createEAttribute(deviceEClass, DEVICE__DESCRIPTION);
    createEReference(deviceEClass, DEVICE__DEVICE_COMMANDS);
    createEReference(deviceEClass, DEVICE__DEVICE_MEASUREMENTS);

    stateConstraintEClass = createEClass(STATE_CONSTRAINT);
    createEAttribute(stateConstraintEClass, STATE_CONSTRAINT__NAME);
    createEAttribute(stateConstraintEClass, STATE_CONSTRAINT__DESCRIPTION);

    stateUpdateEClass = createEClass(STATE_UPDATE);
    createEAttribute(stateUpdateEClass, STATE_UPDATE__NAME);
    createEAttribute(stateUpdateEClass, STATE_UPDATE__DESCRIPTION);

    hardwareCommandEClass = createEClass(HARDWARE_COMMAND);
    createEAttribute(hardwareCommandEClass, HARDWARE_COMMAND__NAME);
    createEAttribute(hardwareCommandEClass, HARDWARE_COMMAND__DESCRIPTION);

    hardwareMeasurementEClass = createEClass(HARDWARE_MEASUREMENT);
    createEAttribute(hardwareMeasurementEClass, HARDWARE_MEASUREMENT__NAME);
    createEAttribute(hardwareMeasurementEClass, HARDWARE_MEASUREMENT__DESCRIPTION);

    deviceCommandEClass = createEClass(DEVICE_COMMAND);
    createEAttribute(deviceCommandEClass, DEVICE_COMMAND__NAME);
    createEAttribute(deviceCommandEClass, DEVICE_COMMAND__DESCRIPTION);

    deviceMeasurementEClass = createEClass(DEVICE_MEASUREMENT);
    createEAttribute(deviceMeasurementEClass, DEVICE_MEASUREMENT__NAME);
    createEAttribute(deviceMeasurementEClass, DEVICE_MEASUREMENT__DESCRIPTION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(systemEClass, stateAnalysis.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, stateAnalysis.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSystem_Description(), ecorePackage.getEString(), "description", null, 0, 1, stateAnalysis.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystem_Subsystems(), this.getSubsystem(), null, "subsystems", null, 0, -1, stateAnalysis.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subsystemEClass, Subsystem.class, "Subsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubsystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubsystem_Description(), ecorePackage.getEString(), "description", null, 0, 1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubsystem_DeploymentSets(), this.getDeploymentSet(), null, "deploymentSets", null, 0, -1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deploymentSetEClass, DeploymentSet.class, "DeploymentSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeploymentSet_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeploymentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeploymentSet_Description(), ecorePackage.getEString(), "description", null, 0, 1, DeploymentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeploymentSet_Deployments(), this.getDeployment(), null, "deployments", null, 0, -1, DeploymentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeployment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeployment_Description(), ecorePackage.getEString(), "description", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeployment_Components(), this.getComponent(), null, "components", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeployment_Catalogs(), this.getDataCollection(), null, "catalogs", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponent_Description(), ecorePackage.getEString(), "description", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_StateVariables(), this.getStateVariable(), null, "stateVariables", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Controllers(), this.getController(), null, "controllers", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Estimators(), this.getEstimator(), null, "estimators", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Adapters(), this.getHardwareAdapter(), null, "adapters", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataCollectionEClass, DataCollection.class, "DataCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataCollection_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataCollection_Description(), ecorePackage.getEString(), "description", null, 0, 1, DataCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataCollection_Policies(), this.getQosPolicy(), null, "policies", null, 0, -1, DataCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataCollection_Products(), this.getDataProduct(), null, "products", null, 0, -1, DataCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qosPolicyEClass, QosPolicy.class, "QosPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQosPolicy_Name(), ecorePackage.getEString(), "name", null, 0, 1, QosPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQosPolicy_Description(), ecorePackage.getEString(), "description", null, 0, 1, QosPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQosPolicy_Policy(), ecorePackage.getEString(), "policy", null, 0, 1, QosPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataProductEClass, DataProduct.class, "DataProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataProduct_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataProduct_Description(), ecorePackage.getEString(), "description", null, 0, 1, DataProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataProduct_Content(), ecorePackage.getEString(), "content", null, 0, 1, DataProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateVariableEClass, StateVariable.class, "StateVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateVariable_Description(), ecorePackage.getEString(), "description", null, 0, 1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateVariable_RepresentationType(), ecorePackage.getEString(), "representationType", null, 0, 1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateVariable_InStateConstraints(), this.getStateConstraint(), null, "inStateConstraints", null, 0, -1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateVariable_OutStateConstraints(), this.getStateConstraint(), null, "outStateConstraints", null, 0, -1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateVariable_StateUpdates(), this.getStateUpdate(), null, "stateUpdates", null, 0, -1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateVariable_InfluencedBy(), this.getStateVariable(), null, "influencedBy", null, 0, -1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getController_Name(), ecorePackage.getEString(), "name", null, 0, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getController_Description(), ecorePackage.getEString(), "description", null, 0, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getController_Delegates(), this.getController(), null, "delegates", null, 0, -1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getController_StateConstraint(), this.getStateConstraint(), null, "stateConstraint", null, 0, -1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getController_HardwareCommand(), this.getHardwareCommand(), null, "hardwareCommand", null, 0, -1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(estimatorEClass, Estimator.class, "Estimator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEstimator_Name(), ecorePackage.getEString(), "name", null, 0, 1, Estimator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEstimator_Description(), ecorePackage.getEString(), "description", null, 0, 1, Estimator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEstimator_DistilledMeasurements(), this.getEstimator(), null, "distilledMeasurements", null, 0, -1, Estimator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEstimator_StateConstraints(), this.getStateConstraint(), null, "stateConstraints", null, 0, -1, Estimator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEstimator_StateUpdates(), this.getStateUpdate(), null, "stateUpdates", null, 0, -1, Estimator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEstimator_HardwareMeasurement(), this.getHardwareMeasurement(), null, "hardwareMeasurement", null, 0, -1, Estimator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hardwareAdapterEClass, HardwareAdapter.class, "HardwareAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHardwareAdapter_Name(), ecorePackage.getEString(), "name", null, 0, 1, HardwareAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHardwareAdapter_Description(), ecorePackage.getEString(), "description", null, 0, 1, HardwareAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHardwareAdapter_HardwareCommands(), this.getHardwareCommand(), null, "hardwareCommands", null, 0, -1, HardwareAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHardwareAdapter_HardwareMeasurements(), this.getHardwareMeasurement(), null, "hardwareMeasurements", null, 0, -1, HardwareAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHardwareAdapter_Devices(), this.getDevice(), null, "devices", null, 0, -1, HardwareAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDevice_Name(), ecorePackage.getEString(), "name", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDevice_Description(), ecorePackage.getEString(), "description", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDevice_DeviceCommands(), this.getDeviceCommand(), null, "deviceCommands", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDevice_DeviceMeasurements(), this.getDeviceMeasurement(), null, "deviceMeasurements", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateConstraintEClass, StateConstraint.class, "StateConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, StateConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateConstraint_Description(), ecorePackage.getEString(), "description", null, 0, 1, StateConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateUpdateEClass, StateUpdate.class, "StateUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateUpdate_Name(), ecorePackage.getEString(), "name", null, 0, 1, StateUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateUpdate_Description(), ecorePackage.getEString(), "description", null, 0, 1, StateUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hardwareCommandEClass, HardwareCommand.class, "HardwareCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHardwareCommand_Name(), ecorePackage.getEString(), "name", null, 0, 1, HardwareCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHardwareCommand_Description(), ecorePackage.getEString(), "description", null, 0, 1, HardwareCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hardwareMeasurementEClass, HardwareMeasurement.class, "HardwareMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHardwareMeasurement_Name(), ecorePackage.getEString(), "name", null, 0, 1, HardwareMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHardwareMeasurement_Description(), ecorePackage.getEString(), "description", null, 0, 1, HardwareMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceCommandEClass, DeviceCommand.class, "DeviceCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeviceCommand_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeviceCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeviceCommand_Description(), ecorePackage.getEString(), "description", null, 0, 1, DeviceCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceMeasurementEClass, DeviceMeasurement.class, "DeviceMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeviceMeasurement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeviceMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeviceMeasurement_Description(), ecorePackage.getEString(), "description", null, 0, 1, DeviceMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf
    createGmfAnnotations();
    // gmf.diagram
    createGmf_1Annotations();
    // gmf.compartment
    createGmf_2Annotations();
    // gmf.node
    createGmf_3Annotations();
    // gmf.link
    createGmf_4Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       });																																														
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.diagram";			
    addAnnotation
      (systemEClass, 
       source, 
       new String[] 
       {
       "diagram.extension", "sad"
       });																																													
  }

  /**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.compartment";				
    addAnnotation
      (getSystem_Subsystems(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "free"
       });			
    addAnnotation
      (getSubsystem_DeploymentSets(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "free"
       });			
    addAnnotation
      (getDeploymentSet_Deployments(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "free"
       });			
    addAnnotation
      (getDeployment_Components(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "free"
       });		
    addAnnotation
      (getDeployment_Catalogs(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "free"
       });			
    addAnnotation
      (getComponent_StateVariables(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "free"
       });		
    addAnnotation
      (getComponent_Controllers(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "free"
       });		
    addAnnotation
      (getComponent_Estimators(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "free"
       });		
    addAnnotation
      (getComponent_Adapters(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "free"
       });			
    addAnnotation
      (getDataCollection_Policies(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });		
    addAnnotation
      (getDataCollection_Products(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });					
    addAnnotation
      (getStateVariable_InStateConstraints(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });		
    addAnnotation
      (getStateVariable_OutStateConstraints(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });		
    addAnnotation
      (getStateVariable_StateUpdates(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });		
    addAnnotation
      (getStateVariable_InfluencedBy(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });				
    addAnnotation
      (getController_StateConstraint(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });		
    addAnnotation
      (getController_HardwareCommand(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });				
    addAnnotation
      (getEstimator_StateConstraints(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });		
    addAnnotation
      (getEstimator_StateUpdates(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });		
    addAnnotation
      (getEstimator_HardwareMeasurement(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });			
    addAnnotation
      (getHardwareAdapter_HardwareCommands(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });		
    addAnnotation
      (getHardwareAdapter_HardwareMeasurements(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });		
    addAnnotation
      (getHardwareAdapter_Devices(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "free"
       });			
    addAnnotation
      (getDevice_DeviceCommands(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });		
    addAnnotation
      (getDevice_DeviceMeasurements(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });						
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.node";					
    addAnnotation
      (subsystemEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "Subsystem: {0}"
       });			
    addAnnotation
      (deploymentSetEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "Deployment Set: {0}",
       "tool.name", "Deployment Set",
       "tool.description", "Creates a new deployment set for the system"
       });			
    addAnnotation
      (deploymentEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "Deployment: {0}",
       "tool.name", "Deployment",
       "tool.description", "Creates a new deployment for the deployment set"
       });				
    addAnnotation
      (componentEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "Component: {0}"
       });						
    addAnnotation
      (dataCollectionEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "Data Collection: {0}",
       "tool.name", "Data Collection"
       });				
    addAnnotation
      (qosPolicyEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "QoS Policy: {0}",
       "tool.name", "QoS Policy"
       });		
    addAnnotation
      (dataProductEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "Product: {0}",
       "tool.name", "Data Product"
       });		
    addAnnotation
      (stateVariableEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "SV: {0}",
       "tool.name", "State Variable"
       });						
    addAnnotation
      (controllerEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "Controller: {0}"
       });					
    addAnnotation
      (estimatorEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "Estimator: {0}"
       });						
    addAnnotation
      (hardwareAdapterEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "Hardware Adapter: {0}",
       "tool.name", "Hardware Adapter"
       });					
    addAnnotation
      (deviceEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "Device: {0}"
       });				
    addAnnotation
      (stateConstraintEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "State Constraint: {0}",
       "tool.name", "State Constraint"
       });		
    addAnnotation
      (stateUpdateEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "State Update: {0}",
       "tool.name", "State Update"
       });		
    addAnnotation
      (hardwareCommandEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "Command: {0}",
       "tool.name", "Hardware Command"
       });		
    addAnnotation
      (hardwareMeasurementEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "Measurement: {0}",
       "tool.name", "Hardware Measurement"
       });		
    addAnnotation
      (deviceCommandEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "Device Command: {0}",
       "tool.name", "Device Command"
       });		
    addAnnotation
      (deviceMeasurementEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.pattern", "Device Measurement: {0}",
       "tool.name", "Device Measurement"
       });
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_4Annotations()
  {
    String source = "gmf.link";																												
    addAnnotation
      (getController_Delegates(), 
       source, 
       new String[] 
       {
       "label", "delegates"
       });					
    addAnnotation
      (getEstimator_DistilledMeasurements(), 
       source, 
       new String[] 
       {
       "label", "distilled"
       });																
  }

} //StateAnalysisPackageImpl
