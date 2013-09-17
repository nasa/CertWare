/**
 * Generated with Acceleo
 */
package net.certware.verification.checklist.parts.forms;

// Start of user code for imports
import net.certware.verification.checklist.parts.ChecklistViewsRepository;
import net.certware.verification.checklist.parts.ItemPropertiesEditionPart;
import net.certware.verification.checklist.providers.ChecklistMessages;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
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
 * 
 * 
 */
public class ItemPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ItemPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text reference;
	protected EMFComboViewer result;
	protected Text comment;



	/**
	 * For {@link ISection} use only.
	 */
	public ItemPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ItemPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence itemStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = itemStep.addStep(ChecklistViewsRepository.Item.Properties.class);
		propertiesStep.addStep(ChecklistViewsRepository.Item.Properties.identifier);
		propertiesStep.addStep(ChecklistViewsRepository.Item.Properties.description);
		propertiesStep.addStep(ChecklistViewsRepository.Item.Properties.reference);
		propertiesStep.addStep(ChecklistViewsRepository.Item.Properties.result);
		propertiesStep.addStep(ChecklistViewsRepository.Item.Properties.comment);
		
		
		composer = new PartComposer(itemStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ChecklistViewsRepository.Item.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ChecklistViewsRepository.Item.Properties.identifier) {
					return createIdentifierText(widgetFactory, parent);
				}
				if (key == ChecklistViewsRepository.Item.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == ChecklistViewsRepository.Item.Properties.reference) {
					return createReferenceText(widgetFactory, parent);
				}
				if (key == ChecklistViewsRepository.Item.Properties.result) {
					return createResultEMFComboViewer(widgetFactory, parent);
				}
				if (key == ChecklistViewsRepository.Item.Properties.comment) {
					return createCommentText(widgetFactory, parent);
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
		propertiesSection.setText(ChecklistMessages.ItemPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, ChecklistViewsRepository.Item.Properties.identifier, ChecklistMessages.ItemPropertiesEditionPart_IdentifierLabel);
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
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ItemPropertiesEditionPartForm.this,
							ChecklistViewsRepository.Item.Properties.identifier,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ItemPropertiesEditionPartForm.this,
									ChecklistViewsRepository.Item.Properties.identifier,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, identifier.getText()));
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
									ItemPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ItemPropertiesEditionPartForm.this, ChecklistViewsRepository.Item.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}
		});
		EditingUtils.setID(identifier, ChecklistViewsRepository.Item.Properties.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Item.Properties.identifier, ChecklistViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdentifierText

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ChecklistViewsRepository.Item.Properties.description, ChecklistMessages.ItemPropertiesEditionPart_DescriptionLabel);
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
							ItemPropertiesEditionPartForm.this,
							ChecklistViewsRepository.Item.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ItemPropertiesEditionPartForm.this,
									ChecklistViewsRepository.Item.Properties.description,
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
									ItemPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ItemPropertiesEditionPartForm.this, ChecklistViewsRepository.Item.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, ChecklistViewsRepository.Item.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Item.Properties.description, ChecklistViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createReferenceText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ChecklistViewsRepository.Item.Properties.reference, ChecklistMessages.ItemPropertiesEditionPart_ReferenceLabel);
		reference = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		reference.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData referenceData = new GridData(GridData.FILL_HORIZONTAL);
		reference.setLayoutData(referenceData);
		reference.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ItemPropertiesEditionPartForm.this,
							ChecklistViewsRepository.Item.Properties.reference,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, reference.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ItemPropertiesEditionPartForm.this,
									ChecklistViewsRepository.Item.Properties.reference,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, reference.getText()));
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
									ItemPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		reference.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ItemPropertiesEditionPartForm.this, ChecklistViewsRepository.Item.Properties.reference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, reference.getText()));
				}
			}
		});
		EditingUtils.setID(reference, ChecklistViewsRepository.Item.Properties.reference);
		EditingUtils.setEEFtype(reference, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Item.Properties.reference, ChecklistViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createReferenceText

		// End of user code
		return parent;
	}

	
	protected Composite createResultEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ChecklistViewsRepository.Item.Properties.result, ChecklistMessages.ItemPropertiesEditionPart_ResultLabel);
		result = new EMFComboViewer(parent);
		result.setContentProvider(new ArrayContentProvider());
		result.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData resultData = new GridData(GridData.FILL_HORIZONTAL);
		result.getCombo().setLayoutData(resultData);
		result.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ItemPropertiesEditionPartForm.this, ChecklistViewsRepository.Item.Properties.result, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getResult()));
			}

		});
		result.setID(ChecklistViewsRepository.Item.Properties.result);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Item.Properties.result, ChecklistViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createResultEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createCommentText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ChecklistViewsRepository.Item.Properties.comment, ChecklistMessages.ItemPropertiesEditionPart_CommentLabel);
		comment = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		comment.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ItemPropertiesEditionPartForm.this,
							ChecklistViewsRepository.Item.Properties.comment,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ItemPropertiesEditionPartForm.this,
									ChecklistViewsRepository.Item.Properties.comment,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, comment.getText()));
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
									ItemPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		comment.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ItemPropertiesEditionPartForm.this, ChecklistViewsRepository.Item.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}
		});
		EditingUtils.setID(comment, ChecklistViewsRepository.Item.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Item.Properties.comment, ChecklistViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createCommentText

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
	 * @see net.certware.verification.checklist.parts.ItemPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ItemPropertiesEditionPart#setIdentifier(String newValue)
	 * 
	 */
	public void setIdentifier(String newValue) {
		if (newValue != null) {
			identifier.setText(newValue);
		} else {
			identifier.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ChecklistViewsRepository.Item.Properties.identifier);
		if (eefElementEditorReadOnlyState && identifier.isEnabled()) {
			identifier.setEnabled(false);
			identifier.setToolTipText(ChecklistMessages.Item_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !identifier.isEnabled()) {
			identifier.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ItemPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ItemPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ChecklistViewsRepository.Item.Properties.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(ChecklistMessages.Item_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ItemPropertiesEditionPart#getReference()
	 * 
	 */
	public String getReference() {
		return reference.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ItemPropertiesEditionPart#setReference(String newValue)
	 * 
	 */
	public void setReference(String newValue) {
		if (newValue != null) {
			reference.setText(newValue);
		} else {
			reference.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ChecklistViewsRepository.Item.Properties.reference);
		if (eefElementEditorReadOnlyState && reference.isEnabled()) {
			reference.setEnabled(false);
			reference.setToolTipText(ChecklistMessages.Item_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !reference.isEnabled()) {
			reference.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ItemPropertiesEditionPart#getResult()
	 * 
	 */
	public Enumerator getResult() {
		Enumerator selection = (Enumerator) ((StructuredSelection) result.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ItemPropertiesEditionPart#initResult(Object input, Enumerator current)
	 */
	public void initResult(Object input, Enumerator current) {
		result.setInput(input);
		result.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(ChecklistViewsRepository.Item.Properties.result);
		if (eefElementEditorReadOnlyState && result.isEnabled()) {
			result.setEnabled(false);
			result.setToolTipText(ChecklistMessages.Item_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !result.isEnabled()) {
			result.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ItemPropertiesEditionPart#setResult(Enumerator newValue)
	 * 
	 */
	public void setResult(Enumerator newValue) {
		result.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(ChecklistViewsRepository.Item.Properties.result);
		if (eefElementEditorReadOnlyState && result.isEnabled()) {
			result.setEnabled(false);
			result.setToolTipText(ChecklistMessages.Item_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !result.isEnabled()) {
			result.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ItemPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ItemPropertiesEditionPart#setComment(String newValue)
	 * 
	 */
	public void setComment(String newValue) {
		if (newValue != null) {
			comment.setText(newValue);
		} else {
			comment.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ChecklistViewsRepository.Item.Properties.comment);
		if (eefElementEditorReadOnlyState && comment.isEnabled()) {
			comment.setEnabled(false);
			comment.setToolTipText(ChecklistMessages.Item_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !comment.isEnabled()) {
			comment.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ChecklistMessages.Item_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
