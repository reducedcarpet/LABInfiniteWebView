package net.firestaff.mcp.baselab.shapes.weird;

import net.firestaff.mcp.baselab.shapes.AbstractShape;
import net.firestaff.mcp.baselab.shapes.util.Shape;
import net.firestaff.mcp.baselab.util.Point;

public class PlusCorner extends AbstractShape implements Shape {

    //private double lineCircleModifier = 0;

    public PlusCorner() {
        name = "Plus";
        PlusCorner.shapeName = name;
        period = Math.PI * 4;
    }

    public Point draw(double length, double circleModifier, double realCircleAngle, double circleTurnModifier) {

        double circleAngle = Math.abs (realCircleAngle % ((Math.PI * 4)));

        // corner first
        if(circleAngle < (Math.PI / 2))
        {
            if (realCircleAngle < 0) {
                x = 0;
                y = ((length / 2) * circleModifier) * Math.sin((circleAngle + (Math.PI / 2)));
                p = reverse(new Point((int)x,(int)y));
                x = p.x;
                y = p.y;
            }
            else {
                x = 0;
                y = ((length / 2) * circleModifier) * Math.sin((circleAngle + (Math.PI / 2)));
            }
        }
        else if(circleAngle < (Math.PI ))
        {   // vert
            if (realCircleAngle < 0) {
                x = ((length / 2) * circleModifier) * Math.sin((circleAngle + (Math.PI / 2)));
                y = 0;
                p = reverse(new Point((int)x,(int)y));
                x = p.x;
                y = p.y;
            }
            else {
                x = ((length / 2) * circleModifier) * Math.sin((circleAngle + (Math.PI / 2)));
                y = 0;
            }
        }
        else if(circleAngle <= (Math.PI * 2))
        {
            if (realCircleAngle < 0) {
                x = -1 * ((length/2) * circleModifier) * Math.cos((circleAngle + (Math.PI)));
                y = 0;
                p = reverse(new Point((int)x,(int)y));
                x = p.x;
                y = p.y;
            }
            else {
                x = -1 * ((length/2) * circleModifier) * Math.cos((circleAngle + (Math.PI)));
                y = 0;
            }
        }
        else if(circleAngle <= (Math.PI * 2) + (Math.PI / 2))
        {
            if (realCircleAngle < 0) {
                x = -1 * ((length/2) * circleModifier) * Math.cos((circleAngle + (Math.PI)));
                y = 0;
                p = reverse(new Point((int)x,(int)y));
                x = p.x;
                y = p.y;
            }
            else {
                x = -1 * ((length/2) * circleModifier) * Math.cos((circleAngle + (Math.PI)));
                y = 0;
            }
        }
        else if(circleAngle <= (Math.PI * 3))
        {
            if (realCircleAngle < 0) {
                x = 0;
                y = ((length / 2) * circleModifier) * Math.sin((circleAngle + (Math.PI / 2)));
                p = reverse(new Point((int)x,(int)y));
                x = p.x;
                y = p.y;
            }
            else {
                x = 0;
                y = ((length / 2) * circleModifier) * Math.sin((circleAngle + (Math.PI / 2)));
            }
        }
        else if(circleAngle <= (Math.PI * 3) + (Math.PI / 2))
        {
            if (realCircleAngle < 0) {
                x = 0;
                y = ((length / 2) * circleModifier) * Math.sin((circleAngle + (Math.PI / 2)));
                p = reverse(new Point((int)x,(int)y));
                x = p.x;
                y = p.y;
            }
            else {
                x = 0;
                y = ((length / 2) * circleModifier) * Math.sin((circleAngle + (Math.PI / 2)));
            }
        }
        else if(circleAngle <= (Math.PI * 4))
        {
            if (realCircleAngle < 0) {
                x = 0;
                y = ((length / 2) * circleModifier) * Math.sin((circleAngle + (Math.PI / 2)));
                p = reverse(new Point((int)x,(int)y));
                x = p.x;
                y = p.y;
            }
            else {
                x = 0;
                y = ((length / 2) * circleModifier) * Math.sin((circleAngle + (Math.PI / 2)));
            }
        }
        p.x = (int)x;
        p.y = (int)y;

        return p;
    }
}
