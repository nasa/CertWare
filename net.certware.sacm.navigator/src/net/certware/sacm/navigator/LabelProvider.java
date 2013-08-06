package net.certware.sacm.navigator;

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
			if ( td.getType() == TreeData.COUNT_TYPE_ANNOTATIONS )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_ANNOTATIONS);
			if ( td.getType() == TreeData.COUNT_TYPE_ASSURANCE_CASES )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_ASSURANCE_CASES);
			if ( td.getType() == TreeData.COUNT_TYPE_DATE_TIMES )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_DATE_TIMES);
			if ( td.getType() == TreeData.COUNT_TYPE_MODEL_ELEMENTS )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_MODEL_ELEMENTS);
			if ( td.getType() == TreeData.COUNT_TYPE_SACM_ELEMENTS )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_SACM_ELEMENTS);
			if ( td.getType() == TreeData.COUNT_TYPE_TAGGED_VALUES )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_TAGGED_VALUES);
			if ( td.getType() == TreeData.COUNT_TYPE_UTILITY_ELEMENTS )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_UTILITY_ELEMENTS);
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
