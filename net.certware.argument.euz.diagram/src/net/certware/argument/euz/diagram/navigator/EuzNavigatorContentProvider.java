/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

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
import net.certware.argument.euz.diagram.part.EuzVisualIDRegistry;
import net.certware.argument.euz.diagram.part.Messages;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class EuzNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public EuzNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<EuzNavigatorItem> result = new ArrayList<EuzNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews,
							ArgumentDiagramEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof EuzNavigatorGroup) {
			EuzNavigatorGroup group = (EuzNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof EuzNavigatorItem) {
			EuzNavigatorItem navigatorItem = (EuzNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (EuzVisualIDRegistry.getVisualID(view)) {

		case ArgumentArgumentJustificationsEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentJustifications_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentJustifications_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(JustificationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(ArgumentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ArgumentArgumentContextsEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentContexts_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentContexts_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(ContextEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(ArgumentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case StrategyStrategyJustificationsEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_StrategyStrategyJustifications_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_StrategyStrategyJustifications_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(JustificationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(StrategyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case CriteriaEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Node sv = (Node) view;
			EuzNavigatorGroup incominglinks = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_Criteria_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup outgoinglinks = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_Criteria_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentCriteriaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(CriteriaCriteriaContextsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(CriteriaCriteriaAssumptionsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyCriteriaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(SolutionSolutionCriteriaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SolutionSolutionCriteriaEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_SolutionSolutionCriteria_4016_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_SolutionSolutionCriteria_4016_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(CriteriaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(SolutionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case StrategyStrategyStrategiesEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_StrategyStrategyStrategies_4018_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_StrategyStrategyStrategies_4018_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(StrategyEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(StrategyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SolutionSolutionContextsEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_SolutionSolutionContexts_4014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_SolutionSolutionContexts_4014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(ContextEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(SolutionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AssumptionEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Node sv = (Node) view;
			EuzNavigatorGroup incominglinks = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_Assumption_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentAssumptionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ContextContextAssumptionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(CriteriaCriteriaAssumptionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyAssumptionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ArgumentEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Node sv = (Node) view;
			EuzNavigatorGroup outgoinglinks = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_Argument_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup incominglinks = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_Argument_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentStrategiesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentAssumptionsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentContextsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentSolutionsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentCriteriaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentJustificationsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentSubArgumentsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentSubArgumentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyArgumentsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ArgumentArgumentStrategiesEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentStrategies_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentStrategies_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(StrategyEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(ArgumentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ArgumentDiagramEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			EuzNavigatorGroup links = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentDiagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(ArgumentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(SolutionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(EvidenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(StrategyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(AssumptionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(JustificationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(ContextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(CriteriaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentStrategiesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentAssumptionsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentContextsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentSolutionsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentCriteriaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentJustificationsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentSubArgumentsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ContextContextAssumptionsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(CriteriaCriteriaContextsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(CriteriaCriteriaAssumptionsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyArgumentsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyJustificationsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyCriteriaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyAssumptionsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyStrategiesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyContextsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(SolutionSolutionContextsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(SolutionSolutionEvidenceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(SolutionSolutionCriteriaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case ArgumentArgumentAssumptionsEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentAssumptions_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentAssumptions_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(AssumptionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(ArgumentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SolutionEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Node sv = (Node) view;
			EuzNavigatorGroup incominglinks = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_Solution_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup outgoinglinks = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_Solution_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentSolutionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(SolutionSolutionContextsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(SolutionSolutionEvidenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(SolutionSolutionCriteriaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ArgumentArgumentCriteriaEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentCriteria_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentCriteria_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(CriteriaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(ArgumentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case CriteriaCriteriaContextsEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_CriteriaCriteriaContexts_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_CriteriaCriteriaContexts_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(ContextEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(CriteriaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case StrategyStrategyAssumptionsEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_StrategyStrategyAssumptions_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_StrategyStrategyAssumptions_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(AssumptionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(StrategyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case JustificationEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Node sv = (Node) view;
			EuzNavigatorGroup incominglinks = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_Justification_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentJustificationsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyJustificationsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CriteriaCriteriaAssumptionsEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_CriteriaCriteriaAssumptions_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_CriteriaCriteriaAssumptions_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(AssumptionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(CriteriaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case StrategyStrategyCriteriaEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_StrategyStrategyCriteria_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_StrategyStrategyCriteria_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(CriteriaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(StrategyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case StrategyEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Node sv = (Node) view;
			EuzNavigatorGroup incominglinks = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_Strategy_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup outgoinglinks = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_Strategy_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentStrategiesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyArgumentsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyJustificationsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyCriteriaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyAssumptionsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyStrategiesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyStrategiesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyContextsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ContextEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Node sv = (Node) view;
			EuzNavigatorGroup incominglinks = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_Context_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup outgoinglinks = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_Context_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ArgumentArgumentContextsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(ContextContextAssumptionsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(CriteriaCriteriaContextsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(StrategyStrategyContextsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(SolutionSolutionContextsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SolutionSolutionEvidenceEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_SolutionSolutionEvidence_4015_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_SolutionSolutionEvidence_4015_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(EvidenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(SolutionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ArgumentArgumentSolutionsEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentSolutions_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentSolutions_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(SolutionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(ArgumentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case EvidenceEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Node sv = (Node) view;
			EuzNavigatorGroup incominglinks = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_Evidence_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					EuzVisualIDRegistry
							.getType(SolutionSolutionEvidenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case StrategyStrategyContextsEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_StrategyStrategyContexts_4019_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_StrategyStrategyContexts_4019_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(ContextEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(StrategyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ContextContextAssumptionsEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_ContextContextAssumptions_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_ContextContextAssumptions_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(AssumptionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(ContextEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case StrategyStrategyArgumentsEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_StrategyStrategyArguments_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_StrategyStrategyArguments_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(ArgumentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(StrategyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ArgumentSubArgumentsEditPart.VISUAL_ID: {
			LinkedList<EuzAbstractNavigatorItem> result = new LinkedList<EuzAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EuzNavigatorGroup target = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentSubArguments_4017_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EuzNavigatorGroup source = new EuzNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentSubArguments_4017_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(ArgumentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EuzVisualIDRegistry.getType(ArgumentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ArgumentDiagramEditPart.MODEL_ID.equals(EuzVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<EuzNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<EuzNavigatorItem> result = new ArrayList<EuzNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new EuzNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof EuzAbstractNavigatorItem) {
			EuzAbstractNavigatorItem abstractNavigatorItem = (EuzAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
