/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.MemoPropertiesEditionPart;
import net.certware.argument.aml.providers.AmlMessages;

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
public class MemoPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MemoPropertiesEditionPart {

protected ReferencesTable creator;
protected List<ViewerFilter> creatorBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> creatorFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable reader;
protected List<ViewerFilter> readerBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> readerFilters = new ArrayList<ViewerFilter>();
	protected Text subject;
	protected Text body;
	protected Text id;
	protected Text type;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MemoPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence memoStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = memoStep.addStep(AmlViewsRepository.Memo.Properties.class);
		propertiesStep.addStep(AmlViewsRepository.Memo.Properties.creator);
		propertiesStep.addStep(AmlViewsRepository.Memo.Properties.reader);
		propertiesStep.addStep(AmlViewsRepository.Memo.Properties.subject);
		propertiesStep.addStep(AmlViewsRepository.Memo.Properties.body);
		propertiesStep.addStep(AmlViewsRepository.Memo.Properties.id);
		propertiesStep.addStep(AmlViewsRepository.Memo.Properties.type);
		
		
		composer = new PartComposer(memoStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AmlViewsRepository.Memo.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == AmlViewsRepository.Memo.Properties.creator) {
					return createCreatorAdvancedTableComposition(parent);
				}
				if (key == AmlViewsRepository.Memo.Properties.reader) {
					return createReaderAdvancedTableComposition(parent);
				}
				if (key == AmlViewsRepository.Memo.Properties.subject) {
					return createSubjectText(parent);
				}
				if (key == AmlViewsRepository.Memo.Properties.body) {
					return createBodyText(parent);
				}
				if (key == AmlViewsRepository.Memo.Properties.id) {
					return createIdText(parent);
				}
				if (key == AmlViewsRepository.Memo.Properties.type) {
					return createTypeText(parent);
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
		propertiesGroup.setText(AmlMessages.MemoPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createCreatorAdvancedTableComposition(Composite parent) {
		this.creator = new ReferencesTable(AmlMessages.MemoPropertiesEditionPart_CreatorLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.creator, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				creator.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.creator, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				creator.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.creator, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				creator.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.creator, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				creator.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.creatorFilters) {
			this.creator.addFilter(filter);
		}
		this.creator.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.Memo.Properties.creator, AmlViewsRepository.SWT_KIND));
		this.creator.createControls(parent);
		this.creator.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.creator, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData creatorData = new GridData(GridData.FILL_HORIZONTAL);
		creatorData.horizontalSpan = 3;
		this.creator.setLayoutData(creatorData);
		this.creator.setLowerBound(1);
		this.creator.setUpperBound(-1);
		creator.setID(AmlViewsRepository.Memo.Properties.creator);
		creator.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createReaderAdvancedTableComposition(Composite parent) {
		this.reader = new ReferencesTable(AmlMessages.MemoPropertiesEditionPart_ReaderLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.reader, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				reader.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.reader, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				reader.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.reader, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				reader.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.reader, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				reader.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.readerFilters) {
			this.reader.addFilter(filter);
		}
		this.reader.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.Memo.Properties.reader, AmlViewsRepository.SWT_KIND));
		this.reader.createControls(parent);
		this.reader.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.reader, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData readerData = new GridData(GridData.FILL_HORIZONTAL);
		readerData.horizontalSpan = 3;
		this.reader.setLayoutData(readerData);
		this.reader.setLowerBound(0);
		this.reader.setUpperBound(-1);
		reader.setID(AmlViewsRepository.Memo.Properties.reader);
		reader.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSubjectText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.MemoPropertiesEditionPart_SubjectLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Memo.Properties.subject, AmlViewsRepository.SWT_KIND));
		subject = new Text(parent, SWT.BORDER);
		GridData subjectData = new GridData(GridData.FILL_HORIZONTAL);
		subject.setLayoutData(subjectData);
		subject.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.subject, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, subject.getText()));
			}

		});
		subject.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.subject, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, subject.getText()));
				}
			}

		});
		EditingUtils.setID(subject, AmlViewsRepository.Memo.Properties.subject);
		EditingUtils.setEEFtype(subject, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Memo.Properties.subject, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBodyText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.MemoPropertiesEditionPart_BodyLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Memo.Properties.body, AmlViewsRepository.SWT_KIND));
		body = new Text(parent, SWT.BORDER);
		GridData bodyData = new GridData(GridData.FILL_HORIZONTAL);
		body.setLayoutData(bodyData);
		body.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.body, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, body.getText()));
			}

		});
		body.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.body, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, body.getText()));
				}
			}

		});
		EditingUtils.setID(body, AmlViewsRepository.Memo.Properties.body);
		EditingUtils.setEEFtype(body, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Memo.Properties.body, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIdText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.MemoPropertiesEditionPart_IdLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Memo.Properties.id, AmlViewsRepository.SWT_KIND));
		id = new Text(parent, SWT.BORDER);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, AmlViewsRepository.Memo.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Memo.Properties.id, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.MemoPropertiesEditionPart_TypeLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Memo.Properties.type, AmlViewsRepository.SWT_KIND));
		type = new Text(parent, SWT.BORDER);
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
			}

		});
		type.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}

		});
		EditingUtils.setID(type, AmlViewsRepository.Memo.Properties.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Memo.Properties.type, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#initCreator(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCreator(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		creator.setContentProvider(contentProvider);
		creator.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#updateCreator()
	 * 
	 */
	public void updateCreator() {
	creator.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#addFilterCreator(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCreator(ViewerFilter filter) {
		creatorFilters.add(filter);
		if (this.creator != null) {
			this.creator.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#addBusinessFilterCreator(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCreator(ViewerFilter filter) {
		creatorBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#isContainedInCreatorTable(EObject element)
	 * 
	 */
	public boolean isContainedInCreatorTable(EObject element) {
		return ((ReferencesTableSettings)creator.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#initReader(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initReader(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		reader.setContentProvider(contentProvider);
		reader.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#updateReader()
	 * 
	 */
	public void updateReader() {
	reader.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#addFilterReader(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReader(ViewerFilter filter) {
		readerFilters.add(filter);
		if (this.reader != null) {
			this.reader.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#addBusinessFilterReader(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReader(ViewerFilter filter) {
		readerBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#isContainedInReaderTable(EObject element)
	 * 
	 */
	public boolean isContainedInReaderTable(EObject element) {
		return ((ReferencesTableSettings)reader.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getSubject()
	 * 
	 */
	public String getSubject() {
		return subject.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#setSubject(String newValue)
	 * 
	 */
	public void setSubject(String newValue) {
		if (newValue != null) {
			subject.setText(newValue);
		} else {
			subject.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getBody()
	 * 
	 */
	public String getBody() {
		return body.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#setBody(String newValue)
	 * 
	 */
	public void setBody(String newValue) {
		if (newValue != null) {
			body.setText(newValue);
		} else {
			body.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getType()
	 * 
	 */
	public String getType() {
		return type.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#setType(String newValue)
	 * 
	 */
	public void setType(String newValue) {
		if (newValue != null) {
			type.setText(newValue);
		} else {
			type.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.Memo_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
