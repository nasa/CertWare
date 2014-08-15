package net.certware.evidence.hugin.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.certware.evidence.hugin.netDSL.AdditiveExp;
import net.certware.evidence.hugin.netDSL.AndExp;
import net.certware.evidence.hugin.netDSL.ApplicationAttribute;
import net.certware.evidence.hugin.netDSL.Assignment;
import net.certware.evidence.hugin.netDSL.AssignmentOp;
import net.certware.evidence.hugin.netDSL.BasicNode;
import net.certware.evidence.hugin.netDSL.BooleanLiteral;
import net.certware.evidence.hugin.netDSL.ClassDefinition;
import net.certware.evidence.hugin.netDSL.ClassInstance;
import net.certware.evidence.hugin.netDSL.DomainDefinition;
import net.certware.evidence.hugin.netDSL.DomainHeader;
import net.certware.evidence.hugin.netDSL.DoubleLiteral;
import net.certware.evidence.hugin.netDSL.ExpressionSequence;
import net.certware.evidence.hugin.netDSL.InputBinding;
import net.certware.evidence.hugin.netDSL.InputBindings;
import net.certware.evidence.hugin.netDSL.IntegerLiteral;
import net.certware.evidence.hugin.netDSL.LabelAttribute;
import net.certware.evidence.hugin.netDSL.List1;
import net.certware.evidence.hugin.netDSL.List2;
import net.certware.evidence.hugin.netDSL.List3;
import net.certware.evidence.hugin.netDSL.List4;
import net.certware.evidence.hugin.netDSL.List5;
import net.certware.evidence.hugin.netDSL.MatrixRow;
import net.certware.evidence.hugin.netDSL.Model;
import net.certware.evidence.hugin.netDSL.ModelDataAttribute;
import net.certware.evidence.hugin.netDSL.ModelNodesAttribute;
import net.certware.evidence.hugin.netDSL.MultiplicativeExp;
import net.certware.evidence.hugin.netDSL.NetDSLPackage;
import net.certware.evidence.hugin.netDSL.NodeSizeAttribute;
import net.certware.evidence.hugin.netDSL.Operator;
import net.certware.evidence.hugin.netDSL.OrExp;
import net.certware.evidence.hugin.netDSL.OutputBinding;
import net.certware.evidence.hugin.netDSL.OutputBindings;
import net.certware.evidence.hugin.netDSL.Potential;
import net.certware.evidence.hugin.netDSL.PotentialDataAttribute;
import net.certware.evidence.hugin.netDSL.PotentialGraph;
import net.certware.evidence.hugin.netDSL.PotentialModel;
import net.certware.evidence.hugin.netDSL.PotentialTableAttribute;
import net.certware.evidence.hugin.netDSL.RelationalExp;
import net.certware.evidence.hugin.netDSL.SamplesAttribute;
import net.certware.evidence.hugin.netDSL.StateValuesAttribute;
import net.certware.evidence.hugin.netDSL.StatesAttribute;
import net.certware.evidence.hugin.netDSL.StringLiteral;
import net.certware.evidence.hugin.netDSL.SubtypeAttribute;
import net.certware.evidence.hugin.netDSL.VarRef;
import net.certware.evidence.hugin.netDSL.unaryExpression;
import net.certware.evidence.hugin.services.NetDSLGrammarAccess;
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
public abstract class AbstractNetDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private NetDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == NetDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case NetDSLPackage.ADDITIVE_EXP:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpLeftAction_1_0() ||
				   context == grammarAccess.getAssignmentOpExpressionRule() ||
				   context == grammarAccess.getAssignmentOpExpressionAccess().getAssignmentOpLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpLeftAction_1_0()) {
					sequence_additiveExpression(context, (AdditiveExp) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.AND_EXP:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAssignmentOpExpressionRule() ||
				   context == grammarAccess.getAssignmentOpExpressionAccess().getAssignmentOpLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpLeftAction_1_0()) {
					sequence_andExpression(context, (AndExp) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.APPLICATION_ATTRIBUTE:
				if(context == grammarAccess.getApplicationAttributeRule() ||
				   context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getClassElementRule() ||
				   context == grammarAccess.getNodeAttributesRule()) {
					sequence_ApplicationAttribute(context, (ApplicationAttribute) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.ASSIGNMENT:
				if(context == grammarAccess.getExpressionRule()) {
					sequence_Expression(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.ASSIGNMENT_OP:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getAssignmentOpExpressionRule()) {
					sequence_assignmentOpExpression(context, (AssignmentOp) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.BASIC_NODE:
				if(context == grammarAccess.getBasicNodeRule() ||
				   context == grammarAccess.getClassElementRule() ||
				   context == grammarAccess.getDomainElementRule()) {
					sequence_BasicNode(context, (BasicNode) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermLiteralRule() ||
				   context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpLeftAction_1_0() ||
				   context == grammarAccess.getAssignmentOpExpressionRule() ||
				   context == grammarAccess.getAssignmentOpExpressionAccess().getAssignmentOpLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_TermLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.CLASS_DEFINITION:
				if(context == grammarAccess.getClassDefinitionRule() ||
				   context == grammarAccess.getClassElementRule() ||
				   context == grammarAccess.getDomainElementRule()) {
					sequence_ClassDefinition(context, (ClassDefinition) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.CLASS_INSTANCE:
				if(context == grammarAccess.getClassElementRule() ||
				   context == grammarAccess.getClassInstanceRule()) {
					sequence_ClassInstance(context, (ClassInstance) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.DOMAIN_DEFINITION:
				if(context == grammarAccess.getDomainDefinitionRule()) {
					sequence_DomainDefinition(context, (DomainDefinition) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.DOMAIN_HEADER:
				if(context == grammarAccess.getDomainHeaderRule()) {
					sequence_DomainHeader(context, (DomainHeader) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.DOUBLE_LITERAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermLiteralRule() ||
				   context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpLeftAction_1_0() ||
				   context == grammarAccess.getAssignmentOpExpressionRule() ||
				   context == grammarAccess.getAssignmentOpExpressionAccess().getAssignmentOpLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_TermLiteral(context, (DoubleLiteral) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.EXPRESSION_SEQUENCE:
				if(context == grammarAccess.getExpressionSequenceRule()) {
					sequence_ExpressionSequence(context, (ExpressionSequence) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.INPUT_BINDING:
				if(context == grammarAccess.getInputBindingRule()) {
					sequence_InputBinding(context, (InputBinding) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.INPUT_BINDINGS:
				if(context == grammarAccess.getInputBindingsRule()) {
					sequence_InputBindings(context, (InputBindings) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.INTEGER:
				if(context == grammarAccess.getIntegerRule()) {
					sequence_Integer(context, (net.certware.evidence.hugin.netDSL.Integer) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.INTEGER_LITERAL:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getClassElementRule() ||
				   context == grammarAccess.getNodeAttributesRule() ||
				   context == grammarAccess.getPositionAttributeRule()) {
					sequence_PositionAttribute(context, (IntegerLiteral) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermLiteralRule() ||
				   context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpLeftAction_1_0() ||
				   context == grammarAccess.getAssignmentOpExpressionRule() ||
				   context == grammarAccess.getAssignmentOpExpressionAccess().getAssignmentOpLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_TermLiteral(context, (IntegerLiteral) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.LABEL_ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getClassElementRule() ||
				   context == grammarAccess.getLabelAttributeRule() ||
				   context == grammarAccess.getNodeAttributesRule()) {
					sequence_LabelAttribute(context, (LabelAttribute) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.LIST1:
				if(context == grammarAccess.getList1Rule()) {
					sequence_List1(context, (List1) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.LIST2:
				if(context == grammarAccess.getList2Rule()) {
					sequence_List2(context, (List2) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.LIST3:
				if(context == grammarAccess.getList3Rule()) {
					sequence_List3(context, (List3) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.LIST4:
				if(context == grammarAccess.getList4Rule()) {
					sequence_List4(context, (List4) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.LIST5:
				if(context == grammarAccess.getList5Rule()) {
					sequence_List5(context, (List5) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.MATRIX_ROW:
				if(context == grammarAccess.getMatrixRowRule()) {
					sequence_MatrixRow(context, (MatrixRow) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.MODEL_DATA_ATTRIBUTE:
				if(context == grammarAccess.getModelDataAttributeRule()) {
					sequence_ModelDataAttribute(context, (ModelDataAttribute) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.MODEL_NODES_ATTRIBUTE:
				if(context == grammarAccess.getModelNodesAttributeRule()) {
					sequence_ModelNodesAttribute(context, (ModelNodesAttribute) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.MULTIPLICATIVE_EXP:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpLeftAction_1_0() ||
				   context == grammarAccess.getAssignmentOpExpressionRule() ||
				   context == grammarAccess.getAssignmentOpExpressionAccess().getAssignmentOpLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpLeftAction_1_0()) {
					sequence_multiplicativeExpression(context, (MultiplicativeExp) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.NODE_SIZE_ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getClassElementRule() ||
				   context == grammarAccess.getNodeSizeAttributeRule()) {
					sequence_NodeSizeAttribute(context, (NodeSizeAttribute) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.OPERATOR:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getOperatorRule() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpLeftAction_1_0() ||
				   context == grammarAccess.getAssignmentOpExpressionRule() ||
				   context == grammarAccess.getAssignmentOpExpressionAccess().getAssignmentOpLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_Operator(context, (Operator) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.OR_EXP:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getAssignmentOpExpressionRule() ||
				   context == grammarAccess.getAssignmentOpExpressionAccess().getAssignmentOpLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule()) {
					sequence_orExpression(context, (OrExp) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.OUTPUT_BINDING:
				if(context == grammarAccess.getOutputBindingRule()) {
					sequence_OutputBinding(context, (OutputBinding) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.OUTPUT_BINDINGS:
				if(context == grammarAccess.getOutputBindingsRule()) {
					sequence_OutputBindings(context, (OutputBindings) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.POTENTIAL:
				if(context == grammarAccess.getClassElementRule() ||
				   context == grammarAccess.getDomainElementRule() ||
				   context == grammarAccess.getPotentialRule()) {
					sequence_Potential(context, (Potential) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE:
				if(context == grammarAccess.getPotentialAttributeRule() ||
				   context == grammarAccess.getPotentialDataAttributeRule()) {
					sequence_PotentialDataAttribute(context, (PotentialDataAttribute) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.POTENTIAL_GRAPH:
				if(context == grammarAccess.getPotentialGraphRule()) {
					sequence_PotentialGraph(context, (PotentialGraph) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.POTENTIAL_MODEL:
				if(context == grammarAccess.getPotentialModelRule()) {
					sequence_PotentialModel(context, (PotentialModel) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE:
				if(context == grammarAccess.getPotentialAttributeRule() ||
				   context == grammarAccess.getPotentialTableAttributeRule()) {
					sequence_PotentialTableAttribute(context, (PotentialTableAttribute) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.RELATIONAL_EXP:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpLeftAction_1_0() ||
				   context == grammarAccess.getAssignmentOpExpressionRule() ||
				   context == grammarAccess.getAssignmentOpExpressionAccess().getAssignmentOpLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule()) {
					sequence_relationalExpression(context, (RelationalExp) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.SAMPLES_ATTRIBUTE:
				if(context == grammarAccess.getSamplesAttributeRule()) {
					sequence_SamplesAttribute(context, (SamplesAttribute) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.STATE_VALUES_ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getClassElementRule() ||
				   context == grammarAccess.getStateValuesAttributeRule()) {
					sequence_StateValuesAttribute(context, (StateValuesAttribute) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.STATES_ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getClassElementRule() ||
				   context == grammarAccess.getStatesAttributeRule()) {
					sequence_StatesAttribute(context, (StatesAttribute) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.STRING_LITERAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermLiteralRule() ||
				   context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpLeftAction_1_0() ||
				   context == grammarAccess.getAssignmentOpExpressionRule() ||
				   context == grammarAccess.getAssignmentOpExpressionAccess().getAssignmentOpLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_TermLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.SUBTYPE_ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getClassElementRule() ||
				   context == grammarAccess.getSubtypeAttributeRule()) {
					sequence_SubtypeAttribute(context, (SubtypeAttribute) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.VAR_REF:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermLiteralRule() ||
				   context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpLeftAction_1_0() ||
				   context == grammarAccess.getAssignmentOpExpressionRule() ||
				   context == grammarAccess.getAssignmentOpExpressionAccess().getAssignmentOpLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_TermLiteral(context, (VarRef) semanticObject); 
					return; 
				}
				else break;
			case NetDSLPackage.UNARY_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getAssignmentLeftAction_1_0() ||
				   context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpLeftAction_1_0() ||
				   context == grammarAccess.getAssignmentOpExpressionRule() ||
				   context == grammarAccess.getAssignmentOpExpressionAccess().getAssignmentOpLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpLeftAction_1_0() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getRelationalExpLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_unaryExpression(context, (unaryExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (key=ID value=STRING)
	 */
	protected void sequence_ApplicationAttribute(EObject context, ApplicationAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.APPLICATION_ATTRIBUTE__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.APPLICATION_ATTRIBUTE__KEY));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.APPLICATION_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.APPLICATION_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getApplicationAttributeAccess().getKeyIDTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getApplicationAttributeAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (keyword=BasicNodeKeyword id=ID? attributes+=Attribute*)
	 */
	protected void sequence_BasicNode(EObject context, BasicNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID elements+=ClassElement*)
	 */
	protected void sequence_ClassDefinition(EObject context, ClassDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (instanceName=ID className=ID input=InputBindings? output=OutputBindings? attributes=NodeAttributes)
	 */
	protected void sequence_ClassInstance(EObject context, ClassInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (header=DomainHeader elements+=DomainElement*)
	 */
	protected void sequence_DomainDefinition(EObject context, DomainDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attributes+=Attribute*)
	 */
	protected void sequence_DomainHeader(EObject context, DomainHeader semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((expressions+=Expression expressions+=Expression*)?)
	 */
	protected void sequence_ExpressionSequence(EObject context, ExpressionSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Assignment_1_0 op='=' right=orExpression)
	 */
	protected void sequence_Expression(EObject context, Assignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.ASSIGNMENT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.ASSIGNMENT__LEFT));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.ASSIGNMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.ASSIGNMENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getAssignmentLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpressionAccess().getOpEqualsSignKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (formal=ID actual=ID)
	 */
	protected void sequence_InputBinding(EObject context, InputBinding semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.INPUT_BINDING__FORMAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.INPUT_BINDING__FORMAL));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.INPUT_BINDING__ACTUAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.INPUT_BINDING__ACTUAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInputBindingAccess().getFormalIDTerminalRuleCall_0_0(), semanticObject.getFormal());
		feeder.accept(grammarAccess.getInputBindingAccess().getActualIDTerminalRuleCall_2_0(), semanticObject.getActual());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=InputBinding rhs=InputBindings)
	 */
	protected void sequence_InputBindings(EObject context, InputBindings semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.INPUT_BINDINGS__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.INPUT_BINDINGS__LHS));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.INPUT_BINDINGS__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.INPUT_BINDINGS__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInputBindingsAccess().getLhsInputBindingParserRuleCall_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getInputBindingsAccess().getRhsInputBindingsParserRuleCall_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     i=INT
	 */
	protected void sequence_Integer(EObject context, net.certware.evidence.hugin.netDSL.Integer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.INTEGER__I) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.INTEGER__I));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerAccess().getIINTTerminalRuleCall_0(), semanticObject.getI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_LabelAttribute(EObject context, LabelAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.LABEL_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.LABEL_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLabelAttributeAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (items+=unaryExpression*)
	 */
	protected void sequence_List1(EObject context, List1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     list+=List1+
	 */
	protected void sequence_List2(EObject context, List2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     list+=List2+
	 */
	protected void sequence_List3(EObject context, List3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     list+=List3+
	 */
	protected void sequence_List4(EObject context, List4 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     list+=List4+
	 */
	protected void sequence_List5(EObject context, List5 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (r5+=List5+ | r4+=List4+ | r3+=List3+ | r2+=List2+ | r1=List1)
	 */
	protected void sequence_MatrixRow(EObject context, MatrixRow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sequence=ExpressionSequence
	 */
	protected void sequence_ModelDataAttribute(EObject context, ModelDataAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.MODEL_DATA_ATTRIBUTE__SEQUENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.MODEL_DATA_ATTRIBUTE__SEQUENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelDataAttributeAccess().getSequenceExpressionSequenceParserRuleCall_4_0(), semanticObject.getSequence());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (configurations+=ID*)
	 */
	protected void sequence_ModelNodesAttribute(EObject context, ModelNodesAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     domain=DomainDefinition?
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (width=INT height=INT)
	 */
	protected void sequence_NodeSizeAttribute(EObject context, NodeSizeAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.NODE_SIZE_ATTRIBUTE__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.NODE_SIZE_ATTRIBUTE__WIDTH));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.NODE_SIZE_ATTRIBUTE__HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.NODE_SIZE_ATTRIBUTE__HEIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNodeSizeAttributeAccess().getWidthINTTerminalRuleCall_3_0(), semanticObject.getWidth());
		feeder.accept(grammarAccess.getNodeSizeAttributeAccess().getHeightINTTerminalRuleCall_4_0(), semanticObject.getHeight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (op=OperatorName sequence=ExpressionSequence)
	 */
	protected void sequence_Operator(EObject context, Operator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (actual=ID formal=ID)
	 */
	protected void sequence_OutputBinding(EObject context, OutputBinding semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.OUTPUT_BINDING__ACTUAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.OUTPUT_BINDING__ACTUAL));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.OUTPUT_BINDING__FORMAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.OUTPUT_BINDING__FORMAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOutputBindingAccess().getActualIDTerminalRuleCall_0_0(), semanticObject.getActual());
		feeder.accept(grammarAccess.getOutputBindingAccess().getFormalIDTerminalRuleCall_2_0(), semanticObject.getFormal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=OutputBinding rhs=OutputBindings)
	 */
	protected void sequence_OutputBindings(EObject context, OutputBindings semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.OUTPUT_BINDINGS__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.OUTPUT_BINDINGS__LHS));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.OUTPUT_BINDINGS__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.OUTPUT_BINDINGS__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOutputBindingsAccess().getLhsOutputBindingParserRuleCall_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getOutputBindingsAccess().getRhsOutputBindingsParserRuleCall_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (x=Integer y=Integer)
	 */
	protected void sequence_PositionAttribute(EObject context, IntegerLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     data=MatrixRow
	 */
	protected void sequence_PotentialDataAttribute(EObject context, PotentialDataAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.POTENTIAL_DATA_ATTRIBUTE__DATA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.POTENTIAL_DATA_ATTRIBUTE__DATA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPotentialDataAttributeAccess().getDataMatrixRowParserRuleCall_3_0(), semanticObject.getData());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (children+=ID* parents+=ID*)
	 */
	protected void sequence_PotentialGraph(EObject context, PotentialGraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attributes+=PotentialAttribute*)
	 */
	protected void sequence_PotentialModel(EObject context, PotentialModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nodes=ModelNodesAttribute samples=SamplesAttribute? data=ModelDataAttribute)
	 */
	protected void sequence_PotentialTableAttribute(EObject context, PotentialTableAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (graph=PotentialGraph model=PotentialModel)
	 */
	protected void sequence_Potential(EObject context, Potential semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.POTENTIAL__GRAPH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.POTENTIAL__GRAPH));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.POTENTIAL__MODEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.POTENTIAL__MODEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPotentialAccess().getGraphPotentialGraphParserRuleCall_1_0(), semanticObject.getGraph());
		feeder.accept(grammarAccess.getPotentialAccess().getModelPotentialModelParserRuleCall_2_0(), semanticObject.getModel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_SamplesAttribute(EObject context, SamplesAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.SAMPLES_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.SAMPLES_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSamplesAttributeAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     numbers+=INT+
	 */
	protected void sequence_StateValuesAttribute(EObject context, StateValuesAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (states+=STRING*)
	 */
	protected void sequence_StatesAttribute(EObject context, StatesAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (subtype='label' | subtype='boolean' | subtype='number' | subtype='interval')
	 */
	protected void sequence_SubtypeAttribute(EObject context, SubtypeAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_TermLiteral(EObject context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=DOUBLE
	 */
	protected void sequence_TermLiteral(EObject context, DoubleLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_TermLiteral(EObject context, IntegerLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_TermLiteral(EObject context, StringLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_TermLiteral(EObject context, VarRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=additiveExpression_AdditiveExp_1_0 op=arithOps right=additiveExpression)
	 */
	protected void sequence_additiveExpression(EObject context, AdditiveExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.ADDITIVE_EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.ADDITIVE_EXP__LEFT));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.ADDITIVE_EXP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.ADDITIVE_EXP__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditiveExpressionAccess().getAdditiveExpLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditiveExpressionAccess().getOpArithOpsParserRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAdditiveExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=andExpression_AndExp_1_0 op='&&' right=andExpression)
	 */
	protected void sequence_andExpression(EObject context, AndExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.AND_EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.AND_EXP__LEFT));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.AND_EXP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.AND_EXP__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndExpressionAccess().getAndExpLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAndExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=assignmentOpExpression_AssignmentOp_1_0 op=assignOp right=orExpression)
	 */
	protected void sequence_assignmentOpExpression(EObject context, AssignmentOp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.ASSIGNMENT_OP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.ASSIGNMENT_OP__LEFT));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.ASSIGNMENT_OP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.ASSIGNMENT_OP__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentOpExpressionAccess().getAssignmentOpLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAssignmentOpExpressionAccess().getOpAssignOpParserRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAssignmentOpExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=multiplicativeExpression_MultiplicativeExp_1_0 op=multOps right=multiplicativeExpression)
	 */
	protected void sequence_multiplicativeExpression(EObject context, MultiplicativeExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.MULTIPLICATIVE_EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.MULTIPLICATIVE_EXP__LEFT));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.MULTIPLICATIVE_EXP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.MULTIPLICATIVE_EXP__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicativeExpressionAccess().getOpMultOpsParserRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getMultiplicativeExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=orExpression_OrExp_1_0 op='||' right=orExpression)
	 */
	protected void sequence_orExpression(EObject context, OrExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.OR_EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.OR_EXP__LEFT));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.OR_EXP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.OR_EXP__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrExpressionAccess().getOrExpLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getOrExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=relationalExpression_RelationalExp_1_0 op=relOps right=relationalExpression)
	 */
	protected void sequence_relationalExpression(EObject context, RelationalExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.RELATIONAL_EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.RELATIONAL_EXP__LEFT));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.RELATIONAL_EXP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.RELATIONAL_EXP__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationalExpressionAccess().getRelationalExpLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getRelationalExpressionAccess().getOpRelOpsParserRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getRelationalExpressionAccess().getRightRelationalExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (op=unaryOps expr=TermExpression)
	 */
	protected void sequence_unaryExpression(EObject context, unaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, NetDSLPackage.Literals.UNARY_EXPRESSION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NetDSLPackage.Literals.UNARY_EXPRESSION__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnaryExpressionAccess().getOpUnaryOpsParserRuleCall_1_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getUnaryExpressionAccess().getExprTermExpressionParserRuleCall_1_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
}
