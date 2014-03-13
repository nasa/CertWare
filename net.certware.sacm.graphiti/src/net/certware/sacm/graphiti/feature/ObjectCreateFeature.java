package net.certware.sacm.graphiti.feature;

import java.util.List;

import net.certware.sacm.SACM.Evidence.EvidenceContainer;
import net.certware.sacm.SACM.Evidence.EvidenceFactory;
import net.certware.sacm.SACM.Evidence.Object;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;

public class ObjectCreateFeature extends AbstractCreateFeature {

	/**
	 * SACM Object create feature constructor.
	 * @param fp feature provider
	 */
	public ObjectCreateFeature(IFeatureProvider fp) {
		super(fp, "Object", "Create an object evidence item");
	}

	public boolean canCreate(ICreateContext context) {
		if ( context.getTargetContainer() instanceof ContainerShape ) {
			java.lang.Object parent = getBusinessObjectForPictogramElement(context.getTargetContainer());
			if ( parent instanceof EvidenceContainer ) {
				return true;
			}
		}
		return false;
	}

	public Object[] create(ICreateContext context) {
		List<EObject> containerObjects = context.getTargetContainer().getLink().getBusinessObjects();
		
		if ( containerObjects.isEmpty() || !(containerObjects.get(0) instanceof EvidenceContainer)) {
			throw new IllegalStateException("The context does not contain an evidence container.");
		}

		// create a formal object and add it to the evidence container's items
		EvidenceContainer ec = (EvidenceContainer)containerObjects.get(0);
		net.certware.sacm.SACM.Evidence.Object object = EvidenceFactory.eINSTANCE.createObject();
		ec.getItem().add(object);
		addGraphicalRepresentation(context,object);
		return new Object[] { object };
	}

}
