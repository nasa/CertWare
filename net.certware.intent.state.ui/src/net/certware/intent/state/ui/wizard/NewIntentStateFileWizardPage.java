package net.certware.intent.state.ui.wizard;

import java.io.IOException;
import java.io.InputStream;

import net.certware.intent.state.ui.internal.StateSpecificationActivator;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * Wizard page for creating a new file.
 * Optionally, initialize the file contents from a configuration file.
 * @author mrb
 * @since 1.1.3
 */
public class NewIntentStateFileWizardPage extends WizardNewFileCreationPage {

	public NewIntentStateFileWizardPage(IStructuredSelection selection) {
		super("New Intent Specification State Model Wizard Page", selection);
		setTitle("Intent Specification State Model File");
		setDescription("Creates a new state model file");
		setFileExtension("state");
	}

	@Override
	protected InputStream getInitialContents() {
		try {
			return StateSpecificationActivator.getInstance().getBundle().getEntry("/resources/newFileContents.state").openStream();
		} catch (IOException e) {
			return null; // ignore and create empty comments
		}
	}
}
