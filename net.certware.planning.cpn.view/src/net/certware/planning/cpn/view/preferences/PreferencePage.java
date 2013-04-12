package net.certware.planning.cpn.view.preferences;

import net.certware.core.ui.CertWareUI;
import net.certware.planning.cpn.view.Activator;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * Preference page for CPN view and action preferences.
 * @author mrb
 * @since 1.1
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
		setDescription("CPN View Preferences");
		setImageDescriptor(CertWareUI.getDefault().getImageRegistry().getDescriptor(CertWareUI.PREFERENCES_IMAGE));
	}
	
	/**
	 * Creates the field editors.
	 */
	public void createFieldEditors() {
		addField( 
				new StringFieldEditor(PreferenceConstants.P_FILENAME_MSP,
						"&Root name of CPN-translated Microsoft Project file (without MSPDI suffix):",
						getFieldEditorParent()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}