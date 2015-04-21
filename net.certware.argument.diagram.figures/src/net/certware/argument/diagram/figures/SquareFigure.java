package net.certware.argument.diagram.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Creates a square figure with expanded region text body.
 * @author mrb
 */
public class SquareFigure extends ExpandedBodyRectangleFigure {

	/** default margin width in pixels */
	static final int DEFAULT_MARGIN = 5;

	@Override
	public void paint(Graphics graphics) {

		Rectangle r = getBounds();
		if ( r.width > r.height ) 
			r.height = r.width;
		else
			r.width = r.height;

		setBounds(r);

		// setTextPositions(graphics,DEFAULT_MARGIN);

		super.paint(graphics);
	}	
}
