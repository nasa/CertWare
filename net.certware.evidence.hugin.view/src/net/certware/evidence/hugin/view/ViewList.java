package net.certware.evidence.hugin.view;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.handlers.LinkEditor;
import net.certware.core.ui.help.IHelpContext;
import net.certware.core.ui.listeners.ActiveEditorListener;
import net.certware.core.ui.log.CertWareLog;
import net.certware.core.ui.resources.FileFinder;
import net.certware.core.ui.resources.FileOpener;
import net.certware.core.ui.views.ICertWareView;
import net.certware.evidence.hugin.view.filters.ResultFilter;
import net.certware.evidence.hugin.view.help.ContextProvider;
import net.certware.evidence.hugin.view.preferences.PreferenceConstants;
import net.certware.evidence.hugin.view.table.NetworkModel;
import net.certware.evidence.hugin.view.table.NetworkModelList;
import net.certware.evidence.hugin.view.table.NetworkSorter;
import net.certware.evidence.hugin.view.util.ReadModelFile;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.help.IContextProvider;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
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

import edu.ucla.belief.BeliefNetwork;
import edu.ucla.belief.io.hugin.HuginNode;

/**
 * Provides a list view of a network model.
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
	/** selected network model */
	private BeliefNetwork selectedNetwork = null;
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
	/** network name link */
	private Hyperlink networkHyperlink;
	/** discrete item filter */
	private MenuItem itemDiscreteFilterMenuItem;
	/** continuous item filter */
	private MenuItem itemContinuousFilterMenuItem;
	/** decision item filter */
	private MenuItem itemDecisionFilterMenuItem;
	/** utility item filter */
	private MenuItem itemUtilityFilterMenuItem;
	/** whether the model is dirty */
	protected boolean dirty = false;
	/** network name prefix */
	private static final String NETWORK_LABEL = "Network: ";
	/** network name tool tip */
	private static final String NETWORK_TOOL_TIP = "Network model name";
	/** memento for column width */
	private static final String MEMENTO_COLUMN_ID = "memento.id"; //$NON-NLS-1$
	/** memento for column width */
	private static final String MEMENTO_COLUMN_LABEL = "memento.label"; //$NON-NLS-1$
	/** memento for column width */
	private static final String MEMENTO_COLUMN_TYPE = "memento.type"; //$NON-NLS-1$
	/** memento for section expanded */
	private static final String MEMENTO_SECTION_CONTEXT = "memento.context"; //$NON-NLS-1$
	/** memento for section expanded */
	private static final String MEMENTO_SECTION_ITEMS = "memento.items"; //$NON-NLS-1$
	/** memento for file selection */
	private static final String MEMENTO_FILE = "memento.file"; //$NON-NLS-1$
	/** memento for filter state */
	private static final String MEMENTO_FILTER_DISCRETE = "memento.filter.discrete"; //$NON-NLS-1$
	/** memento for filter state */
	private static final String MEMENTO_FILTER_CONTINUOUS = "memento.filter.continuous"; //$NON-NLS-1$
	/** memento for filter state */
	private static final String MEMENTO_FILTER_DECISION = "memento.filter.decision"; //$NON-NLS-1$
	/** memento for filter state */
	private static final String MEMENTO_FILTER_UTILITY = "memento.filter.utility"; //$NON-NLS-1$

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

		memento.putBoolean(MEMENTO_FILTER_DISCRETE, itemDiscreteFilterMenuItem.getSelection());
		memento.putBoolean(MEMENTO_FILTER_CONTINUOUS, itemContinuousFilterMenuItem.getSelection());
		memento.putBoolean(MEMENTO_FILTER_DECISION, itemDecisionFilterMenuItem.getSelection());
		memento.putBoolean(MEMENTO_FILTER_UTILITY, itemUtilityFilterMenuItem.getSelection());

		TableColumn[] tcs = tableViewer.getTable().getColumns();
		memento.putInteger( MEMENTO_COLUMN_ID, tcs[0].getWidth());
		memento.putInteger( MEMENTO_COLUMN_LABEL, tcs[1].getWidth());
		memento.putInteger( MEMENTO_COLUMN_TYPE, tcs[2].getWidth());
	}

	/**
	 * Set the context IDs for help system.  
	 * Wait to call until site has been established.
	 * @param control Control
	 */
	private void setHelpContextIDs(Control control) {
		IWorkbenchHelpSystem helpSystem = getSite().getWorkbenchWindow().getWorkbench().getHelpSystem();
		helpSystem.setHelp(control, IHelpContext.NET_VIEW);
	}

	/**
	 * Selection listener to sort columns.
	 * @param table table
	 * @param tvc table column
	 * @param sorter sorter to apply
	 */
	private void addSelectionSorter(final Table table, final TableViewerColumn tvc, final NetworkSorter sorter) {
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
	private void setColumnImages(NetworkSorter sorter, Table t, TableColumn sc) {
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
		form.setText("Network Structure");
		form.setMessage(null,IMessageProvider.NONE);
		form.setToolTipText("Select a Hugin network model");
		toolkit.decorateFormHeading(form.getForm());
		form.setImage(Activator.getDefault().getImageRegistry().getDescriptor(Activator.NETWORK_IMAGE).createImage());

		// layout
		TableWrapLayout layout = new TableWrapLayout();
		layout.numColumns = 2;
		form.getBody().setLayout(layout);

		// context section
		context = toolkit.createSection(form.getBody(),	Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		twd = new TableWrapData(TableWrapData.FILL);
		twd.colspan = 2;
		context.setLayoutData(twd);
		context.setText("Network Context");
		context.setToolTipText("Network identification content");
		context.addExpansionListener(new ExpansionAdapter() {
			@Override
			public void expansionStateChanged(ExpansionEvent e) {
				form.layout(true);
				form.reflow(true);
			}
		});

		Composite contextClient = toolkit.createComposite(context);
		contextClient.setLayout(new GridLayout());
		
		// network name
		networkHyperlink = toolkit.createHyperlink(contextClient, NETWORK_LABEL, SWT.WRAP);
		networkHyperlink.setEnabled(false);
		networkHyperlink.setToolTipText(NETWORK_TOOL_TIP);
		networkHyperlink.setFont(JFaceResources.getDialogFont());
		networkHyperlink.addHyperlinkListener(new HyperlinkAdapter() {
			@Override
			public void linkActivated(HyperlinkEvent e) {
				FileOpener.findResourceEditor((IFile)e.getHref()); // Href contains the IFile from selection
			}
		});

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
		items.setText("Structure Items");
		items.setToolTipText("Network nodes");
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
		tableLayout.addColumnData(new ColumnWeightData(1)); // id
		tableLayout.addColumnData(new ColumnWeightData(3)); // label
		tableLayout.addColumnData(new ColumnWeightData(2)); // type
		table.setLayout(tableLayout);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		
		tableViewer = new TableViewer(table);
		
		TableViewerColumn idColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableViewerColumn labelColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableViewerColumn typeColumn = new TableViewerColumn(tableViewer, SWT.NONE);

		setColumnProperties(idColumn,"ID",headerMenu,true,true);
		setColumnProperties(labelColumn,"Label",headerMenu,true,true);
		setColumnProperties(typeColumn,"Type",headerMenu,true,true);
		
		// menu for column widths
		table.addListener(SWT.MenuDetect, new Listener() {
			public void handleEvent(Event event) {
				table.setMenu(headerMenu);
			}
		});

		// table sorting on columns
		NetworkSorter sorter = new NetworkSorter(tableViewer);
		tableViewer.setSorter(sorter);
		addSelectionSorter(table, idColumn, sorter);
		addSelectionSorter(table, labelColumn, sorter);
		addSelectionSorter(table, typeColumn, sorter);
		setColumnImages(sorter, table, idColumn.getColumn());
		
		// recover widths if available
		if ( memento != null && memento.getAttributeKeys().length < NetworkModel.COLUMN_COUNT) {
			setColumnWidth(idColumn,memento.getInteger(MEMENTO_COLUMN_ID));
			setColumnWidth(labelColumn,memento.getInteger(MEMENTO_COLUMN_LABEL));
			setColumnWidth(typeColumn,memento.getInteger(MEMENTO_COLUMN_TYPE));
		}
		
		// table content provider
		tableViewer.setContentProvider(new ArrayContentProvider());
		if ( selectedNetwork != null ) {
			NetworkModelList list = new NetworkModelList();
			list.initialize(selectedNetwork);
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
				NetworkModel cm = (NetworkModel)element;
				switch( columnIndex ) {
				case 0: return cm.getId();
				case 1: return cm.getDescription();
				case 2: 
					if ( cm.getValueType() == HuginNode.DISCRETE ) {
						return "Discrete";
					}
					if ( cm.getValueType() == HuginNode.CONTINUOUS ) {
						return "Continuous";
					}
					if ( cm.getValueType() == HuginNode.DECISION ) {
						return "Decision";
					}
					if ( cm.getValueType() == HuginNode.POTENTIAL ) {
						return "Potential";
					}
					if ( cm.getValueType() == HuginNode.UTILITY ) {
						return "Utility";
					}
					return Integer.toString(cm.getValueType());
				default:
					System.err.println("Label provider unknown index " + columnIndex);
				}
				return ""; //$NON-NLS-1$
			}
		});
		
		// add filters to the header menu 
		createMenuSeparator(headerMenu);
		ViewerFilter discreteFilter = new ResultFilter(0);
		ViewerFilter continuousFilter = new ResultFilter(1);
		ViewerFilter decisionFilter = new ResultFilter(2);
		ViewerFilter utilityFilter = new ResultFilter(3);
		itemDiscreteFilterMenuItem = createMenuFilterItem(headerMenu,"Hide Discrete",discreteFilter,false); // TODO update these
		itemContinuousFilterMenuItem = createMenuFilterItem(headerMenu,"Hide Continuous",continuousFilter,false);
		itemDecisionFilterMenuItem = createMenuFilterItem(headerMenu,"Hide Decision",decisionFilter,false);
		itemUtilityFilterMenuItem = createMenuFilterItem(headerMenu,"Hide Utility",utilityFilter,false);

		items.setClient(resultsClient2);

		// create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(form, IHelpContext.NET_VIEW); 

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
			if (  memento.getBoolean(MEMENTO_FILTER_DISCRETE) ) {
				itemDiscreteFilterMenuItem.setSelection( true );
				tableViewer.addFilter(discreteFilter);
			}
			if (  memento.getBoolean(MEMENTO_FILTER_CONTINUOUS) ) {
				itemContinuousFilterMenuItem.setSelection( true );
				tableViewer.addFilter(continuousFilter);
			}
			if (  memento.getBoolean(MEMENTO_FILTER_DECISION) ) {
				itemDecisionFilterMenuItem.setSelection( true );
				tableViewer.addFilter(decisionFilter);
			}
			if (  memento.getBoolean(MEMENTO_FILTER_UTILITY) ) {
				itemUtilityFilterMenuItem.setSelection( true );
				tableViewer.addFilter(utilityFilter);
			}

			// column widths
			int column = 0;
			tableViewer.getTable().getColumn(column++).setWidth( memento.getInteger( MEMENTO_COLUMN_ID));
			tableViewer.getTable().getColumn(column++).setWidth( memento.getInteger( MEMENTO_COLUMN_LABEL ));
			tableViewer.getTable().getColumn(column++).setWidth( memento.getInteger( MEMENTO_COLUMN_TYPE ));
		}

		setHelpContextIDs(parent);

		form.layout();
	}

	/**
	 * Set column properties.  Creates a table column, adds properties per arguments.
	 * Creates the menu item for the new column.
	 * @param tvc viewer column
	 * @param title column title
	 * @param menu parent menu for new item
	 * @param moveable whether the column is movable
	 * @param resizeable whether the column is resizeable
	 */
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
	 * Sets the selected network.
	 * @param bn network to assign to viewer content
	 */
	protected void setSelectedNetwork(BeliefNetwork bn) {
		this.selectedNetwork = bn;
	}

	/**
	 * Sets the selected file.
	 * @param f selected file
	 * @return 
	 */
	public boolean setSelectedFile(final IFile ifile) {
		if ( ifile == null )
			return false;

		// if the file is the right type, open it and update the view
		String extension = ifile.getFileExtension();
		if (extension != null && ICertWareConstants.NET_EXTENSION.equals(extension)) {
			try {
				/*
				// load the network file by parsing the DSL
				NetworkIO.BeliefNetworkIOListener bnil = new NetworkIO.BeliefNetworkIOListener() {
							@Override
					public void handleSyntaxErrors(String[] errors, FileType filetype) {
						CertWareLog.logWarning(String.format("%s %s","Syntax error reading file",ifile.getName()));
						for ( String s : errors ) {
							CertWareLog.logWarning(s);
						}
					}
					
					@Override
					public void handleProgress(ProgressMonitorable readTask, Estimate estimate) {
					}
					
					@Override
					public void handleNewBeliefNetwork(BeliefNetwork bn, File f) {
						// threadNetwork = bn;
						setSelectedNetwork(bn);
					}
					
					@Override
					public void handleCancelation() {
					}
					
					@Override
					public void handleBeliefNetworkIOError(String msg) {
						CertWareLog.logWarning(String.format("%s %s",msg,ifile.getName()));
					}
					
					@Override
					public ThreadGroup getThreadGroup() {
						return null;
					}
				};
				*/

				//Thread thread = NetworkIO.readHuginNet(ifile.getContents(),ifile.getName(),bnil);
				//thread.run();
				
				// this version handles influence diagram nodes better than Hugin network read
				// BeliefNetwork bn = NetworkIO.read( ifile.getFullPath().toFile() );
				BeliefNetwork bn = ReadModelFile.readNetwork(ifile);
				setSelectedNetwork(bn);
				
				if ( getSelectedNetwork() != null ) {
					selectedFile = ifile;
					// selectedNetwork = threadNetwork;
					updateView();
				} else {
					CertWareLog.logWarning(String.format("%s %s","Unsupported network file selected",ifile.getName()));
				}
			} catch( Exception exception ) {
				CertWareLog.logError(String.format("%s %s","Network null loading",ifile), exception);
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
	public BeliefNetwork getSelectedNetwork() {
		return selectedNetwork;
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
	    String commandId = "net.certware.evidence.hugin.view.save"; //$NON-NLS-1$

	    // TODO reinstate the save command in the plugin extensions
	    try { // TODO use NetworkIO.save() methods in command handler
	      IHandlerService handlerService = (IHandlerService) getSite().getService(IHandlerService.class); 
	      handlerService.executeCommand(commandId, null);
	      setDirty(false);
	    } catch( Exception e ) {
	      CertWareLog.logError("Saving network model",e);
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
								if ( ps.getBoolean( PreferenceConstants.P_NETWORK_VIEW_REFRESH_ON_RESOURCE_CHANGE ) )
									if ( delta.getResource() instanceof IFile && selectedFile.equals(delta.getResource()) ) {
										selectionChanged(null,latestSelection); // refresh the display
									}
						} // changed
					return true;
				}
			});
		} catch( CoreException ce ) {
			CertWareLog.logWarning(String.format("%s: %s","Exception refreshing selected network file",ce.getMessage()));
		}
	}

	/**
	 * Updates the network table content.
	 */
	protected void updateNetworkTable() {
		
		if ( selectedNetwork == null )
			return;

		NetworkModelList list = new NetworkModelList();
		list.initialize(selectedNetwork);
		tableViewer.setInput( list.getItems() ); // array content provider
		tableViewer.refresh();
		tableViewer.getControl().pack(true);
	}


	/**
	 * Clears the contents of the view.
	 * Used primarily when the associate resource becomes unavailable.
	 */
	protected void clearView() {

		if ( networkHyperlink == null )
			return;

		context.getDisplay().asyncExec(new Runnable(){
			public void run() {
				networkHyperlink.setText(NETWORK_LABEL + "<none>");
				networkHyperlink.setEnabled(false);
				
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
		
		if ( selectedNetwork == null ) 
			return;

		networkHyperlink.getDisplay().asyncExec(new Runnable() {

			public void run() {
				try {
					// update the context section
					// always redraw the strings to erase any previous content
					// the form composite requires re-packing to reflect the new boundaries
					networkHyperlink.setText(NETWORK_LABEL + selectedFile.getName());
					networkHyperlink.setHref( selectedFile );
					networkHyperlink.setEnabled(true);
					networkHyperlink.pack(true);

					updateNetworkTable();

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
			if ( setSelectedFile((IFile)iss.getFirstElement()) ) {
				latestSelection = selection;
			}
		} 

		/* don't want to import the hugin DSL items here 
		// otherwise select from the active model editor
		if ( ! (iss.getFirstElement() instanceof EObject) ) 
			return;

		EObject eo = (EObject)iss.getFirstElement();

		// find the containing document object for results objects
		while( eo != null ) {
			if ( eo instanceof Checklist ) {
				selectedNetwork = (Checklist)eo;
				updateView();
				latestSelection = selection;
				return;
			}
			eo = eo.eContainer();
		}
		*/
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
		return ICertWareConstants.NET_EXTENSION;
	}


}
