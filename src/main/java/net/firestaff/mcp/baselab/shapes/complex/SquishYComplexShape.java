package net.firestaff.mcp.baselab.shapes.complex;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.util.Point;

public class SquishYComplexShape extends AbstractComplexShape implements ComplexShape {

    public SquishYComplexShape() {
        name = "SquishYComplexShape";
        SquishYComplexShape.shapeName = name;
        period = baseShape.getPeriod();
    }

    public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {

        p = baseShape.draw(length, circleModifier, circleAngle, circleTurnModifier);
        p.y = 0;

        return p;
    }
}
