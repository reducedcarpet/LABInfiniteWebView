package net.firestaff.mcp.baselab.shapes.gridtracing;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;

public class GTSwitchbackComplexShape extends AbstractComplexShape implements ComplexShape {

    public GTSwitchbackComplexShape() {
        name = "GTSwitchbackComplexShape";
        GTSwitchbackComplexShape.shapeName = name;
        period = Math.PI * 8.0;
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

            } // 1 again
            else if (circleAngle < (Math.PI * 4)) {

                p = drawShape(length, circleModifier, (realCircleAngle), circleTurnModifier);
                p.x -= (length / 2) * circleModifier;
                p.y -= (length / 2) * circleModifier;

            } // 4 fourth circle goes back on itself
            else if (circleAngle < (Math.PI * 6)) {

                p = drawShape(length, circleModifier, (realCircleAngle + Math.PI), circleTurnModifier);
                p = reverse(p);
                p.x += (length / 2) * circleModifier;
                p.y -= (length / 2) * circleModifier;

            } //  3 going back,
            else if (circleAngle < (Math.PI * 7) + (Math.PI / 2)) {

                p = drawShape(length, circleModifier, (realCircleAngle), circleTurnModifier);
                p.x -= (length / 2) * circleModifier;
                p.y -= (length / 2) * circleModifier;

            } // 1 back around
            else if (circleAngle < (Math.PI * 8)) {
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

            } // 1 step of another circle
            else if (circleAngle < (Math.PI * 2) + (Math.PI / 2)) {

                p = drawShape(length, circleModifier, (realCircleAngle), circleTurnModifier);
                p = reverse(p);
                p.x -= (length / 2) * circleModifier;
                p.y += (length / 2) * circleModifier;
                //p.y += (length / 2) * circleModifier;

            } // 3 again
            else if (circleAngle < (Math.PI * 4)) {

                p = drawShape(length, circleModifier, (realCircleAngle), circleTurnModifier);
                p.x -= (length / 2) * circleModifier;
                p.y -= (length / 2) * circleModifier;
                //p = reverse(p);

            } // 4 fourth circle goes back on itself
            else if (circleAngle < (Math.PI * 6)) {

                p = drawShape(length, circleModifier, (realCircleAngle - (Math.PI)), circleTurnModifier);
                p = reverse(p);
                p.x += (length / 2) * circleModifier;
                p.y -= (length / 2) * circleModifier;

            } //  1 going back,
            else if (circleAngle < (Math.PI * 6) + (Math.PI / 2)) {

                p = drawShape(length, circleModifier, (realCircleAngle), circleTurnModifier);
                p.x -= (length / 2) * circleModifier;
                p.y -= (length / 2) * circleModifier;
                //p = reverse(p);

            } // 3 back around
            else if (circleAngle < (Math.PI * 8)) {

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
