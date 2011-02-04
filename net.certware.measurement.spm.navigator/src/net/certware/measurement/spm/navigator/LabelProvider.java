package net.certware.measurement.spm.navigator;

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
			if ( td.getKey().equals(Activator.NODE_ADAPTABILITY ) )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_ADAPTABILITY);
			if ( td.getKey().equals(Activator.NODE_ADAPTABILITY_TREND) )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_ADAPTABILITY_TREND);
			if ( td.getKey().equals(Activator.NODE_MAINTAINABILITY) )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_MAINTAINABILITY);
			if ( td.getKey().equals(Activator.NODE_MATURITY) )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_MATURITY);
			if ( td.getKey().equals(Activator.NODE_MATURITY_TREND) )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_MATURITY_TREND);
			if ( td.getKey().equals(Activator.NODE_MODULARITY) )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_MODULARITY);
			if ( td.getKey().equals(Activator.NODE_MODULARITY_TREND) )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_MODULARITY_TREND);
			if ( td.getKey().equals(Activator.NODE_REWORK_BACKLOG) )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_REWORK_BACKLOG);
			if ( td.getKey().equals(Activator.NODE_REWORK_RATIO) )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_REWORK_RATIO);
			if ( td.getKey().equals(Activator.NODE_REWORK_STABILITY) )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_REWORK_STABILITY);
			if ( td.getKey().equals(Activator.NODE_SCRAP_RATIO) )
				return Activator.getDefault().getImageRegistry().get(Activator.NODE_SCRAP_RATIO);
		}
		return null;
	}

	/**
	 * Gets the text composed of description and value.
	 * Always uses index zero of the measurement list.
	 * @param element expects a TreeData object.
	 * @return formatting string, or null
	 */
	@Override
	public String getText(Object element) {
		if ( element instanceof TreeData ) {
			TreeData td = (TreeData)element;
			return String.format("%s %s",td.getDescription(),td.getValue(0));
		}
		return null;
	}

}
