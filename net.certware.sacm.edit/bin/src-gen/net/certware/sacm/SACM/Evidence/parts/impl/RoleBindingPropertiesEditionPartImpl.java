// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.parts.impl;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.RoleBindingPropertiesEditionPart;

import net.certware.sacm.SACM.Evidence.providers.EvidenceMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

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
public class RoleBindingPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RoleBindingPropertiesEditionPart {

	protected Text role;
	protected EObjectFlatComboViewer subject;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RoleBindingPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence roleBindingStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = roleBindingStep.addStep(EvidenceViewsRepository.RoleBinding.Properties.class);
		propertiesStep.addStep(EvidenceViewsRepository.RoleBinding.Properties.role);
		propertiesStep.addStep(EvidenceViewsRepository.RoleBinding.Properties.subject);
		
		
		composer = new PartComposer(roleBindingStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EvidenceViewsRepository.RoleBinding.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EvidenceViewsRepository.RoleBinding.Properties.role) {
					return createRoleText(parent);
				}
				if (key == EvidenceViewsRepository.RoleBinding.Properties.subject) {
					return createSubjectFlatComboViewer(parent);
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
		propertiesGroup.setText(EvidenceMessages.RoleBindingPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createRoleText(Composite parent) {
		createDescription(parent, EvidenceViewsRepository.RoleBinding.Properties.role, EvidenceMessages.RoleBindingPropertiesEditionPart_RoleLabel);
		role = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData roleData = new GridData(GridData.FILL_HORIZONTAL);
		role.setLayoutData(roleData);
		role.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleBindingPropertiesEditionPartImpl.this, EvidenceViewsRepository.RoleBinding.Properties.role, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, role.getText()));
			}

		});
		role.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleBindingPropertiesEditionPartImpl.this, EvidenceViewsRepository.RoleBinding.Properties.role, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, role.getText()));
				}
			}

		});
		EditingUtils.setID(role, EvidenceViewsRepository.RoleBinding.Properties.role);
		EditingUtils.setEEFtype(role, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.RoleBinding.Properties.role, EvidenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createRoleText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSubjectFlatComboViewer(Composite parent) {
		createDescription(parent, EvidenceViewsRepository.RoleBinding.Properties.subject, EvidenceMessages.RoleBindingPropertiesEditionPart_SubjectLabel);
		subject = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EvidenceViewsRepository.RoleBinding.Properties.subject, EvidenceViewsRepository.SWT_KIND));
		subject.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		subject.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RoleBindingPropertiesEditionPartImpl.this, EvidenceViewsRepository.RoleBinding.Properties.subject, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSubject()));
			}

		});
		GridData subjectData = new GridData(GridData.FILL_HORIZONTAL);
		subject.setLayoutData(subjectData);
		subject.setID(EvidenceViewsRepository.RoleBinding.Properties.subject);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.RoleBinding.Properties.subject, EvidenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSubjectFlatComboViewer

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
	 * @see net.certware.sacm.SACM.Evidence.parts.RoleBindingPropertiesEditionPart#getRole()
	 * 
	 */
	public String getRole() {
		return role.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.RoleBindingPropertiesEditionPart#setRole(String newValue)
	 * 
	 */
	public void setRole(String newValue) {
		if (newValue != null) {
			role.setText(newValue);
		} else {
			role.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.RoleBinding.Properties.role);
		if (eefElementEditorReadOnlyState && role.isEnabled()) {
			role.setEnabled(false);
			role.setToolTipText(EvidenceMessages.RoleBinding_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !role.isEnabled()) {
			role.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.RoleBindingPropertiesEditionPart#getSubject()
	 * 
	 */
	public EObject getSubject() {
		if (subject.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) subject.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.RoleBindingPropertiesEditionPart#initSubject(EObjectFlatComboSettings)
	 */
	public void initSubject(EObjectFlatComboSettings settings) {
		subject.setInput(settings);
		if (current != null) {
			subject.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.RoleBinding.Properties.subject);
		if (eefElementEditorReadOnlyState && subject.isEnabled()) {
			subject.setEnabled(false);
			subject.setToolTipText(EvidenceMessages.RoleBinding_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !subject.isEnabled()) {
			subject.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.RoleBindingPropertiesEditionPart#setSubject(EObject newValue)
	 * 
	 */
	public void setSubject(EObject newValue) {
		if (newValue != null) {
			subject.setSelection(new StructuredSelection(newValue));
		} else {
			subject.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.RoleBinding.Properties.subject);
		if (eefElementEditorReadOnlyState && subject.isEnabled()) {
			subject.setEnabled(false);
			subject.setToolTipText(EvidenceMessages.RoleBinding_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !subject.isEnabled()) {
			subject.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.RoleBindingPropertiesEditionPart#setSubjectButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSubjectButtonMode(ButtonsModeEnum newValue) {
		subject.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.RoleBindingPropertiesEditionPart#addFilterSubject(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSubject(ViewerFilter filter) {
		subject.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.RoleBindingPropertiesEditionPart#addBusinessFilterSubject(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSubject(ViewerFilter filter) {
		subject.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EvidenceMessages.RoleBinding_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
