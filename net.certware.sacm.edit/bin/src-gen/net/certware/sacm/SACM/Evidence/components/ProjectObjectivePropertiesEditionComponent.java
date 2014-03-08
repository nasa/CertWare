// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.ProjectObjective;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.NotesPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.ProjectObjectivePropertiesEditionPart;

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
public class ProjectObjectivePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private ProjectObjectivePropertiesEditionPart basePart;

	/**
	 * The ProjectObjectiveBasePropertiesEditionComponent sub component
	 * 
	 */
	protected ProjectObjectiveBasePropertiesEditionComponent projectObjectiveBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The ProjectObjectiveNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected ProjectObjectiveNotesPropertiesEditionComponent projectObjectiveNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param projectObjective the EObject to edit
	 * 
	 */
	public ProjectObjectivePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject projectObjective, String editing_mode) {
		super(editingContext, editing_mode);
		if (projectObjective instanceof ProjectObjective) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(projectObjective, PropertiesEditingProvider.class);
			projectObjectiveBasePropertiesEditionComponent = (ProjectObjectiveBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ProjectObjectiveBasePropertiesEditionComponent.BASE_PART, ProjectObjectiveBasePropertiesEditionComponent.class);
			addSubComponent(projectObjectiveBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(projectObjective, PropertiesEditingProvider.class);
			projectObjectiveNotesPropertiesEditionComponent = (ProjectObjectiveNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ProjectObjectiveNotesPropertiesEditionComponent.NOTES_PART, ProjectObjectiveNotesPropertiesEditionComponent.class);
			addSubComponent(projectObjectiveNotesPropertiesEditionComponent);
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
		if (ProjectObjectiveBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (ProjectObjectivePropertiesEditionPart)projectObjectiveBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (ProjectObjectiveNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)projectObjectiveNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
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
		if (EvidenceViewsRepository.ProjectObjective.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (ProjectObjectivePropertiesEditionPart)propertiesEditionPart;
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
		if (key == EvidenceViewsRepository.ProjectObjective.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
