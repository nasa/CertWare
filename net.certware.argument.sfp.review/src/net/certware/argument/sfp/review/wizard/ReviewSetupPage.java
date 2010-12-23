package net.certware.argument.sfp.review.wizard;

import java.util.Calendar;

import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.core.ui.help.IHelpContext;

import org.eclipse.help.IContextProvider;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
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
 * Creates a master-details block with proof and statement details.
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
	private Composite setupClient;
	
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
		
		
		// control
		s1.setClient(setupClient);
		setControl(composite);
		setHelpContextIDs(composite);
		setPageComplete(false);
	}

	/**
	 * Set the context IDs for help system.  
	 * Wait to call until site has been established.
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
	 * Sets page complete if text fields completed.
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
	 * @return text field value or null
	 */
	public String getAuthor() {
		if ( authorText != null )
			return authorText.getText();
		return "";
	}
	
	/**
	 * Get the time stamp text field value.
	 * @return time stamp field value or null
	 */
	public String getTimeStamp() {
		if ( timeStampText != null )
			return timeStampText.getText();
		return "";
	}
}