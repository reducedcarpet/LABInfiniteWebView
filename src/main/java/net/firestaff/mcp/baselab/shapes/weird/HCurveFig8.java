package net.firestaff.mcp.baselab.shapes.weird;

import net.firestaff.mcp.baselab.shapes.AbstractShape;
import net.firestaff.mcp.baselab.shapes.util.Shape;
import net.firestaff.mcp.baselab.util.Point;

public class HCurveFig8  extends AbstractShape implements Shape {

    //private double lineCircleModifier = 0;

    public HCurveFig8() {
        name = "HCurveFig8";
        HCurveFig8.shapeName = name;
        period = Math.PI * 4;
    }

    public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {

        double circleAngle = Math.abs (realCircleAngle % ((Math.PI * 4)));

        // stateless draw method
        if(circleAngle < (Math.PI / 2))
        {
            if (realCircleAngle < 0) {
                x = ((length/2) * circleModifier) * Math.cos((circleAngle));
                y = (((length/2) * circleModifier) * Math.sin((circleAngle))) - ((length/2) * circleModifier);
            }
            else {
                x = ((length/2) * circleModifier) * Math.cos((circleAngle));
                y = ((length/2) * circleModifier) - (((length/2) * circleModifier) * Math.sin((circleAngle)));
            }
        }
        else if(circleAngle < (Math.PI))
        {
            if (realCircleAngle < 0) {
                x = ((length/2) * circleModifier) * Math.cos((circleAngle));
                y = ((length/2) * circleModifier) - (((length/2) * circleModifier) * Math.sin((circleAngle)));
            }
            else {
                x = ((length/2) * circleModifier) * Math.cos((circleAngle));
                y = (((length/2) * circleModifier) * Math.sin((circleAngle))) - ((length/2) * circleModifier);
            }
        }
        else if(circleAngle > (Math.PI) && circleAngle <= (Math.PI * 2))
        {   // vert
            x = ((length/2) * circleModifier) * -1;
            if (realCircleAngle < 0)
                y = ((length/2) * circleModifier) * Math.cos((circleAngle + (Math.PI)));
            else
                y = ((length/2) * circleModifier) * Math.sin((circleAngle  + (Math.PI / 2)));

        }
        else if(circleAngle > (Math.PI * 2) && circleAngle <= (Math.PI * 2) + (Math.PI / 2))
        {
            if (realCircleAngle >= 0) {
                x = -1 * ((length/2) * circleModifier) * Math.cos((circleAngle));
                y = ((length/2) * circleModifier) - (((length/2) * circleModifier) * Math.sin((circleAngle)));

            }
            else {
                x = -1 * ((length/2) * circleModifier) * Math.cos((circleAngle));
                y = (((length/2) * circleModifier) * Math.sin((circleAngle))) - ((length/2) * circleModifier);
            }
        }
        else if(circleAngle > (Math.PI * 2) + (Math.PI / 2) && circleAngle <= (Math.PI * 3))
        {
            if (realCircleAngle >= 0) {
                x = -1 * ((length/2) * circleModifier) * Math.cos((circleAngle));
                y = (((length/2) * circleModifier) * Math.sin((circleAngle))) - ((length/2) * circleModifier);

            }
            else {
                x = -1 * ((length/2) * circleModifier) * Math.cos((circleAngle));
                y = ((length/2) * circleModifier) - (((length/2) * circleModifier) * Math.sin((circleAngle)));
            }
        }
        else
        {
            // vert
            x = ((length/2) * circleModifier) * 1;
            if (realCircleAngle < 0)
                y = ((length/2) * circleModifier) * Math.cos((circleAngle  + (Math.PI)));
            else
                y = ((length/2) * circleModifier) * Math.sin((circleAngle  + (Math.PI / 2)));
        }
        p.x = (int)x;
        p.y = (int)y;

        return p;
    }
}
