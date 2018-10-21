package net.firestaff.mcp.baselab.shapes.secondorder;

import net.firestaff.mcp.baselab.util.Point;
import net.firestaff.mcp.baselab.util.Rotate;

public class EpicycloidThree extends Epicycloid {

    public EpicycloidThree() {
        name = "EpicycloidThree";
        period = Math.PI * 2;
    }

    public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {
        Point p = drawPetals(length,  circleModifier,  circleAngle + Math.PI,  circleTurnModifier,  3);
        return Rotate.rotate(new Point((int)p.x,(int)p.y), Math.PI);
    }
}
