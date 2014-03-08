// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.ObjectifiedAssertion;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.NotesPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.ObjectifiedAssertionPropertiesEditionPart;

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
public class ObjectifiedAssertionPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private ObjectifiedAssertionPropertiesEditionPart basePart;

	/**
	 * The ObjectifiedAssertionBasePropertiesEditionComponent sub component
	 * 
	 */
	protected ObjectifiedAssertionBasePropertiesEditionComponent objectifiedAssertionBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The ObjectifiedAssertionNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected ObjectifiedAssertionNotesPropertiesEditionComponent objectifiedAssertionNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param objectifiedAssertion the EObject to edit
	 * 
	 */
	public ObjectifiedAssertionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject objectifiedAssertion, String editing_mode) {
		super(editingContext, editing_mode);
		if (objectifiedAssertion instanceof ObjectifiedAssertion) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(objectifiedAssertion, PropertiesEditingProvider.class);
			objectifiedAssertionBasePropertiesEditionComponent = (ObjectifiedAssertionBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ObjectifiedAssertionBasePropertiesEditionComponent.BASE_PART, ObjectifiedAssertionBasePropertiesEditionComponent.class);
			addSubComponent(objectifiedAssertionBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(objectifiedAssertion, PropertiesEditingProvider.class);
			objectifiedAssertionNotesPropertiesEditionComponent = (ObjectifiedAssertionNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ObjectifiedAssertionNotesPropertiesEditionComponent.NOTES_PART, ObjectifiedAssertionNotesPropertiesEditionComponent.class);
			addSubComponent(objectifiedAssertionNotesPropertiesEditionComponent);
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
		if (ObjectifiedAssertionBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (ObjectifiedAssertionPropertiesEditionPart)objectifiedAssertionBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (ObjectifiedAssertionNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)objectifiedAssertionNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.ObjectifiedAssertion.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (ObjectifiedAssertionPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.ObjectifiedAssertion.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
