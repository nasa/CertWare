package net.certware.argument.gsn.ui.wizard;

import java.io.IOException;
import java.io.InputStream;

import net.certware.argument.gsn.ui.internal.GsnDslActivator;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * Wizard page for creating a new file.
 * Optionally, initialize the file contents from a configuration file.
 * @author mrb
 * @since 1.1.3
 */
public class NewGoalFileWizardPage extends WizardNewFileCreationPage {

	public NewGoalFileWizardPage(IStructuredSelection selection) {
		super("New Semi-Formal Proof Wizard Page", selection);
		setTitle("Semi-Formal Proof File");
		setDescription("Creates a new semi-formal proof file");
		setFileExtension("sfp");
	}

	@Override
	protected InputStream getInitialContents() {
		try {
			return GsnDslActivator.getInstance().getBundle().getEntry("/resources/newFileContents.gsnl").openStream();
		} catch (IOException e) {
			return null; // ignore and create empty comments
		}
	}
}
