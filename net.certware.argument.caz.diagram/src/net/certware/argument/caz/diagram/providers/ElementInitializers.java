package net.certware.argument.caz.diagram.providers;

import net.certware.argument.caz.diagram.part.CazDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = CazDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			CazDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
