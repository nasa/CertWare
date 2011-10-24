/*
 * Copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */
package net.certware.argument.arm.providers;

import net.certware.argument.arm.parts.ArmViewsRepository;
import net.certware.argument.arm.parts.forms.AnnotationPropertiesEditionPartForm;
import net.certware.argument.arm.parts.forms.ArgumentPropertiesEditionPartForm;
import net.certware.argument.arm.parts.forms.ArgumentReasoningPropertiesEditionPartForm;
import net.certware.argument.arm.parts.forms.AssertedChallengePropertiesEditionPartForm;
import net.certware.argument.arm.parts.forms.AssertedContextPropertiesEditionPartForm;
import net.certware.argument.arm.parts.forms.AssertedCounterEvidencePropertiesEditionPartForm;
import net.certware.argument.arm.parts.forms.AssertedEvidencePropertiesEditionPartForm;
import net.certware.argument.arm.parts.forms.AssertedInferencePropertiesEditionPartForm;
import net.certware.argument.arm.parts.forms.CitationElementPropertiesEditionPartForm;
import net.certware.argument.arm.parts.forms.ClaimPropertiesEditionPartForm;
import net.certware.argument.arm.parts.forms.EvidenceAssertionPropertiesEditionPartForm;
import net.certware.argument.arm.parts.forms.InformationElementPropertiesEditionPartForm;
import net.certware.argument.arm.parts.forms.TaggedValuePropertiesEditionPartForm;
import net.certware.argument.arm.parts.impl.AnnotationPropertiesEditionPartImpl;
import net.certware.argument.arm.parts.impl.ArgumentPropertiesEditionPartImpl;
import net.certware.argument.arm.parts.impl.ArgumentReasoningPropertiesEditionPartImpl;
import net.certware.argument.arm.parts.impl.AssertedChallengePropertiesEditionPartImpl;
import net.certware.argument.arm.parts.impl.AssertedContextPropertiesEditionPartImpl;
import net.certware.argument.arm.parts.impl.AssertedCounterEvidencePropertiesEditionPartImpl;
import net.certware.argument.arm.parts.impl.AssertedEvidencePropertiesEditionPartImpl;
import net.certware.argument.arm.parts.impl.AssertedInferencePropertiesEditionPartImpl;
import net.certware.argument.arm.parts.impl.CitationElementPropertiesEditionPartImpl;
import net.certware.argument.arm.parts.impl.ClaimPropertiesEditionPartImpl;
import net.certware.argument.arm.parts.impl.EvidenceAssertionPropertiesEditionPartImpl;
import net.certware.argument.arm.parts.impl.InformationElementPropertiesEditionPartImpl;
import net.certware.argument.arm.parts.impl.TaggedValuePropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * @author
 * 
 */
public class ArmPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Class)
	 * 
	 */
	public boolean provides(java.lang.Class key) {
		return key == ArmViewsRepository.class;
	}

	
	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionComponent component) {
		if (key == ArmViewsRepository.TaggedValue.class) {
			if (kind == ArmViewsRepository.SWT_KIND)
				return new TaggedValuePropertiesEditionPartImpl(component);
			if (kind == ArmViewsRepository.FORM_KIND)
				return new TaggedValuePropertiesEditionPartForm(component);
		}
		if (key == ArmViewsRepository.Argument.class) {
			if (kind == ArmViewsRepository.SWT_KIND)
				return new ArgumentPropertiesEditionPartImpl(component);
			if (kind == ArmViewsRepository.FORM_KIND)
				return new ArgumentPropertiesEditionPartForm(component);
		}
		if (key == ArmViewsRepository.Annotation.class) {
			if (kind == ArmViewsRepository.SWT_KIND)
				return new AnnotationPropertiesEditionPartImpl(component);
			if (kind == ArmViewsRepository.FORM_KIND)
				return new AnnotationPropertiesEditionPartForm(component);
		}
		if (key == ArmViewsRepository.AssertedInference.class) {
			if (kind == ArmViewsRepository.SWT_KIND)
				return new AssertedInferencePropertiesEditionPartImpl(component);
			if (kind == ArmViewsRepository.FORM_KIND)
				return new AssertedInferencePropertiesEditionPartForm(component);
		}
		if (key == ArmViewsRepository.AssertedEvidence.class) {
			if (kind == ArmViewsRepository.SWT_KIND)
				return new AssertedEvidencePropertiesEditionPartImpl(component);
			if (kind == ArmViewsRepository.FORM_KIND)
				return new AssertedEvidencePropertiesEditionPartForm(component);
		}
		if (key == ArmViewsRepository.AssertedContext.class) {
			if (kind == ArmViewsRepository.SWT_KIND)
				return new AssertedContextPropertiesEditionPartImpl(component);
			if (kind == ArmViewsRepository.FORM_KIND)
				return new AssertedContextPropertiesEditionPartForm(component);
		}
		if (key == ArmViewsRepository.AssertedCounterEvidence.class) {
			if (kind == ArmViewsRepository.SWT_KIND)
				return new AssertedCounterEvidencePropertiesEditionPartImpl(component);
			if (kind == ArmViewsRepository.FORM_KIND)
				return new AssertedCounterEvidencePropertiesEditionPartForm(component);
		}
		if (key == ArmViewsRepository.AssertedChallenge.class) {
			if (kind == ArmViewsRepository.SWT_KIND)
				return new AssertedChallengePropertiesEditionPartImpl(component);
			if (kind == ArmViewsRepository.FORM_KIND)
				return new AssertedChallengePropertiesEditionPartForm(component);
		}
		if (key == ArmViewsRepository.Claim.class) {
			if (kind == ArmViewsRepository.SWT_KIND)
				return new ClaimPropertiesEditionPartImpl(component);
			if (kind == ArmViewsRepository.FORM_KIND)
				return new ClaimPropertiesEditionPartForm(component);
		}
		if (key == ArmViewsRepository.EvidenceAssertion.class) {
			if (kind == ArmViewsRepository.SWT_KIND)
				return new EvidenceAssertionPropertiesEditionPartImpl(component);
			if (kind == ArmViewsRepository.FORM_KIND)
				return new EvidenceAssertionPropertiesEditionPartForm(component);
		}
		if (key == ArmViewsRepository.InformationElement.class) {
			if (kind == ArmViewsRepository.SWT_KIND)
				return new InformationElementPropertiesEditionPartImpl(component);
			if (kind == ArmViewsRepository.FORM_KIND)
				return new InformationElementPropertiesEditionPartForm(component);
		}
		if (key == ArmViewsRepository.ArgumentReasoning.class) {
			if (kind == ArmViewsRepository.SWT_KIND)
				return new ArgumentReasoningPropertiesEditionPartImpl(component);
			if (kind == ArmViewsRepository.FORM_KIND)
				return new ArgumentReasoningPropertiesEditionPartForm(component);
		}
		if (key == ArmViewsRepository.CitationElement.class) {
			if (kind == ArmViewsRepository.SWT_KIND)
				return new CitationElementPropertiesEditionPartImpl(component);
			if (kind == ArmViewsRepository.FORM_KIND)
				return new CitationElementPropertiesEditionPartForm(component);
		}
		return null;
	}

}
