/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.argument.gsn.parts.GsnViewsRepository;
import net.certware.argument.gsn.parts.StrategyPropertiesEditionPart;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
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
protected ReferencesTable isTagged;
protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable goals;
protected List<ViewerFilter> goalsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> goalsFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable justifications;
protected List<ViewerFilter> justificationsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> justificationsFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable strategyContexts;
protected List<ViewerFilter> strategyContextsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> strategyContextsFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable strategySolutions;
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
		CompositionSequence strategyStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = strategyStep.addStep(GsnViewsRepository.Strategy.Properties.class);
		propertiesStep.addStep(GsnViewsRepository.Strategy.Properties.identifier);
		propertiesStep.addStep(GsnViewsRepository.Strategy.Properties.description);
		propertiesStep.addStep(GsnViewsRepository.Strategy.Properties.content);
		propertiesStep.addStep(GsnViewsRepository.Strategy.Properties.isTagged);
		propertiesStep.addStep(GsnViewsRepository.Strategy.Properties.goals);
		propertiesStep.addStep(GsnViewsRepository.Strategy.Properties.justifications);
		propertiesStep.addStep(GsnViewsRepository.Strategy.Properties.strategyContexts);
		propertiesStep.addStep(GsnViewsRepository.Strategy.Properties.strategySolutions);
		
		
		composer = new PartComposer(strategyStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == GsnViewsRepository.Strategy.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == GsnViewsRepository.Strategy.Properties.identifier) {
					return createIdentifierText(parent);
				}
				if (key == GsnViewsRepository.Strategy.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == GsnViewsRepository.Strategy.Properties.content) {
					return createContentText(parent);
				}
				if (key == GsnViewsRepository.Strategy.Properties.isTagged) {
					return createIsTaggedAdvancedTableComposition(parent);
				}
				if (key == GsnViewsRepository.Strategy.Properties.goals) {
					return createGoalsAdvancedTableComposition(parent);
				}
				if (key == GsnViewsRepository.Strategy.Properties.justifications) {
					return createJustificationsAdvancedTableComposition(parent);
				}
				if (key == GsnViewsRepository.Strategy.Properties.strategyContexts) {
					return createStrategyContextsAdvancedTableComposition(parent);
				}
				if (key == GsnViewsRepository.Strategy.Properties.strategySolutions) {
					return createStrategySolutionsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(GsnMessages.StrategyPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdentifierText(Composite parent) {
		SWTUtils.createPartLabel(parent, GsnMessages.StrategyPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Strategy.Properties.identifier, GsnViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, GsnViewsRepository.Strategy.Properties.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.Properties.identifier, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, GsnMessages.StrategyPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Strategy.Properties.description, GsnViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, GsnViewsRepository.Strategy.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.Properties.description, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createContentText(Composite parent) {
		SWTUtils.createPartLabel(parent, GsnMessages.StrategyPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Strategy.Properties.content, GsnViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}

		});
		EditingUtils.setID(content, GsnViewsRepository.Strategy.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.Properties.content, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createIsTaggedAdvancedTableComposition(Composite parent) {
		this.isTagged = new ReferencesTable(GsnMessages.StrategyPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				isTagged.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				isTagged.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				isTagged.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				isTagged.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.isTaggedFilters) {
			this.isTagged.addFilter(filter);
		}
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.Properties.isTagged, GsnViewsRepository.SWT_KIND));
		this.isTagged.createControls(parent);
		this.isTagged.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(GsnViewsRepository.Strategy.Properties.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createGoalsAdvancedTableComposition(Composite parent) {
		this.goals = new ReferencesTable(GsnMessages.StrategyPropertiesEditionPart_GoalsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.goals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				goals.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.goals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				goals.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.goals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				goals.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.goals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				goals.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.goalsFilters) {
			this.goals.addFilter(filter);
		}
		this.goals.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.Properties.goals, GsnViewsRepository.SWT_KIND));
		this.goals.createControls(parent);
		this.goals.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.goals, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData goalsData = new GridData(GridData.FILL_HORIZONTAL);
		goalsData.horizontalSpan = 3;
		this.goals.setLayoutData(goalsData);
		this.goals.setLowerBound(0);
		this.goals.setUpperBound(-1);
		goals.setID(GsnViewsRepository.Strategy.Properties.goals);
		goals.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createJustificationsAdvancedTableComposition(Composite parent) {
		this.justifications = new ReferencesTable(GsnMessages.StrategyPropertiesEditionPart_JustificationsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.justifications, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				justifications.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.justifications, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				justifications.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.justifications, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				justifications.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.justifications, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				justifications.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.justificationsFilters) {
			this.justifications.addFilter(filter);
		}
		this.justifications.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.Properties.justifications, GsnViewsRepository.SWT_KIND));
		this.justifications.createControls(parent);
		this.justifications.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.justifications, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData justificationsData = new GridData(GridData.FILL_HORIZONTAL);
		justificationsData.horizontalSpan = 3;
		this.justifications.setLayoutData(justificationsData);
		this.justifications.setLowerBound(0);
		this.justifications.setUpperBound(-1);
		justifications.setID(GsnViewsRepository.Strategy.Properties.justifications);
		justifications.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createStrategyContextsAdvancedTableComposition(Composite parent) {
		this.strategyContexts = new ReferencesTable(GsnMessages.StrategyPropertiesEditionPart_StrategyContextsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.strategyContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				strategyContexts.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.strategyContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				strategyContexts.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.strategyContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				strategyContexts.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.strategyContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				strategyContexts.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.strategyContextsFilters) {
			this.strategyContexts.addFilter(filter);
		}
		this.strategyContexts.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.Properties.strategyContexts, GsnViewsRepository.SWT_KIND));
		this.strategyContexts.createControls(parent);
		this.strategyContexts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.strategyContexts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData strategyContextsData = new GridData(GridData.FILL_HORIZONTAL);
		strategyContextsData.horizontalSpan = 3;
		this.strategyContexts.setLayoutData(strategyContextsData);
		this.strategyContexts.setLowerBound(0);
		this.strategyContexts.setUpperBound(-1);
		strategyContexts.setID(GsnViewsRepository.Strategy.Properties.strategyContexts);
		strategyContexts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createStrategySolutionsAdvancedTableComposition(Composite parent) {
		this.strategySolutions = new ReferencesTable(GsnMessages.StrategyPropertiesEditionPart_StrategySolutionsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.strategySolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				strategySolutions.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.strategySolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				strategySolutions.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.strategySolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				strategySolutions.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.strategySolutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				strategySolutions.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.strategySolutionsFilters) {
			this.strategySolutions.addFilter(filter);
		}
		this.strategySolutions.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.Properties.strategySolutions, GsnViewsRepository.SWT_KIND));
		this.strategySolutions.createControls(parent);
		this.strategySolutions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, GsnViewsRepository.Strategy.Properties.strategySolutions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData strategySolutionsData = new GridData(GridData.FILL_HORIZONTAL);
		strategySolutionsData.horizontalSpan = 3;
		this.strategySolutions.setLayoutData(strategySolutionsData);
		this.strategySolutions.setLowerBound(0);
		this.strategySolutions.setUpperBound(-1);
		strategySolutions.setID(GsnViewsRepository.Strategy.Properties.strategySolutions);
		strategySolutions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
			content.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#updateIsTagged()
	 * 
	 */
	public void updateIsTagged() {
	isTagged.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
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
		return ((ReferencesTableSettings)isTagged.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#initGoals(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initGoals(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		goals.setContentProvider(contentProvider);
		goals.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#updateGoals()
	 * 
	 */
	public void updateGoals() {
	goals.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addFilterGoals(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGoals(ViewerFilter filter) {
		goalsFilters.add(filter);
		if (this.goals != null) {
			this.goals.addFilter(filter);
		}
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
		return ((ReferencesTableSettings)goals.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#initJustifications(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initJustifications(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		justifications.setContentProvider(contentProvider);
		justifications.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#updateJustifications()
	 * 
	 */
	public void updateJustifications() {
	justifications.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addFilterJustifications(ViewerFilter filter)
	 * 
	 */
	public void addFilterToJustifications(ViewerFilter filter) {
		justificationsFilters.add(filter);
		if (this.justifications != null) {
			this.justifications.addFilter(filter);
		}
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
		return ((ReferencesTableSettings)justifications.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#initStrategyContexts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initStrategyContexts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		strategyContexts.setContentProvider(contentProvider);
		strategyContexts.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#updateStrategyContexts()
	 * 
	 */
	public void updateStrategyContexts() {
	strategyContexts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addFilterStrategyContexts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStrategyContexts(ViewerFilter filter) {
		strategyContextsFilters.add(filter);
		if (this.strategyContexts != null) {
			this.strategyContexts.addFilter(filter);
		}
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
		return ((ReferencesTableSettings)strategyContexts.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#initStrategySolutions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initStrategySolutions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		strategySolutions.setContentProvider(contentProvider);
		strategySolutions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#updateStrategySolutions()
	 * 
	 */
	public void updateStrategySolutions() {
	strategySolutions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addFilterStrategySolutions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStrategySolutions(ViewerFilter filter) {
		strategySolutionsFilters.add(filter);
		if (this.strategySolutions != null) {
			this.strategySolutions.addFilter(filter);
		}
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
		return ((ReferencesTableSettings)strategySolutions.getInput()).contains(element);
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
