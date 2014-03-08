// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.HasElectronicSource;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.HasElectronicSourcePropertiesEditionPart;
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
public class HasElectronicSourcePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private HasElectronicSourcePropertiesEditionPart basePart;

	/**
	 * The HasElectronicSourceBasePropertiesEditionComponent sub component
	 * 
	 */
	protected HasElectronicSourceBasePropertiesEditionComponent hasElectronicSourceBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The HasElectronicSourceNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected HasElectronicSourceNotesPropertiesEditionComponent hasElectronicSourceNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param hasElectronicSource the EObject to edit
	 * 
	 */
	public HasElectronicSourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hasElectronicSource, String editing_mode) {
		super(editingContext, editing_mode);
		if (hasElectronicSource instanceof HasElectronicSource) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hasElectronicSource, PropertiesEditingProvider.class);
			hasElectronicSourceBasePropertiesEditionComponent = (HasElectronicSourceBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HasElectronicSourceBasePropertiesEditionComponent.BASE_PART, HasElectronicSourceBasePropertiesEditionComponent.class);
			addSubComponent(hasElectronicSourceBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(hasElectronicSource, PropertiesEditingProvider.class);
			hasElectronicSourceNotesPropertiesEditionComponent = (HasElectronicSourceNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, HasElectronicSourceNotesPropertiesEditionComponent.NOTES_PART, HasElectronicSourceNotesPropertiesEditionComponent.class);
			addSubComponent(hasElectronicSourceNotesPropertiesEditionComponent);
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
		if (HasElectronicSourceBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (HasElectronicSourcePropertiesEditionPart)hasElectronicSourceBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (HasElectronicSourceNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)hasElectronicSourceNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.HasElectronicSource.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (HasElectronicSourcePropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.HasElectronicSource.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
