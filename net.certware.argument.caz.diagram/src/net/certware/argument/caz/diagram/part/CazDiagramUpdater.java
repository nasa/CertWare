package net.certware.argument.caz.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.InformationElement;
import net.certware.argument.caz.Argument;
import net.certware.argument.caz.ArgumentDiagram;
import net.certware.argument.caz.Assumption;
import net.certware.argument.caz.CazPackage;
import net.certware.argument.caz.Claim;
import net.certware.argument.caz.Context;
import net.certware.argument.caz.Evidence;
import net.certware.argument.caz.Justification;
import net.certware.argument.caz.diagram.edit.parts.ArgumentArgumentClaimsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentArgumentEvidenceEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentArgumentJustificationEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentEditPart;
import net.certware.argument.caz.diagram.edit.parts.AssumptionEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimAssumptionsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimContextsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimSolutionsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimStrategiesEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimSubClaimsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ContextEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceEvidenceContextsEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceEvidenceEditPart;
import net.certware.argument.caz.diagram.edit.parts.JustificationEditPart;
import net.certware.argument.caz.diagram.providers.CazElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CazDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<CazNodeDescriptor> getSemanticChildren(View view) {
		switch (CazVisualIDRegistry.getVisualID(view)) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getArgumentDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CazNodeDescriptor> getArgumentDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ArgumentDiagram modelElement = (ArgumentDiagram) view.getElement();
		LinkedList<CazNodeDescriptor> result = new LinkedList<CazNodeDescriptor>();
		for (Iterator<?> it = modelElement.getClaims().iterator(); it.hasNext();) {
			Claim childElement = (Claim) it.next();
			int visualID = CazVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ClaimEditPart.VISUAL_ID) {
				result.add(new CazNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEvidence().iterator(); it
				.hasNext();) {
			Evidence childElement = (Evidence) it.next();
			int visualID = CazVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EvidenceEditPart.VISUAL_ID) {
				result.add(new CazNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getArguments().iterator(); it
				.hasNext();) {
			Argument childElement = (Argument) it.next();
			int visualID = CazVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArgumentEditPart.VISUAL_ID) {
				result.add(new CazNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAssumptions().iterator(); it
				.hasNext();) {
			Assumption childElement = (Assumption) it.next();
			int visualID = CazVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AssumptionEditPart.VISUAL_ID) {
				result.add(new CazNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getJustifications().iterator(); it
				.hasNext();) {
			Justification childElement = (Justification) it.next();
			int visualID = CazVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == JustificationEditPart.VISUAL_ID) {
				result.add(new CazNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getContexts().iterator(); it
				.hasNext();) {
			Context childElement = (Context) it.next();
			int visualID = CazVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ContextEditPart.VISUAL_ID) {
				result.add(new CazNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getContainedLinks(View view) {
		switch (CazVisualIDRegistry.getVisualID(view)) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getArgumentDiagram_1000ContainedLinks(view);
		case ClaimEditPart.VISUAL_ID:
			return getClaim_2001ContainedLinks(view);
		case EvidenceEditPart.VISUAL_ID:
			return getEvidence_2002ContainedLinks(view);
		case ArgumentEditPart.VISUAL_ID:
			return getArgument_2003ContainedLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2004ContainedLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2005ContainedLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getIncomingLinks(View view) {
		switch (CazVisualIDRegistry.getVisualID(view)) {
		case ClaimEditPart.VISUAL_ID:
			return getClaim_2001IncomingLinks(view);
		case EvidenceEditPart.VISUAL_ID:
			return getEvidence_2002IncomingLinks(view);
		case ArgumentEditPart.VISUAL_ID:
			return getArgument_2003IncomingLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2004IncomingLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2005IncomingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getOutgoingLinks(View view) {
		switch (CazVisualIDRegistry.getVisualID(view)) {
		case ClaimEditPart.VISUAL_ID:
			return getClaim_2001OutgoingLinks(view);
		case EvidenceEditPart.VISUAL_ID:
			return getEvidence_2002OutgoingLinks(view);
		case ArgumentEditPart.VISUAL_ID:
			return getArgument_2003OutgoingLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2004OutgoingLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2005OutgoingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getArgumentDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getClaim_2001ContainedLinks(View view) {
		Claim modelElement = (Claim) view.getElement();
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Claim_ClaimStrategies_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Claim_ClaimAssumptions_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Claim_ClaimContexts_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Claim_ClaimSolutions_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Claim_SubClaims_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getEvidence_2002ContainedLinks(
			View view) {
		Evidence modelElement = (Evidence) view.getElement();
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Evidence_EvidenceContexts_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Evidence_Evidence_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getArgument_2003ContainedLinks(
			View view) {
		Argument modelElement = (Argument) view.getElement();
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentJustification_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentEvidence_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentClaims_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getAssumption_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getJustification_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getContext_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getClaim_2001IncomingLinks(View view) {
		Claim modelElement = (Claim) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Claim_SubClaims_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Argument_ArgumentClaims_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getEvidence_2002IncomingLinks(
			View view) {
		Evidence modelElement = (Evidence) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Claim_ClaimSolutions_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Argument_ArgumentEvidence_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getArgument_2003IncomingLinks(
			View view) {
		Argument modelElement = (Argument) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Claim_ClaimStrategies_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getAssumption_2004IncomingLinks(
			View view) {
		Assumption modelElement = (Assumption) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Claim_ClaimAssumptions_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Evidence_Evidence_4010(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getJustification_2005IncomingLinks(
			View view) {
		Justification modelElement = (Justification) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Argument_ArgumentJustification_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Evidence_Evidence_4010(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getContext_2006IncomingLinks(View view) {
		Context modelElement = (Context) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Claim_ClaimContexts_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Evidence_EvidenceContexts_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Evidence_Evidence_4010(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getClaim_2001OutgoingLinks(View view) {
		Claim modelElement = (Claim) view.getElement();
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Claim_ClaimStrategies_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Claim_ClaimAssumptions_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Claim_ClaimContexts_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Claim_ClaimSolutions_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Claim_SubClaims_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getEvidence_2002OutgoingLinks(
			View view) {
		Evidence modelElement = (Evidence) view.getElement();
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Evidence_EvidenceContexts_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Evidence_Evidence_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getArgument_2003OutgoingLinks(
			View view) {
		Argument modelElement = (Argument) view.getElement();
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentJustification_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentEvidence_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentClaims_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getAssumption_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getJustification_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CazLinkDescriptor> getContext_2006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getIncomingFeatureModelFacetLinks_Claim_ClaimStrategies_4001(
			Argument target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CazPackage.eINSTANCE
					.getClaim_ClaimStrategies()) {
				result.add(new CazLinkDescriptor(setting.getEObject(), target,
						CazElementTypes.ClaimClaimStrategies_4001,
						ClaimClaimStrategiesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getIncomingFeatureModelFacetLinks_Claim_ClaimAssumptions_4002(
			Assumption target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CazPackage.eINSTANCE
					.getClaim_ClaimAssumptions()) {
				result.add(new CazLinkDescriptor(setting.getEObject(), target,
						CazElementTypes.ClaimClaimAssumptions_4002,
						ClaimClaimAssumptionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getIncomingFeatureModelFacetLinks_Claim_ClaimContexts_4003(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CazPackage.eINSTANCE
					.getClaim_ClaimContexts()) {
				result.add(new CazLinkDescriptor(setting.getEObject(), target,
						CazElementTypes.ClaimClaimContexts_4003,
						ClaimClaimContextsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getIncomingFeatureModelFacetLinks_Claim_ClaimSolutions_4004(
			Evidence target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CazPackage.eINSTANCE
					.getClaim_ClaimSolutions()) {
				result.add(new CazLinkDescriptor(setting.getEObject(), target,
						CazElementTypes.ClaimClaimSolutions_4004,
						ClaimClaimSolutionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getIncomingFeatureModelFacetLinks_Claim_SubClaims_4005(
			Claim target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CazPackage.eINSTANCE
					.getClaim_SubClaims()) {
				result.add(new CazLinkDescriptor(setting.getEObject(), target,
						CazElementTypes.ClaimSubClaims_4005,
						ClaimSubClaimsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getIncomingFeatureModelFacetLinks_Argument_ArgumentJustification_4006(
			Justification target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CazPackage.eINSTANCE
					.getArgument_ArgumentJustification()) {
				result.add(new CazLinkDescriptor(setting.getEObject(), target,
						CazElementTypes.ArgumentArgumentJustification_4006,
						ArgumentArgumentJustificationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getIncomingFeatureModelFacetLinks_Argument_ArgumentEvidence_4007(
			Evidence target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CazPackage.eINSTANCE
					.getArgument_ArgumentEvidence()) {
				result.add(new CazLinkDescriptor(setting.getEObject(), target,
						CazElementTypes.ArgumentArgumentEvidence_4007,
						ArgumentArgumentEvidenceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getIncomingFeatureModelFacetLinks_Argument_ArgumentClaims_4008(
			Claim target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CazPackage.eINSTANCE
					.getArgument_ArgumentClaims()) {
				result.add(new CazLinkDescriptor(setting.getEObject(), target,
						CazElementTypes.ArgumentArgumentClaims_4008,
						ArgumentArgumentClaimsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getIncomingFeatureModelFacetLinks_Evidence_EvidenceContexts_4009(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CazPackage.eINSTANCE
					.getEvidence_EvidenceContexts()) {
				result.add(new CazLinkDescriptor(setting.getEObject(), target,
						CazElementTypes.EvidenceEvidenceContexts_4009,
						EvidenceEvidenceContextsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getIncomingFeatureModelFacetLinks_Evidence_Evidence_4010(
			InformationElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CazPackage.eINSTANCE
					.getEvidence_Evidence()) {
				result.add(new CazLinkDescriptor(setting.getEObject(), target,
						CazElementTypes.EvidenceEvidence_4010,
						EvidenceEvidenceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getOutgoingFeatureModelFacetLinks_Claim_ClaimStrategies_4001(
			Claim source) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		for (Iterator<?> destinations = source.getClaimStrategies().iterator(); destinations
				.hasNext();) {
			Argument destination = (Argument) destinations.next();
			result.add(new CazLinkDescriptor(source, destination,
					CazElementTypes.ClaimClaimStrategies_4001,
					ClaimClaimStrategiesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getOutgoingFeatureModelFacetLinks_Claim_ClaimAssumptions_4002(
			Claim source) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		for (Iterator<?> destinations = source.getClaimAssumptions().iterator(); destinations
				.hasNext();) {
			Assumption destination = (Assumption) destinations.next();
			result.add(new CazLinkDescriptor(source, destination,
					CazElementTypes.ClaimClaimAssumptions_4002,
					ClaimClaimAssumptionsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getOutgoingFeatureModelFacetLinks_Claim_ClaimContexts_4003(
			Claim source) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		for (Iterator<?> destinations = source.getClaimContexts().iterator(); destinations
				.hasNext();) {
			Context destination = (Context) destinations.next();
			result.add(new CazLinkDescriptor(source, destination,
					CazElementTypes.ClaimClaimContexts_4003,
					ClaimClaimContextsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getOutgoingFeatureModelFacetLinks_Claim_ClaimSolutions_4004(
			Claim source) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		for (Iterator<?> destinations = source.getClaimSolutions().iterator(); destinations
				.hasNext();) {
			Evidence destination = (Evidence) destinations.next();
			result.add(new CazLinkDescriptor(source, destination,
					CazElementTypes.ClaimClaimSolutions_4004,
					ClaimClaimSolutionsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getOutgoingFeatureModelFacetLinks_Claim_SubClaims_4005(
			Claim source) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		for (Iterator<?> destinations = source.getSubClaims().iterator(); destinations
				.hasNext();) {
			Claim destination = (Claim) destinations.next();
			result.add(new CazLinkDescriptor(source, destination,
					CazElementTypes.ClaimSubClaims_4005,
					ClaimSubClaimsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getOutgoingFeatureModelFacetLinks_Argument_ArgumentJustification_4006(
			Argument source) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		for (Iterator<?> destinations = source.getArgumentJustification()
				.iterator(); destinations.hasNext();) {
			Justification destination = (Justification) destinations.next();
			result.add(new CazLinkDescriptor(source, destination,
					CazElementTypes.ArgumentArgumentJustification_4006,
					ArgumentArgumentJustificationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getOutgoingFeatureModelFacetLinks_Argument_ArgumentEvidence_4007(
			Argument source) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		for (Iterator<?> destinations = source.getArgumentEvidence().iterator(); destinations
				.hasNext();) {
			Evidence destination = (Evidence) destinations.next();
			result.add(new CazLinkDescriptor(source, destination,
					CazElementTypes.ArgumentArgumentEvidence_4007,
					ArgumentArgumentEvidenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getOutgoingFeatureModelFacetLinks_Argument_ArgumentClaims_4008(
			Argument source) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		for (Iterator<?> destinations = source.getArgumentClaims().iterator(); destinations
				.hasNext();) {
			Claim destination = (Claim) destinations.next();
			result.add(new CazLinkDescriptor(source, destination,
					CazElementTypes.ArgumentArgumentClaims_4008,
					ArgumentArgumentClaimsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getOutgoingFeatureModelFacetLinks_Evidence_EvidenceContexts_4009(
			Evidence source) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		for (Iterator<?> destinations = source.getEvidenceContexts().iterator(); destinations
				.hasNext();) {
			Context destination = (Context) destinations.next();
			result.add(new CazLinkDescriptor(source, destination,
					CazElementTypes.EvidenceEvidenceContexts_4009,
					EvidenceEvidenceContextsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CazLinkDescriptor> getOutgoingFeatureModelFacetLinks_Evidence_Evidence_4010(
			Evidence source) {
		LinkedList<CazLinkDescriptor> result = new LinkedList<CazLinkDescriptor>();
		for (Iterator<?> destinations = source.getEvidence().iterator(); destinations
				.hasNext();) {
			InformationElement destination = (InformationElement) destinations
					.next();
			result.add(new CazLinkDescriptor(source, destination,
					CazElementTypes.EvidenceEvidence_4010,
					EvidenceEvidenceEditPart.VISUAL_ID));
		}
		return result;
	}

}
