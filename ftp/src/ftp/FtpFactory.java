/**
 */
package ftp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ftp.FtpPackage
 * @generated
 */
public interface FtpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FtpFactory eINSTANCE = ftp.impl.FtpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fault Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Tree</em>'.
	 * @generated
	 */
	FaultTree createFaultTree();

	/**
	 * Returns a new object of class '<em>FT Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FT Node</em>'.
	 * @generated
	 */
	FTNode createFTNode();

	/**
	 * Returns a new object of class '<em>Or Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Gate</em>'.
	 * @generated
	 */
	OrGate createOrGate();

	/**
	 * Returns a new object of class '<em>And Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Gate</em>'.
	 * @generated
	 */
	AndGate createAndGate();

	/**
	 * Returns a new object of class '<em>Fault</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault</em>'.
	 * @generated
	 */
	Fault createFault();

	/**
	 * Returns a new object of class '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation</em>'.
	 * @generated
	 */
	Observation createObservation();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Digintal Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digintal Connection</em>'.
	 * @generated
	 */
	DigintalConnection createDigintalConnection();

	/**
	 * Returns a new object of class '<em>Analog Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Connection</em>'.
	 * @generated
	 */
	AnalogConnection createAnalogConnection();

	/**
	 * Returns a new object of class '<em>Signal Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Connection</em>'.
	 * @generated
	 */
	SignalConnection createSignalConnection();

	/**
	 * Returns a new object of class '<em>Electrical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Electrical Connection</em>'.
	 * @generated
	 */
	ElectricalConnection createElectricalConnection();

	/**
	 * Returns a new object of class '<em>Hydraulic Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hydraulic Connection</em>'.
	 * @generated
	 */
	HydraulicConnection createHydraulicConnection();

	/**
	 * Returns a new object of class '<em>Mechanical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mechanical Connection</em>'.
	 * @generated
	 */
	MechanicalConnection createMechanicalConnection();

	/**
	 * Returns a new object of class '<em>Primitive Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Component</em>'.
	 * @generated
	 */
	PrimitiveComponent createPrimitiveComponent();

	/**
	 * Returns a new object of class '<em>Composed Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composed Component</em>'.
	 * @generated
	 */
	ComposedComponent createComposedComponent();

	/**
	 * Returns a new object of class '<em>Composition Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Element</em>'.
	 * @generated
	 */
	CompositionElement createCompositionElement();

	/**
	 * Returns a new object of class '<em>Port Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Value</em>'.
	 * @generated
	 */
	PortValue createPortValue();

	/**
	 * Returns a new object of class '<em>Resistor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resistor</em>'.
	 * @generated
	 */
	Resistor createResistor();

	/**
	 * Returns a new object of class '<em>Capacitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capacitor</em>'.
	 * @generated
	 */
	Capacitor createCapacitor();

	/**
	 * Returns a new object of class '<em>Analog Battery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Battery</em>'.
	 * @generated
	 */
	AnalogBattery createAnalogBattery();

	/**
	 * Returns a new object of class '<em>Analog Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Switch</em>'.
	 * @generated
	 */
	AnalogSwitch createAnalogSwitch();

	/**
	 * Returns a new object of class '<em>Analog Lamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Lamp</em>'.
	 * @generated
	 */
	AnalogLamp createAnalogLamp();

	/**
	 * Returns a new object of class '<em>Digital Battery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Battery</em>'.
	 * @generated
	 */
	DigitalBattery createDigitalBattery();

	/**
	 * Returns a new object of class '<em>Digital Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Switch</em>'.
	 * @generated
	 */
	DigitalSwitch createDigitalSwitch();

	/**
	 * Returns a new object of class '<em>Digital Lamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Lamp</em>'.
	 * @generated
	 */
	DigitalLamp createDigitalLamp();

	/**
	 * Returns a new object of class '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not</em>'.
	 * @generated
	 */
	Not createNot();

	/**
	 * Returns a new object of class '<em>Xor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xor</em>'.
	 * @generated
	 */
	Xor createXor();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>NTransistor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NTransistor</em>'.
	 * @generated
	 */
	NTransistor createNTransistor();

	/**
	 * Returns a new object of class '<em>PTransistor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PTransistor</em>'.
	 * @generated
	 */
	PTransistor createPTransistor();

	/**
	 * Returns a new object of class '<em>DFlip Flop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DFlip Flop</em>'.
	 * @generated
	 */
	DFlipFlop createDFlipFlop();

	/**
	 * Returns a new object of class '<em>Signal Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Port</em>'.
	 * @generated
	 */
	SignalPort createSignalPort();

	/**
	 * Returns a new object of class '<em>Electrical Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Electrical Port</em>'.
	 * @generated
	 */
	ElectricalPort createElectricalPort();

	/**
	 * Returns a new object of class '<em>Hydraulic Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hydraulic Port</em>'.
	 * @generated
	 */
	HydraulicPort createHydraulicPort();

	/**
	 * Returns a new object of class '<em>Visual Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visual Port</em>'.
	 * @generated
	 */
	VisualPort createVisualPort();

	/**
	 * Returns a new object of class '<em>Visual Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visual Connection</em>'.
	 * @generated
	 */
	VisualConnection createVisualConnection();

	/**
	 * Returns a new object of class '<em>Mechanical Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mechanical Port</em>'.
	 * @generated
	 */
	MechanicalPort createMechanicalPort();

	/**
	 * Returns a new object of class '<em>Typed Port Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Port Value</em>'.
	 * @generated
	 */
	TypedPortValue createTypedPortValue();

	/**
	 * Returns a new object of class '<em>Signal Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Value</em>'.
	 * @generated
	 */
	SignalValue createSignalValue();

	/**
	 * Returns a new object of class '<em>Electrical Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Electrical Value</em>'.
	 * @generated
	 */
	ElectricalValue createElectricalValue();

	/**
	 * Returns a new object of class '<em>Hydraulic Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hydraulic Value</em>'.
	 * @generated
	 */
	HydraulicValue createHydraulicValue();

	/**
	 * Returns a new object of class '<em>Visual Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visual Value</em>'.
	 * @generated
	 */
	VisualValue createVisualValue();

	/**
	 * Returns a new object of class '<em>Float Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Value</em>'.
	 * @generated
	 */
	FloatValue createFloatValue();

	/**
	 * Returns a new object of class '<em>Signal Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Constant</em>'.
	 * @generated
	 */
	SignalConstant createSignalConstant();

	/**
	 * Returns a new object of class '<em>Fault Tree Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Tree Context</em>'.
	 * @generated
	 */
	FaultTreeContext createFaultTreeContext();

	/**
	 * Returns a new object of class '<em>Root Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Event</em>'.
	 * @generated
	 */
	RootEvent createRootEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FtpPackage getFtpPackage();

} //FtpFactory
