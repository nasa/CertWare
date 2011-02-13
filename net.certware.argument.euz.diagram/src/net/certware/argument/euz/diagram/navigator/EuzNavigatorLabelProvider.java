/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz.diagram.navigator;

import net.certware.argument.euz.ArgumentDiagram;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentCriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentJustificationsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentSolutionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentStrategiesEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentSubArgumentsEditPart;
import net.certware.argument.euz.diagram.edit.parts.AssumptionEditPart;
import net.certware.argument.euz.diagram.edit.parts.AssumptionIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.ContextContextAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ContextEditPart;
import net.certware.argument.euz.diagram.edit.parts.ContextIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaCriteriaAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaCriteriaContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.EvidenceEditPart;
import net.certware.argument.euz.diagram.edit.parts.EvidenceIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.JustificationEditPart;
import net.certware.argument.euz.diagram.edit.parts.JustificationIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionCriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionEvidenceEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyArgumentsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyCriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyJustificationsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyStrategiesEditPart;
import net.certware.argument.euz.diagram.part.EuzDiagramEditorPlugin;
import net.certware.argument.euz.diagram.part.EuzVisualIDRegistry;
import net.certware.argument.euz.diagram.providers.EuzElementTypes;
import net.certware.argument.euz.diagram.providers.EuzParserProvider;

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
public class EuzNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		EuzDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		EuzDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof EuzNavigatorItem
				&& !isOwnView(((EuzNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof EuzNavigatorGroup) {
			EuzNavigatorGroup group = (EuzNavigatorGroup) element;
			return EuzDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof EuzNavigatorItem) {
			EuzNavigatorItem navigatorItem = (EuzNavigatorItem) element;
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
		switch (EuzVisualIDRegistry.getVisualID(view)) {
		case SolutionSolutionCriteriaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Solution?solutionCriteria", EuzElementTypes.SolutionSolutionCriteria_4016); //$NON-NLS-1$
		case ArgumentSubArgumentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Argument?subArguments", EuzElementTypes.ArgumentSubArguments_4017); //$NON-NLS-1$
		case StrategyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/euz?Strategy", EuzElementTypes.Strategy_2004); //$NON-NLS-1$
		case ContextContextAssumptionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Context?contextAssumptions", EuzElementTypes.ContextContextAssumptions_4007); //$NON-NLS-1$
		case StrategyStrategyJustificationsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Strategy?strategyJustifications", EuzElementTypes.StrategyStrategyJustifications_4011); //$NON-NLS-1$
		case SolutionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/euz?Solution", EuzElementTypes.Solution_2002); //$NON-NLS-1$
		case SolutionSolutionEvidenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Solution?solutionEvidence", EuzElementTypes.SolutionSolutionEvidence_4015); //$NON-NLS-1$
		case CriteriaCriteriaAssumptionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Criteria?criteriaAssumptions", EuzElementTypes.CriteriaCriteriaAssumptions_4009); //$NON-NLS-1$
		case ArgumentArgumentStrategiesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Argument?argumentStrategies", EuzElementTypes.ArgumentArgumentStrategies_4001); //$NON-NLS-1$
		case JustificationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/euz?Justification", EuzElementTypes.Justification_2006); //$NON-NLS-1$
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.certware.net/euz?ArgumentDiagram", EuzElementTypes.ArgumentDiagram_1000); //$NON-NLS-1$
		case ArgumentArgumentAssumptionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Argument?argumentAssumptions", EuzElementTypes.ArgumentArgumentAssumptions_4002); //$NON-NLS-1$
		case ArgumentArgumentContextsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Argument?argumentContexts", EuzElementTypes.ArgumentArgumentContexts_4003); //$NON-NLS-1$
		case StrategyStrategyContextsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Strategy?strategyContexts", EuzElementTypes.StrategyStrategyContexts_4019); //$NON-NLS-1$
		case SolutionSolutionContextsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Solution?solutionContexts", EuzElementTypes.SolutionSolutionContexts_4014); //$NON-NLS-1$
		case CriteriaCriteriaContextsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Criteria?criteriaContexts", EuzElementTypes.CriteriaCriteriaContexts_4008); //$NON-NLS-1$
		case ArgumentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/euz?Argument", EuzElementTypes.Argument_2001); //$NON-NLS-1$
		case StrategyStrategyStrategiesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Strategy?strategyStrategies", EuzElementTypes.StrategyStrategyStrategies_4018); //$NON-NLS-1$
		case ArgumentArgumentSolutionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Argument?argumentSolutions", EuzElementTypes.ArgumentArgumentSolutions_4004); //$NON-NLS-1$
		case ArgumentArgumentCriteriaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Argument?argumentCriteria", EuzElementTypes.ArgumentArgumentCriteria_4005); //$NON-NLS-1$
		case StrategyStrategyAssumptionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Strategy?strategyAssumptions", EuzElementTypes.StrategyStrategyAssumptions_4013); //$NON-NLS-1$
		case ArgumentArgumentJustificationsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Argument?argumentJustifications", EuzElementTypes.ArgumentArgumentJustifications_4006); //$NON-NLS-1$
		case EvidenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/euz?Evidence", EuzElementTypes.Evidence_2003); //$NON-NLS-1$
		case StrategyStrategyCriteriaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Strategy?strategyCriteria", EuzElementTypes.StrategyStrategyCriteria_4012); //$NON-NLS-1$
		case StrategyStrategyArgumentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/euz?Strategy?strategyArguments", EuzElementTypes.StrategyStrategyArguments_4010); //$NON-NLS-1$
		case ContextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/euz?Context", EuzElementTypes.Context_2007); //$NON-NLS-1$
		case AssumptionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/euz?Assumption", EuzElementTypes.Assumption_2005); //$NON-NLS-1$
		case CriteriaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/euz?Criteria", EuzElementTypes.Criteria_2008); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = EuzDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& EuzElementTypes.isKnownElementType(elementType)) {
			image = EuzElementTypes.getImage(elementType);
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
		if (element instanceof EuzNavigatorGroup) {
			EuzNavigatorGroup group = (EuzNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof EuzNavigatorItem) {
			EuzNavigatorItem navigatorItem = (EuzNavigatorItem) element;
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
		switch (EuzVisualIDRegistry.getVisualID(view)) {
		case SolutionSolutionCriteriaEditPart.VISUAL_ID:
			return getSolutionSolutionCriteria_4016Text(view);
		case ArgumentSubArgumentsEditPart.VISUAL_ID:
			return getArgumentSubArguments_4017Text(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2004Text(view);
		case ContextContextAssumptionsEditPart.VISUAL_ID:
			return getContextContextAssumptions_4007Text(view);
		case StrategyStrategyJustificationsEditPart.VISUAL_ID:
			return getStrategyStrategyJustifications_4011Text(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2002Text(view);
		case SolutionSolutionEvidenceEditPart.VISUAL_ID:
			return getSolutionSolutionEvidence_4015Text(view);
		case CriteriaCriteriaAssumptionsEditPart.VISUAL_ID:
			return getCriteriaCriteriaAssumptions_4009Text(view);
		case ArgumentArgumentStrategiesEditPart.VISUAL_ID:
			return getArgumentArgumentStrategies_4001Text(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2006Text(view);
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getArgumentDiagram_1000Text(view);
		case ArgumentArgumentAssumptionsEditPart.VISUAL_ID:
			return getArgumentArgumentAssumptions_4002Text(view);
		case ArgumentArgumentContextsEditPart.VISUAL_ID:
			return getArgumentArgumentContexts_4003Text(view);
		case StrategyStrategyContextsEditPart.VISUAL_ID:
			return getStrategyStrategyContexts_4019Text(view);
		case SolutionSolutionContextsEditPart.VISUAL_ID:
			return getSolutionSolutionContexts_4014Text(view);
		case CriteriaCriteriaContextsEditPart.VISUAL_ID:
			return getCriteriaCriteriaContexts_4008Text(view);
		case ArgumentEditPart.VISUAL_ID:
			return getArgument_2001Text(view);
		case StrategyStrategyStrategiesEditPart.VISUAL_ID:
			return getStrategyStrategyStrategies_4018Text(view);
		case ArgumentArgumentSolutionsEditPart.VISUAL_ID:
			return getArgumentArgumentSolutions_4004Text(view);
		case ArgumentArgumentCriteriaEditPart.VISUAL_ID:
			return getArgumentArgumentCriteria_4005Text(view);
		case StrategyStrategyAssumptionsEditPart.VISUAL_ID:
			return getStrategyStrategyAssumptions_4013Text(view);
		case ArgumentArgumentJustificationsEditPart.VISUAL_ID:
			return getArgumentArgumentJustifications_4006Text(view);
		case EvidenceEditPart.VISUAL_ID:
			return getEvidence_2003Text(view);
		case StrategyStrategyCriteriaEditPart.VISUAL_ID:
			return getStrategyStrategyCriteria_4012Text(view);
		case StrategyStrategyArgumentsEditPart.VISUAL_ID:
			return getStrategyStrategyArguments_4010Text(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2007Text(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2005Text(view);
		case CriteriaEditPart.VISUAL_ID:
			return getCriteria_2008Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getCriteriaCriteriaAssumptions_4009Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.CriteriaCriteriaAssumptions_4009,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContextContextAssumptions_4007Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.ContextContextAssumptions_4007,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStrategyStrategyArguments_4010Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.StrategyStrategyArguments_4010,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStrategyStrategyJustifications_4011Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.StrategyStrategyJustifications_4011,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentArgumentJustifications_4006Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.ArgumentArgumentJustifications_4006,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentArgumentContexts_4003Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.ArgumentArgumentContexts_4003,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStrategyStrategyContexts_4019Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.StrategyStrategyContexts_4019,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCriteriaCriteriaContexts_4008Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.CriteriaCriteriaContexts_4008,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSolutionSolutionContexts_4014Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.SolutionSolutionContexts_4014,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6014); //$NON-NLS-1$
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
			EuzDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContext_2007Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.Context_2007,
				view.getElement() != null ? view.getElement() : view,
				EuzVisualIDRegistry
						.getType(ContextIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgument_2001Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.Argument_2001,
				view.getElement() != null ? view.getElement() : view,
				EuzVisualIDRegistry
						.getType(ArgumentIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStrategyStrategyStrategies_4018Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.StrategyStrategyStrategies_4018,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCriteria_2008Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.Criteria_2008,
				view.getElement() != null ? view.getElement() : view,
				EuzVisualIDRegistry
						.getType(CriteriaIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStrategyStrategyAssumptions_4013Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.StrategyStrategyAssumptions_4013,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJustification_2006Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.Justification_2006,
				view.getElement() != null ? view.getElement() : view,
				EuzVisualIDRegistry
						.getType(JustificationIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentArgumentAssumptions_4002Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.ArgumentArgumentAssumptions_4002,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentArgumentCriteria_4005Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.ArgumentArgumentCriteria_4005,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStrategy_2004Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.Strategy_2004,
				view.getElement() != null ? view.getElement() : view,
				EuzVisualIDRegistry
						.getType(StrategyIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStrategyStrategyCriteria_4012Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.StrategyStrategyCriteria_4012,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSolutionSolutionEvidence_4015Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.SolutionSolutionEvidence_4015,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentArgumentStrategies_4001Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.ArgumentArgumentStrategies_4001,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssumption_2005Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.Assumption_2005,
				view.getElement() != null ? view.getElement() : view,
				EuzVisualIDRegistry
						.getType(AssumptionIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEvidence_2003Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.Evidence_2003,
				view.getElement() != null ? view.getElement() : view,
				EuzVisualIDRegistry
						.getType(EvidenceIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentArgumentSolutions_4004Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.ArgumentArgumentSolutions_4004,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSolution_2002Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.Solution_2002,
				view.getElement() != null ? view.getElement() : view,
				EuzVisualIDRegistry
						.getType(SolutionIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentSubArguments_4017Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.ArgumentSubArguments_4017,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSolutionSolutionCriteria_4016Text(View view) {
		IParser parser = EuzParserProvider.getParser(
				EuzElementTypes.SolutionSolutionCriteria_4016,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EuzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6016); //$NON-NLS-1$
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
		return ArgumentDiagramEditPart.MODEL_ID.equals(EuzVisualIDRegistry
				.getModelID(view));
	}

}
