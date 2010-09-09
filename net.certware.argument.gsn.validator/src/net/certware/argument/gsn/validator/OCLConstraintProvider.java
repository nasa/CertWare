
package net.certware.argument.gsn.validator;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collection;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.validation.model.Category;
import org.eclipse.emf.validation.model.CategoryManager;
import org.eclipse.emf.validation.model.IModelConstraint;
import org.eclipse.emf.validation.service.AbstractConstraintProvider;
import org.eclipse.emf.validation.service.ConstraintExistsException;
import org.eclipse.ocl.OCLInput;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.utilities.UMLReflection;
import org.osgi.framework.Bundle;

/**
 * Provider of constraints parsed from OCL documents.
 */
public class OCLConstraintProvider extends AbstractConstraintProvider {
	private static final String E_OCL = "ocl"; //$NON-NLS-1$
	private static final String A_PATH = "path"; //$NON-NLS-1$
	private static final String A_CATEGORY = "category"; //$NON-NLS-1$
	private static final String PLUGIN_ID = "net.certware.argument.gsn.validator"; //$NON-NLS-1$
	
	@Override
    public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
		super.setInitializationData(config, propertyName, data);

		// create the constraint category
		String categoryID = config.getDeclaringExtension().getUniqueIdentifier();
		if (categoryID == null) {
			categoryID = "OCLProvider@" + Long.toHexString(System.identityHashCode(this)); //$NON-NLS-1$
		}

		categoryID = "certware/" + categoryID; //$NON-NLS-1$
		
		System.err.println("initialization data " + categoryID);
		
		Category category = CategoryManager.getInstance().getCategory(categoryID);
		category.setName(config.getAttribute(A_CATEGORY));
		
		Bundle contributor = Platform.getBundle(
				config.getDeclaringExtension().getNamespaceIdentifier());
		
		IConfigurationElement[] ocls = config.getChildren(E_OCL);
		for (int i = 0; i < ocls.length; i++) {
			String path = ocls[i].getAttribute(A_PATH);
			
			if ((path != null) && (path.length() > 0)) {
				// categorize by OCL document name
				IPath ipath = new Path(path);
				parseConstraints(
						CategoryManager.getInstance().getCategory(category, ipath.lastSegment()),
						contributor, path);
			}
		}
		
		try {
		    registerConstraints(getConstraints());
		} catch (ConstraintExistsException e) {
		    throw new CoreException(new Status(
		        IStatus.ERROR,
		        PLUGIN_ID,
		        1,
		        "Registration of OCL constraints failed",
		        e));
		}
	}
	
	private void parseConstraints(Category category, Bundle bundle, String path) {
		URL url = bundle.getEntry(path);
		
		if (url != null) {
			try {
				InputStream input = url.openStream();
				
				try {
					parseConstraints(category, bundle.getSymbolicName(), input);
				} catch (ParserException e) {
					String msg = String.format("Failed to parse OCL constraints in %s:%s",
							bundle.getSymbolicName(), path);
					CertWareLog.logError(msg,e);
				} finally {
					input.close();
				}
			} catch (IOException e) {
				String msg = String.format("Failed to load OCL constraints from %s:%s",
						bundle.getSymbolicName(), path);
				CertWareLog.logError(msg,e);
			}
		}
	}
	
	private void parseConstraints(Category category, String namespace, InputStream input)
			throws ParserException {
		
		OCLInput oclInput = new OCLInput(input);
		
		OCL ocl = OCL.newInstance();
		
		for (Constraint constraint : ocl.parse(oclInput)) {
			if (isInvariant(constraint)) {
				// only add invariant constraints for validation
				addConstraint(category, namespace, ocl, constraint);
			}
		}
	}
	
	private boolean isInvariant(Constraint constraint) {
		return UMLReflection.INVARIANT.equals(constraint.getStereotype());
	}
	
	private void addConstraint(Category category, String namespace, OCL ocl, Constraint constraint) {
		Collection<IModelConstraint> constraints = getConstraints();
		
		OCLConstraintDescriptor desc = new OCLConstraintDescriptor(
				namespace, constraint, constraints.size() + 1);
		if (category != null) {
			category.addConstraint(desc);
		}
		
		constraints.add(new OCLConstraint(desc, ocl));
	}
}
