// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.Organization;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.NotesPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.OrganizationPropertiesEditionPart;

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
public class OrganizationPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private OrganizationPropertiesEditionPart basePart;

	/**
	 * The OrganizationBasePropertiesEditionComponent sub component
	 * 
	 */
	protected OrganizationBasePropertiesEditionComponent organizationBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The OrganizationNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected OrganizationNotesPropertiesEditionComponent organizationNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param organization the EObject to edit
	 * 
	 */
	public OrganizationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject organization, String editing_mode) {
		super(editingContext, editing_mode);
		if (organization instanceof Organization) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(organization, PropertiesEditingProvider.class);
			organizationBasePropertiesEditionComponent = (OrganizationBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, OrganizationBasePropertiesEditionComponent.BASE_PART, OrganizationBasePropertiesEditionComponent.class);
			addSubComponent(organizationBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(organization, PropertiesEditingProvider.class);
			organizationNotesPropertiesEditionComponent = (OrganizationNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, OrganizationNotesPropertiesEditionComponent.NOTES_PART, OrganizationNotesPropertiesEditionComponent.class);
			addSubComponent(organizationNotesPropertiesEditionComponent);
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
		if (OrganizationBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (OrganizationPropertiesEditionPart)organizationBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (OrganizationNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)organizationNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.Organization.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (OrganizationPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.Organization.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
