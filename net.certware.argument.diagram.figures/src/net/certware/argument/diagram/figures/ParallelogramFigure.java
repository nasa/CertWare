package net.certware.argument.diagram.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Diamond figure for GMF editor shapes.
 * @author mrb
 */
public class ParallelogramFigure extends RectangleFigure { //ExpandedBodyRectangleFigure {
  
  @Override
  public void paint(Graphics graphics) {
    
    Rectangle r = getBounds();
    
    int offset = r.width / 10;
    Point p1 = new Point(r.x + offset, r.y); // top LHC
    Point p2 = new Point(r.x, r.y + r.height); // bottom LHC
    Point p3 = new Point(r.x + r.width - offset, r.y + r.height); // bottom RHC
    Point p4 = new Point(r.x + r.width, r.y); // top RHC
    
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
    
    // TODO client or children? 
    super.paintClientArea(graphics);
    
    // expand body
    // setTextPositions(graphics, offset);
  }
}