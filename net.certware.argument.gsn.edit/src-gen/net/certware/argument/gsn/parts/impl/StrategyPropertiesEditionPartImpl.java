/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.gsn.Context;
import net.certware.argument.gsn.Goal;
import net.certware.argument.gsn.GsnFactory;
import net.certware.argument.gsn.Justification;
import net.certware.argument.gsn.Solution;
import net.certware.argument.gsn.parts.GsnViewsRepository;
import net.certware.argument.gsn.parts.StrategyPropertiesEditionPart;
import net.certware.argument.gsn.providers.GsnMessages;

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
 * 
 * 
 */
public class StrategyPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, StrategyPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected EMFListEditUtil isTaggedEditUtil;
	protected ReferencesTable<? extends EObject> isTagged;
	protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil goalsEditUtil;
	protected ReferencesTable<? extends EObject> goals;
	protected List<ViewerFilter> goalsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> goalsFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil justificationsEditUtil;
	protected ReferencesTable<? extends EObject> justifications;
	protected List<ViewerFilter> justificationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> justificationsFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil strategyContextsEditUtil;
	protected ReferencesTable<? extends EObject> strategyContexts;
	protected List<ViewerFilter> strategyContextsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> strategyContextsFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil strategySolutionsEditUtil;
	protected ReferencesTable<? extends EObject> strategySolutions;
	protected List<ViewerFilter> strategySolutionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> strategySolutionsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public StrategyPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(GsnMessages.StrategyPropertiesEditionPart_PropertiesGroupLabel);
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
		createGoalsAdvancedTableComposition(propertiesGroup);
		createJustificationsAdvancedTableComposition(propertiesGroup);
		createStrategyContextsAdvancedTableComposition(propertiesGroup);
		createStrategySolutionsAdvancedTableComposition(propertiesGroup);
	}

	
	protected void createIdentifierText(Composite parent) {
		SWTUtils.createPartLabel(parent, GsnMessages.StrategyPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Strategy.identifier, GsnViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, GsnViewsRepository.Strategy.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.identifier, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, GsnMessages.StrategyPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Strategy.description, GsnViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, GsnViewsRepository.Strategy.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.description, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createContentTextarea(Composite parent) {
		Label contentLabel = SWTUtils.createPartLabel(parent, GsnMessages.StrategyPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Strategy.content, GsnViewsRepository.SWT_KIND));
		GridData contentLabelData = new GridData(GridData.FILL_HORIZONTAL);
		contentLabelData.horizontalSpan = 3;
		contentLabel.setLayoutData(contentLabelData);
		content = new Text(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		contentData.horizontalSpan = 2;
		contentData.heightHint = 80;
		contentData.widthHint = 200;
		content.setLayoutData(contentData);
		EditingUtils.setID(content, GsnViewsRepository.Strategy.content);
		EditingUtils.setEEFtype(content, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.content, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createIsTaggedAdvancedTableComposition(Composite parent) {
		this.isTagged = new ReferencesTable<TaggedValue>(GsnMessages.StrategyPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener<TaggedValue>() {			
			public void handleAdd() { addToIsTagged();}
			public void handleEdit(TaggedValue element) { editIsTagged(element); }
			public void handleMove(TaggedValue element, int oldIndex, int newIndex) { moveIsTagged(element, oldIndex, newIndex); }
			public void handleRemove(TaggedValue element) { removeFromIsTagged(element); }
			public void navigateTo(TaggedValue element) { }
		});
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.isTagged, GsnViewsRepository.SWT_KIND));
		this.isTagged.createControls(parent);
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(GsnViewsRepository.Strategy.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveIsTagged(TaggedValue element, int oldIndex, int newIndex) {
		EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
		isTaggedEditUtil.moveElement(element, oldIndex, newIndex);
		isTagged.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
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
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createGoalsAdvancedTableComposition(Composite parent) {
		this.goals = new ReferencesTable<Goal>(GsnMessages.StrategyPropertiesEditionPart_GoalsLabel, new ReferencesTableListener<Goal>() {			
			public void handleAdd() { addToGoals();}
			public void handleEdit(Goal element) { editGoals(element); }
			public void handleMove(Goal element, int oldIndex, int newIndex) { moveGoals(element, oldIndex, newIndex); }
			public void handleRemove(Goal element) { removeFromGoals(element); }
			public void navigateTo(Goal element) { }
		});
		this.goals.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.goals, GsnViewsRepository.SWT_KIND));
		this.goals.createControls(parent);
		GridData goalsData = new GridData(GridData.FILL_HORIZONTAL);
		goalsData.horizontalSpan = 3;
		this.goals.setLayoutData(goalsData);
		this.goals.setLowerBound(0);
		this.goals.setUpperBound(-1);
		goals.setID(GsnViewsRepository.Strategy.goals);
		goals.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveGoals(Goal element, int oldIndex, int newIndex) {
		EObject editedElement = goalsEditUtil.foundCorrespondingEObject(element);
		goalsEditUtil.moveElement(element, oldIndex, newIndex);
		goals.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.goals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToGoals() {
		// Start of user code addToGoals() method body
				Goal eObject = GsnFactory.eINSTANCE.createGoal();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						goalsEditUtil.addElement(propertiesEditionObject);
						goals.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.goals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromGoals(Goal element) {
		// Start of user code removeFromGoals() method body
				EObject editedElement = goalsEditUtil.foundCorrespondingEObject(element);
				goalsEditUtil.removeElement(element);
				goals.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.goals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code
	}

	/**
	 *  
	 */
	protected void editGoals(Goal element) {
		// Start of user code editGoals() method body
				EObject editedElement = goalsEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						goalsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						goals.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.goals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
				
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createJustificationsAdvancedTableComposition(Composite parent) {
		this.justifications = new ReferencesTable<Justification>(GsnMessages.StrategyPropertiesEditionPart_JustificationsLabel, new ReferencesTableListener<Justification>() {			
			public void handleAdd() { addToJustifications();}
			public void handleEdit(Justification element) { editJustifications(element); }
			public void handleMove(Justification element, int oldIndex, int newIndex) { moveJustifications(element, oldIndex, newIndex); }
			public void handleRemove(Justification element) { removeFromJustifications(element); }
			public void navigateTo(Justification element) { }
		});
		this.justifications.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.justifications, GsnViewsRepository.SWT_KIND));
		this.justifications.createControls(parent);
		GridData justificationsData = new GridData(GridData.FILL_HORIZONTAL);
		justificationsData.horizontalSpan = 3;
		this.justifications.setLayoutData(justificationsData);
		this.justifications.setLowerBound(0);
		this.justifications.setUpperBound(-1);
		justifications.setID(GsnViewsRepository.Strategy.justifications);
		justifications.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveJustifications(Justification element, int oldIndex, int newIndex) {
		EObject editedElement = justificationsEditUtil.foundCorrespondingEObject(element);
		justificationsEditUtil.moveElement(element, oldIndex, newIndex);
		justifications.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.justifications, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToJustifications() {
		// Start of user code addToJustifications() method body
				Justification eObject = GsnFactory.eINSTANCE.createJustification();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						justificationsEditUtil.addElement(propertiesEditionObject);
						justifications.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.justifications, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromJustifications(Justification element) {
		// Start of user code removeFromJustifications() method body
				EObject editedElement = justificationsEditUtil.foundCorrespondingEObject(element);
				justificationsEditUtil.removeElement(element);
				justifications.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.justifications, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code
	}

	/**
	 *  
	 */
	protected void editJustifications(Justification element) {
		// Start of user code editJustifications() method body
				EObject editedElement = justificationsEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						justificationsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						justifications.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.justifications, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
				
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createStrategyContextsAdvancedTableComposition(Composite parent) {
		this.strategyContexts = new ReferencesTable<Context>(GsnMessages.StrategyPropertiesEditionPart_StrategyContextsLabel, new ReferencesTableListener<Context>() {			
			public void handleAdd() { addToStrategyContexts();}
			public void handleEdit(Context element) { editStrategyContexts(element); }
			public void handleMove(Context element, int oldIndex, int newIndex) { moveStrategyContexts(element, oldIndex, newIndex); }
			public void handleRemove(Context element) { removeFromStrategyContexts(element); }
			public void navigateTo(Context element) { }
		});
		this.strategyContexts.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.strategyContexts, GsnViewsRepository.SWT_KIND));
		this.strategyContexts.createControls(parent);
		GridData strategyContextsData = new GridData(GridData.FILL_HORIZONTAL);
		strategyContextsData.horizontalSpan = 3;
		this.strategyContexts.setLayoutData(strategyContextsData);
		this.strategyContexts.setLowerBound(0);
		this.strategyContexts.setUpperBound(-1);
		strategyContexts.setID(GsnViewsRepository.Strategy.strategyContexts);
		strategyContexts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveStrategyContexts(Context element, int oldIndex, int newIndex) {
		EObject editedElement = strategyContextsEditUtil.foundCorrespondingEObject(element);
		strategyContextsEditUtil.moveElement(element, oldIndex, newIndex);
		strategyContexts.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.strategyContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToStrategyContexts() {
		// Start of user code addToStrategyContexts() method body
				Context eObject = GsnFactory.eINSTANCE.createContext();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						strategyContextsEditUtil.addElement(propertiesEditionObject);
						strategyContexts.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.strategyContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromStrategyContexts(Context element) {
		// Start of user code removeFromStrategyContexts() method body
				EObject editedElement = strategyContextsEditUtil.foundCorrespondingEObject(element);
				strategyContextsEditUtil.removeElement(element);
				strategyContexts.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.strategyContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code
	}

	/**
	 *  
	 */
	protected void editStrategyContexts(Context element) {
		// Start of user code editStrategyContexts() method body
				EObject editedElement = strategyContextsEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						strategyContextsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						strategyContexts.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.strategyContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
				
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createStrategySolutionsAdvancedTableComposition(Composite parent) {
		this.strategySolutions = new ReferencesTable<Solution>(GsnMessages.StrategyPropertiesEditionPart_StrategySolutionsLabel, new ReferencesTableListener<Solution>() {			
			public void handleAdd() { addToStrategySolutions();}
			public void handleEdit(Solution element) { editStrategySolutions(element); }
			public void handleMove(Solution element, int oldIndex, int newIndex) { moveStrategySolutions(element, oldIndex, newIndex); }
			public void handleRemove(Solution element) { removeFromStrategySolutions(element); }
			public void navigateTo(Solution element) { }
		});
		this.strategySolutions.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.strategySolutions, GsnViewsRepository.SWT_KIND));
		this.strategySolutions.createControls(parent);
		GridData strategySolutionsData = new GridData(GridData.FILL_HORIZONTAL);
		strategySolutionsData.horizontalSpan = 3;
		this.strategySolutions.setLayoutData(strategySolutionsData);
		this.strategySolutions.setLowerBound(0);
		this.strategySolutions.setUpperBound(-1);
		strategySolutions.setID(GsnViewsRepository.Strategy.strategySolutions);
		strategySolutions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveStrategySolutions(Solution element, int oldIndex, int newIndex) {
		EObject editedElement = strategySolutionsEditUtil.foundCorrespondingEObject(element);
		strategySolutionsEditUtil.moveElement(element, oldIndex, newIndex);
		strategySolutions.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.strategySolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToStrategySolutions() {
		// Start of user code addToStrategySolutions() method body
				Solution eObject = GsnFactory.eINSTANCE.createSolution();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						strategySolutionsEditUtil.addElement(propertiesEditionObject);
						strategySolutions.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.strategySolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromStrategySolutions(Solution element) {
		// Start of user code removeFromStrategySolutions() method body
				EObject editedElement = strategySolutionsEditUtil.foundCorrespondingEObject(element);
				strategySolutionsEditUtil.removeElement(element);
				strategySolutions.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.strategySolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code
	}

	/**
	 *  
	 */
	protected void editStrategySolutions(Solution element) {
		// Start of user code editStrategySolutions() method body
				EObject editedElement = strategySolutionsEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						strategySolutionsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						strategySolutions.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.strategySolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#setIdentifier(String newValue)
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#setDescription(String newValue)
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#setContent(String newValue)
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getIsTaggedToAdd()
	 * 
	 */
	public List getIsTaggedToAdd() {
		return isTaggedEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getIsTaggedToRemove()
	 * 
	 */
	public List getIsTaggedToRemove() {
		return isTaggedEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getIsTaggedToEdit()
	 * 
	 */
	public Map getIsTaggedToEdit() {
		return isTaggedEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getIsTaggedToMove()
	 * 
	 */
	public List getIsTaggedToMove() {
		return isTaggedEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getIsTaggedTable()
	 * 
	 */
	public List getIsTaggedTable() {
		return isTaggedEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#updateIsTagged(EObject newValue)
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return isTaggedEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getGoalsToAdd()
	 * 
	 */
	public List getGoalsToAdd() {
		return goalsEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getGoalsToRemove()
	 * 
	 */
	public List getGoalsToRemove() {
		return goalsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getGoalsToEdit()
	 * 
	 */
	public Map getGoalsToEdit() {
		return goalsEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getGoalsToMove()
	 * 
	 */
	public List getGoalsToMove() {
		return goalsEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getGoalsTable()
	 * 
	 */
	public List getGoalsTable() {
		return goalsEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#initGoals(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initGoals(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			goalsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			goalsEditUtil = new EMFListEditUtil(current, feature);
		this.goals.setInput(goalsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#updateGoals(EObject newValue)
	 * 
	 */
	public void updateGoals(EObject newValue) {
		if(goalsEditUtil != null){
			goalsEditUtil.reinit(newValue);
			goals.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addFilterGoals(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGoals(ViewerFilter filter) {
		goalsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addBusinessFilterGoals(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGoals(ViewerFilter filter) {
		goalsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#isContainedInGoalsTable(EObject element)
	 * 
	 */
	public boolean isContainedInGoalsTable(EObject element) {
		return goalsEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getJustificationsToAdd()
	 * 
	 */
	public List getJustificationsToAdd() {
		return justificationsEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getJustificationsToRemove()
	 * 
	 */
	public List getJustificationsToRemove() {
		return justificationsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getJustificationsToEdit()
	 * 
	 */
	public Map getJustificationsToEdit() {
		return justificationsEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getJustificationsToMove()
	 * 
	 */
	public List getJustificationsToMove() {
		return justificationsEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getJustificationsTable()
	 * 
	 */
	public List getJustificationsTable() {
		return justificationsEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#initJustifications(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initJustifications(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			justificationsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			justificationsEditUtil = new EMFListEditUtil(current, feature);
		this.justifications.setInput(justificationsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#updateJustifications(EObject newValue)
	 * 
	 */
	public void updateJustifications(EObject newValue) {
		if(justificationsEditUtil != null){
			justificationsEditUtil.reinit(newValue);
			justifications.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addFilterJustifications(ViewerFilter filter)
	 * 
	 */
	public void addFilterToJustifications(ViewerFilter filter) {
		justificationsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addBusinessFilterJustifications(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToJustifications(ViewerFilter filter) {
		justificationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#isContainedInJustificationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInJustificationsTable(EObject element) {
		return justificationsEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getStrategyContextsToAdd()
	 * 
	 */
	public List getStrategyContextsToAdd() {
		return strategyContextsEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getStrategyContextsToRemove()
	 * 
	 */
	public List getStrategyContextsToRemove() {
		return strategyContextsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getStrategyContextsToEdit()
	 * 
	 */
	public Map getStrategyContextsToEdit() {
		return strategyContextsEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getStrategyContextsToMove()
	 * 
	 */
	public List getStrategyContextsToMove() {
		return strategyContextsEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getStrategyContextsTable()
	 * 
	 */
	public List getStrategyContextsTable() {
		return strategyContextsEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#initStrategyContexts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initStrategyContexts(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			strategyContextsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			strategyContextsEditUtil = new EMFListEditUtil(current, feature);
		this.strategyContexts.setInput(strategyContextsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#updateStrategyContexts(EObject newValue)
	 * 
	 */
	public void updateStrategyContexts(EObject newValue) {
		if(strategyContextsEditUtil != null){
			strategyContextsEditUtil.reinit(newValue);
			strategyContexts.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addFilterStrategyContexts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStrategyContexts(ViewerFilter filter) {
		strategyContextsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addBusinessFilterStrategyContexts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStrategyContexts(ViewerFilter filter) {
		strategyContextsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#isContainedInStrategyContextsTable(EObject element)
	 * 
	 */
	public boolean isContainedInStrategyContextsTable(EObject element) {
		return strategyContextsEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getStrategySolutionsToAdd()
	 * 
	 */
	public List getStrategySolutionsToAdd() {
		return strategySolutionsEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getStrategySolutionsToRemove()
	 * 
	 */
	public List getStrategySolutionsToRemove() {
		return strategySolutionsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getStrategySolutionsToEdit()
	 * 
	 */
	public Map getStrategySolutionsToEdit() {
		return strategySolutionsEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getStrategySolutionsToMove()
	 * 
	 */
	public List getStrategySolutionsToMove() {
		return strategySolutionsEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getStrategySolutionsTable()
	 * 
	 */
	public List getStrategySolutionsTable() {
		return strategySolutionsEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#initStrategySolutions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initStrategySolutions(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			strategySolutionsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			strategySolutionsEditUtil = new EMFListEditUtil(current, feature);
		this.strategySolutions.setInput(strategySolutionsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#updateStrategySolutions(EObject newValue)
	 * 
	 */
	public void updateStrategySolutions(EObject newValue) {
		if(strategySolutionsEditUtil != null){
			strategySolutionsEditUtil.reinit(newValue);
			strategySolutions.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addFilterStrategySolutions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStrategySolutions(ViewerFilter filter) {
		strategySolutionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addBusinessFilterStrategySolutions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStrategySolutions(ViewerFilter filter) {
		strategySolutionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#isContainedInStrategySolutionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInStrategySolutionsTable(EObject element) {
		return strategySolutionsEditUtil.contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return GsnMessages.Strategy_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
