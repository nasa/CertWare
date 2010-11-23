package net.certware.argument.gsz.diagram.edit.policies;

import net.certware.argument.gsz.diagram.providers.GszElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class SolutionSolutionEvidenceItemSemanticEditPolicy extends
		GszBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SolutionSolutionEvidenceItemSemanticEditPolicy() {
		super(GszElementTypes.SolutionSolutionEvidence_4010);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
