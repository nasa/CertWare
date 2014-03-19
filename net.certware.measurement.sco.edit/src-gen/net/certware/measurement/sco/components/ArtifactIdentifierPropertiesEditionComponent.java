/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.components;

// Start of user code for imports
import net.certware.measurement.sco.ArtifactIdentifier;
import net.certware.measurement.sco.ScoPackage;
import net.certware.measurement.sco.parts.ArtifactIdentifierPropertiesEditionPart;
import net.certware.measurement.sco.parts.ScoViewsRepository;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
	

// End of user code

/**
 * 
 * 
 */
public class ArtifactIdentifierPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ArtifactIdentifierPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject artifactIdentifier, String editing_mode) {
		super(editingContext, artifactIdentifier, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ScoViewsRepository.class;
		partKey = ScoViewsRepository.ArtifactIdentifier.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final ArtifactIdentifier artifactIdentifier = (ArtifactIdentifier)elt;
			final ArtifactIdentifierPropertiesEditionPart basePart = (ArtifactIdentifierPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ScoViewsRepository.ArtifactIdentifier.Properties.resourceName))
				basePart.setResourceName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, artifactIdentifier.getResourceName()));
			
			if (isAccessible(ScoViewsRepository.ArtifactIdentifier.Properties.baselinedLineCount)) {
				basePart.setBaselinedLineCount(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, artifactIdentifier.getBaselinedLineCount()));
			}
			
			if (isAccessible(ScoViewsRepository.ArtifactIdentifier.Properties.currentLineCount)) {
				basePart.setCurrentLineCount(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, artifactIdentifier.getCurrentLineCount()));
			}
			
			// init filters
			
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}






	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ScoViewsRepository.ArtifactIdentifier.Properties.resourceName) {
			return ScoPackage.eINSTANCE.getArtifactIdentifier_ResourceName();
		}
		if (editorKey == ScoViewsRepository.ArtifactIdentifier.Properties.baselinedLineCount) {
			return ScoPackage.eINSTANCE.getArtifactIdentifier_BaselinedLineCount();
		}
		if (editorKey == ScoViewsRepository.ArtifactIdentifier.Properties.currentLineCount) {
			return ScoPackage.eINSTANCE.getArtifactIdentifier_CurrentLineCount();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ArtifactIdentifier artifactIdentifier = (ArtifactIdentifier)semanticObject;
		if (ScoViewsRepository.ArtifactIdentifier.Properties.resourceName == event.getAffectedEditor()) {
			artifactIdentifier.setResourceName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ScoViewsRepository.ArtifactIdentifier.Properties.baselinedLineCount == event.getAffectedEditor()) {
			artifactIdentifier.setBaselinedLineCount((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (ScoViewsRepository.ArtifactIdentifier.Properties.currentLineCount == event.getAffectedEditor()) {
			artifactIdentifier.setCurrentLineCount((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ArtifactIdentifierPropertiesEditionPart basePart = (ArtifactIdentifierPropertiesEditionPart)editingPart;
			if (ScoPackage.eINSTANCE.getArtifactIdentifier_ResourceName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScoViewsRepository.ArtifactIdentifier.Properties.resourceName)) {
				if (msg.getNewValue() != null) {
					basePart.setResourceName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setResourceName("");
				}
			}
			if (ScoPackage.eINSTANCE.getArtifactIdentifier_BaselinedLineCount().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScoViewsRepository.ArtifactIdentifier.Properties.baselinedLineCount)) {
				if (msg.getNewValue() != null) {
					basePart.setBaselinedLineCount(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setBaselinedLineCount("");
				}
			}
			if (ScoPackage.eINSTANCE.getArtifactIdentifier_CurrentLineCount().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScoViewsRepository.ArtifactIdentifier.Properties.currentLineCount)) {
				if (msg.getNewValue() != null) {
					basePart.setCurrentLineCount(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setCurrentLineCount("");
				}
			}
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			ScoPackage.eINSTANCE.getArtifactIdentifier_ResourceName(),
			ScoPackage.eINSTANCE.getArtifactIdentifier_BaselinedLineCount(),
			ScoPackage.eINSTANCE.getArtifactIdentifier_CurrentLineCount()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ScoViewsRepository.ArtifactIdentifier.Properties.resourceName || key == ScoViewsRepository.ArtifactIdentifier.Properties.baselinedLineCount || key == ScoViewsRepository.ArtifactIdentifier.Properties.currentLineCount;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == ScoViewsRepository.ArtifactIdentifier.Properties.resourceName)
			return "The name of the case artifact associated with this record"; //$NON-NLS-1$
		if (key == ScoViewsRepository.ArtifactIdentifier.Properties.baselinedLineCount)
			return "The number of configured or baselined lines in this artifact"; //$NON-NLS-1$
		if (key == ScoViewsRepository.ArtifactIdentifier.Properties.currentLineCount)
			return "The current line count for the artifact"; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (ScoViewsRepository.ArtifactIdentifier.Properties.resourceName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScoPackage.eINSTANCE.getArtifactIdentifier_ResourceName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getArtifactIdentifier_ResourceName().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.ArtifactIdentifier.Properties.baselinedLineCount == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScoPackage.eINSTANCE.getArtifactIdentifier_BaselinedLineCount().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getArtifactIdentifier_BaselinedLineCount().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.ArtifactIdentifier.Properties.currentLineCount == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScoPackage.eINSTANCE.getArtifactIdentifier_CurrentLineCount().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getArtifactIdentifier_CurrentLineCount().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

<<<<<<< HEAD

	
=======
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		// TODO Auto-generated method stub
		return null;
	}
>>>>>>> refs/heads/master

}
