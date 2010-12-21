/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import net.certware.argument.euz.diagram.edit.policies.ArgumentItemSemanticEditPolicy;
import net.certware.argument.euz.diagram.part.EuzVisualIDRegistry;
import net.certware.argument.euz.diagram.providers.EuzElementTypes;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
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
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ArgumentEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public ArgumentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ArgumentItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
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
		return primaryShape = new ArgumentFigure();
	}

	/**
	 * @generated
	 */
	public ArgumentFigure getPrimaryShape() {
		return (ArgumentFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ArgumentIdentifierEditPart) {
			((ArgumentIdentifierEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureArgumentLabelFigure());
			return true;
		}
		if (childEditPart instanceof ArgumentContentEditPart) {
			((ArgumentContentEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureModelElementContentLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ArgumentIdentifierEditPart) {
			return true;
		}
		if (childEditPart instanceof ArgumentContentEditPart) {
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
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 60);
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
		return getChildBySemanticHint(EuzVisualIDRegistry
				.getType(ArgumentIdentifierEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(EuzElementTypes.ArgumentArgumentStrategies_4001);
		types.add(EuzElementTypes.ArgumentArgumentAssumptions_4002);
		types.add(EuzElementTypes.ArgumentArgumentContexts_4003);
		types.add(EuzElementTypes.ArgumentArgumentSolutions_4004);
		types.add(EuzElementTypes.ArgumentArgumentCriteria_4005);
		types.add(EuzElementTypes.ArgumentArgumentJustifications_4006);
		types.add(EuzElementTypes.ArgumentSubArguments_4017);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof StrategyEditPart) {
			types.add(EuzElementTypes.ArgumentArgumentStrategies_4001);
		}
		if (targetEditPart instanceof AssumptionEditPart) {
			types.add(EuzElementTypes.ArgumentArgumentAssumptions_4002);
		}
		if (targetEditPart instanceof ContextEditPart) {
			types.add(EuzElementTypes.ArgumentArgumentContexts_4003);
		}
		if (targetEditPart instanceof SolutionEditPart) {
			types.add(EuzElementTypes.ArgumentArgumentSolutions_4004);
		}
		if (targetEditPart instanceof CriteriaEditPart) {
			types.add(EuzElementTypes.ArgumentArgumentCriteria_4005);
		}
		if (targetEditPart instanceof JustificationEditPart) {
			types.add(EuzElementTypes.ArgumentArgumentJustifications_4006);
		}
		if (targetEditPart instanceof net.certware.argument.euz.diagram.edit.parts.ArgumentEditPart) {
			types.add(EuzElementTypes.ArgumentSubArguments_4017);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == EuzElementTypes.ArgumentArgumentStrategies_4001) {
			types.add(EuzElementTypes.Strategy_2004);
		} else if (relationshipType == EuzElementTypes.ArgumentArgumentAssumptions_4002) {
			types.add(EuzElementTypes.Assumption_2005);
		} else if (relationshipType == EuzElementTypes.ArgumentArgumentContexts_4003) {
			types.add(EuzElementTypes.Context_2007);
		} else if (relationshipType == EuzElementTypes.ArgumentArgumentSolutions_4004) {
			types.add(EuzElementTypes.Solution_2002);
		} else if (relationshipType == EuzElementTypes.ArgumentArgumentCriteria_4005) {
			types.add(EuzElementTypes.Criteria_2008);
		} else if (relationshipType == EuzElementTypes.ArgumentArgumentJustifications_4006) {
			types.add(EuzElementTypes.Justification_2006);
		} else if (relationshipType == EuzElementTypes.ArgumentSubArguments_4017) {
			types.add(EuzElementTypes.Argument_2001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EuzElementTypes.ArgumentSubArguments_4017);
		types.add(EuzElementTypes.StrategyStrategyArguments_4010);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == EuzElementTypes.ArgumentSubArguments_4017) {
			types.add(EuzElementTypes.Argument_2001);
		} else if (relationshipType == EuzElementTypes.StrategyStrategyArguments_4010) {
			types.add(EuzElementTypes.Strategy_2004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ArgumentFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureArgumentLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureModelElementContentLabelFigure;

		/**
		 * @generated
		 */
		public ArgumentFigure() {
			this.setBackgroundColor(THIS_BACK);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(60)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureArgumentLabelFigure = new WrappingLabel();
			fFigureArgumentLabelFigure.setText("Argument");
			fFigureArgumentLabelFigure.setTextWrap(true);

			this.add(fFigureArgumentLabelFigure);

			fFigureModelElementContentLabelFigure = new WrappingLabel();
			fFigureModelElementContentLabelFigure.setText("");
			fFigureModelElementContentLabelFigure.setTextWrap(true);

			this.add(fFigureModelElementContentLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureArgumentLabelFigure() {
			return fFigureArgumentLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureModelElementContentLabelFigure() {
			return fFigureModelElementContentLabelFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 152, 251, 152);

}
