package net.certware.core.ui.preferences;

import net.certware.core.ui.CertWareUI;

import org.eclipse.jface.preference.ColorFieldEditor;
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
public class CorePreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	/**
	 * Creates the page and associates the preference store.
	 */
	public CorePreferencePage() {
		super(GRID);
		setPreferenceStore(CertWareUI.getDefault().getPreferenceStore());
		setDescription("CertWare Core Preferences");
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
		
		addField( 
				new StringFieldEditor(PreferenceConstants.P_PROJECT_NAME,
						"Project &name:",
						getFieldEditorParent()));
		addField( 
				new StringFieldEditor(PreferenceConstants.P_LABEL_DECORATOR_SUFFIX,
						"&Resource decorator suffix:",
						getFieldEditorParent()));
		addField(
		        new ColorFieldEditor(PreferenceConstants.P_LABEL_DECORATOR_FOREGROUND,
		          "Resource decorator &foreground:",
		          getFieldEditorParent()));

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}