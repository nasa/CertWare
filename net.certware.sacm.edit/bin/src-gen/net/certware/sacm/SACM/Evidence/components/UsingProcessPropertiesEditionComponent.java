// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.UsingProcess;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.NotesPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.UsingProcessPropertiesEditionPart;

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
public class UsingProcessPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private UsingProcessPropertiesEditionPart basePart;

	/**
	 * The UsingProcessBasePropertiesEditionComponent sub component
	 * 
	 */
	protected UsingProcessBasePropertiesEditionComponent usingProcessBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The UsingProcessNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected UsingProcessNotesPropertiesEditionComponent usingProcessNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param usingProcess the EObject to edit
	 * 
	 */
	public UsingProcessPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject usingProcess, String editing_mode) {
		super(editingContext, editing_mode);
		if (usingProcess instanceof UsingProcess) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(usingProcess, PropertiesEditingProvider.class);
			usingProcessBasePropertiesEditionComponent = (UsingProcessBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, UsingProcessBasePropertiesEditionComponent.BASE_PART, UsingProcessBasePropertiesEditionComponent.class);
			addSubComponent(usingProcessBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(usingProcess, PropertiesEditingProvider.class);
			usingProcessNotesPropertiesEditionComponent = (UsingProcessNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, UsingProcessNotesPropertiesEditionComponent.NOTES_PART, UsingProcessNotesPropertiesEditionComponent.class);
			addSubComponent(usingProcessNotesPropertiesEditionComponent);
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
		if (UsingProcessBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (UsingProcessPropertiesEditionPart)usingProcessBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (UsingProcessNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)usingProcessNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.UsingProcess.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (UsingProcessPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.UsingProcess.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
