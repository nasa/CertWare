/**
 * Generated with Acceleo
 */
package net.certware.argument.cae.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.argument.cae.parts.ArgumentPropertiesEditionPart;
import net.certware.argument.cae.parts.CaeViewsRepository;

import net.certware.argument.cae.providers.CaeMessages;

import org.eclipse.emf.ecore.EObject;

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

// End of user code

/**
 * 
 * 
 */
public class ArgumentPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ArgumentPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected ReferencesTable isTagged;
	protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable justification;
	protected List<ViewerFilter> justificationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> justificationFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable evidence;
	protected List<ViewerFilter> evidenceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> evidenceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable claims;
	protected List<ViewerFilter> claimsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> claimsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public ArgumentPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ArgumentPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence argumentStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = argumentStep.addStep(CaeViewsRepository.Argument.Properties.class);
		propertiesStep.addStep(CaeViewsRepository.Argument.Properties.identifier);
		propertiesStep.addStep(CaeViewsRepository.Argument.Properties.description);
		propertiesStep.addStep(CaeViewsRepository.Argument.Properties.content);
		propertiesStep.addStep(CaeViewsRepository.Argument.Properties.isTagged);
		propertiesStep.addStep(CaeViewsRepository.Argument.Properties.justification);
		propertiesStep.addStep(CaeViewsRepository.Argument.Properties.evidence);
		propertiesStep.addStep(CaeViewsRepository.Argument.Properties.claims);
		
		
		composer = new PartComposer(argumentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CaeViewsRepository.Argument.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == CaeViewsRepository.Argument.Properties.identifier) {
					return createIdentifierText(widgetFactory, parent);
				}
				if (key == CaeViewsRepository.Argument.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == CaeViewsRepository.Argument.Properties.content) {
					return createContentText(widgetFactory, parent);
				}
				if (key == CaeViewsRepository.Argument.Properties.isTagged) {
					return createIsTaggedTableComposition(widgetFactory, parent);
				}
				if (key == CaeViewsRepository.Argument.Properties.justification) {
					return createJustificationTableComposition(widgetFactory, parent);
				}
				if (key == CaeViewsRepository.Argument.Properties.evidence) {
					return createEvidenceTableComposition(widgetFactory, parent);
				}
				if (key == CaeViewsRepository.Argument.Properties.claims) {
					return createClaimsTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(CaeMessages.ArgumentPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createIdentifierText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CaeViewsRepository.Argument.Properties.identifier, CaeMessages.ArgumentPropertiesEditionPart_IdentifierLabel);
		identifier = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		identifier.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData identifierData = new GridData(GridData.FILL_HORIZONTAL);
		identifier.setLayoutData(identifierData);
		identifier.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ArgumentPropertiesEditionPartForm.this,
							CaeViewsRepository.Argument.Properties.identifier,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArgumentPropertiesEditionPartForm.this,
									CaeViewsRepository.Argument.Properties.identifier,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, identifier.getText()));
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
									ArgumentPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		identifier.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}
		});
		EditingUtils.setID(identifier, CaeViewsRepository.Argument.Properties.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CaeViewsRepository.Argument.Properties.identifier, CaeViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIdentifierText

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CaeViewsRepository.Argument.Properties.description, CaeMessages.ArgumentPropertiesEditionPart_DescriptionLabel);
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
							ArgumentPropertiesEditionPartForm.this,
							CaeViewsRepository.Argument.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArgumentPropertiesEditionPartForm.this,
									CaeViewsRepository.Argument.Properties.description,
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
									ArgumentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, CaeViewsRepository.Argument.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CaeViewsRepository.Argument.Properties.description, CaeViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createContentText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CaeViewsRepository.Argument.Properties.content, CaeMessages.ArgumentPropertiesEditionPart_ContentLabel);
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
							ArgumentPropertiesEditionPartForm.this,
							CaeViewsRepository.Argument.Properties.content,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArgumentPropertiesEditionPartForm.this,
									CaeViewsRepository.Argument.Properties.content,
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
									ArgumentPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}
		});
		EditingUtils.setID(content, CaeViewsRepository.Argument.Properties.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CaeViewsRepository.Argument.Properties.content, CaeViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createContentText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createIsTaggedTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.isTagged = new ReferencesTable(getDescription(CaeViewsRepository.Argument.Properties.isTagged, CaeMessages.ArgumentPropertiesEditionPart_IsTaggedLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				isTagged.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				isTagged.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				isTagged.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				isTagged.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.isTaggedFilters) {
			this.isTagged.addFilter(filter);
		}
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Argument.Properties.isTagged, CaeViewsRepository.FORM_KIND));
		this.isTagged.createControls(parent, widgetFactory);
		this.isTagged.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(CaeViewsRepository.Argument.Properties.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createIsTaggedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createJustificationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.justification = new ReferencesTable(getDescription(CaeViewsRepository.Argument.Properties.justification, CaeMessages.ArgumentPropertiesEditionPart_JustificationLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				justification.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				justification.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				justification.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				justification.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.justificationFilters) {
			this.justification.addFilter(filter);
		}
		this.justification.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Argument.Properties.justification, CaeViewsRepository.FORM_KIND));
		this.justification.createControls(parent, widgetFactory);
		this.justification.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.justification, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData justificationData = new GridData(GridData.FILL_HORIZONTAL);
		justificationData.horizontalSpan = 3;
		this.justification.setLayoutData(justificationData);
		this.justification.setLowerBound(0);
		this.justification.setUpperBound(-1);
		justification.setID(CaeViewsRepository.Argument.Properties.justification);
		justification.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createJustificationTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createEvidenceTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.evidence = new ReferencesTable(getDescription(CaeViewsRepository.Argument.Properties.evidence, CaeMessages.ArgumentPropertiesEditionPart_EvidenceLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.evidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				evidence.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.evidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				evidence.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.evidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				evidence.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.evidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				evidence.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.evidenceFilters) {
			this.evidence.addFilter(filter);
		}
		this.evidence.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Argument.Properties.evidence, CaeViewsRepository.FORM_KIND));
		this.evidence.createControls(parent, widgetFactory);
		this.evidence.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.evidence, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData evidenceData = new GridData(GridData.FILL_HORIZONTAL);
		evidenceData.horizontalSpan = 3;
		this.evidence.setLayoutData(evidenceData);
		this.evidence.setLowerBound(0);
		this.evidence.setUpperBound(-1);
		evidence.setID(CaeViewsRepository.Argument.Properties.evidence);
		evidence.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createEvidenceTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createClaimsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.claims = new ReferencesTable(getDescription(CaeViewsRepository.Argument.Properties.claims, CaeMessages.ArgumentPropertiesEditionPart_ClaimsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.claims, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				claims.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.claims, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				claims.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.claims, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				claims.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.claims, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				claims.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.claimsFilters) {
			this.claims.addFilter(filter);
		}
		this.claims.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Argument.Properties.claims, CaeViewsRepository.FORM_KIND));
		this.claims.createControls(parent, widgetFactory);
		this.claims.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, CaeViewsRepository.Argument.Properties.claims, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData claimsData = new GridData(GridData.FILL_HORIZONTAL);
		claimsData.horizontalSpan = 3;
		this.claims.setLayoutData(claimsData);
		this.claims.setLowerBound(0);
		this.claims.setUpperBound(-1);
		claims.setID(CaeViewsRepository.Argument.Properties.claims);
		claims.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createClaimsTableComposition

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
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#setIdentifier(String newValue)
	 * 
	 */
	public void setIdentifier(String newValue) {
		if (newValue != null) {
			identifier.setText(newValue);
		} else {
			identifier.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CaeViewsRepository.Argument.Properties.identifier);
		if (eefElementEditorReadOnlyState && identifier.isEnabled()) {
			identifier.setEnabled(false);
			identifier.setToolTipText(CaeMessages.Argument_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !identifier.isEnabled()) {
			identifier.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CaeViewsRepository.Argument.Properties.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(CaeMessages.Argument_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(CaeViewsRepository.Argument.Properties.content);
		if (eefElementEditorReadOnlyState && content.isEnabled()) {
			content.setEnabled(false);
			content.setToolTipText(CaeMessages.Argument_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !content.isEnabled()) {
			content.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initIsTagged(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isTagged.setContentProvider(contentProvider);
		isTagged.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CaeViewsRepository.Argument.Properties.isTagged);
		if (eefElementEditorReadOnlyState && isTagged.isEnabled()) {
			isTagged.setEnabled(false);
			isTagged.setToolTipText(CaeMessages.Argument_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isTagged.isEnabled()) {
			isTagged.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#updateIsTagged()
	 * 
	 */
	public void updateIsTagged() {
	isTagged.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
		if (this.isTagged != null) {
			this.isTagged.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return ((ReferencesTableSettings)isTagged.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#initJustification(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initJustification(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		justification.setContentProvider(contentProvider);
		justification.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CaeViewsRepository.Argument.Properties.justification);
		if (eefElementEditorReadOnlyState && justification.isEnabled()) {
			justification.setEnabled(false);
			justification.setToolTipText(CaeMessages.Argument_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !justification.isEnabled()) {
			justification.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#updateJustification()
	 * 
	 */
	public void updateJustification() {
	justification.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#addFilterJustification(ViewerFilter filter)
	 * 
	 */
	public void addFilterToJustification(ViewerFilter filter) {
		justificationFilters.add(filter);
		if (this.justification != null) {
			this.justification.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#addBusinessFilterJustification(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToJustification(ViewerFilter filter) {
		justificationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#isContainedInJustificationTable(EObject element)
	 * 
	 */
	public boolean isContainedInJustificationTable(EObject element) {
		return ((ReferencesTableSettings)justification.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#initEvidence(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initEvidence(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		evidence.setContentProvider(contentProvider);
		evidence.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CaeViewsRepository.Argument.Properties.evidence);
		if (eefElementEditorReadOnlyState && evidence.isEnabled()) {
			evidence.setEnabled(false);
			evidence.setToolTipText(CaeMessages.Argument_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !evidence.isEnabled()) {
			evidence.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#updateEvidence()
	 * 
	 */
	public void updateEvidence() {
	evidence.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#addFilterEvidence(ViewerFilter filter)
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
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#addBusinessFilterEvidence(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEvidence(ViewerFilter filter) {
		evidenceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#isContainedInEvidenceTable(EObject element)
	 * 
	 */
	public boolean isContainedInEvidenceTable(EObject element) {
		return ((ReferencesTableSettings)evidence.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#initClaims(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initClaims(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		claims.setContentProvider(contentProvider);
		claims.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(CaeViewsRepository.Argument.Properties.claims);
		if (eefElementEditorReadOnlyState && claims.isEnabled()) {
			claims.setEnabled(false);
			claims.setToolTipText(CaeMessages.Argument_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !claims.isEnabled()) {
			claims.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#updateClaims()
	 * 
	 */
	public void updateClaims() {
	claims.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#addFilterClaims(ViewerFilter filter)
	 * 
	 */
	public void addFilterToClaims(ViewerFilter filter) {
		claimsFilters.add(filter);
		if (this.claims != null) {
			this.claims.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#addBusinessFilterClaims(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToClaims(ViewerFilter filter) {
		claimsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#isContainedInClaimsTable(EObject element)
	 * 
	 */
	public boolean isContainedInClaimsTable(EObject element) {
		return ((ReferencesTableSettings)claims.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CaeMessages.Argument_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
