package net.firestaff.mcp.baselab.shapes.gridtracing;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;

public class GTPlusKnotComplexShape extends AbstractComplexShape implements ComplexShape {

    public GTPlusKnotComplexShape() {
        name = "GTPlusKnotComplexShape";
        GTPlusKnotComplexShape.shapeName = name;
        period = Math.PI * 8.0;
    }

    @Override
    public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {
        double circleAngle = Math.abs (realCircleAngle % (period)); // period is 2 circles.

        // 3 steps of a normal circle
        if( circleAngle < (Math.PI + (Math.PI / 2))) {
            if(realCircleAngle < 0) {
                p = drawShape(length, circleModifier, ((realCircleAngle + Math.PI)), circleTurnModifier);
                p.x += (length / 2) * circleModifier;
                p.y += (length / 2) * circleModifier;
            } else {
                p = drawShape(length, circleModifier, ((realCircleAngle + Math.PI + (Math.PI / 2))), circleTurnModifier);
                p.x += (length / 2) * circleModifier;
                p.y += (length / 2) * circleModifier;
            }
        } // 5 steps of another circle
        else if ( circleAngle < (Math.PI * 4)){
            if(realCircleAngle < 0) {
                p = drawShape(length, circleModifier, (realCircleAngle - (Math.PI )), circleTurnModifier);
                p = reverse(p);
                p.x += (length / 2) * circleModifier;
                p.y -= (length / 2) * circleModifier;
            } else {
                p = drawShape(length, circleModifier, (realCircleAngle + (Math.PI / 2)), circleTurnModifier);
                p = reverse(p);
                p.x -= (length / 2) * circleModifier;
                p.y += (length / 2) * circleModifier;
                //p.y += (length / 2) * circleModifier;
            }
        } // 3 again
        else if ( circleAngle < (Math.PI * 5 ) + (Math.PI / 2) ){
            if(realCircleAngle < 0) {
                p = drawShape(length, circleModifier, (realCircleAngle), circleTurnModifier);
                p.x -= (length / 2) * circleModifier;
                p.y -= (length / 2) * circleModifier;
            } else {
                p = drawShape(length, circleModifier, (realCircleAngle + (Math.PI / 2)), circleTurnModifier);
                p.x -= (length / 2) * circleModifier;
                p.y -= (length / 2) * circleModifier;
                //p = reverse(p);
            }
        }
        else if ( circleAngle < (Math.PI * 8)){
            if(realCircleAngle < 0) {
                p = drawShape(length, circleModifier, (realCircleAngle), circleTurnModifier);
                p = reverse(p);
                p.x -= (length / 2) * circleModifier;
                p.y += (length / 2) * circleModifier;
            } else {
                p = drawShape(length, circleModifier, (realCircleAngle - (Math.PI / 2)), circleTurnModifier);
                p = reverse(p);
                p.x += (length / 2) * circleModifier;
                p.y -= (length / 2) * circleModifier;
            }
        }

        return p;

    }
}
