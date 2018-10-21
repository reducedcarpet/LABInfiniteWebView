package net.firestaff.mcp.baselab.shapes;

import net.firestaff.mcp.baselab.shapes.util.Shape;
import net.firestaff.mcp.baselab.util.Point;
import net.firestaff.mcp.baselab.util.Rotate;

public class LissajousCurve extends AbstractShape implements Shape {

    double a = 0.5; // wide
    double b = 1; // tall
    double n = 2; // curve
    double c = 0; // centred

    public LissajousCurve() {
        name = "LissajousCurve";
        LissajousCurve.shapeName = name;
        period = Math.PI * 4;
    }

    public LissajousCurve(double pathRotation) {
        name = "LissajousCurve";
        period = Math.PI * 4;
        specialPathRotation = pathRotation;
    }

    public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {

        x = (length * circleModifier ) * (a * Math.sin(n  * (circleAngle) + c));
        y = (length * circleModifier ) * (b * Math.sin((circleAngle))) ;

        p = Rotate.rotate(new Point((int)x, (int)y), (Math.PI/2));

        return p;
    }

    public Point drawReverse(double length, double circleModifier, double circleAngle, double circleTurnModifier) {

        x = (length * circleModifier ) * (a * Math.sin(n  * (circleAngle * -1) + c));
        y = (length * circleModifier ) * (b * Math.sin((circleAngle * -1))) ;

        p.x = (int)x;
        p.y = (int)y;

        return p;
    }
}

