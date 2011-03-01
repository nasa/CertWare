
package net.certware.argument.aml.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.DocumentRoot;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
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
public class DocumentRootPropertiesEditionComponent extends StandardPropertiesEditionComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	private String[] parts = {BASE_PART};

	/**
	 * The EObject to edit
	 * 
	 */
	private DocumentRoot documentRoot;

	/**
	 * The Base part
	 * 
	 */
	protected DocumentRootPropertiesEditionPart basePart;

	/**
	 * Default constructor
	 * 
	 */
	public DocumentRootPropertiesEditionComponent(EObject documentRoot, String editing_mode) {
		if (documentRoot instanceof DocumentRoot) {
			this.documentRoot = (DocumentRoot)documentRoot;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.documentRoot.eAdapters().add(semanticAdapter);
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
					DocumentRootPropertiesEditionComponent.this.dispose();
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
		if (AmlPackage.eINSTANCE.getDocumentRoot_Mixed().equals(msg.getFeature()) && basePart != null) {
			if (msg.getEventType() == Notification.ADD) 
				basePart.addToMixed((org.eclipse.emf.ecore.util.FeatureMap.Entry) msg.getNewValue());
			else if (msg.getEventType() == Notification.REMOVE) 
				basePart.removeToMixed((org.eclipse.emf.ecore.util.FeatureMap.Entry) msg.getNewValue());
		}

		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == AmlPackage.eINSTANCE.getDocumentRoot_XMLNSPrefixMap())) {
			basePart.updateXMLNSPrefixMap(documentRoot);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == AmlPackage.eINSTANCE.getDocumentRoot_XSISchemaLocation())) {
			basePart.updateXSISchemaLocation(documentRoot);
		}
		if (AmlPackage.eINSTANCE.getDocumentRoot_Description1().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setDescription1(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setDescription1("");
			}
		}
		if (AmlPackage.eINSTANCE.getDocumentRoot_Id().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setId(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setId("");
			}
		}
		if (AmlPackage.eINSTANCE.getDocumentRoot_IdRef().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setIdRef(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setIdRef("");
			}
		}
		if (AmlPackage.eINSTANCE.getDocumentRoot_Label1().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setLabel1(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setLabel1("");
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
			return AmlViewsRepository.DocumentRoot.class;
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
		if (documentRoot != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(AmlViewsRepository.class);
				if (provider != null) {
					basePart = (DocumentRootPropertiesEditionPart)provider.getPropertiesEditionPart(AmlViewsRepository.DocumentRoot.class, kind, this);
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
		if (key == AmlViewsRepository.DocumentRoot.class)
			this.basePart = (DocumentRootPropertiesEditionPart) propertiesEditionPart;
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
		if (basePart != null && key == AmlViewsRepository.DocumentRoot.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			final DocumentRoot documentRoot = (DocumentRoot)elt;
			// init values
			if (documentRoot.getMixed() != null)
				basePart.setMixed(new BasicEList(documentRoot.getMixed()));

			basePart.initXMLNSPrefixMap(documentRoot, null, AmlPackage.eINSTANCE.getDocumentRoot_XMLNSPrefixMap());
			basePart.initXSISchemaLocation(documentRoot, null, AmlPackage.eINSTANCE.getDocumentRoot_XSISchemaLocation());
			if (documentRoot.getDescription1() != null)
				basePart.setDescription1(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), documentRoot.getDescription1()));

			if (documentRoot.getId() != null)
				basePart.setId(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), documentRoot.getId()));

			if (documentRoot.getIdRef() != null)
				basePart.setIdRef(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), documentRoot.getIdRef()));

			if (documentRoot.getLabel1() != null)
				basePart.setLabel1(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), documentRoot.getLabel1()));

			// init filters

			basePart.addFilterToXMLNSPrefixMap(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EStringToStringMapEntryImpl); //$NON-NLS-1$ 
				}

			});
			// Start of user code for additional businessfilters for xMLNSPrefixMap
			
			// End of user code

			basePart.addFilterToXSISchemaLocation(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EStringToStringMapEntryImpl); //$NON-NLS-1$ 
				}

			});
			// Start of user code for additional businessfilters for xSISchemaLocation
			
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
		if ((documentRoot != null) && (basePart != null)) { 
//FIXME invalid case in commandUpdater(), Case : model = Attribute(*) : mixed - view = MultiValuedEditor

			List xMLNSPrefixMapToAddFromXMLNSPrefixMap = basePart.getXMLNSPrefixMapToAdd();
			for (Iterator iter = xMLNSPrefixMapToAddFromXMLNSPrefixMap.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, documentRoot, AmlPackage.eINSTANCE.getDocumentRoot_XMLNSPrefixMap(), iter.next()));
			Map xMLNSPrefixMapToRefreshFromXMLNSPrefixMap = basePart.getXMLNSPrefixMapToEdit();
			for (Iterator iter = xMLNSPrefixMapToRefreshFromXMLNSPrefixMap.keySet().iterator(); iter.hasNext();) {
				EStringToStringMapEntryImpl nextElement = (EStringToStringMapEntryImpl) iter.next();
				EStringToStringMapEntryImpl xMLNSPrefixMap = (EStringToStringMapEntryImpl) xMLNSPrefixMapToRefreshFromXMLNSPrefixMap.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, xMLNSPrefixMap.eGet(feature)));
					}
				}
			}
			List xMLNSPrefixMapToRemoveFromXMLNSPrefixMap = basePart.getXMLNSPrefixMapToRemove();
			for (Iterator iter = xMLNSPrefixMapToRemoveFromXMLNSPrefixMap.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List xMLNSPrefixMapToMoveFromXMLNSPrefixMap = basePart.getXMLNSPrefixMapToMove();
			for (Iterator iter = xMLNSPrefixMapToMoveFromXMLNSPrefixMap.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, documentRoot, EcorePackage.eINSTANCE.getEStringToStringMapEntry(), moveElement.getElement(), moveElement.getIndex()));
			}
			List xSISchemaLocationToAddFromXSISchemaLocation = basePart.getXSISchemaLocationToAdd();
			for (Iterator iter = xSISchemaLocationToAddFromXSISchemaLocation.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, documentRoot, AmlPackage.eINSTANCE.getDocumentRoot_XSISchemaLocation(), iter.next()));
			Map xSISchemaLocationToRefreshFromXSISchemaLocation = basePart.getXSISchemaLocationToEdit();
			for (Iterator iter = xSISchemaLocationToRefreshFromXSISchemaLocation.keySet().iterator(); iter.hasNext();) {
				EStringToStringMapEntryImpl nextElement = (EStringToStringMapEntryImpl) iter.next();
				EStringToStringMapEntryImpl xSISchemaLocation = (EStringToStringMapEntryImpl) xSISchemaLocationToRefreshFromXSISchemaLocation.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, xSISchemaLocation.eGet(feature)));
					}
				}
			}
			List xSISchemaLocationToRemoveFromXSISchemaLocation = basePart.getXSISchemaLocationToRemove();
			for (Iterator iter = xSISchemaLocationToRemoveFromXSISchemaLocation.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List xSISchemaLocationToMoveFromXSISchemaLocation = basePart.getXSISchemaLocationToMove();
			for (Iterator iter = xSISchemaLocationToMoveFromXSISchemaLocation.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, documentRoot, EcorePackage.eINSTANCE.getEStringToStringMapEntry(), moveElement.getElement(), moveElement.getIndex()));
			}
			cc.append(SetCommand.create(editingDomain, documentRoot, AmlPackage.eINSTANCE.getDocumentRoot_Description1(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getDescription1())));
			cc.append(SetCommand.create(editingDomain, documentRoot, AmlPackage.eINSTANCE.getDocumentRoot_Id(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getId())));
			cc.append(SetCommand.create(editingDomain, documentRoot, AmlPackage.eINSTANCE.getDocumentRoot_IdRef(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getIdRef())));
			cc.append(SetCommand.create(editingDomain, documentRoot, AmlPackage.eINSTANCE.getDocumentRoot_Label1(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getLabel1())));

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
		if (source instanceof DocumentRoot) {
			DocumentRoot documentRootToUpdate = (DocumentRoot)source;
//FIXME invalid case in partUpdater(), Case : model = Attribute(*) : mixed - view = MultiValuedEditor

			documentRootToUpdate.getXMLNSPrefixMap().addAll(basePart.getXMLNSPrefixMapToAdd());
			documentRootToUpdate.getXSISchemaLocation().addAll(basePart.getXSISchemaLocationToAdd());
			documentRootToUpdate.setDescription1((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getDescription1()));

			documentRootToUpdate.setId((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getId()));

			documentRootToUpdate.setIdRef((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getIdRef()));

			documentRootToUpdate.setLabel1((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getLabel1()));


			return documentRootToUpdate;
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
//FIXME invalid case in liveCommandUpdater(), Case : model = Attribute(*) : mixed - view = MultiValuedEditor

			if (AmlViewsRepository.DocumentRoot.xMLNSPrefixMap == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					EStringToStringMapEntryImpl oldValue = (EStringToStringMapEntryImpl)event.getOldValue();
					EStringToStringMapEntryImpl newValue = (EStringToStringMapEntryImpl)event.getNewValue();
					// TODO: Complete the documentRoot update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, documentRoot, AmlPackage.eINSTANCE.getDocumentRoot_XMLNSPrefixMap(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, documentRoot, EcorePackage.eINSTANCE.getEStringToStringMapEntry(), event.getNewValue(), event.getNewIndex()));
			}
			if (AmlViewsRepository.DocumentRoot.xSISchemaLocation == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					EStringToStringMapEntryImpl oldValue = (EStringToStringMapEntryImpl)event.getOldValue();
					EStringToStringMapEntryImpl newValue = (EStringToStringMapEntryImpl)event.getNewValue();
					// TODO: Complete the documentRoot update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, documentRoot, AmlPackage.eINSTANCE.getDocumentRoot_XSISchemaLocation(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, documentRoot, EcorePackage.eINSTANCE.getEStringToStringMapEntry(), event.getNewValue(), event.getNewIndex()));
			}
			if (AmlViewsRepository.DocumentRoot.description1 == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, documentRoot, AmlPackage.eINSTANCE.getDocumentRoot_Description1(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (AmlViewsRepository.DocumentRoot.id == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, documentRoot, AmlPackage.eINSTANCE.getDocumentRoot_Id(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (AmlViewsRepository.DocumentRoot.idRef == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, documentRoot, AmlPackage.eINSTANCE.getDocumentRoot_IdRef(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (AmlViewsRepository.DocumentRoot.label1 == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, documentRoot, AmlPackage.eINSTANCE.getDocumentRoot_Label1(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
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
				if (AmlViewsRepository.DocumentRoot.mixed == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDocumentRoot_Mixed().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDocumentRoot_Mixed().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DocumentRoot.description1 == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDocumentRoot_Description1().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDocumentRoot_Description1().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DocumentRoot.id == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDocumentRoot_Id().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDocumentRoot_Id().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DocumentRoot.idRef == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDocumentRoot_IdRef().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDocumentRoot_IdRef().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DocumentRoot.label1 == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDocumentRoot_Label1().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDocumentRoot_Label1().getEAttributeType(), newValue);
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
			EObject copy = EcoreUtil.copy(documentRoot);
			copy = getPropertiesEditionObject(copy);
			validate =  EEFRuntimePlugin.getEEFValidator().validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = EEFRuntimePlugin.getEEFValidator().validate(documentRoot);
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
			documentRoot.eAdapters().remove(semanticAdapter);
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
