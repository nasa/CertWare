/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz.diagram.edit.parts;

import net.certware.argument.euz.diagram.edit.policies.SolutionSolutionEvidenceItemSemanticEditPolicy;

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
public class SolutionSolutionEvidenceEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4015;

	/**
	 * @generated
	 */
	public SolutionSolutionEvidenceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SolutionSolutionEvidenceItemSemanticEditPolicy());
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
		return new SolutionSolutionEvidenceFigure();
	}

	/**
	 * @generated
	 */
	public SolutionSolutionEvidenceFigure getPrimaryShape() {
		return (SolutionSolutionEvidenceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class SolutionSolutionEvidenceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public SolutionSolutionEvidenceFigure() {
			this.setForegroundColor(THIS_FORE);

		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}
