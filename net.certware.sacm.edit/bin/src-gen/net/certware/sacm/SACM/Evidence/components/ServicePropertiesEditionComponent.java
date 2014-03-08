// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.Service;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.NotesPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.ServicePropertiesEditionPart;

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
public class ServicePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private ServicePropertiesEditionPart basePart;

	/**
	 * The ServiceBasePropertiesEditionComponent sub component
	 * 
	 */
	protected ServiceBasePropertiesEditionComponent serviceBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The ServiceNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected ServiceNotesPropertiesEditionComponent serviceNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param service the EObject to edit
	 * 
	 */
	public ServicePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject service, String editing_mode) {
		super(editingContext, editing_mode);
		if (service instanceof Service) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(service, PropertiesEditingProvider.class);
			serviceBasePropertiesEditionComponent = (ServiceBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ServiceBasePropertiesEditionComponent.BASE_PART, ServiceBasePropertiesEditionComponent.class);
			addSubComponent(serviceBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(service, PropertiesEditingProvider.class);
			serviceNotesPropertiesEditionComponent = (ServiceNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ServiceNotesPropertiesEditionComponent.NOTES_PART, ServiceNotesPropertiesEditionComponent.class);
			addSubComponent(serviceNotesPropertiesEditionComponent);
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
		if (ServiceBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (ServicePropertiesEditionPart)serviceBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (ServiceNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)serviceNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.Service.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (ServicePropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.Service.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
