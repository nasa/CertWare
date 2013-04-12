package net.certware.argument.caz.diagram.part;

import java.util.Collections;
import java.util.List;

import net.certware.argument.caz.diagram.providers.CazElementTypes;

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
public class CazPaletteFactory {

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
		paletteContainer.add(createClaimNode3CreationTool());
		paletteContainer.add(createContextNode4CreationTool());
		paletteContainer.add(createEvidenceNode5CreationTool());
		paletteContainer.add(createJustificationNode6CreationTool());
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
		paletteContainer.add(createArgumentwithClaim1CreationTool());
		paletteContainer.add(createArgumentwithContext2CreationTool());
		paletteContainer.add(createArgumentwithContext3CreationTool());
		paletteContainer.add(createArgumentwithEvidence4CreationTool());
		paletteContainer.add(createArgumentwithJustification5CreationTool());
		paletteContainer.add(createClaimwithAssumption6CreationTool());
		paletteContainer.add(createClaimwithContext7CreationTool());
		paletteContainer.add(createClaimwithEvidence8CreationTool());
		paletteContainer.add(createClaimwithStrategy9CreationTool());
		paletteContainer.add(createClaimwithSubClaim10CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgumentNode1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ArgumentNode1CreationTool_title,
				Messages.ArgumentNode1CreationTool_desc,
				Collections.singletonList(CazElementTypes.Argument_2003));
		entry.setId("createArgumentNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		entry.setLargeIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssumptionNode2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AssumptionNode2CreationTool_title,
				Messages.AssumptionNode2CreationTool_desc,
				Collections.singletonList(CazElementTypes.Assumption_2004));
		entry.setId("createAssumptionNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/circle.png")); //$NON-NLS-1$
		entry.setLargeIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/circle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClaimNode3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ClaimNode3CreationTool_title,
				Messages.ClaimNode3CreationTool_desc,
				Collections.singletonList(CazElementTypes.Claim_2001));
		entry.setId("createClaimNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/circle.png")); //$NON-NLS-1$
		entry.setLargeIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/circle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContextNode4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ContextNode4CreationTool_title,
				Messages.ContextNode4CreationTool_desc,
				Collections.singletonList(CazElementTypes.Context_2006));
		entry.setId("createContextNode4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/circle.png")); //$NON-NLS-1$
		entry.setLargeIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/circle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEvidenceNode5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EvidenceNode5CreationTool_title,
				Messages.EvidenceNode5CreationTool_desc,
				Collections.singletonList(CazElementTypes.Evidence_2002));
		entry.setId("createEvidenceNode5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rectangle.png")); //$NON-NLS-1$
		entry.setLargeIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rectangle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJustificationNode6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.JustificationNode6CreationTool_title,
				Messages.JustificationNode6CreationTool_desc,
				Collections.singletonList(CazElementTypes.Justification_2005));
		entry.setId("createJustificationNode6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		entry.setLargeIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/rounded-rectangle.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgumentwithClaim1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ArgumentwithClaim1CreationTool_title,
				Messages.ArgumentwithClaim1CreationTool_desc,
				Collections
						.singletonList(CazElementTypes.ArgumentArgumentClaims_4008));
		entry.setId("createArgumentwithClaim1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(CazDiagramEditorPlugin
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
						.singletonList(CazElementTypes.EvidenceEvidenceContexts_4009));
		entry.setId("createArgumentwithContext2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgumentwithContext3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ArgumentwithContext3CreationTool_title,
				Messages.ArgumentwithContext3CreationTool_desc,
				Collections
						.singletonList(CazElementTypes.EvidenceEvidence_4010));
		entry.setId("createArgumentwithContext3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgumentwithEvidence4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ArgumentwithEvidence4CreationTool_title,
				Messages.ArgumentwithEvidence4CreationTool_desc,
				Collections
						.singletonList(CazElementTypes.ArgumentArgumentEvidence_4007));
		entry.setId("createArgumentwithEvidence4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgumentwithJustification5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ArgumentwithJustification5CreationTool_title,
				Messages.ArgumentwithJustification5CreationTool_desc,
				Collections
						.singletonList(CazElementTypes.ArgumentArgumentJustification_4006));
		entry.setId("createArgumentwithJustification5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClaimwithAssumption6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ClaimwithAssumption6CreationTool_title,
				Messages.ClaimwithAssumption6CreationTool_desc,
				Collections
						.singletonList(CazElementTypes.ClaimClaimAssumptions_4002));
		entry.setId("createClaimwithAssumption6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClaimwithContext7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ClaimwithContext7CreationTool_title,
				Messages.ClaimwithContext7CreationTool_desc,
				Collections
						.singletonList(CazElementTypes.ClaimClaimContexts_4003));
		entry.setId("createClaimwithContext7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClaimwithEvidence8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ClaimwithEvidence8CreationTool_title,
				Messages.ClaimwithEvidence8CreationTool_desc,
				Collections
						.singletonList(CazElementTypes.ClaimClaimSolutions_4004));
		entry.setId("createClaimwithEvidence8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClaimwithStrategy9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ClaimwithStrategy9CreationTool_title,
				Messages.ClaimwithStrategy9CreationTool_desc,
				Collections
						.singletonList(CazElementTypes.ClaimClaimStrategies_4001));
		entry.setId("createClaimwithStrategy9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClaimwithSubClaim10CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ClaimwithSubClaim10CreationTool_title,
				Messages.ClaimwithSubClaim10CreationTool_desc,
				Collections.singletonList(CazElementTypes.ClaimSubClaims_4005));
		entry.setId("createClaimwithSubClaim10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CazDiagramEditorPlugin
				.findImageDescriptor("/net.certware.core.ui/icons/obj16/connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(CazDiagramEditorPlugin
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
