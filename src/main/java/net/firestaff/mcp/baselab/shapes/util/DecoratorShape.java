package net.firestaff.mcp.baselab.shapes.util;

public interface DecoratorShape extends ComplexShape {

    public Shape getBaseShape();

    public void setBaseShape(Shape shape);

}
