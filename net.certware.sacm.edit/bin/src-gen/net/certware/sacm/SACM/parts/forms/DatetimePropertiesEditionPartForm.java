// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.parts.forms;

// Start of user code for imports
import net.certware.sacm.SACM.parts.DatetimePropertiesEditionPart;
import net.certware.sacm.SACM.parts.SACMViewsRepository;

import net.certware.sacm.SACM.providers.SACMMessages;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

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

// End of user code

/**
 * @author Kestrel Technology LLC
 * 
 */
public class DatetimePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, DatetimePropertiesEditionPart {

	protected Text datetime;



	/**
	 * For {@link ISection} use only.
	 */
	public DatetimePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DatetimePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence datetimeStep = new BindingCompositionSequence(propertiesEditionComponent);
		datetimeStep
			.addStep(SACMViewsRepository.Datetime.Properties.class)
			.addStep(SACMViewsRepository.Datetime.Properties.datetime_);
		
		
		composer = new PartComposer(datetimeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SACMViewsRepository.Datetime.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SACMViewsRepository.Datetime.Properties.datetime_) {
					return createDatetimeText(widgetFactory, parent);
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
		propertiesSection.setText(SACMMessages.DatetimePropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createDatetimeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SACMViewsRepository.Datetime.Properties.datetime_, SACMMessages.DatetimePropertiesEditionPart_DatetimeLabel);
		datetime = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		datetime.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData datetimeData = new GridData(GridData.FILL_HORIZONTAL);
		datetime.setLayoutData(datetimeData);
		datetime.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DatetimePropertiesEditionPartForm.this,
							SACMViewsRepository.Datetime.Properties.datetime_,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, datetime.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DatetimePropertiesEditionPartForm.this,
									SACMViewsRepository.Datetime.Properties.datetime_,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, datetime.getText()));
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
									DatetimePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		datetime.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DatetimePropertiesEditionPartForm.this, SACMViewsRepository.Datetime.Properties.datetime_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, datetime.getText()));
				}
			}
		});
		EditingUtils.setID(datetime, SACMViewsRepository.Datetime.Properties.datetime_);
		EditingUtils.setEEFtype(datetime, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SACMViewsRepository.Datetime.Properties.datetime_, SACMViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDatetimeText

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
	 * @see net.certware.sacm.SACM.parts.DatetimePropertiesEditionPart#getDatetime()
	 * 
	 */
	public String getDatetime() {
		return datetime.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.DatetimePropertiesEditionPart#setDatetime(String newValue)
	 * 
	 */
	public void setDatetime(String newValue) {
		if (newValue != null) {
			datetime.setText(newValue);
		} else {
			datetime.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SACMViewsRepository.Datetime.Properties.datetime_);
		if (eefElementEditorReadOnlyState && datetime.isEnabled()) {
			datetime.setEnabled(false);
			datetime.setToolTipText(SACMMessages.Datetime_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !datetime.isEnabled()) {
			datetime.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SACMMessages.Datetime_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
