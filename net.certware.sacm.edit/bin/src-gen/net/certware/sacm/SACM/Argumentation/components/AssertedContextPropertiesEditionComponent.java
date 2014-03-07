// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Argumentation.components;

// Start of user code for imports
import net.certware.sacm.SACM.Argumentation.AssertedContext;
import net.certware.sacm.SACM.Argumentation.parts.ArgumentationViewsRepository;
import net.certware.sacm.SACM.Argumentation.parts.AssertedContextPropertiesEditionPart;
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
public class AssertedContextPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private AssertedContextPropertiesEditionPart basePart;

	/**
	 * The AssertedContextBasePropertiesEditionComponent sub component
	 * 
	 */
	protected AssertedContextBasePropertiesEditionComponent assertedContextBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The AssertedContextNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected AssertedContextNotesPropertiesEditionComponent assertedContextNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param assertedContext the EObject to edit
	 * 
	 */
	public AssertedContextPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject assertedContext, String editing_mode) {
		super(editingContext, editing_mode);
		if (assertedContext instanceof AssertedContext) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(assertedContext, PropertiesEditingProvider.class);
			assertedContextBasePropertiesEditionComponent = (AssertedContextBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, AssertedContextBasePropertiesEditionComponent.BASE_PART, AssertedContextBasePropertiesEditionComponent.class);
			addSubComponent(assertedContextBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(assertedContext, PropertiesEditingProvider.class);
			assertedContextNotesPropertiesEditionComponent = (AssertedContextNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, AssertedContextNotesPropertiesEditionComponent.NOTES_PART, AssertedContextNotesPropertiesEditionComponent.class);
			addSubComponent(assertedContextNotesPropertiesEditionComponent);
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
		if (AssertedContextBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (AssertedContextPropertiesEditionPart)assertedContextBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (AssertedContextNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)assertedContextNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (ArgumentationViewsRepository.AssertedContext.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (AssertedContextPropertiesEditionPart)propertiesEditionPart;
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
		if (key == ArgumentationViewsRepository.AssertedContext.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ArgumentationViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
