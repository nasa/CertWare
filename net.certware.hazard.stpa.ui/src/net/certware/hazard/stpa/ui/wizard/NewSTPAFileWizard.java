package net.certware.hazard.stpa.ui.wizard;

import net.certware.core.ui.CertWareUI;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

/**
 * A wizard to prompt for creating a new file.
 * @author mrb
 * @since 2.0.1
 */
public class NewSTPAFileWizard extends Wizard implements INewWizard {
	/** initial selection, presumably a container */
	private IStructuredSelection selection;
	/** wizard page for file specifics */
	private NewSTPAFileWizardPage newFileWizardPage;
	@SuppressWarnings("unused")
	/** workbench selected */
	private IWorkbench workbench;

	/**
	 * Constructor.
	 * Adds window title and image from CertWare UI registry.
	 * Sets progress monitor and help to false.
	 * Sets force buttons to false.
	 */
	public NewSTPAFileWizard() {
		setWindowTitle("New STPA model File");
		setDefaultPageImageDescriptor(
				CertWareUI.getDefault().getImageRegistry().getDescriptor(
						CertWareUI.CERTWARE_WIZARD_BANNER));
		setNeedsProgressMonitor(false);
		setForcePreviousAndNextButtons(false);
		setHelpAvailable(false); // TODO add help
	} 

	@Override
	public void addPages() {
		newFileWizardPage = new NewSTPAFileWizardPage(selection);
		addPage(newFileWizardPage);
	}

	@Override
	public boolean performFinish() {
		IFile file = newFileWizardPage.createNewFile();
		if (file != null)
			return true;
		else
			return false;
	}

	/**
	 * Saves selection values for later use.
	 * @param workbench active workbench
	 * @param selection structured selection, presumably container
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}
}
