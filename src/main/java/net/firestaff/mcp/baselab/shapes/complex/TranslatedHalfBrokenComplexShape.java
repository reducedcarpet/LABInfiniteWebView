package net.firestaff.mcp.baselab.shapes.complex;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;
import net.firestaff.mcp.baselab.util.Rotate;

public class TranslatedHalfBrokenComplexShape extends AbstractComplexShape implements ComplexShape {

    public TranslatedHalfBrokenComplexShape() {
        name = "TranslatedHalfBrokenComplexShape";
        TranslatedHalfBrokenComplexShape.shapeName = name;
    }

    @Override
    public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {

        p = baseShape.draw(length, circleModifier, circleAngle, circleTurnModifier);
        y = p.y;
        x = p.x;

        double fakeAngle = Math.abs( circleAngle % ((Math.PI * 4)));

        Point b = baseShape.draw(length, circleModifier, (circleAngle + (Math.PI / 2)), circleTurnModifier);
        double y1 = b.y;
        double x1 = b.x;
        if(fakeAngle <= Math.PI) {
            y = x;
            x = 0;
        }
        else if (fakeAngle <= (Math.PI * 2) ){
            y = y1;
            x = x1;
        }
        else if (fakeAngle <= (Math.PI * 3) ){
            p = baseShape.draw(length, circleModifier, circleAngle , circleTurnModifier);
            y = p.x;
            x = 0;
        }
        else {
            b = baseShape.draw(length, circleModifier, (circleAngle + Math.PI + (Math.PI / 2)), circleTurnModifier);
            b = reverse(b);
            y = b.y;
            x = b.x;
        }

        p.x = x;
        p.y = y;
        p = Rotate.rotate(p, Math.PI/2);

        return p;
    }

}
