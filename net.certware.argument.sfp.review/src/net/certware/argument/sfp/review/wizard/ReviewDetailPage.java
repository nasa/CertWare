package net.certware.argument.sfp.review.wizard;

import net.certware.argument.sfp.review.Activator;
import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.argument.sfp.semiFormalProof.SemiFormalProofFactory;
import net.certware.argument.sfp.semiFormalProof.Statement;
import net.certware.argument.sfp.semiFormalProof.ValidationKind;
import net.certware.argument.sfp.util.ProofUtil;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

/**
 * A generic example page to be extended by specific proof classes.
 * @author mrb
 * @since 1.0.3
 */
public abstract class ReviewDetailPage implements IDetailsPage
{
	/** dialog settings section key */
	static final String REVIEW_PAGE_SETTINGS = "REVIEW_PAGE_SETTINGS";
	/** resources section key */
	static final String RESOURCES_SECTION_STATE = "resources_section_state";

	/** the form toolkit created by dialog host */
	FormToolkit toolkit = null;
	/** the managed form container */
	IManagedForm mform = null;
	/** bold font labels */
	Font boldFont = null;
	/** normal font for values */
	Font normalFont = null;
	/** statement id value */
	Label idValue = null;
	/** statement body text */
	Text bodyValue = null;
	/** statement comment */
	Label commentValue = null; 
	/** details client */
	Composite justificationsClient = null;
	/** buttons client */
	Composite buttonsClient = null;
	/** input example to display */
	Statement statement;
	/** proof for statements */
	Proof proof;
	/** image registry */
	ImageRegistry imageRegistry;
	/** author text */
	private Text authorText;
	/** time stamp text */
	private Text timeStampText;
	/** whether a save is necessary */
	private boolean dirty;
	/** viewer on master part to refresh */
	TreeViewer viewer;
	/** buttons layout section */
	private Section buttonsSection;
	/** proof valid button */
	private Button validButton;
	/** proof invalid button */
	private Button invalidButton;
	/** proof unknown button */
	private Button unknownButton;
	/** setup page field references */
	private ReviewSetupPage setupPage;
	/** validate page method references */
	private ReviewValidatePage validatePage;
	private Composite deductionClient;
	private Section deductionSection;
	private Section justificationsSection;

	/**
	 * Constructor saves the contributions for name search.
	 * @param proof proof to display
	 */
	public ReviewDetailPage(Proof proof,TreeViewer viewer, ReviewValidatePage validate, ReviewSetupPage setup) {
		this.proof = proof;
		this.viewer = viewer;
		this.setupPage = setup;
		this.validatePage = validate;
		this.imageRegistry = Activator.getDefault().getImageRegistry();

		// TODO determine how to invalidate all dependent statements
		// TODO disable buttons if any predecessor statement on details is invalid
		// TODO disable button if statement already matches
	}

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
		layout.numColumns = 1;
		parent.setLayout(layout);

		toolkit = mform.getToolkit();
		
		// justifications area
		justificationsSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
		justificationsSection.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB));
		justificationsSection.setText("Statement Justifications");
		justificationsSection.setDescription("");
		toolkit.createCompositeSeparator(justificationsSection);
		justificationsClient = toolkit.createComposite(justificationsSection);
		TableWrapLayout jcl = new TableWrapLayout();
		jcl.numColumns = 3;
		justificationsClient.setLayout( jcl );
		justificationsSection.setClient(justificationsClient);

		// deduction area
		deductionSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
		deductionSection.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB));
		deductionSection.setText("Statement Deduction");
		deductionSection.setDescription("");
		// toolkit.createCompositeSeparator(deductionSection);
		deductionClient = toolkit.createComposite(deductionSection);
		TableWrapLayout dcl = new TableWrapLayout();
		dcl.numColumns = 3;
		deductionClient.setLayout( dcl );
		deductionSection.setClient(deductionClient);
		
		// buttons area
		buttonsSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR ); // Section.NO_TITLE );
		buttonsSection.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB ));
		buttonsSection.setText("Statement Validation"); 
		buttonsSection.setDescription("");
		buttonsClient = toolkit.createComposite(buttonsSection);
		TableWrapLayout bcl = new TableWrapLayout();
		bcl.makeColumnsEqualWidth = false;
		bcl.numColumns = 1;
		buttonsClient.setLayout(bcl);
		buttonsSection.setClient(buttonsClient);

		populateJustifications();
		populateDeduction();
		populateButtons();

		parent.setSize(300, 100);

		// recover expanded state from the dialog settings store
		/*
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		IDialogSettings tsection = settings.getSection(REVIEW_PAGE_SETTINGS);
		if (tsection == null) {
			tsection = settings.addNewSection(REVIEW_PAGE_SETTINGS);
		}
		final IDialogSettings section = tsection;

		resourcesSection.setExpanded(section.getBoolean(RESOURCES_SECTION_STATE));
		resourcesSection.addExpansionListener(new IExpansionListener(){
			public void expansionStateChanged(ExpansionEvent e) {
				section.put(RESOURCES_SECTION_STATE, e.getState() );
			}
			public void expansionStateChanging(ExpansionEvent e) {
			}});
		 */

	}

	/**
	 * Marks the model as dirty.
	 * Sets the page complete flag to true.
	 */
	private void markDirty() {
		dirty = true;
		validatePage.setPageComplete(true);
	}

	/**
	 * Update the validation element of the selected statement.
	 * @param kind validation kind
	 */
	public void updateValidation( ValidationKind kind ) {

		if ( statement != null ) {
			if ( statement.getValidation() == null ) {
				statement.setValidation( SemiFormalProofFactory.eINSTANCE.createValidation() );
			}

			// update the model
			statement.getValidation().setState( kind );
			statement.getValidation().setAuthor( addQuotes( setupPage.getAuthor()) );
			statement.getValidation().setTimeStamp( addQuotes( setupPage.getTimeStamp()) );

			// update the details page to show the new author and time stamp
			authorText.setText( removeQuotes( setupPage.getAuthor() ) );
			timeStampText.setText( removeQuotes( setupPage.getTimeStamp() ) );

			// refresh labels on master and details pages
			update(); 
			viewer.refresh(); 
		}
	}

	/**
	 * Add quotation marks to a string for saving in the resource.
	 * @param s string presumed not to have quotation mark as first character
	 * @return s with quotation marks in first and last character, or s unchanged
	 */
	protected String addQuotes(String s) {
		if ( s.charAt(0) != '"' )
			return '"' + s + '"';
		return s;
	}

	/**
	 * Remove quotation marks from a string for display.
	 * @param s string presumed to have quotation marks as first and last characters
	 * @return s without first and last quotation marks, or s unchanged
	 */
	protected String removeQuotes(String s) {
		if ( s != null && s.isEmpty() == false ) {
			if ( s.charAt(0) == '"') {
				return s.substring(1,s.length()-1);
			}
		}
		
		return s;
	}
	
	/**
	 * Get the author stored in the statement's validation record.
	 * @return statement validation author
	 */
	public String getOriginalAuthor() {
		if ( statement != null && statement.getValidation() != null ) {
			return statement.getValidation().getAuthor();
		}
		return "";
	}

	/**
	 * Get the time stamp stored in the statement's validation record.
	 * @return statement validation time stamp
	 */
	public String getOriginalTimeStamp() {
		if ( statement != null && statement.getValidation() != null ) {
			return statement.getValidation().getTimeStamp();
		}
		return "";
	}

	/**
	 * Commit changes.  Unused.
	 */
	public void commit(boolean onSave) {

	}

	/**
	 * Clean up.  Dispose of fonts.  Write dialog settings back to plugin.
	 */
	public void dispose() {
		if ( normalFont != null ) normalFont.dispose();
		if ( boldFont != null ) boldFont.dispose();

		// put values back into dialog store
		//IDialogSettings settings = Activator.getDefault().getDialogSettings();
		//IDialogSettings section = settings.getSection(REVIEW_PAGE_SETTINGS);
		// section.put(RESOURCES_SECTION_STATE, resourcesSection.isExpanded());
	}

	/**
	 * Populate the column header.
	 */
	private void populateHeader(Composite client) {
		Label idLabel = new Label(client, SWT.NONE);
		idLabel.setText("Valid");
		idLabel.setFont(boldFont);
		idLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE));

		Label bodyLabel = new Label(client, SWT.NONE);
		bodyLabel.setText("Statement");
		bodyLabel.setFont(boldFont);
		bodyLabel.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.MIDDLE));

		Label commentLabel = new Label(client, SWT.NONE);
		commentLabel.setText("Comment");
		commentLabel.setFont(boldFont);
		commentLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE));
	}

	/**
	 * Gets the image to be associated with a statement in its label.
	 * @param s statement
	 * @return return image from image registry
	 */
	private Image getImageForStatement(Statement s) {

		if ( s.getValidation() != null ) {
			if ( s.getValidation().getState() == ValidationKind.INVALID ) {
				return imageRegistry.get( Activator.REVIEW_INVALID_IMAGE );
			}

			if ( s.getValidation().getState() == ValidationKind.VALID ) {
				return imageRegistry.get( Activator.REVIEW_VALID_IMAGE );
			}
		}

		return imageRegistry.get( Activator.REVIEW_UNKNOWN_IMAGE );
	}

	/**
	 * Populate the column rows.
	 */
	private void populateJustifications() {

		// show only the selected statement's justifications
		if ( statement != null ) {

			// find statement justifications, returned as list
			EList<Statement> justifiers = ProofUtil.getStatementJustifications(proof, statement);

			if ( justifiers.size() > 0 ) {
				populateHeader(justificationsClient);

				// show justifiers
				for ( Statement s : justifiers ) {
					displayStatementLine(justificationsClient,s);
				}
			}

			// update section description
			switch( justifiers.size() ) {
			case 0: justificationsSection.setDescription("No justifications given"); break;
			case 1: justificationsSection.setDescription("Statement justification:"); break;
			default: justificationsSection.setDescription("Statement justifications:"); break;
			}
			
		} else {
			justificationsSection.setDescription("");
		}

	}

	/**
	 * Populate the deduction row.
	 */
	private void populateDeduction() {
		if ( statement != null ) {
			EList<Statement> justifiers = ProofUtil.getStatementJustifications(proof, statement);
			if ( justifiers.isEmpty() ) {
				deductionSection.setDescription("Assertion:");
				buttonsSection.setDescription("Validate the assertion:");
			} else {
				deductionSection.setDescription("Deduction given the above justifications:");
				buttonsSection.setDescription("Validate the deduction:");
			}

			populateHeader(deductionClient);
			displayStatementLine(deductionClient,statement);
		}
	}
	
	
	/**
	 * Create the buttons row and validation reference row on their form clients.
	 * Adds button listeners to update validation and button enabled states.
	 */
	private void populateButtons() {

		// buttons composite row
		Composite buttonsComposite = toolkit.createComposite(buttonsClient);
		TableWrapLayout buttonsCompositeLayout = new TableWrapLayout();
		buttonsCompositeLayout.makeColumnsEqualWidth = true;
		buttonsCompositeLayout.numColumns = 3;
		buttonsComposite.setLayout(buttonsCompositeLayout);
		
		// author composite row
		Composite authorComposite = toolkit.createComposite(buttonsClient);
		TableWrapLayout authorCompositeLayout = new TableWrapLayout();
		authorCompositeLayout.makeColumnsEqualWidth = false;
		authorCompositeLayout.numColumns = 4;
		authorComposite.setLayout(authorCompositeLayout);
		
		// buttons on the buttons client
		validButton = toolkit.createButton(buttonsComposite, "Valid", SWT.PUSH);
		validButton.setLayoutData(new TableWrapData(TableWrapData.LEFT,TableWrapData.TOP));
		validButton.setImage( imageRegistry.get( Activator.REVIEW_VALID_IMAGE ));
		validButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				updateValidation(ValidationKind.VALID);
				updateButtons();
			}
		});
		invalidButton = toolkit.createButton(buttonsComposite, "Invalid", SWT.PUSH);
		invalidButton.setLayoutData(new TableWrapData(TableWrapData.LEFT,TableWrapData.TOP));
		invalidButton.setImage( imageRegistry.get( Activator.REVIEW_INVALID_IMAGE ));
		invalidButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				updateValidation(ValidationKind.INVALID);
				updateButtons();
			}
		});
		unknownButton = toolkit.createButton(buttonsComposite, "Unknown", SWT.PUSH);
		unknownButton.setLayoutData(new TableWrapData(TableWrapData.LEFT,TableWrapData.TOP));
		unknownButton.setImage( imageRegistry.get( Activator.REVIEW_UNKNOWN_IMAGE ));
		unknownButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				updateValidation(ValidationKind.UNKNOWN);
				updateButtons();
			}
		});

		toolkit.createLabel(authorComposite,"Previous Author");
		authorText = toolkit.createText(authorComposite,removeQuotes(getOriginalAuthor()));
		authorText.setEditable(false);

		toolkit.createLabel(authorComposite,"Time Stamp");
		timeStampText = toolkit.createText(authorComposite, removeQuotes(getOriginalTimeStamp()));
		timeStampText.setEditable(false);

		// set enabled states based on statement selection
		updateButtons();
	}

	/**
	 * Update the enable states of the buttons based on validation kind.
	 * Adds the validation object if not present in statement.
	 */
	private void updateButtons() {

		if ( statement == null )
			return;
		
		if ( statement.getValidation() == null ) {
			statement.setValidation( SemiFormalProofFactory.eINSTANCE.createValidation() );
		}

		if ( statement.getValidation().getState() == ValidationKind.INVALID ) {
			invalidButton.setEnabled(false);
			validButton.setEnabled(true);
			unknownButton.setEnabled(true);
		}
		if ( statement.getValidation().getState() == ValidationKind.VALID ) {
			invalidButton.setEnabled(true);
			validButton.setEnabled(false);
			unknownButton.setEnabled(true);
		}
		if ( statement.getValidation().getState() == ValidationKind.UNKNOWN ) {
			invalidButton.setEnabled(true);
			validButton.setEnabled(true);
			unknownButton.setEnabled(false);
		}

		// if any predecessors invalid, disable the valid button
		if ( ProofUtil.justificationsValid(proof,statement) == false ) {
			validButton.setEnabled(false);
		}

		markDirty();
		validatePage.setPageComplete(true);
	}

	/**
	 * Create the widgets for the deduction line header.
	 */
	/*
	private void displayDeductionLine() {
		
		// text line
		Label s1 = toolkit.createLabel(justificationsClient, "");
		s1.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));

		Label s2 = toolkit.createLabel(justificationsClient, "Whether the above justifies this statement:");
		s2.setFont(boldFont);
		s2.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP));

		Label s3 = toolkit.createLabel(justificationsClient, "");
		s3.setFont(boldFont);
		s3.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
	}
	*/

	/**
	 * Create the widgets for a statement line.
	 * @param client client on which to add children
	 * @param s statement to display
	 */
	private void displayStatementLine(Composite client, Statement s) {
		Label idValue = toolkit.createLabel(client,s.getId());
		idValue.setFont(normalFont);
		idValue.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
		idValue.setImage( getImageForStatement(s) );

		FormText bodyValue = toolkit.createFormText(client, false);
		bodyValue.setWhitespaceNormalized(true);
		bodyValue.setText(s.getStatement(), false, false);
		bodyValue.setFont(normalFont);
		bodyValue.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP));

		Label commentValue = toolkit.createLabel(client, ProofUtil.getStatementComment(s));
		commentValue.setFont(normalFont);
		commentValue.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
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
	 * Whether the model is dirty.
	 * @return true if changes were made to underlying model requiring save
	 */
	public boolean isDirty() {
		return dirty;
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

		if ( proof == null )
			return;

		// clear previous data
		clearClient(justificationsClient);
		clearClient(deductionClient);
		clearClient(buttonsClient);

		// reload the clients
		// populateHeader();
		populateJustifications();
		populateDeduction();
		populateButtons();

		// layout clients
		justificationsSection.getParent().layout(true);
		justificationsClient.getParent().layout(true, true);
		deductionSection.getParent().layout(true, true);
		deductionClient.getParent().layout(true, true);
		buttonsSection.getParent().layout(true);
		buttonsClient.getParent().layout(true, true);

		mform.reflow(true);
		setHelpContext(deductionClient);
	}

	/**
	 * Sets the help context ID.
	 * @param c control for help system reference
	 */
	abstract void setHelpContext(Control c);

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
	 * Expects an Example object.
	 * @return always returns false
	 */
	public boolean setFormInput(Object input) {
		statement = (Statement)input;
		return false;
	}

	/**
	 * Sets the object to display as a result of master selection.
	 * Listener mapped to objects of the statement type.
	 * Uses the first selected item.  Calls <code>update()</code>. 
	 */
	public void selectionChanged(IFormPart part, ISelection selection) {
		IStructuredSelection ssel = (IStructuredSelection)selection;

		if ( ssel == null || ssel.getFirstElement() == null )
			return;

		// check selection type
		if ( ssel.getFirstElement() instanceof Proof ) {
			proof = (Proof)ssel.getFirstElement();
		} else if ( ssel.getFirstElement() instanceof Statement) {
			statement = (Statement)ssel.getFirstElement();
			proof = (Proof) EcoreUtil.getRootContainer(statement);
		}

		update();
	}

}
