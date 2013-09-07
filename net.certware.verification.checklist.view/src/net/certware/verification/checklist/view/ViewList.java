package net.certware.verification.checklist.view;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.handlers.LinkEditor;
import net.certware.core.ui.help.IHelpContext;
import net.certware.core.ui.listeners.ActiveEditorListener;
import net.certware.core.ui.log.CertWareLog;
import net.certware.core.ui.resources.FileFinder;
import net.certware.core.ui.resources.FileOpener;
import net.certware.core.ui.views.ICertWareView;
import net.certware.verification.checklist.Checklist;
import net.certware.verification.checklist.Choices;
import net.certware.verification.checklist.view.filters.ResultFilter;
import net.certware.verification.checklist.view.help.ContextProvider;
import net.certware.verification.checklist.view.preferences.PreferenceConstants;
import net.certware.verification.checklist.view.table.ChecklistModel;
import net.certware.verification.checklist.view.table.ChecklistModelList;
import net.certware.verification.checklist.view.table.ChecklistSorter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.help.IContextProvider;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ICellEditorListener;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.ISaveablePart2;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.HyperlinkSettings;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.help.IWorkbenchHelpSystem;
import org.eclipse.ui.part.ViewPart;

/**
 * Provides a list view of a checklist model, including combo box editor for updating the result field.
 * @author mrb
 * @since 1.2.1
 */
public class ViewList extends ViewPart implements ICertWareConstants, ICertWareView, ISelectionListener, ISaveablePart2, IResourceChangeListener, IAdaptable, IHelpContext {

	/** the forms toolkit, borrowed from plugin's shared instance */
	private FormToolkit toolkit;
	/** the top-level scrolled form installed as the view control */
	private ScrolledForm form;
	/** memento for view part */
	protected IMemento memento = null;
	/** whether the view and editor are linked */
	public boolean isLinkingEditor = false;
	/** selected checklist model */
	private Checklist selectedChecklist = null;
	/** selected file */
	private IFile selectedFile = null;
	/** latest editor selection */
	private ISelection latestSelection = null;
	/** our listener for editor changes */
	private IPartListener2 activeEditorListener = null;
	/** context provider for help system adapter */
	static ContextProvider contextprovider = null;
	/** table viewer */
	private TableViewer tableViewer = null;
	/** context heading form section */
	private Section context;
	/** table items form section */
	private Section items;
	/** checklist name link */
	private Hyperlink checklistText;
	/** yes item filter */
	private MenuItem itemYesFilterMenuItem;
	/** no item filter */
	private MenuItem itemNoFilterMenuItem;
	/** unknown item filter */
	private MenuItem itemUnknownFilterMenuItem;
	/** N/A item filter */
	private MenuItem itemNaFilterMenuItem;
	/** version label */
	private Label checklistVersion;
	/** whether the model is dirty */
	protected boolean dirty = false;
	/** checklist name prefix */
	private static final String CHECKLIST_LABEL = "Checklist: ";
	/** checklist version prefix */
	private static final String CHECKLIST_VERSION = "Version: ";
	/** checklist name tool tip */
	private static final String CHECKLIST_TOOL_TIP = "Checklist model name";
	/** memento for column width */
	private static final String MEMENTO_COLUMN_CATEGORY = "memento.category"; //$NON-NLS-1$
	/** memento for column width */
	private static final String MEMENTO_COLUMN_ID = "memento.id"; //$NON-NLS-1$
	/** memento for column width */
	private static final String MEMENTO_COLUMN_DESCRIPTION = "memento.description"; //$NON-NLS-1$
	/** memento for column width */
	private static final String MEMENTO_COLUMN_REFERENCE = "memento.reference"; //$NON-NLS-1$
	/** memento for column width */
	private static final String MEMENTO_COLUMN_COMMENT = "memento.comment"; //$NON-NLS-1$
	/** memento for column width */
	private static final String MEMENTO_COLUMN_CHOICES = "memento.choices"; //$NON-NLS-1$
	/** memento for section expanded */
	private static final String MEMENTO_SECTION_CONTEXT = "memento.context"; //$NON-NLS-1$
	/** memento for section expanded */
	private static final String MEMENTO_SECTION_ITEMS = "memento.items"; //$NON-NLS-1$
	/** memento for file selection */
	private static final String MEMENTO_FILE = "memento.file"; //$NON-NLS-1$
	/** memento for filter state */
	private static final String MEMENTO_FILTER_YES = "memento.filter.yes"; //$NON-NLS-1$
	/** memento for filter state */
	private static final String MEMENTO_FILTER_NO = "memento.filter.no"; //$NON-NLS-1$
	/** memento for filter state */
	private static final String MEMENTO_FILTER_UNKNOWN = "memento.filter.unknown"; //$NON-NLS-1$
	/** memento for filter state */
	private static final String MEMENTO_FILTER_NA = "memento.filter.na"; //$NON-NLS-1$

	/**
	 * Initializes the part.
	 * Captures the selected file memento.
	 * @param site IViewSite
	 * @param memento IMemento
	 * @throws PartInitException 
	 * @see org.eclipse.ui.IViewPart#init(IViewSite, IMemento)
	 */
	@Override
	public void init(final IViewSite site, IMemento memento)
	throws PartInitException
	{
		super.init(site, memento);
		this.memento = memento; // can be null
	}

	/**
	 * Saves the view state.  
	 * The selected file and messages file are saved as a memento by file name.
	 * @param memento memento to save
	 * @see org.eclipse.ui.IViewPart#saveState(IMemento) 
	 */
	@Override
	public void saveState(IMemento memento)
	{
		super.saveState(memento);
		memento.putString(MEMENTO_FILE, selectedFile == null ? null : selectedFile.getName());
		memento.putBoolean(MEMENTO_SECTION_CONTEXT, context.isExpanded() );
		memento.putBoolean(MEMENTO_SECTION_ITEMS, items.isExpanded() );

		memento.putBoolean(MEMENTO_FILTER_YES, itemYesFilterMenuItem.getSelection());
		memento.putBoolean(MEMENTO_FILTER_NO, itemNoFilterMenuItem.getSelection());
		memento.putBoolean(MEMENTO_FILTER_UNKNOWN, itemUnknownFilterMenuItem.getSelection());
		memento.putBoolean(MEMENTO_FILTER_NA, itemNaFilterMenuItem.getSelection());

		TableColumn[] tcs = tableViewer.getTable().getColumns();
		memento.putInteger( MEMENTO_COLUMN_CATEGORY, tcs[0].getWidth());
		memento.putInteger( MEMENTO_COLUMN_ID, tcs[1].getWidth());
		memento.putInteger( MEMENTO_COLUMN_DESCRIPTION, tcs[2].getWidth());
		memento.putInteger( MEMENTO_COLUMN_REFERENCE, tcs[3].getWidth());
		memento.putInteger( MEMENTO_COLUMN_COMMENT, tcs[4].getWidth());
		memento.putInteger( MEMENTO_COLUMN_CHOICES, tcs[5].getWidth());
	}

	/**
	 * Set the context IDs for help system.  
	 * Wait to call until site has been established.
	 * @param control Control
	 */
	private void setHelpContextIDs(Control control) {
		IWorkbenchHelpSystem helpSystem = getSite().getWorkbenchWindow().getWorkbench().getHelpSystem();
		helpSystem.setHelp(control, IHelpContext.VCL_VIEW);
		// additional, as above...
	}

	/**
	 * Selection listener to sort columns.
	 * @param table table
	 * @param tvc table column
	 * @param sorter sorter to apply
	 */
	private void addSelectionSorter(final Table table, final TableViewerColumn tvc, final ChecklistSorter sorter) {
		tvc.getColumn().addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				sorter.setColumn(tvc.getColumn().getText());
				tableViewer.refresh(true,true);
				TableColumn c = (TableColumn)e.getSource();
				setColumnImages(sorter,table,c);
				tableViewer.getControl().redraw();
				form.layout(true);
			}
		});
	}
	
	/**
	 * Set the column header images according to sort direction.
	 * @param tv table viewer for sorter access
	 * @param t table for column access
	 * @param sc selected column to assign image
	 */
	private void setColumnImages(ChecklistSorter sorter, Table t, TableColumn sc) {
		// clear all current images
		for ( int c = 0; c < t.getColumnCount(); c++ ) {
			TableColumn tc = t.getColumn(c);
			tc.setImage(null);
		}

		// set the selected column's image according to sort direction
		if ( sorter.getDirection() == SWT.UP )
			sc.setImage(Activator.getDefault().getImageRegistry().get(Activator.ASCENDING_IMAGE));
		else
			sc.setImage(Activator.getDefault().getImageRegistry().get(Activator.DESCENDING_IMAGE));
	}

	/**
	 * Creates and handles a column header menu to change column visibility.
	 * Item is enabled if column is resizable.
	 * Item is initially selected if its width is greater than zero.
	 * @param parent header menu
	 * @param column column for menu choice
	 */
	private void createMenuItem(Menu parent, final TableColumn column) {
		final MenuItem itemName = new MenuItem(parent, SWT.CHECK);
		itemName.setText(column.getText());
		itemName.setEnabled( column.getResizable() );
		itemName.setSelection( column.getWidth() > 0 );
		itemName.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				if (itemName.getSelection()) {
					column.setWidth(100);
					column.setResizable(true);
				} else {
					column.setWidth(0);
					column.setResizable(false);
				}
			}
		});
	}


	/**
	 * Create the view content using the forms widgets.
	 */
	@Override
	public void createPartControl(Composite parent) {
		TableWrapData twd;

		toolkit = Activator.getDefault().getFormToolkit(parent.getDisplay());
		toolkit.getHyperlinkGroup().setHyperlinkUnderlineMode(HyperlinkSettings.UNDERLINE_HOVER);
		form = toolkit.createScrolledForm(parent);
		form.setText("Verification Checklist");
		form.setMessage(null,IMessageProvider.NONE);
		form.setToolTipText("Select a checklist model");
		toolkit.decorateFormHeading(form.getForm());
		form.setImage(Activator.getDefault().getImageRegistry().getDescriptor(Activator.CHECKLIST_IMAGE).createImage());

		// layout
		TableWrapLayout layout = new TableWrapLayout();
		layout.numColumns = 2;
		form.getBody().setLayout(layout);

		// context section
		context = toolkit.createSection(form.getBody(),	Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		twd = new TableWrapData(TableWrapData.FILL);
		twd.colspan = 2;
		context.setLayoutData(twd);
		context.setText("Checklist Context");
		context.setToolTipText("Checklist identification content");
		context.addExpansionListener(new ExpansionAdapter() {
			@Override
			public void expansionStateChanged(ExpansionEvent e) {
				form.layout(true);
				form.reflow(true);
			}
		});

		Composite contextClient = toolkit.createComposite(context);
		contextClient.setLayout(new GridLayout());
		
		// checklist name
		checklistText = toolkit.createHyperlink(contextClient, CHECKLIST_LABEL, SWT.WRAP);
		checklistText.setEnabled(false);
		checklistText.setToolTipText(CHECKLIST_TOOL_TIP);
		checklistText.setFont(JFaceResources.getDialogFont());
		checklistText.addHyperlinkListener(new HyperlinkAdapter() {
			@Override
			public void linkActivated(HyperlinkEvent e) {
				FileOpener.findResourceEditor((IFile)e.getHref()); // Href contains the IFile from selection
			}
		});

		// checklist version
		checklistVersion = toolkit.createLabel(contextClient, CHECKLIST_VERSION, SWT.WRAP);
		checklistVersion.setEnabled(true);
		checklistVersion.setToolTipText("Version identified in model");
		checklistVersion.setFont(JFaceResources.getDialogFont());
		
		context.setClient(contextClient);

		// results table section
		items = toolkit.createSection(form.getBody(), Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		twd = new TableWrapData(TableWrapData.FILL_GRAB);
		twd.colspan = 2;
		twd.maxHeight = 500; 
		items.setLayoutData(twd);
		items.addExpansionListener(new ExpansionAdapter() {
			@Override
			public void expansionStateChanged(ExpansionEvent e) {
				form.layout(true);
				form.reflow(true);
			}
		});
		items.setText("Checklist Items");
		items.setToolTipText("Current values of checklist items");
		Composite resultsClient2 = toolkit.createComposite(items);
		resultsClient2.setLayout(new FillLayout());

		// create the table
		int tableStyle = SWT.SINGLE | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.HIDE_SELECTION | SWT.FULL_SELECTION;
		final Table table = new Table(resultsClient2,tableStyle);
		GridData gridData = new GridData(GridData.FILL_BOTH);
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalSpan = 3;
		final Menu headerMenu = new Menu(table);

		TableLayout tableLayout = new TableLayout();
		tableLayout.addColumnData(new ColumnWeightData(2)); // category
		tableLayout.addColumnData(new ColumnWeightData(1)); // id
		tableLayout.addColumnData(new ColumnWeightData(3)); // description
		tableLayout.addColumnData(new ColumnWeightData(2)); // reference
		tableLayout.addColumnData(new ColumnWeightData(2)); // comment
		tableLayout.addColumnData(new ColumnWeightData(1)); // result
		table.setLayout(tableLayout);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		
		tableViewer = new TableViewer(table);
		// tableViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		TableViewerColumn categoryColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableViewerColumn idColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableViewerColumn descriptionColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableViewerColumn referenceColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableViewerColumn commentColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableViewerColumn resultColumn = new TableViewerColumn(tableViewer, SWT.NONE);

		setColumnProperties(categoryColumn,"Category",headerMenu,true,true);
		setColumnProperties(idColumn,"ID",headerMenu,true,true);
		setColumnProperties(descriptionColumn,"Description",headerMenu,true,true);
		setColumnProperties(referenceColumn,"Reference",headerMenu,true,true);
		setColumnProperties(commentColumn,"Comment",headerMenu,true,true);
		setColumnProperties(resultColumn,"Result",headerMenu,true,true);
		
		// menu for column widths
		table.addListener(SWT.MenuDetect, new Listener() {
			public void handleEvent(Event event) {
				table.setMenu(headerMenu);
			}
		});

		// table sorting on columns
		ChecklistSorter sorter = new ChecklistSorter(tableViewer);
		tableViewer.setSorter(sorter);
		addSelectionSorter(table, categoryColumn, sorter);
		addSelectionSorter(table, idColumn, sorter);
		addSelectionSorter(table, descriptionColumn, sorter);
		addSelectionSorter(table, referenceColumn, sorter);
		addSelectionSorter(table, commentColumn, sorter);
		addSelectionSorter(table, resultColumn, sorter);
		setColumnImages(sorter, table, categoryColumn.getColumn());
		
		// recover widths if available
		if ( memento != null && memento.getAttributeKeys().length < ChecklistModel.COLUMN_COUNT) {
			setColumnWidth(categoryColumn,memento.getInteger(MEMENTO_COLUMN_CATEGORY));
			setColumnWidth(idColumn,memento.getInteger(MEMENTO_COLUMN_ID));
			setColumnWidth(descriptionColumn,memento.getInteger(MEMENTO_COLUMN_DESCRIPTION));
			setColumnWidth(referenceColumn,memento.getInteger(MEMENTO_COLUMN_REFERENCE));
			setColumnWidth(commentColumn,memento.getInteger(MEMENTO_COLUMN_COMMENT));
			setColumnWidth(resultColumn,memento.getInteger(MEMENTO_COLUMN_CHOICES));
		}
		
		// id column
		/*
		TableViewerColumn choicesColumn;
		int columnNumber = 0;
		Image ascending = Activator.getDefault().getImageRegistry().get(Activator.ASCENDING_IMAGE);
		if ( memento == null || memento.getAttributeKeys().length < 6) {
			addColumn(columnNumber++,table,headerMenu,100,SWT.LEFT,ChecklistTableViewer.COLUMN_CATEGORY,ascending);
			addColumn(columnNumber++,table,headerMenu, 50,SWT.LEFT,ChecklistTableViewer.COLUMN_ID,null);
			addColumn(columnNumber++,table,headerMenu,150,SWT.LEFT,ChecklistTableViewer.COLUMN_DESCRIPTION,null);
			addColumn(columnNumber++,table,headerMenu,  0,SWT.LEFT,ChecklistTableViewer.COLUMN_REFERENCE,null);
			choicesColumn = addColumn(columnNumber++,table,headerMenu,  0,SWT.LEFT,ChecklistTableViewer.COLUMN_COMMENT,null);
			// choicesColumn = addColumn(columnNumber++,table,headerMenu, 50,SWT.LEFT,ChecklistTableViewer.COLUMN_CHOICES,null);
		} else {
			addColumn(columnNumber++,table,headerMenu,memento.getInteger(MEMENTO_COLUMN_CATEGORY),SWT.LEFT,ChecklistTableViewer.COLUMN_CATEGORY,ascending);
			addColumn(columnNumber++,table,headerMenu,memento.getInteger(MEMENTO_COLUMN_ID),SWT.LEFT,ChecklistTableViewer.COLUMN_ID,null);
			addColumn(columnNumber++,table,headerMenu,memento.getInteger(MEMENTO_COLUMN_DESCRIPTION),SWT.LEFT,ChecklistTableViewer.COLUMN_DESCRIPTION,null);
			addColumn(columnNumber++,table,headerMenu,memento.getInteger(MEMENTO_COLUMN_REFERENCE),SWT.LEFT,ChecklistTableViewer.COLUMN_REFERENCE,null);
			choicesColumn = addColumn(columnNumber++,table,headerMenu,memento.getInteger(MEMENTO_COLUMN_COMMENT),SWT.LEFT,ChecklistTableViewer.COLUMN_COMMENT,null);
			//choicesColumn = addColumn(columnNumber++,table,headerMenu,memento.getInteger(MEMENTO_COLUMN_CHOICES),SWT.LEFT,ChecklistTableViewer.COLUMN_CHOICES,null);
		}
		*/
		
		// add combo box editor for the choices column
		EditingSupport choicesEditingSupport = new ResultEditingSupport(tableViewer);
		resultColumn.setEditingSupport(choicesEditingSupport);

		// table content provider
		tableViewer.setContentProvider(new ArrayContentProvider());
		if ( selectedChecklist != null ) {
			ChecklistModelList list = new ChecklistModelList();
			list.initialize(selectedChecklist);
			tableViewer.setInput(list.getItems());
		}
		
		// table label provider
		tableViewer.setLabelProvider(new ITableLabelProvider() {
			@Override
			public void addListener(ILabelProviderListener listener) {
			}

			@Override
			public void dispose() {
			}

			@Override
			public boolean isLabelProperty(Object element, String property) {
				return false;
			}

			@Override
			public void removeListener(ILabelProviderListener listener) {
			}

			@Override
			public Image getColumnImage(Object element, int columnIndex) {
				return null;
			}

			@Override
			public String getColumnText(Object element, int columnIndex) {
				ChecklistModel cm = (ChecklistModel)element;
				switch( columnIndex ) {
				case 0: return cm.getCategory();
				case 1: return cm.getId();
				case 2: return cm.getDescription();
				case 3: return cm.getReference();
				case 4: return cm.getComment();
				case 5: return cm.getResult().toString();
				default:
					System.err.println("Label provider unknown index " + columnIndex);
				}
				return ""; //$NON-NLS-1$
			}
		});
		
		// add filters to the header menu 
		createMenuSeparator(headerMenu);
		ViewerFilter yesFilter = new ResultFilter(Choices.YES_VALUE);
		ViewerFilter noFilter = new ResultFilter(Choices.NO_VALUE);
		ViewerFilter unknownFilter = new ResultFilter(Choices.UNKNOWN_VALUE);
		ViewerFilter naFilter = new ResultFilter(Choices.NOT_APPLICABLE_VALUE);
		itemYesFilterMenuItem = createMenuFilterItem(headerMenu,"Hide Yes",yesFilter,false);
		itemNoFilterMenuItem = createMenuFilterItem(headerMenu,"Hide No",noFilter,false);
		itemUnknownFilterMenuItem = createMenuFilterItem(headerMenu,"Hide Unknown",unknownFilter,false);
		itemNaFilterMenuItem = createMenuFilterItem(headerMenu,"Hide N/A",naFilter,false);

		items.setClient(resultsClient2);

		// create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(form, IHelpContext.VCL_VIEW); 

		// add the selection listener
		// add the resource listener
		// add editor listener
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, 
				IResourceChangeEvent.POST_CHANGE | IResourceChangeEvent.PRE_CLOSE | IResourceChangeEvent.PRE_DELETE );

		activeEditorListener = new ActiveEditorListener(this);
		getSite().getPage().addPartListener(activeEditorListener);

		// sync with toggle commands
		setLinkingEditor( LinkEditor.getState() );

		// update with memento if available
		if ( memento != null ) {

			// file name
			String fileName = memento.getString(MEMENTO_FILE);
			if ( fileName != null ) { // && getLinkingEditor() == false ) {
				selectedFile = FileFinder.findResourceByName(fileName);
				setSelectedFile(selectedFile);
				getViewSite().getActionBars().getToolBarManager().markDirty();
			}

			// sections expanded
			context.setExpanded( memento.getBoolean(MEMENTO_SECTION_CONTEXT) );
			items.setExpanded( memento.getBoolean(MEMENTO_SECTION_ITEMS) );

			// filter states
			// set the menu item toggle and add the filter
			if (  memento.getBoolean(MEMENTO_FILTER_YES) ) {
				itemYesFilterMenuItem.setSelection( true );
				tableViewer.addFilter(yesFilter);
			}
			if (  memento.getBoolean(MEMENTO_FILTER_NO) ) {
				itemNoFilterMenuItem.setSelection( true );
				tableViewer.addFilter(noFilter);
			}
			if (  memento.getBoolean(MEMENTO_FILTER_UNKNOWN) ) {
				itemUnknownFilterMenuItem.setSelection( true );
				tableViewer.addFilter(unknownFilter);
			}
			if (  memento.getBoolean(MEMENTO_FILTER_NA) ) {
				itemNaFilterMenuItem.setSelection( true );
				tableViewer.addFilter(naFilter);
			}

			// column widths
			int column = 0;
			tableViewer.getTable().getColumn(column++).setWidth( memento.getInteger( MEMENTO_COLUMN_CATEGORY ));
			tableViewer.getTable().getColumn(column++).setWidth( memento.getInteger( MEMENTO_COLUMN_ID));
			tableViewer.getTable().getColumn(column++).setWidth( memento.getInteger( MEMENTO_COLUMN_DESCRIPTION ));
			tableViewer.getTable().getColumn(column++).setWidth( memento.getInteger( MEMENTO_COLUMN_REFERENCE ));
			tableViewer.getTable().getColumn(column++).setWidth( memento.getInteger( MEMENTO_COLUMN_COMMENT ));
			tableViewer.getTable().getColumn(column++).setWidth( memento.getInteger( MEMENTO_COLUMN_CHOICES ));
		}

		setHelpContextIDs(parent);

		form.layout();
	}

	private void setColumnProperties(TableViewerColumn tvc, String title, Menu menu, boolean moveable, boolean resizeable) {
		TableColumn tc = tvc.getColumn();
		tc.setText(title);
		tc.setMoveable(moveable);
		tc.setResizable(resizeable);
		createMenuItem(menu,tc);
	}

	/**
	 * Sets a column width.
	 * @param tvc table column
	 * @param width new width
	 */
	private void setColumnWidth(TableViewerColumn tvc, Integer width) {
		if ( width != null && tvc != null ) {
			tvc.getColumn().setWidth( width.intValue() );
		}
	}

	/**
	 * Creates a menu item separator for the column header.
	 * @param parent column header menu
	 */
	private void createMenuSeparator(Menu parent) {
		new MenuItem(parent, SWT.SEPARATOR );
	}

	/**
	 * Creates a menu item for adding or removing a filter from the column header menu.
	 * Item is enabled and its selection depends on argument.
	 * @param parent column header menu
	 * @param label filter name label
	 * @param filter viewer filter for addition or removal
	 * @param selection current selection value  
	 * @return filter menu item  
	 */
	private MenuItem createMenuFilterItem(Menu parent, String label, final ViewerFilter filter, boolean selection) {
		final MenuItem itemName = new MenuItem(parent, SWT.CHECK);
		itemName.setText(label);
		itemName.setEnabled( true );
		itemName.setSelection( selection );
		itemName.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				if (itemName.getSelection()) {
					tableViewer.addFilter(filter);
				} else {
					tableViewer.removeFilter(filter);
				}
			}
		});

		return itemName;
	}


	/**
	 * Return the selected file.
	 * @return selected file, or null
	 */
	public IFile getSelectedFile() {
		return selectedFile;
	}

	/**
	 * Sets the selected file.
	 * @param f selected file
	 * @return 
	 */
	public boolean setSelectedFile(IFile ifile) {
		if ( ifile == null )
			return false;

		// if the file is the right type, open it and update the view
		String extension = ifile.getFileExtension();
		if (extension != null && ICertWareConstants.VCL_EXTENSION.equals(extension)) {
			try {
				// load the XML file through the EMF resource set implementation
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource resource = resourceSet.getResource( URI.createPlatformResourceURI(ifile.getFullPath().toString(), true), true);
				Checklist root = (Checklist)resource.getContents().get(0);
				if ( root != null ) {
					selectedFile = ifile;
					selectedChecklist = root;
					updateView();
				}
			} catch( Exception exception ) {
				CertWareLog.logError(String.format("%s %s","Checklist null loading",ifile), exception);
				selectedFile = null;
				return false;
			}

			return true;
		} // if

		return false;
	}

	/**
	 * Return the selected model.
	 * @return selected model, or null
	 */
	public Checklist getSelectedChecklist() {
		return selectedChecklist;
	}

	/**
	 * Set the form focus.
	 */
	@Override
	public void setFocus() {
		form.setFocus();
	}

	/**
	 * Run the save handler.
	 * @param progress monitor, unused
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
	    String commandId = "net.certware.verification.checklist.view.save"; //$NON-NLS-1$

	    try {
	      IHandlerService handlerService = (IHandlerService) getSite().getService(IHandlerService.class); 
	      handlerService.executeCommand(commandId, null);
	      setDirty(false);
	    } catch( Exception e ) {
	      CertWareLog.logError("Saving checklist model",e);
	    }

	}

	/**
	 * Save as not supported.  Copy the resource instead.
	 */
	@Override
	public void doSaveAs() {
		// not needed
	}

	/**
	 * Returns the dirty flag.
	 * @return dirty flag
	 */
	@Override
	public boolean isDirty() {
		return dirty;
	}

	/**
	 * Sets the dirty flag
	 * @param d dirty flag new value
	 */
	public void setDirty(boolean d) {
		dirty = d;
	}
	
	/**
	 * Whether save as allowed.
	 * @return always returns false
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	/**
	 * Whether save on close is needed.
	 * @return defers to isDirty()
	 */
	@Override
	public boolean isSaveOnCloseNeeded() {
		return isDirty();
	}

	/**
	 * Responds to resource changed events.
	 * Listens to removed and changed events.
	 * If removed, clears the view.
	 * If changed, updates the display with previous selection and new content.
	 * @param event resource change event
	 */
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		final IPreferenceStore ps = Activator.getDefault().getPreferenceStore();

		try {
			event.getDelta().accept(new IResourceDeltaVisitor() {
				public boolean visit(IResourceDelta delta) throws CoreException {
					if ( delta.getKind() == IResourceDelta.REMOVED ) {
						// selected results file
						if ( selectedFile != null )
							if ( delta.getResource() instanceof IFile && selectedFile.equals(delta.getResource()) ) {
								latestSelection = null;
								selectionChanged(null,latestSelection); // refresh the display with no selection
								clearView();
							}
					} // removed
					else
						if ( delta.getKind() == IResourceDelta.CHANGED ) {
							if ( selectedFile != null )
								if ( ps.getBoolean( PreferenceConstants.P_CHECKLIST_VIEW_REFRESH_ON_RESOURCE_CHANGE ) )
									if ( delta.getResource() instanceof IFile && selectedFile.equals(delta.getResource()) ) {
										selectionChanged(null,latestSelection); // refresh the display
									}
						} // changed
					return true;
				}
			});
		} catch( CoreException ce ) {
			CertWareLog.logWarning(String.format("%s: %s","Exception refreshing selected checklist file",ce.getMessage()));
		}
	}

	/**
	 * Updates the checklist table content.
	 */
	protected void updateChecklistTable() {
		
		if ( selectedChecklist == null )
			return;

		ChecklistModelList list = new ChecklistModelList();
		list.initialize(selectedChecklist);
		tableViewer.setInput( list.getItems() ); // array content provider
		tableViewer.refresh();
		tableViewer.getControl().pack(true);
	}


	/**
	 * Clears the contents of the view.
	 * Used primarily when the associate resource becomes unavailable.
	 */
	protected void clearView() {

		if ( checklistText == null )
			return;

		context.getDisplay().asyncExec(new Runnable(){
			public void run() {
				checklistText.setText(CHECKLIST_LABEL + "<none>");
				checklistText.setEnabled(false);
				
				checklistVersion.setText(CHECKLIST_VERSION + "<none>");
				checklistVersion.setEnabled(false);

				tableViewer.setItemCount(0);
				tableViewer.refresh();

				form.reflow(true);
			}
		});
	}

	/**
	 * Update the view.
	 */
	protected void updateView() {
		
		if ( selectedChecklist == null ) 
			return;

		checklistText.getDisplay().asyncExec(new Runnable() {

			public void run() {
				try {
					// update the context section
					// always redraw the strings to erase any previous content
					// the form composite requires re-packing to reflect the new boundaries
					checklistText.setText(CHECKLIST_LABEL + selectedChecklist.getName());
					checklistText.setHref( selectedFile );
					checklistText.setEnabled(true);
					checklistText.pack(true);

					checklistVersion.setText(CHECKLIST_VERSION + selectedChecklist.getVersion()); 
					checklistVersion.setEnabled(true);
					checklistVersion.pack(true);
					
					updateChecklistTable();

					// refresh the form layout
					// form.layout(true);
					form.reflow(true);

				} catch( SWTException e ) {
					// ignore disposed cases, pass along others
					if ( e.code != SWT.ERROR_DEVICE_DISPOSED )
						throw e;
				}
			}
		});
	}

	/**
	 * Prompt to save on close.
	 * @return default prompt for workbench
	 */
	@Override
	public int promptToSaveOnClose() {
	    // use the workbench default prompt
	    return ISaveablePart2.DEFAULT;
	}

	/**
	 * Process a selection change.
	 * @param part workbench part
	 * @param selection selection to process
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if ( ! (selection instanceof IStructuredSelection ))
			return;

		IStructuredSelection iss = (IStructuredSelection)selection;

		// selecting from the explorer without the file open
		if ( iss.getFirstElement() instanceof IFile ) {
			IFile sf = (IFile)iss.getFirstElement();
			if ( sf.getFileExtension().endsWith( ICertWareConstants.VCL_EXTENSION )) {
				if ( setSelectedFile(sf) ) {
					latestSelection = selection;
				}
			}
			return;
		} 

		// otherwise select from the active model editor
		if ( ! (iss.getFirstElement() instanceof EObject) ) 
			return;

		EObject eo = (EObject)iss.getFirstElement();

		// find the containing document object for results objects
		while( eo != null ) {
			if ( eo instanceof Checklist ) {
				selectedChecklist = (Checklist)eo;
				updateView();
				latestSelection = selection;
				return;
			}
			eo = eo.eContainer();
		}
	}

	/**
	 * Dispose of listeners and other resources.
	 * The plugin takes care of the forms toolkit.
	 * @see org.eclipse.ui.IWorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		getSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(this);
		if ( activeEditorListener != null )
			getSite().getPage().removePartListener(activeEditorListener);
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}

	/**
	 * Returns whether the view is linking the editor.
	 * @return true if linking editor
	 */
	public boolean getLinkingEditor() {
		return isLinkingEditor;
	}

	/**
	 * Sets the linking editor state.
	 * @param le true if the view should listen to the active editor
	 */
	public void setLinkingEditor(boolean le) {
		isLinkingEditor = le;
	}

	/**
	 * Adapter to identify context provider.
	 * @param key context provider type desired
	 * @return context provider 
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(Class)
	 */
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class key) {

		if (key.equals(IContextProvider.class)) {
			if (contextprovider == null)
				contextprovider = new ContextProvider(this);
			return contextprovider;
		}

		return super.getAdapter(key);
	}

	@Override
	public String getDefaultExtension() {
		return ICertWareConstants.VCL_EXTENSION;
	}

	/**
	 * Editing support for the choices column.
	 * @author mrb
	 */
	public final class ResultEditingSupport extends EditingSupport {
		/** cell editor */
		private ComboBoxViewerCellEditor cellEditor = null;
		/** column viewer */
		private ColumnViewer columnViewer = null;

		/**
		 * Constructor sets the editor content, input, and label providers.
		 * @param viewer column viewer for the column requiring this editor
		 */
		@SuppressWarnings("deprecation")
		public ResultEditingSupport(ColumnViewer viewer) {
			super(viewer);
			columnViewer = viewer;
			cellEditor = new ComboBoxViewerCellEditor((Composite) getViewer().getControl(), SWT.NONE);
			cellEditor.setContenProvider(new ArrayContentProvider());
			cellEditor.setInput( Choices.VALUES.toArray() );
			cellEditor.setLabelProvider(new LabelProvider());
			cellEditor.addListener(new ICellEditorListener(){
				@Override
				public void applyEditorValue() {
				}

				@Override
				public void cancelEditor() {
				}

				@Override
				public void editorValueChanged(boolean oldValidState,boolean newValidState) {
				}});
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			return cellEditor;
		}

		@Override
		protected boolean canEdit(Object element) {
			return true;
		}

		@Override
		protected Object getValue(Object element) {
			if (element instanceof ChecklistModel) {
				ChecklistModel data = (ChecklistModel)element;
				return data.getResult();
			}
			return null;
		}

		@Override
		protected void setValue(Object element, Object value) {
			if (element instanceof ChecklistModel && value instanceof Choices) {
				ChecklistModel data = (ChecklistModel)element;
				Choices newValue = (Choices)value;
				data.setResult(newValue); // changes the list
				data.getItem().setResult(newValue); // changes the model
				columnViewer.update(element, null); // changes the display
				setDirty(true);
			}
		}
	}
}
