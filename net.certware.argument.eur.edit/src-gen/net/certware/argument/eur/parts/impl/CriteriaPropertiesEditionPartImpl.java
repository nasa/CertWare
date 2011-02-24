/**
 * Copyright (c) United States Government as represented by the National Aeronautics and Space Administration.
 * All rights reserved.
 */
package net.certware.argument.eur.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.eur.Assumption;
import net.certware.argument.eur.Context;
import net.certware.argument.eur.EurPackage;
import net.certware.argument.eur.parts.CriteriaPropertiesEditionPart;
import net.certware.argument.eur.parts.EurViewsRepository;
import net.certware.argument.eur.providers.EurMessages;

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
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
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
 * @author mrb
 * 
 */
public class CriteriaPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, CriteriaPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected EMFListEditUtil isTaggedEditUtil;
	protected ReferencesTable<? extends EObject> isTagged;
	protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil contextEditUtil;
	protected ReferencesTable<? extends EObject> context;
	protected List<ViewerFilter> contextBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> contextFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil assumptionEditUtil;
	protected ReferencesTable<? extends EObject> assumption;
	protected List<ViewerFilter> assumptionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> assumptionFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CriteriaPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(EurMessages.CriteriaPropertiesEditionPart_PropertiesGroupLabel);
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
		createContextAdvancedReferencesTable(propertiesGroup);
		createAssumptionAdvancedReferencesTable(propertiesGroup);
	}

	
	protected void createIdentifierText(Composite parent) {
		SWTUtils.createPartLabel(parent, EurMessages.CriteriaPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Criteria.identifier, EurViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartImpl.this, EurViewsRepository.Criteria.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartImpl.this, EurViewsRepository.Criteria.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, EurViewsRepository.Criteria.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Criteria.identifier, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, EurMessages.CriteriaPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Criteria.description, EurViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartImpl.this, EurViewsRepository.Criteria.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartImpl.this, EurViewsRepository.Criteria.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, EurViewsRepository.Criteria.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Criteria.description, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createContentTextarea(Composite parent) {
		Label contentLabel = SWTUtils.createPartLabel(parent, EurMessages.CriteriaPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Criteria.content, EurViewsRepository.SWT_KIND));
		GridData contentLabelData = new GridData(GridData.FILL_HORIZONTAL);
		contentLabelData.horizontalSpan = 3;
		contentLabel.setLayoutData(contentLabelData);
		content = new Text(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		contentData.horizontalSpan = 2;
		contentData.heightHint = 80;
		contentData.widthHint = 200;
		content.setLayoutData(contentData);
		EditingUtils.setID(content, EurViewsRepository.Criteria.content);
		EditingUtils.setEEFtype(content, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Criteria.content, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createIsTaggedAdvancedTableComposition(Composite parent) {
		this.isTagged = new ReferencesTable<TaggedValue>(EurMessages.CriteriaPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener<TaggedValue>() {			
			public void handleAdd() { addToIsTagged();}
			public void handleEdit(TaggedValue element) { editIsTagged(element); }
			public void handleMove(TaggedValue element, int oldIndex, int newIndex) { moveIsTagged(element, oldIndex, newIndex); }
			public void handleRemove(TaggedValue element) { removeFromIsTagged(element); }
			public void navigateTo(TaggedValue element) { }
		});
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Criteria.isTagged, EurViewsRepository.SWT_KIND));
		this.isTagged.createControls(parent);
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(EurViewsRepository.Criteria.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveIsTagged(TaggedValue element, int oldIndex, int newIndex) {
		EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
		isTaggedEditUtil.moveElement(element, oldIndex, newIndex);
		isTagged.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartImpl.this, EurViewsRepository.Criteria.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartImpl.this, EurViewsRepository.Criteria.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
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
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartImpl.this, EurViewsRepository.Criteria.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartImpl.this, EurViewsRepository.Criteria.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * 
	 */
	protected void createContextAdvancedReferencesTable(Composite parent) {
		this.context = new ReferencesTable<Context>(EurMessages.CriteriaPropertiesEditionPart_ContextLabel, new ReferencesTableListener<Context>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<Context> dialog = new TabElementTreeSelectionDialog<Context>(resourceSet, contextFilters, contextBusinessFilters,
				"Context", EurPackage.eINSTANCE.getContext(), current.eResource()) {

					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!contextEditUtil.getVirtualList().contains(elem))
								contextEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartImpl.this, EurViewsRepository.Criteria.context,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						context.refresh();
					}

				};
				dialog.open();
			}
			public void handleEdit(Context element) { editContext(element); }
			public void handleMove(Context element, int oldIndex, int newIndex) { moveContext(element, oldIndex, newIndex); }
			public void handleRemove(Context element) { removeFromContext(element); }
			public void navigateTo(Context element) { }
		});
		this.context.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Criteria.context, EurViewsRepository.SWT_KIND));
		this.context.createControls(parent);
		GridData contextData = new GridData(GridData.FILL_HORIZONTAL);
		contextData.horizontalSpan = 3;
		this.context.setLayoutData(contextData);
		this.context.disableMove();
		context.setID(EurViewsRepository.Criteria.context);
		context.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveContext(Context element, int oldIndex, int newIndex) {
		EObject editedElement = contextEditUtil.foundCorrespondingEObject(element);
		contextEditUtil.moveElement(element, oldIndex, newIndex);
		context.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartImpl.this, EurViewsRepository.Criteria.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromContext(Context element) {

		// Start of user code removeFromContext() method body
				EObject editedElement = contextEditUtil.foundCorrespondingEObject(element);
				contextEditUtil.removeElement(element);
				context.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartImpl.this, EurViewsRepository.Criteria.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code

	}

	/**
	 * 
	 */
	protected void editContext(Context element) {

		// Start of user code editContext() method body
				EObject editedElement = contextEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						contextEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						context.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartImpl.this, EurViewsRepository.Criteria.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
				
		// End of user code

	}

	/**
	 * 
	 */
	protected void createAssumptionAdvancedReferencesTable(Composite parent) {
		this.assumption = new ReferencesTable<Assumption>(EurMessages.CriteriaPropertiesEditionPart_AssumptionLabel, new ReferencesTableListener<Assumption>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<Assumption> dialog = new TabElementTreeSelectionDialog<Assumption>(resourceSet, assumptionFilters, assumptionBusinessFilters,
				"Assumption", EurPackage.eINSTANCE.getAssumption(), current.eResource()) {

					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!assumptionEditUtil.getVirtualList().contains(elem))
								assumptionEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartImpl.this, EurViewsRepository.Criteria.assumption,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						assumption.refresh();
					}

				};
				dialog.open();
			}
			public void handleEdit(Assumption element) { editAssumption(element); }
			public void handleMove(Assumption element, int oldIndex, int newIndex) { moveAssumption(element, oldIndex, newIndex); }
			public void handleRemove(Assumption element) { removeFromAssumption(element); }
			public void navigateTo(Assumption element) { }
		});
		this.assumption.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Criteria.assumption, EurViewsRepository.SWT_KIND));
		this.assumption.createControls(parent);
		GridData assumptionData = new GridData(GridData.FILL_HORIZONTAL);
		assumptionData.horizontalSpan = 3;
		this.assumption.setLayoutData(assumptionData);
		this.assumption.disableMove();
		assumption.setID(EurViewsRepository.Criteria.assumption);
		assumption.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveAssumption(Assumption element, int oldIndex, int newIndex) {
		EObject editedElement = assumptionEditUtil.foundCorrespondingEObject(element);
		assumptionEditUtil.moveElement(element, oldIndex, newIndex);
		assumption.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartImpl.this, EurViewsRepository.Criteria.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromAssumption(Assumption element) {

		// Start of user code removeFromAssumption() method body
				EObject editedElement = assumptionEditUtil.foundCorrespondingEObject(element);
				assumptionEditUtil.removeElement(element);
				assumption.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartImpl.this, EurViewsRepository.Criteria.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code

	}

	/**
	 * 
	 */
	protected void editAssumption(Assumption element) {

		// Start of user code editAssumption() method body
				EObject editedElement = assumptionEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						assumptionEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						assumption.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CriteriaPropertiesEditionPartImpl.this, EurViewsRepository.Criteria.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#setIdentifier(String newValue)
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
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#setDescription(String newValue)
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
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#setContent(String newValue)
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
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#getIsTaggedToAdd()
	 * 
	 */
	public List getIsTaggedToAdd() {
		return isTaggedEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#getIsTaggedToRemove()
	 * 
	 */
	public List getIsTaggedToRemove() {
		return isTaggedEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#getIsTaggedToEdit()
	 * 
	 */
	public Map getIsTaggedToEdit() {
		return isTaggedEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#getIsTaggedToMove()
	 * 
	 */
	public List getIsTaggedToMove() {
		return isTaggedEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#getIsTaggedTable()
	 * 
	 */
	public List getIsTaggedTable() {
		return isTaggedEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#updateIsTagged(EObject newValue)
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
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return isTaggedEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#getContextToAdd()
	 * 
	 */
	public List getContextToAdd() {
		return contextEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#getContextToRemove()
	 * 
	 */
	public List getContextToRemove() {
		return contextEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#getContextTable()
	 * 
	 */
	public List getContextTable() {
		return contextEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#initContext(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContext(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			contextEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			contextEditUtil = new EMFListEditUtil(current, feature);
		this.context.setInput(contextEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#updateContext(EObject newValue)
	 * 
	 */
	public void updateContext(EObject newValue) {
		if(contextEditUtil != null){
			contextEditUtil.reinit(newValue);
			context.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#addFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContext(ViewerFilter filter) {
		contextFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#addBusinessFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContext(ViewerFilter filter) {
		contextBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#isContainedInContextTable(EObject element)
	 * 
	 */
	public boolean isContainedInContextTable(EObject element) {
		return contextEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#getAssumptionToAdd()
	 * 
	 */
	public List getAssumptionToAdd() {
		return assumptionEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#getAssumptionToRemove()
	 * 
	 */
	public List getAssumptionToRemove() {
		return assumptionEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#getAssumptionTable()
	 * 
	 */
	public List getAssumptionTable() {
		return assumptionEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#initAssumption(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAssumption(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			assumptionEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			assumptionEditUtil = new EMFListEditUtil(current, feature);
		this.assumption.setInput(assumptionEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#updateAssumption(EObject newValue)
	 * 
	 */
	public void updateAssumption(EObject newValue) {
		if(assumptionEditUtil != null){
			assumptionEditUtil.reinit(newValue);
			assumption.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#addFilterAssumption(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAssumption(ViewerFilter filter) {
		assumptionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#addBusinessFilterAssumption(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAssumption(ViewerFilter filter) {
		assumptionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.CriteriaPropertiesEditionPart#isContainedInAssumptionTable(EObject element)
	 * 
	 */
	public boolean isContainedInAssumptionTable(EObject element) {
		return assumptionEditUtil.contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EurMessages.Criteria_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
