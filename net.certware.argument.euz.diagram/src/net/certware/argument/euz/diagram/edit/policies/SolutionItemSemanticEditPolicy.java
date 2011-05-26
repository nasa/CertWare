/*
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.euz.diagram.edit.policies;

import java.util.Iterator;

import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentSolutionsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentSolutionsReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.SolutionSolutionContextsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.SolutionSolutionContextsReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.SolutionSolutionCriteriaCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.SolutionSolutionCriteriaReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.SolutionSolutionEvidenceCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.SolutionSolutionEvidenceReorientCommand;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentSolutionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionCriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionEvidenceEditPart;
import net.certware.argument.euz.diagram.part.EuzVisualIDRegistry;
import net.certware.argument.euz.diagram.providers.EuzElementTypes;

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
public class SolutionItemSemanticEditPolicy extends
		EuzBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SolutionItemSemanticEditPolicy() {
		super(EuzElementTypes.Solution_2002);
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
			if (EuzVisualIDRegistry.getVisualID(incomingLink) == ArgumentArgumentSolutionsEditPart.VISUAL_ID) {
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
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == SolutionSolutionContextsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == SolutionSolutionEvidenceEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == SolutionSolutionCriteriaEditPart.VISUAL_ID) {
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
		if (EuzElementTypes.ArgumentArgumentSolutions_4004 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.SolutionSolutionContexts_4014 == req
				.getElementType()) {
			return getGEFWrapper(new SolutionSolutionContextsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.SolutionSolutionEvidence_4015 == req
				.getElementType()) {
			return getGEFWrapper(new SolutionSolutionEvidenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.SolutionSolutionCriteria_4016 == req
				.getElementType()) {
			return getGEFWrapper(new SolutionSolutionCriteriaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (EuzElementTypes.ArgumentArgumentSolutions_4004 == req
				.getElementType()) {
			return getGEFWrapper(new ArgumentArgumentSolutionsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.SolutionSolutionContexts_4014 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.SolutionSolutionEvidence_4015 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.SolutionSolutionCriteria_4016 == req
				.getElementType()) {
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
		case ArgumentArgumentSolutionsEditPart.VISUAL_ID:
			return getGEFWrapper(new ArgumentArgumentSolutionsReorientCommand(
					req));
		case SolutionSolutionContextsEditPart.VISUAL_ID:
			return getGEFWrapper(new SolutionSolutionContextsReorientCommand(
					req));
		case SolutionSolutionEvidenceEditPart.VISUAL_ID:
			return getGEFWrapper(new SolutionSolutionEvidenceReorientCommand(
					req));
		case SolutionSolutionCriteriaEditPart.VISUAL_ID:
			return getGEFWrapper(new SolutionSolutionCriteriaReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
