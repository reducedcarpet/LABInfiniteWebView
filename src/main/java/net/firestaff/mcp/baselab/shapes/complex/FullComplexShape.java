package net.firestaff.mcp.baselab.shapes.complex;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;

public class FullComplexShape  extends AbstractComplexShape implements ComplexShape {

    public FullComplexShape() {
        name = "FullComplexShape";
        FullComplexShape.shapeName = name;
        period = Math.PI * 4;
    }

    public Point draw(double length, double circleModifier, double circAngle, double circleTurnModifier) {
        double circleAngle = Math.abs(circAngle % (Math.PI * 4.0));

        if(circleAngle <= (Math.PI * 2.0)) {
            p = baseShape.draw(length, circleModifier, circleAngle, circleTurnModifier);
            y = p.y;
            x = p.x;
        }
        else {
            p = baseShape.draw(length, circleModifier, (circleAngle), circleTurnModifier);
            p = reverse(p);
            y = p.y;
            x = p.x;
        }

        p.x = x;
        p.y = y;

        return p;
    }
}
