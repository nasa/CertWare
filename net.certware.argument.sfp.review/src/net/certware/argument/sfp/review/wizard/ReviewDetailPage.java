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
	Composite detailsClient = null;
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
		// TODO determine what to set and display for hypothesis and epsilon validation
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
		Section s1 = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
		s1.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB));
		s1.setText("Statement Justification");
		s1.setDescription("Whether the justifications support the deduction");
		toolkit.createCompositeSeparator(s1);

		detailsClient = toolkit.createComposite(s1);
		TableWrapLayout dcl = new TableWrapLayout();
		dcl.numColumns = 3;
		detailsClient.setLayout( dcl );

		// header and data rows
		populateHeader();
		populateDetails();
		s1.setClient(detailsClient);

		// buttons area
		buttonsSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.NO_TITLE );
		buttonsSection.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB ));
		buttonsSection.setText("Validation"); // not used with this style

		// buttons client, may have no children
		buttonsClient = toolkit.createComposite(buttonsSection);
		TableWrapLayout bcl = new TableWrapLayout();
		bcl.makeColumnsEqualWidth = false;
		bcl.numColumns = 7;
		buttonsClient.setLayout(bcl);

		populateButtons();
		
		buttonsSection.setClient(buttonsClient);

		// recover expanded state from the dialog settings store
		/*
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		IDialogSettings tsection = settings.getSection(REVIEW_PAGE_SETTINGS);
		if (tsection == null) {
			tsection = settings.addNewSection(REVIEW_PAGE_SETTINGS);
		}
		final IDialogSettings section = tsection;
		 */

		parent.setSize(300, 100);

		/*
		resourcesSection.setExpanded(section.getBoolean(RESOURCES_SECTION_STATE));
		resourcesSection.addExpansionListener(new IExpansionListener(){
			public void expansionStateChanged(ExpansionEvent e) {
				section.put(RESOURCES_SECTION_STATE, e.getState() );
			}
			public void expansionStateChanging(ExpansionEvent e) {
			}});
		 */

	}

	private void markDirty() {
		dirty = true;
	}
	
	public void updateValidation( ValidationKind kind ) {
		
		if ( statement != null ) {
			if ( statement.getValidation() == null ) {
				statement.setValidation( SemiFormalProofFactory.eINSTANCE.createValidation() );
			}
			
			// update the model
			statement.getValidation().setState( kind );
			statement.getValidation().setAuthor( setupPage.getAuthor() );
			statement.getValidation().setTimeStamp( setupPage.getTimeStamp() );
			
			// update the details page to show the new author and time stamp
			authorText.setText( setupPage.getAuthor() );
			timeStampText.setText( setupPage.getTimeStamp() );
			
			// refresh labels on master and details pages
			update(); 
			viewer.refresh(); 
			markDirty();
		}
	}

	public String getOriginalAuthor() {
		if ( statement != null && statement.getValidation() != null ) {
			return statement.getValidation().getAuthor();
		}
		return "";
	}

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
	private void populateHeader() {
		Label idLabel = new Label(detailsClient, SWT.NONE);
		idLabel.setText("Valid");
		idLabel.setFont(boldFont);
		idLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE));

		Label bodyLabel = new Label(detailsClient, SWT.NONE);
		bodyLabel.setText("Statement");
		bodyLabel.setFont(boldFont);
		bodyLabel.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.MIDDLE));

		Label commentLabel = new Label(detailsClient, SWT.NONE);
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
	private void populateDetails() {

		// TODO add help context content

		// show only the selected statement's justifications
		if ( statement != null ) {

			// find statement justifications, returned as list
			EList<Statement> justifiers = ProofUtil.getStatementJustifications(proof, statement);

			// show justifiers
			for ( Statement s : justifiers ) {
				displayStatementLine(s);
			} // all justification statements

			// 	skip a line
			if ( justifiers.size() > 0 ) {
				displayDeductionLine();
			}

			// display the selected statement
			displayStatementLine(statement);
		}

	}

	private void populateButtons() {
		EList<Statement> justifiers = ProofUtil.getStatementJustifications(proof, statement);
		if ( justifiers.isEmpty() ) {
			buttonsSection.setDescription("Statement requires no logic validation.");
		} else {
			buttonsSection.setDescription("Validate the statement deduction:");

			// buttons on the buttons client
			validButton = toolkit.createButton(buttonsClient, "Valid", SWT.PUSH);
			validButton.setLayoutData(new TableWrapData(TableWrapData.LEFT,TableWrapData.TOP));
			validButton.setImage( imageRegistry.get( Activator.REVIEW_VALID_IMAGE ));
			validButton.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					updateValidation(ValidationKind.VALID);
					updateButtons();
				}
			});
			invalidButton = toolkit.createButton(buttonsClient, "Invalid", SWT.PUSH);
			invalidButton.setLayoutData(new TableWrapData(TableWrapData.LEFT,TableWrapData.TOP));
			invalidButton.setImage( imageRegistry.get( Activator.REVIEW_INVALID_IMAGE ));
			invalidButton.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					updateValidation(ValidationKind.INVALID);
					updateButtons();
				}
			});
			unknownButton = toolkit.createButton(buttonsClient, "Unknown", SWT.PUSH);
			unknownButton.setLayoutData(new TableWrapData(TableWrapData.LEFT,TableWrapData.TOP));
			unknownButton.setImage( imageRegistry.get( Activator.REVIEW_UNKNOWN_IMAGE ));
			unknownButton.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					updateValidation(ValidationKind.UNKNOWN);
					updateButtons();
				}
			});
			
			toolkit.createLabel(buttonsClient,"Previous Author");
			authorText = toolkit.createText(buttonsClient,getOriginalAuthor());
			authorText.setEditable(false);
			
			toolkit.createLabel(buttonsClient,"Time Stamp");
			timeStampText = toolkit.createText(buttonsClient, getOriginalTimeStamp());
			timeStampText.setEditable(false);
			
			// set enabled states based on statement selection
			updateButtons();
		}
	}
	
	private void updateButtons() {
		if ( statement != null && statement.getValidation() != null ) {
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
			
			validatePage.setPageComplete(true);
		}
	}
	
	private void displayDeductionLine() {
		Label s1 = toolkit.createLabel(detailsClient, "");
		s1.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
		
		Label s2 = toolkit.createLabel(detailsClient, "Whether the above justifies this statement:");
		s2.setFont(boldFont);
		s2.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP));
		
		Label s3 = toolkit.createLabel(detailsClient, "");
		s3.setFont(boldFont);
		s3.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
	}

	private void displayStatementLine(Statement s) {
		Label idValue = toolkit.createLabel(detailsClient,s.getId());
		idValue.setFont(normalFont);
		idValue.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
		idValue.setImage( getImageForStatement(s) );

		FormText bodyValue = toolkit.createFormText(detailsClient, false);
		bodyValue.setWhitespaceNormalized(true);
		bodyValue.setText(s.getStatement(), false, false);
		bodyValue.setFont(normalFont);
		bodyValue.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP));

		Label commentValue = toolkit.createLabel(detailsClient, ProofUtil.getStatementComment(s));
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
	 * Is dirty from edits.  Unused.
	 * @return always returns false
	 */
	/*
	public boolean isDirty() {
		System.err.println("checking dirty");
		return false;
	}
	*/

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
		clearClient(detailsClient);
		clearClient(buttonsClient);

		// reload the clients
		populateHeader();
		populateDetails();
		populateButtons();

		// layout clients
		detailsClient.getParent().layout(true, true);
		buttonsSection.getParent().layout(true);
		buttonsClient.getParent().layout(true, true);

		mform.reflow(true);
		// mform.getForm().layout(true); not helpful

		setHelpContext(detailsClient);
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
