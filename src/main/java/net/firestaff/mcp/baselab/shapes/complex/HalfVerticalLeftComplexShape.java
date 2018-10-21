package net.firestaff.mcp.baselab.shapes.complex;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;

public class HalfVerticalLeftComplexShape extends AbstractComplexShape implements ComplexShape {

    static {
        shapeName = "HalfVerticalLeftComplexShape";
    }

    public HalfVerticalLeftComplexShape() {
        name = "HalfVerticalLeftComplexShape";
        period = Math.PI * 2;
    }

    public Point draw(double length, double circleModifier, double circAngle,  double circleTurnModifier) {
        double circleAngle = Math.abs(circAngle % (Math.PI * 2.0));

        if(circleAngle <= (Math.PI / 2)) {
            p = drawShape(length, circleModifier, (circAngle + Math.PI), circleTurnModifier);
            y = p.y;
            x = p.x;
        }
        else if( (circleAngle > (Math.PI / 2)) && (circleAngle <= (Math.PI + (Math.PI / 2))) ) {
            p = drawShape(length, circleModifier, ((circAngle)), circleTurnModifier);
            p = reverse(p);
            y = p.y;
            x = p.x;
        }
        else if( circleAngle >= (Math.PI + (Math.PI / 2)) ) {
            p = drawShape(length, circleModifier, (circAngle + Math.PI), circleTurnModifier);
            y = p.y;
            x = p.x;
        }
        //else System.out.println("4 " + circleAngle);

        p.x = (int)x;
        p.y = (int)y;

        return p;
    }
}