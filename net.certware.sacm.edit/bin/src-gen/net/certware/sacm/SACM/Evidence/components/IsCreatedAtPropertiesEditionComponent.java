// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.IsCreatedAt;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.IsCreatedAtPropertiesEditionPart;
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
public class IsCreatedAtPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private IsCreatedAtPropertiesEditionPart basePart;

	/**
	 * The IsCreatedAtBasePropertiesEditionComponent sub component
	 * 
	 */
	protected IsCreatedAtBasePropertiesEditionComponent isCreatedAtBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The IsCreatedAtNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected IsCreatedAtNotesPropertiesEditionComponent isCreatedAtNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param isCreatedAt the EObject to edit
	 * 
	 */
	public IsCreatedAtPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject isCreatedAt, String editing_mode) {
		super(editingContext, editing_mode);
		if (isCreatedAt instanceof IsCreatedAt) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(isCreatedAt, PropertiesEditingProvider.class);
			isCreatedAtBasePropertiesEditionComponent = (IsCreatedAtBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, IsCreatedAtBasePropertiesEditionComponent.BASE_PART, IsCreatedAtBasePropertiesEditionComponent.class);
			addSubComponent(isCreatedAtBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(isCreatedAt, PropertiesEditingProvider.class);
			isCreatedAtNotesPropertiesEditionComponent = (IsCreatedAtNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, IsCreatedAtNotesPropertiesEditionComponent.NOTES_PART, IsCreatedAtNotesPropertiesEditionComponent.class);
			addSubComponent(isCreatedAtNotesPropertiesEditionComponent);
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
		if (IsCreatedAtBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (IsCreatedAtPropertiesEditionPart)isCreatedAtBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (IsCreatedAtNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)isCreatedAtNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.IsCreatedAt.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (IsCreatedAtPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.IsCreatedAt.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
