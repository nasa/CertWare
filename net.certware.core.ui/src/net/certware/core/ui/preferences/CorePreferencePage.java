package net.certware.core.ui.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import net.certware.core.ui.CertWareUI;

/**
 * CertWare core preferences.
 * Meant to be the base page for CertWare preferences.
 * @author mrb
 */
public class CorePreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	/** image file name */
	private static final String IMAGE_FILE = "icons/obj16/preferences.gif"; //$NON-NLS-1$
	
	/**
	 * Creates the page and associates the preference store.
	 */
	public CorePreferencePage() {
		super(GRID);
		setPreferenceStore(CertWareUI.getDefault().getPreferenceStore());
		setDescription("CertWare core preferences");
		setImageDescriptor(CertWareUI.imageDescriptorFromPlugin(CertWareUI.PLUGIN_ID, IMAGE_FILE));
	}
	
	/**
	 * Creates the field editors.
	 */
	public void createFieldEditors() {
		/*
		addField(new DirectoryFieldEditor(PreferenceConstants.P_PATH, 
				"&Directory preference:", getFieldEditorParent()));
		addField(
			new BooleanFieldEditor(
				PreferenceConstants.P_BOOLEAN,
				"&An example of a boolean preference",
				getFieldEditorParent()));

		addField(new RadioGroupFieldEditor(
				PreferenceConstants.P_CHOICE,
			"An example of a multiple-choice preference",
			1,
			new String[][] { { "&Choice 1", "choice1" }, {
				"C&hoice 2", "choice2" }
		}, getFieldEditorParent()));
		addField(
			new StringFieldEditor(PreferenceConstants.P_STRING, "A &text preference:", getFieldEditorParent()));
		*/
		
		addField( new StringFieldEditor(PreferenceConstants.P_PROJECT_NAME,"Project name:",getFieldEditorParent()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}