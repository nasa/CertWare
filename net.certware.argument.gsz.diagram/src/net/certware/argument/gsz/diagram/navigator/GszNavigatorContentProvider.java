package net.certware.argument.gsz.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

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
import net.certware.argument.gsz.diagram.part.GszVisualIDRegistry;
import net.certware.argument.gsz.diagram.part.Messages;

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
public class GszNavigatorContentProvider implements ICommonContentProvider {

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
	public GszNavigatorContentProvider() {
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
			ArrayList<GszNavigatorItem> result = new ArrayList<GszNavigatorItem>();
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

		if (parentElement instanceof GszNavigatorGroup) {
			GszNavigatorGroup group = (GszNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof GszNavigatorItem) {
			GszNavigatorItem navigatorItem = (GszNavigatorItem) parentElement;
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
		switch (GszVisualIDRegistry.getVisualID(view)) {

		case EvidenceEditPart.VISUAL_ID: {
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Node sv = (Node) view;
			GszNavigatorGroup incominglinks = new GszNavigatorGroup(
					Messages.NavigatorGroupName_Evidence_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(SolutionSolutionEvidenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ArgumentDiagramEditPart.VISUAL_ID: {
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			GszNavigatorGroup links = new GszNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentDiagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(SolutionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(EvidenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(StrategyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(JustificationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(ContextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(AssumptionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(GoalSubGoalsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(GoalStrategiesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(GoalGoalContextsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(GoalAssumptionsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(GoalGoalSolutionsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(StrategyGoalsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(StrategyJustificationsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(StrategyStrategyContextsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(StrategyStrategySolutionsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(SolutionSolutionEvidenceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(SolutionSolutionContextsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case GoalEditPart.VISUAL_ID: {
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Node sv = (Node) view;
			GszNavigatorGroup incominglinks = new GszNavigatorGroup(
					Messages.NavigatorGroupName_Goal_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GszNavigatorGroup outgoinglinks = new GszNavigatorGroup(
					Messages.NavigatorGroupName_Goal_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(GoalSubGoalsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(GoalSubGoalsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(GoalStrategiesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(GoalGoalContextsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(GoalAssumptionsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(GoalGoalSolutionsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(StrategyGoalsEditPart.VISUAL_ID));
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

		case GoalGoalSolutionsEditPart.VISUAL_ID: {
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			GszNavigatorGroup target = new GszNavigatorGroup(
					Messages.NavigatorGroupName_GoalGoalSolutions_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GszNavigatorGroup source = new GszNavigatorGroup(
					Messages.NavigatorGroupName_GoalGoalSolutions_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(SolutionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
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
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Node sv = (Node) view;
			GszNavigatorGroup incominglinks = new GszNavigatorGroup(
					Messages.NavigatorGroupName_Justification_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(StrategyJustificationsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SolutionSolutionEvidenceEditPart.VISUAL_ID: {
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			GszNavigatorGroup target = new GszNavigatorGroup(
					Messages.NavigatorGroupName_SolutionSolutionEvidence_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GszNavigatorGroup source = new GszNavigatorGroup(
					Messages.NavigatorGroupName_SolutionSolutionEvidence_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(EvidenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(SolutionEditPart.VISUAL_ID));
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

		case GoalAssumptionsEditPart.VISUAL_ID: {
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			GszNavigatorGroup target = new GszNavigatorGroup(
					Messages.NavigatorGroupName_GoalAssumptions_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GszNavigatorGroup source = new GszNavigatorGroup(
					Messages.NavigatorGroupName_GoalAssumptions_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(AssumptionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
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
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Node sv = (Node) view;
			GszNavigatorGroup incominglinks = new GszNavigatorGroup(
					Messages.NavigatorGroupName_Solution_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GszNavigatorGroup outgoinglinks = new GszNavigatorGroup(
					Messages.NavigatorGroupName_Solution_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(GoalGoalSolutionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(StrategyStrategySolutionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(SolutionSolutionEvidenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(SolutionSolutionContextsEditPart.VISUAL_ID));
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

		case AssumptionEditPart.VISUAL_ID: {
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Node sv = (Node) view;
			GszNavigatorGroup incominglinks = new GszNavigatorGroup(
					Messages.NavigatorGroupName_Assumption_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(GoalAssumptionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case StrategyStrategyContextsEditPart.VISUAL_ID: {
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			GszNavigatorGroup target = new GszNavigatorGroup(
					Messages.NavigatorGroupName_StrategyStrategyContexts_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GszNavigatorGroup source = new GszNavigatorGroup(
					Messages.NavigatorGroupName_StrategyStrategyContexts_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(ContextEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(StrategyEditPart.VISUAL_ID));
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

		case StrategyStrategySolutionsEditPart.VISUAL_ID: {
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			GszNavigatorGroup target = new GszNavigatorGroup(
					Messages.NavigatorGroupName_StrategyStrategySolutions_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GszNavigatorGroup source = new GszNavigatorGroup(
					Messages.NavigatorGroupName_StrategyStrategySolutions_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(SolutionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(StrategyEditPart.VISUAL_ID));
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

		case StrategyJustificationsEditPart.VISUAL_ID: {
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			GszNavigatorGroup target = new GszNavigatorGroup(
					Messages.NavigatorGroupName_StrategyJustifications_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GszNavigatorGroup source = new GszNavigatorGroup(
					Messages.NavigatorGroupName_StrategyJustifications_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(JustificationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(StrategyEditPart.VISUAL_ID));
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
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			GszNavigatorGroup target = new GszNavigatorGroup(
					Messages.NavigatorGroupName_SolutionSolutionContexts_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GszNavigatorGroup source = new GszNavigatorGroup(
					Messages.NavigatorGroupName_SolutionSolutionContexts_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(ContextEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(SolutionEditPart.VISUAL_ID));
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

		case ContextEditPart.VISUAL_ID: {
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Node sv = (Node) view;
			GszNavigatorGroup incominglinks = new GszNavigatorGroup(
					Messages.NavigatorGroupName_Context_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(GoalGoalContextsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(StrategyStrategyContextsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(SolutionSolutionContextsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case StrategyEditPart.VISUAL_ID: {
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Node sv = (Node) view;
			GszNavigatorGroup incominglinks = new GszNavigatorGroup(
					Messages.NavigatorGroupName_Strategy_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GszNavigatorGroup outgoinglinks = new GszNavigatorGroup(
					Messages.NavigatorGroupName_Strategy_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(GoalStrategiesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(StrategyGoalsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(StrategyJustificationsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(StrategyStrategyContextsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					GszVisualIDRegistry
							.getType(StrategyStrategySolutionsEditPart.VISUAL_ID));
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

		case StrategyGoalsEditPart.VISUAL_ID: {
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			GszNavigatorGroup target = new GszNavigatorGroup(
					Messages.NavigatorGroupName_StrategyGoals_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GszNavigatorGroup source = new GszNavigatorGroup(
					Messages.NavigatorGroupName_StrategyGoals_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(StrategyEditPart.VISUAL_ID));
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

		case GoalGoalContextsEditPart.VISUAL_ID: {
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			GszNavigatorGroup target = new GszNavigatorGroup(
					Messages.NavigatorGroupName_GoalGoalContexts_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GszNavigatorGroup source = new GszNavigatorGroup(
					Messages.NavigatorGroupName_GoalGoalContexts_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(ContextEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
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

		case GoalStrategiesEditPart.VISUAL_ID: {
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			GszNavigatorGroup target = new GszNavigatorGroup(
					Messages.NavigatorGroupName_GoalStrategies_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GszNavigatorGroup source = new GszNavigatorGroup(
					Messages.NavigatorGroupName_GoalStrategies_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(StrategyEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
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

		case GoalSubGoalsEditPart.VISUAL_ID: {
			LinkedList<GszAbstractNavigatorItem> result = new LinkedList<GszAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			GszNavigatorGroup target = new GszNavigatorGroup(
					Messages.NavigatorGroupName_GoalSubGoals_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GszNavigatorGroup source = new GszNavigatorGroup(
					Messages.NavigatorGroupName_GoalSubGoals_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					GszVisualIDRegistry.getType(GoalEditPart.VISUAL_ID));
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
		return ArgumentDiagramEditPart.MODEL_ID.equals(GszVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<GszNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<GszNavigatorItem> result = new ArrayList<GszNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new GszNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof GszAbstractNavigatorItem) {
			GszAbstractNavigatorItem abstractNavigatorItem = (GszAbstractNavigatorItem) element;
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
