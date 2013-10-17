/*************************************************************************************
 *
 * Generated on Wed Oct 16 21:36:07 CDT 2013 by Spray ResizeFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package net.certware.sacm.diagram.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IResizeConfiguration;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.DefaultResizeConfiguration;
import org.eclipselabs.spray.runtime.graphiti.features.DefaultResizeShapeFeature;
import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;
import net.certware.sacm.diagram.shapes.ClaimShapeShape;

public abstract class MydiagramResizeClaimFeatureBase extends DefaultResizeShapeFeature {

    SprayLayoutManager layoutManager;

    public MydiagramResizeClaimFeatureBase(final IFeatureProvider fp) {
        super(fp);
        layoutManager = new ClaimShapeShape(fp).getShapeLayout();
    }

    public class ResizeConfiguration_ClaimShape extends DefaultResizeConfiguration {

        public boolean isHorizontalResizeAllowed() {
            return layoutManager.isStretchHorizontal();
        }

        public boolean isVerticalResizeAllowed() {
            return layoutManager.isStretchVertical();
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IResizeConfiguration getResizeConfiguration(IResizeShapeContext context) {
        return new ResizeConfiguration_ClaimShape();
    }
}
