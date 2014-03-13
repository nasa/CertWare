package net.certware.sacm.graphiti.feature;

import java.util.List;

import net.certware.sacm.SACM.AssuranceCase;
import net.certware.sacm.SACM.Evidence.EvidenceContainer;
import net.certware.sacm.SACM.Evidence.EvidenceFactory;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

public class EvidenceContainerCreateFeature extends AbstractCreateFeature {

	/**
	 * Evidence container create feature constructor.
	 * @param fp feature provider
	 */
	public EvidenceContainerCreateFeature(IFeatureProvider fp) {
		super(fp, "Evidence Container", "Create an evidence container");
	}

	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
		// TODO return context.getTargetContainer() instanceof AssuranceCase;
	}

	public Object[] create(ICreateContext context) {
		List<EObject> containerObjects = context.getTargetContainer().getLink().getBusinessObjects();
		
		if ( containerObjects.isEmpty() || !(containerObjects.get(0) instanceof AssuranceCase)) {
			throw new IllegalStateException("The diagram does not contain an assurance case.");
		}

		// create an evidence container and add it to the assurance cases's set of arguments
		AssuranceCase ac = (AssuranceCase)containerObjects.get(0);
		EvidenceContainer evidenceContainer = EvidenceFactory.eINSTANCE.createEvidenceContainer();
		ac.getEvidence().add(evidenceContainer);
		addGraphicalRepresentation(context,evidenceContainer);
		return new Object[] { evidenceContainer };
	}

}
