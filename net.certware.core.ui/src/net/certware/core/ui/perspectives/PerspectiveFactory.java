package net.certware.core.ui.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class PerspectiveFactory implements IPerspectiveFactory {

	/** perspective layout width ratio for the project explorer left of editor */
	protected static final float RATIO_PROJECT_EXPLORER = 0.15f;
	/** perspective layout width radio for the editor */
	protected static final float RATIO_EDITOR_AREA = 0.35f;
	/** perspective layout width ratio for elements right of the editor */
	protected static final float RATIO_RHS = 0.50f;
	/** perspective layout height ratio for elements below the outline on right hand side */
	protected static final float RATIO_BOTTOM = 0.70f;

	protected static final String ERROR_LOG_VIEW_ID = "org.eclipse.pde.runtime.LogView"; //$NON-NLS-1$

	// these probably aren't needed, now implemented as perspective extensions in their plugins
	protected static final String CPN_VIEW_ID = "net.certware.planning.cpn.view.masterdetailsview"; //$NON-NLS-1$
	protected static final String SCO_VIEW_ID = "net.certware.measurement.sco.view.masterdetailsview"; //$NON-NLS-1$

	/**
	 * Create the initial perspective layout. 
	 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
	 */
	@Override
	public void createInitialLayout(IPageLayout layout) {

		// get the editor area
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);

		// put the project explorer on the left
		layout.addView(IPageLayout.ID_PROJECT_EXPLORER, IPageLayout.LEFT, RATIO_PROJECT_EXPLORER, editorArea);

		// put the editor to the right of the project explorer
		//	layout.addView(IPageLayout.ID_EDITOR_AREA, IPageLayout.RIGHT, RATIO_EDITOR_AREA, IPageLayout.ID_PROJECT_EXPLORER);

		// put the outline view on the top right
		IFolderLayout topright = layout.createFolder("topright", IPageLayout.RIGHT, RATIO_RHS, editorArea); //$NON-NLS-1$
		topright.addView(IPageLayout.ID_OUTLINE);
		topright.addView(IPageLayout.ID_TASK_LIST);

		// put the other stuff on the bottom right
		IFolderLayout bottomright =
			layout.createFolder("bottomright", IPageLayout.BOTTOM, RATIO_BOTTOM, IPageLayout.ID_OUTLINE); //$NON-NLS-1$
		bottomright.addView(IPageLayout.ID_PROP_SHEET);
		bottomright.addView(IPageLayout.ID_PROBLEM_VIEW);
		bottomright.addView(ERROR_LOG_VIEW_ID);
	}

}
