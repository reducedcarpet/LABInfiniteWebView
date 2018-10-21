package net.firestaff.mcp.baselab.shapes.paused;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;

public class PausedHalfCapComplexShape  extends AbstractComplexShape implements ComplexShape {

    public PausedHalfCapComplexShape() {
        name = "PausedHalfCapComplexShape";
        PausedHalfCapComplexShape.shapeName = name;
        period = Math.PI * 6;
    }

    public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {

        double circleAngle = Math.abs (realCircleAngle % ((Math.PI * 4)));

        if(circleAngle > 0 && circleAngle <= (Math.PI))
        {   // 0 -> 1 pause
            p = drawShape(length, circleModifier, Math.PI, circleTurnModifier);
            y = p.y;
            x = p.x;
        }
        else if(circleAngle > (Math.PI) && circleAngle <= ((Math.PI) + Math.PI))
        {   // 1 -> 3 down
            p = drawShape(length, circleModifier, realCircleAngle, circleTurnModifier);
            y = p.y;
            x = p.x;
        }
        else if(circleAngle > (Math.PI * 2) && circleAngle <= ((Math.PI * 3) ))
        {   // 3 -> 4 pause
            p = drawShape(length, circleModifier, 0, circleTurnModifier);
            y = p.y;
            x = p.x;
        }
        else
        {   // 4 -> 6
            p = drawShape(length, circleModifier, (realCircleAngle + Math.PI), circleTurnModifier);
            p = reverse(p);
            y = p.y;
            x = p.x;
        }


        p.x = (int)x;
        p.y = (int)y;

        return p;
    }

}
