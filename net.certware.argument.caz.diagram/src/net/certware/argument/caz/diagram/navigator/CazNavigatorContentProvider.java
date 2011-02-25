package net.certware.argument.caz.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

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
import net.certware.argument.caz.diagram.part.CazVisualIDRegistry;
import net.certware.argument.caz.diagram.part.Messages;

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
public class CazNavigatorContentProvider implements ICommonContentProvider {

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
	public CazNavigatorContentProvider() {
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
			ArrayList<CazNavigatorItem> result = new ArrayList<CazNavigatorItem>();
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

		if (parentElement instanceof CazNavigatorGroup) {
			CazNavigatorGroup group = (CazNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof CazNavigatorItem) {
			CazNavigatorItem navigatorItem = (CazNavigatorItem) parentElement;
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
		switch (CazVisualIDRegistry.getVisualID(view)) {

		case ClaimClaimStrategiesEditPart.VISUAL_ID: {
			LinkedList<CazAbstractNavigatorItem> result = new LinkedList<CazAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			CazNavigatorGroup target = new CazNavigatorGroup(
					Messages.NavigatorGroupName_ClaimClaimStrategies_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CazNavigatorGroup source = new CazNavigatorGroup(
					Messages.NavigatorGroupName_ClaimClaimStrategies_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(ArgumentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(ClaimEditPart.VISUAL_ID));
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

		case ArgumentEditPart.VISUAL_ID: {
			LinkedList<CazAbstractNavigatorItem> result = new LinkedList<CazAbstractNavigatorItem>();
			Node sv = (Node) view;
			CazNavigatorGroup incominglinks = new CazNavigatorGroup(
					Messages.NavigatorGroupName_Argument_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CazNavigatorGroup outgoinglinks = new CazNavigatorGroup(
					Messages.NavigatorGroupName_Argument_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ClaimClaimStrategiesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ArgumentArgumentJustificationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ArgumentArgumentEvidenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ArgumentArgumentClaimsEditPart.VISUAL_ID));
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

		case ClaimClaimSolutionsEditPart.VISUAL_ID: {
			LinkedList<CazAbstractNavigatorItem> result = new LinkedList<CazAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			CazNavigatorGroup target = new CazNavigatorGroup(
					Messages.NavigatorGroupName_ClaimClaimSolutions_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CazNavigatorGroup source = new CazNavigatorGroup(
					Messages.NavigatorGroupName_ClaimClaimSolutions_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(EvidenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(ClaimEditPart.VISUAL_ID));
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

		case ClaimSubClaimsEditPart.VISUAL_ID: {
			LinkedList<CazAbstractNavigatorItem> result = new LinkedList<CazAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			CazNavigatorGroup target = new CazNavigatorGroup(
					Messages.NavigatorGroupName_ClaimSubClaims_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CazNavigatorGroup source = new CazNavigatorGroup(
					Messages.NavigatorGroupName_ClaimSubClaims_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(ClaimEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(ClaimEditPart.VISUAL_ID));
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

		case ArgumentArgumentClaimsEditPart.VISUAL_ID: {
			LinkedList<CazAbstractNavigatorItem> result = new LinkedList<CazAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			CazNavigatorGroup target = new CazNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentClaims_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CazNavigatorGroup source = new CazNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentClaims_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(ClaimEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(ArgumentEditPart.VISUAL_ID));
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

		case EvidenceEvidenceContextsEditPart.VISUAL_ID: {
			LinkedList<CazAbstractNavigatorItem> result = new LinkedList<CazAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			CazNavigatorGroup target = new CazNavigatorGroup(
					Messages.NavigatorGroupName_EvidenceEvidenceContexts_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CazNavigatorGroup source = new CazNavigatorGroup(
					Messages.NavigatorGroupName_EvidenceEvidenceContexts_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(ContextEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(EvidenceEditPart.VISUAL_ID));
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

		case ArgumentArgumentEvidenceEditPart.VISUAL_ID: {
			LinkedList<CazAbstractNavigatorItem> result = new LinkedList<CazAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			CazNavigatorGroup target = new CazNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentEvidence_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CazNavigatorGroup source = new CazNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentEvidence_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(EvidenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(ArgumentEditPart.VISUAL_ID));
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

		case ClaimClaimContextsEditPart.VISUAL_ID: {
			LinkedList<CazAbstractNavigatorItem> result = new LinkedList<CazAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			CazNavigatorGroup target = new CazNavigatorGroup(
					Messages.NavigatorGroupName_ClaimClaimContexts_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CazNavigatorGroup source = new CazNavigatorGroup(
					Messages.NavigatorGroupName_ClaimClaimContexts_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(ContextEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(ClaimEditPart.VISUAL_ID));
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
			LinkedList<CazAbstractNavigatorItem> result = new LinkedList<CazAbstractNavigatorItem>();
			Node sv = (Node) view;
			CazNavigatorGroup incominglinks = new CazNavigatorGroup(
					Messages.NavigatorGroupName_Evidence_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CazNavigatorGroup outgoinglinks = new CazNavigatorGroup(
					Messages.NavigatorGroupName_Evidence_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ClaimClaimSolutionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ArgumentArgumentEvidenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(EvidenceEvidenceContextsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(EvidenceEvidenceEditPart.VISUAL_ID));
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

		case EvidenceEvidenceEditPart.VISUAL_ID: {
			LinkedList<CazAbstractNavigatorItem> result = new LinkedList<CazAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			CazNavigatorGroup target = new CazNavigatorGroup(
					Messages.NavigatorGroupName_EvidenceEvidence_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CazNavigatorGroup source = new CazNavigatorGroup(
					Messages.NavigatorGroupName_EvidenceEvidence_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(AssumptionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(JustificationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(ContextEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(EvidenceEditPart.VISUAL_ID));
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
			LinkedList<CazAbstractNavigatorItem> result = new LinkedList<CazAbstractNavigatorItem>();
			Node sv = (Node) view;
			CazNavigatorGroup incominglinks = new CazNavigatorGroup(
					Messages.NavigatorGroupName_Assumption_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ClaimClaimAssumptionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(EvidenceEvidenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ClaimEditPart.VISUAL_ID: {
			LinkedList<CazAbstractNavigatorItem> result = new LinkedList<CazAbstractNavigatorItem>();
			Node sv = (Node) view;
			CazNavigatorGroup outgoinglinks = new CazNavigatorGroup(
					Messages.NavigatorGroupName_Claim_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CazNavigatorGroup incominglinks = new CazNavigatorGroup(
					Messages.NavigatorGroupName_Claim_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ClaimClaimStrategiesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ClaimClaimAssumptionsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ClaimClaimContextsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ClaimClaimSolutionsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ClaimSubClaimsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ClaimSubClaimsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ArgumentArgumentClaimsEditPart.VISUAL_ID));
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

		case ClaimClaimAssumptionsEditPart.VISUAL_ID: {
			LinkedList<CazAbstractNavigatorItem> result = new LinkedList<CazAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			CazNavigatorGroup target = new CazNavigatorGroup(
					Messages.NavigatorGroupName_ClaimClaimAssumptions_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CazNavigatorGroup source = new CazNavigatorGroup(
					Messages.NavigatorGroupName_ClaimClaimAssumptions_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(AssumptionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(ClaimEditPart.VISUAL_ID));
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
			LinkedList<CazAbstractNavigatorItem> result = new LinkedList<CazAbstractNavigatorItem>();
			Node sv = (Node) view;
			CazNavigatorGroup incominglinks = new CazNavigatorGroup(
					Messages.NavigatorGroupName_Justification_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ArgumentArgumentJustificationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(EvidenceEvidenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ContextEditPart.VISUAL_ID: {
			LinkedList<CazAbstractNavigatorItem> result = new LinkedList<CazAbstractNavigatorItem>();
			Node sv = (Node) view;
			CazNavigatorGroup incominglinks = new CazNavigatorGroup(
					Messages.NavigatorGroupName_Context_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ClaimClaimContextsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(EvidenceEvidenceContextsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(EvidenceEvidenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ArgumentDiagramEditPart.VISUAL_ID: {
			LinkedList<CazAbstractNavigatorItem> result = new LinkedList<CazAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			CazNavigatorGroup links = new CazNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentDiagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(ClaimEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(EvidenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(ArgumentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(AssumptionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(JustificationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(ContextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ClaimClaimStrategiesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ClaimClaimAssumptionsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ClaimClaimContextsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ClaimClaimSolutionsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ClaimSubClaimsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ArgumentArgumentJustificationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ArgumentArgumentEvidenceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(ArgumentArgumentClaimsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(EvidenceEvidenceContextsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(EvidenceEvidenceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case ArgumentArgumentJustificationEditPart.VISUAL_ID: {
			LinkedList<CazAbstractNavigatorItem> result = new LinkedList<CazAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			CazNavigatorGroup target = new CazNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentJustification_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CazNavigatorGroup source = new CazNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentArgumentJustification_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CazVisualIDRegistry
							.getType(JustificationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CazVisualIDRegistry.getType(ArgumentEditPart.VISUAL_ID));
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
		return ArgumentDiagramEditPart.MODEL_ID.equals(CazVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<CazNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<CazNavigatorItem> result = new ArrayList<CazNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new CazNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof CazAbstractNavigatorItem) {
			CazAbstractNavigatorItem abstractNavigatorItem = (CazAbstractNavigatorItem) element;
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
