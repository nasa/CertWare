package net.certware.argument.caz.diagram.edit.policies;

import net.certware.argument.caz.diagram.providers.CazElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ArgumentArgumentClaimsItemSemanticEditPolicy extends
		CazBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArgumentArgumentClaimsItemSemanticEditPolicy() {
		super(CazElementTypes.ArgumentArgumentClaims_4008);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
