package net.firestaff.mcp.baselab.shapes;

import net.firestaff.mcp.baselab.shapes.util.Shape;
import net.firestaff.mcp.baselab.util.Point;

public class Line extends AbstractShape implements Shape {

    private boolean vertical = false;

    public Line() {
        name = "HorizontalLine";
        Line.shapeName = name;
        period = Math.PI * 2;
    }

    public Line(boolean vert) {
        name = "HorizontalLine";
        if(vert) name = "VerticalLine";
        Line.shapeName = name;
        period = Math.PI * 2;
        vertical = vert;
    }

    public Point draw(double length, double circleModifier, double circleAngle, double circleTurnModifier) {

        // stateless draw method
        if(vertical)
        {
            x = 0;
            y = ((length/2) * circleModifier) * Math.sin((circleAngle));
        }
        else
        {
            y = 0;
            x = ((length/2) * circleModifier) * Math.cos((circleAngle));
        }
        p.x = (int)x;
        p.y = (int)y;

        return p;
    }
}
