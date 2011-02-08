package net.certware.measurement.spm.view;

import net.certware.measurement.smm.Annotation;
import net.certware.measurement.smm.Attribute;
import net.certware.measurement.spm.ProjectCommit;
import net.certware.measurement.spm.ProjectModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;


/**
 * Label provider for view contribution.
 * Provides summary data about the model resource.
 * @author mrb
 * @since 1.0
 */
public class LabelProvider implements ILabelProvider {

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

		/*
		// changing the annotation in the model should update the label
		// TODO not sure if this is the right string to test... 
		if ( property.equalsIgnoreCase( SmmPackage.Literals.ANNOTATION__TEXT.getName() )) {
			return true;
		return false
		}
		 */
		return true;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {

	}


	@Override
	public Image getImage(Object element) {

		if ( element instanceof ProjectCommit ) {
			return Activator.getDefault().getImageRegistry().get(Activator.COMMIT_IMAGE);
		}
		if ( element instanceof ProjectModel ) {
			return Activator.getDefault().getImageRegistry().get(Activator.FORM_IMAGE);
		}
		return null;
	}

	/**
	 * Gets the text composed of description and value.
	 * Always uses index zero of the measurement list.
	 * @param element expects an SPM model element.
	 * @return formatting string, or null
	 */
	@Override
	public String getText(Object element) {

		if ( element instanceof ProjectModel ) {
			ProjectModel pm = (ProjectModel)element;
			EList<Attribute> attributes = pm.getAttribute();
			String versionAttribute = "";
			for ( Attribute a : attributes ) {
				if ( "version".equals( a.getTag() ))
					versionAttribute = a.getValue();
			}
			// may fetch an annotation later...
			return String.format("%s %s","SPM Project Model",versionAttribute);
		}

		if ( element instanceof ProjectCommit ) {
			ProjectCommit pc = (ProjectCommit)element;
			EList<Annotation> annotations = pc.getAnnotation();
			String firstAnnotation = "N/A";
			// get the first annotation as discriminator, if any
			if ( annotations != null && annotations.size() > 0 ) {
				firstAnnotation = annotations.get(0).getText();
			}
			return String.format("%s (%s)","Project commit",firstAnnotation);
		}

		return null;
	}

}
