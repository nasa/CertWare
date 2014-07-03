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
		paletteContainer.add(createController1CreationTool());
		paletteContainer.add(createDataCollection2CreationTool());
		paletteContainer.add(createDataProduct3CreationTool());
		paletteContainer.add(createDeployment4CreationTool());
		paletteContainer.add(createDeploymentSet5CreationTool());
		paletteContainer.add(createDevice6CreationTool());
		paletteContainer.add(createDeviceCommand7CreationTool());
		paletteContainer.add(createDeviceMeasurement8CreationTool());
		paletteContainer.add(createEstimator9CreationTool());
		paletteContainer.add(createHardwareAdapter10CreationTool());
		paletteContainer.add(createHardwareCommand11CreationTool());
		paletteContainer.add(createHardwareMeasurement12CreationTool());
		paletteContainer.add(createQoSPolicy13CreationTool());
		paletteContainer.add(createStateConstraint14CreationTool());
		paletteContainer.add(createStateUpdate15CreationTool());
		paletteContainer.add(createStateVariable16CreationTool());
		paletteContainer.add(createSubsystem17CreationTool());
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
	private ToolEntry createController1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.Controller1CreationTool_title,
				stateAnalysis.diagram.part.Messages.Controller1CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Controller_3028));
		entry.setId("createController1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Controller_3028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataCollection2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.DataCollection2CreationTool_title,
				stateAnalysis.diagram.part.Messages.DataCollection2CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DataCollection_3004));
		entry.setId("createDataCollection2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DataCollection_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataProduct3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.DataProduct3CreationTool_title,
				stateAnalysis.diagram.part.Messages.DataProduct3CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DataProduct_3006));
		entry.setId("createDataProduct3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DataProduct_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeployment4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.Deployment4CreationTool_title,
				stateAnalysis.diagram.part.Messages.Deployment4CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Deployment_3002));
		entry.setId("createDeployment4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Deployment_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeploymentSet5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.DeploymentSet5CreationTool_title,
				stateAnalysis.diagram.part.Messages.DeploymentSet5CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeploymentSet_3001));
		entry.setId("createDeploymentSet5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeploymentSet_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDevice6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.Device6CreationTool_title,
				stateAnalysis.diagram.part.Messages.Device6CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Device_3024));
		entry.setId("createDevice6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Device_3024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeviceCommand7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.DeviceCommand7CreationTool_title,
				stateAnalysis.diagram.part.Messages.DeviceCommand7CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeviceCommand_3025));
		entry.setId("createDeviceCommand7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeviceCommand_3025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeviceMeasurement8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.DeviceMeasurement8CreationTool_title,
				stateAnalysis.diagram.part.Messages.DeviceMeasurement8CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeviceMeasurement_3026));
		entry.setId("createDeviceMeasurement8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.DeviceMeasurement_3026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEstimator9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.Estimator9CreationTool_title,
				stateAnalysis.diagram.part.Messages.Estimator9CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Estimator_3029));
		entry.setId("createEstimator9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Estimator_3029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHardwareAdapter10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.HardwareAdapter10CreationTool_title,
				stateAnalysis.diagram.part.Messages.HardwareAdapter10CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareAdapter_3030));
		entry.setId("createHardwareAdapter10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareAdapter_3030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHardwareCommand11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareCommand_3014);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareCommand_3020);
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.HardwareCommand11CreationTool_title,
				stateAnalysis.diagram.part.Messages.HardwareCommand11CreationTool_desc,
				types);
		entry.setId("createHardwareCommand11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareCommand_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHardwareMeasurement12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareMeasurement_3018);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareMeasurement_3021);
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.HardwareMeasurement12CreationTool_title,
				stateAnalysis.diagram.part.Messages.HardwareMeasurement12CreationTool_desc,
				types);
		entry.setId("createHardwareMeasurement12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareMeasurement_3018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createQoSPolicy13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.QoSPolicy13CreationTool_title,
				stateAnalysis.diagram.part.Messages.QoSPolicy13CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.QosPolicy_3005));
		entry.setId("createQoSPolicy13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.QosPolicy_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStateConstraint14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3008);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3009);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3013);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3016);
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.StateConstraint14CreationTool_title,
				stateAnalysis.diagram.part.Messages.StateConstraint14CreationTool_desc,
				types);
		entry.setId("createStateConstraint14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStateUpdate15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateUpdate_3010);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateUpdate_3017);
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.StateUpdate15CreationTool_title,
				stateAnalysis.diagram.part.Messages.StateUpdate15CreationTool_desc,
				types);
		entry.setId("createStateUpdate15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateUpdate_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStateVariable16CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3027);
		types.add(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3011);
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.StateVariable16CreationTool_title,
				stateAnalysis.diagram.part.Messages.StateVariable16CreationTool_desc,
				types);
		entry.setId("createStateVariable16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(stateAnalysis.diagram.providers.StateAnalysisElementTypes
				.getImageDescriptor(stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubsystem17CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				stateAnalysis.diagram.part.Messages.Subsystem17CreationTool_title,
				stateAnalysis.diagram.part.Messages.Subsystem17CreationTool_desc,
				Collections
						.singletonList(stateAnalysis.diagram.providers.StateAnalysisElementTypes.Subsystem_2001));
		entry.setId("createSubsystem17CreationTool"); //$NON-NLS-1$
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
