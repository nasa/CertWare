package net.certware.argument.language.ui.outline;

import net.certware.argument.language.l.LPackage;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.AbstractFilterOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;

import com.google.inject.Inject;

/**
 * Filter rule contribution.
 * Provides an outline filter for L language Rule elements.
 * @author mrb
 */
public class FilterRuleContribution extends
		AbstractFilterOutlineContribution {

	public static final String PREFERENCE_KEY = "ui.outline.filterRules"; //$NON-NLS-1$
	
	@Inject
	private PluginImageHelper imageHelper;
	
	@Override
	protected boolean apply(IOutlineNode node) {
		return !(node instanceof EObjectNode) || 
				!((EObjectNode)node).getEClass().equals(LPackage.Literals.RULE);
	}

	@Override
	public String getPreferenceKey() {
		return PREFERENCE_KEY;
	}

	@Override
	protected void configureAction(Action action) {
		action.setText(Messages.FilterRuleContribution_0);
		action.setDescription(Messages.FilterRuleContribution_1);
		action.setToolTipText(Messages.FilterRuleContribution_2);
		action.setImageDescriptor(getImageDescriptor(Messages.FilterRuleContribution_3));
	}
	
	protected ImageDescriptor getImageDescriptor(String iconName) {
		return ImageDescriptor.createFromImage(
				imageHelper.getImage(iconName));
	}

}
