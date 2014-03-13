package net.certware.sacm.graphiti.feature;

import net.certware.sacm.SACM.AssuranceCase;
import net.certware.sacm.SACM.Argumentation.Argumentation;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

public class ArgumentationAddFeature extends AbstractAddShapeFeature {

	public ArgumentationAddFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public boolean canAdd(IAddContext context) {
		if ( context.getNewObject() instanceof Argumentation ) {
			Object parentObject = getBusinessObjectForPictogramElement(context.getTargetContainer());
			if ( parentObject instanceof AssuranceCase ) {
				return true;
			}
		}
		return false;
	}

	public PictogramElement add(IAddContext context) {
		final Argumentation addedArgumentation = (Argumentation)context.getNewObject();
		final ContainerShape parent = context.getTargetContainer();
		
		// container shape with circle
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
		final ContainerShape containerShape = peCreateService.createContainerShape(parent,true);

		// use existing size or default
		final int width = context.getWidth() <= 35 ? 35 : context.getWidth();
		final int height = context.getHeight() <= 50 ? 50 : context.getHeight();
		
		final IGaService gaService = Graphiti.getGaService();
		
		@SuppressWarnings("unused")
		RoundedRectangle rect;
		{
			final RoundedRectangle rr = gaService.createPlainRoundedRectangle(containerShape,width,height);
			rr.setCornerWidth(2);
			rr.setCornerHeight(2);
			gaService.setLocationAndSize(rr, context.getX(), context.getY(), width, height);
			rr.setLineWidth(1);
			rr.setLineVisible(true);
			rr.setFilled(false);
			rr.setLineStyle(LineStyle.DOT);
			rr.setForeground(manageColor(IColorConstant.BLACK));
			// rr.setBackground(manageColor(IColorConstant.DARK_ORANGE));
			link(containerShape, addedArgumentation);
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
