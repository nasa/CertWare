/**
 * Generated with Acceleo
 */
package net.certware.argument.eur.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.certware.argument.eur.parts.EurViewsRepository;
import net.certware.argument.eur.parts.StrategyPropertiesEditionPart;
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
protected ReferencesTable argument;
protected List<ViewerFilter> argumentBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> argumentFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable justification;
protected List<ViewerFilter> justificationBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> justificationFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable solution;
	protected List<ViewerFilter> solutionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> solutionFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable criteria;
	protected List<ViewerFilter> criteriaBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> criteriaFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable assumption;
protected List<ViewerFilter> assumptionBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> assumptionFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable contexts;
protected List<ViewerFilter> contextsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> contextsFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable strategies;
protected List<ViewerFilter> strategiesBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> strategiesFilters = new ArrayList<ViewerFilter>();



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
		CompositionStep propertiesStep = strategyStep.addStep(EurViewsRepository.Strategy.Properties.class);
		propertiesStep.addStep(EurViewsRepository.Strategy.Properties.identifier);
		propertiesStep.addStep(EurViewsRepository.Strategy.Properties.description);
		propertiesStep.addStep(EurViewsRepository.Strategy.Properties.content);
		propertiesStep.addStep(EurViewsRepository.Strategy.Properties.isTagged);
		propertiesStep.addStep(EurViewsRepository.Strategy.Properties.argument);
		propertiesStep.addStep(EurViewsRepository.Strategy.Properties.justification);
		propertiesStep.addStep(EurViewsRepository.Strategy.Properties.solution);
		propertiesStep.addStep(EurViewsRepository.Strategy.Properties.criteria);
		propertiesStep.addStep(EurViewsRepository.Strategy.Properties.assumption);
		propertiesStep.addStep(EurViewsRepository.Strategy.Properties.contexts);
		propertiesStep.addStep(EurViewsRepository.Strategy.Properties.strategies);
		
		
		composer = new PartComposer(strategyStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EurViewsRepository.Strategy.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EurViewsRepository.Strategy.Properties.identifier) {
					return createIdentifierText(parent);
				}
				if (key == EurViewsRepository.Strategy.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == EurViewsRepository.Strategy.Properties.content) {
					return createContentText(parent);
				}
				if (key == EurViewsRepository.Strategy.Properties.isTagged) {
					return createIsTaggedAdvancedTableComposition(parent);
				}
				if (key == EurViewsRepository.Strategy.Properties.argument) {
					return createArgumentAdvancedTableComposition(parent);
				}
				if (key == EurViewsRepository.Strategy.Properties.justification) {
					return createJustificationAdvancedTableComposition(parent);
				}
				if (key == EurViewsRepository.Strategy.Properties.solution) {
					return createSolutionAdvancedReferencesTable(parent);
				}
				if (key == EurViewsRepository.Strategy.Properties.criteria) {
					return createCriteriaAdvancedReferencesTable(parent);
				}
				if (key == EurViewsRepository.Strategy.Properties.assumption) {
					return createAssumptionAdvancedTableComposition(parent);
				}
				if (key == EurViewsRepository.Strategy.Properties.contexts) {
					return createContextsAdvancedTableComposition(parent);
				}
				if (key == EurViewsRepository.Strategy.Properties.strategies) {
					return createStrategiesAdvancedTableComposition(parent);
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
		propertiesGroup.setText(EurMessages.StrategyPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdentifierText(Composite parent) {
		SWTUtils.createPartLabel(parent, EurMessages.StrategyPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Strategy.Properties.identifier, EurViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, EurViewsRepository.Strategy.Properties.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.Properties.identifier, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, EurMessages.StrategyPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Strategy.Properties.description, EurViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, EurViewsRepository.Strategy.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.Properties.description, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createContentText(Composite parent) {
		SWTUtils.createPartLabel(parent, EurMessages.StrategyPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Strategy.Properties.content, EurViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}

		});
		EditingUtils.setID(content, EurViewsRepository.Strategy.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.Properties.content, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createIsTaggedAdvancedTableComposition(Composite parent) {
		this.isTagged = new ReferencesTable(EurMessages.StrategyPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				isTagged.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				isTagged.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				isTagged.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				isTagged.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.isTaggedFilters) {
			this.isTagged.addFilter(filter);
		}
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.Properties.isTagged, EurViewsRepository.SWT_KIND));
		this.isTagged.createControls(parent);
		this.isTagged.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(EurViewsRepository.Strategy.Properties.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createArgumentAdvancedTableComposition(Composite parent) {
		this.argument = new ReferencesTable(EurMessages.StrategyPropertiesEditionPart_ArgumentLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.argument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				argument.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.argument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				argument.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.argument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				argument.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.argument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				argument.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.argumentFilters) {
			this.argument.addFilter(filter);
		}
		this.argument.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.Properties.argument, EurViewsRepository.SWT_KIND));
		this.argument.createControls(parent);
		this.argument.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.argument, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData argumentData = new GridData(GridData.FILL_HORIZONTAL);
		argumentData.horizontalSpan = 3;
		this.argument.setLayoutData(argumentData);
		this.argument.setLowerBound(0);
		this.argument.setUpperBound(-1);
		argument.setID(EurViewsRepository.Strategy.Properties.argument);
		argument.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createJustificationAdvancedTableComposition(Composite parent) {
		this.justification = new ReferencesTable(EurMessages.StrategyPropertiesEditionPart_JustificationLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				justification.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				justification.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				justification.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				justification.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.justificationFilters) {
			this.justification.addFilter(filter);
		}
		this.justification.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.Properties.justification, EurViewsRepository.SWT_KIND));
		this.justification.createControls(parent);
		this.justification.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.justification, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData justificationData = new GridData(GridData.FILL_HORIZONTAL);
		justificationData.horizontalSpan = 3;
		this.justification.setLayoutData(justificationData);
		this.justification.setLowerBound(0);
		this.justification.setUpperBound(-1);
		justification.setID(EurViewsRepository.Strategy.Properties.justification);
		justification.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSolutionAdvancedReferencesTable(Composite parent) {
		this.solution = new ReferencesTable(EurMessages.StrategyPropertiesEditionPart_SolutionLabel, new ReferencesTableListener() {
			public void handleAdd() { addSolution(); }
			public void handleEdit(EObject element) { editSolution(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSolution(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSolution(element); }
			public void navigateTo(EObject element) { }
		});
		this.solution.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.Properties.solution, EurViewsRepository.SWT_KIND));
		this.solution.createControls(parent);
		this.solution.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.solution, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData solutionData = new GridData(GridData.FILL_HORIZONTAL);
		solutionData.horizontalSpan = 3;
		this.solution.setLayoutData(solutionData);
		this.solution.disableMove();
		solution.setID(EurViewsRepository.Strategy.Properties.solution);
		solution.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSolution() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(solution.getInput(), solutionFilters, solutionBusinessFilters,
		"solution", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.solution,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				solution.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSolution(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		solution.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSolution(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		solution.refresh();
	}

	/**
	 * 
	 */
	protected void editSolution(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				solution.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createCriteriaAdvancedReferencesTable(Composite parent) {
		this.criteria = new ReferencesTable(EurMessages.StrategyPropertiesEditionPart_CriteriaLabel, new ReferencesTableListener() {
			public void handleAdd() { addCriteria(); }
			public void handleEdit(EObject element) { editCriteria(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCriteria(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCriteria(element); }
			public void navigateTo(EObject element) { }
		});
		this.criteria.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.Properties.criteria, EurViewsRepository.SWT_KIND));
		this.criteria.createControls(parent);
		this.criteria.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.criteria, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData criteriaData = new GridData(GridData.FILL_HORIZONTAL);
		criteriaData.horizontalSpan = 3;
		this.criteria.setLayoutData(criteriaData);
		this.criteria.disableMove();
		criteria.setID(EurViewsRepository.Strategy.Properties.criteria);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.criteria,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.criteria, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		criteria.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCriteria(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.criteria, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createAssumptionAdvancedTableComposition(Composite parent) {
		this.assumption = new ReferencesTable(EurMessages.StrategyPropertiesEditionPart_AssumptionLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				assumption.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				assumption.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				assumption.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				assumption.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.assumptionFilters) {
			this.assumption.addFilter(filter);
		}
		this.assumption.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.Properties.assumption, EurViewsRepository.SWT_KIND));
		this.assumption.createControls(parent);
		this.assumption.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.assumption, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData assumptionData = new GridData(GridData.FILL_HORIZONTAL);
		assumptionData.horizontalSpan = 3;
		this.assumption.setLayoutData(assumptionData);
		this.assumption.setLowerBound(0);
		this.assumption.setUpperBound(-1);
		assumption.setID(EurViewsRepository.Strategy.Properties.assumption);
		assumption.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createContextsAdvancedTableComposition(Composite parent) {
		this.contexts = new ReferencesTable(EurMessages.StrategyPropertiesEditionPart_ContextsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.contexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				contexts.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.contexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				contexts.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.contexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				contexts.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.contexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				contexts.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.contextsFilters) {
			this.contexts.addFilter(filter);
		}
		this.contexts.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.Properties.contexts, EurViewsRepository.SWT_KIND));
		this.contexts.createControls(parent);
		this.contexts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.contexts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData contextsData = new GridData(GridData.FILL_HORIZONTAL);
		contextsData.horizontalSpan = 3;
		this.contexts.setLayoutData(contextsData);
		this.contexts.setLowerBound(0);
		this.contexts.setUpperBound(-1);
		contexts.setID(EurViewsRepository.Strategy.Properties.contexts);
		contexts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createStrategiesAdvancedTableComposition(Composite parent) {
		this.strategies = new ReferencesTable(EurMessages.StrategyPropertiesEditionPart_StrategiesLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				strategies.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				strategies.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				strategies.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				strategies.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.strategiesFilters) {
			this.strategies.addFilter(filter);
		}
		this.strategies.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.Properties.strategies, EurViewsRepository.SWT_KIND));
		this.strategies.createControls(parent);
		this.strategies.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartImpl.this, EurViewsRepository.Strategy.Properties.strategies, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData strategiesData = new GridData(GridData.FILL_HORIZONTAL);
		strategiesData.horizontalSpan = 3;
		this.strategies.setLayoutData(strategiesData);
		this.strategies.setLowerBound(0);
		this.strategies.setUpperBound(-1);
		strategies.setID(EurViewsRepository.Strategy.Properties.strategies);
		strategies.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#setIdentifier(String newValue)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#setDescription(String newValue)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#setContent(String newValue)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#updateIsTagged()
	 * 
	 */
	public void updateIsTagged() {
	isTagged.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return ((ReferencesTableSettings)isTagged.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#initArgument(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#updateArgument()
	 * 
	 */
	public void updateArgument() {
	argument.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addFilterArgument(ViewerFilter filter)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addBusinessFilterArgument(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToArgument(ViewerFilter filter) {
		argumentBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#isContainedInArgumentTable(EObject element)
	 * 
	 */
	public boolean isContainedInArgumentTable(EObject element) {
		return ((ReferencesTableSettings)argument.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#initJustification(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#updateJustification()
	 * 
	 */
	public void updateJustification() {
	justification.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addFilterJustification(ViewerFilter filter)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addBusinessFilterJustification(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToJustification(ViewerFilter filter) {
		justificationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#isContainedInJustificationTable(EObject element)
	 * 
	 */
	public boolean isContainedInJustificationTable(EObject element) {
		return ((ReferencesTableSettings)justification.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#initSolution(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#updateSolution()
	 * 
	 */
	public void updateSolution() {
	solution.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addFilterSolution(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSolution(ViewerFilter filter) {
		solutionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addBusinessFilterSolution(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSolution(ViewerFilter filter) {
		solutionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#isContainedInSolutionTable(EObject element)
	 * 
	 */
	public boolean isContainedInSolutionTable(EObject element) {
		return ((ReferencesTableSettings)solution.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#initCriteria(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#updateCriteria()
	 * 
	 */
	public void updateCriteria() {
	criteria.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addFilterCriteria(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCriteria(ViewerFilter filter) {
		criteriaFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addBusinessFilterCriteria(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCriteria(ViewerFilter filter) {
		criteriaBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#isContainedInCriteriaTable(EObject element)
	 * 
	 */
	public boolean isContainedInCriteriaTable(EObject element) {
		return ((ReferencesTableSettings)criteria.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#initAssumption(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#updateAssumption()
	 * 
	 */
	public void updateAssumption() {
	assumption.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addFilterAssumption(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAssumption(ViewerFilter filter) {
		assumptionFilters.add(filter);
		if (this.assumption != null) {
			this.assumption.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addBusinessFilterAssumption(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAssumption(ViewerFilter filter) {
		assumptionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#isContainedInAssumptionTable(EObject element)
	 * 
	 */
	public boolean isContainedInAssumptionTable(EObject element) {
		return ((ReferencesTableSettings)assumption.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#initContexts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContexts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		contexts.setContentProvider(contentProvider);
		contexts.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#updateContexts()
	 * 
	 */
	public void updateContexts() {
	contexts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addFilterContexts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContexts(ViewerFilter filter) {
		contextsFilters.add(filter);
		if (this.contexts != null) {
			this.contexts.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addBusinessFilterContexts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContexts(ViewerFilter filter) {
		contextsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#isContainedInContextsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContextsTable(EObject element) {
		return ((ReferencesTableSettings)contexts.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#initStrategies(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#updateStrategies()
	 * 
	 */
	public void updateStrategies() {
	strategies.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addFilterStrategies(ViewerFilter filter)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addBusinessFilterStrategies(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStrategies(ViewerFilter filter) {
		strategiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#isContainedInStrategiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInStrategiesTable(EObject element) {
		return ((ReferencesTableSettings)strategies.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EurMessages.Strategy_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
