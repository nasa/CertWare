package net.certware.argument.caz.diagram.edit.policies;

import java.util.Iterator;

import net.certware.argument.caz.diagram.edit.commands.ArgumentArgumentEvidenceCreateCommand;
import net.certware.argument.caz.diagram.edit.commands.ArgumentArgumentEvidenceReorientCommand;
import net.certware.argument.caz.diagram.edit.commands.ClaimClaimSolutionsCreateCommand;
import net.certware.argument.caz.diagram.edit.commands.ClaimClaimSolutionsReorientCommand;
import net.certware.argument.caz.diagram.edit.commands.EvidenceEvidenceContextsCreateCommand;
import net.certware.argument.caz.diagram.edit.commands.EvidenceEvidenceContextsReorientCommand;
import net.certware.argument.caz.diagram.edit.commands.EvidenceEvidenceCreateCommand;
import net.certware.argument.caz.diagram.edit.commands.EvidenceEvidenceReorientCommand;
import net.certware.argument.caz.diagram.edit.parts.ArgumentArgumentEvidenceEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimSolutionsEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceEvidenceContextsEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceEvidenceEditPart;
import net.certware.argument.caz.diagram.part.CazVisualIDRegistry;
import net.certware.argument.caz.diagram.providers.CazElementTypes;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EvidenceItemSemanticEditPolicy extends
		CazBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EvidenceItemSemanticEditPolicy() {
		super(CazElementTypes.Evidence_2002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (CazVisualIDRegistry.getVisualID(incomingLink) == ClaimClaimSolutionsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CazVisualIDRegistry.getVisualID(incomingLink) == ArgumentArgumentEvidenceEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (CazVisualIDRegistry.getVisualID(outgoingLink) == EvidenceEvidenceContextsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CazVisualIDRegistry.getVisualID(outgoingLink) == EvidenceEvidenceEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (CazElementTypes.ClaimClaimSolutions_4004 == req.getElementType()) {
			return null;
		}
		if (CazElementTypes.ArgumentArgumentEvidence_4007 == req
				.getElementType()) {
			return null;
		}
		if (CazElementTypes.EvidenceEvidenceContexts_4009 == req
				.getElementType()) {
			return getGEFWrapper(new EvidenceEvidenceContextsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CazElementTypes.EvidenceEvidence_4010 == req.getElementType()) {
			return getGEFWrapper(new EvidenceEvidenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (CazElementTypes.ClaimClaimSolutions_4004 == req.getElementType()) {
			return getGEFWrapper(new ClaimClaimSolutionsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CazElementTypes.ArgumentArgumentEvidence_4007 == req
				.getElementType()) {
			return getGEFWrapper(new ArgumentArgumentEvidenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CazElementTypes.EvidenceEvidenceContexts_4009 == req
				.getElementType()) {
			return null;
		}
		if (CazElementTypes.EvidenceEvidence_4010 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ClaimClaimSolutionsEditPart.VISUAL_ID:
			return getGEFWrapper(new ClaimClaimSolutionsReorientCommand(req));
		case ArgumentArgumentEvidenceEditPart.VISUAL_ID:
			return getGEFWrapper(new ArgumentArgumentEvidenceReorientCommand(
					req));
		case EvidenceEvidenceContextsEditPart.VISUAL_ID:
			return getGEFWrapper(new EvidenceEvidenceContextsReorientCommand(
					req));
		case EvidenceEvidenceEditPart.VISUAL_ID:
			return getGEFWrapper(new EvidenceEvidenceReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
