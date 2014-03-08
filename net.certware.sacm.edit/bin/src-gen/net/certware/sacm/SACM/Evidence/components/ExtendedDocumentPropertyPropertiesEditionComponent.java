// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.ExtendedDocumentProperty;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.ExtendedDocumentPropertyPropertiesEditionPart;
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
public class ExtendedDocumentPropertyPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private ExtendedDocumentPropertyPropertiesEditionPart basePart;

	/**
	 * The ExtendedDocumentPropertyBasePropertiesEditionComponent sub component
	 * 
	 */
	protected ExtendedDocumentPropertyBasePropertiesEditionComponent extendedDocumentPropertyBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The ExtendedDocumentPropertyNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected ExtendedDocumentPropertyNotesPropertiesEditionComponent extendedDocumentPropertyNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param extendedDocumentProperty the EObject to edit
	 * 
	 */
	public ExtendedDocumentPropertyPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject extendedDocumentProperty, String editing_mode) {
		super(editingContext, editing_mode);
		if (extendedDocumentProperty instanceof ExtendedDocumentProperty) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(extendedDocumentProperty, PropertiesEditingProvider.class);
			extendedDocumentPropertyBasePropertiesEditionComponent = (ExtendedDocumentPropertyBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ExtendedDocumentPropertyBasePropertiesEditionComponent.BASE_PART, ExtendedDocumentPropertyBasePropertiesEditionComponent.class);
			addSubComponent(extendedDocumentPropertyBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(extendedDocumentProperty, PropertiesEditingProvider.class);
			extendedDocumentPropertyNotesPropertiesEditionComponent = (ExtendedDocumentPropertyNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ExtendedDocumentPropertyNotesPropertiesEditionComponent.NOTES_PART, ExtendedDocumentPropertyNotesPropertiesEditionComponent.class);
			addSubComponent(extendedDocumentPropertyNotesPropertiesEditionComponent);
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
		if (ExtendedDocumentPropertyBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (ExtendedDocumentPropertyPropertiesEditionPart)extendedDocumentPropertyBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (ExtendedDocumentPropertyNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)extendedDocumentPropertyNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.ExtendedDocumentProperty.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (ExtendedDocumentPropertyPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.ExtendedDocumentProperty.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
