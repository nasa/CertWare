/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.providers;

import net.certware.argument.gsn.GsnPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.impl.providers.StandardPropertiesEditionPolicyProvider;

/**
 * 
 * 
 */
public class GsnPackagePropertiesEditionPolicyProvider extends StandardPropertiesEditionPolicyProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider#provides(org.eclipse.emf.ecore.EObject)
	 * 
	 */
	public boolean provides(EObject eObject) {
		return GsnPackage.eINSTANCE.equals(eObject.eClass().getEPackage()) || GsnPackage.eINSTANCE.getESubpackages().contains(eObject.eClass().getEPackage());
	}

}
