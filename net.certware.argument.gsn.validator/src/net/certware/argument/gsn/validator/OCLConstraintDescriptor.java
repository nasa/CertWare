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
 * $Id: OCLConstraintDescriptor.java,v 1.2 2007/11/14 18:03:39 cdamus Exp $
 */
package net.certware.argument.gsn.validator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.model.ConstraintSeverity;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.AbstractConstraintDescriptor;
import org.eclipse.ocl.ecore.Constraint;

/**
 * Implementation of a constraint descriptor for our provider.
 * @author Christian W. Damus (cdamus)
 * @author mrb revised from above
 */
class OCLConstraintDescriptor extends AbstractConstraintDescriptor {
	private final Constraint constraint;
	private final String id;
	private final String name;
	private final String namespace;
	private final int code;
	
	public OCLConstraintDescriptor(String namespace, Constraint constraint, int code) {
		this.constraint = constraint;
		
		String name = constraint.getName();
		if (name == null) {
			name = Long.toHexString(System.identityHashCode(constraint));
		}
		
		id = namespace + '.' + name;
		this.name = name;
		this.namespace = namespace;
		this.code = code;
		
		System.err.println("OCL constraint descriptor " + constraint);
	}
	
	final Constraint getConstraint() {
		return constraint;
	}
	
	public String getBody() {
		return constraint.getSpecification().getBodyExpression().toString();
	}

	public String getDescription() {
		return getBody();
	}

	public EvaluationMode<?> getEvaluationMode() {
		return EvaluationMode.BATCH;
	}

	public String getId() {
		return id;
	}

	public String getMessagePattern() {
		return String.format("Constraint %s violated on {0}", getName()); //$NON-NLS-1$
	}

	public String getName() {
		return name;
	}

	public String getPluginId() {
		return namespace;
	}

	public ConstraintSeverity getSeverity() {
		return ConstraintSeverity.WARNING;
	}

	public int getStatusCode() {
		return code;
	}

	public boolean targetsEvent(Notification notification) {
		return false;
	}

	public boolean targetsTypeOf(EObject eObject) {
		return constraint.getSpecification().getContextVariable().getType().isInstance(eObject);
	}

}
