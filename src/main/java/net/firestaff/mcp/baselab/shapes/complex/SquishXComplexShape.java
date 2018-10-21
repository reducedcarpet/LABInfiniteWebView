package net.firestaff.mcp.baselab.shapes.complex;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;

public class SquishXComplexShape extends AbstractComplexShape implements ComplexShape {

    public SquishXComplexShape() {
        name = "SquishXComplexShape";
        SquishXComplexShape.shapeName = name;
        period = baseShape.getPeriod();
    }

    public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {

        p = baseShape.draw(length, circleModifier, circleAngle, circleTurnModifier);
        p.x = 0;

        return p;
    }
}
