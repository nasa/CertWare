package net.certware.planning.cpn.view.preferences;

import net.certware.planning.cpn.view.Activator;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class PreferenceInitializer extends AbstractPreferenceInitializer {


	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// setting filename for MSP to empty means translator will mimic selected file name by default
		store.setDefault(PreferenceConstants.P_FILENAME_MSP, "");
	}

}
