// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.providers.EvidenceMessages;

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
public class EvidenceContainerPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, EvidenceContainerPropertiesEditionPart {

	protected ReferencesTable taggedValue;
	protected List<ViewerFilter> taggedValueBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> taggedValueFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable annotation;
	protected List<ViewerFilter> annotationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> annotationFilters = new ArrayList<ViewerFilter>();
	protected Text id;
	protected Text name;
	protected ReferencesTable evaluation;
	protected List<ViewerFilter> evaluationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> evaluationFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable item;
	protected List<ViewerFilter> itemBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> itemFilters = new ArrayList<ViewerFilter>();
	protected Text gid;
	protected ReferencesTable property;
	protected List<ViewerFilter> propertyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> propertyFilters = new ArrayList<ViewerFilter>();
	protected Text version;
	protected ReferencesTable element;
	protected List<ViewerFilter> elementBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> elementFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public EvidenceContainerPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EvidenceContainerPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence evidenceContainerStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = evidenceContainerStep.addStep(EvidenceViewsRepository.EvidenceContainer.Properties.class);
		propertiesStep.addStep(EvidenceViewsRepository.EvidenceContainer.Properties.id);
		propertiesStep.addStep(EvidenceViewsRepository.EvidenceContainer.Properties.name);
		propertiesStep.addStep(EvidenceViewsRepository.EvidenceContainer.Properties.evaluation);
		propertiesStep.addStep(EvidenceViewsRepository.EvidenceContainer.Properties.item);
		propertiesStep.addStep(EvidenceViewsRepository.EvidenceContainer.Properties.gid);
		propertiesStep.addStep(EvidenceViewsRepository.EvidenceContainer.Properties.property);
		propertiesStep.addStep(EvidenceViewsRepository.EvidenceContainer.Properties.version);
		propertiesStep.addStep(EvidenceViewsRepository.EvidenceContainer.Properties.element);
		
		
		composer = new PartComposer(evidenceContainerStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EvidenceViewsRepository.EvidenceContainer.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EvidenceViewsRepository.EvidenceContainer.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == EvidenceViewsRepository.EvidenceContainer.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == EvidenceViewsRepository.EvidenceContainer.Properties.evaluation) {
					return createEvaluationTableComposition(widgetFactory, parent);
				}
				if (key == EvidenceViewsRepository.EvidenceContainer.Properties.item) {
					return createItemTableComposition(widgetFactory, parent);
				}
				if (key == EvidenceViewsRepository.EvidenceContainer.Properties.gid) {
					return createGidText(widgetFactory, parent);
				}
				if (key == EvidenceViewsRepository.EvidenceContainer.Properties.property) {
					return createPropertyTableComposition(widgetFactory, parent);
				}
				if (key == EvidenceViewsRepository.EvidenceContainer.Properties.version) {
					return createVersionText(widgetFactory, parent);
				}
				if (key == EvidenceViewsRepository.EvidenceContainer.Properties.element) {
					return createElementTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(EvidenceMessages.EvidenceContainerPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, EvidenceViewsRepository.EvidenceContainer.Properties.id, EvidenceMessages.EvidenceContainerPropertiesEditionPart_IdLabel);
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
							EvidenceContainerPropertiesEditionPartForm.this,
							EvidenceViewsRepository.EvidenceContainer.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EvidenceContainerPropertiesEditionPartForm.this,
									EvidenceViewsRepository.EvidenceContainer.Properties.id,
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
									EvidenceContainerPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, EvidenceViewsRepository.EvidenceContainer.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.EvidenceContainer.Properties.id, EvidenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EvidenceViewsRepository.EvidenceContainer.Properties.name, EvidenceMessages.EvidenceContainerPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EvidenceContainerPropertiesEditionPartForm.this,
							EvidenceViewsRepository.EvidenceContainer.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EvidenceContainerPropertiesEditionPartForm.this,
									EvidenceViewsRepository.EvidenceContainer.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
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
									EvidenceContainerPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, EvidenceViewsRepository.EvidenceContainer.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.EvidenceContainer.Properties.name, EvidenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createEvaluationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.evaluation = new ReferencesTable(getDescription(EvidenceViewsRepository.EvidenceContainer.Properties.evaluation, EvidenceMessages.EvidenceContainerPropertiesEditionPart_EvaluationLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.evaluation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				evaluation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.evaluation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				evaluation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.evaluation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				evaluation.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.evaluation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				evaluation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.evaluationFilters) {
			this.evaluation.addFilter(filter);
		}
		this.evaluation.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.EvidenceContainer.Properties.evaluation, EvidenceViewsRepository.FORM_KIND));
		this.evaluation.createControls(parent, widgetFactory);
		this.evaluation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.evaluation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData evaluationData = new GridData(GridData.FILL_HORIZONTAL);
		evaluationData.horizontalSpan = 3;
		this.evaluation.setLayoutData(evaluationData);
		this.evaluation.setLowerBound(0);
		this.evaluation.setUpperBound(-1);
		evaluation.setID(EvidenceViewsRepository.EvidenceContainer.Properties.evaluation);
		evaluation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createEvaluationTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createItemTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.item = new ReferencesTable(getDescription(EvidenceViewsRepository.EvidenceContainer.Properties.item, EvidenceMessages.EvidenceContainerPropertiesEditionPart_ItemLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.item, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				item.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.item, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				item.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.item, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				item.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.item, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				item.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.itemFilters) {
			this.item.addFilter(filter);
		}
		this.item.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.EvidenceContainer.Properties.item, EvidenceViewsRepository.FORM_KIND));
		this.item.createControls(parent, widgetFactory);
		this.item.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.item, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData itemData = new GridData(GridData.FILL_HORIZONTAL);
		itemData.horizontalSpan = 3;
		this.item.setLayoutData(itemData);
		this.item.setLowerBound(0);
		this.item.setUpperBound(-1);
		item.setID(EvidenceViewsRepository.EvidenceContainer.Properties.item);
		item.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createItemTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createGidText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EvidenceViewsRepository.EvidenceContainer.Properties.gid, EvidenceMessages.EvidenceContainerPropertiesEditionPart_GidLabel);
		gid = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		gid.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData gidData = new GridData(GridData.FILL_HORIZONTAL);
		gid.setLayoutData(gidData);
		gid.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EvidenceContainerPropertiesEditionPartForm.this,
							EvidenceViewsRepository.EvidenceContainer.Properties.gid,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, gid.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EvidenceContainerPropertiesEditionPartForm.this,
									EvidenceViewsRepository.EvidenceContainer.Properties.gid,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, gid.getText()));
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
									EvidenceContainerPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		gid.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.gid, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, gid.getText()));
				}
			}
		});
		EditingUtils.setID(gid, EvidenceViewsRepository.EvidenceContainer.Properties.gid);
		EditingUtils.setEEFtype(gid, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.EvidenceContainer.Properties.gid, EvidenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createGidText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPropertyTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.property = new ReferencesTable(getDescription(EvidenceViewsRepository.EvidenceContainer.Properties.property, EvidenceMessages.EvidenceContainerPropertiesEditionPart_PropertyLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.property, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				property.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.property, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				property.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.property, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				property.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.property, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				property.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.propertyFilters) {
			this.property.addFilter(filter);
		}
		this.property.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.EvidenceContainer.Properties.property, EvidenceViewsRepository.FORM_KIND));
		this.property.createControls(parent, widgetFactory);
		this.property.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.property, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData propertyData = new GridData(GridData.FILL_HORIZONTAL);
		propertyData.horizontalSpan = 3;
		this.property.setLayoutData(propertyData);
		this.property.setLowerBound(0);
		this.property.setUpperBound(-1);
		property.setID(EvidenceViewsRepository.EvidenceContainer.Properties.property);
		property.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPropertyTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createVersionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EvidenceViewsRepository.EvidenceContainer.Properties.version, EvidenceMessages.EvidenceContainerPropertiesEditionPart_VersionLabel);
		version = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		version.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData versionData = new GridData(GridData.FILL_HORIZONTAL);
		version.setLayoutData(versionData);
		version.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EvidenceContainerPropertiesEditionPartForm.this,
							EvidenceViewsRepository.EvidenceContainer.Properties.version,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EvidenceContainerPropertiesEditionPartForm.this,
									EvidenceViewsRepository.EvidenceContainer.Properties.version,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, version.getText()));
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
									EvidenceContainerPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		version.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}
		});
		EditingUtils.setID(version, EvidenceViewsRepository.EvidenceContainer.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.EvidenceContainer.Properties.version, EvidenceViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createVersionText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated NOT 
	 */
	protected Composite createElementTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.element = new ReferencesTable(getDescription(EvidenceViewsRepository.EvidenceContainer.Properties.element, EvidenceMessages.EvidenceContainerPropertiesEditionPart_ElementLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.element, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				element.refresh();
			}
			public void handleEdit(EObject eo) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.element, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, eo));
				element.refresh();
			}
			public void handleMove(EObject eo, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.element, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, eo, newIndex));
				element.refresh();
			}
			public void handleRemove(EObject eo) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.element, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, eo));
				element.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.elementFilters) {
			this.element.addFilter(filter);
		}
		this.element.setHelpText(propertiesEditionComponent.getHelpContent(EvidenceViewsRepository.EvidenceContainer.Properties.element, EvidenceViewsRepository.FORM_KIND));
		this.element.createControls(parent, widgetFactory);
		this.element.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidenceContainerPropertiesEditionPartForm.this, EvidenceViewsRepository.EvidenceContainer.Properties.element, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData elementData = new GridData(GridData.FILL_HORIZONTAL);
		elementData.horizontalSpan = 3;
		this.element.setLayoutData(elementData);
		this.element.setLowerBound(0);
		this.element.setUpperBound(-1);
		element.setID(EvidenceViewsRepository.EvidenceContainer.Properties.element);
		element.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createElementTableComposition

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
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#updateTaggedValue()
	 * 
	 */
	public void updateTaggedValue() {
	taggedValue.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#addFilterTaggedValue(ViewerFilter filter)
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
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#addBusinessFilterTaggedValue(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTaggedValue(ViewerFilter filter) {
		taggedValueBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#isContainedInTaggedValueTable(EObject element)
	 * 
	 */
	public boolean isContainedInTaggedValueTable(EObject element) {
		return ((ReferencesTableSettings)taggedValue.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#updateAnnotation()
	 * 
	 */
	public void updateAnnotation() {
	annotation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#addFilterAnnotation(ViewerFilter filter)
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
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#addBusinessFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnnotation(ViewerFilter filter) {
		annotationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#isContainedInAnnotationTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnnotationTable(EObject element) {
		return ((ReferencesTableSettings)annotation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.EvidenceContainer.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(EvidenceMessages.EvidenceContainer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.EvidenceContainer.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(EvidenceMessages.EvidenceContainer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#initEvaluation(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initEvaluation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		evaluation.setContentProvider(contentProvider);
		evaluation.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.EvidenceContainer.Properties.evaluation);
		if (eefElementEditorReadOnlyState && evaluation.isEnabled()) {
			evaluation.setEnabled(false);
			evaluation.setToolTipText(EvidenceMessages.EvidenceContainer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !evaluation.isEnabled()) {
			evaluation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#updateEvaluation()
	 * 
	 */
	public void updateEvaluation() {
	evaluation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#addFilterEvaluation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEvaluation(ViewerFilter filter) {
		evaluationFilters.add(filter);
		if (this.evaluation != null) {
			this.evaluation.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#addBusinessFilterEvaluation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEvaluation(ViewerFilter filter) {
		evaluationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#isContainedInEvaluationTable(EObject element)
	 * 
	 */
	public boolean isContainedInEvaluationTable(EObject element) {
		return ((ReferencesTableSettings)evaluation.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#initItem(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initItem(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		item.setContentProvider(contentProvider);
		item.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.EvidenceContainer.Properties.item);
		if (eefElementEditorReadOnlyState && item.isEnabled()) {
			item.setEnabled(false);
			item.setToolTipText(EvidenceMessages.EvidenceContainer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !item.isEnabled()) {
			item.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#updateItem()
	 * 
	 */
	public void updateItem() {
	item.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#addFilterItem(ViewerFilter filter)
	 * 
	 */
	public void addFilterToItem(ViewerFilter filter) {
		itemFilters.add(filter);
		if (this.item != null) {
			this.item.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#addBusinessFilterItem(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToItem(ViewerFilter filter) {
		itemBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#isContainedInItemTable(EObject element)
	 * 
	 */
	public boolean isContainedInItemTable(EObject element) {
		return ((ReferencesTableSettings)item.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#getGid()
	 * 
	 */
	public String getGid() {
		return gid.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#setGid(String newValue)
	 * 
	 */
	public void setGid(String newValue) {
		if (newValue != null) {
			gid.setText(newValue);
		} else {
			gid.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.EvidenceContainer.Properties.gid);
		if (eefElementEditorReadOnlyState && gid.isEnabled()) {
			gid.setEnabled(false);
			gid.setToolTipText(EvidenceMessages.EvidenceContainer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !gid.isEnabled()) {
			gid.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#initProperty(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProperty(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		property.setContentProvider(contentProvider);
		property.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.EvidenceContainer.Properties.property);
		if (eefElementEditorReadOnlyState && property.isEnabled()) {
			property.setEnabled(false);
			property.setToolTipText(EvidenceMessages.EvidenceContainer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !property.isEnabled()) {
			property.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#updateProperty()
	 * 
	 */
	public void updateProperty() {
	property.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#addFilterProperty(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProperty(ViewerFilter filter) {
		propertyFilters.add(filter);
		if (this.property != null) {
			this.property.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#addBusinessFilterProperty(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProperty(ViewerFilter filter) {
		propertyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#isContainedInPropertyTable(EObject element)
	 * 
	 */
	public boolean isContainedInPropertyTable(EObject element) {
		return ((ReferencesTableSettings)property.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#setVersion(String newValue)
	 * 
	 */
	public void setVersion(String newValue) {
		if (newValue != null) {
			version.setText(newValue);
		} else {
			version.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.EvidenceContainer.Properties.version);
		if (eefElementEditorReadOnlyState && version.isEnabled()) {
			version.setEnabled(false);
			version.setToolTipText(EvidenceMessages.EvidenceContainer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !version.isEnabled()) {
			version.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#initElement(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initElement(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		element.setContentProvider(contentProvider);
		element.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EvidenceViewsRepository.EvidenceContainer.Properties.element);
		if (eefElementEditorReadOnlyState && element.isEnabled()) {
			element.setEnabled(false);
			element.setToolTipText(EvidenceMessages.EvidenceContainer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !element.isEnabled()) {
			element.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#updateElement()
	 * 
	 */
	public void updateElement() {
	element.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#addFilterElement(ViewerFilter filter)
	 * 
	 */
	public void addFilterToElement(ViewerFilter filter) {
		elementFilters.add(filter);
		if (this.element != null) {
			this.element.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#addBusinessFilterElement(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToElement(ViewerFilter filter) {
		elementBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart#isContainedInElementTable(EObject element)
	 * @generated NOT 
	 */
	public boolean isContainedInElementTable(EObject eo) {
		return ((ReferencesTableSettings)element.getInput()).contains(eo);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EvidenceMessages.EvidenceContainer_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
