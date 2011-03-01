
package net.certware.argument.aml.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Creator;
import net.certware.argument.aml.Memo;
import net.certware.argument.aml.Reader;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.MemoPropertiesEditionPart;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
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
public class MemoPropertiesEditionComponent extends StandardPropertiesEditionComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	private String[] parts = {BASE_PART};

	/**
	 * The EObject to edit
	 * 
	 */
	private Memo memo;

	/**
	 * The Base part
	 * 
	 */
	protected MemoPropertiesEditionPart basePart;

	/**
	 * Default constructor
	 * 
	 */
	public MemoPropertiesEditionComponent(EObject memo, String editing_mode) {
		if (memo instanceof Memo) {
			this.memo = (Memo)memo;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.memo.eAdapters().add(semanticAdapter);
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
					MemoPropertiesEditionComponent.this.dispose();
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
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == AmlPackage.eINSTANCE.getMemo_Creator())) {
			basePart.updateCreator(memo);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == AmlPackage.eINSTANCE.getMemo_Reader())) {
			basePart.updateReader(memo);
		}
		if (AmlPackage.eINSTANCE.getMemo_Subject().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setSubject(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setSubject("");
			}
		}
		if (AmlPackage.eINSTANCE.getMemo_Body().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setBody(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setBody("");
			}
		}
		if (AmlPackage.eINSTANCE.getMemo_Id().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setId(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setId("");
			}
		}
		if (AmlPackage.eINSTANCE.getMemo_Type().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setType(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setType("");
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
			return AmlViewsRepository.Memo.class;
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
		if (memo != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(AmlViewsRepository.class);
				if (provider != null) {
					basePart = (MemoPropertiesEditionPart)provider.getPropertiesEditionPart(AmlViewsRepository.Memo.class, kind, this);
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
		if (key == AmlViewsRepository.Memo.class)
			this.basePart = (MemoPropertiesEditionPart) propertiesEditionPart;
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
		if (basePart != null && key == AmlViewsRepository.Memo.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			final Memo memo = (Memo)elt;
			// init values
			basePart.initCreator(memo, null, AmlPackage.eINSTANCE.getMemo_Creator());
			basePart.initReader(memo, null, AmlPackage.eINSTANCE.getMemo_Reader());
			if (memo.getSubject() != null)
				basePart.setSubject(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), memo.getSubject()));
			if (memo.getBody() != null)
				basePart.setBody(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), memo.getBody()));
			if (memo.getId() != null)
				basePart.setId(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), memo.getId()));

			if (memo.getType() != null)
				basePart.setType(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), memo.getType()));

			// init filters
			basePart.addFilterToCreator(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Creator);
				}

			});
			// Start of user code for additional businessfilters for creator
			
			// End of user code

			basePart.addFilterToReader(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Reader); //$NON-NLS-1$ 
				}

			});
			// Start of user code for additional businessfilters for reader
			
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
		if ((memo != null) && (basePart != null)) { 
			List creatorToAddFromCreator = basePart.getCreatorToAdd();
			for (Iterator iter = creatorToAddFromCreator.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, memo, AmlPackage.eINSTANCE.getMemo_Creator(), iter.next()));
			Map creatorToRefreshFromCreator = basePart.getCreatorToEdit();
			for (Iterator iter = creatorToRefreshFromCreator.keySet().iterator(); iter.hasNext();) {
				Creator nextElement = (Creator) iter.next();
				Creator creator = (Creator) creatorToRefreshFromCreator.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, creator.eGet(feature)));
					}
				}
			}
			List creatorToRemoveFromCreator = basePart.getCreatorToRemove();
			for (Iterator iter = creatorToRemoveFromCreator.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List creatorToMoveFromCreator = basePart.getCreatorToMove();
			for (Iterator iter = creatorToMoveFromCreator.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, memo, AmlPackage.eINSTANCE.getCreator(), moveElement.getElement(), moveElement.getIndex()));
			}
			List readerToAddFromReader = basePart.getReaderToAdd();
			for (Iterator iter = readerToAddFromReader.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, memo, AmlPackage.eINSTANCE.getMemo_Reader(), iter.next()));
			Map readerToRefreshFromReader = basePart.getReaderToEdit();
			for (Iterator iter = readerToRefreshFromReader.keySet().iterator(); iter.hasNext();) {
				Reader nextElement = (Reader) iter.next();
				Reader reader = (Reader) readerToRefreshFromReader.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, reader.eGet(feature)));
					}
				}
			}
			List readerToRemoveFromReader = basePart.getReaderToRemove();
			for (Iterator iter = readerToRemoveFromReader.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List readerToMoveFromReader = basePart.getReaderToMove();
			for (Iterator iter = readerToMoveFromReader.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, memo, AmlPackage.eINSTANCE.getReader(), moveElement.getElement(), moveElement.getIndex()));
			}
			cc.append(SetCommand.create(editingDomain, memo, AmlPackage.eINSTANCE.getMemo_Subject(), EcoreUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getSubject())));
			cc.append(SetCommand.create(editingDomain, memo, AmlPackage.eINSTANCE.getMemo_Body(), EcoreUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getBody())));
			cc.append(SetCommand.create(editingDomain, memo, AmlPackage.eINSTANCE.getMemo_Id(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getId())));
			cc.append(SetCommand.create(editingDomain, memo, AmlPackage.eINSTANCE.getMemo_Type(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getType())));

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
		if (source instanceof Memo) {
			Memo memoToUpdate = (Memo)source;
			memoToUpdate.getCreator().addAll(basePart.getCreatorToAdd());
			memoToUpdate.getReader().addAll(basePart.getReaderToAdd());
			memoToUpdate.setSubject((java.lang.String)EcoreUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getSubject()));
			memoToUpdate.setBody((java.lang.String)EcoreUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getBody()));
			memoToUpdate.setId((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getId()));

			memoToUpdate.setType((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), basePart.getType()));


			return memoToUpdate;
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
			if (AmlViewsRepository.Memo.creator == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Creator oldValue = (Creator)event.getOldValue();
					Creator newValue = (Creator)event.getNewValue();
					// TODO: Complete the memo update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, memo, AmlPackage.eINSTANCE.getMemo_Creator(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, memo, AmlPackage.eINSTANCE.getCreator(), event.getNewValue(), event.getNewIndex()));
			}
			if (AmlViewsRepository.Memo.reader == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Reader oldValue = (Reader)event.getOldValue();
					Reader newValue = (Reader)event.getNewValue();
					// TODO: Complete the memo update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, memo, AmlPackage.eINSTANCE.getMemo_Reader(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, memo, AmlPackage.eINSTANCE.getReader(), event.getNewValue(), event.getNewIndex()));
			}
			if (AmlViewsRepository.Memo.subject == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, memo, AmlPackage.eINSTANCE.getMemo_Subject(), EcoreUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (AmlViewsRepository.Memo.body == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, memo, AmlPackage.eINSTANCE.getMemo_Body(), EcoreUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (AmlViewsRepository.Memo.id == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, memo, AmlPackage.eINSTANCE.getMemo_Id(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (AmlViewsRepository.Memo.type == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, memo, AmlPackage.eINSTANCE.getMemo_Type(), EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue())));
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
		return key == AmlViewsRepository.Memo.creator || key == AmlViewsRepository.Memo.subject;
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
				if (AmlViewsRepository.Memo.subject == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getMemo_Subject().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getMemo_Subject().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Memo.body == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getMemo_Body().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getMemo_Body().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Memo.id == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getMemo_Id().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getMemo_Id().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Memo.type == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getMemo_Type().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getMemo_Type().getEAttributeType(), newValue);
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
			EObject copy = EcoreUtil.copy(memo);
			copy = getPropertiesEditionObject(copy);
			validate =  EEFRuntimePlugin.getEEFValidator().validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = EEFRuntimePlugin.getEEFValidator().validate(memo);
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
			memo.eAdapters().remove(semanticAdapter);
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
