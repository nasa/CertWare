package net.certware.hazard.stpa.ui.wizard;

import java.io.IOException;
import java.io.InputStream;

import net.certware.hazard.stpa.ui.internal.HazardAnalysisActivator;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * Wizard page for creating a new file.
 * Optionally, initialize the file contents from a configuration file.
 * @author mrb
 * @since 1.1.3
 */
public class NewSTPAFileWizardPage extends WizardNewFileCreationPage {

	public NewSTPAFileWizardPage(IStructuredSelection selection) {
		super("New STPA Model Wizard Page", selection);
		setTitle("STPA Model File");
		setDescription("Creates a new STPA model file");
		setFileExtension("stpa");
	}

	@Override
	protected InputStream getInitialContents() {
		try {
			return HazardAnalysisActivator.getInstance().getBundle().getEntry("/resources/newFileContents.stpa").openStream();
		} catch (IOException e) {
			return null; // ignore and create empty comments
		}
	}
}
