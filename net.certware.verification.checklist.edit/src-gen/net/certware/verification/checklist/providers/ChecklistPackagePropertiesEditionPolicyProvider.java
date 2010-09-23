/**
 * Generated with Acceleo
 */
package net.certware.verification.checklist.providers;

import net.certware.verification.checklist.ChecklistPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.impl.providers.StandardPropertiesEditionPolicyProvider;

/**
 * 
 * 
 */
public class ChecklistPackagePropertiesEditionPolicyProvider extends StandardPropertiesEditionPolicyProvider {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider#provides(org.eclipse.emf.ecore.EObject)
	 * 
	 */
	public boolean provides(EObject eObject) {
		return ChecklistPackage.eINSTANCE.equals(eObject.eClass().getEPackage()) || ChecklistPackage.eINSTANCE.getESubpackages().contains(eObject.eClass().getEPackage());
	}

}
