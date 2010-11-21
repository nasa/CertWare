/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.gsn.diagram.part;

import net.certware.argument.gsn.ArgumentDiagram;
import net.certware.argument.gsn.GsnPackage;
import net.certware.argument.gsn.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.gsn.diagram.edit.parts.GoalAssumedEditPart;
import net.certware.argument.gsn.diagram.edit.parts.GoalEditPart;
import net.certware.argument.gsn.diagram.edit.parts.GoalIdentifierEditPart;
import net.certware.argument.gsn.diagram.edit.parts.GoalToBeSupportedEditPart;
import net.certware.argument.gsn.diagram.edit.parts.JustificationEditPart;
import net.certware.argument.gsn.diagram.edit.parts.JustificationIdentifierEditPart;
import net.certware.argument.gsn.diagram.edit.parts.StrategyGoalEditPart;
import net.certware.argument.gsn.diagram.edit.parts.StrategyJustificationEditPart;
import net.certware.argument.gsn.diagram.edit.parts.WrappingLabel2EditPart;
import net.certware.argument.gsn.diagram.edit.parts.WrappingLabelEditPart;

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
public class GsnVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "net.certware.argument.gsn.diagram/debug/visualID"; //$NON-NLS-1$

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
		return net.certware.argument.gsn.diagram.part.GsnVisualIDRegistry
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
				GsnDiagramEditorPlugin.getInstance().logError(
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
		if (GsnPackage.eINSTANCE.getArgumentDiagram().isSuperTypeOf(
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
		String containerModelID = net.certware.argument.gsn.diagram.part.GsnVisualIDRegistry
				.getModelID(containerView);
		if (!ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"gsn".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.certware.argument.gsn.diagram.part.GsnVisualIDRegistry
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
			if (GsnPackage.eINSTANCE.getGoal().isSuperTypeOf(
					domainElement.eClass())) {
				return GoalEditPart.VISUAL_ID;
			}
			if (GsnPackage.eINSTANCE.getJustification().isSuperTypeOf(
					domainElement.eClass())) {
				return JustificationEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = net.certware.argument.gsn.diagram.part.GsnVisualIDRegistry
				.getModelID(containerView);
		if (!ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"gsn".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.certware.argument.gsn.diagram.part.GsnVisualIDRegistry
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
			if (JustificationEditPart.VISUAL_ID == nodeVisualID) {
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
			if (GoalToBeSupportedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JustificationEditPart.VISUAL_ID:
			if (JustificationIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrategyGoalEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StrategyJustificationEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
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
