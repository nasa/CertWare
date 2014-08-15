package net.certware.hazard.stpa.ui.wizard;

import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import com.google.inject.Inject;

public class HazardAnalysisNewProjectWizard extends org.eclipse.xtext.ui.wizard.XtextNewProjectWizard {

	private WizardNewProjectCreationPage mainPage;

	@Inject
	public HazardAnalysisNewProjectWizard(IProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New HazardAnalysis Project");
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	public void addPages() {
		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
		mainPage.setTitle("HazardAnalysis Project");
		mainPage.setDescription("Create a new HazardAnalysis project.");
		addPage(mainPage);
	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IProjectInfo getProjectInfo() {
		net.certware.hazard.stpa.ui.wizard.HazardAnalysisProjectInfo projectInfo = new net.certware.hazard.stpa.ui.wizard.HazardAnalysisProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		return projectInfo;
	}

}
