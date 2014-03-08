// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.Document;
import net.certware.sacm.SACM.Evidence.parts.DocumentPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
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
public class DocumentPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private DocumentPropertiesEditionPart basePart;

	/**
	 * The DocumentBasePropertiesEditionComponent sub component
	 * 
	 */
	protected DocumentBasePropertiesEditionComponent documentBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The DocumentNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected DocumentNotesPropertiesEditionComponent documentNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param document the EObject to edit
	 * 
	 */
	public DocumentPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject document, String editing_mode) {
		super(editingContext, editing_mode);
		if (document instanceof Document) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(document, PropertiesEditingProvider.class);
			documentBasePropertiesEditionComponent = (DocumentBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, DocumentBasePropertiesEditionComponent.BASE_PART, DocumentBasePropertiesEditionComponent.class);
			addSubComponent(documentBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(document, PropertiesEditingProvider.class);
			documentNotesPropertiesEditionComponent = (DocumentNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, DocumentNotesPropertiesEditionComponent.NOTES_PART, DocumentNotesPropertiesEditionComponent.class);
			addSubComponent(documentNotesPropertiesEditionComponent);
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
		if (DocumentBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (DocumentPropertiesEditionPart)documentBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (DocumentNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)documentNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.Document.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (DocumentPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.Document.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
