// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.ExtendedEvidenceAttribute;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.ExtendedEvidenceAttributePropertiesEditionPart;
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
public class ExtendedEvidenceAttributePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private ExtendedEvidenceAttributePropertiesEditionPart basePart;

	/**
	 * The ExtendedEvidenceAttributeBasePropertiesEditionComponent sub component
	 * 
	 */
	protected ExtendedEvidenceAttributeBasePropertiesEditionComponent extendedEvidenceAttributeBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The ExtendedEvidenceAttributeNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected ExtendedEvidenceAttributeNotesPropertiesEditionComponent extendedEvidenceAttributeNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param extendedEvidenceAttribute the EObject to edit
	 * 
	 */
	public ExtendedEvidenceAttributePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject extendedEvidenceAttribute, String editing_mode) {
		super(editingContext, editing_mode);
		if (extendedEvidenceAttribute instanceof ExtendedEvidenceAttribute) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(extendedEvidenceAttribute, PropertiesEditingProvider.class);
			extendedEvidenceAttributeBasePropertiesEditionComponent = (ExtendedEvidenceAttributeBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ExtendedEvidenceAttributeBasePropertiesEditionComponent.BASE_PART, ExtendedEvidenceAttributeBasePropertiesEditionComponent.class);
			addSubComponent(extendedEvidenceAttributeBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(extendedEvidenceAttribute, PropertiesEditingProvider.class);
			extendedEvidenceAttributeNotesPropertiesEditionComponent = (ExtendedEvidenceAttributeNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ExtendedEvidenceAttributeNotesPropertiesEditionComponent.NOTES_PART, ExtendedEvidenceAttributeNotesPropertiesEditionComponent.class);
			addSubComponent(extendedEvidenceAttributeNotesPropertiesEditionComponent);
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
		if (ExtendedEvidenceAttributeBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (ExtendedEvidenceAttributePropertiesEditionPart)extendedEvidenceAttributeBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (ExtendedEvidenceAttributeNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)extendedEvidenceAttributeNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.ExtendedEvidenceAttribute.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (ExtendedEvidenceAttributePropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.ExtendedEvidenceAttribute.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
