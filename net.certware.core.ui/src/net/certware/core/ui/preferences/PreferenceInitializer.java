package net.certware.core.ui.preferences;

import net.certware.core.ui.CertWareUI;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = CertWareUI.getDefault().getPreferenceStore();
		
		store.setDefault(PreferenceConstants.P_PROJECT_NAME,"Safety Case");
		store.setDefault(PreferenceConstants.P_LABEL_DECORATOR_SUFFIX, " CertWare");
		
	    PreferenceConverter.setDefault(store, 
	    		PreferenceConstants.P_LABEL_DECORATOR_FOREGROUND, 
	    		new RGB(105,105,105));

	}

}
