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
import net.certware.sacm.SACM.SACMFactory;
import net.certware.sacm.diagram.diagram.MydiagramImageProvider;
import net.certware.sacm.diagram.diagram.MydiagramModelService;

public abstract class MydiagramCreateAnnotationFeatureBase extends AbstractCreateFeature {
    protected static String                     TITLE         = "Create ";
    protected static String                     USER_QUESTION = "Enter new  name";
    protected MydiagramModelService             modelService;
    protected net.certware.sacm.SACM.Annotation newClass      = null;

    public MydiagramCreateAnnotationFeatureBase(final IFeatureProvider fp) {
        // set name and description of the creation feature
        super(fp, "Annotation", "Create new Annotation");
        modelService = MydiagramModelService.getModelService(fp.getDiagramTypeProvider());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canCreate(final ICreateContext context) {
        final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
        // TODO: Respect the cardinality of the containment reference
        if (context.getTargetContainer() instanceof Diagram) {
            return true;
        } else if (context.getTargetContainer() instanceof ContainerShape) {
        }
        // And now the new stuff
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object[] create(final ICreateContext context) {
        newClass = createAnnotation(context);

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

    //       org.eclipse.emf.ecore.impl.EReferenceImpl@24313755 (name: annotation) (ordered: false, unique: true, lowerBound: 0, upperBound: -1) (changeable: true, volatile: false, transient: false, defaultValueLiteral: null, unsettable: false, derived: false) (containment: true, resolveProxies: true) 

    /**
     * Creates a new {@link net.certware.sacm.SACM.Annotation} instance and adds it to the containing type.
     */
    protected net.certware.sacm.SACM.Annotation createAnnotation(final ICreateContext context) {
        // create Annotation instance
        final net.certware.sacm.SACM.Annotation newClass = SACMFactory.eINSTANCE.createAnnotation();
        ContainerShape targetContainer = context.getTargetContainer();
        boolean isContainment = false;
        final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
        //              And now the NEW stuff
        if (!isContainment) {
            // add the element to containment reference
            net.certware.sacm.SACM.AssuranceCase model = modelService.getModel();
            model.getAnnotation().add(newClass);
        }
        setDoneChanges(true);
        return newClass;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCreateImageId() {
        return MydiagramImageProvider.MYDIAGRAM__ANNOTATIONS;
    }
}
