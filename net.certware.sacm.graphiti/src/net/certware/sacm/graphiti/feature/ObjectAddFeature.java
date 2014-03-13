package net.certware.sacm.graphiti.feature;

import net.certware.sacm.SACM.Evidence.EvidenceContainer;
import net.certware.sacm.SACM.Evidence.Object;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

public class ObjectAddFeature extends AbstractAddShapeFeature {

	public ObjectAddFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	public boolean canAdd(IAddContext context) {
		if ( context.getNewObject() instanceof Object ) {
			java.lang.Object parentObject = getBusinessObjectForPictogramElement(context.getTargetContainer());
			if ( parentObject instanceof EvidenceContainer ) {
				return true;
			}
		}
		return false;
	}

	public PictogramElement add(IAddContext context) {

		final net.certware.sacm.SACM.Evidence.Object addedObject = (Object)context.getNewObject();
		final ContainerShape parent = context.getTargetContainer();

		// container shape with circle
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
		final ContainerShape containerShape = peCreateService.createContainerShape(parent,true);

		// use existing size or default
		final int width = context.getWidth() <= 35 ? 35 : context.getWidth();
		final int height = context.getHeight() <= 50 ? 50 : context.getHeight();

		final IGaService gaService = Graphiti.getGaService();
		
		@SuppressWarnings("unused")
		Ellipse circle;
		{
			final Ellipse objectCircle = gaService.createEllipse(containerShape);
			
			//invisibleCircle.setFilled(false);
			//invisibleCircle.setLineVisible(false);
			
			gaService.setLocationAndSize(objectCircle, context.getX(), context.getY(), width, height);
			objectCircle.setLineWidth(2);
			objectCircle.setLineVisible(true);
			objectCircle.setFilled(true);
			objectCircle.setLineStyle(LineStyle.DASHDOT);
			objectCircle.setForeground(manageColor(IColorConstant.BLACK));
			objectCircle.setBackground(manageColor(IColorConstant.DARK_ORANGE));
			
			// create and set visible circle inside invisible circle
			//circle = gaService.createEllipse(objectCircle);
			//circle.setParentGraphicsAlgorithm(objectCircle);
			// TODO circle.setStyle(StyleUtil.getStyleForEvent(getDiagram()));
			//if (addedArgumentation instanceof EndEvent == true) {
			//  circle.setLineWidth(3);
			//}
			//gaService.setLocationAndSize(circle, 0, 0, width, height);
			//gaService.setLocationAndSize(circle, 0, 0, width, height);
			link(containerShape, addedObject);
		}


		peCreateService.createChopboxAnchor(containerShape);
		/*
		if ( !(addedArgumentation instanceof EndEvent)) {
		      // create an additional box relative anchor at middle-right
		      final BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
		      boxAnchor.setRelativeWidth(1.0);
		      boxAnchor.setRelativeHeight(0.51);
		      boxAnchor.setReferencedGraphicsAlgorithm(circle);
		      final Ellipse ellipse = ActivitiUiUtil.createInvisibleEllipse(boxAnchor, gaService);
		      gaService.setLocationAndSize(ellipse, 0, 0, 0, 0);
		}
		 */

		/*
    if (addedEvent instanceof StartEvent && ((StartEvent) addedEvent).getEventDefinitions().size() > 0) {

      StartEvent startEvent = (StartEvent) addedEvent;
      final Shape shape = peCreateService.createShape(containerShape, false);
      Image image = null;
      if (startEvent.getEventDefinitions().get(0) instanceof TimerEventDefinition) {
        image = gaService.createImage(shape, PluginImage.IMG_BOUNDARY_TIMER.getImageKey());
      } else if (startEvent.getEventDefinitions().get(0) instanceof MessageEventDefinition){
        image = gaService.createImage(shape, PluginImage.IMG_STARTEVENT_MESSAGE.getImageKey());
      } else
        image = gaService.createImage(shape, PluginImage.IMG_BOUNDARY_ERROR.getImageKey());

      image.setWidth(IMAGE_SIZE);
      image.setHeight(IMAGE_SIZE);

      gaService.setLocationAndSize(image, (width - IMAGE_SIZE) / 2, (height - IMAGE_SIZE) / 2, IMAGE_SIZE, IMAGE_SIZE);
    }
		 */

		layoutPictogramElement(containerShape);
		return containerShape;
	}

}
