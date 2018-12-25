package net.firestaff.mcp.baselab.shapes;

import net.firestaff.mcp.baselab.util.Point;

public class Circle extends AbstractShape {

    public Circle() {
        name = "Circle";
        Circle.shapeName = name;
        period = Math.PI * 2;
    }

    public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {
        y = ((length/2) * circleModifier) * Math.sin((circleAngle));
        x = ((length/2) * circleModifier) * Math.cos((circleAngle));

        p.x = x;
        p.y = y;

        return p;
    }

    public static Point drawStateless(double length, double circleModifier, double circleAngle, double circleTurnModifier) {
        double y = ((length/2) * circleModifier) * Math.sin((circleAngle));
        double x = ((length/2) * circleModifier) * Math.cos((circleAngle));

        Point p = new Point();
        p.x = x;
        p.y = y;

        return p;
    }
}
