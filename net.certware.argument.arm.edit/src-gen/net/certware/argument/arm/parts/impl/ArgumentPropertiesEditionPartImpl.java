
package net.certware.argument.arm.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.arm.ArgumentLink;
import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.arm.parts.ArgumentPropertiesEditionPart;
import net.certware.argument.arm.parts.ArmViewsRepository;
import net.certware.argument.arm.providers.ArmMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.policies.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Text;



// End of user code	

/**
 * @author
 * 
 */
public class ArgumentPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ArgumentPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected EMFListEditUtil isTaggedEditUtil;
	protected ReferencesTable<? extends EObject> isTagged;
	protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil containsArgumentElementEditUtil;
	protected ReferencesTable<? extends EObject> containsArgumentElement;
	protected List<ViewerFilter> containsArgumentElementBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> containsArgumentElementFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil containsArgumentLinkEditUtil;
	protected ReferencesTable<? extends EObject> containsArgumentLink;
	protected List<ViewerFilter> containsArgumentLinkBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> containsArgumentLinkFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil containsArgumentEditUtil;
	protected ReferencesTable<? extends EObject> containsArgument;
	protected List<ViewerFilter> containsArgumentBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> containsArgumentFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ArgumentPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(ArmMessages.ArgumentPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createIdentifierText(propertiesGroup);
		createDescriptionText(propertiesGroup);
		createContentText(propertiesGroup);
		createIsTaggedAdvancedTableComposition(propertiesGroup);
		createContainsArgumentElementAdvancedTableComposition(propertiesGroup);
		createContainsArgumentLinkAdvancedTableComposition(propertiesGroup);
		createContainsArgumentAdvancedTableComposition(propertiesGroup);
	}

	
	protected void createIdentifierText(Composite parent) {
		SWTUtils.createPartLabel(parent, ArmMessages.ArgumentPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.Argument.identifier, ArmViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, ArmViewsRepository.Argument.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.Argument.identifier, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, ArmMessages.ArgumentPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.Argument.description, ArmViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, ArmViewsRepository.Argument.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.Argument.description, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createContentText(Composite parent) {
		SWTUtils.createPartLabel(parent, ArmMessages.ArgumentPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.Argument.content, ArmViewsRepository.SWT_KIND));
		content = new Text(parent, SWT.BORDER);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		content.setLayoutData(contentData);
		content.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
			}

		});
		content.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}

		});
		EditingUtils.setID(content, ArmViewsRepository.Argument.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.Argument.content, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createIsTaggedAdvancedTableComposition(Composite parent) {
		this.isTagged = new ReferencesTable<TaggedValue>(ArmMessages.ArgumentPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener<TaggedValue>() {			
			public void handleAdd() { addToIsTagged();}
			public void handleEdit(TaggedValue element) { editIsTagged(element); }
			public void handleMove(TaggedValue element, int oldIndex, int newIndex) { moveIsTagged(element, oldIndex, newIndex); }
			public void handleRemove(TaggedValue element) { removeFromIsTagged(element); }
			public void navigateTo(TaggedValue element) { }
		});
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(ArmViewsRepository.Argument.isTagged, ArmViewsRepository.SWT_KIND));
		this.isTagged.createControls(parent);
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(ArmViewsRepository.Argument.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveIsTagged(TaggedValue element, int oldIndex, int newIndex) {
		EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
		isTaggedEditUtil.moveElement(element, oldIndex, newIndex);
		isTagged.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
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
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createContainsArgumentElementAdvancedTableComposition(Composite parent) {
		this.containsArgumentElement = new ReferencesTable<ArgumentElement>(ArmMessages.ArgumentPropertiesEditionPart_ContainsArgumentElementLabel, new ReferencesTableListener<ArgumentElement>() {			
			public void handleAdd() { addToContainsArgumentElement();}
			public void handleEdit(ArgumentElement element) { editContainsArgumentElement(element); }
			public void handleMove(ArgumentElement element, int oldIndex, int newIndex) { moveContainsArgumentElement(element, oldIndex, newIndex); }
			public void handleRemove(ArgumentElement element) { removeFromContainsArgumentElement(element); }
			public void navigateTo(ArgumentElement element) { }
		});
		this.containsArgumentElement.setHelpText(propertiesEditionComponent.getHelpContent(ArmViewsRepository.Argument.containsArgumentElement, ArmViewsRepository.SWT_KIND));
		this.containsArgumentElement.createControls(parent);
		GridData containsArgumentElementData = new GridData(GridData.FILL_HORIZONTAL);
		containsArgumentElementData.horizontalSpan = 3;
		this.containsArgumentElement.setLayoutData(containsArgumentElementData);
		this.containsArgumentElement.setLowerBound(0);
		this.containsArgumentElement.setUpperBound(-1);
		containsArgumentElement.setID(ArmViewsRepository.Argument.containsArgumentElement);
		containsArgumentElement.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveContainsArgumentElement(ArgumentElement element, int oldIndex, int newIndex) {
	}

	/**
	 *  
	 */
	protected void addToContainsArgumentElement() {
		// Start of user code addToContainsArgumentElement() method body
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(current);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(current);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EReferencePropertiesEditionContext(propertiesEditionComponent, ArmPackage.eINSTANCE.getArgument_ContainsArgumentElement(), resourceSet));
					if (propertiesEditionObject != null) {
						containsArgumentElementEditUtil.addElement(propertiesEditionObject);
						containsArgumentElement.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.containsArgumentElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromContainsArgumentElement(ArgumentElement element) {
		// Start of user code removeFromContainsArgumentElement() method body
				EObject editedElement = containsArgumentElementEditUtil.foundCorrespondingEObject(element);
				containsArgumentElementEditUtil.removeElement(element);
				containsArgumentElement.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.containsArgumentElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editContainsArgumentElement(ArgumentElement element) {
		// Start of user code editContainsArgumentElement() method body
				EObject editedElement = containsArgumentElementEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						containsArgumentElementEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						containsArgumentElement.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.containsArgumentElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createContainsArgumentLinkAdvancedTableComposition(Composite parent) {
		this.containsArgumentLink = new ReferencesTable<ArgumentLink>(ArmMessages.ArgumentPropertiesEditionPart_ContainsArgumentLinkLabel, new ReferencesTableListener<ArgumentLink>() {			
			public void handleAdd() { addToContainsArgumentLink();}
			public void handleEdit(ArgumentLink element) { editContainsArgumentLink(element); }
			public void handleMove(ArgumentLink element, int oldIndex, int newIndex) { moveContainsArgumentLink(element, oldIndex, newIndex); }
			public void handleRemove(ArgumentLink element) { removeFromContainsArgumentLink(element); }
			public void navigateTo(ArgumentLink element) { }
		});
		this.containsArgumentLink.setHelpText(propertiesEditionComponent.getHelpContent(ArmViewsRepository.Argument.containsArgumentLink, ArmViewsRepository.SWT_KIND));
		this.containsArgumentLink.createControls(parent);
		GridData containsArgumentLinkData = new GridData(GridData.FILL_HORIZONTAL);
		containsArgumentLinkData.horizontalSpan = 3;
		this.containsArgumentLink.setLayoutData(containsArgumentLinkData);
		this.containsArgumentLink.setLowerBound(0);
		this.containsArgumentLink.setUpperBound(-1);
		containsArgumentLink.setID(ArmViewsRepository.Argument.containsArgumentLink);
		containsArgumentLink.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveContainsArgumentLink(ArgumentLink element, int oldIndex, int newIndex) {
	}

	/**
	 *  
	 */
	protected void addToContainsArgumentLink() {
		// Start of user code addToContainsArgumentLink() method body
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(current);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(current);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EReferencePropertiesEditionContext(propertiesEditionComponent, ArmPackage.eINSTANCE.getArgument_ContainsArgumentLink(), resourceSet));
					if (propertiesEditionObject != null) {
						containsArgumentLinkEditUtil.addElement(propertiesEditionObject);
						containsArgumentLink.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.containsArgumentLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromContainsArgumentLink(ArgumentLink element) {
		// Start of user code removeFromContainsArgumentLink() method body
				EObject editedElement = containsArgumentLinkEditUtil.foundCorrespondingEObject(element);
				containsArgumentLinkEditUtil.removeElement(element);
				containsArgumentLink.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.containsArgumentLink, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editContainsArgumentLink(ArgumentLink element) {
		// Start of user code editContainsArgumentLink() method body
				EObject editedElement = containsArgumentLinkEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						containsArgumentLinkEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						containsArgumentLink.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.containsArgumentLink, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createContainsArgumentAdvancedTableComposition(Composite parent) {
		this.containsArgument = new ReferencesTable<Argument>(ArmMessages.ArgumentPropertiesEditionPart_ContainsArgumentLabel, new ReferencesTableListener<Argument>() {			
			public void handleAdd() { addToContainsArgument();}
			public void handleEdit(Argument element) { editContainsArgument(element); }
			public void handleMove(Argument element, int oldIndex, int newIndex) { moveContainsArgument(element, oldIndex, newIndex); }
			public void handleRemove(Argument element) { removeFromContainsArgument(element); }
			public void navigateTo(Argument element) { }
		});
		this.containsArgument.setHelpText(propertiesEditionComponent.getHelpContent(ArmViewsRepository.Argument.containsArgument, ArmViewsRepository.SWT_KIND));
		this.containsArgument.createControls(parent);
		GridData containsArgumentData = new GridData(GridData.FILL_HORIZONTAL);
		containsArgumentData.horizontalSpan = 3;
		this.containsArgument.setLayoutData(containsArgumentData);
		this.containsArgument.setLowerBound(0);
		this.containsArgument.setUpperBound(-1);
		containsArgument.setID(ArmViewsRepository.Argument.containsArgument);
		containsArgument.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveContainsArgument(Argument element, int oldIndex, int newIndex) {
		EObject editedElement = containsArgumentEditUtil.foundCorrespondingEObject(element);
		containsArgumentEditUtil.moveElement(element, oldIndex, newIndex);
		containsArgument.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.containsArgument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToContainsArgument() {
		// Start of user code addToContainsArgument() method body
				Argument eObject = ArmFactory.eINSTANCE.createArgument();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						containsArgumentEditUtil.addElement(propertiesEditionObject);
						containsArgument.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.containsArgument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromContainsArgument(Argument element) {
		// Start of user code removeFromContainsArgument() method body
				EObject editedElement = containsArgumentEditUtil.foundCorrespondingEObject(element);
				containsArgumentEditUtil.removeElement(element);
				containsArgument.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.containsArgument, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editContainsArgument(Argument element) {
		// Start of user code editContainsArgument() method body
				EObject editedElement = containsArgumentEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						containsArgumentEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						containsArgument.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, ArmViewsRepository.Argument.containsArgument, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
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
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#setIdentifier(String newValue)
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
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#setDescription(String newValue)
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
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getIsTaggedToAdd()
	 * 
	 */
	public List getIsTaggedToAdd() {
		return isTaggedEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getIsTaggedToRemove()
	 * 
	 */
	public List getIsTaggedToRemove() {
		return isTaggedEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getIsTaggedToEdit()
	 * 
	 */
	public Map getIsTaggedToEdit() {
		return isTaggedEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getIsTaggedToMove()
	 * 
	 */
	public List getIsTaggedToMove() {
		return isTaggedEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getIsTaggedTable()
	 * 
	 */
	public List getIsTaggedTable() {
		return isTaggedEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#updateIsTagged(EObject newValue)
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
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return isTaggedEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getContainsArgumentElementToAdd()
	 * 
	 */
	public List getContainsArgumentElementToAdd() {
		return containsArgumentElementEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getContainsArgumentElementToRemove()
	 * 
	 */
	public List getContainsArgumentElementToRemove() {
		return containsArgumentElementEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getContainsArgumentElementToEdit()
	 * 
	 */
	public Map getContainsArgumentElementToEdit() {
		return containsArgumentElementEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getContainsArgumentElementToMove()
	 * 
	 */
	public List getContainsArgumentElementToMove() {
		return containsArgumentElementEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getContainsArgumentElementTable()
	 * 
	 */
	public List getContainsArgumentElementTable() {
		return containsArgumentElementEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#initContainsArgumentElement(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContainsArgumentElement(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			containsArgumentElementEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			containsArgumentElementEditUtil = new EMFListEditUtil(current, feature);
		this.containsArgumentElement.setInput(containsArgumentElementEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#updateContainsArgumentElement(EObject newValue)
	 * 
	 */
	public void updateContainsArgumentElement(EObject newValue) {
		if(containsArgumentElementEditUtil != null){
			containsArgumentElementEditUtil.reinit(newValue);
			containsArgumentElement.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#addFilterContainsArgumentElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainsArgumentElement(ViewerFilter filter) {
		containsArgumentElementFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#addBusinessFilterContainsArgumentElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainsArgumentElement(ViewerFilter filter) {
		containsArgumentElementBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#isContainedInContainsArgumentElementTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainsArgumentElementTable(EObject element) {
		return containsArgumentElementEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getContainsArgumentLinkToAdd()
	 * 
	 */
	public List getContainsArgumentLinkToAdd() {
		return containsArgumentLinkEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getContainsArgumentLinkToRemove()
	 * 
	 */
	public List getContainsArgumentLinkToRemove() {
		return containsArgumentLinkEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getContainsArgumentLinkToEdit()
	 * 
	 */
	public Map getContainsArgumentLinkToEdit() {
		return containsArgumentLinkEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getContainsArgumentLinkToMove()
	 * 
	 */
	public List getContainsArgumentLinkToMove() {
		return containsArgumentLinkEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getContainsArgumentLinkTable()
	 * 
	 */
	public List getContainsArgumentLinkTable() {
		return containsArgumentLinkEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#initContainsArgumentLink(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContainsArgumentLink(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			containsArgumentLinkEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			containsArgumentLinkEditUtil = new EMFListEditUtil(current, feature);
		this.containsArgumentLink.setInput(containsArgumentLinkEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#updateContainsArgumentLink(EObject newValue)
	 * 
	 */
	public void updateContainsArgumentLink(EObject newValue) {
		if(containsArgumentLinkEditUtil != null){
			containsArgumentLinkEditUtil.reinit(newValue);
			containsArgumentLink.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#addFilterContainsArgumentLink(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainsArgumentLink(ViewerFilter filter) {
		containsArgumentLinkFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#addBusinessFilterContainsArgumentLink(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainsArgumentLink(ViewerFilter filter) {
		containsArgumentLinkBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#isContainedInContainsArgumentLinkTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainsArgumentLinkTable(EObject element) {
		return containsArgumentLinkEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getContainsArgumentToAdd()
	 * 
	 */
	public List getContainsArgumentToAdd() {
		return containsArgumentEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getContainsArgumentToRemove()
	 * 
	 */
	public List getContainsArgumentToRemove() {
		return containsArgumentEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getContainsArgumentToEdit()
	 * 
	 */
	public Map getContainsArgumentToEdit() {
		return containsArgumentEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getContainsArgumentToMove()
	 * 
	 */
	public List getContainsArgumentToMove() {
		return containsArgumentEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#getContainsArgumentTable()
	 * 
	 */
	public List getContainsArgumentTable() {
		return containsArgumentEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#initContainsArgument(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContainsArgument(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			containsArgumentEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			containsArgumentEditUtil = new EMFListEditUtil(current, feature);
		this.containsArgument.setInput(containsArgumentEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#updateContainsArgument(EObject newValue)
	 * 
	 */
	public void updateContainsArgument(EObject newValue) {
		if(containsArgumentEditUtil != null){
			containsArgumentEditUtil.reinit(newValue);
			containsArgument.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#addFilterContainsArgument(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainsArgument(ViewerFilter filter) {
		containsArgumentFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#addBusinessFilterContainsArgument(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainsArgument(ViewerFilter filter) {
		containsArgumentBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.ArgumentPropertiesEditionPart#isContainedInContainsArgumentTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainsArgumentTable(EObject element) {
		return containsArgumentEditUtil.contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ArmMessages.Argument_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
