package net.firestaff.mcp.baselab.shapes.weird;

import net.firestaff.mcp.baselab.shapes.AbstractShape;
import net.firestaff.mcp.baselab.shapes.util.Shape;
import net.firestaff.mcp.baselab.util.Point;
import net.firestaff.mcp.baselab.util.Rotate;

public class HLine extends AbstractShape implements Shape {

    //private double lineCircleModifier = 0;

    public HLine() {
        name = "HLine";
        HLine.shapeName = name;
        period = Math.PI * 6;
    }

    public Point draw(double length, double circleModifier, double realCircleAngle,  double circleTurnModifier) {

        double circleAngle = Math.abs (realCircleAngle % (period));

        // stateless draw method
        if(circleAngle <= (Math.PI * 2))
        {   // vert
            x = ((length/2) * circleModifier) * 1;
            if (realCircleAngle < 0) {
                y = ((length/2) * circleModifier) * Math.sin((circleAngle - (Math.PI)));
            }
            else
                y = ((length/2) * circleModifier) * Math.cos((circleAngle - (Math.PI / 2)));
        }
        else if(circleAngle <= Math.PI + (Math.PI * 2))
        {
            y = 0;
            x = ((length/2) * circleModifier) * Math.cos((circleAngle));
        }
        else if(circleAngle <= (Math.PI * 3))
        {
            y = 0;
            x = ((length/2) * circleModifier) * Math.cos((circleAngle));
        }
        else if(circleAngle <= (Math.PI * 5))
        {    // vert
            x = ((length/2) * circleModifier) * -1;
            if (realCircleAngle < 0) {
                y = ((length / 2) * circleModifier) * Math.cos((circleAngle - (Math.PI / 2)));
            }
            else
                y = ((length/2) * circleModifier) * Math.sin((circleAngle - (Math.PI )));

        }
        else
        {
            y = 0;
            x = ((length/2) * circleModifier) * Math.cos((circleAngle));
        }

        p.x = (int)x;
        p.y = (int)y;

        return p;
    }
}
