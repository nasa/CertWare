// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Argumentation.components;

// Start of user code for imports
import net.certware.sacm.SACM.Argumentation.AssertedChallenge;
import net.certware.sacm.SACM.Argumentation.parts.ArgumentationViewsRepository;
import net.certware.sacm.SACM.Argumentation.parts.AssertedChallengePropertiesEditionPart;
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
public class AssertedChallengePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private AssertedChallengePropertiesEditionPart basePart;

	/**
	 * The AssertedChallengeBasePropertiesEditionComponent sub component
	 * 
	 */
	protected AssertedChallengeBasePropertiesEditionComponent assertedChallengeBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The AssertedChallengeNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected AssertedChallengeNotesPropertiesEditionComponent assertedChallengeNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param assertedChallenge the EObject to edit
	 * 
	 */
	public AssertedChallengePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject assertedChallenge, String editing_mode) {
		super(editingContext, editing_mode);
		if (assertedChallenge instanceof AssertedChallenge) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(assertedChallenge, PropertiesEditingProvider.class);
			assertedChallengeBasePropertiesEditionComponent = (AssertedChallengeBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, AssertedChallengeBasePropertiesEditionComponent.BASE_PART, AssertedChallengeBasePropertiesEditionComponent.class);
			addSubComponent(assertedChallengeBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(assertedChallenge, PropertiesEditingProvider.class);
			assertedChallengeNotesPropertiesEditionComponent = (AssertedChallengeNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, AssertedChallengeNotesPropertiesEditionComponent.NOTES_PART, AssertedChallengeNotesPropertiesEditionComponent.class);
			addSubComponent(assertedChallengeNotesPropertiesEditionComponent);
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
		if (AssertedChallengeBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (AssertedChallengePropertiesEditionPart)assertedChallengeBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (AssertedChallengeNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)assertedChallengeNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (ArgumentationViewsRepository.AssertedChallenge.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (AssertedChallengePropertiesEditionPart)propertiesEditionPart;
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
		if (key == ArgumentationViewsRepository.AssertedChallenge.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ArgumentationViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
