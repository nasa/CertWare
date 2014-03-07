// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Argumentation.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.sacm.SACM.Argumentation.parts.ArgumentationViewsRepository;
import net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart;

import net.certware.sacm.SACM.Argumentation.providers.ArgumentationMessages;

import org.eclipse.emf.ecore.EObject;

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

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * @author Kestrel Technology LLC
 * 
 */
public class ClaimPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ClaimPropertiesEditionPart {

	protected ReferencesTable taggedValue;
	protected List<ViewerFilter> taggedValueBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> taggedValueFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable annotation;
	protected List<ViewerFilter> annotationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> annotationFilters = new ArrayList<ViewerFilter>();
	protected Text id;
	protected Text description;
	protected Text content;
	protected Button assumed;
	protected Button toBeSupported;



	/**
	 * For {@link ISection} use only.
	 */
	public ClaimPropertiesEditionPartForm() { super(); }

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
		CompositionStep propertiesStep = claimStep.addStep(ArgumentationViewsRepository.Claim.Properties.class);
		propertiesStep.addStep(ArgumentationViewsRepository.Claim.Properties.taggedValue);
		propertiesStep.addStep(ArgumentationViewsRepository.Claim.Properties.annotation);
		propertiesStep.addStep(ArgumentationViewsRepository.Claim.Properties.id);
		propertiesStep.addStep(ArgumentationViewsRepository.Claim.Properties.description);
		propertiesStep.addStep(ArgumentationViewsRepository.Claim.Properties.content);
		propertiesStep.addStep(ArgumentationViewsRepository.Claim.Properties.assumed);
		propertiesStep.addStep(ArgumentationViewsRepository.Claim.Properties.toBeSupported);
		
		
		composer = new PartComposer(claimStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ArgumentationViewsRepository.Claim.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.Claim.Properties.taggedValue) {
					return createTaggedValueTableComposition(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.Claim.Properties.annotation) {
					return createAnnotationTableComposition(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.Claim.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.Claim.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.Claim.Properties.content) {
					return createContentText(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.Claim.Properties.assumed) {
					return createAssumedCheckbox(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.Claim.Properties.toBeSupported) {
					return createToBeSupportedCheckbox(widgetFactory, parent);
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
		propertiesSection.setText(ArgumentationMessages.ClaimPropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * @param container
	 * 
	 */
	protected Composite createTaggedValueTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.taggedValue = new ReferencesTable(getDescription(ArgumentationViewsRepository.Claim.Properties.taggedValue, ArgumentationMessages.ClaimPropertiesEditionPart_TaggedValueLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, ArgumentationViewsRepository.Claim.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				taggedValue.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, ArgumentationViewsRepository.Claim.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				taggedValue.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, ArgumentationViewsRepository.Claim.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				taggedValue.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, ArgumentationViewsRepository.Claim.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				taggedValue.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.taggedValueFilters) {
			this.taggedValue.addFilter(filter);
		}
		this.taggedValue.setHelpText(propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.Claim.Properties.taggedValue, ArgumentationViewsRepository.FORM_KIND));
		this.taggedValue.createControls(parent, widgetFactory);
		this.taggedValue.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, ArgumentationViewsRepository.Claim.Properties.taggedValue, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData taggedValueData = new GridData(GridData.FILL_HORIZONTAL);
		taggedValueData.horizontalSpan = 3;
		this.taggedValue.setLayoutData(taggedValueData);
		this.taggedValue.setLowerBound(0);
		this.taggedValue.setUpperBound(-1);
		taggedValue.setID(ArgumentationViewsRepository.Claim.Properties.taggedValue);
		taggedValue.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createTaggedValueTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAnnotationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.annotation = new ReferencesTable(getDescription(ArgumentationViewsRepository.Claim.Properties.annotation, ArgumentationMessages.ClaimPropertiesEditionPart_AnnotationLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, ArgumentationViewsRepository.Claim.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				annotation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, ArgumentationViewsRepository.Claim.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				annotation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, ArgumentationViewsRepository.Claim.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				annotation.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, ArgumentationViewsRepository.Claim.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				annotation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.annotationFilters) {
			this.annotation.addFilter(filter);
		}
		this.annotation.setHelpText(propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.Claim.Properties.annotation, ArgumentationViewsRepository.FORM_KIND));
		this.annotation.createControls(parent, widgetFactory);
		this.annotation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, ArgumentationViewsRepository.Claim.Properties.annotation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData annotationData = new GridData(GridData.FILL_HORIZONTAL);
		annotationData.horizontalSpan = 3;
		this.annotation.setLayoutData(annotationData);
		this.annotation.setLowerBound(0);
		this.annotation.setUpperBound(-1);
		annotation.setID(ArgumentationViewsRepository.Claim.Properties.annotation);
		annotation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAnnotationTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createIdText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArgumentationViewsRepository.Claim.Properties.id, ArgumentationMessages.ClaimPropertiesEditionPart_IdLabel);
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
							ClaimPropertiesEditionPartForm.this,
							ArgumentationViewsRepository.Claim.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ClaimPropertiesEditionPartForm.this,
									ArgumentationViewsRepository.Claim.Properties.id,
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
									ClaimPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, ArgumentationViewsRepository.Claim.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, ArgumentationViewsRepository.Claim.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.Claim.Properties.id, ArgumentationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArgumentationViewsRepository.Claim.Properties.description, ArgumentationMessages.ClaimPropertiesEditionPart_DescriptionLabel);
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
							ClaimPropertiesEditionPartForm.this,
							ArgumentationViewsRepository.Claim.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ClaimPropertiesEditionPartForm.this,
									ArgumentationViewsRepository.Claim.Properties.description,
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
									ClaimPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, ArgumentationViewsRepository.Claim.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, ArgumentationViewsRepository.Claim.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.Claim.Properties.description, ArgumentationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createContentText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArgumentationViewsRepository.Claim.Properties.content, ArgumentationMessages.ClaimPropertiesEditionPart_ContentLabel);
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
							ClaimPropertiesEditionPartForm.this,
							ArgumentationViewsRepository.Claim.Properties.content,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ClaimPropertiesEditionPartForm.this,
									ArgumentationViewsRepository.Claim.Properties.content,
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
									ClaimPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, ArgumentationViewsRepository.Claim.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}
		});
		EditingUtils.setID(content, ArgumentationViewsRepository.Claim.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.Claim.Properties.content, ArgumentationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createContentText

		// End of user code
		return parent;
	}

	
	protected Composite createAssumedCheckbox(FormToolkit widgetFactory, Composite parent) {
		assumed = widgetFactory.createButton(parent, getDescription(ArgumentationViewsRepository.Claim.Properties.assumed, ArgumentationMessages.ClaimPropertiesEditionPart_AssumedLabel), SWT.CHECK);
		assumed.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, ArgumentationViewsRepository.Claim.Properties.assumed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(assumed.getSelection())));
			}

		});
		GridData assumedData = new GridData(GridData.FILL_HORIZONTAL);
		assumedData.horizontalSpan = 2;
		assumed.setLayoutData(assumedData);
		EditingUtils.setID(assumed, ArgumentationViewsRepository.Claim.Properties.assumed);
		EditingUtils.setEEFtype(assumed, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.Claim.Properties.assumed, ArgumentationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createAssumedCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createToBeSupportedCheckbox(FormToolkit widgetFactory, Composite parent) {
		toBeSupported = widgetFactory.createButton(parent, getDescription(ArgumentationViewsRepository.Claim.Properties.toBeSupported, ArgumentationMessages.ClaimPropertiesEditionPart_ToBeSupportedLabel), SWT.CHECK);
		toBeSupported.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ClaimPropertiesEditionPartForm.this, ArgumentationViewsRepository.Claim.Properties.toBeSupported, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(toBeSupported.getSelection())));
			}

		});
		GridData toBeSupportedData = new GridData(GridData.FILL_HORIZONTAL);
		toBeSupportedData.horizontalSpan = 2;
		toBeSupported.setLayoutData(toBeSupportedData);
		EditingUtils.setID(toBeSupported, ArgumentationViewsRepository.Claim.Properties.toBeSupported);
		EditingUtils.setEEFtype(toBeSupported, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.Claim.Properties.toBeSupported, ArgumentationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createToBeSupportedCheckbox

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
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#initTaggedValue(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTaggedValue(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		taggedValue.setContentProvider(contentProvider);
		taggedValue.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.Claim.Properties.taggedValue);
		if (eefElementEditorReadOnlyState && taggedValue.isEnabled()) {
			taggedValue.setEnabled(false);
			taggedValue.setToolTipText(ArgumentationMessages.Claim_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !taggedValue.isEnabled()) {
			taggedValue.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#updateTaggedValue()
	 * 
	 */
	public void updateTaggedValue() {
	taggedValue.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#addFilterTaggedValue(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTaggedValue(ViewerFilter filter) {
		taggedValueFilters.add(filter);
		if (this.taggedValue != null) {
			this.taggedValue.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#addBusinessFilterTaggedValue(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTaggedValue(ViewerFilter filter) {
		taggedValueBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#isContainedInTaggedValueTable(EObject element)
	 * 
	 */
	public boolean isContainedInTaggedValueTable(EObject element) {
		return ((ReferencesTableSettings)taggedValue.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#initAnnotation(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnnotation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		annotation.setContentProvider(contentProvider);
		annotation.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.Claim.Properties.annotation);
		if (eefElementEditorReadOnlyState && annotation.isEnabled()) {
			annotation.setEnabled(false);
			annotation.setToolTipText(ArgumentationMessages.Claim_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !annotation.isEnabled()) {
			annotation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#updateAnnotation()
	 * 
	 */
	public void updateAnnotation() {
	annotation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#addFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAnnotation(ViewerFilter filter) {
		annotationFilters.add(filter);
		if (this.annotation != null) {
			this.annotation.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#addBusinessFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnnotation(ViewerFilter filter) {
		annotationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#isContainedInAnnotationTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnnotationTable(EObject element) {
		return ((ReferencesTableSettings)annotation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.Claim.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(ArgumentationMessages.Claim_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.Claim.Properties.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(ArgumentationMessages.Claim_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.Claim.Properties.content);
		if (eefElementEditorReadOnlyState && content.isEnabled()) {
			content.setEnabled(false);
			content.setToolTipText(ArgumentationMessages.Claim_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !content.isEnabled()) {
			content.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#getAssumed()
	 * 
	 */
	public Boolean getAssumed() {
		return Boolean.valueOf(assumed.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#setAssumed(Boolean newValue)
	 * 
	 */
	public void setAssumed(Boolean newValue) {
		if (newValue != null) {
			assumed.setSelection(newValue.booleanValue());
		} else {
			assumed.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.Claim.Properties.assumed);
		if (eefElementEditorReadOnlyState && assumed.isEnabled()) {
			assumed.setEnabled(false);
			assumed.setToolTipText(ArgumentationMessages.Claim_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !assumed.isEnabled()) {
			assumed.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#getToBeSupported()
	 * 
	 */
	public Boolean getToBeSupported() {
		return Boolean.valueOf(toBeSupported.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ClaimPropertiesEditionPart#setToBeSupported(Boolean newValue)
	 * 
	 */
	public void setToBeSupported(Boolean newValue) {
		if (newValue != null) {
			toBeSupported.setSelection(newValue.booleanValue());
		} else {
			toBeSupported.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.Claim.Properties.toBeSupported);
		if (eefElementEditorReadOnlyState && toBeSupported.isEnabled()) {
			toBeSupported.setEnabled(false);
			toBeSupported.setToolTipText(ArgumentationMessages.Claim_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !toBeSupported.isEnabled()) {
			toBeSupported.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ArgumentationMessages.Claim_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
