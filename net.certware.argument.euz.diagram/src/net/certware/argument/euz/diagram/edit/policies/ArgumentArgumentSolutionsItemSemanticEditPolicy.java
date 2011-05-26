/*
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.euz.diagram.edit.policies;

import net.certware.argument.euz.diagram.providers.EuzElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ArgumentArgumentSolutionsItemSemanticEditPolicy extends
		EuzBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArgumentArgumentSolutionsItemSemanticEditPolicy() {
		super(EuzElementTypes.ArgumentArgumentSolutions_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
