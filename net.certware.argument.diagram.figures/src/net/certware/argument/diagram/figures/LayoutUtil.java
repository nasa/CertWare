package net.certware.argument.diagram.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * Layout utility for diagram figures.
 * @author epsilon
 */
public class LayoutUtil {
	
	/**
	 * Moves the label to the center of the figure.
	 * @param label label
	 * @param parent parent figure for dimensions
	 * @param graphics graphics for font metrics
	 */
	public static void moveToCenter(WrappingLabel label, Figure parent, Graphics graphics) {
		Rectangle r = parent.getBounds();
		Rectangle newLabelBounds = new Rectangle();
		Point middle = new Point(r.x + r.width/2, r.y + r.height/2); 
		
		int textWidth = (label.getText().length() + 2) * graphics.getFontMetrics().getAverageCharWidth();
		int textHeight = graphics.getFontMetrics().getHeight();
		
		newLabelBounds.x = middle.x - textWidth/2;
		newLabelBounds.y = middle.y - textHeight/2;
		newLabelBounds.width = textWidth;
		newLabelBounds.height = textHeight;
		
		label.setBounds(newLabelBounds);
	}
	
}
