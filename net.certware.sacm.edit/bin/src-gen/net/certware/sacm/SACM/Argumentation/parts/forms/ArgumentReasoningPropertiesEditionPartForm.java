// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Argumentation.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart;
import net.certware.sacm.SACM.Argumentation.parts.ArgumentationViewsRepository;
import net.certware.sacm.SACM.Argumentation.providers.ArgumentationMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
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
public class ArgumentReasoningPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ArgumentReasoningPropertiesEditionPart {

	protected Text id;
	protected Text description;
	protected Text content;
	protected ReferencesTable structure;
	protected List<ViewerFilter> structureBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> structureFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable describedInference;
	protected List<ViewerFilter> describedInferenceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> describedInferenceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable describedChallenge;
	protected List<ViewerFilter> describedChallengeBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> describedChallengeFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public ArgumentReasoningPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ArgumentReasoningPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence argumentReasoningStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = argumentReasoningStep.addStep(ArgumentationViewsRepository.ArgumentReasoning.Properties.class);
		propertiesStep.addStep(ArgumentationViewsRepository.ArgumentReasoning.Properties.id);
		propertiesStep.addStep(ArgumentationViewsRepository.ArgumentReasoning.Properties.description);
		propertiesStep.addStep(ArgumentationViewsRepository.ArgumentReasoning.Properties.content);
		propertiesStep.addStep(ArgumentationViewsRepository.ArgumentReasoning.Properties.structure);
		propertiesStep.addStep(ArgumentationViewsRepository.ArgumentReasoning.Properties.describedInference);
		propertiesStep.addStep(ArgumentationViewsRepository.ArgumentReasoning.Properties.describedChallenge);
		
		
		composer = new PartComposer(argumentReasoningStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ArgumentationViewsRepository.ArgumentReasoning.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.ArgumentReasoning.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.ArgumentReasoning.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.ArgumentReasoning.Properties.content) {
					return createContentText(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.ArgumentReasoning.Properties.structure) {
					return createStructureReferencesTable(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.ArgumentReasoning.Properties.describedInference) {
					return createDescribedInferenceReferencesTable(widgetFactory, parent);
				}
				if (key == ArgumentationViewsRepository.ArgumentReasoning.Properties.describedChallenge) {
					return createDescribedChallengeReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(ArgumentationMessages.ArgumentReasoningPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, ArgumentationViewsRepository.ArgumentReasoning.Properties.id, ArgumentationMessages.ArgumentReasoningPropertiesEditionPart_IdLabel);
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
							ArgumentReasoningPropertiesEditionPartForm.this,
							ArgumentationViewsRepository.ArgumentReasoning.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArgumentReasoningPropertiesEditionPartForm.this,
									ArgumentationViewsRepository.ArgumentReasoning.Properties.id,
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
									ArgumentReasoningPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentReasoningPropertiesEditionPartForm.this, ArgumentationViewsRepository.ArgumentReasoning.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, ArgumentationViewsRepository.ArgumentReasoning.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.ArgumentReasoning.Properties.id, ArgumentationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdText

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArgumentationViewsRepository.ArgumentReasoning.Properties.description, ArgumentationMessages.ArgumentReasoningPropertiesEditionPart_DescriptionLabel);
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
							ArgumentReasoningPropertiesEditionPartForm.this,
							ArgumentationViewsRepository.ArgumentReasoning.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArgumentReasoningPropertiesEditionPartForm.this,
									ArgumentationViewsRepository.ArgumentReasoning.Properties.description,
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
									ArgumentReasoningPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentReasoningPropertiesEditionPartForm.this, ArgumentationViewsRepository.ArgumentReasoning.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, ArgumentationViewsRepository.ArgumentReasoning.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.ArgumentReasoning.Properties.description, ArgumentationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createContentText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArgumentationViewsRepository.ArgumentReasoning.Properties.content, ArgumentationMessages.ArgumentReasoningPropertiesEditionPart_ContentLabel);
		content = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		content.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		content.setLayoutData(contentData);
		content.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ArgumentReasoningPropertiesEditionPartForm.this,
							ArgumentationViewsRepository.ArgumentReasoning.Properties.content,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArgumentReasoningPropertiesEditionPartForm.this,
									ArgumentationViewsRepository.ArgumentReasoning.Properties.content,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, content.getText()));
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
									ArgumentReasoningPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		content.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentReasoningPropertiesEditionPartForm.this, ArgumentationViewsRepository.ArgumentReasoning.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}
		});
		EditingUtils.setID(content, ArgumentationViewsRepository.ArgumentReasoning.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.ArgumentReasoning.Properties.content, ArgumentationViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createContentText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createStructureReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.structure = new ReferencesTable(getDescription(ArgumentationViewsRepository.ArgumentReasoning.Properties.structure, ArgumentationMessages.ArgumentReasoningPropertiesEditionPart_StructureLabel), new ReferencesTableListener	() {
			public void handleAdd() { addStructure(); }
			public void handleEdit(EObject element) { editStructure(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveStructure(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromStructure(element); }
			public void navigateTo(EObject element) { }
		});
		this.structure.setHelpText(propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.ArgumentReasoning.Properties.structure, ArgumentationViewsRepository.FORM_KIND));
		this.structure.createControls(parent, widgetFactory);
		this.structure.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentReasoningPropertiesEditionPartForm.this, ArgumentationViewsRepository.ArgumentReasoning.Properties.structure, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData structureData = new GridData(GridData.FILL_HORIZONTAL);
		structureData.horizontalSpan = 3;
		this.structure.setLayoutData(structureData);
		this.structure.disableMove();
		structure.setID(ArgumentationViewsRepository.ArgumentReasoning.Properties.structure);
		structure.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createStructureReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addStructure() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(structure.getInput(), structureFilters, structureBusinessFilters,
		"structure", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentReasoningPropertiesEditionPartForm.this, ArgumentationViewsRepository.ArgumentReasoning.Properties.structure,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				structure.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveStructure(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentReasoningPropertiesEditionPartForm.this, ArgumentationViewsRepository.ArgumentReasoning.Properties.structure, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		structure.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromStructure(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentReasoningPropertiesEditionPartForm.this, ArgumentationViewsRepository.ArgumentReasoning.Properties.structure, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		structure.refresh();
	}

	/**
	 * 
	 */
	protected void editStructure(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				structure.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDescribedInferenceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.describedInference = new ReferencesTable(getDescription(ArgumentationViewsRepository.ArgumentReasoning.Properties.describedInference, ArgumentationMessages.ArgumentReasoningPropertiesEditionPart_DescribedInferenceLabel), new ReferencesTableListener	() {
			public void handleAdd() { addDescribedInference(); }
			public void handleEdit(EObject element) { editDescribedInference(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDescribedInference(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDescribedInference(element); }
			public void navigateTo(EObject element) { }
		});
		this.describedInference.setHelpText(propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.ArgumentReasoning.Properties.describedInference, ArgumentationViewsRepository.FORM_KIND));
		this.describedInference.createControls(parent, widgetFactory);
		this.describedInference.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentReasoningPropertiesEditionPartForm.this, ArgumentationViewsRepository.ArgumentReasoning.Properties.describedInference, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData describedInferenceData = new GridData(GridData.FILL_HORIZONTAL);
		describedInferenceData.horizontalSpan = 3;
		this.describedInference.setLayoutData(describedInferenceData);
		this.describedInference.disableMove();
		describedInference.setID(ArgumentationViewsRepository.ArgumentReasoning.Properties.describedInference);
		describedInference.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createDescribedInferenceReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addDescribedInference() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(describedInference.getInput(), describedInferenceFilters, describedInferenceBusinessFilters,
		"describedInference", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentReasoningPropertiesEditionPartForm.this, ArgumentationViewsRepository.ArgumentReasoning.Properties.describedInference,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				describedInference.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveDescribedInference(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentReasoningPropertiesEditionPartForm.this, ArgumentationViewsRepository.ArgumentReasoning.Properties.describedInference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		describedInference.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDescribedInference(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentReasoningPropertiesEditionPartForm.this, ArgumentationViewsRepository.ArgumentReasoning.Properties.describedInference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		describedInference.refresh();
	}

	/**
	 * 
	 */
	protected void editDescribedInference(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				describedInference.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDescribedChallengeReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.describedChallenge = new ReferencesTable(getDescription(ArgumentationViewsRepository.ArgumentReasoning.Properties.describedChallenge, ArgumentationMessages.ArgumentReasoningPropertiesEditionPart_DescribedChallengeLabel), new ReferencesTableListener	() {
			public void handleAdd() { addDescribedChallenge(); }
			public void handleEdit(EObject element) { editDescribedChallenge(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDescribedChallenge(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDescribedChallenge(element); }
			public void navigateTo(EObject element) { }
		});
		this.describedChallenge.setHelpText(propertiesEditionComponent.getHelpContent(ArgumentationViewsRepository.ArgumentReasoning.Properties.describedChallenge, ArgumentationViewsRepository.FORM_KIND));
		this.describedChallenge.createControls(parent, widgetFactory);
		this.describedChallenge.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentReasoningPropertiesEditionPartForm.this, ArgumentationViewsRepository.ArgumentReasoning.Properties.describedChallenge, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData describedChallengeData = new GridData(GridData.FILL_HORIZONTAL);
		describedChallengeData.horizontalSpan = 3;
		this.describedChallenge.setLayoutData(describedChallengeData);
		this.describedChallenge.disableMove();
		describedChallenge.setID(ArgumentationViewsRepository.ArgumentReasoning.Properties.describedChallenge);
		describedChallenge.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createDescribedChallengeReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addDescribedChallenge() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(describedChallenge.getInput(), describedChallengeFilters, describedChallengeBusinessFilters,
		"describedChallenge", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentReasoningPropertiesEditionPartForm.this, ArgumentationViewsRepository.ArgumentReasoning.Properties.describedChallenge,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				describedChallenge.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveDescribedChallenge(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentReasoningPropertiesEditionPartForm.this, ArgumentationViewsRepository.ArgumentReasoning.Properties.describedChallenge, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		describedChallenge.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDescribedChallenge(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentReasoningPropertiesEditionPartForm.this, ArgumentationViewsRepository.ArgumentReasoning.Properties.describedChallenge, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		describedChallenge.refresh();
	}

	/**
	 * 
	 */
	protected void editDescribedChallenge(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				describedChallenge.refresh();
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
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.ArgumentReasoning.Properties.id);
		if (eefElementEditorReadOnlyState && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(ArgumentationMessages.ArgumentReasoning_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.ArgumentReasoning.Properties.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(ArgumentationMessages.ArgumentReasoning_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.ArgumentReasoning.Properties.content);
		if (eefElementEditorReadOnlyState && content.isEnabled()) {
			content.setEnabled(false);
			content.setToolTipText(ArgumentationMessages.ArgumentReasoning_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !content.isEnabled()) {
			content.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#initStructure(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initStructure(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		structure.setContentProvider(contentProvider);
		structure.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.ArgumentReasoning.Properties.structure);
		if (eefElementEditorReadOnlyState && structure.getTable().isEnabled()) {
			structure.setEnabled(false);
			structure.setToolTipText(ArgumentationMessages.ArgumentReasoning_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !structure.getTable().isEnabled()) {
			structure.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#updateStructure()
	 * 
	 */
	public void updateStructure() {
	structure.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#addFilterStructure(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStructure(ViewerFilter filter) {
		structureFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#addBusinessFilterStructure(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStructure(ViewerFilter filter) {
		structureBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#isContainedInStructureTable(EObject element)
	 * 
	 */
	public boolean isContainedInStructureTable(EObject element) {
		return ((ReferencesTableSettings)structure.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#initDescribedInference(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initDescribedInference(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		describedInference.setContentProvider(contentProvider);
		describedInference.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.ArgumentReasoning.Properties.describedInference);
		if (eefElementEditorReadOnlyState && describedInference.getTable().isEnabled()) {
			describedInference.setEnabled(false);
			describedInference.setToolTipText(ArgumentationMessages.ArgumentReasoning_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !describedInference.getTable().isEnabled()) {
			describedInference.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#updateDescribedInference()
	 * 
	 */
	public void updateDescribedInference() {
	describedInference.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#addFilterDescribedInference(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDescribedInference(ViewerFilter filter) {
		describedInferenceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#addBusinessFilterDescribedInference(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDescribedInference(ViewerFilter filter) {
		describedInferenceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#isContainedInDescribedInferenceTable(EObject element)
	 * 
	 */
	public boolean isContainedInDescribedInferenceTable(EObject element) {
		return ((ReferencesTableSettings)describedInference.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#initDescribedChallenge(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initDescribedChallenge(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		describedChallenge.setContentProvider(contentProvider);
		describedChallenge.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ArgumentationViewsRepository.ArgumentReasoning.Properties.describedChallenge);
		if (eefElementEditorReadOnlyState && describedChallenge.getTable().isEnabled()) {
			describedChallenge.setEnabled(false);
			describedChallenge.setToolTipText(ArgumentationMessages.ArgumentReasoning_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !describedChallenge.getTable().isEnabled()) {
			describedChallenge.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#updateDescribedChallenge()
	 * 
	 */
	public void updateDescribedChallenge() {
	describedChallenge.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#addFilterDescribedChallenge(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDescribedChallenge(ViewerFilter filter) {
		describedChallengeFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#addBusinessFilterDescribedChallenge(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDescribedChallenge(ViewerFilter filter) {
		describedChallengeBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart#isContainedInDescribedChallengeTable(EObject element)
	 * 
	 */
	public boolean isContainedInDescribedChallengeTable(EObject element) {
		return ((ReferencesTableSettings)describedChallenge.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ArgumentationMessages.ArgumentReasoning_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
