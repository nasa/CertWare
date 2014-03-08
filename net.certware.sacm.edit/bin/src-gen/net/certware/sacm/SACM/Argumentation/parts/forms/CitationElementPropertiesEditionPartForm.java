// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Argumentation.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.certware.sacm.SACM.Argumentation.parts.ArgumentationViewsRepository;
import net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart;
import net.certware.sacm.SACM.Argumentation.providers.ArgumentationMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
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
import org.eclipse.ui.views.properties.tabbed.ISection;

// End of user code

/**
 * @author Kestrel Technology LLC
 * 
 */
public class CitationElementPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, CitationElementPropertiesEditionPart {

	protected Text id;
	protected Text description;
	protected Text content;
	protected ReferencesTable argumentElementReference;
	protected List<ViewerFilter> argumentElementReferenceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> argumentElementReferenceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable argumentationReference;
	protected List<ViewerFilter> argumentationReferenceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> argumentationReferenceFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public CitationElementPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CitationElementPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence citationElementStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = citationElementStep.addStep(ArgumentationViewsRepository.CitationElement.Properties.class);
		propertiesStep.addStep(ArgumentationViewsRepository.CitationElement.Properties.id);
		propertiesStep.addStep(ArgumentationViewsRepository.CitationElement.Properties.description);
		propertiesStep.addStep(ArgumentationViewsRepository.CitationElement.Properties.content);
		propertiesStep.addStep(ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference);
		propertiesStep.addStep(ArgumentationViewsRepository.CitationElement.Properties.argumentationReference);
		
		
		composer = new PartComposer(citationElementStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ArgumentationViewsRepository.CitationElement.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.CitationElement.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.CitationElement.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.CitationElement.Properties.content) {
					return createContentText(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference) {
					return createArgumentElementReferenceReferencesTable(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.CitationElement.Properties.argumentationReference) {
					return createArgumentationReferenceReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(ArgumentationMessages.CitationElementPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, ArgumentationViewsRepository.CitationElement.Properties.id, ArgumentationMessages.CitationElementPropertiesEditionPart_IdLabel);
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
							CitationElementPropertiesEditionPartForm.this,
							ArgumentationViewsRepository.CitationElement.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CitationElementPropertiesEditionPartForm.this,
									ArgumentationViewsRepository.CitationElement.Properties.id,
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
									CitationElementPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartForm.this, ArgumentationViewsRepository.CitationElement.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, ArgumentationViewsRepository.CitationElement.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.CitationElement.Properties.id, ArgumentationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArgumentationViewsRepository.CitationElement.Properties.description, ArgumentationMessages.CitationElementPropertiesEditionPart_DescriptionLabel);
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
							CitationElementPropertiesEditionPartForm.this,
							ArgumentationViewsRepository.CitationElement.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CitationElementPropertiesEditionPartForm.this,
									ArgumentationViewsRepository.CitationElement.Properties.description,
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
									CitationElementPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartForm.this, ArgumentationViewsRepository.CitationElement.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, ArgumentationViewsRepository.CitationElement.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.CitationElement.Properties.description, ArgumentationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createContentText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArgumentationViewsRepository.CitationElement.Properties.content, ArgumentationMessages.CitationElementPropertiesEditionPart_ContentLabel);
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
							CitationElementPropertiesEditionPartForm.this,
							ArgumentationViewsRepository.CitationElement.Properties.content,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CitationElementPropertiesEditionPartForm.this,
									ArgumentationViewsRepository.CitationElement.Properties.content,
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
									CitationElementPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartForm.this, ArgumentationViewsRepository.CitationElement.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}
		});
		EditingUtils.setID(content, ArgumentationViewsRepository.CitationElement.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.CitationElement.Properties.content, ArgumentationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createContentText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createArgumentElementReferenceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.argumentElementReference = new ReferencesTable(getDescription(ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference, ArgumentationMessages.CitationElementPropertiesEditionPart_ArgumentElementReferenceLabel), new ReferencesTableListener	() {
			public void handleAdd() { addArgumentElementReference(); }
			public void handleEdit(EObject element) { editArgumentElementReference(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveArgumentElementReference(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromArgumentElementReference(element); }
			public void navigateTo(EObject element) { }
		});
		this.argumentElementReference.setHelpText(propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference, ArgumentationViewsRepository.FORM_KIND));
		this.argumentElementReference.createControls(parent, widgetFactory);
		this.argumentElementReference.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartForm.this, ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData argumentElementReferenceData = new GridData(GridData.FILL_HORIZONTAL);
		argumentElementReferenceData.horizontalSpan = 3;
		this.argumentElementReference.setLayoutData(argumentElementReferenceData);
		this.argumentElementReference.disableMove();
		argumentElementReference.setID(ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference);
		argumentElementReference.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createArgumentElementReferenceReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addArgumentElementReference() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(argumentElementReference.getInput(), argumentElementReferenceFilters, argumentElementReferenceBusinessFilters,
		"argumentElementReference", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartForm.this, ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				argumentElementReference.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveArgumentElementReference(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartForm.this, ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		argumentElementReference.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromArgumentElementReference(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartForm.this, ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		argumentElementReference.refresh();
	}

	/**
	 * 
	 */
	protected void editArgumentElementReference(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				argumentElementReference.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createArgumentationReferenceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.argumentationReference = new ReferencesTable(getDescription(ArgumentationViewsRepository.CitationElement.Properties.argumentationReference, ArgumentationMessages.CitationElementPropertiesEditionPart_ArgumentationReferenceLabel), new ReferencesTableListener	() {
			public void handleAdd() { addArgumentationReference(); }
			public void handleEdit(EObject element) { editArgumentationReference(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveArgumentationReference(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromArgumentationReference(element); }
			public void navigateTo(EObject element) { }
		});
		this.argumentationReference.setHelpText(propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.CitationElement.Properties.argumentationReference, ArgumentationViewsRepository.FORM_KIND));
		this.argumentationReference.createControls(parent, widgetFactory);
		this.argumentationReference.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartForm.this, ArgumentationViewsRepository.CitationElement.Properties.argumentationReference, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData argumentationReferenceData = new GridData(GridData.FILL_HORIZONTAL);
		argumentationReferenceData.horizontalSpan = 3;
		this.argumentationReference.setLayoutData(argumentationReferenceData);
		this.argumentationReference.disableMove();
		argumentationReference.setID(ArgumentationViewsRepository.CitationElement.Properties.argumentationReference);
		argumentationReference.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createArgumentationReferenceReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addArgumentationReference() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(argumentationReference.getInput(), argumentationReferenceFilters, argumentationReferenceBusinessFilters,
		"argumentationReference", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartForm.this, ArgumentationViewsRepository.CitationElement.Properties.argumentationReference,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				argumentationReference.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveArgumentationReference(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartForm.this, ArgumentationViewsRepository.CitationElement.Properties.argumentationReference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		argumentationReference.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromArgumentationReference(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartForm.this, ArgumentationViewsRepository.CitationElement.Properties.argumentationReference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		argumentationReference.refresh();
	}

	/**
	 * 
	 */
	protected void editArgumentationReference(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				argumentationReference.refresh();
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
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.CitationElement.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(ArgumentationMessages.CitationElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.CitationElement.Properties.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(ArgumentationMessages.CitationElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.CitationElement.Properties.content);
		if (eefElementEditorReadOnlyState && content.isEnabled()) {
			content.setEnabled(false);
			content.setToolTipText(ArgumentationMessages.CitationElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !content.isEnabled()) {
			content.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#initArgumentElementReference(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initArgumentElementReference(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		argumentElementReference.setContentProvider(contentProvider);
		argumentElementReference.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference);
		if (eefElementEditorReadOnlyState && argumentElementReference.getTable().isEnabled()) {
			argumentElementReference.setEnabled(false);
			argumentElementReference.setToolTipText(ArgumentationMessages.CitationElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !argumentElementReference.getTable().isEnabled()) {
			argumentElementReference.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#updateArgumentElementReference()
	 * 
	 */
	public void updateArgumentElementReference() {
	argumentElementReference.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#addFilterArgumentElementReference(ViewerFilter filter)
	 * 
	 */
	public void addFilterToArgumentElementReference(ViewerFilter filter) {
		argumentElementReferenceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#addBusinessFilterArgumentElementReference(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToArgumentElementReference(ViewerFilter filter) {
		argumentElementReferenceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#isContainedInArgumentElementReferenceTable(EObject element)
	 * 
	 */
	public boolean isContainedInArgumentElementReferenceTable(EObject element) {
		return ((ReferencesTableSettings)argumentElementReference.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#initArgumentationReference(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initArgumentationReference(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		argumentationReference.setContentProvider(contentProvider);
		argumentationReference.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.CitationElement.Properties.argumentationReference);
		if (eefElementEditorReadOnlyState && argumentationReference.getTable().isEnabled()) {
			argumentationReference.setEnabled(false);
			argumentationReference.setToolTipText(ArgumentationMessages.CitationElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !argumentationReference.getTable().isEnabled()) {
			argumentationReference.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#updateArgumentationReference()
	 * 
	 */
	public void updateArgumentationReference() {
	argumentationReference.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#addFilterArgumentationReference(ViewerFilter filter)
	 * 
	 */
	public void addFilterToArgumentationReference(ViewerFilter filter) {
		argumentationReferenceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#addBusinessFilterArgumentationReference(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToArgumentationReference(ViewerFilter filter) {
		argumentationReferenceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#isContainedInArgumentationReferenceTable(EObject element)
	 * 
	 */
	public boolean isContainedInArgumentationReferenceTable(EObject element) {
		return ((ReferencesTableSettings)argumentationReference.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ArgumentationMessages.CitationElement_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
