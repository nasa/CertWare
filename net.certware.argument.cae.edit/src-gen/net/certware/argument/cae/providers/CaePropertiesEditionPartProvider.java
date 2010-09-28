/**
 * Generated with Acceleo
 */
package net.certware.argument.cae.providers;

import net.certware.argument.cae.parts.CaeViewsRepository;
import net.certware.argument.cae.parts.forms.ArgumentPropertiesEditionPartForm;
import net.certware.argument.cae.parts.forms.AssumptionPropertiesEditionPartForm;
import net.certware.argument.cae.parts.forms.ClaimPropertiesEditionPartForm;
import net.certware.argument.cae.parts.forms.ContextPropertiesEditionPartForm;
import net.certware.argument.cae.parts.forms.EvidencePropertiesEditionPartForm;
import net.certware.argument.cae.parts.forms.JustificationPropertiesEditionPartForm;
import net.certware.argument.cae.parts.impl.ArgumentPropertiesEditionPartImpl;
import net.certware.argument.cae.parts.impl.AssumptionPropertiesEditionPartImpl;
import net.certware.argument.cae.parts.impl.ClaimPropertiesEditionPartImpl;
import net.certware.argument.cae.parts.impl.ContextPropertiesEditionPartImpl;
import net.certware.argument.cae.parts.impl.EvidencePropertiesEditionPartImpl;
import net.certware.argument.cae.parts.impl.JustificationPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * @author mrb
 * 
 */
public class CaePropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Class)
	 * 
	 */
	public boolean provides(java.lang.Class key) {
		return key == CaeViewsRepository.class;
	}

	
	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionComponent component) {
		if (key == CaeViewsRepository.Claim.class) {
			if (kind == CaeViewsRepository.SWT_KIND)
				return new ClaimPropertiesEditionPartImpl(component);
			if (kind == CaeViewsRepository.FORM_KIND)
				return new ClaimPropertiesEditionPartForm(component);
		}
		if (key == CaeViewsRepository.Argument.class) {
			if (kind == CaeViewsRepository.SWT_KIND)
				return new ArgumentPropertiesEditionPartImpl(component);
			if (kind == CaeViewsRepository.FORM_KIND)
				return new ArgumentPropertiesEditionPartForm(component);
		}
		if (key == CaeViewsRepository.Evidence.class) {
			if (kind == CaeViewsRepository.SWT_KIND)
				return new EvidencePropertiesEditionPartImpl(component);
			if (kind == CaeViewsRepository.FORM_KIND)
				return new EvidencePropertiesEditionPartForm(component);
		}
		if (key == CaeViewsRepository.Assumption.class) {
			if (kind == CaeViewsRepository.SWT_KIND)
				return new AssumptionPropertiesEditionPartImpl(component);
			if (kind == CaeViewsRepository.FORM_KIND)
				return new AssumptionPropertiesEditionPartForm(component);
		}
		if (key == CaeViewsRepository.Context.class) {
			if (kind == CaeViewsRepository.SWT_KIND)
				return new ContextPropertiesEditionPartImpl(component);
			if (kind == CaeViewsRepository.FORM_KIND)
				return new ContextPropertiesEditionPartForm(component);
		}
		if (key == CaeViewsRepository.Justification.class) {
			if (kind == CaeViewsRepository.SWT_KIND)
				return new JustificationPropertiesEditionPartImpl(component);
			if (kind == CaeViewsRepository.FORM_KIND)
				return new JustificationPropertiesEditionPartForm(component);
		}
		return null;
	}

}
