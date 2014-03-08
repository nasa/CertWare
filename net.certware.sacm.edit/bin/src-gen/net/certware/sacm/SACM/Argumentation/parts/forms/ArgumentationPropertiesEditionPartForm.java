// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Argumentation.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.sacm.SACM.Argumentation.parts.ArgumentationPropertiesEditionPart;
import net.certware.sacm.SACM.Argumentation.parts.ArgumentationViewsRepository;
import net.certware.sacm.SACM.Argumentation.providers.ArgumentationMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;

// End of user code

/**
 * @author Kestrel Technology LLC
 * 
 */
public class ArgumentationPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ArgumentationPropertiesEditionPart {

	protected Text id;
	protected Text description;
	protected Text content;
	protected ReferencesTable argumentation;
	protected List<ViewerFilter> argumentationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> argumentationFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable argumentElement;
	protected List<ViewerFilter> argumentElementBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> argumentElementFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public ArgumentationPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ArgumentationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence argumentation_Step = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = argumentation_Step.addStep(ArgumentationViewsRepository.Argumentation_.Properties.class);
		propertiesStep.addStep(ArgumentationViewsRepository.Argumentation_.Properties.id);
		propertiesStep.addStep(ArgumentationViewsRepository.Argumentation_.Properties.description);
		propertiesStep.addStep(ArgumentationViewsRepository.Argumentation_.Properties.content);
		propertiesStep.addStep(ArgumentationViewsRepository.Argumentation_.Properties.argumentation__);
		propertiesStep.addStep(ArgumentationViewsRepository.Argumentation_.Properties.argumentElement);
		
		
		composer = new PartComposer(argumentation_Step) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ArgumentationViewsRepository.Argumentation_.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.Argumentation_.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.Argumentation_.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.Argumentation_.Properties.content) {
					return createContentText(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.Argumentation_.Properties.argumentation__) {
					return createArgumentationTableComposition(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.Argumentation_.Properties.argumentElement) {
					return createArgumentElementTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(ArgumentationMessages.ArgumentationPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createIdText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArgumentationViewsRepository.Argumentation_.Properties.id, ArgumentationMessages.ArgumentationPropertiesEditionPart_IdLabel);
		id = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		id.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ArgumentationPropertiesEditionPartForm.this,
							ArgumentationViewsRepository.Argumentation_.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArgumentationPropertiesEditionPartForm.this,
									ArgumentationViewsRepository.Argumentation_.Properties.id,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, id.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArgumentationPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		id.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentationPropertiesEditionPartForm.this, ArgumentationViewsRepository.Argumentation_.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, ArgumentationViewsRepository.Argumentation_.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.Argumentation_.Properties.id, ArgumentationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArgumentationViewsRepository.Argumentation_.Properties.description, ArgumentationMessages.ArgumentationPropertiesEditionPart_DescriptionLabel);
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
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ArgumentationPropertiesEditionPartForm.this,
							ArgumentationViewsRepository.Argumentation_.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArgumentationPropertiesEditionPartForm.this,
									ArgumentationViewsRepository.Argumentation_.Properties.description,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, description.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArgumentationPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentationPropertiesEditionPartForm.this, ArgumentationViewsRepository.Argumentation_.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, ArgumentationViewsRepository.Argumentation_.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.Argumentation_.Properties.description, ArgumentationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createContentText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArgumentationViewsRepository.Argumentation_.Properties.content, ArgumentationMessages.ArgumentationPropertiesEditionPart_ContentLabel);
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
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ArgumentationPropertiesEditionPartForm.this,
							ArgumentationViewsRepository.Argumentation_.Properties.content,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArgumentationPropertiesEditionPartForm.this,
									ArgumentationViewsRepository.Argumentation_.Properties.content,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, content.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArgumentationPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentationPropertiesEditionPartForm.this, ArgumentationViewsRepository.Argumentation_.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}
		});
		EditingUtils.setID(content, ArgumentationViewsRepository.Argumentation_.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.Argumentation_.Properties.content, ArgumentationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createContentText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createArgumentationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.argumentation = new ReferencesTable(getDescription(ArgumentationViewsRepository.Argumentation_.Properties.argumentation__, ArgumentationMessages.ArgumentationPropertiesEditionPart_ArgumentationLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentationPropertiesEditionPartForm.this, ArgumentationViewsRepository.Argumentation_.Properties.argumentation__, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				argumentation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentationPropertiesEditionPartForm.this, ArgumentationViewsRepository.Argumentation_.Properties.argumentation__, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				argumentation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentationPropertiesEditionPartForm.this, ArgumentationViewsRepository.Argumentation_.Properties.argumentation__, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				argumentation.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentationPropertiesEditionPartForm.this, ArgumentationViewsRepository.Argumentation_.Properties.argumentation__, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				argumentation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.argumentationFilters) {
			this.argumentation.addFilter(filter);
		}
		this.argumentation.setHelpText(propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.Argumentation_.Properties.argumentation__, ArgumentationViewsRepository.FORM_KIND));
		this.argumentation.createControls(parent, widgetFactory);
		this.argumentation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentationPropertiesEditionPartForm.this, ArgumentationViewsRepository.Argumentation_.Properties.argumentation__, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData argumentationData = new GridData(GridData.FILL_HORIZONTAL);
		argumentationData.horizontalSpan = 3;
		this.argumentation.setLayoutData(argumentationData);
		this.argumentation.setLowerBound(0);
		this.argumentation.setUpperBound(-1);
		argumentation.setID(ArgumentationViewsRepository.Argumentation_.Properties.argumentation__);
		argumentation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createArgumentationTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createArgumentElementTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.argumentElement = new ReferencesTable(getDescription(ArgumentationViewsRepository.Argumentation_.Properties.argumentElement, ArgumentationMessages.ArgumentationPropertiesEditionPart_ArgumentElementLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentationPropertiesEditionPartForm.this, ArgumentationViewsRepository.Argumentation_.Properties.argumentElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				argumentElement.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentationPropertiesEditionPartForm.this, ArgumentationViewsRepository.Argumentation_.Properties.argumentElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				argumentElement.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentationPropertiesEditionPartForm.this, ArgumentationViewsRepository.Argumentation_.Properties.argumentElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				argumentElement.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentationPropertiesEditionPartForm.this, ArgumentationViewsRepository.Argumentation_.Properties.argumentElement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				argumentElement.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.argumentElementFilters) {
			this.argumentElement.addFilter(filter);
		}
		this.argumentElement.setHelpText(propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.Argumentation_.Properties.argumentElement, ArgumentationViewsRepository.FORM_KIND));
		this.argumentElement.createControls(parent, widgetFactory);
		this.argumentElement.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentationPropertiesEditionPartForm.this, ArgumentationViewsRepository.Argumentation_.Properties.argumentElement, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData argumentElementData = new GridData(GridData.FILL_HORIZONTAL);
		argumentElementData.horizontalSpan = 3;
		this.argumentElement.setLayoutData(argumentElementData);
		this.argumentElement.setLowerBound(0);
		this.argumentElement.setUpperBound(-1);
		argumentElement.setID(ArgumentationViewsRepository.Argumentation_.Properties.argumentElement);
		argumentElement.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createArgumentElementTableComposition

		// End of user code
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
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentationPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentationPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.Argumentation_.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(ArgumentationMessages.Argumentation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentationPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentationPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.Argumentation_.Properties.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(ArgumentationMessages.Argumentation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentationPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentationPropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.Argumentation_.Properties.content);
		if (eefElementEditorReadOnlyState && content.isEnabled()) {
			content.setEnabled(false);
			content.setToolTipText(ArgumentationMessages.Argumentation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !content.isEnabled()) {
			content.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentationPropertiesEditionPart#initArgumentation(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initArgumentation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		argumentation.setContentProvider(contentProvider);
		argumentation.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.Argumentation_.Properties.argumentation__);
		if (eefElementEditorReadOnlyState && argumentation.isEnabled()) {
			argumentation.setEnabled(false);
			argumentation.setToolTipText(ArgumentationMessages.Argumentation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !argumentation.isEnabled()) {
			argumentation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentationPropertiesEditionPart#updateArgumentation()
	 * 
	 */
	public void updateArgumentation() {
	argumentation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentationPropertiesEditionPart#addFilterArgumentation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToArgumentation(ViewerFilter filter) {
		argumentationFilters.add(filter);
		if (this.argumentation != null) {
			this.argumentation.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentationPropertiesEditionPart#addBusinessFilterArgumentation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToArgumentation(ViewerFilter filter) {
		argumentationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentationPropertiesEditionPart#isContainedInArgumentationTable(EObject element)
	 * 
	 */
	public boolean isContainedInArgumentationTable(EObject element) {
		return ((ReferencesTableSettings)argumentation.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentationPropertiesEditionPart#initArgumentElement(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initArgumentElement(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		argumentElement.setContentProvider(contentProvider);
		argumentElement.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.Argumentation_.Properties.argumentElement);
		if (eefElementEditorReadOnlyState && argumentElement.isEnabled()) {
			argumentElement.setEnabled(false);
			argumentElement.setToolTipText(ArgumentationMessages.Argumentation_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !argumentElement.isEnabled()) {
			argumentElement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentationPropertiesEditionPart#updateArgumentElement()
	 * 
	 */
	public void updateArgumentElement() {
	argumentElement.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentationPropertiesEditionPart#addFilterArgumentElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToArgumentElement(ViewerFilter filter) {
		argumentElementFilters.add(filter);
		if (this.argumentElement != null) {
			this.argumentElement.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentationPropertiesEditionPart#addBusinessFilterArgumentElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToArgumentElement(ViewerFilter filter) {
		argumentElementBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentationPropertiesEditionPart#isContainedInArgumentElementTable(EObject element)
	 * 
	 */
	public boolean isContainedInArgumentElementTable(EObject element) {
		return ((ReferencesTableSettings)argumentElement.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ArgumentationMessages.Argumentation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
