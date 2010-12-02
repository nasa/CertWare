package net.certware.argument.caz.diagram.edit.parts;

import net.certware.argument.caz.diagram.part.CazVisualIDRegistry;

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
public class CazEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CazVisualIDRegistry.getVisualID(view)) {

			case ArgumentDiagramEditPart.VISUAL_ID:
				return new ArgumentDiagramEditPart(view);

			case ClaimEditPart.VISUAL_ID:
				return new ClaimEditPart(view);

			case ClaimIdentifierEditPart.VISUAL_ID:
				return new ClaimIdentifierEditPart(view);

			case ClaimContentEditPart.VISUAL_ID:
				return new ClaimContentEditPart(view);

			case EvidenceEditPart.VISUAL_ID:
				return new EvidenceEditPart(view);

			case EvidenceIdentifierEditPart.VISUAL_ID:
				return new EvidenceIdentifierEditPart(view);

			case EvidenceContentEditPart.VISUAL_ID:
				return new EvidenceContentEditPart(view);

			case ArgumentEditPart.VISUAL_ID:
				return new ArgumentEditPart(view);

			case ArgumentIdentifierEditPart.VISUAL_ID:
				return new ArgumentIdentifierEditPart(view);

			case ArgumentContentEditPart.VISUAL_ID:
				return new ArgumentContentEditPart(view);

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

			case ClaimClaimStrategiesEditPart.VISUAL_ID:
				return new ClaimClaimStrategiesEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case ClaimClaimAssumptionsEditPart.VISUAL_ID:
				return new ClaimClaimAssumptionsEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case ClaimClaimContextsEditPart.VISUAL_ID:
				return new ClaimClaimContextsEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case ClaimClaimSolutionsEditPart.VISUAL_ID:
				return new ClaimClaimSolutionsEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case ClaimSubClaimsEditPart.VISUAL_ID:
				return new ClaimSubClaimsEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case ArgumentArgumentJustificationEditPart.VISUAL_ID:
				return new ArgumentArgumentJustificationEditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case ArgumentArgumentEvidenceEditPart.VISUAL_ID:
				return new ArgumentArgumentEvidenceEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case ArgumentArgumentClaimsEditPart.VISUAL_ID:
				return new ArgumentArgumentClaimsEditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case EvidenceEvidenceContextsEditPart.VISUAL_ID:
				return new EvidenceEvidenceContextsEditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case EvidenceEvidenceEditPart.VISUAL_ID:
				return new EvidenceEvidenceEditPart(view);

			case WrappingLabel10EditPart.VISUAL_ID:
				return new WrappingLabel10EditPart(view);

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
