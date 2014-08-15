package net.certware.intent.state.serializer;

import com.google.inject.Inject;
import java.util.List;
import net.certware.intent.state.services.StateSpecificationGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class StateSpecificationSyntacticSequencer extends AbstractSyntacticSequencer {

	protected StateSpecificationGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Component_InputsKeyword_4_0_q;
	protected AbstractElementAlias match_Component_ModesKeyword_2_0_q;
	protected AbstractElementAlias match_Component_OutputsKeyword_5_0_q;
	protected AbstractElementAlias match_Component_StatesKeyword_3_0_q;
	protected AbstractElementAlias match_Device_InputsKeyword_3_0_q;
	protected AbstractElementAlias match_Device_OutputsKeyword_4_0_q;
	protected AbstractElementAlias match_Specification___LeftSquareBracketKeyword_2_0_DevicesKeyword_2_1_RightSquareBracketKeyword_2_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (StateSpecificationGrammarAccess) access;
		match_Component_InputsKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getComponentAccess().getInputsKeyword_4_0());
		match_Component_ModesKeyword_2_0_q = new TokenAlias(false, true, grammarAccess.getComponentAccess().getModesKeyword_2_0());
		match_Component_OutputsKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getComponentAccess().getOutputsKeyword_5_0());
		match_Component_StatesKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getComponentAccess().getStatesKeyword_3_0());
		match_Device_InputsKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getDeviceAccess().getInputsKeyword_3_0());
		match_Device_OutputsKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getDeviceAccess().getOutputsKeyword_4_0());
		match_Specification___LeftSquareBracketKeyword_2_0_DevicesKeyword_2_1_RightSquareBracketKeyword_2_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSpecificationAccess().getLeftSquareBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getSpecificationAccess().getDevicesKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getSpecificationAccess().getRightSquareBracketKeyword_2_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Component_InputsKeyword_4_0_q.equals(syntax))
				emit_Component_InputsKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Component_ModesKeyword_2_0_q.equals(syntax))
				emit_Component_ModesKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Component_OutputsKeyword_5_0_q.equals(syntax))
				emit_Component_OutputsKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Component_StatesKeyword_3_0_q.equals(syntax))
				emit_Component_StatesKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Device_InputsKeyword_3_0_q.equals(syntax))
				emit_Device_InputsKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Device_OutputsKeyword_4_0_q.equals(syntax))
				emit_Device_OutputsKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Specification___LeftSquareBracketKeyword_2_0_DevicesKeyword_2_1_RightSquareBracketKeyword_2_3__q.equals(syntax))
				emit_Specification___LeftSquareBracketKeyword_2_0_DevicesKeyword_2_1_RightSquareBracketKeyword_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'inputs'?
	 */
	protected void emit_Component_InputsKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'modes'?
	 */
	protected void emit_Component_ModesKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'outputs'?
	 */
	protected void emit_Component_OutputsKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'states'?
	 */
	protected void emit_Component_StatesKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'inputs'?
	 */
	protected void emit_Device_InputsKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'outputs'?
	 */
	protected void emit_Device_OutputsKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' 'devices' ']')?
	 */
	protected void emit_Specification___LeftSquareBracketKeyword_2_0_DevicesKeyword_2_1_RightSquareBracketKeyword_2_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
