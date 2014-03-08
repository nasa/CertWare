// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.Weakens;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.NotesPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart;

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
public class WeakensPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private WeakensPropertiesEditionPart basePart;

	/**
	 * The WeakensBasePropertiesEditionComponent sub component
	 * 
	 */
	protected WeakensBasePropertiesEditionComponent weakensBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The WeakensNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected WeakensNotesPropertiesEditionComponent weakensNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param weakens the EObject to edit
	 * 
	 */
	public WeakensPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject weakens, String editing_mode) {
		super(editingContext, editing_mode);
		if (weakens instanceof Weakens) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(weakens, PropertiesEditingProvider.class);
			weakensBasePropertiesEditionComponent = (WeakensBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, WeakensBasePropertiesEditionComponent.BASE_PART, WeakensBasePropertiesEditionComponent.class);
			addSubComponent(weakensBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(weakens, PropertiesEditingProvider.class);
			weakensNotesPropertiesEditionComponent = (WeakensNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, WeakensNotesPropertiesEditionComponent.NOTES_PART, WeakensNotesPropertiesEditionComponent.class);
			addSubComponent(weakensNotesPropertiesEditionComponent);
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
		if (WeakensBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (WeakensPropertiesEditionPart)weakensBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (WeakensNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)weakensNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.Weakens.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (WeakensPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.Weakens.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
