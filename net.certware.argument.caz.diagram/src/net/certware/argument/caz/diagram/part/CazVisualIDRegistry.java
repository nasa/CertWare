package net.certware.argument.caz.diagram.part;

import net.certware.argument.caz.ArgumentDiagram;
import net.certware.argument.caz.CazPackage;
import net.certware.argument.caz.diagram.edit.parts.ArgumentArgumentClaimsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentArgumentEvidenceEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentArgumentJustificationEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentContentEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentIdentifierEditPart;
import net.certware.argument.caz.diagram.edit.parts.AssumptionContentEditPart;
import net.certware.argument.caz.diagram.edit.parts.AssumptionEditPart;
import net.certware.argument.caz.diagram.edit.parts.AssumptionIdentifierEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimAssumptionsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimContextsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimSolutionsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimStrategiesEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimContentEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimIdentifierEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimSubClaimsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ContextContentEditPart;
import net.certware.argument.caz.diagram.edit.parts.ContextEditPart;
import net.certware.argument.caz.diagram.edit.parts.ContextIdentifierEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceContentEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceEvidenceContextsEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceEvidenceEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceIdentifierEditPart;
import net.certware.argument.caz.diagram.edit.parts.JustificationContentEditPart;
import net.certware.argument.caz.diagram.edit.parts.JustificationEditPart;
import net.certware.argument.caz.diagram.edit.parts.JustificationIdentifierEditPart;
import net.certware.argument.caz.diagram.edit.parts.WrappingLabel10EditPart;
import net.certware.argument.caz.diagram.edit.parts.WrappingLabel2EditPart;
import net.certware.argument.caz.diagram.edit.parts.WrappingLabel3EditPart;
import net.certware.argument.caz.diagram.edit.parts.WrappingLabel4EditPart;
import net.certware.argument.caz.diagram.edit.parts.WrappingLabel5EditPart;
import net.certware.argument.caz.diagram.edit.parts.WrappingLabel6EditPart;
import net.certware.argument.caz.diagram.edit.parts.WrappingLabel7EditPart;
import net.certware.argument.caz.diagram.edit.parts.WrappingLabel8EditPart;
import net.certware.argument.caz.diagram.edit.parts.WrappingLabel9EditPart;
import net.certware.argument.caz.diagram.edit.parts.WrappingLabelEditPart;

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
public class CazVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "net.certware.argument.caz.diagram/debug/visualID"; //$NON-NLS-1$

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
		return net.certware.argument.caz.diagram.part.CazVisualIDRegistry
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
				CazDiagramEditorPlugin.getInstance().logError(
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
		if (CazPackage.eINSTANCE.getArgumentDiagram().isSuperTypeOf(
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
		String containerModelID = net.certware.argument.caz.diagram.part.CazVisualIDRegistry
				.getModelID(containerView);
		if (!ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.certware.argument.caz.diagram.part.CazVisualIDRegistry
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
			if (CazPackage.eINSTANCE.getClaim().isSuperTypeOf(
					domainElement.eClass())) {
				return ClaimEditPart.VISUAL_ID;
			}
			if (CazPackage.eINSTANCE.getEvidence().isSuperTypeOf(
					domainElement.eClass())) {
				return EvidenceEditPart.VISUAL_ID;
			}
			if (CazPackage.eINSTANCE.getArgument().isSuperTypeOf(
					domainElement.eClass())) {
				return ArgumentEditPart.VISUAL_ID;
			}
			if (CazPackage.eINSTANCE.getAssumption().isSuperTypeOf(
					domainElement.eClass())) {
				return AssumptionEditPart.VISUAL_ID;
			}
			if (CazPackage.eINSTANCE.getJustification().isSuperTypeOf(
					domainElement.eClass())) {
				return JustificationEditPart.VISUAL_ID;
			}
			if (CazPackage.eINSTANCE.getContext().isSuperTypeOf(
					domainElement.eClass())) {
				return ContextEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = net.certware.argument.caz.diagram.part.CazVisualIDRegistry
				.getModelID(containerView);
		if (!ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.certware.argument.caz.diagram.part.CazVisualIDRegistry
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
			if (ClaimEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EvidenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentEditPart.VISUAL_ID == nodeVisualID) {
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
			break;
		case ClaimEditPart.VISUAL_ID:
			if (ClaimIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClaimContentEditPart.VISUAL_ID == nodeVisualID) {
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
		case ArgumentEditPart.VISUAL_ID:
			if (ArgumentIdentifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentContentEditPart.VISUAL_ID == nodeVisualID) {
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
		case ClaimClaimStrategiesEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClaimClaimAssumptionsEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClaimClaimContextsEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClaimClaimSolutionsEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClaimSubClaimsEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentArgumentJustificationEditPart.VISUAL_ID:
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentArgumentEvidenceEditPart.VISUAL_ID:
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentArgumentClaimsEditPart.VISUAL_ID:
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EvidenceEvidenceContextsEditPart.VISUAL_ID:
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EvidenceEvidenceEditPart.VISUAL_ID:
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
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
