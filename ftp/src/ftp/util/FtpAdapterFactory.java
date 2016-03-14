/**
 */
package ftp.util;

import ftp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ftp.FtpPackage
 * @generated
 */
public class FtpAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FtpPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtpAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FtpPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected FtpSwitch<Adapter> modelSwitch =
		new FtpSwitch<Adapter>() {
			@Override
			public Adapter caseFaultTree(FaultTree object) {
				return createFaultTreeAdapter();
			}
			@Override
			public Adapter caseFTNode(FTNode object) {
				return createFTNodeAdapter();
			}
			@Override
			public Adapter caseOrGate(OrGate object) {
				return createOrGateAdapter();
			}
			@Override
			public Adapter caseAndGate(AndGate object) {
				return createAndGateAdapter();
			}
			@Override
			public Adapter caseFault(Fault object) {
				return createFaultAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseDigintalConnection(DigintalConnection object) {
				return createDigintalConnectionAdapter();
			}
			@Override
			public Adapter caseAnalogConnection(AnalogConnection object) {
				return createAnalogConnectionAdapter();
			}
			@Override
			public Adapter caseSignalConnection(SignalConnection object) {
				return createSignalConnectionAdapter();
			}
			@Override
			public Adapter caseElectricalConnection(ElectricalConnection object) {
				return createElectricalConnectionAdapter();
			}
			@Override
			public Adapter caseHydraulicConnection(HydraulicConnection object) {
				return createHydraulicConnectionAdapter();
			}
			@Override
			public Adapter caseMechanicalConnection(MechanicalConnection object) {
				return createMechanicalConnectionAdapter();
			}
			@Override
			public Adapter casePrimitiveComponent(PrimitiveComponent object) {
				return createPrimitiveComponentAdapter();
			}
			@Override
			public Adapter caseComposedComponent(ComposedComponent object) {
				return createComposedComponentAdapter();
			}
			@Override
			public Adapter caseCompositionElement(CompositionElement object) {
				return createCompositionElementAdapter();
			}
			@Override
			public Adapter casePortValue(PortValue object) {
				return createPortValueAdapter();
			}
			@Override
			public Adapter caseResistor(Resistor object) {
				return createResistorAdapter();
			}
			@Override
			public Adapter caseCapacitor(Capacitor object) {
				return createCapacitorAdapter();
			}
			@Override
			public Adapter caseAnalogBattery(AnalogBattery object) {
				return createAnalogBatteryAdapter();
			}
			@Override
			public Adapter caseAnalogSwitch(AnalogSwitch object) {
				return createAnalogSwitchAdapter();
			}
			@Override
			public Adapter caseAnalogLamp(AnalogLamp object) {
				return createAnalogLampAdapter();
			}
			@Override
			public Adapter caseDigitalBattery(DigitalBattery object) {
				return createDigitalBatteryAdapter();
			}
			@Override
			public Adapter caseDigitalSwitch(DigitalSwitch object) {
				return createDigitalSwitchAdapter();
			}
			@Override
			public Adapter caseDigitalLamp(DigitalLamp object) {
				return createDigitalLampAdapter();
			}
			@Override
			public Adapter caseNot(Not object) {
				return createNotAdapter();
			}
			@Override
			public Adapter caseXor(Xor object) {
				return createXorAdapter();
			}
			@Override
			public Adapter caseAnd(And object) {
				return createAndAdapter();
			}
			@Override
			public Adapter caseNTransistor(NTransistor object) {
				return createNTransistorAdapter();
			}
			@Override
			public Adapter casePTransistor(PTransistor object) {
				return createPTransistorAdapter();
			}
			@Override
			public Adapter caseDFlipFlop(DFlipFlop object) {
				return createDFlipFlopAdapter();
			}
			@Override
			public Adapter caseSignalPort(SignalPort object) {
				return createSignalPortAdapter();
			}
			@Override
			public Adapter caseElectricalPort(ElectricalPort object) {
				return createElectricalPortAdapter();
			}
			@Override
			public Adapter caseHydraulicPort(HydraulicPort object) {
				return createHydraulicPortAdapter();
			}
			@Override
			public Adapter caseVisualPort(VisualPort object) {
				return createVisualPortAdapter();
			}
			@Override
			public Adapter caseVisualConnection(VisualConnection object) {
				return createVisualConnectionAdapter();
			}
			@Override
			public Adapter caseFaultTreeContext(FaultTreeContext object) {
				return createFaultTreeContextAdapter();
			}
			@Override
			public Adapter caseRootEvent(RootEvent object) {
				return createRootEventAdapter();
			}
			@Override
			public Adapter caseMechanicalPort(MechanicalPort object) {
				return createMechanicalPortAdapter();
			}
			@Override
			public Adapter caseTypedPortValue(TypedPortValue object) {
				return createTypedPortValueAdapter();
			}
			@Override
			public Adapter caseSignalValue(SignalValue object) {
				return createSignalValueAdapter();
			}
			@Override
			public Adapter caseElectricalValue(ElectricalValue object) {
				return createElectricalValueAdapter();
			}
			@Override
			public Adapter caseHydraulicValue(HydraulicValue object) {
				return createHydraulicValueAdapter();
			}
			@Override
			public Adapter caseVisualValue(VisualValue object) {
				return createVisualValueAdapter();
			}
			@Override
			public Adapter caseFloatValue(FloatValue object) {
				return createFloatValueAdapter();
			}
			@Override
			public Adapter caseSignalConstant(SignalConstant object) {
				return createSignalConstantAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ftp.FaultTree <em>Fault Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.FaultTree
	 * @generated
	 */
	public Adapter createFaultTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.FTNode <em>FT Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.FTNode
	 * @generated
	 */
	public Adapter createFTNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.OrGate <em>Or Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.OrGate
	 * @generated
	 */
	public Adapter createOrGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.AndGate <em>And Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.AndGate
	 * @generated
	 */
	public Adapter createAndGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.Fault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.Fault
	 * @generated
	 */
	public Adapter createFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.DigintalConnection <em>Digintal Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.DigintalConnection
	 * @generated
	 */
	public Adapter createDigintalConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.AnalogConnection <em>Analog Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.AnalogConnection
	 * @generated
	 */
	public Adapter createAnalogConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.SignalConnection <em>Signal Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.SignalConnection
	 * @generated
	 */
	public Adapter createSignalConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.ElectricalConnection <em>Electrical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.ElectricalConnection
	 * @generated
	 */
	public Adapter createElectricalConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.HydraulicConnection <em>Hydraulic Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.HydraulicConnection
	 * @generated
	 */
	public Adapter createHydraulicConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.MechanicalConnection <em>Mechanical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.MechanicalConnection
	 * @generated
	 */
	public Adapter createMechanicalConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.PrimitiveComponent <em>Primitive Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.PrimitiveComponent
	 * @generated
	 */
	public Adapter createPrimitiveComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.ComposedComponent <em>Composed Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.ComposedComponent
	 * @generated
	 */
	public Adapter createComposedComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.CompositionElement <em>Composition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.CompositionElement
	 * @generated
	 */
	public Adapter createCompositionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.PortValue <em>Port Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.PortValue
	 * @generated
	 */
	public Adapter createPortValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.Resistor <em>Resistor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.Resistor
	 * @generated
	 */
	public Adapter createResistorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.Capacitor <em>Capacitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.Capacitor
	 * @generated
	 */
	public Adapter createCapacitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.AnalogBattery <em>Analog Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.AnalogBattery
	 * @generated
	 */
	public Adapter createAnalogBatteryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.AnalogSwitch <em>Analog Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.AnalogSwitch
	 * @generated
	 */
	public Adapter createAnalogSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.AnalogLamp <em>Analog Lamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.AnalogLamp
	 * @generated
	 */
	public Adapter createAnalogLampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.DigitalBattery <em>Digital Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.DigitalBattery
	 * @generated
	 */
	public Adapter createDigitalBatteryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.DigitalSwitch <em>Digital Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.DigitalSwitch
	 * @generated
	 */
	public Adapter createDigitalSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.DigitalLamp <em>Digital Lamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.DigitalLamp
	 * @generated
	 */
	public Adapter createDigitalLampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.Xor
	 * @generated
	 */
	public Adapter createXorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.NTransistor <em>NTransistor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.NTransistor
	 * @generated
	 */
	public Adapter createNTransistorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.PTransistor <em>PTransistor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.PTransistor
	 * @generated
	 */
	public Adapter createPTransistorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.DFlipFlop <em>DFlip Flop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.DFlipFlop
	 * @generated
	 */
	public Adapter createDFlipFlopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.SignalPort <em>Signal Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.SignalPort
	 * @generated
	 */
	public Adapter createSignalPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.ElectricalPort <em>Electrical Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.ElectricalPort
	 * @generated
	 */
	public Adapter createElectricalPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.HydraulicPort <em>Hydraulic Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.HydraulicPort
	 * @generated
	 */
	public Adapter createHydraulicPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.VisualPort <em>Visual Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.VisualPort
	 * @generated
	 */
	public Adapter createVisualPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.VisualConnection <em>Visual Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.VisualConnection
	 * @generated
	 */
	public Adapter createVisualConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.MechanicalPort <em>Mechanical Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.MechanicalPort
	 * @generated
	 */
	public Adapter createMechanicalPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.TypedPortValue <em>Typed Port Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.TypedPortValue
	 * @generated
	 */
	public Adapter createTypedPortValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.SignalValue <em>Signal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.SignalValue
	 * @generated
	 */
	public Adapter createSignalValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.ElectricalValue <em>Electrical Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.ElectricalValue
	 * @generated
	 */
	public Adapter createElectricalValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.HydraulicValue <em>Hydraulic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.HydraulicValue
	 * @generated
	 */
	public Adapter createHydraulicValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.VisualValue <em>Visual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.VisualValue
	 * @generated
	 */
	public Adapter createVisualValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.FloatValue <em>Float Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.FloatValue
	 * @generated
	 */
	public Adapter createFloatValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.SignalConstant <em>Signal Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.SignalConstant
	 * @generated
	 */
	public Adapter createSignalConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.FaultTreeContext <em>Fault Tree Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.FaultTreeContext
	 * @generated
	 */
	public Adapter createFaultTreeContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftp.RootEvent <em>Root Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftp.RootEvent
	 * @generated
	 */
	public Adapter createRootEventAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FtpAdapterFactory
