package net.certware.evidence.hugin.view.preferences;

import net.certware.evidence.hugin.view.Activator;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;



/**
 * Class used to initialize default preference values.
 * @author mrb
 * @since 1.2.1
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

  /*
   * (non-Javadoc)
   * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
   */
  @Override
  public void initializeDefaultPreferences() {
    IPreferenceStore store = Activator.getDefault().getPreferenceStore();

    store.setDefault(PreferenceConstants.P_NETWORK_VIEW_REFRESH_ON_RESOURCE_CHANGE, true);
    
    store.setDefault(PreferenceConstants.P_MAP_SEARCH_METHOD, PreferenceConstants.P_MAP_SEARCH_METHOD_TABOO);
    store.setDefault(PreferenceConstants.P_MAP_COMPUTATION_METHOD, PreferenceConstants.P_MAP_COMPUTATION_METHOD_APPROXIMATE);
    store.setDefault(PreferenceConstants.P_MAP_INITIALIZATION_METHOD, PreferenceConstants.P_MAP_INITIALIZATION_RANDOM);
    store.setDefault(PreferenceConstants.P_MAP_SEARCH_STEPS,25);
    store.setDefault(PreferenceConstants.P_MAP_WIDTH_BARRIER,0);
    store.setDefault(PreferenceConstants.P_MAP_TIMEOUT,60);
    
    //PreferenceConverter.setDefault(store, PreferenceConstants.P_LABEL_DECORATOR_FOREGROUND, new RGB(105,105,105));
    //store.setDefault(PreferenceConstants.P_LABEL_DECORATOR_SUFFIX, " network");

    PreferenceConverter.setDefault(store, PreferenceConstants.P_WARNING_MESSAGE_FOREGROUND, new RGB(205,92,92));
    PreferenceConverter.setDefault(store, PreferenceConstants.P_INFORMATION_MESSAGE_FOREGROUND, new RGB(60,179,113));
  }

}
