/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz.diagram.edit.policies;

import net.certware.argument.euz.diagram.edit.commands.ArgumentCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.AssumptionCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.ContextCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.CriteriaCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.EvidenceCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.JustificationCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.SolutionCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.StrategyCreateCommand;
import net.certware.argument.euz.diagram.providers.EuzElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ArgumentDiagramItemSemanticEditPolicy extends
		EuzBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArgumentDiagramItemSemanticEditPolicy() {
		super(EuzElementTypes.ArgumentDiagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EuzElementTypes.Argument_2001 == req.getElementType()) {
			return getGEFWrapper(new ArgumentCreateCommand(req));
		}
		if (EuzElementTypes.Solution_2002 == req.getElementType()) {
			return getGEFWrapper(new SolutionCreateCommand(req));
		}
		if (EuzElementTypes.Evidence_2003 == req.getElementType()) {
			return getGEFWrapper(new EvidenceCreateCommand(req));
		}
		if (EuzElementTypes.Strategy_2004 == req.getElementType()) {
			return getGEFWrapper(new StrategyCreateCommand(req));
		}
		if (EuzElementTypes.Assumption_2005 == req.getElementType()) {
			return getGEFWrapper(new AssumptionCreateCommand(req));
		}
		if (EuzElementTypes.Justification_2006 == req.getElementType()) {
			return getGEFWrapper(new JustificationCreateCommand(req));
		}
		if (EuzElementTypes.Context_2007 == req.getElementType()) {
			return getGEFWrapper(new ContextCreateCommand(req));
		}
		if (EuzElementTypes.Criteria_2008 == req.getElementType()) {
			return getGEFWrapper(new CriteriaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
