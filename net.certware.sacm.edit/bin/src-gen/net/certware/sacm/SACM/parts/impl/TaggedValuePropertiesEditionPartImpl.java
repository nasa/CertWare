// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.parts.impl;

// Start of user code for imports
import net.certware.sacm.SACM.parts.SACMViewsRepository;
import net.certware.sacm.SACM.parts.TaggedValuePropertiesEditionPart;

import net.certware.sacm.SACM.providers.SACMMessages;

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

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

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
 * @author Kestrel Technology LLC
 * 
 */
public class TaggedValuePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TaggedValuePropertiesEditionPart {

	protected Text key;
	protected Text value;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TaggedValuePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence taggedValueStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = taggedValueStep.addStep(SACMViewsRepository.TaggedValue.Properties.class);
		propertiesStep.addStep(SACMViewsRepository.TaggedValue.Properties.key);
		propertiesStep.addStep(SACMViewsRepository.TaggedValue.Properties.value);
		
		
		composer = new PartComposer(taggedValueStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SACMViewsRepository.TaggedValue.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SACMViewsRepository.TaggedValue.Properties.key) {
					return createKeyText(parent);
				}
				if (key == SACMViewsRepository.TaggedValue.Properties.value) {
					return createValueText(parent);
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
		propertiesGroup.setText(SACMMessages.TaggedValuePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createKeyText(Composite parent) {
		createDescription(parent, SACMViewsRepository.TaggedValue.Properties.key, SACMMessages.TaggedValuePropertiesEditionPart_KeyLabel);
		key = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData keyData = new GridData(GridData.FILL_HORIZONTAL);
		key.setLayoutData(keyData);
		key.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaggedValuePropertiesEditionPartImpl.this, SACMViewsRepository.TaggedValue.Properties.key, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, key.getText()));
			}

		});
		key.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaggedValuePropertiesEditionPartImpl.this, SACMViewsRepository.TaggedValue.Properties.key, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, key.getText()));
				}
			}

		});
		EditingUtils.setID(key, SACMViewsRepository.TaggedValue.Properties.key);
		EditingUtils.setEEFtype(key, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SACMViewsRepository.TaggedValue.Properties.key, SACMViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createKeyText

		// End of user code
		return parent;
	}

	
	protected Composite createValueText(Composite parent) {
		createDescription(parent, SACMViewsRepository.TaggedValue.Properties.value, SACMMessages.TaggedValuePropertiesEditionPart_ValueLabel);
		value = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaggedValuePropertiesEditionPartImpl.this, SACMViewsRepository.TaggedValue.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
			}

		});
		value.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaggedValuePropertiesEditionPartImpl.this, SACMViewsRepository.TaggedValue.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}

		});
		EditingUtils.setID(value, SACMViewsRepository.TaggedValue.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SACMViewsRepository.TaggedValue.Properties.value, SACMViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createValueText

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
	 * @see net.certware.sacm.SACM.parts.TaggedValuePropertiesEditionPart#getKey()
	 * 
	 */
	public String getKey() {
		return key.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.TaggedValuePropertiesEditionPart#setKey(String newValue)
	 * 
	 */
	public void setKey(String newValue) {
		if (newValue != null) {
			key.setText(newValue);
		} else {
			key.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SACMViewsRepository.TaggedValue.Properties.key);
		if (eefElementEditorReadOnlyState && key.isEnabled()) {
			key.setEnabled(false);
			key.setToolTipText(SACMMessages.TaggedValue_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !key.isEnabled()) {
			key.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.TaggedValuePropertiesEditionPart#getValue()
	 * 
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.TaggedValuePropertiesEditionPart#setValue(String newValue)
	 * 
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SACMViewsRepository.TaggedValue.Properties.value);
		if (eefElementEditorReadOnlyState && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(SACMMessages.TaggedValue_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SACMMessages.TaggedValue_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
