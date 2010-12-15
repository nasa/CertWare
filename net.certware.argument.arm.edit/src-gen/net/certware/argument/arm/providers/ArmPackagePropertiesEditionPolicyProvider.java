
package net.certware.argument.arm.providers;

import net.certware.argument.arm.ArmPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.impl.providers.StandardPropertiesEditionPolicyProvider;

/**
 * @author
 * 
 */
public class ArmPackagePropertiesEditionPolicyProvider extends StandardPropertiesEditionPolicyProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider#provides(org.eclipse.emf.ecore.EObject)
	 * 
	 */
	public boolean provides(EObject eObject) {
		return ArmPackage.eINSTANCE.equals(eObject.eClass().getEPackage()) || ArmPackage.eINSTANCE.getESubpackages().contains(eObject.eClass().getEPackage());
	}

}
