/*
 * 
 */
package stateAnalysis.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class StateAnalysisNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem
				&& !isOwnView(((stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup) {
			stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup group = (stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup) element;
			return stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem) {
			stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem navigatorItem = (stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
				.getVisualID(view)) {
		case stateAnalysis.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.certware.net/state/StateAnalysisGui?System", stateAnalysis.diagram.providers.StateAnalysisElementTypes.System_1000); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.SubsystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/state/StateAnalysisGui?Subsystem", stateAnalysis.diagram.providers.StateAnalysisElementTypes.Subsystem_2001); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.DeploymentSetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?DeploymentSet", stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeploymentSet_3001); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?Deployment", stateAnalysis.diagram.providers.StateAnalysisElementTypes.Deployment_3002); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?Component", stateAnalysis.diagram.providers.StateAnalysisElementTypes.Component_3003); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.DataCollectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?DataCollection", stateAnalysis.diagram.providers.StateAnalysisElementTypes.DataCollection_3004); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.QosPolicyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?QosPolicy", stateAnalysis.diagram.providers.StateAnalysisElementTypes.QosPolicy_3005); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.DataProductEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?DataProduct", stateAnalysis.diagram.providers.StateAnalysisElementTypes.DataProduct_3006); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.StateVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?StateVariable", stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3007); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.StateConstraintEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?StateConstraint", stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3008); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.StateConstraint2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?StateConstraint", stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3009); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.StateUpdateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?StateUpdate", stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateUpdate_3010); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.StateVariable2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?StateVariable", stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3011); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?Controller", stateAnalysis.diagram.providers.StateAnalysisElementTypes.Controller_3012); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.StateConstraint3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?StateConstraint", stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3013); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.HardwareCommandEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?HardwareCommand", stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareCommand_3014); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.EstimatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?Estimator", stateAnalysis.diagram.providers.StateAnalysisElementTypes.Estimator_3015); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.StateConstraint4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?StateConstraint", stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3016); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.StateUpdate2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?StateUpdate", stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateUpdate_3017); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.HardwareMeasurementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?HardwareMeasurement", stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareMeasurement_3018); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.HardwareAdapterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?HardwareAdapter", stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareAdapter_3019); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.HardwareCommand2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?HardwareCommand", stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareCommand_3020); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.HardwareMeasurement2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?HardwareMeasurement", stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareMeasurement_3021); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?Device", stateAnalysis.diagram.providers.StateAnalysisElementTypes.Device_3024); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.DeviceCommandEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?DeviceCommand", stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeviceCommand_3025); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.DeviceMeasurementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.certware.net/state/StateAnalysisGui?DeviceMeasurement", stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeviceMeasurement_3026); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.ControllerDelegatesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/state/StateAnalysisGui?Controller?delegates", stateAnalysis.diagram.providers.StateAnalysisElementTypes.ControllerDelegates_4001); //$NON-NLS-1$
		case stateAnalysis.diagram.edit.parts.EstimatorDistilledMeasurementsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/state/StateAnalysisGui?Estimator?distilledMeasurements", stateAnalysis.diagram.providers.StateAnalysisElementTypes.EstimatorDistilledMeasurements_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& stateAnalysis.diagram.providers.StateAnalysisElementTypes
						.isKnownElementType(elementType)) {
			image = stateAnalysis.diagram.providers.StateAnalysisElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup) {
			stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup group = (stateAnalysis.diagram.navigator.StateAnalysisNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem) {
			stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem navigatorItem = (stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
				.getVisualID(view)) {
		case stateAnalysis.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getSystem_1000Text(view);
		case stateAnalysis.diagram.edit.parts.SubsystemEditPart.VISUAL_ID:
			return getSubsystem_2001Text(view);
		case stateAnalysis.diagram.edit.parts.DeploymentSetEditPart.VISUAL_ID:
			return getDeploymentSet_3001Text(view);
		case stateAnalysis.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
			return getDeployment_3002Text(view);
		case stateAnalysis.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_3003Text(view);
		case stateAnalysis.diagram.edit.parts.DataCollectionEditPart.VISUAL_ID:
			return getDataCollection_3004Text(view);
		case stateAnalysis.diagram.edit.parts.QosPolicyEditPart.VISUAL_ID:
			return getQosPolicy_3005Text(view);
		case stateAnalysis.diagram.edit.parts.DataProductEditPart.VISUAL_ID:
			return getDataProduct_3006Text(view);
		case stateAnalysis.diagram.edit.parts.StateVariableEditPart.VISUAL_ID:
			return getStateVariable_3007Text(view);
		case stateAnalysis.diagram.edit.parts.StateConstraintEditPart.VISUAL_ID:
			return getStateConstraint_3008Text(view);
		case stateAnalysis.diagram.edit.parts.StateConstraint2EditPart.VISUAL_ID:
			return getStateConstraint_3009Text(view);
		case stateAnalysis.diagram.edit.parts.StateUpdateEditPart.VISUAL_ID:
			return getStateUpdate_3010Text(view);
		case stateAnalysis.diagram.edit.parts.StateVariable2EditPart.VISUAL_ID:
			return getStateVariable_3011Text(view);
		case stateAnalysis.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_3012Text(view);
		case stateAnalysis.diagram.edit.parts.StateConstraint3EditPart.VISUAL_ID:
			return getStateConstraint_3013Text(view);
		case stateAnalysis.diagram.edit.parts.HardwareCommandEditPart.VISUAL_ID:
			return getHardwareCommand_3014Text(view);
		case stateAnalysis.diagram.edit.parts.EstimatorEditPart.VISUAL_ID:
			return getEstimator_3015Text(view);
		case stateAnalysis.diagram.edit.parts.StateConstraint4EditPart.VISUAL_ID:
			return getStateConstraint_3016Text(view);
		case stateAnalysis.diagram.edit.parts.StateUpdate2EditPart.VISUAL_ID:
			return getStateUpdate_3017Text(view);
		case stateAnalysis.diagram.edit.parts.HardwareMeasurementEditPart.VISUAL_ID:
			return getHardwareMeasurement_3018Text(view);
		case stateAnalysis.diagram.edit.parts.HardwareAdapterEditPart.VISUAL_ID:
			return getHardwareAdapter_3019Text(view);
		case stateAnalysis.diagram.edit.parts.HardwareCommand2EditPart.VISUAL_ID:
			return getHardwareCommand_3020Text(view);
		case stateAnalysis.diagram.edit.parts.HardwareMeasurement2EditPart.VISUAL_ID:
			return getHardwareMeasurement_3021Text(view);
		case stateAnalysis.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return getDevice_3024Text(view);
		case stateAnalysis.diagram.edit.parts.DeviceCommandEditPart.VISUAL_ID:
			return getDeviceCommand_3025Text(view);
		case stateAnalysis.diagram.edit.parts.DeviceMeasurementEditPart.VISUAL_ID:
			return getDeviceMeasurement_3026Text(view);
		case stateAnalysis.diagram.edit.parts.ControllerDelegatesEditPart.VISUAL_ID:
			return getControllerDelegates_4001Text(view);
		case stateAnalysis.diagram.edit.parts.EstimatorDistilledMeasurementsEditPart.VISUAL_ID:
			return getEstimatorDistilledMeasurements_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSystem_1000Text(View view) {
		stateAnalysis.System domainModelElement = (stateAnalysis.System) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSubsystem_2001Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.Subsystem_2001,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.SubsystemNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDeploymentSet_3001Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeploymentSet_3001,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.DeploymentSetNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDeployment_3002Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.Deployment_3002,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.DeploymentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponent_3003Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.Component_3003,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.ComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataCollection_3004Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.DataCollection_3004,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.DataCollectionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQosPolicy_3005Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.QosPolicy_3005,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.QosPolicyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataProduct_3006Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.DataProduct_3006,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.DataProductNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStateVariable_3007Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3007,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.StateVariableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStateConstraint_3008Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3008,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.StateConstraintNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStateConstraint_3009Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3009,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.StateConstraintName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStateUpdate_3010Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateUpdate_3010,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.StateUpdateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStateVariable_3011Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3011,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.StateVariableName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getController_3012Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.Controller_3012,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.ControllerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStateConstraint_3013Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3013,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.StateConstraintName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHardwareCommand_3014Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareCommand_3014,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.HardwareCommandNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEstimator_3015Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.Estimator_3015,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.EstimatorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStateConstraint_3016Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3016,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.StateConstraintName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStateUpdate_3017Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateUpdate_3017,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.StateUpdateName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHardwareMeasurement_3018Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareMeasurement_3018,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.HardwareMeasurementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHardwareAdapter_3019Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareAdapter_3019,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.HardwareAdapterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHardwareCommand_3020Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareCommand_3020,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.HardwareCommandName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHardwareMeasurement_3021Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareMeasurement_3021,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.HardwareMeasurementName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDevice_3024Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.Device_3024,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.DeviceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDeviceCommand_3025Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeviceCommand_3025,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.DeviceCommandNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDeviceMeasurement_3026Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeviceMeasurement_3026,
						view.getElement() != null ? view.getElement() : view,
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
								.getType(stateAnalysis.diagram.edit.parts.DeviceMeasurementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControllerDelegates_4001Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.ControllerDelegates_4001,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEstimatorDistilledMeasurements_4002Text(View view) {
		IParser parser = stateAnalysis.diagram.providers.StateAnalysisParserProvider
				.getParser(
						stateAnalysis.diagram.providers.StateAnalysisElementTypes.EstimatorDistilledMeasurements_4002,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return stateAnalysis.diagram.edit.parts.SystemEditPart.MODEL_ID
				.equals(stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
						.getModelID(view));
	}

}
