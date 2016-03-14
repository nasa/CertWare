/**
 */
package ftp.impl;

import ftp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class FtpFactoryImpl extends EFactoryImpl implements FtpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FtpFactory init() {
		try {
			FtpFactory theFtpFactory = (FtpFactory)EPackage.Registry.INSTANCE.getEFactory(FtpPackage.eNS_URI);
			if (theFtpFactory != null) {
				return theFtpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FtpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtpFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FtpPackage.FAULT_TREE: return createFaultTree();
			case FtpPackage.FT_NODE: return createFTNode();
			case FtpPackage.OR_GATE: return createOrGate();
			case FtpPackage.AND_GATE: return createAndGate();
			case FtpPackage.FAULT: return createFault();
			case FtpPackage.OBSERVATION: return createObservation();
			case FtpPackage.COMPONENT: return createComponent();
			case FtpPackage.PORT: return createPort();
			case FtpPackage.CONNECTION: return createConnection();
			case FtpPackage.DIGINTAL_CONNECTION: return createDigintalConnection();
			case FtpPackage.ANALOG_CONNECTION: return createAnalogConnection();
			case FtpPackage.SIGNAL_CONNECTION: return createSignalConnection();
			case FtpPackage.ELECTRICAL_CONNECTION: return createElectricalConnection();
			case FtpPackage.HYDRAULIC_CONNECTION: return createHydraulicConnection();
			case FtpPackage.MECHANICAL_CONNECTION: return createMechanicalConnection();
			case FtpPackage.PRIMITIVE_COMPONENT: return createPrimitiveComponent();
			case FtpPackage.COMPOSED_COMPONENT: return createComposedComponent();
			case FtpPackage.COMPOSITION_ELEMENT: return createCompositionElement();
			case FtpPackage.PORT_VALUE: return createPortValue();
			case FtpPackage.RESISTOR: return createResistor();
			case FtpPackage.CAPACITOR: return createCapacitor();
			case FtpPackage.ANALOG_BATTERY: return createAnalogBattery();
			case FtpPackage.ANALOG_SWITCH: return createAnalogSwitch();
			case FtpPackage.ANALOG_LAMP: return createAnalogLamp();
			case FtpPackage.DIGITAL_BATTERY: return createDigitalBattery();
			case FtpPackage.DIGITAL_SWITCH: return createDigitalSwitch();
			case FtpPackage.DIGITAL_LAMP: return createDigitalLamp();
			case FtpPackage.NOT: return createNot();
			case FtpPackage.XOR: return createXor();
			case FtpPackage.AND: return createAnd();
			case FtpPackage.NTRANSISTOR: return createNTransistor();
			case FtpPackage.PTRANSISTOR: return createPTransistor();
			case FtpPackage.DFLIP_FLOP: return createDFlipFlop();
			case FtpPackage.SIGNAL_PORT: return createSignalPort();
			case FtpPackage.ELECTRICAL_PORT: return createElectricalPort();
			case FtpPackage.HYDRAULIC_PORT: return createHydraulicPort();
			case FtpPackage.VISUAL_PORT: return createVisualPort();
			case FtpPackage.VISUAL_CONNECTION: return createVisualConnection();
			case FtpPackage.FAULT_TREE_CONTEXT: return createFaultTreeContext();
			case FtpPackage.ROOT_EVENT: return createRootEvent();
			case FtpPackage.MECHANICAL_PORT: return createMechanicalPort();
			case FtpPackage.TYPED_PORT_VALUE: return createTypedPortValue();
			case FtpPackage.SIGNAL_VALUE: return createSignalValue();
			case FtpPackage.ELECTRICAL_VALUE: return createElectricalValue();
			case FtpPackage.HYDRAULIC_VALUE: return createHydraulicValue();
			case FtpPackage.VISUAL_VALUE: return createVisualValue();
			case FtpPackage.FLOAT_VALUE: return createFloatValue();
			case FtpPackage.SIGNAL_CONSTANT: return createSignalConstant();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FtpPackage.SIGNAL_VALUES:
				return createSignalValuesFromString(eDataType, initialValue);
			case FtpPackage.VISUAL_VALUES:
				return createVisualValuesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FtpPackage.SIGNAL_VALUES:
				return convertSignalValuesToString(eDataType, instanceValue);
			case FtpPackage.VISUAL_VALUES:
				return convertVisualValuesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultTree createFaultTree() {
		FaultTreeImpl faultTree = new FaultTreeImpl();
		return faultTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FTNode createFTNode() {
		FTNodeImpl ftNode = new FTNodeImpl();
		return ftNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrGate createOrGate() {
		OrGateImpl orGate = new OrGateImpl();
		return orGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndGate createAndGate() {
		AndGateImpl andGate = new AndGateImpl();
		return andGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fault createFault() {
		FaultImpl fault = new FaultImpl();
		return fault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation createObservation() {
		ObservationImpl observation = new ObservationImpl();
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigintalConnection createDigintalConnection() {
		DigintalConnectionImpl digintalConnection = new DigintalConnectionImpl();
		return digintalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogConnection createAnalogConnection() {
		AnalogConnectionImpl analogConnection = new AnalogConnectionImpl();
		return analogConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalConnection createSignalConnection() {
		SignalConnectionImpl signalConnection = new SignalConnectionImpl();
		return signalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalConnection createElectricalConnection() {
		ElectricalConnectionImpl electricalConnection = new ElectricalConnectionImpl();
		return electricalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydraulicConnection createHydraulicConnection() {
		HydraulicConnectionImpl hydraulicConnection = new HydraulicConnectionImpl();
		return hydraulicConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MechanicalConnection createMechanicalConnection() {
		MechanicalConnectionImpl mechanicalConnection = new MechanicalConnectionImpl();
		return mechanicalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveComponent createPrimitiveComponent() {
		PrimitiveComponentImpl primitiveComponent = new PrimitiveComponentImpl();
		return primitiveComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedComponent createComposedComponent() {
		ComposedComponentImpl composedComponent = new ComposedComponentImpl();
		return composedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionElement createCompositionElement() {
		CompositionElementImpl compositionElement = new CompositionElementImpl();
		return compositionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortValue createPortValue() {
		PortValueImpl portValue = new PortValueImpl();
		return portValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resistor createResistor() {
		ResistorImpl resistor = new ResistorImpl();
		return resistor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capacitor createCapacitor() {
		CapacitorImpl capacitor = new CapacitorImpl();
		return capacitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogBattery createAnalogBattery() {
		AnalogBatteryImpl analogBattery = new AnalogBatteryImpl();
		return analogBattery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogSwitch createAnalogSwitch() {
		AnalogSwitchImpl analogSwitch = new AnalogSwitchImpl();
		return analogSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogLamp createAnalogLamp() {
		AnalogLampImpl analogLamp = new AnalogLampImpl();
		return analogLamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalBattery createDigitalBattery() {
		DigitalBatteryImpl digitalBattery = new DigitalBatteryImpl();
		return digitalBattery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalSwitch createDigitalSwitch() {
		DigitalSwitchImpl digitalSwitch = new DigitalSwitchImpl();
		return digitalSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalLamp createDigitalLamp() {
		DigitalLampImpl digitalLamp = new DigitalLampImpl();
		return digitalLamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xor createXor() {
		XorImpl xor = new XorImpl();
		return xor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NTransistor createNTransistor() {
		NTransistorImpl nTransistor = new NTransistorImpl();
		return nTransistor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTransistor createPTransistor() {
		PTransistorImpl pTransistor = new PTransistorImpl();
		return pTransistor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFlipFlop createDFlipFlop() {
		DFlipFlopImpl dFlipFlop = new DFlipFlopImpl();
		return dFlipFlop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalPort createSignalPort() {
		SignalPortImpl signalPort = new SignalPortImpl();
		return signalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalPort createElectricalPort() {
		ElectricalPortImpl electricalPort = new ElectricalPortImpl();
		return electricalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydraulicPort createHydraulicPort() {
		HydraulicPortImpl hydraulicPort = new HydraulicPortImpl();
		return hydraulicPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualPort createVisualPort() {
		VisualPortImpl visualPort = new VisualPortImpl();
		return visualPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualConnection createVisualConnection() {
		VisualConnectionImpl visualConnection = new VisualConnectionImpl();
		return visualConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MechanicalPort createMechanicalPort() {
		MechanicalPortImpl mechanicalPort = new MechanicalPortImpl();
		return mechanicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedPortValue createTypedPortValue() {
		TypedPortValueImpl typedPortValue = new TypedPortValueImpl();
		return typedPortValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalValue createSignalValue() {
		SignalValueImpl signalValue = new SignalValueImpl();
		return signalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalValue createElectricalValue() {
		ElectricalValueImpl electricalValue = new ElectricalValueImpl();
		return electricalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydraulicValue createHydraulicValue() {
		HydraulicValueImpl hydraulicValue = new HydraulicValueImpl();
		return hydraulicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualValue createVisualValue() {
		VisualValueImpl visualValue = new VisualValueImpl();
		return visualValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatValue createFloatValue() {
		FloatValueImpl floatValue = new FloatValueImpl();
		return floatValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalConstant createSignalConstant() {
		SignalConstantImpl signalConstant = new SignalConstantImpl();
		return signalConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalValues createSignalValuesFromString(EDataType eDataType, String initialValue) {
		SignalValues result = SignalValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualValues createVisualValuesFromString(EDataType eDataType, String initialValue) {
		VisualValues result = VisualValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisualValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultTreeContext createFaultTreeContext() {
		FaultTreeContextImpl faultTreeContext = new FaultTreeContextImpl();
		return faultTreeContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootEvent createRootEvent() {
		RootEventImpl rootEvent = new RootEventImpl();
		return rootEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtpPackage getFtpPackage() {
		return (FtpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FtpPackage getPackage() {
		return FtpPackage.eINSTANCE;
	}

} //FtpFactoryImpl
