package net.certware.argument.sfp.review.wizard;

import java.util.Calendar;

import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.argument.sfp.semiFormalProof.Statement;
import net.certware.argument.sfp.semiFormalProof.ValidationKind;
import net.certware.core.ui.help.IHelpContext;
import net.certware.core.ui.log.CertWareLog;

import org.eclipse.help.IContextProvider;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.help.IWorkbenchHelpSystem;

/**
 * Review wizard setup page.
 * Provides text fields for entering validation data.  
 * @author mrb
 * @since 1.0.3
 */
public class ReviewSetupPage extends WizardPage implements IHelpContext {

	/** context provider for help system */
	static ReviewContextProvider contextprovider = null;
	/** page title */
	static final String PAGE_TITLE = "CertWare Semi-Formal Proof Wizard";
	/** page description */
	static final String PAGE_DESCRIPTION = "Proof Review Setup";
	/** page message */
	static final String PAGE_MESSAGE = "Provide the validation setup references";
	/** proof to process */
	Proof proof;
	/** form widget toolkit managed by activator */
	FormToolkit toolkit;
	/** whether the content has been modified */
	boolean isModified = false;
	/** author text field */
	Text authorText;
	/** time stamp text field */
	Text timeStampText;
	/** client composite for setup section */
	Composite setupClient;
	
	/**
	 * Constructor for the review wizard page.
	 * @param proof proof to review
	 * @param toolkit form toolkit
	 */
	public ReviewSetupPage(Proof proof, FormToolkit toolkit) {
		super(PAGE_DESCRIPTION);
		setTitle(PAGE_TITLE);
		setDescription(PAGE_DESCRIPTION);
		setMessage(PAGE_MESSAGE);
		this.proof = proof;
		this.toolkit = toolkit;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {

		Composite composite = new Composite(parent, SWT.BORDER);
		
		TableWrapLayout layout = new TableWrapLayout();
		layout.topMargin = 5;
		layout.leftMargin = 5;
		layout.rightMargin = 5;
		layout.bottomMargin = 5;
		layout.numColumns = 1;

		composite.setLayout(layout);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		// section
		Section s1 = toolkit.createSection(composite, Section.DESCRIPTION | Section.TITLE_BAR);
		s1.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB));
		s1.setText("Validation Attributes");
		s1.setDescription("Attributes to be recorded with validation results");
		toolkit.createCompositeSeparator(s1);

		// client
		setupClient = toolkit.createComposite(s1);
		TableWrapLayout dcl = new TableWrapLayout();
		dcl.makeColumnsEqualWidth = false;
		dcl.numColumns = 2;
		setupClient.setLayout( dcl );
		setupClient.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB));

		// column headers
		Label authorLabel = toolkit.createLabel(setupClient, "Validating Author");
		authorLabel.setLayoutData( new TableWrapData(TableWrapData.LEFT,TableWrapData.TOP));
		Label timeStampLabel = toolkit.createLabel(setupClient, "Time Stamp");
		timeStampLabel.setLayoutData( new TableWrapData(TableWrapData.LEFT,TableWrapData.TOP));
		
		// column rows
		authorText = toolkit.createText(setupClient,"");
		authorText.setLayoutData( new TableWrapData(TableWrapData.FILL,TableWrapData.TOP));
		authorText.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				// disallow quotes to avoid parsing problems
				if ( e.character == '"')
					e.doit = false;
			}

			@Override
			public void keyReleased(KeyEvent e) {
				setPageComplete();
			}});
		timeStampText = toolkit.createText(setupClient, Calendar.getInstance().getTime().toString() );
		timeStampText.setLayoutData( new TableWrapData(TableWrapData.FILL,TableWrapData.TOP));
		timeStampText.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				// disallow quotes to avoid parsing problems
				if ( e.character == '"')
					e.doit = false;
			}

			@Override
			public void keyReleased(KeyEvent e) {
				setPageComplete();
			}});
		
		
		// buttons section
		Section s2 = toolkit.createSection(composite, Section.DESCRIPTION | Section.TITLE_BAR);
		s2.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB));
		s2.setText("Argument Model Validation Reset");
		s2.setDescription("Optional actions to apply to the selected proof model prior to step-by-step validation");
		toolkit.createCompositeSeparator(s2);

		// buttons client
		Composite buttonsClient = toolkit.createComposite(s2);
		TableWrapLayout bcl = new TableWrapLayout();
		bcl.makeColumnsEqualWidth = false;
		bcl.numColumns = 5;
		buttonsClient.setLayout( bcl );
		buttonsClient.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB));
		
		toolkit.createLabel(buttonsClient, "");
		
		final Button b2 = toolkit.createButton(buttonsClient, "Set All Unknown...", SWT.PUSH);
		b2.setLayoutData( new TableWrapData(TableWrapData.FILL,TableWrapData.MIDDLE));
		b2.setToolTipText("Sets the validation state of all statements to unknown");
		b2.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent se) {
				if ( MessageDialog.openConfirm(getShell(), 
						PAGE_TITLE, 
						"Set all validation states to unknown?") ) {
					setValidationUnknown();
					b2.setEnabled(false);
				}
			}
		});
		
		toolkit.createLabel(buttonsClient, "");
		
		final Button b4 = toolkit.createButton(buttonsClient, "Clear All Authors...", SWT.PUSH);
		b4.setLayoutData( new TableWrapData(TableWrapData.FILL,TableWrapData.MIDDLE));
		b4.setToolTipText("Sets the author and time stamp fields of all statements to empty");
		b4.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent se) {
				if ( MessageDialog.openConfirm(getShell(), 
						PAGE_TITLE, 
						"Clear all author and time stamp values?") ) {
					setAuthorsUnknown();
					b4.setEnabled(false);
				}
			}
		});
		
		toolkit.createLabel(buttonsClient, "These actions commit only upon wizard finish");

		// assign clients to sections
		s1.setClient(setupClient);
		s2.setClient(buttonsClient);
		
		setControl(composite);
		setHelpContextIDs(composite);
		setPageComplete(false);
	}

	/**
	 * Set the context IDs for help system.  
	 * Wait to call until site has been established.
	 * @param control control widget to pass to help setup
	 */
	private void setHelpContextIDs(Control control) {
		IWorkbenchHelpSystem helpSystem = PlatformUI.getWorkbench().getHelpSystem();
		helpSystem.setHelp(control, IHelpContext.REVIEW_WIZARD_SETUP_PAGE);
	}

	/**
	 * Adapter to identify context provider.
	 * Supports the help system contribution.
	 */
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class key) {

		if (key.equals(IContextProvider.class)) {
			if (contextprovider == null)
				contextprovider = new ReviewContextProvider();
			return contextprovider;
		}

		return null;
	}

	/**
	 * Sets page complete if both text fields are not empty.
	 */
	public void setPageComplete() {
		
		if ( authorText.getText().isEmpty() == false && timeStampText.getText().isEmpty() == false ) {
			setPageComplete(true);
			return;
		}
			
		setPageComplete(false);
	}

	/**
	 * Get the author text field value.
	 * @return text field value or empty string
	 */
	public String getAuthor() {
		if ( authorText != null )
			return authorText.getText();
		return "";
	}
	
	/**
	 * Get the time stamp text field value.
	 * @return time stamp field value or empty string
	 */
	public String getTimeStamp() {
		if ( timeStampText != null )
			return timeStampText.getText();
		return "";
	}
	
	/**
	 * Sets all authors and time stamps to empty fields.
	 */
	protected void setAuthorsUnknown() {
		if ( proof != null && proof.getProofSteps() != null ) {
			for ( Statement s : proof.getProofSteps().getStatements() ) {
				if ( s.getValidation() != null ) {
					s.getValidation().setAuthor("");
					s.getValidation().setTimeStamp("");
				}
			}
			CertWareLog.logInfo("Set all validation authors to empty");
		}
	}
	
	/**
	 * Sets all validation kinds to unknown.
	 */
	protected void setValidationUnknown() {
		if ( proof != null && proof.getProofSteps() != null ) {
			for ( Statement s : proof.getProofSteps().getStatements() ) {
				if ( s.getValidation() != null ) {
					s.getValidation().setState( ValidationKind.UNKNOWN );
				}
			}
			CertWareLog.logInfo("Set all statement validations to unknown");
		}
	}
}