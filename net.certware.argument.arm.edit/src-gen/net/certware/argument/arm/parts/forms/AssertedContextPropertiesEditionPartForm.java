/**
 * Generated with Acceleo
 */
package net.certware.argument.arm.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.certware.argument.arm.parts.ArmViewsRepository;
import net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart;
import net.certware.argument.arm.providers.ArmMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
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
public class AssertedContextPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, AssertedContextPropertiesEditionPart {

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



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AssertedContextPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence assertedContextStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = assertedContextStep.addStep(ArmViewsRepository.AssertedContext.Properties.class);
		propertiesStep.addStep(ArmViewsRepository.AssertedContext.Properties.identifier);
		propertiesStep.addStep(ArmViewsRepository.AssertedContext.Properties.description);
		propertiesStep.addStep(ArmViewsRepository.AssertedContext.Properties.content);
		propertiesStep.addStep(ArmViewsRepository.AssertedContext.Properties.isTagged);
		propertiesStep.addStep(ArmViewsRepository.AssertedContext.Properties.target);
		propertiesStep.addStep(ArmViewsRepository.AssertedContext.Properties.source);
		
		
		composer = new PartComposer(assertedContextStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ArmViewsRepository.AssertedContext.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ArmViewsRepository.AssertedContext.Properties.identifier) {
					return 		createIdentifierText(widgetFactory, parent);
				}
				if (key == ArmViewsRepository.AssertedContext.Properties.description) {
					return 		createDescriptionText(widgetFactory, parent);
				}
				if (key == ArmViewsRepository.AssertedContext.Properties.content) {
					return 		createContentText(widgetFactory, parent);
				}
				if (key == ArmViewsRepository.AssertedContext.Properties.isTagged) {
					return createIsTaggedTableComposition(widgetFactory, parent);
				}
				if (key == ArmViewsRepository.AssertedContext.Properties.target) {
					return createTargetReferencesTable(widgetFactory, parent);
				}
				if (key == ArmViewsRepository.AssertedContext.Properties.source) {
					return createSourceReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(ArmMessages.AssertedContextPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, ArmMessages.AssertedContextPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.AssertedContext.Properties.identifier, ArmViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}
		});
		EditingUtils.setID(identifier, ArmViewsRepository.AssertedContext.Properties.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.AssertedContext.Properties.identifier, ArmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ArmMessages.AssertedContextPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.AssertedContext.Properties.description, ArmViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, ArmViewsRepository.AssertedContext.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.AssertedContext.Properties.description, ArmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createContentText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ArmMessages.AssertedContextPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.AssertedContext.Properties.content, ArmViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}
		});
		EditingUtils.setID(content, ArmViewsRepository.AssertedContext.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.AssertedContext.Properties.content, ArmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createIsTaggedTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.isTagged = new ReferencesTable(ArmMessages.AssertedContextPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				isTagged.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				isTagged.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				isTagged.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				isTagged.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.isTaggedFilters) {
			this.isTagged.addFilter(filter);
		}
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(ArmViewsRepository.AssertedContext.Properties.isTagged, ArmViewsRepository.FORM_KIND));
		this.isTagged.createControls(parent, widgetFactory);
		this.isTagged.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(ArmViewsRepository.AssertedContext.Properties.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createTargetReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.target = new ReferencesTable(ArmMessages.AssertedContextPropertiesEditionPart_TargetLabel, new ReferencesTableListener	() {
			public void handleAdd() { addTarget(); }
			public void handleEdit(EObject element) { editTarget(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveTarget(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromTarget(element); }
			public void navigateTo(EObject element) { }
		});
		this.target.setHelpText(propertiesEditionComponent.getHelpContent(ArmViewsRepository.AssertedContext.Properties.target, ArmViewsRepository.FORM_KIND));
		this.target.createControls(parent, widgetFactory);
		this.target.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.target, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		targetData.horizontalSpan = 3;
		this.target.setLayoutData(targetData);
		this.target.disableMove();
		target.setID(ArmViewsRepository.AssertedContext.Properties.target);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.target,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		target.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromTarget(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.source = new ReferencesTable(ArmMessages.AssertedContextPropertiesEditionPart_SourceLabel, new ReferencesTableListener	() {
			public void handleAdd() { addSource(); }
			public void handleEdit(EObject element) { editSource(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSource(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSource(element); }
			public void navigateTo(EObject element) { }
		});
		this.source.setHelpText(propertiesEditionComponent.getHelpContent(ArmViewsRepository.AssertedContext.Properties.source, ArmViewsRepository.FORM_KIND));
		this.source.createControls(parent, widgetFactory);
		this.source.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.source, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		sourceData.horizontalSpan = 3;
		this.source.setLayoutData(sourceData);
		this.source.disableMove();
		source.setID(ArmViewsRepository.AssertedContext.Properties.source);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.source,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		source.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSource(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssertedContextPropertiesEditionPartForm.this, ArmViewsRepository.AssertedContext.Properties.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#setIdentifier(String newValue)
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
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#setDescription(String newValue)
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
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#setContent(String newValue)
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
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#updateIsTagged()
	 * 
	 */
	public void updateIsTagged() {
	isTagged.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
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
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return ((ReferencesTableSettings)isTagged.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#initTarget(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#updateTarget()
	 * 
	 */
	public void updateTarget() {
	target.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter) {
		targetFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter) {
		targetBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#isContainedInTargetTable(EObject element)
	 * 
	 */
	public boolean isContainedInTargetTable(EObject element) {
		return ((ReferencesTableSettings)target.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#initSource(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#updateSource()
	 * 
	 */
	public void updateSource() {
	source.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#addFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSource(ViewerFilter filter) {
		sourceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#addBusinessFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSource(ViewerFilter filter) {
		sourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.AssertedContextPropertiesEditionPart#isContainedInSourceTable(EObject element)
	 * 
	 */
	public boolean isContainedInSourceTable(EObject element) {
		return ((ReferencesTableSettings)source.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ArmMessages.AssertedContext_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
