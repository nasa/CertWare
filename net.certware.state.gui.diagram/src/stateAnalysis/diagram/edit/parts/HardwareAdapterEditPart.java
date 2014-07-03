/*
 * 
 */
package stateAnalysis.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class HardwareAdapterEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3030;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public HardwareAdapterEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new stateAnalysis.diagram.edit.policies.HardwareAdapterItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new stateAnalysis.diagram.edit.policies.OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new HardwareAdapterFigure();
	}

	/**
	 * @generated
	 */
	public HardwareAdapterFigure getPrimaryShape() {
		return (HardwareAdapterFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.HardwareAdapterNameEditPart) {
			((stateAnalysis.diagram.edit.parts.HardwareAdapterNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureHardwareAdapterLabelFigure());
			return true;
		}
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareCommandsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getHardwareAdapterHardwareCommandsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareCommandsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareMeasurementsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getHardwareAdapterHardwareMeasurementsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareMeasurementsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterDevicesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getHardwareAdapterDevicesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterDevicesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.HardwareAdapterNameEditPart) {
			return true;
		}
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareCommandsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getHardwareAdapterHardwareCommandsCompartmentFigure();
			pane.remove(((stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareCommandsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareMeasurementsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getHardwareAdapterHardwareMeasurementsCompartmentFigure();
			pane.remove(((stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareMeasurementsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterDevicesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getHardwareAdapterDevicesCompartmentFigure();
			pane.remove(((stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterDevicesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareCommandsCompartmentEditPart) {
			return getPrimaryShape()
					.getHardwareAdapterHardwareCommandsCompartmentFigure();
		}
		if (editPart instanceof stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareMeasurementsCompartmentEditPart) {
			return getPrimaryShape()
					.getHardwareAdapterHardwareMeasurementsCompartmentFigure();
		}
		if (editPart instanceof stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterDevicesCompartmentEditPart) {
			return getPrimaryShape()
					.getHardwareAdapterDevicesCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
				.getType(stateAnalysis.diagram.edit.parts.HardwareAdapterNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareCommand_3020) {
				return getChildBySemanticHint(stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
						.getType(stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareCommandsCompartmentEditPart.VISUAL_ID));
			}
			if (type == stateAnalysis.diagram.providers.StateAnalysisElementTypes.HardwareMeasurement_3021) {
				return getChildBySemanticHint(stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
						.getType(stateAnalysis.diagram.edit.parts.HardwareAdapterHardwareAdapterHardwareMeasurementsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class HardwareAdapterFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureHardwareAdapterLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fHardwareAdapterHardwareCommandsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fHardwareAdapterHardwareMeasurementsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fHardwareAdapterDevicesCompartmentFigure;

		/**
		 * @generated
		 */
		public HardwareAdapterFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureHardwareAdapterLabelFigure = new WrappingLabel();

			fFigureHardwareAdapterLabelFigure.setText("HardwareAdapter");
			fFigureHardwareAdapterLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureHardwareAdapterLabelFigure);

			fHardwareAdapterHardwareCommandsCompartmentFigure = new RectangleFigure();

			fHardwareAdapterHardwareCommandsCompartmentFigure.setOutline(false);

			this.add(fHardwareAdapterHardwareCommandsCompartmentFigure);

			fHardwareAdapterHardwareMeasurementsCompartmentFigure = new RectangleFigure();

			fHardwareAdapterHardwareMeasurementsCompartmentFigure
					.setOutline(false);

			this.add(fHardwareAdapterHardwareMeasurementsCompartmentFigure);

			fHardwareAdapterDevicesCompartmentFigure = new RectangleFigure();

			fHardwareAdapterDevicesCompartmentFigure.setOutline(false);

			this.add(fHardwareAdapterDevicesCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHardwareAdapterLabelFigure() {
			return fFigureHardwareAdapterLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getHardwareAdapterHardwareCommandsCompartmentFigure() {
			return fHardwareAdapterHardwareCommandsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getHardwareAdapterHardwareMeasurementsCompartmentFigure() {
			return fHardwareAdapterHardwareMeasurementsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getHardwareAdapterDevicesCompartmentFigure() {
			return fHardwareAdapterDevicesCompartmentFigure;
		}

	}

}
