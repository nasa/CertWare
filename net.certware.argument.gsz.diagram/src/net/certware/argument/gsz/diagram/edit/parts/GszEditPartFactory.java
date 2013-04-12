package net.certware.argument.gsz.diagram.edit.parts;

import net.certware.argument.gsz.diagram.part.GszVisualIDRegistry;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class GszEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (GszVisualIDRegistry.getVisualID(view)) {

			case ArgumentDiagramEditPart.VISUAL_ID:
				return new ArgumentDiagramEditPart(view);

			case GoalEditPart.VISUAL_ID:
				return new GoalEditPart(view);

			case GoalIdentifierEditPart.VISUAL_ID:
				return new GoalIdentifierEditPart(view);

			case GoalContentEditPart.VISUAL_ID:
				return new GoalContentEditPart(view);

			case SolutionEditPart.VISUAL_ID:
				return new SolutionEditPart(view);

			case SolutionIdentifierEditPart.VISUAL_ID:
				return new SolutionIdentifierEditPart(view);

			case SolutionContentEditPart.VISUAL_ID:
				return new SolutionContentEditPart(view);

			case EvidenceEditPart.VISUAL_ID:
				return new EvidenceEditPart(view);

			case EvidenceIdentifierEditPart.VISUAL_ID:
				return new EvidenceIdentifierEditPart(view);

			case EvidenceContentEditPart.VISUAL_ID:
				return new EvidenceContentEditPart(view);

			case StrategyEditPart.VISUAL_ID:
				return new StrategyEditPart(view);

			case StrategyIdentifierEditPart.VISUAL_ID:
				return new StrategyIdentifierEditPart(view);

			case StrategyContentEditPart.VISUAL_ID:
				return new StrategyContentEditPart(view);

			case JustificationEditPart.VISUAL_ID:
				return new JustificationEditPart(view);

			case JustificationIdentifierEditPart.VISUAL_ID:
				return new JustificationIdentifierEditPart(view);

			case JustificationContentEditPart.VISUAL_ID:
				return new JustificationContentEditPart(view);

			case ContextEditPart.VISUAL_ID:
				return new ContextEditPart(view);

			case ContextIdentifierEditPart.VISUAL_ID:
				return new ContextIdentifierEditPart(view);

			case ContextContentEditPart.VISUAL_ID:
				return new ContextContentEditPart(view);

			case AssumptionEditPart.VISUAL_ID:
				return new AssumptionEditPart(view);

			case AssumptionIdentifierEditPart.VISUAL_ID:
				return new AssumptionIdentifierEditPart(view);

			case AssumptionContentEditPart.VISUAL_ID:
				return new AssumptionContentEditPart(view);

			case GoalSubGoalsEditPart.VISUAL_ID:
				return new GoalSubGoalsEditPart(view);

			case GoalSubGoalsExternalLabelEditPart.VISUAL_ID:
				return new GoalSubGoalsExternalLabelEditPart(view);

			case GoalStrategiesEditPart.VISUAL_ID:
				return new GoalStrategiesEditPart(view);

			case GoalStrategiesExternalLabelEditPart.VISUAL_ID:
				return new GoalStrategiesExternalLabelEditPart(view);

			case GoalGoalContextsEditPart.VISUAL_ID:
				return new GoalGoalContextsEditPart(view);

			case GoalGoalContextsExternalLabelEditPart.VISUAL_ID:
				return new GoalGoalContextsExternalLabelEditPart(view);

			case GoalAssumptionsEditPart.VISUAL_ID:
				return new GoalAssumptionsEditPart(view);

			case GoalAssumptionsExternalLabelEditPart.VISUAL_ID:
				return new GoalAssumptionsExternalLabelEditPart(view);

			case GoalGoalSolutionsEditPart.VISUAL_ID:
				return new GoalGoalSolutionsEditPart(view);

			case GoalGoalSolutionsExternalLabelEditPart.VISUAL_ID:
				return new GoalGoalSolutionsExternalLabelEditPart(view);

			case StrategyGoalsEditPart.VISUAL_ID:
				return new StrategyGoalsEditPart(view);

			case StrategyGoalsExternalLabelEditPart.VISUAL_ID:
				return new StrategyGoalsExternalLabelEditPart(view);

			case StrategyJustificationsEditPart.VISUAL_ID:
				return new StrategyJustificationsEditPart(view);

			case StrategyJustificationsExternalLabelEditPart.VISUAL_ID:
				return new StrategyJustificationsExternalLabelEditPart(view);

			case StrategyStrategyContextsEditPart.VISUAL_ID:
				return new StrategyStrategyContextsEditPart(view);

			case StrategyStrategyContextsExternalLabelEditPart.VISUAL_ID:
				return new StrategyStrategyContextsExternalLabelEditPart(view);

			case StrategyStrategySolutionsEditPart.VISUAL_ID:
				return new StrategyStrategySolutionsEditPart(view);

			case StrategyStrategySolutionsExternalLabelEditPart.VISUAL_ID:
				return new StrategyStrategySolutionsExternalLabelEditPart(view);

			case SolutionSolutionEvidenceEditPart.VISUAL_ID:
				return new SolutionSolutionEvidenceEditPart(view);

			case SolutionSolutionEvidenceExternalLabelEditPart.VISUAL_ID:
				return new SolutionSolutionEvidenceExternalLabelEditPart(view);

			case SolutionSolutionContextsEditPart.VISUAL_ID:
				return new SolutionSolutionContextsEditPart(view);

			case SolutionSolutionContextsExternalLabelEditPart.VISUAL_ID:
				return new SolutionSolutionContextsExternalLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
