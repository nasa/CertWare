/*
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.euz.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.certware.argument.euz.Argument;
import net.certware.argument.euz.ArgumentDiagram;
import net.certware.argument.euz.Assumption;
import net.certware.argument.euz.Context;
import net.certware.argument.euz.Criteria;
import net.certware.argument.euz.EuzPackage;
import net.certware.argument.euz.Evidence;
import net.certware.argument.euz.Justification;
import net.certware.argument.euz.Solution;
import net.certware.argument.euz.Strategy;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentCriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentJustificationsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentSolutionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentStrategiesEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentSubArgumentsEditPart;
import net.certware.argument.euz.diagram.edit.parts.AssumptionEditPart;
import net.certware.argument.euz.diagram.edit.parts.ContextContextAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ContextEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaCriteriaAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaCriteriaContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.EvidenceEditPart;
import net.certware.argument.euz.diagram.edit.parts.JustificationEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionCriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionEvidenceEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyArgumentsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyCriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyJustificationsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyStrategiesEditPart;
import net.certware.argument.euz.diagram.providers.EuzElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EuzDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<EuzNodeDescriptor> getSemanticChildren(View view) {
		switch (EuzVisualIDRegistry.getVisualID(view)) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getArgumentDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EuzNodeDescriptor> getArgumentDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ArgumentDiagram modelElement = (ArgumentDiagram) view.getElement();
		LinkedList<EuzNodeDescriptor> result = new LinkedList<EuzNodeDescriptor>();
		for (Iterator<?> it = modelElement.getArguments().iterator(); it
				.hasNext();) {
			Argument childElement = (Argument) it.next();
			int visualID = EuzVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArgumentEditPart.VISUAL_ID) {
				result.add(new EuzNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSolutions().iterator(); it
				.hasNext();) {
			Solution childElement = (Solution) it.next();
			int visualID = EuzVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SolutionEditPart.VISUAL_ID) {
				result.add(new EuzNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEvidence().iterator(); it
				.hasNext();) {
			Evidence childElement = (Evidence) it.next();
			int visualID = EuzVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EvidenceEditPart.VISUAL_ID) {
				result.add(new EuzNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getStrategies().iterator(); it
				.hasNext();) {
			Strategy childElement = (Strategy) it.next();
			int visualID = EuzVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StrategyEditPart.VISUAL_ID) {
				result.add(new EuzNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAssumptions().iterator(); it
				.hasNext();) {
			Assumption childElement = (Assumption) it.next();
			int visualID = EuzVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AssumptionEditPart.VISUAL_ID) {
				result.add(new EuzNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getJustifications().iterator(); it
				.hasNext();) {
			Justification childElement = (Justification) it.next();
			int visualID = EuzVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == JustificationEditPart.VISUAL_ID) {
				result.add(new EuzNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getContexts().iterator(); it
				.hasNext();) {
			Context childElement = (Context) it.next();
			int visualID = EuzVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ContextEditPart.VISUAL_ID) {
				result.add(new EuzNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCriteria().iterator(); it
				.hasNext();) {
			Criteria childElement = (Criteria) it.next();
			int visualID = EuzVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CriteriaEditPart.VISUAL_ID) {
				result.add(new EuzNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getContainedLinks(View view) {
		switch (EuzVisualIDRegistry.getVisualID(view)) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getArgumentDiagram_1000ContainedLinks(view);
		case ArgumentEditPart.VISUAL_ID:
			return getArgument_2001ContainedLinks(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2002ContainedLinks(view);
		case EvidenceEditPart.VISUAL_ID:
			return getEvidence_2003ContainedLinks(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2004ContainedLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2005ContainedLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2006ContainedLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2007ContainedLinks(view);
		case CriteriaEditPart.VISUAL_ID:
			return getCriteria_2008ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getIncomingLinks(View view) {
		switch (EuzVisualIDRegistry.getVisualID(view)) {
		case ArgumentEditPart.VISUAL_ID:
			return getArgument_2001IncomingLinks(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2002IncomingLinks(view);
		case EvidenceEditPart.VISUAL_ID:
			return getEvidence_2003IncomingLinks(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2004IncomingLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2005IncomingLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2006IncomingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2007IncomingLinks(view);
		case CriteriaEditPart.VISUAL_ID:
			return getCriteria_2008IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getOutgoingLinks(View view) {
		switch (EuzVisualIDRegistry.getVisualID(view)) {
		case ArgumentEditPart.VISUAL_ID:
			return getArgument_2001OutgoingLinks(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2002OutgoingLinks(view);
		case EvidenceEditPart.VISUAL_ID:
			return getEvidence_2003OutgoingLinks(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2004OutgoingLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2005OutgoingLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2006OutgoingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2007OutgoingLinks(view);
		case CriteriaEditPart.VISUAL_ID:
			return getCriteria_2008OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getArgumentDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getArgument_2001ContainedLinks(
			View view) {
		Argument modelElement = (Argument) view.getElement();
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentStrategies_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentAssumptions_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentContexts_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentSolutions_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentCriteria_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentJustifications_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_SubArguments_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getSolution_2002ContainedLinks(
			View view) {
		Solution modelElement = (Solution) view.getElement();
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Solution_SolutionContexts_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Solution_SolutionEvidence_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Solution_SolutionCriteria_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getEvidence_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getStrategy_2004ContainedLinks(
			View view) {
		Strategy modelElement = (Strategy) view.getElement();
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_StrategyArguments_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_StrategyJustifications_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_StrategyCriteria_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_StrategyAssumptions_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_StrategyStrategies_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_StrategyContexts_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getAssumption_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getJustification_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getContext_2007ContainedLinks(
			View view) {
		Context modelElement = (Context) view.getElement();
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Context_ContextAssumptions_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getCriteria_2008ContainedLinks(
			View view) {
		Criteria modelElement = (Criteria) view.getElement();
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Criteria_CriteriaContexts_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Criteria_CriteriaAssumptions_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getArgument_2001IncomingLinks(
			View view) {
		Argument modelElement = (Argument) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Argument_SubArguments_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Strategy_StrategyArguments_4010(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getSolution_2002IncomingLinks(
			View view) {
		Solution modelElement = (Solution) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Argument_ArgumentSolutions_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getEvidence_2003IncomingLinks(
			View view) {
		Evidence modelElement = (Evidence) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Solution_SolutionEvidence_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getStrategy_2004IncomingLinks(
			View view) {
		Strategy modelElement = (Strategy) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Argument_ArgumentStrategies_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Strategy_StrategyStrategies_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getAssumption_2005IncomingLinks(
			View view) {
		Assumption modelElement = (Assumption) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Argument_ArgumentAssumptions_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Context_ContextAssumptions_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Criteria_CriteriaAssumptions_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Strategy_StrategyAssumptions_4013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getJustification_2006IncomingLinks(
			View view) {
		Justification modelElement = (Justification) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Argument_ArgumentJustifications_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Strategy_StrategyJustifications_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getContext_2007IncomingLinks(View view) {
		Context modelElement = (Context) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Argument_ArgumentContexts_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Criteria_CriteriaContexts_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Strategy_StrategyContexts_4019(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Solution_SolutionContexts_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getCriteria_2008IncomingLinks(
			View view) {
		Criteria modelElement = (Criteria) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Argument_ArgumentCriteria_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Strategy_StrategyCriteria_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Solution_SolutionCriteria_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getArgument_2001OutgoingLinks(
			View view) {
		Argument modelElement = (Argument) view.getElement();
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentStrategies_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentAssumptions_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentContexts_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentSolutions_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentCriteria_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_ArgumentJustifications_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Argument_SubArguments_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getSolution_2002OutgoingLinks(
			View view) {
		Solution modelElement = (Solution) view.getElement();
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Solution_SolutionContexts_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Solution_SolutionEvidence_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Solution_SolutionCriteria_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getEvidence_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getStrategy_2004OutgoingLinks(
			View view) {
		Strategy modelElement = (Strategy) view.getElement();
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_StrategyArguments_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_StrategyJustifications_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_StrategyCriteria_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_StrategyAssumptions_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_StrategyStrategies_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_StrategyContexts_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getAssumption_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getJustification_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getContext_2007OutgoingLinks(View view) {
		Context modelElement = (Context) view.getElement();
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Context_ContextAssumptions_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EuzLinkDescriptor> getCriteria_2008OutgoingLinks(
			View view) {
		Criteria modelElement = (Criteria) view.getElement();
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Criteria_CriteriaContexts_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Criteria_CriteriaAssumptions_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Argument_ArgumentStrategies_4001(
			Strategy target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getArgument_ArgumentStrategies()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.ArgumentArgumentStrategies_4001,
						ArgumentArgumentStrategiesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Argument_ArgumentAssumptions_4002(
			Assumption target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getArgument_ArgumentAssumptions()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.ArgumentArgumentAssumptions_4002,
						ArgumentArgumentAssumptionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Argument_ArgumentContexts_4003(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getArgument_ArgumentContexts()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.ArgumentArgumentContexts_4003,
						ArgumentArgumentContextsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Argument_ArgumentSolutions_4004(
			Solution target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getArgument_ArgumentSolutions()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.ArgumentArgumentSolutions_4004,
						ArgumentArgumentSolutionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Argument_ArgumentCriteria_4005(
			Criteria target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getArgument_ArgumentCriteria()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.ArgumentArgumentCriteria_4005,
						ArgumentArgumentCriteriaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Argument_ArgumentJustifications_4006(
			Justification target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getArgument_ArgumentJustifications()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.ArgumentArgumentJustifications_4006,
						ArgumentArgumentJustificationsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Argument_SubArguments_4017(
			Argument target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getArgument_SubArguments()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.ArgumentSubArguments_4017,
						ArgumentSubArgumentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Context_ContextAssumptions_4007(
			Assumption target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getContext_ContextAssumptions()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.ContextContextAssumptions_4007,
						ContextContextAssumptionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Criteria_CriteriaContexts_4008(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getCriteria_CriteriaContexts()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.CriteriaCriteriaContexts_4008,
						CriteriaCriteriaContextsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Criteria_CriteriaAssumptions_4009(
			Assumption target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getCriteria_CriteriaAssumptions()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.CriteriaCriteriaAssumptions_4009,
						CriteriaCriteriaAssumptionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Strategy_StrategyArguments_4010(
			Argument target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getStrategy_StrategyArguments()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.StrategyStrategyArguments_4010,
						StrategyStrategyArgumentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Strategy_StrategyJustifications_4011(
			Justification target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getStrategy_StrategyJustifications()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.StrategyStrategyJustifications_4011,
						StrategyStrategyJustificationsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Strategy_StrategyCriteria_4012(
			Criteria target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getStrategy_StrategyCriteria()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.StrategyStrategyCriteria_4012,
						StrategyStrategyCriteriaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Strategy_StrategyAssumptions_4013(
			Assumption target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getStrategy_StrategyAssumptions()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.StrategyStrategyAssumptions_4013,
						StrategyStrategyAssumptionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Strategy_StrategyStrategies_4018(
			Strategy target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getStrategy_StrategyStrategies()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.StrategyStrategyStrategies_4018,
						StrategyStrategyStrategiesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Strategy_StrategyContexts_4019(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getStrategy_StrategyContexts()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.StrategyStrategyContexts_4019,
						StrategyStrategyContextsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Solution_SolutionContexts_4014(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getSolution_SolutionContexts()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.SolutionSolutionContexts_4014,
						SolutionSolutionContextsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Solution_SolutionEvidence_4015(
			Evidence target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getSolution_SolutionEvidence()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.SolutionSolutionEvidence_4015,
						SolutionSolutionEvidenceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getIncomingFeatureModelFacetLinks_Solution_SolutionCriteria_4016(
			Criteria target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == EuzPackage.eINSTANCE
					.getSolution_SolutionCriteria()) {
				result.add(new EuzLinkDescriptor(setting.getEObject(), target,
						EuzElementTypes.SolutionSolutionCriteria_4016,
						SolutionSolutionCriteriaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Argument_ArgumentStrategies_4001(
			Argument source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getArgumentStrategies()
				.iterator(); destinations.hasNext();) {
			Strategy destination = (Strategy) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.ArgumentArgumentStrategies_4001,
					ArgumentArgumentStrategiesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Argument_ArgumentAssumptions_4002(
			Argument source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getArgumentAssumptions()
				.iterator(); destinations.hasNext();) {
			Assumption destination = (Assumption) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.ArgumentArgumentAssumptions_4002,
					ArgumentArgumentAssumptionsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Argument_ArgumentContexts_4003(
			Argument source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getArgumentContexts().iterator(); destinations
				.hasNext();) {
			Context destination = (Context) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.ArgumentArgumentContexts_4003,
					ArgumentArgumentContextsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Argument_ArgumentSolutions_4004(
			Argument source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getArgumentSolutions()
				.iterator(); destinations.hasNext();) {
			Solution destination = (Solution) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.ArgumentArgumentSolutions_4004,
					ArgumentArgumentSolutionsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Argument_ArgumentCriteria_4005(
			Argument source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getArgumentCriteria().iterator(); destinations
				.hasNext();) {
			Criteria destination = (Criteria) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.ArgumentArgumentCriteria_4005,
					ArgumentArgumentCriteriaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Argument_ArgumentJustifications_4006(
			Argument source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getArgumentJustifications()
				.iterator(); destinations.hasNext();) {
			Justification destination = (Justification) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.ArgumentArgumentJustifications_4006,
					ArgumentArgumentJustificationsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Argument_SubArguments_4017(
			Argument source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getSubArguments().iterator(); destinations
				.hasNext();) {
			Argument destination = (Argument) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.ArgumentSubArguments_4017,
					ArgumentSubArgumentsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Context_ContextAssumptions_4007(
			Context source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getContextAssumptions()
				.iterator(); destinations.hasNext();) {
			Assumption destination = (Assumption) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.ContextContextAssumptions_4007,
					ContextContextAssumptionsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Criteria_CriteriaContexts_4008(
			Criteria source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getCriteriaContexts().iterator(); destinations
				.hasNext();) {
			Context destination = (Context) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.CriteriaCriteriaContexts_4008,
					CriteriaCriteriaContextsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Criteria_CriteriaAssumptions_4009(
			Criteria source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getCriteriaAssumptions()
				.iterator(); destinations.hasNext();) {
			Assumption destination = (Assumption) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.CriteriaCriteriaAssumptions_4009,
					CriteriaCriteriaAssumptionsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Strategy_StrategyArguments_4010(
			Strategy source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getStrategyArguments()
				.iterator(); destinations.hasNext();) {
			Argument destination = (Argument) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.StrategyStrategyArguments_4010,
					StrategyStrategyArgumentsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Strategy_StrategyJustifications_4011(
			Strategy source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getStrategyJustifications()
				.iterator(); destinations.hasNext();) {
			Justification destination = (Justification) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.StrategyStrategyJustifications_4011,
					StrategyStrategyJustificationsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Strategy_StrategyCriteria_4012(
			Strategy source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getStrategyCriteria().iterator(); destinations
				.hasNext();) {
			Criteria destination = (Criteria) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.StrategyStrategyCriteria_4012,
					StrategyStrategyCriteriaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Strategy_StrategyAssumptions_4013(
			Strategy source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getStrategyAssumptions()
				.iterator(); destinations.hasNext();) {
			Assumption destination = (Assumption) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.StrategyStrategyAssumptions_4013,
					StrategyStrategyAssumptionsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Strategy_StrategyStrategies_4018(
			Strategy source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getStrategyStrategies()
				.iterator(); destinations.hasNext();) {
			Strategy destination = (Strategy) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.StrategyStrategyStrategies_4018,
					StrategyStrategyStrategiesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Strategy_StrategyContexts_4019(
			Strategy source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getStrategyContexts().iterator(); destinations
				.hasNext();) {
			Context destination = (Context) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.StrategyStrategyContexts_4019,
					StrategyStrategyContextsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Solution_SolutionContexts_4014(
			Solution source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getSolutionContexts().iterator(); destinations
				.hasNext();) {
			Context destination = (Context) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.SolutionSolutionContexts_4014,
					SolutionSolutionContextsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Solution_SolutionEvidence_4015(
			Solution source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getSolutionEvidence().iterator(); destinations
				.hasNext();) {
			Evidence destination = (Evidence) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.SolutionSolutionEvidence_4015,
					SolutionSolutionEvidenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EuzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Solution_SolutionCriteria_4016(
			Solution source) {
		LinkedList<EuzLinkDescriptor> result = new LinkedList<EuzLinkDescriptor>();
		for (Iterator<?> destinations = source.getSolutionCriteria().iterator(); destinations
				.hasNext();) {
			Criteria destination = (Criteria) destinations.next();
			result.add(new EuzLinkDescriptor(source, destination,
					EuzElementTypes.SolutionSolutionCriteria_4016,
					SolutionSolutionCriteriaEditPart.VISUAL_ID));
		}
		return result;
	}

}
