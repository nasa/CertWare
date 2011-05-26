/*
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.euz.diagram.edit.policies;

import java.util.Iterator;

import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentStrategiesCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentStrategiesReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.StrategyStrategyArgumentsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.StrategyStrategyArgumentsReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.StrategyStrategyAssumptionsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.StrategyStrategyAssumptionsReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.StrategyStrategyContextsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.StrategyStrategyContextsReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.StrategyStrategyCriteriaCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.StrategyStrategyCriteriaReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.StrategyStrategyJustificationsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.StrategyStrategyJustificationsReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.StrategyStrategyStrategiesCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.StrategyStrategyStrategiesReorientCommand;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentStrategiesEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyArgumentsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyCriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyJustificationsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyStrategiesEditPart;
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
public class StrategyItemSemanticEditPolicy extends
		EuzBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StrategyItemSemanticEditPolicy() {
		super(EuzElementTypes.Strategy_2004);
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
			if (EuzVisualIDRegistry.getVisualID(incomingLink) == ArgumentArgumentStrategiesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(incomingLink) == StrategyStrategyStrategiesEditPart.VISUAL_ID) {
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
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == StrategyStrategyArgumentsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == StrategyStrategyJustificationsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == StrategyStrategyCriteriaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == StrategyStrategyAssumptionsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == StrategyStrategyStrategiesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == StrategyStrategyContextsEditPart.VISUAL_ID) {
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
		if (EuzElementTypes.ArgumentArgumentStrategies_4001 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.StrategyStrategyArguments_4010 == req
				.getElementType()) {
			return getGEFWrapper(new StrategyStrategyArgumentsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.StrategyStrategyJustifications_4011 == req
				.getElementType()) {
			return getGEFWrapper(new StrategyStrategyJustificationsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.StrategyStrategyCriteria_4012 == req
				.getElementType()) {
			return getGEFWrapper(new StrategyStrategyCriteriaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.StrategyStrategyAssumptions_4013 == req
				.getElementType()) {
			return getGEFWrapper(new StrategyStrategyAssumptionsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.StrategyStrategyStrategies_4018 == req
				.getElementType()) {
			return getGEFWrapper(new StrategyStrategyStrategiesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.StrategyStrategyContexts_4019 == req
				.getElementType()) {
			return getGEFWrapper(new StrategyStrategyContextsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (EuzElementTypes.ArgumentArgumentStrategies_4001 == req
				.getElementType()) {
			return getGEFWrapper(new ArgumentArgumentStrategiesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.StrategyStrategyArguments_4010 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.StrategyStrategyJustifications_4011 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.StrategyStrategyCriteria_4012 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.StrategyStrategyAssumptions_4013 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.StrategyStrategyStrategies_4018 == req
				.getElementType()) {
			return getGEFWrapper(new StrategyStrategyStrategiesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.StrategyStrategyContexts_4019 == req
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
		case ArgumentArgumentStrategiesEditPart.VISUAL_ID:
			return getGEFWrapper(new ArgumentArgumentStrategiesReorientCommand(
					req));
		case StrategyStrategyArgumentsEditPart.VISUAL_ID:
			return getGEFWrapper(new StrategyStrategyArgumentsReorientCommand(
					req));
		case StrategyStrategyJustificationsEditPart.VISUAL_ID:
			return getGEFWrapper(new StrategyStrategyJustificationsReorientCommand(
					req));
		case StrategyStrategyCriteriaEditPart.VISUAL_ID:
			return getGEFWrapper(new StrategyStrategyCriteriaReorientCommand(
					req));
		case StrategyStrategyAssumptionsEditPart.VISUAL_ID:
			return getGEFWrapper(new StrategyStrategyAssumptionsReorientCommand(
					req));
		case StrategyStrategyStrategiesEditPart.VISUAL_ID:
			return getGEFWrapper(new StrategyStrategyStrategiesReorientCommand(
					req));
		case StrategyStrategyContextsEditPart.VISUAL_ID:
			return getGEFWrapper(new StrategyStrategyContextsReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
