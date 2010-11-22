package net.certware.argument.gsz.diagram.edit.policies;

import net.certware.argument.gsz.diagram.providers.GszElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class StrategyStrategySolutionsItemSemanticEditPolicy extends
		GszBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StrategyStrategySolutionsItemSemanticEditPolicy() {
		super(GszElementTypes.StrategyStrategySolutions_4009);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
