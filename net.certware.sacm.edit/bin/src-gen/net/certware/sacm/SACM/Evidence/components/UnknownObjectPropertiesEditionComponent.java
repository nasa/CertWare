// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.UnknownObject;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.NotesPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.UnknownObjectPropertiesEditionPart;

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
public class UnknownObjectPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private UnknownObjectPropertiesEditionPart basePart;

	/**
	 * The UnknownObjectBasePropertiesEditionComponent sub component
	 * 
	 */
	protected UnknownObjectBasePropertiesEditionComponent unknownObjectBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The UnknownObjectNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected UnknownObjectNotesPropertiesEditionComponent unknownObjectNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param unknownObject the EObject to edit
	 * 
	 */
	public UnknownObjectPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject unknownObject, String editing_mode) {
		super(editingContext, editing_mode);
		if (unknownObject instanceof UnknownObject) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(unknownObject, PropertiesEditingProvider.class);
			unknownObjectBasePropertiesEditionComponent = (UnknownObjectBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, UnknownObjectBasePropertiesEditionComponent.BASE_PART, UnknownObjectBasePropertiesEditionComponent.class);
			addSubComponent(unknownObjectBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(unknownObject, PropertiesEditingProvider.class);
			unknownObjectNotesPropertiesEditionComponent = (UnknownObjectNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, UnknownObjectNotesPropertiesEditionComponent.NOTES_PART, UnknownObjectNotesPropertiesEditionComponent.class);
			addSubComponent(unknownObjectNotesPropertiesEditionComponent);
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
		if (UnknownObjectBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (UnknownObjectPropertiesEditionPart)unknownObjectBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (UnknownObjectNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)unknownObjectNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.UnknownObject.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (UnknownObjectPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.UnknownObject.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
