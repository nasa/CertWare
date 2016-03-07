package net.certware.argument.language.ui.preferences;

import net.certware.argument.language.ui.internal.LActivator;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;



/**
 * Class used to initialize default preference values.
 * @author mrb
 */
public class OutlinePreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {

		IPreferenceStore store = LActivator.getInstance().getPreferenceStore();
		String defaultFont = LActivator.getInstance().getWorkbench().getDisplay().getSystemFont().toString();

		// outline page
		PreferenceConverter.setDefault(store, 
				PreferenceConstants.P_SET_EXPRESSION_TEXT_COLOR, new RGB(0,102,204)); // blue
		store.setDefault(PreferenceConstants.P_SET_EXPRESSION_TEXT_FONT,defaultFont);

		PreferenceConverter.setDefault(store,
				PreferenceConstants.P_TYPE_DECLARATION_TEXT_COLOR, new RGB(153,0,153)); // purple
		store.setDefault(PreferenceConstants.P_TYPE_DECLARATION_TEXT_FONT, defaultFont);


		PreferenceConverter.setDefault(store,
				PreferenceConstants.P_CONSTANT_DECLARATION_TEXT_COLOR, new RGB(153,0,76)); // burgundy
		store.setDefault(PreferenceConstants.P_CONSTANT_DECLARATION_TEXT_FONT, defaultFont);

		PreferenceConverter.setDefault(store,
				PreferenceConstants.P_MAYBE_TEXT_COLOR, new RGB(32,32,32)); // gray
		store.setDefault(PreferenceConstants.P_MAYBE_TEXT_FONT, defaultFont);

		PreferenceConverter.setDefault(store,
				PreferenceConstants.P_RULE_TEXT_COLOR, new RGB(32,32,32)); // gray
		store.setDefault(PreferenceConstants.P_RULE_TEXT_FONT, defaultFont);

		PreferenceConverter.setDefault(store,
				PreferenceConstants.P_CONDITIONAL_TEXT_COLOR, new RGB(255,128,0)); // orange
		store.setDefault(PreferenceConstants.P_CONDITIONAL_TEXT_FONT, defaultFont);

		PreferenceConverter.setDefault(store,
				PreferenceConstants.P_CONSTRAINT_TEXT_COLOR, new RGB(255,128,0)); // orange
		store.setDefault(PreferenceConstants.P_CONSTRAINT_TEXT_FONT, defaultFont);

		// main page
		store.setDefault(PreferenceConstants.P_OUTLINE_LEVEL, 3);
	}

}
