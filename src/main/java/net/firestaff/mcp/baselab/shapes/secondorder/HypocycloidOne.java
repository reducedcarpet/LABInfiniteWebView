package net.firestaff.mcp.baselab.shapes.secondorder;

import net.firestaff.mcp.baselab.util.Point;

public class HypocycloidOne extends HypocycloidReal{

    public HypocycloidOne() {
        name = "HypocycloidOne";
        period = Math.PI * 2;
    }

    public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {
        return drawPetals(length, circleModifier, circleAngle, circleTurnModifier, 1);
    }
}
