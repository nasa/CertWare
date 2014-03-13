package net.certware.sacm.graphiti.fp;

import net.certware.sacm.graphiti.feature.ArgumentationAddFeature;
import net.certware.sacm.graphiti.feature.ArgumentationCreateFeature;
import net.certware.sacm.graphiti.feature.EvidenceContainerAddFeature;
import net.certware.sacm.graphiti.feature.EvidenceContainerCreateFeature;
import net.certware.sacm.graphiti.feature.GenericCopyFeature;
import net.certware.sacm.graphiti.feature.GenericPasteFeature;
import net.certware.sacm.graphiti.feature.ObjectAddFeature;
import net.certware.sacm.graphiti.feature.ObjectCreateFeature;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICopyFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IPasteFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICopyContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IPasteContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

public class SacmFeatureProvider extends DefaultFeatureProvider {
	
	private IAddFeature argumentationAddFeature = new ArgumentationAddFeature(this);
	private IAddFeature evidenceContainerAddFeature = new EvidenceContainerAddFeature(this);
	private IAddFeature objectAddFeature = new ObjectAddFeature(this);

	public SacmFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] { 
				new ArgumentationCreateFeature(this),
				new EvidenceContainerCreateFeature(this),
				new ObjectCreateFeature(this)
				} ;
	}
	
	@Override
	public IAddFeature getAddFeature(IAddContext context) {

		if (argumentationAddFeature.canAdd(context)) {
			return argumentationAddFeature;
		}
		if (evidenceContainerAddFeature.canAdd(context)) {
			return evidenceContainerAddFeature;
		}
		if (objectAddFeature.canAdd(context)) {
			return objectAddFeature;
		}
		return super.getAddFeature(context);
	}
	
	@SuppressWarnings("unused")
	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		Shape shape = context.getShape();
		Object bo = getBusinessObjectForPictogramElement(shape);
//		if ( bo instanceof Object) {
//			return new ObjectMoveFeature(this);
//		}
		return super.getMoveShapeFeature(context);
	}
	
	@SuppressWarnings("unused")
	@Override
	public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
		Shape shape = context.getShape();
		Object bo = getBusinessObjectForPictogramElement(shape);
		return super.getResizeShapeFeature(context);

	}
	
	@SuppressWarnings("unused")
	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		return super.getLayoutFeature(context);
	}
	
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
//		return new ICustomFeature[] { new MyCustomFeature(this) } ;
		return new ICustomFeature[] {};
	}
	
	@Override
	public ICopyFeature getCopyFeature(ICopyContext context) {
		return new GenericCopyFeature(this);
	}
	
	@Override
	public IPasteFeature getPasteFeature(IPasteContext context) {
		return new GenericPasteFeature(this);
	}

}
