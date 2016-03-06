/**
 * Generated with Acceleo
 */
package net.certware.argument.eur.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.certware.argument.eur.parts.EurViewsRepository;
import net.certware.argument.eur.parts.SolutionPropertiesEditionPart;
import net.certware.argument.eur.providers.EurMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
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
public class SolutionPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, SolutionPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected ReferencesTable isTagged;
	protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable target;
		protected List<ViewerFilter> targetBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> targetFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable source;
		protected List<ViewerFilter> sourceBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> sourceFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable context;
		protected List<ViewerFilter> contextBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> contextFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer evidence;
		protected ReferencesTable criteria;
		protected List<ViewerFilter> criteriaBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> criteriaFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SolutionPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence solutionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = solutionStep.addStep(EurViewsRepository.Solution.Properties.class);
		propertiesStep.addStep(EurViewsRepository.Solution.Properties.identifier);
		propertiesStep.addStep(EurViewsRepository.Solution.Properties.description);
		propertiesStep.addStep(EurViewsRepository.Solution.Properties.content);
		propertiesStep.addStep(EurViewsRepository.Solution.Properties.isTagged);
		propertiesStep.addStep(EurViewsRepository.Solution.Properties.target);
		propertiesStep.addStep(EurViewsRepository.Solution.Properties.source);
		propertiesStep.addStep(EurViewsRepository.Solution.Properties.context);
		propertiesStep.addStep(EurViewsRepository.Solution.Properties.evidence);
		propertiesStep.addStep(EurViewsRepository.Solution.Properties.criteria);
		
		
		composer = new PartComposer(solutionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EurViewsRepository.Solution.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EurViewsRepository.Solution.Properties.identifier) {
					return 		createIdentifierText(widgetFactory, parent);
				}
				if (key == EurViewsRepository.Solution.Properties.description) {
					return 		createDescriptionText(widgetFactory, parent);
				}
				if (key == EurViewsRepository.Solution.Properties.content) {
					return 		createContentText(widgetFactory, parent);
				}
				if (key == EurViewsRepository.Solution.Properties.isTagged) {
					return createIsTaggedTableComposition(widgetFactory, parent);
				}
				if (key == EurViewsRepository.Solution.Properties.target) {
					return createTargetReferencesTable(widgetFactory, parent);
				}
				if (key == EurViewsRepository.Solution.Properties.source) {
					return createSourceReferencesTable(widgetFactory, parent);
				}
				if (key == EurViewsRepository.Solution.Properties.context) {
					return createContextReferencesTable(widgetFactory, parent);
				}
				if (key == EurViewsRepository.Solution.Properties.evidence) {
					return createEvidenceFlatComboViewer(parent, widgetFactory);
				}
				if (key == EurViewsRepository.Solution.Properties.criteria) {
					return createCriteriaReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(EurMessages.SolutionPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, EurMessages.SolutionPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Solution.Properties.identifier, EurViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}
		});
		EditingUtils.setID(identifier, EurViewsRepository.Solution.Properties.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Solution.Properties.identifier, EurViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EurMessages.SolutionPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Solution.Properties.description, EurViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, EurViewsRepository.Solution.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Solution.Properties.description, EurViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createContentText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EurMessages.SolutionPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Solution.Properties.content, EurViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}
		});
		EditingUtils.setID(content, EurViewsRepository.Solution.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Solution.Properties.content, EurViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createIsTaggedTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.isTagged = new ReferencesTable(EurMessages.SolutionPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				isTagged.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				isTagged.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				isTagged.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				isTagged.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.isTaggedFilters) {
			this.isTagged.addFilter(filter);
		}
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Solution.Properties.isTagged, EurViewsRepository.FORM_KIND));
		this.isTagged.createControls(parent, widgetFactory);
		this.isTagged.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(EurViewsRepository.Solution.Properties.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createTargetReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.target = new ReferencesTable(EurMessages.SolutionPropertiesEditionPart_TargetLabel, new ReferencesTableListener	() {
			public void handleAdd() { addTarget(); }
			public void handleEdit(EObject element) { editTarget(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveTarget(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromTarget(element); }
			public void navigateTo(EObject element) { }
		});
		this.target.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Solution.Properties.target, EurViewsRepository.FORM_KIND));
		this.target.createControls(parent, widgetFactory);
		this.target.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.target, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		targetData.horizontalSpan = 3;
		this.target.setLayoutData(targetData);
		this.target.disableMove();
		target.setID(EurViewsRepository.Solution.Properties.target);
		target.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addTarget() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(target.getInput(), targetFilters, targetBusinessFilters,
		"target", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.target,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				target.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveTarget(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		target.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromTarget(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		target.refresh();
	}

	/**
	 * 
	 */
	protected void editTarget(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				target.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSourceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.source = new ReferencesTable(EurMessages.SolutionPropertiesEditionPart_SourceLabel, new ReferencesTableListener	() {
			public void handleAdd() { addSource(); }
			public void handleEdit(EObject element) { editSource(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSource(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSource(element); }
			public void navigateTo(EObject element) { }
		});
		this.source.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Solution.Properties.source, EurViewsRepository.FORM_KIND));
		this.source.createControls(parent, widgetFactory);
		this.source.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.source, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		sourceData.horizontalSpan = 3;
		this.source.setLayoutData(sourceData);
		this.source.disableMove();
		source.setID(EurViewsRepository.Solution.Properties.source);
		source.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSource() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(source.getInput(), sourceFilters, sourceBusinessFilters,
		"source", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.source,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				source.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSource(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		source.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSource(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		source.refresh();
	}

	/**
	 * 
	 */
	protected void editSource(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				source.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createContextReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.context = new ReferencesTable(EurMessages.SolutionPropertiesEditionPart_ContextLabel, new ReferencesTableListener	() {
			public void handleAdd() { addContext(); }
			public void handleEdit(EObject element) { editContext(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveContext(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromContext(element); }
			public void navigateTo(EObject element) { }
		});
		this.context.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Solution.Properties.context, EurViewsRepository.FORM_KIND));
		this.context.createControls(parent, widgetFactory);
		this.context.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.context, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData contextData = new GridData(GridData.FILL_HORIZONTAL);
		contextData.horizontalSpan = 3;
		this.context.setLayoutData(contextData);
		this.context.disableMove();
		context.setID(EurViewsRepository.Solution.Properties.context);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.context,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		context.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromContext(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
				// context.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createEvidenceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, EurMessages.SolutionPropertiesEditionPart_EvidenceLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Solution.Properties.evidence, EurViewsRepository.FORM_KIND));
		evidence = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EurViewsRepository.Solution.Properties.evidence, EurViewsRepository.FORM_KIND));
		widgetFactory.adapt(evidence);
		evidence.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData evidenceData = new GridData(GridData.FILL_HORIZONTAL);
		evidence.setLayoutData(evidenceData);
		evidence.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.evidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEvidence()));
			}

		});
		evidence.setID(EurViewsRepository.Solution.Properties.evidence);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Solution.Properties.evidence, EurViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createCriteriaReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.criteria = new ReferencesTable(EurMessages.SolutionPropertiesEditionPart_CriteriaLabel, new ReferencesTableListener	() {
			public void handleAdd() { addCriteria(); }
			public void handleEdit(EObject element) { editCriteria(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCriteria(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCriteria(element); }
			public void navigateTo(EObject element) { }
		});
		this.criteria.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Solution.Properties.criteria, EurViewsRepository.FORM_KIND));
		this.criteria.createControls(parent, widgetFactory);
		this.criteria.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.criteria, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData criteriaData = new GridData(GridData.FILL_HORIZONTAL);
		criteriaData.horizontalSpan = 3;
		this.criteria.setLayoutData(criteriaData);
		this.criteria.disableMove();
		criteria.setID(EurViewsRepository.Solution.Properties.criteria);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.criteria,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.criteria, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		criteria.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCriteria(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartForm.this, EurViewsRepository.Solution.Properties.criteria, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#setIdentifier(String newValue)
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
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#setDescription(String newValue)
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
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#setContent(String newValue)
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
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#updateIsTagged()
	 * 
	 */
	public void updateIsTagged() {
	isTagged.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
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
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return ((ReferencesTableSettings)isTagged.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#initTarget(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initTarget(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		target.setContentProvider(contentProvider);
		target.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#updateTarget()
	 * 
	 */
	public void updateTarget() {
	target.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter) {
		targetFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter) {
		targetBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#isContainedInTargetTable(EObject element)
	 * 
	 */
	public boolean isContainedInTargetTable(EObject element) {
		return ((ReferencesTableSettings)target.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#initSource(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSource(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		source.setContentProvider(contentProvider);
		source.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#updateSource()
	 * 
	 */
	public void updateSource() {
	source.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#addFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSource(ViewerFilter filter) {
		sourceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#addBusinessFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSource(ViewerFilter filter) {
		sourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#isContainedInSourceTable(EObject element)
	 * 
	 */
	public boolean isContainedInSourceTable(EObject element) {
		return ((ReferencesTableSettings)source.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#initContext(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#updateContext()
	 * 
	 */
	public void updateContext() {
	context.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#addFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContext(ViewerFilter filter) {
		contextFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#addBusinessFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContext(ViewerFilter filter) {
		contextBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#isContainedInContextTable(EObject element)
	 * 
	 */
	public boolean isContainedInContextTable(EObject element) {
		return ((ReferencesTableSettings)context.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#getEvidence()
	 * 
	 */
	public EObject getEvidence() {
		if (evidence.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) evidence.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#initEvidence(EObjectFlatComboSettings)
	 */
	public void initEvidence(EObjectFlatComboSettings settings) {
		evidence.setInput(settings);
		if (current != null) {
			evidence.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#setEvidence(EObject newValue)
	 * 
	 */
	public void setEvidence(EObject newValue) {
		if (newValue != null) {
			evidence.setSelection(new StructuredSelection(newValue));
		} else {
			evidence.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#setEvidenceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setEvidenceButtonMode(ButtonsModeEnum newValue) {
		evidence.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#addFilterEvidence(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEvidence(ViewerFilter filter) {
		evidence.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#addBusinessFilterEvidence(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEvidence(ViewerFilter filter) {
		evidence.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#initCriteria(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#updateCriteria()
	 * 
	 */
	public void updateCriteria() {
	criteria.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#addFilterCriteria(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCriteria(ViewerFilter filter) {
		criteriaFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#addBusinessFilterCriteria(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCriteria(ViewerFilter filter) {
		criteriaBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.SolutionPropertiesEditionPart#isContainedInCriteriaTable(EObject element)
	 * 
	 */
	public boolean isContainedInCriteriaTable(EObject element) {
		return ((ReferencesTableSettings)criteria.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EurMessages.Solution_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
