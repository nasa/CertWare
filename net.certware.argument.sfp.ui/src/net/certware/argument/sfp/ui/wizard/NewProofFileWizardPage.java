package net.certware.argument.sfp.ui.wizard;

import java.io.IOException;
import java.io.InputStream;

import net.certware.argument.sfp.ui.internal.SemiFormalProofActivator;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * Wizard page for creating a new file.
 * Optionally, initialize the file contents from a configuration file.
 * @author mrb
 * @since 1.1.3
 */
public class NewProofFileWizardPage extends WizardNewFileCreationPage {

	public NewProofFileWizardPage(IStructuredSelection selection) {
		super("New Semi-Formal Proof Wizard Page", selection);
		setTitle("Semi-Formal Proof File");
		setDescription("Creates a new semi-formal proof file");
		setFileExtension("sfp");
	}

	@Override
	protected InputStream getInitialContents() {
		try {
			return SemiFormalProofActivator.getInstance().getBundle().getEntry("/resources/newFileContents.sfp").openStream();
		} catch (IOException e) {
			return null; // ignore and create empty comments
		}
	}
}
