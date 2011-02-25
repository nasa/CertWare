
package net.certware.argument.arm.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.arm.parts.ArmViewsRepository;
import net.certware.argument.arm.parts.CitationElementPropertiesEditionPart;
import net.certware.argument.arm.providers.ArmMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;



// End of user code	

/**
 * @author
 * 
 */
public class CitationElementPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, CitationElementPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected EMFListEditUtil isTaggedEditUtil;
	protected ReferencesTable<? extends EObject> isTagged;
	protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer refersToArgumentElement;
	protected EObjectFlatComboViewer refersToArgument;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CitationElementPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(ArmMessages.CitationElementPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createIdentifierText(propertiesGroup);
		createDescriptionText(propertiesGroup);
		createContentTextarea(propertiesGroup);
		createIsTaggedAdvancedTableComposition(propertiesGroup);
		createRefersToArgumentElementFlatComboViewer(propertiesGroup);
		createRefersToArgumentFlatComboViewer(propertiesGroup);
	}

	
	protected void createIdentifierText(Composite parent) {
		SWTUtils.createPartLabel(parent, ArmMessages.CitationElementPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.CitationElement.identifier, ArmViewsRepository.SWT_KIND));
		identifier = new Text(parent, SWT.BORDER);
		GridData identifierData = new GridData(GridData.FILL_HORIZONTAL);
		identifier.setLayoutData(identifierData);
		identifier.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
			}

		});
		identifier.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, ArmViewsRepository.CitationElement.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.CitationElement.identifier, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, ArmMessages.CitationElementPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.CitationElement.description, ArmViewsRepository.SWT_KIND));
		description = new Text(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, ArmViewsRepository.CitationElement.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.CitationElement.description, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createContentTextarea(Composite parent) {
		Label contentLabel = SWTUtils.createPartLabel(parent, ArmMessages.CitationElementPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.CitationElement.content, ArmViewsRepository.SWT_KIND));
		GridData contentLabelData = new GridData(GridData.FILL_HORIZONTAL);
		contentLabelData.horizontalSpan = 3;
		contentLabel.setLayoutData(contentLabelData);
		content = new Text(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		contentData.horizontalSpan = 2;
		contentData.heightHint = 80;
		contentData.widthHint = 200;
		content.setLayoutData(contentData);
		EditingUtils.setID(content, ArmViewsRepository.CitationElement.content);
		EditingUtils.setEEFtype(content, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.CitationElement.content, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createIsTaggedAdvancedTableComposition(Composite parent) {
		this.isTagged = new ReferencesTable<TaggedValue>(ArmMessages.CitationElementPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener<TaggedValue>() {			
			public void handleAdd() { addToIsTagged();}
			public void handleEdit(TaggedValue element) { editIsTagged(element); }
			public void handleMove(TaggedValue element, int oldIndex, int newIndex) { moveIsTagged(element, oldIndex, newIndex); }
			public void handleRemove(TaggedValue element) { removeFromIsTagged(element); }
			public void navigateTo(TaggedValue element) { }
		});
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(ArmViewsRepository.CitationElement.isTagged, ArmViewsRepository.SWT_KIND));
		this.isTagged.createControls(parent);
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(ArmViewsRepository.CitationElement.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveIsTagged(TaggedValue element, int oldIndex, int newIndex) {
		EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
		isTaggedEditUtil.moveElement(element, oldIndex, newIndex);
		isTagged.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToIsTagged() {
		// Start of user code addToIsTagged() method body
				TaggedValue eObject = ArmFactory.eINSTANCE.createTaggedValue();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						isTaggedEditUtil.addElement(propertiesEditionObject);
						isTagged.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromIsTagged(TaggedValue element) {
		// Start of user code removeFromIsTagged() method body
				EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
				isTaggedEditUtil.removeElement(element);
				isTagged.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editIsTagged(TaggedValue element) {
		// Start of user code editIsTagged() method body
				EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						isTaggedEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						isTagged.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * @param propertiesGroup
	 * 
	 */
	protected void createRefersToArgumentElementFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ArmMessages.CitationElementPropertiesEditionPart_RefersToArgumentElementLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.CitationElement.refersToArgumentElement, ArmViewsRepository.SWT_KIND));
		refersToArgumentElement = new EObjectFlatComboViewer(parent, true);
		refersToArgumentElement.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		refersToArgumentElement.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.refersToArgumentElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRefersToArgumentElement()));
			}

		});
		GridData refersToArgumentElementData = new GridData(GridData.FILL_HORIZONTAL);
		refersToArgumentElement.setLayoutData(refersToArgumentElementData);
		refersToArgumentElement.setID(ArmViewsRepository.CitationElement.refersToArgumentElement);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.CitationElement.refersToArgumentElement, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param propertiesGroup
	 * 
	 */
	protected void createRefersToArgumentFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ArmMessages.CitationElementPropertiesEditionPart_RefersToArgumentLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.CitationElement.refersToArgument, ArmViewsRepository.SWT_KIND));
		refersToArgument = new EObjectFlatComboViewer(parent, true);
		refersToArgument.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		refersToArgument.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArmViewsRepository.CitationElement.refersToArgument, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRefersToArgument()));
			}

		});
		GridData refersToArgumentData = new GridData(GridData.FILL_HORIZONTAL);
		refersToArgument.setLayoutData(refersToArgumentData);
		refersToArgument.setID(ArmViewsRepository.CitationElement.refersToArgument);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.CitationElement.refersToArgument, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#setIdentifier(String newValue)
	 * 
	 */
	public void setIdentifier(String newValue) {
		if (newValue != null) {
			identifier.setText(newValue);
		} else {
			identifier.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText("");  //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#getIsTaggedToAdd()
	 * 
	 */
	public List getIsTaggedToAdd() {
		return isTaggedEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#getIsTaggedToRemove()
	 * 
	 */
	public List getIsTaggedToRemove() {
		return isTaggedEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#getIsTaggedToEdit()
	 * 
	 */
	public Map getIsTaggedToEdit() {
		return isTaggedEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#getIsTaggedToMove()
	 * 
	 */
	public List getIsTaggedToMove() {
		return isTaggedEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#getIsTaggedTable()
	 * 
	 */
	public List getIsTaggedTable() {
		return isTaggedEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initIsTagged(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			isTaggedEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			isTaggedEditUtil = new EMFListEditUtil(current, feature);
		this.isTagged.setInput(isTaggedEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#updateIsTagged(EObject newValue)
	 * 
	 */
	public void updateIsTagged(EObject newValue) {
		if(isTaggedEditUtil != null){
			isTaggedEditUtil.reinit(newValue);
			isTagged.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return isTaggedEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#getRefersToArgumentElement()
	 * 
	 */
	public EObject getRefersToArgumentElement() {
		if (refersToArgumentElement.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) refersToArgumentElement.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#initRefersToArgumentElement(ResourceSet allResources, EObject current)
	 */
	public void initRefersToArgumentElement(ResourceSet allResources, EObject current) {
		refersToArgumentElement.setInput(allResources);
		if (current != null) {
			refersToArgumentElement.setSelection(new StructuredSelection(current));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#setRefersToArgumentElement(EObject newValue)
	 * 
	 */
	public void setRefersToArgumentElement(EObject newValue) {
		if (newValue != null) {
			refersToArgumentElement.setSelection(new StructuredSelection(newValue));
		} else {
			refersToArgumentElement.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#setRefersToArgumentElementButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRefersToArgumentElementButtonMode(ButtonsModeEnum newValue) {
		refersToArgumentElement.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#addFilterRefersToArgumentElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRefersToArgumentElement(ViewerFilter filter) {
		refersToArgumentElement.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#addBusinessFilterRefersToArgumentElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRefersToArgumentElement(ViewerFilter filter) {
		refersToArgumentElement.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#getRefersToArgument()
	 * 
	 */
	public EObject getRefersToArgument() {
		if (refersToArgument.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) refersToArgument.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#initRefersToArgument(ResourceSet allResources, EObject current)
	 */
	public void initRefersToArgument(ResourceSet allResources, EObject current) {
		refersToArgument.setInput(allResources);
		if (current != null) {
			refersToArgument.setSelection(new StructuredSelection(current));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#setRefersToArgument(EObject newValue)
	 * 
	 */
	public void setRefersToArgument(EObject newValue) {
		if (newValue != null) {
			refersToArgument.setSelection(new StructuredSelection(newValue));
		} else {
			refersToArgument.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#setRefersToArgumentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRefersToArgumentButtonMode(ButtonsModeEnum newValue) {
		refersToArgument.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#addFilterRefersToArgument(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRefersToArgument(ViewerFilter filter) {
		refersToArgument.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.CitationElementPropertiesEditionPart#addBusinessFilterRefersToArgument(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRefersToArgument(ViewerFilter filter) {
		refersToArgument.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ArmMessages.CitationElement_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
