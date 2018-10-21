package net.firestaff.mcp.baselab.shapes.complex;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;
import net.firestaff.mcp.baselab.util.Rotate;

public class FigureEightCAPTwoComplexShape extends AbstractComplexShape implements ComplexShape {


    public FigureEightCAPTwoComplexShape() {
        name = "FigureOfEightCAPTwoComplexShape";
        FigureEightCAPTwoComplexShape.shapeName = name;
        period = Math.PI * 4.0;
    }

    public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {

        double circleAngle = Math.abs (realCircleAngle % period); // period is 2 circles.

        if( circleAngle < (Math.PI)) {
            p = drawShape(length, circleModifier, ((realCircleAngle)), circleTurnModifier);
            p.x += (length / 2) * circleModifier;
        }
        else if( circleAngle < (Math.PI * 2)) {
            p = drawShape(length, circleModifier, (realCircleAngle), circleTurnModifier);
            p = Rotate.rotate(p, Math.PI);
            p = reverse(p);
            p.x -= (length / 2) * circleModifier;

        }
        else if( circleAngle < (Math.PI * 3)) {
            p = drawShape(length, circleModifier, (realCircleAngle), circleTurnModifier);
            p = Rotate.rotate(p, Math.PI);
            p.x -= (length / 2) * circleModifier;
        }
        else {
            p = drawShape(length, circleModifier, ((realCircleAngle)), circleTurnModifier);
            p = reverse(p);
            p.x += (length / 2) * circleModifier;
        }


        return p;
    }

}
