package net.certware.example.wizards;

import net.certware.core.ui.help.IHelpContext;
import net.certware.example.Example;
import net.certware.example.ExampleCategory;
import net.certware.example.ExampleContributions;

import org.eclipse.help.IContextProvider;
import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
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
 * Example wizard page.
 * Creates a master-details block with example tree and example details.
 * @author mrb
 * @since 1.0
 */
public class ExampleWizardPage extends WizardPage implements IHelpContext {

	/** context provider for help system */
	static ExampleContextProvider contextprovider = null;
	/** shared form toolkit */
	private FormToolkit toolkit;
	/** example contributions from plugins and fragments */
	private ExampleContributions exampleContributions;
	/** selected node from scrolled properties block master tree */
	private Example selectedExample;
	/** page title */
	static final String PAGE_TITLE = "CertWare Example Contributions";
	/** page description */
	static final String PAGE_DESCRIPTION = "List of the examples contributed to the workbench";
	
	/**
	 * Constructor for the example wizard page showing extension contributions.
	 * @param ec example contributions structure loaded from the plugin extension point
	 * @param toolkit shared form toolkit for creating form widgets
	 */
	public ExampleWizardPage(ExampleContributions ec, FormToolkit toolkit) {
		super("Example Wizard Page");
		setTitle(PAGE_TITLE);
		setDescription(PAGE_DESCRIPTION);
		this.exampleContributions = ec;
		this.toolkit = toolkit;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		
		// scrolled form on which to place the block
		Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    	ScrolledForm form = toolkit.createScrolledForm(composite);
    	IManagedForm managedForm = new ManagedForm(toolkit, form);
    	form.setText("Example Details");
    	form.setLayoutData(new GridData(GridData.FILL_BOTH));

    	// block for the master-details pages
    	ScrolledPropertiesBlock block = new ScrolledPropertiesBlock(exampleContributions,this);
    	block.createContent(managedForm);
		
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
		helpSystem.setHelp(control, IHelpContext.EXAMPLE_WIZARD_PAGE);
	}

	/**
	 * Adapter to identify context provider.
	 * Supports the help system contribution.
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

	/**
	 * Sets the selected node for reference by the finish method.
	 * Sets page complete true if selected node is not an inner node such as category.
	 * @param selectedNode selected node from master tree
	 */
	public void setSelectedNode(ISelection selectedNode) {
		if ( selectedNode instanceof IStructuredSelection ) {
			IStructuredSelection iss = (IStructuredSelection)selectedNode;
			if ( iss.isEmpty() == false ) {
				Object firstElement = iss.getFirstElement();
				
				if ( (firstElement instanceof ExampleCategory) == false ) {
					setPageComplete(true);
					setMessage("Select Finish to copy resources into workspace container",
							DialogPage.INFORMATION);
					selectedExample = (Example)firstElement;
					return;
				}
				
			}
		}

		setMessage("Select an example to copy", DialogPage.INFORMATION);
		setPageComplete(false);
	}

	/**
	 * Returns the selected node from the master tree.
	 * Expects to be ExampleCategory, ExamplePattern, etc.
	 * @return selected node, or null 
	 */
	public Example getSelectedExample() {
		return selectedExample;
	}
}