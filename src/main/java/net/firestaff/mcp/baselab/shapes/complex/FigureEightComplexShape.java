package net.firestaff.mcp.baselab.shapes.complex;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.shapes.util.Shape;
import net.firestaff.mcp.baselab.util.Point;
import net.firestaff.mcp.baselab.util.Rotate;

public class FigureEightComplexShape extends AbstractComplexShape implements ComplexShape {


    public FigureEightComplexShape() {
        name = "FigureOfEightComplexShape";
        FigureEightComplexShape.shapeName = name;
        period = Math.PI * 4.0;
    }

    public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {

        double circleAngle = Math.abs (realCircleAngle % (Math.PI * 4.0)); // period is 2 circles.

        if( circleAngle < (Math.PI * 2)) {
            p = drawShape(length, circleModifier, ((realCircleAngle + Math.PI)), circleTurnModifier);
            p.x += (length / 2) * circleModifier;
        }
        else {
            p = drawShape(length, circleModifier, (realCircleAngle + Math.PI), circleTurnModifier);
            p = reverse(p);
            p = Rotate.rotate(p, Math.PI);
            p.x -= (length / 2) * circleModifier;
        }

        return p;
    }

}
