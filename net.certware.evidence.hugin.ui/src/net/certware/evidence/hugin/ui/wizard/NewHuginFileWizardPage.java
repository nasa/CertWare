package net.certware.evidence.hugin.ui.wizard;

import java.io.IOException;
import java.io.InputStream;

import net.certware.evidence.hugin.ui.internal.NetDSLActivator;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * Wizard page for creating a new file.
 * Optionally, initialize the file contents from a configuration file.
 * @author mrb
 * @since 1.1.3
 */
public class NewHuginFileWizardPage extends WizardNewFileCreationPage {

	public NewHuginFileWizardPage(IStructuredSelection selection) {
		super("New Hugin File Wizard Page", selection);
		setTitle("Hugin NET File");
		setDescription("Creates a new Hugin NET file");
		setFileExtension("net");
	}

	@Override
	protected InputStream getInitialContents() {
		try {
			return NetDSLActivator.getInstance().getBundle().getEntry("/resources/newFileContents.net").openStream();
		} catch (IOException e) {
			return null; // ignore and create empty comments
		}
	}
}
