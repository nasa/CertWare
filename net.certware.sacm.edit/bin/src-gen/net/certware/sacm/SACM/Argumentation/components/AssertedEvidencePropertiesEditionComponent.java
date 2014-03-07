// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Argumentation.components;

// Start of user code for imports
import net.certware.sacm.SACM.Argumentation.AssertedEvidence;
import net.certware.sacm.SACM.Argumentation.parts.ArgumentationViewsRepository;
import net.certware.sacm.SACM.Argumentation.parts.AssertedEvidencePropertiesEditionPart;
import net.certware.sacm.SACM.Argumentation.parts.NotesPropertiesEditionPart;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


// End of user code

/**
 * @author Kestrel Technology LLC
 * 
 */
public class AssertedEvidencePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private AssertedEvidencePropertiesEditionPart basePart;

	/**
	 * The AssertedEvidenceBasePropertiesEditionComponent sub component
	 * 
	 */
	protected AssertedEvidenceBasePropertiesEditionComponent assertedEvidenceBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The AssertedEvidenceNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected AssertedEvidenceNotesPropertiesEditionComponent assertedEvidenceNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param assertedEvidence the EObject to edit
	 * 
	 */
	public AssertedEvidencePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject assertedEvidence, String editing_mode) {
		super(editingContext, editing_mode);
		if (assertedEvidence instanceof AssertedEvidence) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(assertedEvidence, PropertiesEditingProvider.class);
			assertedEvidenceBasePropertiesEditionComponent = (AssertedEvidenceBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, AssertedEvidenceBasePropertiesEditionComponent.BASE_PART, AssertedEvidenceBasePropertiesEditionComponent.class);
			addSubComponent(assertedEvidenceBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(assertedEvidence, PropertiesEditingProvider.class);
			assertedEvidenceNotesPropertiesEditionComponent = (AssertedEvidenceNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, AssertedEvidenceNotesPropertiesEditionComponent.NOTES_PART, AssertedEvidenceNotesPropertiesEditionComponent.class);
			addSubComponent(assertedEvidenceNotesPropertiesEditionComponent);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      getPropertiesEditionPart(int, java.lang.String)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (AssertedEvidenceBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (AssertedEvidencePropertiesEditionPart)assertedEvidenceBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (AssertedEvidenceNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)assertedEvidenceNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)notesPart;
		}
		return super.getPropertiesEditionPart(kind, key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Object, int,
	 *      org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 * 
	 */
	public void setPropertiesEditionPart(java.lang.Object key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (ArgumentationViewsRepository.AssertedEvidence.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (AssertedEvidencePropertiesEditionPart)propertiesEditionPart;
		}
		if (ArgumentationViewsRepository.Notes.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			notesPart = (NotesPropertiesEditionPart)propertiesEditionPart;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Object key, int kind, EObject element, ResourceSet allResource) {
		if (key == ArgumentationViewsRepository.AssertedEvidence.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ArgumentationViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
