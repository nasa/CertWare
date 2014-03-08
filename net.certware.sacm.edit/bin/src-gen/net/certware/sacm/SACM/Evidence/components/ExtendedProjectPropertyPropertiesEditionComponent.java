// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.ExtendedProjectProperty;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.ExtendedProjectPropertyPropertiesEditionPart;
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
public class ExtendedProjectPropertyPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private ExtendedProjectPropertyPropertiesEditionPart basePart;

	/**
	 * The ExtendedProjectPropertyBasePropertiesEditionComponent sub component
	 * 
	 */
	protected ExtendedProjectPropertyBasePropertiesEditionComponent extendedProjectPropertyBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The ExtendedProjectPropertyNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected ExtendedProjectPropertyNotesPropertiesEditionComponent extendedProjectPropertyNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param extendedProjectProperty the EObject to edit
	 * 
	 */
	public ExtendedProjectPropertyPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject extendedProjectProperty, String editing_mode) {
		super(editingContext, editing_mode);
		if (extendedProjectProperty instanceof ExtendedProjectProperty) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(extendedProjectProperty, PropertiesEditingProvider.class);
			extendedProjectPropertyBasePropertiesEditionComponent = (ExtendedProjectPropertyBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ExtendedProjectPropertyBasePropertiesEditionComponent.BASE_PART, ExtendedProjectPropertyBasePropertiesEditionComponent.class);
			addSubComponent(extendedProjectPropertyBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(extendedProjectProperty, PropertiesEditingProvider.class);
			extendedProjectPropertyNotesPropertiesEditionComponent = (ExtendedProjectPropertyNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ExtendedProjectPropertyNotesPropertiesEditionComponent.NOTES_PART, ExtendedProjectPropertyNotesPropertiesEditionComponent.class);
			addSubComponent(extendedProjectPropertyNotesPropertiesEditionComponent);
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
		if (ExtendedProjectPropertyBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (ExtendedProjectPropertyPropertiesEditionPart)extendedProjectPropertyBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (ExtendedProjectPropertyNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)extendedProjectPropertyNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.ExtendedProjectProperty.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (ExtendedProjectPropertyPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.ExtendedProjectProperty.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
