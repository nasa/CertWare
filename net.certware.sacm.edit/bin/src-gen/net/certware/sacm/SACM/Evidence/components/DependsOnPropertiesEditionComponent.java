// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.DependsOn;
import net.certware.sacm.SACM.Evidence.parts.DependsOnPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
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
public class DependsOnPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private DependsOnPropertiesEditionPart basePart;

	/**
	 * The DependsOnBasePropertiesEditionComponent sub component
	 * 
	 */
	protected DependsOnBasePropertiesEditionComponent dependsOnBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The DependsOnNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected DependsOnNotesPropertiesEditionComponent dependsOnNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param dependsOn the EObject to edit
	 * 
	 */
	public DependsOnPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject dependsOn, String editing_mode) {
		super(editingContext, editing_mode);
		if (dependsOn instanceof DependsOn) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(dependsOn, PropertiesEditingProvider.class);
			dependsOnBasePropertiesEditionComponent = (DependsOnBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, DependsOnBasePropertiesEditionComponent.BASE_PART, DependsOnBasePropertiesEditionComponent.class);
			addSubComponent(dependsOnBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(dependsOn, PropertiesEditingProvider.class);
			dependsOnNotesPropertiesEditionComponent = (DependsOnNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, DependsOnNotesPropertiesEditionComponent.NOTES_PART, DependsOnNotesPropertiesEditionComponent.class);
			addSubComponent(dependsOnNotesPropertiesEditionComponent);
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
		if (DependsOnBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (DependsOnPropertiesEditionPart)dependsOnBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (DependsOnNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)dependsOnNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.DependsOn.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (DependsOnPropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.DependsOn.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
