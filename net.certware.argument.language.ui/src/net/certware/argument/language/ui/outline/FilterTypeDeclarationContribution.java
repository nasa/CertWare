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
 * Filter type contribution.
 * Provides an outline filter for L language type declaration elements.
 * @author mrb
 */
public class FilterTypeDeclarationContribution extends
		AbstractFilterOutlineContribution {

	public static final String PREFERENCE_KEY = "ui.outline.filterTypeDeclarations"; //$NON-NLS-1$
	
	@Inject
	private PluginImageHelper imageHelper;
	
	@Override
	protected boolean apply(IOutlineNode node) {
		return !(node instanceof EObjectNode) || 
				!((EObjectNode)node).getEClass().equals(LPackage.Literals.TYPE_DECLARATION);
	}

	@Override
	public String getPreferenceKey() {
		return PREFERENCE_KEY;
	}

	@Override
	protected void configureAction(Action action) {
		action.setText(Messages.FilterTypeDeclarationContribution_1);
		action.setDescription(Messages.FilterTypeDeclarationContribution_2);
		action.setToolTipText(Messages.FilterTypeDeclarationContribution_3);
		action.setImageDescriptor(getImageDescriptor(Messages.FilterTypeDeclarationContribution_4));
	}
	
	protected ImageDescriptor getImageDescriptor(String iconName) {
		return ImageDescriptor.createFromImage(
				imageHelper.getImage(iconName));
	}

}
