// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.Relevance;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.NotesPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.RelevancePropertiesEditionPart;

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
public class RelevancePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private RelevancePropertiesEditionPart basePart;

	/**
	 * The RelevanceBasePropertiesEditionComponent sub component
	 * 
	 */
	protected RelevanceBasePropertiesEditionComponent relevanceBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The RelevanceNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected RelevanceNotesPropertiesEditionComponent relevanceNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param relevance the EObject to edit
	 * 
	 */
	public RelevancePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject relevance, String editing_mode) {
		super(editingContext, editing_mode);
		if (relevance instanceof Relevance) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(relevance, PropertiesEditingProvider.class);
			relevanceBasePropertiesEditionComponent = (RelevanceBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, RelevanceBasePropertiesEditionComponent.BASE_PART, RelevanceBasePropertiesEditionComponent.class);
			addSubComponent(relevanceBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(relevance, PropertiesEditingProvider.class);
			relevanceNotesPropertiesEditionComponent = (RelevanceNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, RelevanceNotesPropertiesEditionComponent.NOTES_PART, RelevanceNotesPropertiesEditionComponent.class);
			addSubComponent(relevanceNotesPropertiesEditionComponent);
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
		if (RelevanceBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (RelevancePropertiesEditionPart)relevanceBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (RelevanceNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)relevanceNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.Relevance.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (RelevancePropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.Relevance.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
