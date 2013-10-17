/*************************************************************************************
 *
 * Generated on Wed Oct 16 21:36:06 CDT 2013 by Spray LayoutFromDslFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package net.certware.sacm.diagram.features;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipselabs.spray.runtime.graphiti.features.AbstractLayoutFeature;
import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;
import net.certware.sacm.diagram.shapes.ClaimShapeShape;

public abstract class MydiagramLayoutClaimFeatureBase extends AbstractLayoutFeature {

    SprayLayoutManager layoutManager;

    public MydiagramLayoutClaimFeatureBase(final IFeatureProvider fp) {
        super(fp);
        layoutManager = new ClaimShapeShape(fp).getShapeLayout();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canLayout(final ILayoutContext context) {
        final PictogramElement pe = context.getPictogramElement();
        if (!(pe instanceof ContainerShape)) {
            return false;
        }
        final EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
        return (businessObjects.size() == 1) && (businessObjects.get(0) instanceof net.certware.sacm.SACM.Argumentation.Claim);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean layout(final ILayoutContext context) {
        return layoutManager.layout(context);
    }
}
