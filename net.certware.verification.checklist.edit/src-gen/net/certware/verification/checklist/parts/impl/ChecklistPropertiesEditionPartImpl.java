/**
 * Generated with Acceleo
 */
package net.certware.verification.checklist.parts.impl;

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
 * 
 * 
 */
public class ChecklistPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ChecklistPropertiesEditionPart {

	protected Text name;
	protected Text version;
	protected ReferencesTable categories;
	protected List<ViewerFilter> categoriesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> categoriesFilters = new ArrayList<ViewerFilter>();
	protected Text comment;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ChecklistPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(parent);
				}
				if (key == ChecklistViewsRepository.Checklist_.Properties.name) {
					return createNameText(parent);
				}
				if (key == ChecklistViewsRepository.Checklist_.Properties.version) {
					return createVersionText(parent);
				}
				if (key == ChecklistViewsRepository.Checklist_.Properties.categories) {
					return createCategoriesAdvancedTableComposition(parent);
				}
				if (key == ChecklistViewsRepository.Checklist_.Properties.comment) {
					return createCommentText(parent);
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
		propertiesGroup.setText(ChecklistMessages.ChecklistPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, ChecklistViewsRepository.Checklist_.Properties.name, ChecklistMessages.ChecklistPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartImpl.this, ChecklistViewsRepository.Checklist_.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartImpl.this, ChecklistViewsRepository.Checklist_.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ChecklistViewsRepository.Checklist_.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Checklist_.Properties.name, ChecklistViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createVersionText(Composite parent) {
		createDescription(parent, ChecklistViewsRepository.Checklist_.Properties.version, ChecklistMessages.ChecklistPropertiesEditionPart_VersionLabel);
		version = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData versionData = new GridData(GridData.FILL_HORIZONTAL);
		version.setLayoutData(versionData);
		version.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartImpl.this, ChecklistViewsRepository.Checklist_.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
			}

		});
		version.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartImpl.this, ChecklistViewsRepository.Checklist_.Properties.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}

		});
		EditingUtils.setID(version, ChecklistViewsRepository.Checklist_.Properties.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Checklist_.Properties.version, ChecklistViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createVersionText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCategoriesAdvancedTableComposition(Composite parent) {
		this.categories = new ReferencesTable(getDescription(ChecklistViewsRepository.Checklist_.Properties.categories, ChecklistMessages.ChecklistPropertiesEditionPart_CategoriesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartImpl.this, ChecklistViewsRepository.Checklist_.Properties.categories, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				categories.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartImpl.this, ChecklistViewsRepository.Checklist_.Properties.categories, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				categories.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartImpl.this, ChecklistViewsRepository.Checklist_.Properties.categories, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				categories.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartImpl.this, ChecklistViewsRepository.Checklist_.Properties.categories, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				categories.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.categoriesFilters) {
			this.categories.addFilter(filter);
		}
		this.categories.setHelpText(propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Checklist_.Properties.categories, ChecklistViewsRepository.SWT_KIND));
		this.categories.createControls(parent);
		this.categories.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartImpl.this, ChecklistViewsRepository.Checklist_.Properties.categories, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
		// Start of user code for createCategoriesAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createCommentText(Composite parent) {
		createDescription(parent, ChecklistViewsRepository.Checklist_.Properties.comment, ChecklistMessages.ChecklistPropertiesEditionPart_CommentLabel);
		comment = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartImpl.this, ChecklistViewsRepository.Checklist_.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
			}

		});
		comment.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ChecklistPropertiesEditionPartImpl.this, ChecklistViewsRepository.Checklist_.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}

		});
		EditingUtils.setID(comment, ChecklistViewsRepository.Checklist_.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ChecklistViewsRepository.Checklist_.Properties.comment, ChecklistViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
