// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.RequiresContainer;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.NotesPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.RequiresContainerPropertiesEditionPart;

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
public class RequiresContainerPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private RequiresContainerPropertiesEditionPart basePart;

	/**
	 * The RequiresContainerBasePropertiesEditionComponent sub component
	 * 
	 */
	protected RequiresContainerBasePropertiesEditionComponent requiresContainerBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The RequiresContainerNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected RequiresContainerNotesPropertiesEditionComponent requiresContainerNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param requiresContainer the EObject to edit
	 * 
	 */
	public RequiresContainerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject requiresContainer, String editing_mode) {
		super(editingContext, editing_mode);
		if (requiresContainer instanceof RequiresContainer) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(requiresContainer, PropertiesEditingProvider.class);
			requiresContainerBasePropertiesEditionComponent = (RequiresContainerBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, RequiresContainerBasePropertiesEditionComponent.BASE_PART, RequiresContainerBasePropertiesEditionComponent.class);
			addSubComponent(requiresContainerBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(requiresContainer, PropertiesEditingProvider.class);
			requiresContainerNotesPropertiesEditionComponent = (RequiresContainerNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, RequiresContainerNotesPropertiesEditionComponent.NOTES_PART, RequiresContainerNotesPropertiesEditionComponent.class);
			addSubComponent(requiresContainerNotesPropertiesEditionComponent);
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
		if (RequiresContainerBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (RequiresContainerPropertiesEditionPart)requiresContainerBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (RequiresContainerNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)requiresContainerNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.RequiresContainer.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (RequiresContainerPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.RequiresContainer.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
