// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.IsTransferredTo;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.IsTransferredToPropertiesEditionPart;
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
public class IsTransferredToPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private IsTransferredToPropertiesEditionPart basePart;

	/**
	 * The IsTransferredToBasePropertiesEditionComponent sub component
	 * 
	 */
	protected IsTransferredToBasePropertiesEditionComponent isTransferredToBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The IsTransferredToNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected IsTransferredToNotesPropertiesEditionComponent isTransferredToNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param isTransferredTo the EObject to edit
	 * 
	 */
	public IsTransferredToPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject isTransferredTo, String editing_mode) {
		super(editingContext, editing_mode);
		if (isTransferredTo instanceof IsTransferredTo) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(isTransferredTo, PropertiesEditingProvider.class);
			isTransferredToBasePropertiesEditionComponent = (IsTransferredToBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, IsTransferredToBasePropertiesEditionComponent.BASE_PART, IsTransferredToBasePropertiesEditionComponent.class);
			addSubComponent(isTransferredToBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(isTransferredTo, PropertiesEditingProvider.class);
			isTransferredToNotesPropertiesEditionComponent = (IsTransferredToNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, IsTransferredToNotesPropertiesEditionComponent.NOTES_PART, IsTransferredToNotesPropertiesEditionComponent.class);
			addSubComponent(isTransferredToNotesPropertiesEditionComponent);
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
		if (IsTransferredToBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (IsTransferredToPropertiesEditionPart)isTransferredToBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (IsTransferredToNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)isTransferredToNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.IsTransferredTo.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (IsTransferredToPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.IsTransferredTo.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
