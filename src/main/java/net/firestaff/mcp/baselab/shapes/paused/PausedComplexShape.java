package net.firestaff.mcp.baselab.shapes.paused;

import net.firestaff.mcp.baselab.util.Point;

public class PausedComplexShape extends PausedHelper {

    double seperation = 0;
    double duration = 0;

    public PausedComplexShape() {
        name = "PausedIncomplete";
        PausedComplexShape.shapeName = name;
        period = Math.PI * 4;
    }

    public PausedComplexShape(double sep, double dur, String nam) {
        name = nam;
        period = Math.PI * 4;
        seperation = sep;
        duration = dur;
    }

    public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {
        return super.drawPaused(length, circleModifier, realCircleAngle, circleTurnModifier, duration, seperation);
    }
}
