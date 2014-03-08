// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.EvidenceGroup;
import net.certware.sacm.SACM.Evidence.parts.EvidenceGroupPropertiesEditionPart;
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
public class EvidenceGroupPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private EvidenceGroupPropertiesEditionPart basePart;

	/**
	 * The EvidenceGroupBasePropertiesEditionComponent sub component
	 * 
	 */
	protected EvidenceGroupBasePropertiesEditionComponent evidenceGroupBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The EvidenceGroupNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected EvidenceGroupNotesPropertiesEditionComponent evidenceGroupNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param evidenceGroup the EObject to edit
	 * 
	 */
	public EvidenceGroupPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject evidenceGroup, String editing_mode) {
		super(editingContext, editing_mode);
		if (evidenceGroup instanceof EvidenceGroup) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(evidenceGroup, PropertiesEditingProvider.class);
			evidenceGroupBasePropertiesEditionComponent = (EvidenceGroupBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, EvidenceGroupBasePropertiesEditionComponent.BASE_PART, EvidenceGroupBasePropertiesEditionComponent.class);
			addSubComponent(evidenceGroupBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(evidenceGroup, PropertiesEditingProvider.class);
			evidenceGroupNotesPropertiesEditionComponent = (EvidenceGroupNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, EvidenceGroupNotesPropertiesEditionComponent.NOTES_PART, EvidenceGroupNotesPropertiesEditionComponent.class);
			addSubComponent(evidenceGroupNotesPropertiesEditionComponent);
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
		if (EvidenceGroupBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (EvidenceGroupPropertiesEditionPart)evidenceGroupBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (EvidenceGroupNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)evidenceGroupNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.EvidenceGroup.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (EvidenceGroupPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.EvidenceGroup.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
