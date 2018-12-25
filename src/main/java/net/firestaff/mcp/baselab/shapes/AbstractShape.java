package net.firestaff.mcp.baselab.shapes;

import net.firestaff.mcp.baselab.shapes.util.Shape;
import net.firestaff.mcp.baselab.util.Point;

public abstract class AbstractShape implements Shape {
    protected double x;
    protected double y;
    protected double period = Math.PI * 2;
    protected Point p = new Point();
    protected String name;
    public static String shapeName = "shape";
    protected String uiName;
    protected double specialPathRotation;

    public double getPathRotation() {
        return specialPathRotation;
    }

    public double getPeriod() {
        return period;
    }

    public String getName() {
        return name;
    }

    public static String shapeName() {
        return shapeName;
    }

    public String getUIName() {
        return uiName;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Shape)) return false;
        return equals((Shape)obj);
    }

    public boolean equals(Shape shape) {
        return shape.getName().equalsIgnoreCase(this.name);
    }

    public static Shape getNewShape(Shape old) {
        try {
            AbstractShape newShape = (AbstractShape)(old.getClass()).newInstance();
            newShape.period = old.getPeriod();
            newShape.name = old.getName();
            newShape.specialPathRotation = old.getPathRotation();
            if(old.getName().equalsIgnoreCase("VerticalLine")) newShape = new Line(true);
            // TODO change for puased shapes
            return newShape;

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Point reverse(Point myPoint) {

        // Create new float[] to hold the rotated coordinates
        float[] pts = new float[2];

        // Initialize the array with our Coordinate
        pts[0] = (float)myPoint.x;
        pts[1] = (float)myPoint.y;


        Point newPoint = new Point(pts[0], pts[1]);
        return newPoint;
    }


}