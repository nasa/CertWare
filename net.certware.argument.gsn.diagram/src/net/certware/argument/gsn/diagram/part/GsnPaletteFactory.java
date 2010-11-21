/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.gsn.diagram.part;

import java.util.Collections;
import java.util.List;

import net.certware.argument.gsn.diagram.providers.GsnElementTypes;

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
public class GsnPaletteFactory {

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
		paletteContainer.add(createAssumption1CreationTool());
		paletteContainer.add(createContext2CreationTool());
		paletteContainer.add(createGoal3CreationTool());
		paletteContainer.add(createJustification4CreationTool());
		paletteContainer.add(createSolution5CreationTool());
		paletteContainer.add(createStrategy6CreationTool());
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
		paletteContainer.add(createGoal1CreationTool());
		paletteContainer.add(createJustification2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssumption1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Assumption1CreationTool_title,
				Messages.Assumption1CreationTool_desc, null, null) {
		};
		entry.setId("createAssumption1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContext2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Context2CreationTool_title,
				Messages.Context2CreationTool_desc, null, null) {
		};
		entry.setId("createContext2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGoal3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Goal3CreationTool_title,
				Messages.Goal3CreationTool_desc,
				Collections.singletonList(GsnElementTypes.Goal_2009));
		entry.setId("createGoal3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes
				.getImageDescriptor(GsnElementTypes.Goal_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJustification4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Justification4CreationTool_title,
				Messages.Justification4CreationTool_desc,
				Collections.singletonList(GsnElementTypes.Justification_2008));
		entry.setId("createJustification4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes
				.getImageDescriptor(GsnElementTypes.Justification_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolution5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Solution5CreationTool_title,
				Messages.Solution5CreationTool_desc, null, null) {
		};
		entry.setId("createSolution5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStrategy6CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Strategy6CreationTool_title,
				Messages.Strategy6CreationTool_desc, null, null) {
		};
		entry.setId("createStrategy6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGoal1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Goal1CreationTool_title,
				Messages.Goal1CreationTool_desc,
				Collections.singletonList(GsnElementTypes.StrategyGoal_4002));
		entry.setId("createGoal1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes
				.getImageDescriptor(GsnElementTypes.StrategyGoal_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJustification2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Justification2CreationTool_title,
				Messages.Justification2CreationTool_desc,
				Collections
						.singletonList(GsnElementTypes.StrategyJustification_4001));
		entry.setId("createJustification2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GsnElementTypes
				.getImageDescriptor(GsnElementTypes.StrategyJustification_4001));
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
