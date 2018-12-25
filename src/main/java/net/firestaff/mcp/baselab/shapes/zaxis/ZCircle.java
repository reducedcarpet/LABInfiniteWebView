package net.firestaff.mcp.baselab.shapes.zaxis;

public class ZCircle extends AbstractZShape{

    public ZCircle() {
        name = "ZCircle";
    }

    public double draw(double circleAngle, double zMod) {
        circleAngle = circleAngle + zMod;
        double x =  Math.cos(circleAngle);

        return x;
    }
}
