/**
 * Generated with Acceleo
 */
package net.certware.sacm.SACM.Argumentation.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.certware.sacm.SACM.Argumentation.parts.ArgumentationViewsRepository;
import net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart;

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
public class InformationElementPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, InformationElementPropertiesEditionPart {

	protected ReferencesTable taggedValue;
	protected List<ViewerFilter> taggedValueBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> taggedValueFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable annotation;
	protected List<ViewerFilter> annotationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> annotationFilters = new ArrayList<ViewerFilter>();
	protected Text id;
	protected Text description;
	protected Text content;
	protected ReferencesTable evidence;
	protected List<ViewerFilter> evidenceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> evidenceFilters = new ArrayList<ViewerFilter>();
	protected Text url;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InformationElementPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence informationElementStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = informationElementStep.addStep(ArgumentationViewsRepository.InformationElement.Properties.class);
		propertiesStep.addStep(ArgumentationViewsRepository.InformationElement.Properties.taggedValue);
		propertiesStep.addStep(ArgumentationViewsRepository.InformationElement.Properties.annotation);
		propertiesStep.addStep(ArgumentationViewsRepository.InformationElement.Properties.id);
		propertiesStep.addStep(ArgumentationViewsRepository.InformationElement.Properties.description);
		propertiesStep.addStep(ArgumentationViewsRepository.InformationElement.Properties.content);
		propertiesStep.addStep(ArgumentationViewsRepository.InformationElement.Properties.evidence);
		propertiesStep.addStep(ArgumentationViewsRepository.InformationElement.Properties.url);
		
		
		composer = new PartComposer(informationElementStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ArgumentationViewsRepository.InformationElement.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ArgumentationViewsRepository.InformationElement.Properties.taggedValue) {
					return createTaggedValueAdvancedTableComposition(parent);
				}
				if (key == ArgumentationViewsRepository.InformationElement.Properties.annotation) {
					return createAnnotationAdvancedTableComposition(parent);
				}
				if (key == ArgumentationViewsRepository.InformationElement.Properties.id) {
					return createIdText(parent);
				}
				if (key == ArgumentationViewsRepository.InformationElement.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == ArgumentationViewsRepository.InformationElement.Properties.content) {
					return createContentText(parent);
				}
				if (key == ArgumentationViewsRepository.InformationElement.Properties.evidence) {
					return createEvidenceAdvancedReferencesTable(parent);
				}
				if (key == ArgumentationViewsRepository.InformationElement.Properties.url) {
					return createUrlText(parent);
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
		propertiesGroup.setText(ArgumentationMessages.InformationElementPropertiesEditionPart_PropertiesGroupLabel);
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
		this.taggedValue = new ReferencesTable(getDescription(ArgumentationViewsRepository.InformationElement.Properties.taggedValue, ArgumentationMessages.InformationElementPropertiesEditionPart_TaggedValueLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				taggedValue.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				taggedValue.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				taggedValue.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.taggedValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				taggedValue.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.taggedValueFilters) {
			this.taggedValue.addFilter(filter);
		}
		this.taggedValue.setHelpText(propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.InformationElement.Properties.taggedValue, ArgumentationViewsRepository.SWT_KIND));
		this.taggedValue.createControls(parent);
		this.taggedValue.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.taggedValue, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData taggedValueData = new GridData(GridData.FILL_HORIZONTAL);
		taggedValueData.horizontalSpan = 3;
		this.taggedValue.setLayoutData(taggedValueData);
		this.taggedValue.setLowerBound(0);
		this.taggedValue.setUpperBound(-1);
		taggedValue.setID(ArgumentationViewsRepository.InformationElement.Properties.taggedValue);
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
		this.annotation = new ReferencesTable(getDescription(ArgumentationViewsRepository.InformationElement.Properties.annotation, ArgumentationMessages.InformationElementPropertiesEditionPart_AnnotationLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				annotation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				annotation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				annotation.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				annotation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.annotationFilters) {
			this.annotation.addFilter(filter);
		}
		this.annotation.setHelpText(propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.InformationElement.Properties.annotation, ArgumentationViewsRepository.SWT_KIND));
		this.annotation.createControls(parent);
		this.annotation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.annotation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData annotationData = new GridData(GridData.FILL_HORIZONTAL);
		annotationData.horizontalSpan = 3;
		this.annotation.setLayoutData(annotationData);
		this.annotation.setLowerBound(0);
		this.annotation.setUpperBound(-1);
		annotation.setID(ArgumentationViewsRepository.InformationElement.Properties.annotation);
		annotation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAnnotationAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createIdText(Composite parent) {
		createDescription(parent, ArgumentationViewsRepository.InformationElement.Properties.id, ArgumentationMessages.InformationElementPropertiesEditionPart_IdLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, ArgumentationViewsRepository.InformationElement.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.InformationElement.Properties.id, ArgumentationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, ArgumentationViewsRepository.InformationElement.Properties.description, ArgumentationMessages.InformationElementPropertiesEditionPart_DescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, ArgumentationViewsRepository.InformationElement.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.InformationElement.Properties.description, ArgumentationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createContentText(Composite parent) {
		createDescription(parent, ArgumentationViewsRepository.InformationElement.Properties.content, ArgumentationMessages.InformationElementPropertiesEditionPart_ContentLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}

		});
		EditingUtils.setID(content, ArgumentationViewsRepository.InformationElement.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.InformationElement.Properties.content, ArgumentationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createContentText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createEvidenceAdvancedReferencesTable(Composite parent) {
		String label = getDescription(ArgumentationViewsRepository.InformationElement.Properties.evidence, ArgumentationMessages.InformationElementPropertiesEditionPart_EvidenceLabel);		 
		this.evidence = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addEvidence(); }
			public void handleEdit(EObject element) { editEvidence(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveEvidence(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromEvidence(element); }
			public void navigateTo(EObject element) { }
		});
		this.evidence.setHelpText(propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.InformationElement.Properties.evidence, ArgumentationViewsRepository.SWT_KIND));
		this.evidence.createControls(parent);
		this.evidence.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.evidence, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData evidenceData = new GridData(GridData.FILL_HORIZONTAL);
		evidenceData.horizontalSpan = 3;
		this.evidence.setLayoutData(evidenceData);
		this.evidence.disableMove();
		evidence.setID(ArgumentationViewsRepository.InformationElement.Properties.evidence);
		evidence.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addEvidence() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(evidence.getInput(), evidenceFilters, evidenceBusinessFilters,
		"evidence", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.evidence,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				evidence.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveEvidence(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.evidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		evidence.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromEvidence(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.evidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		evidence.refresh();
	}

	/**
	 * 
	 */
	protected void editEvidence(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				evidence.refresh();
			}
		}
	}

	
	protected Composite createUrlText(Composite parent) {
		createDescription(parent, ArgumentationViewsRepository.InformationElement.Properties.url, ArgumentationMessages.InformationElementPropertiesEditionPart_UrlLabel);
		url = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData urlData = new GridData(GridData.FILL_HORIZONTAL);
		url.setLayoutData(urlData);
		url.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.url, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, url.getText()));
			}

		});
		url.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationElementPropertiesEditionPartImpl.this, ArgumentationViewsRepository.InformationElement.Properties.url, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, url.getText()));
				}
			}

		});
		EditingUtils.setID(url, ArgumentationViewsRepository.InformationElement.Properties.url);
		EditingUtils.setEEFtype(url, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.InformationElement.Properties.url, ArgumentationViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createUrlText

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
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#initTaggedValue(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTaggedValue(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		taggedValue.setContentProvider(contentProvider);
		taggedValue.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.InformationElement.Properties.taggedValue);
		if (eefElementEditorReadOnlyState && taggedValue.isEnabled()) {
			taggedValue.setEnabled(false);
			taggedValue.setToolTipText(ArgumentationMessages.InformationElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !taggedValue.isEnabled()) {
			taggedValue.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#updateTaggedValue()
	 * 
	 */
	public void updateTaggedValue() {
	taggedValue.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#addFilterTaggedValue(ViewerFilter filter)
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
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#addBusinessFilterTaggedValue(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTaggedValue(ViewerFilter filter) {
		taggedValueBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#isContainedInTaggedValueTable(EObject element)
	 * 
	 */
	public boolean isContainedInTaggedValueTable(EObject element) {
		return ((ReferencesTableSettings)taggedValue.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#initAnnotation(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnnotation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		annotation.setContentProvider(contentProvider);
		annotation.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.InformationElement.Properties.annotation);
		if (eefElementEditorReadOnlyState && annotation.isEnabled()) {
			annotation.setEnabled(false);
			annotation.setToolTipText(ArgumentationMessages.InformationElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !annotation.isEnabled()) {
			annotation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#updateAnnotation()
	 * 
	 */
	public void updateAnnotation() {
	annotation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#addFilterAnnotation(ViewerFilter filter)
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
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#addBusinessFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnnotation(ViewerFilter filter) {
		annotationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#isContainedInAnnotationTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnnotationTable(EObject element) {
		return ((ReferencesTableSettings)annotation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.InformationElement.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(ArgumentationMessages.InformationElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.InformationElement.Properties.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(ArgumentationMessages.InformationElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.InformationElement.Properties.content);
		if (eefElementEditorReadOnlyState && content.isEnabled()) {
			content.setEnabled(false);
			content.setToolTipText(ArgumentationMessages.InformationElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !content.isEnabled()) {
			content.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#initEvidence(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initEvidence(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		evidence.setContentProvider(contentProvider);
		evidence.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.InformationElement.Properties.evidence);
		if (eefElementEditorReadOnlyState && evidence.getTable().isEnabled()) {
			evidence.setEnabled(false);
			evidence.setToolTipText(ArgumentationMessages.InformationElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !evidence.getTable().isEnabled()) {
			evidence.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#updateEvidence()
	 * 
	 */
	public void updateEvidence() {
	evidence.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#addFilterEvidence(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEvidence(ViewerFilter filter) {
		evidenceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#addBusinessFilterEvidence(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEvidence(ViewerFilter filter) {
		evidenceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#isContainedInEvidenceTable(EObject element)
	 * 
	 */
	public boolean isContainedInEvidenceTable(EObject element) {
		return ((ReferencesTableSettings)evidence.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#getUrl()
	 * 
	 */
	public String getUrl() {
		return url.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.InformationElementPropertiesEditionPart#setUrl(String newValue)
	 * 
	 */
	public void setUrl(String newValue) {
		if (newValue != null) {
			url.setText(newValue);
		} else {
			url.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.InformationElement.Properties.url);
		if (eefElementEditorReadOnlyState && url.isEnabled()) {
			url.setEnabled(false);
			url.setToolTipText(ArgumentationMessages.InformationElement_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !url.isEnabled()) {
			url.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ArgumentationMessages.InformationElement_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
