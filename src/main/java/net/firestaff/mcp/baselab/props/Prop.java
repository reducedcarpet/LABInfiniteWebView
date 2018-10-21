package net.firestaff.mcp.baselab.props;

import net.firestaff.mcp.baselab.shapes.Circle;
import net.firestaff.mcp.baselab.shapes.util.Shape;


public interface Prop {


    public static final double defaultPropAngle = 0;

    public static final double defaultPropAngleIncrement = Math.PI / 125;

    public static final double defaultPropAngleModifier = 0;

    public static final double defaultPathAngle = 0;

    public static final double defaultPathAngleIncrement = Math.PI / 125;

    public static final double defaultPathAngleModifier = 0;

    public static final double defaultPathSpeed = 1;

    public static final double defaultPropSpeed = 1;

    public static final double defaultX = 248;

    public static final double defaultY = 350;

    public static final double defaultXadj = 248;

    public static final double defaultYadj = 350;

    public static final double defaultPathModifier = 1;

    public static final double defaultPathTurnAngle = 0;

    public static final double defaultLength = 205;

    public static final double defaultHeight = 9;

    public static final double defaultPropDirection = 1;

    public static final double defaultPathDirection = 1;

    public static final Shape defaultShape = new Circle();

    public static final double defaultPropChange = 0;

    public static final double defaultPathChange = 0;

    public static final double defaultPathRotation = 0;

    public void setShape(Shape newShape);

}
