package net.certware.argument.gsz.diagram.edit.policies;

import java.util.Iterator;

import net.certware.argument.gsz.diagram.edit.commands.GoalGoalContextsCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.GoalGoalContextsReorientCommand;
import net.certware.argument.gsz.diagram.edit.commands.SolutionSolutionContextsCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.SolutionSolutionContextsReorientCommand;
import net.certware.argument.gsz.diagram.edit.commands.StrategyStrategyContextsCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.StrategyStrategyContextsReorientCommand;
import net.certware.argument.gsz.diagram.edit.parts.GoalGoalContextsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionSolutionContextsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyStrategyContextsEditPart;
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
public class ContextItemSemanticEditPolicy extends
		GszBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContextItemSemanticEditPolicy() {
		super(GszElementTypes.Context_2006);
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
			if (GszVisualIDRegistry.getVisualID(incomingLink) == GoalGoalContextsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (GszVisualIDRegistry.getVisualID(incomingLink) == StrategyStrategyContextsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (GszVisualIDRegistry.getVisualID(incomingLink) == SolutionSolutionContextsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
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
		if (GszElementTypes.GoalGoalContexts_4003 == req.getElementType()) {
			return null;
		}
		if (GszElementTypes.StrategyStrategyContexts_4008 == req
				.getElementType()) {
			return null;
		}
		if (GszElementTypes.SolutionSolutionContexts_4011 == req
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
		if (GszElementTypes.GoalGoalContexts_4003 == req.getElementType()) {
			return getGEFWrapper(new GoalGoalContextsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GszElementTypes.StrategyStrategyContexts_4008 == req
				.getElementType()) {
			return getGEFWrapper(new StrategyStrategyContextsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GszElementTypes.SolutionSolutionContexts_4011 == req
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
		case GoalGoalContextsEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalGoalContextsReorientCommand(req));
		case StrategyStrategyContextsEditPart.VISUAL_ID:
			return getGEFWrapper(new StrategyStrategyContextsReorientCommand(
					req));
		case SolutionSolutionContextsEditPart.VISUAL_ID:
			return getGEFWrapper(new SolutionSolutionContextsReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
