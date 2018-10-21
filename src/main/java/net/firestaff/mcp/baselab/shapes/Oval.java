package net.firestaff.mcp.baselab.shapes;

import net.firestaff.mcp.baselab.util.Point;

public class Oval extends AbstractShape {

    public Oval() {
        name = "Oval";
        Oval.shapeName = name;
        period = Math.PI * 2;
    }

    public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {
        y = ((length/2) * circleModifier) * Math.sin((circleAngle));
        x = ((length/2) * circleModifier) * Math.cos((circleAngle)) / 2;

        p.x = (int)x;
        p.y = (int)y;

        return p;
    }

}