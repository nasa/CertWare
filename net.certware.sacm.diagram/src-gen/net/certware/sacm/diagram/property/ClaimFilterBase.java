/*************************************************************************************
 *
 * Generated on Wed Oct 16 21:36:06 CDT 2013 by Spray Filter.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package net.certware.sacm.diagram.property;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;

import net.certware.sacm.SACM.Argumentation.Claim;

public class ClaimFilterBase extends AbstractPropertySectionFilter {

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean accept(final PictogramElement pe) {
        final EObject eObject = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
        if (eObject instanceof net.certware.sacm.SACM.Argumentation.Claim) {
            return true;
        }
        return false;
    }
}
