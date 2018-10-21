package net.firestaff.mcp.baselab.util;

import java.util.Objects;

public class Point {
    public int x = 0;
    public int y = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public Point sub( Point v1 ) {
        Point v2 = new Point( this.x - v1.x, this.y - v1.y );
        return v2;
    }

    public static Point sub(Point thi, Point v1) {
        Point v2 = new Point( thi.x - v1.x, thi.y - v1.y );
        return v2;
    }

    public float heading() {
        float angle = (float) Math.atan2(y, x);
        return angle;
    }

    public double heading(Point other, double dir_) {
        double heading = Math.atan2(other.x - this.x, other.y - this.y);// - this->dir;
        return heading;
    }

    public void mult(double m) {
        x *= m;
        y *= m;
    }

    public Point add( Point v1 ) {
        Point v2 = new Point( this.x + v1.x, this.y + v1.y );
        return v2;
    }

    public void setMagnitude(float len_) {
        normalize();
        mult(len_);
    }

    public Point normalize() {
        Point v2 = new Point();

        double length = Math.sqrt( this.x*this.x + this.y*this.y );
        if (length != 0) {
            this.x = (int)(this.x/length);
            this.y = (int)(this.y/length);
        }

        return v2;
    }

    public float dist(Point v) {
        float dx = x - v.x;
        float dy = y - v.y;
        return (float) Math.sqrt(dx*dx + dy*dy);
    }

    static public float dist(Point v1, Point v2) {
        float dx = v1.x - v2.x;
        float dy = v1.y - v2.y;
        return (float) Math.sqrt(dx*dx + dy*dy);
    }


    public boolean equals(Object obj) {
        //System.out.println("obj: " + obj);
        if(this == obj) return true;
        if(obj instanceof Point){
            Point p = (Point) obj;
            //System.out.println("px: " + p.x + " py: " + p.y + "  : " + this.x + " :: " + this.y );
            if(p.x == this.x && p.y == this.y) return true;
        }
        else return false;
        return false;
    }

    public boolean equals(Point p) {
        if(p.x == this.x && p.y == this.y) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}