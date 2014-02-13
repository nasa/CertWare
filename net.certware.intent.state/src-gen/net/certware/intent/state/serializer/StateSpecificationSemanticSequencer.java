package net.certware.intent.state.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.certware.intent.state.services.StateSpecificationGrammarAccess;
import net.certware.intent.state.stateSpecification.BigUnitValue;
import net.certware.intent.state.stateSpecification.Component;
import net.certware.intent.state.stateSpecification.ComponentInput;
import net.certware.intent.state.stateSpecification.ComponentOutput;
import net.certware.intent.state.stateSpecification.Device;
import net.certware.intent.state.stateSpecification.DeviceInput;
import net.certware.intent.state.stateSpecification.DeviceOutput;
import net.certware.intent.state.stateSpecification.Input;
import net.certware.intent.state.stateSpecification.Mode;
import net.certware.intent.state.stateSpecification.ModeElement;
import net.certware.intent.state.stateSpecification.ModeElementType;
import net.certware.intent.state.stateSpecification.ModeVariable;
import net.certware.intent.state.stateSpecification.Output;
import net.certware.intent.state.stateSpecification.Specification;
import net.certware.intent.state.stateSpecification.State;
import net.certware.intent.state.stateSpecification.StateElement;
import net.certware.intent.state.stateSpecification.StateList;
import net.certware.intent.state.stateSpecification.StateSpecificationPackage;
import net.certware.intent.state.stateSpecification.StateValue;
import net.certware.intent.state.stateSpecification.StateVariable;
import net.certware.intent.state.stateSpecification.Trigger;
import net.certware.intent.state.stateSpecification.TriggerTable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class StateSpecificationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StateSpecificationGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == StateSpecificationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StateSpecificationPackage.BIG_UNIT_VALUE:
				if(context == grammarAccess.getBigUnitValueRule()) {
					sequence_BigUnitValue(context, (BigUnitValue) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.COMPONENT:
				if(context == grammarAccess.getComponentRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.COMPONENT_INPUT:
				if(context == grammarAccess.getComponentInputRule()) {
					sequence_ComponentInput(context, (ComponentInput) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.COMPONENT_OUTPUT:
				if(context == grammarAccess.getComponentOutputRule()) {
					sequence_ComponentOutput(context, (ComponentOutput) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.DEVICE:
				if(context == grammarAccess.getDeviceRule()) {
					sequence_Device(context, (Device) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.DEVICE_INPUT:
				if(context == grammarAccess.getDeviceInputRule()) {
					sequence_DeviceInput(context, (DeviceInput) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.DEVICE_OUTPUT:
				if(context == grammarAccess.getDeviceOutputRule()) {
					sequence_DeviceOutput(context, (DeviceOutput) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.INPUT:
				if(context == grammarAccess.getInputRule()) {
					sequence_Input(context, (Input) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.MODE:
				if(context == grammarAccess.getModeRule()) {
					sequence_Mode(context, (Mode) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.MODE_ELEMENT:
				if(context == grammarAccess.getModeElementRule()) {
					sequence_ModeElement(context, (ModeElement) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.MODE_ELEMENT_TYPE:
				if(context == grammarAccess.getModeElementTypeRule()) {
					sequence_ModeElementType(context, (ModeElementType) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.MODE_VARIABLE:
				if(context == grammarAccess.getModeVariableRule()) {
					sequence_ModeVariable(context, (ModeVariable) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.OUTPUT:
				if(context == grammarAccess.getOutputRule()) {
					sequence_Output(context, (Output) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.SPECIFICATION:
				if(context == grammarAccess.getSpecificationRule()) {
					sequence_Specification(context, (Specification) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.STATE_ELEMENT:
				if(context == grammarAccess.getStateElementRule()) {
					sequence_StateElement(context, (StateElement) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.STATE_LIST:
				if(context == grammarAccess.getStateListRule()) {
					sequence_StateList(context, (StateList) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.STATE_VALUE:
				if(context == grammarAccess.getStateValueRule()) {
					sequence_StateValue(context, (StateValue) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.STATE_VARIABLE:
				if(context == grammarAccess.getStateVariableRule()) {
					sequence_StateVariable(context, (StateVariable) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.TRIGGER:
				if(context == grammarAccess.getTriggerRule()) {
					sequence_Trigger(context, (Trigger) semanticObject); 
					return; 
				}
				else break;
			case StateSpecificationPackage.TRIGGER_TABLE:
				if(context == grammarAccess.getTriggerTableRule()) {
					sequence_TriggerTable(context, (TriggerTable) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (value=BigDecimalType units=STRING)
	 */
	protected void sequence_BigUnitValue(EObject context, BigUnitValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StateSpecificationPackage.Literals.BIG_UNIT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateSpecificationPackage.Literals.BIG_UNIT_VALUE__VALUE));
			if(transientValues.isValueTransient(semanticObject, StateSpecificationPackage.Literals.BIG_UNIT_VALUE__UNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateSpecificationPackage.Literals.BIG_UNIT_VALUE__UNITS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBigUnitValueAccess().getValueBigDecimalTypeParserRuleCall_0_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getBigUnitValueAccess().getUnitsSTRINGTerminalRuleCall_2_0(), semanticObject.getUnits());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID io=Input? source=[Device|ID])
	 */
	protected void sequence_ComponentInput(EObject context, ComponentInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID io=Output? target=[Device|ID])
	 */
	protected void sequence_ComponentOutput(EObject context, ComponentOutput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID modes+=ModeElement* states+=StateElement* inputs+=ComponentInput* outputs+=ComponentOutput*)
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID io=Input? source=[Component|ID])
	 */
	protected void sequence_DeviceInput(EObject context, DeviceInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID io=Output? target=[Component|ID])
	 */
	protected void sequence_DeviceOutput(EObject context, DeviceOutput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID desc=STRING inputs+=DeviceInput* outputs+=DeviceOutput*)
	 */
	protected void sequence_Device(EObject context, Device semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((lower=BigDecimalType upper=BigDecimalType rangeType=STRING rangeUnits=STRING) | values+=STRING*) 
	 *         rate=BigUnitValue? 
	 *         variables=STRING? 
	 *         references=STRING? 
	 *         comments=STRING?
	 *     )
	 */
	protected void sequence_Input(EObject context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elementType='supervisory' | elementType='operating' | elementType='other')
	 */
	protected void sequence_ModeElementType(EObject context, ModeElementType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inferred?='inferred'? type=ModeElementType modes+=ModeVariable+)
	 */
	protected void sequence_ModeElement(EObject context, ModeElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (desc=STRING modes+=Mode+)
	 */
	protected void sequence_ModeVariable(EObject context, ModeVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (initial?='initial'? value=STRING)
	 */
	protected void sequence_Mode(EObject context, Mode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((lower=BigDecimalType upper=BigDecimalType rangeType=STRING rangeUnits=STRING) | values+=STRING*) 
	 *         rate=BigUnitValue? 
	 *         delay=BigUnitValue? 
	 *         deadline=BigUnitValue? 
	 *         completionHandling=STRING? 
	 *         variables=STRING? 
	 *         relationship=STRING? 
	 *         minResponse=BigUnitValue? 
	 *         maxResponse=BigUnitValue? 
	 *         feebackHandling=STRING? 
	 *         reversed=STRING? 
	 *         references=STRING? 
	 *         comments=STRING? 
	 *         contents=STRING? 
	 *         table=TriggerTable?
	 *     )
	 */
	protected void sequence_Output(EObject context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID devices+=Device* components+=Component+)
	 */
	protected void sequence_Specification(EObject context, Specification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inferred?='inferred'? states+=StateVariable+)
	 */
	protected void sequence_StateElement(EObject context, StateElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     stateList+=StateValue+
	 */
	protected void sequence_StateList(EObject context, StateList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='T' | value='F' | value='.' | value='?')
	 */
	protected void sequence_StateValue(EObject context, StateValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (desc=STRING state+=State+)
	 */
	protected void sequence_StateVariable(EObject context, StateVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (initial?='initial'? value=STRING)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (rows+=Trigger*)
	 */
	protected void sequence_TriggerTable(EObject context, TriggerTable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((mode=[Mode|ID] list=StateList) | (variable=[StateVariable|ID] value=[State|ID] list=StateList))
	 */
	protected void sequence_Trigger(EObject context, Trigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
