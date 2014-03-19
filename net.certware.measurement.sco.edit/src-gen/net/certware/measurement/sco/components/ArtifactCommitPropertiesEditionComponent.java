/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.components;

// Start of user code for imports
import net.certware.measurement.sco.ArtifactCommit;
import net.certware.measurement.sco.ArtifactIdentifier;
import net.certware.measurement.sco.ScoPackage;
import net.certware.measurement.sco.parts.ArtifactCommitPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class ArtifactCommitPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for artifactIdentifiers ReferencesTable
	 */
	protected ReferencesTableSettings artifactIdentifiersSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ArtifactCommitPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject artifactCommit, String editing_mode) {
		super(editingContext, artifactCommit, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ScoViewsRepository.class;
		partKey = ScoViewsRepository.ArtifactCommit.class;
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
			
			final ArtifactCommit artifactCommit = (ArtifactCommit)elt;
			final ArtifactCommitPropertiesEditionPart basePart = (ArtifactCommitPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ScoViewsRepository.ArtifactCommit.Properties.artifactIdentifiers)) {
				artifactIdentifiersSettings = new ReferencesTableSettings(artifactCommit, ScoPackage.eINSTANCE.getArtifactCommit_ArtifactIdentifiers());
				basePart.initArtifactIdentifiers(artifactIdentifiersSettings);
			}
			if (isAccessible(ScoViewsRepository.ArtifactCommit.Properties.commitIdentifier))
				basePart.setCommitIdentifier(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, artifactCommit.getCommitIdentifier()));
			
			if (isAccessible(ScoViewsRepository.ArtifactCommit.Properties.usageTime)) {
				basePart.setUsageTime(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, artifactCommit.getUsageTime()));
			}
			
			// init filters
			if (isAccessible(ScoViewsRepository.ArtifactCommit.Properties.artifactIdentifiers)) {
				basePart.addFilterToArtifactIdentifiers(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ArtifactIdentifier); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for artifactIdentifiers
			// End of user code
			}
			
			
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
		if (editorKey == ScoViewsRepository.ArtifactCommit.Properties.artifactIdentifiers) {
			return ScoPackage.eINSTANCE.getArtifactCommit_ArtifactIdentifiers();
		}
		if (editorKey == ScoViewsRepository.ArtifactCommit.Properties.commitIdentifier) {
			return ScoPackage.eINSTANCE.getArtifactCommit_CommitIdentifier();
		}
		if (editorKey == ScoViewsRepository.ArtifactCommit.Properties.usageTime) {
			return ScoPackage.eINSTANCE.getArtifactCommit_UsageTime();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ArtifactCommit artifactCommit = (ArtifactCommit)semanticObject;
		if (ScoViewsRepository.ArtifactCommit.Properties.artifactIdentifiers == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, artifactIdentifiersSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				artifactIdentifiersSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				artifactIdentifiersSettings.move(event.getNewIndex(), (ArtifactIdentifier) event.getNewValue());
			}
		}
		if (ScoViewsRepository.ArtifactCommit.Properties.commitIdentifier == event.getAffectedEditor()) {
			artifactCommit.setCommitIdentifier((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ScoViewsRepository.ArtifactCommit.Properties.usageTime == event.getAffectedEditor()) {
			artifactCommit.setUsageTime((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ArtifactCommitPropertiesEditionPart basePart = (ArtifactCommitPropertiesEditionPart)editingPart;
			if (ScoPackage.eINSTANCE.getArtifactCommit_ArtifactIdentifiers().equals(msg.getFeature()) && isAccessible(ScoViewsRepository.ArtifactCommit.Properties.artifactIdentifiers))
				basePart.updateArtifactIdentifiers();
			if (ScoPackage.eINSTANCE.getArtifactCommit_CommitIdentifier().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScoViewsRepository.ArtifactCommit.Properties.commitIdentifier)) {
				if (msg.getNewValue() != null) {
					basePart.setCommitIdentifier(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCommitIdentifier("");
				}
			}
			if (ScoPackage.eINSTANCE.getArtifactCommit_UsageTime().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ScoViewsRepository.ArtifactCommit.Properties.usageTime)) {
				if (msg.getNewValue() != null) {
					basePart.setUsageTime(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setUsageTime("");
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
			ScoPackage.eINSTANCE.getArtifactCommit_ArtifactIdentifiers(),
			ScoPackage.eINSTANCE.getArtifactCommit_CommitIdentifier(),
			ScoPackage.eINSTANCE.getArtifactCommit_UsageTime()		);
		return new NotificationFilter[] {filter,};
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
				if (ScoViewsRepository.ArtifactCommit.Properties.commitIdentifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScoPackage.eINSTANCE.getArtifactCommit_CommitIdentifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getArtifactCommit_CommitIdentifier().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.ArtifactCommit.Properties.usageTime == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ScoPackage.eINSTANCE.getArtifactCommit_UsageTime().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getArtifactCommit_UsageTime().getEAttributeType(), newValue);
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
