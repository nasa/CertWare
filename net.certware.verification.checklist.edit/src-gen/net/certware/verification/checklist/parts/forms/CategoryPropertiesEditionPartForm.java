/**
 * Generated with Acceleo
 */
package net.certware.verification.checklist.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.verification.checklist.parts.CategoryPropertiesEditionPart;
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
public class CategoryPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, CategoryPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable items;
	protected List<ViewerFilter> itemsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> itemsFilters = new ArrayList<ViewerFilter>();
	protected Text comment;



	/**
	 * For {@link ISection} use only.
	 */
	public CategoryPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CategoryPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence categoryStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = categoryStep.addStep(ChecklistViewsRepository.Category.Properties.class);
		propertiesStep.addStep(ChecklistViewsRepository.Category.Properties.name);
		propertiesStep.addStep(ChecklistViewsRepository.Category.Properties.items);
		propertiesStep.addStep(ChecklistViewsRepository.Category.Properties.comment);
		
		
		composer = new PartComposer(categoryStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ChecklistViewsRepository.Category.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ChecklistViewsRepository.Category.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == ChecklistViewsRepository.Category.Properties.items) {
					return createItemsTableComposition(widgetFactory, parent);
				}
				if (key == ChecklistViewsRepository.Category.Properties.comment) {
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
		propertiesSection.setText(ChecklistMessages.CategoryPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, ChecklistViewsRepository.Category.Properties.name, ChecklistMessages.CategoryPropertiesEditionPart_NameLabel);
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
							CategoryPropertiesEditionPartForm.this,
							ChecklistViewsRepository.Category.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CategoryPropertiesEditionPartForm.this,
									ChecklistViewsRepository.Category.Properties.name,
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
									CategoryPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CategoryPropertiesEditionPartForm.this, ChecklistViewsRepository.Category.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ChecklistViewsRepository.Category.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Category.Properties.name, ChecklistViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createItemsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.items = new ReferencesTable(getDescription(ChecklistViewsRepository.Category.Properties.items, ChecklistMessages.CategoryPropertiesEditionPart_ItemsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CategoryPropertiesEditionPartForm.this, ChecklistViewsRepository.Category.Properties.items, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				items.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CategoryPropertiesEditionPartForm.this, ChecklistViewsRepository.Category.Properties.items, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				items.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CategoryPropertiesEditionPartForm.this, ChecklistViewsRepository.Category.Properties.items, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				items.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CategoryPropertiesEditionPartForm.this, ChecklistViewsRepository.Category.Properties.items, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				items.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.itemsFilters) {
			this.items.addFilter(filter);
		}
		this.items.setHelpText(propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Category.Properties.items, ChecklistViewsRepository.FORM_KIND));
		this.items.createControls(parent, widgetFactory);
		this.items.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CategoryPropertiesEditionPartForm.this, ChecklistViewsRepository.Category.Properties.items, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData itemsData = new GridData(GridData.FILL_HORIZONTAL);
		itemsData.horizontalSpan = 3;
		this.items.setLayoutData(itemsData);
		this.items.setLowerBound(1);
		this.items.setUpperBound(-1);
		items.setID(ChecklistViewsRepository.Category.Properties.items);
		items.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createItemsTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createCommentText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ChecklistViewsRepository.Category.Properties.comment, ChecklistMessages.CategoryPropertiesEditionPart_CommentLabel);
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
							CategoryPropertiesEditionPartForm.this,
							ChecklistViewsRepository.Category.Properties.comment,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CategoryPropertiesEditionPartForm.this,
									ChecklistViewsRepository.Category.Properties.comment,
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
									CategoryPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CategoryPropertiesEditionPartForm.this, ChecklistViewsRepository.Category.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}
		});
		EditingUtils.setID(comment, ChecklistViewsRepository.Category.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Category.Properties.comment, ChecklistViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.verification.checklist.parts.CategoryPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.CategoryPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ChecklistViewsRepository.Category.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(ChecklistMessages.Category_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.CategoryPropertiesEditionPart#initItems(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initItems(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		items.setContentProvider(contentProvider);
		items.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ChecklistViewsRepository.Category.Properties.items);
		if (eefElementEditorReadOnlyState && items.isEnabled()) {
			items.setEnabled(false);
			items.setToolTipText(ChecklistMessages.Category_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !items.isEnabled()) {
			items.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.CategoryPropertiesEditionPart#updateItems()
	 * 
	 */
	public void updateItems() {
	items.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.CategoryPropertiesEditionPart#addFilterItems(ViewerFilter filter)
	 * 
	 */
	public void addFilterToItems(ViewerFilter filter) {
		itemsFilters.add(filter);
		if (this.items != null) {
			this.items.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.CategoryPropertiesEditionPart#addBusinessFilterItems(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToItems(ViewerFilter filter) {
		itemsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.CategoryPropertiesEditionPart#isContainedInItemsTable(EObject element)
	 * 
	 */
	public boolean isContainedInItemsTable(EObject element) {
		return ((ReferencesTableSettings)items.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.CategoryPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.verification.checklist.parts.CategoryPropertiesEditionPart#setComment(String newValue)
	 * 
	 */
	public void setComment(String newValue) {
		if (newValue != null) {
			comment.setText(newValue);
		} else {
			comment.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ChecklistViewsRepository.Category.Properties.comment);
		if (eefElementEditorReadOnlyState && comment.isEnabled()) {
			comment.setEnabled(false);
			comment.setToolTipText(ChecklistMessages.Category_ReadOnly);
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
		return ChecklistMessages.Category_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
