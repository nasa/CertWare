/*
 * 
 */
package stateAnalysis.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
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
public class StateAnalysisNavigatorContentProvider implements
		ICommonContentProvider {

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
	public StateAnalysisNavigatorContentProvider() {
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
			ArrayList<stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem> result = new ArrayList<stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							stateAnalysis.diagram.edit.parts.SystemEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup) {
			stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup group = (stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem) {
			stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem navigatorItem = (stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
				.getVisualID(view)) {

		case stateAnalysis.diagram.edit.parts.SystemEditPart.VISUAL_ID: {
			LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem> result = new LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup links = new stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup(
					stateAnalysis.diagram.part.Messages.NavigatorGroupName_System_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.SubsystemEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.ControllerDelegatesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.EstimatorDistilledMeasurementsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case stateAnalysis.diagram.edit.parts.SubsystemEditPart.VISUAL_ID: {
			LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem> result = new LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.SubsystemSubsystemDeploymentSetsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.DeploymentSetEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case stateAnalysis.diagram.edit.parts.DeploymentSetEditPart.VISUAL_ID: {
			LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem> result = new LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.DeploymentSetDeploymentSetDeploymentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.DeploymentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case stateAnalysis.diagram.edit.parts.DeploymentEditPart.VISUAL_ID: {
			LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem> result = new LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.DeploymentDeploymentComponentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.ComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.DeploymentDeploymentCatalogsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.DataCollectionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case stateAnalysis.diagram.edit.parts.ComponentEditPart.VISUAL_ID: {
			LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem> result = new LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.ComponentComponentStateVariablesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateVariableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.ComponentComponentControllersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.ControllerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.ComponentComponentEstimatorsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.EstimatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.ComponentComponentAdaptersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.HardwareAdapterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case stateAnalysis.diagram.edit.parts.DataCollectionEditPart.VISUAL_ID: {
			LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem> result = new LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.DataCollectionDataCollectionPoliciesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.QosPolicyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.DataCollectionDataCollectionProductsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.DataProductEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case stateAnalysis.diagram.edit.parts.StateVariableEditPart.VISUAL_ID: {
			LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem> result = new LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateConstraintEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateConstraint2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateUpdateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateVariable2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case stateAnalysis.diagram.edit.parts.StateVariable2EditPart.VISUAL_ID: {
			LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem> result = new LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateConstraintEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateConstraint2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateUpdateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateVariable2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case stateAnalysis.diagram.edit.parts.ControllerEditPart.VISUAL_ID: {
			LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem> result = new LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem>();
			Node sv = (Node) view;
			stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup incominglinks = new stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup(
					stateAnalysis.diagram.part.Messages.NavigatorGroupName_Controller_3012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup outgoinglinks = new stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup(
					stateAnalysis.diagram.part.Messages.NavigatorGroupName_Controller_3012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.ControllerControllerStateConstraintCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateConstraint3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.ControllerControllerHardwareCommandCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.HardwareCommandEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.ControllerDelegatesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.ControllerDelegatesEditPart.VISUAL_ID));
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

		case stateAnalysis.diagram.edit.parts.EstimatorEditPart.VISUAL_ID: {
			LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem> result = new LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem>();
			Node sv = (Node) view;
			stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup incominglinks = new stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup(
					stateAnalysis.diagram.part.Messages.NavigatorGroupName_Estimator_3015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup outgoinglinks = new stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup(
					stateAnalysis.diagram.part.Messages.NavigatorGroupName_Estimator_3015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.EstimatorEstimatorStateConstraintsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateConstraint4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.EstimatorEstimatorStateUpdatesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.StateUpdate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.EstimatorEstimatorHardwareMeasurementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.HardwareMeasurementEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.EstimatorDistilledMeasurementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.EstimatorDistilledMeasurementsEditPart.VISUAL_ID));
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

		case stateAnalysis.diagram.edit.parts.HardwareAdapterEditPart.VISUAL_ID: {
			LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem> result = new LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareCommandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.HardwareCommand2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareMeasurementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.HardwareMeasurement2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterDevicesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.DeviceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case stateAnalysis.diagram.edit.parts.DeviceEditPart.VISUAL_ID: {
			LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem> result = new LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.DeviceDeviceDeviceCommandsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.DeviceCommandEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.DeviceDeviceDeviceMeasurementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.DeviceMeasurementEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case stateAnalysis.diagram.edit.parts.ControllerDelegatesEditPart.VISUAL_ID: {
			LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem> result = new LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup target = new stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup(
					stateAnalysis.diagram.part.Messages.NavigatorGroupName_ControllerDelegates_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup source = new stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup(
					stateAnalysis.diagram.part.Messages.NavigatorGroupName_ControllerDelegates_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.ControllerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.ControllerEditPart.VISUAL_ID));
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

		case stateAnalysis.diagram.edit.parts.EstimatorDistilledMeasurementsEditPart.VISUAL_ID: {
			LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem> result = new LinkedList<stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup target = new stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup(
					stateAnalysis.diagram.part.Messages.NavigatorGroupName_EstimatorDistilledMeasurements_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup source = new stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup(
					stateAnalysis.diagram.part.Messages.NavigatorGroupName_EstimatorDistilledMeasurements_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.EstimatorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
							.getType(stateAnalysis.diagram.edit.parts.EstimatorEditPart.VISUAL_ID));
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
		return stateAnalysis.diagram.edit.parts.SystemEditPart.MODEL_ID
				.equals(stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem> result = new ArrayList<stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem) {
			stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem abstractNavigatorItem = (stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem) element;
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
