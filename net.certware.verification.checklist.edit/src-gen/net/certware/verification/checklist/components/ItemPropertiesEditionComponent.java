/**
 * Generated with Acceleo
 */
package net.certware.verification.checklist.components;

// Start of user code for imports
import net.certware.verification.checklist.ChecklistPackage;
import net.certware.verification.checklist.Choices;
import net.certware.verification.checklist.Item;
import net.certware.verification.checklist.parts.ChecklistViewsRepository;
import net.certware.verification.checklist.parts.ItemPropertiesEditionPart;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
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
 * 
 * 
 */
public class ItemPropertiesEditionComponent extends StandardPropertiesEditionComponent {

	
	/**
	 * 
	 */
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	private String[] parts = {BASE_PART};

	/**
	 * The EObject to edit
	 * 
	 */
	private Item item;

	/**
	 * The Base part
	 * 
	 */
	protected ItemPropertiesEditionPart basePart;

	/**
	 * Default constructor
	 * 
	 */
	public ItemPropertiesEditionComponent(EObject item, String editing_mode) {
		if (item instanceof Item) {
			this.item = (Item)item;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.item.eAdapters().add(semanticAdapter);
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
					ItemPropertiesEditionComponent.this.dispose();
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
		if (ChecklistPackage.eINSTANCE.getItem_Identifier().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setIdentifier(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
			} else {
				basePart.setIdentifier("");
			}
		}
		if (ChecklistPackage.eINSTANCE.getItem_Description().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
			} else {
				basePart.setDescription("");
			}
		}
		if (ChecklistPackage.eINSTANCE.getItem_Reference().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setReference(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
			} else {
				basePart.setReference("");
			}
		}
		if (ChecklistPackage.eINSTANCE.getItem_Result().equals(msg.getFeature()) && basePart != null)
			basePart.setResult((Enumerator)msg.getNewValue());

		if (ChecklistPackage.eINSTANCE.getItem_Comment().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setComment(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
			} else {
				basePart.setComment("");
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
			return ChecklistViewsRepository.Item.class;
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
		if (item != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(ChecklistViewsRepository.class);
				if (provider != null) {
					basePart = (ItemPropertiesEditionPart)provider.getPropertiesEditionPart(ChecklistViewsRepository.Item.class, kind, this);
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
		if (key == ChecklistViewsRepository.Item.class)
			this.basePart = (ItemPropertiesEditionPart) propertiesEditionPart;
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
		if (basePart != null && key == ChecklistViewsRepository.Item.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			final Item item = (Item)elt;
			// init values
			if (item.getIdentifier() != null)
				basePart.setIdentifier(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), item.getIdentifier()));

			if (item.getDescription() != null)
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), item.getDescription()));

			if (item.getReference() != null)
				basePart.setReference(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), item.getReference()));

			basePart.initResult((EEnum) ChecklistPackage.eINSTANCE.getItem_Result().getEType(), item.getResult());
			if (item.getComment() != null)
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), item.getComment()));

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
		if ((item != null) && (basePart != null)) { 
			cc.append(SetCommand.create(editingDomain, item, ChecklistPackage.eINSTANCE.getItem_Identifier(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getIdentifier())));
			cc.append(SetCommand.create(editingDomain, item, ChecklistPackage.eINSTANCE.getItem_Description(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getDescription())));
			cc.append(SetCommand.create(editingDomain, item, ChecklistPackage.eINSTANCE.getItem_Reference(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getReference())));
			cc.append(SetCommand.create(editingDomain, item, ChecklistPackage.eINSTANCE.getItem_Result(), basePart.getResult()));

			cc.append(SetCommand.create(editingDomain, item, ChecklistPackage.eINSTANCE.getItem_Comment(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getComment())));

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
		if (source instanceof Item) {
			Item itemToUpdate = (Item)source;
			itemToUpdate.setIdentifier((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getIdentifier()));

			itemToUpdate.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getDescription()));

			itemToUpdate.setReference((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getReference()));

			itemToUpdate.setResult((Choices)basePart.getResult());

			itemToUpdate.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getComment()));


			return itemToUpdate;
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
			if (ChecklistViewsRepository.Item.identifier == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, item, ChecklistPackage.eINSTANCE.getItem_Identifier(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue())));
			}
			if (ChecklistViewsRepository.Item.description == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, item, ChecklistPackage.eINSTANCE.getItem_Description(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue())));
			}
			if (ChecklistViewsRepository.Item.reference == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, item, ChecklistPackage.eINSTANCE.getItem_Reference(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue())));
			}
			if (ChecklistViewsRepository.Item.result == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, item, ChecklistPackage.eINSTANCE.getItem_Result(), event.getNewValue()));

			if (ChecklistViewsRepository.Item.comment == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, item, ChecklistPackage.eINSTANCE.getItem_Comment(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue())));
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
		return key == ChecklistViewsRepository.Item.result;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.String, int)
	 * 
	 */
	public String getHelpContent(String key, int kind) {
		if (key == ChecklistViewsRepository.Item.identifier)
			return "Item unique identifier for traceability"; //$NON-NLS-1$
		if (key == ChecklistViewsRepository.Item.description)
			return "Item description for verification task"; //$NON-NLS-1$
		if (key == ChecklistViewsRepository.Item.reference)
			return "Case location reference for verification"; //$NON-NLS-1$
		if (key == ChecklistViewsRepository.Item.result)
			return "Whether the case fulfills with the verification item"; //$NON-NLS-1$
		if (key == ChecklistViewsRepository.Item.comment)
			return "Comments regarding the verification result"; //$NON-NLS-1$
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
				if (ChecklistViewsRepository.Item.identifier == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ChecklistPackage.eINSTANCE.getItem_Identifier().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ChecklistPackage.eINSTANCE.getItem_Identifier().getEAttributeType(), newValue);
				}
				if (ChecklistViewsRepository.Item.description == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ChecklistPackage.eINSTANCE.getItem_Description().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ChecklistPackage.eINSTANCE.getItem_Description().getEAttributeType(), newValue);
				}
				if (ChecklistViewsRepository.Item.reference == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ChecklistPackage.eINSTANCE.getItem_Reference().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ChecklistPackage.eINSTANCE.getItem_Reference().getEAttributeType(), newValue);
				}
				if (ChecklistViewsRepository.Item.result == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ChecklistPackage.eINSTANCE.getItem_Result().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ChecklistPackage.eINSTANCE.getItem_Result().getEAttributeType(), newValue);
				}
				if (ChecklistViewsRepository.Item.comment == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ChecklistPackage.eINSTANCE.getItem_Comment().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ChecklistPackage.eINSTANCE.getItem_Comment().getEAttributeType(), newValue);
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
			EObject copy = EcoreUtil.copy(item);
			copy = getPropertiesEditionObject(copy);
			validate =  EEFRuntimePlugin.getEEFValidator().validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = EEFRuntimePlugin.getEEFValidator().validate(item);
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
			item.eAdapters().remove(semanticAdapter);
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
