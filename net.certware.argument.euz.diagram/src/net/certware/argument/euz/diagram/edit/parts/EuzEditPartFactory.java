/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz.diagram.edit.parts;

import net.certware.argument.euz.diagram.part.EuzVisualIDRegistry;

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
public class EuzEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (EuzVisualIDRegistry.getVisualID(view)) {

			case ArgumentDiagramEditPart.VISUAL_ID:
				return new ArgumentDiagramEditPart(view);

			case ArgumentEditPart.VISUAL_ID:
				return new ArgumentEditPart(view);

			case ArgumentIdentifierEditPart.VISUAL_ID:
				return new ArgumentIdentifierEditPart(view);

			case ArgumentContentEditPart.VISUAL_ID:
				return new ArgumentContentEditPart(view);

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

			case AssumptionEditPart.VISUAL_ID:
				return new AssumptionEditPart(view);

			case AssumptionIdentifierEditPart.VISUAL_ID:
				return new AssumptionIdentifierEditPart(view);

			case AssumptionContentEditPart.VISUAL_ID:
				return new AssumptionContentEditPart(view);

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

			case CriteriaEditPart.VISUAL_ID:
				return new CriteriaEditPart(view);

			case CriteriaIdentifierEditPart.VISUAL_ID:
				return new CriteriaIdentifierEditPart(view);

			case CriteriaContentEditPart.VISUAL_ID:
				return new CriteriaContentEditPart(view);

			case ArgumentArgumentStrategiesEditPart.VISUAL_ID:
				return new ArgumentArgumentStrategiesEditPart(view);

			case ArgumentArgumentStrategiesExternalLabelEditPart.VISUAL_ID:
				return new ArgumentArgumentStrategiesExternalLabelEditPart(view);

			case ArgumentArgumentAssumptionsEditPart.VISUAL_ID:
				return new ArgumentArgumentAssumptionsEditPart(view);

			case ArgumentArgumentAssumptionsExternalLabelEditPart.VISUAL_ID:
				return new ArgumentArgumentAssumptionsExternalLabelEditPart(
						view);

			case ArgumentArgumentContextsEditPart.VISUAL_ID:
				return new ArgumentArgumentContextsEditPart(view);

			case ArgumentArgumentContextsExternalLabelEditPart.VISUAL_ID:
				return new ArgumentArgumentContextsExternalLabelEditPart(view);

			case ArgumentArgumentSolutionsEditPart.VISUAL_ID:
				return new ArgumentArgumentSolutionsEditPart(view);

			case ArgumentArgumentSolutionsExternalLabelEditPart.VISUAL_ID:
				return new ArgumentArgumentSolutionsExternalLabelEditPart(view);

			case ArgumentArgumentCriteriaEditPart.VISUAL_ID:
				return new ArgumentArgumentCriteriaEditPart(view);

			case ArgumentArgumentCriteriaExternalLabelEditPart.VISUAL_ID:
				return new ArgumentArgumentCriteriaExternalLabelEditPart(view);

			case ArgumentArgumentJustificationsEditPart.VISUAL_ID:
				return new ArgumentArgumentJustificationsEditPart(view);

			case ArgumentArgumentJustificationsExternalLabelEditPart.VISUAL_ID:
				return new ArgumentArgumentJustificationsExternalLabelEditPart(
						view);

			case ArgumentSubArgumentsEditPart.VISUAL_ID:
				return new ArgumentSubArgumentsEditPart(view);

			case ArgumentSubArgumentsExternalLabelEditPart.VISUAL_ID:
				return new ArgumentSubArgumentsExternalLabelEditPart(view);

			case ContextContextAssumptionsEditPart.VISUAL_ID:
				return new ContextContextAssumptionsEditPart(view);

			case ContextContextAssumptionsExternalLabelEditPart.VISUAL_ID:
				return new ContextContextAssumptionsExternalLabelEditPart(view);

			case CriteriaCriteriaContextsEditPart.VISUAL_ID:
				return new CriteriaCriteriaContextsEditPart(view);

			case CriteriaCriteriaContextsExternalLabelEditPart.VISUAL_ID:
				return new CriteriaCriteriaContextsExternalLabelEditPart(view);

			case CriteriaCriteriaAssumptionsEditPart.VISUAL_ID:
				return new CriteriaCriteriaAssumptionsEditPart(view);

			case CriteriaCriteriaAssumptionsExternalLabelEditPart.VISUAL_ID:
				return new CriteriaCriteriaAssumptionsExternalLabelEditPart(
						view);

			case StrategyStrategyArgumentsEditPart.VISUAL_ID:
				return new StrategyStrategyArgumentsEditPart(view);

			case StrategyStrategyArgumentsExternalLabelEditPart.VISUAL_ID:
				return new StrategyStrategyArgumentsExternalLabelEditPart(view);

			case StrategyStrategyJustificationsEditPart.VISUAL_ID:
				return new StrategyStrategyJustificationsEditPart(view);

			case StrategyStrategyJustificationsExternalLabelEditPart.VISUAL_ID:
				return new StrategyStrategyJustificationsExternalLabelEditPart(
						view);

			case StrategyStrategyCriteriaEditPart.VISUAL_ID:
				return new StrategyStrategyCriteriaEditPart(view);

			case StrategyStrategyCriteriaExternalLabelEditPart.VISUAL_ID:
				return new StrategyStrategyCriteriaExternalLabelEditPart(view);

			case StrategyStrategyAssumptionsEditPart.VISUAL_ID:
				return new StrategyStrategyAssumptionsEditPart(view);

			case StrategyStrategyAssumptionsExternalLabelEditPart.VISUAL_ID:
				return new StrategyStrategyAssumptionsExternalLabelEditPart(
						view);

			case StrategyStrategyStrategiesEditPart.VISUAL_ID:
				return new StrategyStrategyStrategiesEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case StrategyStrategyContextsEditPart.VISUAL_ID:
				return new StrategyStrategyContextsEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case SolutionSolutionContextsEditPart.VISUAL_ID:
				return new SolutionSolutionContextsEditPart(view);

			case SolutionSolutionContextsExternalLabelEditPart.VISUAL_ID:
				return new SolutionSolutionContextsExternalLabelEditPart(view);

			case SolutionSolutionEvidenceEditPart.VISUAL_ID:
				return new SolutionSolutionEvidenceEditPart(view);

			case SolutionSolutionEvidenceExternalLabelEditPart.VISUAL_ID:
				return new SolutionSolutionEvidenceExternalLabelEditPart(view);

			case SolutionSolutionCriteriaEditPart.VISUAL_ID:
				return new SolutionSolutionCriteriaEditPart(view);

			case SolutionSolutionCriteriaExternalLabelEditPart.VISUAL_ID:
				return new SolutionSolutionCriteriaExternalLabelEditPart(view);

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
