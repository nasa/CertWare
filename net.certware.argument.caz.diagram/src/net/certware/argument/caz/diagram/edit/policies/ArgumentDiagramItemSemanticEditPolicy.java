package net.certware.argument.caz.diagram.edit.policies;

import net.certware.argument.caz.diagram.edit.commands.ArgumentCreateCommand;
import net.certware.argument.caz.diagram.edit.commands.AssumptionCreateCommand;
import net.certware.argument.caz.diagram.edit.commands.ClaimCreateCommand;
import net.certware.argument.caz.diagram.edit.commands.ContextCreateCommand;
import net.certware.argument.caz.diagram.edit.commands.EvidenceCreateCommand;
import net.certware.argument.caz.diagram.edit.commands.JustificationCreateCommand;
import net.certware.argument.caz.diagram.providers.CazElementTypes;

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
		CazBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArgumentDiagramItemSemanticEditPolicy() {
		super(CazElementTypes.ArgumentDiagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CazElementTypes.Claim_2001 == req.getElementType()) {
			return getGEFWrapper(new ClaimCreateCommand(req));
		}
		if (CazElementTypes.Evidence_2002 == req.getElementType()) {
			return getGEFWrapper(new EvidenceCreateCommand(req));
		}
		if (CazElementTypes.Argument_2003 == req.getElementType()) {
			return getGEFWrapper(new ArgumentCreateCommand(req));
		}
		if (CazElementTypes.Assumption_2004 == req.getElementType()) {
			return getGEFWrapper(new AssumptionCreateCommand(req));
		}
		if (CazElementTypes.Justification_2005 == req.getElementType()) {
			return getGEFWrapper(new JustificationCreateCommand(req));
		}
		if (CazElementTypes.Context_2006 == req.getElementType()) {
			return getGEFWrapper(new ContextCreateCommand(req));
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
