package net.firestaff.mcp.baselab.shapes;

import net.firestaff.mcp.baselab.shapes.util.Shape;
import net.firestaff.mcp.baselab.util.Point;

public class Dot  extends AbstractShape implements Shape {

    public Dot() {
        name = "Point";
        Dot.shapeName = name;
        period = Math.PI * 2;
    }

    public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {
        x = 0;
        y = 0;

        p.x = (int)x;
        p.y = (int)y;

        return p;
    }
}
