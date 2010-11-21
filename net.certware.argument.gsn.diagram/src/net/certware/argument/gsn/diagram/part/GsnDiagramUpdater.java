/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.gsn.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.certware.argument.gsn.ArgumentDiagram;
import net.certware.argument.gsn.Goal;
import net.certware.argument.gsn.GsnPackage;
import net.certware.argument.gsn.Justification;
import net.certware.argument.gsn.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.gsn.diagram.edit.parts.GoalEditPart;
import net.certware.argument.gsn.diagram.edit.parts.JustificationEditPart;
import net.certware.argument.gsn.diagram.edit.parts.StrategyGoalEditPart;
import net.certware.argument.gsn.diagram.edit.parts.StrategyJustificationEditPart;
import net.certware.argument.gsn.diagram.providers.GsnElementTypes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GsnDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<GsnNodeDescriptor> getSemanticChildren(View view) {
		switch (GsnVisualIDRegistry.getVisualID(view)) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getArgumentDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnNodeDescriptor> getArgumentDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ArgumentDiagram modelElement = (ArgumentDiagram) view.getElement();
		LinkedList<GsnNodeDescriptor> result = new LinkedList<GsnNodeDescriptor>();
		Resource resource = modelElement.eResource();
		for (EObject childElement : getPhantomNodesIterator(resource)) {
			if (childElement == modelElement) {
				continue;
			}
			if (GsnVisualIDRegistry.getNodeVisualID(view, childElement) == GoalEditPart.VISUAL_ID) {
				result.add(new GsnNodeDescriptor(childElement,
						GoalEditPart.VISUAL_ID));
				continue;
			}
			if (GsnVisualIDRegistry.getNodeVisualID(view, childElement) == JustificationEditPart.VISUAL_ID) {
				result.add(new GsnNodeDescriptor(childElement,
						JustificationEditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static EList<EObject> getPhantomNodesIterator(Resource resource) {
		// return resource.getAllContents();
		return resource.getContents();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getContainedLinks(View view) {
		switch (GsnVisualIDRegistry.getVisualID(view)) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getArgumentDiagram_1000ContainedLinks(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2009ContainedLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2008ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getIncomingLinks(View view) {
		switch (GsnVisualIDRegistry.getVisualID(view)) {
		case GoalEditPart.VISUAL_ID:
			return getGoal_2009IncomingLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2008IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getOutgoingLinks(View view) {
		switch (GsnVisualIDRegistry.getVisualID(view)) {
		case GoalEditPart.VISUAL_ID:
			return getGoal_2009OutgoingLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2008OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getArgumentDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getGoal_2009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getJustification_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getGoal_2009IncomingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Strategy_Goal_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getJustification_2008IncomingLinks(
			View view) {
		Justification modelElement = (Justification) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Strategy_Justification_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getGoal_2009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GsnLinkDescriptor> getJustification_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<GsnLinkDescriptor> getIncomingFeatureModelFacetLinks_Strategy_Goal_4002(
			Goal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GsnPackage.eINSTANCE
					.getStrategy_Goal()) {
				result.add(new GsnLinkDescriptor(setting.getEObject(), target,
						GsnElementTypes.StrategyGoal_4002,
						StrategyGoalEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GsnLinkDescriptor> getIncomingFeatureModelFacetLinks_Strategy_Justification_4001(
			Justification target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GsnLinkDescriptor> result = new LinkedList<GsnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GsnPackage.eINSTANCE
					.getStrategy_Justification()) {
				result.add(new GsnLinkDescriptor(setting.getEObject(), target,
						GsnElementTypes.StrategyJustification_4001,
						StrategyJustificationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

}
