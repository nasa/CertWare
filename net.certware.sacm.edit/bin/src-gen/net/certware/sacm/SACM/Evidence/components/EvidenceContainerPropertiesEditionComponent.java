// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.EvidenceContainer;
import net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart;
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
public class EvidenceContainerPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private EvidenceContainerPropertiesEditionPart basePart;

	/**
	 * The EvidenceContainerBasePropertiesEditionComponent sub component
	 * 
	 */
	protected EvidenceContainerBasePropertiesEditionComponent evidenceContainerBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The EvidenceContainerNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected EvidenceContainerNotesPropertiesEditionComponent evidenceContainerNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param evidenceContainer the EObject to edit
	 * 
	 */
	public EvidenceContainerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject evidenceContainer, String editing_mode) {
		super(editingContext, editing_mode);
		if (evidenceContainer instanceof EvidenceContainer) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(evidenceContainer, PropertiesEditingProvider.class);
			evidenceContainerBasePropertiesEditionComponent = (EvidenceContainerBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, EvidenceContainerBasePropertiesEditionComponent.BASE_PART, EvidenceContainerBasePropertiesEditionComponent.class);
			addSubComponent(evidenceContainerBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(evidenceContainer, PropertiesEditingProvider.class);
			evidenceContainerNotesPropertiesEditionComponent = (EvidenceContainerNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, EvidenceContainerNotesPropertiesEditionComponent.NOTES_PART, EvidenceContainerNotesPropertiesEditionComponent.class);
			addSubComponent(evidenceContainerNotesPropertiesEditionComponent);
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
		if (EvidenceContainerBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (EvidenceContainerPropertiesEditionPart)evidenceContainerBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (EvidenceContainerNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)evidenceContainerNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.EvidenceContainer.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (EvidenceContainerPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.EvidenceContainer.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
