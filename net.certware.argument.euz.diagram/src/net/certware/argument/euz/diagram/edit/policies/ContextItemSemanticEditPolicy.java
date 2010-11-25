/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz.diagram.edit.policies;

import java.util.Iterator;

import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentContextsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentContextsReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.ContextContextAssumptionsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.ContextContextAssumptionsReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.CriteriaCriteriaContextsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.CriteriaCriteriaContextsReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.SolutionSolutionContextsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.SolutionSolutionContextsReorientCommand;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ContextContextAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaCriteriaContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionContextsEditPart;
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
public class ContextItemSemanticEditPolicy extends
		EuzBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContextItemSemanticEditPolicy() {
		super(EuzElementTypes.Context_2007);
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
			if (EuzVisualIDRegistry.getVisualID(incomingLink) == ArgumentArgumentContextsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(incomingLink) == CriteriaCriteriaContextsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(incomingLink) == SolutionSolutionContextsEditPart.VISUAL_ID) {
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
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == ContextContextAssumptionsEditPart.VISUAL_ID) {
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
		if (EuzElementTypes.ArgumentArgumentContexts_4003 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.ContextContextAssumptions_4007 == req
				.getElementType()) {
			return getGEFWrapper(new ContextContextAssumptionsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.CriteriaCriteriaContexts_4008 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.SolutionSolutionContexts_4014 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (EuzElementTypes.ArgumentArgumentContexts_4003 == req
				.getElementType()) {
			return getGEFWrapper(new ArgumentArgumentContextsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.ContextContextAssumptions_4007 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.CriteriaCriteriaContexts_4008 == req
				.getElementType()) {
			return getGEFWrapper(new CriteriaCriteriaContextsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.SolutionSolutionContexts_4014 == req
				.getElementType()) {
			return getGEFWrapper(new SolutionSolutionContextsCreateCommand(req,
					req.getSource(), req.getTarget()));
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
		case ArgumentArgumentContextsEditPart.VISUAL_ID:
			return getGEFWrapper(new ArgumentArgumentContextsReorientCommand(
					req));
		case ContextContextAssumptionsEditPart.VISUAL_ID:
			return getGEFWrapper(new ContextContextAssumptionsReorientCommand(
					req));
		case CriteriaCriteriaContextsEditPart.VISUAL_ID:
			return getGEFWrapper(new CriteriaCriteriaContextsReorientCommand(
					req));
		case SolutionSolutionContextsEditPart.VISUAL_ID:
			return getGEFWrapper(new SolutionSolutionContextsReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
