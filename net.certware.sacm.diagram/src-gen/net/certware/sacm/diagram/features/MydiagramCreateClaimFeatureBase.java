/*************************************************************************************
 *
 * Generated on Wed Oct 16 21:36:06 CDT 2013 by Spray CreateShapeFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package net.certware.sacm.diagram.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.spray.runtime.graphiti.containers.SampleUtil;
import org.eclipselabs.spray.runtime.graphiti.features.AbstractCreateFeature;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
import org.eclipse.graphiti.features.context.IAreaContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import net.certware.sacm.diagram.diagram.MydiagramModelService;

public abstract class MydiagramCreateClaimFeatureBase extends AbstractCreateFeature {
    protected static String                              TITLE         = "Create Claim";
    protected static String                              USER_QUESTION = "Enter new Claim name";
    protected MydiagramModelService                      modelService;
    protected net.certware.sacm.SACM.Argumentation.Claim newClass      = null;

    public MydiagramCreateClaimFeatureBase(final IFeatureProvider fp) {
        // set name and description of the creation feature
        super(fp, "Claim", "Create new Claim");
        modelService = MydiagramModelService.getModelService(fp.getDiagramTypeProvider());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canCreate(final ICreateContext context) {
        final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
        // And now the new stuff
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object[] create(final ICreateContext context) {
        newClass = createClaim(context);

        if (newClass == null) {
            return EMPTY;
        }

        // do the add
        addGraphicalRepresentation(context, newClass);

        // activate direct editing after object creation
        getFeatureProvider().getDirectEditingInfo().setActive(true);

        // return newly created business object(s)
        return new Object[]{newClass};
    }

    //      

    /**
     * Creates a new {@link net.certware.sacm.SACM.Argumentation.Claim} instance and adds it to the containing type.
     */
    protected net.certware.sacm.SACM.Argumentation.Claim createClaim(final ICreateContext context) {
        ContainerShape targetContainer = context.getTargetContainer();
        boolean isContainment = false;
        final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
        //              And now the NEW stuff
        setDoneChanges(true);
        return newClass;
    }
}
