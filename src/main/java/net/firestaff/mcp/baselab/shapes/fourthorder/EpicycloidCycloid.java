package net.firestaff.mcp.baselab.shapes.fourthorder;

import net.firestaff.mcp.baselab.shapes.AbstractShape;
import net.firestaff.mcp.baselab.shapes.util.Shape;
import net.firestaff.mcp.baselab.util.Point;
import net.firestaff.mcp.baselab.util.Rotate;

public class EpicycloidCycloid extends AbstractShape implements Shape {

    int petal = 4;

    public EpicycloidCycloid() {
        name = "EpicycloidCycloid";
        EpicycloidCycloid.shapeName = name;
        period = Math.PI * 2;
    }

    public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {

        return drawPetals(length,  circleModifier,  circleAngle,  circleTurnModifier,  petal);
    }

    public Point drawPetals(double length, double circleModifier, double circleAngle, double circleTurnModifier, int petals) {
        double a = ((length/2)) * circleModifier; // -30
        double b = a / petals; // number of points. 4 points
        double theta = circleAngle ; // where we are around the circle.
        double alpha = ((a + b) / b) * theta;

        x = ((a + b) * Math.cos(theta)) - (b * Math.cos(alpha));
        y = ((a + b) * Math.sin(theta)) - (b * Math.sin(alpha));

        // swapping initial sin and cos around makes an epicycloid.
        // swapping both makes for turned hypocycloid.
        p = Rotate.rotate(p, Math.PI / 2);

        p.y = (int)y;
        p.x = (int)x;

        return p;
    }
}
