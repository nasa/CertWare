// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.HasVersion;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.HasVersionPropertiesEditionPart;
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
public class HasVersionPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private HasVersionPropertiesEditionPart basePart;

	/**
	 * The HasVersionBasePropertiesEditionComponent sub component
	 * 
	 */
	protected HasVersionBasePropertiesEditionComponent hasVersionBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The HasVersionNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected HasVersionNotesPropertiesEditionComponent hasVersionNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param hasVersion the EObject to edit
	 * 
	 */
	public HasVersionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hasVersion, String editing_mode) {
		super(editingContext, editing_mode);
		if (hasVersion instanceof HasVersion) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hasVersion, PropertiesEditingProvider.class);
			hasVersionBasePropertiesEditionComponent = (HasVersionBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HasVersionBasePropertiesEditionComponent.BASE_PART, HasVersionBasePropertiesEditionComponent.class);
			addSubComponent(hasVersionBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hasVersion, PropertiesEditingProvider.class);
			hasVersionNotesPropertiesEditionComponent = (HasVersionNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HasVersionNotesPropertiesEditionComponent.NOTES_PART, HasVersionNotesPropertiesEditionComponent.class);
			addSubComponent(hasVersionNotesPropertiesEditionComponent);
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
		if (HasVersionBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (HasVersionPropertiesEditionPart)hasVersionBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (HasVersionNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)hasVersionNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.HasVersion.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (HasVersionPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.HasVersion.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
