package net.certware.argument.gsz.diagram.navigator;

import net.certware.argument.gsz.ArgumentDiagram;
import net.certware.argument.gsz.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.gsz.diagram.edit.parts.AssumptionEditPart;
import net.certware.argument.gsz.diagram.edit.parts.AssumptionIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.ContextEditPart;
import net.certware.argument.gsz.diagram.edit.parts.ContextIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.EvidenceEditPart;
import net.certware.argument.gsz.diagram.edit.parts.EvidenceIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalAssumptionsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalGoalContextsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalGoalSolutionsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalStrategiesEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalSubGoalsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.JustificationEditPart;
import net.certware.argument.gsz.diagram.edit.parts.JustificationIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionSolutionContextsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionSolutionEvidenceEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyGoalsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyJustificationsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyStrategyContextsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyStrategySolutionsEditPart;
import net.certware.argument.gsz.diagram.part.GszDiagramEditorPlugin;
import net.certware.argument.gsz.diagram.part.GszVisualIDRegistry;
import net.certware.argument.gsz.diagram.providers.GszElementTypes;
import net.certware.argument.gsz.diagram.providers.GszParserProvider;

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
public class GszNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		GszDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		GszDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GszNavigatorItem
				&& !isOwnView(((GszNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof GszNavigatorGroup) {
			GszNavigatorGroup group = (GszNavigatorGroup) element;
			return GszDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof GszNavigatorItem) {
			GszNavigatorItem navigatorItem = (GszNavigatorItem) element;
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
		switch (GszVisualIDRegistry.getVisualID(view)) {
		case ContextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/gsz?Context", GszElementTypes.Context_2006); //$NON-NLS-1$
		case EvidenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/gsz?Evidence", GszElementTypes.Evidence_2003); //$NON-NLS-1$
		case StrategyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/gsz?Strategy", GszElementTypes.Strategy_2008); //$NON-NLS-1$
		case GoalGoalContextsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/gsz?Goal?goalContexts", GszElementTypes.GoalGoalContexts_4003); //$NON-NLS-1$
		case StrategyStrategyContextsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/gsz?Strategy?strategyContexts", GszElementTypes.StrategyStrategyContexts_4008); //$NON-NLS-1$
		case GoalAssumptionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/gsz?Goal?assumptions", GszElementTypes.GoalAssumptions_4004); //$NON-NLS-1$
		case JustificationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/gsz?Justification", GszElementTypes.Justification_2005); //$NON-NLS-1$
		case SolutionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/gsz?Solution", GszElementTypes.Solution_2002); //$NON-NLS-1$
		case StrategyStrategySolutionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/gsz?Strategy?strategySolutions", GszElementTypes.StrategyStrategySolutions_4009); //$NON-NLS-1$
		case GoalStrategiesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/gsz?Goal?strategies", GszElementTypes.GoalStrategies_4002); //$NON-NLS-1$
		case StrategyJustificationsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/gsz?Strategy?justifications", GszElementTypes.StrategyJustifications_4007); //$NON-NLS-1$
		case GoalGoalSolutionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/gsz?Goal?goalSolutions", GszElementTypes.GoalGoalSolutions_4005); //$NON-NLS-1$
		case GoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/gsz?Goal", GszElementTypes.Goal_2001); //$NON-NLS-1$
		case GoalSubGoalsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/gsz?Goal?subGoals", GszElementTypes.GoalSubGoals_4001); //$NON-NLS-1$
		case AssumptionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.certware.net/gsz?Assumption", GszElementTypes.Assumption_2007); //$NON-NLS-1$
		case SolutionSolutionContextsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/gsz?Solution?solutionContexts", GszElementTypes.SolutionSolutionContexts_4011); //$NON-NLS-1$
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.certware.net/gsz?ArgumentDiagram", GszElementTypes.ArgumentDiagram_1000); //$NON-NLS-1$
		case SolutionSolutionEvidenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/gsz?Solution?solutionEvidence", GszElementTypes.SolutionSolutionEvidence_4010); //$NON-NLS-1$
		case StrategyGoalsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.certware.net/gsz?Strategy?goals", GszElementTypes.StrategyGoals_4006); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GszDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& GszElementTypes.isKnownElementType(elementType)) {
			image = GszElementTypes.getImage(elementType);
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
		if (element instanceof GszNavigatorGroup) {
			GszNavigatorGroup group = (GszNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GszNavigatorItem) {
			GszNavigatorItem navigatorItem = (GszNavigatorItem) element;
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
		switch (GszVisualIDRegistry.getVisualID(view)) {
		case ContextEditPart.VISUAL_ID:
			return getContext_2006Text(view);
		case EvidenceEditPart.VISUAL_ID:
			return getEvidence_2003Text(view);
		case StrategyEditPart.VISUAL_ID:
			return getStrategy_2008Text(view);
		case GoalGoalContextsEditPart.VISUAL_ID:
			return getGoalGoalContexts_4003Text(view);
		case StrategyStrategyContextsEditPart.VISUAL_ID:
			return getStrategyStrategyContexts_4008Text(view);
		case GoalAssumptionsEditPart.VISUAL_ID:
			return getGoalAssumptions_4004Text(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2005Text(view);
		case SolutionEditPart.VISUAL_ID:
			return getSolution_2002Text(view);
		case StrategyStrategySolutionsEditPart.VISUAL_ID:
			return getStrategyStrategySolutions_4009Text(view);
		case GoalStrategiesEditPart.VISUAL_ID:
			return getGoalStrategies_4002Text(view);
		case StrategyJustificationsEditPart.VISUAL_ID:
			return getStrategyJustifications_4007Text(view);
		case GoalGoalSolutionsEditPart.VISUAL_ID:
			return getGoalGoalSolutions_4005Text(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2001Text(view);
		case GoalSubGoalsEditPart.VISUAL_ID:
			return getGoalSubGoals_4001Text(view);
		case AssumptionEditPart.VISUAL_ID:
			return getAssumption_2007Text(view);
		case SolutionSolutionContextsEditPart.VISUAL_ID:
			return getSolutionSolutionContexts_4011Text(view);
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getArgumentDiagram_1000Text(view);
		case SolutionSolutionEvidenceEditPart.VISUAL_ID:
			return getSolutionSolutionEvidence_4010Text(view);
		case StrategyGoalsEditPart.VISUAL_ID:
			return getStrategyGoals_4006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getContext_2006Text(View view) {
		IParser parser = GszParserProvider.getParser(
				GszElementTypes.Context_2006,
				view.getElement() != null ? view.getElement() : view,
				GszVisualIDRegistry
						.getType(ContextIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEvidence_2003Text(View view) {
		IParser parser = GszParserProvider.getParser(
				GszElementTypes.Evidence_2003,
				view.getElement() != null ? view.getElement() : view,
				GszVisualIDRegistry
						.getType(EvidenceIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStrategy_2008Text(View view) {
		IParser parser = GszParserProvider.getParser(
				GszElementTypes.Strategy_2008,
				view.getElement() != null ? view.getElement() : view,
				GszVisualIDRegistry
						.getType(StrategyIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGoalGoalContexts_4003Text(View view) {
		IParser parser = GszParserProvider.getParser(
				GszElementTypes.GoalGoalContexts_4003,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStrategyStrategyContexts_4008Text(View view) {
		IParser parser = GszParserProvider.getParser(
				GszElementTypes.StrategyStrategyContexts_4008,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGoalAssumptions_4004Text(View view) {
		IParser parser = GszParserProvider.getParser(
				GszElementTypes.GoalAssumptions_4004,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJustification_2005Text(View view) {
		IParser parser = GszParserProvider.getParser(
				GszElementTypes.Justification_2005,
				view.getElement() != null ? view.getElement() : view,
				GszVisualIDRegistry
						.getType(JustificationIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSolution_2002Text(View view) {
		IParser parser = GszParserProvider.getParser(
				GszElementTypes.Solution_2002,
				view.getElement() != null ? view.getElement() : view,
				GszVisualIDRegistry
						.getType(SolutionIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStrategyStrategySolutions_4009Text(View view) {
		IParser parser = GszParserProvider.getParser(
				GszElementTypes.StrategyStrategySolutions_4009,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGoalStrategies_4002Text(View view) {
		IParser parser = GszParserProvider.getParser(
				GszElementTypes.GoalStrategies_4002,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStrategyJustifications_4007Text(View view) {
		IParser parser = GszParserProvider.getParser(
				GszElementTypes.StrategyJustifications_4007,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGoalGoalSolutions_4005Text(View view) {
		IParser parser = GszParserProvider.getParser(
				GszElementTypes.GoalGoalSolutions_4005,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGoal_2001Text(View view) {
		IParser parser = GszParserProvider.getParser(GszElementTypes.Goal_2001,
				view.getElement() != null ? view.getElement() : view,
				GszVisualIDRegistry.getType(GoalIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGoalSubGoals_4001Text(View view) {
		IParser parser = GszParserProvider.getParser(
				GszElementTypes.GoalSubGoals_4001,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssumption_2007Text(View view) {
		IParser parser = GszParserProvider.getParser(
				GszElementTypes.Assumption_2007,
				view.getElement() != null ? view.getElement() : view,
				GszVisualIDRegistry
						.getType(AssumptionIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSolutionSolutionContexts_4011Text(View view) {
		IParser parser = GszParserProvider.getParser(
				GszElementTypes.SolutionSolutionContexts_4011,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6011); //$NON-NLS-1$
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
			GszDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSolutionSolutionEvidence_4010Text(View view) {
		IParser parser = GszParserProvider.getParser(
				GszElementTypes.SolutionSolutionEvidence_4010,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStrategyGoals_4006Text(View view) {
		IParser parser = GszParserProvider.getParser(
				GszElementTypes.StrategyGoals_4006,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GszDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6006); //$NON-NLS-1$
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
		return ArgumentDiagramEditPart.MODEL_ID.equals(GszVisualIDRegistry
				.getModelID(view));
	}

}
