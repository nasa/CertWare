package net.certware.argument.gsz.diagram.part;

import java.util.Collections;
import java.util.List;

import net.certware.argument.gsz.diagram.providers.GszElementTypes;

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
public class GszPaletteFactory {

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
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAssumptionNode1CreationTool());
		paletteContainer.add(createContextNode2CreationTool());
		paletteContainer.add(createEvidence3CreationTool());
		paletteContainer.add(createGoalNode4CreationTool());
		paletteContainer.add(createJustificationNode5CreationTool());
		paletteContainer.add(createSolutionNode6CreationTool());
		paletteContainer.add(createStrategyNode7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createGoalwithAssumption1CreationTool());
		paletteContainer.add(createGoalwithContext2CreationTool());
		paletteContainer.add(createGoalwithSolution3CreationTool());
		paletteContainer.add(createGoalwithStrategy4CreationTool());
		paletteContainer.add(createGoalwithSubGoal5CreationTool());
		paletteContainer.add(createSolutionwithContext6CreationTool());
		paletteContainer.add(createSolutionwithEvidence7CreationTool());
		paletteContainer.add(createStrategywithContext8CreationTool());
		paletteContainer.add(createStrategywithGoal9CreationTool());
		paletteContainer.add(createStrategywithJustification10CreationTool());
		paletteContainer.add(createStrategywithSolution11CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssumptionNode1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AssumptionNode1CreationTool_title,
				Messages.AssumptionNode1CreationTool_desc,
				Collections.singletonList(GszElementTypes.Assumption_2007));
		entry.setId("createAssumptionNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContextNode2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ContextNode2CreationTool_title,
				Messages.ContextNode2CreationTool_desc,
				Collections.singletonList(GszElementTypes.Context_2006));
		entry.setId("createContextNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEvidence3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Evidence3CreationTool_title,
				Messages.Evidence3CreationTool_desc,
				Collections.singletonList(GszElementTypes.Evidence_2003));
		entry.setId("createEvidence3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rectangle.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rectangle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGoalNode4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.GoalNode4CreationTool_title,
				Messages.GoalNode4CreationTool_desc,
				Collections.singletonList(GszElementTypes.Goal_2001));
		entry.setId("createGoalNode4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/ellipse.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/ellipse.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJustificationNode5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.JustificationNode5CreationTool_title,
				Messages.JustificationNode5CreationTool_desc,
				Collections.singletonList(GszElementTypes.Justification_2005));
		entry.setId("createJustificationNode5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolutionNode6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SolutionNode6CreationTool_title,
				Messages.SolutionNode6CreationTool_desc,
				Collections.singletonList(GszElementTypes.Solution_2002));
		entry.setId("createSolutionNode6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/circle.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/circle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrategyNode7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StrategyNode7CreationTool_title,
				Messages.StrategyNode7CreationTool_desc,
				Collections.singletonList(GszElementTypes.Strategy_2008));
		entry.setId("createStrategyNode7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/parallelogram.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/parallelogram.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGoalwithAssumption1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.GoalwithAssumption1CreationTool_title,
				Messages.GoalwithAssumption1CreationTool_desc,
				Collections.singletonList(GszElementTypes.GoalAssumptions_4004));
		entry.setId("createGoalwithAssumption1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGoalwithContext2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.GoalwithContext2CreationTool_title,
				Messages.GoalwithContext2CreationTool_desc,
				Collections
						.singletonList(GszElementTypes.GoalGoalContexts_4003));
		entry.setId("createGoalwithContext2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGoalwithSolution3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.GoalwithSolution3CreationTool_title,
				Messages.GoalwithSolution3CreationTool_desc,
				Collections
						.singletonList(GszElementTypes.GoalGoalSolutions_4005));
		entry.setId("createGoalwithSolution3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGoalwithStrategy4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.GoalwithStrategy4CreationTool_title,
				Messages.GoalwithStrategy4CreationTool_desc,
				Collections.singletonList(GszElementTypes.GoalStrategies_4002));
		entry.setId("createGoalwithStrategy4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGoalwithSubGoal5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.GoalwithSubGoal5CreationTool_title,
				Messages.GoalwithSubGoal5CreationTool_desc,
				Collections.singletonList(GszElementTypes.GoalSubGoals_4001));
		entry.setId("createGoalwithSubGoal5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolutionwithContext6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SolutionwithContext6CreationTool_title,
				Messages.SolutionwithContext6CreationTool_desc,
				Collections
						.singletonList(GszElementTypes.SolutionSolutionContexts_4011));
		entry.setId("createSolutionwithContext6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolutionwithEvidence7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SolutionwithEvidence7CreationTool_title,
				Messages.SolutionwithEvidence7CreationTool_desc,
				Collections
						.singletonList(GszElementTypes.SolutionSolutionEvidence_4010));
		entry.setId("createSolutionwithEvidence7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrategywithContext8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.StrategywithContext8CreationTool_title,
				Messages.StrategywithContext8CreationTool_desc,
				Collections
						.singletonList(GszElementTypes.StrategyStrategyContexts_4008));
		entry.setId("createStrategywithContext8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrategywithGoal9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.StrategywithGoal9CreationTool_title,
				Messages.StrategywithGoal9CreationTool_desc,
				Collections.singletonList(GszElementTypes.StrategyGoals_4006));
		entry.setId("createStrategywithGoal9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrategywithJustification10CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.StrategywithJustification10CreationTool_title,
				Messages.StrategywithJustification10CreationTool_desc,
				Collections
						.singletonList(GszElementTypes.StrategyJustifications_4007));
		entry.setId("createStrategywithJustification10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrategywithSolution11CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.StrategywithSolution11CreationTool_title,
				Messages.StrategywithSolution11CreationTool_desc,
				Collections
						.singletonList(GszElementTypes.StrategyStrategySolutions_4009));
		entry.setId("createStrategywithSolution11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(GszDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
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
