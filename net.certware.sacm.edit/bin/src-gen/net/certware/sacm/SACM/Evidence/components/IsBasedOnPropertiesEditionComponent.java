// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.IsBasedOn;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.IsBasedOnPropertiesEditionPart;
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
public class IsBasedOnPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private IsBasedOnPropertiesEditionPart basePart;

	/**
	 * The IsBasedOnBasePropertiesEditionComponent sub component
	 * 
	 */
	protected IsBasedOnBasePropertiesEditionComponent isBasedOnBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The IsBasedOnNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected IsBasedOnNotesPropertiesEditionComponent isBasedOnNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param isBasedOn the EObject to edit
	 * 
	 */
	public IsBasedOnPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject isBasedOn, String editing_mode) {
		super(editingContext, editing_mode);
		if (isBasedOn instanceof IsBasedOn) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(isBasedOn, PropertiesEditingProvider.class);
			isBasedOnBasePropertiesEditionComponent = (IsBasedOnBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, IsBasedOnBasePropertiesEditionComponent.BASE_PART, IsBasedOnBasePropertiesEditionComponent.class);
			addSubComponent(isBasedOnBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(isBasedOn, PropertiesEditingProvider.class);
			isBasedOnNotesPropertiesEditionComponent = (IsBasedOnNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, IsBasedOnNotesPropertiesEditionComponent.NOTES_PART, IsBasedOnNotesPropertiesEditionComponent.class);
			addSubComponent(isBasedOnNotesPropertiesEditionComponent);
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
		if (IsBasedOnBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (IsBasedOnPropertiesEditionPart)isBasedOnBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (IsBasedOnNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)isBasedOnNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.IsBasedOn.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (IsBasedOnPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.IsBasedOn.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
