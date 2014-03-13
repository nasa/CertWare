package net.certware.sacm.graphiti.feature;

import java.util.List;

import net.certware.sacm.SACM.AssuranceCase;
import net.certware.sacm.SACM.Argumentation.Argumentation;
import net.certware.sacm.SACM.Argumentation.ArgumentationFactory;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;

public class ArgumentationCreateFeature extends AbstractCreateFeature {

	/**
	 * Argumentation create feature constructor.
	 * @param fp feature provider
	 */
	public ArgumentationCreateFeature(IFeatureProvider fp) {
		super(fp, "Argumentation", "Create an argumentation");
	}

	public boolean canCreate(ICreateContext context) {
		Object parentObject = getBusinessObjectForPictogramElement(context.getTargetContainer());
		// return context.getTargetContainer() instanceof Diagram;
		return parentObject instanceof AssuranceCase;
	}

	public Object[] create(ICreateContext context) {
		
		List<EObject> containerObjects = context.getTargetContainer().getLink().getBusinessObjects();
		
		if ( containerObjects.isEmpty() || !(containerObjects.get(0) instanceof AssuranceCase)) {
			throw new IllegalStateException("The diagram does not contain an assurance case.");
		}
		
		// create an argumentation and add it to the assurance cases's set of arguments
		Argumentation argumentation = ArgumentationFactory.eINSTANCE.createArgumentation();
		
		AssuranceCase ac = (AssuranceCase)containerObjects.get(0);
		ac.getArgument().add(argumentation);
		
		// String newName = ExampleUtil.askString("Create argumentation","Enter name");
		// if (newName==null || newName.trim().length()==0) { return EMPTY; }
		// getDiagram().eResource().getContents().add(newClass);
		// newClass.setName(newName);

		addGraphicalRepresentation(context,argumentation);
		return new Object[] { argumentation };
	}

}
