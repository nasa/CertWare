package net.certware.intent.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.certware.intent.intentSpecification.Decomposition;
import net.certware.intent.intentSpecification.DecompositionType;
import net.certware.intent.intentSpecification.DocItem;
import net.certware.intent.intentSpecification.DocItemType;
import net.certware.intent.intentSpecification.Document;
import net.certware.intent.intentSpecification.Intent;
import net.certware.intent.intentSpecification.IntentSpecificationPackage;
import net.certware.intent.intentSpecification.IntentType;
import net.certware.intent.intentSpecification.ListItem;
import net.certware.intent.intentSpecification.ListItemType;
import net.certware.intent.intentSpecification.ModelItem;
import net.certware.intent.intentSpecification.ModelType;
import net.certware.intent.intentSpecification.Refinement;
import net.certware.intent.intentSpecification.Specification;
import net.certware.intent.services.IntentSpecificationGrammarAccess;
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
public class IntentSpecificationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IntentSpecificationGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == IntentSpecificationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case IntentSpecificationPackage.DECOMPOSITION:
				if(context == grammarAccess.getDecompositionRule()) {
					sequence_Decomposition(context, (Decomposition) semanticObject); 
					return; 
				}
				else break;
			case IntentSpecificationPackage.DECOMPOSITION_TYPE:
				if(context == grammarAccess.getDecompositionTypeRule()) {
					sequence_DecompositionType(context, (DecompositionType) semanticObject); 
					return; 
				}
				else break;
			case IntentSpecificationPackage.DOC_ITEM:
				if(context == grammarAccess.getDocItemRule()) {
					sequence_DocItem(context, (DocItem) semanticObject); 
					return; 
				}
				else break;
			case IntentSpecificationPackage.DOC_ITEM_TYPE:
				if(context == grammarAccess.getDocItemTypeRule()) {
					sequence_DocItemType(context, (DocItemType) semanticObject); 
					return; 
				}
				else break;
			case IntentSpecificationPackage.DOCUMENT:
				if(context == grammarAccess.getDocumentRule()) {
					sequence_Document(context, (Document) semanticObject); 
					return; 
				}
				else break;
			case IntentSpecificationPackage.INTENT:
				if(context == grammarAccess.getIntentRule()) {
					sequence_Intent(context, (Intent) semanticObject); 
					return; 
				}
				else break;
			case IntentSpecificationPackage.INTENT_TYPE:
				if(context == grammarAccess.getIntentTypeRule()) {
					sequence_IntentType(context, (IntentType) semanticObject); 
					return; 
				}
				else break;
			case IntentSpecificationPackage.LIST_ITEM:
				if(context == grammarAccess.getListItemRule()) {
					sequence_ListItem(context, (ListItem) semanticObject); 
					return; 
				}
				else break;
			case IntentSpecificationPackage.LIST_ITEM_TYPE:
				if(context == grammarAccess.getListItemTypeRule()) {
					sequence_ListItemType(context, (ListItemType) semanticObject); 
					return; 
				}
				else break;
			case IntentSpecificationPackage.MODEL_ITEM:
				if(context == grammarAccess.getModelItemRule()) {
					sequence_ModelItem(context, (ModelItem) semanticObject); 
					return; 
				}
				else break;
			case IntentSpecificationPackage.MODEL_TYPE:
				if(context == grammarAccess.getModelTypeRule()) {
					sequence_ModelType(context, (ModelType) semanticObject); 
					return; 
				}
				else break;
			case IntentSpecificationPackage.REFINEMENT:
				if(context == grammarAccess.getRefinementRule()) {
					sequence_Refinement(context, (Refinement) semanticObject); 
					return; 
				}
				else break;
			case IntentSpecificationPackage.SPECIFICATION:
				if(context == grammarAccess.getSpecificationRule()) {
					sequence_Specification(context, (Specification) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (typeName='environment' | typeName='operator' | typeName='system' | typeName='verification')
	 */
	protected void sequence_DecompositionType(EObject context, DecompositionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         type=DecompositionType 
	 *         name=ID 
	 *         desc=STRING 
	 *         documents+=Document* 
	 *         models+=ModelItem* 
	 *         items+=ListItem*
	 *     )
	 */
	protected void sequence_Decomposition(EObject context, Decomposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         typeName='condition' | 
	 *         typeName='figure' | 
	 *         typeName='break' | 
	 *         typeName='model' | 
	 *         typeName='paragraph' | 
	 *         typeName='section' | 
	 *         typeName='table'
	 *     )
	 */
	protected void sequence_DocItemType(EObject context, DocItemType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=DocItemType name=ID ref=STRING)
	 */
	protected void sequence_DocItem(EObject context, DocItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IntentSpecificationPackage.Literals.DOC_ITEM__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IntentSpecificationPackage.Literals.DOC_ITEM__TYPE));
			if(transientValues.isValueTransient(semanticObject, IntentSpecificationPackage.Literals.DOC_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IntentSpecificationPackage.Literals.DOC_ITEM__NAME));
			if(transientValues.isValueTransient(semanticObject, IntentSpecificationPackage.Literals.DOC_ITEM__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IntentSpecificationPackage.Literals.DOC_ITEM__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDocItemAccess().getTypeDocItemTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getDocItemAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDocItemAccess().getRefSTRINGTerminalRuleCall_2_0(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     entries+=DocItem+
	 */
	protected void sequence_Document(EObject context, Document semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         typeName='basic' | 
	 *         typeName='purpose' | 
	 *         typeName='principles' | 
	 *         typeName='models' | 
	 *         typeName='design' | 
	 *         typeName='implementation' | 
	 *         typeName='operation'
	 *     )
	 */
	protected void sequence_IntentType(EObject context, IntentType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=IntentType name=ID desc=STRING decompositions+=Decomposition+)
	 */
	protected void sequence_Intent(EObject context, Intent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeName='requirement' | typeName='goal' | typeName='hazard' | typeName='constraint')
	 */
	protected void sequence_ListItemType(EObject context, ListItemType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         type=ListItemType 
	 *         name=ID 
	 *         desc=STRING 
	 *         docReferences+=[DocItem|ID]* 
	 *         itemReferences+=[ListItem|ID]* 
	 *         modelReferences+=[ModelItem|ID]*
	 *     )
	 */
	protected void sequence_ListItem(EObject context, ListItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ModelType name=ID desc=STRING)
	 */
	protected void sequence_ModelItem(EObject context, ModelItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IntentSpecificationPackage.Literals.MODEL_ITEM__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IntentSpecificationPackage.Literals.MODEL_ITEM__TYPE));
			if(transientValues.isValueTransient(semanticObject, IntentSpecificationPackage.Literals.MODEL_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IntentSpecificationPackage.Literals.MODEL_ITEM__NAME));
			if(transientValues.isValueTransient(semanticObject, IntentSpecificationPackage.Literals.MODEL_ITEM__DESC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IntentSpecificationPackage.Literals.MODEL_ITEM__DESC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelItemAccess().getTypeModelTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getModelItemAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getModelItemAccess().getDescSTRINGTerminalRuleCall_2_0(), semanticObject.getDesc());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         typeName='output' | 
	 *         typeName='mode' | 
	 *         typeName='state' | 
	 *         typeName='macro' | 
	 *         typeName='function' | 
	 *         typeName='input'
	 *     )
	 */
	protected void sequence_ModelType(EObject context, ModelType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID desc=STRING intents+=Intent+)
	 */
	protected void sequence_Refinement(EObject context, Refinement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID refinements+=Refinement+)
	 */
	protected void sequence_Specification(EObject context, Specification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
