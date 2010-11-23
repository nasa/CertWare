/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.gsn.Assumption;
import net.certware.argument.gsn.Context;
import net.certware.argument.gsn.Goal;
import net.certware.argument.gsn.GsnFactory;
import net.certware.argument.gsn.Solution;
import net.certware.argument.gsn.Strategy;
import net.certware.argument.gsn.parts.GoalPropertiesEditionPart;
import net.certware.argument.gsn.parts.GsnViewsRepository;
import net.certware.argument.gsn.providers.GsnMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.jface.viewers.ViewerFilter;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * 
 * 
 */
public class GoalPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, GoalPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected EMFListEditUtil isTaggedEditUtil;
		protected ReferencesTable<? extends EObject> isTagged;
		protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected Button assumed;
	protected Button toBeSupported;
	protected EMFListEditUtil subGoalsEditUtil;
		protected ReferencesTable<? extends EObject> subGoals;
		protected List<ViewerFilter> subGoalsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> subGoalsFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil strategiesEditUtil;
		protected ReferencesTable<? extends EObject> strategies;
		protected List<ViewerFilter> strategiesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> strategiesFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil goalContextsEditUtil;
		protected ReferencesTable<? extends EObject> goalContexts;
		protected List<ViewerFilter> goalContextsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> goalContextsFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil assumptionsEditUtil;
		protected ReferencesTable<? extends EObject> assumptions;
		protected List<ViewerFilter> assumptionsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> assumptionsFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil goalSolutionsEditUtil;
		protected ReferencesTable<? extends EObject> goalSolutions;
		protected List<ViewerFilter> goalSolutionsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> goalSolutionsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GoalPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		propertiesSection.setText(GsnMessages.GoalPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createIdentifierText(widgetFactory, propertiesGroup);
		createDescriptionText(widgetFactory, propertiesGroup);
		createContentText(widgetFactory, propertiesGroup);
		createIsTaggedTableComposition(widgetFactory, propertiesGroup);
		createAssumedCheckbox(widgetFactory, propertiesGroup);
		createToBeSupportedCheckbox(widgetFactory, propertiesGroup);
		createSubGoalsTableComposition(widgetFactory, propertiesGroup);
		createStrategiesTableComposition(widgetFactory, propertiesGroup);
		createGoalContextsTableComposition(widgetFactory, propertiesGroup);
		createAssumptionsTableComposition(widgetFactory, propertiesGroup);
		createGoalSolutionsTableComposition(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	
	protected void createIdentifierText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, GsnMessages.GoalPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Goal.identifier, GsnViewsRepository.FORM_KIND));
		identifier = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		identifier.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData identifierData = new GridData(GridData.FILL_HORIZONTAL);
		identifier.setLayoutData(identifierData);
		identifier.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
			}
		});
		identifier.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}
		});
		EditingUtils.setID(identifier, GsnViewsRepository.Goal.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.identifier, GsnViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, GsnMessages.GoalPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Goal.description, GsnViewsRepository.FORM_KIND));
		description = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		description.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}
		});
		description.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, GsnViewsRepository.Goal.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.description, GsnViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createContentText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, GsnMessages.GoalPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Goal.content, GsnViewsRepository.FORM_KIND));
		content = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		content.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		content.setLayoutData(contentData);
		content.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
			}
		});
		content.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}
		});
		EditingUtils.setID(content, GsnViewsRepository.Goal.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.content, GsnViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createIsTaggedTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.isTagged = new ReferencesTable<TaggedValue>(GsnMessages.GoalPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener<TaggedValue>() {			
			public void handleAdd() { addToIsTagged();}
			public void handleEdit(TaggedValue element) { editIsTagged(element); }
			public void handleMove(TaggedValue element, int oldIndex, int newIndex) { moveIsTagged(element, oldIndex, newIndex); }
			public void handleRemove(TaggedValue element) { removeFromIsTagged(element); }
			public void navigateTo(TaggedValue element) { }
		});
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.isTagged, GsnViewsRepository.FORM_KIND));
		this.isTagged.createControls(parent, widgetFactory);
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromIsTagged(TaggedValue element) {
		// Start of user code for the removeFromIsTagged() method body
				EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
				isTaggedEditUtil.removeElement(element);
				isTagged.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	
	protected void createAssumedCheckbox(FormToolkit widgetFactory, Composite parent) {
		assumed = widgetFactory.createButton(parent, GsnMessages.GoalPropertiesEditionPart_AssumedLabel, SWT.CHECK);
		assumed.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.assumed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(assumed.getSelection())));
			}

		});
		GridData assumedData = new GridData(GridData.FILL_HORIZONTAL);
		assumedData.horizontalSpan = 2;
		assumed.setLayoutData(assumedData);
		EditingUtils.setID(assumed, GsnViewsRepository.Goal.assumed);
		EditingUtils.setEEFtype(assumed, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.assumed, GsnViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createToBeSupportedCheckbox(FormToolkit widgetFactory, Composite parent) {
		toBeSupported = widgetFactory.createButton(parent, GsnMessages.GoalPropertiesEditionPart_ToBeSupportedLabel, SWT.CHECK);
		toBeSupported.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.toBeSupported, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(toBeSupported.getSelection())));
			}

		});
		GridData toBeSupportedData = new GridData(GridData.FILL_HORIZONTAL);
		toBeSupportedData.horizontalSpan = 2;
		toBeSupported.setLayoutData(toBeSupportedData);
		EditingUtils.setID(toBeSupported, GsnViewsRepository.Goal.toBeSupported);
		EditingUtils.setEEFtype(toBeSupported, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.toBeSupported, GsnViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createSubGoalsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.subGoals = new ReferencesTable<Goal>(GsnMessages.GoalPropertiesEditionPart_SubGoalsLabel, new ReferencesTableListener<Goal>() {			
			public void handleAdd() { addToSubGoals();}
			public void handleEdit(Goal element) { editSubGoals(element); }
			public void handleMove(Goal element, int oldIndex, int newIndex) { moveSubGoals(element, oldIndex, newIndex); }
			public void handleRemove(Goal element) { removeFromSubGoals(element); }
			public void navigateTo(Goal element) { }
		});
		this.subGoals.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.subGoals, GsnViewsRepository.FORM_KIND));
		this.subGoals.createControls(parent, widgetFactory);
		GridData subGoalsData = new GridData(GridData.FILL_HORIZONTAL);
		subGoalsData.horizontalSpan = 3;
		this.subGoals.setLayoutData(subGoalsData);
		this.subGoals.setLowerBound(0);
		this.subGoals.setUpperBound(-1);
		subGoals.setID(GsnViewsRepository.Goal.subGoals);
		subGoals.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveSubGoals(Goal element, int oldIndex, int newIndex) {
		EObject editedElement = subGoalsEditUtil.foundCorrespondingEObject(element);
		subGoalsEditUtil.moveElement(element, oldIndex, newIndex);
		subGoals.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.subGoals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToSubGoals() {
		// Start of user code addToSubGoals() method body
				Goal eObject = GsnFactory.eINSTANCE.createGoal();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						subGoalsEditUtil.addElement(propertiesEditionObject);
						subGoals.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.subGoals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromSubGoals(Goal element) {
		// Start of user code for the removeFromSubGoals() method body
				EObject editedElement = subGoalsEditUtil.foundCorrespondingEObject(element);
				subGoalsEditUtil.removeElement(element);
				subGoals.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.subGoals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editSubGoals(Goal element) {
		// Start of user code editSubGoals() method body		
				EObject editedElement = subGoalsEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						subGoalsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						subGoals.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.subGoals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createStrategiesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.strategies = new ReferencesTable<Strategy>(GsnMessages.GoalPropertiesEditionPart_StrategiesLabel, new ReferencesTableListener<Strategy>() {			
			public void handleAdd() { addToStrategies();}
			public void handleEdit(Strategy element) { editStrategies(element); }
			public void handleMove(Strategy element, int oldIndex, int newIndex) { moveStrategies(element, oldIndex, newIndex); }
			public void handleRemove(Strategy element) { removeFromStrategies(element); }
			public void navigateTo(Strategy element) { }
		});
		this.strategies.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.strategies, GsnViewsRepository.FORM_KIND));
		this.strategies.createControls(parent, widgetFactory);
		GridData strategiesData = new GridData(GridData.FILL_HORIZONTAL);
		strategiesData.horizontalSpan = 3;
		this.strategies.setLayoutData(strategiesData);
		this.strategies.setLowerBound(0);
		this.strategies.setUpperBound(-1);
		strategies.setID(GsnViewsRepository.Goal.strategies);
		strategies.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveStrategies(Strategy element, int oldIndex, int newIndex) {
		EObject editedElement = strategiesEditUtil.foundCorrespondingEObject(element);
		strategiesEditUtil.moveElement(element, oldIndex, newIndex);
		strategies.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToStrategies() {
		// Start of user code addToStrategies() method body
				Strategy eObject = GsnFactory.eINSTANCE.createStrategy();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						strategiesEditUtil.addElement(propertiesEditionObject);
						strategies.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromStrategies(Strategy element) {
		// Start of user code for the removeFromStrategies() method body
				EObject editedElement = strategiesEditUtil.foundCorrespondingEObject(element);
				strategiesEditUtil.removeElement(element);
				strategies.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editStrategies(Strategy element) {
		// Start of user code editStrategies() method body		
				EObject editedElement = strategiesEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						strategiesEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						strategies.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createGoalContextsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.goalContexts = new ReferencesTable<Context>(GsnMessages.GoalPropertiesEditionPart_GoalContextsLabel, new ReferencesTableListener<Context>() {			
			public void handleAdd() { addToGoalContexts();}
			public void handleEdit(Context element) { editGoalContexts(element); }
			public void handleMove(Context element, int oldIndex, int newIndex) { moveGoalContexts(element, oldIndex, newIndex); }
			public void handleRemove(Context element) { removeFromGoalContexts(element); }
			public void navigateTo(Context element) { }
		});
		this.goalContexts.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.goalContexts, GsnViewsRepository.FORM_KIND));
		this.goalContexts.createControls(parent, widgetFactory);
		GridData goalContextsData = new GridData(GridData.FILL_HORIZONTAL);
		goalContextsData.horizontalSpan = 3;
		this.goalContexts.setLayoutData(goalContextsData);
		this.goalContexts.setLowerBound(0);
		this.goalContexts.setUpperBound(-1);
		goalContexts.setID(GsnViewsRepository.Goal.goalContexts);
		goalContexts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveGoalContexts(Context element, int oldIndex, int newIndex) {
		EObject editedElement = goalContextsEditUtil.foundCorrespondingEObject(element);
		goalContextsEditUtil.moveElement(element, oldIndex, newIndex);
		goalContexts.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.goalContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToGoalContexts() {
		// Start of user code addToGoalContexts() method body
				Context eObject = GsnFactory.eINSTANCE.createContext();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						goalContextsEditUtil.addElement(propertiesEditionObject);
						goalContexts.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.goalContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromGoalContexts(Context element) {
		// Start of user code for the removeFromGoalContexts() method body
				EObject editedElement = goalContextsEditUtil.foundCorrespondingEObject(element);
				goalContextsEditUtil.removeElement(element);
				goalContexts.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.goalContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editGoalContexts(Context element) {
		// Start of user code editGoalContexts() method body		
				EObject editedElement = goalContextsEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						goalContextsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						goalContexts.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.goalContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createAssumptionsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.assumptions = new ReferencesTable<Assumption>(GsnMessages.GoalPropertiesEditionPart_AssumptionsLabel, new ReferencesTableListener<Assumption>() {			
			public void handleAdd() { addToAssumptions();}
			public void handleEdit(Assumption element) { editAssumptions(element); }
			public void handleMove(Assumption element, int oldIndex, int newIndex) { moveAssumptions(element, oldIndex, newIndex); }
			public void handleRemove(Assumption element) { removeFromAssumptions(element); }
			public void navigateTo(Assumption element) { }
		});
		this.assumptions.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.assumptions, GsnViewsRepository.FORM_KIND));
		this.assumptions.createControls(parent, widgetFactory);
		GridData assumptionsData = new GridData(GridData.FILL_HORIZONTAL);
		assumptionsData.horizontalSpan = 3;
		this.assumptions.setLayoutData(assumptionsData);
		this.assumptions.setLowerBound(0);
		this.assumptions.setUpperBound(-1);
		assumptions.setID(GsnViewsRepository.Goal.assumptions);
		assumptions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveAssumptions(Assumption element, int oldIndex, int newIndex) {
		EObject editedElement = assumptionsEditUtil.foundCorrespondingEObject(element);
		assumptionsEditUtil.moveElement(element, oldIndex, newIndex);
		assumptions.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.assumptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToAssumptions() {
		// Start of user code addToAssumptions() method body
				Assumption eObject = GsnFactory.eINSTANCE.createAssumption();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						assumptionsEditUtil.addElement(propertiesEditionObject);
						assumptions.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.assumptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromAssumptions(Assumption element) {
		// Start of user code for the removeFromAssumptions() method body
				EObject editedElement = assumptionsEditUtil.foundCorrespondingEObject(element);
				assumptionsEditUtil.removeElement(element);
				assumptions.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.assumptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editAssumptions(Assumption element) {
		// Start of user code editAssumptions() method body		
				EObject editedElement = assumptionsEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						assumptionsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						assumptions.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.assumptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createGoalSolutionsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.goalSolutions = new ReferencesTable<Solution>(GsnMessages.GoalPropertiesEditionPart_GoalSolutionsLabel, new ReferencesTableListener<Solution>() {			
			public void handleAdd() { addToGoalSolutions();}
			public void handleEdit(Solution element) { editGoalSolutions(element); }
			public void handleMove(Solution element, int oldIndex, int newIndex) { moveGoalSolutions(element, oldIndex, newIndex); }
			public void handleRemove(Solution element) { removeFromGoalSolutions(element); }
			public void navigateTo(Solution element) { }
		});
		this.goalSolutions.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.goalSolutions, GsnViewsRepository.FORM_KIND));
		this.goalSolutions.createControls(parent, widgetFactory);
		GridData goalSolutionsData = new GridData(GridData.FILL_HORIZONTAL);
		goalSolutionsData.horizontalSpan = 3;
		this.goalSolutions.setLayoutData(goalSolutionsData);
		this.goalSolutions.setLowerBound(0);
		this.goalSolutions.setUpperBound(-1);
		goalSolutions.setID(GsnViewsRepository.Goal.goalSolutions);
		goalSolutions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveGoalSolutions(Solution element, int oldIndex, int newIndex) {
		EObject editedElement = goalSolutionsEditUtil.foundCorrespondingEObject(element);
		goalSolutionsEditUtil.moveElement(element, oldIndex, newIndex);
		goalSolutions.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.goalSolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToGoalSolutions() {
		// Start of user code addToGoalSolutions() method body
				Solution eObject = GsnFactory.eINSTANCE.createSolution();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						goalSolutionsEditUtil.addElement(propertiesEditionObject);
						goalSolutions.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.goalSolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromGoalSolutions(Solution element) {
		// Start of user code for the removeFromGoalSolutions() method body
				EObject editedElement = goalSolutionsEditUtil.foundCorrespondingEObject(element);
				goalSolutionsEditUtil.removeElement(element);
				goalSolutions.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.goalSolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editGoalSolutions(Solution element) {
		// Start of user code editGoalSolutions() method body		
				EObject editedElement = goalSolutionsEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						goalSolutionsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						goalSolutions.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartForm.this, GsnViewsRepository.Goal.goalSolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getSubGoalsToAdd()
	 * 
	 */
	public List getSubGoalsToAdd() {
		return subGoalsEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getSubGoalsToRemove()
	 * 
	 */
	public List getSubGoalsToRemove() {
		return subGoalsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getSubGoalsToEdit()
	 * 
	 */
	public Map getSubGoalsToEdit() {
		return subGoalsEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getSubGoalsToMove()
	 * 
	 */
	public List getSubGoalsToMove() {
		return subGoalsEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getSubGoalsTable()
	 * 
	 */
	public List getSubGoalsTable() {
		return subGoalsEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initSubGoals(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSubGoals(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			subGoalsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			subGoalsEditUtil = new EMFListEditUtil(current, feature);
		this.subGoals.setInput(subGoalsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateSubGoals(EObject newValue)
	 * 
	 */
	public void updateSubGoals(EObject newValue) {
		if(subGoalsEditUtil != null){
			subGoalsEditUtil.reinit(newValue);
			subGoals.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterSubGoals(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSubGoals(ViewerFilter filter) {
		subGoalsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addBusinessFilterSubGoals(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSubGoals(ViewerFilter filter) {
		subGoalsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#isContainedInSubGoalsTable(EObject element)
	 * 
	 */
	public boolean isContainedInSubGoalsTable(EObject element) {
		return subGoalsEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getStrategiesToAdd()
	 * 
	 */
	public List getStrategiesToAdd() {
		return strategiesEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getStrategiesToRemove()
	 * 
	 */
	public List getStrategiesToRemove() {
		return strategiesEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getStrategiesToEdit()
	 * 
	 */
	public Map getStrategiesToEdit() {
		return strategiesEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getStrategiesToMove()
	 * 
	 */
	public List getStrategiesToMove() {
		return strategiesEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getStrategiesTable()
	 * 
	 */
	public List getStrategiesTable() {
		return strategiesEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initStrategies(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initStrategies(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			strategiesEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			strategiesEditUtil = new EMFListEditUtil(current, feature);
		this.strategies.setInput(strategiesEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateStrategies(EObject newValue)
	 * 
	 */
	public void updateStrategies(EObject newValue) {
		if(strategiesEditUtil != null){
			strategiesEditUtil.reinit(newValue);
			strategies.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterStrategies(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStrategies(ViewerFilter filter) {
		strategiesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addBusinessFilterStrategies(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStrategies(ViewerFilter filter) {
		strategiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#isContainedInStrategiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInStrategiesTable(EObject element) {
		return strategiesEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getGoalContextsToAdd()
	 * 
	 */
	public List getGoalContextsToAdd() {
		return goalContextsEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getGoalContextsToRemove()
	 * 
	 */
	public List getGoalContextsToRemove() {
		return goalContextsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getGoalContextsToEdit()
	 * 
	 */
	public Map getGoalContextsToEdit() {
		return goalContextsEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getGoalContextsToMove()
	 * 
	 */
	public List getGoalContextsToMove() {
		return goalContextsEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getGoalContextsTable()
	 * 
	 */
	public List getGoalContextsTable() {
		return goalContextsEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initGoalContexts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initGoalContexts(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			goalContextsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			goalContextsEditUtil = new EMFListEditUtil(current, feature);
		this.goalContexts.setInput(goalContextsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateGoalContexts(EObject newValue)
	 * 
	 */
	public void updateGoalContexts(EObject newValue) {
		if(goalContextsEditUtil != null){
			goalContextsEditUtil.reinit(newValue);
			goalContexts.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterGoalContexts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGoalContexts(ViewerFilter filter) {
		goalContextsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addBusinessFilterGoalContexts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGoalContexts(ViewerFilter filter) {
		goalContextsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#isContainedInGoalContextsTable(EObject element)
	 * 
	 */
	public boolean isContainedInGoalContextsTable(EObject element) {
		return goalContextsEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getAssumptionsToAdd()
	 * 
	 */
	public List getAssumptionsToAdd() {
		return assumptionsEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getAssumptionsToRemove()
	 * 
	 */
	public List getAssumptionsToRemove() {
		return assumptionsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getAssumptionsToEdit()
	 * 
	 */
	public Map getAssumptionsToEdit() {
		return assumptionsEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getAssumptionsToMove()
	 * 
	 */
	public List getAssumptionsToMove() {
		return assumptionsEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getAssumptionsTable()
	 * 
	 */
	public List getAssumptionsTable() {
		return assumptionsEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initAssumptions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAssumptions(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			assumptionsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			assumptionsEditUtil = new EMFListEditUtil(current, feature);
		this.assumptions.setInput(assumptionsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateAssumptions(EObject newValue)
	 * 
	 */
	public void updateAssumptions(EObject newValue) {
		if(assumptionsEditUtil != null){
			assumptionsEditUtil.reinit(newValue);
			assumptions.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterAssumptions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAssumptions(ViewerFilter filter) {
		assumptionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addBusinessFilterAssumptions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAssumptions(ViewerFilter filter) {
		assumptionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#isContainedInAssumptionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInAssumptionsTable(EObject element) {
		return assumptionsEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getGoalSolutionsToAdd()
	 * 
	 */
	public List getGoalSolutionsToAdd() {
		return goalSolutionsEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getGoalSolutionsToRemove()
	 * 
	 */
	public List getGoalSolutionsToRemove() {
		return goalSolutionsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getGoalSolutionsToEdit()
	 * 
	 */
	public Map getGoalSolutionsToEdit() {
		return goalSolutionsEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getGoalSolutionsToMove()
	 * 
	 */
	public List getGoalSolutionsToMove() {
		return goalSolutionsEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#getGoalSolutionsTable()
	 * 
	 */
	public List getGoalSolutionsTable() {
		return goalSolutionsEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initGoalSolutions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initGoalSolutions(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			goalSolutionsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			goalSolutionsEditUtil = new EMFListEditUtil(current, feature);
		this.goalSolutions.setInput(goalSolutionsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateGoalSolutions(EObject newValue)
	 * 
	 */
	public void updateGoalSolutions(EObject newValue) {
		if(goalSolutionsEditUtil != null){
			goalSolutionsEditUtil.reinit(newValue);
			goalSolutions.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterGoalSolutions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGoalSolutions(ViewerFilter filter) {
		goalSolutionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addBusinessFilterGoalSolutions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGoalSolutions(ViewerFilter filter) {
		goalSolutionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#isContainedInGoalSolutionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInGoalSolutionsTable(EObject element) {
		return goalSolutionsEditUtil.contains(element);
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
