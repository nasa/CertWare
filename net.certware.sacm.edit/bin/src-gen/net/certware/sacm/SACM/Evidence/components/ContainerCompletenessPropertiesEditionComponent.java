// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.ContainerCompleteness;
import net.certware.sacm.SACM.Evidence.parts.ContainerCompletenessPropertiesEditionPart;
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
public class ContainerCompletenessPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private ContainerCompletenessPropertiesEditionPart basePart;

	/**
	 * The ContainerCompletenessBasePropertiesEditionComponent sub component
	 * 
	 */
	protected ContainerCompletenessBasePropertiesEditionComponent containerCompletenessBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The ContainerCompletenessNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected ContainerCompletenessNotesPropertiesEditionComponent containerCompletenessNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param containerCompleteness the EObject to edit
	 * 
	 */
	public ContainerCompletenessPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject containerCompleteness, String editing_mode) {
		super(editingContext, editing_mode);
		if (containerCompleteness instanceof ContainerCompleteness) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(containerCompleteness, PropertiesEditingProvider.class);
			containerCompletenessBasePropertiesEditionComponent = (ContainerCompletenessBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ContainerCompletenessBasePropertiesEditionComponent.BASE_PART, ContainerCompletenessBasePropertiesEditionComponent.class);
			addSubComponent(containerCompletenessBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(containerCompleteness, PropertiesEditingProvider.class);
			containerCompletenessNotesPropertiesEditionComponent = (ContainerCompletenessNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ContainerCompletenessNotesPropertiesEditionComponent.NOTES_PART, ContainerCompletenessNotesPropertiesEditionComponent.class);
			addSubComponent(containerCompletenessNotesPropertiesEditionComponent);
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
		if (ContainerCompletenessBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (ContainerCompletenessPropertiesEditionPart)containerCompletenessBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (ContainerCompletenessNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)containerCompletenessNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.ContainerCompleteness.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (ContainerCompletenessPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.ContainerCompleteness.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
