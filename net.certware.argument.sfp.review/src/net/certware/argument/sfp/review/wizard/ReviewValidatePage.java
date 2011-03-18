package net.certware.argument.sfp.review.wizard;

import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.core.ui.help.IHelpContext;

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
 * Review validate wizard page.
 * Creates a master-details block with proof and statement details.
 * @author mrb
 * @since 1.0.3
 */
public class ReviewValidatePage extends WizardPage implements IHelpContext {

	/** context provider for help system */
	static ReviewContextProvider contextprovider = null;
	/** page title */
	static final String PAGE_TITLE = "CertWare Semi-Formal Proof Review";
	/** page description */
	static final String PAGE_DESCRIPTION = "Proof Statement Review";
	/** proof to process */
	Proof proof;
	/** form widget toolkit managed by activator */
	FormToolkit toolkit;
	/** whether the content has been modified */
	boolean isModified = false;
	/** setup page for validation field access */
	ReviewSetupPage setupPage;
	/** scrolled properties block */
	ScrolledPropertiesBlock block;
	
	/**
	 * Constructor for the review wizard validate page.
	 * @param proof proof to review
	 * @param toolkit form toolkit
	 * @param setupPage associated setup page
	 */
	public ReviewValidatePage(Proof proof, FormToolkit toolkit,ReviewSetupPage setupPage) {
		super("Proof Review Page");
		setTitle(PAGE_TITLE);
		setDescription(PAGE_DESCRIPTION);
		this.proof = proof;
		this.toolkit = toolkit;
		this.setupPage = setupPage;
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
    	form.setText("Proof Statement Validation");
    	form.setLayoutData(new GridData(GridData.FILL_BOTH));

    	// block for the master-details pages
    	block = new ScrolledPropertiesBlock(proof,this,setupPage);
    	block.createContent(managedForm);
		
		setMessage("Select a statement to review", DialogPage.INFORMATION);
		setControl(composite);
		setHelpContextIDs(composite);
		setPageComplete(false);
	}
	
	@Override
	public void dispose() {
		if ( block != null ) {
			block.dispose();
		}
		super.dispose();
	}

	/**
	 * Set the context IDs for help system.  
	 * Wait to call until site has been established.
	 */
	private void setHelpContextIDs(Control control) {
		IWorkbenchHelpSystem helpSystem = PlatformUI.getWorkbench().getHelpSystem();
		helpSystem.setHelp(control, IHelpContext.REVIEW_WIZARD_PAGE);
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
	 * Sets the selected node for reference by the finish method.
	 * Sets page complete true if selected node is not an inner node such as category.
	 * @param selectedNode selected node from master tree
	 */
	@SuppressWarnings("unused")
	public void setSelectedNode(ISelection selectedNode) {
		if ( selectedNode instanceof IStructuredSelection ) {
			IStructuredSelection iss = (IStructuredSelection)selectedNode;
			if ( iss.isEmpty() == false ) {
				Object firstElement = iss.getFirstElement();
			}
		}

	}

	/**
	 * Returns the selected node from the master tree.
	 * Expects to be Proof, Statement, etc.
	 * @return selected node, or null 
	 */
	public boolean isModified() {
		return isModified;
	}
}