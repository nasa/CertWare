package net.certware.argument.language.ui.outline;

import net.certware.argument.language.ui.internal.LActivator;
import net.certware.argument.language.ui.preferences.PreferenceConstants;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;

public class LOutlinePage extends OutlinePage {

	/**
	 * Outline tree default expansion level.
	 * Uses property specification.
	 */
	@Override
	protected int getDefaultExpansionLevel() {
		IPreferenceStore ps = LActivator.getInstance().getPreferenceStore();
		int level = ps.getInt(PreferenceConstants.P_OUTLINE_LEVEL); 
		return level;
	}

}
