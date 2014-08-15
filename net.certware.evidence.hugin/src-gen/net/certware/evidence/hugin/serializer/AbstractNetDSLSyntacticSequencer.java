package net.certware.evidence.hugin.serializer;

import com.google.inject.Inject;
import java.util.List;
import net.certware.evidence.hugin.services.NetDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractNetDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected NetDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_PotentialGraph_VerticalLineKeyword_3_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (NetDSLGrammarAccess) access;
		match_PotentialGraph_VerticalLineKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getPotentialGraphAccess().getVerticalLineKeyword_3_0());
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
			if(match_PotentialGraph_VerticalLineKeyword_3_0_q.equals(syntax))
				emit_PotentialGraph_VerticalLineKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '|'?
	 */
	protected void emit_PotentialGraph_VerticalLineKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
