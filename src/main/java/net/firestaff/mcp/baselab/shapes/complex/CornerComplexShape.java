package net.firestaff.mcp.baselab.shapes.complex;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;

public class CornerComplexShape extends AbstractComplexShape implements ComplexShape {

    public CornerComplexShape() {
        name = "CornerComplexShape";
        CornerComplexShape.shapeName = name;
    }

    @Override
    public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {

        double fakeAngle = Math.abs( circleAngle % ((Math.PI) + (Math.PI/2)));

        p = baseShape.draw(length, circleModifier, fakeAngle, circleTurnModifier);
        y = p.y;
        x = p.x;

        Point b = baseShape.draw(length, circleModifier, (fakeAngle - (Math.PI)), circleTurnModifier);
        double y1 = b.y;
        double x1 = b.x;

        if(fakeAngle <= (Math.PI / 2)) {
            p = baseShape.draw(length, circleModifier, fakeAngle - (Math.PI / 2), circleTurnModifier);
            y = p.y;
            x = 0;
        }
        else if(fakeAngle <= (Math.PI)) {
            p = reverse(p);
            x = p.x;
            y = 0;
        }
        else {
            b = reverse(b);
            y = b.y;
            x = b.x;
        }

        p.x = (int)x;
        p.y = (int)y;

        return p;
    }

}
