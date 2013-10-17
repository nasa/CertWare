/**
 * This is a generated Shape for Spray
 */
package net.certware.sacm.diagram.shapes;

import java.util.List;
import java.util.ArrayList;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.*;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

import org.eclipse.graphiti.mm.pictograms.*;
import org.eclipse.graphiti.mm.algorithms.*;
import org.eclipse.graphiti.mm.algorithms.styles.*;

import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayAbstractLayoutManager;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutType;

import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayShape;
import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;

@SuppressWarnings("all")
public class ClaimShapeShapeBase extends DefaultSprayShape {

    public static enum TextIds {
        claimClassText,
        assumedText,
        toBeSupportedText
    }

    public ClaimShapeShapeBase(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle) {
        // Create a ContainerShape for this Shape
        Diagram diagram = peService.getDiagramForShape(targetContainer);
        ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);
        SprayLayoutService.setId(containerShape, "ClaimShape.containerShape");

        // define general layout for ContainerShape
        sprayStyle.getStyle(diagram).setProportional(false);
        sprayStyle.getStyle(diagram).setStretchH(false);
        sprayStyle.getStyle(diagram).setStretchV(false);

        // layout data
        SprayLayoutType containerLayout = SprayLayoutType.FIT;
        SprayLayoutService.setLayoutManager(containerShape, containerLayout, 0, 0, true);
        SprayLayoutService.getLayoutData(containerShape).setVisible(true);

        // creates the cascaded elements (figures)
        IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
        directEditingInfo.setMainPictogramElement(containerShape);
        directEditingInfo.setPictogramElement(containerShape);

        GraphicsAlgorithm element_0 = gaService.createInvisibleRectangle(containerShape);
        element_0.setStyle(sprayStyle.getStyle(diagram));
        SprayLayoutService.setShapeFromDsl(containerShape, true);
        gaService.setLocationAndSize(element_0, 0, 0, 100, 85);

        ContainerShape shape_1 = peCreateService.createContainerShape(containerShape, false);
        SprayLayoutService.setId(shape_1, "ClaimShape.shape_1");
        SprayLayoutService.setCompartment(shape_1, false);

        Ellipse element_1 = gaService.createPlainEllipse(shape_1);
        ISprayStyle style_1 = sprayStyle;
        element_1.setStyle(style_1.getStyle(diagram));
        gaService.setLocationAndSize(element_1, 0, 0, 100, 85);
        SprayLayoutService.setLayoutData(shape_1, 100, 85, true);
        element_1.setBackground(gaService.manageColor(diagram, IColorConstant.CYAN));
        // start RECURSIVEcREATION shape_1

        Shape shape_2 = peCreateService.createShape(shape_1, false);
        SprayLayoutService.setId(shape_2, "ClaimShape.shape_2");
        MultiText element_2 = gaService.createPlainMultiText(shape_2);
        ISprayStyle style_2 = style_1;
        element_2.setStyle(style_2.getStyle(diagram));
        gaService.setLocationAndSize(element_2, 5, 5, 90, 50);
        SprayLayoutService.setLayoutData(shape_2, 90, 50, true);
        element_2.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
        element_2.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
        peService.setPropertyValue(element_2, ISprayConstants.TEXT_ID, TextIds.claimClassText.name());
        peService.setPropertyValue(shape_2, ISprayConstants.TEXT_ID, TextIds.claimClassText.name());
        element_2.setValue("");
        getFeatureProvider().getDirectEditingInfo().setGraphicsAlgorithm(element_2);
        // END createElement Text parent shape_1
        Shape shape_3 = peCreateService.createShape(shape_1, false);
        SprayLayoutService.setId(shape_3, "ClaimShape.shape_3");
        Text element_3 = gaService.createPlainText(shape_3);
        ISprayStyle style_3 = style_1;
        element_3.setStyle(style_3.getStyle(diagram));
        gaService.setLocationAndSize(element_3, 5, 55, 90, 15);
        SprayLayoutService.setLayoutData(shape_3, 90, 15, true);
        element_3.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
        element_3.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
        peService.setPropertyValue(element_3, ISprayConstants.TEXT_ID, TextIds.assumedText.name());
        peService.setPropertyValue(shape_3, ISprayConstants.TEXT_ID, TextIds.assumedText.name());
        element_3.setValue("");
        getFeatureProvider().getDirectEditingInfo().setGraphicsAlgorithm(element_3);
        // END createElement Text parent shape_1
        Shape shape_4 = peCreateService.createShape(shape_1, false);
        SprayLayoutService.setId(shape_4, "ClaimShape.shape_4");
        Text element_4 = gaService.createPlainText(shape_4);
        ISprayStyle style_4 = style_1;
        element_4.setStyle(style_4.getStyle(diagram));
        gaService.setLocationAndSize(element_4, 5, 70, 90, 15);
        SprayLayoutService.setLayoutData(shape_4, 90, 15, true);
        element_4.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
        element_4.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
        peService.setPropertyValue(element_4, ISprayConstants.TEXT_ID, TextIds.toBeSupportedText.name());
        peService.setPropertyValue(shape_4, ISprayConstants.TEXT_ID, TextIds.toBeSupportedText.name());
        element_4.setValue("");
        getFeatureProvider().getDirectEditingInfo().setGraphicsAlgorithm(element_4);
        // END createElement Text parent shape_1
        // end RECURSIVEcREATION shape_1

        // Set start values for height and width as properties on the element for Layout Feature
        SprayLayoutManager.setSizePictogramProperties(containerShape);

        // creates the anchors
        for (double aWidth = 0.0; aWidth <= 1.0; aWidth += 0.5) {
            for (double aHeigth = 0.0; aHeigth <= 1.0; aHeigth += 0.5) {
                //No anchor in center
                if (!(aWidth == 0.5 & aHeigth == 0.5)) {
                    int sizeAnchor = 6;
                    BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
                    boxAnchor.setRelativeWidth(aWidth);
                    boxAnchor.setRelativeHeight(aHeigth);
                    Ellipse ellipse = gaService.createEllipse(boxAnchor);
                    ellipse.setFilled(true);
                    ellipse.setLineVisible(false);
                    ellipse.setBackground(gaService.manageColor(diagram, IColorConstant.GRAY));
                    ellipse.setWidth(sizeAnchor);
                    ellipse.setHeight(sizeAnchor);
                    if (aWidth == 0.0 && aHeigth == 0.0) {
                        ellipse.setX(0);
                        ellipse.setY(0);
                    } else if (aWidth == 0.0 && aHeigth == 0.5) {
                        ellipse.setX(0);
                        ellipse.setY(-(sizeAnchor / 2));
                    } else if (aWidth == 0.0 && aHeigth == 1.0) {
                        ellipse.setX(0);
                        ellipse.setY(-sizeAnchor);
                    } else if (aWidth == 0.5 && aHeigth == 0.0) {
                        ellipse.setX(-(sizeAnchor / 2));
                        ellipse.setY(0);
                    } else if (aWidth == 0.5 && aHeigth == 1.0) {
                        ellipse.setX(-(sizeAnchor / 2));
                        ellipse.setY(-sizeAnchor);
                    } else if (aWidth == 1.0 && aHeigth == 0.0) {
                        ellipse.setX(-sizeAnchor);
                        ellipse.setY(0);
                    } else if (aWidth == 1.0 && aHeigth == 0.5) {
                        ellipse.setX(-sizeAnchor);
                        ellipse.setY(-(sizeAnchor / 2));
                    } else if (aWidth == 1.0 && aHeigth == 1.0) {
                        ellipse.setX(-sizeAnchor);
                        ellipse.setY(-sizeAnchor);
                    }
                }
            }
        }

        // Fix the broken coordinate syaten for not active container shapes
        SprayAbstractLayoutManager.fixOffset(containerShape);
        return containerShape;
    }

    public SprayLayoutManager getShapeLayout() {
        SprayLayoutManager layoutManager = new SprayLayoutManager();
        layoutManager.setMinSizeWidth(-1);
        layoutManager.setMaxSizeWidth(-1);
        layoutManager.setMinSizeHeight(-1);
        layoutManager.setMaxSizeHeight(-1);
        layoutManager.setStretchHorizontal(true);
        layoutManager.setStretchVertical(true);
        return layoutManager;
    }

}
