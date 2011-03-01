
package net.certware.argument.aml.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Annotation;
import net.certware.argument.aml.DiscoveryMethod;
import net.certware.argument.aml.Type;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.DiscoveryMethodPropertiesEditionPart;

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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.MoveCommand;
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
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
	

// End of user code

/**
 * @author mrb
 * 
 */
public class DiscoveryMethodPropertiesEditionComponent extends StandardPropertiesEditionComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	private String[] parts = {BASE_PART};

	/**
	 * The EObject to edit
	 * 
	 */
	private DiscoveryMethod discoveryMethod;

	/**
	 * The Base part
	 * 
	 */
	protected DiscoveryMethodPropertiesEditionPart basePart;

	/**
	 * Default constructor
	 * 
	 */
	public DiscoveryMethodPropertiesEditionComponent(EObject discoveryMethod, String editing_mode) {
		if (discoveryMethod instanceof DiscoveryMethod) {
			this.discoveryMethod = (DiscoveryMethod)discoveryMethod;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.discoveryMethod.eAdapters().add(semanticAdapter);
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
					DiscoveryMethodPropertiesEditionComponent.this.dispose();
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
		if (AmlPackage.eINSTANCE.getDiscoveryMethod_Url().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setUrl(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setUrl("");
			}
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == AmlPackage.eINSTANCE.getDiscoveryMethod_Annotation())) {
			basePart.updateAnnotation(discoveryMethod);
		}
		if (AmlPackage.eINSTANCE.getDiscoveryMethod_AutoTrigger().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setAutoTrigger(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setAutoTrigger("");
			}
		}
		if (AmlPackage.eINSTANCE.getDiscoveryMethod_Description().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setDescription(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setDescription("");
			}
		}
		if (AmlPackage.eINSTANCE.getDiscoveryMethod_Id().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setId(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setId("");
			}
		}
		if (AmlPackage.eINSTANCE.getDiscoveryMethod_ImportType().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setImportType(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setImportType("");
			}
		}
		if (AmlPackage.eINSTANCE.getDiscoveryMethod_Label().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setLabel(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setLabel("");
			}
		}
		if (AmlPackage.eINSTANCE.getDiscoveryMethod_Type().equals(msg.getFeature()) && basePart != null)
			basePart.setType((Enumerator)msg.getNewValue());


	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#translatePart(java.lang.String)
	 * 
	 */
	public java.lang.Class translatePart(String key) {
		if (BASE_PART.equals(key))
			return AmlViewsRepository.DiscoveryMethod.class;
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
		if (discoveryMethod != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(AmlViewsRepository.class);
				if (provider != null) {
					basePart = (DiscoveryMethodPropertiesEditionPart)provider.getPropertiesEditionPart(AmlViewsRepository.DiscoveryMethod.class, kind, this);
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
		if (key == AmlViewsRepository.DiscoveryMethod.class)
			this.basePart = (DiscoveryMethodPropertiesEditionPart) propertiesEditionPart;
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
		if (basePart != null && key == AmlViewsRepository.DiscoveryMethod.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			final DiscoveryMethod discoveryMethod = (DiscoveryMethod)elt;
			// init values
			if (discoveryMethod.getUrl() != null)
				basePart.setUrl(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), discoveryMethod.getUrl()));

			basePart.initAnnotation(discoveryMethod, null, AmlPackage.eINSTANCE.getDiscoveryMethod_Annotation());
			if (discoveryMethod.getAutoTrigger() != null)
				basePart.setAutoTrigger(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), discoveryMethod.getAutoTrigger()));

			if (discoveryMethod.getDescription() != null)
				basePart.setDescription(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), discoveryMethod.getDescription()));
			if (discoveryMethod.getId() != null)
				basePart.setId(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), discoveryMethod.getId()));

			if (discoveryMethod.getImportType() != null)
				basePart.setImportType(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), discoveryMethod.getImportType()));

			if (discoveryMethod.getLabel() != null)
				basePart.setLabel(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), discoveryMethod.getLabel()));

			basePart.initType((EEnum) AmlPackage.eINSTANCE.getDiscoveryMethod_Type().getEType(), discoveryMethod.getType());
			// init filters

			basePart.addFilterToAnnotation(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Annotation); //$NON-NLS-1$ 
				}

			});
			// Start of user code for additional businessfilters for annotation
			
			// End of user code







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
		if ((discoveryMethod != null) && (basePart != null)) { 
			cc.append(SetCommand.create(editingDomain, discoveryMethod, AmlPackage.eINSTANCE.getDiscoveryMethod_Url(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getUrl())));
			List annotationToAddFromAnnotation = basePart.getAnnotationToAdd();
			for (Iterator iter = annotationToAddFromAnnotation.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, discoveryMethod, AmlPackage.eINSTANCE.getDiscoveryMethod_Annotation(), iter.next()));
			Map annotationToRefreshFromAnnotation = basePart.getAnnotationToEdit();
			for (Iterator iter = annotationToRefreshFromAnnotation.keySet().iterator(); iter.hasNext();) {
				Annotation nextElement = (Annotation) iter.next();
				Annotation annotation = (Annotation) annotationToRefreshFromAnnotation.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, annotation.eGet(feature)));
					}
				}
			}
			List annotationToRemoveFromAnnotation = basePart.getAnnotationToRemove();
			for (Iterator iter = annotationToRemoveFromAnnotation.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List annotationToMoveFromAnnotation = basePart.getAnnotationToMove();
			for (Iterator iter = annotationToMoveFromAnnotation.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, discoveryMethod, AmlPackage.eINSTANCE.getAnnotation(), moveElement.getElement(), moveElement.getIndex()));
			}
			cc.append(SetCommand.create(editingDomain, discoveryMethod, AmlPackage.eINSTANCE.getDiscoveryMethod_AutoTrigger(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getAutoTrigger())));
			cc.append(SetCommand.create(editingDomain, discoveryMethod, AmlPackage.eINSTANCE.getDiscoveryMethod_Description(), EcoreUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getDescription())));
			cc.append(SetCommand.create(editingDomain, discoveryMethod, AmlPackage.eINSTANCE.getDiscoveryMethod_Id(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getId())));
			cc.append(SetCommand.create(editingDomain, discoveryMethod, AmlPackage.eINSTANCE.getDiscoveryMethod_ImportType(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getImportType())));
			cc.append(SetCommand.create(editingDomain, discoveryMethod, AmlPackage.eINSTANCE.getDiscoveryMethod_Label(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getLabel())));
			cc.append(SetCommand.create(editingDomain, discoveryMethod, AmlPackage.eINSTANCE.getDiscoveryMethod_Type(), basePart.getType()));


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
		if (source instanceof DiscoveryMethod) {
			DiscoveryMethod discoveryMethodToUpdate = (DiscoveryMethod)source;
			discoveryMethodToUpdate.setUrl((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getUrl()));

			discoveryMethodToUpdate.getAnnotation().addAll(basePart.getAnnotationToAdd());
			discoveryMethodToUpdate.setAutoTrigger((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getAutoTrigger()));

			discoveryMethodToUpdate.setDescription((java.lang.String)EcoreUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getDescription()));
			discoveryMethodToUpdate.setId((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getId()));

			discoveryMethodToUpdate.setImportType((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getImportType()));

			discoveryMethodToUpdate.setLabel((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getLabel()));

			discoveryMethodToUpdate.setType((Type)basePart.getType());


			return discoveryMethodToUpdate;
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
			if (AmlViewsRepository.DiscoveryMethod.url == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, discoveryMethod, AmlPackage.eINSTANCE.getDiscoveryMethod_Url(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (AmlViewsRepository.DiscoveryMethod.annotation == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Annotation oldValue = (Annotation)event.getOldValue();
					Annotation newValue = (Annotation)event.getNewValue();
					// TODO: Complete the discoveryMethod update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, discoveryMethod, AmlPackage.eINSTANCE.getDiscoveryMethod_Annotation(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, discoveryMethod, AmlPackage.eINSTANCE.getAnnotation(), event.getNewValue(), event.getNewIndex()));
			}
			if (AmlViewsRepository.DiscoveryMethod.autoTrigger == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, discoveryMethod, AmlPackage.eINSTANCE.getDiscoveryMethod_AutoTrigger(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (AmlViewsRepository.DiscoveryMethod.description == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, discoveryMethod, AmlPackage.eINSTANCE.getDiscoveryMethod_Description(), EcoreUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (AmlViewsRepository.DiscoveryMethod.id == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, discoveryMethod, AmlPackage.eINSTANCE.getDiscoveryMethod_Id(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (AmlViewsRepository.DiscoveryMethod.importType == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, discoveryMethod, AmlPackage.eINSTANCE.getDiscoveryMethod_ImportType(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (AmlViewsRepository.DiscoveryMethod.label == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, discoveryMethod, AmlPackage.eINSTANCE.getDiscoveryMethod_Label(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (AmlViewsRepository.DiscoveryMethod.type == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, discoveryMethod, AmlPackage.eINSTANCE.getDiscoveryMethod_Type(), event.getNewValue()));


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
				if (AmlViewsRepository.DiscoveryMethod.url == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDiscoveryMethod_Url().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDiscoveryMethod_Url().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DiscoveryMethod.autoTrigger == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDiscoveryMethod_AutoTrigger().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDiscoveryMethod_AutoTrigger().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DiscoveryMethod.description == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDiscoveryMethod_Description().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDiscoveryMethod_Description().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DiscoveryMethod.id == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDiscoveryMethod_Id().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDiscoveryMethod_Id().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DiscoveryMethod.importType == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDiscoveryMethod_ImportType().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDiscoveryMethod_ImportType().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DiscoveryMethod.label == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDiscoveryMethod_Label().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDiscoveryMethod_Label().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DiscoveryMethod.type == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDiscoveryMethod_Type().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDiscoveryMethod_Type().getEAttributeType(), newValue);
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
			EObject copy = EcoreUtil.copy(discoveryMethod);
			copy = getPropertiesEditionObject(copy);
			validate =  EEFRuntimePlugin.getEEFValidator().validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = EEFRuntimePlugin.getEEFValidator().validate(discoveryMethod);
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
			discoveryMethod.eAdapters().remove(semanticAdapter);
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
