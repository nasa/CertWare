package net.certware.argument.sfp.review.preferences;

import net.certware.argument.sfp.review.Activator;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;



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

    store.setDefault(PreferenceConstants.P_SHOW_PREMISE_VALIDITY, true);
    store.setDefault(PreferenceConstants.P_ITEM_VALID_LABEL, "Valid");
    store.setDefault(PreferenceConstants.P_ITEM_INVALID_LABEL, "Invalid");
    store.setDefault(PreferenceConstants.P_ITEM_UNKNOWN_LABEL, "Unknown");

  }

}
