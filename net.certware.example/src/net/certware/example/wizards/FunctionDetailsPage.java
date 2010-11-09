package com.kt.codehawk.preanalysis.views.dialogs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.IExpansionListener;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

import com.kt.codehawk.preanalysis.CalledBy;
import com.kt.codehawk.preanalysis.CalledByFunctions;
import com.kt.codehawk.preanalysis.DirectCall;
import com.kt.codehawk.preanalysis.DirectFunctionCalls;
import com.kt.codehawk.preanalysis.FunctionInfo;
import com.kt.codehawk.preanalysis.LibraryCall;
import com.kt.codehawk.preanalysis.LibraryFunctionCalls;
import com.kt.codehawk.preanalysis.Parameter;
import com.kt.codehawk.preanalysis.ParameterType;
import com.kt.codehawk.preanalysis.Parameters;
import com.kt.codehawk.preanalysis.UnmodeledCall;
import com.kt.codehawk.preanalysis.UnmodeledFunctionCalls;
import com.kt.codehawk.preanalysis.views.Activator;

/**
 * A details page to reveal function information determined by the analyzer.
 * @author mrb
 */
public class FunctionDetailsPage implements IDetailsPage
{
  /** dialog settings section key */
  static final String FUNCTION_DETAILS_PAGE_SETTINGS = "FUNCTION_DETAILS_PAGE_SETTINGS";
  static final String DETAILS_SECTION_STATE = "details_section_state";
  static final String PARAMETERS_SECTION_STATE = "parameters_section_state";
  static final String CALLED_BY_SECTION_STATE = "called_by_section_state"; 
  static final String FUNCTION_CALLS_SECTION_STATE = "function_calls_section_state";
  static final String UNMODELED_FUNCTIONS_SECTION_STATE = "unmodeled_calls_section_state";
  static final String LIBRARY_CALLS_SECTION_STATE = "library_calls_section_state"; 

  /** form toolkit from host dialog */
  FormToolkit toolkit = null;
  /** the latest function info selection from the master */
  FunctionInfo functionInfo = null;
  /** the managed form containing the block */
  IManagedForm mform = null;
  /** bold font for labels */
  Font boldFont = null;
  /** normal font for values */
  Font normalFont = null;
  /** function name value */
  Label functionNameValue = null;
  /** return type */
  Label returnType = null;
  /** return values */
  Label returnValues = null;
  /** goto count value */
  Label gotosValue = null;
  /** break count value */
  Label breakValue = null;
  /** continue count value */
  Label continueValue = null;
  /** statement count value */
  Label statementCountValue = null;
  /** instruction count value */
  Label instructionCountValue = null;
  /** loop count value */
  Label loopCountValue = null;
  /** branch count value */
  Label branchCountValue = null;
  /** switch count value */
  Label switchCountValue = null;
  /** indirect call count value */
  Label indirectCallCountValue = null;
  /** complexity value */
  Label complexityValue = null;
  /** details value client */
  Composite detailsClient = null;
  /** parameters client */
  Composite parametersClient = null;
  /** called-by value client */
  Composite calledByClient = null;
  /** function calls value client */
  Composite functionCallsClient = null;
  /** library calls value client */
  Composite libraryCallsClient = null;
  /** unmodeled functions value client */
  Composite unmodeledFunctionsClient = null;
  /** details form section */
  Section detailsSection = null;
  /** parameters form section */
  Section parametersSection = null;
  /** called by form section */
  Section calledBySection = null;
  /** function calls form section */
  Section functionCallsSection = null;
  /** library calls form section */
  Section libraryCallsSection = null;
  /** unmodeled functions form section */
  Section unmodeledFunctionsSection = null;
  Map<Hyperlink,IHyperlinkListener> hyperlinkMap = new HashMap<Hyperlink,IHyperlinkListener>();
  /** unknown string substitution */
  static final String UNKNOWN = "<unknown>";

  /**
   * Creates the page structure and initial content prior to selection.
   * @param parent content composite parent
   */
  public void createContents(Composite parent)
  {
    TableWrapLayout layout = new TableWrapLayout();
    layout.topMargin = 5;
    layout.leftMargin = 5;
    layout.rightMargin = 5;
    layout.bottomMargin = 5;
    parent.setLayout(layout);

    toolkit = mform.getToolkit();
    detailsSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE);
    detailsSection.setText("Function Details");
    detailsSection.setDescription("Summary statistics identified by analyzer");
    detailsSection.setExpanded(true);
    TableWrapData td = new TableWrapData(TableWrapData.FILL, TableWrapData.TOP);
    td.grabHorizontal = true;
    detailsSection.setLayoutData(td);
    toolkit.createCompositeSeparator(detailsSection);
    detailsClient = toolkit.createComposite(detailsSection);
    GridLayout glayout = new GridLayout();
    glayout.numColumns = 2;
    detailsClient.setLayout(glayout);
    detailsSection.setClient(detailsClient);

    // function name
    Label functionNameLabel = toolkit.createLabel(detailsClient, "Function name");
    functionNameLabel.setFont(boldFont);
    functionNameLabel.setAlignment(SWT.RIGHT);
    functionNameValue = toolkit.createLabel(detailsClient,"<TBD>");
    functionNameValue.setFont(normalFont);
    functionNameValue.setAlignment(SWT.LEFT);

    // return type
    Label returnTypeLabel = toolkit.createLabel(detailsClient, "Return type");
    returnTypeLabel.setFont(boldFont);
    returnTypeLabel.setAlignment(SWT.RIGHT);
    returnType = toolkit.createLabel(detailsClient,"<TBD>");
    returnType.setFont(normalFont);
    returnType.setAlignment(SWT.LEFT);

    // return values
    Label returnValuesLabel = toolkit.createLabel(detailsClient, "Return values");
    returnValuesLabel.setFont(boldFont);
    returnValuesLabel.setAlignment(SWT.RIGHT);
    returnValues = toolkit.createLabel(detailsClient,"<TBD>");
    returnValues.setFont(normalFont);
    returnValues.setAlignment(SWT.LEFT);

    // goto count value
    Label gotosValueLabel = toolkit.createLabel(detailsClient, "Go-tos");
    gotosValueLabel.setFont(boldFont);
    gotosValueLabel.setAlignment(SWT.RIGHT);
    gotosValue = toolkit.createLabel(detailsClient,"<TBD>");
    gotosValue.setFont(normalFont);
    gotosValue.setAlignment(SWT.LEFT);

    // break count value
    Label breakValueLabel = toolkit.createLabel(detailsClient, "Breaks");
    breakValueLabel.setFont(boldFont);
    breakValueLabel.setAlignment(SWT.RIGHT);
    breakValue = toolkit.createLabel(detailsClient,"<TBD>");
    breakValue.setFont(normalFont);
    breakValue.setAlignment(SWT.LEFT);

    // continue count value
    Label continueValueLabel = toolkit.createLabel(detailsClient, "Continues");
    continueValueLabel.setFont(boldFont);
    continueValueLabel.setAlignment(SWT.RIGHT);
    continueValue = toolkit.createLabel(detailsClient,"<TBD>");
    continueValue.setFont(normalFont);
    continueValue.setAlignment(SWT.LEFT);

    /*
    // parsed value
    Label parsedValueLabel = toolkit.createLabel(detailsClient, "Parsed");
    parsedValueLabel.setFont(boldFont);
    parsedValueLabel.setAlignment(SWT.RIGHT);
    parsedValue = toolkit.createLabel(detailsClient,"<TBD>");
    parsedValue.setFont(normalFont);
    parsedValue.setAlignment(SWT.LEFT);

    // vararg value
    Label varargValueLabel = toolkit.createLabel(detailsClient, "Variable args");
    varargValueLabel.setFont(boldFont);
    varargValueLabel.setAlignment(SWT.RIGHT);
    varargValue = toolkit.createLabel(detailsClient,"<TBD>");
    varargValue.setFont(normalFont);
    varargValue.setAlignment(SWT.LEFT);

    // open verification conditions
    Label vcInfoLabel = toolkit.createLabel(detailsClient, "Open VCs");
    vcInfoLabel.setFont(boldFont);
    vcInfoLabel.setAlignment(SWT.RIGHT);
    vcInfoValue = toolkit.createLabel(detailsClient, "<TBD>");
    vcInfoValue.setFont(normalFont);
    vcInfoValue.setAlignment(SWT.LEFT);
     */

    // statement count
    Label statementCountLabel = toolkit.createLabel(detailsClient, "Statements");
    statementCountLabel.setFont(boldFont);
    statementCountLabel.setAlignment(SWT.RIGHT);
    statementCountValue = toolkit.createLabel(detailsClient,"<TBD>");
    statementCountValue.setFont(normalFont);
    statementCountValue.setAlignment(SWT.LEFT);

    // instruction count
    Label instructionCountLabel = toolkit.createLabel(detailsClient, "Instructions");
    instructionCountLabel.setFont(boldFont);
    instructionCountLabel.setAlignment(SWT.RIGHT);
    instructionCountValue = toolkit.createLabel(detailsClient,"<TBD>");
    instructionCountValue.setFont(normalFont);
    instructionCountValue.setAlignment(SWT.LEFT);

    // loop count
    Label loopCountLabel = toolkit.createLabel(detailsClient, "Loops");
    loopCountLabel.setFont(boldFont);
    loopCountLabel.setAlignment(SWT.RIGHT);
    loopCountValue = toolkit.createLabel(detailsClient,"<TBD>");
    loopCountValue.setFont(normalFont);
    loopCountValue.setAlignment(SWT.LEFT);

    // branch count
    Label branchCountLabel = toolkit.createLabel(detailsClient, "Branches");
    branchCountLabel.setFont(boldFont);
    branchCountLabel.setAlignment(SWT.RIGHT);
    branchCountValue = toolkit.createLabel(detailsClient,"<TBD>");
    branchCountValue.setFont(normalFont);
    branchCountValue.setAlignment(SWT.LEFT);

    // switch count
    Label switchCountLabel = toolkit.createLabel(detailsClient, "Switches");
    switchCountLabel.setFont(boldFont);
    switchCountLabel.setAlignment(SWT.RIGHT);
    switchCountValue = toolkit.createLabel(detailsClient,"<TBD>");
    switchCountValue.setFont(normalFont);
    switchCountValue.setAlignment(SWT.LEFT);

    // indirect call count
    Label indirectCallCountLabel = toolkit.createLabel(detailsClient, "Indirect calls");
    indirectCallCountLabel.setFont(boldFont);
    indirectCallCountLabel.setAlignment(SWT.RIGHT);
    indirectCallCountValue = toolkit.createLabel(detailsClient,"<TBD>");
    indirectCallCountValue.setFont(normalFont);
    indirectCallCountValue.setAlignment(SWT.LEFT);

    // complexity value
    Label complexityCountLabel = toolkit.createLabel(detailsClient, "Cyclomatic complexity");
    complexityCountLabel.setFont(boldFont);
    complexityCountLabel.setAlignment(SWT.RIGHT);
    complexityValue = toolkit.createLabel(detailsClient,"<TBD>");
    complexityValue.setFont(normalFont);
    complexityValue.setAlignment(SWT.LEFT);

    // parameters section
    parametersSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE);
    parametersSection.setText("Parameters");
    parametersSection.setDescription("Function parameter signature");
    td = new TableWrapData(TableWrapData.FILL, TableWrapData.TOP);
    td.grabHorizontal = true;
    parametersSection.setLayoutData(td);
    toolkit.createCompositeSeparator(parametersSection);
    parametersClient = toolkit.createComposite(parametersSection);
    GridLayout gd = new GridLayout();
    gd.numColumns = 2;
    parametersClient.setLayout(gd);
    parametersSection.setClient(parametersClient);

    // called by section
    calledBySection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE);
    calledBySection.setText("Called By");
    calledBySection.setDescription("Function called by references");
    td = new TableWrapData(TableWrapData.FILL, TableWrapData.TOP);
    td.grabHorizontal = true;
    calledBySection.setLayoutData(td);
    toolkit.createCompositeSeparator(calledBySection);
    calledByClient = toolkit.createComposite(calledBySection);
    gd = new GridLayout();
    gd.numColumns = 1;
    calledByClient.setLayout(gd);
    calledBySection.setClient(calledByClient);

    // function calls section
    functionCallsSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE);
    functionCallsSection.setText("Function Calls");
    functionCallsSection.setDescription("Functions called by function");
    td = new TableWrapData(TableWrapData.FILL, TableWrapData.TOP);
    td.grabHorizontal = true;
    functionCallsSection.setLayoutData(td);
    toolkit.createCompositeSeparator(functionCallsSection);
    functionCallsClient = toolkit.createComposite(functionCallsSection);
    gd = new GridLayout();
    gd.numColumns = 1;
    functionCallsClient.setLayout(gd);
    functionCallsSection.setClient(functionCallsClient);

    // library calls section
    libraryCallsSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE);
    libraryCallsSection.setText("Library Calls");
    libraryCallsSection.setDescription("Library functions called from function");
    td = new TableWrapData(TableWrapData.FILL, TableWrapData.TOP);
    td.grabHorizontal = true;
    libraryCallsSection.setLayoutData(td);
    toolkit.createCompositeSeparator(libraryCallsSection);
    libraryCallsClient = toolkit.createComposite(libraryCallsSection);
    gd = new GridLayout();
    gd.numColumns = 1;
    libraryCallsClient.setLayout(gd);
    libraryCallsSection.setClient(libraryCallsClient);

    // unmodeled calls section
    unmodeledFunctionsSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE);
    unmodeledFunctionsSection.setText("Unmodeled Functions");
    unmodeledFunctionsSection.setDescription("Functions not modeled in analysis");
    td = new TableWrapData(TableWrapData.FILL, TableWrapData.TOP);
    td.grabHorizontal = true;
    unmodeledFunctionsSection.setLayoutData(td);
    toolkit.createCompositeSeparator(unmodeledFunctionsSection);
    unmodeledFunctionsClient = toolkit.createComposite(unmodeledFunctionsSection);
    gd = new GridLayout();
    gd.numColumns = 1;
    unmodeledFunctionsClient.setLayout(gd);
    unmodeledFunctionsSection.setClient(unmodeledFunctionsClient);

    // recover expanded state from the dialog settings store
    IDialogSettings settings = Activator.getDefault().getDialogSettings();
    IDialogSettings tsection = settings.getSection(FUNCTION_DETAILS_PAGE_SETTINGS);
    if (tsection == null) {
      tsection = settings.addNewSection(FUNCTION_DETAILS_PAGE_SETTINGS);
    }
    final IDialogSettings section = tsection;

    // recover historical state
    // add listeners to save historical state
    detailsSection.setExpanded(section.getBoolean(DETAILS_SECTION_STATE));
    detailsSection.addExpansionListener(new IExpansionListener(){
      public void expansionStateChanged(ExpansionEvent e) {
        section.put(DETAILS_SECTION_STATE, e.getState() );
      }
      public void expansionStateChanging(ExpansionEvent e) {
      }});
    parametersSection.setExpanded(section.getBoolean(PARAMETERS_SECTION_STATE));
    parametersSection.addExpansionListener(new IExpansionListener(){
      public void expansionStateChanged(ExpansionEvent e) {
        section.put(PARAMETERS_SECTION_STATE, e.getState() );
      }
      public void expansionStateChanging(ExpansionEvent e) {
      }});
    calledBySection.setExpanded(section.getBoolean(CALLED_BY_SECTION_STATE) );
    calledBySection.addExpansionListener(new IExpansionListener(){
      public void expansionStateChanged(ExpansionEvent e) {
        section.put(CALLED_BY_SECTION_STATE, e.getState() );
      }
      public void expansionStateChanging(ExpansionEvent e) {
      }});
    functionCallsSection.setExpanded(section.getBoolean(FUNCTION_CALLS_SECTION_STATE));
    functionCallsSection.addExpansionListener(new IExpansionListener(){
      public void expansionStateChanged(ExpansionEvent e) {
        section.put(FUNCTION_CALLS_SECTION_STATE, e.getState() );
      }
      public void expansionStateChanging(ExpansionEvent e) {
      }});
    libraryCallsSection.setExpanded(section.getBoolean(LIBRARY_CALLS_SECTION_STATE));
    libraryCallsSection.addExpansionListener(new IExpansionListener(){
      public void expansionStateChanged(ExpansionEvent e) {
        section.put(LIBRARY_CALLS_SECTION_STATE, e.getState() );
      }
      public void expansionStateChanging(ExpansionEvent e) {
      }});
    unmodeledFunctionsSection.setExpanded(section.getBoolean(UNMODELED_FUNCTIONS_SECTION_STATE));
    unmodeledFunctionsSection.addExpansionListener(new IExpansionListener(){
      public void expansionStateChanged(ExpansionEvent e) {
        section.put(UNMODELED_FUNCTIONS_SECTION_STATE, e.getState() );
      }
      public void expansionStateChanging(ExpansionEvent e) {
      }});

  }

  /**
   * Commit a save.  Unused.
   */
  public void commit(boolean onSave) {
  }

  /**
   * Clean up. Dispose of fonts.  Save expanded section states.
   */
  public void dispose() {

    // dispose of fonts
    if ( normalFont != null ) normalFont.dispose();
    if ( boldFont != null ) boldFont.dispose();

    // put values back into dialog store
    IDialogSettings settings = Activator.getDefault().getDialogSettings();
    IDialogSettings section = settings.getSection(FUNCTION_DETAILS_PAGE_SETTINGS);
    section.put(DETAILS_SECTION_STATE, detailsSection.isExpanded());
    section.put(PARAMETERS_SECTION_STATE, parametersSection.isExpanded());
    section.put(CALLED_BY_SECTION_STATE, calledBySection.isExpanded());
    section.put(FUNCTION_CALLS_SECTION_STATE, functionCallsSection.isExpanded());
    section.put(LIBRARY_CALLS_SECTION_STATE, libraryCallsSection.isExpanded());
    section.put(UNMODELED_FUNCTIONS_SECTION_STATE, unmodeledFunctionsSection.isExpanded());
  }

  /**
   * Initialize the page resources.
   * Creates some fonts.
   */
  public void initialize(IManagedForm form) {
    mform = form;

    // create some fonts
    FontDescriptor d = JFaceResources.getDefaultFontDescriptor();
    d = d.setStyle(SWT.BOLD);
    boldFont = new Font(form.getForm().getDisplay(),d.getFontData());
    d = d.setStyle(SWT.NORMAL);
    normalFont = new Font(form.getForm().getDisplay(),d.getFontData());
  }

  /**
   * Whether dirty from editing.  Unused.
   * @return always returns false
   */
  public boolean isDirty() {
    return false;
  }

  /**
   * Whether stale for refresh.  Unused.
   * @return always returns false
   */
  public boolean isStale() {
    return false;
  }

  /**
   * Refreshes the page with data from a new selection.
   */
  private void update() {
    if ( functionInfo == null )
      return;

    String f = functionInfo.getName();

    int statements = 0;
    int instructions = 0;
    int loops = 0;
    int branches = 0;
    int switches = 0;
    int indirectcalls = 0;
    int complexity = 0;
    int gotos = 0;
    int breaks = 0;
    int continues = 0;
    String returnTypeString = UNKNOWN;
    String returnValuesString = UNKNOWN;


    clearHyperlinkListeners();

    clearClient(parametersClient);
    clearClient(functionCallsClient);
    clearClient(calledByClient);
    clearClient(unmodeledFunctionsClient);
    clearClient(libraryCallsClient);

    // extract details from the statistics
    // if ( functionInfo.getVcCount() != null ) vcCount = functionInfo.getOpenCount();
    if ( functionInfo.getStatementCount() != null ) statements = functionInfo.getStatementCount().getValue();
    if ( functionInfo.getInstructionCount() != null ) instructions = functionInfo.getIndirectCallsCount().getValue();
    if ( functionInfo.getLoopCount() != null ) loops = functionInfo.getLoopCount().getValue();
    if ( functionInfo.getBranchCount() != null ) branches = functionInfo.getBranchCount().getValue();
    if ( functionInfo.getIndirectCallsCount() != null ) indirectcalls = functionInfo.getIndirectCallsCount().getValue();
    if ( functionInfo.getCyclomatic() != null ) complexity = functionInfo.getCyclomatic().getValue();
    if ( functionInfo.getSwitchCount() != null ) switches = functionInfo.getSwitchCount().getValue();
    if ( functionInfo.getReturnType() != null ) returnTypeString = functionInfo.getReturnType().toString();
    if ( functionInfo.getReturnValues() != null ) returnValuesString = functionInfo.getReturnValues().toString();
    if ( functionInfo.getGotoCount() != null ) gotos = functionInfo.getGotoCount().getValue();
    if ( functionInfo.getBreakCount() != null ) breaks = functionInfo.getBreakCount().getValue();
    if ( functionInfo.getContinueCount() != null ) continues = functionInfo.getContinueCount().getValue();


    functionNameValue.setText(f);
    returnType.setText(returnTypeString == null ? UNKNOWN : returnTypeString);
    returnValues.setText(returnValuesString == null ? UNKNOWN : returnValuesString);
    gotosValue.setText(Integer.toString(gotos));
    breakValue.setText(Integer.toString(breaks));
    continueValue.setText(Integer.toString(continues));
    statementCountValue.setText(Integer.toString(statements));
    instructionCountValue.setText(Integer.toString(instructions));
    loopCountValue.setText(Integer.toString(loops));
    branchCountValue.setText(Integer.toString(branches));
    switchCountValue.setText(Integer.toString(switches));
    indirectCallCountValue.setText(Integer.toString(indirectcalls));
    complexityValue.setText(Integer.toString(complexity));

    // parameters section
    Parameters ps = functionInfo.getParameters();
    for ( Parameter p : ps.getParameter() ) {
      ParameterType pt = p.getType();
      toolkit.createLabel(parametersClient, p.getName()).setFont(boldFont);
      toolkit.createLabel(parametersClient, pt.getType());
    }

    /*
    // templates section
    if ( functionInfo != null ) {
      VcCount vcc = functionInfo.getVcCount();
      if ( vcc != null ) {
        // header row
        if ( vcc.getTemplates().isEmpty() == false ) {
          toolkit.createLabel(templatesClient, "Line").setFont(boldFont);
          toolkit.createLabel(templatesClient, "Description").setFont(boldFont);
          toolkit.createLabel(templatesClient, "Open?").setFont(boldFont);
          toolkit.createLabel(templatesClient, "Property").setFont(boldFont);
        }
        // data rows
        for ( VcTemplate vt : vcc.getTemplates() ) {
          toolkit.createLabel(templatesClient, Integer.toString(vt.getLocation().getLine()));

          // description is a hyperlink to open the associated source file
          Hyperlink hyperlink = toolkit.createHyperlink(templatesClient, vt.getDescription(), SWT.WRAP);
          hyperlink.setEnabled(true);
          hyperlink.setToolTipText("Click to open source file in editor");
          hyperlink.setHref(vt);
          IHyperlinkListener ihl = new HyperlinkAdapter() { 
            // hyperlink.addHyperlinkListener(new HyperlinkAdapter() {
            public void linkActivated(HyperlinkEvent e) {
              System.err.println("event " + e.toString());
              VcTemplate vt = (VcTemplate)e.getHref(); 
              if ( vt == null ) return;
              String sourceFile = vt.getLocation().getFile();
              int lio = sourceFile.lastIndexOf('/');
              if ( lio > 0 )
                sourceFile = sourceFile.substring(lio+1);
              // IFile myFile = FileFinder.findResourceByName(sourceFile,Activator.getDefault().getLog(),Activator.PLUGIN_ID);
              // FileOpener.findResourceEditor(myFile,Activator.getDefault().getLog(),Activator.PLUGIN_ID);
              FileOpener.editAtLineNumber(sourceFile, vt.getLocation().getLine(), Activator.getDefault().getLog(), Activator.PLUGIN_ID);
            }};
            hyperlink.addHyperlinkListener(ihl);
            hyperlinkMap.put(hyperlink,ihl);
            toolkit.createLabel(templatesClient, vt.getOpen());
            toolkit.createLabel(templatesClient, vt.getTemplateProperty());
        } // rows
      } // vcc not null
    } // fi not null
     */

    // function calls section
    DirectFunctionCalls functionCalls = functionInfo.getDirectFunctionCalls();
    for ( DirectCall dc : functionCalls.getDirectCall() ) {
      String name = dc.getFname();
      int count = dc.getFcount();
      StringBuffer sb = new StringBuffer();
      sb.append(name).append(' ').append('(').append(count).append(')');
      toolkit.createLabel(functionCallsClient, sb.toString());
    }

    // called by section
    CalledByFunctions calledBys = functionInfo.getCalledByFunctions();
    for ( CalledBy cb : calledBys.getCalledBy() ) {
      String name = cb.getFname();
      int count = cb.getFcount();
      StringBuffer sb = new StringBuffer();
      sb.append(name).append(' ').append('(').append(count).append(')');
      toolkit.createLabel(calledByClient, sb.toString());
    }

    // library calls section
    LibraryFunctionCalls libraryCalls = functionInfo.getLibraryFunctionCalls();
    for ( LibraryCall lc : libraryCalls.getLibraryCall() ) {
      String name = lc.getFname();
      int count = lc.getFcount();
      StringBuffer sb = new StringBuffer();
      sb.append(name).append(' ').append('(').append(count).append(')');
      toolkit.createLabel(libraryCallsClient, sb.toString());
    }

    // unmodeled functions section
    UnmodeledFunctionCalls ufcs = functionInfo.getUnmodeledFunctionCalls();
    for ( UnmodeledCall uc : ufcs.getUnmodeledCall() ) {
      String name = uc.getFname();
      int count = uc.getFcount();
      StringBuffer sb = new StringBuffer();
      sb.append(name).append(' ').append('(').append(count).append(')');
      toolkit.createLabel(unmodeledFunctionsClient, sb.toString());
    }

    // refresh the sections
    detailsSection.getParent().layout(true,true);
    parametersSection.getParent().layout(true,true);
    libraryCallsSection.getParent().layout(true,true);
    calledBySection.getParent().layout(true,true);
    functionCallsSection.getParent().layout(true,true);
    unmodeledFunctionsSection.getParent().layout(true,true);

    mform.reflow(true);
  }

  /**
   * Clears the hyperlink listeners and clears the map.
   * The map uses the hyperlink as key, and its listener as the value.
   */
  private void clearHyperlinkListeners() {
    Set<Hyperlink> links = hyperlinkMap.keySet();
    for ( Hyperlink h : links ) {
      IHyperlinkListener ihl = hyperlinkMap.get(h);
      h.removeHyperlinkListener(ihl);
    }

    hyperlinkMap.clear();
  }

  /**
   * Clears the client's children by disposal.
   * @param client client to clear, client remains viable
   */
  private void clearClient(Composite client) {
    if ( client != null ) {
      for ( Control control : client.getChildren() ) {
        control.dispose();
      }
      client.layout(true);
    }
  }

  /**
   * Refresh calls update.
   */
  public void refresh() {
    update();
  }

  /**
   * Sets the focus for editing.  Unused.
   */
  public void setFocus() {
  }

  /**
   * Sets the form input object.  Use this object to populate values.
   * @param input a function info object
   */
  public boolean setFormInput(Object input) {
    functionInfo = (FunctionInfo)input;
    return false;
  }

  /**
   * Responds to a selection change from the master.  
   * Listener is associated with selections of the function info class.
   * Use the first selection item to refresh our details page using <code>update()</code>.
   * @param part the form part containing selection, unused
   * @param selection the new selection, presumed structured selection
   */
  public void selectionChanged(IFormPart part, ISelection selection) {

    IStructuredSelection ssel = (IStructuredSelection)selection;
    if ( ssel == null || ssel.getFirstElement() == null )
      return;

    functionInfo = (FunctionInfo)ssel.getFirstElement();
    update();
  }

}
