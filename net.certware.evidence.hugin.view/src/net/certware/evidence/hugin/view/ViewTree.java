package net.certware.evidence.hugin.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.handlers.LinkEditor;
import net.certware.core.ui.help.IHelpContext;
import net.certware.core.ui.listeners.ActiveEditorListener;
import net.certware.core.ui.log.CertWareLog;
import net.certware.core.ui.resources.FileFinder;
import net.certware.core.ui.resources.FileOpener;
import net.certware.core.ui.views.ICertWareView;
import net.certware.evidence.hugin.view.help.ContextProvider;
import net.certware.evidence.hugin.view.preferences.PreferenceConstants;
import net.certware.evidence.hugin.view.tree.VariableNode;
import net.certware.evidence.hugin.view.tree.VariableNodeState;
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
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.TreeViewerEditor;
import org.eclipse.jface.viewers.TreeViewerFocusCellManager;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeColumn;
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
import org.eclipse.ui.services.IEvaluationService;

import edu.ucla.belief.BeliefNetwork;
import edu.ucla.belief.io.hugin.HuginNode;
import edu.ucla.belief.sensitivity.SensitivityEngine;

/**
 * Provides a tree view of a network model.
 * @author mrb
 * @since 1.2.1
 */
public class ViewTree extends ViewPart implements ICertWareConstants, ICertWareView, ISelectionListener, ISaveablePart2, IResourceChangeListener, IAdaptable, IHelpContext {

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
	/** tree viewer */
	private TreeViewer treeViewer;
	/** context heading form section */
	private Section context;
	/** sensitivity settings */
	private Section sensitivity;
	/** analysis results form section */
	private Section results;
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
	/** sensitivity client composite */
	private Composite sensitivityClient;
	/** results client composite for dynamic update */
	private Composite resultsClient;
	/** network name prefix */
	private static final String NETWORK_LABEL = "Network: ";
	/** network name tool tip */
	private static final String NETWORK_TOOL_TIP = "Network model name";
	/** memento for section expanded */
	private static final String MEMENTO_SECTION_CONTEXT = "memento.context"; //$NON-NLS-1$
	/** memento for section expanded */
	private static final String MEMENTO_SECTION_RESULTS = "memento.results"; //$NON-NLS-1$
	/** memento for section expanded */
	private static final String MEMENTO_SECTION_SENSITIVITY = "memento.sensitivity"; //$NON-NLS-1$
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
	/** number of columns */
	private static final int COLUMN_COUNT = 2;
	/** sensitivity operator */
	private String sensitivityOperator = SensitivityEngine.OPERATOR_GTE;
	/** sensitivity threshold text field */
	private Text thresholdText;


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
		memento.putBoolean(MEMENTO_SECTION_SENSITIVITY, sensitivity.isExpanded() );
		memento.putBoolean(MEMENTO_SECTION_RESULTS, results.isExpanded() );
		memento.putBoolean(MEMENTO_SECTION_ITEMS, items.isExpanded() );

		memento.putBoolean(MEMENTO_FILTER_DISCRETE, itemDiscreteFilterMenuItem.getSelection());
		memento.putBoolean(MEMENTO_FILTER_CONTINUOUS, itemContinuousFilterMenuItem.getSelection());
		memento.putBoolean(MEMENTO_FILTER_DECISION, itemDecisionFilterMenuItem.getSelection());
		memento.putBoolean(MEMENTO_FILTER_UTILITY, itemUtilityFilterMenuItem.getSelection());
	}

	/**
	 * Set the context IDs for help system.  
	 * Wait to call until site has been established.
	 * @param control Control
	 */
	private void setHelpContextIDs(Control control) {
		IWorkbenchHelpSystem helpSystem = getSite().getWorkbenchWindow().getWorkbench().getHelpSystem();
		helpSystem.setHelp(control, IHelpContext.SAMIAM_ANALYSIS_VIEW);
	}

	/**
	 * Get the tree viewer. 
	 * Normally used for refreshing content from handlers.
	 * @return tree viewer
	 */
	public TreeViewer getTreeViewer() {
		return treeViewer;
	}

	/**
	 * Selection listener to sort columns.
	 * @param tvc table column
	 * @param sorter sorter to apply
	 */
	private void addSelectionSorter(final TreeViewerColumn tvc, final TreeSorter sorter) {
		tvc.getColumn().addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				sorter.setColumn(tvc.getColumn().getText());
				treeViewer.refresh(true,true);
				TreeColumn c = (TreeColumn)e.getSource();
				setColumnImages(sorter,c);
				treeViewer.getControl().redraw();
				form.layout(true);
			}
		});
	}

	/**
	 * Set the column header images according to sort direction.
	 * @param sorter tree sorter
	 * @param sc selected column to assign image
	 */
	private void setColumnImages(TreeSorter sorter, TreeColumn sc) {
		// clear all current images
		for ( int c = 0; c < treeViewer.getTree().getColumnCount(); c++ ) {
			TreeColumn tc = treeViewer.getTree().getColumn(c);
			tc.setImage(null);
		}

		// set the selected column's image according to sort direction
		sc.setImage(Activator.getDefault().getImageRegistry().get( sorter.getDirection() == SWT.UP ? 
				Activator.ASCENDING_IMAGE :
					Activator.DESCENDING_IMAGE ));
	}

	/**
	 * Creates and handles a column header menu to change column visibility.
	 * Item is enabled if column is resizable.
	 * Item is initially selected if its width is greater than zero.
	 * @param parent header menu
	 * @param column column for menu choice
	 */
	private void createMenuItem(Menu parent, final TreeViewerColumn treeViewerColumn) {
		final MenuItem itemName = new MenuItem(parent, SWT.CHECK);
		final TreeColumn column = treeViewerColumn.getColumn();
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
	 * Refreshes the state object and its siblings in the tree view.
	 * @param state state to refresh
	 */
	public void refreshViewerState(VariableNodeState state) {
		VariableNode parent = state.getContainer();
		for ( VariableNodeState child : parent.states ) {
			treeViewer.refresh(child); // forces image change
		}
	}

	/**
	 * Forces a re-evaluation of the properties for contribution states.
	 * Evaluates the {@code isSelected} property.
	 */
	public void refreshViewProperties() {
		String property = "net.certware.evidence.hugin.isSelected"; //$NON-NLS-1$
		IEvaluationService es = (IEvaluationService) PlatformUI.getWorkbench().getService(IEvaluationService.class);
		es.requestEvaluation(property);
	}

	/**
	 * Layout the form after computations.
	 */
	public void layout() {
		Display.getDefault().asyncExec(new Runnable(){
			public void run() {
				// form.reflow(true);
				results.getClient().pack(true);
				results.getParent().layout(true);
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
		form.setText("Network Analysis");
		form.setToolTipText("Select a Hugin network model");
		toolkit.decorateFormHeading(form.getForm());
		form.setImage(Activator.getDefault().getImageRegistry().getDescriptor(Activator.NETWORK_IMAGE).createImage());
		clearMessage();

		// layout
		TableWrapLayout layout = new TableWrapLayout();
		layout.numColumns = 2;
		form.getBody().setLayout(layout);
		int sectionStyle = Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED; // Section.DESCRIPTION

		// context section
		context = toolkit.createSection(form.getBody(),	sectionStyle);
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

		// sensitivity section
		sensitivity = toolkit.createSection(form.getBody(), sectionStyle);
		twd = new TableWrapData(TableWrapData.FILL);
		twd.colspan = 2;
		sensitivity.setLayoutData(twd);
		sensitivity.setText("Sentivity Analysis Settings");
		sensitivity.setToolTipText("Calculation parameters for next analysis");
		sensitivity.addExpansionListener(new ExpansionAdapter() {
			@Override
			public void expansionStateChanged(ExpansionEvent e) {
				form.layout(true);
				form.reflow(true);
			}
		});

		sensitivityClient = toolkit.createComposite(sensitivity);
		sensitivityClient.setLayout(new GridLayout(2,false));

		// sensitivity comparison
		Label operatorLabel = toolkit.createLabel(sensitivityClient, "Comparison Operator");
		operatorLabel.setFont(JFaceResources.getDialogFont());
		operatorLabel.setLayoutData(new GridData(SWT.BEGINNING,SWT.CENTER,false,false));
		Composite operatorGroup = toolkit.createComposite(sensitivityClient);
		operatorGroup.setLayoutData(new GridData(SWT.BEGINNING,SWT.FILL,true,false));
		operatorGroup.setLayout(new GridLayout(3,true));

		Button operatorButtonEquals = toolkit.createButton(operatorGroup, "==",SWT.RADIO);
		operatorButtonEquals.setLayoutData(new GridData(SWT.BEGINNING,SWT.CENTER,false,false));
		operatorButtonEquals.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(final SelectionEvent se) {
				se.display.asyncExec(new Runnable(){
					@Override
					public void run() {
						Button b = (Button)se.widget;
						if ( b.getSelection() ) {
							sensitivityOperator = SensitivityEngine.OPERATOR_EQUALS;
						}
			}});}});
		Button operatorButtonLessthan = toolkit.createButton(operatorGroup, "<=",SWT.RADIO);
		operatorButtonLessthan.setLayoutData(new GridData(SWT.BEGINNING,SWT.CENTER,false,false));
		operatorButtonLessthan.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(final SelectionEvent se) {
				se.display.asyncExec(new Runnable(){
					@Override
					public void run() {
						Button b = (Button)se.widget;
						if ( b.getSelection() ) {
							sensitivityOperator = SensitivityEngine.OPERATOR_LTE;
						}
			}});}});
		Button operatorButtonGreaterthan = toolkit.createButton(operatorGroup, ">=",SWT.RADIO);
		operatorButtonGreaterthan.setLayoutData(new GridData(SWT.BEGINNING,SWT.CENTER,false,false));
		operatorButtonGreaterthan.setSelection(true); // should align with field default
		operatorButtonGreaterthan.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(final SelectionEvent se) {
				se.display.asyncExec(new Runnable(){
					@Override
					public void run() {
						Button b = (Button)se.widget;
						if ( b.getSelection() ) {
							sensitivityOperator = SensitivityEngine.OPERATOR_GTE;
						}
			}});}});

		// sensitivity threshold
		Label thresholdLabel = toolkit.createLabel(sensitivityClient, "Comparison Threshold");
		thresholdLabel.setFont(JFaceResources.getDialogFont());
		thresholdLabel.setLayoutData(new GridData(SWT.BEGINNING,SWT.CENTER,false,false));

		thresholdText = toolkit.createText(sensitivityClient, "0.8");
		thresholdText.setFont(JFaceResources.getTextFont());
		thresholdText.setLayoutData(new GridData(SWT.BEGINNING,SWT.CENTER,false,false));
		thresholdText.setEditable(true);
		thresholdText.setMessage("Enter threshold value");
		thresholdText.setTextLimit(8);
		thresholdText.setToolTipText("Enter threshold decimal value (0-1)");
		thresholdText.addKeyListener(new KeyListener(){
			/**
			 * Allow only numbers and a period, along with traversals.
			 * Idea is to help ensure parsing as double succeeds later when fetched.
			 */
			@Override
			public void keyPressed(KeyEvent ke) {
				ke.doit = true;
				if ( ke.character == '.') {
					// disallow more than one decimal point
					if ( thresholdText.getText().indexOf('.') >= 0 ) {
						ke.doit = false;
					}
					return;
				}
				if ( Character.isLetter( ke.character )) {
					ke.doit = false;
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}});
		/*
		thresholdText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent me) {
				String t = thresholdText.getText();
				if ( t == null || t == "" ) {
					return;
				}
				try {
					Double.parseDouble(t);
					thresholdText.setMessage("");
				} catch( NumberFormatException nfe ) {
					thresholdText.setMessage("Value must be decimal value");
				}
			}});
		 */

		sensitivity.setClient(sensitivityClient);
		sensitivity.setExpanded(false);

		// results section 
		results = toolkit.createSection(form.getBody(), sectionStyle);
		twd = new TableWrapData(TableWrapData.FILL);
		twd.colspan = 2;
		results.setLayoutData(twd);
		results.setText("Analysis Results");
		results.setToolTipText("Results from latest analysis");
		results.addExpansionListener(new ExpansionAdapter() {
			@Override
			public void expansionStateChanged(ExpansionEvent e) {
				form.layout(true);
				form.reflow(true);
			}
		});

		resultsClient = toolkit.createComposite(results);
		resultsClient.setLayout(new GridLayout(2,false));
		results.setClient(resultsClient);

		// items section
		items = toolkit.createSection(form.getBody(), sectionStyle );
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
		Composite treeClient = toolkit.createComposite(items);
		treeClient.setLayout(new FillLayout());

		// create the table
		treeViewer = new TreeViewer(treeClient, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION);
		treeViewer.getTree().setLinesVisible(true);
		treeViewer.getTree().setHeaderVisible(true);
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener(){
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();

				if ( selection instanceof IStructuredSelection ) {
					IStructuredSelection iss = (IStructuredSelection)selection;
					Object first = iss.getFirstElement();
					if ( first instanceof VariableNode ) {
						VariableNode n = (VariableNode)first;
						n.setSelected( ! n.isSelected() ); // toggle
						treeViewer.refresh(n); // forces image change
					}
					if ( first instanceof VariableNodeState ) {
						VariableNodeState s = (VariableNodeState)first;
						s.clearSiblings(); // clear other states, mutually exclusive
						s.setSelected( ! s.isSelected() ); // toggle

						// update images in the container set
						refreshViewerState(s);
					}

					// force refresh of menu item conditional tests
					refreshViewProperties();
				}

			}});
		GridData gridData = new GridData(GridData.FILL_BOTH);
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalSpan = 3;
		final Menu headerMenu = new Menu(treeViewer.getControl());

		// focus manager
		TreeViewerFocusCellManager focusCellManager = 
			new TreeViewerFocusCellManager(treeViewer,
					new FocusCellOwnerDrawHighlighter(treeViewer));
		ColumnViewerEditorActivationStrategy actSupport = 
			new ColumnViewerEditorActivationStrategy(treeViewer) {
			protected boolean isEditorActivationEvent(ColumnViewerEditorActivationEvent event) {
				return event.eventType == ColumnViewerEditorActivationEvent.TRAVERSAL
				|| event.eventType == ColumnViewerEditorActivationEvent.MOUSE_DOUBLE_CLICK_SELECTION
				|| (event.eventType == ColumnViewerEditorActivationEvent.KEY_PRESSED && event.keyCode == SWT.CR)
				|| event.eventType == ColumnViewerEditorActivationEvent.PROGRAMMATIC;
			}
		};

		TreeViewerEditor.create(treeViewer, focusCellManager, actSupport, 
				ColumnViewerEditor.TABBING_HORIZONTAL
				| ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR
				| ColumnViewerEditor.TABBING_VERTICAL 
				| ColumnViewerEditor.KEYBOARD_ACTIVATION);

		// final TextCellEditor textCellEditor = new TextCellEditor(treeViewer.getTree());

		// column 0
		TreeViewerColumn idColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		idColumn.getColumn().setWidth(200);
		idColumn.getColumn().setMoveable(true);
		idColumn.getColumn().setResizable(true);
		idColumn.getColumn().setText("Nodes/Values");
		createMenuItem(headerMenu,idColumn);
		idColumn.setLabelProvider(new ColumnLabelProvider() {
			/**
			 * Get the column cell image.
			 * If item is selected, return a distinguishing image.
			 */
			public Image getImage(Object element) {

				if ( element instanceof VariableNode ) {
					if ( ((VariableNode)element).isSelected() ) {
						return Activator.getDefault().getImageRegistry().get(Activator.SELECTED_NODE_IMAGE);
					}
					return Activator.getDefault().getImageRegistry().get(Activator.UNSELECTED_NODE_IMAGE);
				}

				if ( element instanceof VariableNodeState ) {
					if ( ((VariableNodeState)element).isSelected() ) { 
						return Activator.getDefault().getImageRegistry().get(Activator.SELECTED_NODE_IMAGE);
					}
					return Activator.getDefault().getImageRegistry().get(Activator.UNSELECTED_NODE_IMAGE);
				}

				return null;
			}

			/**
			 * Get the column cell text.
			 */
			public String getText(Object element) {
				if ( element instanceof VariableNode ) {
					HuginNode hn = ((VariableNode)element).getNode();
					String text = String.format("%s: %s",hn.getID(),hn.getLabel());
					return text;
				}
				if ( element instanceof VariableNodeState ) {
					return ((VariableNodeState)element).getStateName();
				}
				return "c0"; //$NON-NLS-1$
			}
		});
		/*
		idColumn.setEditingSupport(new EditingSupport(treeViewer) {
			protected boolean canEdit(Object element) {
				return false;
			}
			protected CellEditor getCellEditor(Object element) {
				return textCellEditor;
			}
			protected Object getValue(Object element) {
				return ((MyModel) element).counter + "";
			}
			protected void setValue(Object element, Object value) {
				((MyModel) element).counter = Integer
						.parseInt(value.toString());
				treeViewer.update(element, null);
			}
		});
		 */		


		// column 1
		TreeViewerColumn typeColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		typeColumn.getColumn().setWidth(200);
		typeColumn.getColumn().setMoveable(true);
		typeColumn.getColumn().setText("Type");
		createMenuItem(headerMenu,typeColumn);
		typeColumn.setLabelProvider(new ColumnLabelProvider() {

			public String getText(Object element) {
				if ( element instanceof VariableNode ) {
					HuginNode hn = ((VariableNode)element).getNode();
					int type = hn.getValueType();
					switch( type ) {
					case HuginNode.DISCRETE: return "Discrete";
					case HuginNode.CONTINUOUS: return "Continuous";
					case HuginNode.DECISION: return "Decision";
					case HuginNode.UTILITY: return "Utility";
					default: return Integer.toString(type);
					}
				}
				return ""; //$NON-NLS-1$
			}
		});
		/*
		typeColumn.setEditingSupport(new EditingSupport(treeViewer) {
			protected boolean canEdit(Object element) {
				return false;
			}

			protected CellEditor getCellEditor(Object element) {
				return textCellEditor;
			}

			protected Object getValue(Object element) {
				return ((MyModel) element).counter + "";
			}

			protected void setValue(Object element, Object value) {
				((MyModel) element).counter = Integer.parseInt(value.toString());
				treeViewer.update(element, null);
			}
		});
		 */

		// column 2
		TreeViewerColumn marginalColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		marginalColumn.getColumn().setWidth(200);
		marginalColumn.getColumn().setMoveable(true);
		marginalColumn.getColumn().setText("Marginal");
		createMenuItem(headerMenu,marginalColumn);
		marginalColumn.setLabelProvider(new ColumnLabelProvider() {
			public String getText(Object element) {
				if ( element instanceof VariableNodeState ) {
					VariableNodeState vns = (VariableNodeState)element;
					return Double.toString(vns.getMarginal());
				}
				return ""; //$NON-NLS-1$
			}
		});

		// table sorting on columns
		TreeSorter sorter = new TreeSorter(treeViewer);
		treeViewer.setSorter(sorter);
		addSelectionSorter(idColumn, sorter);
		addSelectionSorter(typeColumn, sorter);
		addSelectionSorter(marginalColumn, sorter);
		setColumnImages(sorter, idColumn.getColumn());

		// content
		treeViewer.setContentProvider(new NetworkContentProvider());
		treeViewer.setInput(selectedNetwork);		

		// add filters to the header menu 
		createMenuSeparator(headerMenu);
		ViewerFilter discreteFilter = new ResultFilter(0);
		ViewerFilter continuousFilter = new ResultFilter(1);
		ViewerFilter decisionFilter = new ResultFilter(2);
		ViewerFilter utilityFilter = new ResultFilter(3);
		itemDiscreteFilterMenuItem = createMenuFilterItem(headerMenu,"Hide Discrete",discreteFilter,false);
		itemContinuousFilterMenuItem = createMenuFilterItem(headerMenu,"Hide Continuous",continuousFilter,false);
		itemDecisionFilterMenuItem = createMenuFilterItem(headerMenu,"Hide Decision",decisionFilter,false);
		itemUtilityFilterMenuItem = createMenuFilterItem(headerMenu,"Hide Utility",utilityFilter,false);

		items.setClient(treeClient);

		// create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(form, IHelpContext.SAMIAM_ANALYSIS_VIEW); 

		// add the selection listener
		// add the resource listener
		// add editor listener
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, 
				IResourceChangeEvent.POST_CHANGE | 
				IResourceChangeEvent.PRE_CLOSE | 
				IResourceChangeEvent.PRE_DELETE );

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
			sensitivity.setExpanded( memento.getBoolean( MEMENTO_SECTION_SENSITIVITY));

			// filter states
			// set the menu item toggle and add the filter
			if (  memento.getBoolean(MEMENTO_FILTER_DISCRETE) ) {
				itemDiscreteFilterMenuItem.setSelection( true );
				treeViewer.addFilter(discreteFilter);
			}
			if (  memento.getBoolean(MEMENTO_FILTER_CONTINUOUS) ) {
				itemContinuousFilterMenuItem.setSelection( true );
				treeViewer.addFilter(continuousFilter);
			}
			if (  memento.getBoolean(MEMENTO_FILTER_DECISION) ) {
				itemDecisionFilterMenuItem.setSelection( true );
				treeViewer.addFilter(decisionFilter);
			}
			if (  memento.getBoolean(MEMENTO_FILTER_UTILITY) ) {
				itemUtilityFilterMenuItem.setSelection( true );
				treeViewer.addFilter(utilityFilter);
			}
		}

		setHelpContextIDs(parent);

		form.layout();
	}

	/**
	 * Clears the results client by disposing of its children.
	 */
	public void clearResults() {
		Display.getDefault().asyncExec(new Runnable(){
			public void run() {
				for ( Control c : resultsClient.getChildren() ) {
					c.dispose();
				}
				results.layout(true);
			}
		});
	}

	/**
	 * Adds a results client entry of one label and one value.
	 * Presumes a grid layout with two columns.
	 * @param label row label, first column
	 * @param value row value, second column
	 */
	public void addResult(final String label, final String value) {
		Display.getDefault().asyncExec(new Runnable(){
			public void run() {
				Label l1 = toolkit.createLabel(resultsClient, label);
				l1.setLayoutData(new GridData(SWT.BEGINNING,SWT.CENTER,false,false,1,1));
				Label l2 = toolkit.createLabel(resultsClient, value);
				l2.setLayoutData(new GridData(SWT.BEGINNING,SWT.CENTER,false,false,1,1));
			}
		});
	}

	/**
	 * Adds all results client entries of one label and one value.
	 * Presumes a grid layout with two columns.
	 * We use a {@code LinkedHashMap} here so results appear in same order as loaded.
	 * @param rows map of labels and values
	 */
	public void addResult(final LinkedHashMap<String,String> rows) {
		Display.getDefault().asyncExec(new Runnable(){
			public void run() {
				for ( Control c : resultsClient.getChildren() ) {
					c.dispose();
				}
				Set<String> keys = rows.keySet();
				for ( Object s : keys.toArray() ) {
					String label = (String)s;
					String value = (String)rows.get(s);
					Label l1 = toolkit.createLabel(resultsClient, label);
					l1.setLayoutData(new GridData(SWT.BEGINNING,SWT.CENTER,false,false,1,1));
					Label l2 = toolkit.createLabel(resultsClient, value);
					l2.setLayoutData(new GridData(SWT.BEGINNING,SWT.CENTER,false,false,1,1));
				}
				results.layout(true);
				form.reflow(true);
			}});
	}

	/**
	 * Sensitivity analysis operator selection.
	 * @return operator, one of values from {@code SensitivityEngine}
	 */
	public String getSensitivityOperator() {
		return sensitivityOperator;
	}

	/**
	 * Sensitivity analysis threshold value.
	 * Writes to widget message if parsing fails.
	 * @return value, if parsed from text string as double
	 */
	public double getSensitivityThreshold() {
		double rv = 0.0;
		String sv = thresholdText.getText();
		if ( sv != null && sv != "" ) {
			try {
				rv = Double.parseDouble(sv);
			} catch( NumberFormatException nfe ) {
				thresholdText.setMessage("Threshold value invalid");
			}
		}
		return rv;
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
					treeViewer.addFilter(filter);
				} else {
					treeViewer.removeFilter(filter);
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
	 * Sets the form information message.
	 * @param message message for form header
	 */
	public void setInfoMessage(final String message) {
		Display.getDefault().asyncExec(new Runnable(){
			public void run() {
				form.setMessage(message, IMessageProvider.INFORMATION);
			}});
	}

	/**
	 * Sets the form warning message.
	 * @param message message for form header
	 */
	public void setWarningMessage(final String message) {
		Display.getDefault().asyncExec(new Runnable(){
			public void run() {
				form.setMessage(message, IMessageProvider.WARNING);
			}});
	}

	/**
	 * Sets the form error message.
	 * @param message message for form header
	 */
	public void setErrorMessage(final String message) {
		Display.getDefault().asyncExec(new Runnable(){
			public void run() {
				form.setMessage(message, IMessageProvider.ERROR);
			}});
	}

	/**
	 * Clears the form information message.
	 */
	public void clearMessage() {
		Display.getDefault().asyncExec(new Runnable(){
			public void run() {
				form.setMessage(null, IMessageProvider.NONE); //$NON-NLS-1$
			}});
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

		try {
			IHandlerService handlerService = (IHandlerService) getSite().getService(IHandlerService.class); 
			handlerService.executeCommand(commandId, null);
			setDirty(false);
		} catch( Exception e ) {
			CertWareLog.logError("Saving network model",e);
		}

	}

	/**
	 * Save as not supported, no changes to model made here.  Copy the resource instead.
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

		treeViewer.setInput( selectedNetwork ); 
		treeViewer.refresh();
		treeViewer.getControl().pack(true);
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

				treeViewer.getTree().setItemCount(0);
				treeViewer.refresh();

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
	@SuppressWarnings("unchecked")
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {

		// skip selection if not structured
		if ( ! (selection instanceof IStructuredSelection ))
			return;

		// skip repeat selections
		if ( latestSelection == selection ) {
			return;
		}

		IStructuredSelection iss = (IStructuredSelection)selection;

		// selecting from the explorer
		if ( iss.getFirstElement() instanceof IFile ) {
			IFile newSelection = (IFile)iss.getFirstElement();
			if ( newSelection.getFileExtension().endsWith(ICertWareConstants.NET_EXTENSION) ) {
				if ( setSelectedFile(newSelection) ) {
					latestSelection = selection;
				}
			}
			return;
		} 

		// selecting from our node tree
		for ( Iterator<Object> i = iss.iterator(); i.hasNext(); ) {
			Object o = i.next();
			if ( o instanceof VariableNode ) {
				((VariableNode)o).setSelected(true);
				continue;
			}
			if ( o instanceof VariableNodeState ) {
				VariableNodeState vns = (VariableNodeState)o;
				vns.setSelected(true);
				continue;
			}
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
	 * Return the latest selection, an {@code IStructuredSelection}.
	 * @return latest selection
	 */
	public ISelection getSelection() {
		return this.latestSelection;
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
	 * @param adapter context provider type desired
	 * @return context provider 
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(Class)
	 */
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {

		if (IContextProvider.class.equals(adapter)) {
			return new ContextProvider(this, 
					IHelpContext.SAMIAM_ANALYSIS_VIEW,
					(IStructuredSelection) getSelection());
		}

		return super.getAdapter(adapter);
	}

	@Override
	public String getDefaultExtension() {
		return ICertWareConstants.NET_EXTENSION;
	}

	/**
	 * Whether the tree content has selected variable items.
	 * @return true if any variable selected
	 */
	public boolean hasVariableSelections() {
		if ( treeViewer != null ) {
			NetworkContentProvider ncp = (NetworkContentProvider)treeViewer.getContentProvider();
			if ( ncp != null ) {
				for ( VariableNode v : ncp.roots ) {
					if ( v.isSelected() ) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Whether settings for sensitivity calculations are selected.
	 * @return true if settings sufficient, false otherwise
	 */
	public boolean hasSensitivitySelections() {
		return true;
	}

	/**
	 * Whether the tree content has selected variable state items.
	 * @return true if any variable selected
	 */
	public boolean hasVariableStateSelections() {
		if ( treeViewer != null ) {
			NetworkContentProvider ncp = (NetworkContentProvider)treeViewer.getContentProvider();
			if ( ncp != null ) {
				for ( VariableNode v : ncp.roots ) {
					for ( VariableNodeState s : v.states ) {
						if ( s.isSelected() ) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	/**
	 * Returns the list of variable nodes from the tree viewer.
	 * @return list of variable nodes or null if viewer or content provider not established
	 */
	public List<VariableNode> getVariableNodes() {
		if ( treeViewer != null ) {
			NetworkContentProvider ncp = (NetworkContentProvider)treeViewer.getContentProvider();
			if ( ncp != null ) {
				return ncp.roots;
			}
		}

		return null;
	}

	/**
	 * Tree network content provider.
	 * @author mrb
	 */
	private class NetworkContentProvider implements ITreeContentProvider {
		/** the master model behind the tree */
		private BeliefNetwork input = null;
		/** the top-level items in the viewer are the network variables */
		ArrayList<VariableNode> roots = new ArrayList<VariableNode>();

		/**
		 * Translates the belief network node list into our local array for display.
		 * @param inputElement the selected resource, presumed to be a {@code BeliefNetwork}
		 * @return array of {@code MyNode} elements, or empty object list
		 */
		public Object[] getElements(Object inputElement) {
			if ( inputElement instanceof BeliefNetwork ) {
				BeliefNetwork bn = (BeliefNetwork)inputElement;
				roots.clear();
				for ( Object o : bn.topologicalOrder().toArray() ) {
					roots.add(new VariableNode((HuginNode)o));
				}
				return roots.toArray();
			}

			return new Object[0];
		}

		/**
		 * Dispose of the content provider.  Unused.
		 */
		public void dispose() {
		}

		/**
		 * Model input changed.  Saves the reference to the new input model.
		 * @param viewer tree viewer, unused
		 * @param oldInput old input model, unused
		 * @param newInput new input model, reference saved, presumed to be a {@code BeliefNetwork} item
		 */
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			if ( newInput instanceof BeliefNetwork ) {
				input = (BeliefNetwork)newInput;
			} else {
				// System.err.println("tcp input changed invalid input " + newInput);
			}
		}

		/**
		 * Get the children of the given parent element.
		 * @param parentElement parent element reference
		 * @return {@getElements} if {@code BeliefNetwork}, list of {@code MyState} if {@code MyNode}, empty array otherwise
		 */
		@Override
		public Object[] getChildren(Object parentElement) {

			if ( parentElement instanceof BeliefNetwork ) {
				return getElements(parentElement);
			}

			if ( parentElement instanceof VariableNode ) {
				VariableNode n = (VariableNode)parentElement;
				return n.getStates();
			}
			if ( parentElement instanceof VariableNodeState ) {
				return new Object[0];
			}

			return new Object[0];
		}

		/**
		 * Get the parent of the given element.
		 * @param element tree element reference
		 * @return {@code MyNode} if element is {@code MyState}, {@code input} if {@code MyNode}, null if null
		 */
		public Object getParent(Object element) {

			if (element == null) {
				return null;
			}

			// find the parent by linear search
			if ( element instanceof VariableNodeState ) {
				for ( VariableNode n : roots ) {
					if ( n.states.contains((VariableNodeState)element)) {
						return n;
					}
				}
			}

			// node returns the network parent
			return input;
		}

		/**
		 * Whether the given element has children
		 * @param element element expecting {@code BeliefNetwork} or {@code MyNode}
		 * @return true if element has array children, false otherwise
		 */
		public boolean hasChildren(Object element) {

			if ( element instanceof BeliefNetwork ) {
				return roots.size() > 0;
			}
			if ( element instanceof VariableNode ) {
				VariableNode n = (VariableNode)element;
				return n.states.size() > 0;
			}

			return false;
		}

	}


	/**
	 * A viewer sorter for the <code>ViewTree</code> viewer model.
	 * @author mrb
	 */
	static public class TreeSorter extends ViewerSorter {

		/** which column number to sort */
		private int propertyIndex = 0;
		/** direction of sort, up is ascending */
		private int direction = SWT.UP;
		/** table viewer reference */
		private final TreeViewer treeViewer;

		/**
		 * Constructor sets first column sort ascending.
		 * @param tableViewer reference to table viewer
		 */
		public TreeSorter(TreeViewer tv) {
			this.propertyIndex = 0;
			this.treeViewer = tv;
			direction = SWT.UP;
		}

		/**
		 * Sets the sort column given the column name.
		 * Calls <code>setColumn(int)</code> with the associated column number.
		 * @param columnName column name
		 */
		public void setColumn(String columnName) {
			for ( int i = 0; i < COLUMN_COUNT ; i++ ) {
				if ( treeViewer.getTree().getColumn(i).getText().equalsIgnoreCase(columnName)) {
					setColumn(i);
					return;
				}
			}
		}

		/**
		 * Gets the current sort direction.
		 * Up direction is ascending, down direction is descending.
		 * @return one of <code>SWT.UP</code> or <code>SWT.DOWN</code> 
		 */
		public int getDirection() {
			return direction;
		}

		/**
		 * Sets the current sort direction.
		 * Does not re-sort.
		 * Up direction is ascending, down direction is descending.
		 * @param d direction, one of SWT.UP or SWT.DOWN
		 */
		public void setDirection(int d) {
			direction = d;
		}

		/**
		 * Sets the sort column given the column number.
		 * If the column number is already set, reverses direction.
		 * @param column column number
		 */
		public void setColumn(int column) {
			if (column == this.propertyIndex) {
				// same column as last sort; toggle the direction
				direction = direction == SWT.UP ? SWT.DOWN : SWT.UP;
			} else {
				// new sort column; do an ascending sort
				this.propertyIndex = column;
				direction = SWT.UP;
			}
		}

		/**
		 * Compares objects for sorting.
		 * Uses currently selected property column.
		 * Presumes using the <code>NetworkModel</code> object model.
		 * @param viewer line value model viewer
		 * @param e1 object compare one, a line value model object
		 * @param e2 object compare two, a line value model object
		 * @return 1 for e1>e2, -1 for e1<e2, 0 for e1=e2  
		 */
		@Override
		public int compare(Viewer viewer, Object e1, Object e2) {

			if ( e1 instanceof VariableNodeState ) {
				VariableNodeState s1 = (VariableNodeState)e1;
				VariableNodeState s2 = (VariableNodeState)e2;
				if ( propertyIndex == 2 ) {
					return s1.getMarginal() > s2.getMarginal() ? 1 : -1;
				}
				return s1.getStateName().compareTo(s2.getStateName());
			}

			VariableNode p1 = (VariableNode)e1;
			VariableNode p2 = (VariableNode)e2;

			int rc = 0;
			switch (propertyIndex) {
			case 0: // id
				rc = p1.getNode().getID().compareTo(p2.getNode().getID());
				break;
			case 1: // value type
				int v1 = p1.getNode().getValueType();
				int v2 = p2.getNode().getValueType();
				if ( v1 == v2 ) rc = 0;
				else
					rc = v1 > v2 ? 1 : -1;
					break;
			default:
				rc = 0;
			}

			// if descending order, flip the direction
			if (direction == SWT.DOWN) {
				rc = -rc;
			}
			return rc;
		}
	}


	/**
	 * Provides a viewer filter for node type choice values.
	 */
	static public class ResultFilter extends ViewerFilter {

		/** choice code from result value type enumeration */
		int type;

		/**
		 * Result filter creates viewer filter and sets its type.
		 * The type is expected to be one of the {@code HuginNode} node type constants.
		 * @param type
		 */
		public ResultFilter(int type) {
			super();
			this.type = type;
		}

		/**
		 * Applies the filter on the selection.
		 * Matches the model's result field value to the value type from the constructor.
		 * @return false if selected line model matches choice, true otherwise
		 */
		@Override
		public boolean select(Viewer viewer, Object parentElement,	Object element) {
			VariableNode p = (VariableNode) element;
			if ( p == null ) 
				return true;

			if ( p.getNode().getValueType() == type )
				return false;

			return true;
		}
	}



}
