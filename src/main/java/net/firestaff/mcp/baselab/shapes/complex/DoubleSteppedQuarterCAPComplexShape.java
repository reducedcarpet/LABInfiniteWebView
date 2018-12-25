package net.firestaff.mcp.baselab.shapes.complex;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;

public class DoubleSteppedQuarterCAPComplexShape extends AbstractComplexShape implements ComplexShape {

    public DoubleSteppedQuarterCAPComplexShape() {
        name = "DoubleSteppedQuarterCAPComplexShape";
        DoubleSteppedQuarterCAPComplexShape.shapeName = name;
        period = Math.PI * 10;
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
        else if(circleAngle < Math.PI + (Math.PI / 2))
        {   // 0 -> 1 slide 1
            p = drawShape(length, circleModifier, realCircleAngle, circleTurnModifier);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle < Math.PI + Math.PI )
        {   // 1 -> 2 move 1
            p = drawShape(length, circleModifier, realCircleAngle - Math.PI, circleTurnModifier);
            p = reverse(p);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle < (Math.PI * 3))
        {   // 2 -> 3 pause 2
            p = drawShape(length, circleModifier, realCircleAngle - Math.PI, circleTurnModifier);
            x = p.x;
            y = p.y;

        }


        else if(circleAngle < ((Math.PI * 3) + (Math.PI / 2)))
        {   // 1 -> 2 move 1
            p = drawShape(length, circleModifier, realCircleAngle - (Math.PI), circleTurnModifier);
            p = reverse(p);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle < (Math.PI * 4) )
        {   // 2 -> 3 pause 2
            p = drawShape(length, circleModifier, realCircleAngle , circleTurnModifier);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle < ((Math.PI * 4) + (Math.PI / 2)))
        {   // 1 -> 2 move 1
            p = drawShape(length, circleModifier, realCircleAngle, circleTurnModifier);
            p = reverse(p);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle < (Math.PI * 5) + (Math.PI / 2))
        {   // 2 -> 3 pause 2
            p = drawShape(length, circleModifier, realCircleAngle - (Math.PI), circleTurnModifier);
            x = p.x;
            y = p.y;
        }


        else if(circleAngle < (Math.PI * 6) )
        {   // 1 -> 2 move 1
            p = drawShape(length, circleModifier, realCircleAngle , circleTurnModifier);
            p = reverse(p);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle < (Math.PI * 6) + (Math.PI / 2))
        {   // 0 -> 1 slide 1
            p = drawShape(length, circleModifier, realCircleAngle, circleTurnModifier);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle < (Math.PI * 7) )
        {   // 1 -> 2 move 1
            p = drawShape(length, circleModifier, realCircleAngle - Math.PI, circleTurnModifier);
            p = reverse(p);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle < (Math.PI * 8))
        {   // 2 -> 3 pause 2
            p = drawShape(length, circleModifier, realCircleAngle - Math.PI, circleTurnModifier);
            x = p.x;
            y = p.y;

        }

        else if(circleAngle < ((Math.PI * 8) + (Math.PI / 2)))
        {   // 1 -> 2 move 1
            p = drawShape(length, circleModifier, realCircleAngle - (Math.PI), circleTurnModifier);
            p = reverse(p);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle < (Math.PI * 9) )
        {   // 2 -> 3 pause 2
            p = drawShape(length, circleModifier, realCircleAngle , circleTurnModifier);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle < ((Math.PI * 9) + (Math.PI / 2)))
        {   // 1 -> 2 move 1
            p = drawShape(length, circleModifier, realCircleAngle, circleTurnModifier);
            p = reverse(p);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle < (Math.PI * 10))
        {   // 2 -> 3 pause 2
            p = drawShape(length, circleModifier, realCircleAngle - (Math.PI), circleTurnModifier);
            x = p.x;
            y = p.y;
        }

        p.x = x;
        p.y = y;

        return p;
    }
}
