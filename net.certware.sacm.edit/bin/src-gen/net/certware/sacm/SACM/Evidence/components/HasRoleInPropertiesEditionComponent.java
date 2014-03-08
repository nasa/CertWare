// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.HasRoleIn;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.HasRoleInPropertiesEditionPart;
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
public class HasRoleInPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private HasRoleInPropertiesEditionPart basePart;

	/**
	 * The HasRoleInBasePropertiesEditionComponent sub component
	 * 
	 */
	protected HasRoleInBasePropertiesEditionComponent hasRoleInBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The HasRoleInNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected HasRoleInNotesPropertiesEditionComponent hasRoleInNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param hasRoleIn the EObject to edit
	 * 
	 */
	public HasRoleInPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hasRoleIn, String editing_mode) {
		super(editingContext, editing_mode);
		if (hasRoleIn instanceof HasRoleIn) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hasRoleIn, PropertiesEditingProvider.class);
			hasRoleInBasePropertiesEditionComponent = (HasRoleInBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HasRoleInBasePropertiesEditionComponent.BASE_PART, HasRoleInBasePropertiesEditionComponent.class);
			addSubComponent(hasRoleInBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hasRoleIn, PropertiesEditingProvider.class);
			hasRoleInNotesPropertiesEditionComponent = (HasRoleInNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HasRoleInNotesPropertiesEditionComponent.NOTES_PART, HasRoleInNotesPropertiesEditionComponent.class);
			addSubComponent(hasRoleInNotesPropertiesEditionComponent);
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
		if (HasRoleInBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (HasRoleInPropertiesEditionPart)hasRoleInBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (HasRoleInNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)hasRoleInNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.HasRoleIn.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (HasRoleInPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.HasRoleIn.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
