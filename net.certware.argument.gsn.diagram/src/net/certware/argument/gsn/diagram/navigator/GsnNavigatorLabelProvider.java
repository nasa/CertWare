/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.gsn.diagram.navigator;

import net.certware.argument.gsn.ArgumentDiagram;
import net.certware.argument.gsn.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.gsn.diagram.edit.parts.GoalEditPart;
import net.certware.argument.gsn.diagram.edit.parts.GoalIdentifierEditPart;
import net.certware.argument.gsn.diagram.edit.parts.JustificationEditPart;
import net.certware.argument.gsn.diagram.edit.parts.JustificationIdentifierEditPart;
import net.certware.argument.gsn.diagram.edit.parts.StrategyGoalEditPart;
import net.certware.argument.gsn.diagram.edit.parts.StrategyJustificationEditPart;
import net.certware.argument.gsn.diagram.part.GsnDiagramEditorPlugin;
import net.certware.argument.gsn.diagram.part.GsnVisualIDRegistry;
import net.certware.argument.gsn.diagram.providers.GsnElementTypes;
import net.certware.argument.gsn.diagram.providers.GsnParserProvider;

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
public class GsnNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		GsnDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		GsnDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GsnNavigatorItem
				&& !isOwnView(((GsnNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof GsnNavigatorGroup) {
			GsnNavigatorGroup group = (GsnNavigatorGroup) element;
			return GsnDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof GsnNavigatorItem) {
			GsnNavigatorItem navigatorItem = (GsnNavigatorItem) element;
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
		switch (GsnVisualIDRegistry.getVisualID(view)) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.certware.net/gsn?ArgumentDiagram", GsnElementTypes.ArgumentDiagram_1000); //$NON-NLS-1$
		case JustificationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/gsn?Justification", GsnElementTypes.Justification_2008); //$NON-NLS-1$
		case GoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/gsn?Goal", GsnElementTypes.Goal_2009); //$NON-NLS-1$
		case StrategyJustificationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/gsn?Strategy?justification", GsnElementTypes.StrategyJustification_4001); //$NON-NLS-1$
		case StrategyGoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/gsn?Strategy?goal", GsnElementTypes.StrategyGoal_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GsnDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& GsnElementTypes.isKnownElementType(elementType)) {
			image = GsnElementTypes.getImage(elementType);
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
		if (element instanceof GsnNavigatorGroup) {
			GsnNavigatorGroup group = (GsnNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GsnNavigatorItem) {
			GsnNavigatorItem navigatorItem = (GsnNavigatorItem) element;
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
		switch (GsnVisualIDRegistry.getVisualID(view)) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getArgumentDiagram_1000Text(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2008Text(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2009Text(view);
		case StrategyJustificationEditPart.VISUAL_ID:
			return getStrategyJustification_4001Text(view);
		case StrategyGoalEditPart.VISUAL_ID:
			return getStrategyGoal_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getStrategyJustification_4001Text(View view) {
		IParser parser = GsnParserProvider.getParser(
				GsnElementTypes.StrategyJustification_4001,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStrategyGoal_4002Text(View view) {
		IParser parser = GsnParserProvider.getParser(
				GsnElementTypes.StrategyGoal_4002,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
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
			GsnDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJustification_2008Text(View view) {
		IParser parser = GsnParserProvider.getParser(
				GsnElementTypes.Justification_2008,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry
						.getType(JustificationIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGoal_2009Text(View view) {
		IParser parser = GsnParserProvider.getParser(GsnElementTypes.Goal_2009,
				view.getElement() != null ? view.getElement() : view,
				GsnVisualIDRegistry.getType(GoalIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GsnDiagramEditorPlugin.getInstance().logError(
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
		return ArgumentDiagramEditPart.MODEL_ID.equals(GsnVisualIDRegistry
				.getModelID(view));
	}

}
