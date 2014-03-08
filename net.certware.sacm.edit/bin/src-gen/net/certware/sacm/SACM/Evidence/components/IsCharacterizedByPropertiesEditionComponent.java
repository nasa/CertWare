// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.IsCharacterizedBy;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.IsCharacterizedByPropertiesEditionPart;
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
public class IsCharacterizedByPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private IsCharacterizedByPropertiesEditionPart basePart;

	/**
	 * The IsCharacterizedByBasePropertiesEditionComponent sub component
	 * 
	 */
	protected IsCharacterizedByBasePropertiesEditionComponent isCharacterizedByBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The IsCharacterizedByNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected IsCharacterizedByNotesPropertiesEditionComponent isCharacterizedByNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param isCharacterizedBy the EObject to edit
	 * 
	 */
	public IsCharacterizedByPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject isCharacterizedBy, String editing_mode) {
		super(editingContext, editing_mode);
		if (isCharacterizedBy instanceof IsCharacterizedBy) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(isCharacterizedBy, PropertiesEditingProvider.class);
			isCharacterizedByBasePropertiesEditionComponent = (IsCharacterizedByBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, IsCharacterizedByBasePropertiesEditionComponent.BASE_PART, IsCharacterizedByBasePropertiesEditionComponent.class);
			addSubComponent(isCharacterizedByBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(isCharacterizedBy, PropertiesEditingProvider.class);
			isCharacterizedByNotesPropertiesEditionComponent = (IsCharacterizedByNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, IsCharacterizedByNotesPropertiesEditionComponent.NOTES_PART, IsCharacterizedByNotesPropertiesEditionComponent.class);
			addSubComponent(isCharacterizedByNotesPropertiesEditionComponent);
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
		if (IsCharacterizedByBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (IsCharacterizedByPropertiesEditionPart)isCharacterizedByBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (IsCharacterizedByNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)isCharacterizedByNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.IsCharacterizedBy.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (IsCharacterizedByPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.IsCharacterizedBy.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
