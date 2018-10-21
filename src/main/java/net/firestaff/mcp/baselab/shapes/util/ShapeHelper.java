package net.firestaff.mcp.baselab.shapes.util;

import net.firestaff.mcp.baselab.shapes.AbstractShape;
import net.firestaff.mcp.baselab.shapes.Circle;
import net.firestaff.mcp.baselab.shapes.decorators.FullReverseDecoratorShape;
import net.firestaff.mcp.baselab.shapes.paused.PausedCapComplexShape;
import net.firestaff.mcp.baselab.shapes.paused.PausedComplexShape;
import net.firestaff.mcp.baselab.shapes.paused.PausedHelper;
import net.firestaff.mcp.baselab.shapes.zaxis.ZCircle;
import net.firestaff.mcp.baselab.shapes.zaxis.ZHalfCircle;
import net.firestaff.mcp.baselab.shapes.zaxis.ZQuarters;
import net.firestaff.mcp.baselab.shapes.zaxis.ZShape;

public class ShapeHelper {
    public static Shape getShape(String name) {
        Shape togo = new Circle();

        if(name == null) return togo;
        if(name == "" || name.equalsIgnoreCase("None")) return togo;

        String shape = name;
        for (Shape s : ShapeConstants.shapes) {
            if (s.getName().equalsIgnoreCase(shape)) {
                togo = s;
                break;
            }
        }
        /*
        if(shape.equalsIgnoreCase("CornerComplexShape")) {
            Shape newBase = new PausedComplexShape(2, Math.PI, shape);
            ComplexShape complex = new FullReverseDecoratorShape();
            complex.setBaseShape(newBase);
            return complex;
        }/**/

        // Order is important here.
        if(shape.contains("Paused")) {
            double separation = 0;
            double duration = 0;

            if(shape.contains("Eighth")) separation = 8;
            else if(shape.contains("Sixth")) separation = 6;
            else if(shape.contains("Fifth")) separation = 5;
            else if(shape.contains("Quarter")) separation = 4;
            else if(shape.contains("Third")) separation = 3;
            else if(shape.contains("FullHalf")) separation = (1.0/3.0) * 2.0;
            else if(shape.contains("Half")) separation = 2;
            else if(shape.contains("Full")) separation = 1;
            else if(shape.contains("Double")) separation = 0.5;

            if(shape.contains("Eight8")) duration = Math.PI / 4;
            else if(shape.contains("Six6")) duration = Math.PI / 3;
            else if(shape.contains("OneFive")) duration = Math.PI + (Math.PI * 2) ;
            else if(shape.contains("Five")) duration = (Math.PI * 2) / 5;
            else if(shape.contains("Four")) duration = Math.PI / 2;
            else if(shape.contains("Three")) duration = (Math.PI * 2) / 3;
            else if(shape.contains("TwoTwo")) duration = Math.PI * 4;
            else if(shape.contains("Two")) duration = Math.PI;
            else if(shape.contains("One")) duration = Math.PI * 2;

            if(shape.contains("PausedCap")) {
                togo = new PausedCapComplexShape(separation, duration, shape);
            }
            else togo = new PausedComplexShape(separation, duration, shape);
           //System.out.println("Correctly parsed: " + shape + " sep " + separation + " FH: " + shape.contains("FullHalf") + " " + ((1.0/3.0) * 2.0));
            return togo;
        }

        else if(shape.equalsIgnoreCase("VerticalLine")) { togo = ShapeConstants.VERTICAL_LINE; }
        else if(shape.equalsIgnoreCase("HorizontalLine")) { togo = ShapeConstants.HORIZONTAL_LINE; }
        else if(shape.equalsIgnoreCase("Line")) { togo = ShapeConstants.HORIZONTAL_LINE; }
        else if(shape.equalsIgnoreCase("Point")) { togo = ShapeConstants.POINT; }

        return AbstractShape.getNewShape(togo);
    }


    public static ZShape getZShape(String zShape) {
        zShape = zShape.replace("Strict", "");
        if(zShape.equalsIgnoreCase("ZCircle")) return new ZCircle();
        else if(zShape.equalsIgnoreCase("ZHalfCircle")) return new ZHalfCircle();
        else if(zShape.equalsIgnoreCase("ZQuarterCircle")) return new ZQuarters();
        else return new ZCircle();
    }
}
