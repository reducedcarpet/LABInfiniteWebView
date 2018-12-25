package net.firestaff.mcp.baselab.shapes.secondorder;

import net.firestaff.mcp.baselab.shapes.AbstractShape;
import net.firestaff.mcp.baselab.shapes.util.Shape;
import net.firestaff.mcp.baselab.util.Point;

public class HypocycloidTriangle  extends AbstractShape implements Shape {

    public HypocycloidTriangle() {
        name = "HypocycloidThree";
        period = Math.PI * 2;
    }

    public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {
        double a = ((length/2)) * circleModifier; // -30
        double b = a / 3; // number of points. 4 points
        double theta = circleAngle; // where we are around the circle.
        double alpha = ((a - b) / b) * theta;

        x = ((a - b) * Math.cos(theta)) - (b * Math.cos(alpha));
        y = ((a - b) * Math.sin(theta)) + (b * Math.sin(alpha));

        // swapping initial sin and cos around makes an epicycloid.
        // swapping both makes for turned hypocycloid.

        p.y = y;
        p.x = x;

        return p;
    }
}