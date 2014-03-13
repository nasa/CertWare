package net.certware.sacm.graphiti.tools;

import java.util.ArrayList;
import java.util.List;

import net.certware.sacm.SACM.Argumentation.Argumentation;
import net.certware.sacm.SACM.Evidence.EvidenceContainer;
import net.certware.sacm.grapiti.ip.SacmDiagramImageProvider;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDoubleClickContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;
import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;
import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.StackEntry;
import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;

public class ArgumentationToolBehaviorProvider extends DefaultToolBehaviorProvider {

	public ArgumentationToolBehaviorProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}

	@Override
	public IPaletteCompartmentEntry[] getPalette() {
	    List<IPaletteCompartmentEntry> ret =
	        new ArrayList<IPaletteCompartmentEntry>();
	 
	    // add compartments from super class
	    IPaletteCompartmentEntry[] superCompartments =
	        super.getPalette();
	    for (int i = 0; i < superCompartments.length; i++)
	        ret.add(superCompartments[i]);
	 
	    // add new compartments at the end of the existing compartments
	    // argumentation compartment
	    // TODO trim to contain only relevant items
	    PaletteCompartmentEntry compartmentEntry =
	        new PaletteCompartmentEntry("Argumentation", 
	        		SacmDiagramImageProvider.IMG_ARGUMENTATION);

	    ret.add(compartmentEntry);
	    
	    // add new stack entry to new compartment
	    StackEntry stackEntry = new StackEntry("Argumentation", "Argumentation tools", null);
	    compartmentEntry.addToolEntry(stackEntry);
	 
	    // add all create-features to the new stack-entry
	    IFeatureProvider featureProvider = getFeatureProvider();
	    ICreateFeature[] createFeatures = featureProvider.getCreateFeatures();
	    for (ICreateFeature cf : createFeatures) {
	        ObjectCreationToolEntry objectCreationToolEntry = 
	               new ObjectCreationToolEntry(cf.getCreateName(),
	                 cf.getCreateDescription(), cf.getCreateImageId(),
	                    cf.getCreateLargeImageId(), cf);
	        stackEntry.addCreationToolEntry(objectCreationToolEntry);
	    }
	        
	    // add all create-connection-features to the new stack-entry
	    ICreateConnectionFeature[] createConnectionFeatures =
	         featureProvider.getCreateConnectionFeatures();
	    for (ICreateConnectionFeature cf : createConnectionFeatures) {
	        ConnectionCreationToolEntry connectionCreationToolEntry = 
	            new ConnectionCreationToolEntry(cf.getCreateName(), cf
	              .getCreateDescription(), cf.getCreateImageId(),
	                cf.getCreateLargeImageId());
	                    connectionCreationToolEntry.addCreateConnectionFeature(cf);
	        stackEntry.addCreationToolEntry(connectionCreationToolEntry);
	    }

	    // evidence compartment
	    // TODO trim to contain only relevant items
	    compartmentEntry = new PaletteCompartmentEntry("Evidence",
	    		SacmDiagramImageProvider.IMG_EVIDENCE_CONTAINER);
	    ret.add(compartmentEntry);
	 
	    // add new stack entry to new compartment
	    stackEntry = new StackEntry("Evidence", "Evidence tools", null);
	    compartmentEntry.addToolEntry(stackEntry);

	    for (ICreateFeature cf : createFeatures) {
	        ObjectCreationToolEntry objectCreationToolEntry = 
	               new ObjectCreationToolEntry(cf.getCreateName(),
	                 cf.getCreateDescription(), cf.getCreateImageId(),
	                    cf.getCreateLargeImageId(), cf);
	        stackEntry.addCreationToolEntry(objectCreationToolEntry);
	    }
	        
	    // add all create-connection-features to the new stack-entry
	    createConnectionFeatures =
	         featureProvider.getCreateConnectionFeatures();
	    for (ICreateConnectionFeature cf : createConnectionFeatures) {
	        ConnectionCreationToolEntry connectionCreationToolEntry = 
	            new ConnectionCreationToolEntry(cf.getCreateName(), cf
	              .getCreateDescription(), cf.getCreateImageId(),
	                cf.getCreateLargeImageId());
	                    connectionCreationToolEntry.addCreateConnectionFeature(cf);
	        stackEntry.addCreationToolEntry(connectionCreationToolEntry);
	    }

	    return ret.toArray(new IPaletteCompartmentEntry[ret.size()]);
	}
	
	
	@Override
	public ICustomFeature getDoubleClickFeature(IDoubleClickContext context) {
		// ICustomFeature customFeature = new MyCustomFeature(getFeatureProvider());
		//if (customFeature.canExecute(context)) {
		//	return customFeature;
		//}
		return super.getDoubleClickFeature(context);
	}
	
	@Override
	public IDecorator[] getDecorators(PictogramElement pe) {
	    IFeatureProvider featureProvider = getFeatureProvider();
	    Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
	    
	    // TODO move each class's decorators out to specialized tool providers
	    if (bo instanceof EClass) {
	        EClass eClass = (EClass) bo;
	        String name = eClass.getName();
	        if (name != null && name.length() > 0
	            && !(name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')) {
	            IDecorator imageRenderingDecorator =
	                new ImageDecorator(IPlatformImageConstants.IMG_ECLIPSE_WARNING_TSK);
	            imageRenderingDecorator.setMessage("Name should start with upper case letter");
	            return new IDecorator[] { imageRenderingDecorator };
	        }
	    }
	    
	    // TODO see also ColorDecorators for foreground/background decorations
	    // TODO see also BorderDecorators for additional surrounding border with color, width, style
	 
	    return super.getDecorators(pe);
	}
	
	@Override
	public String getToolTip(GraphicsAlgorithm ga) {
	    PictogramElement pe = ga.getPictogramElement();
	    Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(pe);
	    if ( bo instanceof Argumentation) {
	    	return "Argumentation container";
	    }
	    if ( bo instanceof EvidenceContainer) {
	    	return "Evidence container" + ' ' + ((EvidenceContainer)bo).getName();
	    }
	    if ( bo instanceof net.certware.sacm.SACM.Evidence.Object) {
	    	String concept = ((net.certware.sacm.SACM.Evidence.Object)bo).getConcept();
	    	return "Evidence object" + ' ' + concept;
	    }
	    return (String) super.getToolTip(ga);
	}

}
