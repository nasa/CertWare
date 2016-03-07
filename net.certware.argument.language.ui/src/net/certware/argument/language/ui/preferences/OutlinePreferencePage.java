package net.certware.argument.language.ui.preferences;

//import net.certware.core.ui.CertWareUI;

import net.certware.argument.language.ui.LUiModule;
import net.certware.argument.language.ui.internal.LActivator;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FontFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * Preference page for outline view preference processing.
 * @author mrb
 */
public class OutlinePreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	/**
	 * Constructor creates the grid and description.
	 * Creates image descriptor from plugin's image registry.
	 */
	public OutlinePreferencePage() {
		super(GRID);
		setPreferenceStore(LActivator.getInstance().getPreferenceStore());
		setDescription(Messages.OutlinePreferencePage_0);
		this.setImageDescriptor( LActivator.getInstance().getImageRegistry().getDescriptor(LUiModule.L_CERTWARE_IMAGE));
	}

	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		addField(new ColorFieldEditor(PreferenceConstants.P_SET_EXPRESSION_TEXT_COLOR,
				Messages.OutlinePreferencePage_1, getFieldEditorParent()));
		addField(new FontFieldEditor(PreferenceConstants.P_SET_EXPRESSION_TEXT_FONT, 
				Messages.OutlinePreferencePage_2, getFieldEditorParent()));

		addField(new ColorFieldEditor(PreferenceConstants.P_TYPE_DECLARATION_TEXT_COLOR,
				Messages.OutlinePreferencePage_3, getFieldEditorParent()));
		addField(new FontFieldEditor(PreferenceConstants.P_TYPE_DECLARATION_TEXT_FONT, 
				Messages.OutlinePreferencePage_4, getFieldEditorParent()));

		addField(new ColorFieldEditor(PreferenceConstants.P_CONSTANT_DECLARATION_TEXT_COLOR,
				Messages.OutlinePreferencePage_5, getFieldEditorParent()));
		addField(new FontFieldEditor(PreferenceConstants.P_CONSTANT_DECLARATION_TEXT_FONT, 
				Messages.OutlinePreferencePage_6, getFieldEditorParent()));

		addField(new ColorFieldEditor(PreferenceConstants.P_RULE_TEXT_COLOR,
				Messages.OutlinePreferencePage_7, getFieldEditorParent()));
		addField(new FontFieldEditor(PreferenceConstants.P_RULE_TEXT_FONT, 
				Messages.OutlinePreferencePage_8, getFieldEditorParent()));
		addField(new ColorFieldEditor(PreferenceConstants.P_MAYBE_TEXT_COLOR,
				Messages.OutlinePreferencePage_11, getFieldEditorParent()));
		addField(new FontFieldEditor(PreferenceConstants.P_MAYBE_TEXT_FONT, 
				Messages.OutlinePreferencePage_12, getFieldEditorParent()));

		addField(new ColorFieldEditor(PreferenceConstants.P_CONDITIONAL_TEXT_COLOR,
				Messages.OutlinePreferencePage_9, getFieldEditorParent()));
		addField(new FontFieldEditor(PreferenceConstants.P_CONDITIONAL_TEXT_FONT, 
				Messages.OutlinePreferencePage_10, getFieldEditorParent()));
		addField(new ColorFieldEditor(PreferenceConstants.P_CONSTRAINT_TEXT_COLOR,
				Messages.OutlinePreferencePage_13, getFieldEditorParent()));
		addField(new FontFieldEditor(PreferenceConstants.P_CONSTRAINT_TEXT_FONT, 
				Messages.OutlinePreferencePage_14, getFieldEditorParent()));
		

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(LActivator.getInstance().getPreferenceStore());
	}

}