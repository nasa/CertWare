package net.certware.example.wizards;

import net.certware.example.Activator;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.IExpansionListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;


/**
 * A details page for the file info analyzer records.
 * @author mrb
 */
public class PatternExamplePage implements IDetailsPage
{
  /** dialog settings section key */
  static final String FILE_DETAILS_PAGE_SETTINGS = "FILE_DETAILS_PAGE_SETTINGS";
  static final String TEMPLATES_SECTION_STATE = "templates_section_state";

  /** the form toolkit created by dialog host */
  FormToolkit toolkit = null;
  /** the latest file info selection */
  FileInfo fileInfo = null;
  /** the managed form container */
  IManagedForm mform = null;
  /** bold font labels */
  Font boldFont = null;
  /** normal font for values */
  Font normalFont = null;
  /** file name value */
  Label fileNameValue = null;
  /** function count value */
  Label functionCountValue = null;
  /** statement count value */
  Label statementCountValue = null;
  /** instruction count value */
  Label instructionCountValue = null;
  /** loop count value */
  Label loopCountValue = null;
  /** branch count value */
  Label branchCountValue = null;
  /** details client */
  Composite detailsClient = null;
  /** templates client */
  Composite templatesClient = null;
  /** templates form section */
  Section templatesSection = null;


  /**
   * Creates the initial page structure before values available.
   * @param parent page
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
    Section s1 = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
    s1.setText("File Details");
    s1.setDescription("Properties returned by the analyzer");
    TableWrapData td = new TableWrapData(TableWrapData.FILL, TableWrapData.TOP);
    td.grabHorizontal = true;
    s1.setLayoutData(td);
    toolkit.createCompositeSeparator(s1);
    detailsClient = toolkit.createComposite(s1);
    GridLayout glayout = new GridLayout();
    glayout.numColumns = 2;
    detailsClient.setLayout(glayout);

    // file name and value
    Label fileNameLabel = toolkit.createLabel(detailsClient, "File name");
    fileNameLabel.setFont(boldFont);
    fileNameLabel.setAlignment(SWT.RIGHT);
    fileNameValue = toolkit.createLabel(detailsClient,"<TBD>");
    fileNameValue.setFont(normalFont);
    fileNameValue.setAlignment(SWT.LEFT);

    // function count
    Label functionCountLabel = toolkit.createLabel(detailsClient, "Functions");
    functionCountLabel.setFont(boldFont);
    functionCountLabel.setAlignment(SWT.RIGHT);
    functionCountValue = toolkit.createLabel(detailsClient,"<TBD>");
    functionCountValue.setFont(normalFont);
    functionCountValue.setAlignment(SWT.LEFT);

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

    s1.setClient(detailsClient);
    
    // templates section
    templatesSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE);
    templatesSection.setText("Verification Conditions");
    templatesSection.setDescription("Verification condition properties and counts");
    td = new TableWrapData(TableWrapData.FILL, TableWrapData.TOP);
    td.grabHorizontal = true;
    templatesSection.setLayoutData(td);
    toolkit.createCompositeSeparator(templatesSection);
    templatesClient = toolkit.createComposite(templatesSection);
    GridLayout gd = new GridLayout();
    gd.numColumns = 5;
    templatesClient.setLayout(gd);
    
    templatesSection.setClient(templatesClient);
    
    // recover expanded state from the dialog settings store
    IDialogSettings settings = Activator.getDefault().getDialogSettings();
    IDialogSettings tsection = settings.getSection(FILE_DETAILS_PAGE_SETTINGS);
    if (tsection == null) {
      tsection = settings.addNewSection(FILE_DETAILS_PAGE_SETTINGS);
    }
    final IDialogSettings section = tsection;
    
    templatesSection.setExpanded(section.getBoolean(TEMPLATES_SECTION_STATE));
    templatesSection.addExpansionListener(new IExpansionListener(){
      public void expansionStateChanged(ExpansionEvent e) {
        section.put(TEMPLATES_SECTION_STATE, e.getState() );
      }
      public void expansionStateChanging(ExpansionEvent e) {
      }});

  }

  /**
   * Creates a spacer of empty labels for the grid.
   * @param toolkit form tool kit
   * @param parent parent container
   * @param span number of grid cells to span
   */
  @SuppressWarnings("unused")
  private void createSpacer(FormToolkit toolkit, Composite parent, int span) {
    Label spacer = toolkit.createLabel(parent, ""); //$NON-NLS-1$
    GridData gd = new GridData();
    gd.horizontalSpan = span;
    spacer.setLayoutData(gd);
  }

  /**
   * Commit changes.  Unused.
   */
  public void commit(boolean onSave) {
  }

  /**
   * Clean up.  Dispose of fonts.
   */
  public void dispose() {
    if ( normalFont != null ) normalFont.dispose();
    if ( boldFont != null ) boldFont.dispose();
    
    // put values back into dialog store
    IDialogSettings settings = Activator.getDefault().getDialogSettings();
    IDialogSettings section = settings.getSection(FILE_DETAILS_PAGE_SETTINGS);
    section.put(TEMPLATES_SECTION_STATE, templatesSection.isExpanded());

  }

  /**
   * Initialize the page.  Create fonts.
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
   * Is dirty from edits.  Unused.
   * @return always returns false
   */
  public boolean isDirty() {
    return false;
  }

  /**
   * Is stale from refresh.  Unused.
   * @return always returns false
   */
  public boolean isStale() {
    return false;
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
   * Refreshes the page with new selection data.
   */
  private void update() {
    if ( fileInfo == null )
      return;

    // get the new values
    String f = fileInfo.getName();
    int functions = 0;
    int statements = 0;
    int instructions = 0;
    int loops = 0;
    int branches = 0;

    clearClient(templatesClient);

    // accumulate file's function info
    if ( fileInfo.getFunctionStats().getFunctionInfo() != null ) {
      functions = fileInfo.getFunctionStats().getFunctionInfo().size();

      for ( FunctionInfo fi : fileInfo.getFunctionStats().getFunctionInfo() ) {
          statements += fi.getStatementCount().getValue();
          instructions += fi.getInstructionCount().getValue();
          loops += fi.getLoopCount().getValue();
          branches += fi.getBranchCount().getValue();
      }
    }
    
    // display the new values
    fileNameValue.setText(f);
    functionCountValue.setText(Integer.toString(functions));
    statementCountValue.setText(Integer.toString(statements));
    instructionCountValue.setText(Integer.toString(instructions));
    loopCountValue.setText(Integer.toString(loops));
    branchCountValue.setText(Integer.toString(branches));
    detailsClient.pack(true);
    
    // display verification condition counts
    ProofObligationStats pos = fileInfo.getProofObligationStats();
    if ( pos.getVcs().size() > 0 ) {
      toolkit.createLabel(templatesClient, "Property Type").setFont(boldFont);
      toolkit.createLabel(templatesClient, "Open").setFont(boldFont);
      toolkit.createLabel(templatesClient, "Safe").setFont(boldFont);
      toolkit.createLabel(templatesClient, "Error").setFont(boldFont);
      toolkit.createLabel(templatesClient, "Total").setFont(boldFont);
      
      for ( VerificationConditions vc : pos.getVcs() ) {
        toolkit.createLabel(templatesClient, vc.getType());
        toolkit.createLabel(templatesClient, Integer.toString(vc.getOpen()));
        toolkit.createLabel(templatesClient, Integer.toString(vc.getSafe()));
        toolkit.createLabel(templatesClient, Integer.toString(vc.getError()));
        toolkit.createLabel(templatesClient, Integer.toString(vc.getTotal()));
      }
    }
    
    
    templatesSection.getParent().layout(true,true);

    mform.reflow(true);
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
   * Sets the form input object to the given value.
   * @return always returns false
   */
  public boolean setFormInput(Object input) {
    fileInfo = (FileInfo)input;
    return false;
  }

  /**
   * Sets the object to display as a result of master selection.
   * Listener mapped to objects of the file info type.
   * Uses the first selected item.  Calls <code>update()</code>. 
   */
  public void selectionChanged(IFormPart part, ISelection selection) {
    IStructuredSelection ssel = (IStructuredSelection)selection;
    if ( ssel == null || ssel.getFirstElement() == null )
      return;
    
    fileInfo = (FileInfo)ssel.getFirstElement();
    update();
  }

}
