
package net.certware.argument.aml.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.certware.argument.aml.AmlFactory;
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Annotation;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.CollectionPropertiesEditionPart;
import net.certware.argument.aml.providers.AmlMessages;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesContextService;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;



// End of user code	

/**
 * @author mrb
 * 
 */
public class CollectionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, CollectionPropertiesEditionPart {

	protected EMFListEditUtil annotationEditUtil;
	protected ReferencesTable<? extends EObject> annotation;
	protected List<ViewerFilter> annotationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> annotationFilters = new ArrayList<ViewerFilter>();
	protected Text group;
	protected Button editGroup;
	private EList groupList;
	protected Text id;
	protected Text label1;
	protected EMFComboViewer objectType;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CollectionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		createPropertiesGroup(view);


		// Start of user code for additional ui definition
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(AmlMessages.CollectionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createAnnotationAdvancedTableComposition(propertiesGroup);
		createGroupMultiValuedEditor(propertiesGroup);
		createIdText(propertiesGroup);
		createLabel1Text(propertiesGroup);
		createObjectTypeEMFComboViewer(propertiesGroup);
	}

	/**
	 * @param container
	 * 
	 */
	protected void createAnnotationAdvancedTableComposition(Composite parent) {
		this.annotation = new ReferencesTable<Annotation>(AmlMessages.CollectionPropertiesEditionPart_AnnotationLabel, new ReferencesTableListener<Annotation>() {			
			public void handleAdd() { addToAnnotation();}
			public void handleEdit(Annotation element) { editAnnotation(element); }
			public void handleMove(Annotation element, int oldIndex, int newIndex) { moveAnnotation(element, oldIndex, newIndex); }
			public void handleRemove(Annotation element) { removeFromAnnotation(element); }
			public void navigateTo(Annotation element) { }
		});
		this.annotation.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.Collection.annotation, AmlViewsRepository.SWT_KIND));
		this.annotation.createControls(parent);
		GridData annotationData = new GridData(GridData.FILL_HORIZONTAL);
		annotationData.horizontalSpan = 3;
		this.annotation.setLayoutData(annotationData);
		this.annotation.setLowerBound(0);
		this.annotation.setUpperBound(-1);
		annotation.setID(AmlViewsRepository.Collection.annotation);
		annotation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveAnnotation(Annotation element, int oldIndex, int newIndex) {
		EObject editedElement = annotationEditUtil.foundCorrespondingEObject(element);
		annotationEditUtil.moveElement(element, oldIndex, newIndex);
		annotation.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollectionPropertiesEditionPartImpl.this, AmlViewsRepository.Collection.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToAnnotation() {
		// Start of user code addToAnnotation() method body
				Annotation eObject = AmlFactory.eINSTANCE.createAnnotation();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						annotationEditUtil.addElement(propertiesEditionObject);
						annotation.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollectionPropertiesEditionPartImpl.this, AmlViewsRepository.Collection.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromAnnotation(Annotation element) {
		// Start of user code removeFromAnnotation() method body
				EObject editedElement = annotationEditUtil.foundCorrespondingEObject(element);
				annotationEditUtil.removeElement(element);
				annotation.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollectionPropertiesEditionPartImpl.this, AmlViewsRepository.Collection.annotation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editAnnotation(Annotation element) {
		// Start of user code editAnnotation() method body
				EObject editedElement = annotationEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						annotationEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						annotation.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollectionPropertiesEditionPartImpl.this, AmlViewsRepository.Collection.annotation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	protected void createGroupMultiValuedEditor(Composite parent) {
		group = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData groupData = new GridData(GridData.FILL_HORIZONTAL);
		groupData.horizontalSpan = 2;
		group.setLayoutData(groupData);
		EditingUtils.setID(group, AmlViewsRepository.Collection.group);
		EditingUtils.setEEFtype(group, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editGroup = new Button(parent, SWT.NONE);
		editGroup.setText(AmlMessages.CollectionPropertiesEditionPart_GroupLabel);
		GridData editGroupData = new GridData();
		editGroup.setLayoutData(editGroupData);
		editGroup.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EObject collection = PropertiesContextService.getInstance().lastElement();
				FeatureEditorDialog dialog = new FeatureEditorDialog(Display.getDefault().getActiveShell(), new AdapterFactoryLabelProvider(adapterFactory), collection, AmlPackage.eINSTANCE.getCollection_Group().getEType(), 
						groupList, "Collection", null, false, false); //$NON-NLS-1$
						
				if (dialog.open() == Window.OK) {
					groupList = dialog.getResult();
					if (groupList == null) {
						groupList = new BasicEList();
					}
					group.setText(groupList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollectionPropertiesEditionPartImpl.this, AmlViewsRepository.Collection.group, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, groupList));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editGroup, AmlViewsRepository.Collection.group);
		EditingUtils.setEEFtype(editGroup, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
	}

	
	protected void createIdText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.CollectionPropertiesEditionPart_IdLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Collection.id, AmlViewsRepository.SWT_KIND));
		id = new Text(parent, SWT.BORDER);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollectionPropertiesEditionPartImpl.this, AmlViewsRepository.Collection.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
			}

		});
		id.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollectionPropertiesEditionPartImpl.this, AmlViewsRepository.Collection.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, AmlViewsRepository.Collection.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Collection.id, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createLabel1Text(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.CollectionPropertiesEditionPart_Label1Label, propertiesEditionComponent.isRequired(AmlViewsRepository.Collection.label1, AmlViewsRepository.SWT_KIND));
		label1 = new Text(parent, SWT.BORDER);
		GridData label1Data = new GridData(GridData.FILL_HORIZONTAL);
		label1.setLayoutData(label1Data);
		label1.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollectionPropertiesEditionPartImpl.this, AmlViewsRepository.Collection.label1, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, label1.getText()));
			}

		});
		label1.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollectionPropertiesEditionPartImpl.this, AmlViewsRepository.Collection.label1, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, label1.getText()));
				}
			}

		});
		EditingUtils.setID(label1, AmlViewsRepository.Collection.label1);
		EditingUtils.setEEFtype(label1, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Collection.label1, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createObjectTypeEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.CollectionPropertiesEditionPart_ObjectTypeLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Collection.objectType, AmlViewsRepository.SWT_KIND));
		objectType = new EMFComboViewer(parent);
		objectType.setContentProvider(new ArrayContentProvider());
		objectType.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData objectTypeData = new GridData(GridData.FILL_HORIZONTAL);
		objectType.getCombo().setLayoutData(objectTypeData);
		objectType.setID(AmlViewsRepository.Collection.objectType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Collection.objectType, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#getAnnotationToAdd()
	 * 
	 */
	public List getAnnotationToAdd() {
		return annotationEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#getAnnotationToRemove()
	 * 
	 */
	public List getAnnotationToRemove() {
		return annotationEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#getAnnotationToEdit()
	 * 
	 */
	public Map getAnnotationToEdit() {
		return annotationEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#getAnnotationToMove()
	 * 
	 */
	public List getAnnotationToMove() {
		return annotationEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#getAnnotationTable()
	 * 
	 */
	public List getAnnotationTable() {
		return annotationEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#initAnnotation(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnnotation(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			annotationEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			annotationEditUtil = new EMFListEditUtil(current, feature);
		this.annotation.setInput(annotationEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#updateAnnotation(EObject newValue)
	 * 
	 */
	public void updateAnnotation(EObject newValue) {
		if(annotationEditUtil != null){
			annotationEditUtil.reinit(newValue);
			annotation.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#addFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAnnotation(ViewerFilter filter) {
		annotationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#addBusinessFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnnotation(ViewerFilter filter) {
		annotationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#isContainedInAnnotationTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnnotationTable(EObject element) {
		return annotationEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#getGroup()
	 * 
	 */
	public EList getGroup() {
		return groupList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#setGroup(EList newValue)
	 * 
	 */
	public void setGroup(EList newValue) {
		groupList = newValue;
		if (newValue != null) {
			group.setText(groupList.toString());
		} else {
			group.setText(""); //$NON-NLS-1$
		}
	}
	
	public void addToGroup(org.eclipse.emf.ecore.util.FeatureMap.Entry newValue) {
		groupList.add(newValue);		
		if (newValue != null) {
			group.setText(groupList.toString());
		} else {
			group.setText(""); //$NON-NLS-1$
		}
	}
	
	public void removeToGroup(org.eclipse.emf.ecore.util.FeatureMap.Entry newValue) {
		groupList.remove(newValue);		
		if (newValue != null) {
			group.setText(groupList.toString());
		} else {
			group.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#setId(String newValue)
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
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#getLabel1()
	 * 
	 */
	public String getLabel1() {
		return label1.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#setLabel1(String newValue)
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
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#getObjectType()
	 * 
	 */
	public Enumerator getObjectType() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) objectType.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#initObjectType(EEnum eenum, Enumerator current)
	 */
	public void initObjectType(EEnum eenum, Enumerator current) {
		objectType.setInput(eenum.getELiterals());
		objectType.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionPropertiesEditionPart#setObjectType(Enumerator newValue)
	 * 
	 */
	public void setObjectType(Enumerator newValue) {
		objectType.modelUpdating(new StructuredSelection(newValue));
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.Collection_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
