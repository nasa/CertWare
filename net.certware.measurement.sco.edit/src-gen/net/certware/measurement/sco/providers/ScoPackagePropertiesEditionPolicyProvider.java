/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.providers;

import net.certware.measurement.sco.ScoPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.impl.providers.StandardPropertiesEditionPolicyProvider;

/**
 * @author mrb
 * 
 */
public class ScoPackagePropertiesEditionPolicyProvider extends StandardPropertiesEditionPolicyProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider#provides(org.eclipse.emf.ecore.EObject)
	 * 
	 */
	public boolean provides(EObject eObject) {
		return ScoPackage.eINSTANCE.equals(eObject.eClass().getEPackage()) || ScoPackage.eINSTANCE.getESubpackages().contains(eObject.eClass().getEPackage());
	}

}
