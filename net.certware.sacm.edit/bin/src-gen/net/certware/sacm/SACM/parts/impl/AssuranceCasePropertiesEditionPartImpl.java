// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart;
import net.certware.sacm.SACM.parts.SACMViewsRepository;

import net.certware.sacm.SACM.providers.SACMMessages;

import org.eclipse.emf.ecore.EObject;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * @author Kestrel Technology LLC
 * 
 */
public class AssuranceCasePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AssuranceCasePropertiesEditionPart {

	protected Text id;
	protected Text name;
	protected Text gid;
	protected ReferencesTable argument;
	protected List<ViewerFilter> argumentBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> argumentFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable evidence;
	protected List<ViewerFilter> evidenceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> evidenceFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AssuranceCasePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence assuranceCaseStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = assuranceCaseStep.addStep(SACMViewsRepository.AssuranceCase.Properties.class);
		propertiesStep.addStep(SACMViewsRepository.AssuranceCase.Properties.id);
		propertiesStep.addStep(SACMViewsRepository.AssuranceCase.Properties.name);
		propertiesStep.addStep(SACMViewsRepository.AssuranceCase.Properties.gid);
		propertiesStep.addStep(SACMViewsRepository.AssuranceCase.Properties.argument);
		propertiesStep.addStep(SACMViewsRepository.AssuranceCase.Properties.evidence);
		
		
		composer = new PartComposer(assuranceCaseStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SACMViewsRepository.AssuranceCase.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SACMViewsRepository.AssuranceCase.Properties.id) {
					return createIdText(parent);
				}
				if (key == SACMViewsRepository.AssuranceCase.Properties.name) {
					return createNameText(parent);
				}
				if (key == SACMViewsRepository.AssuranceCase.Properties.gid) {
					return createGidText(parent);
				}
				if (key == SACMViewsRepository.AssuranceCase.Properties.argument) {
					return createArgumentAdvancedTableComposition(parent);
				}
				if (key == SACMViewsRepository.AssuranceCase.Properties.evidence) {
					return createEvidenceAdvancedTableComposition(parent);
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
		propertiesGroup.setText(SACMMessages.AssuranceCasePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdText(Composite parent) {
		createDescription(parent, SACMViewsRepository.AssuranceCase.Properties.id, SACMMessages.AssuranceCasePropertiesEditionPart_IdLabel);
		id = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssuranceCasePropertiesEditionPartImpl.this, SACMViewsRepository.AssuranceCase.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
			}

		});
		id.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssuranceCasePropertiesEditionPartImpl.this, SACMViewsRepository.AssuranceCase.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, SACMViewsRepository.AssuranceCase.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SACMViewsRepository.AssuranceCase.Properties.id, SACMViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, SACMViewsRepository.AssuranceCase.Properties.name, SACMMessages.AssuranceCasePropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssuranceCasePropertiesEditionPartImpl.this, SACMViewsRepository.AssuranceCase.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssuranceCasePropertiesEditionPartImpl.this, SACMViewsRepository.AssuranceCase.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SACMViewsRepository.AssuranceCase.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SACMViewsRepository.AssuranceCase.Properties.name, SACMViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createGidText(Composite parent) {
		createDescription(parent, SACMViewsRepository.AssuranceCase.Properties.gid, SACMMessages.AssuranceCasePropertiesEditionPart_GidLabel);
		gid = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData gidData = new GridData(GridData.FILL_HORIZONTAL);
		gid.setLayoutData(gidData);
		gid.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssuranceCasePropertiesEditionPartImpl.this, SACMViewsRepository.AssuranceCase.Properties.gid, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, gid.getText()));
			}

		});
		gid.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssuranceCasePropertiesEditionPartImpl.this, SACMViewsRepository.AssuranceCase.Properties.gid, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, gid.getText()));
				}
			}

		});
		EditingUtils.setID(gid, SACMViewsRepository.AssuranceCase.Properties.gid);
		EditingUtils.setEEFtype(gid, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SACMViewsRepository.AssuranceCase.Properties.gid, SACMViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createGidText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createArgumentAdvancedTableComposition(Composite parent) {
		this.argument = new ReferencesTable(getDescription(SACMViewsRepository.AssuranceCase.Properties.argument, SACMMessages.AssuranceCasePropertiesEditionPart_ArgumentLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssuranceCasePropertiesEditionPartImpl.this, SACMViewsRepository.AssuranceCase.Properties.argument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				argument.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssuranceCasePropertiesEditionPartImpl.this, SACMViewsRepository.AssuranceCase.Properties.argument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				argument.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssuranceCasePropertiesEditionPartImpl.this, SACMViewsRepository.AssuranceCase.Properties.argument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				argument.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssuranceCasePropertiesEditionPartImpl.this, SACMViewsRepository.AssuranceCase.Properties.argument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				argument.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.argumentFilters) {
			this.argument.addFilter(filter);
		}
		this.argument.setHelpText(propertiesEditionComponent.getHelpContent(SACMViewsRepository.AssuranceCase.Properties.argument, SACMViewsRepository.SWT_KIND));
		this.argument.createControls(parent);
		this.argument.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssuranceCasePropertiesEditionPartImpl.this, SACMViewsRepository.AssuranceCase.Properties.argument, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData argumentData = new GridData(GridData.FILL_HORIZONTAL);
		argumentData.horizontalSpan = 3;
		this.argument.setLayoutData(argumentData);
		this.argument.setLowerBound(0);
		this.argument.setUpperBound(-1);
		argument.setID(SACMViewsRepository.AssuranceCase.Properties.argument);
		argument.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createArgumentAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createEvidenceAdvancedTableComposition(Composite parent) {
		this.evidence = new ReferencesTable(getDescription(SACMViewsRepository.AssuranceCase.Properties.evidence, SACMMessages.AssuranceCasePropertiesEditionPart_EvidenceLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssuranceCasePropertiesEditionPartImpl.this, SACMViewsRepository.AssuranceCase.Properties.evidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				evidence.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssuranceCasePropertiesEditionPartImpl.this, SACMViewsRepository.AssuranceCase.Properties.evidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				evidence.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssuranceCasePropertiesEditionPartImpl.this, SACMViewsRepository.AssuranceCase.Properties.evidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				evidence.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssuranceCasePropertiesEditionPartImpl.this, SACMViewsRepository.AssuranceCase.Properties.evidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				evidence.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.evidenceFilters) {
			this.evidence.addFilter(filter);
		}
		this.evidence.setHelpText(propertiesEditionComponent.getHelpContent(SACMViewsRepository.AssuranceCase.Properties.evidence, SACMViewsRepository.SWT_KIND));
		this.evidence.createControls(parent);
		this.evidence.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AssuranceCasePropertiesEditionPartImpl.this, SACMViewsRepository.AssuranceCase.Properties.evidence, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData evidenceData = new GridData(GridData.FILL_HORIZONTAL);
		evidenceData.horizontalSpan = 3;
		this.evidence.setLayoutData(evidenceData);
		this.evidence.setLowerBound(0);
		this.evidence.setUpperBound(-1);
		evidence.setID(SACMViewsRepository.AssuranceCase.Properties.evidence);
		evidence.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createEvidenceAdvancedTableComposition

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
	 * @see net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SACMViewsRepository.AssuranceCase.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(SACMMessages.AssuranceCase_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SACMViewsRepository.AssuranceCase.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SACMMessages.AssuranceCase_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart#getGid()
	 * 
	 */
	public String getGid() {
		return gid.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart#setGid(String newValue)
	 * 
	 */
	public void setGid(String newValue) {
		if (newValue != null) {
			gid.setText(newValue);
		} else {
			gid.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SACMViewsRepository.AssuranceCase.Properties.gid);
		if (eefElementEditorReadOnlyState && gid.isEnabled()) {
			gid.setEnabled(false);
			gid.setToolTipText(SACMMessages.AssuranceCase_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !gid.isEnabled()) {
			gid.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart#initArgument(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initArgument(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		argument.setContentProvider(contentProvider);
		argument.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SACMViewsRepository.AssuranceCase.Properties.argument);
		if (eefElementEditorReadOnlyState && argument.isEnabled()) {
			argument.setEnabled(false);
			argument.setToolTipText(SACMMessages.AssuranceCase_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !argument.isEnabled()) {
			argument.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart#updateArgument()
	 * 
	 */
	public void updateArgument() {
	argument.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart#addFilterArgument(ViewerFilter filter)
	 * 
	 */
	public void addFilterToArgument(ViewerFilter filter) {
		argumentFilters.add(filter);
		if (this.argument != null) {
			this.argument.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart#addBusinessFilterArgument(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToArgument(ViewerFilter filter) {
		argumentBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart#isContainedInArgumentTable(EObject element)
	 * 
	 */
	public boolean isContainedInArgumentTable(EObject element) {
		return ((ReferencesTableSettings)argument.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart#initEvidence(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initEvidence(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		evidence.setContentProvider(contentProvider);
		evidence.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SACMViewsRepository.AssuranceCase.Properties.evidence);
		if (eefElementEditorReadOnlyState && evidence.isEnabled()) {
			evidence.setEnabled(false);
			evidence.setToolTipText(SACMMessages.AssuranceCase_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !evidence.isEnabled()) {
			evidence.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart#updateEvidence()
	 * 
	 */
	public void updateEvidence() {
	evidence.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart#addFilterEvidence(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEvidence(ViewerFilter filter) {
		evidenceFilters.add(filter);
		if (this.evidence != null) {
			this.evidence.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart#addBusinessFilterEvidence(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEvidence(ViewerFilter filter) {
		evidenceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart#isContainedInEvidenceTable(EObject element)
	 * 
	 */
	public boolean isContainedInEvidenceTable(EObject element) {
		return ((ReferencesTableSettings)evidence.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SACMMessages.AssuranceCase_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
