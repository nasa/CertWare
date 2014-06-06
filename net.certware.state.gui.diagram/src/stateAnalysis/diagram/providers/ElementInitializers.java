/*
 * 
 */
package stateAnalysis.diagram.providers;

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
		ElementInitializers cached = stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
