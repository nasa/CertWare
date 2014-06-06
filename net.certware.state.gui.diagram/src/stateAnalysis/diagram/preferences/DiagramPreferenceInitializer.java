/*
 * 
 */
package stateAnalysis.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		stateAnalysis.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		stateAnalysis.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		stateAnalysis.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		stateAnalysis.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		stateAnalysis.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
