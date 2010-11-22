package net.certware.argument.gsz.diagram.providers;

import net.certware.argument.gsz.diagram.part.GszDiagramEditorPlugin;

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
		ElementInitializers cached = GszDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			GszDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
