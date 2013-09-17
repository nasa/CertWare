/**
 * Generated with Acceleo
 */
package net.certware.verification.checklist.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.verification.checklist.parts.ChecklistPropertiesEditionPart;
import net.certware.verification.checklist.parts.ChecklistViewsRepository;
import net.certware.verification.checklist.providers.ChecklistMessages;

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
 * 
 * 
 */
public class ChecklistPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ChecklistPropertiesEditionPart {

	protected Text name;
	protected Text version;
	protected ReferencesTable categories;
	protected List<ViewerFilter> categoriesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> categoriesFilters = new ArrayList<ViewerFilter>();
	protected Text comment;



	/**
	 * For {@link ISection} use only.
	 */
	public ChecklistPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ChecklistPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence checklist_Step = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = checklist_Step.addStep(ChecklistViewsRepository.Checklist_.Properties.class);
		propertiesStep.addStep(ChecklistViewsRepository.Checklist_.Properties.name);
		propertiesStep.addStep(ChecklistViewsRepository.Checklist_.Properties.version);
		propertiesStep.addStep(ChecklistViewsRepository.Checklist_.Properties.categories);
		propertiesStep.addStep(ChecklistViewsRepository.Checklist_.Properties.comment);
		
		
		composer = new PartComposer(checklist_Step) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ChecklistViewsRepository.Checklist_.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ChecklistViewsRepository.Checklist_.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == ChecklistViewsRepository.Checklist_.Properties.version) {
					return createVersionText(widgetFactory, parent);
				}
				if (key == ChecklistViewsRepository.Checklist_.Properties.categories) {
					return createCategoriesTableComposition(widgetFactory, parent);
				}
				if (key == ChecklistViewsRepository.Checklist_.Properties.comment) {
					return createCommentText(widgetFactory, parent);
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
		propertiesSection.setText(ChecklistMessages.ChecklistPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ChecklistViewsRepository.Checklist_.Properties.name, ChecklistMessages.ChecklistPropertiesEditionPart_NameLabel);
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
							ChecklistPropertiesEditionPartForm.this,
							ChecklistViewsRepository.Checklist_.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ChecklistPropertiesEditionPartForm.this,
									ChecklistViewsRepository.Checklist_.Properties.name,
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
									ChecklistPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartForm.this, ChecklistViewsRepository.Checklist_.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ChecklistViewsRepository.Checklist_.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Checklist_.Properties.name, ChecklistViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createVersionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ChecklistViewsRepository.Checklist_.Properties.version, ChecklistMessages.ChecklistPropertiesEditionPart_VersionLabel);
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
							ChecklistPropertiesEditionPartForm.this,
							ChecklistViewsRepository.Checklist_.Properties.version,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ChecklistPropertiesEditionPartForm.this,
									ChecklistViewsRepository.Checklist_.Properties.version,
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
									ChecklistPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartForm.this, ChecklistViewsRepository.Checklist_.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}
		});
		EditingUtils.setID(version, ChecklistViewsRepository.Checklist_.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Checklist_.Properties.version, ChecklistViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createVersionText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCategoriesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.categories = new ReferencesTable(getDescription(ChecklistViewsRepository.Checklist_.Properties.categories, ChecklistMessages.ChecklistPropertiesEditionPart_CategoriesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartForm.this, ChecklistViewsRepository.Checklist_.Properties.categories, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				categories.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartForm.this, ChecklistViewsRepository.Checklist_.Properties.categories, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				categories.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartForm.this, ChecklistViewsRepository.Checklist_.Properties.categories, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				categories.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartForm.this, ChecklistViewsRepository.Checklist_.Properties.categories, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				categories.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.categoriesFilters) {
			this.categories.addFilter(filter);
		}
		this.categories.setHelpText(propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Checklist_.Properties.categories, ChecklistViewsRepository.FORM_KIND));
		this.categories.createControls(parent, widgetFactory);
		this.categories.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartForm.this, ChecklistViewsRepository.Checklist_.Properties.categories, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData categoriesData = new GridData(GridData.FILL_HORIZONTAL);
		categoriesData.horizontalSpan = 3;
		this.categories.setLayoutData(categoriesData);
		this.categories.setLowerBound(1);
		this.categories.setUpperBound(-1);
		categories.setID(ChecklistViewsRepository.Checklist_.Properties.categories);
		categories.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createCategoriesTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createCommentText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ChecklistViewsRepository.Checklist_.Properties.comment, ChecklistMessages.ChecklistPropertiesEditionPart_CommentLabel);
		comment = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		comment.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ChecklistPropertiesEditionPartForm.this,
							ChecklistViewsRepository.Checklist_.Properties.comment,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ChecklistPropertiesEditionPartForm.this,
									ChecklistViewsRepository.Checklist_.Properties.comment,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, comment.getText()));
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
									ChecklistPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		comment.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartForm.this, ChecklistViewsRepository.Checklist_.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}
		});
		EditingUtils.setID(comment, ChecklistViewsRepository.Checklist_.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Checklist_.Properties.comment, ChecklistViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createCommentText

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
	 * @see net.certware.verification.checklist.parts.ChecklistPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ChecklistPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ChecklistViewsRepository.Checklist_.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(ChecklistMessages.Checklist_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ChecklistPropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ChecklistPropertiesEditionPart#setVersion(String newValue)
	 * 
	 */
	public void setVersion(String newValue) {
		if (newValue != null) {
			version.setText(newValue);
		} else {
			version.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ChecklistViewsRepository.Checklist_.Properties.version);
		if (eefElementEditorReadOnlyState && version.isEnabled()) {
			version.setEnabled(false);
			version.setToolTipText(ChecklistMessages.Checklist_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !version.isEnabled()) {
			version.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ChecklistPropertiesEditionPart#initCategories(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCategories(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		categories.setContentProvider(contentProvider);
		categories.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ChecklistViewsRepository.Checklist_.Properties.categories);
		if (eefElementEditorReadOnlyState && categories.isEnabled()) {
			categories.setEnabled(false);
			categories.setToolTipText(ChecklistMessages.Checklist_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !categories.isEnabled()) {
			categories.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ChecklistPropertiesEditionPart#updateCategories()
	 * 
	 */
	public void updateCategories() {
	categories.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ChecklistPropertiesEditionPart#addFilterCategories(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCategories(ViewerFilter filter) {
		categoriesFilters.add(filter);
		if (this.categories != null) {
			this.categories.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ChecklistPropertiesEditionPart#addBusinessFilterCategories(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCategories(ViewerFilter filter) {
		categoriesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ChecklistPropertiesEditionPart#isContainedInCategoriesTable(EObject element)
	 * 
	 */
	public boolean isContainedInCategoriesTable(EObject element) {
		return ((ReferencesTableSettings)categories.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ChecklistPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.ChecklistPropertiesEditionPart#setComment(String newValue)
	 * 
	 */
	public void setComment(String newValue) {
		if (newValue != null) {
			comment.setText(newValue);
		} else {
			comment.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ChecklistViewsRepository.Checklist_.Properties.comment);
		if (eefElementEditorReadOnlyState && comment.isEnabled()) {
			comment.setEnabled(false);
			comment.setToolTipText(ChecklistMessages.Checklist_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !comment.isEnabled()) {
			comment.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ChecklistMessages.Checklist_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
