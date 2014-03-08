// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.EvidenceRequest;
import net.certware.sacm.SACM.Evidence.parts.EvidenceRequestPropertiesEditionPart;
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
public class EvidenceRequestPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private EvidenceRequestPropertiesEditionPart basePart;

	/**
	 * The EvidenceRequestBasePropertiesEditionComponent sub component
	 * 
	 */
	protected EvidenceRequestBasePropertiesEditionComponent evidenceRequestBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The EvidenceRequestNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected EvidenceRequestNotesPropertiesEditionComponent evidenceRequestNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param evidenceRequest the EObject to edit
	 * 
	 */
	public EvidenceRequestPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject evidenceRequest, String editing_mode) {
		super(editingContext, editing_mode);
		if (evidenceRequest instanceof EvidenceRequest) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(evidenceRequest, PropertiesEditingProvider.class);
			evidenceRequestBasePropertiesEditionComponent = (EvidenceRequestBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, EvidenceRequestBasePropertiesEditionComponent.BASE_PART, EvidenceRequestBasePropertiesEditionComponent.class);
			addSubComponent(evidenceRequestBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(evidenceRequest, PropertiesEditingProvider.class);
			evidenceRequestNotesPropertiesEditionComponent = (EvidenceRequestNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, EvidenceRequestNotesPropertiesEditionComponent.NOTES_PART, EvidenceRequestNotesPropertiesEditionComponent.class);
			addSubComponent(evidenceRequestNotesPropertiesEditionComponent);
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
		if (EvidenceRequestBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (EvidenceRequestPropertiesEditionPart)evidenceRequestBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (EvidenceRequestNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)evidenceRequestNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.EvidenceRequest.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (EvidenceRequestPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.EvidenceRequest.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
