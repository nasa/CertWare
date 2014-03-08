// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.providers;

import java.util.List;

import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.ExtendedEvidenceAttribute;

import net.certware.sacm.SACM.Evidence.components.ExtendedEvidenceAttributeBasePropertiesEditionComponent;
import net.certware.sacm.SACM.Evidence.components.ExtendedEvidenceAttributeNotesPropertiesEditionComponent;
import net.certware.sacm.SACM.Evidence.components.ExtendedEvidenceAttributePropertiesEditionComponent;

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
public class ExtendedEvidenceAttributePropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public ExtendedEvidenceAttributePropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public ExtendedEvidenceAttributePropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof ExtendedEvidenceAttribute) 
					&& (EvidencePackage.Literals.EXTENDED_EVIDENCE_ATTRIBUTE == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof ExtendedEvidenceAttribute) && (ExtendedEvidenceAttributeBasePropertiesEditionComponent.BASE_PART.equals(part) || ExtendedEvidenceAttributeNotesPropertiesEditionComponent.NOTES_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof ExtendedEvidenceAttribute) && (refinement == ExtendedEvidenceAttributeBasePropertiesEditionComponent.class || refinement == ExtendedEvidenceAttributeNotesPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof ExtendedEvidenceAttribute) && ((ExtendedEvidenceAttributeBasePropertiesEditionComponent.BASE_PART.equals(part) && refinement == ExtendedEvidenceAttributeBasePropertiesEditionComponent.class) || (ExtendedEvidenceAttributeNotesPropertiesEditionComponent.NOTES_PART.equals(part) && refinement == ExtendedEvidenceAttributeNotesPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof ExtendedEvidenceAttribute) {
			return new ExtendedEvidenceAttributePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof ExtendedEvidenceAttribute) {
			if (ExtendedEvidenceAttributeBasePropertiesEditionComponent.BASE_PART.equals(part))
				return new ExtendedEvidenceAttributeBasePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (ExtendedEvidenceAttributeNotesPropertiesEditionComponent.NOTES_PART.equals(part))
				return new ExtendedEvidenceAttributeNotesPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof ExtendedEvidenceAttribute) {
			if (ExtendedEvidenceAttributeBasePropertiesEditionComponent.BASE_PART.equals(part)
				&& refinement == ExtendedEvidenceAttributeBasePropertiesEditionComponent.class)
				return new ExtendedEvidenceAttributeBasePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (ExtendedEvidenceAttributeNotesPropertiesEditionComponent.NOTES_PART.equals(part)
				&& refinement == ExtendedEvidenceAttributeNotesPropertiesEditionComponent.class)
				return new ExtendedEvidenceAttributeNotesPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
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
			return eObj != null && EvidencePackage.Literals.EXTENDED_EVIDENCE_ATTRIBUTE == eObj.eClass();
		}
		
	}

}
