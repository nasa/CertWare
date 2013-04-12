package net.certware.verification.checklist.view.preferences;

import net.certware.core.ui.CertWareUI;
import net.certware.verification.checklist.view.Activator;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;

/**
 * Preference page for checklist view property processing.
 * @author mrb
 * @since 1.2.1
 */
public class ViewListPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	/**
	 * Constructor creates the grid and description.
	 */
	public ViewListPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Checklist View Preferences");
		this.setImageDescriptor( CertWareUI.getDefault().getImageRegistry().getDescriptor(CertWareUI.PREFERENCES_IMAGE));
	}

	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		/*
		addField(new DirectoryFieldEditor(PreferenceConstants.P_PATH, 
				"&Directory preference:", getFieldEditorParent()));

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
        new ColorFieldEditor(PreferenceConstants.P_LABEL_DECORATOR_FOREGROUND,
          "Label decorator &foreground:",
          getFieldEditorParent()));

      addField(
        new StringFieldEditor(PreferenceConstants.P_LABEL_DECORATOR_SUFFIX, 
          "Label decorator &suffix:", getFieldEditorParent()));
		 */

		addField(
				new BooleanFieldEditor(PreferenceConstants.P_CHECKLIST_VIEW_REFRESH_ON_RESOURCE_CHANGE,
						"Refresh view on resource change:",
						getFieldEditorParent()));

		addField(
				new ColorFieldEditor(PreferenceConstants.P_INFORMATION_MESSAGE_FOREGROUND,
						"&Information message foreground:",
						getFieldEditorParent()));

		addField(
				new ColorFieldEditor(PreferenceConstants.P_WARNING_MESSAGE_FOREGROUND,
						"&Warning message foreground:",
						getFieldEditorParent()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

}