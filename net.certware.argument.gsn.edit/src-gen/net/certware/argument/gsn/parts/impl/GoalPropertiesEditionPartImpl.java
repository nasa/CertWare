/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.argument.gsn.parts.GoalPropertiesEditionPart;
import net.certware.argument.gsn.parts.GsnViewsRepository;
import net.certware.argument.gsn.providers.GsnMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
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
protected ReferencesTable isTagged;
protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected Button assumed;
	protected Button toBeSupported;
protected ReferencesTable subGoals;
protected List<ViewerFilter> subGoalsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> subGoalsFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable strategies;
protected List<ViewerFilter> strategiesBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> strategiesFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable goalContexts;
protected List<ViewerFilter> goalContextsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> goalContextsFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable assumptions;
protected List<ViewerFilter> assumptionsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> assumptionsFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable goalSolutions;
protected List<ViewerFilter> goalSolutionsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> goalSolutionsFilters = new ArrayList<ViewerFilter>();



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
		CompositionSequence goalStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = goalStep.addStep(GsnViewsRepository.Goal.Properties.class);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.identifier);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.description);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.content);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.isTagged);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.assumed);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.toBeSupported);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.subGoals);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.strategies);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.goalContexts);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.assumptions);
		propertiesStep.addStep(GsnViewsRepository.Goal.Properties.goalSolutions);
		
		
		composer = new PartComposer(goalStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == GsnViewsRepository.Goal.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.identifier) {
					return createIdentifierText(parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.content) {
					return createContentText(parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.isTagged) {
					return createIsTaggedAdvancedTableComposition(parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.assumed) {
					return createAssumedCheckbox(parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.toBeSupported) {
					return createToBeSupportedCheckbox(parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.subGoals) {
					return createSubGoalsAdvancedTableComposition(parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.strategies) {
					return createStrategiesAdvancedTableComposition(parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.goalContexts) {
					return createGoalContextsAdvancedTableComposition(parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.assumptions) {
					return createAssumptionsAdvancedTableComposition(parent);
				}
				if (key == GsnViewsRepository.Goal.Properties.goalSolutions) {
					return createGoalSolutionsAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(GsnMessages.GoalPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdentifierText(Composite parent) {
		SWTUtils.createPartLabel(parent, GsnMessages.GoalPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Goal.Properties.identifier, GsnViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, GsnViewsRepository.Goal.Properties.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.identifier, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, GsnMessages.GoalPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Goal.Properties.description, GsnViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, GsnViewsRepository.Goal.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.description, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createContentText(Composite parent) {
		SWTUtils.createPartLabel(parent, GsnMessages.GoalPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Goal.Properties.content, GsnViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}

		});
		EditingUtils.setID(content, GsnViewsRepository.Goal.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.content, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createIsTaggedAdvancedTableComposition(Composite parent) {
		this.isTagged = new ReferencesTable(GsnMessages.GoalPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				isTagged.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				isTagged.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				isTagged.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				isTagged.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.isTaggedFilters) {
			this.isTagged.addFilter(filter);
		}
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.isTagged, GsnViewsRepository.SWT_KIND));
		this.isTagged.createControls(parent);
		this.isTagged.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(GsnViewsRepository.Goal.Properties.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAssumedCheckbox(Composite parent) {
		assumed = new Button(parent, SWT.CHECK);
		assumed.setText(GsnMessages.GoalPropertiesEditionPart_AssumedLabel);
		assumed.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.assumed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(assumed.getSelection())));
			}

		});
		GridData assumedData = new GridData(GridData.FILL_HORIZONTAL);
		assumedData.horizontalSpan = 2;
		assumed.setLayoutData(assumedData);
		EditingUtils.setID(assumed, GsnViewsRepository.Goal.Properties.assumed);
		EditingUtils.setEEFtype(assumed, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.assumed, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createToBeSupportedCheckbox(Composite parent) {
		toBeSupported = new Button(parent, SWT.CHECK);
		toBeSupported.setText(GsnMessages.GoalPropertiesEditionPart_ToBeSupportedLabel);
		toBeSupported.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.toBeSupported, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(toBeSupported.getSelection())));
			}

		});
		GridData toBeSupportedData = new GridData(GridData.FILL_HORIZONTAL);
		toBeSupportedData.horizontalSpan = 2;
		toBeSupported.setLayoutData(toBeSupportedData);
		EditingUtils.setID(toBeSupported, GsnViewsRepository.Goal.Properties.toBeSupported);
		EditingUtils.setEEFtype(toBeSupported, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.toBeSupported, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSubGoalsAdvancedTableComposition(Composite parent) {
		this.subGoals = new ReferencesTable(GsnMessages.GoalPropertiesEditionPart_SubGoalsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.subGoals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				subGoals.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.subGoals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				subGoals.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.subGoals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				subGoals.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.subGoals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				subGoals.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.subGoalsFilters) {
			this.subGoals.addFilter(filter);
		}
		this.subGoals.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.subGoals, GsnViewsRepository.SWT_KIND));
		this.subGoals.createControls(parent);
		this.subGoals.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.subGoals, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData subGoalsData = new GridData(GridData.FILL_HORIZONTAL);
		subGoalsData.horizontalSpan = 3;
		this.subGoals.setLayoutData(subGoalsData);
		this.subGoals.setLowerBound(0);
		this.subGoals.setUpperBound(-1);
		subGoals.setID(GsnViewsRepository.Goal.Properties.subGoals);
		subGoals.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createStrategiesAdvancedTableComposition(Composite parent) {
		this.strategies = new ReferencesTable(GsnMessages.GoalPropertiesEditionPart_StrategiesLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				strategies.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				strategies.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				strategies.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				strategies.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.strategiesFilters) {
			this.strategies.addFilter(filter);
		}
		this.strategies.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.strategies, GsnViewsRepository.SWT_KIND));
		this.strategies.createControls(parent);
		this.strategies.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.strategies, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData strategiesData = new GridData(GridData.FILL_HORIZONTAL);
		strategiesData.horizontalSpan = 3;
		this.strategies.setLayoutData(strategiesData);
		this.strategies.setLowerBound(0);
		this.strategies.setUpperBound(-1);
		strategies.setID(GsnViewsRepository.Goal.Properties.strategies);
		strategies.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createGoalContextsAdvancedTableComposition(Composite parent) {
		this.goalContexts = new ReferencesTable(GsnMessages.GoalPropertiesEditionPart_GoalContextsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.goalContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				goalContexts.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.goalContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				goalContexts.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.goalContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				goalContexts.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.goalContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				goalContexts.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.goalContextsFilters) {
			this.goalContexts.addFilter(filter);
		}
		this.goalContexts.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.goalContexts, GsnViewsRepository.SWT_KIND));
		this.goalContexts.createControls(parent);
		this.goalContexts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.goalContexts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData goalContextsData = new GridData(GridData.FILL_HORIZONTAL);
		goalContextsData.horizontalSpan = 3;
		this.goalContexts.setLayoutData(goalContextsData);
		this.goalContexts.setLowerBound(0);
		this.goalContexts.setUpperBound(-1);
		goalContexts.setID(GsnViewsRepository.Goal.Properties.goalContexts);
		goalContexts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAssumptionsAdvancedTableComposition(Composite parent) {
		this.assumptions = new ReferencesTable(GsnMessages.GoalPropertiesEditionPart_AssumptionsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.assumptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				assumptions.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.assumptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				assumptions.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.assumptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				assumptions.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.assumptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				assumptions.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.assumptionsFilters) {
			this.assumptions.addFilter(filter);
		}
		this.assumptions.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.assumptions, GsnViewsRepository.SWT_KIND));
		this.assumptions.createControls(parent);
		this.assumptions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.assumptions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData assumptionsData = new GridData(GridData.FILL_HORIZONTAL);
		assumptionsData.horizontalSpan = 3;
		this.assumptions.setLayoutData(assumptionsData);
		this.assumptions.setLowerBound(0);
		this.assumptions.setUpperBound(-1);
		assumptions.setID(GsnViewsRepository.Goal.Properties.assumptions);
		assumptions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createGoalSolutionsAdvancedTableComposition(Composite parent) {
		this.goalSolutions = new ReferencesTable(GsnMessages.GoalPropertiesEditionPart_GoalSolutionsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.goalSolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				goalSolutions.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.goalSolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				goalSolutions.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.goalSolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				goalSolutions.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.goalSolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				goalSolutions.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.goalSolutionsFilters) {
			this.goalSolutions.addFilter(filter);
		}
		this.goalSolutions.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Goal.Properties.goalSolutions, GsnViewsRepository.SWT_KIND));
		this.goalSolutions.createControls(parent);
		this.goalSolutions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GoalPropertiesEditionPartImpl.this, GsnViewsRepository.Goal.Properties.goalSolutions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData goalSolutionsData = new GridData(GridData.FILL_HORIZONTAL);
		goalSolutionsData.horizontalSpan = 3;
		this.goalSolutions.setLayoutData(goalSolutionsData);
		this.goalSolutions.setLowerBound(0);
		this.goalSolutions.setUpperBound(-1);
		goalSolutions.setID(GsnViewsRepository.Goal.Properties.goalSolutions);
		goalSolutions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
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
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initIsTagged(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isTagged.setContentProvider(contentProvider);
		isTagged.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateIsTagged()
	 * 
	 */
	public void updateIsTagged() {
	isTagged.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
		if (this.isTagged != null) {
			this.isTagged.addFilter(filter);
		}
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
		return ((ReferencesTableSettings)isTagged.getInput()).contains(element);
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
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initSubGoals(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSubGoals(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		subGoals.setContentProvider(contentProvider);
		subGoals.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateSubGoals()
	 * 
	 */
	public void updateSubGoals() {
	subGoals.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterSubGoals(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSubGoals(ViewerFilter filter) {
		subGoalsFilters.add(filter);
		if (this.subGoals != null) {
			this.subGoals.addFilter(filter);
		}
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
		return ((ReferencesTableSettings)subGoals.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initStrategies(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initStrategies(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		strategies.setContentProvider(contentProvider);
		strategies.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateStrategies()
	 * 
	 */
	public void updateStrategies() {
	strategies.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterStrategies(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStrategies(ViewerFilter filter) {
		strategiesFilters.add(filter);
		if (this.strategies != null) {
			this.strategies.addFilter(filter);
		}
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
		return ((ReferencesTableSettings)strategies.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initGoalContexts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initGoalContexts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		goalContexts.setContentProvider(contentProvider);
		goalContexts.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateGoalContexts()
	 * 
	 */
	public void updateGoalContexts() {
	goalContexts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterGoalContexts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGoalContexts(ViewerFilter filter) {
		goalContextsFilters.add(filter);
		if (this.goalContexts != null) {
			this.goalContexts.addFilter(filter);
		}
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
		return ((ReferencesTableSettings)goalContexts.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initAssumptions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAssumptions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		assumptions.setContentProvider(contentProvider);
		assumptions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateAssumptions()
	 * 
	 */
	public void updateAssumptions() {
	assumptions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterAssumptions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAssumptions(ViewerFilter filter) {
		assumptionsFilters.add(filter);
		if (this.assumptions != null) {
			this.assumptions.addFilter(filter);
		}
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
		return ((ReferencesTableSettings)assumptions.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#initGoalSolutions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initGoalSolutions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		goalSolutions.setContentProvider(contentProvider);
		goalSolutions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#updateGoalSolutions()
	 * 
	 */
	public void updateGoalSolutions() {
	goalSolutions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.GoalPropertiesEditionPart#addFilterGoalSolutions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGoalSolutions(ViewerFilter filter) {
		goalSolutionsFilters.add(filter);
		if (this.goalSolutions != null) {
			this.goalSolutions.addFilter(filter);
		}
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
		return ((ReferencesTableSettings)goalSolutions.getInput()).contains(element);
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
