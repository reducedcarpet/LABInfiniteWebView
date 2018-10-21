package net.firestaff.mcp.baselab.shapes.complex;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;

public class SteppedQuarterCAPComplexShape extends AbstractComplexShape implements ComplexShape {

    public SteppedQuarterCAPComplexShape() {
        name = "SteppedQuarterCAPComplexShape";
        SteppedQuarterCAPComplexShape.shapeName = name;
        period = Math.PI * 6;
    }

    public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {

        double circleAngle = Math.abs (realCircleAngle % period);

        if(circleAngle < (Math.PI / 2))
        {   // 0 -> 1 slide 1
            p = drawShape(length, circleModifier, realCircleAngle - (Math.PI), circleTurnModifier);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle < Math.PI )
        {   // 1 -> 2 move 1
            p = drawShape(length, circleModifier, realCircleAngle , circleTurnModifier);
            p = reverse(p);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle < (Math.PI * 2))
        {   // 2 -> 3 pause 2
            p = drawShape(length, circleModifier, realCircleAngle , circleTurnModifier);
            x = p.x;
            y = p.y;

        }


        else if(circleAngle < ((Math.PI * 2) + (Math.PI / 2)))
        {   // 1 -> 2 move 1
            p = drawShape(length, circleModifier, realCircleAngle, circleTurnModifier);
            p = reverse(p);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle < (Math.PI * 3) + (Math.PI / 2))
        {   // 2 -> 3 pause 2
            p = drawShape(length, circleModifier, realCircleAngle - (Math.PI), circleTurnModifier);
            x = p.x;
            y = p.y;

        }


        else if(circleAngle < ((Math.PI * 4)))
        {   // 1 -> 2 move 1
            p = drawShape(length, circleModifier, realCircleAngle, circleTurnModifier);
            p = reverse(p);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle < (Math.PI * 5))
        {   // 2 -> 3 pause 2
            p = drawShape(length, circleModifier, realCircleAngle, circleTurnModifier);
            x = p.x;
            y = p.y;

        }

        else if(circleAngle < ((Math.PI * 5) + (Math.PI / 2)))
        {   // 1 -> 2 move 1
            p = drawShape(length, circleModifier, realCircleAngle, circleTurnModifier);
            p = reverse(p);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle < (Math.PI * 6))
        {   // 2 -> 3 pause 2
            p = drawShape(length, circleModifier, realCircleAngle  - (Math.PI), circleTurnModifier);
            x = p.x;
            y = p.y;

        }

        p.x = (int)x;
        p.y = (int)y;

        return p;
    }
}
