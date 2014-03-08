// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.HasSecurityClassification;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.HasSecurityClassificationPropertiesEditionPart;
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
public class HasSecurityClassificationPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private HasSecurityClassificationPropertiesEditionPart basePart;

	/**
	 * The HasSecurityClassificationBasePropertiesEditionComponent sub component
	 * 
	 */
	protected HasSecurityClassificationBasePropertiesEditionComponent hasSecurityClassificationBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The HasSecurityClassificationNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected HasSecurityClassificationNotesPropertiesEditionComponent hasSecurityClassificationNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param hasSecurityClassification the EObject to edit
	 * 
	 */
	public HasSecurityClassificationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hasSecurityClassification, String editing_mode) {
		super(editingContext, editing_mode);
		if (hasSecurityClassification instanceof HasSecurityClassification) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hasSecurityClassification, PropertiesEditingProvider.class);
			hasSecurityClassificationBasePropertiesEditionComponent = (HasSecurityClassificationBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HasSecurityClassificationBasePropertiesEditionComponent.BASE_PART, HasSecurityClassificationBasePropertiesEditionComponent.class);
			addSubComponent(hasSecurityClassificationBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hasSecurityClassification, PropertiesEditingProvider.class);
			hasSecurityClassificationNotesPropertiesEditionComponent = (HasSecurityClassificationNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HasSecurityClassificationNotesPropertiesEditionComponent.NOTES_PART, HasSecurityClassificationNotesPropertiesEditionComponent.class);
			addSubComponent(hasSecurityClassificationNotesPropertiesEditionComponent);
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
		if (HasSecurityClassificationBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (HasSecurityClassificationPropertiesEditionPart)hasSecurityClassificationBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (HasSecurityClassificationNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)hasSecurityClassificationNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.HasSecurityClassification.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (HasSecurityClassificationPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.HasSecurityClassification.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
