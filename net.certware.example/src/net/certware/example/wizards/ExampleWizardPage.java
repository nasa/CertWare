package net.certware.example.wizards;

import net.certware.core.ui.help.IHelpContext;
import net.certware.example.Activator;
import net.certware.example.ExampleContributions;

import org.eclipse.help.IContextProvider;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.ManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.help.IWorkbenchHelpSystem;

/**
 *
 */
public class ExampleWizardPage extends WizardPage implements IHelpContext {

	/** context provider for help system */
	static ExampleContextProvider contextprovider = null;
	/** selection at start of wizard */
	@SuppressWarnings("unused")
	private ISelection selection;
	/** shared form toolkit */
	private FormToolkit toolkit;
	/** example contributions from plugins and fragments */
	private ExampleContributions ec;
	/** page title */
	static final String PAGE_TITLE = "CertWare Example Contributions";

	/**
	 * Constructor for the example wizard page showing extension contributions.
	 * @param pageName
	 */
	public ExampleWizardPage(ExampleContributions ec, FormToolkit toolkit) {
		super("Example Wizard Page");
		setTitle(PAGE_TITLE);
		setDescription("Shows the examples contributed via plugins");
		this.ec = ec;
		this.toolkit = toolkit;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		
		Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    	ScrolledForm form = toolkit.createScrolledForm(composite);
    	IManagedForm managedForm = new ManagedForm(toolkit, form);
    	form.setText("Example Details");
    	form.setLayoutData(new GridData(GridData.FILL_BOTH));

    	ScrolledPropertiesBlock block = new ScrolledPropertiesBlock(ec);
    	block.createContent(managedForm);
		
		setControl(composite);
		setHelpContextIDs(composite);
	}

	/**
	 * Set the context IDs for help system.  
	 * Wait to call until site has been established.
	 */
	private void setHelpContextIDs(Control control) {
		// create the help context id for the control
		IWorkbenchHelpSystem helpSystem = PlatformUI.getWorkbench().getHelpSystem();
		helpSystem.setHelp(control, IHelpContext.EXAMPLE_WIZARD_PAGE);
	}


	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}


	/**
	 * Adapter to identify context provider.
	 */
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class key) {

		if (key.equals(IContextProvider.class)) {
			if (contextprovider == null)
				contextprovider = new ExampleContextProvider();
			return contextprovider;
		}

		return null;
	}

}