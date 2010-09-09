/**
 * <copyright>
 *
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: OCLConstraint.java,v 1.1 2007/05/07 16:12:12 cdamus Exp $
 */
package net.certware.argument.gsn.validator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.ocl.AbstractOCLModelConstraint;
import org.eclipse.ocl.EnvironmentFactory;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

/**
 * Implementation of the constraint that our provider provides.
 *
 * @author Christian W. Damus (cdamus)
 * @author mrb modified from above
 */
class OCLConstraint extends AbstractOCLModelConstraint<EClassifier, Constraint, EClass, EObject> {
	private final OCL.Query query;
	
	OCLConstraint(OCLConstraintDescriptor desc, OCL ocl) {
		super(desc);
		
		this.query = ocl.createQuery(desc.getConstraint());
		System.err.println("created OCL constraint " + query);
	}
	
	// override this method to indicate that we are doing new-style OCL
	@Override
	protected EnvironmentFactory<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, Constraint, EClass, EObject>
	createOCLEnvironmentFactory() {
		return query.getOCL().getEnvironment().getFactory();
	}
	
	@Override
	public Query<EClassifier, EClass, EObject> getConstraintCondition(EObject target) {
		return query;
	}
}
