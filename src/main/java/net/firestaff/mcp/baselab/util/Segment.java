package net.firestaff.mcp.baselab.util;

public class Segment {
    public Point a;
    public Point b;

    double length;
    double angle;


    public Segment(double ax, double ay, double length_, double angle_) {
        a = new Point(ax, ay);
        b = new Point();
        length = length_;
        angle = angle_;
        calculateB();
    }

    public void calculateB() {
        double dx = length * Math.cos(angle);
        double dy = length * Math.sin(angle);
        b.x = a.x + dx;
        b.y = a.y + dy;
    }

    public void follow(Point target) {
        Point dir = target.sub(a);
        angle = dir.heading();
        calculateB();
    }

    public void closeFollow(Point touch) {
        Point dir = touch.sub(a);
        angle = dir.heading();
        dir.setMagnitude((float)length);
        dir.mult(-1);

        a = touch.add(dir);
        calculateB();
    }

    public float getAngle() {
        return (float)Math.toDegrees(angle);
    }

    double modded;

    public boolean useBackLeft() {
        modded = Math.abs(getAngle() % 360);
        return  modded < 90 || modded > 270;
    }

    public boolean useBackRight() {
        modded = Math.abs(getAngle() % 360);
        return modded > 90 && modded < 270;
    }
}
