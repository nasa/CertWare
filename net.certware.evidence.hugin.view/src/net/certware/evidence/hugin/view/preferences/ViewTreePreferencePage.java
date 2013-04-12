package net.certware.evidence.hugin.view.preferences;

import net.certware.core.ui.CertWareUI;
import net.certware.evidence.hugin.view.Activator;

import org.eclipse.jface.preference.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;

/**
 * Preference page for SamIam analysis view property processing.
 * @author mrb
 * @since 1.2.1
 */
public class ViewTreePreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	/**
	 * Constructor creates the grid and description.
	 */
	public ViewTreePreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("SamIam Analysis Preferences");
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
				new BooleanFieldEditor(PreferenceConstants.P_NETWORK_VIEW_REFRESH_ON_RESOURCE_CHANGE,
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
		
		// MAP calculations
		Label map = new Label(getFieldEditorParent(), SWT.NONE);
		map.setText("Maximum A Posteriori (MAP) Calculations");
		
		addField(new RadioGroupFieldEditor(PreferenceConstants.P_MAP_COMPUTATION_METHOD,
				"MAP computation method", 1,
				new String[][] { {"&Approximate", PreferenceConstants.P_MAP_COMPUTATION_METHOD_APPROXIMATE }, 
								 {"&Exact", PreferenceConstants.P_MAP_COMPUTATION_METHOD_EXACT }
			}, getFieldEditorParent()));
		
		addField(new RadioGroupFieldEditor(PreferenceConstants.P_MAP_SEARCH_METHOD,
			"MAP search method", 1,
			new String[][] { {"&Taboo Search", PreferenceConstants.P_MAP_SEARCH_METHOD_TABOO }, 
							 {"&Hill Climbing", PreferenceConstants.P_MAP_SEARCH_METHOD_HILL_CLIMBING }
		}, getFieldEditorParent()));

		addField(new RadioGroupFieldEditor(PreferenceConstants.P_MAP_INITIALIZATION_METHOD,
				"MAP initialization method", 1,
				new String[][] { {"&Random", PreferenceConstants.P_MAP_INITIALIZATION_RANDOM }, 
								 {"&Sequential", PreferenceConstants.P_MAP_INITIALIZATION_SEQUENTIAL },
								 {"M&PE",PreferenceConstants.P_MAP_INITIALIZATION_MPE},
								 {"&Maximimum Likelihoods",PreferenceConstants.P_MAP_INITIALIZATION_LIKELIHOOD}
			}, getFieldEditorParent()));
		
		addField(
				new IntegerFieldEditor(PreferenceConstants.P_MAP_SEARCH_STEPS,
						"MAP estimate maximum search steps:",
						getFieldEditorParent()));
		
		addField(
				new IntegerFieldEditor(PreferenceConstants.P_MAP_TIMEOUT,
						"MAP exact timeout (0=unlimited) (sec)",
						getFieldEditorParent()));
				
		addField(
				new IntegerFieldEditor(PreferenceConstants.P_MAP_WIDTH_BARRIER,
						"MAP exact width barrier (0=unlimited)",
						getFieldEditorParent()));
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

}