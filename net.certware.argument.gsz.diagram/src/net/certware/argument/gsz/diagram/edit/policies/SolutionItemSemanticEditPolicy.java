package net.certware.argument.gsz.diagram.edit.policies;

import java.util.Iterator;

import net.certware.argument.gsz.diagram.edit.commands.GoalGoalSolutionsCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.GoalGoalSolutionsReorientCommand;
import net.certware.argument.gsz.diagram.edit.commands.SolutionSolutionContextsCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.SolutionSolutionContextsReorientCommand;
import net.certware.argument.gsz.diagram.edit.commands.SolutionSolutionEvidenceCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.SolutionSolutionEvidenceReorientCommand;
import net.certware.argument.gsz.diagram.edit.commands.StrategyStrategySolutionsCreateCommand;
import net.certware.argument.gsz.diagram.edit.commands.StrategyStrategySolutionsReorientCommand;
import net.certware.argument.gsz.diagram.edit.parts.GoalGoalSolutionsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionSolutionContextsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionSolutionEvidenceEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyStrategySolutionsEditPart;
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
public class SolutionItemSemanticEditPolicy extends
		GszBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SolutionItemSemanticEditPolicy() {
		super(GszElementTypes.Solution_2002);
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
			if (GszVisualIDRegistry.getVisualID(incomingLink) == GoalGoalSolutionsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (GszVisualIDRegistry.getVisualID(incomingLink) == StrategyStrategySolutionsEditPart.VISUAL_ID) {
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
			if (GszVisualIDRegistry.getVisualID(outgoingLink) == SolutionSolutionEvidenceEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GszVisualIDRegistry.getVisualID(outgoingLink) == SolutionSolutionContextsEditPart.VISUAL_ID) {
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
		if (GszElementTypes.GoalGoalSolutions_4005 == req.getElementType()) {
			return null;
		}
		if (GszElementTypes.StrategyStrategySolutions_4009 == req
				.getElementType()) {
			return null;
		}
		if (GszElementTypes.SolutionSolutionEvidence_4010 == req
				.getElementType()) {
			return getGEFWrapper(new SolutionSolutionEvidenceCreateCommand(req,
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
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GszElementTypes.GoalGoalSolutions_4005 == req.getElementType()) {
			return getGEFWrapper(new GoalGoalSolutionsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GszElementTypes.StrategyStrategySolutions_4009 == req
				.getElementType()) {
			return getGEFWrapper(new StrategyStrategySolutionsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (GszElementTypes.SolutionSolutionEvidence_4010 == req
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
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case GoalGoalSolutionsEditPart.VISUAL_ID:
			return getGEFWrapper(new GoalGoalSolutionsReorientCommand(req));
		case StrategyStrategySolutionsEditPart.VISUAL_ID:
			return getGEFWrapper(new StrategyStrategySolutionsReorientCommand(
					req));
		case SolutionSolutionEvidenceEditPart.VISUAL_ID:
			return getGEFWrapper(new SolutionSolutionEvidenceReorientCommand(
					req));
		case SolutionSolutionContextsEditPart.VISUAL_ID:
			return getGEFWrapper(new SolutionSolutionContextsReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
