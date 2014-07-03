/*
 * 
 */
package stateAnalysis.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class StateAnalysisElementTypes {

	/**
	 * @generated
	 */
	private StateAnalysisElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType System_1000 = getElementType("net.certware.state.gui.diagram.System_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Subsystem_2001 = getElementType("net.certware.state.gui.diagram.Subsystem_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DeploymentSet_3001 = getElementType("net.certware.state.gui.diagram.DeploymentSet_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Deployment_3002 = getElementType("net.certware.state.gui.diagram.Deployment_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StateVariable_3027 = getElementType("net.certware.state.gui.diagram.StateVariable_3027"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StateConstraint_3008 = getElementType("net.certware.state.gui.diagram.StateConstraint_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StateConstraint_3009 = getElementType("net.certware.state.gui.diagram.StateConstraint_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StateUpdate_3010 = getElementType("net.certware.state.gui.diagram.StateUpdate_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Controller_3028 = getElementType("net.certware.state.gui.diagram.Controller_3028"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StateVariable_3011 = getElementType("net.certware.state.gui.diagram.StateVariable_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StateConstraint_3013 = getElementType("net.certware.state.gui.diagram.StateConstraint_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HardwareCommand_3014 = getElementType("net.certware.state.gui.diagram.HardwareCommand_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Estimator_3029 = getElementType("net.certware.state.gui.diagram.Estimator_3029"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StateConstraint_3016 = getElementType("net.certware.state.gui.diagram.StateConstraint_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StateUpdate_3017 = getElementType("net.certware.state.gui.diagram.StateUpdate_3017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HardwareMeasurement_3018 = getElementType("net.certware.state.gui.diagram.HardwareMeasurement_3018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HardwareAdapter_3030 = getElementType("net.certware.state.gui.diagram.HardwareAdapter_3030"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HardwareCommand_3020 = getElementType("net.certware.state.gui.diagram.HardwareCommand_3020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HardwareMeasurement_3021 = getElementType("net.certware.state.gui.diagram.HardwareMeasurement_3021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Device_3024 = getElementType("net.certware.state.gui.diagram.Device_3024"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DeviceCommand_3025 = getElementType("net.certware.state.gui.diagram.DeviceCommand_3025"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DeviceMeasurement_3026 = getElementType("net.certware.state.gui.diagram.DeviceMeasurement_3026"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DataCollection_3004 = getElementType("net.certware.state.gui.diagram.DataCollection_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType QosPolicy_3005 = getElementType("net.certware.state.gui.diagram.QosPolicy_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DataProduct_3006 = getElementType("net.certware.state.gui.diagram.DataProduct_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ControllerDelegates_4001 = getElementType("net.certware.state.gui.diagram.ControllerDelegates_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EstimatorDistilledMeasurements_4002 = getElementType("net.certware.state.gui.diagram.EstimatorDistilledMeasurements_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(System_1000,
					stateAnalysis.StateAnalysisPackage.eINSTANCE.getSystem());

			elements.put(Subsystem_2001,
					stateAnalysis.StateAnalysisPackage.eINSTANCE.getSubsystem());

			elements.put(DeploymentSet_3001,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getDeploymentSet());

			elements.put(Deployment_3002,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getDeployment());

			elements.put(StateVariable_3027,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getStateVariable());

			elements.put(StateVariable_3011,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getStateVariable());

			elements.put(StateConstraint_3008,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getStateConstraint());

			elements.put(StateConstraint_3009,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getStateConstraint());

			elements.put(StateUpdate_3010,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getStateUpdate());

			elements.put(Controller_3028,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getController());

			elements.put(StateConstraint_3013,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getStateConstraint());

			elements.put(HardwareCommand_3014,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getHardwareCommand());

			elements.put(Estimator_3029,
					stateAnalysis.StateAnalysisPackage.eINSTANCE.getEstimator());

			elements.put(StateConstraint_3016,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getStateConstraint());

			elements.put(StateUpdate_3017,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getStateUpdate());

			elements.put(HardwareMeasurement_3018,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getHardwareMeasurement());

			elements.put(HardwareAdapter_3030,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getHardwareAdapter());

			elements.put(HardwareCommand_3020,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getHardwareCommand());

			elements.put(HardwareMeasurement_3021,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getHardwareMeasurement());

			elements.put(Device_3024,
					stateAnalysis.StateAnalysisPackage.eINSTANCE.getDevice());

			elements.put(DeviceCommand_3025,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getDeviceCommand());

			elements.put(DeviceMeasurement_3026,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getDeviceMeasurement());

			elements.put(DataCollection_3004,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getDataCollection());

			elements.put(QosPolicy_3005,
					stateAnalysis.StateAnalysisPackage.eINSTANCE.getQosPolicy());

			elements.put(DataProduct_3006,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getDataProduct());

			elements.put(ControllerDelegates_4001,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getController_Delegates());

			elements.put(EstimatorDistilledMeasurements_4002,
					stateAnalysis.StateAnalysisPackage.eINSTANCE
							.getEstimator_DistilledMeasurements());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(System_1000);
			KNOWN_ELEMENT_TYPES.add(Subsystem_2001);
			KNOWN_ELEMENT_TYPES.add(DeploymentSet_3001);
			KNOWN_ELEMENT_TYPES.add(Deployment_3002);
			KNOWN_ELEMENT_TYPES.add(StateVariable_3027);
			KNOWN_ELEMENT_TYPES.add(StateVariable_3011);
			KNOWN_ELEMENT_TYPES.add(StateConstraint_3008);
			KNOWN_ELEMENT_TYPES.add(StateConstraint_3009);
			KNOWN_ELEMENT_TYPES.add(StateUpdate_3010);
			KNOWN_ELEMENT_TYPES.add(Controller_3028);
			KNOWN_ELEMENT_TYPES.add(StateConstraint_3013);
			KNOWN_ELEMENT_TYPES.add(HardwareCommand_3014);
			KNOWN_ELEMENT_TYPES.add(Estimator_3029);
			KNOWN_ELEMENT_TYPES.add(StateConstraint_3016);
			KNOWN_ELEMENT_TYPES.add(StateUpdate_3017);
			KNOWN_ELEMENT_TYPES.add(HardwareMeasurement_3018);
			KNOWN_ELEMENT_TYPES.add(HardwareAdapter_3030);
			KNOWN_ELEMENT_TYPES.add(HardwareCommand_3020);
			KNOWN_ELEMENT_TYPES.add(HardwareMeasurement_3021);
			KNOWN_ELEMENT_TYPES.add(Device_3024);
			KNOWN_ELEMENT_TYPES.add(DeviceCommand_3025);
			KNOWN_ELEMENT_TYPES.add(DeviceMeasurement_3026);
			KNOWN_ELEMENT_TYPES.add(DataCollection_3004);
			KNOWN_ELEMENT_TYPES.add(QosPolicy_3005);
			KNOWN_ELEMENT_TYPES.add(DataProduct_3006);
			KNOWN_ELEMENT_TYPES.add(ControllerDelegates_4001);
			KNOWN_ELEMENT_TYPES.add(EstimatorDistilledMeasurements_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case stateAnalysis.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return System_1000;
		case stateAnalysis.diagram.edit.parts.SubsystemEditPart.VISUAL_ID:
			return Subsystem_2001;
		case stateAnalysis.diagram.edit.parts.DeploymentSetEditPart.VISUAL_ID:
			return DeploymentSet_3001;
		case stateAnalysis.diagram.edit.parts.DeploymentEditPart.VISUAL_ID:
			return Deployment_3002;
		case stateAnalysis.diagram.edit.parts.StateVariableEditPart.VISUAL_ID:
			return StateVariable_3027;
		case stateAnalysis.diagram.edit.parts.StateVariable2EditPart.VISUAL_ID:
			return StateVariable_3011;
		case stateAnalysis.diagram.edit.parts.StateConstraintEditPart.VISUAL_ID:
			return StateConstraint_3008;
		case stateAnalysis.diagram.edit.parts.StateConstraint2EditPart.VISUAL_ID:
			return StateConstraint_3009;
		case stateAnalysis.diagram.edit.parts.StateUpdateEditPart.VISUAL_ID:
			return StateUpdate_3010;
		case stateAnalysis.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return Controller_3028;
		case stateAnalysis.diagram.edit.parts.StateConstraint3EditPart.VISUAL_ID:
			return StateConstraint_3013;
		case stateAnalysis.diagram.edit.parts.HardwareCommandEditPart.VISUAL_ID:
			return HardwareCommand_3014;
		case stateAnalysis.diagram.edit.parts.EstimatorEditPart.VISUAL_ID:
			return Estimator_3029;
		case stateAnalysis.diagram.edit.parts.StateConstraint4EditPart.VISUAL_ID:
			return StateConstraint_3016;
		case stateAnalysis.diagram.edit.parts.StateUpdate2EditPart.VISUAL_ID:
			return StateUpdate_3017;
		case stateAnalysis.diagram.edit.parts.HardwareMeasurementEditPart.VISUAL_ID:
			return HardwareMeasurement_3018;
		case stateAnalysis.diagram.edit.parts.HardwareAdapterEditPart.VISUAL_ID:
			return HardwareAdapter_3030;
		case stateAnalysis.diagram.edit.parts.HardwareCommand2EditPart.VISUAL_ID:
			return HardwareCommand_3020;
		case stateAnalysis.diagram.edit.parts.HardwareMeasurement2EditPart.VISUAL_ID:
			return HardwareMeasurement_3021;
		case stateAnalysis.diagram.edit.parts.DeviceEditPart.VISUAL_ID:
			return Device_3024;
		case stateAnalysis.diagram.edit.parts.DeviceCommandEditPart.VISUAL_ID:
			return DeviceCommand_3025;
		case stateAnalysis.diagram.edit.parts.DeviceMeasurementEditPart.VISUAL_ID:
			return DeviceMeasurement_3026;
		case stateAnalysis.diagram.edit.parts.DataCollectionEditPart.VISUAL_ID:
			return DataCollection_3004;
		case stateAnalysis.diagram.edit.parts.QosPolicyEditPart.VISUAL_ID:
			return QosPolicy_3005;
		case stateAnalysis.diagram.edit.parts.DataProductEditPart.VISUAL_ID:
			return DataProduct_3006;
		case stateAnalysis.diagram.edit.parts.ControllerDelegatesEditPart.VISUAL_ID:
			return ControllerDelegates_4001;
		case stateAnalysis.diagram.edit.parts.EstimatorDistilledMeasurementsEditPart.VISUAL_ID:
			return EstimatorDistilledMeasurements_4002;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return stateAnalysis.diagram.providers.StateAnalysisElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return stateAnalysis.diagram.providers.StateAnalysisElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return stateAnalysis.diagram.providers.StateAnalysisElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
