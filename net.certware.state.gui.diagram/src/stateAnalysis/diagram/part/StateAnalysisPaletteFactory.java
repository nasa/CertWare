/*
 * 
 */
package stateAnalysis.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class StateAnalysisPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				stateAnalysis.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createComponent1CreationTool());
		paletteContainer.add(createController2CreationTool());
		paletteContainer.add(createDataCollection3CreationTool());
		paletteContainer.add(createDataProduct4CreationTool());
		paletteContainer.add(createDeployment5CreationTool());
		paletteContainer.add(createDeploymentSet6CreationTool());
		paletteContainer.add(createDevice7CreationTool());
		paletteContainer.add(createDeviceCommand8CreationTool());
		paletteContainer.add(createDeviceMeasurement9CreationTool());
		paletteContainer.add(createEstimator10CreationTool());
		paletteContainer.add(createHardwareAdapter11CreationTool());
		paletteContainer.add(createHardwareCommand12CreationTool());
		paletteContainer.add(createHardwareMeasurement13CreationTool());
		paletteContainer.add(createQoSPolicy14CreationTool());
		paletteContainer.add(createStateConstraint15CreationTool());
		paletteContainer.add(createStateUpdate16CreationTool());
		paletteContainer.add(createStateVariable17CreationTool());
		paletteContainer.add(createSubsystem18CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				stateAnalysis.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createDelegates1CreationTool());
		paletteContainer.add(createDistilledMeasurements2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.Component1CreationTool_title,
				stateAnalysis.diagram.part.Messages.Component1CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Component_3003));
		entry.setId("createComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Component_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createController2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.Controller2CreationTool_title,
				stateAnalysis.diagram.part.Messages.Controller2CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Controller_3012));
		entry.setId("createController2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Controller_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataCollection3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.DataCollection3CreationTool_title,
				stateAnalysis.diagram.part.Messages.DataCollection3CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DataCollection_3004));
		entry.setId("createDataCollection3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DataCollection_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataProduct4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.DataProduct4CreationTool_title,
				stateAnalysis.diagram.part.Messages.DataProduct4CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DataProduct_3006));
		entry.setId("createDataProduct4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DataProduct_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeployment5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.Deployment5CreationTool_title,
				stateAnalysis.diagram.part.Messages.Deployment5CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Deployment_3002));
		entry.setId("createDeployment5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Deployment_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeploymentSet6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.DeploymentSet6CreationTool_title,
				stateAnalysis.diagram.part.Messages.DeploymentSet6CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeploymentSet_3001));
		entry.setId("createDeploymentSet6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeploymentSet_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDevice7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.Device7CreationTool_title,
				stateAnalysis.diagram.part.Messages.Device7CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Device_3024));
		entry.setId("createDevice7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Device_3024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeviceCommand8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.DeviceCommand8CreationTool_title,
				stateAnalysis.diagram.part.Messages.DeviceCommand8CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeviceCommand_3025));
		entry.setId("createDeviceCommand8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeviceCommand_3025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeviceMeasurement9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.DeviceMeasurement9CreationTool_title,
				stateAnalysis.diagram.part.Messages.DeviceMeasurement9CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeviceMeasurement_3026));
		entry.setId("createDeviceMeasurement9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeviceMeasurement_3026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEstimator10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.Estimator10CreationTool_title,
				stateAnalysis.diagram.part.Messages.Estimator10CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Estimator_3015));
		entry.setId("createEstimator10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Estimator_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHardwareAdapter11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.HardwareAdapter11CreationTool_title,
				stateAnalysis.diagram.part.Messages.HardwareAdapter11CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareAdapter_3019));
		entry.setId("createHardwareAdapter11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareAdapter_3019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHardwareCommand12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareCommand_3014);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareCommand_3020);
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.HardwareCommand12CreationTool_title,
				stateAnalysis.diagram.part.Messages.HardwareCommand12CreationTool_desc,
				types);
		entry.setId("createHardwareCommand12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareCommand_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHardwareMeasurement13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareMeasurement_3018);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareMeasurement_3021);
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.HardwareMeasurement13CreationTool_title,
				stateAnalysis.diagram.part.Messages.HardwareMeasurement13CreationTool_desc,
				types);
		entry.setId("createHardwareMeasurement13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareMeasurement_3018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createQoSPolicy14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.QoSPolicy14CreationTool_title,
				stateAnalysis.diagram.part.Messages.QoSPolicy14CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.QosPolicy_3005));
		entry.setId("createQoSPolicy14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.QosPolicy_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStateConstraint15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3008);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3009);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3013);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3016);
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.StateConstraint15CreationTool_title,
				stateAnalysis.diagram.part.Messages.StateConstraint15CreationTool_desc,
				types);
		entry.setId("createStateConstraint15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStateUpdate16CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateUpdate_3010);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateUpdate_3017);
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.StateUpdate16CreationTool_title,
				stateAnalysis.diagram.part.Messages.StateUpdate16CreationTool_desc,
				types);
		entry.setId("createStateUpdate16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateUpdate_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStateVariable17CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3007);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3011);
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.StateVariable17CreationTool_title,
				stateAnalysis.diagram.part.Messages.StateVariable17CreationTool_desc,
				types);
		entry.setId("createStateVariable17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubsystem18CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.Subsystem18CreationTool_title,
				stateAnalysis.diagram.part.Messages.Subsystem18CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Subsystem_2001));
		entry.setId("createSubsystem18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Subsystem_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDelegates1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				stateAnalysis.diagram.part.Messages.Delegates1CreationTool_title,
				stateAnalysis.diagram.part.Messages.Delegates1CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.ControllerDelegates_4001));
		entry.setId("createDelegates1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.ControllerDelegates_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDistilledMeasurements2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				stateAnalysis.diagram.part.Messages.DistilledMeasurements2CreationTool_title,
				stateAnalysis.diagram.part.Messages.DistilledMeasurements2CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.EstimatorDistilledMeasurements_4002));
		entry.setId("createDistilledMeasurements2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.EstimatorDistilledMeasurements_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
