package net.firestaff.mcp.baselab.shapes.zaxis;

public class ZHalfCircle extends AbstractZShape{

    public double draw(double realCircleAngle, double ZMod) {
        double x = 0;
        //TODO use zMod

        double circleAngle = Math.abs(realCircleAngle % ((Math.PI * 4)));

        if (circleAngle > 0 && circleAngle <= (Math.PI)) {   // 0 -> 1 pause
            x = 1;
        }
        else if (circleAngle > (Math.PI) && circleAngle <= (Math.PI * 2)) {   // 1 -> 3 down
            x =  Math.cos(realCircleAngle);
        }
        else if (circleAngle > (Math.PI * 2) && circleAngle <= (Math.PI * 3)) {   // 1 -> 3 down
            x = 1;
        }
        else {   // 1 -> 3 down
            x =  Math.cos(realCircleAngle - Math.PI);
        }

        return x;
    }
}
