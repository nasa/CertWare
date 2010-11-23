package net.certware.argument.gsz.diagram.edit.policies;

import java.util.Iterator;

import net.certware.argument.gsz.diagram.edit.commands.GoalAssumptionsCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.GoalAssumptionsReorientCommand;
import net.certware.argument.gsz.diagram.edit.commands.GoalGoalContextsCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.GoalGoalContextsReorientCommand;
import net.certware.argument.gsz.diagram.edit.commands.GoalGoalSolutionsCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.GoalGoalSolutionsReorientCommand;
import net.certware.argument.gsz.diagram.edit.commands.GoalStrategiesCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.GoalStrategiesReorientCommand;
import net.certware.argument.gsz.diagram.edit.commands.GoalSubGoalsCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.GoalSubGoalsReorientCommand;
import net.certware.argument.gsz.diagram.edit.commands.StrategyGoalsCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.StrategyGoalsReorientCommand;
import net.certware.argument.gsz.diagram.edit.parts.GoalAssumptionsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalGoalContextsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalGoalSolutionsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalStrategiesEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalSubGoalsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyGoalsEditPart;
import net.certware.argument.gsz.diagram.part.GszVisualIDRegistry;
import net.certware.argument.gsz.diagram.providers.GszElementTypes;

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
public class GoalItemSemanticEditPolicy extends GszBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GoalItemSemanticEditPolicy() {
		super(GszElementTypes.Goal_2001);
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
			if (GszVisualIDRegistry.getVisualID(incomingLink) == GoalSubGoalsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (GszVisualIDRegistry.getVisualID(incomingLink) == StrategyGoalsEditPart.VISUAL_ID) {
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
			if (GszVisualIDRegistry.getVisualID(outgoingLink) == GoalSubGoalsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GszVisualIDRegistry.getVisualID(outgoingLink) == GoalStrategiesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GszVisualIDRegistry.getVisualID(outgoingLink) == GoalGoalContextsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GszVisualIDRegistry.getVisualID(outgoingLink) == GoalAssumptionsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GszVisualIDRegistry.getVisualID(outgoingLink) == GoalGoalSolutionsEditPart.VISUAL_ID) {
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
		if (GszElementTypes.GoalSubGoals_4001 == req.getElementType()) {
			return getGEFWrapper(new GoalSubGoalsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GszElementTypes.GoalStrategies_4002 == req.getElementType()) {
			return getGEFWrapper(new GoalStrategiesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GszElementTypes.GoalGoalContexts_4003 == req.getElementType()) {
			return getGEFWrapper(new GoalGoalContextsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GszElementTypes.GoalAssumptions_4004 == req.getElementType()) {
			return getGEFWrapper(new GoalAssumptionsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GszElementTypes.GoalGoalSolutions_4005 == req.getElementType()) {
			return getGEFWrapper(new GoalGoalSolutionsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GszElementTypes.StrategyGoals_4006 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GszElementTypes.GoalSubGoals_4001 == req.getElementType()) {
			return getGEFWrapper(new GoalSubGoalsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GszElementTypes.GoalStrategies_4002 == req.getElementType()) {
			return null;
		}
		if (GszElementTypes.GoalGoalContexts_4003 == req.getElementType()) {
			return null;
		}
		if (GszElementTypes.GoalAssumptions_4004 == req.getElementType()) {
			return null;
		}
		if (GszElementTypes.GoalGoalSolutions_4005 == req.getElementType()) {
			return null;
		}
		if (GszElementTypes.StrategyGoals_4006 == req.getElementType()) {
			return getGEFWrapper(new StrategyGoalsCreateCommand(req,
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
		case GoalSubGoalsEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalSubGoalsReorientCommand(req));
		case GoalStrategiesEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalStrategiesReorientCommand(req));
		case GoalGoalContextsEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalGoalContextsReorientCommand(req));
		case GoalAssumptionsEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalAssumptionsReorientCommand(req));
		case GoalGoalSolutionsEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalGoalSolutionsReorientCommand(req));
		case StrategyGoalsEditPart.VISUAL_ID:
			return getGEFWrapper(new StrategyGoalsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
