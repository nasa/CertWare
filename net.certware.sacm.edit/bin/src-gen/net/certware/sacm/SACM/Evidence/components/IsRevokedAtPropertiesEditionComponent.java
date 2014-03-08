// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.IsRevokedAt;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.IsRevokedAtPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.NotesPropertiesEditionPart;

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
public class IsRevokedAtPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private IsRevokedAtPropertiesEditionPart basePart;

	/**
	 * The IsRevokedAtBasePropertiesEditionComponent sub component
	 * 
	 */
	protected IsRevokedAtBasePropertiesEditionComponent isRevokedAtBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The IsRevokedAtNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected IsRevokedAtNotesPropertiesEditionComponent isRevokedAtNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param isRevokedAt the EObject to edit
	 * 
	 */
	public IsRevokedAtPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject isRevokedAt, String editing_mode) {
		super(editingContext, editing_mode);
		if (isRevokedAt instanceof IsRevokedAt) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(isRevokedAt, PropertiesEditingProvider.class);
			isRevokedAtBasePropertiesEditionComponent = (IsRevokedAtBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, IsRevokedAtBasePropertiesEditionComponent.BASE_PART, IsRevokedAtBasePropertiesEditionComponent.class);
			addSubComponent(isRevokedAtBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(isRevokedAt, PropertiesEditingProvider.class);
			isRevokedAtNotesPropertiesEditionComponent = (IsRevokedAtNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, IsRevokedAtNotesPropertiesEditionComponent.NOTES_PART, IsRevokedAtNotesPropertiesEditionComponent.class);
			addSubComponent(isRevokedAtNotesPropertiesEditionComponent);
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
		if (IsRevokedAtBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (IsRevokedAtPropertiesEditionPart)isRevokedAtBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (IsRevokedAtNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)isRevokedAtNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.IsRevokedAt.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (IsRevokedAtPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.IsRevokedAt.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
