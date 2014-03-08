// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.PerformedBy;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.NotesPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.PerformedByPropertiesEditionPart;

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
public class PerformedByPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private PerformedByPropertiesEditionPart basePart;

	/**
	 * The PerformedByBasePropertiesEditionComponent sub component
	 * 
	 */
	protected PerformedByBasePropertiesEditionComponent performedByBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The PerformedByNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected PerformedByNotesPropertiesEditionComponent performedByNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param performedBy the EObject to edit
	 * 
	 */
	public PerformedByPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject performedBy, String editing_mode) {
		super(editingContext, editing_mode);
		if (performedBy instanceof PerformedBy) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(performedBy, PropertiesEditingProvider.class);
			performedByBasePropertiesEditionComponent = (PerformedByBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, PerformedByBasePropertiesEditionComponent.BASE_PART, PerformedByBasePropertiesEditionComponent.class);
			addSubComponent(performedByBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(performedBy, PropertiesEditingProvider.class);
			performedByNotesPropertiesEditionComponent = (PerformedByNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, PerformedByNotesPropertiesEditionComponent.NOTES_PART, PerformedByNotesPropertiesEditionComponent.class);
			addSubComponent(performedByNotesPropertiesEditionComponent);
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
		if (PerformedByBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (PerformedByPropertiesEditionPart)performedByBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (PerformedByNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)performedByNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.PerformedBy.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (PerformedByPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.PerformedBy.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
