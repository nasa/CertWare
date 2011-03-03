package net.certware.evidence.hugin.ui.wizard;

import net.certware.core.ui.CertWareUI;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

/**
 * A wizard to prompt for creating a new file.
 * @author mrb
 * @since 1.1.3
 */
public class NewHuginFileWizard extends Wizard implements INewWizard {
	/** initial selection, presumably a container */
	private IStructuredSelection selection;
	/** wizard page for file specifics */
	private NewHuginFileWizardPage newFileWizardPage;
	@SuppressWarnings("unused")
	/** workbench selected */
	private IWorkbench workbench;

	public NewHuginFileWizard() {
		setWindowTitle("New Hugin NET File");
		setDefaultPageImageDescriptor(
				CertWareUI.getDefault().getImageRegistry().getDescriptor(
						CertWareUI.CERTWARE_WIZARD_BANNER));
		setNeedsProgressMonitor(false);
		setForcePreviousAndNextButtons(false);
		setHelpAvailable(false); // TODO add help
	} 

	@Override
	public void addPages() {
		newFileWizardPage = new NewHuginFileWizardPage(selection);
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
