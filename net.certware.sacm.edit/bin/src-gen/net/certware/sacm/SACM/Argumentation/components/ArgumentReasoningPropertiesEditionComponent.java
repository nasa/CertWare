// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Argumentation.components;

// Start of user code for imports
import net.certware.sacm.SACM.Argumentation.ArgumentReasoning;
import net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart;
import net.certware.sacm.SACM.Argumentation.parts.ArgumentationViewsRepository;
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
public class ArgumentReasoningPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private ArgumentReasoningPropertiesEditionPart basePart;

	/**
	 * The ArgumentReasoningBasePropertiesEditionComponent sub component
	 * 
	 */
	protected ArgumentReasoningBasePropertiesEditionComponent argumentReasoningBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The ArgumentReasoningNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected ArgumentReasoningNotesPropertiesEditionComponent argumentReasoningNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param argumentReasoning the EObject to edit
	 * 
	 */
	public ArgumentReasoningPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject argumentReasoning, String editing_mode) {
		super(editingContext, editing_mode);
		if (argumentReasoning instanceof ArgumentReasoning) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(argumentReasoning, PropertiesEditingProvider.class);
			argumentReasoningBasePropertiesEditionComponent = (ArgumentReasoningBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ArgumentReasoningBasePropertiesEditionComponent.BASE_PART, ArgumentReasoningBasePropertiesEditionComponent.class);
			addSubComponent(argumentReasoningBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(argumentReasoning, PropertiesEditingProvider.class);
			argumentReasoningNotesPropertiesEditionComponent = (ArgumentReasoningNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ArgumentReasoningNotesPropertiesEditionComponent.NOTES_PART, ArgumentReasoningNotesPropertiesEditionComponent.class);
			addSubComponent(argumentReasoningNotesPropertiesEditionComponent);
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
		if (ArgumentReasoningBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (ArgumentReasoningPropertiesEditionPart)argumentReasoningBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (ArgumentReasoningNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)argumentReasoningNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (ArgumentationViewsRepository.ArgumentReasoning.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (ArgumentReasoningPropertiesEditionPart)propertiesEditionPart;
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
		if (key == ArgumentationViewsRepository.ArgumentReasoning.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ArgumentationViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
