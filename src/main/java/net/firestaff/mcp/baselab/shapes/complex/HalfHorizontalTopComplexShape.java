package net.firestaff.mcp.baselab.shapes.complex;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;

public class HalfHorizontalTopComplexShape extends AbstractComplexShape implements ComplexShape {

    static {
        shapeName = "HalfHorizontalTopComplexShape";
    }

    public HalfHorizontalTopComplexShape() {
        name = HalfHorizontalTopComplexShape.shapeName;
        period = Math.PI * 2;
    }

    public Point draw(double length, double circleModifier, double circAngle,  double circleTurnModifier) {

        double circleAngle = Math.abs(circAngle % (Math.PI * 2.0));

        if(circleAngle >= Math.PI) {
            p = drawShape(length, circleModifier, circleAngle, circleTurnModifier);
            y = p.y;
            x = p.x;
        }
        else {
            p = drawShape(length, circleModifier, (circleAngle * -1), circleTurnModifier);
            y = p.y;
            x = p.x;
        }

        p.x = x;
        p.y = y;

        return p;
    }
}