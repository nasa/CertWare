package net.certware.argument.gsz.diagram.edit.policies;

import net.certware.argument.gsz.diagram.edit.commands.AssumptionCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.ContextCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.EvidenceCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.GoalCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.JustificationCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.SolutionCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.StrategyCreateCommand;
import net.certware.argument.gsz.diagram.providers.GszElementTypes;

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
		GszBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArgumentDiagramItemSemanticEditPolicy() {
		super(GszElementTypes.ArgumentDiagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GszElementTypes.Goal_2001 == req.getElementType()) {
			return getGEFWrapper(new GoalCreateCommand(req));
		}
		if (GszElementTypes.Solution_2002 == req.getElementType()) {
			return getGEFWrapper(new SolutionCreateCommand(req));
		}
		if (GszElementTypes.Evidence_2003 == req.getElementType()) {
			return getGEFWrapper(new EvidenceCreateCommand(req));
		}
		if (GszElementTypes.Strategy_2008 == req.getElementType()) {
			return getGEFWrapper(new StrategyCreateCommand(req));
		}
		if (GszElementTypes.Justification_2005 == req.getElementType()) {
			return getGEFWrapper(new JustificationCreateCommand(req));
		}
		if (GszElementTypes.Context_2006 == req.getElementType()) {
			return getGEFWrapper(new ContextCreateCommand(req));
		}
		if (GszElementTypes.Assumption_2007 == req.getElementType()) {
			return getGEFWrapper(new AssumptionCreateCommand(req));
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
