package net.firestaff.mcp.baselab.shapes.complex;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;

public class HalfVerticalRightComplexShape extends AbstractComplexShape implements ComplexShape {

    static {
        shapeName = "HalfVerticalRightComplexShape";
    }

    public HalfVerticalRightComplexShape() {
        name = "HalfVerticalRightComplexShape";
        period = Math.PI * 2;
    }

    public Point draw(double length, double circleModifier, double circAngle,  double circleTurnModifier) {
        double circleAngle = Math.abs(circAngle % (Math.PI * 2.0));

        // first quarter
        if(circleAngle <= (Math.PI / 2)) {
            p = drawShape(length, circleModifier, circleAngle, circleTurnModifier);
            y = p.y;
            x = p.x;
        } // middle half
        else if( (circleAngle > (Math.PI / 2)) && (circleAngle <= (Math.PI + (Math.PI / 2))) ) {
            p = drawShape(length, circleModifier, ((Math.PI + circleAngle) * -1), circleTurnModifier);
            y = p.y;
            x = p.x;
        } // 2nd quarter
        else if( circleAngle >= (Math.PI + (Math.PI / 2)) ) {
            p = drawShape(length, circleModifier, circleAngle, circleTurnModifier);
            y = p.y;
            x = p.x;
        }

        p.x = (int)x;
        p.y = (int)y;

        return p;
    }
}
