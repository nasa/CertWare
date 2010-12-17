package net.certware.argument.diagram.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Diamond figure for GMF editor shapes.
 * @author mrb
 */
public class DiamondFigure extends ExpandedBodyRectangleFigure {

	/** default margin width in pixels */
	static final int DEFAULT_MARGIN = 5;

	@Override
	public void paint(Graphics graphics) {

		Rectangle r = getBounds();

		// Define the points of a diamond
		Point p1 = new Point(r.x, r.y + r.height/2);
		Point p2 = new Point(r.x + r.width/2, r.y);
		Point p3 = new Point(r.x + r.width, r.y + r.height/2);
		Point p4 = new Point(r.x + r.width/2, r.y + r.height - 1);

		PointList pointList = new PointList();
		pointList.addPoint(p1);
		pointList.addPoint(p2);
		pointList.addPoint(p3);
		pointList.addPoint(p4);

		// Fill the shape
		graphics.fillPolygon(pointList);

		// Draw the outline
		graphics.drawLine(p1, p2);
		graphics.drawLine(p2, p3);
		graphics.drawLine(p3, p4);
		graphics.drawLine(p4, p1);

		// set text regions
		setTextPositions(graphics, DEFAULT_MARGIN);

	}

}