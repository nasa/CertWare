
package net.certware.argument.aml.providers;

import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.forms.AggregationRulePropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.AmlDocumentPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.AnnotationPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.AnswerPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.ArgumentPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.ArgumentTemplatePropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.BeliefPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.ChoicePropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.CollectionItemPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.CollectionPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.CoveragePropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.CreatingToolPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.CreatorPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.DependentPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.DiscoveryMethodPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.DocumentRootPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.EndPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.EvidenceExhibitPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.EvidencePropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.ExhibitPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.FlagPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.IntervalPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.ListPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.MemoPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.MetaDataPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.NationStatePropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.ParameterPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.PeriodPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.PersonPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.PublisherPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.QuestionPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.QuestionRelationshipsPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.ReaderPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.RelevancePropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.ReliabilityPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.StartPropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.TemplatePropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.ValuePropertiesEditionPartForm;
import net.certware.argument.aml.parts.forms.WitnessPropertiesEditionPartForm;
import net.certware.argument.aml.parts.impl.AggregationRulePropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.AmlDocumentPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.AnnotationPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.AnswerPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.ArgumentPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.ArgumentTemplatePropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.BeliefPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.ChoicePropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.CollectionItemPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.CollectionPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.CoveragePropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.CreatingToolPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.CreatorPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.DependentPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.DiscoveryMethodPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.DocumentRootPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.EndPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.EvidenceExhibitPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.EvidencePropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.ExhibitPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.FlagPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.IntervalPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.ListPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.MemoPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.MetaDataPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.NationStatePropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.ParameterPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.PeriodPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.PersonPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.PublisherPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.QuestionPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.QuestionRelationshipsPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.ReaderPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.RelevancePropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.ReliabilityPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.StartPropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.TemplatePropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.ValuePropertiesEditionPartImpl;
import net.certware.argument.aml.parts.impl.WitnessPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * @author mrb
 * 
 */
public class AmlPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Class)
	 * 
	 */
	public boolean provides(java.lang.Class key) {
		return key == AmlViewsRepository.class;
	}

	
	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionComponent component) {
		if (key == AmlViewsRepository.AggregationRule.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new AggregationRulePropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new AggregationRulePropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.AmlDocument.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new AmlDocumentPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new AmlDocumentPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Annotation.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new AnnotationPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new AnnotationPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Answer.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new AnswerPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new AnswerPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.ArgumentTemplate.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new ArgumentTemplatePropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new ArgumentTemplatePropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Argument.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new ArgumentPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new ArgumentPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Belief.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new BeliefPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new BeliefPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Choice.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new ChoicePropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new ChoicePropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.CollectionItem.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new CollectionItemPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new CollectionItemPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Collection.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new CollectionPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new CollectionPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Coverage.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new CoveragePropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new CoveragePropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.CreatingTool.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new CreatingToolPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new CreatingToolPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Creator.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new CreatorPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new CreatorPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Dependent.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new DependentPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new DependentPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.DiscoveryMethod.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new DiscoveryMethodPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new DiscoveryMethodPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.DocumentRoot.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new DocumentRootPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new DocumentRootPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.End.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new EndPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new EndPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.EvidenceExhibit.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new EvidenceExhibitPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new EvidenceExhibitPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Evidence.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new EvidencePropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new EvidencePropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Exhibit.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new ExhibitPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new ExhibitPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Flag.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new FlagPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new FlagPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Interval.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new IntervalPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new IntervalPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.List.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new ListPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new ListPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Memo.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new MemoPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new MemoPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.MetaData.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new MetaDataPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new MetaDataPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.NationState.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new NationStatePropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new NationStatePropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Parameter.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new ParameterPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new ParameterPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Period.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new PeriodPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new PeriodPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Person.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new PersonPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new PersonPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Publisher.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new PublisherPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new PublisherPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.QuestionRelationships.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new QuestionRelationshipsPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new QuestionRelationshipsPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Question.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new QuestionPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new QuestionPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Reader.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new ReaderPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new ReaderPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Relevance.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new RelevancePropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new RelevancePropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Reliability.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new ReliabilityPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new ReliabilityPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Start.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new StartPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new StartPropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Template.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new TemplatePropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new TemplatePropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Value.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new ValuePropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new ValuePropertiesEditionPartForm(component);
		}
		if (key == AmlViewsRepository.Witness.class) {
			if (kind == AmlViewsRepository.SWT_KIND)
				return new WitnessPropertiesEditionPartImpl(component);
			if (kind == AmlViewsRepository.FORM_KIND)
				return new WitnessPropertiesEditionPartForm(component);
		}
		return null;
	}

}
