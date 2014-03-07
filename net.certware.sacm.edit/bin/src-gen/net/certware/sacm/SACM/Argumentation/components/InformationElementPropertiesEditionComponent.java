// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Argumentation.components;

// Start of user code for imports
import net.certware.sacm.SACM.Argumentation.InformationElement;
import net.certware.sacm.SACM.Argumentation.parts.ArgumentationViewsRepository;
import net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart;
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
public class InformationElementPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private InformationElementPropertiesEditionPart basePart;

	/**
	 * The InformationElementBasePropertiesEditionComponent sub component
	 * 
	 */
	protected InformationElementBasePropertiesEditionComponent informationElementBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The InformationElementNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected InformationElementNotesPropertiesEditionComponent informationElementNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param informationElement the EObject to edit
	 * 
	 */
	public InformationElementPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject informationElement, String editing_mode) {
		super(editingContext, editing_mode);
		if (informationElement instanceof InformationElement) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(informationElement, PropertiesEditingProvider.class);
			informationElementBasePropertiesEditionComponent = (InformationElementBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, InformationElementBasePropertiesEditionComponent.BASE_PART, InformationElementBasePropertiesEditionComponent.class);
			addSubComponent(informationElementBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(informationElement, PropertiesEditingProvider.class);
			informationElementNotesPropertiesEditionComponent = (InformationElementNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, InformationElementNotesPropertiesEditionComponent.NOTES_PART, InformationElementNotesPropertiesEditionComponent.class);
			addSubComponent(informationElementNotesPropertiesEditionComponent);
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
		if (InformationElementBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (InformationElementPropertiesEditionPart)informationElementBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (InformationElementNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)informationElementNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (ArgumentationViewsRepository.InformationElement.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (InformationElementPropertiesEditionPart)propertiesEditionPart;
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
		if (key == ArgumentationViewsRepository.InformationElement.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ArgumentationViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
