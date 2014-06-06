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
public class StateVariable2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3011;

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
	public StateVariable2EditPart(View view) {
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
				new stateAnalysis.diagram.edit.policies.StateVariable2ItemSemanticEditPolicy());
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
		return primaryShape = new StateVariableFigure();
	}

	/**
	 * @generated
	 */
	public StateVariableFigure getPrimaryShape() {
		return (StateVariableFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.StateVariableName2EditPart) {
			((stateAnalysis.diagram.edit.parts.StateVariableName2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureStateVariableLabelFigure());
			return true;
		}
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getStateVariableInStateConstraintsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getStateVariableOutStateConstraintsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getStateVariableStateUpdatesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getStateVariableInfluencedByCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.StateVariableName2EditPart) {
			return true;
		}
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getStateVariableInStateConstraintsCompartmentFigure();
			pane.remove(((stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getStateVariableOutStateConstraintsCompartmentFigure();
			pane.remove(((stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getStateVariableStateUpdatesCompartmentFigure();
			pane.remove(((stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getStateVariableInfluencedByCompartmentFigure();
			pane.remove(((stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartment2EditPart) childEditPart)
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
		if (editPart instanceof stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartment2EditPart) {
			return getPrimaryShape()
					.getStateVariableInStateConstraintsCompartmentFigure();
		}
		if (editPart instanceof stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartment2EditPart) {
			return getPrimaryShape()
					.getStateVariableOutStateConstraintsCompartmentFigure();
		}
		if (editPart instanceof stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartment2EditPart) {
			return getPrimaryShape()
					.getStateVariableStateUpdatesCompartmentFigure();
		}
		if (editPart instanceof stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartment2EditPart) {
			return getPrimaryShape()
					.getStateVariableInfluencedByCompartmentFigure();
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
				.getType(stateAnalysis.diagram.edit.parts.StateVariableName2EditPart.VISUAL_ID));
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
			if (type == stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3008) {
				return getChildBySemanticHint(stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
						.getType(stateAnalysis.diagram.edit.parts.StateVariableStateVariableInStateConstraintsCompartment2EditPart.VISUAL_ID));
			}
			if (type == stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateConstraint_3009) {
				return getChildBySemanticHint(stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
						.getType(stateAnalysis.diagram.edit.parts.StateVariableStateVariableOutStateConstraintsCompartment2EditPart.VISUAL_ID));
			}
			if (type == stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateUpdate_3010) {
				return getChildBySemanticHint(stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
						.getType(stateAnalysis.diagram.edit.parts.StateVariableStateVariableStateUpdatesCompartment2EditPart.VISUAL_ID));
			}
			if (type == stateAnalysis.diagram.providers.StateAnalysisElementTypes.StateVariable_3011) {
				return getChildBySemanticHint(stateAnalysis.diagram.part.StateAnalysisVisualIDRegistry
						.getType(stateAnalysis.diagram.edit.parts.StateVariableStateVariableInfluencedByCompartment2EditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class StateVariableFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureStateVariableLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fStateVariableInStateConstraintsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fStateVariableOutStateConstraintsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fStateVariableStateUpdatesCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fStateVariableInfluencedByCompartmentFigure;

		/**
		 * @generated
		 */
		public StateVariableFigure() {
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

			fFigureStateVariableLabelFigure = new WrappingLabel();

			fFigureStateVariableLabelFigure.setText("StateVariable");
			fFigureStateVariableLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureStateVariableLabelFigure);

			fStateVariableInStateConstraintsCompartmentFigure = new RectangleFigure();

			fStateVariableInStateConstraintsCompartmentFigure.setOutline(false);

			this.add(fStateVariableInStateConstraintsCompartmentFigure);

			fStateVariableOutStateConstraintsCompartmentFigure = new RectangleFigure();

			fStateVariableOutStateConstraintsCompartmentFigure
					.setOutline(false);

			this.add(fStateVariableOutStateConstraintsCompartmentFigure);

			fStateVariableStateUpdatesCompartmentFigure = new RectangleFigure();

			fStateVariableStateUpdatesCompartmentFigure.setOutline(false);

			this.add(fStateVariableStateUpdatesCompartmentFigure);

			fStateVariableInfluencedByCompartmentFigure = new RectangleFigure();

			fStateVariableInfluencedByCompartmentFigure.setOutline(false);

			this.add(fStateVariableInfluencedByCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStateVariableLabelFigure() {
			return fFigureStateVariableLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getStateVariableInStateConstraintsCompartmentFigure() {
			return fStateVariableInStateConstraintsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getStateVariableOutStateConstraintsCompartmentFigure() {
			return fStateVariableOutStateConstraintsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getStateVariableStateUpdatesCompartmentFigure() {
			return fStateVariableStateUpdatesCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getStateVariableInfluencedByCompartmentFigure() {
			return fStateVariableInfluencedByCompartmentFigure;
		}

	}

}
