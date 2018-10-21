package net.firestaff.mcp.baselab.shapes.secondorder;

import net.firestaff.mcp.baselab.util.Point;

public class EpicycloidSeven extends Epicycloid {

    public EpicycloidSeven() {
        name = "EpicycloidSeven";
        period = Math.PI * 2;
    }

    public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {
        return drawPetals(length,  circleModifier,  circleAngle,  circleTurnModifier,  7);
    }
}
