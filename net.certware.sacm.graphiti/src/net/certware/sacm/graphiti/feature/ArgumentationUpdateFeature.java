package net.certware.sacm.graphiti.feature;

import net.certware.sacm.SACM.Argumentation.Argumentation;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;

public class ArgumentationUpdateFeature extends AbstractUpdateFeature {

	public ArgumentationUpdateFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	public boolean canUpdate(IUpdateContext context) {
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		return (bo instanceof Argumentation);
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
		// TODO should update on change in size of argumentation list
/*
		// retrieve name from pictogram model
        String pictogramName = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape cs = (ContainerShape) pictogramElement;
            for (Shape shape : cs.getChildren()) {
                if (shape.getGraphicsAlgorithm() instanceof Text) {
                    Text text = (Text) shape.getGraphicsAlgorithm();
                    pictogramName = text.getValue();
                }
            }
        }
        
        // retrieve name from business model
        int argumentationSize = 0;
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof Argumentation) {
            Argumentation argumentation = (Argumentation) bo;
            EList<Argumentation> items = argumentation.getArgumentation();
            argumentationSize = items.size();
        }
*/ 
        // update needed, if names are different
//        boolean updateNameNeeded =
//            ((pictogramName == null && businessName != null) ||
//                (pictogramName != null && !pictogramName.equals(businessName)));
        //if (updateNameNeeded) {
//            return Reason.createTrueReason("Name is out of date");
//        } else {
            return Reason.createFalseReason();
//        }        
	}

	@Override
	public boolean update(IUpdateContext context) {
/*		
        // retrieve name from business model
        String businessName = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof EClass) {
            EClass eClass = (EClass) bo;
            businessName = eClass.getName();
        }
 
        // Set name in pictogram model
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape cs = (ContainerShape) pictogramElement;
            for (Shape shape : cs.getChildren()) {
                if (shape.getGraphicsAlgorithm() instanceof Text) {
                    Text text = (Text) shape.getGraphicsAlgorithm();
                    text.setValue(businessName);
                    return true;
                }
            }
        }
*/
 
        return false;
	}

}
