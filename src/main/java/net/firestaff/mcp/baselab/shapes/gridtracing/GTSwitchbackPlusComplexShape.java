package net.firestaff.mcp.baselab.shapes.gridtracing;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;

public class GTSwitchbackPlusComplexShape  extends AbstractComplexShape implements ComplexShape {

    public GTSwitchbackPlusComplexShape() {
        name = "GTSwitchbackPlusComplexShape";
        GTSwitchbackPlusComplexShape.shapeName = name;
        period = Math.PI * 12.0;
    }

    @Override
    public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {
        double circleAngle = Math.abs (realCircleAngle % (period)); // period is 2 circles.

        if(realCircleAngle < 0) {
            if (circleAngle < (Math.PI * 2)) {

                p = drawShape(length, circleModifier, (realCircleAngle + Math.PI), circleTurnModifier);
                p.x += (length / 2) * circleModifier;
                p.y += (length / 2) * circleModifier;

            } // 3 step of another circle
            else if (circleAngle < (Math.PI * 3) + (Math.PI / 2)) {

                p = drawShape(length, circleModifier, (realCircleAngle), circleTurnModifier);
                p = reverse(p);
                p.x -= (length / 2) * circleModifier;
                p.y += (length / 2) * circleModifier;

            } // 5 again
            else if (circleAngle < (Math.PI * 6)) {

                p = drawShape(length, circleModifier, (realCircleAngle), circleTurnModifier);
                p.x -= (length / 2) * circleModifier;
                p.y -= (length / 2) * circleModifier;

            } // 4 fourth circle goes back on itself
            else if (circleAngle < (Math.PI * 8)) {

                p = drawShape(length, circleModifier, (realCircleAngle + Math.PI), circleTurnModifier);
                p = reverse(p);
                p.x += (length / 2) * circleModifier;
                p.y -= (length / 2) * circleModifier;

            } //  3 going back,
            else if (circleAngle < (Math.PI * 9) + (Math.PI / 2)) {

                p = drawShape(length, circleModifier, (realCircleAngle), circleTurnModifier);
                p.x -= (length / 2) * circleModifier;
                p.y -= (length / 2) * circleModifier;

            } // 5 back around
            else if (circleAngle < (Math.PI * 12)) {
                p = drawShape(length, circleModifier, (realCircleAngle ), circleTurnModifier);
                p = reverse(p);
                p.x -= (length / 2) * circleModifier;
                p.y += (length / 2) * circleModifier;
            }
        }
        else {
            // 4 steps of a normal circle
            if (circleAngle < (Math.PI * 2)) {
                p = drawShape(length, circleModifier, ((realCircleAngle + Math.PI)), circleTurnModifier);
                p.x += (length / 2) * circleModifier;
                p.y += (length / 2) * circleModifier;

            } // 5 step of another circle
            else if (circleAngle < (Math.PI * 4) + (Math.PI / 2)) {

                p = drawShape(length, circleModifier, (realCircleAngle), circleTurnModifier);
                p = reverse(p);
                p.x -= (length / 2) * circleModifier;
                p.y += (length / 2) * circleModifier;
                //p.y += (length / 2) * circleModifier;

            } // 3 again
            else if (circleAngle < (Math.PI * 6)) {

                p = drawShape(length, circleModifier, (realCircleAngle), circleTurnModifier);
                p.x -= (length / 2) * circleModifier;
                p.y -= (length / 2) * circleModifier;
                //p = reverse(p);

            } // 4 fourth circle goes back on itself
            else if (circleAngle < (Math.PI * 8)) {

                p = drawShape(length, circleModifier, (realCircleAngle - (Math.PI)), circleTurnModifier);
                p = reverse(p);
                p.x += (length / 2) * circleModifier;
                p.y -= (length / 2) * circleModifier;

            } //  5 going back,
            else if (circleAngle < (Math.PI * 10) + (Math.PI / 2)) {

                p = drawShape(length, circleModifier, (realCircleAngle), circleTurnModifier);
                p.x -= (length / 2) * circleModifier;
                p.y -= (length / 2) * circleModifier;
                //p = reverse(p);

            } // 3 back around
            else if (circleAngle < (Math.PI * 12)) {

                p = drawShape(length, circleModifier, (realCircleAngle), circleTurnModifier);
                p = reverse(p);
                p.x -= (length / 2) * circleModifier;
                p.y += (length / 2) * circleModifier;
                //p.y += (length / 2) * circleModifier;

            }
        }
        return p;

    }
}
