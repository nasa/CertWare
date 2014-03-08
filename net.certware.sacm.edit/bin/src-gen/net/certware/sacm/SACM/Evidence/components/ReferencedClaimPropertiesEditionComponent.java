// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.ReferencedClaim;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.NotesPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.ReferencedClaimPropertiesEditionPart;

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
public class ReferencedClaimPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private ReferencedClaimPropertiesEditionPart basePart;

	/**
	 * The ReferencedClaimBasePropertiesEditionComponent sub component
	 * 
	 */
	protected ReferencedClaimBasePropertiesEditionComponent referencedClaimBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The ReferencedClaimNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected ReferencedClaimNotesPropertiesEditionComponent referencedClaimNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param referencedClaim the EObject to edit
	 * 
	 */
	public ReferencedClaimPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject referencedClaim, String editing_mode) {
		super(editingContext, editing_mode);
		if (referencedClaim instanceof ReferencedClaim) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(referencedClaim, PropertiesEditingProvider.class);
			referencedClaimBasePropertiesEditionComponent = (ReferencedClaimBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ReferencedClaimBasePropertiesEditionComponent.BASE_PART, ReferencedClaimBasePropertiesEditionComponent.class);
			addSubComponent(referencedClaimBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(referencedClaim, PropertiesEditingProvider.class);
			referencedClaimNotesPropertiesEditionComponent = (ReferencedClaimNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ReferencedClaimNotesPropertiesEditionComponent.NOTES_PART, ReferencedClaimNotesPropertiesEditionComponent.class);
			addSubComponent(referencedClaimNotesPropertiesEditionComponent);
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
		if (ReferencedClaimBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (ReferencedClaimPropertiesEditionPart)referencedClaimBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (ReferencedClaimNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)referencedClaimNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.ReferencedClaim.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (ReferencedClaimPropertiesEditionPart)propertiesEditionPart;
		}
		if (EvidenceViewsRepository.Notes.class == key) {
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
		if (key == EvidenceViewsRepository.ReferencedClaim.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
