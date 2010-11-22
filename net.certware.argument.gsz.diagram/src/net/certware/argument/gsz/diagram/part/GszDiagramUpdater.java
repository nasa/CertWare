package net.certware.argument.gsz.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.certware.argument.gsz.ArgumentDiagram;
import net.certware.argument.gsz.Assumption;
import net.certware.argument.gsz.Context;
import net.certware.argument.gsz.Evidence;
import net.certware.argument.gsz.Goal;
import net.certware.argument.gsz.GszPackage;
import net.certware.argument.gsz.Justification;
import net.certware.argument.gsz.Solution;
import net.certware.argument.gsz.Strategy;
import net.certware.argument.gsz.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.gsz.diagram.edit.parts.AssumptionEditPart;
import net.certware.argument.gsz.diagram.edit.parts.ContextEditPart;
import net.certware.argument.gsz.diagram.edit.parts.EvidenceEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalAssumptionsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalGoalContextsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalGoalSolutionsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalStrategiesEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalSubGoalsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.JustificationEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionSolutionContextsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionSolutionEvidenceEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyGoalsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyJustificationsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyStrategyContextsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyStrategySolutionsEditPart;
import net.certware.argument.gsz.diagram.providers.GszElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GszDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<GszNodeDescriptor> getSemanticChildren(View view) {
		switch (GszVisualIDRegistry.getVisualID(view)) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getArgumentDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GszNodeDescriptor> getArgumentDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ArgumentDiagram modelElement = (ArgumentDiagram) view.getElement();
		LinkedList<GszNodeDescriptor> result = new LinkedList<GszNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGoals().iterator(); it.hasNext();) {
			Goal childElement = (Goal) it.next();
			int visualID = GszVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == GoalEditPart.VISUAL_ID) {
				result.add(new GszNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSolutions().iterator(); it
				.hasNext();) {
			Solution childElement = (Solution) it.next();
			int visualID = GszVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SolutionEditPart.VISUAL_ID) {
				result.add(new GszNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEvidence().iterator(); it
				.hasNext();) {
			Evidence childElement = (Evidence) it.next();
			int visualID = GszVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EvidenceEditPart.VISUAL_ID) {
				result.add(new GszNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getStrategies().iterator(); it
				.hasNext();) {
			Strategy childElement = (Strategy) it.next();
			int visualID = GszVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StrategyEditPart.VISUAL_ID) {
				result.add(new GszNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getJustifications().iterator(); it
				.hasNext();) {
			Justification childElement = (Justification) it.next();
			int visualID = GszVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == JustificationEditPart.VISUAL_ID) {
				result.add(new GszNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getContexts().iterator(); it
				.hasNext();) {
			Context childElement = (Context) it.next();
			int visualID = GszVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ContextEditPart.VISUAL_ID) {
				result.add(new GszNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAssumptions().iterator(); it
				.hasNext();) {
			Assumption childElement = (Assumption) it.next();
			int visualID = GszVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AssumptionEditPart.VISUAL_ID) {
				result.add(new GszNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getContainedLinks(View view) {
		switch (GszVisualIDRegistry.getVisualID(view)) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getArgumentDiagram_1000ContainedLinks(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2001ContainedLinks(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2002ContainedLinks(view);
		case EvidenceEditPart.VISUAL_ID:
			return getEvidence_2003ContainedLinks(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2004ContainedLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2005ContainedLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2006ContainedLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2007ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getIncomingLinks(View view) {
		switch (GszVisualIDRegistry.getVisualID(view)) {
		case GoalEditPart.VISUAL_ID:
			return getGoal_2001IncomingLinks(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2002IncomingLinks(view);
		case EvidenceEditPart.VISUAL_ID:
			return getEvidence_2003IncomingLinks(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2004IncomingLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2005IncomingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2006IncomingLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2007IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getOutgoingLinks(View view) {
		switch (GszVisualIDRegistry.getVisualID(view)) {
		case GoalEditPart.VISUAL_ID:
			return getGoal_2001OutgoingLinks(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2002OutgoingLinks(view);
		case EvidenceEditPart.VISUAL_ID:
			return getEvidence_2003OutgoingLinks(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2004OutgoingLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2005OutgoingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2006OutgoingLinks(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2007OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getArgumentDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getGoal_2001ContainedLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_SubGoals_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_Strategies_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_GoalContexts_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_Assumptions_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_GoalSolutions_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getSolution_2002ContainedLinks(
			View view) {
		Solution modelElement = (Solution) view.getElement();
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Solution_SolutionEvidence_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Solution_SolutionContexts_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getEvidence_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getStrategy_2004ContainedLinks(
			View view) {
		Strategy modelElement = (Strategy) view.getElement();
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_Goals_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_Justifications_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_StrategyContexts_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_StrategySolutions_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getJustification_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getContext_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getAssumption_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getGoal_2001IncomingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_SubGoals_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Strategy_Goals_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getSolution_2002IncomingLinks(
			View view) {
		Solution modelElement = (Solution) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_GoalSolutions_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Strategy_StrategySolutions_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getEvidence_2003IncomingLinks(
			View view) {
		Evidence modelElement = (Evidence) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Solution_SolutionEvidence_4010(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getStrategy_2004IncomingLinks(
			View view) {
		Strategy modelElement = (Strategy) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_Strategies_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getJustification_2005IncomingLinks(
			View view) {
		Justification modelElement = (Justification) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Strategy_Justifications_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getContext_2006IncomingLinks(View view) {
		Context modelElement = (Context) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_GoalContexts_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Strategy_StrategyContexts_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Solution_SolutionContexts_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getAssumption_2007IncomingLinks(
			View view) {
		Assumption modelElement = (Assumption) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Goal_Assumptions_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getGoal_2001OutgoingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_SubGoals_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_Strategies_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_GoalContexts_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_Assumptions_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Goal_GoalSolutions_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getSolution_2002OutgoingLinks(
			View view) {
		Solution modelElement = (Solution) view.getElement();
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Solution_SolutionEvidence_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Solution_SolutionContexts_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getEvidence_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getStrategy_2004OutgoingLinks(
			View view) {
		Strategy modelElement = (Strategy) view.getElement();
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_Goals_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_Justifications_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_StrategyContexts_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Strategy_StrategySolutions_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getJustification_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getContext_2006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GszLinkDescriptor> getAssumption_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getIncomingFeatureModelFacetLinks_Goal_SubGoals_4001(
			Goal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GszPackage.eINSTANCE
					.getGoal_SubGoals()) {
				result.add(new GszLinkDescriptor(setting.getEObject(), target,
						GszElementTypes.GoalSubGoals_4001,
						GoalSubGoalsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getIncomingFeatureModelFacetLinks_Goal_Strategies_4002(
			Strategy target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GszPackage.eINSTANCE
					.getGoal_Strategies()) {
				result.add(new GszLinkDescriptor(setting.getEObject(), target,
						GszElementTypes.GoalStrategies_4002,
						GoalStrategiesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getIncomingFeatureModelFacetLinks_Goal_GoalContexts_4003(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GszPackage.eINSTANCE
					.getGoal_GoalContexts()) {
				result.add(new GszLinkDescriptor(setting.getEObject(), target,
						GszElementTypes.GoalGoalContexts_4003,
						GoalGoalContextsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getIncomingFeatureModelFacetLinks_Goal_Assumptions_4004(
			Assumption target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GszPackage.eINSTANCE
					.getGoal_Assumptions()) {
				result.add(new GszLinkDescriptor(setting.getEObject(), target,
						GszElementTypes.GoalAssumptions_4004,
						GoalAssumptionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getIncomingFeatureModelFacetLinks_Goal_GoalSolutions_4005(
			Solution target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GszPackage.eINSTANCE
					.getGoal_GoalSolutions()) {
				result.add(new GszLinkDescriptor(setting.getEObject(), target,
						GszElementTypes.GoalGoalSolutions_4005,
						GoalGoalSolutionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getIncomingFeatureModelFacetLinks_Strategy_Goals_4006(
			Goal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GszPackage.eINSTANCE
					.getStrategy_Goals()) {
				result.add(new GszLinkDescriptor(setting.getEObject(), target,
						GszElementTypes.StrategyGoals_4006,
						StrategyGoalsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getIncomingFeatureModelFacetLinks_Strategy_Justifications_4007(
			Justification target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GszPackage.eINSTANCE
					.getStrategy_Justifications()) {
				result.add(new GszLinkDescriptor(setting.getEObject(), target,
						GszElementTypes.StrategyJustifications_4007,
						StrategyJustificationsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getIncomingFeatureModelFacetLinks_Strategy_StrategyContexts_4008(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GszPackage.eINSTANCE
					.getStrategy_StrategyContexts()) {
				result.add(new GszLinkDescriptor(setting.getEObject(), target,
						GszElementTypes.StrategyStrategyContexts_4008,
						StrategyStrategyContextsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getIncomingFeatureModelFacetLinks_Strategy_StrategySolutions_4009(
			Solution target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GszPackage.eINSTANCE
					.getStrategy_StrategySolutions()) {
				result.add(new GszLinkDescriptor(setting.getEObject(), target,
						GszElementTypes.StrategyStrategySolutions_4009,
						StrategyStrategySolutionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getIncomingFeatureModelFacetLinks_Solution_SolutionEvidence_4010(
			Evidence target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GszPackage.eINSTANCE
					.getSolution_SolutionEvidence()) {
				result.add(new GszLinkDescriptor(setting.getEObject(), target,
						GszElementTypes.SolutionSolutionEvidence_4010,
						SolutionSolutionEvidenceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getIncomingFeatureModelFacetLinks_Solution_SolutionContexts_4011(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GszPackage.eINSTANCE
					.getSolution_SolutionContexts()) {
				result.add(new GszLinkDescriptor(setting.getEObject(), target,
						GszElementTypes.SolutionSolutionContexts_4011,
						SolutionSolutionContextsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getOutgoingFeatureModelFacetLinks_Goal_SubGoals_4001(
			Goal source) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		for (Iterator<?> destinations = source.getSubGoals().iterator(); destinations
				.hasNext();) {
			Goal destination = (Goal) destinations.next();
			result.add(new GszLinkDescriptor(source, destination,
					GszElementTypes.GoalSubGoals_4001,
					GoalSubGoalsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getOutgoingFeatureModelFacetLinks_Goal_Strategies_4002(
			Goal source) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		for (Iterator<?> destinations = source.getStrategies().iterator(); destinations
				.hasNext();) {
			Strategy destination = (Strategy) destinations.next();
			result.add(new GszLinkDescriptor(source, destination,
					GszElementTypes.GoalStrategies_4002,
					GoalStrategiesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getOutgoingFeatureModelFacetLinks_Goal_GoalContexts_4003(
			Goal source) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		for (Iterator<?> destinations = source.getGoalContexts().iterator(); destinations
				.hasNext();) {
			Context destination = (Context) destinations.next();
			result.add(new GszLinkDescriptor(source, destination,
					GszElementTypes.GoalGoalContexts_4003,
					GoalGoalContextsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getOutgoingFeatureModelFacetLinks_Goal_Assumptions_4004(
			Goal source) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		for (Iterator<?> destinations = source.getAssumptions().iterator(); destinations
				.hasNext();) {
			Assumption destination = (Assumption) destinations.next();
			result.add(new GszLinkDescriptor(source, destination,
					GszElementTypes.GoalAssumptions_4004,
					GoalAssumptionsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getOutgoingFeatureModelFacetLinks_Goal_GoalSolutions_4005(
			Goal source) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		for (Iterator<?> destinations = source.getGoalSolutions().iterator(); destinations
				.hasNext();) {
			Solution destination = (Solution) destinations.next();
			result.add(new GszLinkDescriptor(source, destination,
					GszElementTypes.GoalGoalSolutions_4005,
					GoalGoalSolutionsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getOutgoingFeatureModelFacetLinks_Strategy_Goals_4006(
			Strategy source) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		for (Iterator<?> destinations = source.getGoals().iterator(); destinations
				.hasNext();) {
			Goal destination = (Goal) destinations.next();
			result.add(new GszLinkDescriptor(source, destination,
					GszElementTypes.StrategyGoals_4006,
					StrategyGoalsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getOutgoingFeatureModelFacetLinks_Strategy_Justifications_4007(
			Strategy source) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		for (Iterator<?> destinations = source.getJustifications().iterator(); destinations
				.hasNext();) {
			Justification destination = (Justification) destinations.next();
			result.add(new GszLinkDescriptor(source, destination,
					GszElementTypes.StrategyJustifications_4007,
					StrategyJustificationsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getOutgoingFeatureModelFacetLinks_Strategy_StrategyContexts_4008(
			Strategy source) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		for (Iterator<?> destinations = source.getStrategyContexts().iterator(); destinations
				.hasNext();) {
			Context destination = (Context) destinations.next();
			result.add(new GszLinkDescriptor(source, destination,
					GszElementTypes.StrategyStrategyContexts_4008,
					StrategyStrategyContextsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getOutgoingFeatureModelFacetLinks_Strategy_StrategySolutions_4009(
			Strategy source) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		for (Iterator<?> destinations = source.getStrategySolutions()
				.iterator(); destinations.hasNext();) {
			Solution destination = (Solution) destinations.next();
			result.add(new GszLinkDescriptor(source, destination,
					GszElementTypes.StrategyStrategySolutions_4009,
					StrategyStrategySolutionsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getOutgoingFeatureModelFacetLinks_Solution_SolutionEvidence_4010(
			Solution source) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		for (Iterator<?> destinations = source.getSolutionEvidence().iterator(); destinations
				.hasNext();) {
			Evidence destination = (Evidence) destinations.next();
			result.add(new GszLinkDescriptor(source, destination,
					GszElementTypes.SolutionSolutionEvidence_4010,
					SolutionSolutionEvidenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GszLinkDescriptor> getOutgoingFeatureModelFacetLinks_Solution_SolutionContexts_4011(
			Solution source) {
		LinkedList<GszLinkDescriptor> result = new LinkedList<GszLinkDescriptor>();
		for (Iterator<?> destinations = source.getSolutionContexts().iterator(); destinations
				.hasNext();) {
			Context destination = (Context) destinations.next();
			result.add(new GszLinkDescriptor(source, destination,
					GszElementTypes.SolutionSolutionContexts_4011,
					SolutionSolutionContextsEditPart.VISUAL_ID));
		}
		return result;
	}

}
