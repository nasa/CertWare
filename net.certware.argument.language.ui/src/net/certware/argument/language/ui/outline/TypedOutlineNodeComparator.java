package net.certware.argument.language.ui.outline;

import net.certware.argument.language.l.LPackage;

import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.SortOutlineContribution.DefaultComparator;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;

/**
 * Provides a comparator to sort the language item outline by category.
 * @author mrb
 */
public class TypedOutlineNodeComparator extends DefaultComparator {
	@Override
	public int getCategory(IOutlineNode node) {
		if ( node instanceof EObjectNode) {
			switch(((EObjectNode)node).getEClass().getClassifierID()) {
			case LPackage.CONSTANT_DECLARATION:
				return -30;
			case LPackage.TYPE_DECLARATION:
				return -20;
			case LPackage.RULE:
				return -10;
			}
		}
		return Integer.MIN_VALUE;
	}
}
