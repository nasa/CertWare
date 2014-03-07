// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Argumentation.components;

// Start of user code for imports
import net.certware.sacm.SACM.Argumentation.CitationElement;
import net.certware.sacm.SACM.Argumentation.parts.ArgumentationViewsRepository;
import net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart;
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
public class CitationElementPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private CitationElementPropertiesEditionPart basePart;

	/**
	 * The CitationElementBasePropertiesEditionComponent sub component
	 * 
	 */
	protected CitationElementBasePropertiesEditionComponent citationElementBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The CitationElementNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected CitationElementNotesPropertiesEditionComponent citationElementNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param citationElement the EObject to edit
	 * 
	 */
	public CitationElementPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject citationElement, String editing_mode) {
		super(editingContext, editing_mode);
		if (citationElement instanceof CitationElement) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(citationElement, PropertiesEditingProvider.class);
			citationElementBasePropertiesEditionComponent = (CitationElementBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, CitationElementBasePropertiesEditionComponent.BASE_PART, CitationElementBasePropertiesEditionComponent.class);
			addSubComponent(citationElementBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(citationElement, PropertiesEditingProvider.class);
			citationElementNotesPropertiesEditionComponent = (CitationElementNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, CitationElementNotesPropertiesEditionComponent.NOTES_PART, CitationElementNotesPropertiesEditionComponent.class);
			addSubComponent(citationElementNotesPropertiesEditionComponent);
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
		if (CitationElementBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (CitationElementPropertiesEditionPart)citationElementBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (CitationElementNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)citationElementNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (ArgumentationViewsRepository.CitationElement.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (CitationElementPropertiesEditionPart)propertiesEditionPart;
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
		if (key == ArgumentationViewsRepository.CitationElement.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ArgumentationViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
