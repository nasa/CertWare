/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.providers;

import net.certware.measurement.sco.parts.ScoViewsRepository;

import net.certware.measurement.sco.parts.forms.ArtifactCommitPropertiesEditionPartForm;
import net.certware.measurement.sco.parts.forms.ArtifactIdentifierPropertiesEditionPartForm;
import net.certware.measurement.sco.parts.forms.CommitHistoryPropertiesEditionPartForm;
import net.certware.measurement.sco.parts.forms.CriticalDefectChangeOrdersPropertiesEditionPartForm;
import net.certware.measurement.sco.parts.forms.ImprovementChangeOrdersPropertiesEditionPartForm;
import net.certware.measurement.sco.parts.forms.NewFeatureChangeOrdersPropertiesEditionPartForm;
import net.certware.measurement.sco.parts.forms.NormalDefectChangeOrdersPropertiesEditionPartForm;
import net.certware.measurement.sco.parts.forms.TotalChangeOrdersPropertiesEditionPartForm;

import net.certware.measurement.sco.parts.impl.ArtifactCommitPropertiesEditionPartImpl;
import net.certware.measurement.sco.parts.impl.ArtifactIdentifierPropertiesEditionPartImpl;
import net.certware.measurement.sco.parts.impl.CommitHistoryPropertiesEditionPartImpl;
import net.certware.measurement.sco.parts.impl.CriticalDefectChangeOrdersPropertiesEditionPartImpl;
import net.certware.measurement.sco.parts.impl.ImprovementChangeOrdersPropertiesEditionPartImpl;
import net.certware.measurement.sco.parts.impl.NewFeatureChangeOrdersPropertiesEditionPartImpl;
import net.certware.measurement.sco.parts.impl.NormalDefectChangeOrdersPropertiesEditionPartImpl;
import net.certware.measurement.sco.parts.impl.TotalChangeOrdersPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class ScoPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == ScoViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == ScoViewsRepository.TotalChangeOrders.class) {
			if (kind == ScoViewsRepository.SWT_KIND)
				return new TotalChangeOrdersPropertiesEditionPartImpl(component);
			if (kind == ScoViewsRepository.FORM_KIND)
				return new TotalChangeOrdersPropertiesEditionPartForm(component);
		}
		if (key == ScoViewsRepository.CriticalDefectChangeOrders.class) {
			if (kind == ScoViewsRepository.SWT_KIND)
				return new CriticalDefectChangeOrdersPropertiesEditionPartImpl(component);
			if (kind == ScoViewsRepository.FORM_KIND)
				return new CriticalDefectChangeOrdersPropertiesEditionPartForm(component);
		}
		if (key == ScoViewsRepository.NormalDefectChangeOrders.class) {
			if (kind == ScoViewsRepository.SWT_KIND)
				return new NormalDefectChangeOrdersPropertiesEditionPartImpl(component);
			if (kind == ScoViewsRepository.FORM_KIND)
				return new NormalDefectChangeOrdersPropertiesEditionPartForm(component);
		}
		if (key == ScoViewsRepository.ImprovementChangeOrders.class) {
			if (kind == ScoViewsRepository.SWT_KIND)
				return new ImprovementChangeOrdersPropertiesEditionPartImpl(component);
			if (kind == ScoViewsRepository.FORM_KIND)
				return new ImprovementChangeOrdersPropertiesEditionPartForm(component);
		}
		if (key == ScoViewsRepository.NewFeatureChangeOrders.class) {
			if (kind == ScoViewsRepository.SWT_KIND)
				return new NewFeatureChangeOrdersPropertiesEditionPartImpl(component);
			if (kind == ScoViewsRepository.FORM_KIND)
				return new NewFeatureChangeOrdersPropertiesEditionPartForm(component);
		}
		if (key == ScoViewsRepository.ArtifactIdentifier.class) {
			if (kind == ScoViewsRepository.SWT_KIND)
				return new ArtifactIdentifierPropertiesEditionPartImpl(component);
			if (kind == ScoViewsRepository.FORM_KIND)
				return new ArtifactIdentifierPropertiesEditionPartForm(component);
		}
		if (key == ScoViewsRepository.ArtifactCommit.class) {
			if (kind == ScoViewsRepository.SWT_KIND)
				return new ArtifactCommitPropertiesEditionPartImpl(component);
			if (kind == ScoViewsRepository.FORM_KIND)
				return new ArtifactCommitPropertiesEditionPartForm(component);
		}
		if (key == ScoViewsRepository.CommitHistory.class) {
			if (kind == ScoViewsRepository.SWT_KIND)
				return new CommitHistoryPropertiesEditionPartImpl(component);
			if (kind == ScoViewsRepository.FORM_KIND)
				return new CommitHistoryPropertiesEditionPartForm(component);
		}
		return null;
	}

}
