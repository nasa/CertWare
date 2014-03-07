// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Argumentation.components;

// Start of user code for imports
import net.certware.sacm.SACM.Argumentation.AssertedInference;
import net.certware.sacm.SACM.Argumentation.parts.ArgumentationViewsRepository;
import net.certware.sacm.SACM.Argumentation.parts.AssertedInferencePropertiesEditionPart;
import net.certware.sacm.SACM.Argumentation.parts.NotesPropertiesEditionPart;

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
public class AssertedInferencePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private AssertedInferencePropertiesEditionPart basePart;

	/**
	 * The AssertedInferenceBasePropertiesEditionComponent sub component
	 * 
	 */
	protected AssertedInferenceBasePropertiesEditionComponent assertedInferenceBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The AssertedInferenceNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected AssertedInferenceNotesPropertiesEditionComponent assertedInferenceNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param assertedInference the EObject to edit
	 * 
	 */
	public AssertedInferencePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject assertedInference, String editing_mode) {
		super(editingContext, editing_mode);
		if (assertedInference instanceof AssertedInference) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(assertedInference, PropertiesEditingProvider.class);
			assertedInferenceBasePropertiesEditionComponent = (AssertedInferenceBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, AssertedInferenceBasePropertiesEditionComponent.BASE_PART, AssertedInferenceBasePropertiesEditionComponent.class);
			addSubComponent(assertedInferenceBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(assertedInference, PropertiesEditingProvider.class);
			assertedInferenceNotesPropertiesEditionComponent = (AssertedInferenceNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, AssertedInferenceNotesPropertiesEditionComponent.NOTES_PART, AssertedInferenceNotesPropertiesEditionComponent.class);
			addSubComponent(assertedInferenceNotesPropertiesEditionComponent);
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
		if (AssertedInferenceBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (AssertedInferencePropertiesEditionPart)assertedInferenceBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (AssertedInferenceNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)assertedInferenceNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (ArgumentationViewsRepository.AssertedInference.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (AssertedInferencePropertiesEditionPart)propertiesEditionPart;
		}
		if (ArgumentationViewsRepository.Notes.class == key) {
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
		if (key == ArgumentationViewsRepository.AssertedInference.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ArgumentationViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
