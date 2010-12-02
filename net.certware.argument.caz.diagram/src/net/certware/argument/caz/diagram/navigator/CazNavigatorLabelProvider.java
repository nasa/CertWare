package net.certware.argument.caz.diagram.navigator;

import net.certware.argument.caz.ArgumentDiagram;
import net.certware.argument.caz.diagram.edit.parts.ArgumentArgumentClaimsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentArgumentEvidenceEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentArgumentJustificationEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentIdentifierEditPart;
import net.certware.argument.caz.diagram.edit.parts.AssumptionEditPart;
import net.certware.argument.caz.diagram.edit.parts.AssumptionIdentifierEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimAssumptionsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimContextsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimSolutionsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimClaimStrategiesEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimIdentifierEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimSubClaimsEditPart;
import net.certware.argument.caz.diagram.edit.parts.ContextEditPart;
import net.certware.argument.caz.diagram.edit.parts.ContextIdentifierEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceEvidenceContextsEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceEvidenceEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceIdentifierEditPart;
import net.certware.argument.caz.diagram.edit.parts.JustificationEditPart;
import net.certware.argument.caz.diagram.edit.parts.JustificationIdentifierEditPart;
import net.certware.argument.caz.diagram.part.CazDiagramEditorPlugin;
import net.certware.argument.caz.diagram.part.CazVisualIDRegistry;
import net.certware.argument.caz.diagram.providers.CazElementTypes;
import net.certware.argument.caz.diagram.providers.CazParserProvider;

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
public class CazNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		CazDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		CazDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CazNavigatorItem
				&& !isOwnView(((CazNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof CazNavigatorGroup) {
			CazNavigatorGroup group = (CazNavigatorGroup) element;
			return CazDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof CazNavigatorItem) {
			CazNavigatorItem navigatorItem = (CazNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (CazVisualIDRegistry.getVisualID(view)) {
		case AssumptionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/caz?Assumption", CazElementTypes.Assumption_2004); //$NON-NLS-1$
		case ContextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/caz?Context", CazElementTypes.Context_2006); //$NON-NLS-1$
		case ArgumentArgumentEvidenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/caz?Argument?argumentEvidence", CazElementTypes.ArgumentArgumentEvidence_4007); //$NON-NLS-1$
		case ClaimSubClaimsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/caz?Claim?subClaims", CazElementTypes.ClaimSubClaims_4005); //$NON-NLS-1$
		case ArgumentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/caz?Argument", CazElementTypes.Argument_2003); //$NON-NLS-1$
		case ClaimClaimSolutionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/caz?Claim?claimSolutions", CazElementTypes.ClaimClaimSolutions_4004); //$NON-NLS-1$
		case EvidenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/caz?Evidence", CazElementTypes.Evidence_2002); //$NON-NLS-1$
		case EvidenceEvidenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/caz?Evidence?evidence", CazElementTypes.EvidenceEvidence_4010); //$NON-NLS-1$
		case ClaimEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/caz?Claim", CazElementTypes.Claim_2001); //$NON-NLS-1$
		case ClaimClaimStrategiesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/caz?Claim?claimStrategies", CazElementTypes.ClaimClaimStrategies_4001); //$NON-NLS-1$
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.certware.net/caz?ArgumentDiagram", CazElementTypes.ArgumentDiagram_1000); //$NON-NLS-1$
		case ArgumentArgumentJustificationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/caz?Argument?argumentJustification", CazElementTypes.ArgumentArgumentJustification_4006); //$NON-NLS-1$
		case ArgumentArgumentClaimsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/caz?Argument?argumentClaims", CazElementTypes.ArgumentArgumentClaims_4008); //$NON-NLS-1$
		case JustificationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/caz?Justification", CazElementTypes.Justification_2005); //$NON-NLS-1$
		case ClaimClaimAssumptionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/caz?Claim?claimAssumptions", CazElementTypes.ClaimClaimAssumptions_4002); //$NON-NLS-1$
		case ClaimClaimContextsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/caz?Claim?claimContexts", CazElementTypes.ClaimClaimContexts_4003); //$NON-NLS-1$
		case EvidenceEvidenceContextsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/caz?Evidence?evidenceContexts", CazElementTypes.EvidenceEvidenceContexts_4009); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CazDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& CazElementTypes.isKnownElementType(elementType)) {
			image = CazElementTypes.getImage(elementType);
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
		if (element instanceof CazNavigatorGroup) {
			CazNavigatorGroup group = (CazNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CazNavigatorItem) {
			CazNavigatorItem navigatorItem = (CazNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
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
		switch (CazVisualIDRegistry.getVisualID(view)) {
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2004Text(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2006Text(view);
		case ArgumentArgumentEvidenceEditPart.VISUAL_ID:
			return getArgumentArgumentEvidence_4007Text(view);
		case ClaimSubClaimsEditPart.VISUAL_ID:
			return getClaimSubClaims_4005Text(view);
		case ArgumentEditPart.VISUAL_ID:
			return getArgument_2003Text(view);
		case ClaimClaimSolutionsEditPart.VISUAL_ID:
			return getClaimClaimSolutions_4004Text(view);
		case EvidenceEditPart.VISUAL_ID:
			return getEvidence_2002Text(view);
		case EvidenceEvidenceEditPart.VISUAL_ID:
			return getEvidenceEvidence_4010Text(view);
		case ClaimEditPart.VISUAL_ID:
			return getClaim_2001Text(view);
		case ClaimClaimStrategiesEditPart.VISUAL_ID:
			return getClaimClaimStrategies_4001Text(view);
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getArgumentDiagram_1000Text(view);
		case ArgumentArgumentJustificationEditPart.VISUAL_ID:
			return getArgumentArgumentJustification_4006Text(view);
		case ArgumentArgumentClaimsEditPart.VISUAL_ID:
			return getArgumentArgumentClaims_4008Text(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2005Text(view);
		case ClaimClaimAssumptionsEditPart.VISUAL_ID:
			return getClaimClaimAssumptions_4002Text(view);
		case ClaimClaimContextsEditPart.VISUAL_ID:
			return getClaimClaimContexts_4003Text(view);
		case EvidenceEvidenceContextsEditPart.VISUAL_ID:
			return getEvidenceEvidenceContexts_4009Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getArgumentArgumentClaims_4008Text(View view) {
		IParser parser = CazParserProvider.getParser(
				CazElementTypes.ArgumentArgumentClaims_4008,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CazDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEvidence_2002Text(View view) {
		IParser parser = CazParserProvider.getParser(
				CazElementTypes.Evidence_2002,
				view.getElement() != null ? view.getElement() : view,
				CazVisualIDRegistry
						.getType(EvidenceIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CazDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentArgumentJustification_4006Text(View view) {
		IParser parser = CazParserProvider.getParser(
				CazElementTypes.ArgumentArgumentJustification_4006,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CazDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentArgumentEvidence_4007Text(View view) {
		IParser parser = CazParserProvider.getParser(
				CazElementTypes.ArgumentArgumentEvidence_4007,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CazDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssumption_2004Text(View view) {
		IParser parser = CazParserProvider.getParser(
				CazElementTypes.Assumption_2004,
				view.getElement() != null ? view.getElement() : view,
				CazVisualIDRegistry
						.getType(AssumptionIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CazDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJustification_2005Text(View view) {
		IParser parser = CazParserProvider.getParser(
				CazElementTypes.Justification_2005,
				view.getElement() != null ? view.getElement() : view,
				CazVisualIDRegistry
						.getType(JustificationIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CazDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClaimClaimAssumptions_4002Text(View view) {
		IParser parser = CazParserProvider.getParser(
				CazElementTypes.ClaimClaimAssumptions_4002,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CazDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgument_2003Text(View view) {
		IParser parser = CazParserProvider.getParser(
				CazElementTypes.Argument_2003,
				view.getElement() != null ? view.getElement() : view,
				CazVisualIDRegistry
						.getType(ArgumentIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CazDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClaimSubClaims_4005Text(View view) {
		IParser parser = CazParserProvider.getParser(
				CazElementTypes.ClaimSubClaims_4005,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CazDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClaimClaimStrategies_4001Text(View view) {
		IParser parser = CazParserProvider.getParser(
				CazElementTypes.ClaimClaimStrategies_4001,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CazDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClaimClaimSolutions_4004Text(View view) {
		IParser parser = CazParserProvider.getParser(
				CazElementTypes.ClaimClaimSolutions_4004,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CazDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEvidenceEvidence_4010Text(View view) {
		IParser parser = CazParserProvider.getParser(
				CazElementTypes.EvidenceEvidence_4010,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CazDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentDiagram_1000Text(View view) {
		ArgumentDiagram domainModelElement = (ArgumentDiagram) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getVersion();
		} else {
			CazDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClaim_2001Text(View view) {
		IParser parser = CazParserProvider.getParser(
				CazElementTypes.Claim_2001,
				view.getElement() != null ? view.getElement() : view,
				CazVisualIDRegistry.getType(ClaimIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CazDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEvidenceEvidenceContexts_4009Text(View view) {
		IParser parser = CazParserProvider.getParser(
				CazElementTypes.EvidenceEvidenceContexts_4009,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CazDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClaimClaimContexts_4003Text(View view) {
		IParser parser = CazParserProvider.getParser(
				CazElementTypes.ClaimClaimContexts_4003,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CazDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContext_2006Text(View view) {
		IParser parser = CazParserProvider.getParser(
				CazElementTypes.Context_2006,
				view.getElement() != null ? view.getElement() : view,
				CazVisualIDRegistry
						.getType(ContextIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CazDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
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
		return ArgumentDiagramEditPart.MODEL_ID.equals(CazVisualIDRegistry
				.getModelID(view));
	}

}
