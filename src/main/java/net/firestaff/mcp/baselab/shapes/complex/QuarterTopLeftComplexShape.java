package net.firestaff.mcp.baselab.shapes.complex;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;

public class QuarterTopLeftComplexShape  extends AbstractComplexShape implements ComplexShape {

    public QuarterTopLeftComplexShape() {
        name = "QuarterTopLeftComplexShape";
        QuarterTopLeftComplexShape.shapeName = name;
        period = Math.PI;
    }

    public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {

        circleAngle = Math.abs (circleAngle % (Math.PI));

        if(circleAngle <= (Math.PI / 2 ) ) {
            p = drawShape(length, circleModifier, (circleAngle + (Math.PI)), circleTurnModifier);
            y = p.y;
            x = p.x;
        }
        else if( (circleAngle > (Math.PI / 2 )) && (circleAngle <= (Math.PI + (Math.PI /2))) ) {
            p = drawShape(length, circleModifier, ((Math.PI - circleAngle) + Math.PI), circleTurnModifier);
            y = p.y;
            x = p.x;
        }

        p.x = (int)x;
        p.y = (int)y;

        return p;
    }
}
