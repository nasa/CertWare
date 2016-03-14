/**
 */
package ftp.util;

import ftp.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ftp.FtpPackage
 * @generated
 */
public class FtpSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FtpPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtpSwitch() {
		if (modelPackage == null) {
			modelPackage = FtpPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FtpPackage.FAULT_TREE: {
				FaultTree faultTree = (FaultTree)theEObject;
				T result = caseFaultTree(faultTree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.FT_NODE: {
				FTNode ftNode = (FTNode)theEObject;
				T result = caseFTNode(ftNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.OR_GATE: {
				OrGate orGate = (OrGate)theEObject;
				T result = caseOrGate(orGate);
				if (result == null) result = caseFTNode(orGate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.AND_GATE: {
				AndGate andGate = (AndGate)theEObject;
				T result = caseAndGate(andGate);
				if (result == null) result = caseFTNode(andGate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.FAULT: {
				Fault fault = (Fault)theEObject;
				T result = caseFault(fault);
				if (result == null) result = caseFTNode(fault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.OBSERVATION: {
				Observation observation = (Observation)theEObject;
				T result = caseObservation(observation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseCompositionElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseCompositionElement(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.DIGINTAL_CONNECTION: {
				DigintalConnection digintalConnection = (DigintalConnection)theEObject;
				T result = caseDigintalConnection(digintalConnection);
				if (result == null) result = caseConnection(digintalConnection);
				if (result == null) result = caseCompositionElement(digintalConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.ANALOG_CONNECTION: {
				AnalogConnection analogConnection = (AnalogConnection)theEObject;
				T result = caseAnalogConnection(analogConnection);
				if (result == null) result = caseConnection(analogConnection);
				if (result == null) result = caseCompositionElement(analogConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.SIGNAL_CONNECTION: {
				SignalConnection signalConnection = (SignalConnection)theEObject;
				T result = caseSignalConnection(signalConnection);
				if (result == null) result = caseDigintalConnection(signalConnection);
				if (result == null) result = caseConnection(signalConnection);
				if (result == null) result = caseCompositionElement(signalConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.ELECTRICAL_CONNECTION: {
				ElectricalConnection electricalConnection = (ElectricalConnection)theEObject;
				T result = caseElectricalConnection(electricalConnection);
				if (result == null) result = caseAnalogConnection(electricalConnection);
				if (result == null) result = caseConnection(electricalConnection);
				if (result == null) result = caseCompositionElement(electricalConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.HYDRAULIC_CONNECTION: {
				HydraulicConnection hydraulicConnection = (HydraulicConnection)theEObject;
				T result = caseHydraulicConnection(hydraulicConnection);
				if (result == null) result = caseAnalogConnection(hydraulicConnection);
				if (result == null) result = caseConnection(hydraulicConnection);
				if (result == null) result = caseCompositionElement(hydraulicConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.MECHANICAL_CONNECTION: {
				MechanicalConnection mechanicalConnection = (MechanicalConnection)theEObject;
				T result = caseMechanicalConnection(mechanicalConnection);
				if (result == null) result = caseAnalogConnection(mechanicalConnection);
				if (result == null) result = caseConnection(mechanicalConnection);
				if (result == null) result = caseCompositionElement(mechanicalConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.PRIMITIVE_COMPONENT: {
				PrimitiveComponent primitiveComponent = (PrimitiveComponent)theEObject;
				T result = casePrimitiveComponent(primitiveComponent);
				if (result == null) result = caseComponent(primitiveComponent);
				if (result == null) result = caseCompositionElement(primitiveComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.COMPOSED_COMPONENT: {
				ComposedComponent composedComponent = (ComposedComponent)theEObject;
				T result = caseComposedComponent(composedComponent);
				if (result == null) result = caseComponent(composedComponent);
				if (result == null) result = caseCompositionElement(composedComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.COMPOSITION_ELEMENT: {
				CompositionElement compositionElement = (CompositionElement)theEObject;
				T result = caseCompositionElement(compositionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.PORT_VALUE: {
				PortValue portValue = (PortValue)theEObject;
				T result = casePortValue(portValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.RESISTOR: {
				Resistor resistor = (Resistor)theEObject;
				T result = caseResistor(resistor);
				if (result == null) result = casePrimitiveComponent(resistor);
				if (result == null) result = caseComponent(resistor);
				if (result == null) result = caseCompositionElement(resistor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.CAPACITOR: {
				Capacitor capacitor = (Capacitor)theEObject;
				T result = caseCapacitor(capacitor);
				if (result == null) result = casePrimitiveComponent(capacitor);
				if (result == null) result = caseComponent(capacitor);
				if (result == null) result = caseCompositionElement(capacitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.ANALOG_BATTERY: {
				AnalogBattery analogBattery = (AnalogBattery)theEObject;
				T result = caseAnalogBattery(analogBattery);
				if (result == null) result = casePrimitiveComponent(analogBattery);
				if (result == null) result = caseComponent(analogBattery);
				if (result == null) result = caseCompositionElement(analogBattery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.ANALOG_SWITCH: {
				AnalogSwitch analogSwitch = (AnalogSwitch)theEObject;
				T result = caseAnalogSwitch(analogSwitch);
				if (result == null) result = casePrimitiveComponent(analogSwitch);
				if (result == null) result = caseComponent(analogSwitch);
				if (result == null) result = caseCompositionElement(analogSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.ANALOG_LAMP: {
				AnalogLamp analogLamp = (AnalogLamp)theEObject;
				T result = caseAnalogLamp(analogLamp);
				if (result == null) result = casePrimitiveComponent(analogLamp);
				if (result == null) result = caseComponent(analogLamp);
				if (result == null) result = caseCompositionElement(analogLamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.DIGITAL_BATTERY: {
				DigitalBattery digitalBattery = (DigitalBattery)theEObject;
				T result = caseDigitalBattery(digitalBattery);
				if (result == null) result = casePrimitiveComponent(digitalBattery);
				if (result == null) result = caseComponent(digitalBattery);
				if (result == null) result = caseCompositionElement(digitalBattery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.DIGITAL_SWITCH: {
				DigitalSwitch digitalSwitch = (DigitalSwitch)theEObject;
				T result = caseDigitalSwitch(digitalSwitch);
				if (result == null) result = casePrimitiveComponent(digitalSwitch);
				if (result == null) result = caseComponent(digitalSwitch);
				if (result == null) result = caseCompositionElement(digitalSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.DIGITAL_LAMP: {
				DigitalLamp digitalLamp = (DigitalLamp)theEObject;
				T result = caseDigitalLamp(digitalLamp);
				if (result == null) result = casePrimitiveComponent(digitalLamp);
				if (result == null) result = caseComponent(digitalLamp);
				if (result == null) result = caseCompositionElement(digitalLamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = casePrimitiveComponent(not);
				if (result == null) result = caseComponent(not);
				if (result == null) result = caseCompositionElement(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.XOR: {
				Xor xor = (Xor)theEObject;
				T result = caseXor(xor);
				if (result == null) result = casePrimitiveComponent(xor);
				if (result == null) result = caseComponent(xor);
				if (result == null) result = caseCompositionElement(xor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = casePrimitiveComponent(and);
				if (result == null) result = caseComponent(and);
				if (result == null) result = caseCompositionElement(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.NTRANSISTOR: {
				NTransistor nTransistor = (NTransistor)theEObject;
				T result = caseNTransistor(nTransistor);
				if (result == null) result = casePrimitiveComponent(nTransistor);
				if (result == null) result = caseComponent(nTransistor);
				if (result == null) result = caseCompositionElement(nTransistor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.PTRANSISTOR: {
				PTransistor pTransistor = (PTransistor)theEObject;
				T result = casePTransistor(pTransistor);
				if (result == null) result = casePrimitiveComponent(pTransistor);
				if (result == null) result = caseComponent(pTransistor);
				if (result == null) result = caseCompositionElement(pTransistor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.DFLIP_FLOP: {
				DFlipFlop dFlipFlop = (DFlipFlop)theEObject;
				T result = caseDFlipFlop(dFlipFlop);
				if (result == null) result = casePrimitiveComponent(dFlipFlop);
				if (result == null) result = caseComponent(dFlipFlop);
				if (result == null) result = caseCompositionElement(dFlipFlop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.SIGNAL_PORT: {
				SignalPort signalPort = (SignalPort)theEObject;
				T result = caseSignalPort(signalPort);
				if (result == null) result = casePort(signalPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.ELECTRICAL_PORT: {
				ElectricalPort electricalPort = (ElectricalPort)theEObject;
				T result = caseElectricalPort(electricalPort);
				if (result == null) result = casePort(electricalPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.HYDRAULIC_PORT: {
				HydraulicPort hydraulicPort = (HydraulicPort)theEObject;
				T result = caseHydraulicPort(hydraulicPort);
				if (result == null) result = casePort(hydraulicPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.VISUAL_PORT: {
				VisualPort visualPort = (VisualPort)theEObject;
				T result = caseVisualPort(visualPort);
				if (result == null) result = casePort(visualPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.VISUAL_CONNECTION: {
				VisualConnection visualConnection = (VisualConnection)theEObject;
				T result = caseVisualConnection(visualConnection);
				if (result == null) result = caseConnection(visualConnection);
				if (result == null) result = caseCompositionElement(visualConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.FAULT_TREE_CONTEXT: {
				FaultTreeContext faultTreeContext = (FaultTreeContext)theEObject;
				T result = caseFaultTreeContext(faultTreeContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.ROOT_EVENT: {
				RootEvent rootEvent = (RootEvent)theEObject;
				T result = caseRootEvent(rootEvent);
				if (result == null) result = caseFTNode(rootEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.MECHANICAL_PORT: {
				MechanicalPort mechanicalPort = (MechanicalPort)theEObject;
				T result = caseMechanicalPort(mechanicalPort);
				if (result == null) result = casePort(mechanicalPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.TYPED_PORT_VALUE: {
				TypedPortValue typedPortValue = (TypedPortValue)theEObject;
				T result = caseTypedPortValue(typedPortValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.SIGNAL_VALUE: {
				SignalValue signalValue = (SignalValue)theEObject;
				T result = caseSignalValue(signalValue);
				if (result == null) result = caseTypedPortValue(signalValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.ELECTRICAL_VALUE: {
				ElectricalValue electricalValue = (ElectricalValue)theEObject;
				T result = caseElectricalValue(electricalValue);
				if (result == null) result = caseTypedPortValue(electricalValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.HYDRAULIC_VALUE: {
				HydraulicValue hydraulicValue = (HydraulicValue)theEObject;
				T result = caseHydraulicValue(hydraulicValue);
				if (result == null) result = caseTypedPortValue(hydraulicValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.VISUAL_VALUE: {
				VisualValue visualValue = (VisualValue)theEObject;
				T result = caseVisualValue(visualValue);
				if (result == null) result = caseTypedPortValue(visualValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.FLOAT_VALUE: {
				FloatValue floatValue = (FloatValue)theEObject;
				T result = caseFloatValue(floatValue);
				if (result == null) result = caseTypedPortValue(floatValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtpPackage.SIGNAL_CONSTANT: {
				SignalConstant signalConstant = (SignalConstant)theEObject;
				T result = caseSignalConstant(signalConstant);
				if (result == null) result = casePrimitiveComponent(signalConstant);
				if (result == null) result = caseComponent(signalConstant);
				if (result == null) result = caseCompositionElement(signalConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultTree(FaultTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FT Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FT Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFTNode(FTNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrGate(OrGate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndGate(AndGate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFault(Fault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digintal Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digintal Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigintalConnection(DigintalConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogConnection(AnalogConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalConnection(SignalConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electrical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electrical Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricalConnection(ElectricalConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hydraulic Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hydraulic Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHydraulicConnection(HydraulicConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mechanical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mechanical Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMechanicalConnection(MechanicalConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveComponent(PrimitiveComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedComponent(ComposedComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionElement(CompositionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortValue(PortValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resistor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resistor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResistor(Resistor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capacitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capacitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapacitor(Capacitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Battery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Battery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogBattery(AnalogBattery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogSwitch(AnalogSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Lamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Lamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogLamp(AnalogLamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Battery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Battery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalBattery(DigitalBattery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalSwitch(DigitalSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Lamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Lamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalLamp(DigitalLamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXor(Xor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NTransistor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NTransistor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNTransistor(NTransistor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PTransistor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTransistor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTransistor(PTransistor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DFlip Flop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFlip Flop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFlipFlop(DFlipFlop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalPort(SignalPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electrical Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electrical Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricalPort(ElectricalPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hydraulic Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hydraulic Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHydraulicPort(HydraulicPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visual Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visual Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualPort(VisualPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visual Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visual Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualConnection(VisualConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mechanical Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mechanical Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMechanicalPort(MechanicalPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Port Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Port Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedPortValue(TypedPortValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalValue(SignalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electrical Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electrical Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricalValue(ElectricalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hydraulic Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hydraulic Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHydraulicValue(HydraulicValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visual Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visual Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualValue(VisualValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatValue(FloatValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalConstant(SignalConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Tree Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Tree Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultTreeContext(FaultTreeContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootEvent(RootEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FtpSwitch
