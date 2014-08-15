package net.certware.intent.serializer;

import com.google.inject.Inject;
import java.util.List;
import net.certware.intent.services.IntentSpecificationGrammarAccess;
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
public class IntentSpecificationSyntacticSequencer extends AbstractSyntacticSequencer {

	protected IntentSpecificationGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Decomposition___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_Decomposition___LeftParenthesisKeyword_5_0_RightParenthesisKeyword_5_2__q;
	protected AbstractElementAlias match_Decomposition___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (IntentSpecificationGrammarAccess) access;
		match_Decomposition___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDecompositionAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDecompositionAccess().getRightCurlyBracketKeyword_3_2()));
		match_Decomposition___LeftParenthesisKeyword_5_0_RightParenthesisKeyword_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDecompositionAccess().getLeftParenthesisKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getDecompositionAccess().getRightParenthesisKeyword_5_2()));
		match_Decomposition___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDecompositionAccess().getLeftSquareBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getDecompositionAccess().getRightSquareBracketKeyword_4_2()));
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
			if(match_Decomposition___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Decomposition___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Decomposition___LeftParenthesisKeyword_5_0_RightParenthesisKeyword_5_2__q.equals(syntax))
				emit_Decomposition___LeftParenthesisKeyword_5_0_RightParenthesisKeyword_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Decomposition___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q.equals(syntax))
				emit_Decomposition___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Decomposition___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_Decomposition___LeftParenthesisKeyword_5_0_RightParenthesisKeyword_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' ']')?
	 */
	protected void emit_Decomposition___LeftSquareBracketKeyword_4_0_RightSquareBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
