package net.certware.history.egit.preferences;

import net.certware.core.ui.CertWareUI;
import net.certware.history.egit.Activator;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * CertWare core preferences.
 * Meant to be the base page for CertWare preferences.
 * @author mrb
 * @since 1.0
 */
public class PreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	/**
	 * Creates the page and associates the preference store.
	 */
	public PreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("EGit History Preferences");
		setImageDescriptor(CertWareUI.getDefault().getImageRegistry().getDescriptor(CertWareUI.PREFERENCES_IMAGE));
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
		
		/*
		addField( 
				new BooleanFieldEditor(PreferenceConstants.P_CLEAR_MEASUREMENTS,
						"Whether to clear earlier measurement lists when computing new metric values",
						getFieldEditorParent()));
		addField( 
				new BooleanFieldEditor(PreferenceConstants.P_MATCH_COMMITS,
						"Whether to match commit IDs when gathering change orders",
						getFieldEditorParent()));
		addField( 
				new BooleanFieldEditor(PreferenceConstants.P_INCLUDE_LINE_COUNTS,
						"Whether to include line counts when gather change orders",
						getFieldEditorParent()));
		*/
		addField( 
				new StringFieldEditor(PreferenceConstants.P_FILENAME_SCO,
						"&Root name of changes file (without SCO suffix):",
						getFieldEditorParent()));
		/*
		addField(
		        new ColorFieldEditor(PreferenceConstants.P_LABEL_DECORATOR_FOREGROUND,
		          "Resource decorator &foreground:",
		          getFieldEditorParent()));
		          */

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}