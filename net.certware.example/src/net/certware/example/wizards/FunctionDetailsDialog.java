package net.certware.example.wizards;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.help.IContextProvider;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.jface.window.SameShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.help.IWorkbenchHelpSystem;

import com.kt.codehawk.preanalysis.SystemInfo;
import com.kt.codehawk.preanalysis.views.Activator;
import com.kt.codehawk.preanalysis.views.help.FunctionDetailsContextProvider;
import com.kt.codehawk.preanalysis.views.viewers.FunctionDetailsTableViewer;

/**
 * A dialog to navigate pre-analysis details regarding functions.
 * @author mrb
 * @since 3.8.1
 */
public class FunctionDetailsDialog extends TrayDialog implements IAdaptable
{
  /** the top-level data from the value tool results file */
  private SystemInfo systemInfo = null;
  /** the table viewer for values records */
  private FunctionDetailsTableViewer tableViewer = null;
  /** memento storage key for source */
  protected static final String MEMENTO_COLUMN_SOURCE = "PreanalysisDetails.columnSourceWidth";
  /** memento storage key for functions */
  protected static final String MEMENTO_COLUMN_FUNCTION = "PreanalysisDetails.columnFunctionWidth";
  /** memento storage key for complexity */
  protected static final String MEMENTO_COLUMN_COMPLEXITY = "PreanalysisDetails.columnComplexityWidth";
  /** memento storage key for open verification conditions */
  protected static final String MEMENTO_COLUMN_OPENVC = "PreanalysisDetails.columnOpenVcWidth";
  /** memento storage key for total verification conditions */
  protected static final String MEMENTO_COLUMN_TOTALVC = "PreanalysisDetails.columnTotalVcWidth";
  /** ascending sort column header image */
  protected static final String SORT_ASCENDING_IMAGE = "icons/obj16/ascending.gif";
  /** descending sort column header image */
  protected static final String SORT_DESCENDING_IMAGE = "icons/obj16/descending.gif";
  /** ascending sort image */
  protected Image ascendingImage = null;
  /** descending sort image */
  protected Image descendingImage = null;
  /** dialog title */
  protected String title = null;
  /** dialog settings keys */
  static final String DETAILS_DIALOG_SETTINGS = "FUNCTIONS_DIALOG_SETTINGS";

  /**
   * Constructor creates a same shell provider for the shell, then calls the other constructor.
   * @param parentShell parent shell for the dialog
   * @param title dialog title
   * @param systemInfo pre-analysis results record
   */
  public FunctionDetailsDialog(Shell parentShell, String title, SystemInfo systemInfo)
  {
    this(new SameShellProvider(parentShell),title, systemInfo);
  }

  /**
   * Constructor creates the dialog with dialog trim, resize, and application modality.
   * Creates the dialog shell with dialog trim and resize handles.
   * @param parentShell parent shell provider for the dialog
   * @param title dialog title
   * @param systemInfo pre-analysis results record
   */
  protected FunctionDetailsDialog(IShellProvider parentShell, String title, SystemInfo systemInfo) {
    super(parentShell);
    this.title = title;
    this.systemInfo = systemInfo;
    setShellStyle(SWT.DIALOG_TRIM | SWT.RESIZE );
    ascendingImage = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, SORT_ASCENDING_IMAGE).createImage();
    descendingImage = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, SORT_DESCENDING_IMAGE).createImage();
  }

  /**
   * Provide for storing the dialog location, size, and section settings.
   */
  protected IDialogSettings getDialogBoundsSettings() {
    IDialogSettings settings = Activator.getDefault().getDialogSettings();
    IDialogSettings section = settings.getSection(DETAILS_DIALOG_SETTINGS);

    if (section == null) {
      section = settings.addNewSection(DETAILS_DIALOG_SETTINGS);
    }
    return section;
  }

  /**
   * Creates the buttons for the button bar.
   * Using the standard dialog OK button.
   * Using a client button for the sorted table.
   */
  protected void createButtonsForButtonBar(Composite parent) {
    createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
    // TODO export button?
    /*
    Button detailsButton = createButton(parent, IDialogConstants.CLIENT_ID+1, "Other...", false);
    detailsButton.addSelectionListener(new SelectionAdapter() {
      public void widgetSelected(SelectionEvent se) {
        System.err.println("not yet implemented " + se);
      }
    });
    */
  }

  /** 
   * Configures the shell and sets the title.
   * @param shell shell to configure
   */
  protected void configureShell(Shell shell) {
    super.configureShell(shell);
    if ( title != null )
      shell.setText(title);
  }
  

  /**
   * Saves the view state.  
   * The selected file and messages file are saved as a memento by file name.
   */
  public void saveState()
  {
    TableColumn[] tcs = tableViewer.getTable().getColumns();
    IDialogSettings section = getDialogBoundsSettings();

    section.put( MEMENTO_COLUMN_SOURCE,      tcs[0].getWidth());
    section.put( MEMENTO_COLUMN_FUNCTION,    tcs[1].getWidth());
    section.put( MEMENTO_COLUMN_COMPLEXITY,  tcs[2].getWidth());
    section.put( MEMENTO_COLUMN_OPENVC,      tcs[3].getWidth());
    section.put( MEMENTO_COLUMN_TOTALVC,     tcs[4].getWidth());
  }

  /**
   * User pressed the OK button. We save the state then call the super class method.
   */
  public void okPressed() {
    saveState();
    super.okPressed();
  }

  /**
   * User pressed the cancel button. We save the state then call the super class method.
   * State save is okay in this cancel context because we are not editing the content.
   */
  public void cancelPressed() {
    saveState();
    super.cancelPressed();
  }

  /**
   * Retrieve width by key from dialog settings.
   * @param key settings key
   * @param defaultWidth default value if key not found
   * @return width
   */
  protected int getStoredWidth( String key, int defaultWidth) {
    int width = defaultWidth;
    IDialogSettings section = getDialogBoundsSettings();
    try {
      width = ( section.getInt( key ) );
    } catch( NumberFormatException nfe ) {
      // ignore, not yet set or bogus value
    }
    return width;
  }
  
  /**
   * Creates the dialog area, including message.
   * @param parent parent for the new composite
   */
  protected Control createDialogArea(Composite parent) {

    Composite composite = (Composite)super.createDialogArea(parent);
    //composite.setLayout(new FillLayout());
    //Composite composite = new Composite(parent, SWT.NULL);
    composite.setLayout(new GridLayout());
    composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    int tableStyle = SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.HIDE_SELECTION;
    final Table table = new Table(composite,tableStyle);
    table.setLayoutData(new GridData(GridData.FILL_BOTH));
    final Menu headerMenu = new Menu(table);
    
    table.setLinesVisible(true);
    table.setHeaderVisible(true);
    table.addSelectionListener(new SelectionAdapter(){
      public void widgetSelected(SelectionEvent e) {
        // table item data contains the model object
        /*
        TableItem ti = (TableItem)e.item;
        if ( ti == null ) return;
        FunctionDetailsModel fdm = (FunctionDetailsModel)ti.getData();
        */
      }});

    // menu for column widths
    table.addListener(SWT.MenuDetect, new Listener() {
      public void handleEvent(Event event) {
          table.setMenu(headerMenu);
      }
    });

    // source file column
    int width = getStoredWidth( MEMENTO_COLUMN_SOURCE, 100 );
    int columnNumber = 0;
    TableColumn column = new TableColumn(table, SWT.LEFT, columnNumber );     
    column.setText(FunctionDetailsTableViewer.columnNames[columnNumber]);
    column.setWidth(width);
    column.setResizable(true);
    column.setMoveable(true);
    column.setImage(ascendingImage);
    createMenuItem(headerMenu,column);
    column.addSelectionListener(new SelectionAdapter() {
      public void widgetSelected(SelectionEvent e) {
        tableViewer.getSorter().setColumn(FunctionDetailsTableViewer.COLUMN_SOURCE);
        tableViewer.refresh(true,true);
        TableColumn c = (TableColumn)e.getSource();
        setColumnImages(tableViewer,table,c);
        tableViewer.getControl().redraw();
      }
    });    

    // function column
    width = getStoredWidth(MEMENTO_COLUMN_FUNCTION,200);
    columnNumber++;
    column = new TableColumn(table, SWT.LEFT, columnNumber );     
    column.setText(FunctionDetailsTableViewer.columnNames[columnNumber]);
    column.setWidth(width);
    column.setResizable(true);
    column.setMoveable(true);
    column.setImage(null);
    createMenuItem(headerMenu,column);
    column.addSelectionListener(new SelectionAdapter() {
      public void widgetSelected(SelectionEvent e) {
        tableViewer.getSorter().setColumn(FunctionDetailsTableViewer.COLUMN_FUNCTION);
        tableViewer.refresh(true,true);
        TableColumn c = (TableColumn)e.getSource();
        setColumnImages(tableViewer,table,c);
        tableViewer.getControl().redraw();
      }
    });    
    
    // complexity column
    width = getStoredWidth(MEMENTO_COLUMN_COMPLEXITY,75);
    columnNumber++;
    column = new TableColumn(table, SWT.RIGHT, columnNumber );     
    column.setText(FunctionDetailsTableViewer.columnNames[columnNumber]);
    column.setWidth(width); 
    column.setResizable(true);
    column.setMoveable(true);
    column.setImage(null);
    createMenuItem(headerMenu,column);
    column.addSelectionListener(new SelectionAdapter() {
      public void widgetSelected(SelectionEvent e) {
        tableViewer.getSorter().setColumn(FunctionDetailsTableViewer.COLUMN_COMPLEXITY);
        tableViewer.refresh(true,true);
        TableColumn c = (TableColumn)e.getSource();
        setColumnImages(tableViewer,table,c);
        tableViewer.getControl().redraw();
      }
    });    

    // open vc column
    width = getStoredWidth(MEMENTO_COLUMN_OPENVC,75);
    columnNumber++;
    column = new TableColumn(table, SWT.RIGHT, columnNumber );     
    column.setText(FunctionDetailsTableViewer.columnNames[columnNumber]);
    column.setWidth(width);
    column.setResizable(true);
    column.setMoveable(true);
    column.setImage(null);
    createMenuItem(headerMenu,column);
    column.addSelectionListener(new SelectionAdapter() {
      public void widgetSelected(SelectionEvent e) {
        tableViewer.getSorter().setColumn(FunctionDetailsTableViewer.COLUMN_OPEN_VC);
        tableViewer.refresh(true,true);
        TableColumn c = (TableColumn)e.getSource();
        setColumnImages(tableViewer,table,c);
        tableViewer.getControl().redraw();
      }
    });    

    // total vc column
    width = getStoredWidth(MEMENTO_COLUMN_TOTALVC,75);
    columnNumber++;
    column = new TableColumn(table, SWT.RIGHT, columnNumber );     
    column.setText(FunctionDetailsTableViewer.columnNames[columnNumber]);
    column.setWidth(width);
    column.setResizable(true);
    column.setMoveable(true);
    column.setImage(null);
    createMenuItem(headerMenu,column);
    column.addSelectionListener(new SelectionAdapter() {
      public void widgetSelected(SelectionEvent e) {
        tableViewer.getSorter().setColumn(FunctionDetailsTableViewer.COLUMN_TOTAL_VC);
        tableViewer.refresh(true,true);
        TableColumn c = (TableColumn)e.getSource();
        setColumnImages(tableViewer,table,c);
        tableViewer.getControl().redraw();
      }
    });    

    // add filters to the header menu
    /*
    ViewerFilter vf = new TemporaryVariableFilter();
    createMenuSeparator(headerMenu);
    createMenuFilterItem(headerMenu,"Hide temporaries",vf,true);
    */

    // set the viewer to the table and initialize
    tableViewer = new FunctionDetailsTableViewer(table);
    // tableViewer.addFilter(vf); // the menu item was created as selected
    tableViewer.initialize(systemInfo);
    tableViewer.refresh();
    
    // create the help context id for the dialog
    setHelpContextIDs(parent);

    return composite;
  }

  /**
   * Set the column header images according to sort direction.
   * @param tv table viewer for sorter access
   * @param t table for column access
   * @param sc selected column to assign image
   */
  private void setColumnImages(FunctionDetailsTableViewer tv, Table t, TableColumn sc) {
    // clear all current images
    for ( int c = 0; c < t.getColumnCount(); c++ ) {
      TableColumn tc = t.getColumn(c);
      tc.setImage(null);
    }

    // set the selected column's image according to sort direction
    if ( tv.getSorter().getDirection() == SWT.UP )
      sc.setImage(ascendingImage);
    else
      sc.setImage(descendingImage);
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
   * Creates a menu item separator for the column header.
   * @param parent column header menu
   */
  @SuppressWarnings("unused")
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
   * @return the menu item
   */
  @SuppressWarnings("unused")
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
   * Dispose of listeners and other resources.
   * The plugin takes care of the forms toolkit.
   */
  public void dispose() {
    //getSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(this);
    //getSite().getPage().removePartListener(activeEditorListener);
    //ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
    //super.dispose();
    ascendingImage.dispose();
    descendingImage.dispose();
  }

  /**
   * Updates the table content.
   */
  protected void updateValueTable() {

    if ( systemInfo == null )
      return;
    
    tableViewer.initialize( systemInfo );
    tableViewer.setInput( systemInfo );
    tableViewer.refresh();
    tableViewer.getControl().pack(true);
  }
  
  /**
   * Set the context IDs for help system.  
   * Wait to call until site has been established.
   */
  private void setHelpContextIDs(Control control) {
    // create the help context id for the viewer's control
    IWorkbenchHelpSystem helpSystem = PlatformUI.getWorkbench().getHelpSystem();
    // helpSystem.setHelp(control, HELP_ID); 
    helpSystem.setHelp(control, Activator.PLUGIN_ID + '.' + "preanalysis_functions");
  }


  /** context provider for help system */
  static FunctionDetailsContextProvider contextprovider = null;

  /**
   * Adapter to identify context provider.
   */
  @SuppressWarnings("rawtypes")
  public Object getAdapter(Class key) {
    
    if (key.equals(IContextProvider.class)) {
        if (contextprovider == null)
            contextprovider = new FunctionDetailsContextProvider(this);
        return contextprovider;
    }

    return null;
  }

}