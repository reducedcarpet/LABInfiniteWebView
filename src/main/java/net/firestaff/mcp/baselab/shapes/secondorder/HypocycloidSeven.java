package net.firestaff.mcp.baselab.shapes.secondorder;

import net.firestaff.mcp.baselab.shapes.AbstractShape;
import net.firestaff.mcp.baselab.shapes.util.Shape;
import net.firestaff.mcp.baselab.util.Point;
import net.firestaff.mcp.baselab.util.Rotate;

public class HypocycloidSeven extends AbstractShape implements Shape {

    public HypocycloidSeven() {
        name = "HypocycloidSeven";
        period = Math.PI * 2;
    }

    public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {
        double a = ((length/2)) * circleModifier; // -30
        double b = a / 7; // number of points. 4 points
        double theta = circleAngle + (Math.PI / 2); // where we are around the circle.
        double alpha = ((a - b) / b) * theta;

        x = ((a - b) * Math.cos(theta)) - (b * Math.cos(alpha));
        y = ((a - b) * Math.sin(theta)) + (b * Math.sin(alpha));


        p = Rotate.rotate(new Point((int)x,(int)y), (Math.PI / 2));


        return p;
    }
}