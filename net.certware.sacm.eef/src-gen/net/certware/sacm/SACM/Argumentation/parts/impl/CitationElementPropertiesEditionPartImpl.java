/**
 * Generated with Acceleo
 */
package net.certware.sacm.SACM.Argumentation.parts.impl;

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

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class CitationElementPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, CitationElementPropertiesEditionPart {

	protected ReferencesTable taggedValue;
	protected List<ViewerFilter> taggedValueBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> taggedValueFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable annotation;
	protected List<ViewerFilter> annotationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> annotationFilters = new ArrayList<ViewerFilter>();
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
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CitationElementPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence citationElementStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = citationElementStep.addStep(ArgumentationViewsRepository.CitationElement.Properties.class);
		propertiesStep.addStep(ArgumentationViewsRepository.CitationElement.Properties.taggedValue);
		propertiesStep.addStep(ArgumentationViewsRepository.CitationElement.Properties.annotation);
		propertiesStep.addStep(ArgumentationViewsRepository.CitationElement.Properties.id);
		propertiesStep.addStep(ArgumentationViewsRepository.CitationElement.Properties.description);
		propertiesStep.addStep(ArgumentationViewsRepository.CitationElement.Properties.content);
		propertiesStep.addStep(ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference);
		propertiesStep.addStep(ArgumentationViewsRepository.CitationElement.Properties.argumentationReference);
		
		
		composer = new PartComposer(citationElementStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ArgumentationViewsRepository.CitationElement.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ArgumentationViewsRepository.CitationElement.Properties.taggedValue) {
					return createTaggedValueAdvancedTableComposition(parent);
				}
				if (key == ArgumentationViewsRepository.CitationElement.Properties.annotation) {
					return createAnnotationAdvancedTableComposition(parent);
				}
				if (key == ArgumentationViewsRepository.CitationElement.Properties.id) {
					return createIdText(parent);
				}
				if (key == ArgumentationViewsRepository.CitationElement.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == ArgumentationViewsRepository.CitationElement.Properties.content) {
					return createContentText(parent);
				}
				if (key == ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference) {
					return createArgumentElementReferenceAdvancedReferencesTable(parent);
				}
				if (key == ArgumentationViewsRepository.CitationElement.Properties.argumentationReference) {
					return createArgumentationReferenceAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(ArgumentationMessages.CitationElementPropertiesEditionPart_PropertiesGroupLabel);
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
		this.taggedValue = new ReferencesTable(getDescription(ArgumentationViewsRepository.CitationElement.Properties.taggedValue, ArgumentationMessages.CitationElementPropertiesEditionPart_TaggedValueLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				taggedValue.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				taggedValue.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				taggedValue.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				taggedValue.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.taggedValueFilters) {
			this.taggedValue.addFilter(filter);
		}
		this.taggedValue.setHelpText(propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.CitationElement.Properties.taggedValue, ArgumentationViewsRepository.SWT_KIND));
		this.taggedValue.createControls(parent);
		this.taggedValue.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.taggedValue, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData taggedValueData = new GridData(GridData.FILL_HORIZONTAL);
		taggedValueData.horizontalSpan = 3;
		this.taggedValue.setLayoutData(taggedValueData);
		this.taggedValue.setLowerBound(0);
		this.taggedValue.setUpperBound(-1);
		taggedValue.setID(ArgumentationViewsRepository.CitationElement.Properties.taggedValue);
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
		this.annotation = new ReferencesTable(getDescription(ArgumentationViewsRepository.CitationElement.Properties.annotation, ArgumentationMessages.CitationElementPropertiesEditionPart_AnnotationLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				annotation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				annotation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				annotation.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				annotation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.annotationFilters) {
			this.annotation.addFilter(filter);
		}
		this.annotation.setHelpText(propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.CitationElement.Properties.annotation, ArgumentationViewsRepository.SWT_KIND));
		this.annotation.createControls(parent);
		this.annotation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.annotation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData annotationData = new GridData(GridData.FILL_HORIZONTAL);
		annotationData.horizontalSpan = 3;
		this.annotation.setLayoutData(annotationData);
		this.annotation.setLowerBound(0);
		this.annotation.setUpperBound(-1);
		annotation.setID(ArgumentationViewsRepository.CitationElement.Properties.annotation);
		annotation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAnnotationAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createIdText(Composite parent) {
		createDescription(parent, ArgumentationViewsRepository.CitationElement.Properties.id, ArgumentationMessages.CitationElementPropertiesEditionPart_IdLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, ArgumentationViewsRepository.CitationElement.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.CitationElement.Properties.id, ArgumentationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, ArgumentationViewsRepository.CitationElement.Properties.description, ArgumentationMessages.CitationElementPropertiesEditionPart_DescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, ArgumentationViewsRepository.CitationElement.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.CitationElement.Properties.description, ArgumentationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createContentText(Composite parent) {
		createDescription(parent, ArgumentationViewsRepository.CitationElement.Properties.content, ArgumentationMessages.CitationElementPropertiesEditionPart_ContentLabel);
		content = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		content.setLayoutData(contentData);
		content.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
			}

		});
		content.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}

		});
		EditingUtils.setID(content, ArgumentationViewsRepository.CitationElement.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.CitationElement.Properties.content, ArgumentationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createContentText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createArgumentElementReferenceAdvancedReferencesTable(Composite parent) {
		String label = getDescription(ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference, ArgumentationMessages.CitationElementPropertiesEditionPart_ArgumentElementReferenceLabel);		 
		this.argumentElementReference = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addArgumentElementReference(); }
			public void handleEdit(EObject element) { editArgumentElementReference(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveArgumentElementReference(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromArgumentElementReference(element); }
			public void navigateTo(EObject element) { }
		});
		this.argumentElementReference.setHelpText(propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference, ArgumentationViewsRepository.SWT_KIND));
		this.argumentElementReference.createControls(parent);
		this.argumentElementReference.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData argumentElementReferenceData = new GridData(GridData.FILL_HORIZONTAL);
		argumentElementReferenceData.horizontalSpan = 3;
		this.argumentElementReference.setLayoutData(argumentElementReferenceData);
		this.argumentElementReference.disableMove();
		argumentElementReference.setID(ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference);
		argumentElementReference.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		argumentElementReference.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromArgumentElementReference(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createArgumentationReferenceAdvancedReferencesTable(Composite parent) {
		String label = getDescription(ArgumentationViewsRepository.CitationElement.Properties.argumentationReference, ArgumentationMessages.CitationElementPropertiesEditionPart_ArgumentationReferenceLabel);		 
		this.argumentationReference = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addArgumentationReference(); }
			public void handleEdit(EObject element) { editArgumentationReference(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveArgumentationReference(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromArgumentationReference(element); }
			public void navigateTo(EObject element) { }
		});
		this.argumentationReference.setHelpText(propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.CitationElement.Properties.argumentationReference, ArgumentationViewsRepository.SWT_KIND));
		this.argumentationReference.createControls(parent);
		this.argumentationReference.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.argumentationReference, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData argumentationReferenceData = new GridData(GridData.FILL_HORIZONTAL);
		argumentationReferenceData.horizontalSpan = 3;
		this.argumentationReference.setLayoutData(argumentationReferenceData);
		this.argumentationReference.disableMove();
		argumentationReference.setID(ArgumentationViewsRepository.CitationElement.Properties.argumentationReference);
		argumentationReference.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.argumentationReference,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.argumentationReference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		argumentationReference.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromArgumentationReference(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CitationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.CitationElement.Properties.argumentationReference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#initTaggedValue(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTaggedValue(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		taggedValue.setContentProvider(contentProvider);
		taggedValue.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.CitationElement.Properties.taggedValue);
		if (eefElementEditorReadOnlyState && taggedValue.isEnabled()) {
			taggedValue.setEnabled(false);
			taggedValue.setToolTipText(ArgumentationMessages.CitationElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !taggedValue.isEnabled()) {
			taggedValue.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#updateTaggedValue()
	 * 
	 */
	public void updateTaggedValue() {
	taggedValue.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#addFilterTaggedValue(ViewerFilter filter)
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
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#addBusinessFilterTaggedValue(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTaggedValue(ViewerFilter filter) {
		taggedValueBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#isContainedInTaggedValueTable(EObject element)
	 * 
	 */
	public boolean isContainedInTaggedValueTable(EObject element) {
		return ((ReferencesTableSettings)taggedValue.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#initAnnotation(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnnotation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		annotation.setContentProvider(contentProvider);
		annotation.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.CitationElement.Properties.annotation);
		if (eefElementEditorReadOnlyState && annotation.isEnabled()) {
			annotation.setEnabled(false);
			annotation.setToolTipText(ArgumentationMessages.CitationElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !annotation.isEnabled()) {
			annotation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#updateAnnotation()
	 * 
	 */
	public void updateAnnotation() {
	annotation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#addFilterAnnotation(ViewerFilter filter)
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
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#addBusinessFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnnotation(ViewerFilter filter) {
		annotationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart#isContainedInAnnotationTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnnotationTable(EObject element) {
		return ((ReferencesTableSettings)annotation.getInput()).contains(element);
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
