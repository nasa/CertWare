/*
 * 
 */
package stateAnalysis.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class StateAnalysisNavigatorItem extends
		stateAnalysis.diagram.navigator.StateAnalysisAbstractNavigatorItem {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem
						&& (adapterType == View.class || adapterType == EObject.class)) {
					return ((stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem) adaptableObject)
							.getView();
				}
				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private View myView;

	/**
	 * @generated
	 */
	private boolean myLeaf = false;

	/**
	 * @generated
	 */
	public StateAnalysisNavigatorItem(View view, Object parent, boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	 * @generated
	 */
	public View getView() {
		return myView;
	}

	/**
	 * @generated
	 */
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem) {
			return EcoreUtil
					.getURI(getView())
					.equals(EcoreUtil
							.getURI(((stateAnalysis.diagram.navigator.StateAnalysisNavigatorItem) obj)
									.getView()));
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
