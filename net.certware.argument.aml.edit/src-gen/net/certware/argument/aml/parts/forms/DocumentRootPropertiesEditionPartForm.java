
package net.certware.argument.aml.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart;
import net.certware.argument.aml.providers.AmlMessages;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesContextService;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * @author mrb
 * 
 */
public class DocumentRootPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, DocumentRootPropertiesEditionPart {

	protected Text mixed;
		protected Button editMixed;
		private EList mixedList;
	protected EMFListEditUtil xMLNSPrefixMapEditUtil;
		protected ReferencesTable<? extends EObject> xMLNSPrefixMap;
		protected List<ViewerFilter> xMLNSPrefixMapBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> xMLNSPrefixMapFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil xSISchemaLocationEditUtil;
		protected ReferencesTable<? extends EObject> xSISchemaLocation;
		protected List<ViewerFilter> xSISchemaLocationBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> xSISchemaLocationFilters = new ArrayList<ViewerFilter>();
	protected Text description1;
	protected Text id;
	protected Text idRef;
	protected Text label1;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DocumentRootPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		createPropertiesGroup(widgetFactory, view);

		// Start of user code for additional ui definition
		
		// End of user code
	}
	/**
	 * 
	 */
	protected void createPropertiesGroup(FormToolkit widgetFactory, final Composite view) {
		Section propertiesSection = widgetFactory.createSection(view, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(AmlMessages.DocumentRootPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createMixedMultiValuedEditor(widgetFactory, propertiesGroup);
		createXMLNSPrefixMapTableComposition(widgetFactory, propertiesGroup);
		createXSISchemaLocationTableComposition(widgetFactory, propertiesGroup);
		createDescription1Text(widgetFactory, propertiesGroup);
		createIdText(widgetFactory, propertiesGroup);
		createIdRefText(widgetFactory, propertiesGroup);
		createLabel1Text(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	/**
	 * 
	 */
	protected void createMixedMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		mixed = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData mixedData = new GridData(GridData.FILL_HORIZONTAL);
		mixedData.horizontalSpan = 2;
		mixed.setLayoutData(mixedData);
		EditingUtils.setID(mixed, AmlViewsRepository.DocumentRoot.mixed);
		EditingUtils.setEEFtype(mixed, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editMixed = widgetFactory.createButton(parent, AmlMessages.DocumentRootPropertiesEditionPart_MixedLabel, SWT.NONE);
		GridData editMixedData = new GridData();
		editMixed.setLayoutData(editMixedData);
		editMixed.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EObject documentRoot = PropertiesContextService.getInstance().lastElement();
				FeatureEditorDialog dialog = new FeatureEditorDialog(Display.getDefault().getActiveShell(), new AdapterFactoryLabelProvider(adapterFactory), documentRoot, AmlPackage.eINSTANCE.getDocumentRoot_Mixed().getEType(), 
						mixedList, "DocumentRoot", null, false, false); //$NON-NLS-1$
				if (dialog.open() == Window.OK) {
					mixedList = dialog.getResult();
					if (mixedList == null) {
						mixedList = new BasicEList();
					}
					mixed.setText(mixedList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.mixed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mixedList));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editMixed, AmlViewsRepository.DocumentRoot.mixed);
		EditingUtils.setEEFtype(editMixed, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createXMLNSPrefixMapTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.xMLNSPrefixMap = new ReferencesTable<EStringToStringMapEntryImpl>(AmlMessages.DocumentRootPropertiesEditionPart_XMLNSPrefixMapLabel, new ReferencesTableListener<EStringToStringMapEntryImpl>() {			
			public void handleAdd() { addToXMLNSPrefixMap();}
			public void handleEdit(EStringToStringMapEntryImpl element) { editXMLNSPrefixMap(element); }
			public void handleMove(EStringToStringMapEntryImpl element, int oldIndex, int newIndex) { moveXMLNSPrefixMap(element, oldIndex, newIndex); }
			public void handleRemove(EStringToStringMapEntryImpl element) { removeFromXMLNSPrefixMap(element); }
			public void navigateTo(EStringToStringMapEntryImpl element) { }
		});
		this.xMLNSPrefixMap.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.DocumentRoot.xMLNSPrefixMap, AmlViewsRepository.FORM_KIND));
		this.xMLNSPrefixMap.createControls(parent, widgetFactory);
		GridData xMLNSPrefixMapData = new GridData(GridData.FILL_HORIZONTAL);
		xMLNSPrefixMapData.horizontalSpan = 3;
		this.xMLNSPrefixMap.setLayoutData(xMLNSPrefixMapData);
		this.xMLNSPrefixMap.setLowerBound(0);
		this.xMLNSPrefixMap.setUpperBound(-1);
		xMLNSPrefixMap.setID(AmlViewsRepository.DocumentRoot.xMLNSPrefixMap);
		xMLNSPrefixMap.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveXMLNSPrefixMap(EStringToStringMapEntryImpl element, int oldIndex, int newIndex) {
		EObject editedElement = xMLNSPrefixMapEditUtil.foundCorrespondingEObject(element);
		xMLNSPrefixMapEditUtil.moveElement(element, oldIndex, newIndex);
		xMLNSPrefixMap.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.xMLNSPrefixMap, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToXMLNSPrefixMap() {
		// Start of user code addToXMLNSPrefixMap() method body
		EStringToStringMapEntryImpl eObject = (EStringToStringMapEntryImpl) EcorePackage.eINSTANCE.getEStringToStringMapEntry();
				// EStringToStringMapEntryImpl eObject = EcoreFactory.eINSTANCE.createEStringToStringMapEntry();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						xMLNSPrefixMapEditUtil.addElement(propertiesEditionObject);
						xMLNSPrefixMap.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.xMLNSPrefixMap, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromXMLNSPrefixMap(EStringToStringMapEntryImpl element) {
		// Start of user code for the removeFromXMLNSPrefixMap() method body
				EObject editedElement = xMLNSPrefixMapEditUtil.foundCorrespondingEObject(element);
				xMLNSPrefixMapEditUtil.removeElement(element);
				xMLNSPrefixMap.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.xMLNSPrefixMap, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editXMLNSPrefixMap(EStringToStringMapEntryImpl element) {
		// Start of user code editXMLNSPrefixMap() method body
				EObject editedElement = xMLNSPrefixMapEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						xMLNSPrefixMapEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						xMLNSPrefixMap.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.xMLNSPrefixMap, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createXSISchemaLocationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.xSISchemaLocation = new ReferencesTable<EStringToStringMapEntryImpl>(AmlMessages.DocumentRootPropertiesEditionPart_XSISchemaLocationLabel, new ReferencesTableListener<EStringToStringMapEntryImpl>() {			
			public void handleAdd() { addToXSISchemaLocation();}
			public void handleEdit(EStringToStringMapEntryImpl element) { editXSISchemaLocation(element); }
			public void handleMove(EStringToStringMapEntryImpl element, int oldIndex, int newIndex) { moveXSISchemaLocation(element, oldIndex, newIndex); }
			public void handleRemove(EStringToStringMapEntryImpl element) { removeFromXSISchemaLocation(element); }
			public void navigateTo(EStringToStringMapEntryImpl element) { }
		});
		this.xSISchemaLocation.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.DocumentRoot.xSISchemaLocation, AmlViewsRepository.FORM_KIND));
		this.xSISchemaLocation.createControls(parent, widgetFactory);
		GridData xSISchemaLocationData = new GridData(GridData.FILL_HORIZONTAL);
		xSISchemaLocationData.horizontalSpan = 3;
		this.xSISchemaLocation.setLayoutData(xSISchemaLocationData);
		this.xSISchemaLocation.setLowerBound(0);
		this.xSISchemaLocation.setUpperBound(-1);
		xSISchemaLocation.setID(AmlViewsRepository.DocumentRoot.xSISchemaLocation);
		xSISchemaLocation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveXSISchemaLocation(EStringToStringMapEntryImpl element, int oldIndex, int newIndex) {
		EObject editedElement = xSISchemaLocationEditUtil.foundCorrespondingEObject(element);
		xSISchemaLocationEditUtil.moveElement(element, oldIndex, newIndex);
		xSISchemaLocation.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.xSISchemaLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToXSISchemaLocation() {
		// Start of user code addToXSISchemaLocation() method body
		EStringToStringMapEntryImpl eObject = (EStringToStringMapEntryImpl) EcorePackage.eINSTANCE.getEStringToStringMapEntry();
		// EStringToStringMapEntryImpl eObject = EcoreFactory.eINSTANCE.createEStringToStringMapEntry();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						xSISchemaLocationEditUtil.addElement(propertiesEditionObject);
						xSISchemaLocation.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.xSISchemaLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromXSISchemaLocation(EStringToStringMapEntryImpl element) {
		// Start of user code for the removeFromXSISchemaLocation() method body
				EObject editedElement = xSISchemaLocationEditUtil.foundCorrespondingEObject(element);
				xSISchemaLocationEditUtil.removeElement(element);
				xSISchemaLocation.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.xSISchemaLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editXSISchemaLocation(EStringToStringMapEntryImpl element) {
		// Start of user code editXSISchemaLocation() method body
				EObject editedElement = xSISchemaLocationEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						xSISchemaLocationEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						xSISchemaLocation.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.xSISchemaLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	
	protected void createDescription1Text(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.DocumentRootPropertiesEditionPart_Description1Label, propertiesEditionComponent.isRequired(AmlViewsRepository.DocumentRoot.description1, AmlViewsRepository.FORM_KIND));
		description1 = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		description1.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData description1Data = new GridData(GridData.FILL_HORIZONTAL);
		description1.setLayoutData(description1Data);
		description1.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.description1, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description1.getText()));
			}
		});
		description1.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.description1, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description1.getText()));
				}
			}
		});
		EditingUtils.setID(description1, AmlViewsRepository.DocumentRoot.description1);
		EditingUtils.setEEFtype(description1, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.DocumentRoot.description1, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createIdText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.DocumentRootPropertiesEditionPart_IdLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.DocumentRoot.id, AmlViewsRepository.FORM_KIND));
		id = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		id.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
			}
		});
		id.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, AmlViewsRepository.DocumentRoot.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.DocumentRoot.id, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createIdRefText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.DocumentRootPropertiesEditionPart_IdRefLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.DocumentRoot.idRef, AmlViewsRepository.FORM_KIND));
		idRef = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		idRef.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData idRefData = new GridData(GridData.FILL_HORIZONTAL);
		idRef.setLayoutData(idRefData);
		idRef.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.idRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, idRef.getText()));
			}
		});
		idRef.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.idRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, idRef.getText()));
				}
			}
		});
		EditingUtils.setID(idRef, AmlViewsRepository.DocumentRoot.idRef);
		EditingUtils.setEEFtype(idRef, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.DocumentRoot.idRef, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createLabel1Text(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.DocumentRootPropertiesEditionPart_Label1Label, propertiesEditionComponent.isRequired(AmlViewsRepository.DocumentRoot.label1, AmlViewsRepository.FORM_KIND));
		label1 = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		label1.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData label1Data = new GridData(GridData.FILL_HORIZONTAL);
		label1.setLayoutData(label1Data);
		label1.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.label1, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, label1.getText()));
			}
		});
		label1.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DocumentRootPropertiesEditionPartForm.this, AmlViewsRepository.DocumentRoot.label1, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, label1.getText()));
				}
			}
		});
		EditingUtils.setID(label1, AmlViewsRepository.DocumentRoot.label1);
		EditingUtils.setEEFtype(label1, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.DocumentRoot.label1, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getMixed()
	 * 
	 */
	public EList getMixed() {
		return mixedList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#setMixed(EList newValue)
	 * 
	 */
	public void setMixed(EList newValue) {
		mixedList = newValue;
		if (newValue != null) {
			mixed.setText(mixedList.toString());
		} else {
			mixed.setText(""); //$NON-NLS-1$
		}
	}
	
	public void addToMixed(org.eclipse.emf.ecore.util.FeatureMap.Entry newValue) {
		mixedList.add(newValue);		
		if (newValue != null) {
			mixed.setText(mixedList.toString());
		} else {
			mixed.setText(""); //$NON-NLS-1$
		}
	}
	
	public void removeToMixed(org.eclipse.emf.ecore.util.FeatureMap.Entry newValue) {
		mixedList.remove(newValue);		
		if (newValue != null) {
			mixed.setText(mixedList.toString());
		} else {
			mixed.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getXMLNSPrefixMapToAdd()
	 * 
	 */
	public List getXMLNSPrefixMapToAdd() {
		return xMLNSPrefixMapEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getXMLNSPrefixMapToRemove()
	 * 
	 */
	public List getXMLNSPrefixMapToRemove() {
		return xMLNSPrefixMapEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getXMLNSPrefixMapToEdit()
	 * 
	 */
	public Map getXMLNSPrefixMapToEdit() {
		return xMLNSPrefixMapEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getXMLNSPrefixMapToMove()
	 * 
	 */
	public List getXMLNSPrefixMapToMove() {
		return xMLNSPrefixMapEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getXMLNSPrefixMapTable()
	 * 
	 */
	public List getXMLNSPrefixMapTable() {
		return xMLNSPrefixMapEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#initXMLNSPrefixMap(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initXMLNSPrefixMap(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			xMLNSPrefixMapEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			xMLNSPrefixMapEditUtil = new EMFListEditUtil(current, feature);
		this.xMLNSPrefixMap.setInput(xMLNSPrefixMapEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#updateXMLNSPrefixMap(EObject newValue)
	 * 
	 */
	public void updateXMLNSPrefixMap(EObject newValue) {
		if(xMLNSPrefixMapEditUtil != null){
			xMLNSPrefixMapEditUtil.reinit(newValue);
			xMLNSPrefixMap.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#addFilterXMLNSPrefixMap(ViewerFilter filter)
	 * 
	 */
	public void addFilterToXMLNSPrefixMap(ViewerFilter filter) {
		xMLNSPrefixMapFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#addBusinessFilterXMLNSPrefixMap(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToXMLNSPrefixMap(ViewerFilter filter) {
		xMLNSPrefixMapBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#isContainedInXMLNSPrefixMapTable(EObject element)
	 * 
	 */
	public boolean isContainedInXMLNSPrefixMapTable(EObject element) {
		return xMLNSPrefixMapEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getXSISchemaLocationToAdd()
	 * 
	 */
	public List getXSISchemaLocationToAdd() {
		return xSISchemaLocationEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getXSISchemaLocationToRemove()
	 * 
	 */
	public List getXSISchemaLocationToRemove() {
		return xSISchemaLocationEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getXSISchemaLocationToEdit()
	 * 
	 */
	public Map getXSISchemaLocationToEdit() {
		return xSISchemaLocationEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getXSISchemaLocationToMove()
	 * 
	 */
	public List getXSISchemaLocationToMove() {
		return xSISchemaLocationEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getXSISchemaLocationTable()
	 * 
	 */
	public List getXSISchemaLocationTable() {
		return xSISchemaLocationEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#initXSISchemaLocation(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initXSISchemaLocation(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			xSISchemaLocationEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			xSISchemaLocationEditUtil = new EMFListEditUtil(current, feature);
		this.xSISchemaLocation.setInput(xSISchemaLocationEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#updateXSISchemaLocation(EObject newValue)
	 * 
	 */
	public void updateXSISchemaLocation(EObject newValue) {
		if(xSISchemaLocationEditUtil != null){
			xSISchemaLocationEditUtil.reinit(newValue);
			xSISchemaLocation.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#addFilterXSISchemaLocation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToXSISchemaLocation(ViewerFilter filter) {
		xSISchemaLocationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#addBusinessFilterXSISchemaLocation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToXSISchemaLocation(ViewerFilter filter) {
		xSISchemaLocationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#isContainedInXSISchemaLocationTable(EObject element)
	 * 
	 */
	public boolean isContainedInXSISchemaLocationTable(EObject element) {
		return xSISchemaLocationEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getDescription1()
	 * 
	 */
	public String getDescription1() {
		return description1.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#setDescription1(String newValue)
	 * 
	 */
	public void setDescription1(String newValue) {
		if (newValue != null) {
			description1.setText(newValue);
		} else {
			description1.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getIdRef()
	 * 
	 */
	public String getIdRef() {
		return idRef.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#setIdRef(String newValue)
	 * 
	 */
	public void setIdRef(String newValue) {
		if (newValue != null) {
			idRef.setText(newValue);
		} else {
			idRef.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#getLabel1()
	 * 
	 */
	public String getLabel1() {
		return label1.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart#setLabel1(String newValue)
	 * 
	 */
	public void setLabel1(String newValue) {
		if (newValue != null) {
			label1.setText(newValue);
		} else {
			label1.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.DocumentRoot_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
