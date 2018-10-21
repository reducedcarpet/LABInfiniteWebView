package net.firestaff.mcp.baselab.shapes;

import net.firestaff.mcp.baselab.shapes.secondorder.HypocycloidFake;
import net.firestaff.mcp.baselab.shapes.secondorder.HypocycloidReal;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.shapes.util.Shape;
import net.firestaff.mcp.baselab.util.Point;

public abstract class AbstractComplexShape extends AbstractShape implements ComplexShape {

    protected Shape baseShape = new Circle();

    @Override
    public Shape getBaseShape() {
        return baseShape;
    }

    @Override
    public void setBaseShape(Shape shape) {
        this.baseShape = shape;
    }

    protected Point drawShape(double length, double circleModifier, double circleAngle, double circleTurnModifier) {
        if(baseShape.getName().equalsIgnoreCase("Hypocycloid")) {
            return HypocycloidReal.drawStateless(length, circleModifier, circleAngle, circleTurnModifier);
        }
        return baseShape.draw(length, circleModifier, circleAngle, circleTurnModifier);
    }
}
