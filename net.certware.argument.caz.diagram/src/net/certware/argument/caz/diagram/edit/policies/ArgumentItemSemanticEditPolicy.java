package net.certware.argument.caz.diagram.edit.policies;

import java.util.Iterator;

import net.certware.argument.caz.diagram.edit.commands.ArgumentArgumentClaimsCreateCommand;
import net.certware.argument.caz.diagram.edit.commands.ArgumentArgumentClaimsReorientCommand;
import net.certware.argument.caz.diagram.edit.commands.ArgumentArgumentEvidenceCreateCommand;
import net.certware.argument.caz.diagram.edit.commands.ArgumentArgumentEvidenceReorientCommand;
import net.certware.argument.caz.diagram.edit.commands.ArgumentArgumentJustificationCreateCommand;
import net.certware.argument.caz.diagram.edit.commands.ArgumentArgumentJustificationReorientCommand;
import net.certware.argument.caz.diagram.edit.commands.ClaimClaimStrategiesCreateCommand;
import net.certware.argument.caz.diagram.edit.commands.ClaimClaimStrategiesReorientCommand;
import net.certware.argument.caz.diagram.edit.parts.ArgumentArgumentClaimsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentArgumentEvidenceEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentArgumentJustificationEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimStrategiesEditPart;
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
public class ArgumentItemSemanticEditPolicy extends
		CazBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArgumentItemSemanticEditPolicy() {
		super(CazElementTypes.Argument_2003);
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
			if (CazVisualIDRegistry.getVisualID(incomingLink) == ClaimClaimStrategiesEditPart.VISUAL_ID) {
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
			if (CazVisualIDRegistry.getVisualID(outgoingLink) == ArgumentArgumentJustificationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CazVisualIDRegistry.getVisualID(outgoingLink) == ArgumentArgumentEvidenceEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CazVisualIDRegistry.getVisualID(outgoingLink) == ArgumentArgumentClaimsEditPart.VISUAL_ID) {
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
		if (CazElementTypes.ClaimClaimStrategies_4001 == req.getElementType()) {
			return null;
		}
		if (CazElementTypes.ArgumentArgumentJustification_4006 == req
				.getElementType()) {
			return getGEFWrapper(new ArgumentArgumentJustificationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CazElementTypes.ArgumentArgumentEvidence_4007 == req
				.getElementType()) {
			return getGEFWrapper(new ArgumentArgumentEvidenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CazElementTypes.ArgumentArgumentClaims_4008 == req.getElementType()) {
			return getGEFWrapper(new ArgumentArgumentClaimsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (CazElementTypes.ClaimClaimStrategies_4001 == req.getElementType()) {
			return getGEFWrapper(new ClaimClaimStrategiesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (CazElementTypes.ArgumentArgumentJustification_4006 == req
				.getElementType()) {
			return null;
		}
		if (CazElementTypes.ArgumentArgumentEvidence_4007 == req
				.getElementType()) {
			return null;
		}
		if (CazElementTypes.ArgumentArgumentClaims_4008 == req.getElementType()) {
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
		case ClaimClaimStrategiesEditPart.VISUAL_ID:
			return getGEFWrapper(new ClaimClaimStrategiesReorientCommand(req));
		case ArgumentArgumentJustificationEditPart.VISUAL_ID:
			return getGEFWrapper(new ArgumentArgumentJustificationReorientCommand(
					req));
		case ArgumentArgumentEvidenceEditPart.VISUAL_ID:
			return getGEFWrapper(new ArgumentArgumentEvidenceReorientCommand(
					req));
		case ArgumentArgumentClaimsEditPart.VISUAL_ID:
			return getGEFWrapper(new ArgumentArgumentClaimsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
