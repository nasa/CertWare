package net.certware.argument.gsz.diagram.part;

import net.certware.argument.gsz.ArgumentDiagram;
import net.certware.argument.gsz.GszPackage;
import net.certware.argument.gsz.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.gsz.diagram.edit.parts.AssumptionContentEditPart;
import net.certware.argument.gsz.diagram.edit.parts.AssumptionEditPart;
import net.certware.argument.gsz.diagram.edit.parts.AssumptionIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.ContextContentEditPart;
import net.certware.argument.gsz.diagram.edit.parts.ContextEditPart;
import net.certware.argument.gsz.diagram.edit.parts.ContextIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.EvidenceContentEditPart;
import net.certware.argument.gsz.diagram.edit.parts.EvidenceEditPart;
import net.certware.argument.gsz.diagram.edit.parts.EvidenceIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalAssumedEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalAssumptionsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalAssumptionsExternalLabelEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalGoalContextsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalGoalContextsExternalLabelEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalGoalSolutionsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalGoalSolutionsExternalLabelEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalStrategiesEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalStrategiesExternalLabelEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalSubGoalsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalSubGoalsExternalLabelEditPart;
import net.certware.argument.gsz.diagram.edit.parts.JustificationContentEditPart;
import net.certware.argument.gsz.diagram.edit.parts.JustificationEditPart;
import net.certware.argument.gsz.diagram.edit.parts.JustificationIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionContentEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionSolutionContextsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionSolutionContextsExternalLabelEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionSolutionEvidenceEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionSolutionEvidenceExternalLabelEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyContentEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyGoalsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyGoalsExternalLabelEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyJustificationsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyJustificationsExternalLabelEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyStrategyContextsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyStrategyContextsExternalLabelEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyStrategySolutionsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyStrategySolutionsExternalLabelEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GszVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "net.certware.argument.gsz.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ArgumentDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return ArgumentDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return net.certware.argument.gsz.diagram.part.GszVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				GszDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GszPackage.eINSTANCE.getArgumentDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((ArgumentDiagram) domainElement)) {
			return ArgumentDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = net.certware.argument.gsz.diagram.part.GszVisualIDRegistry
				.getModelID(containerView);
		if (!ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.certware.argument.gsz.diagram.part.GszVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ArgumentDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			if (GszPackage.eINSTANCE.getGoal().isSuperTypeOf(
					domainElement.eClass())) {
				return GoalEditPart.VISUAL_ID;
			}
			if (GszPackage.eINSTANCE.getSolution().isSuperTypeOf(
					domainElement.eClass())) {
				return SolutionEditPart.VISUAL_ID;
			}
			if (GszPackage.eINSTANCE.getEvidence().isSuperTypeOf(
					domainElement.eClass())) {
				return EvidenceEditPart.VISUAL_ID;
			}
			if (GszPackage.eINSTANCE.getStrategy().isSuperTypeOf(
					domainElement.eClass())) {
				return StrategyEditPart.VISUAL_ID;
			}
			if (GszPackage.eINSTANCE.getJustification().isSuperTypeOf(
					domainElement.eClass())) {
				return JustificationEditPart.VISUAL_ID;
			}
			if (GszPackage.eINSTANCE.getContext().isSuperTypeOf(
					domainElement.eClass())) {
				return ContextEditPart.VISUAL_ID;
			}
			if (GszPackage.eINSTANCE.getAssumption().isSuperTypeOf(
					domainElement.eClass())) {
				return AssumptionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = net.certware.argument.gsz.diagram.part.GszVisualIDRegistry
				.getModelID(containerView);
		if (!ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.certware.argument.gsz.diagram.part.GszVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ArgumentDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			if (GoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SolutionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EvidenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StrategyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JustificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssumptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GoalEditPart.VISUAL_ID:
			if (GoalIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GoalAssumedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SolutionEditPart.VISUAL_ID:
			if (SolutionIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SolutionContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EvidenceEditPart.VISUAL_ID:
			if (EvidenceIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EvidenceContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrategyEditPart.VISUAL_ID:
			if (StrategyIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StrategyContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JustificationEditPart.VISUAL_ID:
			if (JustificationIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JustificationContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContextEditPart.VISUAL_ID:
			if (ContextIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssumptionEditPart.VISUAL_ID:
			if (AssumptionIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssumptionContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GoalSubGoalsEditPart.VISUAL_ID:
			if (GoalSubGoalsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GoalStrategiesEditPart.VISUAL_ID:
			if (GoalStrategiesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GoalGoalContextsEditPart.VISUAL_ID:
			if (GoalGoalContextsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GoalAssumptionsEditPart.VISUAL_ID:
			if (GoalAssumptionsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GoalGoalSolutionsEditPart.VISUAL_ID:
			if (GoalGoalSolutionsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrategyGoalsEditPart.VISUAL_ID:
			if (StrategyGoalsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrategyJustificationsEditPart.VISUAL_ID:
			if (StrategyJustificationsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrategyStrategyContextsEditPart.VISUAL_ID:
			if (StrategyStrategyContextsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrategyStrategySolutionsEditPart.VISUAL_ID:
			if (StrategyStrategySolutionsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SolutionSolutionEvidenceEditPart.VISUAL_ID:
			if (SolutionSolutionEvidenceExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SolutionSolutionContextsEditPart.VISUAL_ID:
			if (SolutionSolutionContextsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ArgumentDiagram element) {
		return true;
	}

}
