/**
 * Copyright (c) United States Government as represented by the National Aeronautics and Space Administration.
 * All rights reserved.
 */
package net.certware.argument.eur.providers;

import net.certware.argument.eur.EurPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.impl.providers.StandardPropertiesEditionPolicyProvider;

/**
 * @author mrb
 * 
 */
public class EurPackagePropertiesEditionPolicyProvider extends StandardPropertiesEditionPolicyProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider#provides(org.eclipse.emf.ecore.EObject)
	 * 
	 */
	public boolean provides(EObject eObject) {
		return EurPackage.eINSTANCE.equals(eObject.eClass().getEPackage()) || EurPackage.eINSTANCE.getESubpackages().contains(eObject.eClass().getEPackage());
	}

}
