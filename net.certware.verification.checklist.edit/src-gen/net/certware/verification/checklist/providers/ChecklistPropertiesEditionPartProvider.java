/**
 * Generated with Acceleo
 */
package net.certware.verification.checklist.providers;

import net.certware.verification.checklist.parts.ChecklistViewsRepository;
import net.certware.verification.checklist.parts.forms.CategoryPropertiesEditionPartForm;
import net.certware.verification.checklist.parts.forms.ChecklistPropertiesEditionPartForm;
import net.certware.verification.checklist.parts.forms.ItemPropertiesEditionPartForm;
import net.certware.verification.checklist.parts.impl.CategoryPropertiesEditionPartImpl;
import net.certware.verification.checklist.parts.impl.ChecklistPropertiesEditionPartImpl;
import net.certware.verification.checklist.parts.impl.ItemPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class ChecklistPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Class)
	 * 
	 */
	public boolean provides(java.lang.Class key) {
		return key == ChecklistViewsRepository.class;
	}

	
	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionComponent component) {
		if (key == ChecklistViewsRepository.Category.class) {
			if (kind == ChecklistViewsRepository.SWT_KIND)
				return new CategoryPropertiesEditionPartImpl(component);
			if (kind == ChecklistViewsRepository.FORM_KIND)
				return new CategoryPropertiesEditionPartForm(component);
		}
		if (key == ChecklistViewsRepository.Item.class) {
			if (kind == ChecklistViewsRepository.SWT_KIND)
				return new ItemPropertiesEditionPartImpl(component);
			if (kind == ChecklistViewsRepository.FORM_KIND)
				return new ItemPropertiesEditionPartForm(component);
		}
		if (key == ChecklistViewsRepository.Checklist.class) {
			if (kind == ChecklistViewsRepository.SWT_KIND)
				return new ChecklistPropertiesEditionPartImpl(component);
			if (kind == ChecklistViewsRepository.FORM_KIND)
				return new ChecklistPropertiesEditionPartForm(component);
		}
		return null;
	}

}
