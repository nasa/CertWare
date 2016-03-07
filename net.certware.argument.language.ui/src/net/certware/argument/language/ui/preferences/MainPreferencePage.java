package net.certware.argument.language.ui.preferences;

import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage;

public class MainPreferencePage extends LanguageRootPreferencePage {
	@Override
	protected void createFieldEditors() {
		super.createFieldEditors();
		IntegerFieldEditor levelFieldEditor = 
				new IntegerFieldEditor("outlineLevel",Messages.MainPreferencePage_0, getFieldEditorParent()); //$NON-NLS-1$
		levelFieldEditor.setPreferenceStore(doGetPreferenceStore());
		addField(levelFieldEditor);
	}
}
