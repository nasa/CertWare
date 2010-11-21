/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.gsn.Assumption;
import net.certware.argument.gsn.Context;
import net.certware.argument.gsn.Goal;
import net.certware.argument.gsn.GsnFactory;
import net.certware.argument.gsn.GsnPackage;
import net.certware.argument.gsn.Solution;
import net.certware.argument.gsn.Strategy;
import net.certware.argument.gsn.parts.GoalPropertiesEditionPart;
import net.certware.argument.gsn.parts.GsnViewsRepository;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;



// End of user code	

/**
 * 
 * 
 */
public class GoalPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, GoalPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected EMFListEditUtil isTaggedEditUtil;
	protected ReferencesTable<? extends EObject> isTagged;
	protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected Button assumed;
	protected Button toBeSupported;
	protected EMFListEditUtil strategyEditUtil;
	protected ReferencesTable<? extends EObject> strategy;
	protected List<ViewerFilter> strategyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> strategyFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil assumptionEditUtil;
	protected ReferencesTable<? extends EObject> assumption;
	protected List<ViewerFilter> assumptionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> assumptionFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil contextEditUtil;
	protected ReferencesTable<? extends EObject> context;
	protected List<ViewerFilter> contextBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> contextFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil solutionEditUtil;
	protected ReferencesTable<? extends EObject> solution;
	protected List<ViewerFilter> solutionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> solutionFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil subgoalEditUtil;
	protected ReferencesTable<? extends EObject> subgoal;
	protected List<ViewerFilter> subgoalBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> subgoalFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GoalPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(GsnMessages.GoalPropertiesEditionPart_PropertiesGroupLabel);
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
		createAssumedCheckbox(propertiesGroup);
		createToBeSupportedCheckbox(propertiesGroup);
		createStrategyAdvancedTableComposition(propertiesGroup);
		createAssumptionAdvancedTableComposition(propertiesGroup);
		createContextAdvancedTableComposition(propertiesGroup);
		createSolutionAdvancedTableComposition(propertiesGroup);
		createSubgoalAdvancedReferencesTable(propertiesGroup);
	}

	
	protected void createIdentifierText(Composite parent) {
		SWTUtils.createPartLabel(parent, GsnMessages.GoalPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Goal.identifier, GsnViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, GsnViewsRepository.Goal.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.identifier, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, GsnMessages.GoalPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Goal.description, GsnViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, GsnViewsRepository.Goal.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.description, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createContentText(Composite parent) {
		SWTUtils.createPartLabel(parent, GsnMessages.GoalPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Goal.content, GsnViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}

		});
		EditingUtils.setID(content, GsnViewsRepository.Goal.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.content, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createIsTaggedAdvancedTableComposition(Composite parent) {
		this.isTagged = new ReferencesTable<TaggedValue>(GsnMessages.GoalPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener<TaggedValue>() {			
			public void handleAdd() { addToIsTagged();}
			public void handleEdit(TaggedValue element) { editIsTagged(element); }
			public void handleMove(TaggedValue element, int oldIndex, int newIndex) { moveIsTagged(element, oldIndex, newIndex); }
			public void handleRemove(TaggedValue element) { removeFromIsTagged(element); }
			public void navigateTo(TaggedValue element) { }
		});
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.isTagged, GsnViewsRepository.SWT_KIND));
		this.isTagged.createControls(parent);
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(GsnViewsRepository.Goal.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveIsTagged(TaggedValue element, int oldIndex, int newIndex) {
		EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
		isTaggedEditUtil.moveElement(element, oldIndex, newIndex);
		isTagged.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
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
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	
	protected void createAssumedCheckbox(Composite parent) {
		assumed = new Button(parent, SWT.CHECK);
		assumed.setText(GsnMessages.GoalPropertiesEditionPart_AssumedLabel);
		GridData assumedData = new GridData(GridData.FILL_HORIZONTAL);
		assumedData.horizontalSpan = 2;
		assumed.setLayoutData(assumedData);
		EditingUtils.setID(assumed, GsnViewsRepository.Goal.assumed);
		EditingUtils.setEEFtype(assumed, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.assumed, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createToBeSupportedCheckbox(Composite parent) {
		toBeSupported = new Button(parent, SWT.CHECK);
		toBeSupported.setText(GsnMessages.GoalPropertiesEditionPart_ToBeSupportedLabel);
		GridData toBeSupportedData = new GridData(GridData.FILL_HORIZONTAL);
		toBeSupportedData.horizontalSpan = 2;
		toBeSupported.setLayoutData(toBeSupportedData);
		EditingUtils.setID(toBeSupported, GsnViewsRepository.Goal.toBeSupported);
		EditingUtils.setEEFtype(toBeSupported, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.toBeSupported, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createStrategyAdvancedTableComposition(Composite parent) {
		this.strategy = new ReferencesTable<Strategy>(GsnMessages.GoalPropertiesEditionPart_StrategyLabel, new ReferencesTableListener<Strategy>() {			
			public void handleAdd() { addToStrategy();}
			public void handleEdit(Strategy element) { editStrategy(element); }
			public void handleMove(Strategy element, int oldIndex, int newIndex) { moveStrategy(element, oldIndex, newIndex); }
			public void handleRemove(Strategy element) { removeFromStrategy(element); }
			public void navigateTo(Strategy element) { }
		});
		this.strategy.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.strategy, GsnViewsRepository.SWT_KIND));
		this.strategy.createControls(parent);
		GridData strategyData = new GridData(GridData.FILL_HORIZONTAL);
		strategyData.horizontalSpan = 3;
		this.strategy.setLayoutData(strategyData);
		this.strategy.setLowerBound(0);
		this.strategy.setUpperBound(-1);
		strategy.setID(GsnViewsRepository.Goal.strategy);
		strategy.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveStrategy(Strategy element, int oldIndex, int newIndex) {
		EObject editedElement = strategyEditUtil.foundCorrespondingEObject(element);
		strategyEditUtil.moveElement(element, oldIndex, newIndex);
		strategy.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.strategy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToStrategy() {
		// Start of user code addToStrategy() method body
				Strategy eObject = GsnFactory.eINSTANCE.createStrategy();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						strategyEditUtil.addElement(propertiesEditionObject);
						strategy.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.strategy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromStrategy(Strategy element) {
		// Start of user code removeFromStrategy() method body
				EObject editedElement = strategyEditUtil.foundCorrespondingEObject(element);
				strategyEditUtil.removeElement(element);
				strategy.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.strategy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editStrategy(Strategy element) {
		// Start of user code editStrategy() method body
				EObject editedElement = strategyEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						strategyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						strategy.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.strategy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createAssumptionAdvancedTableComposition(Composite parent) {
		this.assumption = new ReferencesTable<Assumption>(GsnMessages.GoalPropertiesEditionPart_AssumptionLabel, new ReferencesTableListener<Assumption>() {			
			public void handleAdd() { addToAssumption();}
			public void handleEdit(Assumption element) { editAssumption(element); }
			public void handleMove(Assumption element, int oldIndex, int newIndex) { moveAssumption(element, oldIndex, newIndex); }
			public void handleRemove(Assumption element) { removeFromAssumption(element); }
			public void navigateTo(Assumption element) { }
		});
		this.assumption.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.assumption, GsnViewsRepository.SWT_KIND));
		this.assumption.createControls(parent);
		GridData assumptionData = new GridData(GridData.FILL_HORIZONTAL);
		assumptionData.horizontalSpan = 3;
		this.assumption.setLayoutData(assumptionData);
		this.assumption.setLowerBound(0);
		this.assumption.setUpperBound(-1);
		assumption.setID(GsnViewsRepository.Goal.assumption);
		assumption.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveAssumption(Assumption element, int oldIndex, int newIndex) {
		EObject editedElement = assumptionEditUtil.foundCorrespondingEObject(element);
		assumptionEditUtil.moveElement(element, oldIndex, newIndex);
		assumption.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToAssumption() {
		// Start of user code addToAssumption() method body
				Assumption eObject = GsnFactory.eINSTANCE.createAssumption();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						assumptionEditUtil.addElement(propertiesEditionObject);
						assumption.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromAssumption(Assumption element) {
		// Start of user code removeFromAssumption() method body
				EObject editedElement = assumptionEditUtil.foundCorrespondingEObject(element);
				assumptionEditUtil.removeElement(element);
				assumption.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.assumption, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editAssumption(Assumption element) {
		// Start of user code editAssumption() method body
				EObject editedElement = assumptionEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						assumptionEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						assumption.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.assumption, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createContextAdvancedTableComposition(Composite parent) {
		this.context = new ReferencesTable<Context>(GsnMessages.GoalPropertiesEditionPart_ContextLabel, new ReferencesTableListener<Context>() {			
			public void handleAdd() { addToContext();}
			public void handleEdit(Context element) { editContext(element); }
			public void handleMove(Context element, int oldIndex, int newIndex) { moveContext(element, oldIndex, newIndex); }
			public void handleRemove(Context element) { removeFromContext(element); }
			public void navigateTo(Context element) { }
		});
		this.context.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.context, GsnViewsRepository.SWT_KIND));
		this.context.createControls(parent);
		GridData contextData = new GridData(GridData.FILL_HORIZONTAL);
		contextData.horizontalSpan = 3;
		this.context.setLayoutData(contextData);
		this.context.setLowerBound(0);
		this.context.setUpperBound(-1);
		context.setID(GsnViewsRepository.Goal.context);
		context.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveContext(Context element, int oldIndex, int newIndex) {
		EObject editedElement = contextEditUtil.foundCorrespondingEObject(element);
		contextEditUtil.moveElement(element, oldIndex, newIndex);
		context.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToContext() {
		// Start of user code addToContext() method body
				Context eObject = GsnFactory.eINSTANCE.createContext();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						contextEditUtil.addElement(propertiesEditionObject);
						context.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromContext(Context element) {
		// Start of user code removeFromContext() method body
				EObject editedElement = contextEditUtil.foundCorrespondingEObject(element);
				contextEditUtil.removeElement(element);
				context.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.context, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editContext(Context element) {
		// Start of user code editContext() method body
				EObject editedElement = contextEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						contextEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						context.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.context, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createSolutionAdvancedTableComposition(Composite parent) {
		this.solution = new ReferencesTable<Solution>(GsnMessages.GoalPropertiesEditionPart_SolutionLabel, new ReferencesTableListener<Solution>() {			
			public void handleAdd() { addToSolution();}
			public void handleEdit(Solution element) { editSolution(element); }
			public void handleMove(Solution element, int oldIndex, int newIndex) { moveSolution(element, oldIndex, newIndex); }
			public void handleRemove(Solution element) { removeFromSolution(element); }
			public void navigateTo(Solution element) { }
		});
		this.solution.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.solution, GsnViewsRepository.SWT_KIND));
		this.solution.createControls(parent);
		GridData solutionData = new GridData(GridData.FILL_HORIZONTAL);
		solutionData.horizontalSpan = 3;
		this.solution.setLayoutData(solutionData);
		this.solution.setLowerBound(0);
		this.solution.setUpperBound(-1);
		solution.setID(GsnViewsRepository.Goal.solution);
		solution.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveSolution(Solution element, int oldIndex, int newIndex) {
		EObject editedElement = solutionEditUtil.foundCorrespondingEObject(element);
		solutionEditUtil.moveElement(element, oldIndex, newIndex);
		solution.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToSolution() {
		// Start of user code addToSolution() method body
				Solution eObject = GsnFactory.eINSTANCE.createSolution();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						solutionEditUtil.addElement(propertiesEditionObject);
						solution.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromSolution(Solution element) {
		// Start of user code removeFromSolution() method body
				EObject editedElement = solutionEditUtil.foundCorrespondingEObject(element);
				solutionEditUtil.removeElement(element);
				solution.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.solution, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editSolution(Solution element) {
		// Start of user code editSolution() method body
				EObject editedElement = solutionEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						solutionEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						solution.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.solution, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * 
	 */
	protected void createSubgoalAdvancedReferencesTable(Composite parent) {
		this.subgoal = new ReferencesTable<Goal>(GsnMessages.GoalPropertiesEditionPart_SubgoalLabel, new ReferencesTableListener<Goal>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<Goal> dialog = new TabElementTreeSelectionDialog<Goal>(resourceSet, subgoalFilters, subgoalBusinessFilters,
				"Goal", GsnPackage.eINSTANCE.getGoal(), current.eResource()) {

					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!subgoalEditUtil.getVirtualList().contains(elem))
								subgoalEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.subgoal,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						subgoal.refresh();
					}

				};
				dialog.open();
			}
			public void handleEdit(Goal element) { editSubgoal(element); }
			public void handleMove(Goal element, int oldIndex, int newIndex) { moveSubgoal(element, oldIndex, newIndex); }
			public void handleRemove(Goal element) { removeFromSubgoal(element); }
			public void navigateTo(Goal element) { }
		});
		this.subgoal.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.subgoal, GsnViewsRepository.SWT_KIND));
		this.subgoal.createControls(parent);
		GridData subgoalData = new GridData(GridData.FILL_HORIZONTAL);
		subgoalData.horizontalSpan = 3;
		this.subgoal.setLayoutData(subgoalData);
		this.subgoal.disableMove();
		subgoal.setID(GsnViewsRepository.Goal.subgoal);
		subgoal.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveSubgoal(Goal element, int oldIndex, int newIndex) {
		EObject editedElement = subgoalEditUtil.foundCorrespondingEObject(element);
		subgoalEditUtil.moveElement(element, oldIndex, newIndex);
		subgoal.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.subgoal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromSubgoal(Goal element) {

		// Start of user code removeFromSubgoal() method body
				EObject editedElement = subgoalEditUtil.foundCorrespondingEObject(element);
				subgoalEditUtil.removeElement(element);
				subgoal.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.subgoal, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code

	}

	/**
	 * 
	 */
	protected void editSubgoal(Goal element) {

		// Start of user code editSubgoal() method body
				EObject editedElement = subgoalEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						subgoalEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						subgoal.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.subgoal, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#setIdentifier(String newValue)
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
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#setDescription(String newValue)
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
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#setContent(String newValue)
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
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getIsTaggedToAdd()
	 * 
	 */
	public List getIsTaggedToAdd() {
		return isTaggedEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getIsTaggedToRemove()
	 * 
	 */
	public List getIsTaggedToRemove() {
		return isTaggedEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getIsTaggedToEdit()
	 * 
	 */
	public Map getIsTaggedToEdit() {
		return isTaggedEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getIsTaggedToMove()
	 * 
	 */
	public List getIsTaggedToMove() {
		return isTaggedEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getIsTaggedTable()
	 * 
	 */
	public List getIsTaggedTable() {
		return isTaggedEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateIsTagged(EObject newValue)
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
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return isTaggedEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getAssumed()
	 * 
	 */
	public Boolean getAssumed() {
		return Boolean.valueOf(assumed.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#setAssumed(Boolean newValue)
	 * 
	 */
	public void setAssumed(Boolean newValue) {
		if (newValue != null) {
			assumed.setSelection(newValue.booleanValue());
		} else {
			assumed.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getToBeSupported()
	 * 
	 */
	public Boolean getToBeSupported() {
		return Boolean.valueOf(toBeSupported.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#setToBeSupported(Boolean newValue)
	 * 
	 */
	public void setToBeSupported(Boolean newValue) {
		if (newValue != null) {
			toBeSupported.setSelection(newValue.booleanValue());
		} else {
			toBeSupported.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getStrategyToAdd()
	 * 
	 */
	public List getStrategyToAdd() {
		return strategyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getStrategyToRemove()
	 * 
	 */
	public List getStrategyToRemove() {
		return strategyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getStrategyToEdit()
	 * 
	 */
	public Map getStrategyToEdit() {
		return strategyEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getStrategyToMove()
	 * 
	 */
	public List getStrategyToMove() {
		return strategyEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getStrategyTable()
	 * 
	 */
	public List getStrategyTable() {
		return strategyEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initStrategy(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initStrategy(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			strategyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			strategyEditUtil = new EMFListEditUtil(current, feature);
		this.strategy.setInput(strategyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateStrategy(EObject newValue)
	 * 
	 */
	public void updateStrategy(EObject newValue) {
		if(strategyEditUtil != null){
			strategyEditUtil.reinit(newValue);
			strategy.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterStrategy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStrategy(ViewerFilter filter) {
		strategyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addBusinessFilterStrategy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStrategy(ViewerFilter filter) {
		strategyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#isContainedInStrategyTable(EObject element)
	 * 
	 */
	public boolean isContainedInStrategyTable(EObject element) {
		return strategyEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getAssumptionToAdd()
	 * 
	 */
	public List getAssumptionToAdd() {
		return assumptionEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getAssumptionToRemove()
	 * 
	 */
	public List getAssumptionToRemove() {
		return assumptionEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getAssumptionToEdit()
	 * 
	 */
	public Map getAssumptionToEdit() {
		return assumptionEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getAssumptionToMove()
	 * 
	 */
	public List getAssumptionToMove() {
		return assumptionEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getAssumptionTable()
	 * 
	 */
	public List getAssumptionTable() {
		return assumptionEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initAssumption(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateAssumption(EObject newValue)
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
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterAssumption(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAssumption(ViewerFilter filter) {
		assumptionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addBusinessFilterAssumption(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAssumption(ViewerFilter filter) {
		assumptionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#isContainedInAssumptionTable(EObject element)
	 * 
	 */
	public boolean isContainedInAssumptionTable(EObject element) {
		return assumptionEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getContextToAdd()
	 * 
	 */
	public List getContextToAdd() {
		return contextEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getContextToRemove()
	 * 
	 */
	public List getContextToRemove() {
		return contextEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getContextToEdit()
	 * 
	 */
	public Map getContextToEdit() {
		return contextEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getContextToMove()
	 * 
	 */
	public List getContextToMove() {
		return contextEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getContextTable()
	 * 
	 */
	public List getContextTable() {
		return contextEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initContext(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateContext(EObject newValue)
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
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContext(ViewerFilter filter) {
		contextFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addBusinessFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContext(ViewerFilter filter) {
		contextBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#isContainedInContextTable(EObject element)
	 * 
	 */
	public boolean isContainedInContextTable(EObject element) {
		return contextEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getSolutionToAdd()
	 * 
	 */
	public List getSolutionToAdd() {
		return solutionEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getSolutionToRemove()
	 * 
	 */
	public List getSolutionToRemove() {
		return solutionEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getSolutionToEdit()
	 * 
	 */
	public Map getSolutionToEdit() {
		return solutionEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getSolutionToMove()
	 * 
	 */
	public List getSolutionToMove() {
		return solutionEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getSolutionTable()
	 * 
	 */
	public List getSolutionTable() {
		return solutionEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initSolution(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSolution(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			solutionEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			solutionEditUtil = new EMFListEditUtil(current, feature);
		this.solution.setInput(solutionEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateSolution(EObject newValue)
	 * 
	 */
	public void updateSolution(EObject newValue) {
		if(solutionEditUtil != null){
			solutionEditUtil.reinit(newValue);
			solution.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterSolution(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSolution(ViewerFilter filter) {
		solutionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addBusinessFilterSolution(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSolution(ViewerFilter filter) {
		solutionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#isContainedInSolutionTable(EObject element)
	 * 
	 */
	public boolean isContainedInSolutionTable(EObject element) {
		return solutionEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getSubgoalToAdd()
	 * 
	 */
	public List getSubgoalToAdd() {
		return subgoalEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getSubgoalToRemove()
	 * 
	 */
	public List getSubgoalToRemove() {
		return subgoalEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getSubgoalTable()
	 * 
	 */
	public List getSubgoalTable() {
		return subgoalEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initSubgoal(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSubgoal(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			subgoalEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			subgoalEditUtil = new EMFListEditUtil(current, feature);
		this.subgoal.setInput(subgoalEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateSubgoal(EObject newValue)
	 * 
	 */
	public void updateSubgoal(EObject newValue) {
		if(subgoalEditUtil != null){
			subgoalEditUtil.reinit(newValue);
			subgoal.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterSubgoal(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSubgoal(ViewerFilter filter) {
		subgoalFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addBusinessFilterSubgoal(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSubgoal(ViewerFilter filter) {
		subgoalBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#isContainedInSubgoalTable(EObject element)
	 * 
	 */
	public boolean isContainedInSubgoalTable(EObject element) {
		return subgoalEditUtil.contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return GsnMessages.Goal_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
