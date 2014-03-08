// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.Originality;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.NotesPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.OriginalityPropertiesEditionPart;

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
public class OriginalityPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private OriginalityPropertiesEditionPart basePart;

	/**
	 * The OriginalityBasePropertiesEditionComponent sub component
	 * 
	 */
	protected OriginalityBasePropertiesEditionComponent originalityBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The OriginalityNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected OriginalityNotesPropertiesEditionComponent originalityNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param originality the EObject to edit
	 * 
	 */
	public OriginalityPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject originality, String editing_mode) {
		super(editingContext, editing_mode);
		if (originality instanceof Originality) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(originality, PropertiesEditingProvider.class);
			originalityBasePropertiesEditionComponent = (OriginalityBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, OriginalityBasePropertiesEditionComponent.BASE_PART, OriginalityBasePropertiesEditionComponent.class);
			addSubComponent(originalityBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(originality, PropertiesEditingProvider.class);
			originalityNotesPropertiesEditionComponent = (OriginalityNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, OriginalityNotesPropertiesEditionComponent.NOTES_PART, OriginalityNotesPropertiesEditionComponent.class);
			addSubComponent(originalityNotesPropertiesEditionComponent);
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
		if (OriginalityBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (OriginalityPropertiesEditionPart)originalityBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (OriginalityNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)originalityNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.Originality.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (OriginalityPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.Originality.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
