// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.Refutes;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.NotesPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.RefutesPropertiesEditionPart;

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
public class RefutesPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private RefutesPropertiesEditionPart basePart;

	/**
	 * The RefutesBasePropertiesEditionComponent sub component
	 * 
	 */
	protected RefutesBasePropertiesEditionComponent refutesBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The RefutesNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected RefutesNotesPropertiesEditionComponent refutesNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param refutes the EObject to edit
	 * 
	 */
	public RefutesPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject refutes, String editing_mode) {
		super(editingContext, editing_mode);
		if (refutes instanceof Refutes) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(refutes, PropertiesEditingProvider.class);
			refutesBasePropertiesEditionComponent = (RefutesBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, RefutesBasePropertiesEditionComponent.BASE_PART, RefutesBasePropertiesEditionComponent.class);
			addSubComponent(refutesBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(refutes, PropertiesEditingProvider.class);
			refutesNotesPropertiesEditionComponent = (RefutesNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, RefutesNotesPropertiesEditionComponent.NOTES_PART, RefutesNotesPropertiesEditionComponent.class);
			addSubComponent(refutesNotesPropertiesEditionComponent);
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
		if (RefutesBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (RefutesPropertiesEditionPart)refutesBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (RefutesNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)refutesNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.Refutes.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (RefutesPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.Refutes.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
