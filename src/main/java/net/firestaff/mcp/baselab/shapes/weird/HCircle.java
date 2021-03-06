package net.firestaff.mcp.baselab.shapes.weird;

import net.firestaff.mcp.baselab.shapes.AbstractShape;
import net.firestaff.mcp.baselab.shapes.util.Shape;
import net.firestaff.mcp.baselab.util.Point;

public class HCircle extends AbstractShape implements Shape {

    public HCircle() {
        name = "HCircle";
        HCircle.shapeName = name;
        period = Math.PI * 4;
    }

    public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {

        double circleAngle = Math.abs (realCircleAngle % ((Math.PI * 4)));
        double adj = ((length/2) * circleModifier);
        // stateless draw method
        if(circleAngle < (Math.PI / 2))
        {
            if (realCircleAngle < 0) {
                x = ((length/2) * circleModifier) * Math.cos((circleAngle) - (Math.PI) - (Math.PI / 2));
                y = ((length/2) * circleModifier) * Math.sin((circleAngle) - (Math.PI) - (Math.PI / 2));
                x += adj;
                p = reverse(new Point((int)x,(int)y));
                x = p.x; y = p.y;
            }
            else {
                x = ((length/2) * circleModifier) * Math.cos((circleAngle + (Math.PI / 2)));
                y = ((length/2) * circleModifier) * Math.sin((circleAngle + (Math.PI / 2)));
                x += adj;
            }
        }
        else if(circleAngle > (Math.PI / 2) && circleAngle <= (Math.PI))
        {
            if (realCircleAngle < 0) {
                x = ((length/2) * circleModifier) * Math.cos((circleAngle) + (Math.PI) + (Math.PI / 2));
                y = ((length/2) * circleModifier) * Math.sin((circleAngle) + (Math.PI) + (Math.PI / 2));
                x -= adj;
                p = reverse(new Point((int)x,(int)y));
                x = p.x; y = p.y;
            }
            else {
                x = ((length/2) * circleModifier) * Math.cos((circleAngle - (Math.PI / 2)));
                y = ((length/2) * circleModifier) * Math.sin((circleAngle - (Math.PI / 2)));
                x -= adj;
            }
        }
        else if(circleAngle > (Math.PI) && circleAngle <= (Math.PI * 2))
        {   // vert
            x = ((length/2) * circleModifier) * -1;
            if (realCircleAngle < 0)
                y = ((length/2) * circleModifier) * Math.sin((circleAngle  + (Math.PI / 2)));
            else
                y = ((length/2) * circleModifier) * Math.cos((circleAngle + (Math.PI)));
        }
        else if(circleAngle > (Math.PI * 2) && circleAngle <= (Math.PI * 2) + (Math.PI / 2))
        {
            if (realCircleAngle < 0) {
                x = ((length/2) * circleModifier) * Math.cos((circleAngle - (Math.PI / 2)));
                y = ((length/2) * circleModifier) * Math.sin((circleAngle - (Math.PI / 2)));
                x -= adj;
                p = reverse(new Point((int)x,(int)y));
                x = p.x; y = p.y;
            }
            else {
                x = ((length/2) * circleModifier) * Math.cos((circleAngle) + (Math.PI) + (Math.PI / 2));
                y = ((length/2) * circleModifier) * Math.sin((circleAngle) + (Math.PI) + (Math.PI / 2));
                x -= adj;
                //y -= adj;
            }
        }
        else if(circleAngle > (Math.PI * 2) + (Math.PI / 2) && circleAngle <= (Math.PI * 3))
        {
            if (realCircleAngle < 0) {
                x = ((length/2) * circleModifier) * Math.cos((circleAngle + (Math.PI / 2)));
                y = ((length/2) * circleModifier) * Math.sin((circleAngle + (Math.PI / 2)));
                x += adj;
                p = reverse(new Point((int)x,(int)y));
                x = p.x; y = p.y;

            }
            else {
                x = ((length/2) * circleModifier) * Math.cos((circleAngle) - (Math.PI) - (Math.PI / 2));
                y = ((length/2) * circleModifier) * Math.sin((circleAngle) - (Math.PI) - (Math.PI / 2));
                x += adj;
            }
        }
        else
        {
            // vert
            x = ((length/2) * circleModifier) * 1;
            if (realCircleAngle < 0)
                y = ((length/2) * circleModifier) * Math.cos((circleAngle  + (Math.PI)));
            else
                y = ((length/2) * circleModifier) * Math.sin((circleAngle  + (Math.PI / 2)));
        }
        p.x = (int)x;
        p.y = (int)y;

        return p;
    }
}
