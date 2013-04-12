package net.certware.measurement.sco.navigator;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.navigator.IDescriptionProvider;


/**
 * Label provider for navigator contribution.
 * Provides summary data about the model resource.
 * @author mrb
 * @since 1.0
 */
public class LabelProvider implements ILabelProvider, IDescriptionProvider {

	/**
	 * Constructor creates the image references.
	 */
	public LabelProvider() {
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {

	}

	@Override
	public String getDescription(Object anElement) {
		if ( anElement instanceof TreeData ) {
			TreeData td = (TreeData)anElement;
			return getText(td);
		}
		return null;
	}

	@Override
	public Image getImage(Object element) {
		if ( element instanceof TreeData ) {

			TreeData td = (TreeData)element;
			if ( td.getType() == TreeData.ARTIFACT_COUNT )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_ARTIFACTS);
			if ( td.getType() == TreeData.BASELINED_COUNT )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_BASELINE);
			if ( td.getType() == TreeData.CRITICAL_COUNT )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_CRITICAL);
			if ( td.getType() == TreeData.NORMAL_COUNT )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_NORMAL);
			if ( td.getType() == TreeData.IMPROVEMENT_COUNT )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_IMPROVEMENT);
			if ( td.getType() == TreeData.NEW_FEATURE_COUNT )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_NEW_FEATURE);
			if ( td.getType() == TreeData.CURRENT_COUNT )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_CURRENT);
			if ( td.getType() == TreeData.TOTAL_COUNT )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_TOTAL);
		}
		return null;
	}

	@Override
	public String getText(Object element) {
		if ( element instanceof TreeData ) {
			TreeData td = (TreeData)element;
			if ( td.getCount() < 0 )
				return td.getDescription();
			return td.getDescription() + ' ' + td.getCount();
		}
		return null;
	}

}
