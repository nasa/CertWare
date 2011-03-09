/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.components;

// Start of user code for imports
import net.certware.measurement.sco.ArtifactIdentifier;
import net.certware.measurement.sco.ScoPackage;
import net.certware.measurement.sco.parts.ArtifactIdentifierPropertiesEditionPart;
import net.certware.measurement.sco.parts.ScoViewsRepository;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesValidationEditionEvent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
	

// End of user code

/**
 * @author mrb
 * 
 */
public class ArtifactIdentifierPropertiesEditionComponent extends StandardPropertiesEditionComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	private String[] parts = {BASE_PART};

	/**
	 * The EObject to edit
	 * 
	 */
	private ArtifactIdentifier artifactIdentifier;

	/**
	 * The Base part
	 * 
	 */
	protected ArtifactIdentifierPropertiesEditionPart basePart;

	/**
	 * Default constructor
	 * 
	 */
	public ArtifactIdentifierPropertiesEditionComponent(EObject artifactIdentifier, String editing_mode) {
		if (artifactIdentifier instanceof ArtifactIdentifier) {
			this.artifactIdentifier = (ArtifactIdentifier)artifactIdentifier;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.artifactIdentifier.eAdapters().add(semanticAdapter);
			}
		}
		this.editing_mode = editing_mode;
	}

	/**
	 * Initialize the semantic model listener for live editing mode
	 * 
	 * @return the semantic model listener
	 * 
	 */
	private AdapterImpl initializeSemanticAdapter() {
		return new EContentAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
			 * 
			 */
			public void notifyChanged(final Notification msg) {
				if (basePart == null)
					ArtifactIdentifierPropertiesEditionComponent.this.dispose();
				else {
					Runnable updateRunnable = new Runnable() {
						public void run() {
							runUpdateRunnable(msg);
						}
					};
					if (null == Display.getCurrent()) {
						PlatformUI.getWorkbench().getDisplay().syncExec(updateRunnable);
					} else {
						updateRunnable.run();
					}
				}
			}

		};
	}

	/**
	 * Used to update the views
	 * 
	 */
	protected void runUpdateRunnable(final Notification msg) {
		if (ScoPackage.eINSTANCE.getArtifactIdentifier_ResourceName().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setResourceName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
			} else {
				basePart.setResourceName("");
			}
		}
		if (ScoPackage.eINSTANCE.getArtifactIdentifier_BaselinedLineCount().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setBaselinedLineCount(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
			} else {
				basePart.setBaselinedLineCount("");
			}
		}
		if (ScoPackage.eINSTANCE.getArtifactIdentifier_CurrentLineCount().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setCurrentLineCount(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
			} else {
				basePart.setCurrentLineCount("");
			}
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#translatePart(java.lang.String)
	 * 
	 */
	public java.lang.Class translatePart(String key) {
		if (BASE_PART.equals(key))
			return ScoViewsRepository.ArtifactIdentifier.class;
		return super.translatePart(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#partsList()
	 * 
	 */
	public String[] partsList() {
		return parts;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionPart
	 *  (java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (artifactIdentifier != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(ScoViewsRepository.class);
				if (provider != null) {
					basePart = (ArtifactIdentifierPropertiesEditionPart)provider.getPropertiesEditionPart(ScoViewsRepository.ArtifactIdentifier.class, kind, this);
					addListener((IPropertiesEditionListener)basePart);
				}
			}
			return (IPropertiesEditionPart)basePart;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 * 
	 */
	public void setPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (key == ScoViewsRepository.ArtifactIdentifier.class)
			this.basePart = (ArtifactIdentifierPropertiesEditionPart) propertiesEditionPart;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Class, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Class key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (basePart != null && key == ScoViewsRepository.ArtifactIdentifier.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			final ArtifactIdentifier artifactIdentifier = (ArtifactIdentifier)elt;
			// init values
			if (artifactIdentifier.getResourceName() != null)
				basePart.setResourceName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), artifactIdentifier.getResourceName()));

			basePart.setBaselinedLineCount(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), artifactIdentifier.getBaselinedLineCount()));

			basePart.setCurrentLineCount(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), artifactIdentifier.getCurrentLineCount()));

			// init filters



		}
		// init values for referenced views

		// init filters for referenced views

		setInitializing(false);
	}






	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionCommand
	 *     (org.eclipse.emf.edit.domain.EditingDomain)
	 * 
	 */
	public CompoundCommand getPropertiesEditionCommand(EditingDomain editingDomain) {
		CompoundCommand cc = new CompoundCommand();
		if ((artifactIdentifier != null) && (basePart != null)) { 
			cc.append(SetCommand.create(editingDomain, artifactIdentifier, ScoPackage.eINSTANCE.getArtifactIdentifier_ResourceName(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getResourceName())));
			cc.append(SetCommand.create(editingDomain, artifactIdentifier, ScoPackage.eINSTANCE.getArtifactIdentifier_BaselinedLineCount(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEInt(), basePart.getBaselinedLineCount())));
			cc.append(SetCommand.create(editingDomain, artifactIdentifier, ScoPackage.eINSTANCE.getArtifactIdentifier_CurrentLineCount(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEInt(), basePart.getCurrentLineCount())));

		}
		if (!cc.isEmpty())
			return cc;
		cc.append(IdentityCommand.INSTANCE);
		return cc;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionObject()
	 * 
	 */
	public EObject getPropertiesEditionObject(EObject source) {
		if (source instanceof ArtifactIdentifier) {
			ArtifactIdentifier artifactIdentifierToUpdate = (ArtifactIdentifier)source;
			artifactIdentifierToUpdate.setResourceName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getResourceName()));

			artifactIdentifierToUpdate.setBaselinedLineCount(EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), basePart.getBaselinedLineCount()));

			artifactIdentifierToUpdate.setCurrentLineCount(EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), basePart.getCurrentLineCount()));


			return artifactIdentifierToUpdate;
		}
		else
			return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		if (!isInitializing()) {
			Diagnostic valueDiagnostic = validateValue(event);
			if (PropertiesEditionEvent.COMMIT == event.getState() && IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode) && valueDiagnostic.getSeverity() == Diagnostic.OK) {
				CompoundCommand command = new CompoundCommand();
			if (ScoViewsRepository.ArtifactIdentifier.resourceName == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, artifactIdentifier, ScoPackage.eINSTANCE.getArtifactIdentifier_ResourceName(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue())));
			}
			if (ScoViewsRepository.ArtifactIdentifier.baselinedLineCount == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, artifactIdentifier, ScoPackage.eINSTANCE.getArtifactIdentifier_BaselinedLineCount(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
			}
			if (ScoViewsRepository.ArtifactIdentifier.currentLineCount == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, artifactIdentifier, ScoPackage.eINSTANCE.getArtifactIdentifier_CurrentLineCount(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
			}

				if (!command.isEmpty() && !command.canExecute()) {
					EEFRuntimePlugin.getDefault().logError("Cannot perform model change command.", null);
				} else {
					liveEditingDomain.getCommandStack().execute(command);
				}
			}
			if (valueDiagnostic.getSeverity() != Diagnostic.OK && valueDiagnostic instanceof BasicDiagnostic)
				super.firePropertiesChanged(new PropertiesValidationEditionEvent(event, valueDiagnostic));
			else {
				Diagnostic validate = validate();
				super.firePropertiesChanged(new PropertiesValidationEditionEvent(event, validate));
			}
			super.firePropertiesChanged(event);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.String, int)
	 * 
	 */
	public boolean isRequired(String key, int kind) {
		return key == ScoViewsRepository.ArtifactIdentifier.resourceName || key == ScoViewsRepository.ArtifactIdentifier.baselinedLineCount || key == ScoViewsRepository.ArtifactIdentifier.currentLineCount;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.String, int)
	 * 
	 */
	public String getHelpContent(String key, int kind) {
		if (key == ScoViewsRepository.ArtifactIdentifier.resourceName)
			return "The name of the case artifact associated with this record"; //$NON-NLS-1$
		if (key == ScoViewsRepository.ArtifactIdentifier.baselinedLineCount)
			return "The number of configured or baselined lines in this artifact"; //$NON-NLS-1$
		if (key == ScoViewsRepository.ArtifactIdentifier.currentLineCount)
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
			String newStringValue = event.getNewValue().toString();
			try {
				if (ScoViewsRepository.ArtifactIdentifier.resourceName == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ScoPackage.eINSTANCE.getArtifactIdentifier_ResourceName().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getArtifactIdentifier_ResourceName().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.ArtifactIdentifier.baselinedLineCount == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ScoPackage.eINSTANCE.getArtifactIdentifier_BaselinedLineCount().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ScoPackage.eINSTANCE.getArtifactIdentifier_BaselinedLineCount().getEAttributeType(), newValue);
				}
				if (ScoViewsRepository.ArtifactIdentifier.currentLineCount == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ScoPackage.eINSTANCE.getArtifactIdentifier_CurrentLineCount().getEAttributeType(), newStringValue);
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

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validate()
	 * 
	 */
	public Diagnostic validate() {
		Diagnostic validate = Diagnostic.OK_INSTANCE;
		if (IPropertiesEditionComponent.BATCH_MODE.equals(editing_mode)) {
			EObject copy = EcoreUtil.copy(artifactIdentifier);
			copy = getPropertiesEditionObject(copy);
			validate =  EEFRuntimePlugin.getEEFValidator().validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = EEFRuntimePlugin.getEEFValidator().validate(artifactIdentifier);
		// Start of user code for custom validation check
		
		// End of user code
		return validate;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#dispose()
	 * 
	 */
	public void dispose() {
		if (semanticAdapter != null)
			artifactIdentifier.eAdapters().remove(semanticAdapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getTabText(java.lang.String)
	 * 
	 */
	public String getTabText(String p_key) {
		return basePart.getTitle();
	}
}
