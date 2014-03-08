// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.providers;

import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;

import net.certware.sacm.SACM.Evidence.parts.forms.AccuracyPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ActivityPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.AmplifiesPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ApprovedByPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.AssertionPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.AtLocationPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.AtTimePropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.CareOfPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ChallengesPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.CompletenessPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.CompliesToPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.CompositeObjectPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ConfidencePropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ConflictsPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ConsistencyPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ContainerCompletenessPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ContainerConsistencyPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.CreatedByPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.DependsOnPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.DocumentPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.EndTimePropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.EvidenceContainerPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.EvidenceGroupPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.EvidenceRequestPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ExhibitPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ExtendedDocumentPropertyPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ExtendedEvidenceAttributePropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ExtendedProjectPropertyPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.HasElectronicSourcePropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.HasMediaPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.HasRoleInPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.HasSecurityClassificationPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.HasVersionPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.IsAPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.IsAcquiredAtPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.IsBasedOnPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.IsCharacterizedByPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.IsCreatedAtPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.IsExpressedInLanguagePropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.IsGeneratedAtPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.IsModifiedByPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.IsPartOfPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.IsReleaseableToPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.IsRevokedAtPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.IsScopedByPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.IsTransferredToPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.MeansThatPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.MethodPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.NegatesPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.NotesPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ObjectPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ObjectifiedAssertionPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.OrganizationPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.OriginalityPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.OwnedByPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.PerformedByPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.PersonPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ProjectObjectivePropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ProvidesContextPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.RecordPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ReferencedClaimPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.RefutesPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.RelevancePropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ReliabilityPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ReportingPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.RequiresContainerPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ResolvesPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.RoleBindingPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.SatisfiesPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ServicePropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.SignificancePropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.StartTimePropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.StrengthPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.SupportPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.SupportsPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.ToolPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.UnknownObjectPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.UsingProcessPropertiesEditionPartForm;
import net.certware.sacm.SACM.Evidence.parts.forms.WeakensPropertiesEditionPartForm;

import net.certware.sacm.SACM.Evidence.parts.impl.AccuracyPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ActivityPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.AmplifiesPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ApprovedByPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.AssertionPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.AtLocationPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.AtTimePropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.CareOfPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ChallengesPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.CompletenessPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.CompliesToPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.CompositeObjectPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ConfidencePropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ConflictsPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ConsistencyPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ContainerCompletenessPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ContainerConsistencyPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.CreatedByPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.DependsOnPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.DocumentPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.EndTimePropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.EvidenceContainerPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.EvidenceGroupPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.EvidenceRequestPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ExhibitPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ExtendedDocumentPropertyPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ExtendedEvidenceAttributePropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ExtendedProjectPropertyPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.HasElectronicSourcePropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.HasMediaPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.HasRoleInPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.HasSecurityClassificationPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.HasVersionPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.IsAPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.IsAcquiredAtPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.IsBasedOnPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.IsCharacterizedByPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.IsCreatedAtPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.IsExpressedInLanguagePropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.IsGeneratedAtPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.IsModifiedByPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.IsPartOfPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.IsReleaseableToPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.IsRevokedAtPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.IsScopedByPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.IsTransferredToPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.MeansThatPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.MethodPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.NegatesPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.NotesPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ObjectPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ObjectifiedAssertionPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.OrganizationPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.OriginalityPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.OwnedByPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.PerformedByPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.PersonPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ProjectObjectivePropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ProvidesContextPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.RecordPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ReferencedClaimPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.RefutesPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.RelevancePropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ReliabilityPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ReportingPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.RequiresContainerPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ResolvesPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.RoleBindingPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.SatisfiesPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ServicePropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.SignificancePropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.StartTimePropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.StrengthPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.SupportPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.SupportsPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.ToolPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.UnknownObjectPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.UsingProcessPropertiesEditionPartImpl;
import net.certware.sacm.SACM.Evidence.parts.impl.WeakensPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * @author Kestrel Technology LLC
 * 
 */
public class EvidencePropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == EvidenceViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == EvidenceViewsRepository.Consistency.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ConsistencyPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ConsistencyPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Completeness.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new CompletenessPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new CompletenessPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Document.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new DocumentPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new DocumentPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Confidence.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ConfidencePropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ConfidencePropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.ApprovedBy.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ApprovedByPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ApprovedByPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.CreatedBy.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new CreatedByPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new CreatedByPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Tool.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ToolPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ToolPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Method.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new MethodPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new MethodPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.IsBasedOn.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new IsBasedOnPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new IsBasedOnPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.IsA.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new IsAPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new IsAPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.IsCharacterizedBy.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new IsCharacterizedByPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new IsCharacterizedByPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Person.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new PersonPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new PersonPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Organization.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new OrganizationPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new OrganizationPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.EvidenceContainer.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new EvidenceContainerPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new EvidenceContainerPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.EndTime.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new EndTimePropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new EndTimePropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Assertion.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new AssertionPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new AssertionPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Object.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ObjectPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ObjectPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.CompositeObject.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new CompositeObjectPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new CompositeObjectPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.RoleBinding.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new RoleBindingPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new RoleBindingPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.StartTime.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new StartTimePropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new StartTimePropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Relevance.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new RelevancePropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new RelevancePropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Significance.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new SignificancePropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new SignificancePropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Accuracy.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new AccuracyPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new AccuracyPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.HasRoleIn.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new HasRoleInPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new HasRoleInPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.IsScopedBy.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new IsScopedByPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new IsScopedByPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.AtTime.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new AtTimePropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new AtTimePropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Originality.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new OriginalityPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new OriginalityPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Reporting.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ReportingPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ReportingPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Reliability.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ReliabilityPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ReliabilityPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Supports.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new SupportsPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new SupportsPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.IsGeneratedAt.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new IsGeneratedAtPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new IsGeneratedAtPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Support.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new SupportPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new SupportPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Conflicts.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ConflictsPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ConflictsPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Refutes.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new RefutesPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new RefutesPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Negates.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new NegatesPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new NegatesPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.UnknownObject.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new UnknownObjectPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new UnknownObjectPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Resolves.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ResolvesPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ResolvesPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.EvidenceRequest.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new EvidenceRequestPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new EvidenceRequestPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.ProjectObjective.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ProjectObjectivePropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ProjectObjectivePropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Activity.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ActivityPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ActivityPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.DependsOn.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new DependsOnPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new DependsOnPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Satisfies.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new SatisfiesPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new SatisfiesPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.ReferencedClaim.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ReferencedClaimPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ReferencedClaimPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Weakens.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new WeakensPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new WeakensPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Amplifies.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new AmplifiesPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new AmplifiesPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Challenges.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ChallengesPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ChallengesPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Strength.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new StrengthPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new StrengthPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.IsAcquiredAt.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new IsAcquiredAtPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new IsAcquiredAtPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.IsTransferredTo.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new IsTransferredToPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new IsTransferredToPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.OwnedBy.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new OwnedByPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new OwnedByPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.IsPartOf.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new IsPartOfPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new IsPartOfPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.IsRevokedAt.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new IsRevokedAtPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new IsRevokedAtPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.ProvidesContext.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ProvidesContextPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ProvidesContextPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.MeansThat.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new MeansThatPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new MeansThatPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.CareOf.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new CareOfPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new CareOfPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.AtLocation.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new AtLocationPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new AtLocationPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.IsCreatedAt.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new IsCreatedAtPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new IsCreatedAtPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.RequiresContainer.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new RequiresContainerPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new RequiresContainerPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Service.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ServicePropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ServicePropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.HasElectronicSource.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new HasElectronicSourcePropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new HasElectronicSourcePropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.IsExpressedInLanguage.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new IsExpressedInLanguagePropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new IsExpressedInLanguagePropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.UsingProcess.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new UsingProcessPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new UsingProcessPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.HasSecurityClassification.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new HasSecurityClassificationPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new HasSecurityClassificationPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.IsReleaseableTo.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new IsReleaseableToPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new IsReleaseableToPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.EvidenceGroup.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new EvidenceGroupPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new EvidenceGroupPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.HasVersion.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new HasVersionPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new HasVersionPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.HasMedia.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new HasMediaPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new HasMediaPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Exhibit.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ExhibitPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ExhibitPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.ExtendedEvidenceAttribute.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ExtendedEvidenceAttributePropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ExtendedEvidenceAttributePropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.ExtendedDocumentProperty.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ExtendedDocumentPropertyPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ExtendedDocumentPropertyPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Record.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new RecordPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new RecordPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.ObjectifiedAssertion.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ObjectifiedAssertionPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ObjectifiedAssertionPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.IsModifiedBy.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new IsModifiedByPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new IsModifiedByPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.PerformedBy.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new PerformedByPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new PerformedByPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.ContainerConsistency.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ContainerConsistencyPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ContainerConsistencyPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.ContainerCompleteness.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ContainerCompletenessPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ContainerCompletenessPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.CompliesTo.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new CompliesToPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new CompliesToPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.ExtendedProjectProperty.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new ExtendedProjectPropertyPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new ExtendedProjectPropertyPropertiesEditionPartForm(component);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			if (kind == EvidenceViewsRepository.SWT_KIND)
				return new NotesPropertiesEditionPartImpl(component);
			if (kind == EvidenceViewsRepository.FORM_KIND)
				return new NotesPropertiesEditionPartForm(component);
		}
		return null;
	}

}
