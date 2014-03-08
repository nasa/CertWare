// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports

import net.certware.sacm.SACM.Evidence.IsExpressedInLanguage;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.IsExpressedInLanguagePropertiesEditionPart;
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
public class IsExpressedInLanguagePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private IsExpressedInLanguagePropertiesEditionPart basePart;

	/**
	 * The IsExpressedInLanguageBasePropertiesEditionComponent sub component
	 * 
	 */
	protected IsExpressedInLanguageBasePropertiesEditionComponent isExpressedInLanguageBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The IsExpressedInLanguageNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected IsExpressedInLanguageNotesPropertiesEditionComponent isExpressedInLanguageNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param isExpressedInLanguage the EObject to edit
	 * 
	 */
	public IsExpressedInLanguagePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject isExpressedInLanguage, String editing_mode) {
		super(editingContext, editing_mode);
		if (isExpressedInLanguage instanceof IsExpressedInLanguage) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(isExpressedInLanguage, PropertiesEditingProvider.class);
			isExpressedInLanguageBasePropertiesEditionComponent = (IsExpressedInLanguageBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, IsExpressedInLanguageBasePropertiesEditionComponent.BASE_PART, IsExpressedInLanguageBasePropertiesEditionComponent.class);
			addSubComponent(isExpressedInLanguageBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(isExpressedInLanguage, PropertiesEditingProvider.class);
			isExpressedInLanguageNotesPropertiesEditionComponent = (IsExpressedInLanguageNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, IsExpressedInLanguageNotesPropertiesEditionComponent.NOTES_PART, IsExpressedInLanguageNotesPropertiesEditionComponent.class);
			addSubComponent(isExpressedInLanguageNotesPropertiesEditionComponent);
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
		if (IsExpressedInLanguageBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (IsExpressedInLanguagePropertiesEditionPart)isExpressedInLanguageBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (IsExpressedInLanguageNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)isExpressedInLanguageNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.IsExpressedInLanguage.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (IsExpressedInLanguagePropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.IsExpressedInLanguage.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
