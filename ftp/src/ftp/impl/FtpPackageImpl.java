/**
 */
package ftp.impl;

import ftp.AnalogBattery;
import ftp.AnalogConnection;
import ftp.AnalogLamp;
import ftp.AnalogSwitch;
import ftp.And;
import ftp.AndGate;
import ftp.Capacitor;
import ftp.Component;
import ftp.ComposedComponent;
import ftp.CompositionElement;
import ftp.Connection;
import ftp.DFlipFlop;
import ftp.DigintalConnection;
import ftp.DigitalBattery;
import ftp.DigitalLamp;
import ftp.DigitalSwitch;
import ftp.ElectricalConnection;
import ftp.ElectricalPort;
import ftp.ElectricalValue;
import ftp.FTNode;
import ftp.Fault;
import ftp.FaultTree;
import ftp.FaultTreeContext;
import ftp.FloatValue;
import ftp.FtpFactory;
import ftp.FtpPackage;
import ftp.HydraulicConnection;
import ftp.HydraulicPort;
import ftp.HydraulicValue;
import ftp.MechanicalConnection;
import ftp.MechanicalPort;
import ftp.NTransistor;
import ftp.Not;
import ftp.Observation;
import ftp.OrGate;
import ftp.PTransistor;
import ftp.Port;
import ftp.PortValue;
import ftp.PrimitiveComponent;
import ftp.Resistor;
import ftp.RootEvent;
import ftp.SignalConnection;

import ftp.SignalConstant;
import ftp.SignalPort;
import ftp.SignalValue;
import ftp.SignalValues;
import ftp.TypedPortValue;
import ftp.VisualConnection;
import ftp.VisualPort;
import ftp.VisualValue;
import ftp.VisualValues;
import ftp.Xor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FtpPackageImpl extends EPackageImpl implements FtpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultTreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ftNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationEClass = null;

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
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digintalConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricalConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hydraulicConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mechanicalConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composedComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resistorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capacitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogBatteryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogLampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalBatteryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalLampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nTransistorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pTransistorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dFlipFlopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricalPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hydraulicPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mechanicalPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedPortValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hydraulicValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signalValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visualValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultTreeContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEventEClass = null;

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
	 * @see ftp.FtpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FtpPackageImpl() {
		super(eNS_URI, FtpFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FtpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FtpPackage init() {
		if (isInited) return (FtpPackage)EPackage.Registry.INSTANCE.getEPackage(FtpPackage.eNS_URI);

		// Obtain or create and register package
		FtpPackageImpl theFtpPackage = (FtpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FtpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FtpPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFtpPackage.createPackageContents();

		// Initialize created meta-data
		theFtpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFtpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FtpPackage.eNS_URI, theFtpPackage);
		return theFtpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaultTree() {
		return faultTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultTree_Ftnodes() {
		return (EReference)faultTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultTree_Root() {
		return (EReference)faultTreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFTNode() {
		return ftNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrGate() {
		return orGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrGate_Inputs() {
		return (EReference)orGateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndGate() {
		return andGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndGate_Inputs() {
		return (EReference)andGateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFault() {
		return faultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFault_Description() {
		return (EAttribute)faultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservation() {
		return observationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Component() {
		return (EReference)observationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_PortValues() {
		return (EReference)observationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservation_Name() {
		return (EAttribute)observationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservation_FaultLimit() {
		return (EAttribute)observationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Faulttree() {
		return (EReference)observationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObservation__BuildFaultTree() {
		return observationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Type() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Name() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Type() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPort__NewPortValue() {
		return portEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_FromPort() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_ToPort() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigintalConnection() {
		return digintalConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalogConnection() {
		return analogConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalConnection() {
		return signalConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricalConnection() {
		return electricalConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHydraulicConnection() {
		return hydraulicConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMechanicalConnection() {
		return mechanicalConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveComponent() {
		return primitiveComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposedComponent() {
		return composedComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedComponent_Composition() {
		return (EReference)composedComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedComponent_Ports() {
		return (EReference)composedComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionElement() {
		return compositionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortValue() {
		return portValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortValue_Value() {
		return (EReference)portValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortValue_Port() {
		return (EReference)portValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResistor() {
		return resistorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResistor_Resistance() {
		return (EAttribute)resistorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResistor_InPort() {
		return (EReference)resistorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResistor_OutPort() {
		return (EReference)resistorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapacitor() {
		return capacitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalogBattery() {
		return analogBatteryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalogBattery_InPort() {
		return (EReference)analogBatteryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalogBattery_OutPort() {
		return (EReference)analogBatteryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogBattery_Voltage() {
		return (EAttribute)analogBatteryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalogSwitch() {
		return analogSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalogSwitch_InPort() {
		return (EReference)analogSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalogSwitch_SetPort() {
		return (EReference)analogSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalogSwitch_OutPort() {
		return (EReference)analogSwitchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalogLamp() {
		return analogLampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalogLamp_InPort() {
		return (EReference)analogLampEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalogLamp_OutPort() {
		return (EReference)analogLampEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalogLamp_LightPort() {
		return (EReference)analogLampEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalBattery() {
		return digitalBatteryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalBattery_InPort() {
		return (EReference)digitalBatteryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalBattery_OutPort() {
		return (EReference)digitalBatteryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalSwitch() {
		return digitalSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalSwitch_InPort() {
		return (EReference)digitalSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalSwitch_SetPort() {
		return (EReference)digitalSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalSwitch_OutPort() {
		return (EReference)digitalSwitchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalLamp() {
		return digitalLampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalLamp_InPort() {
		return (EReference)digitalLampEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalLamp_OutPort() {
		return (EReference)digitalLampEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalLamp_LightPort() {
		return (EReference)digitalLampEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXor() {
		return xorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNTransistor() {
		return nTransistorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNTransistor_Gate() {
		return (EReference)nTransistorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNTransistor_Source() {
		return (EReference)nTransistorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNTransistor_Drain() {
		return (EReference)nTransistorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTransistor() {
		return pTransistorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTransistor_Gate() {
		return (EReference)pTransistorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTransistor_Source() {
		return (EReference)pTransistorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPTransistor_Drain() {
		return (EReference)pTransistorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDFlipFlop() {
		return dFlipFlopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFlipFlop_InPort() {
		return (EReference)dFlipFlopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFlipFlop_ClockPort() {
		return (EReference)dFlipFlopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFlipFlop_OutPort() {
		return (EReference)dFlipFlopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFlipFlop_StatePort() {
		return (EReference)dFlipFlopEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalPort() {
		return signalPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricalPort() {
		return electricalPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHydraulicPort() {
		return hydraulicPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualPort() {
		return visualPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualConnection() {
		return visualConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMechanicalPort() {
		return mechanicalPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedPortValue() {
		return typedPortValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalValue() {
		return signalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalValue_Signal() {
		return (EAttribute)signalValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricalValue() {
		return electricalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricalValue_Current() {
		return (EAttribute)electricalValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricalValue_Voltage() {
		return (EAttribute)electricalValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricalValue_AnyCurrent() {
		return (EAttribute)electricalValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricalValue_AnyVoltage() {
		return (EAttribute)electricalValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHydraulicValue() {
		return hydraulicValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHydraulicValue_Flow() {
		return (EAttribute)hydraulicValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHydraulicValue_Pressure() {
		return (EAttribute)hydraulicValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHydraulicValue_AnyFlow() {
		return (EAttribute)hydraulicValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHydraulicValue_AnyPressure() {
		return (EAttribute)hydraulicValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualValue() {
		return visualValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualValue_Bulb() {
		return (EAttribute)visualValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatValue() {
		return floatValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatValue_Value() {
		return (EAttribute)floatValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalConstant() {
		return signalConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalConstant_OutPort() {
		return (EReference)signalConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalConstant_Value() {
		return (EAttribute)signalConstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSignalValues() {
		return signalValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisualValues() {
		return visualValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaultTreeContext() {
		return faultTreeContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultTreeContext_Composition() {
		return (EReference)faultTreeContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultTreeContext_Observations() {
		return (EReference)faultTreeContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootEvent() {
		return rootEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRootEvent_Observation() {
		return (EAttribute)rootEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootEvent_Inputs() {
		return (EReference)rootEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtpFactory getFtpFactory() {
		return (FtpFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		faultTreeEClass = createEClass(FAULT_TREE);
		createEReference(faultTreeEClass, FAULT_TREE__FTNODES);
		createEReference(faultTreeEClass, FAULT_TREE__ROOT);

		ftNodeEClass = createEClass(FT_NODE);

		orGateEClass = createEClass(OR_GATE);
		createEReference(orGateEClass, OR_GATE__INPUTS);

		andGateEClass = createEClass(AND_GATE);
		createEReference(andGateEClass, AND_GATE__INPUTS);

		faultEClass = createEClass(FAULT);
		createEAttribute(faultEClass, FAULT__DESCRIPTION);

		observationEClass = createEClass(OBSERVATION);
		createEReference(observationEClass, OBSERVATION__COMPONENT);
		createEReference(observationEClass, OBSERVATION__PORT_VALUES);
		createEAttribute(observationEClass, OBSERVATION__NAME);
		createEAttribute(observationEClass, OBSERVATION__FAULT_LIMIT);
		createEReference(observationEClass, OBSERVATION__FAULTTREE);
		createEOperation(observationEClass, OBSERVATION___BUILD_FAULT_TREE);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEAttribute(componentEClass, COMPONENT__TYPE);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__NAME);
		createEAttribute(portEClass, PORT__TYPE);
		createEOperation(portEClass, PORT___NEW_PORT_VALUE);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__FROM_PORT);
		createEReference(connectionEClass, CONNECTION__TO_PORT);

		digintalConnectionEClass = createEClass(DIGINTAL_CONNECTION);

		analogConnectionEClass = createEClass(ANALOG_CONNECTION);

		signalConnectionEClass = createEClass(SIGNAL_CONNECTION);

		electricalConnectionEClass = createEClass(ELECTRICAL_CONNECTION);

		hydraulicConnectionEClass = createEClass(HYDRAULIC_CONNECTION);

		mechanicalConnectionEClass = createEClass(MECHANICAL_CONNECTION);

		primitiveComponentEClass = createEClass(PRIMITIVE_COMPONENT);

		composedComponentEClass = createEClass(COMPOSED_COMPONENT);
		createEReference(composedComponentEClass, COMPOSED_COMPONENT__COMPOSITION);
		createEReference(composedComponentEClass, COMPOSED_COMPONENT__PORTS);

		compositionElementEClass = createEClass(COMPOSITION_ELEMENT);

		portValueEClass = createEClass(PORT_VALUE);
		createEReference(portValueEClass, PORT_VALUE__PORT);
		createEReference(portValueEClass, PORT_VALUE__VALUE);

		resistorEClass = createEClass(RESISTOR);
		createEAttribute(resistorEClass, RESISTOR__RESISTANCE);
		createEReference(resistorEClass, RESISTOR__IN_PORT);
		createEReference(resistorEClass, RESISTOR__OUT_PORT);

		capacitorEClass = createEClass(CAPACITOR);

		analogBatteryEClass = createEClass(ANALOG_BATTERY);
		createEReference(analogBatteryEClass, ANALOG_BATTERY__IN_PORT);
		createEReference(analogBatteryEClass, ANALOG_BATTERY__OUT_PORT);
		createEAttribute(analogBatteryEClass, ANALOG_BATTERY__VOLTAGE);

		analogSwitchEClass = createEClass(ANALOG_SWITCH);
		createEReference(analogSwitchEClass, ANALOG_SWITCH__IN_PORT);
		createEReference(analogSwitchEClass, ANALOG_SWITCH__SET_PORT);
		createEReference(analogSwitchEClass, ANALOG_SWITCH__OUT_PORT);

		analogLampEClass = createEClass(ANALOG_LAMP);
		createEReference(analogLampEClass, ANALOG_LAMP__IN_PORT);
		createEReference(analogLampEClass, ANALOG_LAMP__OUT_PORT);
		createEReference(analogLampEClass, ANALOG_LAMP__LIGHT_PORT);

		digitalBatteryEClass = createEClass(DIGITAL_BATTERY);
		createEReference(digitalBatteryEClass, DIGITAL_BATTERY__IN_PORT);
		createEReference(digitalBatteryEClass, DIGITAL_BATTERY__OUT_PORT);

		digitalSwitchEClass = createEClass(DIGITAL_SWITCH);
		createEReference(digitalSwitchEClass, DIGITAL_SWITCH__IN_PORT);
		createEReference(digitalSwitchEClass, DIGITAL_SWITCH__SET_PORT);
		createEReference(digitalSwitchEClass, DIGITAL_SWITCH__OUT_PORT);

		digitalLampEClass = createEClass(DIGITAL_LAMP);
		createEReference(digitalLampEClass, DIGITAL_LAMP__IN_PORT);
		createEReference(digitalLampEClass, DIGITAL_LAMP__OUT_PORT);
		createEReference(digitalLampEClass, DIGITAL_LAMP__LIGHT_PORT);

		notEClass = createEClass(NOT);

		xorEClass = createEClass(XOR);

		andEClass = createEClass(AND);

		nTransistorEClass = createEClass(NTRANSISTOR);
		createEReference(nTransistorEClass, NTRANSISTOR__GATE);
		createEReference(nTransistorEClass, NTRANSISTOR__SOURCE);
		createEReference(nTransistorEClass, NTRANSISTOR__DRAIN);

		pTransistorEClass = createEClass(PTRANSISTOR);
		createEReference(pTransistorEClass, PTRANSISTOR__GATE);
		createEReference(pTransistorEClass, PTRANSISTOR__SOURCE);
		createEReference(pTransistorEClass, PTRANSISTOR__DRAIN);

		dFlipFlopEClass = createEClass(DFLIP_FLOP);
		createEReference(dFlipFlopEClass, DFLIP_FLOP__IN_PORT);
		createEReference(dFlipFlopEClass, DFLIP_FLOP__CLOCK_PORT);
		createEReference(dFlipFlopEClass, DFLIP_FLOP__OUT_PORT);
		createEReference(dFlipFlopEClass, DFLIP_FLOP__STATE_PORT);

		signalPortEClass = createEClass(SIGNAL_PORT);

		electricalPortEClass = createEClass(ELECTRICAL_PORT);

		hydraulicPortEClass = createEClass(HYDRAULIC_PORT);

		visualPortEClass = createEClass(VISUAL_PORT);

		visualConnectionEClass = createEClass(VISUAL_CONNECTION);

		faultTreeContextEClass = createEClass(FAULT_TREE_CONTEXT);
		createEReference(faultTreeContextEClass, FAULT_TREE_CONTEXT__COMPOSITION);
		createEReference(faultTreeContextEClass, FAULT_TREE_CONTEXT__OBSERVATIONS);

		rootEventEClass = createEClass(ROOT_EVENT);
		createEAttribute(rootEventEClass, ROOT_EVENT__OBSERVATION);
		createEReference(rootEventEClass, ROOT_EVENT__INPUTS);

		mechanicalPortEClass = createEClass(MECHANICAL_PORT);

		typedPortValueEClass = createEClass(TYPED_PORT_VALUE);

		signalValueEClass = createEClass(SIGNAL_VALUE);
		createEAttribute(signalValueEClass, SIGNAL_VALUE__SIGNAL);

		electricalValueEClass = createEClass(ELECTRICAL_VALUE);
		createEAttribute(electricalValueEClass, ELECTRICAL_VALUE__CURRENT);
		createEAttribute(electricalValueEClass, ELECTRICAL_VALUE__VOLTAGE);
		createEAttribute(electricalValueEClass, ELECTRICAL_VALUE__ANY_CURRENT);
		createEAttribute(electricalValueEClass, ELECTRICAL_VALUE__ANY_VOLTAGE);

		hydraulicValueEClass = createEClass(HYDRAULIC_VALUE);
		createEAttribute(hydraulicValueEClass, HYDRAULIC_VALUE__FLOW);
		createEAttribute(hydraulicValueEClass, HYDRAULIC_VALUE__PRESSURE);
		createEAttribute(hydraulicValueEClass, HYDRAULIC_VALUE__ANY_FLOW);
		createEAttribute(hydraulicValueEClass, HYDRAULIC_VALUE__ANY_PRESSURE);

		visualValueEClass = createEClass(VISUAL_VALUE);
		createEAttribute(visualValueEClass, VISUAL_VALUE__BULB);

		floatValueEClass = createEClass(FLOAT_VALUE);
		createEAttribute(floatValueEClass, FLOAT_VALUE__VALUE);

		signalConstantEClass = createEClass(SIGNAL_CONSTANT);
		createEReference(signalConstantEClass, SIGNAL_CONSTANT__OUT_PORT);
		createEAttribute(signalConstantEClass, SIGNAL_CONSTANT__VALUE);

		// Create enums
		signalValuesEEnum = createEEnum(SIGNAL_VALUES);
		visualValuesEEnum = createEEnum(VISUAL_VALUES);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		orGateEClass.getESuperTypes().add(this.getFTNode());
		andGateEClass.getESuperTypes().add(this.getFTNode());
		faultEClass.getESuperTypes().add(this.getFTNode());
		componentEClass.getESuperTypes().add(this.getCompositionElement());
		connectionEClass.getESuperTypes().add(this.getCompositionElement());
		digintalConnectionEClass.getESuperTypes().add(this.getConnection());
		analogConnectionEClass.getESuperTypes().add(this.getConnection());
		signalConnectionEClass.getESuperTypes().add(this.getDigintalConnection());
		electricalConnectionEClass.getESuperTypes().add(this.getAnalogConnection());
		hydraulicConnectionEClass.getESuperTypes().add(this.getAnalogConnection());
		mechanicalConnectionEClass.getESuperTypes().add(this.getAnalogConnection());
		primitiveComponentEClass.getESuperTypes().add(this.getComponent());
		composedComponentEClass.getESuperTypes().add(this.getComponent());
		resistorEClass.getESuperTypes().add(this.getPrimitiveComponent());
		capacitorEClass.getESuperTypes().add(this.getPrimitiveComponent());
		analogBatteryEClass.getESuperTypes().add(this.getPrimitiveComponent());
		analogSwitchEClass.getESuperTypes().add(this.getPrimitiveComponent());
		analogLampEClass.getESuperTypes().add(this.getPrimitiveComponent());
		digitalBatteryEClass.getESuperTypes().add(this.getPrimitiveComponent());
		digitalSwitchEClass.getESuperTypes().add(this.getPrimitiveComponent());
		digitalLampEClass.getESuperTypes().add(this.getPrimitiveComponent());
		notEClass.getESuperTypes().add(this.getPrimitiveComponent());
		xorEClass.getESuperTypes().add(this.getPrimitiveComponent());
		andEClass.getESuperTypes().add(this.getPrimitiveComponent());
		nTransistorEClass.getESuperTypes().add(this.getPrimitiveComponent());
		pTransistorEClass.getESuperTypes().add(this.getPrimitiveComponent());
		dFlipFlopEClass.getESuperTypes().add(this.getPrimitiveComponent());
		signalPortEClass.getESuperTypes().add(this.getPort());
		electricalPortEClass.getESuperTypes().add(this.getPort());
		hydraulicPortEClass.getESuperTypes().add(this.getPort());
		visualPortEClass.getESuperTypes().add(this.getPort());
		visualConnectionEClass.getESuperTypes().add(this.getConnection());
		rootEventEClass.getESuperTypes().add(this.getFTNode());
		mechanicalPortEClass.getESuperTypes().add(this.getPort());
		signalValueEClass.getESuperTypes().add(this.getTypedPortValue());
		electricalValueEClass.getESuperTypes().add(this.getTypedPortValue());
		hydraulicValueEClass.getESuperTypes().add(this.getTypedPortValue());
		visualValueEClass.getESuperTypes().add(this.getTypedPortValue());
		floatValueEClass.getESuperTypes().add(this.getTypedPortValue());
		signalConstantEClass.getESuperTypes().add(this.getPrimitiveComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(faultTreeEClass, FaultTree.class, "FaultTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFaultTree_Ftnodes(), this.getFTNode(), null, "ftnodes", null, 1, -1, FaultTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultTree_Root(), this.getFTNode(), null, "root", null, 1, 1, FaultTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ftNodeEClass, FTNode.class, "FTNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orGateEClass, OrGate.class, "OrGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrGate_Inputs(), this.getFTNode(), null, "inputs", null, 2, -1, OrGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andGateEClass, AndGate.class, "AndGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndGate_Inputs(), this.getFTNode(), null, "inputs", null, 2, -1, AndGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(faultEClass, Fault.class, "Fault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFault_Description(), ecorePackage.getEString(), "description", null, 1, 1, Fault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observationEClass, Observation.class, "Observation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObservation_Component(), this.getComponent(), null, "component", null, 1, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservation_PortValues(), this.getPortValue(), null, "portValues", null, 0, -1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObservation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObservation_FaultLimit(), ecorePackage.getEInt(), "faultLimit", null, 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservation_Faulttree(), this.getFaultTree(), null, "faulttree", null, 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getObservation__BuildFaultTree(), this.getFaultTree(), "buildFaultTree", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Type(), ecorePackage.getEString(), "type", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Type(), ecorePackage.getEString(), "type", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPort__NewPortValue(), this.getTypedPortValue(), "newPortValue", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_FromPort(), this.getPort(), null, "fromPort", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_ToPort(), this.getPort(), null, "toPort", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digintalConnectionEClass, DigintalConnection.class, "DigintalConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(analogConnectionEClass, AnalogConnection.class, "AnalogConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signalConnectionEClass, SignalConnection.class, "SignalConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(electricalConnectionEClass, ElectricalConnection.class, "ElectricalConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hydraulicConnectionEClass, HydraulicConnection.class, "HydraulicConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mechanicalConnectionEClass, MechanicalConnection.class, "MechanicalConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveComponentEClass, PrimitiveComponent.class, "PrimitiveComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(composedComponentEClass, ComposedComponent.class, "ComposedComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposedComponent_Composition(), this.getCompositionElement(), null, "composition", null, 0, -1, ComposedComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposedComponent_Ports(), this.getPort(), null, "ports", null, 0, -1, ComposedComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionElementEClass, CompositionElement.class, "CompositionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portValueEClass, PortValue.class, "PortValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortValue_Port(), this.getPort(), null, "port", null, 1, 1, PortValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortValue_Value(), this.getTypedPortValue(), null, "value", null, 1, 1, PortValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resistorEClass, Resistor.class, "Resistor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResistor_Resistance(), ecorePackage.getEFloat(), "resistance", "6.0", 1, 1, Resistor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResistor_InPort(), this.getElectricalPort(), null, "inPort", null, 1, 1, Resistor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResistor_OutPort(), this.getElectricalPort(), null, "outPort", null, 1, 1, Resistor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capacitorEClass, Capacitor.class, "Capacitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(analogBatteryEClass, AnalogBattery.class, "AnalogBattery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalogBattery_InPort(), this.getElectricalPort(), null, "inPort", null, 1, 1, AnalogBattery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalogBattery_OutPort(), this.getElectricalPort(), null, "outPort", null, 1, 1, AnalogBattery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalogBattery_Voltage(), ecorePackage.getEFloat(), "voltage", "12.0", 1, 1, AnalogBattery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogSwitchEClass, AnalogSwitch.class, "AnalogSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalogSwitch_InPort(), this.getElectricalPort(), null, "inPort", null, 1, 1, AnalogSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalogSwitch_SetPort(), this.getSignalPort(), null, "setPort", null, 1, 1, AnalogSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalogSwitch_OutPort(), this.getElectricalPort(), null, "outPort", null, 1, 1, AnalogSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogLampEClass, AnalogLamp.class, "AnalogLamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalogLamp_InPort(), this.getElectricalPort(), null, "inPort", null, 1, 1, AnalogLamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalogLamp_OutPort(), this.getElectricalPort(), null, "outPort", null, 1, 1, AnalogLamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalogLamp_LightPort(), this.getVisualPort(), null, "lightPort", null, 1, 1, AnalogLamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digitalBatteryEClass, DigitalBattery.class, "DigitalBattery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDigitalBattery_InPort(), this.getSignalPort(), null, "inPort", null, 1, 1, DigitalBattery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDigitalBattery_OutPort(), this.getSignalPort(), null, "outPort", null, 1, 1, DigitalBattery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digitalSwitchEClass, DigitalSwitch.class, "DigitalSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDigitalSwitch_InPort(), this.getSignalPort(), null, "inPort", null, 1, 1, DigitalSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDigitalSwitch_SetPort(), this.getSignalPort(), null, "setPort", null, 1, 1, DigitalSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDigitalSwitch_OutPort(), this.getSignalPort(), null, "outPort", null, 1, 1, DigitalSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digitalLampEClass, DigitalLamp.class, "DigitalLamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDigitalLamp_InPort(), this.getSignalPort(), null, "inPort", null, 1, 1, DigitalLamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDigitalLamp_OutPort(), this.getSignalPort(), null, "outPort", null, 1, 1, DigitalLamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDigitalLamp_LightPort(), this.getVisualPort(), null, "lightPort", null, 1, 1, DigitalLamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xorEClass, Xor.class, "Xor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nTransistorEClass, NTransistor.class, "NTransistor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNTransistor_Gate(), this.getSignalPort(), null, "gate", null, 1, 1, NTransistor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNTransistor_Source(), this.getSignalPort(), null, "source", null, 1, 1, NTransistor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNTransistor_Drain(), this.getSignalPort(), null, "drain", null, 1, 1, NTransistor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pTransistorEClass, PTransistor.class, "PTransistor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPTransistor_Gate(), this.getSignalPort(), null, "gate", null, 1, 1, PTransistor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTransistor_Source(), this.getSignalPort(), null, "source", null, 1, 1, PTransistor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPTransistor_Drain(), this.getSignalPort(), null, "drain", null, 1, 1, PTransistor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dFlipFlopEClass, DFlipFlop.class, "DFlipFlop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDFlipFlop_InPort(), this.getSignalPort(), null, "inPort", null, 1, 1, DFlipFlop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFlipFlop_ClockPort(), this.getSignalPort(), null, "clockPort", null, 1, 1, DFlipFlop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFlipFlop_OutPort(), this.getSignalPort(), null, "outPort", null, 1, 1, DFlipFlop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFlipFlop_StatePort(), this.getSignalPort(), null, "statePort", null, 1, 1, DFlipFlop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalPortEClass, SignalPort.class, "SignalPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(electricalPortEClass, ElectricalPort.class, "ElectricalPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hydraulicPortEClass, HydraulicPort.class, "HydraulicPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visualPortEClass, VisualPort.class, "VisualPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visualConnectionEClass, VisualConnection.class, "VisualConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(faultTreeContextEClass, FaultTreeContext.class, "FaultTreeContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFaultTreeContext_Composition(), this.getComposedComponent(), null, "composition", null, 1, 1, FaultTreeContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultTreeContext_Observations(), this.getObservation(), null, "observations", null, 0, -1, FaultTreeContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEventEClass, RootEvent.class, "RootEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRootEvent_Observation(), ecorePackage.getEString(), "observation", null, 1, 1, RootEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootEvent_Inputs(), this.getFTNode(), null, "inputs", null, 1, -1, RootEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mechanicalPortEClass, MechanicalPort.class, "MechanicalPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedPortValueEClass, TypedPortValue.class, "TypedPortValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signalValueEClass, SignalValue.class, "SignalValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalValue_Signal(), this.getSignalValues(), "signal", null, 1, 1, SignalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(electricalValueEClass, ElectricalValue.class, "ElectricalValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElectricalValue_Current(), ecorePackage.getEFloat(), "current", null, 1, 1, ElectricalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectricalValue_Voltage(), ecorePackage.getEFloat(), "voltage", null, 1, 1, ElectricalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectricalValue_AnyCurrent(), ecorePackage.getEBoolean(), "anyCurrent", null, 1, 1, ElectricalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectricalValue_AnyVoltage(), ecorePackage.getEBoolean(), "anyVoltage", null, 1, 1, ElectricalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hydraulicValueEClass, HydraulicValue.class, "HydraulicValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHydraulicValue_Flow(), ecorePackage.getEFloat(), "flow", null, 1, 1, HydraulicValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHydraulicValue_Pressure(), ecorePackage.getEFloat(), "pressure", null, 1, 1, HydraulicValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHydraulicValue_AnyFlow(), ecorePackage.getEBoolean(), "anyFlow", null, 1, 1, HydraulicValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHydraulicValue_AnyPressure(), ecorePackage.getEBoolean(), "anyPressure", null, 1, 1, HydraulicValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualValueEClass, VisualValue.class, "VisualValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisualValue_Bulb(), this.getVisualValues(), "bulb", null, 1, 1, VisualValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatValueEClass, FloatValue.class, "FloatValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatValue_Value(), ecorePackage.getEFloat(), "value", null, 1, 1, FloatValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalConstantEClass, SignalConstant.class, "SignalConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalConstant_OutPort(), this.getSignalPort(), null, "outPort", null, 1, 1, SignalConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalConstant_Value(), this.getSignalValues(), "value", null, 1, 1, SignalConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(signalValuesEEnum, SignalValues.class, "SignalValues");
		addEEnumLiteral(signalValuesEEnum, SignalValues.OFF);
		addEEnumLiteral(signalValuesEEnum, SignalValues.ON);
		addEEnumLiteral(signalValuesEEnum, SignalValues.ANY);

		initEEnum(visualValuesEEnum, VisualValues.class, "VisualValues");
		addEEnumLiteral(visualValuesEEnum, VisualValues.LIGHT);
		addEEnumLiteral(visualValuesEEnum, VisualValues.DARK);
		addEEnumLiteral(visualValuesEEnum, VisualValues.ANY);

		// Create resource
		createResource(eNS_URI);
	}

} //FtpPackageImpl
