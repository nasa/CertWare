// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.HasMedia;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.HasMediaPropertiesEditionPart;
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
public class HasMediaPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private HasMediaPropertiesEditionPart basePart;

	/**
	 * The HasMediaBasePropertiesEditionComponent sub component
	 * 
	 */
	protected HasMediaBasePropertiesEditionComponent hasMediaBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The HasMediaNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected HasMediaNotesPropertiesEditionComponent hasMediaNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param hasMedia the EObject to edit
	 * 
	 */
	public HasMediaPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hasMedia, String editing_mode) {
		super(editingContext, editing_mode);
		if (hasMedia instanceof HasMedia) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hasMedia, PropertiesEditingProvider.class);
			hasMediaBasePropertiesEditionComponent = (HasMediaBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HasMediaBasePropertiesEditionComponent.BASE_PART, HasMediaBasePropertiesEditionComponent.class);
			addSubComponent(hasMediaBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hasMedia, PropertiesEditingProvider.class);
			hasMediaNotesPropertiesEditionComponent = (HasMediaNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HasMediaNotesPropertiesEditionComponent.NOTES_PART, HasMediaNotesPropertiesEditionComponent.class);
			addSubComponent(hasMediaNotesPropertiesEditionComponent);
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
		if (HasMediaBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (HasMediaPropertiesEditionPart)hasMediaBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (HasMediaNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)hasMediaNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.HasMedia.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (HasMediaPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.HasMedia.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
