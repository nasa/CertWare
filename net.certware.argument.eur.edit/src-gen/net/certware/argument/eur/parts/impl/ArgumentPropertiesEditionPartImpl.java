/**
 * Generated with Acceleo
 */
package net.certware.argument.eur.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.certware.argument.eur.parts.ArgumentPropertiesEditionPart;
import net.certware.argument.eur.parts.EurViewsRepository;
import net.certware.argument.eur.providers.EurMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
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
public class ArgumentPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ArgumentPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
protected ReferencesTable isTagged;
protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected Button assumed;
	protected Button toBeSupported;
protected ReferencesTable strategy;
protected List<ViewerFilter> strategyBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> strategyFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable assumption;
	protected List<ViewerFilter> assumptionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> assumptionFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable context;
	protected List<ViewerFilter> contextBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> contextFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable solution;
protected List<ViewerFilter> solutionBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> solutionFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable argument;
protected List<ViewerFilter> argumentBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> argumentFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable criteria;
	protected List<ViewerFilter> criteriaBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> criteriaFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable justification;
protected List<ViewerFilter> justificationBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> justificationFilters = new ArrayList<ViewerFilter>();



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
		CompositionSequence argumentStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = argumentStep.addStep(EurViewsRepository.Argument.Properties.class);
		propertiesStep.addStep(EurViewsRepository.Argument.Properties.identifier);
		propertiesStep.addStep(EurViewsRepository.Argument.Properties.description);
		propertiesStep.addStep(EurViewsRepository.Argument.Properties.content);
		propertiesStep.addStep(EurViewsRepository.Argument.Properties.isTagged);
		propertiesStep.addStep(EurViewsRepository.Argument.Properties.assumed);
		propertiesStep.addStep(EurViewsRepository.Argument.Properties.toBeSupported);
		propertiesStep.addStep(EurViewsRepository.Argument.Properties.strategy);
		propertiesStep.addStep(EurViewsRepository.Argument.Properties.assumption);
		propertiesStep.addStep(EurViewsRepository.Argument.Properties.context);
		propertiesStep.addStep(EurViewsRepository.Argument.Properties.solution);
		propertiesStep.addStep(EurViewsRepository.Argument.Properties.argument_);
		propertiesStep.addStep(EurViewsRepository.Argument.Properties.criteria);
		propertiesStep.addStep(EurViewsRepository.Argument.Properties.justification);
		
		
		composer = new PartComposer(argumentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EurViewsRepository.Argument.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EurViewsRepository.Argument.Properties.identifier) {
					return createIdentifierText(parent);
				}
				if (key == EurViewsRepository.Argument.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == EurViewsRepository.Argument.Properties.content) {
					return createContentText(parent);
				}
				if (key == EurViewsRepository.Argument.Properties.isTagged) {
					return createIsTaggedAdvancedTableComposition(parent);
				}
				if (key == EurViewsRepository.Argument.Properties.assumed) {
					return createAssumedCheckbox(parent);
				}
				if (key == EurViewsRepository.Argument.Properties.toBeSupported) {
					return createToBeSupportedCheckbox(parent);
				}
				if (key == EurViewsRepository.Argument.Properties.strategy) {
					return createStrategyAdvancedTableComposition(parent);
				}
				if (key == EurViewsRepository.Argument.Properties.assumption) {
					return createAssumptionAdvancedReferencesTable(parent);
				}
				if (key == EurViewsRepository.Argument.Properties.context) {
					return createContextAdvancedReferencesTable(parent);
				}
				if (key == EurViewsRepository.Argument.Properties.solution) {
					return createSolutionAdvancedTableComposition(parent);
				}
				if (key == EurViewsRepository.Argument.Properties.argument_) {
					return createArgumentAdvancedTableComposition(parent);
				}
				if (key == EurViewsRepository.Argument.Properties.criteria) {
					return createCriteriaAdvancedReferencesTable(parent);
				}
				if (key == EurViewsRepository.Argument.Properties.justification) {
					return createJustificationAdvancedTableComposition(parent);
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
		propertiesGroup.setText(EurMessages.ArgumentPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdentifierText(Composite parent) {
		SWTUtils.createPartLabel(parent, EurMessages.ArgumentPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Argument.Properties.identifier, EurViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, EurViewsRepository.Argument.Properties.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.Properties.identifier, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, EurMessages.ArgumentPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Argument.Properties.description, EurViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, EurViewsRepository.Argument.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.Properties.description, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createContentText(Composite parent) {
		SWTUtils.createPartLabel(parent, EurMessages.ArgumentPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Argument.Properties.content, EurViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}

		});
		EditingUtils.setID(content, EurViewsRepository.Argument.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.Properties.content, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createIsTaggedAdvancedTableComposition(Composite parent) {
		this.isTagged = new ReferencesTable(EurMessages.ArgumentPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				isTagged.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				isTagged.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				isTagged.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				isTagged.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.isTaggedFilters) {
			this.isTagged.addFilter(filter);
		}
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.Properties.isTagged, EurViewsRepository.SWT_KIND));
		this.isTagged.createControls(parent);
		this.isTagged.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(EurViewsRepository.Argument.Properties.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAssumedCheckbox(Composite parent) {
		assumed = new Button(parent, SWT.CHECK);
		assumed.setText(EurMessages.ArgumentPropertiesEditionPart_AssumedLabel);
		assumed.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.assumed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(assumed.getSelection())));
			}

		});
		GridData assumedData = new GridData(GridData.FILL_HORIZONTAL);
		assumedData.horizontalSpan = 2;
		assumed.setLayoutData(assumedData);
		EditingUtils.setID(assumed, EurViewsRepository.Argument.Properties.assumed);
		EditingUtils.setEEFtype(assumed, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.Properties.assumed, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createToBeSupportedCheckbox(Composite parent) {
		toBeSupported = new Button(parent, SWT.CHECK);
		toBeSupported.setText(EurMessages.ArgumentPropertiesEditionPart_ToBeSupportedLabel);
		toBeSupported.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.toBeSupported, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(toBeSupported.getSelection())));
			}

		});
		GridData toBeSupportedData = new GridData(GridData.FILL_HORIZONTAL);
		toBeSupportedData.horizontalSpan = 2;
		toBeSupported.setLayoutData(toBeSupportedData);
		EditingUtils.setID(toBeSupported, EurViewsRepository.Argument.Properties.toBeSupported);
		EditingUtils.setEEFtype(toBeSupported, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.Properties.toBeSupported, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createStrategyAdvancedTableComposition(Composite parent) {
		this.strategy = new ReferencesTable(EurMessages.ArgumentPropertiesEditionPart_StrategyLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.strategy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				strategy.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.strategy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				strategy.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.strategy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				strategy.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.strategy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				strategy.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.strategyFilters) {
			this.strategy.addFilter(filter);
		}
		this.strategy.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.Properties.strategy, EurViewsRepository.SWT_KIND));
		this.strategy.createControls(parent);
		this.strategy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.strategy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData strategyData = new GridData(GridData.FILL_HORIZONTAL);
		strategyData.horizontalSpan = 3;
		this.strategy.setLayoutData(strategyData);
		this.strategy.setLowerBound(0);
		this.strategy.setUpperBound(-1);
		strategy.setID(EurViewsRepository.Argument.Properties.strategy);
		strategy.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createAssumptionAdvancedReferencesTable(Composite parent) {
		this.assumption = new ReferencesTable(EurMessages.ArgumentPropertiesEditionPart_AssumptionLabel, new ReferencesTableListener() {
			public void handleAdd() { addAssumption(); }
			public void handleEdit(EObject element) { editAssumption(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveAssumption(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromAssumption(element); }
			public void navigateTo(EObject element) { }
		});
		this.assumption.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.Properties.assumption, EurViewsRepository.SWT_KIND));
		this.assumption.createControls(parent);
		this.assumption.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.assumption, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData assumptionData = new GridData(GridData.FILL_HORIZONTAL);
		assumptionData.horizontalSpan = 3;
		this.assumption.setLayoutData(assumptionData);
		this.assumption.disableMove();
		assumption.setID(EurViewsRepository.Argument.Properties.assumption);
		assumption.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addAssumption() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(assumption.getInput(), assumptionFilters, assumptionBusinessFilters,
		"assumption", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.assumption,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				assumption.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveAssumption(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		assumption.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromAssumption(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		assumption.refresh();
	}

	/**
	 * 
	 */
	protected void editAssumption(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				assumption.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createContextAdvancedReferencesTable(Composite parent) {
		this.context = new ReferencesTable(EurMessages.ArgumentPropertiesEditionPart_ContextLabel, new ReferencesTableListener() {
			public void handleAdd() { addContext(); }
			public void handleEdit(EObject element) { editContext(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveContext(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromContext(element); }
			public void navigateTo(EObject element) { }
		});
		this.context.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.Properties.context, EurViewsRepository.SWT_KIND));
		this.context.createControls(parent);
		this.context.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.context, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData contextData = new GridData(GridData.FILL_HORIZONTAL);
		contextData.horizontalSpan = 3;
		this.context.setLayoutData(contextData);
		this.context.disableMove();
		context.setID(EurViewsRepository.Argument.Properties.context);
		context.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addContext() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(context.getInput(), contextFilters, contextBusinessFilters,
		"context", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.context,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				context.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveContext(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		context.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromContext(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		context.refresh();
	}

	/**
	 * 
	 */
	protected void editContext(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				//context.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSolutionAdvancedTableComposition(Composite parent) {
		this.solution = new ReferencesTable(EurMessages.ArgumentPropertiesEditionPart_SolutionLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				solution.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				solution.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				solution.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				solution.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.solutionFilters) {
			this.solution.addFilter(filter);
		}
		this.solution.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.Properties.solution, EurViewsRepository.SWT_KIND));
		this.solution.createControls(parent);
		this.solution.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.solution, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData solutionData = new GridData(GridData.FILL_HORIZONTAL);
		solutionData.horizontalSpan = 3;
		this.solution.setLayoutData(solutionData);
		this.solution.setLowerBound(0);
		this.solution.setUpperBound(-1);
		solution.setID(EurViewsRepository.Argument.Properties.solution);
		solution.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createArgumentAdvancedTableComposition(Composite parent) {
		this.argument = new ReferencesTable(EurMessages.ArgumentPropertiesEditionPart_ArgumentLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.argument_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				argument.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.argument_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				argument.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.argument_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				argument.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.argument_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				argument.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.argumentFilters) {
			this.argument.addFilter(filter);
		}
		this.argument.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.Properties.argument_, EurViewsRepository.SWT_KIND));
		this.argument.createControls(parent);
		this.argument.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.argument_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData argumentData = new GridData(GridData.FILL_HORIZONTAL);
		argumentData.horizontalSpan = 3;
		this.argument.setLayoutData(argumentData);
		this.argument.setLowerBound(0);
		this.argument.setUpperBound(-1);
		argument.setID(EurViewsRepository.Argument.Properties.argument_);
		argument.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createCriteriaAdvancedReferencesTable(Composite parent) {
		this.criteria = new ReferencesTable(EurMessages.ArgumentPropertiesEditionPart_CriteriaLabel, new ReferencesTableListener() {
			public void handleAdd() { addCriteria(); }
			public void handleEdit(EObject element) { editCriteria(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCriteria(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCriteria(element); }
			public void navigateTo(EObject element) { }
		});
		this.criteria.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.Properties.criteria, EurViewsRepository.SWT_KIND));
		this.criteria.createControls(parent);
		this.criteria.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.criteria, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData criteriaData = new GridData(GridData.FILL_HORIZONTAL);
		criteriaData.horizontalSpan = 3;
		this.criteria.setLayoutData(criteriaData);
		this.criteria.disableMove();
		criteria.setID(EurViewsRepository.Argument.Properties.criteria);
		criteria.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addCriteria() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(criteria.getInput(), criteriaFilters, criteriaBusinessFilters,
		"criteria", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.criteria,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				criteria.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCriteria(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.criteria, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		criteria.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCriteria(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.criteria, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		criteria.refresh();
	}

	/**
	 * 
	 */
	protected void editCriteria(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				criteria.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createJustificationAdvancedTableComposition(Composite parent) {
		this.justification = new ReferencesTable(EurMessages.ArgumentPropertiesEditionPart_JustificationLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				justification.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				justification.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				justification.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				justification.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.justificationFilters) {
			this.justification.addFilter(filter);
		}
		this.justification.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.Properties.justification, EurViewsRepository.SWT_KIND));
		this.justification.createControls(parent);
		this.justification.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.Properties.justification, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData justificationData = new GridData(GridData.FILL_HORIZONTAL);
		justificationData.horizontalSpan = 3;
		this.justification.setLayoutData(justificationData);
		this.justification.setLowerBound(0);
		this.justification.setUpperBound(-1);
		justification.setID(EurViewsRepository.Argument.Properties.justification);
		justification.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#setIdentifier(String newValue)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#setDescription(String newValue)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#setContent(String newValue)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#updateIsTagged()
	 * 
	 */
	public void updateIsTagged() {
	isTagged.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return ((ReferencesTableSettings)isTagged.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getAssumed()
	 * 
	 */
	public Boolean getAssumed() {
		return Boolean.valueOf(assumed.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#setAssumed(Boolean newValue)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getToBeSupported()
	 * 
	 */
	public Boolean getToBeSupported() {
		return Boolean.valueOf(toBeSupported.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#setToBeSupported(Boolean newValue)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#initStrategy(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initStrategy(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		strategy.setContentProvider(contentProvider);
		strategy.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#updateStrategy()
	 * 
	 */
	public void updateStrategy() {
	strategy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addFilterStrategy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStrategy(ViewerFilter filter) {
		strategyFilters.add(filter);
		if (this.strategy != null) {
			this.strategy.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addBusinessFilterStrategy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStrategy(ViewerFilter filter) {
		strategyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#isContainedInStrategyTable(EObject element)
	 * 
	 */
	public boolean isContainedInStrategyTable(EObject element) {
		return ((ReferencesTableSettings)strategy.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#initAssumption(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initAssumption(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		assumption.setContentProvider(contentProvider);
		assumption.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#updateAssumption()
	 * 
	 */
	public void updateAssumption() {
	assumption.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addFilterAssumption(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAssumption(ViewerFilter filter) {
		assumptionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addBusinessFilterAssumption(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAssumption(ViewerFilter filter) {
		assumptionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#isContainedInAssumptionTable(EObject element)
	 * 
	 */
	public boolean isContainedInAssumptionTable(EObject element) {
		return ((ReferencesTableSettings)assumption.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#initContext(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initContext(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		context.setContentProvider(contentProvider);
		context.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#updateContext()
	 * 
	 */
	public void updateContext() {
	context.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContext(ViewerFilter filter) {
		contextFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addBusinessFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContext(ViewerFilter filter) {
		contextBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#isContainedInContextTable(EObject element)
	 * 
	 */
	public boolean isContainedInContextTable(EObject element) {
		return ((ReferencesTableSettings)context.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#initSolution(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSolution(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		solution.setContentProvider(contentProvider);
		solution.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#updateSolution()
	 * 
	 */
	public void updateSolution() {
	solution.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addFilterSolution(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSolution(ViewerFilter filter) {
		solutionFilters.add(filter);
		if (this.solution != null) {
			this.solution.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addBusinessFilterSolution(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSolution(ViewerFilter filter) {
		solutionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#isContainedInSolutionTable(EObject element)
	 * 
	 */
	public boolean isContainedInSolutionTable(EObject element) {
		return ((ReferencesTableSettings)solution.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#initArgument(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initArgument(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		argument.setContentProvider(contentProvider);
		argument.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#updateArgument()
	 * 
	 */
	public void updateArgument() {
	argument.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addFilterArgument(ViewerFilter filter)
	 * 
	 */
	public void addFilterToArgument(ViewerFilter filter) {
		argumentFilters.add(filter);
		if (this.argument != null) {
			this.argument.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addBusinessFilterArgument(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToArgument(ViewerFilter filter) {
		argumentBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#isContainedInArgumentTable(EObject element)
	 * 
	 */
	public boolean isContainedInArgumentTable(EObject element) {
		return ((ReferencesTableSettings)argument.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#initCriteria(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCriteria(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		criteria.setContentProvider(contentProvider);
		criteria.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#updateCriteria()
	 * 
	 */
	public void updateCriteria() {
	criteria.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addFilterCriteria(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCriteria(ViewerFilter filter) {
		criteriaFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addBusinessFilterCriteria(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCriteria(ViewerFilter filter) {
		criteriaBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#isContainedInCriteriaTable(EObject element)
	 * 
	 */
	public boolean isContainedInCriteriaTable(EObject element) {
		return ((ReferencesTableSettings)criteria.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#initJustification(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initJustification(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		justification.setContentProvider(contentProvider);
		justification.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#updateJustification()
	 * 
	 */
	public void updateJustification() {
	justification.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addFilterJustification(ViewerFilter filter)
	 * 
	 */
	public void addFilterToJustification(ViewerFilter filter) {
		justificationFilters.add(filter);
		if (this.justification != null) {
			this.justification.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addBusinessFilterJustification(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToJustification(ViewerFilter filter) {
		justificationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#isContainedInJustificationTable(EObject element)
	 * 
	 */
	public boolean isContainedInJustificationTable(EObject element) {
		return ((ReferencesTableSettings)justification.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EurMessages.Argument_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
