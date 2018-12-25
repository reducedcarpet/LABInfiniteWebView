package net.firestaff.mcp.baselab.shapes.complex;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;
import net.firestaff.mcp.baselab.util.Rotate;

public class TranslatedQuarterHalfedComplexShape extends AbstractComplexShape implements ComplexShape {

    public TranslatedQuarterHalfedComplexShape() {
        name = "TranslatedQuarterHalfedComplexShape";
        TranslatedQuarterHalfedComplexShape.shapeName = name;
        period = Math.PI * 3;
    }

    public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {

        double circleAngle = Math.abs (realCircleAngle % (Math.PI * 3) );
        double fakeAngle = realCircleAngle % (Math.PI * 3);

        if(circleAngle <= (Math.PI / 2))
        {   // 0 -> 1 slide 1
            p = drawShape(length, circleModifier, fakeAngle - (Math.PI/2), circleTurnModifier);
            x = p.x;
            y = 0;
        }
        else if(circleAngle <= (Math.PI))
        {   // 1 -> 2 move 1
            p = drawShape(length, circleModifier, fakeAngle - (Math.PI/2), circleTurnModifier);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle <= (Math.PI) + (Math.PI / 2))
        {   // 2 -> 3 pause 2
            p = drawShape(length, circleModifier, fakeAngle - (Math.PI / 2), circleTurnModifier);
            y = p.y;
            x = 0;
        }
        else if(circleAngle <= (Math.PI * 2))
        {   // 3 -> 4 move 2
            p = drawShape(length, circleModifier, fakeAngle - Math.PI, circleTurnModifier);
            x = p.x;
            y = 0;
        }
        else if(circleAngle <= (Math.PI * 2) + (Math.PI / 2) )
        {   // 4 -> 5 pause 3
            p = drawShape(length, circleModifier, fakeAngle + (Math.PI), circleTurnModifier);
            p = reverse(p);
            x = p.x;
            y = p.y;
        }
        else if(circleAngle <= (Math.PI * 3))
        {   // 5 -> 6 move 3
            p = drawShape(length, circleModifier, fakeAngle, circleTurnModifier);
            x = 0;
            y = p.y;
        }


        p.x = x;
        p.y = y;
        p = Rotate.rotate(p, Math.PI/2);

        return p;
    }
}
