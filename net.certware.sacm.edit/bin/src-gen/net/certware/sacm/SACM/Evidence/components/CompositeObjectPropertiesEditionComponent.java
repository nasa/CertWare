// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.CompositeObject;
import net.certware.sacm.SACM.Evidence.parts.CompositeObjectPropertiesEditionPart;
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
public class CompositeObjectPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private CompositeObjectPropertiesEditionPart basePart;

	/**
	 * The CompositeObjectBasePropertiesEditionComponent sub component
	 * 
	 */
	protected CompositeObjectBasePropertiesEditionComponent compositeObjectBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The CompositeObjectNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected CompositeObjectNotesPropertiesEditionComponent compositeObjectNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param compositeObject the EObject to edit
	 * 
	 */
	public CompositeObjectPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject compositeObject, String editing_mode) {
		super(editingContext, editing_mode);
		if (compositeObject instanceof CompositeObject) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(compositeObject, PropertiesEditingProvider.class);
			compositeObjectBasePropertiesEditionComponent = (CompositeObjectBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, CompositeObjectBasePropertiesEditionComponent.BASE_PART, CompositeObjectBasePropertiesEditionComponent.class);
			addSubComponent(compositeObjectBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(compositeObject, PropertiesEditingProvider.class);
			compositeObjectNotesPropertiesEditionComponent = (CompositeObjectNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, CompositeObjectNotesPropertiesEditionComponent.NOTES_PART, CompositeObjectNotesPropertiesEditionComponent.class);
			addSubComponent(compositeObjectNotesPropertiesEditionComponent);
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
		if (CompositeObjectBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (CompositeObjectPropertiesEditionPart)compositeObjectBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (CompositeObjectNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)compositeObjectNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.CompositeObject.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (CompositeObjectPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.CompositeObject.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
