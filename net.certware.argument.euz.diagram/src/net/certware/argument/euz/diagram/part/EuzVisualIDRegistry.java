/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz.diagram.part;

import net.certware.argument.euz.ArgumentDiagram;
import net.certware.argument.euz.EuzPackage;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentAssumptionsExternalLabelEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentContextsExternalLabelEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentCriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentCriteriaExternalLabelEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentJustificationsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentJustificationsExternalLabelEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentSolutionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentSolutionsExternalLabelEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentStrategiesEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentStrategiesExternalLabelEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentContentEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentSubArgumentsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentSubArgumentsExternalLabelEditPart;
import net.certware.argument.euz.diagram.edit.parts.AssumptionContentEditPart;
import net.certware.argument.euz.diagram.edit.parts.AssumptionEditPart;
import net.certware.argument.euz.diagram.edit.parts.AssumptionIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.ContextContentEditPart;
import net.certware.argument.euz.diagram.edit.parts.ContextContextAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ContextContextAssumptionsExternalLabelEditPart;
import net.certware.argument.euz.diagram.edit.parts.ContextEditPart;
import net.certware.argument.euz.diagram.edit.parts.ContextIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaContentEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaCriteriaAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaCriteriaAssumptionsExternalLabelEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaCriteriaContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaCriteriaContextsExternalLabelEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.EvidenceContentEditPart;
import net.certware.argument.euz.diagram.edit.parts.EvidenceEditPart;
import net.certware.argument.euz.diagram.edit.parts.EvidenceIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.JustificationContentEditPart;
import net.certware.argument.euz.diagram.edit.parts.JustificationEditPart;
import net.certware.argument.euz.diagram.edit.parts.JustificationIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionContentEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionContextsExternalLabelEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionCriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionCriteriaExternalLabelEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionEvidenceEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionEvidenceExternalLabelEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyContentEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyArgumentsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyArgumentsExternalLabelEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyAssumptionsExternalLabelEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyCriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyCriteriaExternalLabelEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyJustificationsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyJustificationsExternalLabelEditPart;

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
public class EuzVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "net.certware.argument.euz.diagram/debug/visualID"; //$NON-NLS-1$

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
		return net.certware.argument.euz.diagram.part.EuzVisualIDRegistry
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
				EuzDiagramEditorPlugin.getInstance().logError(
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
		if (EuzPackage.eINSTANCE.getArgumentDiagram().isSuperTypeOf(
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
		String containerModelID = net.certware.argument.euz.diagram.part.EuzVisualIDRegistry
				.getModelID(containerView);
		if (!ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.certware.argument.euz.diagram.part.EuzVisualIDRegistry
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
			if (EuzPackage.eINSTANCE.getArgument().isSuperTypeOf(
					domainElement.eClass())) {
				return ArgumentEditPart.VISUAL_ID;
			}
			if (EuzPackage.eINSTANCE.getSolution().isSuperTypeOf(
					domainElement.eClass())) {
				return SolutionEditPart.VISUAL_ID;
			}
			if (EuzPackage.eINSTANCE.getEvidence().isSuperTypeOf(
					domainElement.eClass())) {
				return EvidenceEditPart.VISUAL_ID;
			}
			if (EuzPackage.eINSTANCE.getStrategy().isSuperTypeOf(
					domainElement.eClass())) {
				return StrategyEditPart.VISUAL_ID;
			}
			if (EuzPackage.eINSTANCE.getAssumption().isSuperTypeOf(
					domainElement.eClass())) {
				return AssumptionEditPart.VISUAL_ID;
			}
			if (EuzPackage.eINSTANCE.getJustification().isSuperTypeOf(
					domainElement.eClass())) {
				return JustificationEditPart.VISUAL_ID;
			}
			if (EuzPackage.eINSTANCE.getContext().isSuperTypeOf(
					domainElement.eClass())) {
				return ContextEditPart.VISUAL_ID;
			}
			if (EuzPackage.eINSTANCE.getCriteria().isSuperTypeOf(
					domainElement.eClass())) {
				return CriteriaEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = net.certware.argument.euz.diagram.part.EuzVisualIDRegistry
				.getModelID(containerView);
		if (!ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.certware.argument.euz.diagram.part.EuzVisualIDRegistry
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
			if (ArgumentEditPart.VISUAL_ID == nodeVisualID) {
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
			if (AssumptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JustificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CriteriaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentEditPart.VISUAL_ID:
			if (ArgumentIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentContentEditPart.VISUAL_ID == nodeVisualID) {
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
		case AssumptionEditPart.VISUAL_ID:
			if (AssumptionIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssumptionContentEditPart.VISUAL_ID == nodeVisualID) {
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
		case CriteriaEditPart.VISUAL_ID:
			if (CriteriaIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CriteriaContentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentArgumentStrategiesEditPart.VISUAL_ID:
			if (ArgumentArgumentStrategiesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentArgumentAssumptionsEditPart.VISUAL_ID:
			if (ArgumentArgumentAssumptionsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentArgumentContextsEditPart.VISUAL_ID:
			if (ArgumentArgumentContextsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentArgumentSolutionsEditPart.VISUAL_ID:
			if (ArgumentArgumentSolutionsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentArgumentCriteriaEditPart.VISUAL_ID:
			if (ArgumentArgumentCriteriaExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentArgumentJustificationsEditPart.VISUAL_ID:
			if (ArgumentArgumentJustificationsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentSubArgumentsEditPart.VISUAL_ID:
			if (ArgumentSubArgumentsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContextContextAssumptionsEditPart.VISUAL_ID:
			if (ContextContextAssumptionsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CriteriaCriteriaContextsEditPart.VISUAL_ID:
			if (CriteriaCriteriaContextsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CriteriaCriteriaAssumptionsEditPart.VISUAL_ID:
			if (CriteriaCriteriaAssumptionsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrategyStrategyArgumentsEditPart.VISUAL_ID:
			if (StrategyStrategyArgumentsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrategyStrategyJustificationsEditPart.VISUAL_ID:
			if (StrategyStrategyJustificationsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrategyStrategyCriteriaEditPart.VISUAL_ID:
			if (StrategyStrategyCriteriaExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrategyStrategyAssumptionsEditPart.VISUAL_ID:
			if (StrategyStrategyAssumptionsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SolutionSolutionContextsEditPart.VISUAL_ID:
			if (SolutionSolutionContextsExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SolutionSolutionEvidenceEditPart.VISUAL_ID:
			if (SolutionSolutionEvidenceExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SolutionSolutionCriteriaEditPart.VISUAL_ID:
			if (SolutionSolutionCriteriaExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
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
