package net.firestaff.mcp.baselab.shapes.decorators;

import net.firestaff.mcp.baselab.shapes.AbstractComplexShape;
import net.firestaff.mcp.baselab.shapes.Circle;
import net.firestaff.mcp.baselab.shapes.util.ComplexShape;
import net.firestaff.mcp.baselab.shapes.util.DecoratorShape;
import net.firestaff.mcp.baselab.shapes.util.Shape;
import net.firestaff.mcp.baselab.util.Point;

public abstract class AbstractDecoratorShape extends AbstractComplexShape implements DecoratorShape {

    protected Shape baseShape = new Circle();

    @Override
    public Shape getBaseShape() {
        return baseShape;
    }

    @Override
    public void setBaseShape(Shape shape) {
        if(baseShape instanceof ComplexShape) ((ComplexShape)baseShape).setBaseShape(shape);
        else this.baseShape = shape;
    }

    protected Point drawShape(double length, double circleModifier, double circleAngle, double circleTurnModifier) {

        return baseShape.draw(length, circleModifier, circleAngle, circleTurnModifier);
    }
}
