// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.IsGeneratedAt;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.IsGeneratedAtPropertiesEditionPart;
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
public class IsGeneratedAtPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private IsGeneratedAtPropertiesEditionPart basePart;

	/**
	 * The IsGeneratedAtBasePropertiesEditionComponent sub component
	 * 
	 */
	protected IsGeneratedAtBasePropertiesEditionComponent isGeneratedAtBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The IsGeneratedAtNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected IsGeneratedAtNotesPropertiesEditionComponent isGeneratedAtNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param isGeneratedAt the EObject to edit
	 * 
	 */
	public IsGeneratedAtPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject isGeneratedAt, String editing_mode) {
		super(editingContext, editing_mode);
		if (isGeneratedAt instanceof IsGeneratedAt) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(isGeneratedAt, PropertiesEditingProvider.class);
			isGeneratedAtBasePropertiesEditionComponent = (IsGeneratedAtBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, IsGeneratedAtBasePropertiesEditionComponent.BASE_PART, IsGeneratedAtBasePropertiesEditionComponent.class);
			addSubComponent(isGeneratedAtBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(isGeneratedAt, PropertiesEditingProvider.class);
			isGeneratedAtNotesPropertiesEditionComponent = (IsGeneratedAtNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, IsGeneratedAtNotesPropertiesEditionComponent.NOTES_PART, IsGeneratedAtNotesPropertiesEditionComponent.class);
			addSubComponent(isGeneratedAtNotesPropertiesEditionComponent);
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
		if (IsGeneratedAtBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (IsGeneratedAtPropertiesEditionPart)isGeneratedAtBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (IsGeneratedAtNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)isGeneratedAtNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.IsGeneratedAt.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (IsGeneratedAtPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.IsGeneratedAt.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
