/*************************************************************************************
 *
 * Generated on Wed Oct 16 21:36:06 CDT 2013 by Spray DirectEditFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package net.certware.sacm.diagram.features;

import com.google.common.base.Function;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IPeService;
import org.eclipselabs.spray.runtime.graphiti.features.AbstractDirectEditingFeature;

public abstract class MydiagramDirectEditClaimFeatureBase extends AbstractDirectEditingFeature {

    protected IPeService peService = Graphiti.getPeService();

    public MydiagramDirectEditClaimFeatureBase(IFeatureProvider fp) {
        super(fp);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canDirectEdit(IDirectEditingContext context) {
        PictogramElement pe = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pe);
        GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
        // support direct editing, if it is a net.certware.sacm.SACM.Argumentation.Claim, and the user clicked
        // directly on the text and not somewhere else in the rectangle
        if (bo instanceof net.certware.sacm.SACM.Argumentation.Claim && ga instanceof Text) {
            return true;
        }
        // direct editing not supported in all other cases
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getInitialValue(IDirectEditingContext context) {
        // return the initial value of the clicked text on the net.certware.sacm.SACM.Argumentation.Claim
        PictogramElement pe = context.getPictogramElement();
        net.certware.sacm.SACM.Argumentation.Claim eClass = (net.certware.sacm.SACM.Argumentation.Claim) getBusinessObjectForPictogramElement(pe);
        Text gAlg = (Text) context.getGraphicsAlgorithm();
        String id = peService.getPropertyValue(gAlg, TEXT_ID);
        return "";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getEditingType() {
        return TYPE_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setValue(final String value, final IDirectEditingContext context) {
        // set the new value on the net.certware.sacm.SACM.Argumentation.Claim
        final PictogramElement pe = context.getPictogramElement();
        net.certware.sacm.SACM.Argumentation.Claim eClass = (net.certware.sacm.SACM.Argumentation.Claim) getBusinessObjectForPictogramElement(pe);
        Text gAlg = (Text) context.getGraphicsAlgorithm();
        String id = peService.getPropertyValue(gAlg, TEXT_ID);
        updatePictogramElement(pe);
    }
}
