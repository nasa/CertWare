/**
 * Generated with Acceleo
 */
package net.certware.argument.cae.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.argument.cae.parts.CaeViewsRepository;
import net.certware.argument.cae.parts.ClaimPropertiesEditionPart;
import net.certware.argument.cae.providers.CaeMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
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
public class ClaimPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ClaimPropertiesEditionPart {

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



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ClaimPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence claimStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = claimStep.addStep(CaeViewsRepository.Claim.Properties.class);
		propertiesStep.addStep(CaeViewsRepository.Claim.Properties.identifier);
		propertiesStep.addStep(CaeViewsRepository.Claim.Properties.description);
		propertiesStep.addStep(CaeViewsRepository.Claim.Properties.content);
		propertiesStep.addStep(CaeViewsRepository.Claim.Properties.isTagged);
		propertiesStep.addStep(CaeViewsRepository.Claim.Properties.assumed);
		propertiesStep.addStep(CaeViewsRepository.Claim.Properties.toBeSupported);
		propertiesStep.addStep(CaeViewsRepository.Claim.Properties.strategy);
		propertiesStep.addStep(CaeViewsRepository.Claim.Properties.assumption);
		propertiesStep.addStep(CaeViewsRepository.Claim.Properties.context);
		propertiesStep.addStep(CaeViewsRepository.Claim.Properties.solution);
		
		
		composer = new PartComposer(claimStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CaeViewsRepository.Claim.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == CaeViewsRepository.Claim.Properties.identifier) {
					return 		createIdentifierText(widgetFactory, parent);
				}
				if (key == CaeViewsRepository.Claim.Properties.description) {
					return 		createDescriptionText(widgetFactory, parent);
				}
				if (key == CaeViewsRepository.Claim.Properties.content) {
					return 		createContentText(widgetFactory, parent);
				}
				if (key == CaeViewsRepository.Claim.Properties.isTagged) {
					return createIsTaggedTableComposition(widgetFactory, parent);
				}
				if (key == CaeViewsRepository.Claim.Properties.assumed) {
					return createAssumedCheckbox(widgetFactory, parent);
				}
				if (key == CaeViewsRepository.Claim.Properties.toBeSupported) {
					return createToBeSupportedCheckbox(widgetFactory, parent);
				}
				if (key == CaeViewsRepository.Claim.Properties.strategy) {
					return createStrategyTableComposition(widgetFactory, parent);
				}
				if (key == CaeViewsRepository.Claim.Properties.assumption) {
					return createAssumptionTableComposition(widgetFactory, parent);
				}
				if (key == CaeViewsRepository.Claim.Properties.context) {
					return createContextTableComposition(widgetFactory, parent);
				}
				if (key == CaeViewsRepository.Claim.Properties.solution) {
					return createSolutionTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(CaeMessages.ClaimPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createIdentifierText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, CaeMessages.ClaimPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(CaeViewsRepository.Claim.Properties.identifier, CaeViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}
		});
		EditingUtils.setID(identifier, CaeViewsRepository.Claim.Properties.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CaeViewsRepository.Claim.Properties.identifier, CaeViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, CaeMessages.ClaimPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(CaeViewsRepository.Claim.Properties.description, CaeViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, CaeViewsRepository.Claim.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CaeViewsRepository.Claim.Properties.description, CaeViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createContentText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, CaeMessages.ClaimPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(CaeViewsRepository.Claim.Properties.content, CaeViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}
		});
		EditingUtils.setID(content, CaeViewsRepository.Claim.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CaeViewsRepository.Claim.Properties.content, CaeViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createIsTaggedTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.isTagged = new ReferencesTable(CaeMessages.ClaimPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				isTagged.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				isTagged.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				isTagged.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				isTagged.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.isTaggedFilters) {
			this.isTagged.addFilter(filter);
		}
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Claim.Properties.isTagged, CaeViewsRepository.FORM_KIND));
		this.isTagged.createControls(parent, widgetFactory);
		this.isTagged.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(CaeViewsRepository.Claim.Properties.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAssumedCheckbox(FormToolkit widgetFactory, Composite parent) {
		assumed = widgetFactory.createButton(parent, CaeMessages.ClaimPropertiesEditionPart_AssumedLabel, SWT.CHECK);
		assumed.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.assumed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(assumed.getSelection())));
			}

		});
		GridData assumedData = new GridData(GridData.FILL_HORIZONTAL);
		assumedData.horizontalSpan = 2;
		assumed.setLayoutData(assumedData);
		EditingUtils.setID(assumed, CaeViewsRepository.Claim.Properties.assumed);
		EditingUtils.setEEFtype(assumed, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CaeViewsRepository.Claim.Properties.assumed, CaeViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createToBeSupportedCheckbox(FormToolkit widgetFactory, Composite parent) {
		toBeSupported = widgetFactory.createButton(parent, CaeMessages.ClaimPropertiesEditionPart_ToBeSupportedLabel, SWT.CHECK);
		toBeSupported.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.toBeSupported, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(toBeSupported.getSelection())));
			}

		});
		GridData toBeSupportedData = new GridData(GridData.FILL_HORIZONTAL);
		toBeSupportedData.horizontalSpan = 2;
		toBeSupported.setLayoutData(toBeSupportedData);
		EditingUtils.setID(toBeSupported, CaeViewsRepository.Claim.Properties.toBeSupported);
		EditingUtils.setEEFtype(toBeSupported, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CaeViewsRepository.Claim.Properties.toBeSupported, CaeViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createStrategyTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.strategy = new ReferencesTable(CaeMessages.ClaimPropertiesEditionPart_StrategyLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.strategy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				strategy.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.strategy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				strategy.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.strategy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				strategy.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.strategy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				strategy.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.strategyFilters) {
			this.strategy.addFilter(filter);
		}
		this.strategy.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Claim.Properties.strategy, CaeViewsRepository.FORM_KIND));
		this.strategy.createControls(parent, widgetFactory);
		this.strategy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.strategy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData strategyData = new GridData(GridData.FILL_HORIZONTAL);
		strategyData.horizontalSpan = 3;
		this.strategy.setLayoutData(strategyData);
		this.strategy.setLowerBound(0);
		this.strategy.setUpperBound(-1);
		strategy.setID(CaeViewsRepository.Claim.Properties.strategy);
		strategy.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAssumptionTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.assumption = new ReferencesTable(CaeMessages.ClaimPropertiesEditionPart_AssumptionLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				assumption.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				assumption.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				assumption.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				assumption.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.assumptionFilters) {
			this.assumption.addFilter(filter);
		}
		this.assumption.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Claim.Properties.assumption, CaeViewsRepository.FORM_KIND));
		this.assumption.createControls(parent, widgetFactory);
		this.assumption.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.assumption, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData assumptionData = new GridData(GridData.FILL_HORIZONTAL);
		assumptionData.horizontalSpan = 3;
		this.assumption.setLayoutData(assumptionData);
		this.assumption.setLowerBound(0);
		this.assumption.setUpperBound(-1);
		assumption.setID(CaeViewsRepository.Claim.Properties.assumption);
		assumption.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createContextTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.context = new ReferencesTable(CaeMessages.ClaimPropertiesEditionPart_ContextLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				context.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				context.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				context.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				context.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.contextFilters) {
			this.context.addFilter(filter);
		}
		this.context.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Claim.Properties.context, CaeViewsRepository.FORM_KIND));
		this.context.createControls(parent, widgetFactory);
		this.context.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.context, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData contextData = new GridData(GridData.FILL_HORIZONTAL);
		contextData.horizontalSpan = 3;
		this.context.setLayoutData(contextData);
		this.context.setLowerBound(0);
		this.context.setUpperBound(-1);
		context.setID(CaeViewsRepository.Claim.Properties.context);
		context.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSolutionTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.solution = new ReferencesTable(CaeMessages.ClaimPropertiesEditionPart_SolutionLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				solution.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				solution.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				solution.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				solution.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.solutionFilters) {
			this.solution.addFilter(filter);
		}
		this.solution.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Claim.Properties.solution, CaeViewsRepository.FORM_KIND));
		this.solution.createControls(parent, widgetFactory);
		this.solution.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, CaeViewsRepository.Claim.Properties.solution, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData solutionData = new GridData(GridData.FILL_HORIZONTAL);
		solutionData.horizontalSpan = 3;
		this.solution.setLayoutData(solutionData);
		this.solution.setLowerBound(0);
		this.solution.setUpperBound(-1);
		solution.setID(CaeViewsRepository.Claim.Properties.solution);
		solution.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#setIdentifier(String newValue)
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
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#setDescription(String newValue)
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
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#setContent(String newValue)
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
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#updateIsTagged()
	 * 
	 */
	public void updateIsTagged() {
	isTagged.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
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
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return ((ReferencesTableSettings)isTagged.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#getAssumed()
	 * 
	 */
	public Boolean getAssumed() {
		return Boolean.valueOf(assumed.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#setAssumed(Boolean newValue)
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
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#getToBeSupported()
	 * 
	 */
	public Boolean getToBeSupported() {
		return Boolean.valueOf(toBeSupported.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#setToBeSupported(Boolean newValue)
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
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#initStrategy(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#updateStrategy()
	 * 
	 */
	public void updateStrategy() {
	strategy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#addFilterStrategy(ViewerFilter filter)
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
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#addBusinessFilterStrategy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStrategy(ViewerFilter filter) {
		strategyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#isContainedInStrategyTable(EObject element)
	 * 
	 */
	public boolean isContainedInStrategyTable(EObject element) {
		return ((ReferencesTableSettings)strategy.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#initAssumption(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#updateAssumption()
	 * 
	 */
	public void updateAssumption() {
	assumption.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#addFilterAssumption(ViewerFilter filter)
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
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#addBusinessFilterAssumption(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAssumption(ViewerFilter filter) {
		assumptionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#isContainedInAssumptionTable(EObject element)
	 * 
	 */
	public boolean isContainedInAssumptionTable(EObject element) {
		return ((ReferencesTableSettings)assumption.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#initContext(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#updateContext()
	 * 
	 */
	public void updateContext() {
	context.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#addFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContext(ViewerFilter filter) {
		contextFilters.add(filter);
		if (this.context != null) {
			this.context.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#addBusinessFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContext(ViewerFilter filter) {
		contextBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#isContainedInContextTable(EObject element)
	 * 
	 */
	public boolean isContainedInContextTable(EObject element) {
		return ((ReferencesTableSettings)context.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#initSolution(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#updateSolution()
	 * 
	 */
	public void updateSolution() {
	solution.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#addFilterSolution(ViewerFilter filter)
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
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#addBusinessFilterSolution(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSolution(ViewerFilter filter) {
		solutionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ClaimPropertiesEditionPart#isContainedInSolutionTable(EObject element)
	 * 
	 */
	public boolean isContainedInSolutionTable(EObject element) {
		return ((ReferencesTableSettings)solution.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CaeMessages.Claim_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
