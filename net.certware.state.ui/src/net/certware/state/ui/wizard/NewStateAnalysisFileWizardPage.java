package net.certware.state.ui.wizard;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import net.certware.state.ui.internal.StateAnalysisActivator;

/**
 * Wizard page for creating a new file.
 * Optionally, initialize the file contents from a configuration file.
 * @author mrb
 * @since 1.1.3
 */
public class NewStateAnalysisFileWizardPage extends WizardNewFileCreationPage {

	public NewStateAnalysisFileWizardPage(IStructuredSelection selection) {
		super("New State Analysis Model Wizard Page", selection);
		setTitle("State Analysis Model File");
		setDescription("Creates a new state analysis model file");
		setFileExtension("sa");
	}

	@Override
	protected InputStream getInitialContents() {
		try {
			return StateAnalysisActivator.getInstance().getBundle().getEntry("/resources/newFileContents.sa").openStream();
		} catch (IOException e) {
			return null; // ignore and create empty comments
		}
	}
}
