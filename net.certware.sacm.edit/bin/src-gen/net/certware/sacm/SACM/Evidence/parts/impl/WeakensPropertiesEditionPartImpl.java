// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart;

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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
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
public class WeakensPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, WeakensPropertiesEditionPart {

	protected ReferencesTable taggedValue;
	protected List<ViewerFilter> taggedValueBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> taggedValueFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable annotation;
	protected List<ViewerFilter> annotationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> annotationFilters = new ArrayList<ViewerFilter>();
	protected Text id;
	protected ReferencesTable timing;
	protected List<ViewerFilter> timingBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> timingFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable custody;
	protected List<ViewerFilter> custodyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> custodyFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable provenance;
	protected List<ViewerFilter> provenanceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> provenanceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable event;
	protected List<ViewerFilter> eventBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> eventFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable attribute;
	protected List<ViewerFilter> attributeBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> attributeFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer subject;
	protected EObjectFlatComboViewer relation;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public WeakensPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence weakensStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = weakensStep.addStep(EvidenceViewsRepository.Weakens.Properties.class);
		propertiesStep.addStep(EvidenceViewsRepository.Weakens.Properties.taggedValue);
		propertiesStep.addStep(EvidenceViewsRepository.Weakens.Properties.annotation);
		propertiesStep.addStep(EvidenceViewsRepository.Weakens.Properties.id);
		propertiesStep.addStep(EvidenceViewsRepository.Weakens.Properties.timing);
		propertiesStep.addStep(EvidenceViewsRepository.Weakens.Properties.custody);
		propertiesStep.addStep(EvidenceViewsRepository.Weakens.Properties.provenance);
		propertiesStep.addStep(EvidenceViewsRepository.Weakens.Properties.event);
		propertiesStep.addStep(EvidenceViewsRepository.Weakens.Properties.attribute);
		propertiesStep.addStep(EvidenceViewsRepository.Weakens.Properties.subject);
		propertiesStep.addStep(EvidenceViewsRepository.Weakens.Properties.relation);
		
		
		composer = new PartComposer(weakensStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EvidenceViewsRepository.Weakens.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EvidenceViewsRepository.Weakens.Properties.taggedValue) {
					return createTaggedValueAdvancedTableComposition(parent);
				}
				if (key == EvidenceViewsRepository.Weakens.Properties.annotation) {
					return createAnnotationAdvancedTableComposition(parent);
				}
				if (key == EvidenceViewsRepository.Weakens.Properties.id) {
					return createIdText(parent);
				}
				if (key == EvidenceViewsRepository.Weakens.Properties.timing) {
					return createTimingAdvancedTableComposition(parent);
				}
				if (key == EvidenceViewsRepository.Weakens.Properties.custody) {
					return createCustodyAdvancedTableComposition(parent);
				}
				if (key == EvidenceViewsRepository.Weakens.Properties.provenance) {
					return createProvenanceAdvancedTableComposition(parent);
				}
				if (key == EvidenceViewsRepository.Weakens.Properties.event) {
					return createEventAdvancedTableComposition(parent);
				}
				if (key == EvidenceViewsRepository.Weakens.Properties.attribute) {
					return createAttributeAdvancedTableComposition(parent);
				}
				if (key == EvidenceViewsRepository.Weakens.Properties.subject) {
					return createSubjectFlatComboViewer(parent);
				}
				if (key == EvidenceViewsRepository.Weakens.Properties.relation) {
					return createRelationFlatComboViewer(parent);
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
		propertiesGroup.setText(EvidenceMessages.WeakensPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTaggedValueAdvancedTableComposition(Composite parent) {
		this.taggedValue = new ReferencesTable(getDescription(EvidenceViewsRepository.Weakens.Properties.taggedValue, EvidenceMessages.WeakensPropertiesEditionPart_TaggedValueLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				taggedValue.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				taggedValue.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				taggedValue.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				taggedValue.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.taggedValueFilters) {
			this.taggedValue.addFilter(filter);
		}
		this.taggedValue.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Weakens.Properties.taggedValue, EvidenceViewsRepository.SWT_KIND));
		this.taggedValue.createControls(parent);
		this.taggedValue.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.taggedValue, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData taggedValueData = new GridData(GridData.FILL_HORIZONTAL);
		taggedValueData.horizontalSpan = 3;
		this.taggedValue.setLayoutData(taggedValueData);
		this.taggedValue.setLowerBound(0);
		this.taggedValue.setUpperBound(-1);
		taggedValue.setID(EvidenceViewsRepository.Weakens.Properties.taggedValue);
		taggedValue.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createTaggedValueAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAnnotationAdvancedTableComposition(Composite parent) {
		this.annotation = new ReferencesTable(getDescription(EvidenceViewsRepository.Weakens.Properties.annotation, EvidenceMessages.WeakensPropertiesEditionPart_AnnotationLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				annotation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				annotation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				annotation.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				annotation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.annotationFilters) {
			this.annotation.addFilter(filter);
		}
		this.annotation.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Weakens.Properties.annotation, EvidenceViewsRepository.SWT_KIND));
		this.annotation.createControls(parent);
		this.annotation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.annotation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData annotationData = new GridData(GridData.FILL_HORIZONTAL);
		annotationData.horizontalSpan = 3;
		this.annotation.setLayoutData(annotationData);
		this.annotation.setLowerBound(0);
		this.annotation.setUpperBound(-1);
		annotation.setID(EvidenceViewsRepository.Weakens.Properties.annotation);
		annotation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAnnotationAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createIdText(Composite parent) {
		createDescription(parent, EvidenceViewsRepository.Weakens.Properties.id, EvidenceMessages.WeakensPropertiesEditionPart_IdLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, EvidenceViewsRepository.Weakens.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Weakens.Properties.id, EvidenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTimingAdvancedTableComposition(Composite parent) {
		this.timing = new ReferencesTable(getDescription(EvidenceViewsRepository.Weakens.Properties.timing, EvidenceMessages.WeakensPropertiesEditionPart_TimingLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.timing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				timing.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.timing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				timing.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.timing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				timing.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.timing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				timing.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.timingFilters) {
			this.timing.addFilter(filter);
		}
		this.timing.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Weakens.Properties.timing, EvidenceViewsRepository.SWT_KIND));
		this.timing.createControls(parent);
		this.timing.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.timing, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData timingData = new GridData(GridData.FILL_HORIZONTAL);
		timingData.horizontalSpan = 3;
		this.timing.setLayoutData(timingData);
		this.timing.setLowerBound(0);
		this.timing.setUpperBound(-1);
		timing.setID(EvidenceViewsRepository.Weakens.Properties.timing);
		timing.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createTimingAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCustodyAdvancedTableComposition(Composite parent) {
		this.custody = new ReferencesTable(getDescription(EvidenceViewsRepository.Weakens.Properties.custody, EvidenceMessages.WeakensPropertiesEditionPart_CustodyLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.custody, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				custody.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.custody, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				custody.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.custody, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				custody.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.custody, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				custody.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.custodyFilters) {
			this.custody.addFilter(filter);
		}
		this.custody.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Weakens.Properties.custody, EvidenceViewsRepository.SWT_KIND));
		this.custody.createControls(parent);
		this.custody.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.custody, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData custodyData = new GridData(GridData.FILL_HORIZONTAL);
		custodyData.horizontalSpan = 3;
		this.custody.setLayoutData(custodyData);
		this.custody.setLowerBound(0);
		this.custody.setUpperBound(-1);
		custody.setID(EvidenceViewsRepository.Weakens.Properties.custody);
		custody.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createCustodyAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createProvenanceAdvancedTableComposition(Composite parent) {
		this.provenance = new ReferencesTable(getDescription(EvidenceViewsRepository.Weakens.Properties.provenance, EvidenceMessages.WeakensPropertiesEditionPart_ProvenanceLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.provenance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				provenance.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.provenance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				provenance.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.provenance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				provenance.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.provenance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				provenance.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.provenanceFilters) {
			this.provenance.addFilter(filter);
		}
		this.provenance.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Weakens.Properties.provenance, EvidenceViewsRepository.SWT_KIND));
		this.provenance.createControls(parent);
		this.provenance.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.provenance, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData provenanceData = new GridData(GridData.FILL_HORIZONTAL);
		provenanceData.horizontalSpan = 3;
		this.provenance.setLayoutData(provenanceData);
		this.provenance.setLowerBound(0);
		this.provenance.setUpperBound(-1);
		provenance.setID(EvidenceViewsRepository.Weakens.Properties.provenance);
		provenance.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createProvenanceAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createEventAdvancedTableComposition(Composite parent) {
		this.event = new ReferencesTable(getDescription(EvidenceViewsRepository.Weakens.Properties.event, EvidenceMessages.WeakensPropertiesEditionPart_EventLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.event, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				event.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.event, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				event.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.event, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				event.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.event, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				event.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.eventFilters) {
			this.event.addFilter(filter);
		}
		this.event.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Weakens.Properties.event, EvidenceViewsRepository.SWT_KIND));
		this.event.createControls(parent);
		this.event.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.event, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData eventData = new GridData(GridData.FILL_HORIZONTAL);
		eventData.horizontalSpan = 3;
		this.event.setLayoutData(eventData);
		this.event.setLowerBound(0);
		this.event.setUpperBound(-1);
		event.setID(EvidenceViewsRepository.Weakens.Properties.event);
		event.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createEventAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAttributeAdvancedTableComposition(Composite parent) {
		this.attribute = new ReferencesTable(getDescription(EvidenceViewsRepository.Weakens.Properties.attribute, EvidenceMessages.WeakensPropertiesEditionPart_AttributeLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.attribute, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				attribute.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.attribute, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				attribute.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.attribute, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				attribute.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.attribute, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				attribute.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.attributeFilters) {
			this.attribute.addFilter(filter);
		}
		this.attribute.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Weakens.Properties.attribute, EvidenceViewsRepository.SWT_KIND));
		this.attribute.createControls(parent);
		this.attribute.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.attribute, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData attributeData = new GridData(GridData.FILL_HORIZONTAL);
		attributeData.horizontalSpan = 3;
		this.attribute.setLayoutData(attributeData);
		this.attribute.setLowerBound(0);
		this.attribute.setUpperBound(-1);
		attribute.setID(EvidenceViewsRepository.Weakens.Properties.attribute);
		attribute.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAttributeAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSubjectFlatComboViewer(Composite parent) {
		createDescription(parent, EvidenceViewsRepository.Weakens.Properties.subject, EvidenceMessages.WeakensPropertiesEditionPart_SubjectLabel);
		subject = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EvidenceViewsRepository.Weakens.Properties.subject, EvidenceViewsRepository.SWT_KIND));
		subject.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		subject.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.subject, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSubject()));
			}

		});
		GridData subjectData = new GridData(GridData.FILL_HORIZONTAL);
		subject.setLayoutData(subjectData);
		subject.setID(EvidenceViewsRepository.Weakens.Properties.subject);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Weakens.Properties.subject, EvidenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSubjectFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRelationFlatComboViewer(Composite parent) {
		createDescription(parent, EvidenceViewsRepository.Weakens.Properties.relation, EvidenceMessages.WeakensPropertiesEditionPart_RelationLabel);
		relation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(EvidenceViewsRepository.Weakens.Properties.relation, EvidenceViewsRepository.SWT_KIND));
		relation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		relation.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeakensPropertiesEditionPartImpl.this, EvidenceViewsRepository.Weakens.Properties.relation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRelation()));
			}

		});
		GridData relationData = new GridData(GridData.FILL_HORIZONTAL);
		relation.setLayoutData(relationData);
		relation.setID(EvidenceViewsRepository.Weakens.Properties.relation);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.Weakens.Properties.relation, EvidenceViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createRelationFlatComboViewer

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
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#initTaggedValue(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTaggedValue(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		taggedValue.setContentProvider(contentProvider);
		taggedValue.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Weakens.Properties.taggedValue);
		if (eefElementEditorReadOnlyState && taggedValue.isEnabled()) {
			taggedValue.setEnabled(false);
			taggedValue.setToolTipText(EvidenceMessages.Weakens_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !taggedValue.isEnabled()) {
			taggedValue.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#updateTaggedValue()
	 * 
	 */
	public void updateTaggedValue() {
	taggedValue.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addFilterTaggedValue(ViewerFilter filter)
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
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addBusinessFilterTaggedValue(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTaggedValue(ViewerFilter filter) {
		taggedValueBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#isContainedInTaggedValueTable(EObject element)
	 * 
	 */
	public boolean isContainedInTaggedValueTable(EObject element) {
		return ((ReferencesTableSettings)taggedValue.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#initAnnotation(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnnotation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		annotation.setContentProvider(contentProvider);
		annotation.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Weakens.Properties.annotation);
		if (eefElementEditorReadOnlyState && annotation.isEnabled()) {
			annotation.setEnabled(false);
			annotation.setToolTipText(EvidenceMessages.Weakens_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !annotation.isEnabled()) {
			annotation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#updateAnnotation()
	 * 
	 */
	public void updateAnnotation() {
	annotation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addFilterAnnotation(ViewerFilter filter)
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
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addBusinessFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnnotation(ViewerFilter filter) {
		annotationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#isContainedInAnnotationTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnnotationTable(EObject element) {
		return ((ReferencesTableSettings)annotation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Weakens.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(EvidenceMessages.Weakens_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#initTiming(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTiming(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		timing.setContentProvider(contentProvider);
		timing.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Weakens.Properties.timing);
		if (eefElementEditorReadOnlyState && timing.isEnabled()) {
			timing.setEnabled(false);
			timing.setToolTipText(EvidenceMessages.Weakens_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !timing.isEnabled()) {
			timing.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#updateTiming()
	 * 
	 */
	public void updateTiming() {
	timing.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addFilterTiming(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTiming(ViewerFilter filter) {
		timingFilters.add(filter);
		if (this.timing != null) {
			this.timing.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addBusinessFilterTiming(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTiming(ViewerFilter filter) {
		timingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#isContainedInTimingTable(EObject element)
	 * 
	 */
	public boolean isContainedInTimingTable(EObject element) {
		return ((ReferencesTableSettings)timing.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#initCustody(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCustody(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		custody.setContentProvider(contentProvider);
		custody.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Weakens.Properties.custody);
		if (eefElementEditorReadOnlyState && custody.isEnabled()) {
			custody.setEnabled(false);
			custody.setToolTipText(EvidenceMessages.Weakens_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !custody.isEnabled()) {
			custody.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#updateCustody()
	 * 
	 */
	public void updateCustody() {
	custody.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addFilterCustody(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCustody(ViewerFilter filter) {
		custodyFilters.add(filter);
		if (this.custody != null) {
			this.custody.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addBusinessFilterCustody(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCustody(ViewerFilter filter) {
		custodyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#isContainedInCustodyTable(EObject element)
	 * 
	 */
	public boolean isContainedInCustodyTable(EObject element) {
		return ((ReferencesTableSettings)custody.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#initProvenance(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProvenance(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		provenance.setContentProvider(contentProvider);
		provenance.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Weakens.Properties.provenance);
		if (eefElementEditorReadOnlyState && provenance.isEnabled()) {
			provenance.setEnabled(false);
			provenance.setToolTipText(EvidenceMessages.Weakens_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !provenance.isEnabled()) {
			provenance.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#updateProvenance()
	 * 
	 */
	public void updateProvenance() {
	provenance.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addFilterProvenance(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProvenance(ViewerFilter filter) {
		provenanceFilters.add(filter);
		if (this.provenance != null) {
			this.provenance.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addBusinessFilterProvenance(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProvenance(ViewerFilter filter) {
		provenanceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#isContainedInProvenanceTable(EObject element)
	 * 
	 */
	public boolean isContainedInProvenanceTable(EObject element) {
		return ((ReferencesTableSettings)provenance.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#initEvent(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initEvent(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		event.setContentProvider(contentProvider);
		event.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Weakens.Properties.event);
		if (eefElementEditorReadOnlyState && event.isEnabled()) {
			event.setEnabled(false);
			event.setToolTipText(EvidenceMessages.Weakens_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !event.isEnabled()) {
			event.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#updateEvent()
	 * 
	 */
	public void updateEvent() {
	event.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addFilterEvent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEvent(ViewerFilter filter) {
		eventFilters.add(filter);
		if (this.event != null) {
			this.event.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addBusinessFilterEvent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEvent(ViewerFilter filter) {
		eventBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#isContainedInEventTable(EObject element)
	 * 
	 */
	public boolean isContainedInEventTable(EObject element) {
		return ((ReferencesTableSettings)event.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#initAttribute(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAttribute(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		attribute.setContentProvider(contentProvider);
		attribute.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Weakens.Properties.attribute);
		if (eefElementEditorReadOnlyState && attribute.isEnabled()) {
			attribute.setEnabled(false);
			attribute.setToolTipText(EvidenceMessages.Weakens_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !attribute.isEnabled()) {
			attribute.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#updateAttribute()
	 * 
	 */
	public void updateAttribute() {
	attribute.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addFilterAttribute(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAttribute(ViewerFilter filter) {
		attributeFilters.add(filter);
		if (this.attribute != null) {
			this.attribute.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addBusinessFilterAttribute(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAttribute(ViewerFilter filter) {
		attributeBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#isContainedInAttributeTable(EObject element)
	 * 
	 */
	public boolean isContainedInAttributeTable(EObject element) {
		return ((ReferencesTableSettings)attribute.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#getSubject()
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
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#initSubject(EObjectFlatComboSettings)
	 */
	public void initSubject(EObjectFlatComboSettings settings) {
		subject.setInput(settings);
		if (current != null) {
			subject.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Weakens.Properties.subject);
		if (eefElementEditorReadOnlyState && subject.isEnabled()) {
			subject.setEnabled(false);
			subject.setToolTipText(EvidenceMessages.Weakens_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !subject.isEnabled()) {
			subject.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#setSubject(EObject newValue)
	 * 
	 */
	public void setSubject(EObject newValue) {
		if (newValue != null) {
			subject.setSelection(new StructuredSelection(newValue));
		} else {
			subject.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Weakens.Properties.subject);
		if (eefElementEditorReadOnlyState && subject.isEnabled()) {
			subject.setEnabled(false);
			subject.setToolTipText(EvidenceMessages.Weakens_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !subject.isEnabled()) {
			subject.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#setSubjectButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSubjectButtonMode(ButtonsModeEnum newValue) {
		subject.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addFilterSubject(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSubject(ViewerFilter filter) {
		subject.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addBusinessFilterSubject(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSubject(ViewerFilter filter) {
		subject.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#getRelation()
	 * 
	 */
	public EObject getRelation() {
		if (relation.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) relation.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#initRelation(EObjectFlatComboSettings)
	 */
	public void initRelation(EObjectFlatComboSettings settings) {
		relation.setInput(settings);
		if (current != null) {
			relation.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Weakens.Properties.relation);
		if (eefElementEditorReadOnlyState && relation.isEnabled()) {
			relation.setEnabled(false);
			relation.setToolTipText(EvidenceMessages.Weakens_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !relation.isEnabled()) {
			relation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#setRelation(EObject newValue)
	 * 
	 */
	public void setRelation(EObject newValue) {
		if (newValue != null) {
			relation.setSelection(new StructuredSelection(newValue));
		} else {
			relation.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.Weakens.Properties.relation);
		if (eefElementEditorReadOnlyState && relation.isEnabled()) {
			relation.setEnabled(false);
			relation.setToolTipText(EvidenceMessages.Weakens_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !relation.isEnabled()) {
			relation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#setRelationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRelationButtonMode(ButtonsModeEnum newValue) {
		relation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addFilterRelation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRelation(ViewerFilter filter) {
		relation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.WeakensPropertiesEditionPart#addBusinessFilterRelation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRelation(ViewerFilter filter) {
		relation.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EvidenceMessages.Weakens_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
