// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Argumentation.providers;

import net.certware.sacm.SACM.Argumentation.parts.ArgumentationViewsRepository;

import net.certware.sacm.SACM.Argumentation.parts.forms.ArgumentReasoningPropertiesEditionPartForm;
import net.certware.sacm.SACM.Argumentation.parts.forms.ArgumentationPropertiesEditionPartForm;
import net.certware.sacm.SACM.Argumentation.parts.forms.AssertedChallengePropertiesEditionPartForm;
import net.certware.sacm.SACM.Argumentation.parts.forms.AssertedContextPropertiesEditionPartForm;
import net.certware.sacm.SACM.Argumentation.parts.forms.AssertedCounterEvidencePropertiesEditionPartForm;
import net.certware.sacm.SACM.Argumentation.parts.forms.AssertedEvidencePropertiesEditionPartForm;
import net.certware.sacm.SACM.Argumentation.parts.forms.AssertedInferencePropertiesEditionPartForm;
import net.certware.sacm.SACM.Argumentation.parts.forms.CitationElementPropertiesEditionPartForm;
import net.certware.sacm.SACM.Argumentation.parts.forms.ClaimPropertiesEditionPartForm;
import net.certware.sacm.SACM.Argumentation.parts.forms.InformationElementPropertiesEditionPartForm;
import net.certware.sacm.SACM.Argumentation.parts.forms.NotesPropertiesEditionPartForm;

import net.certware.sacm.SACM.Argumentation.parts.impl.ArgumentReasoningPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Argumentation.parts.impl.ArgumentationPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Argumentation.parts.impl.AssertedChallengePropertiesEditionPartImpl;
import net.certware.sacm.SACM.Argumentation.parts.impl.AssertedContextPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Argumentation.parts.impl.AssertedCounterEvidencePropertiesEditionPartImpl;
import net.certware.sacm.SACM.Argumentation.parts.impl.AssertedEvidencePropertiesEditionPartImpl;
import net.certware.sacm.SACM.Argumentation.parts.impl.AssertedInferencePropertiesEditionPartImpl;
import net.certware.sacm.SACM.Argumentation.parts.impl.CitationElementPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Argumentation.parts.impl.ClaimPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Argumentation.parts.impl.InformationElementPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Argumentation.parts.impl.NotesPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * @author Kestrel Technology LLC
 * 
 */
public class ArgumentationPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == ArgumentationViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == ArgumentationViewsRepository.Argumentation_.class) {
			if (kind == ArgumentationViewsRepository.SWT_KIND)
				return new ArgumentationPropertiesEditionPartImpl(component);
			if (kind == ArgumentationViewsRepository.FORM_KIND)
				return new ArgumentationPropertiesEditionPartForm(component);
		}
		if (key == ArgumentationViewsRepository.CitationElement.class) {
			if (kind == ArgumentationViewsRepository.SWT_KIND)
				return new CitationElementPropertiesEditionPartImpl(component);
			if (kind == ArgumentationViewsRepository.FORM_KIND)
				return new CitationElementPropertiesEditionPartForm(component);
		}
		if (key == ArgumentationViewsRepository.InformationElement.class) {
			if (kind == ArgumentationViewsRepository.SWT_KIND)
				return new InformationElementPropertiesEditionPartImpl(component);
			if (kind == ArgumentationViewsRepository.FORM_KIND)
				return new InformationElementPropertiesEditionPartForm(component);
		}
		if (key == ArgumentationViewsRepository.ArgumentReasoning.class) {
			if (kind == ArgumentationViewsRepository.SWT_KIND)
				return new ArgumentReasoningPropertiesEditionPartImpl(component);
			if (kind == ArgumentationViewsRepository.FORM_KIND)
				return new ArgumentReasoningPropertiesEditionPartForm(component);
		}
		if (key == ArgumentationViewsRepository.Claim.class) {
			if (kind == ArgumentationViewsRepository.SWT_KIND)
				return new ClaimPropertiesEditionPartImpl(component);
			if (kind == ArgumentationViewsRepository.FORM_KIND)
				return new ClaimPropertiesEditionPartForm(component);
		}
		if (key == ArgumentationViewsRepository.AssertedInference.class) {
			if (kind == ArgumentationViewsRepository.SWT_KIND)
				return new AssertedInferencePropertiesEditionPartImpl(component);
			if (kind == ArgumentationViewsRepository.FORM_KIND)
				return new AssertedInferencePropertiesEditionPartForm(component);
		}
		if (key == ArgumentationViewsRepository.AssertedEvidence.class) {
			if (kind == ArgumentationViewsRepository.SWT_KIND)
				return new AssertedEvidencePropertiesEditionPartImpl(component);
			if (kind == ArgumentationViewsRepository.FORM_KIND)
				return new AssertedEvidencePropertiesEditionPartForm(component);
		}
		if (key == ArgumentationViewsRepository.AssertedContext.class) {
			if (kind == ArgumentationViewsRepository.SWT_KIND)
				return new AssertedContextPropertiesEditionPartImpl(component);
			if (kind == ArgumentationViewsRepository.FORM_KIND)
				return new AssertedContextPropertiesEditionPartForm(component);
		}
		if (key == ArgumentationViewsRepository.AssertedChallenge.class) {
			if (kind == ArgumentationViewsRepository.SWT_KIND)
				return new AssertedChallengePropertiesEditionPartImpl(component);
			if (kind == ArgumentationViewsRepository.FORM_KIND)
				return new AssertedChallengePropertiesEditionPartForm(component);
		}
		if (key == ArgumentationViewsRepository.AssertedCounterEvidence.class) {
			if (kind == ArgumentationViewsRepository.SWT_KIND)
				return new AssertedCounterEvidencePropertiesEditionPartImpl(component);
			if (kind == ArgumentationViewsRepository.FORM_KIND)
				return new AssertedCounterEvidencePropertiesEditionPartForm(component);
		}
		if (key == ArgumentationViewsRepository.Notes.class) {
			if (kind == ArgumentationViewsRepository.SWT_KIND)
				return new NotesPropertiesEditionPartImpl(component);
			if (kind == ArgumentationViewsRepository.FORM_KIND)
				return new NotesPropertiesEditionPartForm(component);
		}
		return null;
	}

}
