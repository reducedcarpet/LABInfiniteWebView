package net.firestaff.mcp.baselab.shapes.parabola;

import net.firestaff.mcp.baselab.shapes.AbstractShape;
import net.firestaff.mcp.baselab.util.Point;

public class Parabolic  extends AbstractShape {

    public Parabolic() {
        name = "Oval";
        Parabolic.shapeName = name;
        period = Math.PI * 4;
    }

    public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {
        //double circleA = circleAngle % ((Math.PI * 2) + (Math.PI/16));

        double circleA = 1 / Math.tan(circleAngle);
        /*
        if(circleA > ( Math.PI + (Math.PI/2))) {
            double t = 1 / Math.tan(Math.abs(circleAngle + (Math.PI + (Math.PI/2) + (Math.PI/16)) ));
            //double t = Math.cos(circleAngle);
            double a = 18;

            y = a * (t * t);
            y -= 180;
            x = 2 * a * t;
        }
        else {
            x = 0;
            y = 0;
        } /**/

        //x = (length * circleModifier ) * (1 * Math.sin(2  * (circleA)) - (Math.PI / 2));
        //y = (length * circleModifier ) * (2 * Math.sin((circleA)) - (Math.PI / 2)) ;

        boolean posY = true;
        y = (length * circleModifier ) * Math.sin((circleAngle));
        if(y < 0) posY = false;

        x = Math.sqrt(4 * 8 * Math.abs(y));

        if(!posY) { x *= -1; y *= -1; }

        p.x = x;
        p.y = y;

        return p;
    }
}
