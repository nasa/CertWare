// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.components;

// Start of user code for imports
import net.certware.sacm.SACM.AssuranceCase;
import net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart;
import net.certware.sacm.SACM.parts.NotesPropertiesEditionPart;
import net.certware.sacm.SACM.parts.SACMViewsRepository;

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
public class AssuranceCasePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private AssuranceCasePropertiesEditionPart basePart;

	/**
	 * The AssuranceCaseBasePropertiesEditionComponent sub component
	 * 
	 */
	protected AssuranceCaseBasePropertiesEditionComponent assuranceCaseBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The AssuranceCaseNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected AssuranceCaseNotesPropertiesEditionComponent assuranceCaseNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param assuranceCase the EObject to edit
	 * 
	 */
	public AssuranceCasePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject assuranceCase, String editing_mode) {
		super(editingContext, editing_mode);
		if (assuranceCase instanceof AssuranceCase) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(assuranceCase, PropertiesEditingProvider.class);
			assuranceCaseBasePropertiesEditionComponent = (AssuranceCaseBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, AssuranceCaseBasePropertiesEditionComponent.BASE_PART, AssuranceCaseBasePropertiesEditionComponent.class);
			addSubComponent(assuranceCaseBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(assuranceCase, PropertiesEditingProvider.class);
			assuranceCaseNotesPropertiesEditionComponent = (AssuranceCaseNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, AssuranceCaseNotesPropertiesEditionComponent.NOTES_PART, AssuranceCaseNotesPropertiesEditionComponent.class);
			addSubComponent(assuranceCaseNotesPropertiesEditionComponent);
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
		if (AssuranceCaseBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (AssuranceCasePropertiesEditionPart)assuranceCaseBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (AssuranceCaseNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)assuranceCaseNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (SACMViewsRepository.AssuranceCase.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (AssuranceCasePropertiesEditionPart)propertiesEditionPart;
		}
		if (SACMViewsRepository.Notes.class == key) {
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
		if (key == SACMViewsRepository.AssuranceCase.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == SACMViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
