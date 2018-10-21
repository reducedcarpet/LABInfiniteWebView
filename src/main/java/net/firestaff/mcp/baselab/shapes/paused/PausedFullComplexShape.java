package net.firestaff.mcp.baselab.shapes.paused;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;

public class PausedFullComplexShape  extends AbstractComplexShape implements ComplexShape {

    public PausedFullComplexShape() {
        name = "PausedFullComplexShape";
        PausedFullComplexShape.shapeName = name;
        period = Math.PI * 3;
    }

    public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {

        double circleAngle = Math.abs (realCircleAngle % ((Math.PI * 4)));

        if(circleAngle >= 0 && circleAngle < (Math.PI))
        {   // 0 -> 1 pause
            p = drawShape(length, circleModifier, Math.PI, circleTurnModifier);
            y = p.y;
            x = p.x;
        }
        else if(circleAngle >= (Math.PI) && circleAngle <= ((Math.PI * 3)))
        {   // 1 -> 3 move
            p = drawShape(length, circleModifier, realCircleAngle, circleTurnModifier);
            y = p.y;
            x = p.x;
        }
        else if(circleAngle >= (Math.PI * 3) && circleAngle <= ((Math.PI * 4)))
        {   // 1 -> 3 pause
            p = drawShape(length, circleModifier, Math.PI, circleTurnModifier);
            y = p.y;
            x = p.x;
        }

        p.x = (int)x;
        p.y = (int)y;

        return p;
    }

}
