package net.certware.argument.language.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import net.certware.argument.language.ui.contentassist.AbstractLProposalProvider;

public class LProposalProvider extends AbstractLProposalProvider {
	/**
	 * Provides a one-line template content assist for constant definitions.
	 */
	public void complete_ConstantDeclaration(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.complete_ConstantDeclaration(model, ruleCall, context, acceptor);
		String proposal = "const identifier = value ."; //$NON-NLS-1$
		acceptor.accept(createCompletionProposal(proposal,context));
	}

	/**
	 * Provides a one-line template content assist for type declarations.
	 */
	public void complete_TypeDeclaration(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.complete_TypeDeclaration(model, ruleCall, context, acceptor);
		String proposal = "type identifier = set_expression ."; //$NON-NLS-1$
		acceptor.accept(createCompletionProposal(proposal,context));
	}
	
	/**
	 * Provides a one-line template content assist for range expressions.
	 */
	public void complete_Range(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.complete_Range(model, ruleCall, context, acceptor);
		String proposal = "{ limit .. limit }"; //$NON-NLS-1$
		acceptor.accept(createCompletionProposal(proposal,context));
	}
	
	/**
	 * Provides a cardinality constraint proposal.
	 */
	public void complete_CardinalityConstraint(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.complete_CardinalityConstraint(model, ruleCall, context, acceptor);
		String proposal = "bound <= | { atom } | <= bound"; //$NON-NLS-1$
		acceptor.accept(createCompletionProposal(proposal,context));
	}

	}
	

