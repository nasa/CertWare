/*************************************************************************************
 *
 * Generated on Wed Oct 16 21:36:06 CDT 2013 by Spray AddShapeFromDslFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package net.certware.sacm.diagram.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddFeature;
import org.eclipselabs.spray.runtime.graphiti.shape.ISprayShape;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
import net.certware.sacm.diagram.shapes.ClaimShapeShape;
import net.certware.sacm.diagram.styles.DiagramDefaultStyle;
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;

@SuppressWarnings("unused")
public abstract class MydiagramAddClaimFeatureBase extends AbstractAddFeature {
    protected final static String typeOrAliasName = "Claim";
    protected Diagram             targetDiagram   = null;

    public MydiagramAddClaimFeatureBase(final IFeatureProvider fp) {
        super(fp);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canAdd(final IAddContext context) {
        final EObject newObject = (EObject) context.getNewObject();
        if (newObject instanceof net.certware.sacm.SACM.Argumentation.Claim) {
            // check if user wants to add to a diagram
            if (context.getTargetContainer() instanceof Diagram) {
                return false;
            } else if (context.getTargetContainer() instanceof ContainerShape) {
                // OLD STUFF
                final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
                // NEW stuff
            }
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PictogramElement add(final IAddContext context) {
        final net.certware.sacm.SACM.Argumentation.Claim addedModelElement = (net.certware.sacm.SACM.Argumentation.Claim) context.getNewObject();
        // NEW stuff
        Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
        final ContainerShape targetContainer = context.getTargetContainer();
        final ISprayStyle style = new DiagramDefaultStyle();
        final ISprayShape shape = new ClaimShapeShape(getFeatureProvider());
        final ContainerShape conShape = shape.getShape(targetContainer, style);
        final IGaService gaService = Graphiti.getGaService();
        gaService.setLocation(conShape.getGraphicsAlgorithm(), context.getX(), context.getY());
        link(conShape, addedModelElement);
        linkShapes(conShape, addedModelElement);

        setDoneChanges(true);
        updatePictogramElement(conShape);
        layout(conShape);

        return conShape;
    }

    protected void linkShapes(ContainerShape conShape, net.certware.sacm.SACM.Argumentation.Claim addedModelElement) {
        link(conShape, addedModelElement);
        for (Shape childShape : conShape.getChildren()) {
            if (childShape instanceof ContainerShape) {
                linkShapes((ContainerShape) childShape, addedModelElement);
            } else {
                link(childShape, addedModelElement);
            }
        }
    }
}
