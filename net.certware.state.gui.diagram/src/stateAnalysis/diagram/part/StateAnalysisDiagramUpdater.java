/*
 * 
 */
package stateAnalysis.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class StateAnalysisDiagramUpdater {

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
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getSemanticChildren(
			View view) {
		switch (stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
				.getVisualID(view)) {
		case stateAnalysis.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getSystem_1000SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.SubsystemSubsystemDeploymentSetsCompartmentEditPart.VISUAL_ID:
			return getSubsystemSubsystemDeploymentSetsCompartment_7001SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.DeploymentSetDeploymentSetDeploymentsCompartmentEditPart.VISUAL_ID:
			return getDeploymentSetDeploymentSetDeploymentsCompartment_7002SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.DeploymentDeploymentComponentsCompartmentEditPart.VISUAL_ID:
			return getDeploymentDeploymentComponentsCompartment_7003SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.DeploymentDeploymentCatalogsCompartmentEditPart.VISUAL_ID:
			return getDeploymentDeploymentCatalogsCompartment_7004SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartmentEditPart.VISUAL_ID:
			return getStateVariableStateVariableInStateConstraintsCompartment_7030SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartmentEditPart.VISUAL_ID:
			return getStateVariableStateVariableOutStateConstraintsCompartment_7031SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartmentEditPart.VISUAL_ID:
			return getStateVariableStateVariableStateUpdatesCompartment_7032SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartmentEditPart.VISUAL_ID:
			return getStateVariableStateVariableInfluencedByCompartment_7033SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartment2EditPart.VISUAL_ID:
			return getStateVariableStateVariableInStateConstraintsCompartment_7015SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartment2EditPart.VISUAL_ID:
			return getStateVariableStateVariableOutStateConstraintsCompartment_7016SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartment2EditPart.VISUAL_ID:
			return getStateVariableStateVariableStateUpdatesCompartment_7017SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartment2EditPart.VISUAL_ID:
			return getStateVariableStateVariableInfluencedByCompartment_7018SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.ControllerControllerStateConstraintCompartmentEditPart.VISUAL_ID:
			return getControllerControllerStateConstraintCompartment_7034SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.ControllerControllerHardwareCommandCompartmentEditPart.VISUAL_ID:
			return getControllerControllerHardwareCommandCompartment_7035SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.EstimatorEstimatorStateConstraintsCompartmentEditPart.VISUAL_ID:
			return getEstimatorEstimatorStateConstraintsCompartment_7036SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.EstimatorEstimatorStateUpdatesCompartmentEditPart.VISUAL_ID:
			return getEstimatorEstimatorStateUpdatesCompartment_7037SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.EstimatorEstimatorHardwareMeasurementCompartmentEditPart.VISUAL_ID:
			return getEstimatorEstimatorHardwareMeasurementCompartment_7038SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareCommandsCompartmentEditPart.VISUAL_ID:
			return getHardwareAdapterHardwareAdapterHardwareCommandsCompartment_7039SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareMeasurementsCompartmentEditPart.VISUAL_ID:
			return getHardwareAdapterHardwareAdapterHardwareMeasurementsCompartment_7040SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterDevicesCompartmentEditPart.VISUAL_ID:
			return getHardwareAdapterHardwareAdapterDevicesCompartment_7041SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.DeviceDeviceDeviceCommandsCompartmentEditPart.VISUAL_ID:
			return getDeviceDeviceDeviceCommandsCompartment_7028SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.DeviceDeviceDeviceMeasurementsCompartmentEditPart.VISUAL_ID:
			return getDeviceDeviceDeviceMeasurementsCompartment_7029SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.DataCollectionDataCollectionPoliciesCompartmentEditPart.VISUAL_ID:
			return getDataCollectionDataCollectionPoliciesCompartment_7009SemanticChildren(view);
		case stateAnalysis.diagram.edit.parts.DataCollectionDataCollectionProductsCompartmentEditPart.VISUAL_ID:
			return getDataCollectionDataCollectionProductsCompartment_7010SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getSystem_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.System modelElement = (stateAnalysis.System) view
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSubsystems().iterator(); it
				.hasNext();) {
			stateAnalysis.Subsystem childElement = (stateAnalysis.Subsystem) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.SubsystemEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getSubsystemSubsystemDeploymentSetsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.Subsystem modelElement = (stateAnalysis.Subsystem) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDeploymentSets().iterator(); it
				.hasNext();) {
			stateAnalysis.DeploymentSet childElement = (stateAnalysis.DeploymentSet) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.DeploymentSetEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getDeploymentSetDeploymentSetDeploymentsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.DeploymentSet modelElement = (stateAnalysis.DeploymentSet) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDeployments().iterator(); it
				.hasNext();) {
			stateAnalysis.Deployment childElement = (stateAnalysis.Deployment) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.DeploymentEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getDeploymentDeploymentComponentsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.Deployment modelElement = (stateAnalysis.Deployment) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			stateAnalysis.Component childElement = (stateAnalysis.Component) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.StateVariableEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == stateAnalysis.diagram.edit.parts.ControllerEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == stateAnalysis.diagram.edit.parts.EstimatorEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == stateAnalysis.diagram.edit.parts.HardwareAdapterEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getDeploymentDeploymentCatalogsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.Deployment modelElement = (stateAnalysis.Deployment) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCatalogs().iterator(); it
				.hasNext();) {
			stateAnalysis.DataCollection childElement = (stateAnalysis.DataCollection) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.DataCollectionEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getStateVariableStateVariableInStateConstraintsCompartment_7030SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.StateVariable modelElement = (stateAnalysis.StateVariable) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInStateConstraints().iterator(); it
				.hasNext();) {
			stateAnalysis.StateConstraint childElement = (stateAnalysis.StateConstraint) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.StateConstraintEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getStateVariableStateVariableOutStateConstraintsCompartment_7031SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.StateVariable modelElement = (stateAnalysis.StateVariable) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOutStateConstraints().iterator(); it
				.hasNext();) {
			stateAnalysis.StateConstraint childElement = (stateAnalysis.StateConstraint) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.StateConstraint2EditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getStateVariableStateVariableStateUpdatesCompartment_7032SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.StateVariable modelElement = (stateAnalysis.StateVariable) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStateUpdates().iterator(); it
				.hasNext();) {
			stateAnalysis.StateUpdate childElement = (stateAnalysis.StateUpdate) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.StateUpdateEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getStateVariableStateVariableInfluencedByCompartment_7033SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.StateVariable modelElement = (stateAnalysis.StateVariable) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInfluencedBy().iterator(); it
				.hasNext();) {
			stateAnalysis.StateVariable childElement = (stateAnalysis.StateVariable) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.StateVariable2EditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getStateVariableStateVariableInStateConstraintsCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.StateVariable modelElement = (stateAnalysis.StateVariable) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInStateConstraints().iterator(); it
				.hasNext();) {
			stateAnalysis.StateConstraint childElement = (stateAnalysis.StateConstraint) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.StateConstraintEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getStateVariableStateVariableOutStateConstraintsCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.StateVariable modelElement = (stateAnalysis.StateVariable) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOutStateConstraints().iterator(); it
				.hasNext();) {
			stateAnalysis.StateConstraint childElement = (stateAnalysis.StateConstraint) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.StateConstraint2EditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getStateVariableStateVariableStateUpdatesCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.StateVariable modelElement = (stateAnalysis.StateVariable) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStateUpdates().iterator(); it
				.hasNext();) {
			stateAnalysis.StateUpdate childElement = (stateAnalysis.StateUpdate) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.StateUpdateEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getStateVariableStateVariableInfluencedByCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.StateVariable modelElement = (stateAnalysis.StateVariable) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInfluencedBy().iterator(); it
				.hasNext();) {
			stateAnalysis.StateVariable childElement = (stateAnalysis.StateVariable) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.StateVariable2EditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getControllerControllerStateConstraintCompartment_7034SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.Controller modelElement = (stateAnalysis.Controller) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStateConstraint().iterator(); it
				.hasNext();) {
			stateAnalysis.StateConstraint childElement = (stateAnalysis.StateConstraint) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.StateConstraint3EditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getControllerControllerHardwareCommandCompartment_7035SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.Controller modelElement = (stateAnalysis.Controller) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHardwareCommand().iterator(); it
				.hasNext();) {
			stateAnalysis.HardwareCommand childElement = (stateAnalysis.HardwareCommand) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.HardwareCommandEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getEstimatorEstimatorStateConstraintsCompartment_7036SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.Estimator modelElement = (stateAnalysis.Estimator) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStateConstraints().iterator(); it
				.hasNext();) {
			stateAnalysis.StateConstraint childElement = (stateAnalysis.StateConstraint) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.StateConstraint4EditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getEstimatorEstimatorStateUpdatesCompartment_7037SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.Estimator modelElement = (stateAnalysis.Estimator) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStateUpdates().iterator(); it
				.hasNext();) {
			stateAnalysis.StateUpdate childElement = (stateAnalysis.StateUpdate) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.StateUpdate2EditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getEstimatorEstimatorHardwareMeasurementCompartment_7038SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.Estimator modelElement = (stateAnalysis.Estimator) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHardwareMeasurement().iterator(); it
				.hasNext();) {
			stateAnalysis.HardwareMeasurement childElement = (stateAnalysis.HardwareMeasurement) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.HardwareMeasurementEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getHardwareAdapterHardwareAdapterHardwareCommandsCompartment_7039SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.HardwareAdapter modelElement = (stateAnalysis.HardwareAdapter) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHardwareCommands().iterator(); it
				.hasNext();) {
			stateAnalysis.HardwareCommand childElement = (stateAnalysis.HardwareCommand) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.HardwareCommand2EditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getHardwareAdapterHardwareAdapterHardwareMeasurementsCompartment_7040SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.HardwareAdapter modelElement = (stateAnalysis.HardwareAdapter) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHardwareMeasurements().iterator(); it
				.hasNext();) {
			stateAnalysis.HardwareMeasurement childElement = (stateAnalysis.HardwareMeasurement) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.HardwareMeasurement2EditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getHardwareAdapterHardwareAdapterDevicesCompartment_7041SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.HardwareAdapter modelElement = (stateAnalysis.HardwareAdapter) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDevices().iterator(); it
				.hasNext();) {
			stateAnalysis.Device childElement = (stateAnalysis.Device) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.DeviceEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getDeviceDeviceDeviceCommandsCompartment_7028SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.Device modelElement = (stateAnalysis.Device) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDeviceCommands().iterator(); it
				.hasNext();) {
			stateAnalysis.DeviceCommand childElement = (stateAnalysis.DeviceCommand) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.DeviceCommandEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getDeviceDeviceDeviceMeasurementsCompartment_7029SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.Device modelElement = (stateAnalysis.Device) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDeviceMeasurements().iterator(); it
				.hasNext();) {
			stateAnalysis.DeviceMeasurement childElement = (stateAnalysis.DeviceMeasurement) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.DeviceMeasurementEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getDataCollectionDataCollectionPoliciesCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.DataCollection modelElement = (stateAnalysis.DataCollection) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPolicies().iterator(); it
				.hasNext();) {
			stateAnalysis.QosPolicy childElement = (stateAnalysis.QosPolicy) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.QosPolicyEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getDataCollectionDataCollectionProductsCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		stateAnalysis.DataCollection modelElement = (stateAnalysis.DataCollection) containerView
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProducts().iterator(); it
				.hasNext();) {
			stateAnalysis.DataProduct childElement = (stateAnalysis.DataProduct) it
					.next();
			int visualID = stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == stateAnalysis.diagram.edit.parts.DataProductEditPart.VISUAL_ID) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getContainedLinks(
			View view) {
		switch (stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
				.getVisualID(view)) {
		case stateAnalysis.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getSystem_1000ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.SubsystemEditPart.VISUAL_ID:
			return getSubsystem_2001ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.DeploymentSetEditPart.VISUAL_ID:
			return getDeploymentSet_3001ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
			return getDeployment_3002ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.StateVariableEditPart.VISUAL_ID:
			return getStateVariable_3027ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.StateVariable2EditPart.VISUAL_ID:
			return getStateVariable_3011ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.StateConstraintEditPart.VISUAL_ID:
			return getStateConstraint_3008ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.StateConstraint2EditPart.VISUAL_ID:
			return getStateConstraint_3009ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.StateUpdateEditPart.VISUAL_ID:
			return getStateUpdate_3010ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_3028ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.StateConstraint3EditPart.VISUAL_ID:
			return getStateConstraint_3013ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.HardwareCommandEditPart.VISUAL_ID:
			return getHardwareCommand_3014ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.EstimatorEditPart.VISUAL_ID:
			return getEstimator_3029ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.StateConstraint4EditPart.VISUAL_ID:
			return getStateConstraint_3016ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.StateUpdate2EditPart.VISUAL_ID:
			return getStateUpdate_3017ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.HardwareMeasurementEditPart.VISUAL_ID:
			return getHardwareMeasurement_3018ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.HardwareAdapterEditPart.VISUAL_ID:
			return getHardwareAdapter_3030ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.HardwareCommand2EditPart.VISUAL_ID:
			return getHardwareCommand_3020ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.HardwareMeasurement2EditPart.VISUAL_ID:
			return getHardwareMeasurement_3021ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return getDevice_3024ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.DeviceCommandEditPart.VISUAL_ID:
			return getDeviceCommand_3025ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.DeviceMeasurementEditPart.VISUAL_ID:
			return getDeviceMeasurement_3026ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.DataCollectionEditPart.VISUAL_ID:
			return getDataCollection_3004ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.QosPolicyEditPart.VISUAL_ID:
			return getQosPolicy_3005ContainedLinks(view);
		case stateAnalysis.diagram.edit.parts.DataProductEditPart.VISUAL_ID:
			return getDataProduct_3006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getIncomingLinks(
			View view) {
		switch (stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
				.getVisualID(view)) {
		case stateAnalysis.diagram.edit.parts.SubsystemEditPart.VISUAL_ID:
			return getSubsystem_2001IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.DeploymentSetEditPart.VISUAL_ID:
			return getDeploymentSet_3001IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
			return getDeployment_3002IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.StateVariableEditPart.VISUAL_ID:
			return getStateVariable_3027IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.StateVariable2EditPart.VISUAL_ID:
			return getStateVariable_3011IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.StateConstraintEditPart.VISUAL_ID:
			return getStateConstraint_3008IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.StateConstraint2EditPart.VISUAL_ID:
			return getStateConstraint_3009IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.StateUpdateEditPart.VISUAL_ID:
			return getStateUpdate_3010IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_3028IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.StateConstraint3EditPart.VISUAL_ID:
			return getStateConstraint_3013IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.HardwareCommandEditPart.VISUAL_ID:
			return getHardwareCommand_3014IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.EstimatorEditPart.VISUAL_ID:
			return getEstimator_3029IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.StateConstraint4EditPart.VISUAL_ID:
			return getStateConstraint_3016IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.StateUpdate2EditPart.VISUAL_ID:
			return getStateUpdate_3017IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.HardwareMeasurementEditPart.VISUAL_ID:
			return getHardwareMeasurement_3018IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.HardwareAdapterEditPart.VISUAL_ID:
			return getHardwareAdapter_3030IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.HardwareCommand2EditPart.VISUAL_ID:
			return getHardwareCommand_3020IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.HardwareMeasurement2EditPart.VISUAL_ID:
			return getHardwareMeasurement_3021IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return getDevice_3024IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.DeviceCommandEditPart.VISUAL_ID:
			return getDeviceCommand_3025IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.DeviceMeasurementEditPart.VISUAL_ID:
			return getDeviceMeasurement_3026IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.DataCollectionEditPart.VISUAL_ID:
			return getDataCollection_3004IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.QosPolicyEditPart.VISUAL_ID:
			return getQosPolicy_3005IncomingLinks(view);
		case stateAnalysis.diagram.edit.parts.DataProductEditPart.VISUAL_ID:
			return getDataProduct_3006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
				.getVisualID(view)) {
		case stateAnalysis.diagram.edit.parts.SubsystemEditPart.VISUAL_ID:
			return getSubsystem_2001OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.DeploymentSetEditPart.VISUAL_ID:
			return getDeploymentSet_3001OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
			return getDeployment_3002OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.StateVariableEditPart.VISUAL_ID:
			return getStateVariable_3027OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.StateVariable2EditPart.VISUAL_ID:
			return getStateVariable_3011OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.StateConstraintEditPart.VISUAL_ID:
			return getStateConstraint_3008OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.StateConstraint2EditPart.VISUAL_ID:
			return getStateConstraint_3009OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.StateUpdateEditPart.VISUAL_ID:
			return getStateUpdate_3010OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_3028OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.StateConstraint3EditPart.VISUAL_ID:
			return getStateConstraint_3013OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.HardwareCommandEditPart.VISUAL_ID:
			return getHardwareCommand_3014OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.EstimatorEditPart.VISUAL_ID:
			return getEstimator_3029OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.StateConstraint4EditPart.VISUAL_ID:
			return getStateConstraint_3016OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.StateUpdate2EditPart.VISUAL_ID:
			return getStateUpdate_3017OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.HardwareMeasurementEditPart.VISUAL_ID:
			return getHardwareMeasurement_3018OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.HardwareAdapterEditPart.VISUAL_ID:
			return getHardwareAdapter_3030OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.HardwareCommand2EditPart.VISUAL_ID:
			return getHardwareCommand_3020OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.HardwareMeasurement2EditPart.VISUAL_ID:
			return getHardwareMeasurement_3021OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return getDevice_3024OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.DeviceCommandEditPart.VISUAL_ID:
			return getDeviceCommand_3025OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.DeviceMeasurementEditPart.VISUAL_ID:
			return getDeviceMeasurement_3026OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.DataCollectionEditPart.VISUAL_ID:
			return getDataCollection_3004OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.QosPolicyEditPart.VISUAL_ID:
			return getQosPolicy_3005OutgoingLinks(view);
		case stateAnalysis.diagram.edit.parts.DataProductEditPart.VISUAL_ID:
			return getDataProduct_3006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getSystem_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getSubsystem_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDeploymentSet_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDeployment_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateVariable_3027ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateConstraint_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateConstraint_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateUpdate_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getController_3028ContainedLinks(
			View view) {
		stateAnalysis.Controller modelElement = (stateAnalysis.Controller) view
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Controller_Delegates_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateVariable_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateConstraint_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getHardwareCommand_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getEstimator_3029ContainedLinks(
			View view) {
		stateAnalysis.Estimator modelElement = (stateAnalysis.Estimator) view
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Estimator_DistilledMeasurements_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateConstraint_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateUpdate_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getHardwareMeasurement_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getHardwareAdapter_3030ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getHardwareCommand_3020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getHardwareMeasurement_3021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDevice_3024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDeviceCommand_3025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDeviceMeasurement_3026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDataCollection_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getQosPolicy_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDataProduct_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getSubsystem_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDeploymentSet_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDeployment_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateVariable_3027IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateConstraint_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateConstraint_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateUpdate_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getController_3028IncomingLinks(
			View view) {
		stateAnalysis.Controller modelElement = (stateAnalysis.Controller) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Controller_Delegates_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateVariable_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateConstraint_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getHardwareCommand_3014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getEstimator_3029IncomingLinks(
			View view) {
		stateAnalysis.Estimator modelElement = (stateAnalysis.Estimator) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Estimator_DistilledMeasurements_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateConstraint_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateUpdate_3017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getHardwareMeasurement_3018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getHardwareAdapter_3030IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getHardwareCommand_3020IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getHardwareMeasurement_3021IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDevice_3024IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDeviceCommand_3025IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDeviceMeasurement_3026IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDataCollection_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getQosPolicy_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDataProduct_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getSubsystem_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDeploymentSet_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDeployment_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateVariable_3027OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateConstraint_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateConstraint_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateUpdate_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getController_3028OutgoingLinks(
			View view) {
		stateAnalysis.Controller modelElement = (stateAnalysis.Controller) view
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Controller_Delegates_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateVariable_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateConstraint_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getHardwareCommand_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getEstimator_3029OutgoingLinks(
			View view) {
		stateAnalysis.Estimator modelElement = (stateAnalysis.Estimator) view
				.getElement();
		LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Estimator_DistilledMeasurements_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateConstraint_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getStateUpdate_3017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getHardwareMeasurement_3018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getHardwareAdapter_3030OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getHardwareCommand_3020OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getHardwareMeasurement_3021OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDevice_3024OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDeviceCommand_3025OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDeviceMeasurement_3026OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDataCollection_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getQosPolicy_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getDataProduct_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getIncomingFeatureModelFacetLinks_Controller_Delegates_4001(
			stateAnalysis.Controller target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getController_Delegates()) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisLinkDescriptor(
						setting.getEObject(),
						target,
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.ControllerDelegates_4001,
						stateAnalysis.diagram.edit.parts.ControllerDelegatesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getIncomingFeatureModelFacetLinks_Estimator_DistilledMeasurements_4002(
			stateAnalysis.Estimator target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == stateAnalysis.StateAnalysisPackage.eINSTANCE
					.getEstimator_DistilledMeasurements()) {
				result.add(new stateAnalysis.diagram.part.StateAnalysisLinkDescriptor(
						setting.getEObject(),
						target,
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.EstimatorDistilledMeasurements_4002,
						stateAnalysis.diagram.edit.parts.EstimatorDistilledMeasurementsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getOutgoingFeatureModelFacetLinks_Controller_Delegates_4001(
			stateAnalysis.Controller source) {
		LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor>();
		for (Iterator<?> destinations = source.getDelegates().iterator(); destinations
				.hasNext();) {
			stateAnalysis.Controller destination = (stateAnalysis.Controller) destinations
					.next();
			result.add(new stateAnalysis.diagram.part.StateAnalysisLinkDescriptor(
					source,
					destination,
					stateAnalysis.diagram.providers.StateAnalysisElementTypes.ControllerDelegates_4001,
					stateAnalysis.diagram.edit.parts.ControllerDelegatesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getOutgoingFeatureModelFacetLinks_Estimator_DistilledMeasurements_4002(
			stateAnalysis.Estimator source) {
		LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> result = new LinkedList<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor>();
		for (Iterator<?> destinations = source.getDistilledMeasurements()
				.iterator(); destinations.hasNext();) {
			stateAnalysis.Estimator destination = (stateAnalysis.Estimator) destinations
					.next();
			result.add(new stateAnalysis.diagram.part.StateAnalysisLinkDescriptor(
					source,
					destination,
					stateAnalysis.diagram.providers.StateAnalysisElementTypes.EstimatorDistilledMeasurements_4002,
					stateAnalysis.diagram.edit.parts.EstimatorDistilledMeasurementsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<stateAnalysis.diagram.part.StateAnalysisNodeDescriptor> getSemanticChildren(
				View view) {
			return StateAnalysisDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getContainedLinks(
				View view) {
			return StateAnalysisDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getIncomingLinks(
				View view) {
			return StateAnalysisDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<stateAnalysis.diagram.part.StateAnalysisLinkDescriptor> getOutgoingLinks(
				View view) {
			return StateAnalysisDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
