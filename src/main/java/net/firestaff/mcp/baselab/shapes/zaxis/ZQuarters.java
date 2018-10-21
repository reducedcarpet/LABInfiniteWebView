package net.firestaff.mcp.baselab.shapes.zaxis;

public class ZQuarters extends AbstractZShape {

    public double draw(double realCircleAngle, double circleTurnModifier) {

        double x = 1;
        double circleAngle = Math.abs (realCircleAngle % ((Math.PI * 6) + (0)));

        if(circleAngle > 0 && circleAngle <= (Math.PI))
        {   // 0 -> 1 pause 1
            //p = drawShape(length, circleModifier, 0, circleTurnModifier);
            x = 1;
        }
        else if(circleAngle > (Math.PI) && circleAngle <= ((Math.PI) + (Math.PI / 2)))
        {   // 1 -> 2 move 1
            x = Math.cos(realCircleAngle - Math.PI);
        }
        else if(circleAngle > (Math.PI) + (Math.PI / 2) && circleAngle <= ((Math.PI * 2) + (Math.PI / 2) ))
        {   // 2 -> 3 pause 2
            x = 1;
        }
        else if(circleAngle > (Math.PI * 2) + (Math.PI / 2) && circleAngle <= ((Math.PI * 2) + (Math.PI)))
        {   // 3 -> 4 move 2
            x = Math.cos(realCircleAngle - (Math.PI * 2));
        }
        else if(circleAngle > (Math.PI * 3) + (0) && circleAngle <= ((Math.PI * 3) + (Math.PI) ))
        {   // 4 -> 5 pause 3
            x = 1;
        }
        else if(circleAngle > (Math.PI * 4) && circleAngle <= ((Math.PI * 4) + (Math.PI / 2)))
        {   // 5 -> 6 move 3
            x = Math.cos(realCircleAngle - (Math.PI * 3));
        }
        else if(circleAngle > (Math.PI * 4) + (Math.PI / 2) && circleAngle <= ((Math.PI * 5) + (Math.PI / 2)))
        {   // 4 -> 5 pause 4
            x = 1;
        }
        else if(circleAngle > (Math.PI * 5) + (Math.PI / 2) && circleAngle <= ((Math.PI * 6)))
        {   // 5 -> 6 move 4
            x = Math.cos(realCircleAngle - (Math.PI * 4));
        }

        return x;
    }
}
