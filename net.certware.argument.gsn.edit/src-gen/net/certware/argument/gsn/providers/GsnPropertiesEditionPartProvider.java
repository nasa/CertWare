/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.providers;

import net.certware.argument.gsn.parts.GsnViewsRepository;
import net.certware.argument.gsn.parts.forms.ArgumentDiagramPropertiesEditionPartForm;
import net.certware.argument.gsn.parts.forms.AssumptionPropertiesEditionPartForm;
import net.certware.argument.gsn.parts.forms.ContextPropertiesEditionPartForm;
import net.certware.argument.gsn.parts.forms.GoalPropertiesEditionPartForm;
import net.certware.argument.gsn.parts.forms.JustificationPropertiesEditionPartForm;
import net.certware.argument.gsn.parts.forms.SolutionPropertiesEditionPartForm;
import net.certware.argument.gsn.parts.forms.StrategyPropertiesEditionPartForm;
import net.certware.argument.gsn.parts.impl.ArgumentDiagramPropertiesEditionPartImpl;
import net.certware.argument.gsn.parts.impl.AssumptionPropertiesEditionPartImpl;
import net.certware.argument.gsn.parts.impl.ContextPropertiesEditionPartImpl;
import net.certware.argument.gsn.parts.impl.GoalPropertiesEditionPartImpl;
import net.certware.argument.gsn.parts.impl.JustificationPropertiesEditionPartImpl;
import net.certware.argument.gsn.parts.impl.SolutionPropertiesEditionPartImpl;
import net.certware.argument.gsn.parts.impl.StrategyPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class GsnPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Class)
	 * 
	 */
	public boolean provides(java.lang.Class key) {
		return key == GsnViewsRepository.class;
	}

	
	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionComponent component) {
		if (key == GsnViewsRepository.Goal.class) {
			if (kind == GsnViewsRepository.SWT_KIND)
				return new GoalPropertiesEditionPartImpl(component);
			if (kind == GsnViewsRepository.FORM_KIND)
				return new GoalPropertiesEditionPartForm(component);
		}
		if (key == GsnViewsRepository.ArgumentDiagram.class) {
			if (kind == GsnViewsRepository.SWT_KIND)
				return new ArgumentDiagramPropertiesEditionPartImpl(component);
			if (kind == GsnViewsRepository.FORM_KIND)
				return new ArgumentDiagramPropertiesEditionPartForm(component);
		}
		if (key == GsnViewsRepository.Strategy.class) {
			if (kind == GsnViewsRepository.SWT_KIND)
				return new StrategyPropertiesEditionPartImpl(component);
			if (kind == GsnViewsRepository.FORM_KIND)
				return new StrategyPropertiesEditionPartForm(component);
		}
		if (key == GsnViewsRepository.Solution.class) {
			if (kind == GsnViewsRepository.SWT_KIND)
				return new SolutionPropertiesEditionPartImpl(component);
			if (kind == GsnViewsRepository.FORM_KIND)
				return new SolutionPropertiesEditionPartForm(component);
		}
		if (key == GsnViewsRepository.Assumption.class) {
			if (kind == GsnViewsRepository.SWT_KIND)
				return new AssumptionPropertiesEditionPartImpl(component);
			if (kind == GsnViewsRepository.FORM_KIND)
				return new AssumptionPropertiesEditionPartForm(component);
		}
		if (key == GsnViewsRepository.Context.class) {
			if (kind == GsnViewsRepository.SWT_KIND)
				return new ContextPropertiesEditionPartImpl(component);
			if (kind == GsnViewsRepository.FORM_KIND)
				return new ContextPropertiesEditionPartForm(component);
		}
		if (key == GsnViewsRepository.Justification.class) {
			if (kind == GsnViewsRepository.SWT_KIND)
				return new JustificationPropertiesEditionPartImpl(component);
			if (kind == GsnViewsRepository.FORM_KIND)
				return new JustificationPropertiesEditionPartForm(component);
		}
		return null;
	}

}
