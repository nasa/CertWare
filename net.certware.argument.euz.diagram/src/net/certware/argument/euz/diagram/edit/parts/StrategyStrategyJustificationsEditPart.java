/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz.diagram.edit.parts;

import net.certware.argument.euz.diagram.edit.policies.StrategyStrategyJustificationsItemSemanticEditPolicy;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class StrategyStrategyJustificationsEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4011;

	/**
	 * @generated
	 */
	public StrategyStrategyJustificationsEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new StrategyStrategyJustificationsItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new StrategyStrategyJustificationsFigure();
	}

	/**
	 * @generated
	 */
	public StrategyStrategyJustificationsFigure getPrimaryShape() {
		return (StrategyStrategyJustificationsFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class StrategyStrategyJustificationsFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		public StrategyStrategyJustificationsFigure() {
			this.setForegroundColor(THIS_FORE);

		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}
