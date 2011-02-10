package net.certware.measurement.spm.view.preferences;

import net.certware.measurement.spm.view.Activator;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class PreferenceInitializer extends AbstractPreferenceInitializer {


	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		store.setDefault(PreferenceConstants.P_CLEAR_MEASUREMENTS, false);
		store.setDefault(PreferenceConstants.P_MATCH_COMMITS, false);
		store.setDefault(PreferenceConstants.P_INCLUDE_LINE_COUNTS, true);
		
		/*
	IPreferenceStore store = CertWareUI.getDefault().getPreferenceStore();
		
		store.setDefault(PreferenceConstants.P_PROJECT_NAME,"Safety Case");
		store.setDefault(PreferenceConstants.P_LABEL_DECORATOR_SUFFIX, " CertWare");
		
	    PreferenceConverter.setDefault(store, 
	    		PreferenceConstants.P_LABEL_DECORATOR_FOREGROUND, 
	    		new RGB(105,105,105));
	*/
		
		

	}

}
