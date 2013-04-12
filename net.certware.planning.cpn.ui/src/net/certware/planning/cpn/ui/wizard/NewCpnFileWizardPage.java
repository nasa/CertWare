package net.certware.planning.cpn.ui.wizard;

import java.io.IOException;
import java.io.InputStream;

import net.certware.planning.cpn.ui.internal.CpnDslActivator;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * Wizard page for creating a new file.
 * Optionally, initialize the file contents from a configuration file.
 * @author mrb
 * @since 1.1.3
 */
public class NewCpnFileWizardPage extends WizardNewFileCreationPage {

	public NewCpnFileWizardPage(IStructuredSelection selection) {
		super("New CPN File Wizard Page", selection);
		setTitle("CertWare Planning Notation File");
		setDescription("Creates a new CertWare planning notation file");
		setFileExtension("cpn");
	}

	@Override
	protected InputStream getInitialContents() {
		try {
			return CpnDslActivator.getInstance().getBundle().getEntry("/resources/newFileContents.cpn").openStream();
		} catch (IOException e) {
			return null; // ignore and create empty comments
		}
	}
}
