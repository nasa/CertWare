/**
 * Generated with Acceleo
 */
package net.certware.verification.checklist.parts.impl;

// Start of user code for imports
import net.certware.verification.checklist.parts.ChecklistViewsRepository;
import net.certware.verification.checklist.parts.ItemPropertiesEditionPart;
import net.certware.verification.checklist.providers.ChecklistMessages;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;



// End of user code

/**
 * 
 * 
 */
public class ItemPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ItemPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text reference;
	protected EMFComboViewer result;
	protected Text comment;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ItemPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(parent);
				}
				if (key == ChecklistViewsRepository.Item.Properties.identifier) {
					return createIdentifierText(parent);
				}
				if (key == ChecklistViewsRepository.Item.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == ChecklistViewsRepository.Item.Properties.reference) {
					return createReferenceText(parent);
				}
				if (key == ChecklistViewsRepository.Item.Properties.result) {
					return createResultEMFComboViewer(parent);
				}
				if (key == ChecklistViewsRepository.Item.Properties.comment) {
					return createCommentText(parent);
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
		propertiesGroup.setText(ChecklistMessages.ItemPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdentifierText(Composite parent) {
		createDescription(parent, ChecklistViewsRepository.Item.Properties.identifier, ChecklistMessages.ItemPropertiesEditionPart_IdentifierLabel);
		identifier = SWTUtils.createScrollableText(parent, SWT.BORDER);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ItemPropertiesEditionPartImpl.this, ChecklistViewsRepository.Item.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ItemPropertiesEditionPartImpl.this, ChecklistViewsRepository.Item.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, ChecklistViewsRepository.Item.Properties.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Item.Properties.identifier, ChecklistViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdentifierText

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, ChecklistViewsRepository.Item.Properties.description, ChecklistMessages.ItemPropertiesEditionPart_DescriptionLabel);
		description = SWTUtils.createScrollableText(parent, SWT.BORDER);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ItemPropertiesEditionPartImpl.this, ChecklistViewsRepository.Item.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ItemPropertiesEditionPartImpl.this, ChecklistViewsRepository.Item.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, ChecklistViewsRepository.Item.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Item.Properties.description, ChecklistViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createReferenceText(Composite parent) {
		createDescription(parent, ChecklistViewsRepository.Item.Properties.reference, ChecklistMessages.ItemPropertiesEditionPart_ReferenceLabel);
		reference = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData referenceData = new GridData(GridData.FILL_HORIZONTAL);
		reference.setLayoutData(referenceData);
		reference.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ItemPropertiesEditionPartImpl.this, ChecklistViewsRepository.Item.Properties.reference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, reference.getText()));
			}

		});
		reference.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ItemPropertiesEditionPartImpl.this, ChecklistViewsRepository.Item.Properties.reference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, reference.getText()));
				}
			}

		});
		EditingUtils.setID(reference, ChecklistViewsRepository.Item.Properties.reference);
		EditingUtils.setEEFtype(reference, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Item.Properties.reference, ChecklistViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createReferenceText

		// End of user code
		return parent;
	}

	
	protected Composite createResultEMFComboViewer(Composite parent) {
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ItemPropertiesEditionPartImpl.this, ChecklistViewsRepository.Item.Properties.result, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getResult()));
			}

		});
		result.setID(ChecklistViewsRepository.Item.Properties.result);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Item.Properties.result, ChecklistViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createResultEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createCommentText(Composite parent) {
		createDescription(parent, ChecklistViewsRepository.Item.Properties.comment, ChecklistMessages.ItemPropertiesEditionPart_CommentLabel);
		comment = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ItemPropertiesEditionPartImpl.this, ChecklistViewsRepository.Item.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
			}

		});
		comment.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ItemPropertiesEditionPartImpl.this, ChecklistViewsRepository.Item.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}

		});
		EditingUtils.setID(comment, ChecklistViewsRepository.Item.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Item.Properties.comment, ChecklistViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
