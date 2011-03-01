
package net.certware.argument.aml.providers;

import net.certware.argument.aml.AmlPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.impl.providers.StandardPropertiesEditionPolicyProvider;

/**
 * @author mrb
 * 
 */
public class AmlPackagePropertiesEditionPolicyProvider extends StandardPropertiesEditionPolicyProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider#provides(org.eclipse.emf.ecore.EObject)
	 * 
	 */
	public boolean provides(EObject eObject) {
		return AmlPackage.eINSTANCE.equals(eObject.eClass().getEPackage()) || AmlPackage.eINSTANCE.getESubpackages().contains(eObject.eClass().getEPackage());
	}

}
