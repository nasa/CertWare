/**
 * Generated with Acceleo
 */
package net.certware.argument.eur.providers;

import net.certware.argument.eur.parts.EurViewsRepository;
import net.certware.argument.eur.parts.forms.ArgumentPropertiesEditionPartForm;
import net.certware.argument.eur.parts.forms.AssumptionPropertiesEditionPartForm;
import net.certware.argument.eur.parts.forms.ContextPropertiesEditionPartForm;
import net.certware.argument.eur.parts.forms.CriteriaPropertiesEditionPartForm;
import net.certware.argument.eur.parts.forms.JustificationPropertiesEditionPartForm;
import net.certware.argument.eur.parts.forms.SolutionPropertiesEditionPartForm;
import net.certware.argument.eur.parts.forms.StrategyPropertiesEditionPartForm;
import net.certware.argument.eur.parts.impl.ArgumentPropertiesEditionPartImpl;
import net.certware.argument.eur.parts.impl.AssumptionPropertiesEditionPartImpl;
import net.certware.argument.eur.parts.impl.ContextPropertiesEditionPartImpl;
import net.certware.argument.eur.parts.impl.CriteriaPropertiesEditionPartImpl;
import net.certware.argument.eur.parts.impl.JustificationPropertiesEditionPartImpl;
import net.certware.argument.eur.parts.impl.SolutionPropertiesEditionPartImpl;
import net.certware.argument.eur.parts.impl.StrategyPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;




/**
 * 
 * 
 */
public class EurPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == EurViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == EurViewsRepository.Argument.class) {
			if (kind == EurViewsRepository.SWT_KIND)
				return new ArgumentPropertiesEditionPartImpl(component);
			if (kind == EurViewsRepository.FORM_KIND)
				return new ArgumentPropertiesEditionPartForm(component);
		}
		if (key == EurViewsRepository.Strategy.class) {
			if (kind == EurViewsRepository.SWT_KIND)
				return new StrategyPropertiesEditionPartImpl(component);
			if (kind == EurViewsRepository.FORM_KIND)
				return new StrategyPropertiesEditionPartForm(component);
		}
		if (key == EurViewsRepository.Solution.class) {
			if (kind == EurViewsRepository.SWT_KIND)
				return new SolutionPropertiesEditionPartImpl(component);
			if (kind == EurViewsRepository.FORM_KIND)
				return new SolutionPropertiesEditionPartForm(component);
		}
		if (key == EurViewsRepository.Assumption.class) {
			if (kind == EurViewsRepository.SWT_KIND)
				return new AssumptionPropertiesEditionPartImpl(component);
			if (kind == EurViewsRepository.FORM_KIND)
				return new AssumptionPropertiesEditionPartForm(component);
		}
		if (key == EurViewsRepository.Context.class) {
			if (kind == EurViewsRepository.SWT_KIND)
				return new ContextPropertiesEditionPartImpl(component);
			if (kind == EurViewsRepository.FORM_KIND)
				return new ContextPropertiesEditionPartForm(component);
		}
		if (key == EurViewsRepository.Justification.class) {
			if (kind == EurViewsRepository.SWT_KIND)
				return new JustificationPropertiesEditionPartImpl(component);
			if (kind == EurViewsRepository.FORM_KIND)
				return new JustificationPropertiesEditionPartForm(component);
		}
		if (key == EurViewsRepository.Criteria.class) {
			if (kind == EurViewsRepository.SWT_KIND)
				return new CriteriaPropertiesEditionPartImpl(component);
			if (kind == EurViewsRepository.FORM_KIND)
				return new CriteriaPropertiesEditionPartForm(component);
		}
		return null;
	}

}
