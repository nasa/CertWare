// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.OwnedBy;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.NotesPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.OwnedByPropertiesEditionPart;

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
public class OwnedByPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private OwnedByPropertiesEditionPart basePart;

	/**
	 * The OwnedByBasePropertiesEditionComponent sub component
	 * 
	 */
	protected OwnedByBasePropertiesEditionComponent ownedByBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The OwnedByNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected OwnedByNotesPropertiesEditionComponent ownedByNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param ownedBy the EObject to edit
	 * 
	 */
	public OwnedByPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject ownedBy, String editing_mode) {
		super(editingContext, editing_mode);
		if (ownedBy instanceof OwnedBy) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(ownedBy, PropertiesEditingProvider.class);
			ownedByBasePropertiesEditionComponent = (OwnedByBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, OwnedByBasePropertiesEditionComponent.BASE_PART, OwnedByBasePropertiesEditionComponent.class);
			addSubComponent(ownedByBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(ownedBy, PropertiesEditingProvider.class);
			ownedByNotesPropertiesEditionComponent = (OwnedByNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, OwnedByNotesPropertiesEditionComponent.NOTES_PART, OwnedByNotesPropertiesEditionComponent.class);
			addSubComponent(ownedByNotesPropertiesEditionComponent);
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
		if (OwnedByBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (OwnedByPropertiesEditionPart)ownedByBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (OwnedByNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)ownedByNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.OwnedBy.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (OwnedByPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.OwnedBy.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
