
package net.certware.argument.aml.components;

// Start of user code for imports
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Question;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.QuestionPropertiesEditionPart;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
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
public class QuestionPropertiesEditionComponent extends StandardPropertiesEditionComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	private String[] parts = {BASE_PART};

	/**
	 * The EObject to edit
	 * 
	 */
	private Question question;

	/**
	 * The Base part
	 * 
	 */
	protected QuestionPropertiesEditionPart basePart;

	/**
	 * Default constructor
	 * 
	 */
	public QuestionPropertiesEditionComponent(EObject question, String editing_mode) {
		if (question instanceof Question) {
			this.question = (Question)question;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.question.eAdapters().add(semanticAdapter);
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
					QuestionPropertiesEditionComponent.this.dispose();
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
		if (AmlPackage.eINSTANCE.getQuestion_Group().equals(msg.getFeature()) && basePart != null) {
			if (msg.getEventType() == Notification.ADD) 
				basePart.addToGroup((org.eclipse.emf.ecore.util.FeatureMap.Entry) msg.getNewValue());
			else if (msg.getEventType() == Notification.REMOVE) 
				basePart.removeToGroup((org.eclipse.emf.ecore.util.FeatureMap.Entry) msg.getNewValue());
		}

		if (AmlPackage.eINSTANCE.getQuestion_Amplification().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setAmplification(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setAmplification("");
			}
		}
		if (AmlPackage.eINSTANCE.getQuestion_Description().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setDescription(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setDescription("");
			}
		}
		if (AmlPackage.eINSTANCE.getQuestion_Id().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setId(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setId("");
			}
		}
		if (AmlPackage.eINSTANCE.getQuestion_Label().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setLabel(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setLabel("");
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
			return AmlViewsRepository.Question.class;
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
		if (question != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(AmlViewsRepository.class);
				if (provider != null) {
					basePart = (QuestionPropertiesEditionPart)provider.getPropertiesEditionPart(AmlViewsRepository.Question.class, kind, this);
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
		if (key == AmlViewsRepository.Question.class)
			this.basePart = (QuestionPropertiesEditionPart) propertiesEditionPart;
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
		if (basePart != null && key == AmlViewsRepository.Question.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			final Question question = (Question)elt;
			// init values
			if (question.getGroup() != null)
				basePart.setGroup(new BasicEList(question.getGroup()));

			if (question.getAmplification() != null)
				basePart.setAmplification(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), question.getAmplification()));

			if (question.getDescription() != null)
				basePart.setDescription(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), question.getDescription()));
			if (question.getId() != null)
				basePart.setId(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), question.getId()));

			if (question.getLabel() != null)
				basePart.setLabel(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), question.getLabel()));

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
		if ((question != null) && (basePart != null)) { 
//FIXME invalid case in commandUpdater(), Case : model = Attribute(*) : group - view = MultiValuedEditor

			cc.append(SetCommand.create(editingDomain, question, AmlPackage.eINSTANCE.getQuestion_Amplification(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getAmplification())));
			cc.append(SetCommand.create(editingDomain, question, AmlPackage.eINSTANCE.getQuestion_Description(), EcoreUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getDescription())));
			cc.append(SetCommand.create(editingDomain, question, AmlPackage.eINSTANCE.getQuestion_Id(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getId())));
			cc.append(SetCommand.create(editingDomain, question, AmlPackage.eINSTANCE.getQuestion_Label(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getLabel())));

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
		if (source instanceof Question) {
			Question questionToUpdate = (Question)source;
//FIXME invalid case in partUpdater(), Case : model = Attribute(*) : group - view = MultiValuedEditor

			questionToUpdate.setAmplification((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getAmplification()));

			questionToUpdate.setDescription((java.lang.String)EcoreUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getDescription()));
			questionToUpdate.setId((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getId()));

			questionToUpdate.setLabel((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getLabel()));


			return questionToUpdate;
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
//FIXME invalid case in liveCommandUpdater(), Case : model = Attribute(*) : group - view = MultiValuedEditor

			if (AmlViewsRepository.Question.amplification == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, question, AmlPackage.eINSTANCE.getQuestion_Amplification(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (AmlViewsRepository.Question.description == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, question, AmlPackage.eINSTANCE.getQuestion_Description(), EcoreUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (AmlViewsRepository.Question.id == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, question, AmlPackage.eINSTANCE.getQuestion_Id(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (AmlViewsRepository.Question.label == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, question, AmlPackage.eINSTANCE.getQuestion_Label(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
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
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			String newStringValue = event.getNewValue().toString();
			try {
				if (AmlViewsRepository.Question.group == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getQuestion_Group().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getQuestion_Group().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Question.amplification == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getQuestion_Amplification().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getQuestion_Amplification().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Question.description == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getQuestion_Description().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getQuestion_Description().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Question.id == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getQuestion_Id().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getQuestion_Id().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Question.label == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getQuestion_Label().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getQuestion_Label().getEAttributeType(), newValue);
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
			EObject copy = EcoreUtil.copy(question);
			copy = getPropertiesEditionObject(copy);
			validate =  EEFRuntimePlugin.getEEFValidator().validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = EEFRuntimePlugin.getEEFValidator().validate(question);
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
			question.eAdapters().remove(semanticAdapter);
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
