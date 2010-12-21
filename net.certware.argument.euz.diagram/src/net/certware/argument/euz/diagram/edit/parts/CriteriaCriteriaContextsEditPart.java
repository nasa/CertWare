/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz.diagram.edit.parts;

import net.certware.argument.euz.diagram.edit.policies.CriteriaCriteriaContextsItemSemanticEditPolicy;

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
public class CriteriaCriteriaContextsEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4008;

	/**
	 * @generated
	 */
	public CriteriaCriteriaContextsEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CriteriaCriteriaContextsItemSemanticEditPolicy());
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
		return new CriteriaCriteriaContextsFigure();
	}

	/**
	 * @generated
	 */
	public CriteriaCriteriaContextsFigure getPrimaryShape() {
		return (CriteriaCriteriaContextsFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class CriteriaCriteriaContextsFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public CriteriaCriteriaContextsFigure() {
			this.setForegroundColor(THIS_FORE);

		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}
