/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz.diagram.edit.policies;

import java.util.Iterator;

import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentAssumptionsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentAssumptionsReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentContextsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentContextsReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentCriteriaCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentCriteriaReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentJustificationsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentJustificationsReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentSolutionsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentSolutionsReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentStrategiesCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentStrategiesReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.ArgumentSubArgumentsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.ArgumentSubArgumentsReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.StrategyStrategyArgumentsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.StrategyStrategyArgumentsReorientCommand;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentCriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentJustificationsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentSolutionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentStrategiesEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentSubArgumentsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyArgumentsEditPart;
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
public class ArgumentItemSemanticEditPolicy extends
		EuzBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArgumentItemSemanticEditPolicy() {
		super(EuzElementTypes.Argument_2001);
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
			if (EuzVisualIDRegistry.getVisualID(incomingLink) == ArgumentSubArgumentsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(incomingLink) == StrategyStrategyArgumentsEditPart.VISUAL_ID) {
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
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == ArgumentArgumentStrategiesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == ArgumentArgumentAssumptionsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == ArgumentArgumentContextsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == ArgumentArgumentSolutionsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == ArgumentArgumentCriteriaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == ArgumentArgumentJustificationsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == ArgumentSubArgumentsEditPart.VISUAL_ID) {
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
			return getGEFWrapper(new ArgumentArgumentStrategiesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.ArgumentArgumentAssumptions_4002 == req
				.getElementType()) {
			return getGEFWrapper(new ArgumentArgumentAssumptionsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.ArgumentArgumentContexts_4003 == req
				.getElementType()) {
			return getGEFWrapper(new ArgumentArgumentContextsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.ArgumentArgumentSolutions_4004 == req
				.getElementType()) {
			return getGEFWrapper(new ArgumentArgumentSolutionsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.ArgumentArgumentCriteria_4005 == req
				.getElementType()) {
			return getGEFWrapper(new ArgumentArgumentCriteriaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.ArgumentArgumentJustifications_4006 == req
				.getElementType()) {
			return getGEFWrapper(new ArgumentArgumentJustificationsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.ArgumentSubArguments_4017 == req.getElementType()) {
			return getGEFWrapper(new ArgumentSubArgumentsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.StrategyStrategyArguments_4010 == req
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
		if (EuzElementTypes.ArgumentArgumentStrategies_4001 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.ArgumentArgumentAssumptions_4002 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.ArgumentArgumentContexts_4003 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.ArgumentArgumentSolutions_4004 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.ArgumentArgumentCriteria_4005 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.ArgumentArgumentJustifications_4006 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.ArgumentSubArguments_4017 == req.getElementType()) {
			return getGEFWrapper(new ArgumentSubArgumentsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.StrategyStrategyArguments_4010 == req
				.getElementType()) {
			return getGEFWrapper(new StrategyStrategyArgumentsCreateCommand(
					req, req.getSource(), req.getTarget()));
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
		case ArgumentArgumentAssumptionsEditPart.VISUAL_ID:
			return getGEFWrapper(new ArgumentArgumentAssumptionsReorientCommand(
					req));
		case ArgumentArgumentContextsEditPart.VISUAL_ID:
			return getGEFWrapper(new ArgumentArgumentContextsReorientCommand(
					req));
		case ArgumentArgumentSolutionsEditPart.VISUAL_ID:
			return getGEFWrapper(new ArgumentArgumentSolutionsReorientCommand(
					req));
		case ArgumentArgumentCriteriaEditPart.VISUAL_ID:
			return getGEFWrapper(new ArgumentArgumentCriteriaReorientCommand(
					req));
		case ArgumentArgumentJustificationsEditPart.VISUAL_ID:
			return getGEFWrapper(new ArgumentArgumentJustificationsReorientCommand(
					req));
		case ArgumentSubArgumentsEditPart.VISUAL_ID:
			return getGEFWrapper(new ArgumentSubArgumentsReorientCommand(req));
		case StrategyStrategyArgumentsEditPart.VISUAL_ID:
			return getGEFWrapper(new StrategyStrategyArgumentsReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
