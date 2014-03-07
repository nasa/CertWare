// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Argumentation.providers;

import java.util.List;

import net.certware.sacm.SACM.Argumentation.ArgumentationPackage;
import net.certware.sacm.SACM.Argumentation.AssertedEvidence;

import net.certware.sacm.SACM.Argumentation.components.AssertedEvidenceBasePropertiesEditionComponent;
import net.certware.sacm.SACM.Argumentation.components.AssertedEvidenceNotesPropertiesEditionComponent;
import net.certware.sacm.SACM.Argumentation.components.AssertedEvidencePropertiesEditionComponent;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;

import org.eclipse.jface.viewers.IFilter;

/**
 * @author Kestrel Technology LLC
 * 
 */
public class AssertedEvidencePropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public AssertedEvidencePropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public AssertedEvidencePropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof AssertedEvidence) 
					&& (ArgumentationPackage.Literals.ASSERTED_EVIDENCE == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof AssertedEvidence) && (AssertedEvidenceBasePropertiesEditionComponent.BASE_PART.equals(part) || AssertedEvidenceNotesPropertiesEditionComponent.NOTES_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof AssertedEvidence) && (refinement == AssertedEvidenceBasePropertiesEditionComponent.class || refinement == AssertedEvidenceNotesPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof AssertedEvidence) && ((AssertedEvidenceBasePropertiesEditionComponent.BASE_PART.equals(part) && refinement == AssertedEvidenceBasePropertiesEditionComponent.class) || (AssertedEvidenceNotesPropertiesEditionComponent.NOTES_PART.equals(part) && refinement == AssertedEvidenceNotesPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof AssertedEvidence) {
			return new AssertedEvidencePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof AssertedEvidence) {
			if (AssertedEvidenceBasePropertiesEditionComponent.BASE_PART.equals(part))
				return new AssertedEvidenceBasePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (AssertedEvidenceNotesPropertiesEditionComponent.NOTES_PART.equals(part))
				return new AssertedEvidenceNotesPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof AssertedEvidence) {
			if (AssertedEvidenceBasePropertiesEditionComponent.BASE_PART.equals(part)
				&& refinement == AssertedEvidenceBasePropertiesEditionComponent.class)
				return new AssertedEvidenceBasePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (AssertedEvidenceNotesPropertiesEditionComponent.NOTES_PART.equals(part)
				&& refinement == AssertedEvidenceNotesPropertiesEditionComponent.class)
				return new AssertedEvidenceNotesPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part, refinement);
	}

	/**
	 * Provides the filter used by the plugin.xml to assign part forms.
	 */
	public static class EditionFilter implements IFilter {
		
		/**
		 * {@inheritDoc}
		 * 
		 * @see org.eclipse.jface.viewers.IFilter#select(java.lang.Object)
		 */
		public boolean select(Object toTest) {
			EObject eObj = EEFUtils.resolveSemanticObject(toTest);
			return eObj != null && ArgumentationPackage.Literals.ASSERTED_EVIDENCE == eObj.eClass();
		}
		
	}

}
