/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz.diagram.part;

import java.util.Collections;
import java.util.List;

import net.certware.argument.euz.diagram.providers.EuzElementTypes;

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
public class EuzPaletteFactory {

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
		paletteContainer.add(createArgumentNode1CreationTool());
		paletteContainer.add(createAssumptionNode2CreationTool());
		paletteContainer.add(createContextNode3CreationTool());
		paletteContainer.add(createCriteriaNode4CreationTool());
		paletteContainer.add(createEvidenceNode5CreationTool());
		paletteContainer.add(createJustificationNode6CreationTool());
		paletteContainer.add(createSolutionNode7CreationTool());
		paletteContainer.add(createStrategyNode8CreationTool());
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
		paletteContainer.add(createArgumentwithAssumption1CreationTool());
		paletteContainer.add(createArgumentwithContext2CreationTool());
		paletteContainer.add(createArgumentwithCriteria3CreationTool());
		paletteContainer.add(createArgumentwithJustification4CreationTool());
		paletteContainer.add(createArgumentwithSolution5CreationTool());
		paletteContainer.add(createArgumentwithStrategy6CreationTool());
		paletteContainer.add(createArgumentwithSubArgument7CreationTool());
		paletteContainer.add(createContextwithAssumption8CreationTool());
		paletteContainer.add(createCriteriawithAssumption9CreationTool());
		paletteContainer.add(createCriteriawithContext10CreationTool());
		paletteContainer.add(createCriteriawithContext11CreationTool());
		paletteContainer.add(createSolutionwithContext12CreationTool());
		paletteContainer.add(createSolutionwithCriteria13CreationTool());
		paletteContainer.add(createSolutionwithEvidence14CreationTool());
		paletteContainer.add(createStrategywithArgument15CreationTool());
		paletteContainer.add(createStrategywithAssumption16CreationTool());
		paletteContainer.add(createStrategywithAssumption17CreationTool());
		paletteContainer.add(createStrategywithCriteria18CreationTool());
		paletteContainer.add(createStrategywithJustification19CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgumentNode1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ArgumentNode1CreationTool_title,
				Messages.ArgumentNode1CreationTool_desc,
				Collections.singletonList(EuzElementTypes.Argument_2001));
		entry.setId("createArgumentNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rectangle.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rectangle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssumptionNode2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AssumptionNode2CreationTool_title,
				Messages.AssumptionNode2CreationTool_desc,
				Collections.singletonList(EuzElementTypes.Assumption_2005));
		entry.setId("createAssumptionNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContextNode3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ContextNode3CreationTool_title,
				Messages.ContextNode3CreationTool_desc,
				Collections.singletonList(EuzElementTypes.Context_2007));
		entry.setId("createContextNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCriteriaNode4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CriteriaNode4CreationTool_title,
				Messages.CriteriaNode4CreationTool_desc,
				Collections.singletonList(EuzElementTypes.Criteria_2008));
		entry.setId("createCriteriaNode4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEvidenceNode5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EvidenceNode5CreationTool_title,
				Messages.EvidenceNode5CreationTool_desc,
				Collections.singletonList(EuzElementTypes.Evidence_2003));
		entry.setId("createEvidenceNode5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/circle.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/circle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJustificationNode6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.JustificationNode6CreationTool_title,
				Messages.JustificationNode6CreationTool_desc,
				Collections.singletonList(EuzElementTypes.Justification_2006));
		entry.setId("createJustificationNode6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolutionNode7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SolutionNode7CreationTool_title,
				Messages.SolutionNode7CreationTool_desc,
				Collections.singletonList(EuzElementTypes.Solution_2002));
		entry.setId("createSolutionNode7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/circle.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/circle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrategyNode8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StrategyNode8CreationTool_title,
				Messages.StrategyNode8CreationTool_desc,
				Collections.singletonList(EuzElementTypes.Strategy_2004));
		entry.setId("createStrategyNode8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/parallelogram.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/parallelogram.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgumentwithAssumption1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ArgumentwithAssumption1CreationTool_title,
				Messages.ArgumentwithAssumption1CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.ArgumentArgumentAssumptions_4002));
		entry.setId("createArgumentwithAssumption1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgumentwithContext2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ArgumentwithContext2CreationTool_title,
				Messages.ArgumentwithContext2CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.ArgumentArgumentContexts_4003));
		entry.setId("createArgumentwithContext2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgumentwithCriteria3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ArgumentwithCriteria3CreationTool_title,
				Messages.ArgumentwithCriteria3CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.ArgumentArgumentCriteria_4005));
		entry.setId("createArgumentwithCriteria3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgumentwithJustification4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ArgumentwithJustification4CreationTool_title,
				Messages.ArgumentwithJustification4CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.ArgumentArgumentJustifications_4006));
		entry.setId("createArgumentwithJustification4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgumentwithSolution5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ArgumentwithSolution5CreationTool_title,
				Messages.ArgumentwithSolution5CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.ArgumentArgumentSolutions_4004));
		entry.setId("createArgumentwithSolution5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgumentwithStrategy6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ArgumentwithStrategy6CreationTool_title,
				Messages.ArgumentwithStrategy6CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.ArgumentArgumentStrategies_4001));
		entry.setId("createArgumentwithStrategy6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgumentwithSubArgument7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ArgumentwithSubArgument7CreationTool_title,
				Messages.ArgumentwithSubArgument7CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.ArgumentSubArguments_4017));
		entry.setId("createArgumentwithSubArgument7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContextwithAssumption8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ContextwithAssumption8CreationTool_title,
				Messages.ContextwithAssumption8CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.ContextContextAssumptions_4007));
		entry.setId("createContextwithAssumption8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCriteriawithAssumption9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.CriteriawithAssumption9CreationTool_title,
				Messages.CriteriawithAssumption9CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.CriteriaCriteriaAssumptions_4009));
		entry.setId("createCriteriawithAssumption9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCriteriawithContext10CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.CriteriawithContext10CreationTool_title,
				Messages.CriteriawithContext10CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.CriteriaCriteriaContexts_4008));
		entry.setId("createCriteriawithContext10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCriteriawithContext11CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.CriteriawithContext11CreationTool_title,
				Messages.CriteriawithContext11CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.StrategyStrategyContexts_4019));
		entry.setId("createCriteriawithContext11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolutionwithContext12CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SolutionwithContext12CreationTool_title,
				Messages.SolutionwithContext12CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.SolutionSolutionContexts_4014));
		entry.setId("createSolutionwithContext12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolutionwithCriteria13CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SolutionwithCriteria13CreationTool_title,
				Messages.SolutionwithCriteria13CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.SolutionSolutionCriteria_4016));
		entry.setId("createSolutionwithCriteria13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolutionwithEvidence14CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SolutionwithEvidence14CreationTool_title,
				Messages.SolutionwithEvidence14CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.SolutionSolutionEvidence_4015));
		entry.setId("createSolutionwithEvidence14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrategywithArgument15CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.StrategywithArgument15CreationTool_title,
				Messages.StrategywithArgument15CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.StrategyStrategyArguments_4010));
		entry.setId("createStrategywithArgument15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrategywithAssumption16CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.StrategywithAssumption16CreationTool_title,
				Messages.StrategywithAssumption16CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.StrategyStrategyAssumptions_4013));
		entry.setId("createStrategywithAssumption16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrategywithAssumption17CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.StrategywithAssumption17CreationTool_title,
				Messages.StrategywithAssumption17CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.StrategyStrategyStrategies_4018));
		entry.setId("createStrategywithAssumption17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrategywithCriteria18CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.StrategywithCriteria18CreationTool_title,
				Messages.StrategywithCriteria18CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.StrategyStrategyCriteria_4012));
		entry.setId("createStrategywithCriteria18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrategywithJustification19CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.StrategywithJustification19CreationTool_title,
				Messages.StrategywithJustification19CreationTool_desc,
				Collections
						.singletonList(EuzElementTypes.StrategyStrategyJustifications_4011));
		entry.setId("createStrategywithJustification19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EuzDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(EuzDiagramEditorPlugin
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
